// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Bt;
import Jm;
import LA;
import MJ;
import Mt;
import NH;
import NI;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.util.debug.FeatureFlagManager;
import iU;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wN;
import yG;
import yI;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddFriendsFragment, FriendListProperty

public class AddFriendsByUsernameFragment extends AddFriendsFragment
{

    private List E;
    private Jm F;

    public AddFriendsByUsernameFragment()
    {
        Jm jm = Jm.a();
        FeatureFlagManager.a();
        this(jm);
    }

    private AddFriendsByUsernameFragment(Jm jm)
    {
        E = new ArrayList();
        F = jm;
    }

    static List a(AddFriendsByUsernameFragment addfriendsbyusernamefragment)
    {
        return addfriendsbyusernamefragment.E;
    }

    public final int a()
    {
        return 15;
    }

    public final com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext c()
    {
        return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE;
    }

    public final boolean f()
    {
        J();
        s();
        return false;
    }

    protected final yI l()
    {
        if (!Bt.f())
        {
            return new yG();
        } else
        {
            return new yI(j);
        }
    }

    protected final void m()
    {
        x();
        C();
    }

    protected final void n()
    {
        d.a(e);
        Iterator iterator = E.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (!j.l(friend.g()))
            {
                e.add(friend);
            }
        } while (true);
    }

    protected final void o()
    {
    }

    public void onContactsOnSnapchatUpdatedEvent(Mt mt)
    {
        super.onContactsOnSnapchatUpdatedEvent(mt);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        x.setAdapter(A);
        B.setText(0x7f080047);
        C.setHint(0x7f080026);
        d = l();
        A.h = true;
        super.f = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsParent.ADD_FRIENDS;
        I();
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
        if (nh.mFriend != null && nh.mAction == FriendAction.DELETE)
        {
            return;
        } else
        {
            H();
            return;
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (super.r && FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.OFFICIAL_STORIES_SEARCH) && charsequence.length() >= 3)
        {
            F.a(charsequence.toString(), new Jm.a() {

                private AddFriendsByUsernameFragment a;

                public final void a(String s1, List list)
                {
                    android.text.Editable editable = a.C.getText();
                    if (TextUtils.equals(editable, s1))
                    {
                        AddFriendsByUsernameFragment.a(a).clear();
                        AddFriendsByUsernameFragment.a(a).addAll(list);
                        if (((AddFriendsFragment) (a)).r)
                        {
                            a.n();
                            a.a(editable);
                        }
                    }
                }

            
            {
                a = AddFriendsByUsernameFragment.this;
                super();
            }
            });
        }
        super.onTextChanged(charsequence, i, j, k);
    }

    protected void onVisible()
    {
        super.onVisible();
        k.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE);
    }

    protected final int p()
    {
        return 0x7f080047;
    }

    protected final void q()
    {
    }

    protected final void s()
    {
        ProfileEventAnalytics profileeventanalytics = ProfileEventAnalytics.a();
        int i = A.a(FriendAction.ADD, true);
        iU iu = new iU();
        iu.friendAddCount = Long.valueOf(i);
        profileeventanalytics.mBlizzardEventLogger.a(iu);
    }

    protected final FriendListProperty t()
    {
        if (LA.l())
        {
            FriendListProperty friendlistproperty = new FriendListProperty(FriendListProperty.TouchMode.ALWAYS_TAPPABLE, FriendListProperty.Style.OPAQUE_CHECKBOX);
            friendlistproperty.m = true;
            return friendlistproperty;
        } else
        {
            FriendListProperty friendlistproperty1 = new FriendListProperty(FriendListProperty.TouchMode.NON_TAPPABLE, FriendListProperty.Style.OPAQUE_CHECKBOX);
            friendlistproperty1.m = true;
            return friendlistproperty1;
        }
    }
}
