// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Bm;
import Br;
import Bt;
import Ei;
import HZ;
import Jo;
import Mt;
import NH;
import NI;
import Un;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.TextView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.fragments.verification.NewUserPhoneVerificationFragment;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.RegistrationStringKey;
import com.snapchat.android.util.fragment.SnapchatFragment;
import dA;
import iZ;
import jF;
import jM;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import javax.inject.Provider;
import jf;
import jg;
import jh;
import ji;
import jj;
import jk;
import jl;
import mh;
import pi;
import wN;
import yI;
import yL;
import yM;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddressBookFragment, AddFriendsFragment, FriendListProperty

public class NewUserContactBookFragment extends AddressBookFragment
{
    public static final class NewUserContactBookPageType extends Enum
    {

        private static final NewUserContactBookPageType $VALUES[];
        public static final NewUserContactBookPageType NON_SNAPCHATTERS;
        public static final NewUserContactBookPageType SNAPCHATTERS;
        private final int a;

        public static NewUserContactBookPageType getType(int i)
        {
            NewUserContactBookPageType anewusercontactbookpagetype[] = values();
            int k = anewusercontactbookpagetype.length;
            for (int j = 0; j < k; j++)
            {
                NewUserContactBookPageType newusercontactbookpagetype = anewusercontactbookpagetype[j];
                if (newusercontactbookpagetype.a == i)
                {
                    return newusercontactbookpagetype;
                }
            }

            return null;
        }

        public static NewUserContactBookPageType valueOf(String s1)
        {
            return (NewUserContactBookPageType)Enum.valueOf(com/snapchat/android/fragments/addfriends/NewUserContactBookFragment$NewUserContactBookPageType, s1);
        }

        public static NewUserContactBookPageType[] values()
        {
            return (NewUserContactBookPageType[])$VALUES.clone();
        }

        public final int getValue()
        {
            return a;
        }

        static 
        {
            SNAPCHATTERS = new NewUserContactBookPageType("SNAPCHATTERS", 0, 0);
            NON_SNAPCHATTERS = new NewUserContactBookPageType("NON_SNAPCHATTERS", 1, 1);
            $VALUES = (new NewUserContactBookPageType[] {
                SNAPCHATTERS, NON_SNAPCHATTERS
            });
        }

        private NewUserContactBookPageType(String s1, int i, int j)
        {
            super(s1, i);
            a = j;
        }
    }

    public final class a
    {

        public int a;
        public int b;
        public int c;
        public int d;

        protected a()
        {
            a = 0;
            b = 0;
            c = 0;
            d = 0;
        }
    }


    FragmentActivity F;
    private final RegistrationAnalytics G;
    private int H;
    private NewUserContactBookPageType I;
    private Button J;
    private Button K;

    public NewUserContactBookFragment()
    {
        this(new WindowConfiguration());
    }

    public NewUserContactBookFragment(WindowConfiguration windowconfiguration)
    {
        this(Br.UNSAFE_USER_PROVIDER, RegistrationAnalytics.a(), windowconfiguration, Bt.a(), FriendManager.e());
    }

    private NewUserContactBookFragment(Provider provider, RegistrationAnalytics registrationanalytics, WindowConfiguration windowconfiguration, Bt bt, FriendManager friendmanager)
    {
        super(Ei.a(), provider, windowconfiguration, bt, ProfileEventAnalytics.a(), friendmanager);
        G = registrationanalytics;
    }

    static RegistrationAnalytics a(NewUserContactBookFragment newusercontactbookfragment)
    {
        return newusercontactbookfragment.G;
    }

