// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Br;
import Bt;
import CU;
import Eh;
import Ei;
import Iq;
import Jo;
import LA;
import Mf;
import Mt;
import NH;
import NI;
import OH;
import Oi;
import Pp;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.TextView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.ExperimentUtils;
import com.snapchat.android.util.FriendSectionizer;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import iD;
import iL;
import iW;
import ik;
import il;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Provider;
import ll;
import wN;
import wW;
import yI;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            FriendListProperty, LeftSwipeContentFragment

public abstract class AddFriendsFragment extends SnapchatFragment
    implements TextWatcher, android.view.View.OnClickListener, com.snapchat.android.fragments.MiniProfileFragment.a, LeftSwipeContainerFragment.a, wN.a
{
    public static final class Page extends Enum
    {

        private static final Page $VALUES[];
        public static final Page ADD_FRIENDS;
        public static final Page CONTACTS_ACCESS;
        public static final Page PHONE_VERIFICATION;

        public static Page valueOf(String s1)
        {
            return (Page)Enum.valueOf(com/snapchat/android/fragments/addfriends/AddFriendsFragment$Page, s1);
        }

        public static Page[] values()
        {
            return (Page[])$VALUES.clone();
        }

        static 
        {
            PHONE_VERIFICATION = new Page("PHONE_VERIFICATION", 0);
            CONTACTS_ACCESS = new Page("CONTACTS_ACCESS", 1);
            ADD_FRIENDS = new Page("ADD_FRIENDS", 2);
            $VALUES = (new Page[] {
                PHONE_VERIFICATION, CONTACTS_ACCESS, ADD_FRIENDS
            });
        }

        private Page(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    protected wN A;
    protected TextView B;
    protected EditText C;
    protected View D;
    private com.snapchat.android.util.ExperimentUtils.PhoneVerificationExperiment E;
    private int F;
    private View G;
    private View H;
    private TextView I;
    private TextView J;
    private TextView K;
    private TextView L;
    private TextView M;
    private View N;
    private HashSet O;
    private Eh P = new Eh() {

        private AddFriendsFragment a;

        public final void a(CU cu)
        {
            int i1 = Ei.a(cu);
            if (AddFriendsFragment.a(a).contains(Integer.valueOf(i1)))
            {
                AddFriendsFragment.a(a).remove(Integer.valueOf(i1));
                a.m();
                a.H();
            }
        }

            
            {
                a = AddFriendsFragment.this;
                super();
            }
    };
    private DataSetObserver Q = new DataSetObserver() {

        private AddFriendsFragment a;

        public final void onChanged()
        {
            super.onChanged();
            a.F();
        }

            
            {
                a = AddFriendsFragment.this;
                super();
            }
    };
    protected Page a;
    protected FriendSectionizer b;
    protected FriendSectionizer c;
    protected yI d;
    protected ArrayList e;
    com.snapchat.android.analytics.AnalyticsEvents.AnalyticsParent f;
    protected Ei g;
    protected final Provider h;
    protected final Bt i;
    protected final FriendManager j;
    protected final ProfileEventAnalytics k;
    protected View l;
    protected View m;
    protected View n;
    protected View o;
    protected View p;
    protected View q;
    boolean r;
    protected View s;
    protected View t;
    protected TextView u;
    protected TextView v;
    protected TextView w;
    protected StickyListHeadersListView x;
    protected TextView y;
    protected Button z;

    public AddFriendsFragment()
    {
        this(new WindowConfiguration());
    }

    protected AddFriendsFragment(Ei ei, Provider provider, WindowConfiguration windowconfiguration, Bt bt, ProfileEventAnalytics profileeventanalytics, FriendManager friendmanager)
    {
        ExperimentUtils.a();
        LA.a();
        this(ei, provider, windowconfiguration, bt, profileeventanalytics, friendmanager, (byte)0);
    }

    private AddFriendsFragment(Ei ei, Provider provider, WindowConfiguration windowconfiguration, Bt bt, ProfileEventAnalytics profileeventanalytics, FriendManager friendmanager, byte byte0)
    {
        super(windowconfiguration);
        b = new com.snapchat.android.util.FriendSectionizer.b();
        c = new com.snapchat.android.util.FriendSectionizer.a();
        e = new ArrayList();
        F = 0;
        O = new HashSet();
        g = ei;
        h = provider;
        i = bt;
        k = profileeventanalytics;
        d = new yI(friendmanager);
        j = friendmanager;
    }

    public AddFriendsFragment(WindowConfiguration windowconfiguration)
    {
        this(Ei.a(), Br.UNSAFE_USER_PROVIDER, windowconfiguration, Bt.a(), ProfileEventAnalytics.a(), FriendManager.e());
    }

    private boolean M()
    {
        return z() && FriendManager.w();
    }

    private boolean N()
    {
        return r && TextUtils.isEmpty(A.d());
    }

    private boolean O()
    {
        return !r && A.isEmpty() && A() == Page.ADD_FRIENDS;
    }

    static HashSet a(AddFriendsFragment addfriendsfragment)
    {
        return addfriendsfragment.O;
    }

    static int b(AddFriendsFragment addfriendsfragment)
    {
        addfriendsfragment.F = 0;
        return 0;
    }

    protected final Page A()
    {
_L7:
        static final class _cls8
        {

            static final int a[];

            static 
            {
                a = new int[Page.values().length];
                try
                {
                    a[Page.PHONE_VERIFICATION.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Page.CONTACTS_ACCESS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls8.a[a.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 37
    //                   2 70;
           goto _L1 _L2 _L3
_L1:
        return a;
_L2:
        if (!B()) goto _L1; else goto _L4
_L4:
        if (!FriendManager.w()) goto _L6; else goto _L5
_L5:
        a = Page.ADD_FRIENDS;
          goto _L1
_L6:
        a = Page.CONTACTS_ACCESS;
          goto _L7
_L3:
        if (FriendManager.w())
        {
            a = Page.ADD_FRIENDS;
        }
          goto _L1
    }

    protected boolean B()
    {
        return Bt.f();
    }

    protected void C()
    {
        B.setText(p());
        View view = D;
        int i1;
        if (D())
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        view.setVisibility(i1);
        x.setFastScrollEnabled(true);
        n.setVisibility(8);
        s.setVisibility(8);
        x.setVisibility(0);
        z.setVisibility(8);
        H.setVisibility(8);
    }

    protected boolean D()
    {
        return !r;
    }

    public final int D_()
    {
        return F;
    }

    protected final void E()
    {
        G.setVisibility(8);
        t.setVisibility(8);
        u.setVisibility(8);
        v.setText(0x7f08003d);
        H.setVisibility(0);
        z.setVisibility(8);
    }

    public final com.snapchat.android.analytics.AnalyticsEvents.AnalyticsParent E_()
    {
        if (f == null)
        {
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsParent.UNKNOWN;
        } else
        {
            return f;
        }
    }

    protected void F()
    {
        int i1;
        boolean flag1 = true;
        boolean flag = false;
        if (N() || O())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (N())
        {
            I.setVisibility(8);
            J.setVisibility(0);
            K.setText(Bt.q());
            K.setVisibility(0);
            StickyListHeadersListView stickylistheaderslistview;
            if (!TextUtils.isEmpty(Bt.J()))
            {
                L.setVisibility(0);
                M.setText(Bt.J());
                M.setVisibility(0);
            } else
            {
                L.setVisibility(8);
                M.setVisibility(8);
            }
        } else
        {
            I.setVisibility(8);
            J.setVisibility(8);
            K.setVisibility(8);
            L.setVisibility(8);
            M.setVisibility(8);
        }
        if (O())
        {
            if (O.isEmpty())
            {
                Timber.c("AddFriendsFragment", (new StringBuilder("user ")).append(Bt.q()).append(" has empty address book, with ").append(e.size()).append(" friends").toString(), new Object[0]);
                ProfileEventAnalytics.d();
                s.setVisibility(8);
                I.setVisibility(0);
            } else
            {
                s.setVisibility(0);
                E();
            }
        } else
        {
            I.setVisibility(8);
            y.setVisibility(8);
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        i1 = ((flag1) ? 1 : 0);
        if (A() != Page.ADD_FRIENDS)
        {
            if (!r)
            {
                break MISSING_BLOCK_LABEL_340;
            }
            i1 = ((flag1) ? 1 : 0);
        }
_L1:
        stickylistheaderslistview = x;
        if (i1 != 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        stickylistheaderslistview.setVisibility(i1);
        return;
        i1 = 0;
          goto _L1
    }

    protected void G()
    {
        if (r)
        {
            n();
            return;
        } else
        {
            o();
            return;
        }
    }

    protected final void H()
    {
        if ((Br)h.get() == null)
        {
            return;
        } else
        {
            G();
            A.notifyDataSetChanged();
            F();
            return;
        }
    }

    protected void I()
    {
        r = true;
        B.setVisibility(8);
        D.setVisibility(4);
        C.setVisibility(0);
        A.b = c;
        m();
        H();
        A.getFilter().filter("");
        C.requestFocus();
    }

    protected final void J()
    {
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (friend.mDirection == com.snapchat.android.model.Friend.Direction.OUTGOING)
            {
                friend.mSuggestionState = com.snapchat.android.model.Friend.SuggestState.NOT_SUGGESTION;
            }
        } while (true);
    }

    public final void K()
    {
        s();
    }

    protected final void L()
    {
        Object obj = getArguments();
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i1;
        obj = ((Bundle) (obj)).getString("ADD_FRIENDS_FRAGMENT_SELECTED_FRIEND_USERNAME");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i1 = 0;
_L5:
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (!TextUtils.equals(((Friend)e.get(i1)).g(), ((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        Timber.c("AddFriendsFragment", (new StringBuilder("restorePreviousSelectionStatus() selected_friend_username: ")).append(((String) (obj))).append(" selectedFriendIndex: ").append(i1).toString(), new Object[0]);
        if (i1 >= 0)
        {
            A.a(i1);
            x.post(new Runnable(i1) {

                private int a;
                private AddFriendsFragment b;

                public final void run()
                {
                    b.x.setSelection(a);
                }

            
            {
                b = AddFriendsFragment.this;
                a = i1;
                super();
            }
            });
        }
_L2:
        return;
_L4:
        i1++;
          goto _L5
        i1 = -1;
          goto _L3
    }

    public abstract int a();

    protected final void a(CharSequence charsequence)
    {
        boolean flag = false;
        A.getFilter().filter(charsequence);
        int i1;
        if (!TextUtils.isEmpty(charsequence))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        charsequence = N;
        if (i1 != 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 4;
        }
        charsequence.setVisibility(i1);
    }

    public void afterTextChanged(Editable editable)
    {
        F = F + 1;
    }

    protected final void b(boolean flag)
    {
        if (M())
        {
            O.add(Integer.valueOf(c(flag)));
            x();
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }

    protected int c(boolean flag)
    {
        return g.a(getActivity(), flag, false);
    }

    public abstract com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext c();

    protected void e()
    {
        super.e();
        if (r)
        {
            q();
        }
        Jo.a(getActivity(), C);
    }

    public boolean f()
    {
        s();
        if (r)
        {
            q();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean h()
    {
        return r;
    }

    protected abstract yI l();

    protected abstract void m();

    protected abstract void n();

    protected abstract void o();

    public void onClick(View view)
    {
        if (view == m)
        {
            b(false);
            view = k;
            ik ik1 = new ik();
            ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(ik1);
        }
    }

    public void onContactsOnSnapchatUpdatedEvent(Mt mt)
    {
        H();
        m();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ll.e();
        bundle = getActivity();
        mFragmentLayout = layoutinflater.inflate(0x7f040002, viewgroup, false);
        o = d(0x7f0d0029);
        layoutinflater = getArguments();
        if (layoutinflater != null && layoutinflater.getBoolean("hide_action_bar"))
        {
            o.setVisibility(8);
        }
        B = (TextView)d(0x7f0d003b);
        n = mFragmentLayout.findViewById(0x7f0d01e5);
        n.setId(Jo.e(n));
        s = d(0x7f0d01de);
        t = d(0x7f0d01e1);
        u = (TextView)d(0x7f0d01e2);
        G = d(0x7f0d01e3);
        v = (TextView)d(0x7f0d01e0);
        H = d(0x7f0d01e4);
        y = (TextView)d(0x7f0d0049);
        I = (TextView)d(0x7f0d01db);
        J = (TextView)d(0x7f0d0046);
        K = (TextView)d(0x7f0d0045);
        L = (TextView)d(0x7f0d0048);
        M = (TextView)d(0x7f0d0047);
        LA.a();
        int i1 = LA.o();
        if (ReleaseManager.f() && i1 != 0)
        {
            if (i1 == 1)
            {
                layoutinflater = com.snapchat.android.util.ExperimentUtils.PhoneVerificationExperiment.REQUIRED;
            } else
            {
                layoutinflater = com.snapchat.android.util.ExperimentUtils.PhoneVerificationExperiment.NOT_REQUIRED;
            }
        } else
        if (ExperimentUtils.c() == 0)
        {
            layoutinflater = com.snapchat.android.util.ExperimentUtils.PhoneVerificationExperiment.REQUIRED;
        } else
        {
            layoutinflater = com.snapchat.android.util.ExperimentUtils.PhoneVerificationExperiment.NOT_REQUIRED;
        }
        E = layoutinflater;
        if (E == com.snapchat.android.util.ExperimentUtils.PhoneVerificationExperiment.NOT_REQUIRED)
        {
            layoutinflater = Page.CONTACTS_ACCESS;
        } else
        {
            layoutinflater = Page.PHONE_VERIFICATION;
        }
        a = layoutinflater;
        v();
        bundle.getAssets();
        z = (Button)d(0x7f0d01dc);
        Iq.a(z);
        z.setBackgroundResource(u());
        A = new wN(bundle, e, b, this, new wW(false), t(), Pp.a(), a());
        x = (StickyListHeadersListView)d(0x7f0d0070);
        x.setFastScrollEnabled(false);
        w();
        g.a(1002, P);
        b(true);
        m();
        H();
        ll.f();
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        g.b(1002, P);
        O.clear();
    }

    public void onRefreshFriendExistsTask(NI ni)
    {
        A.notifyDataSetChanged();
    }

    public void onRefreshOnFriendActionEvent(NH nh)
    {
        nh = nh.mAction;
        if (nh == FriendAction.ADD || nh == FriendAction.DELETE)
        {
            A.notifyDataSetChanged();
            return;
        } else
        {
            H();
            return;
        }
    }

    public void onResume()
    {
        ll.e();
        super.onResume();
        g.a(1002, P);
        b(true);
        ll.f();
    }

    public void onStart()
    {
        super.onStart();
        A.registerDataSetObserver(Q);
    }

    public void onStop()
    {
        super.onStop();
        A.unregisterDataSetObserver(Q);
    }

    public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
        if (r)
        {
            a(charsequence);
        }
    }

    public void onUserLoadedEvent(OH oh)
    {
        H();
    }

    protected void onVisible()
    {
        ll.e();
        super.onVisible();
        H();
        ll.f();
    }

    protected abstract int p();

    public boolean p_()
    {
        return true;
    }

    protected void q()
    {
        r = false;
        B.setVisibility(0);
        View view = D;
        int i1;
        if (D())
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        view.setVisibility(i1);
        C.setText("");
        F = 0;
        C.setVisibility(4);
        N.setVisibility(4);
        A.getFilter().filter(null);
        A.b = b;
        A.l = false;
        m();
        J();
        H();
        Jo.a(getActivity(), C);
    }

    protected abstract void s();

    protected abstract FriendListProperty t();

    protected int u()
    {
        return 0x7f020144;
    }

    protected void v()
    {
        p = d(0x7f0d003a);
        q = d(0x7f0d0039);
        q.setOnClickListener(new android.view.View.OnClickListener() {

            private AddFriendsFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), a.C);
                a.getActivity().onBackPressed();
                AddFriendsFragment.b(a);
                a.A.l = false;
            }

            
            {
                a = AddFriendsFragment.this;
                super();
            }
        });
        l = d(0x7f0d0042);
        m = d(0x7f0d0043);
        m.setOnClickListener(this);
    }

    protected void w()
    {
        C = (EditText)d(0x7f0d003c);
        C.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private AddFriendsFragment a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    Jo.h(a.getActivity());
                    AddFriendsFragment.b(a);
                    a.A.l = false;
                }
            }

            
            {
                a = AddFriendsFragment.this;
                super();
            }
        });
        N = d(0x7f0d003d);
        D = d(0x7f0d003f);
        C.addTextChangedListener(this);
        N.setOnClickListener(new android.view.View.OnClickListener() {

            private AddFriendsFragment a;

            public final void onClick(View view)
            {
                com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext analyticscontext;
                int i1;
                view = a.k;
                analyticscontext = a.c();
                i1 = a.C.getText().length();
                com.snapchat.android.analytics.ProfileEventAnalytics._cls1.$SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[analyticscontext.ordinal()];
                JVM INSTR tableswitch 5 9: default 76
            //                           5 133
            //                           6 76
            //                           7 217
            //                           8 161
            //                           9 189;
                   goto _L1 _L2 _L1 _L3 _L4 _L5
_L1:
                Timber.e("ProfileEventAnalytics", (new StringBuilder("onProfileSearchClear  - Unknown context ")).append(analyticscontext).toString(), new Object[0]);
_L7:
                a.C.setText("");
                AddFriendsFragment.b(a);
                a.A.l = false;
                return;
_L2:
                iW iw = new iW();
                iw.charCount = Long.valueOf(i1);
                ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(iw);
                continue; /* Loop/switch isn't completed */
_L4:
                il il1 = new il();
                il1.charCount = Long.valueOf(i1);
                ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(il1);
                continue; /* Loop/switch isn't completed */
_L5:
                iD id = new iD();
                id.charCount = Long.valueOf(i1);
                ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(id);
                continue; /* Loop/switch isn't completed */
_L3:
                iL il2 = new iL();
                il2.charCount = Long.valueOf(i1);
                ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(il2);
                if (true) goto _L7; else goto _L6
_L6:
            }

            
            {
                a = AddFriendsFragment.this;
                super();
            }
        });
        D.setOnClickListener(new android.view.View.OnClickListener() {

            private AddFriendsFragment a;

            public final void onClick(View view)
            {
label0:
                {
                    if (Br.a() != null)
                    {
                        if (!a.r)
                        {
                            break label0;
                        }
                        a.q();
                    }
                    return;
                }
                view = new Bundle();
                view.putBoolean("contextIsAdressBook", true);
                Mf.a().a(new Oi(LeftSwipeContentFragment.ADDRESS_BOOK_SEARCH_VIEW_FRAGMENT, view));
                (new EasyMetric("ADD_FRIENDS_FRAGMENT_SEARCH")).e();
            }

            
            {
                a = AddFriendsFragment.this;
                super();
            }
        });
    }

    protected void x()
    {
        if (A() == Page.ADD_FRIENDS && M() && !r)
        {
            if (O.isEmpty())
            {
                l.setVisibility(8);
                m.setVisibility(0);
                return;
            } else
            {
                l.setVisibility(0);
                m.setVisibility(8);
                return;
            }
        } else
        {
            l.setVisibility(8);
            m.setVisibility(8);
            return;
        }
    }

    protected boolean z()
    {
        return Bt.f() || E == com.snapchat.android.util.ExperimentUtils.PhoneVerificationExperiment.NOT_REQUIRED;
    }
}
