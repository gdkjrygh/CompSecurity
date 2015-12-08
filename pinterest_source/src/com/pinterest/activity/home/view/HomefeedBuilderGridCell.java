// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.home.util.HomefeedBuilderData;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.TopicFollowToast;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Interest;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

public class HomefeedBuilderGridCell extends FrameLayout
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    protected Button _followBt;
    protected boolean _handleFollow;
    protected ProportionalImageView _image;
    protected Interest _interest;
    protected com.pinterest.activity.home.HomefeedBuilderFragment.MODE _mode;
    protected boolean _showFollowButton;
    protected PTextView _subtitle;
    protected boolean _tapOnly;
    protected PTextView _title;

    public HomefeedBuilderGridCell(Context context)
    {
        this(context, null);
    }

    public HomefeedBuilderGridCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HomefeedBuilderGridCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _handleFollow = true;
        _eventsSubscriber = new _cls1();
        init();
    }

    public static HomefeedBuilderGridCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof HomefeedBuilderGridCell)
        {
            return (HomefeedBuilderGridCell)view;
        } else
        {
            return new HomefeedBuilderGridCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void init()
    {
        inflate(getContext(), 0x7f030126, this);
        ButterKnife.a(this);
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD, _title);
    }

    protected void followInterest(final Interest interest, boolean flag)
    {
        EventType eventtype;
        ComponentType componenttype;
        ElementType elementtype;
        if (interest.getFollowing().booleanValue())
        {
            eventtype = EventType.INTEREST_FOLLOW;
        } else
        {
            eventtype = EventType.INTEREST_UNFOLLOW;
        }
        elementtype = ElementType.STORY_PLUS_ICON;
        if (_mode == com.pinterest.activity.home.HomefeedBuilderFragment.MODE.DYNAMIC_GRID)
        {
            componenttype = ComponentType.DYNAMIC_GRID_STORY;
        } else
        {
            componenttype = ComponentType.INTEREST_GRID;
        }
        Pinalytics.a(eventtype, elementtype, componenttype, interest.getUid(), HomefeedBuilderData.getAuxData(interest, _mode), null);
        Events.post(new ToastEvent(new TopicFollowToast(_interest)));
        InterestsApi.a(interest, interest.getFollowing().booleanValue(), HomefeedBuilderData.getReferrer(_mode), interest.getRecommendationSource(), null, new _cls2(), null);
    }

    public void loadImageUrl(String s)
    {
        if (s != null && s.equals(_image.getUrl()))
        {
            return;
        } else
        {
            _image.loadUrl(s);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Events.unregister(_eventsSubscriber);
    }

    public void onFollowClick(View view)
    {
        boolean flag1 = true;
        Interest interest = _interest;
        boolean flag;
        if (!Constants.isTrue(_interest.getFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        interest.setFollowing(Boolean.valueOf(flag));
        updateFollowing();
        if (_handleFollow)
        {
            Interest interest1 = _interest;
            if (view == _followBt)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            followInterest(interest1, flag);
            return;
        } else
        {
            Events.post(new HomefeedBuilderInterestFollowButton.InterestFollowEvent(_interest));
            return;
        }
    }

    public void onTopicClick(View view)
    {
        if (_tapOnly)
        {
            onFollowClick(view);
            return;
        } else
        {
            performNavigationClick();
            return;
        }
    }

    protected void performNavigationClick()
    {
        if (_mode == com.pinterest.activity.home.HomefeedBuilderFragment.MODE.DYNAMIC_GRID)
        {
            Pinalytics.a(ElementType.STORY_FEATURED_ITEM, ComponentType.DYNAMIC_GRID_STORY, _interest.getUid(), HomefeedBuilderData.getAuxData(_interest, _mode));
        } else
        {
            Pinalytics.a(ElementType.HOMEFEED_BUILDER_GRID_ITEM, ComponentType.INTEREST_GRID, _interest.getUid(), HomefeedBuilderData.getAuxData(_interest, _mode));
        }
        Events.post(new Navigation(Location.INTEREST, _interest));
    }

    public void setHandleFollow(boolean flag)
    {
        _handleFollow = flag;
    }

    public void setImageDimensions(int i, int j)
    {
        _image.setDisableResize(true);
        _image.getLayoutParams().width = i;
        _image.getLayoutParams().height = j;
    }

    public void setInterest(Interest interest, boolean flag)
    {
        if (interest != null)
        {
            _interest = interest;
            if (!flag)
            {
                updateFollowing();
                int i = Constants.CORNER_RADIUS;
                android.graphics.drawable.ShapeDrawable shapedrawable = ViewHelper.getRoundDrawable(i, interest.getBackgroundColor());
                _image.setBackgroundDrawable(shapedrawable);
                _image.setCornerRadius(i);
                loadImageUrl(interest.getBestImageUrl(2));
                setTitleText(interest.getName());
                if (interest.getPinnerCount().intValue() < 0)
                {
                    i = 0;
                } else
                {
                    i = interest.getPinnerCount().intValue();
                }
                setSubTitleText(Resources.stringPluralShort(0x7f090007, Integer.valueOf(i)));
                return;
            }
        }
    }

    public void setMode(com.pinterest.activity.home.HomefeedBuilderFragment.MODE mode)
    {
        _mode = mode;
    }

    public void setShowFollowButton(boolean flag)
    {
        _showFollowButton = flag;
        ViewHelper.setVisibility(_followBt, flag);
    }

    public void setSubTitleText(String s)
    {
        _subtitle.setText(s);
        ViewHelper.setVisibility(_subtitle, StringUtils.isNotEmpty(s));
    }

    public void setTapOnly(boolean flag)
    {
        _tapOnly = flag;
    }

    public void setTitleText(String s)
    {
        _title.setText(s);
    }

    protected void updateFollowing()
    {
        if (!_showFollowButton)
        {
            return;
        } else
        {
            ViewHelper.updateFollow(_followBt, BooleanUtils.isTrue(_interest.getFollowing()));
            return;
        }
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final HomefeedBuilderGridCell this$0;

        public void onEventMainThread(com.pinterest.api.model.Interest.UpdateEvent updateevent)
        {
            if (_interest != null && _interest.equals(updateevent.getInterest()))
            {
                _interest.setFollowing(updateevent.getInterest().getFollowing());
                updateFollowing();
            }
        }

        _cls1()
        {
            this$0 = HomefeedBuilderGridCell.this;
            super();
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final HomefeedBuilderGridCell this$0;
        final Interest val$interest;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            throwable = interest;
            boolean flag;
            if (!interest.getFollowing().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            throwable.setFollowing(Boolean.valueOf(flag));
            updateFollowing();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            ModelHelper.setInterest(interest);
        }

        _cls2()
        {
            this$0 = HomefeedBuilderGridCell.this;
            interest = interest1;
            super();
        }
    }

}