    private void a(int i, int j)
    {
        Br br = (Br)h.get();
        if (I == NewUserContactBookPageType.NON_SNAPCHATTERS)
        {
            HZ.a(F);
            return;
        }
        if (i > 0 && br != null && j == 0)
        {
            aa();
            return;
        }
        if (j != 0)
        {
            Bt.h(j);
            a(new LinkedBlockingDeque(A.f));
        }
        if (!ag() || i >= 20 || j >= 5)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            HZ.a(F);
            return;
        } else
        {
            Y();
            return;
        }
    }

    private boolean af()
    {
        int i = Z().a;
        return i > 0 && i <= 20 && I != NewUserContactBookPageType.NON_SNAPCHATTERS;
    }

    private boolean ag()
    {
        return !FriendManager.v() && !j.mContactsNotOnSnapchat.isEmpty();
    }

    static boolean b(NewUserContactBookFragment newusercontactbookfragment)
    {
        return newusercontactbookfragment.ag();
    }

    private void g(boolean flag)
    {
        Button button = J;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        button.setVisibility(i);
    }

    private void h(boolean flag)
    {
        if (flag)
        {
            p.setVisibility(0);
            q.setOnClickListener(new android.view.View.OnClickListener() {

                private NewUserContactBookFragment a;

                public final void onClick(View view)
                {
                    Jo.a(a.getActivity(), a.C);
                    a.q();
                }

            
            {
                a = NewUserContactBookFragment.this;
                super();
            }
            });
            return;
        } else
        {
            p.setVisibility(4);
            q.setOnClickListener(null);
            return;
        }
    }

    protected final boolean B()
    {
        return z();
    }

    protected final void C()
    {
        byte byte0 = 8;
        super.C();
        if (I == NewUserContactBookPageType.SNAPCHATTERS)
        {
            String s1 = RegistrationStringKey.REG_ADD_FRIENDS_INFO.getString();
            if (!TextUtils.isEmpty(s1))
            {
                w.setVisibility(0);
                w.setText(s1);
            }
        }
        if (K.getVisibility() == 0)
        {
            K.setVisibility(8);
        }
        Button button = J;
        if (af())
        {
            byte0 = 0;
        }
        button.setVisibility(byte0);
        U();
        z.setVisibility(0);
        z.setEnabled(true);
        z.setOnClickListener(new android.view.View.OnClickListener() {

            private NewUserContactBookFragment a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!a.A.isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.e(flag);
            }

            
            {
                a = NewUserContactBookFragment.this;
                super();
            }
        });
    }

    protected final boolean D()
    {
        return super.D() && Bt.f();
    }

    protected final void G()
    {
        o();
    }

    protected final void I()
    {
        super.I();
        g(false);
        h(true);
    }

    protected final void M()
    {
        c = d.b();
        b = d.a();
    }

    protected final void O()
    {
        RegistrationAnalytics registrationanalytics = G;
        jk jk1 = new jk();
        registrationanalytics.mBlizzardEventLogger.a(jk1);
    }

    protected final void P()
    {
        a(H, new NewUserPhoneVerificationFragment(super.mWindowConfiguration), com/snapchat/android/fragments/verification/NewUserPhoneVerificationFragment.getSimpleName());
    }

    protected final void R()
    {
        S();
        HZ.a(F);
    }

    protected final void S()
    {
        RegistrationAnalytics registrationanalytics = G;
        jh jh1 = new jh();
        registrationanalytics.mBlizzardEventLogger.a(jh1);
    }

    protected final void T()
    {
        RegistrationAnalytics registrationanalytics = G;
        ji ji1 = new ji();
        registrationanalytics.mBlizzardEventLogger.a(ji1);
    }

    protected final void V()
    {
        E = new AddressBookFragment.a(this);
        E.e();
    }

    protected final void W()
    {
        if (E != null)
        {
            E.c();
            z.setText(0x7f080216);
            z.setEnabled(false);
        }
    }

    protected final com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext X()
    {
        return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.UNKNOWN;
    }

    protected final void Y()
    {
        I = NewUserContactBookPageType.NON_SNAPCHATTERS;
        d = l();
        M();
        if (j.f())
        {
            o();
            A.notifyDataSetChanged();
        }
        B.setText(p());
        J.setVisibility(8);
        if (K.getVisibility() == 0)
        {
            K.setVisibility(8);
        }
    }

    protected final a Z()
    {
        if ((Br)h.get() != null)
        {
            o();
        }
        a a1 = new a();
        Set set = A.f;
        a1.b = set.size();
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (friend.h())
            {
                a1.a = a1.a + 1;
                if (friend.mIsRecommended)
                {
                    a1.c = a1.c + 1;
                    if (set.contains(friend))
                    {
                        a1.d = a1.d + 1;
                    }
                }
            }
        } while (true);
        a1.c = a1.c / 2;
        a1.d = a1.d / 2;
        a1.a = a1.a - a1.c;
        return a1;
    }

    public final int a()
    {
        return -1;
    }

    protected final void a(LinkedBlockingDeque linkedblockingdeque)
    {
        ArrayList arraylist;
        Friend friend;
        for (arraylist = new ArrayList(50); !linkedblockingdeque.isEmpty() && arraylist.size() < 50; arraylist.add(friend))
        {
            friend = (Friend)linkedblockingdeque.poll();
            friend.mAddSourceType = com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_PHONE;
        }

        linkedblockingdeque = (new mh((Friend)arraylist.get(0), FriendAction.MULTI_ADD, linkedblockingdeque) {

            private LinkedBlockingDeque a;
            private NewUserContactBookFragment b;

            public final void a(Un un, pi pi)
            {
                super.a(un, pi);
                if (!a.isEmpty())
                {
                    b.a(a);
                }
            }

            
            {
                b = NewUserContactBookFragment.this;
                a = linkedblockingdeque;
                super(friend, friendaction);
            }
        }).a(arraylist);
        linkedblockingdeque.mAnalyticsContext = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.NEW_USER_CONTACT_BOOK_PAGE;
        linkedblockingdeque.a().execute();
    }

    protected final void aa()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(F);
        String s2 = RegistrationStringKey.REG_SKIP_FIND_FRIEND_CONFIRM.getString();
        String s1 = s2;
        if (s2 == null)
        {
            s1 = getString(0x7f0802ae);
        }
        builder.setMessage(s1);
        builder.setPositiveButton(0x7f080323, new android.content.DialogInterface.OnClickListener() {

            private NewUserContactBookFragment a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                NewUserContactBookFragment.a(a).b(true);
                if (NewUserContactBookFragment.b(a))
                {
                    a.Y();
                    return;
                } else
                {
                    HZ.a(a.F);
                    return;
                }
            }

            
            {
                a = NewUserContactBookFragment.this;
                super();
            }
        });
        builder.setNegativeButton(0x7f080196, new android.content.DialogInterface.OnClickListener() {

            private NewUserContactBookFragment a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                NewUserContactBookFragment.a(a).b(false);
            }

            
            {
                a = NewUserContactBookFragment.this;
                super();
            }
        });
        builder.create().show();
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    protected final int c(boolean flag)
    {
        Ei ei = g;
        FragmentActivity fragmentactivity = getActivity();
        Intent intent = ei.c(fragmentactivity);
        intent.putExtra("op_code", 1002);
        intent.putExtra("use_cache", false);
        intent.putExtra("only_new_contact", false);
        intent.putExtra("should_recommend", true);
        return ei.a(fragmentactivity, intent);
    }

    public final com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext c()
    {
        return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.NEW_USER_CONTACT_BOOK_PAGE;
    }

    protected final void d(boolean flag)
    {
        RegistrationAnalytics registrationanalytics = G;
        jj jj1 = new jj();
        jj1.dialogAction = Boolean.valueOf(flag);
        registrationanalytics.mBlizzardEventLogger.a(jj1);
    }

    protected final void e(boolean flag)
    {
        Object obj;
        obj = Z();
        a(((a) (obj)).a, ((a) (obj)).b);
        if (!flag) goto _L2; else goto _L1
_L1:
        RegistrationAnalytics registrationanalytics = G;
        long l1 = ((a) (obj)).a;
        long l2 = ((a) (obj)).b;
        long l3 = A.e.size();
        long l4 = ((a) (obj)).c;
        long l5 = ((a) (obj)).d;
        jf jf1;
        NewUserContactBookPageType newusercontactbookpagetype;
        if (Bt.f())
        {
            obj = jM.PHONE;
        } else
        {
            obj = jM.CAPTCHA;
        }
        newusercontactbookpagetype = I;
        jf1 = new jf();
        jf1.contactFoundCount = Long.valueOf(l1);
        jf1.friendAddCount = Long.valueOf(l2);
        jf1.contactInviteCount = Long.valueOf(l3);
        jf1.recommendedContactCount = Long.valueOf(l4);
        jf1.recommendedAddCount = Long.valueOf(l5);
        jf1.verificationType = ((jM) (obj));
        com.snapchat.android.analytics.RegistrationAnalytics._cls1.$SwitchMap$com$snapchat$android$fragments$addfriends$NewUserContactBookFragment$NewUserContactBookPageType[newusercontactbookpagetype.ordinal()];
        JVM INSTR tableswitch 1 2: default 180
    //                   1 205
    //                   2 212;
           goto _L3 _L4 _L5
_L3:
        obj = null;
_L7:
        jf1.pageType = ((iZ) (obj));
        registrationanalytics.mBlizzardEventLogger.a(jf1);
_L2:
        return;
_L4:
        obj = iZ.SNAPCHATTERS;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = iZ.NON_SNAPCHATTERS;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean f()
    {
        if (super.r)
        {
            q();
            return false;
        } else
        {
            a(1, 0);
            return true;
        }
    }

    protected final yI l()
    {
        if (I == NewUserContactBookPageType.SNAPCHATTERS)
        {
            return new yM(j);
        } else
        {
            return new yL(j);
        }
    }

    protected final void m()
    {
        x();
        if (!FriendManager.w())
        {
            Q();
            return;
        } else
        {
            RegistrationAnalytics registrationanalytics = G;
            jg jg1 = new jg();
            registrationanalytics.mBlizzardEventLogger.a(jg1);
            C();
            return;
        }
    }

    public void onContactsOnSnapchatUpdatedEvent(Mt mt)
    {
        super.onContactsOnSnapchatUpdatedEvent(mt);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        F = getActivity();
        I = NewUserContactBookPageType.SNAPCHATTERS;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        w = (TextView)d(0x7f0d01dd);
        A.i = true;
        x.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            private NewUserContactBookFragment a;

            public final void onScroll(AbsListView abslistview, int i, int j, int k)
            {
            }

            public final void onScrollStateChanged(AbsListView abslistview, int i)
            {
                if (i == 0)
                {
                    abslistview = NewUserContactBookFragment.a(a);
                    jl jl1 = new jl();
                    ((RegistrationAnalytics) (abslistview)).mBlizzardEventLogger.a(jl1);
                }
            }

            
            {
                a = NewUserContactBookFragment.this;
                super();
            }
        });
        super.f = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsParent.REGISTER_ADD_FRIENDS;
        RegistrationStringKey.REG_FIND_FRIENDS_TITLE.setTextViewIfNeeded(B);
        RegistrationStringKey.REG_FIND_FRIENDS_DESC.setTextViewIfNeeded(v);
        RegistrationStringKey.REG_FIND_FRIENDS_DESC_BELOW.setTextViewIfNeeded(u);
        H = viewgroup.getId();
        mFragmentLayout.setBackgroundColor(0);
        return mFragmentLayout;
    }

    public void onRefreshFriendExistsTask(NI ni)
    {
        super.onRefreshFriendExistsTask(ni);
    }

    public void onRefreshOnFriendActionEvent(NH nh)
    {
        super.onRefreshOnFriendActionEvent(nh);
    }

    protected final int p()
    {
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[NewUserContactBookPageType.values().length];
                try
                {
                    a[NewUserContactBookPageType.SNAPCHATTERS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[NewUserContactBookPageType.NON_SNAPCHATTERS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[I.ordinal()])
        {
        default:
            return 0x7f080139;

        case 1: // '\001'
            return 0x7f080047;

        case 2: // '\002'
            return 0x7f080162;
        }
    }

    protected final void q()
    {
        super.q();
        g(af());
        h(false);
    }

    protected final void s()
    {
    }

    protected final FriendListProperty t()
    {
        FriendListProperty friendlistproperty = new FriendListProperty(FriendListProperty.TouchMode.NON_TAPPABLE, FriendListProperty.Style.TRANSPARENT_CHECKBOX);
        friendlistproperty.g = true;
        friendlistproperty.m = true;
        return friendlistproperty;
    }

    protected final int u()
    {
        return 0x7f020238;
    }

    protected final void v()
    {
        super.v();
        o.setBackgroundColor(0);
        p.setVisibility(4);
        q.setOnClickListener(null);
        B.setText(p());
        B.setTextColor(getResources().getColor(0x7f0c003d));
        J = (Button)d(0x7f0d0040);
        Bm bm;
        int i;
        if (I != NewUserContactBookPageType.NON_SNAPCHATTERS)
        {
            J.setOnClickListener(new android.view.View.OnClickListener() {

                private NewUserContactBookFragment a;

                public final void onClick(View view)
                {
                    RegistrationAnalytics registrationanalytics = NewUserContactBookFragment.a(a);
                    long l1 = a.Z().a;
                    view = a.i;
                    jF jf1;
                    if (Bt.f())
                    {
                        view = jM.PHONE;
                    } else
                    {
                        view = jM.CAPTCHA;
                    }
                    jf1 = new jF();
                    jf1.contactFoundCount = Long.valueOf(l1);
                    jf1.verificationType = view;
                    registrationanalytics.mBlizzardEventLogger.a(jf1);
                    view = a.e.iterator();
                    do
                    {
                        if (!view.hasNext())
                        {
                            break;
                        }
                        Friend friend = (Friend)view.next();
                        if (!dA.c(friend.g()))
                        {
                            a.A.a(friend, true);
                        }
                    } while (true);
                    a.H();
                }

            
            {
                a = NewUserContactBookFragment.this;
                super();
            }
            });
        } else
        {
            J.setVisibility(8);
        }
        K = (Button)d(0x7f0d001b);
        bm = Bm.a();
        i = bm.a("REGISTER_SHOW_SKIP_FIND_FRIENDS", "experimentId", -1);
        if (i != -1)
        {
            bm.b("REGISTER_SHOW_SKIP_FIND_FRIENDS", String.valueOf(i));
        }
        if (i == 1)
        {
            K.setVisibility(0);
            K.setOnClickListener(new android.view.View.OnClickListener() {

                private NewUserContactBookFragment a;

                public final void onClick(View view)
                {
                    a.aa();
                }

            
            {
                a = NewUserContactBookFragment.this;
                super();
            }
            });
        }
    }

    protected final void w()
    {
        super.w();
        D.setOnClickListener(new android.view.View.OnClickListener() {

            private NewUserContactBookFragment a;

            public final void onClick(View view)
            {
label0:
                {
                    if (Br.a() != null)
                    {
                        if (!((AddFriendsFragment) (a)).r)
                        {
                            break label0;
                        }
                        a.q();
                    }
                    return;
                }
                a.I();
            }

            
            {
                a = NewUserContactBookFragment.this;
                super();
            }
        });
    }

    protected final void x()
    {
        l.setVisibility(8);
        m.setVisibility(8);
    }

    protected final boolean z()
    {
        return Bt.f() || Bt.g();
    }
}
