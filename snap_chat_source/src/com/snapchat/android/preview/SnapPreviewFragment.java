// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import AA;
import AM;
import AQ;
import Aa;
import Ac;
import Al;
import Av;
import Aw;
import Ax;
import Az;
import Bd;
import Be;
import Bj;
import Bt;
import Bw;
import Do;
import EV;
import Fh;
import Fp;
import Fq;
import Ge;
import Gh;
import Gj;
import Gk;
import Gn;
import Go;
import Gp;
import HA;
import HN;
import HO;
import HQ;
import Ho;
import Hw;
import Hz;
import IK;
import IO;
import IY;
import Id;
import Jk;
import Jo;
import Jy;
import Ki;
import Kn;
import LB;
import MB;
import MD;
import Mf;
import Mh;
import Mk;
import Mo;
import Mq;
import Ms;
import NL;
import NZ;
import Np;
import Nt;
import OC;
import Og;
import Oq;
import Os;
import PG;
import PI;
import PJ;
import Pa;
import Ps;
import Pv;
import Pw;
import Px;
import Wu;
import YY;
import als;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.NetworkAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.analytics.ui.EmojiPickerAnalytics;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.database.OnboardingTooltip;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.ui.CanvasViewBase;
import com.snapchat.android.ui.FitWidthImageView;
import com.snapchat.android.ui.FitWidthViewGroup;
import com.snapchat.android.ui.SendToBottomPanelView;
import com.snapchat.android.ui.SnapEditorView;
import com.snapchat.android.ui.SwipeImageView;
import com.snapchat.android.ui.SwipeViewState;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.ui.VideoFilterView;
import com.snapchat.android.ui.caption.CaptionTypeEnums;
import com.snapchat.android.ui.caption.FatCaptionView;
import com.snapchat.android.ui.caption.SnapCaptionView;
import com.snapchat.android.ui.emojipicker.EmojiDeletionHandler;
import com.snapchat.android.ui.emojipicker.EmojiPickerView;
import com.snapchat.android.ui.emojipicker.EmojiVerticalSwipeLayout;
import com.snapchat.android.ui.swipefilters.FilterPageType;
import com.snapchat.android.util.SnapMediaUtils;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.snapchat.android.util.eventbus.DrawingEvent;
import com.snapchat.android.util.eventbus.InChatSnapEvent;
import com.snapchat.android.util.eventbus.QuickSnapEvent;
import com.snapchat.android.util.eventbus.SnapCaptureContext;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.snapchat.android.util.save.SaveImageToGalleryTask;
import com.snapchat.android.util.save.SaveMediaNotificationsToShow;
import com.snapchat.photoeffect.LibPhotoEffect;
import com.squareup.otto.Bus;
import dv;
import dz;
import gD;
import gJ;
import gW;
import hJ;
import hc;
import hy;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kl;
import lS;
import lU;
import lV;
import le;
import lf;
import lg;
import lm;
import lp;
import lv;
import lw;
import mS;
import net.simonvt.numberpicker.SnapchatTimePicker;
import qX;
import qn;
import qp;
import rA;
import rB;
import rG;
import rH;
import rK;
import rx;
import rz;
import sG;
import sI;
import un;
import vv;
import wG;
import wH;
import wK;
import zY;

