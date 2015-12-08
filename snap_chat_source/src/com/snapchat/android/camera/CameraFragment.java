// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;

import Ac;
import BQ;
import BS;
import BT;
import BU;
import BV;
import BY;
import Bm;
import Bt;
import CN;
import DI;
import DJ;
import DO;
import EV;
import Ei;
import Gt;
import IE;
import IK;
import IO;
import IQ;
import IR;
import IS;
import Ic;
import JI;
import JY;
import Jd;
import Jh;
import Jo;
import Jz;
import Km;
import Kn;
import LB;
import Ll;
import MA;
import MU;
import Ma;
import Mb;
import Mf;
import Mg;
import Mh;
import Mi;
import Mj;
import Mk;
import Ml;
import Mx;
import NC;
import NG;
import NL;
import NM;
import NQ;
import NT;
import NV;
import NY;
import Na;
import Nb;
import Nf;
import Nj;
import Nl;
import Nu;
import Ny;
import OC;
import OS;
import Oi;
import Oj;
import Os;
import Ou;
import Ov;
import PG;
import S;
import V;
import Vk;
import Vr;
import Vu;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import aox;
import com.looksery.core.LSSoundManager;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.analytics.framework.EasyMetricManager;
import com.snapchat.android.analytics.framework.ErrorMetric;
import com.snapchat.android.billing.InAppBillingManager;
import com.snapchat.android.camera.cameradecor.CameraDecor;
import com.snapchat.android.camera.cameraview.CameraView;
import com.snapchat.android.camera.model.CameraModel;
import com.snapchat.android.camera.ui.viewflipper.CameraViewFlipper;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.database.OnboardingTooltip;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.fragments.addfriends.AddedMeFragment;
import com.snapchat.android.fragments.addfriends.ProfileFragment;
import com.snapchat.android.fragments.chat2.CameraPreviewBackgroundView;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.scan.SnapScan;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.ui.lenses.LensPurchaseDialog;
import com.snapchat.android.util.Property;
import com.snapchat.android.util.StartupPath;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.snapchat.android.util.eventbus.ChangePreviewQualityEvent;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.eventbus.SnapCaptureContext;
import com.snapchat.android.util.eventbus.SnapMessageFeedRefreshedEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.snapchat.videochat.view.HoldToStreamView;
import com.snapchat.videochat.view.TalkView;
import com.squareup.otto.Bus;
import dz;
import eg;
import fP;
import gc;
import gi;
import hI;
import hS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import lB;
import lT;
import li;
import lj;
import lk;
import ll;
import lv;
import lw;
import mS;
import qB;
import qD;
import qE;
import qF;
import qG;
import qI;
import qJ;
import qM;
import qS;
import qT;
import qX;
import qZ;
import qq;
import qv;
import qx;
import qz;
import rQ;
import rT;
import re;
import rf;
import rg;
import rh;
import rj;
import rk;
import rl;
import rm;
import rn;
import rq;
import rr;

// Referenced classes of package com.snapchat.android.camera:
//            BaseCameraFragment, TakeSnapButtonTouchIntent

