// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Br;
import CF;
import CG;
import CU;
import CX;
import Eh;
import Ei;
import II;
import Ji;
import Mf;
import NH;
import OC;
import OH;
import Oi;
import YO;
import YS;
import YT;
import YU;
import Zf;
import Zh;
import Zm;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.SuggestedFriendAction;
import com.squareup.otto.Bus;
import hR;
import hU;
import iP;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import lX;
import ll;
import wN;
import wR;
import wU;
import wX;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            SwipeableFriendsFragment, FriendListProperty, LeftSwipeContentFragment

public class AddFriendsMenuFragment extends SwipeableFriendsFragment
{

    private View j;
    private final ProfileEventAnalytics k;
    private final Ei l;
    private final Ji m;
    private wU n;
    private com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext o;
    private Eh p = new Eh() {

        private AddFriendsMenuFragment a;

        public final void a(CU cu)
        {
            if (cu instanceof CX)
            {
                cu = (CX)cu;
                if (((CX) (cu)).c && ((CX) (cu)).a == SuggestedFriendAction.HIDE)
                {
                    AddFriendsMenuFragment.a(a, ((CX) (cu)).b);
                }
                AddFriendsMenuFragment.a(a);
            }
        }

            
            {
                a = AddFriendsMenuFragment.this;
                super();
            }
    };

    public AddFriendsMenuFragment()
    {
        this(ProfileEventAnalytics.a());
    }

    private AddFriendsMenuFragment(Ei ei, Ji ji, ProfileEventAnalytics profileeventanalytics, wU wu)
    {
        super((byte)0);
        l = ei;
        c = null;
        m = ji;
        k = profileeventanalytics;
        n = wu;
    }

    private AddFriendsMenuFragment(ProfileEventAnalytics profileeventanalytics)
    {
        Ei ei = Ei.a();
        Ji ji = Ji.a();
        wU wu = wU.a();
        new lX();
        this(ei, ji, profileeventanalytics, wu);
    }

    static com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext a(AddFriendsMenuFragment addfriendsmenufragment, com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext analyticscontext)
    {
        addfriendsmenufragment.o = analyticscontext;
        return analyticscontext;
    }

    static void a(AddFriendsMenuFragment addfriendsmenufragment)
    {
        addfriendsmenufragment.t();
    }

    static void a(AddFriendsMenuFragment addfriendsmenufragment, String s)
    {
        if (!TextUtils.isEmpty(s) && addfriendsmenufragment.i != null)
        {
            addfriendsmenufragment = addfriendsmenufragment.i.iterator();
            while (addfriendsmenufragment.hasNext()) 
            {
                if (TextUtils.equals(((Friend)addfriendsmenufragment.next()).g(), s))
                {
                    addfriendsmenufragment.remove();
                    return;
                }
            }
        }
    }

    private void t()
    {
        if (c != null)
        {
            c.notifyDataSetChanged();
        }
        if (!i.isEmpty())
        {
            j.setVisibility(8);
            return;
        } else
        {
            j.setVisibility(0);
            return;
        }
    }

    public final void K()
    {
        o = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.CAMERA_PAGE;
        super.K();
    }

    public final int a()
    {
        return 14;
    }

    public final com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext c()
    {
        return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_MENU_PAGE;
    }

    public final boolean f()
    {
        o = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.CAMERA_PAGE;
        return super.f();
    }

    public final CF k()
    {
        return new CF() {

            public final boolean a(CG.a a1)
            {
                return CG.h.contains(a1.c);
            }

            public final boolean b(CG.a a1)
            {
                return false;
            }

        };
    }

    protected final int l()
    {
        return 0x7f040005;
    }

    protected final Integer m()
    {
        return Integer.valueOf(0x7f040006);
    }

    protected final wR n()
    {
        return new wX();
    }

