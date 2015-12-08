// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.UserFollowToast;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.base.FollowUtils;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.BooleanUtils;

public class UserStoryCell extends FrameLayout
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private int _expectedWidth;
    protected Button _followBt;
    protected ProportionalImageView _image;
    protected PTextView _title;
    private User _user;

    public UserStoryCell(Context context)
    {
        this(context, null);
    }

    public UserStoryCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UserStoryCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _eventsSubscriber = new _cls1();
        init();
    }

    public static UserStoryCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof UserStoryCell)
        {
            return (UserStoryCell)view;
        } else
        {
            return new UserStoryCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void init()
    {
        inflate(getContext(), 0x7f03009a, this);
        ButterKnife.a(this);
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD, _title);
    }

    protected void doFollow()
    {
        EventType eventtype;
        if (_user.getFollowing().booleanValue())
        {
            eventtype = EventType.USER_FOLLOW;
        } else
        {
            eventtype = EventType.USER_UNFOLLOW;
        }
        Pinalytics.b(eventtype, ElementType.USER_FOLLOW, ComponentType.DYNAMIC_GRID_STORY, _user.getUid());
        Events.post(new ToastEvent(new UserFollowToast(_user)));
        FollowUtils.getInstance().followUser(_user.getUid(), _user.getFollowing().booleanValue(), new _cls2(), null, true);
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
        if (_user == null)
        {
            return;
        }
        view = _user;
        boolean flag;
        if (!Constants.isTrue(_user.getFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setFollowing(flag);
        updateFollowing();
        doFollow();
    }

    public void onTopicClick(View view)
    {
        Pinalytics.a(ElementType.USER_ICON, ComponentType.DYNAMIC_GRID_STORY, _user.getUid());
        Events.post(new Navigation(Location.USER, _user));
    }

    public void setExpectedWidth(int i)
    {
        _expectedWidth = i;
    }

    public void setTitleText(String s)
    {
        _title.setText(s);
    }

    public void setUser(User user, boolean flag)
    {
        if (user == null)
        {
            return;
        }
        _user = user;
        if (!flag)
        {
            int i = _expectedWidth / 2;
            android.graphics.drawable.ShapeDrawable shapedrawable = ViewHelper.getRoundDrawable(i, Constants.COLOR_GRAY);
            _image.setBackgroundDrawable(shapedrawable);
            _image.setCornerRadius(i);
            loadImageUrl(user.getImageLargeUrl());
            updateFollowing();
        }
        setTitleText(user.getFullName());
    }

    protected void updateFollowing()
    {
        ViewHelper.updateFollow(_followBt, BooleanUtils.isTrue(_user.getFollowing()));
    }



/*
    static User access$002(UserStoryCell userstorycell, User user)
    {
        userstorycell._user = user;
        return user;
    }

*/

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UserStoryCell this$0;

        public void onEventMainThread(com.pinterest.api.model.User.UpdateEvent updateevent)
        {
            if (_user != null && _user.equals(updateevent.getUser()))
            {
                _user.setFollowing(updateevent.getUser().getFollowing().booleanValue());
                updateFollowing();
            }
        }

        _cls1()
        {
            this$0 = UserStoryCell.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.UserApi.UserFollowApiResponse
    {

        final UserStoryCell this$0;

        public void onFailure()
        {
            User user = _user;
            boolean flag;
            if (!_user.getFollowing().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            user.setFollowing(flag);
            updateFollowing();
        }

        public void onSuccess(User user)
        {
            _user = user;
        }

        _cls2()
        {
            this$0 = UserStoryCell.this;
            super();
        }
    }

}
