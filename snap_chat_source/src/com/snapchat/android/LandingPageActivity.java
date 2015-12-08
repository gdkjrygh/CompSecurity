// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import AA;
import AT;
import Aa;
import Ab;
import Al;
import Am;
import BQ;
import BY;
import Bc;
import Bd;
import Bf;
import Bj;
import Bm;
import Br;
import Bs;
import Bt;
import By;
import CG;
import CI;
import CJ;
import Ca;
import Cl;
import DS;
import Dl;
import EV;
import Fh;
import HZ;
import Hc;
import IC;
import IG;
import IO;
import IX;
import IZ;
import Iq;
import Iz;
import Jb;
import Jd;
import Jk;
import Jn;
import Jo;
import KN;
import Ka;
import Kg;
import Ks;
import LA;
import LI;
import LO;
import LQ;
import Ll;
import MA;
import ME;
import MH;
import MQ;
import MT;
import MU;
import MX;
import MY;
import Mc;
import Mf;
import Mh;
import Mj;
import Mk;
import Ml;
import Mn;
import Mo;
import Mp;
import Mr;
import Mx;
import NA;
import NB;
import ND;
import NF;
import NK;
import NL;
import NT;
import NV;
import NZ;
import Na;
import Nj;
import Nk;
import Nm;
import OC;
import OF;
import OG;
import OI;
import OK;
import OR;
import OS;
import Oa;
import Od;
import Og;
import Oi;
import Oo;
import Oq;
import Ot;
import PG;
import PJ;
import Pk;
import S;
import TB;
import TC;
import V;
import Y;
import aU;
import agx;
import anG;
import anR;
import anS;
import android.animation.ObjectAnimator;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.KeyguardManager;
import android.app.ProgressDialog;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObservable;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import aoi;
import aok;
import aom;
import aox;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.NetworkAnalytics;
import com.snapchat.android.analytics.PhoneVerificationAnalytics;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.battery.BatteryUsageTimer;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.analytics.framework.EasyMetricManager;
import com.snapchat.android.analytics.framework.ErrorMetric;
import com.snapchat.android.app.feature.messaging.feed.ui.fragment.FeedFragment;
import com.snapchat.android.billing.InAppBillingManager;
import com.snapchat.android.camera.CameraFragment;
import com.snapchat.android.camera.ui.viewflipper.CameraViewFlipper;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.ui.DSnapView;
import com.snapchat.android.discover.ui.fragment.EditionViewerFragment;
import com.snapchat.android.fragments.addfriends.LeftSwipeContainerFragment;
import com.snapchat.android.fragments.chat.ChatFragment;
import com.snapchat.android.fragments.sendto.SendToFragment;
import com.snapchat.android.fragments.verification.SettingsPhoneVerificationFragment;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.notification.AndroidNotificationManager;
import com.snapchat.android.preview.SnapPreviewFragment;
import com.snapchat.android.receiver.ConnectivityReceiver;
import com.snapchat.android.ui.CustomVolumeView;
import com.snapchat.android.ui.InAppPromptFlipper;
import com.snapchat.android.ui.InAppPromptView;
import com.snapchat.android.ui.SnapEditorView;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.ui.snapview.MultiLeveledSnapView;
import com.snapchat.android.ui.snapview.SnapView;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.ScrollState;
import com.snapchat.android.util.SnapMediaUtils;
import com.snapchat.android.util.SnapchatViewPager;
import com.snapchat.android.util.TitleBarManager;
import com.snapchat.android.util.chat.SecureChatService;
import com.snapchat.android.util.chat.SecureChatSession;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import com.snapchat.android.util.crypto.DeviceTokenManager;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.snapchat.android.util.eventbus.InChatSnapEvent;
import com.snapchat.android.util.eventbus.QuickSnapEvent;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.eventbus.SnapCaptureContext;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import dp;
import dr;
import dv;
import el;
import gG;
import gM;
import gZ;
import gh;
import hf;
import hn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import kB;
import kF;
import kG;
import ko;
import kp;
import ks;
import ku;
import ky;
import lW;
import lX;
import lk;
import ll;
import lm;
import lo;
import lp;
import lq;
import lu;
import lw;
import ly;
import mF;
import mP;
import org.json.JSONException;
import qX;
import qc;
import qg;
import qj;
import qk;
import qq;
import qr;
import ra;
import sD;
import sG;
import sI;
import sK;
import sq;
import sz;
import un;
import uo;
import uz;
import vA;
import vJ;
import wG;
import wJ;
import wK;
import wL;
import wM;
import wd;
import wq;

// Referenced classes of package com.snapchat.android:
//            SnapchatActivity, SnapchatApplication, LeftSwipeViewPager, Timber, 
//            TermsOfUseActivity, ScAcceptTermsActivity

