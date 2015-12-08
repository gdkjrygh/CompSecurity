// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import AN;
import Ab;
import Bf;
import Bj;
import Bk;
import Br;
import Bt;
import CF;
import CG;
import Cf;
import EF;
import EH;
import Eo;
import Er;
import Es;
import Ew;
import FZ;
import Gy;
import IC;
import IG;
import IP;
import Ii;
import Iq;
import Jc;
import Je;
import Jf;
import Jh;
import Jm;
import LI;
import LQ;
import Ll;
import MS;
import MV;
import Mf;
import Mh;
import Ml;
import NE;
import NG;
import NH;
import NI;
import NL;
import NM;
import NO;
import NQ;
import NT;
import NU;
import Nh;
import Ni;
import No;
import Ns;
import OD;
import OH;
import OS;
import Og;
import Oi;
import Ok;
import Ol;
import Om;
import On;
import Op;
import Or;
import Ow;
import Oz;
import PI;
import Zu;
import afA;
import afz;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import bF;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.NetworkAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.discover.ui.OpenChannelAnimationView;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.StoryCollection;
import com.snapchat.android.model.StoryGroup;
import com.snapchat.android.model.StorySnapLogbook;
import com.snapchat.android.stories.ui.StorySnapViewGroup;
import com.snapchat.android.stories.ui.animation.DismissAnimationView;
import com.snapchat.android.ui.BackButton;
import com.snapchat.android.ui.ptr.SnapchatPtrFrameLayout;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.ScrollState;
import com.snapchat.android.util.StoriesPageStateManager;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import dv;
import in.srain.cube.views.ptr.PtrFrameLayout;
import jV;
import jW;
import jX;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import ll;
import lm;
import lp;
import mL;
import mR;
import sI;
import sX;
import um;
import uo;
import vJ;
import vr;
import vs;
import vt;
import wo;
import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;
import yP;
import yR;
import yT;
import yU;
import yW;
import yY;
import yZ;
import ze;
import zh;
import zi;
import zk;
import zo;
import zq;
import zr;
import zs;
import zt;
import zv;
import zx;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesScrollBar

public class StoriesFragment extends SnapchatFragment
    implements vJ.a, zk.a, zr.a
{
    final class a extends bF
        implements android.support.v7.widget.RecyclerView.e.a
    {

        private StoriesFragment n;

        private void h()
        {
            if (StoriesFragment.a(n))
            {
                StoriesFragment.b(n).setVisibility(8);
            }
        }

        public final void a()
        {
            if (StoriesFragment.a(n) && !n.h)
            {
                StoriesFragment.b(n).a();
                StoriesFragment.b(n).setVisibility(0);
            }
        }

        public final void f()
        {
            if (!a(this))
            {
                a();
            }
        }

        public final void g()
        {
            if (!a(this))
            {
                a();
            }
        }

        public final void h(android.support.v7.widget.RecyclerView.v v1)
        {
            super.h(v1);
            h();
        }

        public final void i(android.support.v7.widget.RecyclerView.v v1)
        {
            super.i(v1);
            h();
        }

        private a()
        {
            n = StoriesFragment.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private final FeatureFlagManager A;
    private RecyclerView B;
    private final Bt C;
    private final StoriesPageStateManager D;
    private SnapchatPtrFrameLayout E;
    private VerticalRecyclerViewFastScroller F;
    private StoriesScrollBar G;
    private final sI H;
    private final Bf I;
    private final Ab J;
    private boolean K;
    private final CameraEventAnalytics L;
    private final Ew M;
    private final NetworkAnalytics N;
    private final lm O;
    private final lp P;
    private final FriendManager Q;
    private final LQ R;
    private zs S;
    private final Bus T;
    private OS U;
    private String V;
    private View W;
    private BackButton X;
    private ImageView Y;
    private PI Z;
    protected Bj a;
    private View aa;
    private PI ab;
    private DismissAnimationView ac;
    private StorySnapViewGroup ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private final zo ah;
    private ShowDialogEvent ai;
    Jm b;
    public uo c;
    protected zk d;
    protected LinearLayoutManager e;
    protected final ArrayList f;
    protected boolean g;
    protected boolean h;
    protected PI i;
    protected PI j;
    private final HashMap k;
    private final HashSet l;
    private final Provider m;
    private final sX n;
    private final Er o;
    private zx p;
    private zi q;
    private List r;
    private List s;
    private final List t;
    private final List u;
    private final wo v;
    private final vJ w;
    private vs x;
    private int y;
    private InputMethodManager z;

    public StoriesFragment()
    {
        sI si = new sI();
        NetworkAnalytics networkanalytics = NetworkAnalytics.a();
        lm lm1 = lm.a();
        Bf bf = Bf.a();
        Bj bj = Bj.a();
        Bus bus = Mf.a();
        Ab ab1 = Ab.a();
        CameraEventAnalytics cameraeventanalytics = CameraEventAnalytics.a();
        Provider provider = Br.UNSAFE_USER_PROVIDER;
        Je.a();
        this(si, networkanalytics, lm1, bf, bj, bus, ab1, cameraeventanalytics, provider, sX.a(), Ew.a(), wo.a(), vJ.a(), lp.a(), FriendManager.e(), new ArrayList(), Jm.a(), FeatureFlagManager.a(), Er.a(), Bt.a(), StoriesPageStateManager.a(), LQ.b());
    }

    private StoriesFragment(sI si, NetworkAnalytics networkanalytics, lm lm1, Bf bf, Bj bj, Bus bus, Ab ab1, 
            CameraEventAnalytics cameraeventanalytics, Provider provider, sX sx, Ew ew, wo wo1, vJ vj, lp lp1, 
            FriendManager friendmanager, ArrayList arraylist, Jm jm, FeatureFlagManager featureflagmanager, Er er, Bt bt, StoriesPageStateManager storiespagestatemanager, 
            LQ lq)
    {
        k = new HashMap();
        l = new HashSet();
        new ArrayList();
        r = new ArrayList();
        s = new ArrayList();
        t = new ArrayList();
        u = new ArrayList();
        y = 2;
        g = false;
        K = false;
        ae = false;
        af = false;
        ag = false;
        SnapchatApplication.getDIComponent().a(this);
        H = si;
        N = networkanalytics;
        O = lm1;
        I = bf;
        a = bj;
        T = bus;
        J = ab1;
        L = cameraeventanalytics;
        m = provider;
        n = sx;
        M = ew;
        v = wo1;
        w = vj;
        P = lp1;
        Q = friendmanager;
        f = arraylist;
        b = jm;
        A = featureflagmanager;
        ah = new yR();
        o = er;
        C = bt;
        D = storiespagestatemanager;
        R = lq;
    }

    private void A()
    {
        int i1 = r.size();
        Iterator iterator = r.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            zi zi1 = (zi)iterator.next();
            if (zi1.a.d() == 0)
            {
                f.remove(zi1);
                iterator.remove();
            }
        } while (true);
        q = null;
        if (r.size() != i1)
        {
            m();
        }
    }

    private void B()
    {
        if (p == null)
        {
            return;
        } else
        {
            p.D();
            return;
        }
    }

    private void C()
    {
        N();
        W.setVisibility(4);
        X.setTextVisible(false);
        i.a(0);
        ((EditText)i.a()).requestFocus();
        z.showSoftInput(i.a(), 0);
        h = true;
    }

    private void D()
    {
        s.clear();
        ArrayList arraylist = Q.i();
        for (int i1 = 0; i1 < arraylist.size(); i1++)
        {
            Friend friend = (Friend)arraylist.get(i1);
            s.add(new yW(friend));
        }

    }

    private void E()
    {
        for (int i1 = 0; i1 < t.size(); i1++)
        {
            ((EF)t.get(i1)).k();
        }

    }

    private void F()
    {
        r.clear();
        List list = a.r();
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            StoryCollection storycollection = (StoryCollection)list.get(i1);
            r.add(new zi(storycollection));
        }

    }

    private void G()
    {
        H();
        m();
    }

    private void H()
    {
        k.clear();
        for (Iterator iterator = (new LinkedHashMap(a.mStories)).entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (StoryGroup)((java.util.Map.Entry) (obj)).getValue();
            if (obj instanceof AN)
            {
                k.put(s1, new zh());
            } else
            {
                k.put(s1, new zt(((StoryGroup) (obj))));
            }
        }

    }

    private void I()
    {
        z();
        J();
        w();
    }

    private void J()
    {
        int j1 = 0;
        Object obj = u();
        ArrayList arraylist;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            arraylist = f;
        } else
        if ((Br)m.get() == null)
        {
            arraylist = f;
        } else
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            arraylist = f;
        } else
        {
            arraylist = new ArrayList();
            Object obj1 = new ArrayList(f);
            int i1 = 0;
            boolean flag;
            boolean flag1;
            for (flag = false; j1 < ((List) (obj1)).size(); flag = flag1)
            {
                zo zo1 = (zo)((List) (obj1)).get(j1);
                ArrayList arraylist1 = new ArrayList();
                arraylist1.add(zo1.i());
                String s1 = zo1.a();
                if (s1 != null)
                {
                    arraylist1.add(s1);
                }
                int k1 = i1;
                flag1 = flag;
                if (b(arraylist1, ((String) (obj))))
                {
                    arraylist.add(zo1);
                    if (zo1.b())
                    {
                        i1 = arraylist.size();
                    }
                    k1 = i1;
                    flag1 = flag;
                    if (IP.c(zo1.i(), ((String) (obj))))
                    {
                        flag1 = true;
                        k1 = i1;
                    }
                }
                j1++;
                i1 = k1;
            }

            obj1 = e(((String) (obj)));
            if (!flag && !a(((List) (obj1)), ((String) (obj))))
            {
                obj = new yP(((String) (obj)));
                if (i1 == arraylist.size())
                {
                    arraylist.add(obj);
                } else
                {
                    arraylist.add(i1, obj);
                }
            }
            arraylist.addAll(((Collection) (obj1)));
        }
        if (v())
        {
            arraylist.add(ah);
        }
        obj = d;
        ((zk) (obj)).c.clear();
        ((zk) (obj)).c.addAll(arraylist);
    }

    private void K()
    {
        StoryCollection storycollection = a.c(q.i());
        if (storycollection == null)
        {
            q = null;
            return;
        }
        int j1 = 0;
        boolean flag1 = false;
        int k1 = 0;
        while (j1 < r.size()) 
        {
            Object obj = ((zi)r.get(j1)).i();
            boolean flag = flag1;
            if (!flag1)
            {
                flag = flag1;
                if (TextUtils.equals(((CharSequence) (obj)), q.i()))
                {
                    flag = true;
                }
            }
            obj = a.c(((String) (obj)));
            int i1 = k1;
            if (obj != null)
            {
                if (storycollection.o() == ((StoryCollection) (obj)).o())
                {
                    i1 = k1;
                    if (((StoryCollection) (obj)).m() > storycollection.m())
                    {
                        i1 = j1 + 1;
                    }
                } else
                {
                    i1 = k1;
                    if (storycollection.o().ordinal() > ((StoryCollection) (obj)).o().ordinal())
                    {
                        i1 = j1 + 1;
                    }
                }
            }
            j1++;
            flag1 = flag;
            k1 = i1;
        }
        if (!flag1)
        {
            if (k1 == r.size())
            {
                r.add(q);
                return;
            } else
            {
                r.add(k1, q);
                return;
            }
        } else
        {
            q = null;
            return;
        }
    }

    private void L()
    {
        if (ag)
        {
            M();
        }
        W.setVisibility(0);
        X.setTextVisible(true);
        if (i.b())
        {
            ((EditText)i.a()).setText("");
            ((EditText)i.a()).clearFocus();
            z.hideSoftInputFromWindow(getView().getWindowToken(), 0);
            i.a(4);
        }
        h = false;
        m();
        w();
        Iterator iterator = Q.mOutgoingFriendsListMap.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (friend.mSuggestionState == com.snapchat.android.model.Friend.SuggestState.EXISTS)
            {
                friend.mSuggestionState = com.snapchat.android.model.Friend.SuggestState.NOT_SUGGESTION;
            }
        } while (true);
    }

    private void M()
    {
        G.a();
        G.setVisibility(0);
        B.b(G.d);
        B.a(G.d);
    }

    private void N()
    {
        G.setVisibility(8);
        B.b(G.d);
    }

    private void O()
    {
        if (B != null)
        {
            B.a(0);
        }
        for (int i1 = 0; i1 < t.size(); i1++)
        {
            EF ef = (EF)t.get(i1);
            if (ef.e != null)
            {
                ef.e.a(0);
            }
        }

    }

    private List P()
    {
        ArrayList arraylist = new ArrayList();
        if (B == null)
        {
            return arraylist;
        }
        for (int i1 = 0; i1 < B.getChildCount(); i1++)
        {
            arraylist.add((yY)B.a(B.getChildAt(i1)));
        }

        return arraylist;
    }

    private boolean Q()
    {
        int i1;
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.STORIES_SCROLL_BAR))
        {
            return false;
        }
        i1 = t.size() - 1;
