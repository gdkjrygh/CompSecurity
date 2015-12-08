// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.explore.util.ExploreStoryCell;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.ImpressionView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.UserImpression;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.imageview.WebImageView;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.explore.view:
//            ExploreUserPinGridView

public class ExploreContextualUserCell extends LinearLayout
    implements ExploreStoryCell, ImpressionView
{

    private WebImageView _imageView;
    private UserImpression _impression;
    private long _impressionStart;
    private int _slotPosition;
    private String _storyId;
    private int _storyPosition;
    TextView _subTitle;
    TextView _title;
    private User _user;
    private GrayWebImageView _userImageView;
    ExploreUserPinGridView _userPinsGridView;

    public ExploreContextualUserCell(Context context)
    {
        this(context, null);
    }

    public ExploreContextualUserCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ExploreContextualUserCell get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ExploreContextualUserCell))
        {
            return new ExploreContextualUserCell(ViewHelper.getContext(view, viewgroup));
        } else
        {
            return (ExploreContextualUserCell)view;
        }
    }

    private void updateUI()
    {
        _title.setText(_user.getFullName());
        _subTitle.setText(Resources.stringPluralShort(0x7f090007, Integer.valueOf(_user.getFollowersCountDisplay())));
        _userImageView.loadUrl(_user.getImageMediumUrl());
        _userPinsGridView.setPinList(_user.getPinList());
    }

    public UserImpression getImpression()
    {
        return _impression;
    }

    public User getUser()
    {
        return _user;
    }

    protected void init()
    {
        inflate(getContext(), 0x7f0300a1, this);
        ButterKnife.a(this);
        _imageView = (WebImageView)findViewById(0x7f0f01ce);
        _userImageView = (GrayWebImageView)findViewById(0x7f0f01d3);
        _userImageView.setOval(true);
    }

    public Object markImpressionEnd()
    {
        if (_impression == null || _user == null)
        {
            return null;
        } else
        {
            UserImpression userimpression = _impression;
            userimpression.setUserIdStr(_user.getUid());
            userimpression.setEndTime(System.currentTimeMillis() * 0xf4240L);
            userimpression.setSlotIndex((short)_slotPosition);
            userimpression.setStoryIndex((short)_storyPosition);
            _impressionStart = 0L;
            return userimpression;
        }
    }

    public void markImpressionStart()
    {
        _impressionStart = System.currentTimeMillis() * 0xf4240L;
        _impression = new UserImpression();
        _impression.setTime(_impressionStart);
    }

    public void onUserCellClicked(View view)
    {
        view = new HashMap();
        view.put("grid_index", String.valueOf(_slotPosition));
        view.put("story_index", String.valueOf(_storyPosition));
        view.put("story_id", _storyId);
        Pinalytics.a(ElementType.CONTEXTUAL_STORY_USER, ComponentType.CONTEXTUAL_STORY, _user.getUid(), view);
        Events.post(new Navigation(Location.USER, _user));
    }

    public void setSlotPosition(int i)
    {
        _slotPosition = i;
    }

    public void setStoryId(String s)
    {
        _storyId = s;
    }

    public void setStoryPosition(int i)
    {
        _storyPosition = i;
    }

    public void setUser(User user)
    {
        if (user == null)
        {
            return;
        } else
        {
            _user = user;
            updateUI();
            return;
        }
    }
}
