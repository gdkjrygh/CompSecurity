// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.widget.BaseAdapter;
import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.base:
//            FollowUtils

public class _adapter
    implements Runnable
{

    public static final int FOLLOW_DELAY_MS = 1000;
    private BaseAdapter _adapter;
    private DelayedFollowListener _onComplete;
    private User _user;

    public void run()
    {
        class _cls1 extends com.pinterest.api.remote.UserApi.UserFollowApiResponse
        {

            final FollowUtils.DelayedFollowRunnable this$0;

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
                _adapter.notifyDataSetChanged();
            }

            public void onFinish()
            {
                class DelayedFollowListener
                {

                    public abstract void onComplete();
                }

                if (_onComplete != null)
                {
                    _onComplete.onComplete();
                }
            }

            public void onSuccess(User user)
            {
                User.merge(user, _user);
            }

            _cls1()
            {
                this$0 = FollowUtils.DelayedFollowRunnable.this;
                super();
            }
        }

        FollowUtils.getInstance().followUser(_user.getUid(), _user.getFollowing().booleanValue(), new _cls1(), null);
    }




    public DelayedFollowListener(User user, DelayedFollowListener delayedfollowlistener, BaseAdapter baseadapter)
    {
        _user = user;
        _onComplete = delayedfollowlistener;
        _adapter = baseadapter;
    }
}