public class SnapPreviewFragment extends SnapchatFragment
    implements Do.a, Fn.a, Gp.a, com.snapchat.android.ui.SnapEditorView.b, com.snapchat.android.ui.SwipeImageView.a
{
    final class a
        implements Runnable
    {

        boolean a;
        private SnapPreviewFragment b;

        public final void run()
        {
            if (!a)
            {
                SnapPreviewFragment.K(b);
            }
        }

        private a()
        {
            b = SnapPreviewFragment.this;
            super();
            a = false;
        }

        a(byte byte0)
        {
            this();
        }
    }


    private ImageButton A;
    private Id B;
    private PI C;
    private View D;
    private PI E;
    private View F;
    private PI G;
    private CheckBox H;
    private PI I;
    private PI J;
    private RelativeLayout K;
    private ImageButton L;
    private PI M;
    private PI N;
    private ImageButton O;
    private ImageButton P;
    private Gk Q;
    private Gh R;
    private Gp S;
    private EmojiDeletionHandler T;
    private PI U;
    private View V;
    private ArrayList W;
    private boolean X;
    private boolean Y;
    private ImageButton Z;
    public AA a;
    private final Bj aA;
    private boolean aB;
    private Handler aC;
    private a aD;
    private long aE;
    private int aa;
    private InChatSnapEvent ab;
    private QuickSnapEvent ac;
    private boolean ad;
    private int ae;
    private boolean af;
    private com.snapchat.android.ui.SnapEditorView.a ag;
    private final sI ah;
    private final sG ai;
    private final lv aj;
    private final NetworkAnalytics ak;
    private final lV al;
    private final EmojiPickerAnalytics am;
    private final lm an;
    private final DiscoverUsageAnalytics ao;
    private final lp ap;
    private final Bus aq;
    private final Jy ar;
    private final rA as;
    private final Pa at;
    private final Ac au;
    private SharedPreferences av;
    private final qX aw;
    private final FriendManager ax;
    private final un ay;
    private final zY az;
    public NL b;
    public wK c;
    public SnapEditorView d;
    public final PJ e;
    public View f;
    public IK g;
    public boolean h;
    public Al i;
    public final wG j;
    protected LinkedHashSet k;
    protected Do l;
    public boolean m;
    public SnapCaptureContext n;
    public EV o;
    private CanvasViewBase p;
    private TextView q;
    private ImageButton r;
    private PI s;
    private PI t;
    private PI u;
    private PI v;
    private PI w;
    private PI x;
    private View y;
    private ImageButton z;

    public SnapPreviewFragment()
    {
        sI si = new sI();
        sG sg = new sG();
        lv lv1 = lv.a();
        NetworkAnalytics networkanalytics = NetworkAnalytics.a();
        lV lv2 = new lV();
        rA ra = rA.a();
        Pa pa = new Pa();
        zY zy = zY.a();
        PJ pj = new PJ();
        Bus bus = Mf.a();
        Ac ac1 = Ac.b();
        Jy jy = Jy.a();
        EmojiPickerAnalytics emojipickeranalytics = new EmojiPickerAnalytics();
        Gh gh = Gh.a();
        lm lm1 = lm.a();
        wG wg = new wG();
        new qn();
        this(si, sg, lv1, networkanalytics, lv2, ra, pa, zy, pj, bus, ac1, jy, emojipickeranalytics, gh, lm1, wg, qX.a(), FriendManager.e(), Bj.a(), TranscodingPreferencesWrapper.a(), lp.a(), un.a());
    }

    private SnapPreviewFragment(sI si, sG sg, lv lv1, NetworkAnalytics networkanalytics, lV lv2, rA ra, Pa pa, 
            zY zy, PJ pj, Bus bus, Ac ac1, Jy jy, EmojiPickerAnalytics emojipickeranalytics, Gh gh, 
            lm lm1, wG wg, qX qx, FriendManager friendmanager, Bj bj, TranscodingPreferencesWrapper transcodingpreferenceswrapper, lp lp1, 
            un un1)
    {
        X = false;
        Y = false;
        ad = false;
        f = null;
        h = true;
        ao = new DiscoverUsageAnalytics();
        new le();
        k = new LinkedHashSet();
        m = false;
        aB = false;
        aC = new Handler();
        aE = -1L;
        ah = si;
        ai = sg;
        aj = lv1;
        ak = networkanalytics;
        al = lv2;
        as = ra;
        at = pa;
        az = zy;
        e = pj;
        aq = bus;
        au = ac1;
        ar = jy;
        j = wg;
        am = emojipickeranalytics;
        R = gh;
        an = lm1;
        aw = qx;
        ax = friendmanager;
        aA = bj;
        Bt.a();
        ap = lp1;
        ay = un1;
    }

    private void A()
    {
        J.a(0);
    }

    static void A(SnapPreviewFragment snappreviewfragment)
    {
        if (!snappreviewfragment.n() || snappreviewfragment.a == null)
        {
            return;
        }
        if (snappreviewfragment.ac != null)
        {
            snappreviewfragment.aq.a(new Mh(CameraDisplayState.SHOW));
        }
        if (snappreviewfragment.o != null) goto _L2; else goto _L1
_L1:
        Timber.e("SnapPreviewFragment", "mSnapTrophyMetrics should not be null", new Object[0]);
_L8:
        snappreviewfragment.aq.a(new NZ(snappreviewfragment.a));
        return;
_L2:
        Object obj;
        EV ev1;
        lU lu = snappreviewfragment.al.e;
        lU lu1 = snappreviewfragment.al.f;
        ev1 = snappreviewfragment.o;
        ev1.a(new String[] {
            "hot_filter_snaps", "cold_filter_snaps", "black_and_white_snaps", "two_filter_snaps", "one_filter_snaps"
        });
        obj = Integer.valueOf(0);
        int i1 = 0;
        while (i1 < 2) 
        {
            String s2 = (new lU[] {
                lu, lu1
            })[i1].a;
            Integer integer = ((Integer) (obj));
            if (s2 != null)
            {
                integer = ((Integer) (obj));
                if (!s2.equals("None"))
                {
                    obj = Integer.valueOf(((Integer) (obj)).intValue() + 1);
                    if (s2.equals("Weather"))
                    {
                        integer = ((Integer) (obj));
                        if (ev1.e.d())
                        {
                            int j1 = Integer.parseInt(ev1.e.c());
                            if (j1 >= ev1.a.intValue())
                            {
                                ev1.a("hot_filter_snaps");
                                integer = ((Integer) (obj));
                            } else
                            {
                                integer = ((Integer) (obj));
                                if (j1 <= ev1.b.intValue())
                                {
                                    ev1.a("cold_filter_snaps");
                                    integer = ((Integer) (obj));
                                }
                            }
                        }
                    } else
                    {
                        integer = ((Integer) (obj));
                        if (s2.equals("Greyscale"))
                        {
                            ev1.a("black_and_white_snaps");
                            integer = ((Integer) (obj));
                        }
                    }
                }
            }
            i1++;
            obj = integer;
        }
        ((Integer) (obj)).intValue();
        JVM INSTR tableswitch 1 2: default 360
    //                   1 540
    //                   2 551;
           goto _L3 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_551;
_L6:
        EV ev;
        ev = snappreviewfragment.o;
        ev.a(new String[] {
            "early_morning_snaps"
        });
        if (Calendar.getInstance().get(11) == ev.c.intValue())
        {
            ev.a("early_morning_snaps");
        }
        ev = snappreviewfragment.o;
        Object obj1;
        boolean flag;
        if (!snappreviewfragment.H.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ev.a(new String[] {
            "no_audio_videos"
        });
        if (!flag)
        {
            ev.a("no_audio_videos");
        }
        ev = snappreviewfragment.o;
        obj1 = snappreviewfragment.p.g();
        ev.a(new String[] {
            "many_color_snaps"
        });
        obj = new HashMap();
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            String s1 = String.valueOf(((com.snapchat.android.ui.LegacyCanvasView.a)((Iterator) (obj1)).next()).a.getColor());
            if (!((HashMap) (obj)).containsKey(s1))
            {
                ((HashMap) (obj)).put(s1, Boolean.valueOf(true));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_568;
_L4:
        ev1.a("one_filter_snaps");
          goto _L6
        ev1.a("two_filter_snaps");
          goto _L6
        if (((HashMap) (obj)).keySet().size() >= 5)
        {
            ev.a("many_color_snaps");
        }
        ev = snappreviewfragment.o;
        obj = snappreviewfragment.d.v;
        ev.a(new String[] {
            "big_text_snaps"
        });
        if (obj == CaptionTypeEnums.FAT_CAPTION_TYPE || obj == CaptionTypeEnums.FAT_CENTER_CAPTION_TYPE)
        {
            ev.a("big_text_snaps");
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean B()
    {
        if (a != null && a.mFilterLensId != null)
        {
            aw.a(a.mFilterLensId);
        }
        if (a != null && IY.a(a) && c == null)
        {
            CameraEventAnalytics.a().a(com.snapchat.android.analytics.CameraEventAnalytics.CameraContext.CANCEL_PREVIEW);
        }
        if (a != null && c == null)
        {
            if (((Mediabryo) (a)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
            {
                ai.c(a);
            } else
            {
                sI si = ah;
                AA aa1 = a;
                si.b.b(aa1);
                if (aa1 instanceof Bw)
                {
                    si.c.b(((Mediabryo) (aa1)).mClientId);
                }
            }
        }
        aq.a(new Mh(CameraDisplayState.SHOW));
        if (ac != null)
        {
            aq.a(new Mk());
            return true;
        } else
        {
            return false;
        }
    }

    static boolean B(SnapPreviewFragment snappreviewfragment)
    {
        snappreviewfragment.ad = true;
        return true;
    }

    static NetworkAnalytics C(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.ak;
    }

    private void C()
    {
        l.notifyDataSetChanged();
        Iterator iterator = k.iterator();
        String s2 = "";
        for (String s1 = ""; iterator.hasNext(); s1 = ", ")
        {
            AQ aq1 = (AQ)iterator.next();
            s2 = (new StringBuilder()).append(s2).append(s1).append(aq1.mDisplayName).toString();
        }

        ((SendToBottomPanelView)N.a()).setText(s2);
    }

    static FriendManager D(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.ax;
    }

    private void D()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)y.getLayoutParams();
        layoutparams.addRule(12, 0);
        layoutparams.addRule(2, 0x7f0d042a);
        y.setLayoutParams(layoutparams);
        N.a(0);
        ((SendToBottomPanelView)N.a()).setAlpha(1.0F);
        L.setVisibility(8);
    }

    static Bus E(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.aq;
    }

    private void E()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)y.getLayoutParams();
        layoutparams.addRule(12, 1);
        layoutparams.addRule(2, 0);
        y.setLayoutParams(layoutparams);
        L.setVisibility(0);
        N.a(8);
    }

    private int F()
    {
        int i1 = 3;
        if (av != null)
        {
            i1 = av.getInt(SharedPreferenceKey.SNAP_PREFERRED_TIME.getKey(), 3);
        }
        return i1;
    }

    static PI F(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.N;
    }

    static View G(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.y;
    }

    static wG H(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.j;
    }

    static void I(SnapPreviewFragment snappreviewfragment)
    {
        snappreviewfragment.e(true);
    }

    static SnapCaptureContext J(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.n;
    }

    static void K(SnapPreviewFragment snappreviewfragment)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(400L);
        alphaanimation.setFillAfter(true);
        snappreviewfragment.aE = System.nanoTime();
        if (snappreviewfragment.u.b())
        {
            snappreviewfragment.u.a().startAnimation(alphaanimation);
        }
        snappreviewfragment.y.startAnimation(alphaanimation);
        snappreviewfragment.z.startAnimation(alphaanimation);
        if (snappreviewfragment.N.c())
        {
            ((SendToBottomPanelView)snappreviewfragment.N.a()).startAnimation(alphaanimation);
        }
    }

    static un L(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.ay;
    }

    static PI a(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.s;
    }

    static Object a(SnapPreviewFragment snappreviewfragment, String s1)
    {
        return snappreviewfragment.c(s1);
    }

    private void a(float f1)
    {
        if (f1 == 0.0F)
        {
            b(8);
        } else
        {
            b(0);
        }
        z.setAlpha(f1);
        r.setAlpha(f1);
        y.setAlpha(f1);
        Z.setAlpha(f1);
        O.setAlpha(f1);
        if (N.b())
        {
            ((SendToBottomPanelView)N.a()).setAlpha(f1);
        }
    }

    private void a(View view)
    {
        for (Iterator iterator = W.iterator(); iterator.hasNext();)
        {
            View view1 = (View)iterator.next();
            if (view == null || view == view1)
            {
                view1.setAlpha(1.0F);
            } else
            {
                view1.setAlpha(0.2F);
            }
        }

    }

    static void a(SnapPreviewFragment snappreviewfragment, vv vv1, long l1)
    {
        hs hs = le.a(snappreviewfragment.a);
        hw hw = le.b(snappreviewfragment.a);
        DiscoverUsageAnalytics discoverusageanalytics = snappreviewfragment.ao;
        String s1 = vv1.a;
        String s2 = vv1.d;
        String s3 = vv1.e;
        int j1 = vv1.s;
        int k1 = vv1.t;
        int i1 = vv1.u;
        String s4 = vv1.v;
        int i2 = vv1.w;
        int j2 = vv1.x;
        com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype1 = vv1.y;
        com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype = vv1.z;
        boolean flag4 = vv1.A;
        long l2 = vv1.B;
        boolean flag5 = snappreviewfragment.a.mHasDrawing;
        vv1 = snappreviewfragment.a.mCaptionStyleDescription;
        double d1 = ((Mediabryo) (snappreviewfragment.a)).mTimerValueOrDuration;
        boolean flag6 = snappreviewfragment.a.n();
        int k2 = wH.a(vv1);
        if (i1 == 0)
        {
            if (flag4)
            {
                snappreviewfragment = DiscoverUsageAnalytics.a(mediatype1, flag6);
                vv1 = new hc();
                vv1.publisherId = s1;
                vv1.dsnapId = s3;
                vv1.editionId = s2;
                vv1.mediaType = snappreviewfragment;
                vv1.timeViewed = Double.valueOf(Jk.a(l2, 1));
                vv1.drawing = Boolean.valueOf(flag5);
                vv1.sizeByte = Long.valueOf(l1);
                if (k2 != -1)
                {
                    vv1.caption = Long.valueOf(k2);
                }
                if (hs != null)
                {
                    vv1.filterInfo = hs;
                }
                if (hw != null)
                {
                    vv1.filterVisual = hw;
                }
                if (snappreviewfragment == hJ.VIDEO || snappreviewfragment == hJ.VIDEO_NO_SOUND)
                {
                    vv1.snapTimeSec = Double.valueOf(d1);
                }
                boolean flag;
                if (k1 < 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    vv1.snapIndexCount = Long.valueOf(k1);
                    vv1.snapIndexPos = Long.valueOf(j1 + 1);
                }
                discoverusageanalytics.a.a(vv1);
                return;
            }
            snappreviewfragment = DiscoverUsageAnalytics.a(mediatype1, flag6);
            vv1 = new gW();
            vv1.publisherId = s1;
            vv1.dsnapId = s3;
            vv1.editionId = s2;
            vv1.mediaType = snappreviewfragment;
            vv1.longformType = DiscoverUsageAnalytics.b(mediatype);
            vv1.timeViewed = Double.valueOf(Jk.a(l2, 1));
            vv1.drawing = Boolean.valueOf(flag5);
            vv1.sizeByte = Long.valueOf(l1);
            if (k2 != -1)
            {
                vv1.caption = Long.valueOf(k2);
            }
            if (hs != null)
            {
                vv1.filterInfo = hs;
            }
            if (hw != null)
            {
                vv1.filterVisual = hw;
            }
            if (snappreviewfragment == hJ.VIDEO || snappreviewfragment == hJ.VIDEO_NO_SOUND)
            {
                vv1.snapTimeSec = Double.valueOf(d1);
            }
            boolean flag1;
            if (k1 < 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                vv1.snapIndexCount = Long.valueOf(k1);
                vv1.snapIndexPos = Long.valueOf(j1 + 1);
            }
            discoverusageanalytics.a.a(vv1);
            return;
        }
        if (flag4)
        {
            snappreviewfragment = DiscoverUsageAnalytics.a(mediatype1, flag6);
            vv1 = new gJ();
            vv1.publisherId = s1;
            vv1.adsnapId = s4;
            vv1.editionId = s2;
            vv1.mediaType = snappreviewfragment;
            vv1.timeViewed = Double.valueOf(Jk.a(l2, 1));
            vv1.drawing = Boolean.valueOf(flag5);
            vv1.sizeByte = Long.valueOf(l1);
            if (k2 != -1)
            {
                vv1.caption = Long.valueOf(k2);
            }
            if (hs != null)
            {
                vv1.filterInfo = hs;
            }
            if (hw != null)
            {
                vv1.filterVisual = hw;
            }
            if (snappreviewfragment == hJ.VIDEO || snappreviewfragment == hJ.VIDEO_NO_SOUND)
            {
                vv1.snapTimeSec = Double.valueOf(d1);
            }
            boolean flag2;
            if (k1 < 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (!flag2)
            {
                vv1.snapIndexCount = Long.valueOf(k1);
                vv1.snapIndexPos = Long.valueOf(j1 + 1);
                vv1.adIndexPos = Long.valueOf(i2);
                vv1.adIndexCount = Long.valueOf(j2);
            }
            discoverusageanalytics.a.a(vv1);
            return;
        }
        snappreviewfragment = DiscoverUsageAnalytics.a(mediatype1, flag6);
        vv1 = new gD();
        vv1.publisherId = s1;
        vv1.adsnapId = s4;
        vv1.editionId = s2;
        vv1.mediaType = snappreviewfragment;
        vv1.timeViewed = Double.valueOf(Jk.a(l2, 1));
        vv1.drawing = Boolean.valueOf(flag5);
        vv1.longformType = DiscoverUsageAnalytics.b(mediatype);
        vv1.sizeByte = Long.valueOf(l1);
        if (k2 != -1)
        {
            vv1.caption = Long.valueOf(k2);
        }
        if (hs != null)
        {
            vv1.filterInfo = hs;
        }
        if (hw != null)
        {
            vv1.filterVisual = hw;
        }
        if (snappreviewfragment != hJ.IMAGE)
        {
            vv1.snapTimeSec = Double.valueOf(d1);
        }
        boolean flag3;
        if (k1 < 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag3)
        {
            vv1.snapIndexCount = Long.valueOf(k1);
            vv1.snapIndexPos = Long.valueOf(j1 + 1);
            vv1.adIndexPos = Long.valueOf(i2);
            vv1.adIndexCount = Long.valueOf(j2);
        }
        discoverusageanalytics.a.a(vv1);
    }

    static PI b(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.G;
    }

    private void b(float f1)
    {
        MediaMailingMetadata mediamailingmetadata = ((Mediabryo) (a)).mMediaMailingMetadata;
        if (s() && !mediamailingmetadata.d().isEmpty())
        {
            if (f1 == 0.0F)
            {
                if (N.b())
                {
                    N.a(4);
                    ((SendToBottomPanelView)N.a()).setClickable(false);
                }
            } else
            {
                N.a(0);
                ((SendToBottomPanelView)N.a()).setClickable(true);
            }
            ((SendToBottomPanelView)N.a()).setAlpha(f1);
        }
    }

    private void b(int i1)
    {
        z.setVisibility(i1);
        r.setVisibility(i1);
        y.setVisibility(i1);
        Z.setVisibility(i1);
        if (h)
        {
            A.setVisibility(i1);
        }
    }

    private void b(boolean flag)
    {
        af = flag;
        if (af)
        {
            z.setImageResource(0x7f020021);
            return;
        } else
        {
            z.setImageResource(0x7f02006c);
            return;
        }
    }

    static Gk c(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.Q;
    }

    private void c(boolean flag)
    {
label0:
        {
            Object obj = u;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((PI) (obj)).a(i1);
            obj = r;
            if (flag)
            {
                i1 = 8;
            } else
            {
                i1 = 0;
            }
            ((ImageButton) (obj)).setVisibility(i1);
            obj = Z;
            if (flag)
            {
                i1 = 8;
            } else
            {
                i1 = 0;
            }
            ((ImageButton) (obj)).setVisibility(i1);
            obj = O;
            if (flag)
            {
                i1 = 8;
            } else
            {
                i1 = 0;
            }
            ((ImageButton) (obj)).setVisibility(i1);
            obj = P;
            if (flag)
            {
                i1 = 8;
            } else
            {
                i1 = 0;
            }
            ((ImageButton) (obj)).setVisibility(i1);
            if (flag)
            {
                ((GradientDrawable)s.a().getBackground()).setColor(p.c());
                ((GradientDrawable)G.a().getBackground()).setColor(p.c());
                u.a(0);
                v.a(4);
                if (p.e() <= 0)
                {
                    break label0;
                }
                x.a(0);
                G.a(0);
            }
            return;
        }
        G.a(8);
        x.a(8);
    }

    private void d(boolean flag)
    {
        U.a(4);
        d.h.a(true);
        X = flag;
        p.setDrawingEnabled(flag);
        c(flag);
        b(flag);
    }

    static boolean d(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.B();
    }

    private void e(boolean flag)
    {
        A.setClickable(flag);
        ImageButton imagebutton = A;
        float f1;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.3F;
        }
        imagebutton.setAlpha(f1);
        B.a(flag);
    }

    static boolean e(SnapPreviewFragment snappreviewfragment)
    {
        snappreviewfragment.Y = true;
        return true;
    }

    static SnapEditorView f(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.d;
    }

    static void g(SnapPreviewFragment snappreviewfragment)
    {
        if (!((EmojiVerticalSwipeLayout)snappreviewfragment.U.a()).f)
        {
            EmojiVerticalSwipeLayout emojiverticalswipelayout = (EmojiVerticalSwipeLayout)snappreviewfragment.U.a();
            Object obj = snappreviewfragment.S;
            FrameLayout framelayout = snappreviewfragment.d.q;
            EmojiDeletionHandler emojideletionhandler = snappreviewfragment.T;
            RelativeLayout relativelayout = snappreviewfragment.K;
            Gk gk = snappreviewfragment.Q;
            EmojiPickerAnalytics emojipickeranalytics = snappreviewfragment.am;
            boolean flag;
            if (!emojiverticalswipelayout.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dv.b(flag);
            emojiverticalswipelayout.g = new GestureDetector(emojiverticalswipelayout.getContext(), new com.snapchat.android.ui.emojipicker.EmojiVerticalSwipeLayout.a());
            emojiverticalswipelayout.e = relativelayout;
            emojiverticalswipelayout.a = ((Gp) (obj));
            emojiverticalswipelayout.b = new EmojiPickerView(emojiverticalswipelayout.getContext());
            obj = emojiverticalswipelayout.b;
            obj.a = (LinearLayout)((EmojiPickerView) (obj)).findViewById(0x7f0d02b7);
            obj.b = (ViewPager)((EmojiPickerView) (obj)).findViewById(0x7f0d02b6);
            obj.c = gk;
            obj.f = emojipickeranalytics;
            obj.d = new ArrayList();
            ((EmojiPickerView) (obj)).d.add(new Go(0x7f0d0008, 0x7f020149));
            ((EmojiPickerView) (obj)).d.add(new Go(0x7f0d0007, 0x7f0201b0));
            ((EmojiPickerView) (obj)).d.add(new Go(0x7f0d0005, 0x7f0201a3));
            ((EmojiPickerView) (obj)).d.add(new Go(0x7f0d0004, 0x7f020148));
            ((EmojiPickerView) (obj)).d.add(new Go(0x7f0d0003, 0x7f0200af));
            ((EmojiPickerView) (obj)).d.add(new Go(0x7f0d0002, 0x7f020076));
            ((EmojiPickerView) (obj)).d.add(new Go(0x7f0d0009, 0x7f02027e));
            ((EmojiPickerView) (obj)).d.add(new Go(0x7f0d0006, 0x7f0201ac));
            obj.e = new Gj(((EmojiPickerView) (obj)).getContext(), ((EmojiPickerView) (obj)).d, framelayout, emojiverticalswipelayout, emojideletionhandler, ((EmojiPickerView) (obj)).c, ((EmojiPickerView) (obj)).f);
            ((EmojiPickerView) (obj)).b.setAdapter(((EmojiPickerView) (obj)).e);
            ((EmojiPickerView) (obj)).b.setOnPageChangeListener(new com.snapchat.android.ui.emojipicker.EmojiPickerView._cls1(((EmojiPickerView) (obj))));
            ((EmojiPickerView) (obj)).a();
            emojiverticalswipelayout.addView(new View(emojiverticalswipelayout.getContext()));
            emojiverticalswipelayout.addView(emojiverticalswipelayout.b);
            emojiverticalswipelayout.a(new com.snapchat.android.ui.emojipicker.EmojiVerticalSwipeLayout._cls1(emojiverticalswipelayout));
            emojiverticalswipelayout.f = true;
            snappreviewfragment.U.a(4);
        }
    }

    static PI h(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.U;
    }

    static EmojiPickerAnalytics i(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.am;
    }

    static ImageButton j(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.z;
    }

    static void k(SnapPreviewFragment snappreviewfragment)
    {
        boolean flag;
        if (!snappreviewfragment.X)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        snappreviewfragment.d(flag);
    }

    static PI l(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.t;
    }

    static void m(SnapPreviewFragment snappreviewfragment)
    {
        snappreviewfragment.p.b();
        if (snappreviewfragment.p.e() > 0)
        {
            ((GradientDrawable)snappreviewfragment.s.a().getBackground()).setColor(snappreviewfragment.p.c());
            ((GradientDrawable)snappreviewfragment.G.a().getBackground()).setColor(snappreviewfragment.p.c());
            return;
        } else
        {
            snappreviewfragment.x.a(8);
            snappreviewfragment.G.a(8);
            return;
        }
    }

    static PI n(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.x;
    }

    static void o(SnapPreviewFragment snappreviewfragment)
    {
        if (!snappreviewfragment.A.isClickable()) goto _L2; else goto _L1
_L1:
        if (!IY.a(snappreviewfragment.a)) goto _L4; else goto _L3
_L3:
        Object obj3;
        snappreviewfragment.e(false);
        obj3 = snappreviewfragment.getActivity();
        if (snappreviewfragment.a != null) goto _L6; else goto _L5
_L5:
        Timber.e("SnapPreviewFragment", "mSnapbryo is empty", new Object[0]);
_L7:
        snappreviewfragment.am.a(com.snapchat.android.analytics.ui.EmojiPickerAnalytics.ReportType.SAVED, com.snapchat.android.analytics.ui.EmojiPickerAnalytics.SnapType.VIDEO);
_L2:
        return;
_L6:
        Uri uri = (Uri)dv.a(((Mediabryo) (snappreviewfragment.a)).mVideoUri);
        Bitmap bitmap2 = snappreviewfragment.d.a(snappreviewfragment.getActivity());
        Object obj;
        Object obj2;
        boolean flag;
        if (snappreviewfragment.n == SnapCaptureContext.DISCOVER)
        {
            obj = com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext.DISCOVER;
            obj2 = SaveMediaNotificationsToShow.NONE;
        } else
        {
            obj = com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext.PREVIEW;
            obj2 = SaveMediaNotificationsToShow.ALL;
        }
        if (bitmap2 != null || snappreviewfragment.d.d() != WP.b.a || snappreviewfragment.d.p.d != 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && TranscodingPreferencesWrapper.c())
        {
            obj = snappreviewfragment. new Pw(((Context) (obj3)), uri, snappreviewfragment.a.n(), bitmap2, snappreviewfragment.d.d(), ((Mediabryo) (snappreviewfragment.a)).mCameraOrientation, ((Mediabryo) (snappreviewfragment.a)).mIsFrontFacingSnap, snappreviewfragment.d.p.d, ((com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext) (obj)), ((SaveMediaNotificationsToShow) (obj2))) {

                private SnapPreviewFragment a;

                public final void a()
                {
                    super.a();
                    if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
                    {
                        SnapPreviewFragment.H(a).a(SnapPreviewFragment.p(a));
                    }
                }

                protected final void a(boolean flag1)
                {
                    super.a(flag1);
                    SnapPreviewFragment.I(a);
                }

                protected final void b()
                {
                    super.b();
                    if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
                    {
                        SnapPreviewFragment.H(a).b(SnapPreviewFragment.p(a));
                        SnapPreviewFragment.a(a, (vv)((Mediabryo) (SnapPreviewFragment.p(a))).mMediaExtras, mNewLocation.length());
                    }
                }

                protected final void c()
                {
                    super.c();
                    if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
                    {
                        SnapPreviewFragment.H(a).a(((Mediabryo) (SnapPreviewFragment.p(a))).mClientId);
                    }
                }

            
            {
                a = SnapPreviewFragment.this;
                super(context, uri, flag, bitmap, b1, i1, flag1, d1, savesnapcontext, savemedianotificationstoshow);
            }
            };
            ((Pw) (obj)).a();
            try
            {
                obj2 = ((Pw) (obj)).d();
                obj3 = (new rK()).a(((Pw) (obj)).mNewLocation.getAbsolutePath());
                obj3.a = new rH();
                obj3.b = new rG();
                obj2 = ((rK) (obj3)).a(((Wt) (obj2)));
                obj2.d = ((Pw) (obj)).mMediaTransformationCalculator.a;
                obj2 = ((rK) (obj2)).a();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                ((Pw) (obj)).a(false);
                continue; /* Loop/switch isn't completed */
            }
            ((Pw) (obj)).mVideoTranscoder.a(((Wz) (obj2)), new Pw._cls1(((Pw) (obj))), null);
            continue; /* Loop/switch isn't completed */
        }
        (snappreviewfragment. new Pv(((Context) (obj3)), uri, ((com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext) (obj)), ((SaveMediaNotificationsToShow) (obj2))) {

            private SnapPreviewFragment a;

            public final void a()
            {
                super.a();
                if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
                {
                    SnapPreviewFragment.H(a).b(SnapPreviewFragment.p(a));
                    File file = new File(mUri.getPath());
                    SnapPreviewFragment.a(a, (vv)((Mediabryo) (SnapPreviewFragment.p(a))).mMediaExtras, file.length());
                }
            }

            public final void a(Boolean boolean1)
            {
                super.a(boolean1);
                SnapPreviewFragment.I(a);
            }

            public final void b()
            {
                super.b();
                if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
                {
                    SnapPreviewFragment.H(a).a(((Mediabryo) (SnapPreviewFragment.p(a))).mClientId);
                }
            }

            public final void onPostExecute(Object obj4)
            {
                a((Boolean)obj4);
            }

            public final void onPreExecute()
            {
                super.onPreExecute();
                if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
                {
                    SnapPreviewFragment.H(a).a(SnapPreviewFragment.p(a));
                }
            }

            
            {
                a = SnapPreviewFragment.this;
                super(context, uri, savesnapcontext, savemedianotificationstoshow);
            }
        }).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
        if (true) goto _L7; else goto _L4
_L4:
        snappreviewfragment.e(false);
        if (snappreviewfragment.d == null)
        {
            Timber.e("SnapPreviewFragment", "mSnapEditorView is empty", new Object[0]);
        } else
        {
            Object obj1 = snappreviewfragment.getActivity();
            if (snappreviewfragment.n == SnapCaptureContext.DISCOVER)
            {
                if (snappreviewfragment.f != null && (snappreviewfragment.f instanceof WebView))
                {
                    WebView webview = (WebView)snappreviewfragment.f;
                    if (webview == null)
                    {
                        Timber.e("SnapPreviewFragment", "SnapWebView is empty", new Object[0]);
                    } else
                    {
                        DisplayMetrics displaymetrics = new DisplayMetrics();
                        snappreviewfragment.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
                        obj1 = snappreviewfragment. new Px(displaymetrics, webview, ((Context) (obj1)), com.snapchat.android.util.save.SaveImageToGalleryTask.SaveLocation.SNAPCHAT_ALBUM) {

                            private SnapPreviewFragment a;

                            protected final void a()
                            {
                                super.a();
                                SnapPreviewFragment.H(a).a(SnapPreviewFragment.p(a));
                            }

                            protected final void b()
                            {
                                super.b();
                                SnapPreviewFragment.H(a).b(SnapPreviewFragment.p(a));
                                SnapPreviewFragment.a(a, (vv)((Mediabryo) (SnapPreviewFragment.p(a))).mMediaExtras, mTotalSizeInByte);
                            }

                            protected final void c()
                            {
                                super.c();
                                SnapPreviewFragment.H(a).a(((Mediabryo) (SnapPreviewFragment.p(a))).mClientId);
                            }

                            protected final void d()
                            {
                                super.d();
                                SnapPreviewFragment.I(a);
                            }

            
            {
                a = SnapPreviewFragment.this;
                super(displaymetrics, webview, context, savelocation);
            }
                        };
                        ((Px) (obj1)).a();
                        Timber.c("SaveWebViewToGalleryTask", (new StringBuilder("Starting to save Discover web content to ")).append(((Px) (obj1)).mFilename).toString(), new Object[0]);
                        ((Px) (obj1)).e();
                        (new Ps()).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
                    }
                } else
                {
                    Bitmap bitmap = snappreviewfragment.d.a(((Context) (obj1)));
                    if (bitmap == null)
                    {
                        Timber.e("SnapPreviewFragment", "SnapBitmap is empty", new Object[0]);
                    } else
                    {
                        (snappreviewfragment. new SaveImageToGalleryTask(((Context) (obj1)), bitmap, SaveMediaNotificationsToShow.NONE) {

                            private SnapPreviewFragment a;

                            public final void a()
                            {
                                super.a();
                                SnapPreviewFragment.H(a).a(((Mediabryo) (SnapPreviewFragment.p(a))).mClientId);
                            }

                            public final void a(String s1)
                            {
                                super.a(s1);
                                SnapPreviewFragment.H(a).b(SnapPreviewFragment.p(a));
                                s1 = new File(s1);
                                SnapPreviewFragment.a(a, (vv)((Mediabryo) (SnapPreviewFragment.p(a))).mMediaExtras, s1.length());
                            }

                            public final void b(String s1)
                            {
                                super.b(s1);
                                SnapPreviewFragment.I(a);
                            }

                            public final void onPostExecute(Object obj4)
                            {
                                b((String)obj4);
                            }

                            public final void onPreExecute()
                            {
                                super.onPreExecute();
                                SnapPreviewFragment.H(a).a(SnapPreviewFragment.p(a));
                            }

            
            {
                a = SnapPreviewFragment.this;
                super(context, bitmap, null, savemedianotificationstoshow);
            }
                        }).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
                        (new Ps()).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
                    }
                }
            } else
            {
                Bitmap bitmap1 = snappreviewfragment.d.a(((Context) (obj1)));
                if (bitmap1 == null)
                {
                    Timber.e("SnapPreviewFragment", "SnapBitmap is empty", new Object[0]);
                } else
                {
                    (snappreviewfragment. new SaveImageToGalleryTask(((Context) (obj1)), bitmap1, com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext.PREVIEW, SaveMediaNotificationsToShow.ALL) {

                        private SnapPreviewFragment a;

                        public final void b(String s1)
                        {
                            super.b(s1);
                            SnapPreviewFragment.I(a);
                        }

                        public final void onPostExecute(Object obj4)
                        {
                            b((String)obj4);
                        }

            
            {
                a = SnapPreviewFragment.this;
                super(context, bitmap, savesnapcontext, savemedianotificationstoshow);
            }
                    }).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
                    (new Ps()).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
                }
            }
        }
        snappreviewfragment.am.a(com.snapchat.android.analytics.ui.EmojiPickerAnalytics.ReportType.SAVED, com.snapchat.android.analytics.ui.EmojiPickerAnalytics.SnapType.IMAGE);
        return;
    }

    static AA p(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.a;
    }

    static void q(SnapPreviewFragment snappreviewfragment)
    {
        String as1[] = new String[10];
        int i1 = 0;
        while (i1 < 10) 
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(i1 + 1).append("        ");
            String s1;
            if (i1 == 9)
            {
                s1 = "  ";
            } else
            {
                s1 = "";
            }
            as1[i1] = stringbuilder.append(s1).toString();
            i1++;
        }
        ((SnapchatTimePicker)snappreviewfragment.C.a()).setMinValue(1);
        ((SnapchatTimePicker)snappreviewfragment.C.a()).setMaxValue(10);
        ((SnapchatTimePicker)snappreviewfragment.C.a()).setDisplayedValues(as1);
        ((SnapchatTimePicker)snappreviewfragment.C.a()).setFocusable(true);
        ((SnapchatTimePicker)snappreviewfragment.C.a()).setFocusableInTouchMode(true);
        ((SnapchatTimePicker)snappreviewfragment.C.a()).setWrapSelectorWheel(false);
        ((SnapchatTimePicker)snappreviewfragment.C.a()).setValue(snappreviewfragment.F());
        ((SnapchatTimePicker)snappreviewfragment.C.a()).setOnTimeSelectedListener(snappreviewfragment. new net.simonvt.numberpicker.SnapchatTimePicker.e() {

            private SnapPreviewFragment a;

            public final void a()
            {
                a.p();
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
    }

    static PI r(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.E;
    }

    private boolean s()
    {
        return b != null || ab != null || ac != null;
    }

    static boolean s(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.X;
    }

    private void t()
    {
        if (v())
        {
            D.setVisibility(8);
            q.setVisibility(8);
            H.setVisibility(8);
            F.setVisibility(8);
        }
    }

    static void t(SnapPreviewFragment snappreviewfragment)
    {
        snappreviewfragment.aB = true;
        Animation animation = AnimationUtils.loadAnimation(snappreviewfragment.getActivity(), 0x7f050008);
        if (animation != null)
        {
            snappreviewfragment.E.a(0);
            animation.setAnimationListener(snappreviewfragment. new android.view.animation.Animation.AnimationListener() {

                final SnapPreviewFragment a;

                public final void onAnimationEnd(Animation animation1)
                {
                }

                public final void onAnimationRepeat(Animation animation1)
                {
                }

                public final void onAnimationStart(Animation animation1)
                {
                    animation1 = new AlphaAnimation(1.0F, 0.0F);
                    animation1.setDuration(750L);
                    animation1.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) {

                        private _cls14 a;

                        public final void onAnimationEnd(Animation animation)
                        {
                            SnapPreviewFragment.G(a.a).setVisibility(8);
                        }

                        public final void onAnimationRepeat(Animation animation)
                        {
                        }

                        public final void onAnimationStart(Animation animation)
                        {
                        }

            
            {
                a = _pcls14;
                super();
            }
                    });
                    SnapPreviewFragment.G(a).startAnimation(animation1);
                }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
            });
            ((RelativeLayout)snappreviewfragment.E.a()).startAnimation(animation);
        }
    }

    static AlertDialog u(SnapPreviewFragment snappreviewfragment)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(snappreviewfragment.getActivity());
        View view = LayoutInflater.from(snappreviewfragment.getActivity()).inflate(0x7f0400ae, null);
        ((CheckBox)view.findViewById(0x7f0d03bf)).setText(snappreviewfragment.getString(0x7f080193));
        builder.setInverseBackgroundForced(true);
        builder.setView(view).setTitle(0x7f080051).setPositiveButton(snappreviewfragment.getString(0x7f0801bc), snappreviewfragment. new android.content.DialogInterface.OnClickListener(view) {

            private View a;
            private SnapPreviewFragment b;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                boolean flag = false;
                if (b.getActivity() == null)
                {
                    return;
                }
                dialoginterface = (CheckBox)a.findViewById(0x7f0d03bf);
                Bt.a();
                if (!dialoginterface.isChecked())
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (Bt.U() && i1 == 0)
                {
                    Bt.a(OnboardingTooltip.POST_STORY);
                }
                dialoginterface = SharedPreferenceKey.HAS_SEEN_POST_STORY_DIALOG;
                if (i1 == 0)
                {
                    flag = true;
                }
                dialoginterface.putBoolean(flag);
                if (SnapPreviewFragment.v(b).e().size() > 1)
                {
                    SnapPreviewFragment.w(b);
                    return;
                } else
                {
                    SnapPreviewFragment.x(b);
                    return;
                }
            }

            
            {
                b = SnapPreviewFragment.this;
                a = view;
                super();
            }
        });
        return builder.create();
    }

    private void u()
    {
        Be be = ((Mediabryo) (a)).mPreviewConfiguration;
        if (be != null && be.mShouldHideSystemUi)
        {
            aq.a(new Og(false));
        }
    }

    static Bj v(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.aA;
    }

    private boolean v()
    {
        return ((Mediabryo) (a)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA;
    }

    private void w()
    {
        MediaMailingMetadata mediamailingmetadata = ((Mediabryo) (a)).mMediaMailingMetadata;
        if (s() && !mediamailingmetadata.d().isEmpty())
        {
            ((SendToBottomPanelView)N.a()).setBackgroundColor(getResources().getColor(0x7f0c0005));
            ((SendToBottomPanelView)N.a()).setSendButtonOnClickListener(new android.view.View.OnClickListener() {

                private SnapPreviewFragment a;

                public final void onClick(View view)
                {
                    if (!a.n())
                    {
                        return;
                    }
                    SnapPreviewFragment.C(a).a("SNAP_SENT_DELAY", ((Mediabryo) (SnapPreviewFragment.p(a))).mClientId, "preview_screen");
                    view = ((Mediabryo) (SnapPreviewFragment.p(a))).mMediaMailingMetadata;
                    if (!view.d().isEmpty())
                    {
                        SnapPreviewFragment.D(a).g();
                    }
                    if (((Mediabryo) (SnapPreviewFragment.p(a))).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.SNAP)
                    {
                        view = (Bd)view;
                        if (!((Bd) (view)).mPostToStories.isEmpty())
                        {
                            AA aa1 = SnapPreviewFragment.p(a);
                            boolean flag;
                            if (!view.d().isEmpty())
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            AnalyticsEvents.a(aa1, true, flag, "SEND_TO_SCREEN");
                        }
                    }
                    SnapPreviewFragment.E(a).a(new Mh(CameraDisplayState.SHOW));
                    SnapPreviewFragment.E(a).a(new Mq());
                    SnapPreviewFragment.E(a).a(new NZ(SnapPreviewFragment.p(a)));
                    ((SendToBottomPanelView)SnapPreviewFragment.F(a).a()).setSendButtonOnClickListener(null);
                }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
            });
            Object obj;
            String s1;
            String s2;
            String s3;
            MediaMailingMetadata mediamailingmetadata1;
            if (v())
            {
                ((SendToBottomPanelView)N.a()).setClickable(false);
                ((SendToBottomPanelView)N.a()).setOnClickListener(null);
            } else
            {
                ((SendToBottomPanelView)N.a()).setClickable(true);
                ((SendToBottomPanelView)N.a()).setOnClickListener(new android.view.View.OnClickListener() {

                    private SnapPreviewFragment a;

                    public final void onClick(View view)
                    {
                        if (!a.n())
                        {
                            return;
                        } else
                        {
                            SnapPreviewFragment.E(a).a(new NZ(SnapPreviewFragment.p(a), true));
                            (new EasyMetric("TAP_RECIPIENTS_IN_PREVIEW")).e();
                            ((SendToBottomPanelView)SnapPreviewFragment.F(a).a()).setOnClickListener(null);
                            return;
                        }
                    }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
                });
            }
            s3 = "";
            s2 = "";
            mediamailingmetadata1 = ((Mediabryo) (a)).mMediaMailingMetadata;
            obj = s2;
            s1 = s3;
            if (((Mediabryo) (a)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.SNAP)
            {
                Iterator iterator1 = ((Bd)mediamailingmetadata1).mPostToStories.iterator();
                do
                {
                    obj = s2;
                    s1 = s3;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    obj = (AQ)iterator1.next();
                    s3 = (new StringBuilder()).append(s3).append(s2).append(((AQ) (obj)).mDisplayName).toString();
                    s2 = ", ";
                } while (true);
            }
            for (Iterator iterator = mediamailingmetadata1.d().iterator(); iterator.hasNext();)
            {
                Friend friend = (Friend)iterator.next();
                s1 = (new StringBuilder()).append(s1).append(((String) (obj))).append(friend.c()).toString();
                obj = ", ";
            }

            ((SendToBottomPanelView)N.a()).setText(s1);
            D();
            F.setVisibility(8);
            if (!v())
            {
                SendToBottomPanelView sendtobottompanelview = (SendToBottomPanelView)N.a();
                if (sendtobottompanelview.e == null || !sendtobottompanelview.e.isStarted())
                {
                    float f1 = (float)Jo.a(sendtobottompanelview.d) / 2.0F;
                    ObjectAnimator objectanimator = ObjectAnimator.ofFloat(sendtobottompanelview.c, "translationY", new float[] {
                        -1F * f1
                    });
                    objectanimator.setDuration(200L);
                    objectanimator.addListener(new com.snapchat.android.ui.SendToBottomPanelView._cls1(sendtobottompanelview));
                    ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(sendtobottompanelview.d, "alpha", new float[] {
                        0.0F
                    });
                    objectanimator1.setDuration(200L);
                    objectanimator1.setStartDelay(3000L);
                    ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(sendtobottompanelview.c, "translationY", new float[] {
                        f1
                    });
                    AnimatorSet animatorset = new AnimatorSet();
                    animatorset.play(objectanimator1).with(objectanimator2).after(objectanimator);
                    animatorset.addListener(new com.snapchat.android.ui.SendToBottomPanelView._cls2(sendtobottompanelview));
                    sendtobottompanelview.e = animatorset;
                    animatorset.start();
                }
            }
        } else
        if (((Mediabryo) (a)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
        {
            if (N.b())
            {
                ((SendToBottomPanelView)N.a()).setClickable(false);
                ((SendToBottomPanelView)N.a()).setOnClickListener(null);
            }
            E();
            if (IY.a(a))
            {
                D.setVisibility(4);
            } else
            {
                D.setVisibility(8);
            }
            q.setVisibility(8);
            F.setVisibility(8);
            if (!h)
            {
                A.setVisibility(8);
                return;
            }
        }
    }

    static void w(SnapPreviewFragment snappreviewfragment)
    {
        ((SendToBottomPanelView)snappreviewfragment.N.a()).setBackgroundColor(snappreviewfragment.getResources().getColor(0x7f0c000a));
        ((SendToBottomPanelView)snappreviewfragment.N.a()).setSendButtonOnClickListener(snappreviewfragment. new android.view.View.OnClickListener() {

            private SnapPreviewFragment a;

            public final void onClick(View view)
            {
                if (a.k.isEmpty())
                {
                    SnapPreviewFragment.A(a);
                    return;
                } else
                {
                    SnapPreviewFragment.x(a);
                    return;
                }
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        snappreviewfragment.y.setVisibility(8);
        if (snappreviewfragment.k.isEmpty())
        {
            snappreviewfragment.k.add(AM.c());
        }
        snappreviewfragment.C();
        snappreviewfragment.M.a(0);
        snappreviewfragment.D();
    }

    private void x()
    {
        if (getActivity() != null)
        {
            Window window = ac();
            if (window != null)
            {
                android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
                layoutparams.flags = layoutparams.flags & 0xfffffdff;
                window.setAttributes(layoutparams);
            }
        }
    }

    static void x(SnapPreviewFragment snappreviewfragment)
    {
        if (!snappreviewfragment.n() || ((Mediabryo) (snappreviewfragment.a)).mSnapType != com.snapchat.android.model.Mediabryo.SnapType.SNAP)
        {
            Timber.e("SnapPreviewFragment", "Failed to prepare snap for sending!", new Object[0]);
            return;
        }
        Object obj = (Bd)((Mediabryo) (snappreviewfragment.a)).mMediaMailingMetadata;
        com.snapchat.android.analytics.ui.EmojiPickerAnalytics.ReportType reporttype;
        boolean flag;
        if (snappreviewfragment.M.c())
        {
            obj.mPostToStories = new ArrayList(snappreviewfragment.k);
        } else
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(AM.c());
            obj.mPostToStories = arraylist;
        }
        if (snappreviewfragment.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        AnalyticsEvents.a(snappreviewfragment.a, flag, flag, "PREVIEW_SCREEN");
        snappreviewfragment.ah.b(snappreviewfragment.a, false, true);
        snappreviewfragment.ak.a("STORY_POST_DELAY", ((Mediabryo) (snappreviewfragment.a)).mClientId, "preview_screen");
        snappreviewfragment.aq.a(new Oq());
        snappreviewfragment.aq.a(new Mh(CameraDisplayState.SHOW));
        obj = snappreviewfragment.am;
        reporttype = com.snapchat.android.analytics.ui.EmojiPickerAnalytics.ReportType.POSTED;
        if (IY.a(snappreviewfragment.a))
        {
            snappreviewfragment = com.snapchat.android.analytics.ui.EmojiPickerAnalytics.SnapType.VIDEO;
        } else
        {
            snappreviewfragment = com.snapchat.android.analytics.ui.EmojiPickerAnalytics.SnapType.IMAGE;
        }
        ((EmojiPickerAnalytics) (obj)).a(reporttype, snappreviewfragment);
    }

    static boolean y(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.ad;
    }

    static lv z(SnapPreviewFragment snappreviewfragment)
    {
        return snappreviewfragment.aj;
    }

    private void z()
    {
        aq.a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN));
        Object obj;
        lv lv1;
        int i1;
        boolean flag;
        if (IY.a(a))
        {
            D.setVisibility(4);
            q.setVisibility(8);
            H.setVisibility(0);
            if (getUserVisibleHint())
            {
                aq.a(new Mo(1));
            }
        } else
        {
            if (getUserVisibleHint() && ((Mediabryo) (a)).mSnapType != com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
            {
                aq.a(new Mo(-1));
            }
            t();
        }
        O.setOnClickListener(new android.view.View.OnClickListener() {

            private SnapPreviewFragment a;

            public final void onClick(View view)
            {
                SnapPreviewFragment.f(a).h.a(true);
                SnapPreviewFragment.g(a);
                if (SnapPreviewFragment.h(a).c())
                {
                    ((EmojiVerticalSwipeLayout)SnapPreviewFragment.h(a).a()).a(0, 0.0D);
                    view = SnapPreviewFragment.i(a);
                    view.c = ((EmojiPickerAnalytics) (view)).c + 1;
                    view.a();
                } else
                {
                    SnapPreviewFragment.h(a).a(0);
                    ((EmojiVerticalSwipeLayout)SnapPreviewFragment.h(a).a()).a(1, 1.0D);
                    view = SnapPreviewFragment.i(a);
                    if (((EmojiPickerAnalytics) (view)).h == -1L)
                    {
                        view.a = ((EmojiPickerAnalytics) (view)).a + 1;
                        view.h = SystemClock.elapsedRealtime();
                        return;
                    }
                }
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        z.setOnClickListener(new android.view.View.OnClickListener() {

            private SnapPreviewFragment a;

            public final void onClick(View view)
            {
                ((InputMethodManager)SnapPreviewFragment.a(a, "input_method")).hideSoftInputFromWindow(SnapPreviewFragment.j(a).getApplicationWindowToken(), 0);
                a.getActivity().onBackPressed();
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        Z.setOnClickListener(new android.view.View.OnClickListener() {

            private SnapPreviewFragment a;

            public final void onClick(View view)
            {
                SnapPreviewFragment.h(a).a(4);
                SnapPreviewFragment.f(a).j();
                if (SnapPreviewFragment.f(a).h.m() && !SnapPreviewFragment.f(a).h.i())
                {
                    SnapPreviewFragment.f(a).h.h();
                    return;
                } else
                {
                    SnapPreviewFragment.f(a).a(true);
                    return;
                }
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        u.a(new PI.a() {

            final SnapPreviewFragment a;

            public final void a(View view)
            {
                ((ImageButton)SnapPreviewFragment.l(a).a()).setOnClickListener(new android.view.View.OnClickListener(this) {

                    private _cls27 a;

                    public final void onClick(View view)
                    {
                        SnapPreviewFragment.k(a.a);
                    }

            
            {
                a = _pcls27;
                super();
            }
                });
                ((ImageButton)SnapPreviewFragment.n(a).a()).setOnClickListener(new android.view.View.OnClickListener(this) {

                    private _cls27 a;

                    public final void onClick(View view)
                    {
                        SnapPreviewFragment.m(a.a);
                    }

            
            {
                a = _pcls27;
                super();
            }
                });
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        r.setOnClickListener(new android.view.View.OnClickListener() {

            private SnapPreviewFragment a;

            public final void onClick(View view)
            {
                AnalyticsEvents.i();
                SnapPreviewFragment.f(a).j();
                SnapPreviewFragment.k(a);
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        A.setOnClickListener(new android.view.View.OnClickListener() {

            private SnapPreviewFragment a;

            public final void onClick(View view)
            {
                SnapPreviewFragment.o(a);
                ((Mediabryo) (SnapPreviewFragment.p(a))).mMediaMailingMetadata.mSavedInGallery = true;
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        E.a(new PI.a() {

            private SnapPreviewFragment a;

            public final void a(View view)
            {
                SnapPreviewFragment.q(a);
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        D.setOnClickListener(new android.view.View.OnClickListener() {

            private SnapPreviewFragment a;

            public final void onClick(View view)
            {
                if (!SnapPreviewFragment.r(a).c())
                {
                    if (SnapPreviewFragment.s(a))
                    {
                        SnapPreviewFragment.k(a);
                    }
                    SnapPreviewFragment.t(a);
                }
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        M.a(new PI.a() {

            private SnapPreviewFragment a;

            public final void a(View view)
            {
                ((ListView)view.findViewById(0x7f0d04a3)).setAdapter(a.l);
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        F.setOnClickListener(new android.view.View.OnClickListener() {

            private SnapPreviewFragment a;

            public final void onClick(View view)
            {
                if (Bt.U())
                {
                    SnapPreviewFragment.u(a).show();
                    return;
                }
                if (SnapPreviewFragment.v(a).e().size() > 1)
                {
                    SnapPreviewFragment.w(a);
                    return;
                } else
                {
                    SnapPreviewFragment.x(a);
                    return;
                }
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        w();
        i1 = F();
        ae = i1;
        q.setText(String.valueOf(i1));
        L.setOnClickListener(new android.view.View.OnClickListener() {

            private SnapPreviewFragment a;

            public final void onClick(View view)
            {
                if (!SnapPreviewFragment.y(a))
                {
                    SnapPreviewFragment.z(a).mPrepareSnapMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("PREPARE_SNAP").b();
                    SnapPreviewFragment.A(a);
                }
                SnapPreviewFragment.B(a);
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        H.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private SnapPreviewFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
            {
                compoundbutton = SnapPreviewFragment.f(a);
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                compoundbutton.setAudible(flag1);
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        d.h.setIsVideoSnap(IY.a(a));
        if (ag == null)
        {
            d.setMediabryo(a);
        } else
        {
            obj1 = d;
            com.snapchat.android.ui.SnapEditorView.a a1 = ag;
            if (a1 != null)
            {
                ((SnapEditorView) (obj1)).setMediabryo(a1.c);
                Fp fp = ((SnapEditorView) (obj1)).o;
                i1 = a1.a;
                fp.b.c = i1;
                fp.b.d = i1;
                fp = ((SnapEditorView) (obj1)).o;
                i1 = a1.b;
                fp.b.a = i1;
                fp.b.b = i1;
                obj1.v = CaptionTypeEnums.values()[a1.d];
                if (((SnapEditorView) (obj1)).v != CaptionTypeEnums.NON_FAT_VANILLA_CAPTION_TYPE)
                {
                    ((SnapEditorView) (obj1)).a(false);
                }
            }
            ag = null;
        }
        obj = d;
        if (!H.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((SnapEditorView) (obj)).setAudible(flag);
        obj = Z;
        if (X)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((ImageButton) (obj)).setVisibility(i1);
        if (d.f() == FilterPageType.TURN_ON_FILTERS_PAGE)
        {
            if (aD != null)
            {
                aD.a = true;
                aD = null;
            }
            r.setVisibility(8);
            y.setVisibility(8);
            z.setVisibility(8);
        }
        p.a(aa);
        aa = Jo.e(getActivity());
        lv1 = aj;
        flag = Jo.b(aa);
        if (lv1.mSnapCaptureMetric != null)
        {
            EasyMetric easymetric = lv1.mSnapCaptureMetric;
            Object obj1;
            if (flag)
            {
                obj1 = "portrait";
            } else
            {
                obj1 = "landscape";
            }
            easymetric.a("orientation", obj1).a("first_snap_capture", Boolean.valueOf(lv.mFirstSnapCapture)).b(false);
            lv1.mSnapCaptureMetric = null;
            lv.mFirstSnapCapture = false;
        }
        lv1.c();
        al.a = a.i();
    }

    public final void a(int i1)
    {
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        if (i1 == 0)
        {
            a(((View) (O)));
            z.setAlpha(0.2F);
            y.setVisibility(4);
            V.setAlpha(1.0F);
            d.setEnabled(false);
            return;
        } else
        {
            a(((View) (null)));
            z.setAlpha(1.0F);
            y.setVisibility(0);
            V.setAlpha(0.0F);
            d.setEnabled(true);
            return;
        }
    }

    public final void a(AQ aq1, boolean flag)
    {
        if (flag)
        {
            k.add(aq1);
            if (Bj.a(aq1) && Bj.a(aq1))
            {
                Iterator iterator = k.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (Bj.a(aq1, (AQ)iterator.next()))
                    {
                        iterator.remove();
                    }
                } while (true);
                C();
            }
        } else
        {
            k.remove(aq1);
        }
        C();
    }

    public final void a(SwipeImageView swipeimageview)
    {
        if (!Bt.al())
        {
            FilterPageType filterpagetype = swipeimageview.b.b(swipeimageview.c.a(false));
            FilterPageType filterpagetype1 = swipeimageview.b.b(swipeimageview.c.b(false));
            if (filterpagetype == FilterPageType.TURN_ON_FILTERS_PAGE)
            {
                a(1.0F - swipeimageview.b());
                b(1.0F - swipeimageview.b());
                return;
            }
            if (filterpagetype1 == FilterPageType.TURN_ON_FILTERS_PAGE)
            {
                a(swipeimageview.b());
                b(swipeimageview.b());
                return;
            }
        }
    }

    public final void a(SwipeImageView swipeimageview, boolean flag)
    {
        PG.b(new zY._cls1(az));
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!J.c()) goto _L4; else goto _L3
_L3:
        J.a(8);
        Bt.i(true);
_L2:
        if (Bt.al())
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (r.getVisibility() == 8)
        {
            if (aD != null)
            {
                aD.a = true;
                aD = null;
            }
            r.setVisibility(0);
            y.setVisibility(0);
            z.setVisibility(0);
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (swipeimageview.a(swipeimageview.c.a) == FilterPageType.TURN_ON_FILTERS_PAGE)
        {
            a(0.0F);
            return;
        } else
        {
            a(1.0F);
            return;
        }
    }

    public final boolean a(AQ aq1)
    {
        return k.contains(aq1);
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BEHIND;
    }

    public final boolean f()
    {
        boolean flag2 = false;
        if (M.c())
        {
            m();
        } else
        {
            if (aB)
            {
                p();
                return true;
            }
            if (Y || d == null || d.h == null || p == null)
            {
                return false;
            }
            SnapEditorView snapeditorview = d;
            boolean flag;
            if (snapeditorview.h.i() && (snapeditorview.h instanceof FatCaptionView))
            {
                snapeditorview.h.a(true);
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
label0:
                {
                    if (af)
                    {
                        if (U.c())
                        {
                            EmojiPickerAnalytics emojipickeranalytics = am;
                            emojipickeranalytics.b = emojipickeranalytics.b + 1;
                            emojipickeranalytics.a();
                        }
                        U.a(4);
                        d.h.a(true);
                        d(false);
                        b(false);
                        return true;
                    }
                    if (!p.f())
                    {
                        boolean flag1 = flag2;
                        if (d.q.getChildCount() >= 4)
                        {
                            flag1 = true;
                        }
                        if (!flag1)
                        {
                            break label0;
                        }
                    }
                    (new Ge(getActivity(), getString(0x7f08005f)) {

                        private SnapPreviewFragment a;

                        protected final void a()
                        {
                            if (!SnapPreviewFragment.d(a))
                            {
                                SnapPreviewFragment.e(a);
                                FragmentActivity fragmentactivity = a.getActivity();
                                if (fragmentactivity != null)
                                {
                                    fragmentactivity.onBackPressed();
                                    return;
                                }
                            }
                        }

                        protected final void b()
                        {
                        }

            
            {
                a = SnapPreviewFragment.this;
                super(context, s1);
            }
                    }).show();
                    return true;
                }
                return B();
            }
        }
        return true;
    }

    public final void h()
    {
        ag = d.a();
        z();
    }

    public final boolean k_()
    {
        return true;
    }

    public final boolean m()
    {
        if (!M.c())
        {
            return false;
        } else
        {
            M.a(8);
            y.setVisibility(0);
            E();
            return true;
        }
    }

    protected final boolean n()
    {
        Object obj;
        if (a == null || a.i() == 0 && ((Mediabryo) (a)).mRawImageBitmap == null)
        {
            return true;
        }
        a.c();
        obj = getActivity();
        Ho ho = d.j.c();
        if (ho != null)
        {
            ho.i();
        }
        obj = d.a(((Context) (obj)));
        if (!IY.a(a)) goto _L2; else goto _L1
_L1:
        double d1;
        WP.b b1;
        d.c();
        if (((Mediabryo) (a)).mVideoUri == null || ((Mediabryo) (a)).mVideoUri.getPath() == null)
        {
            return false;
        }
        b1 = d.d();
        d1 = d.p.d;
        a.a(((Bitmap) (obj)));
        if (H.isChecked())
        {
            a.j();
        }
        if (((Mediabryo) (a)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.SNAP && ((Mediabryo) (a)).mVideoUri != null)
        {
            a.mTimerValueOrDuration = (long)((double)at.a(((Mediabryo) (a)).mVideoUri) / d.p.d) / 1000L;
        }
        if (!(a instanceof Bw)) goto _L4; else goto _L3
_L3:
        Bw bw = (Bw)a;
        if (((Mediabryo) (a)).mSnapType != com.snapchat.android.model.Mediabryo.SnapType.DISCOVER) goto _L6; else goto _L5
_L5:
        int i1;
        Bitmap bitmap1 = bw.mFirstFrameBitmap;
        if (bitmap1 == null)
        {
            Timber.e("SnapPreviewFragment", "Videobryo has no first frame bitmap.", new Object[0]);
            if (ReleaseManager.f())
            {
                throw new IllegalArgumentException("Videobryo has no first frame bitmap.");
            }
            i1 = 0;
        } else
        {
            Bitmap bitmap2 = ((AA) (bw)).mCompositeImageBitmap;
            Bitmap bitmap;
            int j1;
            if (bitmap2 == null)
            {
                j1 = bitmap1.getWidth();
                i1 = bitmap1.getHeight();
            } else
            {
                j1 = bitmap2.getWidth();
                i1 = bitmap2.getHeight();
            }
            bitmap = ar.a(j1, i1, android.graphics.Bitmap.Config.ARGB_8888);
            obj = bitmap;
            if (bitmap == null)
            {
                obj = SnapMediaUtils.a(j1, i1, android.graphics.Bitmap.Config.ARGB_8888);
            }
            if (obj == null)
            {
                obj = String.format("Failed to create bitmap for raw image (width=%d, height=%d)", new Object[] {
                    Integer.valueOf(j1), Integer.valueOf(i1)
                });
                Timber.e("SnapPreviewFragment", ((String) (obj)), new Object[0]);
                if (ReleaseManager.f())
                {
                    throw new IllegalArgumentException(((String) (obj)));
                }
                i1 = 0;
            } else
            {
                Canvas canvas = new Canvas(((Bitmap) (obj)));
                canvas.drawBitmap(bitmap1, 0.0F, 0.0F, null);
                if (bitmap2 != null)
                {
                    canvas.drawBitmap(bitmap2, 0.0F, 0.0F, null);
                }
                bw.mRawImageBitmap = ((Bitmap) (obj));
                i1 = 1;
            }
        }
        if (i1 != 0) goto _L6; else goto _L7
_L7:
        i1 = 0;
_L9:
        if (i1 == 0)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L6:
        bw.mShaderFilter = b1;
        bw.mPlaybackRate = d1;
        obj = getResources().getDisplayMetrics();
        Timber.c("SnapPreviewFragment", (new StringBuilder("Display Metrics ")).append(((DisplayMetrics) (obj)).widthPixels).append(" x ").append(((DisplayMetrics) (obj)).heightPixels).toString(), new Object[0]);
        i1 = ((DisplayMetrics) (obj)).widthPixels;
        i1 = ((DisplayMetrics) (obj)).heightPixels;
        as.a(bw);
_L4:
        i1 = 1;
        if (true) goto _L9; else goto _L8
_L2:
        if (obj == null)
        {
            return false;
        }
        if (obj == null)
        {
            throw new NullPointerException("Image Snap with no image? Ruh-roh");
        }
        a.a(((Bitmap) (obj)));
        a.mTimerValueOrDuration = ae;
_L8:
        if (!d.h.m())
        {
            a.mCaptionText = d.h.l();
        }
        obj = a;
        Object obj1;
        com.snapchat.android.analytics.ui.EmojiPickerAnalytics.ReportType reporttype;
        boolean flag;
        if (p.e() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.mHasDrawing = flag;
        a.mSwipeFilterNumSingleSwipes = al.b;
        a.mSwipeFilterNumDoubleSwipes = al.c;
        a.mGeofilterImpressions = al.d;
        obj1 = a;
        obj = d;
        if (!((SnapEditorView) (obj)).h.m()) goto _L11; else goto _L10
_L10:
        obj = "0";
_L13:
        obj1.mCaptionStyleDescription = ((String) (obj));
        a.mCaptionAnalyticData = d.h.q();
        a.mBaseFilter = al.e;
        a.mStackedFilter = al.f;
        obj1 = am;
        reporttype = com.snapchat.android.analytics.ui.EmojiPickerAnalytics.ReportType.SENT;
        if (IY.a(a))
        {
            obj = com.snapchat.android.analytics.ui.EmojiPickerAnalytics.SnapType.VIDEO;
        } else
        {
            obj = com.snapchat.android.analytics.ui.EmojiPickerAnalytics.SnapType.IMAGE;
        }
        ((EmojiPickerAnalytics) (obj1)).a(reporttype, ((com.snapchat.android.analytics.ui.EmojiPickerAnalytics.SnapType) (obj)));
        return true;
_L11:
        switch (com.snapchat.android.ui.SnapEditorView._cls8.a[((SnapEditorView) (obj)).v.ordinal()])
        {
        default:
            obj = "Index out of bounds D:";
            break;

        case 1: // '\001'
            obj = "1";
            break;

        case 2: // '\002'
            obj = "2";
            break;

        case 3: // '\003'
            obj = "3";
            break;
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final int o()
    {
        return z.getBottom();
    }

    public void onActivityCreated(Bundle bundle)
    {
        Object obj;
        super.onActivityCreated(bundle);
        if (mFragmentLayout == null)
        {
            return;
        }
        bundle = getActivity();
        if (bundle != null)
        {
            av = PreferenceManager.getDefaultSharedPreferences(bundle);
        }
        W = new ArrayList();
        z = (ImageButton)d(0x7f0d0276);
        Z = (ImageButton)d(0x7f0d0278);
        W.add(Z);
        P = (ImageButton)d(0x7f0d048c);
        O = (ImageButton)d(0x7f0d048d);
        W.add(O);
        r = (ImageButton)d(0x7f0d0277);
        W.add(r);
        A = (ImageButton)d(0x7f0d027a);
        v = new PI(mFragmentLayout, 0x7f0d048f, 0x7f0d0499);
        q = (TextView)d(0x7f0d0491);
        D = d(0x7f0d0490);
        F = d(0x7f0d0492);
        I = new PI(mFragmentLayout, 0x7f0d0493, 0x7f0d049b);
        J = new PI(mFragmentLayout, 0x7f0d0494, 0x7f0d04a4);
        H = (CheckBox)d(0x7f0d0270);
        L = (ImageButton)d(0x7f0d027b);
        M = new PI(mFragmentLayout, 0x7f0d0495, 0x7f0d04a2);
        N = new PI(mFragmentLayout, 0x7f0d0496, 0x7f0d042a);
        u = new PI(mFragmentLayout, 0x7f0d048e, 0x7f0d049c);
        s = new PI(mFragmentLayout, 0x7f0d048e, 0x7f0d049d);
        G = new PI(mFragmentLayout, 0x7f0d048e, 0x7f0d049f);
        t = new PI(mFragmentLayout, 0x7f0d048e, 0x7f0d049e);
        x = new PI(mFragmentLayout, 0x7f0d048e, 0x7f0d04a0);
        U = new PI(mFragmentLayout, 0x7f0d0498, 0x7f0d02b8);
        K = (RelativeLayout)d(0x7f0d048b);
        z.setOnTouchListener(new Id(z));
        r.setOnTouchListener(new Id(r));
        D.setOnTouchListener(new Id(D));
        B = new Id(A);
        A.setOnTouchListener(B);
        F.setOnTouchListener(new Id(F));
        H.setOnTouchListener(new Id(H));
        L.setOnTouchListener(new Id(L));
        obj = new Id(O);
        O.setOnTouchListener(((android.view.View.OnTouchListener) (obj)));
        Z.setOnTouchListener(new Id(Z));
        t.a(new PI.a() {

            private SnapPreviewFragment a;

            public final void a(View view)
            {
                Id id = new Id(view);
                id.mBindedViewToAnimate = SnapPreviewFragment.a(a).a();
                view.setOnTouchListener(id);
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        x.a(new PI.a() {

            private SnapPreviewFragment a;

            public final void a(View view)
            {
                Id id = new Id(view);
                id.mBindedViewToAnimate = SnapPreviewFragment.b(a).a();
                view.setOnTouchListener(id);
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        if (Bt.c() != 0 || Bt.W()) goto _L2; else goto _L1
_L1:
        I.a(0);
_L4:
        T = new EmojiDeletionHandler(getActivity(), O, ((Id) (obj)), P, am);
        E = new PI(mFragmentLayout, 0x7f0d0497, 0x7f0d04a7);
        C = new PI(mFragmentLayout, 0x7f0d0497, 0x7f0d04a8);
        y = d(0x7f0d0279);
        d = (SnapEditorView)d(0x7f0d0489);
        obj = Ax.a();
        new Aa();
        obj = new HQ(((Az) (obj)), new Av(bundle), new als(), Aw.a());
        d.a(bundle, i, ((HR) (obj)));
        d.setSnapPreviewRotationListener(this);
        d.setInterface(this);
        d.setSwipeImageViewAnalytics(al);
        d.setSwipeImageViewOnScrollListener(this);
        p = d.i;
        z();
        Q = Gk.a();
        S = new Gp();
        S.a.add(this);
        V = d(0x7f0d048a);
        PG.b(new Runnable() {

            private SnapPreviewFragment a;

            public final void run()
            {
                Go go = new Go(0x7f0d0007, 0x7f0201b0);
                go.a(Gn.a("\uD83D\uDE00 \uD83D\uDE01 \uD83D\uDE02 \uD83D\uDE03 \uD83D\uDE04 \uD83D\uDE05 \uD83D\uDE06 \uD83D\uDE07 \uD83D\uDE08 \uD83D\uDC7F \uD83D\uDE09 \uD83D\uDE0A \u263A\uFE0F \uD83D\uDE0B \uD83D\uDE0C \uD83D\uDE0D \uD83D\uDE0E \uD83D\uDE0F \uD83D\uDE10 \uD83D\uDE11 \uD83D\uDE12 \uD83D\uDE13 \uD83D\uDE14 \uD83D\uDE15 \uD83D\uDE16 \uD83D\uDE17 \uD83D\uDE18 \uD83D\uDE19 \uD83D\uDE1A \uD83D\uDE1B \uD83D\uDE1C \uD83D\uDE1D \uD83D\uDE1E \uD83D\uDE1F \uD83D\uDE20 \uD83D\uDE21 \uD83D\uDE22 \uD83D\uDE23 \uD83D\uDE24 \uD83D\uDE25 \uD83D\uDE26 \uD83D\uDE27 \uD83D\uDE28 \uD83D\uDE29 \uD83D\uDE2A \uD83D\uDE2B \uD83D\uDE2C \uD83D\uDE2D \uD83D\uDE2E \uD83D\uDE2F \uD83D\uDE30 \uD83D\uDE31 \uD83D\uDE32 \uD83D\uDE33 \uD83D\uDE34 \uD83D\uDE35 \uD83D\uDE36 \uD83D\uDE37 \uD83D\uDE38 \uD83D\uDE39 \uD83D\uDE3A \uD83D\uDE3B \uD83D\uDE3C \uD83D\uDE3D \uD83D\uDE3E \uD83D\uDE3F \uD83D\uDE40 \uD83D\uDC63 \uD83D\uDC64 \uD83D\uDC65 \uD83D\uDC76 \uD83D\uDC66 \uD83D\uDC67 \uD83D\uDC68 \uD83D\uDC69 \uD83D\uDC6A \uD83D\uDC6B \uD83D\uDC6C \uD83D\uDC6D \uD83D\uDC6F \uD83D\uDC70 \uD83D\uDC71 \uD83D\uDC72 \uD83D\uDC73 \uD83D\uDC74 \uD83D\uDC75 \uD83D\uDC6E \uD83D\uDC77 \uD83D\uDC78 \uD83D\uDC82 \uD83D\uDC7C \uD83C\uDF85 \uD83D\uDC7B \uD83D\uDC79 \uD83D\uDC7A \uD83D\uDCA9 \uD83D\uDC80 \uD83D\uDC7D \uD83D\uDC7E \uD83D\uDE47 \uD83D\uDC81 \uD83D\uDE45 \uD83D\uDE46 \uD83D\uDE4B \uD83D\uDE4E \uD83D\uDE4D \uD83D\uDC86 \uD83D\uDC87 \uD83D\uDC91 \uD83D\uDC8F \uD83D\uDE4C \uD83D\uDC4F \uD83D\uDC42 \uD83D\uDC40 \uD83D\uDC43 \uD83D\uDC44 \uD83D\uDC8B \uD83D\uDC45 \uD83D\uDC85 \uD83D\uDC4B \uD83D\uDC4D \uD83D\uDC4E \u261D\uFE0F \uD83D\uDC46 \uD83D\uDC47 \uD83D\uDC48 \uD83D\uDC49 \uD83D\uDC4C \u270C\uFE0F \uD83D\uDC4A \u270A \u270B \uD83D\uDCAA \uD83D\uDC50 \uD83D\uDE4F"));
                SnapPreviewFragment.c(a).a(go);
            }

            
            {
                a = SnapPreviewFragment.this;
                super();
            }
        });
        p.setColor(p.c());
        l = new Do(getActivity(), aA.e(), this);
        return;
_L2:
        if (!Bt.X())
        {
            A();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onColorPickedEvent(Ms ms)
    {
        SnapCaptionView snapcaptionview = d.h;
        if (!(snapcaptionview instanceof FatCaptionView) || !snapcaptionview.i())
        {
            p.setColor(ms.mColor);
            ((GradientDrawable)s.a().getBackground()).setColor(p.c());
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        h();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        x();
        if (a == null)
        {
            throw new NullPointerException();
        }
        mFragmentLayout = layoutinflater.inflate(0x7f0400d4, viewgroup, false);
        e.mView = mFragmentLayout;
        if (a.i() == 0 && ((Mediabryo) (a)).mRawImageBitmap == null)
        {
            e.a();
        }
        w = new PI(mFragmentLayout, 0x7f0d004f, 0x7f0d03fd);
        return mFragmentLayout;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (a != null)
        {
            a.k();
        }
        android.view.WindowManager.LayoutParams layoutparams = ac().getAttributes();
        layoutparams.flags = layoutparams.flags | 0x200;
        ac().setAttributes(layoutparams);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (!d.h.m())
        {
            AnalyticsEvents.h();
        }
        if (p.e() > 0)
        {
            AnalyticsEvents.a(p.e());
        }
        if (al.b + al.c > 0)
        {
            AnalyticsEvents.a(a);
        }
        Object obj = lw.a();
        Object obj1 = a;
        int i1 = ((AA) (obj1)).i();
        obj1 = ((AA) (obj1)).mGeofilterSwipeMetaData.mData.values().iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            lg lg1 = (lg)((Iterator) (obj1)).next();
            hy hy1 = new hy();
            hy1.filterGeofilterId = lg1.filterGeofilterId;
            lg1.a();
            hy1.viewTimeSec = Double.valueOf((double)(lg1.viewTimeStopwatch.a(TimeUnit.MILLISECONDS) / 100L) / 10D);
            hy1.filterIndexPos = Long.valueOf(lg1.filterIndexPos);
            hy1.filterIndexCount = Long.valueOf(lg1.filterIndexCount);
            hy1.filterCount = Long.valueOf(lg1.filterCount);
            hy1.mediaType = lw.a(i1);
            boolean flag;
            if (!lg1.isSponsored)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hy1.userNotTracked = Boolean.valueOf(flag);
            ((lw) (obj)).mBlizzardEventLogger.a(hy1);
        }
        d.q.removeAllViews();
        obj = d;
        ((SnapEditorView) (obj)).a.b(obj);
        ((SnapEditorView) (obj)).a.b(((SnapEditorView) (obj)).n);
        obj1 = ((SnapEditorView) (obj)).n;
        for (Iterator iterator = ((Hw) (obj1)).c.a.iterator(); iterator.hasNext(); ((HN)iterator.next()).a()) { }
        ((Hw) (obj1)).b.g = true;
        ((Hw) (obj1)).d.nativeTerminateProcessing();
        obj1 = ((SnapEditorView) (obj)).u;
        for (Iterator iterator1 = ((HA) (obj1)).a.iterator(); iterator1.hasNext(); ((Ho)iterator1.next()).e()) { }
        ((HA) (obj1)).c();
        ((SnapEditorView) (obj)).i.a();
        ((SnapEditorView) (obj)).t.m();
        obj.t = null;
        obj.r = null;
        obj.s = null;
        ((SnapEditorView) (obj)).e.a(0x7f0400d2, ((SnapEditorView) (obj)).m);
        obj.m = null;
        d = null;
        ag = null;
        Q.a.c();
        obj = ac().getAttributes();
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x200;
        ac().setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
        aq.a(new Mo(1));
    }

    public void onDrawingEvent(DrawingEvent drawingevent)
    {
        if (aD != null)
        {
            aD.a = true;
            aD = null;
        }
        if (drawingevent.mDrawingEventType == com.snapchat.android.util.eventbus.DrawingEvent.DrawingEventType.STARTED_STROKE)
        {
            aD = new a((byte)0);
            aC.postDelayed(aD, 250L);
        } else
        if (drawingevent.mDrawingEventType == com.snapchat.android.util.eventbus.DrawingEvent.DrawingEventType.COMPLETED_STROKE)
        {
            if (aE != -1L)
            {
                float f2 = (1E+12F * (float)(System.nanoTime() - aE)) / 400F;
                aE = -1L;
                float f1 = f2;
                if (f2 > 1.0F)
                {
                    f1 = 1.0F;
                }
                drawingevent = new AlphaAnimation(f1 * 0.0F, 1.0F);
                drawingevent.setDuration(400L);
                u.a().startAnimation(drawingevent);
                y.startAnimation(drawingevent);
                z.startAnimation(drawingevent);
                if (N.c())
                {
                    ((SendToBottomPanelView)N.a()).startAnimation(drawingevent);
                }
            }
            x.a(0);
            G.a(0);
            ((GradientDrawable)G.a().getBackground()).setColor(p.c());
            return;
        }
    }

    public void onEditCaptionEvent(MB mb)
    {
        I.a(8);
        if (!Bt.W())
        {
            (new mS(OnboardingTooltip.CAPTION)).execute();
        }
        SharedPreferenceKey.HAS_SEEN_CAPTION_ONBOARDING_MESSAGE.putBoolean(true);
        v.a(4);
        J.a(8);
        SnapCaptionView snapcaptionview = d.h;
        Z.setImageResource(0x7f02026e);
        ImageButton imagebutton = Z;
        byte byte0;
        if (X)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        imagebutton.setVisibility(byte0);
        b(mb.mIsEditing);
        a(((View) (null)));
        z.setAlpha(1.0F);
        if (mb.mIsEditing)
        {
            if (snapcaptionview instanceof FatCaptionView)
            {
                p.setDrawingEnabled(false);
                u.a(4);
                x.a(8);
                G.a(8);
                v.a(0);
                a(Z);
                z.setAlpha(0.2F);
            }
            return;
        } else
        {
            u();
            return;
        }
    }

    public void onEnableFiltersEvent(MD md)
    {
        if (aD != null)
        {
            aD.a = true;
            aD = null;
        }
        a(1.0F);
        if (!I.c())
        {
            A();
        }
        d.setMediabryo(a);
    }

    public void onInChatSnapEvent(InChatSnapEvent inchatsnapevent)
    {
        ab = inchatsnapevent;
        w();
        if (inchatsnapevent.mCaption.length() > 0)
        {
            d.setCaptionText(inchatsnapevent.mCaption);
        }
    }

    public void onNoFilterEvent(Np np)
    {
        d.setMediabryo(a);
    }

    public void onPause()
    {
        super.onPause();
        if (a != null)
        {
            a.c();
        }
        if (!getActivity().isChangingConfigurations() && d.h != null)
        {
            d.h.a(false);
        }
        ag = d.a();
        d.c();
        d.k();
        Q.a.c();
        R.b();
        aq.b(d.h);
        U.a(4);
    }

    public void onPostToStoriesUpdatedEvent(Nt nt)
    {
        if (l != null)
        {
            nt = l;
            List list = aA.e();
            nt.clear();
            nt.addAll(list);
            l.notifyDataSetChanged();
        }
    }

    public void onQuickSnapEvent(QuickSnapEvent quicksnapevent)
    {
        ac = quicksnapevent;
        w();
        if (quicksnapevent.mCaption.length() > 0)
        {
            d.setCaptionText(quicksnapevent.mCaption);
        }
    }

    public void onResume()
    {
        super.onResume();
        if (a != null)
        {
            a.b();
        }
        aq.c(d.h);
        d(X);
        d.b(false);
        c(X);
    }

    public void onSwitchDeeplinkNotificationEvent(Os os)
    {
        Os.a a1;
label0:
        {
label1:
            {
                a1 = null;
                if (os.mMediaOpenOrigin == MediaOpenOrigin.PREVIEW_QR_SCAN)
                {
                    if (os.mSwitchToNotification)
                    {
                        break label0;
                    }
                    if (ay.b(Uri.parse(os.mUrl), MediaOpenOrigin.PREVIEW_QR_SCAN) != 4)
                    {
                        break label1;
                    }
                    ay.a(Uri.parse(os.mUrl), MediaOpenOrigin.PREVIEW_QR_SCAN);
                }
                return;
            }
            a1 = new Os.a(os) {

                private Os a;
                private SnapPreviewFragment b;

                public final void a()
                {
                    SnapPreviewFragment.L(b).a(Uri.parse(a.mUrl), MediaOpenOrigin.PREVIEW_QR_SCAN);
                }

            
            {
                b = SnapPreviewFragment.this;
                a = os;
                super();
            }
            };
        }
        Os.a(os, w, MediaOpenOrigin.PREVIEW_QR_SCAN, a1);
    }

    protected void onVisible()
    {
        boolean flag1;
        flag1 = true;
        a(4);
        if (!m)
        {
            throw new IllegalStateException("Must initialize fragment before starting it.");
        }
        u();
        an.mFirstMediaOpenedMetric = null;
        ap.b();
        au.c();
        x();
        ad = false;
        if (aa != Jo.e(getActivity()) || ag != null)
        {
            z();
        }
        if (a != null)
        {
            w();
            t();
        }
        aq.a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN));
        if (a == null || !IY.a(a)) goto _L2; else goto _L1
_L1:
        SnapEditorView snapeditorview = d;
        Bw bw = (Bw)a;
        snapeditorview.f.setVisibility(0);
        snapeditorview.f.removeAllViews();
        snapeditorview.n.a(1, ((Mediabryo) (bw)).mShouldEnableVisualFilters, ((Mediabryo) (bw)).mShouldEnableSmartFilters, ((Mediabryo) (bw)).mShouldEnableVideoSpeedFilters, ((Mediabryo) (bw)).mShouldEnableSponsoredFilters, ((Mediabryo) (bw)).mSnapType);
        boolean flag;
        if (rz.b() && (((Mediabryo) (bw)).mShouldEnableVisualFilters || ((Mediabryo) (bw)).mShouldEnableVideoSpeedFilters))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SnapEditorView.a((LayoutInflater)snapeditorview.getContext().getSystemService("layout_inflater"), snapeditorview.f, flag);
        if (flag)
        {
            snapeditorview.l = (VideoFilterView)snapeditorview.findViewById(0x7f0d054e);
            snapeditorview.l.setUnrecoverableErrorListener(snapeditorview);
            if (snapeditorview.l == null)
            {
                throw new RuntimeException("Tried to play video with decoder, but VideoFilterView was null!");
            }
            Uri uri = (Uri)dv.a(((Mediabryo) (bw)).mVideoUri);
            VideoFilterView videofilterview = snapeditorview.l;
            android.widget.ImageView.ScaleType scaletype = android.widget.ImageView.ScaleType.CENTER_CROP;
            flag = ((Mediabryo) (bw)).mIsFrontFacingSnap;
            Pa pa = videofilterview.a;
            String s1 = uri.getPath();
            if (!videofilterview.a(uri, new IK(pa.a(s1, 18), pa.a(s1, 19)), scaletype, WP.b.a, flag))
            {
                snapeditorview.c.a(new lS("Failed to open video!"));
                snapeditorview.a(bw, snapeditorview.d, "Failed to open video!");
            } else
            {
                snapeditorview.l.setVisibility(0);
                snapeditorview.l.setSwipeVideoViewController(snapeditorview.p);
                snapeditorview.l.a(new qp(new com.snapchat.android.ui.SnapEditorView._cls1(snapeditorview)), new com.snapchat.android.ui.SnapEditorView._cls2(bw));
            }
        } else
        {
            snapeditorview.k = snapeditorview.b();
            snapeditorview.a(bw, 2);
        }
        if (((Mediabryo) (bw)).mOverlayBitmap != null)
        {
            snapeditorview.g = new FitWidthImageView(snapeditorview.getContext());
            snapeditorview.g.setImageBitmap(((Mediabryo) (bw)).mOverlayBitmap);
            snapeditorview.f.addView(snapeditorview.g);
        }
        snapeditorview.setPreviewConfiguration(((Mediabryo) (bw)).mPreviewConfiguration);
        snapeditorview = d;
        if (!H.isChecked())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        snapeditorview.setAudible(flag);
_L4:
        snapeditorview = d;
        snapeditorview.a(snapeditorview.o.b.a, false);
        snapeditorview.a(snapeditorview.o.b.c, false);
        return;
_L2:
        if (((Mediabryo) (a)).mSnapType != com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
        {
            aq.a(new Mo(-1));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean p()
    {
        if (!E.b())
        {
            return false;
        }
        if (!aB)
        {
            return false;
        }
        aB = false;
        Object obj = AnimationUtils.loadAnimation(getActivity(), 0x7f050006);
        if (obj != null)
        {
            ((RelativeLayout)E.a()).startAnimation(((Animation) (obj)));
        }
        y.setVisibility(0);
        obj = new AlphaAnimation(0.0F, 1.0F);
        ((AlphaAnimation) (obj)).setDuration(350L);
        y.startAnimation(((Animation) (obj)));
        E.a(8);
        ae = ((SnapchatTimePicker)C.a()).c;
        q.setText(Integer.toString(ae));
        obj = av.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putInt(SharedPreferenceKey.SNAP_PREFERRED_TIME.getKey(), ae);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        return true;
    }

    public final boolean p_()
    {
        return true;
    }

    public final void q()
    {
        while (Bt.al() || aD == null) 
        {
            return;
        }
        aD.a = true;
        aD = null;
    }
}
