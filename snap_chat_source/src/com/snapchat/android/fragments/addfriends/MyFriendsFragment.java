// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import LY;
import MJ;
import Mt;
import NH;
import NI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.emoji.Emoji;
import iJ;
import wN;
import wY;
import yI;
import yK;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddFriendsFragment, FriendListProperty

public class MyFriendsFragment extends AddFriendsFragment
{

    public MyFriendsFragment()
    {
    }

    public MyFriendsFragment(WindowConfiguration windowconfiguration)
    {
        super(windowconfiguration);
    }

    protected final void F()
    {
        TextView textview = y;
        int i;
        if (A.isEmpty())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    public final int a()
    {
        return 11;
    }

    public final com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext c()
    {
        return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_FRIENDS_PAGE;
    }

    protected final yI l()
    {
        return new yK(j);
    }

    protected final void m()
    {
        C();
        x();
    }

    protected final void n()
    {
        d.a(e);
    }

    protected final void o()
    {
        d.b(e);
    }

    public void onContactsOnSnapchatUpdatedEvent(Mt mt)
    {
        super.onContactsOnSnapchatUpdatedEvent(mt);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        d = l();
        b = d.a();
        c = new com.snapchat.android.util.FriendSectionizer.b();
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        x.setAdapter(A);
        B.setText(0x7f08018d);
        A.g = new wY();
        A.i = true;
        A.j = true;
        viewgroup = getString(0x7f08019c, new Object[] {
            LY.a(Emoji.POOP)
        });
        y.setText(viewgroup);
        L();
        return layoutinflater;
    }

    public void onFriendProfileUpdateSucceeded(MJ mj)
    {
        A.notifyDataSetChanged();
    }

    public void onRefreshFriendExistsTask(NI ni)
    {
        super.onRefreshFriendExistsTask(ni);
    }

    public void onRefreshOnFriendActionEvent(NH nh)
    {
        com.snapchat.android.model.Friend friend = nh.mFriend;
        if (friend != null && nh.mAction == FriendAction.DELETE)
        {
            A.a(friend);
            return;
        } else
        {
            H();
            return;
        }
    }

    protected void onVisible()
    {
        super.onVisible();
        k.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_FRIENDS_PAGE);
    }

    protected final int p()
    {
        return 0x7f08018d;
    }

    public final boolean p_()
    {
        return true;
    }

    protected final void s()
    {
        ProfileEventAnalytics profileeventanalytics = ProfileEventAnalytics.a();
        int i = A.getCount();
        int j = A.a(FriendAction.ADD, false);
        int k = A.a(FriendAction.DELETE, false);
        int i1 = A.a(FriendAction.BLOCK, false);
        int j1 = A.a(FriendAction.SET_DISPLAY_NAME, false);
        int k1 = A.a(FriendAction.ADD, true);
        int l1 = A.a(FriendAction.DELETE, true);
        int i2 = A.a(FriendAction.BLOCK, true);
        int j2 = A.a(FriendAction.SET_DISPLAY_NAME, true);
        iJ ij = new iJ();
        ij.myFriendCount = Long.valueOf(i);
        ij.myFriendReAddCount = Long.valueOf(j);
        ij.myFriendRemoveCount = Long.valueOf(k);
        ij.myFriendBlockCount = Long.valueOf(i1);
        ij.myFriendNameEditCount = Long.valueOf(j1);
        ij.myFriendReAddInSearchCount = Long.valueOf(k1);
        ij.myFriendRemoveInSearchCount = Long.valueOf(l1);
        ij.myFriendBlockInSearchCount = Long.valueOf(i2);
        ij.myFriendNameEditInSearchCount = Long.valueOf(j2);
        profileeventanalytics.mBlizzardEventLogger.a(ij);
    }

    protected final FriendListProperty t()
    {
        boolean flag1 = false;
        FriendListProperty friendlistproperty = new FriendListProperty(FriendListProperty.TouchMode.TAPPABLE_FRIENDS, FriendListProperty.Style.OPAQUE_CHECKBOX);
        friendlistproperty.c = true;
        friendlistproperty = friendlistproperty.a(true);
        boolean flag;
        if (friendlistproperty.a != FriendListProperty.TouchMode.NON_TAPPABLE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friendlistproperty.e = flag;
        flag = flag1;
        if (friendlistproperty.a != FriendListProperty.TouchMode.NON_TAPPABLE)
        {
            flag = true;
        }
        friendlistproperty.f = flag;
        friendlistproperty.h = true;
        return friendlistproperty;
    }
}
