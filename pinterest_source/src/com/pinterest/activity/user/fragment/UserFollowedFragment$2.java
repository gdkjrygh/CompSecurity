// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedFragment

class val.view
    implements android.view.alLayoutListener
{

    final UserFollowedFragment this$0;
    final View val$view;

    public void onGlobalLayout()
    {
        val$view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        UserFollowedFragment.access$100(UserFollowedFragment.this);
    }

    A()
    {
        this$0 = final_userfollowedfragment;
        val$view = View.this;
        super();
    }
}
