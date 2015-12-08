// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import com.pinterest.activity.findfriend.adapter.InviteFriendAdapter;
import com.pinterest.activity.findfriend.event.InviteCountChangeEvent;
import com.pinterest.activity.findfriend.event.InviteCreateEvent;
import com.pinterest.activity.findfriend.event.SelectAllEvent;
import com.pinterest.activity.findfriend.view.FindFriendsInviteAllHeaderView;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsInviteAllFragment

class this._cls0
    implements com.pinterest.base.eAllFragment._cls2
{

    final FindFriendsInviteAllFragment this$0;

    public void onEventMainThread(InviteCountChangeEvent invitecountchangeevent)
    {
        if (FindFriendsInviteAllFragment.access$100(FindFriendsInviteAllFragment.this) != null)
        {
            FindFriendsInviteAllFragment.access$100(FindFriendsInviteAllFragment.this).updateFriendsCount(invitecountchangeevent.count);
        }
    }

    public void onEventMainThread(InviteCreateEvent invitecreateevent)
    {
        FindFriendsInviteAllFragment.access$000(FindFriendsInviteAllFragment.this).bulkInvite();
    }

    public void onEventMainThread(SelectAllEvent selectallevent)
    {
        if (selectallevent.isSelectAll)
        {
            FindFriendsInviteAllFragment.access$000(FindFriendsInviteAllFragment.this).addAllToInviteList();
        } else
        {
            FindFriendsInviteAllFragment.access$000(FindFriendsInviteAllFragment.this).clearInviteList();
        }
        FindFriendsInviteAllFragment.access$000(FindFriendsInviteAllFragment.this).notifyDataSetChanged();
        if (FindFriendsInviteAllFragment.access$100(FindFriendsInviteAllFragment.this) != null)
        {
            FindFriendsInviteAllFragment.access$100(FindFriendsInviteAllFragment.this).updateFriendsCount(FindFriendsInviteAllFragment.access$000(FindFriendsInviteAllFragment.this).getInviteListSize());
        }
    }

    View()
    {
        this$0 = FindFriendsInviteAllFragment.this;
        super();
    }
}
