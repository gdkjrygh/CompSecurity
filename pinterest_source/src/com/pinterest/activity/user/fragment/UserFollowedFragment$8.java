// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.InterestsApi;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedFragment

class this._cls0
    implements com.pinterest.base.
{

    final UserFollowedFragment this$0;

    public void onEventMainThread(agment.UpdateEvent updateevent)
    {
        if (MyUser.isUserMe(UserFollowedFragment.access$500(UserFollowedFragment.this).getId()))
        {
            InterestsApi.a(UserFollowedFragment.access$600(UserFollowedFragment.this).getId(), 8, UserFollowedFragment.access$300(UserFollowedFragment.this), getApiTag());
        }
    }

    agment.UpdateEvent()
    {
        this$0 = UserFollowedFragment.this;
        super();
    }
}