public class CameraFragment extends BaseCameraFragment
    implements DO, IS.a, android.content.SharedPreferences.OnSharedPreferenceChangeListener, com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface, com.snapchat.android.camera.ui.viewflipper.CameraViewFlipper.a, com.snapchat.android.camera.videocamera.VideoCameraHandler.b, qF, qP.a, qT, qx
{
    final class a
        implements rr
    {

        private CameraFragment a;

        public final void a(float f1, float f2, float f3)
        {
            a.b.setScaleX(f1);
            a.b.setScaleY(f2);
            a.b.setTranslationY(f3);
        }

        public final void a(qx qx1)
        {
            if (a.b == null)
            {
                return;
            } else
            {
                a.l.b(a.b, qx1, CameraFragment.f(a));
                return;
            }
        }

        public final boolean a()
        {
            return a.i.a();
        }

        public final boolean b()
        {
            boolean flag1 = false;
            CameraModel cameramodel = a.i;
            int j = 0;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (j < cameramodel.b)
                    {
                        if (!cameramodel.a(j))
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                j++;
            } while (true);
        }

        public final void c()
        {
            a.b(false);
        }

        public final boolean d()
        {
            return !a.i.e;
        }

        private a()
        {
            a = CameraFragment.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final Set S;
    private static boolean s = false;
    private final ll A;
    private final CameraEventAnalytics B;
    private final lv C;
    private final lw D;
    private final lk E;
    private final Ac F;
    private final re G;
    private Gt H;
    private fP I;
    private InAppBillingManager J;
    private final IS K;
    private Kn L;
    private CameraViewFlipper M;
    private DI N;
    private ImageView O;
    private boolean P;
    private boolean Q;
    private boolean R;
    final qX a;
    protected final TakeSnapButtonTouchIntent k;
    public qJ l;
    public qM m;
    public rl n;
    public rj o;
    public rk p;
    public rn q;
    public LB r;
    private OS t;
    private byte u[];
    private TextView v;
    private qI w;
    private boolean x;
    private final Handler y;
    private final Bus z;

    public CameraFragment()
    {
        this(Mf.a(), new Handler(Looper.getMainLooper()), ll.a(), CameraEventAnalytics.a(), lv.a(), lw.a(), lk.a(), Ac.b(), new TakeSnapButtonTouchIntent(), IS.a(), Kn.a(), re.a(), qZ.e(), qX.a());
    }

    private CameraFragment(Bus bus, Handler handler, ll ll1, CameraEventAnalytics cameraeventanalytics, lv lv1, lw lw1, lk lk1, 
            Ac ac, TakeSnapButtonTouchIntent takesnapbuttontouchintent, IS is, Kn kn, re re1, qZ qz1, qX qx1)
    {
        x = false;
        P = false;
        Q = false;
        R = false;
        SnapchatApplication.getDIComponent().a(this);
        z = bus;
        y = handler;
        A = ll1;
        B = cameraeventanalytics;
        C = lv1;
        D = lw1;
        E = lk1;
        F = ac;
        k = takesnapbuttontouchintent;
        K = is;
        L = kn;
        G = re1;
        g = qz1;
        a = qx1;
        Bt.a();
    }

    public static String E()
    {
        return "CameraFragment";
    }

    private void G()
    {
        if (!d.getClass().equals(qz))
        {
            a(new qz(getActivity(), e, this));
        }
    }

    private void H()
    {
        if (b == null)
        {
            return;
        }
        lv lv1 = C;
        boolean flag = a.c;
        String s1;
        if (a.b())
        {
            s1 = a.c();
        } else
        {
            s1 = null;
        }
        lv1.a(false, flag, s1);
        f.edit().putInt(SharedPreferenceKey.SNAP_CAPTURE_ROTATION.getKey(), Jo.e(getActivity())).apply();
        if (a.c)
        {
            l.a(a, this, w);
        } else
        {
            l.a(b, this, w);
        }
        e.setVisibility(8);
    }

    private void I()
    {
        if (p.d)
        {
            return;
        }
        lv lv1 = C;
        boolean flag = a.c;
        String s1;
        if (a.b())
        {
            s1 = a.c();
        } else
        {
            s1 = null;
        }
        lv1.a(true, flag, s1);
        p.d = true;
        m.a(this, w, false);
        d.l();
    }

    private DI J()
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        boolean flag = Build.CPU_ABI.startsWith("x86");
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L7:
        this;
        JVM INSTR monitorexit ;
        return ((DI) (obj));
_L2:
        if (N != null || c == null) goto _L4; else goto _L3
_L3:
        obj = c.c();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        int j1;
        j1 = ((android.hardware.Camera.Parameters) (obj)).getPreviewFormat();
        obj = ((android.hardware.Camera.Parameters) (obj)).getPreviewSize();
        if (obj == null) goto _L6; else goto _L5
_L5:
        int j;
        j = ((android.hardware.Camera.Size) (obj)).width;
        i1 = ((android.hardware.Camera.Size) (obj)).height;
_L8:
        N = new DI(j1, j, i1, this);
_L4:
        obj = N;
          goto _L7
        Exception exception;
        exception;
        throw exception;
_L6:
        j = 0;
          goto _L8
        j = 0;
        j1 = 0;
          goto _L8
    }

    private void K()
    {
        this;
        JVM INSTR monitorenter ;
        N = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void L()
    {
        DI di = J();
        if (di != null)
        {
            di.a();
        }
    }

    static CameraEventAnalytics a(CameraFragment camerafragment)
    {
        return camerafragment.B;
    }

    private void a(BT bt)
    {
        Timber.i("CameraFragment", "applyLens %s, lensesUiEnabled %b", new Object[] {
            bt.b(), Boolean.valueOf(a.c)
        });
        Object obj = d;
        qX qx1;
        byte byte0;
        if (bt.g())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((CameraDecor) (obj)).a(byte0);
        d.a(bt);
        qx1 = a;
        Timber.i("LensesController", "selectLens %s, %b", new Object[] {
            bt, Boolean.valueOf(qx1.c)
        });
        qx1.e = bt;
        LSSoundManager.stopAll();
        qx1.a.g();
        obj = qx1.a;
        ((qZ) (obj)).a(new qZ._cls7(((qZ) (obj))));
        if (bt.g())
        {
            qY qy = qx1.b;
            Bt.a(bt);
            for (Iterator iterator = bt.c().iterator(); iterator.hasNext();)
            {
                BU bu = (BU)iterator.next();
                qx1.a.a(bu.mId, "resourcesPath", bt.e());
                Object obj1 = qx1.a;
                ((qZ) (obj1)).a(new qZ._cls4(((qZ) (obj1)), bu.mId));
                if (bu.mParameters == null)
                {
                    obj1 = Collections.emptyList();
                } else
                {
                    obj1 = bu.mParameters;
                }
                obj1 = ((List) (obj1)).iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    BV bv = (BV)((Iterator) (obj1)).next();
                    qx1.a.a(bu.mId, bv.a(), bv.mValue);
                }
            }

        }
        d.b(bt);
    }

    private void a(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            v.setText(s1);
            v.setVisibility(0);
            int j1 = Jo.a(v);
            int i1 = PreferenceManager.getDefaultSharedPreferences(getActivity()).getInt(SharedPreferenceKey.KEYBOARD_HEIGHT_PORTRAIT.getKey(), -1);
            int j = i1;
            if (i1 == -1)
            {
                j = (int)((float)(new rT()).heightPixels * 0.5F);
            }
            s1 = (android.widget.FrameLayout.LayoutParams)v.getLayoutParams();
            s1.setMargins(((android.widget.FrameLayout.LayoutParams) (s1)).leftMargin, j - j1, ((android.widget.FrameLayout.LayoutParams) (s1)).rightMargin, ((android.widget.FrameLayout.LayoutParams) (s1)).bottomMargin);
            v.setLayoutParams(s1);
            return;
        } else
        {
            v.setVisibility(4);
            return;
        }
    }

    private boolean a(Surface surface, IK ik)
    {
        if (p.a)
        {
            return false;
        }
        if (!Ic.HAS_SURFACE_TEXTURE_RECORDING && surface == null)
        {
            a(com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.NO_SURFACE_PROVIDED);
            return false;
        } else
        {
            return m.a(this, w, ik, surface);
        }
    }

    private void b(float f1)
    {
        boolean flag1 = true;
        if (i.a() || c == null)
        {
            return;
        }
        Object obj = n;
        obj.a = ((rl) (obj)).a * f1;
        obj.a = Math.max(1.0F, Math.min(((rl) (obj)).a, 1.8F));
        f1 = n.a();
        obj = c.c();
        boolean flag;
        if (obj == null || !((android.hardware.Camera.Parameters) (obj)).isZoomSupported())
        {
            flag = false;
        } else
        {
            ((android.hardware.Camera.Parameters) (obj)).setZoom((int)Math.ceil(f1 * (float)((android.hardware.Camera.Parameters) (obj)).getMaxZoom()));
            flag = flag1;
            if (p.a)
            {
                P = true;
                flag = flag1;
            }
        }
        if (flag)
        {
            c.a(((android.hardware.Camera.Parameters) (obj)));
            return;
        } else
        {
            n.a = 1.0F;
            return;
        }
    }

    static void b(CameraFragment camerafragment)
    {
        View view = LayoutInflater.from(camerafragment.getActivity()).inflate(0x7f0400f8, null);
        Toast toast = new Toast(camerafragment.getActivity());
        toast.setGravity(80, 0, camerafragment.getActivity().getResources().getDimensionPixelSize(0x7f0a0150));
        toast.setDuration(1);
        toast.setView(view);
        toast.show();
    }

    static qX c(CameraFragment camerafragment)
    {
        return camerafragment.a;
    }

    static lk d(CameraFragment camerafragment)
    {
        return camerafragment.E;
    }

    private void d(boolean flag)
    {
        if (M != null)
        {
            CameraViewFlipper cameraviewflipper = M;
            if (flag && n())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cameraviewflipper.setScrollableInBothDirections(flag);
        }
    }

    static Gt e(CameraFragment camerafragment)
    {
        return camerafragment.H;
    }

    private void e(boolean flag)
    {
        DI di = J();
        if (di != null && !i.a())
        {
            if (di.f.get())
            {
                di.i.set(System.nanoTime());
            } else
            {
                di.g.set(false);
                di.f.set(true);
            }
            di.e.set(flag);
            Timber.c(DI.a, "Enable Scanner...", new Object[0]);
            if (O != null && O.getVisibility() == 0)
            {
                O.setVisibility(8);
            }
        }
    }

    static qI f(CameraFragment camerafragment)
    {
        return camerafragment.w;
    }

    public final void A()
    {
        if (!z())
        {
            return;
        }
        rj rj1 = o;
        boolean flag;
        if (!rj1.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        rj1.a = flag;
        w.a(null, o.a);
        d.a();
    }

    public final void B()
    {
        PG.a();
        B.a(true);
        d.k();
        if (mFragmentInterface != null)
        {
            mFragmentInterface.b(false);
        }
        if (b != null && b.getAlpha() == 0.0F)
        {
            b.animate().alpha(1.0F).setDuration(100L).start();
        }
    }

    public final void C()
    {
        PG.a();
        d.l();
        I();
    }

    public final void D()
    {
        b(true);
    }

    public final void F()
    {
        d.i();
    }

    public final FragmentActivity H_()
    {
        return super.getActivity();
    }

    protected final int a()
    {
        return 0x7f040015;
    }

    protected final IK a(rT rt, rm rm, android.hardware.Camera.Parameters parameters)
    {
        boolean flag;
        if (parameters.getSupportedVideoSizes() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !Ic.HAS_SURFACE_TEXTURE_RECORDING)
        {
            Timber.c("CameraFragment", "Preview Size Finding: display [%d,%d]", new Object[] {
                Integer.valueOf(rt.heightPixels), Integer.valueOf(rt.widthPixels)
            });
            return j.a(parameters, i.d, qv.a(rt), false);
        } else
        {
            rt = super.a(rt, rm, parameters);
            Timber.c("CameraFragment", "Camera Preview Size: [%d,%d]", new Object[] {
                Integer.valueOf(rt.a()), Integer.valueOf(rt.b())
            });
            return rt;
        }
    }

    public final CameraDecor a(RelativeLayout relativelayout)
    {
        return new qz(getActivity(), e, this);
    }

    public final void a(double d1, int j, int i1, int j1, int k1)
    {
        if (g.d)
        {
            CameraEventAnalytics cameraeventanalytics = B;
            gc gc1 = CameraEventAnalytics.a(d1, j, i1, j1, k1);
            if (cameraeventanalytics.mLensesAdapter != null)
            {
                gc1.filterLensCount = Long.valueOf(cameraeventanalytics.mLensesAdapter.getCount() - 1);
                gc1.filterGeolensCount = Long.valueOf(cameraeventanalytics.mLensesAdapter.b);
                gc1.filterLensStoreCount = Long.valueOf(cameraeventanalytics.mLensesAdapter.c);
            }
            cameraeventanalytics.mBlizzardEventLogger.a(gc1);
            return;
        } else
        {
            CameraEventAnalytics cameraeventanalytics1 = B;
            gc gc2 = CameraEventAnalytics.a(d1, j, i1, j1, k1);
            cameraeventanalytics1.mBlizzardEventLogger.a(gc2);
            return;
        }
    }

    public final void a(float f1)
    {
        b(f1);
    }

    public final void a(int j)
    {
    }

    public final void a(int j, int i1)
    {
        if (i.a()) goto _L2; else goto _L1
_L1:
        if (n()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        a(j, i1, false);
        d(false);
        d.b(j, i1);
        Q = false;
        e(true);
        return;
_L2:
        if (!a.c)
        {
            a(j, i1, true);
            if (!a.c || !p.a)
            {
                if (h())
                {
                    Object obj = E;
                    obj.mFaceTappedCount = ((lk) (obj)).mFaceTappedCount + 1;
                    if (((lk) (obj)).mLensInitializationMetric == null && ((lk) (obj)).mFaceTappedCount == 1)
                    {
                        obj.mLensInitializationMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("LENS_INIT_DELAY").b();
                    }
                    ((lk) (obj)).mLensInitializationMetric.a("count", Integer.valueOf(((lk) (obj)).mFaceTappedCount));
                    obj = g;
                    if (I == null)
                    {
                        I = new fP() {

                            final CameraFragment a;

                            public final void a(boolean flag)
                            {
                                if (!flag)
                                {
                                    lk lk2 = CameraFragment.d(a);
                                    gc gc2 = lk.d();
                                    gc2.withFilterLensSwipe = Boolean.valueOf(false);
                                    gc2.filterLensCount = Long.valueOf(0L);
                                    gc2.filterGeolensCount = Long.valueOf(0L);
                                    gc2.filterLensStoreCount = Long.valueOf(0L);
                                    lk2.mBlizzardEventLogger.a(gc2);
                                    lk.c();
                                    return;
                                } else
                                {
                                    PG.a(new Runnable(this) {

                                        private _cls5 a;

                                        public final void run()
                                        {
                                            if (a.a.h() && !a.a.a.c && !a.a.x())
                                            {
                                                lk lk1 = CameraFragment.d(a.a);
                                                if (lk1.mLensInitializationMetric != null)
                                                {
                                                    lk1.mLensInitializationMetric.b(false);
                                                    lk1.mLensInitializationMetric = null;
                                                    lk1.mFaceTappedCount = 0;
                                                }
                                                a.a.o();
                                                lk1 = CameraFragment.d(a.a);
                                                long l1 = CameraFragment.e(a.a).getCount() - 1;
                                                long l2 = CameraFragment.e(a.a).b;
                                                long l3 = CameraFragment.e(a.a).c;
                                                gc gc1 = lk.d();
                                                gc1.withFilterLensSwipe = Boolean.valueOf(true);
                                                gc1.filterLensCount = Long.valueOf(l1);
                                                gc1.filterGeolensCount = Long.valueOf(l2);
                                                gc1.filterLensStoreCount = Long.valueOf(l3);
                                                lk1.mBlizzardEventLogger.a(gc1);
                                                lk.c();
                                            }
                                        }

            
            {
                a = _pcls5;
                super();
            }
                                    });
                                    return;
                                }
                            }

            
            {
                a = CameraFragment.this;
                super();
            }
                        };
                    }
                    obj.c = new qZ.a(j, i1, I);
                    obj.k = true;
                    return;
                } else
                {
                    lk lk1 = E;
                    gc gc1 = lk.d();
                    lk1.mBlizzardEventLogger.a(gc1);
                    lk.c();
                    return;
                }
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void a(int j, int i1, boolean flag)
    {
        if (c != null && !i.h)
        {
            Object obj = c.c();
            boolean flag1;
            if (obj == null || i.a())
            {
                flag1 = false;
            } else
            {
                obj1 = ((android.hardware.Camera.Parameters) (obj)).getSupportedFocusModes();
                if (obj1 == null || !((List) (obj1)).contains("auto"))
                {
                    flag1 = false;
                } else
                {
                    if (!((android.hardware.Camera.Parameters) (obj)).getFocusMode().equals("auto"))
                    {
                        ((android.hardware.Camera.Parameters) (obj)).setFocusMode("auto");
                        c.a(((android.hardware.Camera.Parameters) (obj)));
                    }
                    flag1 = true;
                }
            }
            if (flag1)
            {
                i.h = true;
                if (flag)
                {
                    d.a(j, i1);
                }
                Object obj3 = b;
                obj = c;
                if (obj3 != null)
                {
                    Object obj1 = ((qP.b) (obj)).c();
                    if (obj1 != null && ((android.hardware.Camera.Parameters) (obj1)).getMaxNumFocusAreas() != 0)
                    {
                        Matrix matrix = new Matrix();
                        Object obj2 = new Matrix();
                        int j1 = ((View) (obj3)).getWidth();
                        int k1 = ((View) (obj3)).getHeight();
                        ((Matrix) (obj2)).setScale(1.0F, 1.0F);
                        ((Matrix) (obj2)).postRotate(90F);
                        ((Matrix) (obj2)).postScale((float)j1 / 2000F, (float)k1 / 2000F);
                        ((Matrix) (obj2)).postTranslate((float)j1 / 2.0F, (float)k1 / 2.0F);
                        ((Matrix) (obj2)).invert(matrix);
                        obj2 = new ArrayList();
                        k1 = ((View) (obj3)).getWidth();
                        j1 = ((View) (obj3)).getHeight();
                        if (((ArrayList) (obj2)).size() == 0)
                        {
                            ((ArrayList) (obj2)).add(new android.hardware.Camera.Area(new Rect(), 1));
                        }
                        obj3 = ((android.hardware.Camera.Area)((ArrayList) (obj2)).get(0)).rect;
                        j = qv.a(j - 133, k1 - 266);
                        i1 = qv.a(i1 - 133, j1 - 266);
                        RectF rectf = new RectF(j, i1, j + 266, i1 + 266);
                        matrix.mapRect(rectf);
                        obj3.left = Math.round(rectf.left);
                        obj3.top = Math.round(rectf.top);
                        obj3.right = Math.round(rectf.right);
                        obj3.bottom = Math.round(rectf.bottom);
                        ((android.hardware.Camera.Parameters) (obj1)).setFocusAreas(((List) (obj2)));
                        if (((android.hardware.Camera.Parameters) (obj1)).getMaxNumMeteringAreas() != 0)
                        {
                            ((android.hardware.Camera.Parameters) (obj1)).setMeteringAreas(((List) (obj2)));
                        }
                        ((qP.b) (obj)).a(((android.hardware.Camera.Parameters) (obj1)));
                    }
                }
                c.a(new qS(new Handler(Looper.getMainLooper()), new qP.c() {

                    private CameraFragment a;

                    public final void a()
                    {
                        a.i.h = false;
                    }

            
            {
                a = CameraFragment.this;
                super();
            }
                }));
                return;
            }
        }
    }

    public final void a(int j, boolean flag)
    {
        if (t != null)
        {
            if (((VerticalSwipeLayout) (M)).c == 1)
            {
                M.setEnabled(false);
                t.a(j, flag);
            }
            return;
        } else
        {
            Timber.e("CameraFragment", "FragmentPageChangeCallback is null. Is it implemented by your Activity?", new Object[0]);
            return;
        }
    }

    public final void a(int j, byte abyte0[])
    {
label0:
        {
            Object obj;
            Object obj1;
label1:
            {
                d(true);
                if (abyte0 != null)
                {
                    Timber.c("CameraFragment", (new StringBuilder("onSnapCodeDetected snapcodeVersion:")).append(j).toString(), new Object[0]);
                    if (j < 16)
                    {
                        obj = (new StringBuilder("0")).append(Integer.toHexString(j)).toString();
                        abyte0 = (new StringBuilder()).append(((String) (obj))).append(Jh.a(abyte0)).toString();
                        obj = com.snapchat.android.operation.ScannableOperation.SCAN_CODE_TYPE.SNAPCODE;
                        obj1 = String.format("%d", new Object[] {
                            Integer.valueOf(j)
                        });
                        if (TextUtils.isEmpty(abyte0))
                        {
                            break label0;
                        }
                        if (!Q)
                        {
                            break label1;
                        }
                        Q = false;
                        d.i();
                        d.c();
                    }
                }
                return;
            }
            d.g();
            Timber.c("CameraFragment", (new StringBuilder("onScanCodeDetected - Data: ")).append(abyte0).toString(), new Object[0]);
            obj1 = new CN("SNAPCODE_SCANNED_FROM_CAMERA", abyte0, ((String) (obj1)), null, "camera", null);
            IQ.a(getActivity());
            ((CN) (obj1)).a();
            z.a(new MA("CameraFragment", getActivity().getResources().getString(0x7f080175), ((CN) (obj1))));
            Ei.a().a(getActivity(), ((com.snapchat.android.operation.ScannableOperation.SCAN_CODE_TYPE) (obj)), abyte0, "camera");
            return;
        }
        Timber.c("CameraFragment", "onScanCodeDetected data is empty", new Object[0]);
    }

    public final void a(BT bt, int j)
    {
        boolean flag = true;
        if (R || p.a)
        {
            Timber.i("CameraFragment", "onLensSelected ignore mShouldIgnoreLensSelection=%s, isRecordingVideo=%s", new Object[] {
                Boolean.valueOf(R), Boolean.valueOf(p.a)
            });
            return;
        }
        Timber.i("CameraFragment", "onLensSelected position %d, lens %s", new Object[] {
            Integer.valueOf(j), bt.b()
        });
        if (!bt.g() && !bt.f())
        {
            Timber.i("CameraFragment", "onLensSelected send PrepareLensEvent", new Object[0]);
            z.a(new Nu(bt));
        }
        a(bt);
        Object obj = h;
        Object obj1 = bt.a();
        ((rQ) (obj)).b();
        ((rQ) (obj)).a(true, ((String) (obj1)));
        li li1;
        String s1;
        int i1;
        boolean flag1;
        if (bt instanceof BY)
        {
            if (G.a((BY)bt))
            {
                obj = hI.OWNED;
            } else
            {
                obj = hI.PURCHASABLE;
            }
        } else
        {
            obj = null;
        }
        obj1 = E;
        Timber.i("LensesEventAnalytics", (new StringBuilder("onLensSelected ")).append(j).toString(), new Object[0]);
        flag1 = bt instanceof BS;
        li1 = ((lk) (obj1)).mLensSwipeMetaData;
        s1 = bt.a();
        i1 = ((lk) (obj1)).mTotalLensCount;
        if (!flag1 || !((BQ) ((BS)bt)).mIsSponsored)
        {
            flag = false;
        }
        if (li1.mLastItem != null)
        {
            li1.mLastItem.b();
        }
        obj1 = (lj)li1.mData.get(s1);
        bt = ((BT) (obj1));
        if (obj1 == null)
        {
            bt = new lj(s1);
            li1.mData.put(s1, bt);
        }
        bt.mLensIndexCount = i1;
        bt.mLensIndexPos = j;
        bt.mLensCount = ((lj) (bt)).mLensCount + 1L;
        if (!((lj) (bt)).mViewTimeStopwatch.a)
        {
            ((lj) (bt)).mViewTimeStopwatch.a();
        }
        bt.mIsGeoLens = flag1;
        bt.mIsSponsored = flag;
        bt.mIapStatus = ((hI) (obj));
        li1.mLastItem = bt;
    }

    public final void a(Bitmap bitmap)
    {
        boolean flag = true;
        if (bitmap != null)
        {
            (new JI(bitmap, new rT())).executeOnExecutor(IO.HIGH_PRIORITY_EXECUTOR, new Void[0]);
            if (Bm.a().a("ENABLE_SNAP_TO_SCAN", "option", "on").equals("on"))
            {
                (new DJ(getActivity(), bitmap)).execute(new Void[0]);
            }
        }
        boolean flag1 = d instanceof qE;
        Object obj = new IR(K.mRotation);
        bitmap = new EV();
        bitmap.a(i.a(), o.a);
        float f1 = n.a();
        bitmap.a(new String[] {
            "full_zoom_snaps"
        });
        if (f1 >= ((EV) (bitmap)).d)
        {
            bitmap.a("full_zoom_snaps");
        }
        Bc.a a1 = (Bc.a)(new Bc.a()).a(com.snapchat.android.model.Mediabryo.SnapType.SNAP);
        a1.mIsFrontFacingSnap = i.a();
        a1 = (Bc.a)a1;
        a1.mSnapOrientation = ((IR) (obj)).a();
        obj = (Bc.a)a1;
        obj.mIsFlashOn = o.a;
        obj = (Bc.a)obj;
        obj.mIsReply = flag1;
        obj = (Bc.a)obj;
        obj.mSnapTrophyMetrics = bitmap;
        bitmap = (Bc.a)obj;
        if (a.b())
        {
            Timber.c("CameraFragment", "Add filter lens id param to snap imagebryo", new Object[0]);
            bitmap.mHasGeoLens = a.e instanceof BS;
            bitmap.mFilterLensId = a.c();
            android.hardware.Camera.CameraInfo camerainfo;
            if (a.d())
            {
                flag = false;
            }
            bitmap.mShouldEnableSponsoredFilters = flag;
        }
        camerainfo = i.c();
        if (camerainfo != null)
        {
            bitmap.mCameraOrientation = camerainfo.orientation;
        }
        bitmap = bitmap.c();
        if (n != null)
        {
            n.a = 1.0F;
            b(1.0F);
        }
        D.a(bitmap);
        z.a(new NV(bitmap, SnapCaptureContext.CAMERA));
        p();
    }

    protected final void a(android.hardware.Camera.Parameters parameters)
    {
        w.a(parameters, o.a);
    }

    public final void a(Uri uri)
    {
        PG.a();
        if (mFragmentInterface != null)
        {
            mFragmentInterface.b(true);
        }
        if (uri == null)
        {
            a(com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.VIDEO_STORAGE_EXCEPTION);
            return;
        }
        d.l();
        boolean flag = i.a();
        Object obj = i.c();
        Object obj1;
        Bw.a a1;
        int j;
        boolean flag2;
        boolean flag3;
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = ((android.hardware.Camera.CameraInfo) (obj)).orientation;
        }
        p.a = false;
        p.d = false;
        a(false);
        if (b != null)
        {
            b.a();
            b.setAlpha(0.0F);
        }
        m.b();
        e.setVisibility(8);
        CameraEventAnalytics.g();
        flag2 = d instanceof qE;
        obj1 = new IR(K.mRotation);
        obj = new EV();
        flag3 = P;
        ((EV) (obj)).a(new String[] {
            "full_zoom_videos"
        });
        if (flag3)
        {
            ((EV) (obj)).a("full_zoom_videos");
        }
        ((EV) (obj)).a(i.a(), o.a);
        a1 = (Bw.a)((Bw.a)(new Bw.a()).a(uri)).a(com.snapchat.android.model.Mediabryo.SnapType.SNAP);
        a1.mIsFrontFacingSnap = flag;
        a1 = (Bw.a)a1;
        a1.mIsFlashOn = o.a;
        a1 = (Bw.a)a1;
        a1.mCameraOrientation = j;
        a1 = (Bw.a)a1;
        a1.mSnapOrientation = ((IR) (obj1)).a();
        obj1 = (Bw.a)a1;
        obj1.mIsReply = flag2;
        obj1 = (Bw.a)obj1;
        obj1.mSnapTrophyMetrics = ((EV) (obj));
        obj = (Bw.a)obj1;
        if (a.b())
        {
            Timber.c("CameraFragment", "Add filter lens id param to videobryo", new Object[0]);
            obj.mHasGeoLens = a.e instanceof BS;
            obj.mFilterLensId = a.c();
            Object obj2;
            String s1;
            String s2;
            boolean flag1;
            if (!a.d())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj.mShouldEnableSponsoredFilters = flag1;
        }
        obj = ((Bw.a) (obj)).c();
        obj2 = L;
        uri = uri.getPath();
        s1 = ((Mediabryo) (obj)).mClientId;
        if (Kn.mTempCacheFiles.containsKey(uri))
        {
            Timber.c("VideoSnapPreviewCacheWrapper", "old ID %s is valid", new Object[] {
                uri
            });
            s2 = ((Km)Kn.mTempCacheFiles.get(uri)).mKey;
            ((Kn) (obj2)).mCache.b(s2, s1);
            obj2 = (Km)Kn.mTempCacheFiles.get(uri);
            Kn.mTempCacheFiles.remove(uri);
            Kn.mTempCacheFiles.put(s1, obj2);
        } else
        {
            Timber.d("VideoSnapPreviewCacheWrapper", "Try to update a cache file with an invalid ID: %s", new Object[] {
                uri
            });
        }
        D.a(((AA) (obj)));
        uri = new NV(((AA) (obj)), SnapCaptureContext.CAMERA);
        z.a(uri);
        p();
    }

    public final void a(Surface surface)
    {
        IK ik = q.a();
        if (ik == null)
        {
            a(com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.INITIALIZATION_ERROR);
            return;
        }
        Object obj = b;
        Object obj1 = new rT();
        if (((CameraView) (obj)).b != null)
        {
            int j1 = ik.b();
            int k1 = ik.a();
            int i1 = ((rT) (obj1)).heightPixels;
            int j = ((rT) (obj1)).widthPixels;
            double d1 = (double)((rT) (obj1)).heightPixels / (double)((rT) (obj1)).widthPixels;
            if (CameraView.a(ik.c(), d1))
            {
                double d2 = k1;
                i1 = (int)(((double)j / (double)j1) * d2);
            } else
            {
                j = (int)((double)j1 * ((double)i1 / (double)k1));
            }
            obj1 = new IK(j, i1);
            obj = ((CameraView) (obj)).b;
            obj1 = new android.widget.FrameLayout.LayoutParams(((IK) (obj1)).a(), ((IK) (obj1)).b());
            obj1.gravity = 17;
            ((SurfaceView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        }
        a(surface, ik);
    }

    public final void a(com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface.TakeSnapButtonAction takesnapbuttonaction)
    {
        static final class _cls8
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.values().length];
                try
                {
                    c[com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.VIDEO_STORAGE_EXCEPTION.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    c[com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.RECORDING_TOO_SHORT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                b = new int[com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface.TakeSnapButtonAction.values().length];
                try
                {
                    b[com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface.TakeSnapButtonAction.FINGER_DOWN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface.TakeSnapButtonAction.FINGER_UP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface.TakeSnapButtonAction.START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                a = new int[com.snapchat.android.util.eventbus.ChangePreviewQualityEvent.PreviewQuality.values().length];
                try
                {
                    a[com.snapchat.android.util.eventbus.ChangePreviewQualityEvent.PreviewQuality.HIGH.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.snapchat.android.util.eventbus.ChangePreviewQualityEvent.PreviewQuality.LOW.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls8.b[takesnapbuttonaction.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 190
    //                   3 514;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        R = true;
        if (!a.c || !a.b())
        {
            break; /* Loop/switch isn't completed */
        }
        takesnapbuttonaction = a.e;
        if (!takesnapbuttonaction.g() || (takesnapbuttonaction instanceof BY) && !re.a().a((BY)takesnapbuttonaction)) goto _L1; else goto _L5
_L5:
        p.b = false;
        k.a = TakeSnapButtonTouchIntent.MediaCaptureType.PHOTO;
        d.j();
        y.postDelayed(new Runnable() {

            private CameraFragment a;

            public final void run()
            {
                if (a.g.e)
                {
                    qZ qz1 = a.g;
                    if (!qZ.f())
                    {
                        CameraFragment.b(a);
                        return;
                    }
                }
                CameraEventAnalytics cameraeventanalytics1 = CameraFragment.a(a);
                boolean flag2 = CameraFragment.c(a).c;
                String s1;
                if (CameraFragment.c(a).b())
                {
                    s1 = CameraFragment.c(a).c();
                } else
                {
                    s1 = null;
                }
                cameraeventanalytics1.a(flag2, s1);
                a.k.a = TakeSnapButtonTouchIntent.MediaCaptureType.VIDEO;
                a.w();
            }

            
            {
                a = CameraFragment.this;
                super();
            }
        }, 500L);
        if (!Bt.V())
        {
            (new mS(OnboardingTooltip.SNAP)).execute();
        }
        SharedPreferenceKey.HAS_SEEN_TAKE_SNAP_ONBOARDING_MESSAGE.putBoolean(true);
        d(false);
        z.a(new NT(false));
        return;
_L3:
        R = false;
        if (!a.c || !a.b())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = a.e;
        if (!((BT) (obj)).g())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof BY) || re.a().a((BY)obj))
        {
            break; /* Loop/switch isn't completed */
        }
        takesnapbuttonaction = getActivity().mFragments;
        if ((LensPurchaseDialog)takesnapbuttonaction.a("LensPurchaseDialogFragment") == null)
        {
            LensPurchaseDialog.a((BY)obj, J).show(takesnapbuttonaction, "LensPurchaseDialogFragment");
            takesnapbuttonaction = E;
            obj = (BY)obj;
            aox aox1 = J.a(((BY) (obj)).mGplayIapId);
            if (aox1 != null)
            {
                gi gi1 = new gi();
                gi1.source = "CAMERA";
                gi1.product = hS.LENS;
                gi1.productId = ((BQ) (obj)).mLensId;
                gi1.cashAmount = Double.valueOf((double)aox1.d.a / 1000000D);
                gi1.cashCurrency = aox1.d.b;
                ((lk) (takesnapbuttonaction)).mBlizzardEventLogger.a(gi1);
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
        p.b = true;
        d(true);
        boolean flag;
        if (k.a == TakeSnapButtonTouchIntent.MediaCaptureType.VIDEO)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (p.a)
            {
                I();
            }
        } else
        {
            CameraEventAnalytics cameraeventanalytics = B;
            boolean flag1 = a.c;
            if (a.b())
            {
                takesnapbuttonaction = a.c();
            } else
            {
                takesnapbuttonaction = null;
            }
            cameraeventanalytics.a(flag1, takesnapbuttonaction);
            H();
        }
        d.l();
        y.removeCallbacksAndMessages(null);
        return;
_L4:
        R = false;
        p.b = true;
        d(true);
        y.removeCallbacksAndMessages(null);
        return;
    }

    protected final void a(CameraDecor cameradecor)
    {
        super.a(cameradecor);
        d(true);
    }

    public final void a(com.snapchat.android.camera.model.CameraModel.CameraType cameratype)
    {
        if (b == null)
        {
            return;
        } else
        {
            i.a(cameratype);
            c();
            return;
        }
    }

    public final void a(com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType videofailuretype)
    {
        boolean flag;
        flag = true;
        PG.a();
        if (mFragmentInterface != null)
        {
            mFragmentInterface.b(true);
        }
        d.l();
        p.a = false;
        p.d = false;
        z.a(new NT(true));
        _cls8.c[videofailuretype.ordinal()];
        JVM INSTR tableswitch 1 2: default 92
    //                   1 193
    //                   2 385;
           goto _L1 _L2 _L3
_L1:
        int j = 0x7f08031c;
_L10:
        if (flag)
        {
            z.a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, j));
            r.a(new lT(videofailuretype.name()));
            CameraEventAnalytics.a(videofailuretype);
        }
        if (b != null && !Ic.HAS_SURFACE_TEXTURE_RECORDING)
        {
            b.a();
            a(false);
            m.b();
            b.setAlpha(0.0F);
            c();
        }
        d.a();
        return;
_L2:
        String s2;
        if (ReleaseManager.e())
        {
            String s1 = getResources().getString(0x7f0800ff, new Object[] {
                Environment.getExternalStorageState()
            });
            z.a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, s1));
        }
        s2 = Environment.getExternalStorageState();
        j = -1;
        s2.hashCode();
        JVM INSTR lookupswitch 3: default 284
    //                   -903566235: 319
    //                   1091836000: 349
    //                   1536898522: 334;
           goto _L4 _L5 _L6 _L7
_L4:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_349;
_L8:
        switch (j)
        {
        default:
            j = 0x7f08007d;
            break;

        case 0: // '\0'
            j = 0x7f08007e;
            break;

        case 1: // '\001'
            j = 0x7f08007c;
            break;

        case 2: // '\002'
            j = 0x7f080077;
            break;
        }
        break MISSING_BLOCK_LABEL_380;
_L5:
        if (s2.equals("shared"))
        {
            j = 0;
        }
          goto _L8
_L7:
        if (s2.equals("checking"))
        {
            j = 1;
        }
          goto _L8
        if (s2.equals("removed"))
        {
            j = 2;
        }
          goto _L8
        if (false)
        {
        }
        continue; /* Loop/switch isn't completed */
_L3:
        H();
        flag = false;
        j = 0;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void a(qP.b b1, int j)
    {
        super.a(b1, j);
        if (i.f || i.i == null)
        {
            return;
        }
        d.a();
        m.a();
        Object obj = A;
        if (((ll) (obj)).mOldStartupMetric != null)
        {
            StartupPath startuppath = Jd.b();
            b1 = startuppath;
            if (startuppath == StartupPath.FROM_DESTROYED_STATE)
            {
                b1 = StartupPath.FROM_KILLED_STATE;
            }
            ((ll) (obj)).mOldStartupMetric.a("type", b1);
            ((ll) (obj)).mOldStartupMetric.a(false);
            obj.mOldStartupMetric = null;
        }
        b1 = i.c();
        if (b1 != null)
        {
            HoldToStreamView.setCameraInfo(b1);
            TalkView.setCameraInfo(b1);
            CameraPreviewBackgroundView.setCameraInfo(b1);
        }
        j = i.g.a();
        int i1 = i.g.b();
        HoldToStreamView.setCameraPreviewSize(j, i1);
        TalkView.setCameraPreviewSize(j, i1);
        CameraPreviewBackgroundView.setCameraPreviewSize(j, i1);
        b1 = new Jz(IO.HIGH_PRIORITY_EXECUTOR);
        IK ik = i.g;
        obj = getResources().getDisplayMetrics();
        if (!s)
        {
            if (ik != null)
            {
                b1.a(ik.b(), ik.a(), android.graphics.Bitmap.Config.ARGB_8888);
            }
            b1.a(((DisplayMetrics) (obj)).widthPixels, ((DisplayMetrics) (obj)).heightPixels, android.graphics.Bitmap.Config.ARGB_8888);
            s = true;
        }
        z.a(new Mg(true, i.k));
        i.k = false;
        K();
        d.b(i.a());
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        x = true;
        u = null;
        if (n != null)
        {
            n.a = 1.0F;
        }
        z.a(new Mg(false, i.k));
    }

    public final void a(byte abyte0[], qP.b b1)
    {
        super.a(abyte0, b1);
        PG.a(new Runnable() {

            private CameraFragment a;

            public final void run()
            {
                if (!a.i.b() && a.b != null && a.b.getAlpha() == 0.0F)
                {
                    a.b.animate().alpha(1.0F).setDuration(100L).start();
                }
            }

            
            {
                a = CameraFragment.this;
                super();
            }
        });
        if (x)
        {
            x = false;
            B.d();
        }
        if (b1 != null)
        {
            PG.b();
            Object obj = HoldToStreamView.g();
            if (obj != null)
            {
                ((HoldToStreamView) (obj)).a(abyte0);
            }
            obj = TalkView.b();
            if (obj != null && ((TalkView) (obj)).l)
            {
                if (TalkView.b.c == null)
                {
                    throw new IllegalStateException("Must call setCameraInfo() first.");
                }
                if (TalkView.b.a == 0 || TalkView.b.b == 0)
                {
                    throw new IllegalStateException("Must call setCameraPreviewSize() first.");
                }
                if (abyte0 != null)
                {
                    ((TalkView) (obj)).e.a(abyte0, TalkView.b);
                    TalkView.a.a(TalkView.b.a, TalkView.b.b, ((TalkView) (obj)).c.getMeasuredWidth(), ((TalkView) (obj)).c.getMeasuredHeight(), TalkView.b.c);
                    TalkView.a.a(abyte0);
                    if (((TalkView) (obj)).k)
                    {
                        ((TalkView) (obj)).g.a(true);
                        obj.k = false;
                    }
                }
            }
            obj = CameraPreviewBackgroundView.a();
            if (obj != null && ((CameraPreviewBackgroundView) (obj)).getVisibility() == 0 && abyte0 != null)
            {
                if (CameraPreviewBackgroundView.a.c == null)
                {
                    throw new IllegalStateException("Must call setCameraInfo() first.");
                }
                if (CameraPreviewBackgroundView.a.a == 0 || CameraPreviewBackgroundView.a.b == 0)
                {
                    throw new IllegalStateException("Must call setCameraPreviewSize() first.");
                }
                CameraPreviewBackgroundView.b.a(CameraPreviewBackgroundView.a.a, CameraPreviewBackgroundView.a.b, ((CameraPreviewBackgroundView) (obj)).c.getMeasuredWidth(), ((CameraPreviewBackgroundView) (obj)).c.getMeasuredHeight(), CameraPreviewBackgroundView.a.c);
                CameraPreviewBackgroundView.b.a(5F);
                CameraPreviewBackgroundView.b.a(abyte0);
            }
            b1.a(u);
            b1 = J();
            if (b1 != null && !i.a() && abyte0 != null && ((DI) (b1)).c == 17 && ((DI) (b1)).f.get())
            {
                if (!SnapScan.a())
                {
                    Timber.e(DI.a, "SnapScan native lib failed to load! -- Scanning disabled!!", new Object[0]);
                    b1.a();
                    return;
                }
                if (((DI) (b1)).g.compareAndSet(false, true))
                {
                    Timber.c(DI.a, "Started scanning...", new Object[0]);
                    b1.k = 0;
                    ((DI) (b1)).h.set(false);
                    b1.j = System.nanoTime();
                    ((DI) (b1)).i.set(((DI) (b1)).j);
                }
                double d1 = DI.a(((DI) (b1)).i.get());
                if (!((DI) (b1)).e.get() && d1 >= ((DI) (b1)).d)
                {
                    Timber.c(DI.a, (new StringBuilder("Stopped scanning - Scan time is expired: ")).append(DI.a(((DI) (b1)).j)).append(" seconds.").toString(), new Object[0]);
                    b1.a();
                }
                if (((DI) (b1)).h.compareAndSet(false, true))
                {
                    (new DI._cls1(b1, abyte0)).executeOnExecutor(((DI) (b1)).b, new Void[0]);
                    return;
                }
            }
        }
    }

    public final boolean a(MotionEvent motionevent)
    {
        return d.a(motionevent);
    }

    protected final byte[] a(IK ik)
    {
        int j = IE.a((int)((double)(ik.d() * ImageFormat.getBitsPerPixel(17)) / 8D));
        Timber.c("CameraUtils", (new StringBuilder("Allocating a Callback Buffer of ")).append(ik.d() * ImageFormat.getBitsPerPixel(17)).append(" divided by 8 = ").append(j).append(" bytes").toString(), new Object[0]);
        u = new byte[j];
        return u;
    }

    public final void b(int j)
    {
        super.b(j);
        if (!getUserVisibleHint())
        {
            return;
        }
        Object obj = getActivity();
        if (obj != null)
        {
            obj = new android.app.AlertDialog.Builder(((android.content.Context) (obj)));
            ((android.app.AlertDialog.Builder) (obj)).setMessage(0x7f0800e4);
            ((android.app.AlertDialog.Builder) (obj)).setCancelable(true);
            ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(0x7f08007f, new android.content.DialogInterface.OnClickListener() {

                public final void onClick(DialogInterface dialoginterface, int i1)
                {
                    dialoginterface.cancel();
                }

            });
            ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(0x7f08012d, new android.content.DialogInterface.OnClickListener() {

                public final void onClick(DialogInterface dialoginterface, int i1)
                {
                    System.exit(-1);
                }

            });
            ((android.app.AlertDialog.Builder) (obj)).show();
        }
        d.a();
        r.a(new lB());
        (new ErrorMetric("CAMERA_FAILED_TO_OPEN")).e();
    }

    public final void b(int j, int i1)
    {
        if (!i.a() && !d.d() && n())
        {
            Q = true;
            e(false);
        }
        a(j, i1, true);
        if (a.c)
        {
            qZ qz1 = g;
            qz1.a(new qZ._cls6(qz1, j, i1));
        }
    }

    public final void b(Bitmap bitmap)
    {
label0:
        {
            if (Property.ENABLE_SNAPSCAN_DEBUG.getBoolean())
            {
                if (bitmap == null)
                {
                    break label0;
                }
                if (O == null)
                {
                    O = new ImageView(getActivity());
                    android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                    layoutparams.addRule(13);
                    ((RelativeLayout)mFragmentLayout.findViewById(0x7f0d00b8)).addView(O, layoutparams);
                }
                ImageView imageview = O;
                imageview.setImageBitmap(bitmap);
                imageview.setVisibility(0);
            }
            return;
        }
        Timber.e("CameraFragment", "The debug scanner image was null.", new Object[0]);
    }

    public final void b(boolean flag)
    {
        int j = 2;
        if (p.a)
        {
            return;
        }
        p();
        Object obj = i;
        obj.c = ((CameraModel) (obj)).c + 1;
        int j1 = ((CameraModel) (obj)).c;
        int i1 = ((CameraModel) (obj)).b;
        if (j1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("cameraNumber: ")).append(j1).toString());
        }
        String s1;
        CameraEventAnalytics cameraeventanalytics;
        boolean flag1;
        if (i1 < 2)
        {
            j = i1;
        }
        obj.c = j1 % j;
        flag1 = i.a(i.c);
        cameraeventanalytics = B;
        if (flag)
        {
            obj = "double_tap";
        } else
        {
            obj = "toggle_button";
        }
        if (flag1)
        {
            s1 = "front_facing_camera";
        } else
        {
            s1 = "back_facing_camera";
        }
        cameraeventanalytics.mEasyMetricManager.a("CAMERA_SWITCH").a("context", obj).a("switch_to", s1).b();
        x = true;
        c();
        if (flag1)
        {
            L();
            return;
        } else
        {
            e(false);
            return;
        }
    }

    public final void c(boolean flag)
    {
        int j = 0;
        Timber.i("CameraFragment", "updateLensesList", new Object[0]);
        Object obj = G;
        InAppBillingManager inappbillingmanager = J;
        LinkedList linkedlist = new LinkedList();
        SparseBooleanArray sparsebooleanarray = new SparseBooleanArray();
        linkedlist.add(re.a);
        ((re) (obj)).a(linkedlist, sparsebooleanarray);
        int i1 = ((re) (obj)).b(linkedlist, sparsebooleanarray);
        if (i1 < 7)
        {
            ((re) (obj)).a(linkedlist, sparsebooleanarray, i1);
        }
        ((re) (obj)).c(linkedlist, sparsebooleanarray);
        ((re) (obj)).a(inappbillingmanager, linkedlist, sparsebooleanarray);
        obj = new ArrayList(linkedlist);
        H.a(((List) (obj)));
        E.mTotalLensCount = ((List) (obj)).size();
        if (flag && a.c && a.b())
        {
            String s1 = a.c();
            int j1 = H.a(s1);
            if (j1 != -1)
            {
                j = j1;
            }
            d.b(j);
        }
    }

    public final void e()
    {
        super.e();
        d.h();
        L();
        M.setEnabled(false);
        K.b(this);
        z.a(new Na("CameraFragment"));
    }

    public final boolean f()
    {
        if (((VerticalSwipeLayout) (M)).c == 0)
        {
            ProfileFragment profilefragment = (ProfileFragment)getChildFragmentManager().a(0x7f0d00b0);
            if (profilefragment != null && profilefragment.o())
            {
                if (!profilefragment.n())
                {
                    return true;
                }
                if (profilefragment.m())
                {
                    return true;
                }
            }
            M.a(1, 0.0D);
            return true;
        } else
        {
            return super.f();
        }
    }

    public final boolean h()
    {
        return i.a() && g.d;
    }

    public final void i()
    {
        S s1 = getChildFragmentManager();
        ProfileFragment profilefragment1 = (ProfileFragment)s1.a(0x7f0d00b0);
        ProfileFragment profilefragment = profilefragment1;
        if (profilefragment1 == null)
        {
            profilefragment = new ProfileFragment();
        }
        profilefragment.b = M;
        profilefragment.c = new a((byte)0);
        if (!profilefragment.isAdded())
        {
            s1.a().a(0x7f0d00b0, profilefragment).a();
        }
    }

    public final boolean l()
    {
        return o.a;
    }

    protected final boolean l_()
    {
        boolean flag = super.l_();
        if (flag && b != null)
        {
            b.setAlpha(0.0F);
        }
        return flag;
    }

    public final boolean m()
    {
        return i.a();
    }

    public final boolean n()
    {
        return d.getClass().equals(qz);
    }

    public final Gt n_()
    {
        return H;
    }

    public final void o()
    {
        if (a.c)
        {
            return;
        } else
        {
            a.a(true);
            d.b(i.a());
            rQ rq1 = h;
            rq1.b();
            rq1.a(true, null);
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        try
        {
            J = ((qq)getActivity()).r();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new ClassCastException((new StringBuilder()).append(getActivity().toString()).append(" must implement InAppBillingManagerProvider").toString());
        }
        H = new Gt(getActivity(), G, J);
        B.mLensesAdapter = H;
    }

    public void onAdjustForQuickSnapEvent(Mb mb)
    {
        if (b == null)
        {
            return;
        }
        if (mb.mShouldPrepare)
        {
            i.a(com.snapchat.android.camera.model.CameraModel.CameraType.FRONT_FACING);
        }
        c();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof OS)
        {
            t = (OS)activity;
        }
    }

    public void onCameraStateEvent(Mh mh)
    {
        boolean flag = false;
        if (mh.a())
        {
            if (mh.cameraToResume != null)
            {
                i.a(mh.cameraToResume);
            }
            c();
            int j;
            if (mh.displayState == CameraDisplayState.SHOW)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            mh = e;
            if (j != 0)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 4;
            }
            mh.setVisibility(j);
            return;
        }
        a(false);
        if (b != null)
        {
            b.setAlpha(0.0F);
        }
        m.b();
        h.b();
    }

    public void onCancelCardLinkEvent(Mi mi)
    {
        G();
        Jo.a(getActivity(), b);
    }

    public void onCancelInChatSnapEvent(Mj mj)
    {
        G();
        a(((String) (null)));
    }

    public void onCancelQuickSnapEvent(Mk mk)
    {
        G();
        a(((String) (null)));
    }

    public void onCancelReplyEvent(Ml ml)
    {
        G();
    }

    public void onChangePreviewQualityEvent(ChangePreviewQualityEvent changepreviewqualityevent)
    {
        if (changepreviewqualityevent.cameraType != null)
        {
            i.a(changepreviewqualityevent.cameraType);
        }
        _cls8.a[changepreviewqualityevent.previewQuality.ordinal()];
        JVM INSTR tableswitch 1 2: default 52
    //                   1 53
    //                   2 89;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (i.j)
        {
            i.k = true;
            a(true);
            i.j = false;
            c();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!i.j)
        {
            i.k = true;
            a(true);
            i.j = true;
            c();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onCreate(Bundle bundle)
    {
        ll.e();
        super.onCreate(bundle);
        K.a(this);
        ll.f();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ll.e();
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (b != null && Ic.HAS_SURFACE_TEXTURE_RECORDING)
        {
            d(0x7f0d00b3).setVisibility(8);
        }
        M = (CameraViewFlipper)d(0x7f0d00af);
        M.setEnabled(false);
        M.setScrollableInBothDirections(true);
        M.setCameraViewFlipperListener(this);
        M.a(new com.snapchat.android.ui.VerticalSwipeLayout.a() {

            private CameraFragment a;

            public final void a(int j1, int k1, int l1)
            {
label0:
                {
                    if (j1 == 2 && k1 != l1)
                    {
                        if (l1 != 0)
                        {
                            break label0;
                        }
                        CameraFragment.a(a).e();
                    }
                    return;
                }
                CameraFragment.a(a).c();
            }

            public final void b(int j1, int k1, int l1)
            {
            }

            public final void b_(int j1)
            {
                Object obj = a.H_();
                if (obj instanceof LandingPageActivity)
                {
                    obj = (LandingPageActivity)obj;
                    if (j1 == 0)
                    {
                        ((LandingPageActivity) (obj)).d();
                        ((LandingPageActivity) (obj)).e();
                    }
                    a.d.i();
                }
            }

            
            {
                a = CameraFragment.this;
                super();
            }
        });
        i.c = qv.a(i.a);
        w = new qG(d(0x7f0d00b2));
        v = (TextView)d(0x7f0d00b4);
        layoutinflater = new rT();
        int j = Math.min(((rT) (layoutinflater)).widthPixels, ((rT) (layoutinflater)).heightPixels);
        int i1 = Math.max(((rT) (layoutinflater)).widthPixels, ((rT) (layoutinflater)).heightPixels);
        v.setTextSize(((float)Math.min(j, i1) * 0.053125F) / ((rT) (layoutinflater)).density);
        ll.f();
        return mFragmentLayout;
    }

    public void onDisableLensesEvent(Mx mx)
    {
        Timber.i("CameraFragment", "onDisableLensesEvent", new Object[0]);
        p();
    }

    public void onFeedRefreshedEvent(SnapMessageFeedRefreshedEvent snapmessagefeedrefreshedevent)
    {
        d.a();
    }

    public void onKeyDownEvent(MU mu)
    {
        if (!super.mIsVisible || ((VerticalSwipeLayout) (M)).c == 0 || M.e())
        {
            return;
        }
        CameraDecor cameradecor;
        switch (mu.keyCode)
        {
        default:
            return;

        case 24: // '\030'
        case 25: // '\031'
        case 27: // '\033'
        case 66: // 'B'
            cameradecor = d;
            break;
        }
        boolean flag;
        if (mu.event.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cameradecor.c(flag);
    }

    public void onLensPrepareStateChangedEvent(Nb nb)
    {
        Timber.i("CameraFragment", "onLensPrepareStateChangedEvent %s", new Object[] {
            nb.lens
        });
        if (a.c)
        {
            Gt gt = H;
            BT bt = nb.lens;
            if (gt.a.contains(bt))
            {
                H.notifyDataSetChanged();
                if (nb.lens.equals(a.e))
                {
                    a(nb.lens);
                    return;
                }
            }
        }
    }

    public void onLensesListChangedEvent(Nf nf)
    {
        Timber.i("CameraFragment", "onLensesListChangedEvent", new Object[0]);
        c(true);
    }

    public void onLockScreenOpenedEvent(Nj nj)
    {
        onResume();
    }

    public void onLongPressEndEvent(Nl nl)
    {
        if (!i.a())
        {
            L();
            d(true);
        }
    }

    public void onPause()
    {
        if (p.a)
        {
            m.a(null, w, true);
            p.a = false;
        }
        p();
        super.onPause();
        m.b();
        if (b != null)
        {
            b.setAlpha(0.0F);
        }
    }

    public void onProfileViewScrollEvent(Ny ny)
    {
        M.a(ny.destinationPage, 1.0D);
    }

    public void onReCreateCheckoutDoneEvent(NC nc)
    {
        Timber.i("CameraFragment", "onReCreateCheckoutDoneEvent", new Object[0]);
        c(true);
    }

    public void onRefreshCameraNotificationBoxesEvent(NG ng)
    {
        d.b();
    }

    public void onReplySnapEvent(NL nl)
    {
        a(new qE(getActivity(), e, this, nl));
        a(((String) (null)));
    }

    public void onResume()
    {
        ll.e();
        super.onResume();
        Intent intent = getActivity().getIntent();
        if ((com.snapchat.android.notification.AndroidNotificationManager.Destination)intent.getSerializableExtra("destinationPage") == com.snapchat.android.notification.AndroidNotificationManager.Destination.ADD_FRIENDS)
        {
            if (super.getActivity().mFragments.e() == 0)
            {
                M.a(0, 0.0D);
                Mf.a().a(new Oi(new AddedMeFragment()));
            }
            intent.removeExtra("destinationPage");
        }
        if (super.mSetFragmentVisibleHandler.hasMessages(100, this))
        {
            ae();
            super.mSetFragmentVisibleHandler.removeMessages(100, this);
        }
        ll.f();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s1)
    {
        if (S.contains(s1) && d != null)
        {
            d.a();
        }
    }

    public void onSnapViewingEvent(NY ny)
    {
        d.a();
    }

    public void onStart()
    {
        super.onStart();
        Bt.a(this);
    }

    public void onStartScanFromCameraEvent(Oj oj)
    {
        a(oj.pointX, oj.pointY, false);
        d(false);
        Q = false;
        e(true);
    }

    public void onStop()
    {
        super.onStop();
        Bt.b(this);
        if (getFragmentManager().e() == 0)
        {
            M.a(1, 1.0D);
        }
    }

    public void onSwitchDeeplinkNotificationEvent(Os os)
    {
        if (d != null && os.mMediaOpenOrigin == MediaOpenOrigin.CAMERA_QR_SCAN)
        {
            if (!os.mSwitchToNotification)
            {
                B.f();
            }
            d.a(os);
        }
    }

    public void onSwitchToInChatCameraEvent(Ou ou)
    {
        a(new qB(getActivity(), e, this, ou));
        a(ou.mCaptionText);
        z.a(new NT(false));
    }

    public void onSwitchToQuickSnapCameraEvent(Ov ov)
    {
        a(new qD(getActivity(), e, this));
        a(ov.mCaptionText);
        z.a(new NT(false));
    }

    public void onViewedFriendFeedEvent(Ma ma)
    {
        d.a();
    }

    protected void onVisible()
    {
        ll.e();
        a(b());
        F.c();
        if (g.d)
        {
            Object obj = G;
            if (((re) (obj)).f.d)
            {
                ((re) (obj)).c.e();
                ((re) (obj)).e.a(false);
                if (Bt.cc())
                {
                    ((re) (obj)).d.e();
                }
            }
            if (a.e())
            {
                o();
            } else
            {
                d.b(i.a());
            }
        }
        if (((VerticalSwipeLayout) (M)).c == 1)
        {
            z.a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN));
        }
        z.a(new NQ());
        obj = getActivity();
        if (obj instanceof LandingPageActivity)
        {
            obj = ((LandingPageActivity)obj).b;
            if (obj == null || ((NL) (obj)).mOriginatingFragment != 3)
            {
                z.a(new NM());
            }
        }
        z.a(new Mh(CameraDisplayState.SHOW));
        if (getView() != null)
        {
            ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(getView().getWindowToken(), 0);
        }
        if (d != null)
        {
            d.a();
            d.f();
        }
        if (e != null)
        {
            e.setVisibility(0);
        }
        M.setEnabled(true);
        if (((VerticalSwipeLayout) (M)).c == 0)
        {
            z.a(new NT(false));
        }
        M.a(((VerticalSwipeLayout) (M)).c, 0.0D);
        B.b();
        if (((VerticalSwipeLayout) (M)).c == 1)
        {
            B.c();
        }
        K.a(this);
        ll.f();
        P = false;
        d.h();
    }

    public final void p()
    {
        R = false;
        d.a(8);
        if (!a.c)
        {
            return;
        } else
        {
            a.a(false);
            d.b(i.a());
            h.b();
            return;
        }
    }

    public final boolean q()
    {
        return a.c;
    }

    public final re s()
    {
        return G;
    }

    public final BT t()
    {
        return a.e;
    }

    public final int u()
    {
        int j;
label0:
        {
            if (a.e())
            {
                j = H.a(a.d);
                Timber.i("CameraFragment", "hasLensIdToEnable id=%s, lensPosition=%s", new Object[] {
                    a.d, Integer.valueOf(j)
                });
                if (j != -1)
                {
                    break label0;
                }
            }
            return 0;
        }
        return j;
    }

    public final boolean v()
    {
        return a.b();
    }

    public final boolean w()
    {
        if (i.b())
        {
            return false;
        }
        if (Ic.HAS_SURFACE_TEXTURE_RECORDING)
        {
            IK ik = q.a();
            if (ik == null)
            {
                a(com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.INITIALIZATION_ERROR);
                return false;
            } else
            {
                return a(((Surface) (null)), ik);
            }
        } else
        {
            c.b(true);
            CameraView cameraview = b;
            cameraview.b = new SurfaceView(cameraview.getContext());
            cameraview.a.addView(cameraview.b);
            cameraview.b.getHolder().addCallback(new com.snapchat.android.camera.cameraview.CameraView._cls3(this));
            cameraview.b.setVisibility(0);
            cameraview.c.setVisibility(8);
            return true;
        }
    }

    public final boolean x()
    {
        return p.a;
    }

    public final boolean y()
    {
        return p.b;
    }

    public final boolean z()
    {
        boolean flag1 = false;
        boolean flag;
        if (i.a())
        {
            flag = Bt.am();
        } else
        {
            Object obj = c;
            flag = flag1;
            if (obj != null)
            {
                obj = ((qP.b) (obj)).c();
                flag = flag1;
                if (obj != null)
                {
                    obj = ((android.hardware.Camera.Parameters) (obj)).getSupportedFlashModes();
                    flag = flag1;
                    if (obj != null)
                    {
                        return ((List) (obj)).contains("torch");
                    }
                }
            }
        }
        return flag;
    }

    static 
    {
        S = eg.a(SharedPreferenceKey.HAS_SEEN_NEW_FRIEND_REQUEST_ONBOARDING_MESSAGE.getKey(), SharedPreferenceKey.HAS_SEEN_PROFILE_PAGE_ONBOARDING_MESSAGE.getKey());
    }
}
