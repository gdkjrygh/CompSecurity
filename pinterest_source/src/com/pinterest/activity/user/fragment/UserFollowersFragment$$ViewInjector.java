// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import com.pinterest.activity.user.view.UserMetadataView;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowersFragment

public class 
{

    public static void inject(butterknife.rsFragment rsfragment, UserFollowersFragment userfollowersfragment, Object obj)
    {
        userfollowersfragment._swipeVw = (SwipeRefreshLayout)rsfragment._swipeVw(obj, 0x7f0f0204, "field '_swipeVw'");
        userfollowersfragment._userEmptyMetadataView = (UserMetadataView)rsfragment.w(obj, 0x7f0f02ea, "field '_userEmptyMetadataView'");
    }

    public static void reset(UserFollowersFragment userfollowersfragment)
    {
        userfollowersfragment._swipeVw = null;
        userfollowersfragment._userEmptyMetadataView = null;
    }

    public ()
    {
    }
}
