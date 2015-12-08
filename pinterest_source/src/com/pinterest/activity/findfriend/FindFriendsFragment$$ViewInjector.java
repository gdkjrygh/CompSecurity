// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import com.pinterest.ui.tab.TabBar;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsFragment

public class I
{

    public static void inject(butterknife.ragment ragment, FindFriendsFragment findfriendsfragment, Object obj)
    {
        findfriendsfragment._tabBar = (TabBar)ragment._tabBar(obj, 0x7f0f007a, "field '_tabBar'");
    }

    public static void reset(FindFriendsFragment findfriendsfragment)
    {
        findfriendsfragment._tabBar = null;
    }

    public I()
    {
    }
}
