// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import AO;
import AS;
import AT;
import AY;
import BO;
import Bk;
import Bm;
import Bt;
import By;
import CE;
import CF;
import CG;
import Cf;
import DP;
import Ei;
import FD;
import Fe;
import Fg;
import GB;
import Gw;
import Gz;
import Hb;
import Hc;
import IE;
import IX;
import Ic;
import Jo;
import Ks;
import Kt;
import Ku;
import Ll;
import MA;
import MG;
import Mb;
import Md;
import Mf;
import Mg;
import Mh;
import Mj;
import Mk;
import Mm;
import Mp;
import Mq;
import My;
import NF;
import NG;
import NQ;
import NR;
import NT;
import NY;
import Na;
import Nv;
import OC;
import OK;
import Ob;
import Ou;
import Ov;
import PG;
import PI;
import TD;
import Vv;
import Vw;
import Vx;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.HereAnalytics;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.billing.InAppBillingManager;
import com.snapchat.android.controller.countdown.SnapCountdownController;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.database.table.NotificationTable;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.model.chat.ChatMedia;
import com.snapchat.android.stories.ui.animation.DismissAnimationView;
import com.snapchat.android.ui.CashReceiverView;
import com.snapchat.android.ui.CashSwiperView;
import com.snapchat.android.ui.ChatCameraButton;
import com.snapchat.android.ui.ChatLayout;
import com.snapchat.android.ui.ClipCircleViewGroup;
import com.snapchat.android.ui.CursorCallbackEditText;
import com.snapchat.android.ui.InAppPromptFlipper;
import com.snapchat.android.ui.SpyRelativeLayout;
import com.snapchat.android.ui.TextureVideoView;
import com.snapchat.android.ui.cash.CashTooltip;
import com.snapchat.android.ui.chat.ChatAboveTheFoldV2RecyclerView;
import com.snapchat.android.ui.chat.ChatMediaWrapperLayout;
import com.snapchat.android.ui.here.HereTooltip;
import com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener;
import com.snapchat.android.ui.snapview.MultiLeveledSnapView;
import com.snapchat.android.ui.snapview.SnapViewSessionStopReason;
import com.snapchat.android.util.CashUtils;
import com.snapchat.android.util.SnapchatViewPager;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.snapchat.android.util.eventbus.ChangePreviewQualityEvent;
import com.snapchat.android.util.eventbus.InChatSnapEvent;
import com.snapchat.android.util.eventbus.LoadSnapMediaEvent;
import com.snapchat.android.util.eventbus.QuickSnapEvent;
import com.snapchat.android.util.eventbus.SnapMessageFeedRefreshedEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.snapchat.videochat.view.HoldToStreamView;
import com.snapchat.videochat.view.StreamView;
import com.squareup.otto.Bus;
import dA;
import eg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kB;
import lX;
import ld;
import ll;
import lm;
import lp;
import lq;
import mB;
import ng;
import org.apache.commons.lang3.StringUtils;
import oy;
import pM;
import pi;
import qD;
import qq;
import sD;
import sJ;
import sf;
import si;
import sl;
import so;
import sq;
import su;
import sw;
import sy;
import vN;
import xH;
import xI;
import xK;
import xN;
import xe;
import xh;
import xj;
import xo;
import xu;
import yc;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            MessageViewHolder