public class LandingPageActivity extends SnapchatActivity
    implements Hc, OS, com.snapchat.android.app.feature.messaging.feed.ui.fragment.ReplayDialogFragment.a, com.snapchat.android.ui.lenses.LensPurchaseDialog.a, com.snapchat.android.util.fragment.SnapchatFragment.a, qc, qq
{

    static SecureChatService c;
    private static LandingPageActivity h;
    private Jd A;
    private IX B;
    private final ll C;
    private final CameraEventAnalytics D;
    private final NetworkAnalytics E;
    private final lp F;
    private final lq G;
    private final Jb H;
    private final AndroidNotificationManager I;
    private final vJ J;
    private final sq K;
    private final ConnectivityReceiver L;
    private final Ab M;
    private final Aa N;
    private final DS O;
    private final TitleBarManager P;
    private final lu Q;
    private final LQ R;
    private final LQ S;
    private final ko T;
    private final lm U;
    private final un V;
    private final kp W;
    private final qk X;
    private final Jn Y;
    private anG Z;
    protected SnapchatViewPager a;
    private ku aa;
    private final CG ab;
    private final kB ac;
    private final Handler ad;
    private final Bm ae;
    private ViewStub af;
    private qg ag;
    private CustomVolumeView ah;
    private MultiLeveledSnapView ai;
    private InAppBillingManager aj;
    private qj ak;
    private final ra al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private final Runnable ar;
    private EV as;
    private final ServiceConnection at;
    public NL b;
    public Fh d;
    public Bs e;
    public ExecutorService f;
    protected Bus g;
    private final ky i;
    private int j;
    private boolean k;
    private NV l;
    private boolean m;
    private int n;
    private IZ o;
    private InChatSnapEvent p;
    private QuickSnapEvent q;
    private wK r;
    private wM s;
    private ProgressDialog t;
    private boolean u;
    private boolean v;
    private boolean w;
    private sI x;
    private final sG y;
    private sK z;

    public LandingPageActivity()
    {
        this(AndroidNotificationManager.a(), new sI(), new sG(), new sK(), Jd.a(), ll.a(), CameraEventAnalytics.a(), NetworkAnalytics.a(), lq.a(), Jb.a(), new ky(), vJ.a(), sq.b(), Mf.a(), new ConnectivityReceiver(), Ab.a(), new Aa(), DS.a(), new TitleBarManager(), lu.a(), lo.a(), LQ.b(), LQ.a(), CG.a(), new lX(), Bt.a(), lm.a(), lp.a(), un.a(), LA.a(), kp.a(), ko.a(), FeatureFlagManager.a(), qk.a(), Jn.a(), kB.a(), Bm.a(), ra.a());
    }

    LandingPageActivity(AndroidNotificationManager androidnotificationmanager, sI si, sG sg, sK sk, Jd jd, ll ll1, CameraEventAnalytics cameraeventanalytics, 
            NetworkAnalytics networkanalytics, lq lq1, Jb jb, ky ky1, vJ vj, sq sq1, Bus bus, 
            ConnectivityReceiver connectivityreceiver, Ab ab1, Aa aa1, DS ds, TitleBarManager titlebarmanager, lu lu1, lo lo1, 
            LQ lq2, LQ lq3, CG cg, lX lx, Bt bt, lm lm1, lp lp1, 
            un un1, LA la, kp kp1, ko ko1, FeatureFlagManager featureflagmanager, qk qk1, Jn jn, 
            kB kb, Bm bm, ra ra1)
    {
        j = 2;
        k = false;
        m = true;
        u = false;
        v = false;
        w = false;
        new OR();
        ad = new Handler();
        am = false;
        an = true;
        ao = false;
        ap = false;
        aq = false;
        ar = new Runnable() {

            private LandingPageActivity a;

            public final void run()
            {
                LandingPageActivity.a(a);
            }

            
            {
                a = LandingPageActivity.this;
                super();
            }
        };
        at = new ServiceConnection() {

            private LandingPageActivity a;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                if (ibinder instanceof com.snapchat.android.util.chat.SecureChatService.a)
                {
                    LandingPageActivity.c = ((com.snapchat.android.util.chat.SecureChatService.a)ibinder).this$0;
                    LandingPageActivity.a(a, true);
                    if (a.mUser == null)
                    {
                        LandingPageActivity.b(a, true);
                    } else
                    if (a.g() && a.mUser.mMessagingGatewayInfo != null)
                    {
                        LandingPageActivity.o();
                        return;
                    }
                }
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
                LandingPageActivity.c = null;
                LandingPageActivity.a(a, false);
                LandingPageActivity.b(a, false);
            }

            
            {
                a = LandingPageActivity.this;
                super();
            }
        };
        SnapchatApplication.getDIComponent().a(this);
        I = androidnotificationmanager;
        x = si;
        y = sg;
        z = sk;
        A = jd;
        C = ll1;
        D = cameraeventanalytics;
        E = networkanalytics;
        G = lq1;
        H = jb;
        i = ky1;
        g = bus;
        J = vj;
        K = sq1;
        L = connectivityreceiver;
        M = ab1;
        N = aa1;
        O = ds;
        P = titlebarmanager;
        Q = lu1;
        R = lq2;
        S = lq3;
        ab = cg;
        U = lm1;
        F = lp1;
        V = un1;
        W = kp1;
        T = ko1;
        X = qk1;
        Y = jn;
        ac = kb;
        ae = bm;
        al = ra1;
    }

    private void A()
    {
        Intent intent = getIntent();
        if (!intent.getBooleanExtra("deep_link_activity_on_resume", false))
        {
            C.a(intent, V.a(intent));
            intent.putExtra("deep_link_activity_on_resume", true);
            return;
        } else
        {
            C.a(getIntent(), null);
            return;
        }
    }

    private void a(AA aa1)
    {
        if (((Mediabryo) (aa1)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.SNAP)
        {
            z.a(aa1);
        } else
        {
            if (Ks.a(((Mediabryo) (aa1)).mSnapType))
            {
                z.a(aa1);
                return;
            }
            if (((Mediabryo) (aa1)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
            {
                Object obj = z;
                sK.a(((Mediabryo) (aa1)).mClientId);
                ((sK) (obj)).b.a(aa1, com.snapchat.android.model.MediaMailingMetadata.UploadStatus.WILL_UPLOAD_AFTER_SAVE);
                obj = new sK._cls2(((sK) (obj)), aa1);
                sK.a.put(((Mediabryo) (aa1)).mClientId, obj);
                ((Kg) (obj)).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new AA[] {
                    aa1
                });
                return;
            }
        }
    }

    private void a(AA aa1, boolean flag)
    {
        if (!((Mediabryo) (aa1)).mMediaMailingMetadata.d().isEmpty())
        {
            g.a(new Od());
        }
        MediaMailingMetadata mediamailingmetadata = ((Mediabryo) (aa1)).mMediaMailingMetadata;
        if (mediamailingmetadata.d().isEmpty() || ((Mediabryo) (aa1)).mSnapType != com.snapchat.android.model.Mediabryo.SnapType.SNAP)
        {
            do
            {
                G.c();
                G.d();
                Object obj = ((Mediabryo) (aa1)).mMediaMailingMetadata;
                Bd bd;
                boolean flag1;
                if (((MediaMailingMetadata) (obj)).d().isEmpty())
                {
                    a(3);
                    return;
                }
                if (((Mediabryo) (aa1)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
                {
                    r = null;
                    a(((S) (super.mFragments)), "EditionViewerFragment");
                    return;
                }
                if (((MediaMailingMetadata) (obj)).d().size() <= 1)
                {
                    if (p != null)
                    {
                        g.a(new Mj());
                        return;
                    }
                    if (q != null)
                    {
                        g.a(new Mk());
                        return;
                    }
                    if (((Mediabryo) (aa1)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA)
                    {
                        a(((Set) (((Mediabryo) (aa1)).mMediaMailingMetadata.d())));
                        return;
                    }
                }
                a(1);
                return;
            } while (true);
        } else
        {
            bd = (Bd)mediamailingmetadata;
            obj = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsSendSnapSource.CAMERA;
            if (b != null)
            {
                if (b.mOriginatingFragment == 1)
                {
                    obj = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsSendSnapSource.DOUBLE_TAP_FEED;
                } else
                if (b.mOriginatingFragment == 3)
                {
                    obj = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsSendSnapSource.DOUBLE_TAP_FRIENDS;
                }
                AnalyticsEvents.h(true);
            } else
            if (p != null)
            {
                obj = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsSendSnapSource.IN_CHAT;
            } else
            if (q != null)
            {
                obj = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsSendSnapSource.QUICK_SNAP;
            } else
            if (r != null)
            {
                obj = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsSendSnapSource.DOUBLE_TAP_DISCOVER;
            }
            if (!bd.mPostToStories.isEmpty())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            AnalyticsEvents.a(aa1, ((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsSendSnapSource) (obj)), flag1, flag, G.b(), mediamailingmetadata.d().size());
            continue;
        }
    }

    private void a(Uri uri)
    {
        if (uri == null)
        {
            return;
        }
        uri = SnapMediaUtils.a(uri, this);
        if (uri == null)
        {
            AlertDialogUtils.a(0x7f0801fc, this);
            return;
        }
        Bc.a a1 = new Bc.a();
        a1.mRawImageBitmap = uri;
        uri = ((Bc.a)((Bc.a)a1).a(com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA)).c();
        mUser = Br.a();
        if (mUser == null)
        {
            PG.b(new Runnable(uri) {

                private Bc a;
                private LandingPageActivity b;

                public final void run()
                {
                    b.mUser = Br.a(b);
                    Mf.a().a(new NV(a, SnapCaptureContext.SHARE_EXTENSION));
                }

            
            {
                b = LandingPageActivity.this;
                a = bc;
                super();
            }
            });
            return;
        } else
        {
            onSnapCapturedEvent(new NV(uri, SnapCaptureContext.SHARE_EXTENSION));
            return;
        }
    }

    static void a(LandingPageActivity landingpageactivity, SnapchatFragment snapchatfragment, boolean flag)
    {
        if ((snapchatfragment instanceof FeedFragment) && flag)
        {
            snapchatfragment = new Mh(CameraDisplayState.SHOW);
            landingpageactivity.onCameraStateEvent(snapchatfragment);
            landingpageactivity = (CameraFragment)landingpageactivity.a.a(2);
            if (landingpageactivity != null)
            {
                landingpageactivity.onCameraStateEvent(snapchatfragment);
            }
        }
    }

    private void a(SnapchatFragment snapchatfragment, String s1, boolean flag)
    {
        SnapchatFragment snapchatfragment1 = j();
        Object obj = super.mFragments;
        if ((snapchatfragment1 instanceof SnapPreviewFragment) && (snapchatfragment instanceof SnapPreviewFragment))
        {
            ((S) (obj)).c();
        }
        if (snapchatfragment1 != null)
        {
            snapchatfragment1.j(false);
        }
        int i1 = ((S) (obj)).e() - 1;
        if (i1 >= 0)
        {
            SnapchatFragment snapchatfragment2 = a(((S) (obj)), i1);
            if (snapchatfragment2 instanceof LeftSwipeContainerFragment)
            {
                ((LeftSwipeContainerFragment)snapchatfragment2).a.setLeftSwipeEnable(false);
            }
        }
        obj = ((S) (obj)).a();
        if (flag && snapchatfragment1 != null)
        {
            ((V) (obj)).b(snapchatfragment1);
        }
        ((V) (obj)).a(0x7f0d02fd, snapchatfragment, s1);
        ((V) (obj)).a(s1);
        try
        {
            ((V) (obj)).a();
            ad.post(new Runnable(snapchatfragment) {

                private SnapchatFragment a;

                public final void run()
                {
                    a.j(true);
                }

            
            {
                a = snapchatfragment;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SnapchatFragment snapchatfragment)
        {
            Timber.a("LandingPageActivity", snapchatfragment);
        }
    }

    private void a(Class class1)
    {
        C.d();
        startActivityForResult((new Intent(this, class1)).addFlags(0x4000000), 1002);
    }

    private void a(Set set)
    {
        if (set == null)
        {
            return;
        }
        if (set.size() == 1)
        {
            set = (Friend)el.a(set);
            if (!FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.CHAT_V2))
            {
                ChatFragment.a(set.g());
                set = (ChatFragment)a.a(0);
                if (set != null)
                {
                    set.b(true);
                }
            }
            a(0, false);
            a(0);
            return;
        } else
        {
            a(1);
            return;
        }
    }

    private boolean a(int i1, KeyEvent keyevent)
    {
        i1;
        JVM INSTR lookupswitch 5: default 52
    //                   19: 131
    //                   20: 131
    //                   21: 131
    //                   22: 131
    //                   82: 131;
           goto _L1 _L2 _L2 _L2 _L2 _L2
_L1:
        if ((a.mLastOnScrollPage == 2 || a.mLastOnScrollPage == -1) && !a.mIsScrolling)
        {
            g.a(new MU(i1, keyevent));
        }
        if (!i()) goto _L4; else goto _L3
_L3:
        if (i1 != 27 && i1 != 25 && i1 != 24 && i1 != 66) goto _L5; else goto _L2
_L2:
        return true;
_L4:
        boolean flag;
        if (h == null)
        {
            flag = false;
        } else
        {
            flag = Jo.a(h.getWindow());
        }
        if (!flag || keyevent.getAction() != 0 || i1 != 25 && i1 != 24)
        {
            break; /* Loop/switch isn't completed */
        }
        u();
        if (i1 == 24)
        {
            ah.a(1);
            return true;
        }
        if (i1 == 25)
        {
            ah.a(-1);
            return true;
        }
        if (true) goto _L2; else goto _L5
_L5:
        return false;
    }

    static boolean a(LandingPageActivity landingpageactivity)
    {
        landingpageactivity.aq = true;
        return true;
    }

    static boolean a(LandingPageActivity landingpageactivity, boolean flag)
    {
        landingpageactivity.u = flag;
        return flag;
    }

    static CameraEventAnalytics b(LandingPageActivity landingpageactivity)
    {
        return landingpageactivity.D;
    }

    private void b(AA aa1, boolean flag)
    {
        sI si = x;
        if (!((Mediabryo) (aa1)).mMediaMailingMetadata.d().isEmpty())
        {
            ((Mediabryo) (aa1)).mMediaMailingMetadata.c();
            si.a.a(aa1, com.snapchat.android.model.MediaMailingMetadata.SendStatus.SENDING_ON_UPLOAD);
        }
        if (((Mediabryo) (aa1)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.SNAP)
        {
            Bd bd = (Bd)((Mediabryo) (aa1)).mMediaMailingMetadata;
            if (!bd.mPostToStories.isEmpty())
            {
                bd.mShouldExecutePostStoryTaskAfterUpload = true;
                si.a.a(aa1, com.snapchat.android.model.MediaMailingMetadata.PostStatus.POSTING_ON_UPLOAD);
            }
        }
        a(aa1);
        a(aa1, flag);
    }

    private void b(Br br)
    {
        if (mUser.mTrophies == null)
        {
            (new Dl(br, null)).execute();
        }
    }

    static boolean b(LandingPageActivity landingpageactivity, boolean flag)
    {
        landingpageactivity.w = flag;
        return flag;
    }

    static kB c(LandingPageActivity landingpageactivity)
    {
        return landingpageactivity.ac;
    }

    private void c(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
        editor.putBoolean("snapchatUserIsLoggedIn", flag);
        editor.apply();
    }

    static Jn d(LandingPageActivity landingpageactivity)
    {
        return landingpageactivity.Y;
    }

    static LQ e(LandingPageActivity landingpageactivity)
    {
        return landingpageactivity.R;
    }

    static qj f(LandingPageActivity landingpageactivity)
    {
        return landingpageactivity.ak;
    }

    static kp g(LandingPageActivity landingpageactivity)
    {
        return landingpageactivity.W;
    }

    static void h(LandingPageActivity landingpageactivity)
    {
        if (landingpageactivity.s != null)
        {
            landingpageactivity.g.a(new wL(landingpageactivity.s.a, landingpageactivity.s.b, landingpageactivity.s.c, landingpageactivity.s.d));
            landingpageactivity.s = null;
        }
        landingpageactivity.a.setAnimating(false);
    }

    public static boolean k()
    {
        if (h == null)
        {
            return false;
        } else
        {
            return h.ao;
        }
    }

    public static SecureChatService n()
    {
        return c;
    }

    static void o()
    {
        if (c != null)
        {
            c.a();
            return;
        } else
        {
            Timber.e("LandingPageActivity", "Cannot start a session because sSecureChatService is null.", new Object[0]);
            return;
        }
    }

    private void t()
    {
        if (aa != null)
        {
            return;
        } else
        {
            ((ViewStub)findViewById(0x7f0d0301)).inflate();
            aa = new ku(this, (ViewGroup)findViewById(0x7f0d036a));
            return;
        }
    }

    private void u()
    {
        if (ah != null)
        {
            return;
        } else
        {
            ah = (CustomVolumeView)((ViewStub)findViewById(0x7f0d0302)).inflate().findViewById(0x7f0d01f2);
            return;
        }
    }

    private void v()
    {
        CameraViewFlipper cameraviewflipper = (CameraViewFlipper)findViewById(0x7f0d00af);
        if (cameraviewflipper != null && ((VerticalSwipeLayout) (cameraviewflipper)).c == 0)
        {
            cameraviewflipper.a(1, 0.0D);
        }
    }

    private boolean w()
    {
        boolean flag1 = false;
        Intent intent = getIntent();
        boolean flag = flag1;
        if (intent != null)
        {
            flag = flag1;
            if (intent.getBooleanExtra("fromServerNotification", false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean x()
    {
        boolean flag1 = false;
        Intent intent = getIntent();
        boolean flag = flag1;
        if (intent != null)
        {
            flag = flag1;
            if (intent.getBooleanExtra("chatOrCashFromServerNotification", false))
            {
                intent.removeExtra("chatOrCashFromServerNotification");
                flag = true;
            }
        }
        return flag;
    }

    private void y()
    {
        Intent intent = new Intent(this, com/snapchat/android/util/chat/SecureChatService);
        startService(intent);
        if (!bindService(intent, at, 1))
        {
            stopService(intent);
        }
    }

    private void z()
    {
        b().a(100, O);
    }

    protected final void a(int i1)
    {
        Timber.c("LandingPageActivity", "returnToFragment pageNumber %d", new Object[] {
            Integer.valueOf(i1)
        });
        Object obj = super.mFragments;
        SnapchatFragment snapchatfragment;
        try
        {
            ((S) (obj)).a(null, 1);
        }
        catch (IllegalStateException illegalstateexception)
        {
            Timber.a("LandingPageActivity", illegalstateexception);
        }
        a.setPagingEnabled(true);
        if (i1 == 0)
        {
            a.setChatFragmentAccessible(true);
        }
        a.setCurrentItem(i1, false);
        snapchatfragment = j();
        if (snapchatfragment != null)
        {
            snapchatfragment.j(true);
            obj = ((S) (obj)).f().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Fragment fragment = (Fragment)((Iterator) (obj)).next();
                if ((fragment instanceof SnapchatFragment) && !snapchatfragment.equals(fragment))
                {
                    ((SnapchatFragment)fragment).j(false);
                }
            } while (true);
        }
        r = null;
    }

    public final void a(int i1, boolean flag)
    {
        Timber.c("LandingPageActivity", "changePage pageNumber %d, smoothScroll %b", new Object[] {
            Integer.valueOf(i1), Boolean.valueOf(flag)
        });
        if (i1 == 0)
        {
            a.setChatFragmentAccessible(true);
        }
        if (i1 != 2)
        {
            g.a(new Mx());
        }
        a.setCurrentItem(i1, flag);
    }

    protected final void a(Br br)
    {
        super.a(br);
        Timber.c("LandingPageActivity", (new StringBuilder("onUserLoaded ")).append(br).toString(), new Object[0]);
        if (mUser != null && g())
        {
            c(true);
            AlertDialogUtils.b(this);
            AlertDialogUtils.a(this);
            if (w && mUser.mMessagingGatewayInfo != null)
            {
                o();
            }
        } else
        {
            HZ.a(this, false, true);
            c(false);
        }
        if (Bt.t() && v)
        {
            Bt.h(true);
            AnalyticsEvents.a();
            A();
            (new CJ(this)).a(this);
            if (mUser != null)
            {
                lX.a(false, true).execute();
                mUser.mHasReplayProductAvailableForPurchase = false;
                aj.a();
                b(mUser);
            }
            z();
            v = false;
        }
        if (Jd.c())
        {
            f.execute(new Runnable(br) {

                private Br a;
                private LandingPageActivity b;

                public final void run()
                {
                    Bs bs = b.e;
                    Br br1 = a;
                    if (bs.mLateLoading)
                    {
                        com.snapchat.android.database.table.DbTable.DatabaseTableGroup adatabasetablegroup[] = com.snapchat.android.database.table.DbTable.DatabaseTableGroup.values();
                        int j1 = adatabasetablegroup.length;
                        for (int i1 = 0; i1 < j1; i1++)
                        {
                            com.snapchat.android.database.table.DbTable.DatabaseTableGroup databasetablegroup = adatabasetablegroup[i1];
                            if (databasetablegroup.isLateLoading())
                            {
                                bs.a(databasetablegroup, br1);
                            }
                        }

                    }
                }

            
            {
                b = LandingPageActivity.this;
                a = br;
                super();
            }
            });
        }
    }

    public final void a(com.snapchat.android.app.feature.messaging.feed.ui.fragment.ReplayDialogFragment.ReplayDialogResult replaydialogresult, String s1)
    {
        qj qj1 = ak;
        Intent intent = getIntent();
        InAppBillingManager inappbillingmanager = aj;
        ChatConversation chatconversation = B.mConversationPressedForReplay;
        AT at1 = B.mSnapPressedForReplay;
        Br br = (Br)qj1.d.get();
        if (br == null)
        {
            qj1.a("REPLAY-LOG: user is null");
            return;
        }
        if (at1 == null)
        {
            qj1.a((new StringBuilder("REPLAY-LOG: receivedSnap is null for ")).append(s1).toString());
            return;
        }
        switch (qj._cls3.a[replaydialogresult.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Timber.c("SnapReplayController", "REPLAY-LOG: onDialogResult using credit to replay", new Object[0]);
            qj1.a(at1, chatconversation, br, true);
            br.a(at1);
            return;

        case 2: // '\002'
            Timber.c("SnapReplayController", "REPLAY-LOG: onDialogResult using daily free replay", new Object[0]);
            qj1.a(at1, chatconversation, br, false);
            return;

        case 3: // '\003'
            if (s1 == null)
            {
                qj1.a("REPLAY-LOG: product is null for paid replay");
                return;
            }
            Timber.c("SnapReplayController", (new StringBuilder("REPLAY-LOG: initiating purchase flow on sku: ")).append(s1).toString(), new Object[0]);
            aox aox1 = inappbillingmanager.a(s1);
            if (aox1 == null)
            {
                qj1.a((new StringBuilder("REPLAY-LOG: sku is null for ")).append(s1).toString());
                return;
            }
            replaydialogresult = qj1.e;
            double d1 = (double)aox1.d.a / 1000000D;
            s1 = aox1.d.b;
            gh gh1 = new gh();
            gh1.cashAmount = Double.valueOf(d1);
            gh1.cashCurrency = s1;
            ((lw) (replaydialogresult)).mBlizzardEventLogger.a(gh1);
            int i1;
            if (chatconversation == null)
            {
                boolean flag = false;
                at1.v();
                s1 = sz.b(at1.j());
                replaydialogresult = s1;
                i1 = ((flag) ? 1 : 0);
                if (s1 != null)
                {
                    qj1.c.a(new Mp(((ChatConversation) (s1)).mId, at1.d()));
                    i1 = ((flag) ? 1 : 0);
                    replaydialogresult = s1;
                }
            } else
            {
                chatconversation.t();
                i1 = 1;
                replaydialogresult = chatconversation;
            }
            intent.putExtra("goToFragmentNum", i1);
            if (replaydialogresult == null)
            {
                qj1.a("StartPurchaseFlow: cannot find conversation to start purchase flow");
                return;
            }
            replaydialogresult.x();
            replaydialogresult = (new TC()).a(Integer.valueOf(i1)).a(((ChatConversation) (replaydialogresult)).mId);
            replaydialogresult = (new Iz()).a(replaydialogresult);
            byte abyte0[] = CbcEncryptionAlgorithm.a();
            s1 = Bt.R().getBytes(dp.a);
            replaydialogresult = replaydialogresult.getBytes(dp.a);
            s1 = (new CbcEncryptionAlgorithm(s1, abyte0)).a(replaydialogresult, "no dataId provided");
            if (s1 != null)
            {
                replaydialogresult = s1;
            }
            replaydialogresult = (new StringBuilder()).append(Base64.encodeToString(abyte0, 0)).append(":").append(Base64.encodeToString(replaydialogresult, 0)).toString();
            inappbillingmanager.a(new qj._cls1(qj1, br, aox1, at1, chatconversation, inappbillingmanager));
            inappbillingmanager.a(aox1, replaydialogresult);
            return;

        case 4: // '\004'
            AnalyticsEvents.a(false, at1);
            return;
        }
    }

    public final void a(com.snapchat.android.ui.lenses.LensPurchaseDialog.LensPurchaseDialogResult lenspurchasedialogresult, BY by)
    {
        ra ra1;
        InAppBillingManager inappbillingmanager;
        ra1 = al;
        inappbillingmanager = aj;
        ra._cls4.a[lenspurchasedialogresult.ordinal()];
        JVM INSTR tableswitch 1 1: default 36
    //                   1 37;
           goto _L1 _L2
_L1:
        return;
_L2:
        Timber.i("LensesPurchaseController", "LENS-PURCHASE-LOG: initiating purchase flow on lens: %s", new Object[] {
            by
        });
        lenspurchasedialogresult = inappbillingmanager.a(by.mGplayIapId);
        if (lenspurchasedialogresult == null)
        {
            lenspurchasedialogresult = (new StringBuilder("LENS-PURCHASE-LOG: sku is null for ")).append(by.mGplayIapId).toString();
            if (ra1.a.c())
            {
                throw new RuntimeException((new StringBuilder("LensesPurchaseController: ")).append(lenspurchasedialogresult).toString());
            }
        } else
        {
            long l1 = ((aox) (lenspurchasedialogresult)).d.a;
            Object obj = ((aox) (lenspurchasedialogresult)).d.b;
            lk.b();
            inappbillingmanager.a(new ra._cls1(ra1, inappbillingmanager, by, lenspurchasedialogresult));
            obj = (new TB()).b(((BQ) (by)).mLensId).a(TB.a.LENS.value);
            ((TB) (obj)).c(KN.a((new StringBuilder()).append(((TB) (obj)).c()).append(Bt.r()).append(((TB) (obj)).a()).toString()));
            inappbillingmanager.a(lenspurchasedialogresult, Base64.encodeToString(ra1.b.a(obj).getBytes(dp.a), 0));
            ra1.c.a(((BQ) (by)).mLensId);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean a(int i1, SnapchatFragment snapchatfragment)
    {
        if (!m()) goto _L2; else goto _L1
_L1:
        if (a == null || ((ViewPager) (a)).mCurItem != i1) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (snapchatfragment != j())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void b(boolean flag)
    {
        t();
        ku ku1 = aa;
        ku1.a = flag;
        if (!ku1.a)
        {
            ku1.b.setVisibility(8);
        }
    }

    public final void c()
    {
        for (T t1 = super.mFragments; t1.e() > 0; t1.d()) { }
        g.a(new Mc());
        if (a != null)
        {
            a.setPagingEnabled(true);
        }
    }

    public final void d()
    {
        t();
        ku ku1 = aa;
        ku1.c = true;
        ku1.d.clear();
        if (ku1.f != null)
        {
            ku1.f.c();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag1;
        flag1 = false;
        if (!a.mIsPagingEnabled && a.mIsAnimating && m())
        {
            Timber.a("LandingPageActivity", "Animating pager while paging is disabled. Ignoring touch event.", new Object[0]);
            return true;
        }
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        R.a(new String[] {
            SnapchatViewPager.a(Integer.valueOf(a.mLastOnScrollPage))
        });
_L4:
        Object obj = j();
        if (motionevent.getAction() == 0)
        {
            motionevent.getRawX();
            motionevent.getRawY();
        }
        boolean flag;
        if ((obj instanceof CameraFragment) && ((CameraFragment)obj).a(motionevent))
        {
            return true;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
_L2:
        if (motionevent.getAction() != 1) goto _L4; else goto _L3
_L3:
        if (a.mIsScrolling) goto _L6; else goto _L5
_L5:
        obj = a;
        flag = flag1;
        if (((SnapchatViewPager) (obj)).mUserSwipedIntoChatEvent != null)
        {
            flag = flag1;
            if (((SnapchatViewPager) (obj)).mUserSwipedIntoChatEvent.mIsFlinging)
            {
                flag = true;
            }
        }
        if (!flag) goto _L4; else goto _L6
_L6:
        R.mDeferPause = true;
          goto _L4
    }

    public final void e()
    {
        t();
        aa.c = false;
    }

    public final void f()
    {
        T t1 = super.mFragments;
        int j1 = t1.e();
        for (int i1 = 0; i1 < j1 - 1; i1++)
        {
            SnapchatFragment snapchatfragment = a(t1, 0);
            t1.a().a(snapchatfragment).a();
        }

        v();
        a.setCurrentItem(4, false);
        g.a(new Mr(new com.snapchat.android.fragments.addfriends.AddFriendsFromCameraRollFragment.a() {

            private LandingPageActivity a;

            public final void a()
            {
                a.a(4);
            }

            
            {
                a = LandingPageActivity.this;
                super();
            }
        }));
    }

    final boolean g()
    {
        if (!Bt.B())
        {
            if (!Bt.t())
            {
                if (mUser != null)
                {
                    mUser.h();
                    return false;
                }
            } else
            {
                return true;
            }
        }
        return false;
    }

    public final boolean h()
    {
        return ((ViewPager) (a)).mCurItem == 3 && m();
    }

    public final boolean i()
    {
        return ((ViewPager) (a)).mCurItem == 2 && m();
    }

    public final SnapchatFragment j()
    {
        Object obj = super.mFragments;
        int i1 = ((S) (obj)).e();
        if (i1 > 0)
        {
            SnapchatFragment snapchatfragment = a(((S) (obj)), i1 - 1);
            obj = snapchatfragment;
            if (snapchatfragment instanceof LeftSwipeContainerFragment)
            {
                obj = ((LeftSwipeContainerFragment)snapchatfragment).h();
            }
            return ((SnapchatFragment) (obj));
        }
        if (a == null)
        {
            return null;
        } else
        {
            return a.a(((ViewPager) (a)).mCurItem);
        }
    }

    protected final void l()
    {
        int i1 = o.c() - 1;
        if (((ViewPager) (a)).mOffscreenPageLimit != i1)
        {
            a.setOffscreenPageLimit(i1);
        }
    }

    protected final boolean m()
    {
        return super.mFragments.e() == 0;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        aok aok1;
        l();
        aok1 = (aok)Z.a.get(i1);
        if (aok1 == null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        anR.a(51966, i1);
        if (intent == null)
        {
            Object obj;
            String s1;
            int k1;
            try
            {
                aok1.a(10003);
            }
            catch (RuntimeException runtimeexception)
            {
                aok1.a(runtimeexception);
            }
            catch (JSONException jsonexception)
            {
                aok1.a(jsonexception);
            }
            break MISSING_BLOCK_LABEL_44;
        }
        k1 = intent.getIntExtra("RESPONSE_CODE", 0);
        if (j1 != -1 || k1 != 0)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        obj = intent.getStringExtra("INAPP_PURCHASE_DATA");
        s1 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        anR.a(obj);
        anR.a(s1);
        obj = aoi.a(((String) (obj)), s1);
        aok1.b.a(Arrays.asList(new aoi[] {
            obj
        }), new aok.a(aok1, (byte)0));
        continue;
        aok1.a(k1);
        continue;
        (new StringBuilder("Purchase flow doesn't exist for requestCode=")).append(i1).append(". Have you forgotten to create it?");
        continue;
        do
        {
            Timber.c("LandingPageActivity", "Activity Request with code %d, and Result with code %d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            });
            if (j1 == 1)
            {
                onLogoutEvent(null);
                return;
            }
            super.onActivityResult(i1, j1, intent);
            switch (i1)
            {
            case 1002: 
            default:
                return;

            case 1001: 
                if (j1 == -1)
                {
                    setIntent(intent);
                    intent = SnapMediaUtils.a(intent.getData(), this);
                    if (intent == null)
                    {
                        AlertDialogUtils.a(0x7f0801fc, this);
                        return;
                    } else
                    {
                        mUser = Br.a(this);
                        Bc.a a1 = new Bc.a();
                        a1.mRawImageBitmap = intent;
                        a1 = (Bc.a)a1;
                        a1.mWidth = intent.getWidth();
                        a1 = (Bc.a)a1;
                        a1.mHeight = intent.getHeight();
                        onSnapCapturedEvent(new NV(((Bc.a)((Bc.a)a1).a(com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA)).c(), SnapCaptureContext.SHARE_EXTENSION));
                        return;
                    }
                }
                if (j1 == 0)
                {
                    return;
                }
                break;

            case 1003: 
                setIntent(intent);
                return;
                continue;
            }
            if (true || false)
            {
            }
        } while (true);
    }

    public void onBackPressed()
    {
        T t1;
        SnapchatFragment snapchatfragment;
        Timber.c("LandingPageActivity", "onBackPressed", new Object[0]);
        t1 = super.mFragments;
        t1.b();
        snapchatfragment = j();
        if (snapchatfragment != null) goto _L2; else goto _L1
_L1:
        super.onBackPressed();
_L9:
        return;
_L2:
        Object obj = B;
        if (((IX) (obj)).mMultiLeveledSnapView == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        obj = ((IX) (obj)).mMultiLeveledSnapView;
        VerticalSwipeLayout verticalswipelayout = ((MultiLeveledSnapView) (obj)).a;
        boolean flag1;
        if (verticalswipelayout.c != 0)
        {
            verticalswipelayout.a(0, 1.0D);
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = ((MultiLeveledSnapView) (obj)).b.c();
        }
        if (!flag1) goto _L4; else goto _L5
_L5:
        flag = true;
_L7:
        if (flag)
        {
            Timber.c("LandingPageActivity", "onBackPressed hiding snap", new Object[0]);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        if (snapchatfragment.f()) goto _L9; else goto _L8
_L8:
        snapchatfragment.j(false);
        int i1 = t1.e();
        if (i1 == 0)
        {
            switch (((ViewPager) (a)).mCurItem)
            {
            case 2: // '\002'
            default:
                a.setPagingEnabled(true);
                super.onBackPressed();
                return;

            case 0: // '\0'
                if (G.b())
                {
                    a(3);
                    return;
                } else
                {
                    a(1);
                    return;
                }

            case 1: // '\001'
                D.a(com.snapchat.android.analytics.CameraEventAnalytics.CameraContext.BACK_PRESSED);
                Timber.c("LandingPageActivity", "onBackPressed navigating to camera", new Object[0]);
                a(2);
                return;

            case 3: // '\003'
                D.a(com.snapchat.android.analytics.CameraEventAnalytics.CameraContext.BACK_PRESSED);
                Timber.c("LandingPageActivity", "onBackPressed navigating to camera", new Object[0]);
                a(2);
                return;

            case 4: // '\004'
                a(3);
                return;
            }
        }
        if (i1 == 1)
        {
            a(((ViewPager) (a)).mCurItem);
            return;
        } else
        {
            super.onBackPressed();
            a(t1, i1 - 1 - 1).j(true);
            return;
        }
    }

    public void onCameraStateEvent(Mh mh)
    {
        if (mh.a() && !getIntent().getBooleanExtra("deep_link_intent", false))
        {
            ai.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.SWIPED_DOWN);
        }
    }

    public void onCancelInChatSnapEvent(Mj mj)
    {
        int i1;
label0:
        {
            if (p != null)
            {
                i1 = p.mOriginatingFragment;
                p = null;
                if (mj.mShouldReturnToChatFragment)
                {
                    break label0;
                }
            }
            return;
        }
        a(i1);
        a(0, false);
    }

    public void onCancelQuickSnapEvent(Mk mk)
    {
        int i1;
label0:
        {
            if (q != null)
            {
                i1 = q.mOriginatingFragment;
                q = null;
                if (mk.mShouldReturnToChatFragment)
                {
                    break label0;
                }
            }
            return;
        }
        a(i1);
        a(0, false);
    }

    public void onCancelReplyEvent(Ml ml)
    {
        b = null;
        r = null;
        G.d();
    }

    public void onChangeBrightnessEvent(Mn mn)
    {
        android.view.WindowManager.LayoutParams layoutparams = getWindow().getAttributes();
        layoutparams.screenBrightness = mn.mBrightness;
        getWindow().setAttributes(layoutparams);
    }

    public void onChangeOrientationEvent(Mo mo)
    {
        while (getRequestedOrientation() == mo.mRequestedOrientation || mo.respectPhoneAutoRotateSetting && android.provider.Settings.System.getInt(getContentResolver(), "accelerometer_rotation", 1) == 0) 
        {
            return;
        }
        setRequestedOrientation(mo.mRequestedOrientation);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        boolean flag;
label0:
        {
            super.onConfigurationChanged(configuration);
            int i1 = Jo.e(this);
            if (n != i1)
            {
                n = i1;
                flag = Jo.f(this);
                Timber.a("LandingPageActivity", (new StringBuilder("Rotated to ")).append(i1).append(" isPortrait? ").append(flag).toString(), new Object[0]);
                configuration = H;
                if (((Jb) (configuration)).mIsImmersiveModeSupported && ((Jb) (configuration)).mDecorView != null)
                {
                    break label0;
                }
            }
            return;
        }
        configuration.a(flag, ((Jb) (configuration)).mIsImmersiveModeOn);
    }

    protected void onCreate(Bundle bundle)
    {
        ll.e();
        int i1 = (int)(ae.a("DELAY_APP_LAUNCH", "DELAYS_IN_SECONDS", 0.0F) * 1000F);
        if (i1 > 0)
        {
            PG.a(i1);
        }
        A.a(Jd.a.ACTIVITY_CREATE_CHECKPOINT$6dad94c5);
        C.a(this);
        F.a(w(), x());
        D.mEasyMetricManager.a("CAMERA_READY").b();
        U.b();
        NetworkAnalytics networkanalytics = E;
        networkanalytics.mFromNotification = w();
        networkanalytics.mStoryContentLoadedMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("CONTENT_LOADED").b();
        networkanalytics.mFeedContentLoadedMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("CONTENT_LOADED").b();
        super.onCreate(bundle);
        if (bundle != null)
        {
            an = false;
            p = (InChatSnapEvent)bundle.getParcelable("in_chat_snap_event");
            j = bundle.getInt("view_pager_index", 2);
            boolean flag = bundle.getBoolean("should_pop_fragments");
            Object obj;
            Window window;
            Resources resources;
            if (j == 2 && !mWaitingForActivityResult)
            {
                c();
                p = null;
            } else
            if (j == 0 && !mWaitingForActivityResult)
            {
                c();
            } else
            if (flag)
            {
                j = 2;
                c();
            }
        }
        Timber.c("LandingPageActivity", "Native free space = %d", new Object[] {
            Long.valueOf(Debug.getNativeHeapFreeSize())
        });
        bundle = getAssets();
        Iq.mRobotoBoldCondensed = Typeface.createFromAsset(bundle, "Roboto-BoldCondensed.ttf");
        agx.a = Typeface.createFromAsset(bundle, "Roboto-Light.ttf");
        g.c(this);
        m = true;
        bundle = d;
        PG.a();
        bundle.a = (LayoutInflater)getSystemService("layout_inflater");
        bundle.b = getResources();
        Timber.c("LandingPageActivity", "Landing Page Activity content view set", new Object[0]);
        setContentView(0x7f04008b);
        getWindow().setBackgroundDrawable(null);
        bundle = H;
        obj = getWindow();
        if (((Jb) (bundle)).mIsImmersiveModeSupported)
        {
            bundle.mDecorView = ((Window) (obj)).getDecorView();
            bundle.mWindow = ((Window) (obj));
            bundle.mDefaultRightPadding = ((Jb) (bundle)).mDecorView.getPaddingRight();
            bundle.mDefaultBottomPadding = ((Jb) (bundle)).mDecorView.getPaddingBottom();
        }
        a = (SnapchatViewPager)findViewById(0x7f0d02fe);
        af = (ViewStub)findViewById(0x7f0d02ff);
        try
        {
            a.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                private LandingPageActivity a;

                public final void onGlobalLayout()
                {
                    a.g.a(new MT());
                }

            
            {
                a = LandingPageActivity.this;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Timber.a("LandingPageActivity", bundle);
        }
        B = IX.a();
        ai = (MultiLeveledSnapView)findViewById(0x7f0d0300);
        B.mMultiLeveledSnapView = ai;
        ViewConfiguration.get(this).getScaledTouchSlop();
        ag = new qg(this, a, ai);
        Ka.a();
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            bundle = getWindow().getAttributes();
            bundle.rotationAnimation = 1;
            getWindow().setAttributes(bundle);
        }
        o = new ks(super.mFragments);
        a.setAdapter(o);
        ((aU) (o)).mObservable.notifyChanged();
        try
        {
            a.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                private LandingPageActivity a;

                public final void onGlobalLayout()
                {
                    a.g.a(new MT());
                }

            
            {
                a = LandingPageActivity.this;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Timber.a("LandingPageActivity", bundle);
        }
        a.setOnPageChangeListener(new android.support.v4.view.ViewPager.h() {

            private int a;
            private int b;
            private int c;
            private boolean d;
            private LandingPageActivity e;

            private void c(int j1)
            {
                Object obj2 = ((FragmentActivity) (e)).mFragments;
                boolean flag1;
                if (((S) (obj2)).e() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    return;
                }
                if (j1 == b && (b == 1 || b == 3))
                {
                    LandingPageActivity.b(e).mEasyMetricManager.b("CAMERA_DELAY", "");
                }
                Object obj1 = e.a.a(b);
                if (obj1 != null)
                {
                    Fragment fragment;
                    boolean flag2;
                    if (j1 != b)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    ((SnapchatFragment) (obj1)).a_(flag2);
                }
                obj1 = e.a.a(j1);
                if (obj1 != null)
                {
                    ((SnapchatFragment) (obj1)).j(true);
                    obj2 = ((S) (obj2)).f().iterator();
                    do
                    {
                        if (!((Iterator) (obj2)).hasNext())
                        {
                            break;
                        }
                        fragment = (Fragment)((Iterator) (obj2)).next();
                        if ((fragment instanceof SnapchatFragment) && !((SnapchatFragment) (obj1)).equals(fragment))
                        {
                            ((SnapchatFragment)fragment).j(false);
                        }
                    } while (true);
                }
                Timber.f("LandingPageActivity", (new StringBuilder("markFragmentVisibilityChanged to: ")).append(j1).append(" from: ").append(b).toString(), new Object[0]);
                b = j1;
                if (b == 4)
                {
                    LandingPageActivity.h(e);
                }
                obj1 = e.a;
                ((SnapchatViewPager) (obj1)).a(((ViewPager) (obj1)).mCurItem, ((SnapchatViewPager) (obj1)).getChildCount());
            }

            public final void a(int j1)
            {
                a = j1;
                if (j1 != 2)
                {
                    e.g.a(new Mx());
                }
                if (c == 0)
                {
                    if (b == 2)
                    {
                        LandingPageActivity.b(e).a(b, a);
                    }
                    c(a);
                }
                LandingPageActivity.c(e).c = SnapchatViewPager.a(Integer.valueOf(j1));
            }

            public final void a(int j1, float f1, int k1)
            {
                if (k1 == 0)
                {
                    if (a == b && d)
                    {
                        SnapchatFragment snapchatfragment = e.a.a(a);
                        if (!e.m())
                        {
                            j1 = 1;
                        } else
                        {
                            j1 = 0;
                        }
                        if (snapchatfragment != null && j1 == 0)
                        {
                            snapchatfragment.j(true);
                            if (b == 2)
                            {
                                ((CameraFragment)snapchatfragment).F();
                            }
                        }
                    }
                    d = false;
                } else
                if (!d)
                {
                    if (b != 2 && (j1 == 1 || j1 == 2))
                    {
                        LandingPageActivity.b(e).a(com.snapchat.android.analytics.CameraEventAnalytics.CameraContext.SWIPE);
                    }
                    SnapchatFragment snapchatfragment1;
                    boolean flag1;
                    if (k1 < e.a.getWidth() / 2)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    d = true;
                    snapchatfragment1 = e.a.a(a);
                    Timber.f("LandingPageActivity", (new StringBuilder("onScrollStart from: ")).append(a).toString(), new Object[0]);
                    if (snapchatfragment1 != null)
                    {
                        snapchatfragment1.f(flag1);
                        LandingPageActivity.a(e, snapchatfragment1, flag1);
                        return;
                    }
                }
            }

            public final void b(int j1)
            {
                Object obj1;
                Object obj2;
                long l1;
                obj1 = LandingPageActivity.d(e);
                obj2 = ScrollState.fromViewPagerState(j1);
                l1 = SystemClock.elapsedRealtime();
                Jn._cls1.$SwitchMap$com$snapchat$android$util$ScrollState[((ScrollState) (obj2)).ordinal()];
                JVM INSTR tableswitch 1 3: default 52
            //                           1 259
            //                           2 295
            //                           3 295;
                   goto _L1 _L2 _L3 _L3
_L1:
                obj1.mLastScrollState = ((ScrollState) (obj2));
                if (j1 != 0) goto _L5; else goto _L4
_L4:
                int k1;
                d = false;
                if (LandingPageActivity.e(e).mDeferPause)
                {
                    LandingPageActivity.e(e).b(new String[] {
                        SnapchatViewPager.a(Integer.valueOf(a)), "HORIZONTAL"
                    });
                }
                e.l();
                k1 = b;
                c(a);
                if (a != 0) goto _L7; else goto _L6
_L6:
                LandingPageActivity.f(e).g = "chat";
_L9:
                AnalyticsEvents.a(k1, a);
                LandingPageActivity.b(e).a(k1, a);
                obj1 = LandingPageActivity.g(e);
                k1 = a;
                obj1 = ((kp) (obj1)).c;
                obj2 = com.snapchat.android.analytics.battery.BatteryUsageTimer.TimerType.fromPagerId(k1);
                Iterator iterator = ((ly) (obj1)).c.values().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    BatteryUsageTimer batteryusagetimer = (BatteryUsageTimer)iterator.next();
                    if (batteryusagetimer.b.isPage())
                    {
                        batteryusagetimer.c();
                    }
                } while (true);
                break; /* Loop/switch isn't completed */
_L2:
                if (((Jn) (obj1)).mLastScrollPeriod.a())
                {
                    ((Jn) (obj1)).mLastScrollPeriod.mEnd = l1;
                } else
                {
                    ((Jn) (obj1)).mLastScrollPeriod.a(l1, l1);
                }
                continue; /* Loop/switch isn't completed */
_L3:
                if (((Jn) (obj1)).mLastScrollState == ScrollState.IDLE || ((Jn) (obj1)).mLastScrollState == ScrollState.UNKNOWN)
                {
                    ((Jn) (obj1)).mLastScrollPeriod.a(l1, 0x7fffffffffffffffL);
                }
                continue; /* Loop/switch isn't completed */
_L7:
                if (a == 1)
                {
                    LandingPageActivity.f(e).g = "feed";
                }
                if (true) goto _L9; else goto _L8
_L8:
                if (obj2 != null)
                {
                    ((BatteryUsageTimer)((ly) (obj1)).c.get(obj2)).b();
                }
_L5:
                c = j1;
                return;
                if (true) goto _L1; else goto _L10
_L10:
            }

            
            {
                e = LandingPageActivity.this;
                super();
                a = ((ViewPager) (e.a)).mCurItem;
                b = ((ViewPager) (e.a)).mCurItem;
                c = 0;
                d = false;
            }
        });
        bundle = V;
        bundle.b = a;
        bundle.a = this;
        L.a(this);
        LI.a(this);
        bundle = P;
        obj = ad;
        window = getWindow();
        resources = getResources();
        bundle.mHandler = ((Handler) (obj));
        bundle.mWindow = window;
        bundle.mResources = resources;
        if (!X.b())
        {
            bundle = X;
            ((qk) (bundle)).a.execute(new qk._cls1(bundle));
        }
        Z = anS.a(this, SnapchatApplication.getBilling(), qr.b());
        Z.b();
        ak = new qj(ai);
        aj = new InAppBillingManager(Z);
        aj.a(ak.f);
        aj.a(al.d);
        onTitleBarEvent(new OC(com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN));
        (new mF()).execute();
        ll.f();
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (m)
        {
            g.b(this);
        }
        unregisterReceiver(L);
        m = false;
        Bt.r(false);
        Z.a();
        qj qj1 = ak;
        qj1.a.b(qj1.b);
        LI.a();
        W.c.a();
    }

    public void onDisplayInAppNotificationEvent(MA ma)
    {
        t();
        aa.a(ma);
    }

    public void onEditionClosedEvent(wJ wj)
    {
        T t1 = super.mFragments;
        int i1 = t1.e() - 1;
        if (i1 >= 0)
        {
            SnapchatFragment snapchatfragment = a(t1, i1);
            if (snapchatfragment != null)
            {
                snapchatfragment.j(false);
            }
        }
        if (wj.b == MediaOpenOrigin.STORIES)
        {
            a(3);
            return;
        }
        if (wj.b == MediaOpenOrigin.CAMERA_QR_SCAN)
        {
            a(2);
            return;
        }
        if (wj.b == MediaOpenOrigin.PROFILE_ROLL_QR_SCAN || wj.b == MediaOpenOrigin.PREVIEW_QR_SCAN)
        {
            if (t1.e() > 0)
            {
                t1.d();
                return;
            } else
            {
                a(2);
                return;
            }
        } else
        {
            a(4);
            return;
        }
    }

    public void onEnableLargeUiUpdatesOnFragment(ME me)
    {
        if (a != null)
        {
            if ((me = a.a(me.pageNumber)) != null && !((SnapchatFragment) (me)).mAreLargeUiUpdatesEnabled)
            {
                me.d();
                return;
            }
        }
    }

    public void onForceVerificationEvent(MH mh)
    {
        Bt.p(true);
        (new android.app.AlertDialog.Builder(this)).setTitle(0x7f08017d).setMessage(mh.mErrorMessage).setCancelable(false).setPositiveButton(0x7f08017e, new android.content.DialogInterface.OnClickListener() {

            private LandingPageActivity a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                PhoneVerificationAnalytics.a(false, Bt.e());
                a.g.a(new Oi(new SettingsPhoneVerificationFragment((byte)0)));
            }

            
            {
                a = LandingPageActivity.this;
                super();
            }
        }).setNegativeButton(0x7f08017c, new android.content.DialogInterface.OnClickListener() {

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                PhoneVerificationAnalytics.a(true, Bt.e());
                dialoginterface.cancel();
            }

        }).show();
    }

    public void onGetCurrentActivityEvent(MQ mq)
    {
    }

    public void onImageSnapBitmapReadyForSnapPreview(MX mx)
    {
        mx = mx.mBitmap;
        SnapPreviewFragment snappreviewfragment = (SnapPreviewFragment)super.mFragments.a("PreviewFragment");
        if (snappreviewfragment != null)
        {
            snappreviewfragment.a.mRawImageBitmap = mx;
            snappreviewfragment.d.setMediabryo(snappreviewfragment.a);
            snappreviewfragment.e.b();
            return;
        } else
        {
            l.mMediabryo.mRawImageBitmap = mx;
            return;
        }
    }

    public void onInAppNotificationEvent(MY my)
    {
        Object obj = j();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        my = ab;
        obj1 = ((SnapchatFragment) (obj)).k();
        obj = af;
        PG.a();
        if (obj1 == null || ((CG) (my)).b || ((CG) (my)).c) goto _L1; else goto _L3
_L3:
        obj1 = my.a(((CF) (obj1)));
        if (obj1 == null) goto _L1; else goto _L4
_L4:
        Timber.b("InAppNotificationPresenter", "displayInAppNotification sender:%s type:%s snapId:%s", new Object[] {
            ((CG.a) (obj1)).a, ((CG.a) (obj1)).c.name(), ((CG.a) (obj1)).d
        });
        my.a(((ViewStub) (obj)));
        my.b = true;
        ((InAppPromptView)((CG) (my)).a.findViewById(0x7f0d0312)).set(((CG.a) (obj1)));
        ((CG) (my)).a.a();
        long l1 = ((CG.a) (obj1)).e;
        synchronized (((CG) (my)).d)
        {
            Iterator iterator = ((CG) (my)).d.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((CG.a)iterator.next()).e != l1)
                {
                    continue;
                }
                iterator.remove();
                break;
            } while (true);
        }
        ((CG) (my)).a.postDelayed(new CG._cls1(my), 2500L);
        return;
        my;
        list;
        JVM INSTR monitorexit ;
        throw my;
    }

    public void onInChatSnapEvent(InChatSnapEvent inchatsnapevent)
    {
        if (a != null)
        {
            Timber.c("LandingPageActivity", "onInChatSnapEvent navigating to camera", new Object[0]);
            a.setCurrentItem(2, false);
        }
        p = inchatsnapevent;
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (a(i1, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (a(i1, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    public void onLeaveInAppNotificationPosterEvent(Na na)
    {
        t();
        aa.a(na.sourceId);
    }

    public void onLogoutEvent(Nk nk)
    {
        if (c != null)
        {
            nk = c;
            Timber.f("SecureChatService", "CHAT-LOG: SecureChatService STOP SESSION", new Object[0]);
            ((SecureChatService) (nk)).mSecureChatSession.c();
        }
        AlertDialogUtils.a(0x7f080326, this);
        HZ.a(this, false, false);
    }

    public void onMessagingGatewayInfoUpdatedEvent(Nm nm)
    {
        if (c == null)
        {
            y();
            return;
        } else
        {
            o();
            return;
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        am = true;
        setIntent(intent);
        ll ll1 = C;
        if (intent.getBooleanExtra("deep_link_intent", false))
        {
            ll1.mDeepLinkOpenMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("DEEP_LINK_OPEN").b();
        }
    }

    protected void onPause()
    {
        super.onPause();
        Object obj = C;
        if (((ll) (obj)).mAppSessionMetric != null)
        {
            ((ll) (obj)).mAppSessionMetric.d();
            ((ll) (obj)).mAppSessionMetric.b(false);
            obj.mAppSessionMetric = null;
        }
        h = null;
        g.a(new OC(com.snapchat.android.util.TitleBarManager.LockedState.NOT_LOCKED));
        if (c != null)
        {
            c.mIsAppInForeground = false;
        }
        I.e = false;
        K.a(false);
        obj = j();
        if (obj != null)
        {
            ((SnapchatFragment) (obj)).m_();
            ap = ((SnapchatFragment) (obj)).p_();
            long l1 = ((SnapchatFragment) (obj)).r();
            if (l1 >= 0L)
            {
                Timber.a("LandingPageActivity", (new StringBuilder("Schedule to set flag to pop stacked fragments after ")).append(l1).append(" ms.").toString(), new Object[0]);
                ad.postDelayed(ar, l1);
            }
        }
        M.c();
        ai.a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.ENTER_BACKGROUND);
        g.b(a);
        g.b(this);
        m = false;
        T.b();
        if (mUser != null)
        {
            mUser.i();
            vJ vj = J;
            vj.e.post(vj.a(new vJ._cls4(vj)));
        }
        R.b(new String[] {
            "Unknown", "HORIZONTAL"
        });
        S.b(new String[0]);
        kG.a().mIndustryExclusionManager.mAdUnitToIndustryMap.clear();
        W.c.a();
    }

    public void onPushDelayedInAppNotificationEvent(NB nb)
    {
        t();
        ku ku1 = aa;
        nb = nb.sourceId;
        CI ci = (CI)ku1.e.get(nb);
        ku1.e.remove(nb);
        if (ci != null)
        {
            ku1.a(ci, false);
        }
    }

    public void onQuickSnapEvent(QuickSnapEvent quicksnapevent)
    {
        if (a != null)
        {
            Timber.c("LandingPageActivity", "onQuickSnapEvent navigating to camera", new Object[0]);
            a.setCurrentItem(2, false);
        }
        q = quicksnapevent;
    }

    public void onReCreateCheckoutEvent(ND nd)
    {
        if (Z != null)
        {
            Z.a();
            Z = anS.a(this, SnapchatApplication.getBilling(), qr.b());
            Z.b();
            nd = aj;
            nd.a = Z;
            if (((InAppBillingManager) (nd)).b != null)
            {
                nd.b = null;
                nd.a();
            }
            g.a(new NA());
        }
    }

    public void onRecentStoryReplyEvent(NF nf)
    {
        lq lq1 = G;
        Timber.a("RecentStoryReplyAnalyticsManager", (new StringBuilder("startReplying to ")).append(nf.friendUsername).toString(), new Object[0]);
        lq1.mRecentStoryReplyEvent = nf;
        lq1.mHasReplied = false;
        a(0, false);
    }

    public void onReplaceInAppNotificationEvent(NK nk)
    {
        t();
        if (aa.a(nk.sourceId))
        {
            aa.a(nk.newEvent);
        }
    }

    public void onReplySnapEvent(NL nl)
    {
        b = nl;
        c();
        Timber.c("LandingPageActivity", "onReplySnapEvent navigating to camera", new Object[0]);
        a.setCurrentItem(2, false);
    }

    protected void onRestart()
    {
        A.a(Jd.a.ACTIVITY_RESTART_CHECKPOINT$6dad94c5);
        C.a(this);
        F.a(w(), x());
        D.mEasyMetricManager.a("CAMERA_READY").b();
        U.b();
        E.mFromNotification = w();
        super.onRestart();
    }

    protected void onResume()
    {
        boolean flag;
        boolean flag3;
        flag3 = false;
        ll.e();
        super.onResume();
        h = this;
        if (c != null)
        {
            c.mIsAppInForeground = true;
        }
        I.e = true;
        K.a(true);
        ad.removeCallbacks(ar);
        if (!m)
        {
            g.c(this);
        }
        g.c(a);
        if (mUser == null)
        {
            v = true;
        } else
        {
            if (!g())
            {
                C.d();
                HZ.a(this, false, true);
                c(false);
                return;
            }
            AnalyticsEvents.a();
            A();
            (new CJ(this)).a(this);
            lX.a(false, true).execute();
            b(mUser);
            Bj.a().f();
            z();
            mUser.mHasReplayProductAvailableForPurchase = false;
            aj.a();
        }
        Timber.c("LandingPageActivity", (new StringBuilder("openTermsOfUseIfNeeded [isLoggedIn ")).append(Bt.u()).append("] [getTermsOfUseEnabled ").append(LA.k()).append("] [hasAcceptedTermsOfUse914 ").append(Bt.ae()).append("] [getShowTermsOfUse ").append(LA.i()).append("] ").toString(), new Object[0]);
        if (!Bt.u()) goto _L2; else goto _L1
_L1:
        if (!LA.k()) goto _L4; else goto _L3
_L3:
        if (Bt.ae() && !LA.i()) goto _L2; else goto _L5
_L5:
        a(com/snapchat/android/TermsOfUseActivity);
        flag = true;
_L9:
        if (!flag) goto _L7; else goto _L6
_L6:
        return;
_L4:
        if (Bt.ag() && !LA.i()) goto _L2; else goto _L8
_L8:
        a(com/snapchat/android/ScAcceptTermsActivity);
        flag = true;
          goto _L9
_L2:
        flag = false;
          goto _L9
_L7:
        Object obj1;
        kp kp1 = W;
        obj1 = kp1.c;
        obj1.e = 0;
        ((ly) (obj1)).b(null);
        kp1.a(Cl.a());
        if (((KeyguardManager)getSystemService("keyguard")).inKeyguardRestrictedInputMode())
        {
            k = true;
        }
        Timber.c("LandingPageActivity", "setInitialFragment", new Object[0]);
        obj1 = getIntent();
        if (ap || ((Intent) (obj1)).getBooleanExtra("deep_link_processed", false) || !((Intent) (obj1)).getBooleanExtra("deep_link_intent", false)) goto _L11; else goto _L10
_L10:
        Object obj;
        Object obj2;
        obj = V;
        obj2 = ((Intent) (obj1)).getData();
        Object aobj[];
        int i1;
        if (!Bt.u())
        {
            Timber.a("DeepLinkManager", "User is not logged in. Cannot parse deep link.", new Object[0]);
            i1 = 0;
        } else
        if (!((un) (obj)).a(((Uri) (obj2))))
        {
            Timber.d("DeepLinkManager", "Couldn't validate deeplink uri", new Object[0]);
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (i1 == 0) goto _L11; else goto _L12
_L12:
        c();
        v();
        V.a(((Intent) (obj1)).getData(), MediaOpenOrigin.EXTERNAL);
        obj = new Intent(getIntent());
        ((Intent) (obj)).putExtra("deep_link_processed", true);
        setIntent(((Intent) (obj)));
        l();
_L16:
        obj = j();
        if (obj != null)
        {
            ((SnapchatFragment) (obj)).j(true);
        }
        obj = getIntent();
        if (!an && !am)
        {
            obj1 = ((Intent) (obj)).getAction();
            if (TextUtils.equals(((CharSequence) (obj1)), "android.intent.action.SEND") || TextUtils.equals(((CharSequence) (obj1)), "android.intent.action.SEND_MULTIPLE"))
            {
                ((Intent) (obj)).setAction("android.intent.action.MAIN");
                setIntent(((Intent) (obj)));
            }
        }
        an = false;
        am = false;
        boolean flag2;
        if (obj != null)
        {
            obj1 = ((Intent) (obj)).getAction();
            obj2 = ((Intent) (obj)).getType();
            if (TextUtils.equals("android.intent.action.SEND", ((CharSequence) (obj1))) && obj2 != null)
            {
                if ("text/plain".equals(obj2) || "message/rfc822".equals(obj2))
                {
                    obj1 = ((Intent) (obj)).getStringExtra("android.intent.extra.TITLE");
                    obj = ((Intent) (obj)).getStringExtra("android.intent.extra.TEXT");
                    obj2 = dr.a("\n").a();
                    aobj = new Object[0];
                    dv.a(((Object) (aobj)));
                    obj = ((dr) (obj2)).a(new dr._cls3(aobj, obj1, obj));
                    int j1;
                    long l1;
                    if (((String) (obj)).length() > 500)
                    {
                        AlertDialogUtils.a("Sorry! The text is too long to send.", this);
                    } else
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        obj1 = new Ca.a();
                        obj1.mText = ((String) (obj));
                        a(SendToFragment.a(((Ca.a) (obj1)).b()), "SendToFrag", true);
                    }
                } else
                if (((String) (obj2)).startsWith("image/"))
                {
                    a((Uri)((Intent) (obj)).getParcelableExtra("android.intent.extra.STREAM"));
                }
            } else
            if (TextUtils.equals("android.intent.action.SEND_MULTIPLE", ((CharSequence) (obj1))) && obj2 != null)
            {
                if (((String) (obj2)).startsWith("image/"))
                {
                    obj = ((Intent) (obj)).getParcelableArrayListExtra("android.intent.extra.STREAM");
                    if (obj != null && !((ArrayList) (obj)).isEmpty())
                    {
                        a((Uri)((ArrayList) (obj)).get(0));
                    }
                }
            } else
            {
                if (((Intent) (obj)).getBooleanExtra("fromServerNotification", false))
                {
                    lo.c(((Intent) (obj)).getStringExtra("type"));
                    ((Intent) (obj)).removeExtra("fromServerNotification");
                }
                if (((Intent) (obj)).getBooleanExtra("recovery_code_used", false))
                {
                    AlertDialogUtils.b(this, getString(0x7f0802ff), getString(0x7f0802fe));
                    ((Intent) (obj)).removeExtra("recovery_code_used");
                }
                AnalyticsEvents.g(((Intent) (obj)).getBooleanExtra("fromNotification", false));
                ((Intent) (obj)).removeExtra("fromNotification");
            }
        } else
        {
            AnalyticsEvents.g(false);
        }
        obj = PreferenceManager.getDefaultSharedPreferences(this);
        if (((SharedPreferences) (obj)).contains("RESUMING_FROM_SWIPE_MESSAGE"))
        {
            AlertDialogUtils.b(this, getResources().getString(0x7f0802c7), ((SharedPreferences) (obj)).getString("RESUMING_FROM_SWIPE_MESSAGE", ""));
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).remove("RESUMING_FROM_SWIPE_MESSAGE");
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
        if (Bt.t())
        {
            DeviceTokenManager.getInstance().checkForDeviceTokenAsynchronously();
            Pk.a();
            Pk.b();
        }
        if (Bt.al())
        {
            M.b();
        }
        obj = H;
        flag2 = Jo.f(this);
        if (((Jb) (obj)).mIsImmersiveModeSupported && ((Jb) (obj)).mDecorView != null)
        {
            Timber.a("SoftNavigationBarManager", "adding flags and padding onresume", new Object[0]);
            ((Jb) (obj)).mWindow.addFlags(0x8000000);
            obj.mDefaultFlags = ((Jb) (obj)).mDecorView.getSystemUiVisibility() | 0x100 | 0x400;
            ((Jb) (obj)).mDecorView.setSystemUiVisibility(((Jb) (obj)).mDefaultFlags);
            ((Jb) (obj)).mDecorView.setBackgroundColor(0xff000000);
            ((Jb) (obj)).a(flag2, ((Jb) (obj)).mIsImmersiveModeOn);
        }
        ll.f();
        S.a(new String[0]);
        obj = (DevicePolicyManager)getSystemService("device_policy");
        if (obj != null)
        {
label0:
            {
                i1 = ((DevicePolicyManager) (obj)).getStorageEncryptionStatus();
                if (i1 != 2)
                {
                    flag2 = flag3;
                    if (i1 != 3)
                    {
                        break label0;
                    }
                }
                flag2 = true;
            }
            ao = flag2;
            return;
        }
          goto _L6
_L11:
        if (aq)
        {
            c();
            aq = false;
        } else
        if (((Intent) (obj1)).getBooleanExtra("fromServerNotification", false) && !ap)
        {
            c();
        }
        j1 = ((Intent) (obj1)).getIntExtra("goToFragmentNum", 2);
        flag2 = m();
        if (flag2 && uo.a(((Intent) (obj1))) != null)
        {
            j1 = 3;
        } else
        if (!flag2 || j1 == 2)
        {
            if (ChatFragment.s() || ChatFragment.q())
            {
                j1 = 0;
            } else
            if (flag2 && (j == 4 || j == 3))
            {
                j1 = 2;
            } else
            {
                j1 = j;
            }
        }
        if (j1 != 2)
        {
            l();
        }
        j1;
        JVM INSTR tableswitch 0 1: default 1004
    //                   0 1124
    //                   1 1362;
           goto _L13 _L14 _L15
_L13:
        a.setCurrentItem(j1, false);
        ((Intent) (obj1)).putExtra("goToFragmentNum", 2);
        setIntent(((Intent) (obj1)));
          goto _L16
_L14:
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.CHAT_V2)) goto _L18; else goto _L17
_L17:
        obj = ((Intent) (obj1)).getStringExtra("friendUsername");
        boolean flag1;
        if (ChatFragment.s() && (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.equals(((CharSequence) (obj)), Ks.b(ChatFragment.b))))
        {
            ((AlarmManager)getSystemService("alarm")).cancel(ChatFragment.a);
            obj = Ks.b(ChatFragment.b);
            ChatFragment.t();
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L20; else goto _L19
_L19:
        Timber.f("LandingPageActivity", "[Conversation] initChatFragment setFriendUsername: %s.", new Object[] {
            obj
        });
        ChatFragment.a(((String) (obj)));
        obj2 = (ChatFragment)a.a(0);
        if (obj2 != null)
        {
            if (!flag1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((ChatFragment) (obj2)).b(flag2);
        }
        flag2 = ((Intent) (obj1)).getBooleanExtra("fromServerNotification", false);
        l1 = ((Intent) (obj1)).getLongExtra("seq_num", 0L);
        if (!flag2 || l1 == 0L) goto _L20; else goto _L21
_L21:
        obj = By.c().a(((String) (obj)));
        if (obj == null) goto _L23; else goto _L22
_L22:
        if (((ChatConversation) (obj)).mLastSeqNumOfTheirChatIReleased < l1) goto _L25; else goto _L24
_L24:
        AnalyticsEvents.C();
_L20:
        ((Intent) (obj1)).removeExtra("friendUsername");
_L18:
        a.setChatFragmentAccessible(true);
        ak.g = "chat";
          goto _L13
_L25:
        if (((ChatConversation) (obj)).mTheirLastSeqNum >= l1) goto _L20; else goto _L23
_L23:
        AnalyticsEvents.B();
          goto _L20
_L15:
        flag2 = ((Intent) (obj1)).getBooleanExtra("fromServerNotification", false);
        obj = ((Intent) (obj1)).getStringExtra("snap_id");
        obj2 = ((Intent) (obj1)).getStringExtra("friendUsername");
        if (flag2 && !TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj2 = sz.b(((String) (obj2)));
            if (obj2 != null && obj != null)
            {
                lo.a(((ChatConversation) (obj2)), (new StringBuilder()).append(((String) (obj))).append('r').toString());
            }
        }
        ak.g = "feed";
          goto _L13
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (p != null)
        {
            bundle.putParcelable("in_chat_snap_event", p);
        }
        SnapchatFragment snapchatfragment = j();
        if (snapchatfragment != null && snapchatfragment.k_())
        {
            bundle.putBoolean("should_pop_fragments", true);
        }
        if (!m())
        {
            j = ((ViewPager) (a)).mCurItem;
            bundle.putInt("view_pager_index", j);
            return;
        } else
        {
            j = 2;
            return;
        }
    }

    public void onSetPagingEnabledEvent(NT nt)
    {
        a.setPagingEnabled(nt.enablePaging);
    }

    public void onShareDSnapEvent(wK wk)
    {
        r = wk;
        Object obj = r.a;
        float f1 = wk.b;
        float f2 = wk.c;
        Object obj1 = ((DSnapView) (obj)).b(((DSnapView) (obj)).k());
        int i1;
        if (((DSnapView) (obj)).h == null || obj1 == null)
        {
            i1 = 0;
        } else
        {
            long l2;
            boolean flag;
            if (((DSnapView) (obj)).k() == com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP.getIndex())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l2 = SystemClock.elapsedRealtime() - ((DSnapView) (obj)).m;
            wk = ((wd) (obj1)).h();
            if (!((DSnapView) (obj)).h.r)
            {
                obj1 = IC.a(0x7f080115, new Object[] {
                    ((DSnapView) (obj)).i.b
                });
                ((DSnapView) (obj)).s.a(new MA(((CharSequence) (obj1)), ((DSnapView) (obj)).i.g, ((DSnapView) (obj)).i.h, ((DSnapView) (obj)).j()));
                obj1 = ((DSnapView) (obj)).r;
                String s1 = ((DSnapView) (obj)).h.j;
                String s2 = ((DSnapView) (obj)).h.i;
                String s3 = ((DSnapView) (obj)).h.a;
                int j1 = ((DSnapView) (obj)).h.h.intValue();
                int k1 = ((DSnapView) (obj)).p.d(((DSnapView) (obj)).h.i);
                i1 = ((DSnapView) (obj)).h.m.intValue();
                Object obj2 = ((DSnapView) (obj)).h.d;
                int l1 = ((DSnapView) (obj)).h.g;
                int i2 = ((DSnapView) (obj)).p.e(((DSnapView) (obj)).h.i);
                obj = ((DSnapView) (obj)).g.c.getSourceType();
                if (i1 == 0)
                {
                    if (flag)
                    {
                        obj2 = new hf();
                        obj2.publisherId = s1;
                        obj2.dsnapId = s3;
                        obj2.editionId = s2;
                        obj2.timeViewed = Double.valueOf(Jk.a(l2, 1));
                        obj2.mediaType = DiscoverUsageAnalytics.a(wk);
                        obj2.source = ((jQ) (obj));
                        if (k1 < 0)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                        if (i1 == 0)
                        {
                            obj2.snapIndexCount = Long.valueOf(k1);
                            obj2.snapIndexPos = Long.valueOf(j1 + 1);
                        }
                        ((DiscoverUsageAnalytics) (obj1)).a.a(((kl) (obj2)));
                    } else
                    {
                        obj2 = new gZ();
                        obj2.publisherId = s1;
                        obj2.dsnapId = s3;
                        obj2.editionId = s2;
                        obj2.longformType = DiscoverUsageAnalytics.b(wk);
                        obj2.timeViewed = Double.valueOf(Jk.a(l2, 1));
                        obj2.source = ((jQ) (obj));
                        if (k1 < 0)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                        if (i1 == 0)
                        {
                            obj2.snapIndexCount = Long.valueOf(k1);
                            obj2.snapIndexPos = Long.valueOf(j1 + 1);
                        }
                        ((DiscoverUsageAnalytics) (obj1)).a.a(((kl) (obj2)));
                    }
                } else
                if (flag)
                {
                    gM gm = new gM();
                    gm.publisherId = s1;
                    gm.adsnapId = ((String) (obj2));
                    gm.editionId = s2;
                    gm.timeViewed = Double.valueOf(Jk.a(l2, 1));
                    gm.mediaType = DiscoverUsageAnalytics.a(wk);
                    gm.source = ((jQ) (obj));
                    if (k1 < 0)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 == 0)
                    {
                        gm.snapIndexCount = Long.valueOf(k1);
                        gm.snapIndexPos = Long.valueOf(j1 + 1);
                        gm.adIndexPos = Long.valueOf(l1);
                        gm.adIndexCount = Long.valueOf(i2);
                    }
                    ((DiscoverUsageAnalytics) (obj1)).a.a(gm);
                } else
                {
                    gG gg = new gG();
                    gg.publisherId = s1;
                    gg.adsnapId = ((String) (obj2));
                    gg.editionId = s2;
                    gg.timeViewed = Double.valueOf(Jk.a(l2, 1));
                    gg.longformType = DiscoverUsageAnalytics.b(wk);
                    gg.source = ((jQ) (obj));
                    if (k1 < 0)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 == 0)
                    {
                        gg.snapIndexCount = Long.valueOf(k1);
                        gg.snapIndexPos = Long.valueOf(j1 + 1);
                        gg.adIndexPos = Long.valueOf(l1);
                        gg.adIndexCount = Long.valueOf(i2);
                    }
                    ((DiscoverUsageAnalytics) (obj1)).a.a(gg);
                }
                i1 = 0;
            } else
            {
                obj.l = ((DSnapView) (obj)).c.c;
                if (obj1 != null)
                {
                    if (((wd) (obj1)).h() == com.snapchat.android.discover.model.DSnapPanel.MediaType.REMOTE_VIDEO)
                    {
                        wd wd1 = ((DSnapView) (obj)).b(com.snapchat.android.discover.model.DSnapPage.Form.TOP_SNAP.getIndex());
                        if (wd1 != null)
                        {
                            obj1 = ((DSnapView) (obj)).e;
                            VerticalSwipeLayout verticalswipelayout = ((DSnapView) (obj)).c;
                            wk = new com.snapchat.android.discover.ui.DSnapView._cls3(((DSnapView) (obj)), f1, f2, wd1, flag, wk, l2);
                            if (verticalswipelayout.c <= 0)
                            {
                                i1 = 0;
                            } else
                            {
                                obj1.a = verticalswipelayout.getChildAt(0);
                                i1 = ((wq) (obj1)).a.getMeasuredHeight();
                                ((wq) (obj1)).a.setVisibility(4);
                                verticalswipelayout.removeView(((wq) (obj1)).a);
                                ((DSnapView) (obj)).addView(((wq) (obj1)).a);
                                ((wq) (obj1)).a.setTop(-i1);
                                i1 = 1;
                            }
                            if (i1 == 0)
                            {
                                Timber.a("TopSnapSlideAnimator", "Could not prepare animation. Skipping animation.", new Object[0]);
                            } else
                            {
                                obj = ObjectAnimator.ofInt(((wq) (obj1)).a, "top", new int[] {
                                    -((wq) (obj1)).a.getMeasuredHeight(), 0
                                });
                                ((ObjectAnimator) (obj)).setDuration(200L);
                                ((ObjectAnimator) (obj)).addUpdateListener(new wq._cls1(((wq) (obj1))));
                                ((ObjectAnimator) (obj)).addListener(wk);
                                ((ObjectAnimator) (obj)).start();
                            }
                        }
                    } else
                    {
                        ((wd) (obj1)).k();
                        ((DSnapView) (obj)).a(f1, f2, ((wd) (obj1)), flag, wk, l2);
                    }
                }
                i1 = 1;
            }
        }
        if (i1 != 0)
        {
            wk = j();
            if (wk != null)
            {
                wk.j(false);
            }
        }
    }

    public void onShowDialogEvent(ShowDialogEvent showdialogevent)
    {
        static final class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.values().length];
                try
                {
                    a[com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.ONE_BUTTON.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.YES_NO_DIALOG.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.YES_NO_DONTASK_DIALOG.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.ONE_BUTTON_SC_DIALOG.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.YES_NO_SC_DIALOG.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        String s1;
        if (showdialogevent.message == null)
        {
            s1 = getString(showdialogevent.stringResId);
        } else
        {
            s1 = showdialogevent.message;
        }
        switch (_cls5.a[showdialogevent.dialogType.ordinal()])
        {
        default:
            AlertDialogUtils.a(s1, this);
            return;

        case 1: // '\001'
            if (showdialogevent.titleResId != 0)
            {
                AlertDialogUtils.a(this, getString(showdialogevent.titleResId), s1, showdialogevent.onClickListener);
                return;
            } else
            {
                AlertDialogUtils.a(this, s1);
                return;
            }

        case 2: // '\002'
            AlertDialogUtils.a(this, getString(showdialogevent.titleResId), s1, showdialogevent.yesNoAlertListener);
            return;

        case 3: // '\003'
            AlertDialogUtils.a(this, getString(showdialogevent.titleResId), s1, true, showdialogevent.yesNoAlertListener);
            return;

        case 4: // '\004'
            AlertDialogUtils.a(this, getString(showdialogevent.titleResId), s1, getString(showdialogevent.yesButtonResId));
            return;

        case 5: // '\005'
            AlertDialogUtils.a(this, getString(showdialogevent.titleResId), s1, getString(showdialogevent.yesButtonResId), getString(showdialogevent.noButtonResId), showdialogevent.yesNoAlertListener);
            return;
        }
    }

    public void onSnapCapturedEvent(NV nv)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        mUser = Br.a();
        l = nv;
        obj = ((Mediabryo) (l.mMediabryo)).mMediaMailingMetadata;
        if (b == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ((MediaMailingMetadata) (obj)).a(b.mRecipients);
_L4:
        if (m() || nv.mCaptureContext == SnapCaptureContext.SHARE_EXTENSION || r != null && (j() instanceof EditionViewerFragment))
        {
            nv = l.mMediabryo;
            as = ((Mediabryo) (nv)).mSnapTrophyMetrics;
            obj = new SnapPreviewFragment();
            NL nl = b;
            wK wk = r;
            Am am1 = Am.a();
            View view = l.mLastView;
            SnapCaptureContext snapcapturecontext = l.mCaptureContext;
            obj.a = (AA)dv.a(nv);
            obj.b = nl;
            obj.c = wk;
            obj.i = (Al)dv.a(am1);
            obj.f = view;
            obj.n = snapcapturecontext;
            obj.m = true;
            obj.f = view;
            obj.g = null;
            if (((SnapPreviewFragment) (obj)).a != null && ((Mediabryo) (((SnapPreviewFragment) (obj)).a)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
            {
                obj.h = ((SnapPreviewFragment) (obj)).j.a();
            }
            obj.o = as;
            a(((SnapchatFragment) (obj)), "PreviewFragment", true);
            nv = PreferenceManager.getDefaultSharedPreferences(SnapchatApplication.get());
            if (!Bt.aa())
            {
                Bt.ab();
                if ((!nv.getBoolean(SharedPreferenceKey.ALLOWED_GPS.getKey(), false) || !N.a()) && !Bt.al())
                {
                    Aa.a(this, new Aa.a() {

                        public final void a(boolean flag)
                        {
                            if (flag)
                            {
                                AnalyticsEvents.g();
                                (new mP()).execute();
                            }
                        }

                    }).show();
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (p != null)
        {
            ((MediaMailingMetadata) (obj)).a(p.mRecipients);
        } else
        if (q != null)
        {
            ((MediaMailingMetadata) (obj)).a(q.mRecipients);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onSnapReadyForRecipientsEvent(NZ nz)
    {
        boolean flag4 = false;
        AA aa1 = nz.mMediabryo;
        if (((Mediabryo) (aa1)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA && p != null)
        {
            ((Mediabryo) (aa1)).mMediaMailingMetadata.a(p.mRecipients);
            a(aa1);
            return;
        }
        MediaMailingMetadata mediamailingmetadata = ((Mediabryo) (aa1)).mMediaMailingMetadata;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (i.a() && ((Mediabryo) (aa1)).mSnapType != com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (nz.mShouldGoToSendTo || mediamailingmetadata.d().size() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (p != null || q != null || b != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag3 = flag4;
        if (!flag1)
        {
            flag3 = flag4;
            if (flag2)
            {
                flag3 = true;
            }
        }
        if (flag3)
        {
            b(aa1, true);
            return;
        }
        if (flag)
        {
            a(aa1);
        }
        a(SendToFragment.a(aa1), "SendToFrag", true);
    }

    public void onSnapReadyForSendingEvent(Oa oa)
    {
        Object obj;
        boolean flag;
        obj = oa.mMediabryo;
        flag = oa.mFromPreview;
        if (!(obj instanceof Ca)) goto _L2; else goto _L1
_L1:
        oa = (Ca)obj;
        obj = ((Mediabryo) (oa)).mMediaMailingMetadata.d();
        if (obj != null && !((Set) (obj)).isEmpty()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        Iterator iterator = ((Set) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (Friend)iterator.next();
            obj1 = By.c().a(((Friend) (obj1)).g(), false, true);
            if (obj1 != null)
            {
                sD.a().a(((ChatConversation) (obj1)), ((Ca) (oa)).mText, ((Ca) (oa)).mFormats);
            }
        } while (true);
        a(((Set) (obj)));
        return;
_L2:
        if (!(obj instanceof AA)) goto _L3; else goto _L5
_L5:
        oa = (AA)obj;
        if (!i.a() || ((Mediabryo) (obj)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA)
        {
            b(oa, flag);
            return;
        }
        if (((Mediabryo) (oa)).mSnapType != com.snapchat.android.model.Mediabryo.SnapType.SNAP) goto _L7; else goto _L6
_L6:
        x.d(oa);
_L9:
        a(oa, flag);
        return;
_L7:
        try
        {
            if (((Mediabryo) (oa)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
            {
                y.e(oa);
            }
        }
        catch (uJ.a a1)
        {
            (new ErrorMetric(a1.getMessage())).a(a1).e();
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void onSoftNavigationBarEvent(Og og)
    {
        if (!og.shouldShow) goto _L2; else goto _L1
_L1:
        boolean flag;
        og = H;
        flag = Jo.f(this);
        if (((Jb) (og)).mIsImmersiveModeSupported && ((Jb) (og)).mDecorView != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        Timber.a("SoftNavigationBarManager", "Turning immersive mode OFF", new Object[0]);
        ((Jb) (og)).mDecorView.setSystemUiVisibility(((Jb) (og)).mDefaultFlags);
        og.a(flag, false);
        og.mIsImmersiveModeOn = false;
        return;
_L2:
        og = H;
        boolean flag1 = Jo.f(this);
        if (((Jb) (og)).mIsImmersiveModeSupported && ((Jb) (og)).mDecorView != null)
        {
            Timber.a("SoftNavigationBarManager", "Turning immersive mode ON", new Object[0]);
            ((Jb) (og)).mWindow.addFlags(0x8000000);
            og.a(flag1, true);
            ((Jb) (og)).mDecorView.setKeepScreenOn(true);
            ((Jb) (og)).mDecorView.setSystemUiVisibility(5890);
            og.mIsImmersiveModeOn = true;
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected void onStart()
    {
        ll.e();
        super.onStart();
        if (c == null)
        {
            y();
        }
        RegistrationAnalytics.a(false);
        ll.f();
    }

    public void onStartFragmentEvent(Oi oi)
    {
        SnapchatFragment snapchatfragment = oi.mFragmentToStart;
        if (!TextUtils.isEmpty(oi.mBaseFragmentTag))
        {
            getFragmentManager().popBackStackImmediate(oi.mBaseFragmentTag, 0);
        }
        String s1;
        if (TextUtils.isEmpty(oi.mTag))
        {
            s1 = snapchatfragment.toString();
        } else
        {
            s1 = oi.mTag;
        }
        a(snapchatfragment, s1, oi.mHideOldFragmentFlag);
    }

    protected void onStop()
    {
        Iterator iterator;
        C.d();
        F.b();
        D.a(hn.ENTER_BACKGROUND);
        Q.b();
        U.mFirstMediaOpenedMetric = null;
        super.onStop();
        LO.a();
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
_L2:
        Object obj;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_210;
            }
            obj = (ChatFeedItem)iterator1.next();
        } while (!(obj instanceof AT));
        obj = (AT)obj;
        Exception exception;
        boolean flag;
        if (((AT) (obj)).E() && ((AT) (obj)).ar())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((AT) (obj)).x()) goto _L2; else goto _L1
_L1:
        if (flag) goto _L4; else goto _L3
_L3:
        if (!((AT) (obj)).u()) goto _L2; else goto _L4
_L4:
        if (((AT) (obj)).u() && !((AT) (obj)).E())
        {
            ((AT) (obj)).t();
        }
        ((AT) (obj)).a(chatconversation);
          goto _L2
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
        if (true) goto _L6; else goto _L5
_L5:
        if (mUser != null)
        {
            X.a(mUser.mSnapsToBeUpdatedOnServer.values());
        }
        X.e();
        if (c != null)
        {
            SecureChatService securechatservice = c;
            securechatservice.mMainHandler.postDelayed(new com.snapchat.android.util.chat.SecureChatService._cls1(securechatservice), 5000L);
            if (u)
            {
                unbindService(at);
                u = false;
            }
            c = null;
            w = false;
        }
        new Aa();
        if (Bt.al())
        {
            M.c();
        }
        return;
    }

    public void onStoryReplyReadyForSendingEvent(Oo oo)
    {
        a(oo.mMediabryo);
    }

    public void onStorySnapPostedFromSnapPreviewEvent(Oq oq)
    {
        a(3);
    }

    public void onSwitchToChatEvent(Ot ot)
    {
        c();
        ChatFragment.a(ot.mFriendUsername);
        a(0, false);
    }

    public void onTapToViewDiscoverEvent(wM wm)
    {
        s = wm;
        a.setPagingEnabled(false);
        a.setAnimating(true);
        a.setCurrentItem(4, true);
    }

    public void onTitleBarEvent(OC oc)
    {
        boolean flag1 = true;
        TitleBarManager titlebarmanager = P;
        boolean flag;
        if (titlebarmanager.mWindow == null || titlebarmanager.mResources == null || titlebarmanager.mHandler == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            com.snapchat.android.util.TitleBarManager.Visibility visibility = oc.mVisibility;
            com.snapchat.android.util.TitleBarManager.Visibility visibility1 = oc.mUnlockedVisibility;
            com.snapchat.android.util.TitleBarManager.LockedState lockedstate = oc.mLockedState;
            Timber.a("TitleBarManager", (new StringBuilder("Target visibility: ")).append(visibility).append(" locked: ").append(lockedstate).append(" unlocked visibility: ").append(visibility1).append(" caller: ").append(Timber.a()).toString(), new Object[0]);
            if (visibility1 != null)
            {
                titlebarmanager.mTitleBarTargetUnlockedVisibility = visibility1;
            }
            if (titlebarmanager.mTitleBarLockedState == com.snapchat.android.util.TitleBarManager.LockedState.LOCKED && lockedstate != com.snapchat.android.util.TitleBarManager.LockedState.NOT_LOCKED)
            {
                Timber.a("TitleBarManager", "Title bar was locked. Do nothing.", new Object[0]);
            } else
            {
                if (lockedstate != null)
                {
                    titlebarmanager.mTitleBarLockedState = lockedstate;
                }
                oc = visibility;
                if (lockedstate == com.snapchat.android.util.TitleBarManager.LockedState.NOT_LOCKED)
                {
                    if (visibility != null)
                    {
                        titlebarmanager.mTitleBarTargetUnlockedVisibility = visibility;
                    }
                    oc = titlebarmanager.mTitleBarTargetUnlockedVisibility;
                }
                if (oc != null)
                {
                    if (oc == com.snapchat.android.util.TitleBarManager.Visibility.VISIBLE && titlebarmanager.mTitleBarShown || oc == com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN && !titlebarmanager.mTitleBarShown)
                    {
                        Timber.a("TitleBarManager", "Already in target state. Do nothing.", new Object[0]);
                        return;
                    }
                    if (oc != com.snapchat.android.util.TitleBarManager.Visibility.VISIBLE)
                    {
                        flag1 = false;
                    }
                    titlebarmanager.mTitleBarShown = flag1;
                    titlebarmanager.a();
                    return;
                }
            }
        }
    }

    public void onUpdatingUserToDatabasesCompleteEvent(OF of)
    {
        if (t != null)
        {
            t.hide();
            if (!of.mSuccess)
            {
                AlertDialogUtils.a(this, "Failed to upgrade. Try again later");
            }
        }
    }

    public void onUpdatingUserToDatabasesEvent(OG og)
    {
        t = ProgressDialog.show(this, "Upgrading Snapchat", "Loading...");
    }

    public void onVolumeViewChangedEvent(OK ok)
    {
        u();
        CustomVolumeView customvolumeview = ah;
        customvolumeview.b = ok.mVolumeViewType;
        for (ok = customvolumeview.a.iterator(); ok.hasNext(); customvolumeview.removeView((View)ok.next())) { }
        customvolumeview.a.clear();
        customvolumeview.setVisibility(4);
        customvolumeview.a();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        Timber.c("LandingPageActivity", (new StringBuilder("On ac Should we onWindowFocusChanged has focus? ")).append(flag).toString(), new Object[0]);
        if (flag && k)
        {
            Timber.c("LandingPageActivity", "On ac Calling onResume from window focus fn", new Object[0]);
            k = false;
            g.a(new Nj());
        }
        KeyguardManager keyguardmanager = (KeyguardManager)getSystemService("keyguard");
        if (!flag && keyguardmanager.inKeyguardRestrictedInputMode())
        {
            Timber.c("LandingPageActivity", "onWindowFocusChanged navigating to camera", new Object[0]);
            a.setCurrentItem(2);
        }
    }

    public final com.snapchat.android.app.feature.messaging.feed.ui.fragment.FeedFragment.a p()
    {
        return ag;
    }

    public InChatSnapEvent produceInChatSnapEvent()
    {
        return p;
    }

    public QuickSnapEvent produceQuickSnapEvent()
    {
        return q;
    }

    public final MultiLeveledSnapView q()
    {
        return ai;
    }

    public final InAppBillingManager r()
    {
        return aj;
    }
}
