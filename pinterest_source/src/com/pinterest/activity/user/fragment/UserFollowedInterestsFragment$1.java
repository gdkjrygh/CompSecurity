// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.MyUser;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedInterestsFragment

class this._cls0
    implements com.pinterest.base.terestsFragment._cls1
{

    final UserFollowedInterestsFragment this$0;

    public void onEventMainThread(dateEvent dateevent)
    {
        if (MyUser.isUserMe(UserFollowedInterestsFragment.access$000(UserFollowedInterestsFragment.this).getId()))
        {
            refresh();
        }
    }

    dateEvent()
    {
        this$0 = UserFollowedInterestsFragment.this;
        super();
    }
}