    protected final void o()
    {
        if (Br.a() != null)
        {
            synchronized (i)
            {
                i.clear();
                i.addAll(m.a(com.snapchat.android.util.FriendSectionizer.FriendSection.SUGGESTED_FRIEND));
            }
        }
        t();
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        e.findViewById(0x7f0d0073).setOnClickListener(new android.view.View.OnClickListener() {

            private AddFriendsMenuFragment a;

            public final void onClick(View view)
            {
                Mf.a().a(new Oi(LeftSwipeContentFragment.ADD_FRIENDS_BY_USERNAME_FRAGMENT));
                AddFriendsMenuFragment.a(a, com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE);
                a.q();
            }

            
            {
                a = AddFriendsMenuFragment.this;
                super();
            }
        });
        e.findViewById(0x7f0d0074).setOnClickListener(new android.view.View.OnClickListener() {

            private AddFriendsMenuFragment a;

            public final void onClick(View view)
            {
                view = new Bundle();
                view.putBoolean("contextIsAdressBook", true);
                view.putInt("sourcePage", com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_MENU_PAGE.ordinal());
                Mf.a().a(new Oi(LeftSwipeContentFragment.ADDRESS_BOOK_FRAGMENT, view));
                AddFriendsMenuFragment.a(a, com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE);
                a.q();
            }

            
            {
                a = AddFriendsMenuFragment.this;
                super();
            }
        });
        e.findViewById(0x7f0d0075).setOnClickListener(new android.view.View.OnClickListener() {

            private AddFriendsMenuFragment a;

            public final void onClick(View view)
            {
                Mf.a().a(new Oi(LeftSwipeContentFragment.ADD_FRIENDS_FROM_CAMERAROLL_FRAGMENT));
                ProfileEventAnalytics.b();
                AddFriendsMenuFragment.a(a, com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.SNAPCODE_PAGE);
                a.q();
            }

            
            {
                a = AddFriendsMenuFragment.this;
                super();
            }
        });
        e.findViewById(0x7f0d0077).setOnClickListener(new android.view.View.OnClickListener() {

            private AddFriendsMenuFragment a;

            public final void onClick(View view)
            {
                Mf.a().a(new Oi(LeftSwipeContentFragment.ADD_NEARBY_FRIENDS_FRAGMENT));
                ProfileEventAnalytics.c();
                AddFriendsMenuFragment.a(a, com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_NEARBY_FRIENDS_PAGE);
                a.q();
            }

            
            {
                a = AddFriendsMenuFragment.this;
                super();
            }
        });
        if (!II.a(SharedPreferenceKey.IDENTITY_IS_ADD_NEARBY_ENABLED.getKey(), true))
        {
            d(0x7f0d0077).setVisibility(8);
            d(0x7f0d0078).setVisibility(8);
        }
        j = d(0x7f0d0071);
        c.b = new com.snapchat.android.util.FriendSectionizer.f();
        o();
        viewgroup = l;
        bundle = viewgroup.c(((Ei) (viewgroup)).c);
        bundle.putExtra("op_code", 1033);
        bundle.putExtra("action", SuggestedFriendAction.SEEN.toString());
        viewgroup.a(((Ei) (viewgroup)).c, bundle);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        Object obj = n;
        if (((wU) (obj)).b != null)
        {
            obj = ((wU) (obj)).b;
            if (obj == Zf.b)
            {
                throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
            }
            if (!((Zf) (obj)).l)
            {
                ((Zf) (obj)).h.c();
                ((Zf) (obj)).d.interrupt();
                ((Zf) (obj)).i.a.quit();
                YT yt = ((Zf) (obj)).g;
                if (yt.c instanceof Zh)
                {
                    yt.c.shutdown();
                }
                yt.d.a();
                yt.a.quit();
                Zf.a.post(new YT._cls1(yt));
                for (Iterator iterator = ((Zf) (obj)).j.values().iterator(); iterator.hasNext(); ((YS)iterator.next()).a()) { }
                ((Zf) (obj)).j.clear();
                obj.l = true;
            }
        }
    }

    public void onRefreshOnFriendActionEvent(NH nh)
    {
        super.a(nh);
    }

    public void onResume()
    {
        ll.e();
        super.onResume();
        l.a(1033, p);
        ll.f();
        n.a(getActivity());
    }

    public void onUserLoadedEvent(OH oh)
    {
        if (oh != null && oh.user != null)
        {
            o();
        }
    }

    protected void onVisible()
    {
        super.onVisible();
        k.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_MENU_PAGE);
        o();
        Mf.a().a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.VISIBLE));
    }

    protected final FriendListProperty p()
    {
        FriendListProperty friendlistproperty = new FriendListProperty(FriendListProperty.TouchMode.SWIPEABLE, FriendListProperty.Style.OPAQUE_CHECKBOX);
        friendlistproperty.k = true;
        friendlistproperty = friendlistproperty.a(false);
        friendlistproperty.m = true;
        return friendlistproperty;
    }

    protected final void q()
    {
        ProfileEventAnalytics profileeventanalytics = k;
        Object obj = o;
        int i = this.i.size();
        int i1 = c.a(FriendAction.ADD, false);
        hU hu = new hU();
        obj = ProfileEventAnalytics.c(((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj)));
        hu.destination = (hR)((Pair) (obj)).first;
        hu.destinationPage = (iP)((Pair) (obj)).second;
        hu.contactFoundCount = Long.valueOf(i);
        hu.friendAddCount = Long.valueOf(i1);
        profileeventanalytics.mBlizzardEventLogger.a(hu);
    }
}