_L3:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (((EF)t.get(i1)).w_()) goto _L2; else goto _L1
_L1:
        i1 = f.indexOf(t.get(i1));
_L4:
        return e.m() > i1;
_L2:
        i1--;
          goto _L3
        i1 = -1;
          goto _L4
    }

    static ValueAnimator a(StoriesFragment storiesfragment, VerticalRecyclerViewFastScroller verticalrecyclerviewfastscroller, int i1, int j1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)verticalrecyclerviewfastscroller.getLayoutParams();
        ValueAnimator valueanimator = (ValueAnimator)dv.a(ValueAnimator.ofInt(new int[] {
            i1, j1
        }));
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(layoutparams, verticalrecyclerviewfastscroller) {

            private android.widget.RelativeLayout.LayoutParams a;
            private VerticalRecyclerViewFastScroller b;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.rightMargin = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                b.setLayoutParams(a);
            }

            
            {
                a = layoutparams;
                b = verticalrecyclerviewfastscroller;
                super();
            }
        });
        valueanimator.addListener(storiesfragment. new AnimatorListenerAdapter() {

            private StoriesFragment a;

            public final void onAnimationStart(Animator animator)
            {
                animator = a;
                boolean flag;
                if (!a.g)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                animator.g = flag;
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        valueanimator.setDuration(200L);
        return valueanimator;
    }

    private void a(Ow ow)
    {
        java.util.UUID uuid;
        boolean flag2;
        boolean flag1 = ow.mWasSuccessful;
        boolean flag;
        if (ow.mSyncAllResult != null && ow.mSyncAllResult.mStoriesUpdated)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = ow.mCalledOnLoginOrOnResume;
        uuid = ow.mUUID;
        if (E != null && E.a())
        {
            E.c();
            N.a(uuid);
        }
        aa.setVisibility(8);
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (ow.mPendingShowDialogEvent != null)
        {
            if (super.mIsVisible)
            {
                T.a(ow.mPendingShowDialogEvent);
            } else
            {
                ai = ow.mPendingShowDialogEvent;
            }
        }
        if (flag) goto _L4; else goto _L3
_L3:
        return;
_L4:
        H();
        E();
        F();
        D();
        if (q != null)
        {
            K();
        }
        m();
        if (flag2 && getUserVisibleHint())
        {
            N.a(com.snapchat.android.analytics.NetworkAnalytics.PageContext.STORY, uuid);
            if (r.isEmpty() || ((zi)r.get(0)).a.l())
            {
                N.b(com.snapchat.android.analytics.NetworkAnalytics.PageContext.STORY, uuid);
            }
        }
        n.e();
        ow = a.h().iterator();
        do
        {
            if (!ow.hasNext())
            {
                break;
            }
            StorySnapLogbook storysnaplogbook = (StorySnapLogbook)ow.next();
            if (!storysnaplogbook.mStorySnap.O() && !storysnaplogbook.mStorySnap.U())
            {
                n.a(storysnaplogbook.mStorySnap);
            }
        } while (true);
        if (getUserVisibleHint())
        {
            a.p();
            T.a(new NG());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (((LandingPageActivity)getActivity()).h())
        {
            AlertDialogUtils.a(0x7f0800e7, getActivity());
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void a(zt zt1)
    {
        if (zt1 == null)
        {
            return;
        } else
        {
            l.remove(zt1.a.c());
            int i1 = zt1.a.m();
            int j1 = f.indexOf(zt1);
            f.subList(j1 + 1, j1 + 1 + i1).clear();
            I();
            ((android.support.v7.widget.RecyclerView.a) (d)).a.c(j1 + 1, i1);
            return;
        }
    }

    static boolean a(StoriesFragment storiesfragment)
    {
        return storiesfragment.ag;
    }

    private static boolean a(List list, String s1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (IP.c(((zo)list.next()).i(), s1))
            {
                return true;
            }
        }

        return false;
    }

    static StoriesScrollBar b(StoriesFragment storiesfragment)
    {
        return storiesfragment.G;
    }

    private static List b(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            arraylist.add(new zv((StorySnapLogbook)list.get(i1)));
        }

        return arraylist;
    }

    private static boolean b(List list, String s1)
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < list.size())
                {
                    String s2 = (String)list.get(i1);
                    if (s2 == null || !IP.b(s2, s1))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    static List c(StoriesFragment storiesfragment)
    {
        return storiesfragment.u;
    }

    private void c(boolean flag)
    {
        if (flag)
        {
            f.addAll(s);
        } else
        if (s.size() <= 12)
        {
            Iterator iterator = s.iterator();
            while (iterator.hasNext()) 
            {
                yW yw = (yW)iterator.next();
                StoryCollection storycollection = a.c(yw.i());
                if (storycollection != null && storycollection.d() != storycollection.c())
                {
                    f.add(yw);
                }
            }
        } else
        {
            f.addAll(s);
            return;
        }
    }

    static PI d(StoriesFragment storiesfragment)
    {
        return storiesfragment.Z;
    }

    static FeatureFlagManager e(StoriesFragment storiesfragment)
    {
        return storiesfragment.A;
    }

    private List e(String s1)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = u.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (friend.b(s1) && !Q.l(friend.g()))
            {
                arraylist.add(new yU(friend));
            }
        } while (true);
        return arraylist;
    }

    private void e(int i1)
    {
        ab.a(i1);
        j.a(i1);
    }

    static void f(StoriesFragment storiesfragment)
    {
        storiesfragment.L();
    }

    static OS g(StoriesFragment storiesfragment)
    {
        return storiesfragment.U;
    }

    protected static int h()
    {
        return 0x7f020144;
    }

    static void h(StoriesFragment storiesfragment)
    {
        storiesfragment.C();
    }

    static Bus i(StoriesFragment storiesfragment)
    {
        return storiesfragment.T;
    }

    static zs j(StoriesFragment storiesfragment)
    {
        return storiesfragment.S;
    }

    static StoriesPageStateManager k(StoriesFragment storiesfragment)
    {
        return storiesfragment.D;
    }

    static VerticalRecyclerViewFastScroller l(StoriesFragment storiesfragment)
    {
        return storiesfragment.F;
    }

    static InputMethodManager m(StoriesFragment storiesfragment)
    {
        return storiesfragment.z;
    }

    static NetworkAnalytics n(StoriesFragment storiesfragment)
    {
        return storiesfragment.N;
    }

    static Bt o(StoriesFragment storiesfragment)
    {
        return storiesfragment.C;
    }

    static void p(StoriesFragment storiesfragment)
    {
        storiesfragment = (Br)storiesfragment.m.get();
        if (storiesfragment != null)
        {
            (new mL()).execute();
            if (!storiesfragment.b().isEmpty())
            {
                (new mR()).a();
            }
        }
    }

    static String q(StoriesFragment storiesfragment)
    {
        storiesfragment.V = null;
        return null;
    }

    static vs r(StoriesFragment storiesfragment)
    {
        return storiesfragment.x;
    }

    static void s(StoriesFragment storiesfragment)
    {
        storiesfragment.I();
    }

    static RecyclerView t(StoriesFragment storiesfragment)
    {
        return storiesfragment.B;
    }

    private String u()
    {
        if (!i.b())
        {
            return "";
        } else
        {
            return ((EditText)i.a()).getText().toString();
        }
    }

    private boolean v()
    {
        Br br = (Br)m.get();
        return br != null && br.l() && FriendManager.w();
    }

    private void w()
    {
        if (d == null)
        {
            return;
        }
        if (f.size() != 0 || d.b() != 0 || h || !ae)
        {
            e(8);
            return;
        } else
        {
            e(0);
            return;
        }
    }

    private void x()
    {
        D();
        E();
        F();
        H();
        m();
        N.a(com.snapchat.android.analytics.NetworkAnalytics.PageContext.STORY);
    }

    private void z()
    {
        if ((Br)m.get() != null && super.isAdded())
        {
            boolean flag = a();
            f.clear();
            if (!flag)
            {
                ArrayList arraylist = f;
                ArrayList arraylist1 = new ArrayList();
                Iterator iterator = k.values().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Object obj3 = (zt)iterator.next();
                    StoryGroup storygroup = ((zt) (obj3)).a;
                    if (storygroup.m() > 0)
                    {
                        ArrayList arraylist3 = new ArrayList();
                        arraylist3.add(obj3);
                        obj3 = ((zt) (obj3)).a;
                        if (l.contains(((StoryGroup) (obj3)).c()))
                        {
                            arraylist3.addAll(b(((StoryGroup) (obj3)).a(true)));
                        }
                        if (storygroup instanceof AN)
                        {
                            arraylist1.addAll(0, arraylist3);
                        } else
                        {
                            arraylist1.addAll(arraylist3);
                        }
                    }
                } while (true);
                arraylist.addAll(arraylist1);
            }
            if (!flag)
            {
                for (int i1 = 0; i1 < t.size(); i1++)
                {
                    EF ef = (EF)t.get(i1);
                    if (!ef.w_())
                    {
                        f.add(ef);
                    }
                }

            }
            if (!flag)
            {
                f.addAll(r);
            }
            c(flag);
            if (flag)
            {
                Object obj = a.a(true);
                ((List) (obj)).addAll(a.a(false));
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Object obj1 = (StoryCollection)((Iterator) (obj)).next();
                    obj1 = Q.a(((StoryCollection) (obj1)).mUsername);
                    if (obj1 != null)
                    {
                        f.add(new ze(((Friend) (obj1))));
                    }
                } while (true);
            }
            if (flag)
            {
                HashSet hashset = new HashSet(Q.i());
                Object obj2 = new HashSet(Q.mOutgoingFriendsListMap.b());
                ArrayList arraylist2 = new ArrayList();
                Iterator iterator1 = Q.m().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    Friend friend1 = (Friend)iterator1.next();
                    if (!friend1.mIsBlocked && !TextUtils.equals(Bt.q(), friend1.g()) && !hashset.contains(friend1) && !((Set) (obj2)).contains(friend1))
                    {
                        friend1.mSuggestionState = com.snapchat.android.model.Friend.SuggestState.EXISTS;
                        friend1.mSuggestType = com.snapchat.android.model.Friend.SuggestType.ADDRESS_BOOK;
                        Timber.e("StoriesFragment", (new StringBuilder("##### contactOnSnapchat ")).append(friend1).toString(), new Object[0]);
                        arraylist2.add(new yT(friend1));
                    }
                } while (true);
                Collections.sort(arraylist2);
                f.addAll(arraylist2);
                arraylist2 = new ArrayList();
                obj2 = ((Set) (obj2)).iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    Friend friend = (Friend)((Iterator) (obj2)).next();
                    if (!friend.mIsBlocked && !TextUtils.equals(Bt.q(), friend.g()) && !hashset.contains(friend) && !friend.mIsSharedStory)
                    {
                        arraylist2.add(new yZ(friend));
                    }
                } while (true);
                Collections.sort(arraylist2);
                f.addAll(arraylist2);
                return;
            }
        }
    }

    public final String a(int i1)
    {
        i1 = Math.min(r.size() - 1, Math.max(0, i1));
        long l1 = ((zi)r.get(i1)).a.m();
        return Ii.a(getActivity(), l1, true);
    }

    public final void a(StorySnapLogbook storysnaplogbook)
    {
        storysnaplogbook = storysnaplogbook.mStorySnap.mClientId;
        I.a(storysnaplogbook, H);
        G();
    }

    public final void a(List list)
    {
        if (x == null)
        {
            return;
        }
        int i1 = y;
        if (mFragmentLayout != null)
        {
            mFragmentLayout.post(new Runnable(list, i1) {

                private List a;
                private int b;
                private StoriesFragment c;

                public final void run()
                {
                    int j1 = c.f.indexOf(StoriesFragment.r(c));
                    vs vs1 = StoriesFragment.r(c);
                    List list1 = a;
                    int k1 = b;
                    list1 = vs1.a.a(list1, k1);
                    vs1.b.clear();
                    vs1.b.addAll(list1);
                    vs1.c.a(list1);
                    vs1.v_();
                    StoriesFragment.s(c);
                    k1 = c.f.indexOf(StoriesFragment.r(c));
                    if (j1 < 0 && k1 >= 0)
                    {
                        c.d.d(k1);
                        if (k1 == 0 && StoriesFragment.t(c).computeVerticalScrollOffset() == 0)
                        {
                            StoriesFragment.t(c).a(0);
                        }
                    } else
                    if (j1 >= 0 && k1 < 0)
                    {
                        c.d.e(j1);
                        return;
                    }
                }

            
            {
                c = StoriesFragment.this;
                a = list;
                b = i1;
                super();
            }
            });
        }
        y = 0;
    }

    public final boolean a()
    {
        return h && !TextUtils.isEmpty(u());
    }

    public final boolean a(String s1)
    {
        return l.contains(s1);
    }

    public final void a_(boolean flag)
    {
        if (flag)
        {
            Object obj = new LinkedHashSet();
            for (Iterator iterator = s.iterator(); iterator.hasNext(); ((Set) (obj)).add(((yW)iterator.next()).i())) { }
            for (Iterator iterator1 = r.iterator(); iterator1.hasNext(); ((Set) (obj)).add(((zi)iterator1.next()).i())) { }
            String s1 = Jh.a(((Collection) (obj)), "~");
            long l1 = ((Set) (obj)).size();
            if (l1 == 0L)
            {
                obj = M;
                jV jv = new jV();
                ((Ew) (obj)).a.a(jv);
            }
            obj = new jW();
            obj.posterId = s1;
            obj.storyCellCount = Long.valueOf(l1);
            for (int i1 = 0; i1 < t.size(); i1++)
            {
                ((EF)t.get(i1)).a(((jW) (obj)));
            }

            M.a.a(((kl) (obj)));
        }
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BEHIND;
    }

    public final String b(int i1)
    {
        i1 = Math.min(s.size() - 1, Math.max(0, i1));
        String s1 = ((yW)s.get(i1)).e();
        if (TextUtils.isEmpty(s1))
        {
            return "";
        } else
        {
            i1 = s1.codePointAt(0);
            return (new StringBuilder()).appendCodePoint(i1).toString().toUpperCase(Locale.getDefault());
        }
    }

    public final void b(String s1)
    {
        if (s1.equals(V))
        {
            L.a(com.snapchat.android.analytics.CameraEventAnalytics.CameraContext.DOUBLE_TAP);
            T.a(new NL(s1, 3, true));
        } else
        {
            V = s1;
        }
        (new Handler()).postDelayed(new Runnable() {

            private StoriesFragment a;

            public final void run()
            {
                StoriesFragment.q(a);
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        }, 450L);
    }

    public final void b(boolean flag)
    {
        SnapchatPtrFrameLayout snapchatptrframelayout = E;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        snapchatptrframelayout.setEnabled(flag);
    }

    public final void c()
    {
        af = true;
    }

    public final boolean c(int i1)
    {
        if (i1 >= f.size())
        {
            Timber.c("StoriesFragment", "shouldContributeToScrollBar: position requested %d less than stories list size %d. Should not happen, returning false.", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(f.size())
            });
            return false;
        } else
        {
            return ((zo)f.get(i1)).y_();
        }
    }

    protected final void e()
    {
        super.e();
        if (af)
        {
            return;
        }
        AnalyticsEvents.d();
        O.mFirstMediaOpenedMetric = null;
        O.c("exit_page", "story");
        String s1;
        for (Iterator iterator = (new ArrayList(l)).iterator(); iterator.hasNext(); a((zt)k.get(s1)))
        {
            s1 = (String)iterator.next();
        }

        l.clear();
        if (!v.e())
        {
            O();
        }
        if (h)
        {
            L();
        }
        for (int i1 = 0; i1 < t.size(); i1++)
        {
            ((EF)t.get(i1)).e();
        }

        A();
        LI.a();
        a.q();
        ((android.support.v7.widget.RecyclerView.a) (d)).a.b();
        (new mR()).execute();
    }

    public final void f(boolean flag)
    {
        T.a(new Mh(CameraDisplayState.SHOW));
    }

    public final boolean f()
    {
        StorySnapViewGroup storysnapviewgroup = ad;
        boolean flag;
        if (storysnapviewgroup.getVisibility() == 0)
        {
            storysnapviewgroup.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.BACK_PRESSED);
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return true;
        }
        if (h)
        {
            L();
            return true;
        } else
        {
            return v.b();
        }
    }

    protected final Cf g()
    {
        return new Cf(new String[] {
            "STORIES"
        });
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

    protected final void m()
    {
        z();
        J();
        ((android.support.v7.widget.RecyclerView.a) (d)).a.b();
        w();
    }

    public final int n()
    {
        return s.size();
    }

    public final int o()
    {
        return r.size();
    }

    protected final boolean o_()
    {
        return super.isAdded();
    }

    public void onAttach(Activity activity)
    {
        ll.e();
        super.onAttach(activity);
        U = (OS)activity;
        ll.f();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!v.d)
        {
            v.d();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i1 = 0;
        ll.e();
        mFragmentLayout = layoutinflater.inflate(0x7f0400e8, viewgroup, false);
        B = (RecyclerView)d(0x7f0d04c7);
        B.setItemAnimator(new a((byte)0));
        layoutinflater = B;
        viewgroup = new android.support.v7.widget.RecyclerView.j() {

            private StoriesFragment a;

            public final void a()
            {
                if (StoriesFragment.a(a) && !a.h)
                {
                    StoriesFragment.b(a).a();
                }
            }

            public final void b()
            {
                if (StoriesFragment.a(a) && !a.h)
                {
                    StoriesFragment.b(a).a();
                }
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        };
        if (((RecyclerView) (layoutinflater)).g == null)
        {
            layoutinflater.g = new ArrayList();
        }
        ((RecyclerView) (layoutinflater)).g.add(viewgroup);
        F = (VerticalRecyclerViewFastScroller)mFragmentLayout.findViewById(0x7f0d04c8);
        G = (StoriesScrollBar)mFragmentLayout.findViewById(0x7f0d04c9);
        Y = (ImageView)mFragmentLayout.findViewById(0x7f0d04c3);
        z = (InputMethodManager)getActivity().getSystemService("input_method");
        t.clear();
        layoutinflater = t;
        x = new vs(getActivity(), v, (OpenChannelAnimationView)d(0x7f0d0050));
        viewgroup = new ArrayList();
        viewgroup.add(x);
        viewgroup.add(new EH(getActivity(), n));
        layoutinflater.addAll(viewgroup);
        W = d(0x7f0d04c4);
        X = (BackButton)d(0x7f0d04c1);
        i = new PI(mFragmentLayout, 0x7f0d04c2, 0x7f0d050c, new PI.a() {

            final StoriesFragment a;

            public final void a(View view)
            {
                ((EditText)a.i.a()).addTextChangedListener(new TextWatcher(this) {

                    private _cls14 a;

                    public final void afterTextChanged(Editable editable)
                    {
                    }

                    public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                    {
                    }

                    public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                    {
                        if (TextUtils.isEmpty(charsequence))
                        {
                            StoriesFragment.d(a.a).a(4);
                        } else
                        {
                            StoriesFragment.d(a.a).a(0);
                        }
                        StoriesFragment.e(a.a);
                        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.OFFICIAL_STORIES_SEARCH) && charsequence.length() >= 3)
                        {
                            StoriesFragment storiesfragment = a.a;
                            storiesfragment.b.a(charsequence.toString(), storiesfragment. new Jm.a(charsequence) {

                                private CharSequence a;
                                private StoriesFragment b;

                                public final void a(String s1, List list)
                                {
                                    if (TextUtils.equals(a, s1))
                                    {
                                        StoriesFragment.c(b).clear();
                                        StoriesFragment.c(b).addAll(list);
                                        if (b.a())
                                        {
                                            b.m();
                                        }
                                    }
                                }

            
            {
                b = StoriesFragment.this;
                a = charsequence;
                super();
            }
                            });
                        } else
                        {
                            StoriesFragment.c(a.a).clear();
                        }
                        a.a.m();
                    }

            
            {
                a = _pcls14;
                super();
            }
                });
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        Z = new PI(mFragmentLayout, 0x7f0d04c2, 0x7f0d003d, new PI.a() {

            final StoriesFragment a;

            public final void a(View view)
            {
                StoriesFragment.d(a).a().setOnClickListener(new android.view.View.OnClickListener(this) {

                    private _cls15 a;

                    public final void onClick(View view)
                    {
                        ((EditText)a.a.i.a()).setText("");
                    }

            
            {
                a = _pcls15;
                super();
            }
                });
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        Y.setOnClickListener(new android.view.View.OnClickListener() {

            private StoriesFragment a;

            public final void onClick(View view)
            {
                if (a.h)
                {
                    StoriesFragment.f(a);
                }
                StoriesFragment.g(a).a(4, true);
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        W.setOnClickListener(new android.view.View.OnClickListener() {

            private StoriesFragment a;

            public final void onClick(View view)
            {
                StoriesFragment.h(a);
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        d(0x7f0d04c1).setOnClickListener(new android.view.View.OnClickListener() {

            private StoriesFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        aa = d(0x7f0d04cc);
        ac = (DismissAnimationView)d(0x7f0d04cd);
        ab = new PI(mFragmentLayout, 0x7f0d04ca, 0x7f0d0508);
        j = new PI(mFragmentLayout, 0x7f0d04cb, 0x7f0d0507, new PI.a() {

            final StoriesFragment a;

            public final void a(View view)
            {
                view = a.j.a();
                a.getActivity().getAssets();
                Iq.a(view);
                ((Button)a.j.a()).setBackgroundResource(StoriesFragment.h());
                ((Button)a.j.a()).setOnClickListener(new android.view.View.OnClickListener(this) {

                    private _cls19 a;

                    public final void onClick(View view)
                    {
                        StoriesFragment.i(a.a).a(new Oi(LeftSwipeContentFragment.ADD_FRIENDS_MENU_FRAGMENT));
                    }

            
            {
                a = _pcls19;
                super();
            }
                });
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        if (m.get() == null)
        {
            aa.setVisibility(0);
        } else
        {
            aa.setVisibility(8);
        }
        d = new zk(getActivity(), f, this);
        x();
        getActivity();
        e = new LinearLayoutManager();
        B.setLayoutManager(e);
        B.setAdapter(d);
        B.m.m = false;
        B.a(new zq(getResources().getDrawable(0x7f02024f)));
        S = new zs(d);
        B.a(S);
        d.a(new android.support.v7.widget.RecyclerView.c() {

            private StoriesFragment a;

            public final void a()
            {
                StoriesFragment.j(a).a.a();
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        d.a(new android.support.v7.widget.RecyclerView.c() {

            private StoriesFragment a;

            public final void a()
            {
                if (StoriesFragment.a(a) && !a.h)
                {
                    StoriesFragment.b(a).a();
                }
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        F.setRecyclerView(B);
        layoutinflater = new zr(getActivity(), B, S, this);
        G.setStoriesScrollBarController(layoutinflater);
        B.a(F.a());
        B.a(new Gy(R, "Stories"));
        B.a(new android.support.v7.widget.RecyclerView.l() {

            private StoriesFragment a;

            public final void a(RecyclerView recyclerview, int j1)
            {
                ScrollState scrollstate;
                long l1;
                recyclerview = StoriesFragment.k(a);
                scrollstate = ScrollState.fromRecyclerViewState(j1);
                l1 = SystemClock.elapsedRealtime();
                com.snapchat.android.util.StoriesPageStateManager._cls1.$SwitchMap$com$snapchat$android$util$ScrollState[scrollstate.ordinal()];
                JVM INSTR tableswitch 1 3: default 52
            //                           1 62
            //                           2 98
            //                           3 98;
                   goto _L1 _L2 _L3 _L3
_L1:
                recyclerview.mLastScrollState = scrollstate;
                if (j1 == 0);
                return;
_L2:
                if (((StoriesPageStateManager) (recyclerview)).mLastScrollPeriod.a())
                {
                    ((StoriesPageStateManager) (recyclerview)).mLastScrollPeriod.mEnd = l1;
                } else
                {
                    ((StoriesPageStateManager) (recyclerview)).mLastScrollPeriod.a(l1, l1);
                }
                continue; /* Loop/switch isn't completed */
_L3:
                if (((StoriesPageStateManager) (recyclerview)).mLastScrollState == ScrollState.IDLE || ((StoriesPageStateManager) (recyclerview)).mLastScrollState == ScrollState.UNKNOWN)
                {
                    ((StoriesPageStateManager) (recyclerview)).mLastScrollPeriod.a(l1, 0x7fffffffffffffffL);
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            public final void a(RecyclerView recyclerview, int j1, int k1)
            {
                recyclerview = (android.widget.RelativeLayout.LayoutParams)StoriesFragment.l(a).getLayoutParams();
                if (a.s())
                {
                    StoriesFragment.a(a, StoriesFragment.l(a), ((android.widget.RelativeLayout.LayoutParams) (recyclerview)).rightMargin, 0).start();
                } else
                if (a.t())
                {
                    StoriesFragment.a(a, StoriesFragment.l(a), ((android.widget.RelativeLayout.LayoutParams) (recyclerview)).rightMargin, -((android.widget.RelativeLayout.LayoutParams) (recyclerview)).width).start();
                    return;
                }
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        registerForContextMenu(B);
        B.setOnTouchListener(new android.view.View.OnTouchListener() {

            private StoriesFragment a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                if (a.h)
                {
                    StoriesFragment.m(a).hideSoftInputFromWindow(a.getView().getWindowToken(), 0);
                }
                return false;
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        E = (SnapchatPtrFrameLayout)d(0x7f0d04c5);
        E.setPtrHandler(new afz() {

            private StoriesFragment a;

            public final void a(PtrFrameLayout ptrframelayout)
            {
                StoriesFragment.n(a).b(com.snapchat.android.analytics.NetworkAnalytics.PageContext.STORY);
                a.a.q();
                ((android.support.v7.widget.RecyclerView.a) (a.d)).a.b();
                StoriesFragment.o(a);
                Bt.y(null);
                StoriesFragment.p(a);
            }

            public final boolean a()
            {
                return a.e.n() == 0;
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        E.a(new afA() {

            private StoriesFragment a;

            public final void a(PtrFrameLayout ptrframelayout)
            {
            }

            public final void a(PtrFrameLayout ptrframelayout, boolean flag, byte byte0, int j1, int k1, float f1, float f2)
            {
                com.snapchat.android.util.StoriesPageStateManager.PtrStatus ptrstatus;
                long l1;
                ptrframelayout = StoriesFragment.k(a);
                l1 = SystemClock.elapsedRealtime();
                ptrstatus = com.snapchat.android.util.StoriesPageStateManager.PtrStatus.fromValue(byte0);
                com.snapchat.android.util.StoriesPageStateManager._cls1.$SwitchMap$com$snapchat$android$util$StoriesPageStateManager$PtrStatus[ptrstatus.ordinal()];
                JVM INSTR tableswitch 1 1: default 48
            //                           1 77;
                   goto _L1 _L2
_L1:
                if (((StoriesPageStateManager) (ptrframelayout)).mLastPtrStatus == com.snapchat.android.util.StoriesPageStateManager.PtrStatus.INIT)
                {
                    ((StoriesPageStateManager) (ptrframelayout)).mLastPtrPeriod.a(l1, 0x7fffffffffffffffL);
                }
_L4:
                ptrframelayout.mLastPtrStatus = ptrstatus;
                return;
_L2:
                if (((StoriesPageStateManager) (ptrframelayout)).mLastPtrPeriod.a())
                {
                    ((StoriesPageStateManager) (ptrframelayout)).mLastPtrPeriod.mEnd = l1;
                } else
                {
                    ((StoriesPageStateManager) (ptrframelayout)).mLastPtrPeriod.a(l1, l1);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            public final void b(PtrFrameLayout ptrframelayout)
            {
            }

            public final void c(PtrFrameLayout ptrframelayout)
            {
            }

            public final void d(PtrFrameLayout ptrframelayout)
            {
            }

            
            {
                a = StoriesFragment.this;
                super();
            }
        });
        w.a(this);
        w.b();
        n.d.clear();
        n.a(new Eo(r, n));
        for (; i1 < t.size(); i1++)
        {
            n.a((Es)t.get(i1));
        }

        n.e();
        ll.f();
        ad = (StorySnapViewGroup)d(0x7f0d04ce);
        layoutinflater = o;
        viewgroup = getActivity();
        bundle = ad;
        SnapchatPtrFrameLayout snapchatptrframelayout = E;
        layoutinflater.a = viewgroup;
        layoutinflater.b = bundle;
        layoutinflater.c = snapchatptrframelayout;
        return mFragmentLayout;
    }

    public void onDestroy()
    {
        super.onDestroy();
        w.b(this);
    }

    public void onGetLocationDataTaskCompletedEvent(MS ms)
    {
        a(new Ow(null, true, false, new Br.a(false, false, true, false)));
    }

    public void onHideSnapStoryEvent(MV mv)
    {
        B();
        ((android.support.v7.widget.RecyclerView.a) (d)).a.b();
        if (super.mIsVisible && !o.b.g)
        {
            a(com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BEHIND);
            T.a(new Og(true));
            T.a(new NT(true));
            E.setEnabled(true);
        }
    }

    public void onLoadStoryMediaChangedEvent(Nh nh)
    {
        nh = nh.mUsername;
        List list = P();
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            ((yY)list.get(i1)).b(nh);
        }

    }

    public void onLoadStoryMediaCompleteEvent(Ni ni)
    {
        ni = r;
        if (!ni.isEmpty() && ((zi)ni.get(0)).a.l())
        {
            N.b(com.snapchat.android.analytics.NetworkAnalytics.PageContext.STORY, null);
        }
    }

    public void onPause()
    {
        super.onPause();
        if (B != null)
        {
            B.setAdapter(null);
        }
        if (af)
        {
            getActivity().onBackPressed();
        }
        q = null;
        for (int i1 = 0; i1 < t.size(); i1++)
        {
            ((EF)t.get(i1)).g();
        }

        y = 2;
        if (!v.e())
        {
            vs vs1 = x;
            vs1.a.a();
            List list = vs1.a.a(vs1.b, 2);
            vs1.b.clear();
            vs1.b.addAll(list);
            vs1.c.a(list);
        }
        Er er = o;
        if (er.d != null)
        {
            er.d.dismiss();
        }
        er.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.ENTER_BACKGROUND);
        ai = null;
    }

    public void onPostStorySnapRequestCompleteEvent(Ns ns)
    {
        G();
    }

    public void onRecentStoryCollectionCompletedViewingEvent(NE ne)
    {
        Bk bk;
        Iterator iterator;
        bk = ne.mStorySnap;
        if (bk.mIsShared)
        {
            return;
        }
        iterator = r.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        StoryCollection storycollection;
        ne = (zi)iterator.next();
        storycollection = ((zi) (ne)).a;
        if (storycollection.d() != 0 || !TextUtils.equals(storycollection.mUsername, bk.mUsername)) goto _L4; else goto _L3
_L3:
        q = ne;
        ((android.support.v7.widget.RecyclerView.a) (d)).a.b();
        n.e();
        return;
_L2:
        ne = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onRefreshFriendExistsTask(NI ni)
    {
        ((android.support.v7.widget.RecyclerView.a) (d)).a.b();
    }

    public void onRefreshOnFriendActionEvent(NH nh)
    {
        nh = nh.mAction;
        if (nh == FriendAction.BLOCK || nh == FriendAction.DELETE)
        {
            x();
        }
    }

    public void onResetStoriesFragmentScrollEvent(NM nm)
    {
        O();
    }

    public void onResume()
    {
        ll.e();
        super.onResume();
        if (B != null)
        {
            B.setAdapter(d);
        }
        K = false;
        for (int i1 = 0; i1 < t.size(); i1++)
        {
            ((EF)t.get(i1)).h();
        }

        if ((Br)m.get() != null)
        {
            u.clear();
            x();
        }
        O();
        Intent intent = getActivity().getIntent();
        String s1 = uo.a(intent);
        if (s1 != null)
        {
            if (intent != null)
            {
                intent.setData(null);
            }
            C();
            ((EditText)i.a()).setText(s1);
            if (!Q.c(s1))
            {
                (new um(getActivity(), s1)).show();
            }
        }
        ll.f();
    }

    public void onSanitizeStoriesFragmentEvent(NO no)
    {
        F();
        D();
        if (q != null)
        {
            K();
        }
        m();
    }

    public void onSharedStoryButtonClickedEvent(NU nu)
    {
        StoryGroup storygroup = nu.storyGroup;
        String s1 = storygroup.e();
        Object obj;
        if (storygroup.g())
        {
            nu = storygroup.h();
        } else
        {
            nu = null;
        }
        obj = nu;
        if (TextUtils.isEmpty(nu))
        {
            obj = IC.a(null, 0x7f0801c1, new Object[] {
                storygroup.e()
            });
        }
        nu = new FZ(getActivity(), ((String) (obj))) {

            protected final void a()
            {
            }

        };
        nu.setTitle(s1);
        nu.show();
    }

    public void onStartStorySnapPlaybackEvent(Ok ok)
    {
        B();
        A();
    }

    public void onStoriesNotifyDatasetChangedEvent(Ol ol)
    {
        ((android.support.v7.widget.RecyclerView.a) (d)).a.b();
    }

    public void onStoryCellSelectedEvent(Om om)
    {
        om = om.mInterface;
        if (p != om)
        {
            B();
        }
        p = om;
    }

    public void onStoryDismissAnimationEvent(On on)
    {
        ac.a.start();
    }

    public void onStorySnapDeletedEvent(No no)
    {
        G();
    }

    public void onStorySnapPostEvent(Op op)
    {
        G();
    }

    public void onStoryThumbnailLoadedEvent(Or or)
    {
        or = or.mStoriesThumbnailCacheItem;
        for (Iterator iterator = P().iterator(); iterator.hasNext() && !((yY)iterator.next()).a(((Jf) (or)).mCacheKey);) { }
    }

    public void onSyncAllCompletedEvent(Ow ow)
    {
        a(ow);
    }

    public void onTapToViewStoryCanceledEvent(Oz oz)
    {
        B();
    }

    public void onToggleStoryEvent(OD od)
    {
        od = od.mStoryGroupStoriesListItem;
        if (l.contains(((zt) (od)).a.c()))
        {
            a(od);
            return;
        } else
        {
            StoryGroup storygroup = ((zt) (od)).a;
            l.add(storygroup.c());
            int i1 = storygroup.m();
            I();
            int j1 = f.indexOf(od);
            ((android.support.v7.widget.RecyclerView.a) (d)).a.b(j1 + 1, i1);
            return;
        }
    }

    public void onUserLoadedEvent(OH oh)
    {
        x();
        ((android.support.v7.widget.RecyclerView.a) (d)).a.b();
        aa.setVisibility(8);
        ae = true;
    }

    protected void onVisible()
    {
        if (!FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.STORIES_SCROLL_BAR)) goto _L2; else goto _L1
_L1:
        if (s.size() > 12) goto _L4; else goto _L3
_L3:
        Iterator iterator = s.iterator();
_L7:
        if (!iterator.hasNext()) goto _L4; else goto _L5
_L5:
        yW yw = (yW)iterator.next();
        if (f.contains(yw)) goto _L7; else goto _L6
_L6:
        Timber.c("StoriesFragment", "The stories list does not contain the all story item %s. Stories Scroll bar disabled.", new Object[] {
            yw
        });
_L2:
        boolean flag = false;
_L9:
        ag = flag;
        float f1;
        int j1;
        if (ag)
        {
            M();
        } else
        {
            N();
        }
        ll.e();
        O.b("move_to_page", "story");
        super.onVisible();
        AnalyticsEvents.c();
        if (!K)
        {
            J.b();
            K = true;
        }
        T.a(new Ml());
        a.p();
        T.a(new NG());
        T.a(new NQ());
        getActivity().setVolumeControlStream(3);
        for (int i1 = 0; i1 < t.size(); i1++)
        {
            ((EF)t.get(i1)).f();
        }

        break MISSING_BLOCK_LABEL_297;
_L4:
        f1 = getResources().getDimension(0x7f0a0132);
        j1 = (int)Math.ceil((float)B.getHeight() / f1);
        if (s.size() < j1) goto _L2; else goto _L8
_L8:
        flag = true;
          goto _L9
        if (LI.b())
        {
            LI.a(getActivity());
        }
        af = false;
        P.a("stories");
        if (ai != null)
        {
            T.a(ai);
            ai = null;
        }
        ll.f();
        return;
    }

    public final int p()
    {
        return f.size();
    }

    public final boolean q()
    {
        return !E.b();
    }

    protected final boolean s()
    {
        return Q() && !g;
    }

    protected final boolean t()
    {
        return !Q() && g;
    }
}