public class ChatFragment extends SnapchatFragment
    implements GB.a, Gz, Vw, MessageViewHolder.a, com.snapchat.android.ui.CashSwiperView.b, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.a, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.c, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.d, sJ, so.a, sq.a, su.a, xe.a, xo.a
{
    final class a extends android.support.v7.widget.RecyclerView.l
    {

        private ChatFragment a;

        public final void a(RecyclerView recyclerview, int i1)
        {
            if (i1 == 0)
            {
                ChatFragment.S(a).a(0.0F);
            }
        }

        private a()
        {
            a = ChatFragment.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b extends android.support.v7.widget.RecyclerView.l
    {

        private ChatFragment a;

        public final void a(RecyclerView recyclerview, int i1)
        {
            if (!ChatFragment.Q(a).d() && ChatFragment.n(a) != null && ChatFragment.x(a).m() < ChatFragment.E())
            {
                if (ChatFragment.n(a).mIterToken != null)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    ChatFragment.R(a).a(ChatFragment.n(a).mId, true);
                }
            }
        }

        private b()
        {
            a = ChatFragment.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
        implements FD.a
    {

        private ChatFragment a;

        public final void a(LinearLayoutManager linearlayoutmanager, View view, int i1)
        {
            while (i1 < linearlayoutmanager.m() || i1 > linearlayoutmanager.o() || !(view.getTag() instanceof xH)) 
            {
                return;
            }
            ChatFragment.a(a, ChatFragment.S(a), i1);
        }

        private c()
        {
            a = ChatFragment.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d extends android.support.v7.widget.RecyclerView.l
    {

        private ChatFragment a;

        public final void a(RecyclerView recyclerview, int i1)
        {
            ChatFragment.a(a, recyclerview);
        }

        private d()
        {
            a = ChatFragment.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    public static PendingIntent a;
    private static boolean aw;
    public static String b;
    public static String c;
    private static final Set l;
    private static int m = 20;
    private ChatLayout A;
    private View B;
    private View C;
    private View D;
    private TextView E;
    private TextView F;
    private CursorCallbackEditText G;
    private int H;
    private int I;
    private ChatCameraButton J;
    private ChatAboveTheFoldV2RecyclerView K;
    private FD L;
    private boolean M;
    private boolean N;
    private xe O;
    private boolean P;
    private com.snapchat.android.ui.CashSwiperView.SwipeActivationMethod Q;
    private ChatConversation R;
    private boolean S;
    private boolean T;
    private long U;
    private PI V;
    private PI W;
    private boolean X;
    private boolean Y;
    private PI Z;
    private CashFeedItem aA;
    private boolean aB;
    private xj aC;
    private Jo aD;
    private SharedPreferences aE;
    private InAppBillingManager aF;
    private boolean aG;
    private final xI aH;
    private PI aI;
    private boolean aJ;
    private xo aK;
    private View aL;
    private xu aM;
    private boolean aN;
    private final mB aO;
    private final FriendManager aP;
    private boolean aQ;
    private boolean aa;
    private Handler ab;
    private sw ac;
    private By ad;
    private sy ae;
    private Handler af;
    private so ag;
    private ViewStub ah;
    private FrameLayout ai;
    private kB aj;
    private PI ak;
    private View al;
    private View am;
    private int an;
    private IX ao;
    private Gw ap;
    private Ku aq;
    private int ar;
    private final HashMap as;
    private final HashMap at;
    private HereAnalytics au;
    private boolean av;
    private HereTooltip ax;
    private CashTooltip ay;
    private boolean az;
    public boolean d;
    protected su e;
    protected Friend f;
    protected PI g;
    public sf h;
    public sl i;
    public si j;
    public boolean k;
    private final sD n;
    private final Ei o;
    private final lq p;
    private final oy q;
    private final CG r;
    private final vN s;
    private final sq t;
    private final Bus u;
    private final SnapCountdownController v;
    private final lm w;
    private final lp x;
    private final AS y;
    private MultiLeveledSnapView z;

    public ChatFragment()
    {
        By by = By.c();
        sD sd = sD.a();
        xj xj1 = new xj();
        sw sw1 = sw.a();
        Ei ei = Ei.a();
        sq sq1 = sq.b();
        lq lq1 = lq.a();
        oy oy1 = oy.a();
        CG cg = CG.a();
        SnapchatApplication.get();
        sy sy1 = new sy();
        vN vn = new vN();
        Bus bus = Mf.a();
        SnapCountdownController snapcountdowncontroller = SnapCountdownController.a();
        lm lm1 = lm.a();
        lp lp1 = lp.a();
        new lX();
        this(by, sd, xj1, sw1, ei, sq1, lq1, oy1, cg, sy1, vn, bus, snapcountdowncontroller, lm1, lp1, IX.a(), mB.a(), FriendManager.e(), AS.a(), kB.a());
    }

    private ChatFragment(By by, sD sd, xj xj1, sw sw1, Ei ei, sq sq1, lq lq1, 
            oy oy1, CG cg, sy sy1, vN vn, Bus bus, SnapCountdownController snapcountdowncontroller, lm lm1, 
            lp lp1, IX ix, mB mb, FriendManager friendmanager, AS as1, kB kb)
    {
        M = false;
        N = false;
        T = false;
        U = -1L;
        X = true;
        Y = false;
        d = false;
        an = 0;
        aq = new Ku();
        as = new HashMap();
        at = new HashMap();
        au = new HereAnalytics();
        aB = false;
        aG = false;
        aH = new xI();
        aJ = true;
        SnapchatApplication.getDIComponent().a(this);
        ad = by;
        n = sd;
        aC = xj1;
        ac = sw1;
        o = ei;
        t = sq1;
        p = lq1;
        q = oy1;
        r = cg;
        ae = sy1;
        s = vn;
        v = snapcountdowncontroller;
        aC.a(s);
        u = bus;
        w = lm1;
        x = lp1;
        ao = ix;
        aO = mb;
        aP = friendmanager;
        y = as1;
        aj = kb;
    }

    static void A(ChatFragment chatfragment)
    {
        chatfragment.P();
    }

    static int B(ChatFragment chatfragment)
    {
        return chatfragment.an;
    }

    static void C(ChatFragment chatfragment)
    {
        if (chatfragment.R != null)
        {
            chatfragment.X = true;
            chatfragment.u();
            chatfragment.av = true;
            String s1 = "";
            if (!chatfragment.K())
            {
                s1 = chatfragment.M();
            }
            CameraEventAnalytics.a().a(com.snapchat.android.analytics.CameraEventAnalytics.CameraContext.SNAP_BUTTON);
            Mf.a().a(new Ou(s1, chatfragment.R.mIsRecipientPresent));
            Mf.a().a(new InChatSnapEvent(chatfragment.R.mTheirUsername, s1));
            Mf.a().a(new NT(false));
        }
    }

    static void D(ChatFragment chatfragment)
    {
        if (chatfragment.R != null)
        {
            chatfragment.X = true;
            chatfragment.u();
            chatfragment.av = true;
            String s1 = "";
            if (!chatfragment.K())
            {
                s1 = chatfragment.M();
            }
            Mf.a().a(new Ov(s1));
            Mf.a().a(new QuickSnapEvent(chatfragment.R.mTheirUsername, s1));
        }
    }

    static boolean D()
    {
        aw = false;
        return false;
    }

    static int E()
    {
        return m;
    }

    static HashMap E(ChatFragment chatfragment)
    {
        return chatfragment.at;
    }

    static Set F()
    {
        return l;
    }

    static boolean F(ChatFragment chatfragment)
    {
        chatfragment.X = true;
        return true;
    }

    private int G()
    {
        return getResources().getDimensionPixelSize(0x7f0a0059);
    }

    static boolean G(ChatFragment chatfragment)
    {
        chatfragment.P = false;
        return false;
    }

    private void H()
    {
        int i1 = 0;
        if (f != null)
        {
            Object obj1 = f.g();
            Object obj = M();
            if (obj == null || ((String) (obj)).isEmpty())
            {
                as.remove(obj1);
            } else
            {
                as.put(obj1, obj);
            }
            if (!K())
            {
                at.remove(obj1);
                return;
            }
            obj = (List)at.get(obj1);
            ImageSpan aimagespan[];
            int j1;
            if (obj == null)
            {
                obj = new ArrayList();
                at.put(obj1, obj);
            } else
            {
                ((List) (obj)).clear();
            }
            obj1 = G.getEditableText();
            aimagespan = (ImageSpan[])((Editable) (obj1)).getSpans(0, ((Editable) (obj1)).length(), android/text/style/ImageSpan);
            j1 = aimagespan.length;
            while (i1 < j1) 
            {
                ((List) (obj)).add(Integer.valueOf(((Editable) (obj1)).getSpanStart(aimagespan[i1])));
                i1++;
            }
        }
    }

    static boolean H(ChatFragment chatfragment)
    {
        return chatfragment.aa;
    }

    private void I()
    {
        if (f == null)
        {
            return;
        } else
        {
            DP.a().a(f.g());
            return;
        }
    }

    static boolean I(ChatFragment chatfragment)
    {
        chatfragment.aa = true;
        return true;
    }

    static PI J(ChatFragment chatfragment)
    {
        return chatfragment.Z;
    }

    private void J()
    {
        if (U > 0L)
        {
            AnalyticsEvents.a(SystemClock.elapsedRealtime() - U);
            U = -1L;
        }
    }

    static Handler K(ChatFragment chatfragment)
    {
        return chatfragment.ab;
    }

    private boolean K()
    {
        return sf.a(G.getEditableText()) > 0;
    }

    private void L()
    {
        if (!(g.a() instanceof HoldToStreamView) && Ic.b())
        {
            g = new PI(mFragmentLayout, 0x7f0d013e, 0x7f0d0158, new PI.a() {

                private ChatFragment a;

                public final void a(View view)
                {
                    ChatFragment.o(a).setTouchSubscriber((Vv)a.g.a());
                }

            
            {
                a = ChatFragment.this;
                super();
            }
            });
        }
        ((StreamView)g.a()).setDeferDisconnectTimeoutMs((int)(Bm.a().a("ADL_DEF_DISCONNECT", "TIMEOUT_SEC", 5F) * 1000F));
        ((StreamView)g.a()).a(getActivity(), this, au);
    }

    static void L(ChatFragment chatfragment)
    {
        chatfragment.S = false;
        chatfragment.aa = false;
        ((CashReceiverView)chatfragment.Z.a()).animate().alpha(0.0F).setDuration(500L).setListener(chatfragment. new android.animation.Animator.AnimatorListener() {

            private ChatFragment a;

            public final void onAnimationCancel(Animator animator)
            {
                ChatFragment.N(a);
            }

            public final void onAnimationEnd(Animator animator)
            {
                if (!ChatFragment.M(a))
                {
                    ((CashReceiverView)ChatFragment.J(a).a()).a();
                }
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
    }

    private String M()
    {
        Editable editable = G.getText();
        if (editable == null)
        {
            return null;
        } else
        {
            return editable.toString();
        }
    }

    static boolean M(ChatFragment chatfragment)
    {
        return chatfragment.S;
    }

    private void N()
    {
        if ((d || Y) && !P && G.requestFocus())
        {
            if (!d)
            {
                Jo.h(getActivity());
            }
            l(true);
        }
        Y = false;
        d = false;
    }

    static boolean N(ChatFragment chatfragment)
    {
        chatfragment.S = true;
        return true;
    }

    static sw O(ChatFragment chatfragment)
    {
        return chatfragment.ac;
    }

    private void O()
    {
        aw = true;
        X = false;
        u.a(new NT(false));
    }

    static sD P(ChatFragment chatfragment)
    {
        return chatfragment.n;
    }

    private void P()
    {
        aw = false;
        X = true;
        u.a(new NT(true));
    }

    static xe Q(ChatFragment chatfragment)
    {
        return chatfragment.O;
    }

    private void Q()
    {
        if (mIsVisible && R.mPendingRainBills > 0)
        {
            ChatConversation chatconversation;
            if (!aG)
            {
                a(R.mPendingRainBills, R.mPendingRainTransactionTimestamp);
            } else
            {
                aG = false;
            }
            chatconversation = R;
            chatconversation.mPendingRainBills = 0;
            chatconversation.mPendingRainTransactionTimestamp = 0L;
        }
    }

    static oy R(ChatFragment chatfragment)
    {
        return chatfragment.q;
    }

    private static boolean R()
    {
        return Bm.a().a("ADDLIVE_PRESENCE", "ENABLED", false);
    }

    static ChatAboveTheFoldV2RecyclerView S(ChatFragment chatfragment)
    {
        return chatfragment.K;
    }

    static int a(ChatFragment chatfragment, int i1)
    {
        chatfragment.H = i1;
        return i1;
    }

    static CashFeedItem a(ChatFragment chatfragment, CashFeedItem cashfeeditem)
    {
        chatfragment.aA = cashfeeditem;
        return cashfeeditem;
    }

    static xo a(ChatFragment chatfragment, xo xo1)
    {
        chatfragment.aK = xo1;
        return xo1;
    }

    private void a(int i1, long l1)
    {
        ((CashReceiverView)Z.a()).post(new Runnable(i1, l1) {

            final ChatFragment a;
            private int b;
            private long c;

            public final void run()
            {
label0:
                {
                    if (!ChatFragment.H(a))
                    {
                        ChatFragment.I(a);
                        long l2 = (long)((1.0F - ((CashReceiverView)ChatFragment.J(a).a()).getAlpha()) * 500F);
                        ((CashReceiverView)ChatFragment.J(a).a()).animate().alpha(1.0F).setListener(null).setDuration(l2);
                    }
                    CashReceiverView cashreceiverview = (CashReceiverView)ChatFragment.J(a).a();
                    int k1 = b;
                    long l3 = c;
                    int j1;
                    if (cashreceiverview.f.containsKey(Long.valueOf(l3)))
                    {
                        j1 = k1 - ((Integer)cashreceiverview.f.get(Long.valueOf(l3))).intValue();
                    } else
                    {
                        j1 = k1;
                    }
                    if (j1 <= 0)
                    {
                        break label0;
                    }
                    cashreceiverview.f.put(Long.valueOf(l3), Integer.valueOf(k1));
                    if (cashreceiverview.e == null || !cashreceiverview.e.isStarted())
                    {
                        cashreceiverview.a(1);
                    }
                    for (k1 = 0; k1 < j1; k1++)
                    {
label1:
                        {
                            float f1;
                            ImageView imageview;
label2:
                            {
                                imageview = new ImageView(cashreceiverview.getContext());
                                imageview.setImageDrawable(cashreceiverview.getResources().getDrawable(0x7f0200a8));
                                imageview.setLayoutParams(new android.view.ViewGroup.LayoutParams((int)Jo.a(72F, cashreceiverview.getContext()), (int)Jo.a(36F, cashreceiverview.getContext())));
                                imageview.setTag("FALLING_DOLLAR_TAG");
                                float f4 = IE.a().nextFloat();
                                float f5 = 0.9F + IE.a().nextFloat() * 0.2F;
                                imageview.setScaleX(f5);
                                imageview.setScaleY(f5);
                                int i2;
                                for (i2 = 0; i2 < cashreceiverview.getChildCount() && f5 > cashreceiverview.getChildAt(i2).getScaleX(); i2++) { }
                                cashreceiverview.addView(imageview, i2);
                                f1 = Jo.a(3.33F - 1.66F * f4, cashreceiverview.getContext());
                                float f2 = Jo.a(0.2F + 0.1F * f4, cashreceiverview.getContext());
                                float f3 = Jo.a(0.0015F + -0.0005F * f4, cashreceiverview.getContext());
                                f4 = Jo.a(133F * f5 + f4 * -66F, cashreceiverview.getContext());
                                f5 = cashreceiverview.getMeasuredWidth();
                                float f6 = IE.a().nextFloat();
                                float f7 = (float)imageview.getLayoutParams().width / 2.0F;
                                float f8 = (float)(6.2831853071795862D * (double)IE.a().nextFloat());
                                float f9 = -imageview.getLayoutParams().height;
                                float f10 = Jo.a(5F, cashreceiverview.getContext());
                                ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                                    0.0F, 1.0F
                                });
                                valueanimator.setDuration(5000L);
                                valueanimator.setInterpolator(new LinearInterpolator());
                                valueanimator.addUpdateListener(new com.snapchat.android.ui.CashReceiverView._cls3(imageview, f3, f8, f4, f5 * (0.4F + 0.2F * f6) - f7, f9 - f10, f2, f1));
                                valueanimator.addListener(new com.snapchat.android.ui.CashReceiverView._cls4(imageview));
                                valueanimator.start();
                                if (cashreceiverview.a >= 6)
                                {
                                    break label1;
                                }
                                imageview = new ImageView(cashreceiverview.getContext());
                                imageview.setImageResource(0x7f0200a7);
                                i2 = (int)Jo.a(9F, cashreceiverview.getContext());
                                int j2 = (int)Jo.a(18F, cashreceiverview.getContext());
                                f1 = 0.9F + 0.2F * IE.a().nextFloat();
                                imageview.setScaleX(f1);
                                imageview.setScaleY(f1);
                                imageview.setLayoutParams(new android.view.ViewGroup.LayoutParams(i2, j2));
                                imageview.setTag("CAUGHT_DOLLAR_TAG");
                                cashreceiverview.c.addView(imageview);
                                f2 = -2F + 2.0F * IE.a().nextFloat();
                                if (!cashreceiverview.d || cashreceiverview.a % 2 != 0)
                                {
                                    f1 = f2;
                                    if (cashreceiverview.d)
                                    {
                                        break label2;
                                    }
                                    f1 = f2;
                                    if (cashreceiverview.a % 2 == 0)
                                    {
                                        break label2;
                                    }
                                }
                                f1 = f2 + 32F;
                            }
                            imageview.setTranslationX(Jo.a(f1, cashreceiverview.getContext()));
                            imageview.setTranslationY(Jo.a(4F + 2.0F * IE.a().nextFloat(), cashreceiverview.getContext()));
                            imageview.setRotation(-30F + 60F * IE.a().nextFloat());
                        }
                        cashreceiverview.b.add(Long.valueOf(SystemClock.elapsedRealtime()));
                        cashreceiverview.a = cashreceiverview.a + 1;
                    }

                }
                ChatFragment.K(a).removeCallbacksAndMessages(null);
                ChatFragment.K(a).postDelayed(new Runnable(this) {

                    private _cls18 a;

                    public final void run()
                    {
                        ChatFragment.L(a.a);
                    }

            
            {
                a = _pcls18;
                super();
            }
                }, 3000L);
            }

            
            {
                a = ChatFragment.this;
                b = i1;
                c = l1;
                super();
            }
        });
    }

    private void a(RecyclerView recyclerview)
    {
        if (recyclerview.n == 0)
        {
            int i1 = L.m();
            int j1 = L.o();
            while (i1 <= j1) 
            {
                a(recyclerview, i1);
                i1++;
            }
        }
    }

    private void a(RecyclerView recyclerview, int i1)
    {
        if (!az && recyclerview.n == 0)
        {
            recyclerview = recyclerview.a(i1, false);
            if (recyclerview instanceof xH)
            {
                recyclerview = (xH)recyclerview;
                if (((xH) (recyclerview)).C != null)
                {
                    if (!y.b())
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (!Ks.a(((xH) (recyclerview)).C) && ((xH) (recyclerview)).B == null)
                    {
                        com.snapchat.android.ui.SnapchatResource.a a1 = new com.snapchat.android.ui.SnapchatResource.a((ChatMedia)((xH) (recyclerview)).C) {

                            private ChatConversation a;
                            private ChatMedia b;
                            private ChatFragment c;

                            public final void a(com.snapchat.android.ui.SnapchatResource.ResourceStatus resourcestatus)
                            {
                                static final class _cls24
                                {

                                    static final int a[];
                                    static final int b[];

                                    static 
                                    {
                                        b = new int[Vx.a().length];
                                        try
                                        {
                                            b[0] = 1;
                                        }
                                        catch (NoSuchFieldError nosuchfielderror5) { }
                                        try
                                        {
                                            b[1] = 2;
                                        }
                                        catch (NoSuchFieldError nosuchfielderror4) { }
                                        a = new int[com.snapchat.android.ui.SnapchatResource.ResourceStatus.values().length];
                                        try
                                        {
                                            a[com.snapchat.android.ui.SnapchatResource.ResourceStatus.LOADED.ordinal()] = 1;
                                        }
                                        catch (NoSuchFieldError nosuchfielderror3) { }
                                        try
                                        {
                                            a[com.snapchat.android.ui.SnapchatResource.ResourceStatus.NOT_LOADED.ordinal()] = 2;
                                        }
                                        catch (NoSuchFieldError nosuchfielderror2) { }
                                        try
                                        {
                                            a[com.snapchat.android.ui.SnapchatResource.ResourceStatus.LOADING.ordinal()] = 3;
                                        }
                                        catch (NoSuchFieldError nosuchfielderror1) { }
                                        try
                                        {
                                            a[com.snapchat.android.ui.SnapchatResource.ResourceStatus.LOADING_FAILED.ordinal()] = 4;
                                        }
                                        catch (NoSuchFieldError nosuchfielderror)
                                        {
                                            return;
                                        }
                                    }
                                }

                                _cls24.a[resourcestatus.ordinal()];
                                JVM INSTR tableswitch 1 4: default 40
                            //                                           1 41
                            //                                           2 96
                            //                                           3 96
                            //                                           4 96;
                                   goto _L1 _L2 _L3 _L3 _L3
_L1:
                                return;
_L2:
                                if (a != null && b.o() && a.mIsUserInConversation)
                                {
                                    ChatFragment.P(c).a(a, b, false);
                                    b.a(false);
                                    return;
                                }
                                continue; /* Loop/switch isn't completed */
_L3:
                                if (a != null && !b.o() && !b.mHasBeenShown)
                                {
                                    ChatFragment.P(c).a(a, b, true);
                                    b.a(true);
                                    return;
                                }
                                if (true) goto _L1; else goto _L4
_L4:
                            }

            
            {
                c = ChatFragment.this;
                b = chatmedia;
                super();
                a = ChatFragment.n(c);
            }
                        };
                        if (i1 != 0)
                        {
                            a1.a(com.snapchat.android.ui.SnapchatResource.ResourceStatus.NOT_LOADED);
                        }
                        recyclerview.B = a1;
                    }
                    if (i1 == 0 || ((ChatMedia)((xH) (recyclerview)).C).mHasBeenShown)
                    {
                        recyclerview.w();
                        return;
                    }
                }
            }
        }
    }

    static void a(ChatFragment chatfragment, RecyclerView recyclerview)
    {
        chatfragment.a(recyclerview);
    }

    static void a(ChatFragment chatfragment, RecyclerView recyclerview, int i1)
    {
        chatfragment.a(recyclerview, i1);
    }

    static void a(ChatFragment chatfragment, ChatConversation chatconversation, CashFeedItem cashfeeditem, String s1)
    {
        chatfragment.a(chatconversation, cashfeeditem, s1);
    }

    static void a(ChatFragment chatfragment, com.snapchat.android.ui.CashSwiperView.SwipeActivationMethod swipeactivationmethod)
    {
        chatfragment.a(swipeactivationmethod);
    }

    private void a(com.snapchat.android.livechat.AdlHelper.PresenceSource presencesource)
    {
label0:
        {
            boolean flag3 = true;
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag4;
            if (R.mIsRecipientPresent && R.mAmIPresent && presencesource == com.snapchat.android.livechat.AdlHelper.PresenceSource.CHAT_GATEWAY)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag4 = ((StreamView)g.a()).f();
            if (R.mHereAuth != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1)
            {
                flag2 = flag3;
                if (flag)
                {
                    break label0;
                }
            }
            if (flag4)
            {
                flag2 = flag3;
            } else
            {
                flag2 = false;
            }
        }
        if (flag2)
        {
            L();
            ((StreamView)g.a()).a(R.mHereAuth, R.mId, R.mMessagingAuthToken);
            ((StreamView)g.a()).setCanStreamVideo(flag2, "REMOTE_PEER_LEFT");
        }
        if (presencesource != com.snapchat.android.livechat.AdlHelper.PresenceSource.ADDLIVE || !Ic.b() || !R.mRecipientSupportsHere || !R()) goto _L2; else goto _L1
_L1:
        flag1 = flag4;
_L3:
        a(flag1, flag2);
_L4:
        return;
_L2:
        if (presencesource != com.snapchat.android.livechat.AdlHelper.PresenceSource.CHAT_GATEWAY || R()) goto _L4; else goto _L3
    }

    private void a(Friend friend)
    {
        E.setText(friend.e());
        String s1 = friend.g();
        Object obj = dA.a((String)as.get(s1));
        if (!TextUtils.equals(((CharSequence) (obj)), G.getText()))
        {
            G.setText(((CharSequence) (obj)));
            CursorCallbackEditText cursorcallbackedittext = G;
            int i1;
            if (obj == null)
            {
                i1 = 0;
            } else
            {
                i1 = ((String) (obj)).length();
            }
            cursorcallbackedittext.setSelection(i1);
        }
        obj = (List)at.get(s1);
        if (obj != null)
        {
            if (CashUtils.a(Bt.aD()) && CashUtils.a(friend.o()))
            {
                for (friend = ((List) (obj)).iterator(); friend.hasNext(); sf.a(G, ((Integer) (obj)).intValue()))
                {
                    obj = (Integer)friend.next();
                }

            }
            at.remove(s1);
        }
    }

    private void a(ChatConversation chatconversation, CashFeedItem cashfeeditem, String s1)
    {
        if (ReleaseManager.f())
        {
            Timber.c("ChatFragment", "CASH-LOG: SEND transaction id[%s] recipient[%s] amount[%s]", new Object[] {
                cashfeeditem.d(), chatconversation.mTheirUsername, cashfeeditem.mCashTransaction.a()
            });
        }
        O();
        b(cashfeeditem);
        i.a(chatconversation, cashfeeditem, s1, new sl.b(cashfeeditem, chatconversation) {

            final ChatFragment a;
            private CashFeedItem b;
            private ChatConversation c;

            public final void a()
            {
                if (ReleaseManager.f())
                {
                    Timber.c("ChatFragment", "CASH-LOG: SENDING transaction id[%s] recipient[%s] amount[%s]", new Object[] {
                        b.d(), c.mTheirUsername, b.mCashTransaction.a()
                    });
                }
                PG.a(new Runnable(this) {

                    private _cls14 a;

                    public final void run()
                    {
                        ChatFragment.q(a.a).setText("");
                    }

            
            {
                a = _pcls14;
                super();
            }
                });
                ChatFragment.a(a, null);
                ChatFragment.E(a).remove(c.mTheirUsername);
                ChatFragment.A(a);
                ChatFragment.i(a).a(new NQ());
                AnalyticsEvents.b(b.mCashTransaction.a(), b.mCashTransaction.mFromRain);
            }

            public final void b()
            {
                ChatFragment.A(a);
            }

            
            {
                a = ChatFragment.this;
                b = cashfeeditem;
                c = chatconversation;
                super();
            }
        });
    }

    private void a(com.snapchat.android.ui.CashSwiperView.SwipeActivationMethod swipeactivationmethod)
    {
        if (R == null || P)
        {
            return;
        } else
        {
            ((CashSwiperView)V.a()).a(5000);
            Q = swipeactivationmethod;
            P = true;
            Y = G.hasFocus();
            ay.a();
            CashFeedItem cashfeeditem = sl.a(R, 1, false);
            O();
            i.a(cashfeeditem, new sl.a(swipeactivationmethod) {

                final com.snapchat.android.ui.CashSwiperView.SwipeActivationMethod a;
                final ChatFragment b;

                public final void a()
                {
                    PG.a(new Runnable(this) {

                        private _cls16 a;

                        public final void run()
                        {
                            CashSwiperView cashswiperview;
                            AnalyticsEvents.a(a.a);
                            a.b.u();
                            cashswiperview = (CashSwiperView)ChatFragment.f(a.b).a();
                            cashswiperview.setAlpha(0.0F);
                            cashswiperview.setEnabled(true);
                            cashswiperview.setVisibility(0);
                            cashswiperview.animate().alpha(1.0F).setListener(null).setDuration(500L).start();
                            cashswiperview.f = false;
                            if (cashswiperview.d == null) goto _L2; else goto _L1
_L1:
                            cashswiperview.setUpFadeInAudio();
                            cashswiperview.e.start();
                            cashswiperview.d.start();
_L4:
                            cashswiperview.a(5000);
                            return;
_L2:
                            Uri uri;
                            cashswiperview.d = new MediaPlayer();
                            cashswiperview.d.setLooping(true);
                            uri = Uri.parse(CashSwiperView.a);
                            cashswiperview.d.setAudioStreamType(3);
                            cashswiperview.d.setDataSource(cashswiperview.getContext(), uri);
                            cashswiperview.d.setOnPreparedListener(new com.snapchat.android.ui.CashSwiperView._cls2(cashswiperview));
                            cashswiperview.d.prepareAsync();
                            continue; /* Loop/switch isn't completed */
                            IOException ioexception;
                            ioexception;
                            if (true) goto _L4; else goto _L3
_L3:
                        }

            
            {
                a = _pcls16;
                super();
            }
                    });
                    ChatFragment.D();
                    ChatFragment.F(b);
                    ChatFragment.i(b).a(new NT(false));
                }

                public final void b()
                {
                    ChatFragment.A(b);
                    ChatFragment.G(b);
                }

            
            {
                b = ChatFragment.this;
                a = swipeactivationmethod;
                super();
            }
            });
            return;
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            au.d(com.snapchat.android.analytics.HereAnalytics.SetupPhase.HERE_AVAILABLE.name());
        }
        ChatCameraButton chatcamerabutton = J;
        String s1;
        if (flag)
        {
            s1 = "blue";
        } else
        {
            s1 = "yellow";
        }
        chatcamerabutton.setContentDescription(s1);
        J.setPresent(flag);
        if (R != null)
        {
            boolean flag2;
            if (J.getVisibility() == 0 && !J.a)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ax.a(R, flag2);
        }
        J.setOnLongClickListener(new android.view.View.OnLongClickListener(flag1, flag) {

            private boolean a;
            private boolean b;
            private ChatFragment c;

            public final boolean onLongClick(View view)
            {
                if (ChatFragment.o(c).c || ChatFragment.o(c).a || ChatFragment.o(c).b)
                {
                    return false;
                }
                if (a && !HoldToStreamView.i)
                {
                    c.u();
                    ((StreamView)c.g.a()).c();
                    view = ChatFragment.u(c).a.edit();
                    view.putInt(SharedPreferenceKey.TIMES_DISPLAYED_HERE_TOOLTIP.getKey(), 3);
                    view.apply();
                } else
                if (b)
                {
                    ChatFragment.u(c).a(true);
                } else
                {
                    ChatFragment.D(c);
                }
                return true;
            }

            
            {
                c = ChatFragment.this;
                a = flag;
                b = flag1;
                super();
            }
        });
    }

    static boolean a(ChatFragment chatfragment)
    {
        if (CashUtils.a(chatfragment.f)) goto _L2; else goto _L1
_L1:
        chatfragment.ay.a(false);
        chatfragment.J.setCashtagDetected(false);
        chatfragment.J.setCashSwipeDetected(false);
_L4:
        return false;
_L2:
        boolean flag;
        CursorCallbackEditText cursorcallbackedittext = chatfragment.G;
        ChatCameraButton chatcamerabutton;
        int i1;
        int j1;
        int k1;
        boolean flag1;
        if (cursorcallbackedittext.getSelectionStart() != cursorcallbackedittext.getSelectionEnd())
        {
            flag = false;
        } else
        {
            Object obj2 = sf.b(cursorcallbackedittext.getEditableText());
            Object obj = sf.a(cursorcallbackedittext.getText().toString(), cursorcallbackedittext.getSelectionEnd());
            Object obj1 = sf.b(cursorcallbackedittext.getText().toString(), cursorcallbackedittext.getSelectionEnd());
            if (obj == null && obj1 == null)
            {
                flag = false;
            } else
            {
label0:
                {
                    if (obj == null)
                    {
                        obj = obj1;
                    }
                    obj1 = ((List) (obj2)).iterator();
                    do
                    {
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break label0;
                        }
                        obj2 = ((Iterator) (obj1)).next();
                    } while (((sf.a) (obj)).a > cursorcallbackedittext.getEditableText().getSpanEnd(obj2) || ((sf.a) (obj)).b < cursorcallbackedittext.getEditableText().getSpanStart(obj2));
                    flag = false;
                }
            }
        }
_L5:
label1:
        {
            flag1 = flag;
            if (!flag)
            {
                break label1;
            }
            k1 = sf.a(chatfragment.G);
            j1 = sf.a(chatfragment.G.getEditableText());
            i1 = j1;
            if (j1 == -1)
            {
                i1 = 0;
            }
            if (k1 != -1)
            {
                flag1 = flag;
                if (i1 + k1 < 0xf4240)
                {
                    break label1;
                }
            }
            flag1 = false;
        }
        flag = chatfragment.G.getEditableText().toString().matches("^\\${3,}$");
        chatfragment.ay.a(flag1);
        chatfragment.J.setCashtagDetected(flag1);
        chatfragment.J.setCashSwipeDetected(flag);
        chatcamerabutton = chatfragment.J;
        if (flag1 || flag)
        {
            chatfragment = "green";
        } else
        {
            chatfragment = "yellow";
        }
        chatcamerabutton.setContentDescription(chatfragment);
        if (flag1 || flag)
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag = true;
          goto _L5
    }

    static boolean a(ChatFragment chatfragment, boolean flag)
    {
        chatfragment.N = flag;
        return flag;
    }

    public static boolean a(String s1)
    {
        boolean flag;
        if (!TextUtils.equals(c, s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = s1;
        return flag;
    }

    static PI b(ChatFragment chatfragment)
    {
        return chatfragment.aI;
    }

    static void b(ChatFragment chatfragment, CashFeedItem cashfeeditem)
    {
        chatfragment.b(cashfeeditem);
    }

    private void b(MessageViewHolder messageviewholder)
    {
        if ((messageviewholder instanceof xK) && ((BO)messageviewholder.C).e())
        {
            ae.a(R, (BO)messageviewholder.C);
            ((xK)messageviewholder).v();
            Bt.G();
        }
        if (messageviewholder != null && (messageviewholder.C instanceof AT))
        {
            ao.a(aF, getActivity().mFragments, (AT)messageviewholder.C);
        }
        if (messageviewholder != null && messageviewholder.C != null)
        {
            aq.a(getActivity(), R, messageviewholder.C);
        }
    }

    private void b(CashFeedItem cashfeeditem)
    {
        cashfeeditem = cashfeeditem.mCashTransaction;
        cashfeeditem.mSenderBankStatementMessage = getString(0x7f0801cc, new Object[] {
            StringUtils.substring(((CashTransaction) (cashfeeditem)).mRecipientUsername, 0, 7)
        });
        cashfeeditem.mRecipientBankStatementMessage = getString(0x7f0801cc, new Object[] {
            StringUtils.substring(((CashTransaction) (cashfeeditem)).mSenderUsername, 0, 7)
        });
    }

    private void b(boolean flag, boolean flag1)
    {
        O.a(flag, flag1, false, R.u());
    }

    static boolean b(ChatFragment chatfragment, boolean flag)
    {
        chatfragment.M = flag;
        return flag;
    }

    private static float c(MessageViewHolder messageviewholder)
    {
        if (messageviewholder != null && messageviewholder.D != null)
        {
            return messageviewholder.D.getTranslationX();
        } else
        {
            return 0.0F;
        }
    }

    static View c(ChatFragment chatfragment)
    {
        return chatfragment.mFragmentLayout;
    }

    static boolean c(ChatFragment chatfragment, boolean flag)
    {
        chatfragment.Y = flag;
        return flag;
    }

    static View d(ChatFragment chatfragment)
    {
        return chatfragment.mFragmentLayout;
    }

    static xj e(ChatFragment chatfragment)
    {
        return chatfragment.aC;
    }

    static PI f(ChatFragment chatfragment)
    {
        return chatfragment.V;
    }

    static so g(ChatFragment chatfragment)
    {
        return chatfragment.ag;
    }

    static View h(ChatFragment chatfragment)
    {
        return chatfragment.mFragmentLayout;
    }

    static Bus i(ChatFragment chatfragment)
    {
        return chatfragment.u;
    }

    static View j(ChatFragment chatfragment)
    {
        return chatfragment.am;
    }

    static View k(ChatFragment chatfragment)
    {
        return chatfragment.al;
    }

    private void k(boolean flag)
    {
        if (aJ != flag)
        {
            com.snapchat.android.util.TitleBarManager.Visibility visibility;
            if (flag)
            {
                visibility = com.snapchat.android.util.TitleBarManager.Visibility.VISIBLE;
            } else
            {
                visibility = com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN;
            }
            u.a(new OC(visibility));
            aJ = flag;
        }
    }

    static PI l(ChatFragment chatfragment)
    {
        return chatfragment.ak;
    }

    private void l(boolean flag)
    {
        Object obj = getActivity();
        ViewStub viewstub;
        int i1;
        boolean flag1;
        int l1;
        if (flag)
        {
            if (obj instanceof LandingPageActivity)
            {
                ((LandingPageActivity)obj).d();
            }
            a(com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI);
        } else
        {
            if (obj instanceof LandingPageActivity)
            {
                ((LandingPageActivity)obj).e();
            }
            a(com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BEHIND);
        }
        if (flag)
        {
            i1 = (int)getResources().getDimension(0x7f0a0007);
        } else
        {
            i1 = (int)getResources().getDimension(0x7f0a0008);
        }
        obj = r;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l1 = (int)getResources().getDimension(0x7f0a0143);
        viewstub = ah;
        PG.a();
        ((CG) (obj)).a(viewstub);
        ((CG) (obj)).a.getLayoutParams().height = i1;
        if (flag1)
        {
            ((CG) (obj)).a.findViewById(0x7f0d0312).setPadding(0, l1, 0, 0);
        } else
        {
            ((CG) (obj)).a.findViewById(0x7f0d0312).setPadding(0, 0, 0, 0);
        }
        obj = (android.widget.RelativeLayout.LayoutParams)B.getLayoutParams();
        if (obj != null)
        {
            int k1 = ((android.widget.RelativeLayout.LayoutParams) (obj)).height;
            int j1;
            if (flag)
            {
                ar = (int)getResources().getDimension(0x7f0a0007);
                j1 = 0;
            } else
            {
                ar = (int)getResources().getDimension(0x7f0a0008);
                j1 = (int)getResources().getDimension(0x7f0a0143);
            }
            if (ar != k1)
            {
                obj.height = ar;
                B.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            }
            if (j1 != B.getPaddingTop())
            {
                B.setPadding(0, j1, 0, 0);
                return;
            }
        }
    }

    static void m(ChatFragment chatfragment)
    {
label0:
        {
            ChatConversation chatconversation;
            String s2;
            int i1;
label1:
            {
                Editable editable = chatfragment.G.getEditableText();
                if (!chatfragment.K())
                {
                    break label0;
                }
                if (chatfragment.R != null)
                {
                    chatfragment.O();
                    chatconversation = chatfragment.R;
                    s2 = editable.toString();
                    i1 = sf.a(chatfragment.G.getText());
                    if (chatfragment.aA != null)
                    {
                        break label1;
                    }
                    if (ReleaseManager.f())
                    {
                        Timber.c("ChatFragment", "CASH-LOG: Confirmed CashFeedItem is null--RECONFIRMING recipient[%s] amount[%s]", new Object[] {
                            chatconversation.mTheirUsername, CashUtils.a(i1)
                        });
                    }
                    CashFeedItem cashfeeditem = sl.a(chatconversation, i1, false);
                    chatfragment.i.a(cashfeeditem, chatfragment. new sl.a(chatconversation, i1, cashfeeditem, s2, editable) {

                        private ChatConversation a;
                        private int b;
                        private CashFeedItem c;
                        private String d;
                        private Editable e;
                        private ChatFragment f;

                        public final void a()
                        {
                            if (ReleaseManager.f())
                            {
                                Timber.c("ChatFragment", "CASH-LOG: RECONFIRMED transaction recipient[%s] amount[%s]", new Object[] {
                                    a.mTheirUsername, CashUtils.a(b)
                                });
                            }
                            ChatFragment.a(f, c);
                            ChatFragment.a(f, a, c, d);
                        }

                        public final void b()
                        {
                            if (ReleaseManager.f())
                            {
                                Timber.c("ChatFragment", "CASH-LOG: RECONFIRM CANCELED recipient[%s] amount[%s]", new Object[] {
                                    a.mTheirUsername, CashUtils.a(b)
                                });
                            }
                            e.clearSpans();
                            ChatFragment.q(f).setText(e);
                            ChatFragment.A(f);
                        }

            
            {
                f = ChatFragment.this;
                a = chatconversation;
                b = i1;
                c = cashfeeditem;
                d = s1;
                e = editable;
                super();
            }
                    });
                }
                return;
            }
            if (chatfragment.aA.mCashTransaction.mAmount != i1)
            {
                chatfragment.aA.mCashTransaction.mAmount = i1;
            }
            chatfragment.a(chatconversation, chatfragment.aA, s2);
            return;
        }
        String s1 = chatfragment.G.getText().toString();
        if (chatfragment.R != null)
        {
            chatfragment.n.a(chatfragment.R, s1, null);
            chatfragment.R.e(false);
        }
        chatfragment.G.setText("");
    }

    static ChatConversation n(ChatFragment chatfragment)
    {
        return chatfragment.R;
    }

    public static void n()
    {
        c = null;
    }

    static ChatCameraButton o(ChatFragment chatfragment)
    {
        return chatfragment.J;
    }

    static boolean p(ChatFragment chatfragment)
    {
        return chatfragment.K();
    }

    static CursorCallbackEditText q(ChatFragment chatfragment)
    {
        return chatfragment.G;
    }

    public static boolean q()
    {
        return aw;
    }

    static int r(ChatFragment chatfragment)
    {
        return chatfragment.H;
    }

    static int s(ChatFragment chatfragment)
    {
        return chatfragment.I;
    }

    public static boolean s()
    {
        return b != null && a != null;
    }

    public static void t()
    {
        b = null;
        a = null;
    }

    static boolean t(ChatFragment chatfragment)
    {
        return chatfragment.M;
    }

    static HereTooltip u(ChatFragment chatfragment)
    {
        return chatfragment.ax;
    }

    static boolean v(ChatFragment chatfragment)
    {
        return chatfragment.N;
    }

    static void w(ChatFragment chatfragment)
    {
        chatfragment.l(true);
    }

    static FD x(ChatFragment chatfragment)
    {
        return chatfragment.L;
    }

    static void y(ChatFragment chatfragment)
    {
        chatfragment.O();
    }

    static CashTooltip z(ChatFragment chatfragment)
    {
        return chatfragment.ay;
    }

    public final void A()
    {
        a(false, false);
    }

    public final float B()
    {
        return qD.a(getActivity());
    }

    public final boolean C()
    {
        boolean flag = false;
        int i1 = aE.getInt(SharedPreferenceKey.VIDEO_CHAT_ONBOARDING_REPEATS.getKey(), 0);
        if (i1 < 5)
        {
            android.content.SharedPreferences.Editor editor = aE.edit();
            editor.putInt(SharedPreferenceKey.VIDEO_CHAT_ONBOARDING_REPEATS.getKey(), i1 + 1);
            editor.apply();
            flag = true;
        }
        return flag;
    }

    public final void G_()
    {
        String s1;
        NetworkInfo networkinfo;
        networkinfo = t.e;
        s1 = "\u2753";
        if (networkinfo != null && networkinfo.isConnected() && t.d) goto _L2; else goto _L1
_L1:
        s1 = "\uD83D\uDEAB";
_L4:
        F.setText(s1);
        return;
_L2:
        switch (networkinfo.getType())
        {
        case 0: // '\0'
            s1 = "\uD83D\uDCF6";
            break;

        case 1: // '\001'
            s1 = "\u2705";
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int a(android.support.v7.widget.RecyclerView.v v1)
    {
        return G();
    }

    public final void a()
    {
        a(com.snapchat.android.ui.CashSwiperView.SwipeActivationMethod.HOLD);
    }

    public final void a(int i1)
    {
        if (!aN || !aI.b())
        {
            return;
        }
        u.a(new NT(true));
        if (aM != null && aM.s != null)
        {
            aM.s.seekTo(i1);
        }
        ((ViewGroup)aL.getParent()).setVisibility(0);
        RelativeLayout relativelayout = (RelativeLayout)mFragmentLayout;
        relativelayout.removeView(aI.a());
        aK.b();
        k(true);
        relativelayout.setClipChildren(true);
        aN = false;
    }

    public final void a(AO ao1)
    {
    }

    public final void a(Hb hb)
    {
        while (!(hb instanceof AT) || R == null) 
        {
            return;
        }
        v.a(hb.d(), new pM(R, (AT)hb));
    }

    public final void a(Hb hb, AO ao1)
    {
    }

    public final void a(Hb hb, SnapViewSessionStopReason snapviewsessionstopreason, int i1)
    {
        if (ClipCircleViewGroup.h && !(hb instanceof Bk) && snapviewsessionstopreason == SnapViewSessionStopReason.ABORT_REQUESTED)
        {
            ((DismissAnimationView)W.a()).a.start();
        }
    }

    public final volatile void a(android.support.v7.widget.RecyclerView.v v1, MotionEvent motionevent)
    {
    }

    public final volatile void a(android.support.v7.widget.RecyclerView.v v1, boolean flag)
    {
    }

    public final void a(View view, ChatMedia chatmedia)
    {
        if (aN || chatmedia == null || view == null)
        {
            return;
        }
        aN = true;
        aI.a();
        aL = view.findViewById(0x7f0d0151);
        ((RelativeLayout)mFragmentLayout).setClipChildren(false);
        view = ((View) (view.getTag()));
        Rect rect;
        if (view instanceof xu)
        {
            aM = (xu)view;
            view = aM;
        } else
        {
            view = null;
        }
        rect = new Rect();
        aL.getGlobalVisibleRect(rect);
        u.a(new NT(false));
        aK.a(chatmedia, rect, view, aM);
        ((ViewGroup)aL.getParent()).setVisibility(4);
        u();
        k(false);
    }

    public final void a(View view, boolean flag)
    {
        Bus bus = Mf.a();
        Object obj;
        if (flag)
        {
            obj = com.snapchat.android.ui.CustomVolumeView.VolumeViewType.HERE;
        } else
        {
            obj = com.snapchat.android.ui.CustomVolumeView.VolumeViewType.MEDIA;
        }
        bus.a(new OK(((com.snapchat.android.ui.CustomVolumeView.VolumeViewType) (obj))));
        obj = aD;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Jo) (obj)).a(view, flag);
    }

    public final void a(MessageViewHolder messageviewholder)
    {
        boolean flag1 = false;
        if (R == null || !R.mAmIPresent) goto _L2; else goto _L1
_L1:
        long l1;
        l1 = System.currentTimeMillis();
        messageviewholder = messageviewholder.C;
        if (!(messageviewholder instanceof Chat)) goto _L4; else goto _L3
_L3:
        long l2;
        messageviewholder = (Chat)messageviewholder;
        if (!messageviewholder.k().contains(R.mMyUsername))
        {
            break MISSING_BLOCK_LABEL_364;
        }
        l2 = messageviewholder.w();
        if (l2 <= R.mLastSeqNumOfTheirChatIDisplayed) goto _L6; else goto _L5
_L5:
        boolean flag;
        flag1 = sw.d(R, l2);
        l1 = messageviewholder.E();
        flag = false;
_L7:
        boolean flag2 = flag;
        if (flag1)
        {
            if (l1 > 0L)
            {
                messageviewholder = R;
                af.postDelayed(new Runnable(messageviewholder) {

                    private ChatConversation a;
                    private ChatFragment b;

                    public final void run()
                    {
                        if (ChatFragment.O(b).c(a))
                        {
                            ChatFragment.O(b).a(ChatFragment.n(b), Sk.a.RELEASE);
                            ChatFragment.n(b).x();
                        }
                    }

            
            {
                b = ChatFragment.this;
                a = chatconversation;
                super();
            }
                }, l1);
            } else
            {
                flag = ac.c(R);
            }
            ac.a(R);
            flag2 = flag;
        }
        if (flag2)
        {
            ac.a(R, Sk.a.RELEASE);
            R.x();
        }
_L2:
        return;
_L6:
        if (!messageviewholder.g(l1))
        {
            break MISSING_BLOCK_LABEL_364;
        }
        flag = true;
_L14:
        l1 = 0L;
          goto _L7
_L4:
        if (!(messageviewholder instanceof AY)) goto _L9; else goto _L8
_L8:
        messageviewholder = (AY)messageviewholder;
        if (!messageviewholder.m())
        {
            break MISSING_BLOCK_LABEL_358;
        }
        l1 = messageviewholder.W();
        if (l1 <= R.mLastTimestampOfSentSnapReadReceiptIReleased)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        flag = sw.b(R, l1);
_L13:
        l1 = 0L;
          goto _L7
_L9:
        if (!(messageviewholder instanceof AT)) goto _L11; else goto _L10
_L10:
        messageviewholder = (AT)messageviewholder;
        if (!messageviewholder.D())
        {
            break MISSING_BLOCK_LABEL_352;
        }
        l1 = messageviewholder.W();
        if (l1 <= R.mLastTimestampOfReceivedSnapReadReceiptIReleased)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        flag = sw.c(R, l1);
_L12:
        l1 = 0L;
          goto _L7
_L11:
        if (messageviewholder instanceof CashFeedItem)
        {
            messageviewholder = (CashFeedItem)messageviewholder;
            if (!messageviewholder.i())
            {
                ac.a(R, messageviewholder);
            }
        }
        l1 = 0L;
        flag = false;
          goto _L7
        flag = false;
          goto _L12
        flag = false;
          goto _L13
        flag = false;
          goto _L14
    }

    public final void a(Friend friend, boolean flag)
    {
        if (!aB)
        {
            Timber.f("ChatFragment", "CHAT-LOG: ChatFragment setFriend won't update the friend because the ChatFragment is not created yet.", new Object[0]);
            return;
        }
        if (xN.a())
        {
            xN.a(getActivity());
            return;
        }
        Timber.f("ChatFragment", (new StringBuilder("CHAT-LOG: ChatFragment setFriend ")).append(friend.g()).toString(), new Object[0]);
        if (a(friend.g()))
        {
            Timber.f("ChatFragment", "CHAT-LOG: ChatFragment setFriend changed. Resetting some state.", new Object[0]);
            if (Z.b())
            {
                ((CashReceiverView)Z.a()).a();
                ((CashReceiverView)Z.a()).setAlpha(0.0F);
            }
            L.B();
        }
        f = friend;
        P = false;
        R = ad.a(f.g(), false);
        O.a(R);
        R.mEnteredConversationFromRecentStoryReply = p.b();
        a(f);
        if (ReleaseManager.f())
        {
            G_();
        }
        aA = null;
        if (!CashUtils.a(Bt.aD()))
        {
            j.a(R.K());
        }
        if (flag)
        {
            R.a(false);
        }
        R.A();
        O.a(R.H(), false, true, R.u());
        L.B();
        if (R())
        {
            a(com.snapchat.android.livechat.AdlHelper.PresenceSource.ADDLIVE);
        } else
        {
            a(com.snapchat.android.livechat.AdlHelper.PresenceSource.CHAT_GATEWAY);
        }
        Mf.a().a(new Mh(CameraDisplayState.SHOW));
    }

    public final void a(CashFeedItem cashfeeditem)
    {
        AnalyticsEvents.h(cashfeeditem.mCashTransaction.a());
        O();
        i.a(R, cashfeeditem, new sl.b() {

            private ChatFragment a;

            public final void a()
            {
                ChatFragment.A(a);
            }

            public final void b()
            {
                ChatFragment.A(a);
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
    }

    public final boolean a(android.support.v7.widget.RecyclerView.v v1, float f1, float f2, float f3, float f4)
    {
        boolean flag1;
        flag1 = true;
        v1 = (MessageViewHolder)v1;
        if (v1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!ap.a) goto _L4; else goto _L3
_L3:
        int i1;
        i1 = G();
        if (Math.abs(f1) < (float)i1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (c(v1) >= (float)i1) goto _L4; else goto _L5
_L5:
        if (Math.abs(f1) >= (float)i1 && c(v1) < (float)i1)
        {
            K.a(i1);
            return true;
        } else
        {
            K.a(f1);
            return true;
        }
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BEHIND;
    }

    public final void b(int i1)
    {
        _cls24.b[i1 - 1];
        JVM INSTR tableswitch 1 2: default 28
    //                   1 50
    //                   2 57;
           goto _L1 _L2 _L3
_L1:
        com.snapchat.android.camera.model.CameraModel.CameraType cameratype = com.snapchat.android.camera.model.CameraModel.CameraType.NONE;
_L5:
        Mf.a().a(new Mh(CameraDisplayState.SHOW, cameratype));
        return;
_L2:
        cameratype = com.snapchat.android.camera.model.CameraModel.CameraType.FRONT_FACING;
        continue; /* Loop/switch isn't completed */
_L3:
        cameratype = com.snapchat.android.camera.model.CameraModel.CameraType.BACK_FACING;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void b(String s1)
    {
        if (R == null)
        {
            return;
        } else
        {
            Mf.a().a(new Nv(com.snapchat.android.livechat.AdlHelper.PresenceSource.ADDLIVE, R.mTheirUsername, false, s1));
            return;
        }
    }

    public final void b(boolean flag)
    {
        Timber.f("ChatFragment", "CHAT-LOG: ChatFragment updateFriendIfNecessary %b", new Object[] {
            Boolean.valueOf(flag)
        });
        while (TextUtils.isEmpty(c) || f != null && TextUtils.equals(f.g(), c)) 
        {
            return;
        }
        Timber.f("ChatFragment", "CHAT-LOG: ChatFragment updateFriendIfNecessary no displayed friend or username or displayed friend is different, setting to %s", new Object[] {
            c
        });
        a(aP.i(c), flag);
    }

    public final volatile boolean b(android.support.v7.widget.RecyclerView.v v1)
    {
        return true;
    }

    public final volatile float c(android.support.v7.widget.RecyclerView.v v1)
    {
        return c((MessageViewHolder)v1);
    }

    public final void c(boolean flag)
    {
        boolean flag1 = false;
        if (A.a)
        {
            A.a(false, flag);
            String s1 = c;
            flag = flag1;
            if (e != null)
            {
                flag = flag1;
                if (e.p)
                {
                    flag = true;
                }
            }
            AnalyticsEvents.c(s1, flag);
        }
    }

    public final boolean c()
    {
        return P;
    }

    public final volatile void d(android.support.v7.widget.RecyclerView.v v1)
    {
    }

    public final void d(boolean flag)
    {
        byte byte1 = 8;
        Object obj = B;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((View) (obj)).setVisibility(byte0);
        obj = K;
        if (flag)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        ((ChatAboveTheFoldV2RecyclerView) (obj)).setVisibility(byte0);
    }

    protected final void e()
    {
        az = true;
        super.e();
        z.b(this);
        if (P && !aw)
        {
            Object obj = (CashSwiperView)V.a();
            ((CashSwiperView) (obj)).setVisibility(8);
            ((CashSwiperView) (obj)).a();
            ((CashSwiperView) (obj)).setEnabled(false);
            ((CashSwiperView) (obj)).b.x();
            ((CashSwiperView) (obj)).c();
            obj = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString("RESUMING_FROM_SWIPE_MESSAGE", getResources().getString(0x7f0802c6, new Object[] {
                aP.k(R.mTheirUsername)
            }));
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
        if (G != null)
        {
            u();
        }
        if (X)
        {
            u.a(new Mb());
        }
        if (aK != null)
        {
            aK.e();
        }
        a(0);
        for (int i1 = 0; i1 < O.b(); i1++)
        {
            android.support.v7.widget.RecyclerView.v v1 = K.a(i1, false);
            if (v1 instanceof xH)
            {
                ((xH)v1).x();
                ((xH)v1).s();
            }
        }

        if (g.b())
        {
            ((StreamView)g.a()).b();
        }
        if (R == null) goto _L2; else goto _L1
_L1:
        R.b(false);
        int j1;
        if (R())
        {
            a(com.snapchat.android.livechat.AdlHelper.PresenceSource.ADDLIVE);
        } else
        {
            a(com.snapchat.android.livechat.AdlHelper.PresenceSource.CHAT_GATEWAY);
        }
        R.e(false);
        af.removeCallbacksAndMessages(null);
        if (!T && !av && !aw) goto _L4; else goto _L3
_L3:
        Timber.f("ChatFragment", "CHAT-LOG: LEFT CHAT with %s due to app pause when ChatFragment visible or entering in-chat camera or quick snap", new Object[] {
            R.mTheirUsername
        });
_L8:
        ac.b(R);
_L2:
        aH.a = false;
        u.a(new Na("ChatFragment"));
        H();
        DP.a().b();
        if (!av && !aw)
        {
            J();
        }
        if (!T && !av && !aw)
        {
            if (R != null && R.mIsStub)
            {
                ad.b(R.mId, true);
            }
            L.B();
            u.a(new Md());
            R = null;
            O.a(null);
            f = null;
            aA = null;
            c(false);
            if (e != null)
            {
                e.e();
            }
            if (aQ)
            {
                j1 = Bt.I();
                if (j1 < 2)
                {
                    Bt.b(j1 + 1);
                }
            }
            aQ = false;
        }
        Fe.a(false);
        s.a();
        if (ReleaseManager.f())
        {
            t.g = null;
        }
        if (e != null)
        {
            e.d();
        }
        c(false);
        CE.a().b();
        return;
_L4:
        Iterator iterator;
        Timber.f("ChatFragment", "CHAT-LOG: SWIPED OUT OF CHAT with %s", new Object[] {
            R.mTheirUsername
        });
        iterator = By.c().f().iterator();
_L6:
        ChatConversation chatconversation;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        chatconversation = (ChatConversation)iterator.next();
        List list = chatconversation.u();
        list;
        JVM INSTR monitorenter ;
        Iterator iterator1 = list.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            ChatFeedItem chatfeeditem = (ChatFeedItem)iterator1.next();
            if ((chatfeeditem instanceof AT) && ((AT)chatfeeditem).ar() && !((AT)chatfeeditem).x())
            {
                ((AT)chatfeeditem).a(chatconversation);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_753;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
        if (true) goto _L6; else goto _L5
_L5:
        ac.a(R, Sk.a.DELETE);
        R.y();
        R.mIsUserInConversation = false;
        t();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final volatile void e(android.support.v7.widget.RecyclerView.v v1)
    {
        v1 = (MessageViewHolder)v1;
        if (v1 instanceof xH)
        {
            ((xH)v1).z.a = false;
        }
    }

    public final void e(boolean flag)
    {
        byte byte1 = 8;
        View view = C;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        view = D;
        if (flag)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
    }

    public final void f(android.support.v7.widget.RecyclerView.v v1)
    {
        v1 = (MessageViewHolder)v1;
        FragmentActivity fragmentactivity;
        if (v1 != null && !v1.t())
        {
            v1 = ((MessageViewHolder) (v1)).C;
            fragmentactivity = getActivity();
            break MISSING_BLOCK_LABEL_26;
        }
        do
        {
            return;
        } while (fragmentactivity == null || v1 == null || !(v1 instanceof BO) || Bt.F() || Bt.H() || Bt.I() >= 2);
        aQ = true;
        if (((BO)v1).g())
        {
            v1 = fragmentactivity.getString(0x7f0800ad);
        } else
        {
            v1 = fragmentactivity.getString(0x7f0800ac);
        }
        u.a(new MA(v1, "ChatFragment", fragmentactivity.getResources().getColor(0x7f0c000a)));
    }

    public final void f(boolean flag)
    {
        if (flag && (g.b() || !((StreamView)g.a()).d()))
        {
            if (aK != null)
            {
                aK.e();
            }
            if (G != null)
            {
                u();
            }
        }
    }

    public final boolean f()
    {
        if (A.a)
        {
            c(true);
            return true;
        }
        if (P)
        {
            ((CashSwiperView)V.a()).b();
            return true;
        }
        if (aN)
        {
            aK.a();
            return true;
        } else
        {
            return false;
        }
    }

    protected final Cf g()
    {
        return new Cf(new String[] {
            "CHAT"
        });
    }

    public final void g(boolean flag)
    {
        com.snapchat.android.util.eventbus.ChangePreviewQualityEvent.PreviewQuality previewquality;
        if (flag)
        {
            previewquality = com.snapchat.android.util.eventbus.ChangePreviewQualityEvent.PreviewQuality.LOW;
        } else
        {
            previewquality = com.snapchat.android.util.eventbus.ChangePreviewQualityEvent.PreviewQuality.HIGH;
        }
        Mf.a().a(new ChangePreviewQualityEvent(previewquality));
    }

    public final void h()
    {
        if (f != null)
        {
            E.setText(f.e());
        }
    }

    public final void h(android.support.v7.widget.RecyclerView.v v1)
    {
        b((MessageViewHolder)v1);
    }

    public final void h(boolean flag)
    {
        Mf.a().a(new NT(flag));
    }

    public final void i(boolean flag)
    {
        ChatConversation chatconversation;
        if (R != null)
        {
            if ((chatconversation = R).mIsDisplayingVideo != flag)
            {
                chatconversation.mIsDisplayingVideo = flag;
                sD.a().a(chatconversation, chatconversation.mAmIPresent, chatconversation.mIsRecipientPresent, chatconversation.mIsDisplayingVideo);
                return;
            }
        }
    }

    public final float j()
    {
        return (float)aO.mScreenFullWidthPx * 0.66F;
    }

    public final CF k()
    {
        return new CF() {

            private ChatFragment a;

            public final boolean a(CG.a a1)
            {
                return CG.i.contains(a1.c) && a.f != null && !TextUtils.equals(a.f.g(), a1.a) || ChatFragment.F().contains(a1.c);
            }

            public final boolean b(CG.a a1)
            {
                return CG.i.contains(a1.c) && a.f != null && TextUtils.equals(a.f.g(), a1.a);
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        };
    }

    public final void l()
    {
        aw = true;
    }

    public final void m()
    {
        aw = false;
    }

    public final void m_()
    {
        if (mIsVisible)
        {
            T = true;
        }
        super.m_();
    }

    public final ChatConversation o()
    {
        return R;
    }

    public final boolean o_()
    {
        return super.o_();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        try
        {
            aF = ((qq)getActivity()).r();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new ClassCastException((new StringBuilder()).append(getActivity().toString()).append(" must implement InAppBillingManagerProvider").toString());
        }
    }

    public void onCameraReadyEvent(Mg mg)
    {
        ((StreamView)g.a()).a(mg.ready, mg.isChangingQuality);
    }

    public void onCancelInChatSnapEvent(Mj mj)
    {
        av = false;
        if (mj.mShouldDisplayHereTooltip)
        {
            ax.setCancelInChatSnapTime(System.currentTimeMillis());
        }
    }

    public void onCancelQuickSnapEvent(Mk mk)
    {
        av = false;
    }

    public void onCashRainEvent(Mm mm)
    {
        if (!mm.mConversation.equals(R))
        {
            return;
        } else
        {
            a((int)mm.mCount, mm.mCreatedAt);
            aG = true;
            return;
        }
    }

    public void onChatUpdatedEvent(Mp mp)
    {
        while (R == null || !TextUtils.equals(mp.mId, R.mId)) 
        {
            return;
        }
        Q();
    }

    public void onClearChatTextEvent(Mq mq)
    {
        if (!K())
        {
            G.setText("");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ll.e();
        mFragmentLayout = layoutinflater.inflate(0x7f040035, viewgroup, false);
        layoutinflater = getResources();
        ar = (int)layoutinflater.getDimension(0x7f0a0008);
        layoutinflater.getDimension(0x7f0a002e);
        aI = new PI(mFragmentLayout, 0x7f0d0148, 0x7f0d014e, new PI.a(this) {

            private xo.a a;
            private ChatFragment b;

            public final void a(View view)
            {
                float f1 = Jo.a(75F, b.getActivity());
                ((RelativeLayout)ChatFragment.c(b)).removeView(ChatFragment.b(b).a());
                ChatFragment.a(b, new xo(ChatFragment.b(b), (RelativeLayout)ChatFragment.d(b), f1, a, ChatFragment.e(b)));
            }

            
            {
                b = ChatFragment.this;
                a = a1;
                super();
            }
        });
        ax = (HereTooltip)d(0x7f0d0143);
        ay = (CashTooltip)d(0x7f0d0144);
        layoutinflater = Looper.getMainLooper();
        af = new Handler(layoutinflater);
        ab = new Handler(layoutinflater);
        Z = new PI(mFragmentLayout, 0x7f0d0145, 0x7f0d014b);
        V = new PI(mFragmentLayout, 0x7f0d0146, 0x7f0d014c, new PI.a() {

            private ChatFragment a;

            public final void a(View view)
            {
                ((CashSwiperView)ChatFragment.f(a).a()).setListener(a);
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        ag = new so(getActivity(), this);
        layoutinflater = (SpyRelativeLayout)mFragmentLayout.findViewById(0x7f0d0134);
        viewgroup = new com.snapchat.android.ui.SpyRelativeLayout.a() {

            private ChatFragment a;

            public final void a(MotionEvent motionevent)
            {
                if (CashUtils.a(a.f) && (!a.g.b() || !((StreamView)a.g.a()).e())) goto _L2; else goto _L1
_L1:
                return;
_L2:
                so so1;
                int i1;
                so1 = ChatFragment.g(a);
                i1 = motionevent.getActionMasked();
                if (i1 == 1 || i1 == 3)
                {
                    so1.a();
                    return;
                }
                if (i1 != 2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (motionevent.getPointerCount() > 1)
                {
                    i1 = 0;
                    do
                    {
                        if (i1 >= 2)
                        {
                            continue; /* Loop/switch isn't completed */
                        }
                        if (so1.a[i1] != null)
                        {
                            PointF pointf = new PointF(motionevent.getX(i1), motionevent.getY(i1));
                            PointF pointf1 = so1.a[i1];
                            boolean flag;
                            if (Math.abs(pointf.x - pointf1.x) > so1.c || Math.abs(pointf.y - pointf1.y) > so1.c)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            if (flag)
                            {
                                break;
                            }
                        }
                        i1++;
                    } while (true);
                }
                so1.a();
                return;
                if (i1 != 0 && i1 != 5) goto _L1; else goto _L3
_L3:
                if (so1.a[0] == null)
                {
                    so1.a[0] = new PointF(motionevent.getX(), motionevent.getY());
                }
                if (motionevent.getPointerCount() > 1 && so1.a[1] == null)
                {
                    so1.a[1] = new PointF(motionevent.getX(1), motionevent.getY(1));
                }
                if (!so1.b.hasMessages(5) && motionevent.getPointerCount() >= 2 && !so1.d.c())
                {
                    so1.b.postDelayed(new so._cls1(so1), ViewConfiguration.getLongPressTimeout());
                    so1.b.sendEmptyMessage(5);
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        };
        ((SpyRelativeLayout) (layoutinflater)).a.add(viewgroup);
        d(0x7f0d013d).setOnClickListener(new android.view.View.OnClickListener() {

            private ChatFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        layoutinflater = getActivity();
        ak = new PI(mFragmentLayout, 0x7f0d0178, 0x7f0d0163, new PI.a(layoutinflater) {

            private Context a;
            private ChatFragment b;

            public final void a(View view)
            {
                b.e = new su(b, a);
                b.e.a(ChatFragment.h(b));
                ChatFragment.i(b).c(b.e);
            }

            
            {
                b = ChatFragment.this;
                a = context;
                super();
            }
        });
        al = d(0x7f0d013a);
        am = d(0x7f0d0139);
        am.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            private ChatFragment a;

            public final void onGlobalLayout()
            {
                int i1 = ChatFragment.j(a).getHeight();
                if (i1 == 0)
                {
                    return;
                }
                Jo.a(ChatFragment.j(a), ChatFragment.k(a), new Rect(0, 0, i1, i1));
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    ChatFragment.j(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                } else
                {
                    ChatFragment.j(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    return;
                }
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        al.setOnClickListener(new android.view.View.OnClickListener() {

            private ChatFragment a;

            public final void onClick(View view)
            {
                if (a.e == null)
                {
                    ChatFragment.l(a).a();
                }
                if (a.e != null && ChatFragment.l(a).b() && a.e.a(a.f))
                {
                    a.p();
                }
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        g = new PI(mFragmentLayout, 0x7f0d013f, 0x7f0d014d);
        B = d(0x7f0d0029);
        d(0x7f0d0136);
        C = d(0x7f0d0140);
        D = d(0x7f0d0137);
        A = (ChatLayout)d(0x7f0d0133);
        A.setOnTouchListener(new GB(this));
        E = (TextView)d(0x7f0d013b);
        F = (TextView)d(0x7f0d013c);
        G = (CursorCallbackEditText)d(0x7f0d0141);
        G.setInputType(49153);
        G.setHorizontallyScrolling(false);
        G.setMaxLines(8);
        I = G.getPaddingLeft();
        H = 0x80000000;
        layoutinflater = (ClipboardManager)layoutinflater.getSystemService("clipboard");
        G.setContextMenuItemStrategy(new Fg(layoutinflater));
        G.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            private ChatFragment a;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                if (i1 == 4 || keyevent != null && keyevent.getKeyCode() == 66)
                {
                    ChatFragment.m(a);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        G.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private ChatFragment a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (ChatFragment.n(a) != null)
                {
                    ChatFragment.n(a).e(false);
                }
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        G.addTextChangedListener(new TextWatcher() {

            private boolean a;
            private boolean b;
            private ChatFragment c;

            public final void afterTextChanged(Editable editable)
            {
                if (!b)
                {
                    if (a)
                    {
                        int i1 = Selection.getSelectionStart(editable);
                        int j1 = Selection.getSelectionEnd(editable);
                        if (i1 == j1 && ChatFragment.p(c))
                        {
                            ImageSpan aimagespan[] = (ImageSpan[])editable.getSpans(i1, j1, android/text/style/ImageSpan);
                            if (aimagespan.length > 0)
                            {
                                b = true;
                                editable.replace(editable.getSpanStart(aimagespan[0]), editable.getSpanEnd(aimagespan[0]), "");
                                editable.removeSpan(aimagespan[0]);
                                b = false;
                                if (!ChatFragment.p(c))
                                {
                                    ChatFragment.a(c, null);
                                }
                            }
                        }
                    }
                    boolean flag2 = ChatFragment.a(c);
                    ChatFragment.a(c, true);
                    Object obj = ChatFragment.q(c).getLayout();
                    boolean flag;
                    boolean flag1;
                    if (obj != null)
                    {
                        if (ChatFragment.r(c) == 0x80000000)
                        {
                            ChatFragment.a(c, ChatFragment.o(c).getLeft());
                        }
                        float f1 = ChatFragment.s(c);
                        float f2 = ((Layout) (obj)).getLineWidth(0);
                        ChatConversation chatconversation;
                        if (((Layout) (obj)).getLineCount() > 1)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag || f1 + f2 >= (float)ChatFragment.r(c))
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                    } else
                    {
                        flag1 = false;
                    }
                    if (ChatFragment.t(c) != flag1)
                    {
                        ChatFragment.b(c, flag1);
                        if (flag1)
                        {
                            ChatFragment.o(c).setVisibility(8);
                            ChatFragment.q(c).setPadding(ChatFragment.s(c), ChatFragment.q(c).getPaddingTop(), c.getResources().getDimensionPixelOffset(0x7f0a0065), ChatFragment.q(c).getPaddingBottom());
                        } else
                        {
                            ChatFragment.o(c).setVisibility(0);
                            ChatFragment.q(c).setPadding(ChatFragment.s(c), ChatFragment.q(c).getPaddingTop(), c.getResources().getDimensionPixelOffset(0x7f0a0028), ChatFragment.q(c).getPaddingBottom());
                        }
                    }
                    if (ChatFragment.n(c) != null)
                    {
                        obj = ChatFragment.u(c);
                        chatconversation = ChatFragment.n(c);
                        if (!flag1 && !flag2)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        ((HereTooltip) (obj)).a(chatconversation, flag1);
                    }
                    if (ChatFragment.n(c) != null)
                    {
                        if (ChatFragment.n(c).mMessagingAuthToken != null)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag)
                        {
                            if (editable.length() == 0)
                            {
                                ChatFragment.n(c).e(false);
                                ChatFragment.o(c).setIsTyping(false);
                                return;
                            } else
                            {
                                ChatFragment.n(c).e(true);
                                return;
                            }
                        }
                    }
                }
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
                boolean flag = false;
                if (k1 <= 2)
                {
                    charsequence = charsequence.subSequence(i1, i1 + k1).toString();
                    ChatFragment.o(c).setIsEmoji(Kt.a(charsequence, false));
                } else
                {
                    ChatFragment.o(c).setIsEmoji(false);
                }
                if (k1 < j1)
                {
                    flag = true;
                }
                a = flag;
                ChatFragment.o(c).setIsTyping(true);
            }

            
            {
                c = ChatFragment.this;
                super();
            }
        });
        layoutinflater = G;
        viewgroup = new com.snapchat.android.ui.CursorCallbackEditText.a() {

            private ChatFragment a;

            public final void a()
            {
                if (!ChatFragment.v(a))
                {
                    ChatFragment.a(a);
                    return;
                } else
                {
                    ChatFragment.a(a, false);
                    return;
                }
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        };
        if (((CursorCallbackEditText) (layoutinflater)).a == null)
        {
            layoutinflater.a = new ArrayList();
        }
        ((CursorCallbackEditText) (layoutinflater)).a.add(viewgroup);
        G.setOnTouchListener(new android.view.View.OnTouchListener() {

            private ChatFragment a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    ChatFragment.w(a);
                    ChatFragment.x(a).B();
                }
                return false;
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        J = (ChatCameraButton)d(0x7f0d0142);
        J.setOnClickListener(new android.view.View.OnClickListener() {

            final ChatFragment a;

            public final void onClick(View view)
            {
                boolean flag1 = false;
                if (ChatFragment.o(a).c)
                {
                    ChatFragment.m(a);
                } else
                {
                    if (ChatFragment.o(a).b)
                    {
                        AnalyticsEvents.s();
                        ChatFragment.a(a, com.snapchat.android.ui.CashSwiperView.SwipeActivationMethod.DOLLARS);
                        return;
                    }
                    if (ChatFragment.o(a).a)
                    {
                        if (ChatFragment.n(a) != null)
                        {
                            AnalyticsEvents.s();
                            ChatFragment.y(a);
                            ChatFragment.c(a, ChatFragment.q(a).hasFocus());
                            ChatFragment.z(a).a();
                            view = a.h;
                            int i1 = sf.a(ChatFragment.q(a));
                            view = a.h;
                            int j1 = sf.a(ChatFragment.q(a).getEditableText());
                            int k1 = ChatFragment.q(a).getSelectionEnd();
                            view = a.i;
                            view = sl.a(ChatFragment.n(a), j1 + i1, false);
                            a.i.a(view, new sl.a(this, view, k1, i1) {

                                final int a;
                                final int b;
                                final _cls6 c;
                                private CashFeedItem d;

                                public final void a()
                                {
                                    ChatFragment.a(c.a, d);
                                    PG.a(new Runnable(this) {

                                        private _cls1 a;

                                        public final void run()
                                        {
                                            sf sf1 = a.c.a.h;
                                            sf.a(ChatFragment.q(a.c.a), a.a);
                                            ChatFragment.A(a.c.a);
                                            AnalyticsEvents.n(CashUtils.a(a.b));
                                        }

            
            {
                a = _pcls1;
                super();
            }
                                    });
                                }

                                public final void b()
                                {
                                    ChatFragment.A(c.a);
                                }

            
            {
                c = _pcls6;
                d = cashfeeditem;
                a = i1;
                b = j1;
                super();
            }
                            });
                            return;
                        }
                    } else
                    {
                        view = a.getView();
                        ChatFragment chatfragment = a;
                        boolean flag = flag1;
                        if (view != null)
                        {
                            flag = flag1;
                            if (ChatFragment.B(a) - view.getHeight() > 100)
                            {
                                flag = true;
                            }
                        }
                        ChatFragment.c(chatfragment, flag);
                        ChatFragment.C(a);
                        return;
                    }
                }
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        J.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            private ChatFragment a;

            public final boolean onLongClick(View view)
            {
                ChatFragment.D(a);
                return true;
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        K = (ChatAboveTheFoldV2RecyclerView)d(0x7f0d0135);
        ai = (FrameLayout)d(0x7f0d0138);
        aj.a(SnapchatViewPager.a(Integer.valueOf(mPageIndex)), ai, "ChatFragment");
        O = new xe(getActivity(), K, this, this, aH, this, aC);
        K.setAdapter(O);
        getActivity();
        L = new FD();
        O.a(L);
        K.setLayoutManager(L);
        ap = new Gw(getActivity(), K, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.SwipeDirection.RIGHT, this);
        ap.d = this;
        ap.b = this;
        K.setOnTouchListener(ap);
        K.a(new b((byte)0));
        K.a(new a((byte)0));
        K.a(new d((byte)0));
        K.setRecyclerListener(new android.support.v7.widget.RecyclerView.o() {

            public final void a_(android.support.v7.widget.RecyclerView.v v1)
            {
                Jo.b(v1.a);
            }

        });
        K.setTouchBottomEdgeCallback(new Runnable() {

            private ChatFragment a;

            public final void run()
            {
                a.u();
            }

            
            {
                a = ChatFragment.this;
                super();
            }
        });
        L.b = new c((byte)0);
        ah = (ViewStub)getActivity().findViewById(0x7f0d02ff);
        W = new PI(mFragmentLayout, 0x7f0d0147, 0x7f0d027f);
        aE = PreferenceManager.getDefaultSharedPreferences(getActivity());
        aD = new Jo(getActivity());
        Mf.a().c(this);
        try
        {
            z = ((Hc)getActivity()).q();
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new ClassCastException((new StringBuilder()).append(getActivity().toString()).append(" must implement SnapViewProvider").toString());
        }
        if (bundle != null)
        {
            layoutinflater = bundle.getString("friend_username");
            if (!TextUtils.isEmpty(layoutinflater))
            {
                c = layoutinflater;
            }
            layoutinflater = (HashMap)bundle.getSerializable("message_drafts");
            as.putAll(layoutinflater);
            layoutinflater = (HashMap)bundle.getSerializable("cashtag_positions");
            at.putAll(layoutinflater);
        }
        aB = true;
        b(true);
        ll.f();
        return mFragmentLayout;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ChatCameraButton chatcamerabutton = J;
        if (chatcamerabutton.d != null)
        {
            chatcamerabutton.d.release();
        }
    }

    public void onDiscoverBarClickEvent(My my)
    {
        if (my.mIsLongPressed)
        {
            b(my.mChatShareDSnapViewHolder);
            return;
        }
        if (aN)
        {
            my.mChatDiscoverViewingSession.k();
            return;
        } else
        {
            a(my.mChatShareDSnapViewHolder.a, (ChatMedia)my.mChatFeedItem);
            return;
        }
    }

    public void onFeedRefreshedEvent(SnapMessageFeedRefreshedEvent snapmessagefeedrefreshedevent)
    {
        O.c();
    }

    public void onFeedTimerChangeEvent(MG mg)
    {
        if (mg.mIsStory || !TextUtils.equals(c, mg.mFriendUsername))
        {
            return;
        } else
        {
            O.c();
            return;
        }
    }

    public void onLoadSnapMediaEvent(LoadSnapMediaEvent loadsnapmediaevent)
    {
        O.c();
    }

    public void onPause()
    {
        super.onPause();
        if (mIsVisible && R != null)
        {
            T = true;
            String s1 = Bt.q();
            if (yc.a(getActivity(), R.u(), s1))
            {
                Intent intent = getActivity().getIntent();
                intent.putExtra("goToFragmentNum", 0);
                getActivity().setIntent(intent);
            } else
            {
                FragmentActivity fragmentactivity = getActivity();
                Object obj = aH;
                ((xI) (obj)).a(System.currentTimeMillis());
                Timber.c("ReleaseWindow", (new StringBuilder("getLatestSeenItemTimestamp - latestItemTimestamp ")).append(((xI) (obj)).c.a).append(" lastNotifiedTimestamp ").append(((xI) (obj)).c.b).toString(), new Object[0]);
                long l1 = ((xI) (obj)).c.a;
                obj = (AlarmManager)fragmentactivity.getSystemService("alarm");
                Object obj1 = o;
                String s2 = R.mId;
                obj1 = ((Ei) (obj1)).c(fragmentactivity);
                ((Intent) (obj1)).putExtra("op_code", 1001);
                ((Intent) (obj1)).putExtra("conversationId", s2);
                ((Intent) (obj1)).putExtra("latestSeenItemTimestamp", l1);
                a = PendingIntent.getService(fragmentactivity, 0, ((Intent) (obj1)), 0x10000000);
                b = R.mId;
                ((AlarmManager) (obj)).cancel(a);
                ((AlarmManager) (obj)).set(0, 60000L + System.currentTimeMillis(), a);
            }
        }
        if (e != null)
        {
            u.b(e);
        }
        if (g.b())
        {
            ((StreamView)g.a()).a();
        }
        G.clearFocus();
        H();
        DP.a().b();
        J();
    }

    public void onPresenceUpdatedEvent(Nv nv)
    {
        if (mIsVisible && R != null && TextUtils.equals(nv.username, R.m()))
        {
            a(nv.presenceSource);
            if (g.b())
            {
                ((StreamView)g.a()).d(nv.videoReceived);
            }
        }
    }

    public void onResume()
    {
        ll.e();
        super.onResume();
        Timber.f("ChatFragment", "CHAT-LOG: ChatFragment onResume", new Object[0]);
        T = false;
        O.c();
        if (k)
        {
            k = false;
            Timber.c("ChatFragment", "Make this fragment visible because it was selected as the current item of the view pager before it was created", new Object[0]);
            j(true);
        }
        ll.f();
        if (R != null && R())
        {
            L();
            ((StreamView)g.a()).a(R.mHereAuth, R.mId, R.mMessagingAuthToken);
        }
        if (e != null)
        {
            u.c(e);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (f != null)
        {
            bundle.putString("friend_username", f.g());
        }
        bundle.putSerializable("message_drafts", as);
        bundle.putSerializable("cashtag_positions", at);
    }

    public void onSecureChatSessionConnectedEvent(NR nr)
    {
        if (R != null)
        {
            R.b(mIsVisible);
        }
    }

    public void onSnapSelectedForReplayEvent(Ob ob)
    {
        O.c();
    }

    public void onSnapViewingEvent(NY ny)
    {
        if (ny.mBeingViewed)
        {
            DP.a().b();
        } else
        if (super.mIsVisible)
        {
            I();
            b(false, false);
            return;
        }
    }

    protected void onVisible()
    {
        az = false;
        ll.e();
        w.mFirstMediaOpenedMetric = null;
        Mf.a().a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.VISIBLE));
        z.a(this);
        Timber.f("ChatFragment", "CHAT-LOG: ChatFragment onVisible", new Object[0]);
        if (ReleaseManager.f())
        {
            G_();
            t.g = this;
        }
        if (R != null)
        {
            n.c(R);
        }
        b(false);
        super.onVisible();
        Object obj = getActivity();
        l(false);
        aJ = false;
        k(true);
        ((Activity) (obj)).setVolumeControlStream(3);
        if ((obj instanceof LandingPageActivity) && p.b())
        {
            obj = p;
            if (((lq) (obj)).mRecentStoryReplyEvent == null)
            {
                obj = null;
            } else
            {
                obj = ((lq) (obj)).mFriendManager.i(((lq) (obj)).mRecentStoryReplyEvent.friendUsername);
            }
            a(((Friend) (obj)), true);
        }
        if (f != null && TextUtils.isEmpty(E.getText()))
        {
            E.setText(f.e());
        }
        u.a(new ChangePreviewQualityEvent(com.snapchat.android.util.eventbus.ChangePreviewQualityEvent.PreviewQuality.HIGH));
        aH.a = true;
        if (f == null || R == null)
        {
            return;
        }
        E.setText(f.e());
        obj = x;
        boolean flag = R.H();
        if (((lp) (obj)).mChatOrCashNotificationOpenMetric != null)
        {
            ((lp) (obj)).mChatOrCashNotificationOpenMetric.a("success", Boolean.valueOf(flag)).b(false);
            obj.mChatOrCashNotificationOpenMetric = null;
        }
        ((lp) (obj)).a("chat");
        Timber.f("ChatFragment", "CHAT-LOG: ENTERED CHAT with %s", new Object[] {
            R.mTheirUsername
        });
        R.mIsUserInConversation = true;
        if (U < 0L)
        {
            U = SystemClock.elapsedRealtime();
            AnalyticsEvents.j();
            ld.a().a(false);
        }
        I();
        R.b(true);
        String s1;
        int i1;
        if (R())
        {
            L();
            ((StreamView)g.a()).a(R.mHereAuth, R.mId, R.mMessagingAuthToken);
        } else
        {
            a(com.snapchat.android.livechat.AdlHelper.PresenceSource.CHAT_GATEWAY);
        }
        aG = false;
        Q();
        b(true, true);
        a(K);
        NotificationTable.c(SnapchatApplication.get(), com.snapchat.android.notification.AndroidNotificationManager.Type.CHAT.name(), R.mTheirUsername);
        obj = f;
        if (((Friend) (obj)).o() == TD.a.OK)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            Timber.b("ChatFragment", "CASH-LOG: Refreshing CASH ELIGIBILITY for %s", new Object[] {
                ((Friend) (obj)).g()
            });
            ng ng1 = new ng(((Friend) (obj)).g());
            ng1.registerCallback(TD, new oS.a(((Friend) (obj))) {

                final ChatFragment a;
                private Friend b;

                public final void onJsonResult(Object obj1, pi pi1)
                {
                    obj1 = (TD)obj1;
                    if (obj1 != null)
                    {
                        obj1 = ((TD) (obj1)).a();
                        if (obj1 != null)
                        {
                            Timber.b("ChatFragment", "CASH-LOG: Got CASH ELIGIBILITY for %s: %s", new Object[] {
                                b.g(), ((TD.a) (obj1)).name()
                            });
                            b.mCashEligibility = ((TD.a) (obj1));
                            PG.a(new Runnable(this) {

                                private _cls1 a;

                                public final void run()
                                {
                                    ChatFragment.a(a.a);
                                }

            
            {
                a = _pcls1;
                super();
            }
                            });
                            return;
                        } else
                        {
                            Timber.b("ChatFragment", "CASH-LOG: FAILED to get CASH ELIGIBILITY for %s with status code %d and null json response status", new Object[] {
                                b.g(), Integer.valueOf(pi1.mResponseCode)
                            });
                            return;
                        }
                    } else
                    {
                        Timber.b("ChatFragment", "CASH-LOG: FAILED to get CASH ELIGIBILITY for %s status code %d", new Object[] {
                            b.g(), Integer.valueOf(pi1.mResponseCode)
                        });
                        return;
                    }
                }

            
            {
                a = ChatFragment.this;
                b = friend;
                super();
            }
            });
            ng1.execute();
        }
        N();
        if (A != null)
        {
            i1 = A.getHeight();
            if (an < i1)
            {
                an = i1;
            }
        }
        obj = r;
        s1 = f.g();
        ((CG) (obj)).f.remove(s1);
        ((CG) (obj)).g.remove(s1);
        u.a(new NG());
        ll.f();
    }

    public final void p()
    {
        u();
        A.a(true, true);
        AnalyticsEvents.p(c);
    }

    public final void u()
    {
        Jo.a(getActivity(), G);
        l(false);
    }

    public final void v()
    {
        if (aN)
        {
            aK.a();
        }
    }

    public final void w()
    {
        if (R != null && R.mIsRecipientPresent)
        {
            n.a(R, ((CashSwiperView)V.a()).c, ((CashSwiperView)V.a()).g);
        }
    }

    public final void x()
    {
        P = false;
        Q = null;
        if (!aw)
        {
            N();
        }
        if (((CashSwiperView)V.a()).c == 0)
        {
            P();
        }
    }

    public final void z()
    {
        if (((CashSwiperView)V.a()).c == 0 || R == null)
        {
            return;
        }
        if (Q == com.snapchat.android.ui.CashSwiperView.SwipeActivationMethod.DOLLARS)
        {
            G.setText("");
        }
        O();
        (new AsyncTask(R, ((CashSwiperView)V.a()).c * 100) {

            final ChatConversation a;
            final ChatFragment b;
            private int c;

            protected final Object doInBackground(Object aobj[])
            {
                aobj = b.i;
                aobj = sl.a(a, c, true);
                b.i.a(((CashFeedItem) (aobj)), new sl.a(this, ((CashFeedItem) (aobj))) {

                    final CashFeedItem a;
                    final _cls17 b;

                    public final void a()
                    {
                        ChatFragment.b(b.b, a);
                        b.b.i.a(b.a, a, "", new sl.b(this) {

                            private _cls1 a;

                            public final void a()
                            {
                                AnalyticsEvents.b(a.a.mCashTransaction.a(), a.a.mCashTransaction.mFromRain);
                                ChatFragment.A(a.b.b);
                            }

                            public final void b()
                            {
                                ChatFragment.A(a.b.b);
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                    }

                    public final void b()
                    {
                        ChatFragment.A(b.b);
                    }

            
            {
                b = _pcls17;
                a = cashfeeditem;
                super();
            }
                });
                return null;
            }

            
            {
                b = ChatFragment.this;
                a = chatconversation;
                c = i1;
                super();
            }
        }).execute(new Void[0]);
    }

    static 
    {
        l = eg.a(com.snapchat.android.notification.AndroidNotificationManager.Type.ADDFRIEND);
    }
}
