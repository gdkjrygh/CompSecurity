// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.widget.ListView;
import com.pinterest.ui.actionbar.ActionBar;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsInviteAllFragment

public class 
{

    public static void inject(butterknife.ragment ragment, FindFriendsInviteAllFragment findfriendsinviteallfragment, Object obj)
    {
        findfriendsinviteallfragment._listView = (ListView)ragment._listView(obj, 0x7f0f024f, "field '_listView'");
        findfriendsinviteallfragment._actionBar = (ActionBar)ragment._actionBar(obj, 0x7f0f008e, "field '_actionBar'");
    }

    public static void reset(FindFriendsInviteAllFragment findfriendsinviteallfragment)
    {
        findfriendsinviteallfragment._listView = null;
        findfriendsinviteallfragment._actionBar = null;
    }

    public ()
    {
    }
}
