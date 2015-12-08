// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Bt;
import CF;
import CG;
import Ei;
import Gc;
import Mt;
import NH;
import NI;
import OH;
import PF;
import S;
import V;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.SharedPreferenceGroup;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.ExperimentUtils;
import com.snapchat.android.util.RegistrationStringKey;
import com.snapchat.android.util.fragment.SnapchatFragment;
import hR;
import iB;
import iC;
import iP;
import ib;
import ic;
import id;
import ig;
import ii;
import ij;
import iu;
import iv;
import iw;
import iz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;
import mH;
import wN;
import yH;
import yI;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddFriendsFragment, ReturningUserPhoneVerificationFragment, FriendListProperty

public class AddressBookFragment extends AddFriendsFragment
    implements ReturningUserPhoneVerificationFragment.a
{
    public final class a extends PF
    {

        private int a;
        private AddressBookFragment b;

        public final void a()
        {
            if (!b.isAdded())
            {
                return;
            } else
            {
                a = a - 1;
                b.z.setText((new StringBuilder()).append(b.getString(0x7f080216)).append(" ").append(a).toString());
                return;
            }
        }

        public final void b()
        {
            if (!b.isAdded())
            {
                return;
            } else
            {
                b.z.setText(0x7f080216);
                b.z.setEnabled(true);
                return;
            }
        }

        public a()
        {
            b = AddressBookFragment.this;
            super(3, 1000L, new Handler());
            z.setEnabled(false);
            a = 3;
            z.setText((new StringBuilder()).append(getString(0x7f080216)).append(" ").append(a).toString());
        }
    }


    protected a E;
    private boolean F;
    private View G;

    public AddressBookFragment()
    {
    }

    protected AddressBookFragment(Ei ei, Provider provider, WindowConfiguration windowconfiguration, Bt bt, ProfileEventAnalytics profileeventanalytics, FriendManager friendmanager)
    {
        super(ei, provider, windowconfiguration, bt, profileeventanalytics, friendmanager);
    }

    public AddressBookFragment(WindowConfiguration windowconfiguration)
    {
        super(windowconfiguration);
    }

    private void Y()
    {
        Object obj = getFragmentManager();
        ReturningUserPhoneVerificationFragment returninguserphoneverificationfragment = (ReturningUserPhoneVerificationFragment)((S) (obj)).a("CONTACT_RETURNING_USER_PHONE_VERIFICATION_FRAGMENT_FOR_ADDRESS_BOOK");
        if (returninguserphoneverificationfragment != null)
        {
            obj = ((S) (obj)).a();
            ((V) (obj)).a(returninguserphoneverificationfragment);
            ((V) (obj)).a();
        }
    }

    static void a(AddressBookFragment addressbookfragment)
    {
        Object obj = RegistrationStringKey.REG_ACCESS_CONTACTS_PROMPT.getString();
        String s1 = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s1 = addressbookfragment.getString(0x7f080152);
        }
        obj = new Gc(addressbookfragment.getActivity());
        obj.h = s1;
        obj.k = false;
        ((Gc) (obj)).a(0x7f0801bc, addressbookfragment. new Gc.a() {

            private AddressBookFragment a;

            public final void a(Gc gc)
            {
                a.E();
                gc = a.j;
                gc = SharedPreferenceKey.USERNAME.getString();
                if (!TextUtils.isEmpty(gc))
                {
                    SharedPreferenceKey.HAS_GIVEN_ACCESS_TO_CONTACTS.getGroup().getSharedPreferences().edit().putBoolean((new StringBuilder()).append(gc.hashCode()).append(SharedPreferenceKey.HAS_GIVEN_ACCESS_TO_CONTACTS.getKey()).toString(), true).apply();
                }
                a.T();
                a.b(false);
            }

            
            {
                a = AddressBookFragment.this;
                super();
            }
        }).b(0x7f08011c, addressbookfragment. new Gc.a() {

            private AddressBookFragment a;

            public final void a(Gc gc)
            {
                a.R();
            }

            
            {
                a = AddressBookFragment.this;
                super();
            }
        }).b();
    }

    private void e(boolean flag)
    {
        ReturningUserPhoneVerificationFragment returninguserphoneverificationfragment = (ReturningUserPhoneVerificationFragment)getFragmentManager().a("CONTACT_RETURNING_USER_PHONE_VERIFICATION_FRAGMENT");
        if (returninguserphoneverificationfragment != null)
        {
            returninguserphoneverificationfragment.j(flag);
        }
    }

    protected void C()
    {
        super.C();
        U();
    }

    protected boolean D()
    {
        return super.D() && Bt.f();
    }

    protected void M()
    {
        c = d.b();
        b = d.a();
    }

    public final void N()
    {
        b(false);
        m();
    }

    protected void O()
    {
        ProfileEventAnalytics profileeventanalytics = k;
        Object obj = c();
        if (obj == com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE)
        {
            obj = new ij();
            profileeventanalytics.mBlizzardEventLogger.a(((kl) (obj)));
        } else
        if (obj == com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_CONTACTS_PAGE)
        {
            iC ic1 = new iC();
            profileeventanalytics.mBlizzardEventLogger.a(ic1);
            return;
        }
    }

    protected void P()
    {
        a = AddFriendsFragment.Page.PHONE_VERIFICATION;
        m();
    }

    protected final void Q()
    {
        B.setText(p());
        D.setVisibility(8);
        x.setFastScrollEnabled(false);
        n.setVisibility(8);
        s.setVisibility(0);
        v.setVisibility(0);
        t.setVisibility(0);
        z.setVisibility(0);
        z.setOnClickListener(new android.view.View.OnClickListener() {

            private AddressBookFragment a;

            public final void onClick(View view)
            {
                AddressBookFragment.a(a);
                (new mH(Ss.a.UPDATESEARCHABLEBYPHONENUMBER, new String[] {
                    "1"
                })).execute();
                view = a.k;
                com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext analyticscontext = a.c();
                Object obj = a.X();
                Bt bt = a.i;
                boolean flag = Bt.f();
                switch (com.snapchat.android.analytics.ProfileEventAnalytics._cls1.$SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[analyticscontext.ordinal()])
                {
                default:
                    Timber.e("ProfileEventAnalytics", (new StringBuilder("onProfileContactPermissionContinue  - Unknown context ")).append(analyticscontext).toString(), new Object[0]);
                    return;

                case 8: // '\b'
                    ib ib1 = new ib();
                    obj = ProfileEventAnalytics.c(((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj)));
                    ib1.source = (hR)((Pair) (obj)).first;
                    ib1.sourcePage = (iP)((Pair) (obj)).second;
                    ib1.verificationType = ProfileEventAnalytics.a(flag);
                    ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(ib1);
                    return;

                case 9: // '\t'
                    obj = new iu();
                    break;
                }
                obj.verificationType = ProfileEventAnalytics.a(flag);
                ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(((kl) (obj)));
            }

            
            {
                a = AddressBookFragment.this;
                super();
            }
        });
        V();
    }

    protected void R()
    {
        S();
        a = AddFriendsFragment.Page.CONTACTS_ACCESS;
        m();
    }

    protected void S()
    {
        ProfileEventAnalytics profileeventanalytics = k;
        com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext analyticscontext = c();
        Object obj = X();
        boolean flag = Bt.f();
        switch (com.snapchat.android.analytics.ProfileEventAnalytics._cls1.$SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[analyticscontext.ordinal()])
        {
        default:
            Timber.e("ProfileEventAnalytics", (new StringBuilder("onProfileContactPermissionDeny  - Unknown context ")).append(analyticscontext).toString(), new Object[0]);
            return;

        case 8: // '\b'
            ic ic1 = new ic();
            obj = ProfileEventAnalytics.c(((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj)));
            ic1.source = (hR)((Pair) (obj)).first;
            ic1.sourcePage = (iP)((Pair) (obj)).second;
            ic1.verificationType = ProfileEventAnalytics.a(flag);
            profileeventanalytics.mBlizzardEventLogger.a(ic1);
            return;

        case 9: // '\t'
            obj = new iv();
            break;
        }
        obj.verificationType = ProfileEventAnalytics.a(flag);
        profileeventanalytics.mBlizzardEventLogger.a(((kl) (obj)));
    }

    protected void T()
    {
        ProfileEventAnalytics profileeventanalytics = k;
        com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext analyticscontext = c();
        Object obj = X();
        boolean flag = Bt.f();
        switch (com.snapchat.android.analytics.ProfileEventAnalytics._cls1.$SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[analyticscontext.ordinal()])
        {
        default:
            Timber.e("ProfileEventAnalytics", (new StringBuilder("onProfileContactPermissionGrant  - Unknown context ")).append(analyticscontext).toString(), new Object[0]);
            return;

        case 8: // '\b'
            id id1 = new id();
            obj = ProfileEventAnalytics.c(((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj)));
            id1.source = (hR)((Pair) (obj)).first;
            id1.sourcePage = (iP)((Pair) (obj)).second;
            id1.verificationType = ProfileEventAnalytics.a(flag);
            profileeventanalytics.mBlizzardEventLogger.a(id1);
            return;

        case 9: // '\t'
            obj = new iw();
            break;
        }
        obj.verificationType = ProfileEventAnalytics.a(flag);
        profileeventanalytics.mBlizzardEventLogger.a(((kl) (obj)));
    }

    protected final void U()
    {
        if (x.getFooterViewsCount() > 0)
        {
            View view = G;
            int i;
            if (!super.r && FriendManager.v())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    protected void V()
    {
        z.setEnabled(true);
    }

    protected void W()
    {
        if (z.isEnabled())
        {
            z.setEnabled(false);
        }
    }

    protected com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext X()
    {
        int i = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.values().length;
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("sourcePage") && F)
        {
            int j = bundle.getInt("sourcePage");
            if (j < i)
            {
                return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.values()[j];
            }
        }
        return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.UNKNOWN;
    }

    public int a()
    {
        return !F ? 12 : 16;
    }

    public com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext c()
    {
        if (F)
        {
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE;
        } else
        {
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_CONTACTS_PAGE;
        }
    }

    protected void d(boolean flag)
    {
        ProfileEventAnalytics profileeventanalytics = k;
        Object obj = c();
        if (obj == com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE)
        {
            obj = new ii();
            obj.dialogAction = Boolean.valueOf(flag);
            profileeventanalytics.mBlizzardEventLogger.a(((kl) (obj)));
        } else
        if (obj == com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_CONTACTS_PAGE)
        {
            iB ib = new iB();
            ib.dialogAction = Boolean.valueOf(flag);
            profileeventanalytics.mBlizzardEventLogger.a(ib);
            return;
        }
    }

    public final void e()
    {
        super.e();
        e(false);
        W();
        E = null;
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

    protected yI l()
    {
        return new yH(j);
    }

    protected void m()
    {
        M();
        x();
        if (!super.r) goto _L2; else goto _L1
_L1:
        C();
_L4:
        return;
_L2:
        static final class _cls8
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.snapchat.android.util.FriendSectionizer.FriendSection.values().length];
                try
                {
                    b[com.snapchat.android.util.FriendSectionizer.FriendSection.ON_SNAPCHAT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.snapchat.android.util.FriendSectionizer.FriendSection.INVITE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[AddFriendsFragment.Page.values().length];
                try
                {
                    a[AddFriendsFragment.Page.PHONE_VERIFICATION.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AddFriendsFragment.Page.CONTACTS_ACCESS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AddFriendsFragment.Page.ADD_FRIENDS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls8.a[A().ordinal()])
        {
        default:
            C();
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_190;
        }
_L5:
        if (a != AddFriendsFragment.Page.PHONE_VERIFICATION)
        {
            Y();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        ReturningUserPhoneVerificationFragment returninguserphoneverificationfragment;
label0:
        {
            B.setText(p());
            D.setVisibility(8);
            x.setFastScrollEnabled(false);
            S s1 = getFragmentManager();
            Object obj = (ReturningUserPhoneVerificationFragment)s1.a("CONTACT_RETURNING_USER_PHONE_VERIFICATION_FRAGMENT_FOR_ADDRESS_BOOK");
            if (obj != null)
            {
                returninguserphoneverificationfragment = ((ReturningUserPhoneVerificationFragment) (obj));
                if (((ReturningUserPhoneVerificationFragment) (obj)).isInLayout())
                {
                    break label0;
                }
            }
            obj = s1.a();
            returninguserphoneverificationfragment = new ReturningUserPhoneVerificationFragment(super.mWindowConfiguration);
            ((V) (obj)).b(n.getId(), returninguserphoneverificationfragment, "CONTACT_RETURNING_USER_PHONE_VERIFICATION_FRAGMENT_FOR_ADDRESS_BOOK");
            ((V) (obj)).a();
        }
        returninguserphoneverificationfragment.b(false);
        n.setVisibility(0);
        returninguserphoneverificationfragment.a = this;
        returninguserphoneverificationfragment.j(true);
          goto _L5
        Q();
          goto _L5
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

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            F = bundle.getBoolean("contextIsAdressBook", false);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        d = l();
        M();
        viewgroup = super.onCreateView(layoutinflater, viewgroup, bundle);
        Y();
        G = layoutinflater.inflate(0x7f040001, null);
        if (!Bt.f())
        {
            x.addFooterView(G);
        }
        x.setAdapter(A);
        G.findViewById(0x7f0d0035).setVisibility(0);
        ((TextView)G.findViewById(0x7f0d0037)).setText(0x7f08018c);
        G.setBackgroundColor(0);
        G.setOnClickListener(new android.view.View.OnClickListener() {

            private AddressBookFragment a;

            public final void onClick(View view)
            {
                a.O();
                view = a;
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(view.getActivity());
                builder.setTitle(0x7f0801e2).setMessage(0x7f0801e3).setCancelable(true).setPositiveButton(0x7f080312, view. new android.content.DialogInterface.OnClickListener() {

                    private AddressBookFragment a;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        a.d(true);
                        a.P();
                    }

            
            {
                a = AddressBookFragment.this;
                super();
            }
                }).setNegativeButton(0x7f08007f, view. new android.content.DialogInterface.OnClickListener() {

                    private AddressBookFragment a;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        a.d(false);
                        dialoginterface.cancel();
                    }

            
            {
                a = AddressBookFragment.this;
                super();
            }
                });
                builder.show();
            }

            
            {
                a = AddressBookFragment.this;
                super();
            }
        });
        A.k = true;
        A.i = true;
        L();
        return viewgroup;
    }

    public void onRefreshFriendExistsTask(NI ni)
    {
        super.onRefreshFriendExistsTask(ni);
    }

    public void onRefreshOnFriendActionEvent(NH nh)
    {
        super.onRefreshOnFriendActionEvent(nh);
    }

    public void onUserLoadedEvent(OH oh)
    {
        super.onUserLoadedEvent(oh);
    }

    public void onVisible()
    {
        super.onVisible();
        com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext analyticscontext = c();
        if (analyticscontext == com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE || analyticscontext == com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.NEW_USER_CONTACT_BOOK_PAGE)
        {
            k.a(analyticscontext, FriendManager.w(), Bt.f(), X());
        }
        if (!Bt.f())
        {
            ExperimentUtils.b();
        }
        boolean flag;
        if (a == AddFriendsFragment.Page.PHONE_VERIFICATION)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e(flag);
        if (z.getVisibility() == 0)
        {
            V();
        }
    }

    protected int p()
    {
        switch (_cls8.a[a.ordinal()])
        {
        default:
            return 0x7f08005c;

        case 1: // '\001'
        case 2: // '\002'
            return 0x7f080139;
        }
    }

    protected void s()
    {
        Object obj;
        int i;
        int j;
        obj = e.iterator();
        i = 0;
        j = 0;
_L6:
        Object obj1;
        Object obj2;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag;
        if (((Iterator) (obj)).hasNext())
        {
            com.snapchat.android.util.FriendSectionizer.FriendSection friendsection = ((Friend)((Iterator) (obj)).next()).mFriendSection;
            switch (_cls8.b[friendsection.ordinal()])
            {
            case 1: // '\001'
                j++;
                break;

            case 2: // '\002'
                i++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        obj1 = X();
        obj = ProfileEventAnalytics.a();
        obj2 = c();
        i1 = A.a(FriendAction.ADD, false);
        j1 = A.a(FriendAction.ADD, true);
        k1 = A.a(FriendAction.INVITE, false);
        l1 = A.a(FriendAction.INVITE, true);
        flag = Bt.f();
        obj1 = ProfileEventAnalytics.c(((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj1)));
        if (obj2 != com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE) goto _L2; else goto _L1
_L1:
        obj2 = new ig();
        obj2.destination = (hR)((Pair) (obj1)).first;
        obj2.destinationPage = (iP)((Pair) (obj1)).second;
        obj2.contactFoundCount = Long.valueOf(j);
        obj2.nonSnapchatterCount = Long.valueOf(i);
        obj2.friendAddCount = Long.valueOf(i1);
        obj2.contactInviteCount = Long.valueOf(k1);
        obj2.snapchatterAddInSearchCount = Long.valueOf(j1);
        obj2.nonSnapchatterInviteInSearchCount = Long.valueOf(l1);
        obj2.verificationType = ProfileEventAnalytics.a(flag);
        ((ProfileEventAnalytics) (obj)).mBlizzardEventLogger.a(((kl) (obj2)));
_L4:
        return;
_L2:
        if (obj2 != com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_CONTACTS_PAGE) goto _L4; else goto _L3
_L3:
        iz iz1 = new iz();
        iz1.destination = (hR)((Pair) (obj1)).first;
        iz1.destinationPage = (iP)((Pair) (obj1)).second;
        iz1.contactFoundCount = Long.valueOf(j);
        iz1.nonSnapchatterCount = Long.valueOf(i);
        iz1.friendAddCount = Long.valueOf(i1);
        iz1.contactInviteCount = Long.valueOf(k1);
        iz1.snapchatterAddInSearchCount = Long.valueOf(j1);
        iz1.nonSnapchatterInviteInSearchCount = Long.valueOf(l1);
        iz1.verificationType = ProfileEventAnalytics.a(flag);
        ((ProfileEventAnalytics) (obj)).mBlizzardEventLogger.a(iz1);
        break; /* Loop/switch isn't completed */
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected FriendListProperty t()
    {
        FriendListProperty friendlistproperty = new FriendListProperty(FriendListProperty.TouchMode.ALWAYS_TAPPABLE, FriendListProperty.Style.OPAQUE_CHECKBOX);
        friendlistproperty.m = true;
        return friendlistproperty;
    }
}
