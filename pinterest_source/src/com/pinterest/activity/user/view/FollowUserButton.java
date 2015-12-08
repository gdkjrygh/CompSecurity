// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.activity.report.ReportHelper;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.UserFollowToast;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.base.FollowUtils;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.text.FollowButton;
import java.util.HashMap;

public class FollowUserButton extends FollowButton
    implements com.pinterest.base.Events.EventsSubscriber
{

    private boolean _pendingApiResponse;
    private User _user;

    public FollowUserButton(Context context)
    {
        super(context);
    }

    public FollowUserButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FollowUserButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public User getUser()
    {
        return _user;
    }

    protected boolean isFollowing()
    {
        return _user != null && Constants.isTrue(_user.getExplicitFollowing());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(this, com/pinterest/api/model/User$UserFollowEvent, new Class[0]);
    }

    public void onClick(View view)
    {
        if (_user == null || _pendingApiResponse)
        {
            return;
        }
        if (Constants.isTrue(_user.getBlocked()))
        {
            ReportHelper.showBlockDialog((Activity)getContext(), _user);
            return;
        }
        _pendingApiResponse = true;
        view = _user;
        boolean flag;
        if (!Constants.isTrue(_user.getExplicitFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setFollowing(flag);
        updateDisplay();
        if (_mode == com.pinterest.ui.text.FollowButton.MODE.DYNAMIC_GRID && _story != null)
        {
            HashMap hashmap;
            if (_user.getFollowing().booleanValue())
            {
                view = EventType.USER_FOLLOW;
            } else
            {
                view = EventType.USER_UNFOLLOW;
            }
            hashmap = new HashMap();
            hashmap.putAll(_story.getAuxData());
            Pinalytics.a(view, _user.getUid(), null, hashmap);
            Events.post(new ToastEvent(new UserFollowToast(_user)));
            flag = true;
        } else
        {
            flag = false;
        }
        FollowUtils.getInstance().followUser(_user.getUid(), _user.getFollowing().booleanValue(), new _cls1(), null, flag);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Events.unregister(this);
    }

    public void onEventMainThread(com.pinterest.api.model.User.UserFollowEvent userfollowevent)
    {
        if (_user == null || userfollowevent == null || userfollowevent.getUser() == null || !_user.equals(userfollowevent.getUser()))
        {
            return;
        } else
        {
            updateDisplay();
            return;
        }
    }

    public void setUser(User user)
    {
        _user = user;
        updateDisplay();
    }

    protected void updateDisplay()
    {
        if (_user == null)
        {
            return;
        }
        if (Constants.isTrue(_user.getBlocked()))
        {
            setText(Resources.string(0x7f0705a7));
            setStyle(com.pinterest.ui.text.PButton.ButtonStyle.PLAIN);
            return;
        } else
        {
            super.updateDisplay();
            return;
        }
    }



/*
    static boolean access$102(FollowUserButton followuserbutton, boolean flag)
    {
        followuserbutton._pendingApiResponse = flag;
        return flag;
    }

*/

    private class _cls1 extends com.pinterest.api.remote.UserApi.UserFollowApiResponse
    {

        final FollowUserButton this$0;

        public void onFailure()
        {
            User user = _user;
            boolean flag;
            if (!Constants.isTrue(_user.getExplicitFollowing()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            user.setFollowing(flag);
            updateDisplay();
        }

        public void onFinish()
        {
            super.onFinish();
            setLoading(false);
            _pendingApiResponse = false;
        }

        public void onStart()
        {
            super.onStart();
            setLoading(true);
        }

        public void onSuccess(User user)
        {
        }

        _cls1()
        {
            this$0 = FollowUserButton.this;
            super();
        }
    }

}
