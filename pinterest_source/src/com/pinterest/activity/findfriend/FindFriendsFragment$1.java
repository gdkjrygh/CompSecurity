// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.support.v4.view.ModifiedViewPager;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsFragment

class this._cls0
    implements com.pinterest.base.r
{

    final FindFriendsFragment this$0;

    public void onEventMainThread(com.pinterest.activity.findfriend.adapter..InviteTabSwitchEvent invitetabswitchevent)
    {
        if (FindFriendsFragment.access$000(FindFriendsFragment.this) != null)
        {
            FindFriendsFragment.access$100(FindFriendsFragment.this).setCurrentItem(invitetabswitchevent.getTabIndex(), true);
        }
    }

    wAdapter.InviteTabSwitchEvent()
    {
        this$0 = FindFriendsFragment.this;
        super();
    }
}
