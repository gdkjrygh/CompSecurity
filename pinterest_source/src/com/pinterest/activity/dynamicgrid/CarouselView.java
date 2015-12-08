// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.interest.view.FollowInterestButton;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.view.FollowUserButton;
import com.pinterest.analytics.ImpressionView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.DynamicDisplayOption;
import com.pinterest.api.model.DynamicRelationship;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.api.model.DynamicTitle;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.schemas.event.StoryImpression;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.progress.LoadingView;
import com.pinterest.ui.text.FollowButton;
import com.pinterest.ui.text.PImageButton;
import org.apache.commons.lang3.StringUtils;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            IconTwoLineView, CarouselAdapter

public class CarouselView extends FrameLayout
    implements ImpressionView
{

    TextView _actionTv;
    private CarouselAdapter _adapter;
    LinearLayout _carouselContainer;
    PImageButton _dismissStoryButton;
    private FollowButton _followBt;
    TextView _footer;
    TwoWayView _horizontalList;
    IconTwoLineView _iconTitles;
    private StoryImpression _impression;
    private long _impressionStart;
    LoadingView _loadingView;
    private DynamicStory _story;
    TextView _subtitle;
    TextView _title;
    LinearLayout _titleContainer;

    public CarouselView(Context context)
    {
        this(context, null);
    }

    public CarouselView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CarouselView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void addFollowButton(FollowButton followbutton)
    {
        followbutton.setMode(com.pinterest.ui.text.FollowButton.MODE.DYNAMIC_GRID);
        followbutton.setStory(_story);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams((int)Resources.dimension(0x7f0a00fe), (int)Resources.dimension(0x7f0a000a));
        _titleContainer.addView(followbutton, layoutparams);
        _followBt = followbutton;
    }

    private void removeFollowButton()
    {
        if (_followBt != null)
        {
            _titleContainer.removeView(_followBt);
            _followBt = null;
        }
    }

    private void updateActionButton()
    {
        if (_story.getDisplayOption() != null)
        {
            String s = null;
            if (_story.getRelationship() != null)
            {
                s = _story.getRelationship().getActionText();
            }
            int i = _story.getDisplayOption().getActionLocation();
            if (i == 1)
            {
                if (s != null)
                {
                    _footer.setText(s);
                }
                ViewHelper.setVisibility(_footer, true);
                ViewHelper.setVisibility(_actionTv, false);
                return;
            }
            if (i == 2)
            {
                if (s != null)
                {
                    _actionTv.setText(s);
                }
                ViewHelper.setVisibility(_actionTv, true);
                ViewHelper.setVisibility(_footer, false);
                return;
            } else
            {
                ViewHelper.setVisibility(_actionTv, false);
                ViewHelper.setVisibility(_footer, false);
                return;
            }
        } else
        {
            ViewHelper.setVisibility(_actionTv, false);
            ViewHelper.setVisibility(_footer, false);
            return;
        }
    }

    private void updateFollow()
    {
        removeFollowButton();
        if (_story.getRelationship() != null && _story.getRelationship().getFollowId(0) != null)
        {
            com.pinterest.api.model.Model model = _story.getFirstRelationObject();
            if (model instanceof Interest)
            {
                FollowInterestButton followinterestbutton = new FollowInterestButton(new ContextThemeWrapper(getContext(), 0x7f0b015d));
                followinterestbutton.setInterest((Interest)model);
                addFollowButton(followinterestbutton);
            } else
            if (model instanceof User)
            {
                FollowUserButton followuserbutton = new FollowUserButton(new ContextThemeWrapper(getContext(), 0x7f0b015d));
                followuserbutton.setUser((User)model);
                addFollowButton(followuserbutton);
                return;
            }
        }
    }

    private void updateTitle()
    {
        boolean flag1 = true;
        Object obj = _story.getFirstRelationObject();
        if (obj instanceof User)
        {
            obj = (User)obj;
            _iconTitles.setTitle(((User) (obj)).getFullName());
            _iconTitles.setSubtitle(Resources.stringPlural(0x7f090002, Integer.valueOf(((User) (obj)).getBoardCountDisplay())));
            _iconTitles.setImageUrl(((User) (obj)).getImageMediumUrl());
            _iconTitles.setPadding(0, Constants.MARGIN_HALF, Constants.MARGIN_HALF, Constants.MARGIN_HALF);
            ViewHelper.setVisibility(_title, false);
            ViewHelper.setVisibility(_iconTitles, true);
            return;
        }
        ViewHelper.setVisibility(_title, true);
        ViewHelper.setVisibility(_iconTitles, false);
        boolean flag;
        if (_story.getTitle() != null)
        {
            _title.setText(_story.getTitle().getFormattedText());
            TextView textview = _title;
            if (!StringUtils.isEmpty(_story.getTitle().getFormattedText()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ViewHelper.setVisibility(textview, flag);
        } else
        {
            ViewHelper.setVisibility(_title, false);
        }
        if (_story.getSubtitle() != null)
        {
            _subtitle.setText(_story.getSubtitle().getFormattedText());
            textview = _subtitle;
            if (!StringUtils.isEmpty(_story.getSubtitle().getFormattedText()))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            ViewHelper.setVisibility(textview, flag);
            return;
        } else
        {
            ViewHelper.setVisibility(_subtitle, false);
            return;
        }
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301c2, this, true);
        ButterKnife.a(this);
        _adapter = new CarouselAdapter();
        _horizontalList.setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        _horizontalList.setSelector(0x7f020275);
    }

    public StoryImpression markImpressionEnd()
    {
        if (_impression == null || _story == null)
        {
            return null;
        } else
        {
            StoryImpression storyimpression = _impression;
            storyimpression.setIdStr(_story.getUid());
            storyimpression.setEndTime(System.currentTimeMillis() * 0xf4240L);
            storyimpression.setItemCount((short)_story.getObjectsCount());
            storyimpression.setVisibleCount((short)_adapter.getVisibleCount());
            _impressionStart = 0L;
            return storyimpression;
        }
    }

    public volatile Object markImpressionEnd()
    {
        return markImpressionEnd();
    }

    public void markImpressionStart()
    {
        _impressionStart = System.currentTimeMillis() * 0xf4240L;
        _impression = new StoryImpression();
        _impression.setTime(_impressionStart);
    }

    void onDismissStoryClicked(View view)
    {
        if (_story.getIsClientGenerated())
        {
            Events.post(new com.pinterest.api.model.DynamicStory.DismissFeedStoryEvent(_story));
        }
    }

    void onFooterClicked(View view)
    {
        Pinalytics.a(EventType.TAP, ElementType.STORY_END_CELL, ComponentType.DYNAMIC_GRID_STORY, _story.getUid(), _story.getAuxData(), null);
        if (_story.getRelationship().getActionDeepLink() != null)
        {
            Location.navigateUri(getContext(), _story.getRelationship().getActionDeepLink());
            return;
        } else
        {
            Events.post(new Navigation(Location.HOMEFEED_BUILDER_LIST));
            return;
        }
    }

    void onTitleClicked(View view)
    {
        if (_story.getIsClientGenerated())
        {
            return;
        }
        Pinalytics.a(EventType.TAP, ElementType.STORY_TITLE, ComponentType.DYNAMIC_GRID_STORY, _story.getUid(), _story.getAuxData(), null);
        view = _story.getFirstRelationObject();
        if (view != null)
        {
            Location.navigateToModel(view);
            return;
        } else
        {
            Events.post(new Navigation(Location.HOMEFEED_BUILDER_LIST));
            return;
        }
    }

    public void setStory(DynamicStory dynamicstory, boolean flag)
    {
        if (dynamicstory == null)
        {
            return;
        } else
        {
            _story = dynamicstory;
            _adapter.setDataSource(dynamicstory);
            _horizontalList.getLayoutParams().height = _adapter.getStoryItemHeight();
            updateTitle();
            updateFollow();
            updateActionButton();
            ViewHelper.setVisibility(_dismissStoryButton, dynamicstory.getIsClientGenerated());
            _horizontalList.setAdapter(_adapter);
            return;
        }
    }
}
