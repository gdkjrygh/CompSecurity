// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ViewSwitcher;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal:
//            bb, be, bg, bo, 
//            cj, cm, ek, u, 
//            z, ac, ep, ev, 
//            aq, am, eu, eh, 
//            eg, ew, bn, bs, 
//            ey, bv, ei, bm, 
//            hn, da, ct, aj, 
//            eq, bp, el, ez, 
//            y, ad, cu, dh, 
//            cr, cv, dd, dn, 
//            at, w, ci, cg, 
//            en, bu, h, eo, 
//            k, l

public class v extends ar.a
    implements bb, be, bg, bo, cj, cm, dn.a, ek, u
{
    private static final class a extends ViewSwitcher
    {

        private final eq kG;

        static eq a(a a1)
        {
            return a1.kG;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            kG.c(motionevent);
            return false;
        }

        public a(Context context)
        {
            super(context);
            kG = new eq(context);
        }
    }

    private static final class b
        implements h, Runnable
    {

        private c kA;
        private final List kH = new Vector();
        private final CountDownLatch kI = new CountDownLatch(1);
        private final AtomicReference kJ = new AtomicReference();

        private void aj()
        {
            try
            {
                kI.await();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                ev.c("Interrupted during GADSignals creation.", interruptedexception);
            }
        }

        private void ak()
        {
            if (!kH.isEmpty())
            {
                Iterator iterator = kH.iterator();
                while (iterator.hasNext()) 
                {
                    Object aobj[] = (Object[])iterator.next();
                    if (aobj.length == 1)
                    {
                        ((h)kJ.get()).a((MotionEvent)aobj[0]);
                    } else
                    if (aobj.length == 3)
                    {
                        ((h)kJ.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
                    }
                }
            }
        }

        public String a(Context context)
        {
            aj();
            ak();
            return ((h)kJ.get()).a(context);
        }

        public String a(Context context, String s)
        {
            aj();
            ak();
            return ((h)kJ.get()).a(context, s);
        }

        public void a(int i, int j, int l)
        {
            h h1 = (h)kJ.get();
            if (h1 != null)
            {
                ak();
                h1.a(i, j, l);
                return;
            } else
            {
                kH.add(((Object) (new Object[] {
                    Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(l)
                })));
                return;
            }
        }

        public void a(MotionEvent motionevent)
        {
            h h1 = (h)kJ.get();
            if (h1 != null)
            {
                ak();
                h1.a(motionevent);
                return;
            } else
            {
                kH.add(((Object) (new Object[] {
                    motionevent
                })));
                return;
            }
        }

        public void run()
        {
            kJ.set(k.a(kA.kO.st, kA.kM));
            kI.countDown();
            kA = null;
            return;
            Exception exception;
            exception;
            kI.countDown();
            kA = null;
            throw exception;
        }

        public b(c c1)
        {
            kA = c1;
            if (eu.bR())
            {
                eo.execute(this);
                return;
            } else
            {
                run();
                return;
            }
        }
    }

    private static final class c
    {

        public final a kK;
        public final String kL;
        public final Context kM;
        public final l kN = new l(new b(this));
        public final ew kO;
        public aq kP;
        public en kQ;
        public am kR;
        public eg kS;
        public eh kT;
        public at kU;
        public dh kV;
        public dd kW;
        public da kX;
        public el kY;
        public boolean kZ;
        private HashSet la;

        public void a(HashSet hashset)
        {
            la = hashset;
        }

        public HashSet al()
        {
            return la;
        }

        public c(Context context, am am1, String s, ew ew1)
        {
            kY = null;
            kZ = false;
            la = null;
            if (am1.md)
            {
                kK = null;
            } else
            {
                kK = new a(context);
                kK.setMinimumWidth(am1.widthPixels);
                kK.setMinimumHeight(am1.heightPixels);
                kK.setVisibility(4);
            }
            kR = am1;
            kL = s;
            kM = context;
            kO = ew1;
        }
    }


    private final c kA;
    private final z kB = new z(this);
    private final ac kC = new ac();
    private boolean kD;
    private final ComponentCallbacks kE = new ComponentCallbacks() {

        final v kF;

        public void onConfigurationChanged(Configuration configuration)
        {
            if (v.a(kF) != null && v.a(kF).kS != null && v.a(kF).kS.ow != null)
            {
                v.a(kF).kS.ow.bS();
            }
        }

        public void onLowMemory()
        {
        }

            
            {
                kF = v.this;
                super();
            }
    };
    private final bu kz;

    public v(Context context, am am1, String s, bu bu, ew ew1)
    {
        kA = new c(context, am1, s, ew1);
        kz = bu;
        ep.k(context);
        R();
    }

    private void R()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && kA != null && kA.kM != null)
        {
            kA.kM.registerComponentCallbacks(kE);
        }
    }

    private void S()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && kA != null && kA.kM != null)
        {
            kA.kM.unregisterComponentCallbacks(kE);
        }
    }

    static c a(v v1)
    {
        return v1.kA;
    }

    private void a(int i)
    {
        ev.D((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (kA.kP == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        kA.kP.onAdFailedToLoad(i);
        return;
        RemoteException remoteexception;
        remoteexception;
        ev.c("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void ac()
    {
        ev.B("Ad closing.");
        if (kA.kP == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        kA.kP.onAdClosed();
        return;
        RemoteException remoteexception;
        remoteexception;
        ev.c("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void ad()
    {
        ev.B("Ad leaving application.");
        if (kA.kP == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        kA.kP.onAdLeftApplication();
        return;
        RemoteException remoteexception;
        remoteexception;
        ev.c("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void ae()
    {
        ev.B("Ad opening.");
        if (kA.kP == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        kA.kP.onAdOpened();
        return;
        RemoteException remoteexception;
        remoteexception;
        ev.c("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void af()
    {
        ev.B("Ad finished loading.");
        if (kA.kP == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        kA.kP.onAdLoaded();
        return;
        RemoteException remoteexception;
        remoteexception;
        ev.c("Could not call AdListener.onAdLoaded().", remoteexception);
        return;
    }

    private boolean ag()
    {
        boolean flag = true;
        if (!ep.a(kA.kM.getPackageManager(), kA.kM.getPackageName(), "android.permission.INTERNET"))
        {
            if (!kA.kR.md)
            {
                eu.a(kA.kK, kA.kR, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        }
        if (!ep.j(kA.kM))
        {
            if (!kA.kR.md)
            {
                eu.a(kA.kK, kA.kR, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && !kA.kR.md)
        {
            kA.kK.setVisibility(0);
        }
        return flag;
    }

    private void ah()
    {
        if (kA.kS == null)
        {
            ev.D("Ad state was null when trying to ping click URLs.");
        } else
        {
            ev.z("Pinging click URLs.");
            kA.kT.bx();
            if (kA.kS.nr != null)
            {
                ep.a(kA.kM, kA.kO.st, kA.kS.nr);
            }
            if (kA.kS.rw != null && kA.kS.rw.nr != null)
            {
                bs.a(kA.kM, kA.kO.st, kA.kS, kA.kL, false, kA.kS.rw.nr);
                return;
            }
        }
    }

    private void ai()
    {
        if (kA.kS != null)
        {
            kA.kS.ow.destroy();
            kA.kS = null;
        }
    }

    private void b(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
        kA.kK.addView(view, layoutparams);
    }

    private boolean b(eg eg1)
    {
        if (eg1.qd)
        {
            View view;
            try
            {
                eg1 = (View)e.e(eg1.nL.getView());
            }
            // Misplaced declaration of an exception variable
            catch (eg eg1)
            {
                ev.c("Could not get View from mediation adapter.", eg1);
                return false;
            }
            view = kA.kK.getNextView();
            if (view != null)
            {
                kA.kK.removeView(view);
            }
            try
            {
                b(((View) (eg1)));
            }
            // Misplaced declaration of an exception variable
            catch (eg eg1)
            {
                ev.c("Could not add mediation view to view hierarchy.", eg1);
                return false;
            }
        } else
        if (eg1.rx != null)
        {
            eg1.ow.a(eg1.rx);
            kA.kK.removeAllViews();
            kA.kK.setMinimumWidth(eg1.rx.widthPixels);
            kA.kK.setMinimumHeight(eg1.rx.heightPixels);
            b(((View) (eg1.ow)));
        }
        if (kA.kK.getChildCount() > 1)
        {
            kA.kK.showNext();
        }
        if (kA.kS != null)
        {
            eg1 = kA.kK.getNextView();
            if (eg1 instanceof ey)
            {
                ((ey)eg1).a(kA.kM, kA.kR);
            } else
            if (eg1 != null)
            {
                kA.kK.removeView(eg1);
            }
            if (kA.kS.nL != null)
            {
                try
                {
                    kA.kS.nL.destroy();
                }
                // Misplaced declaration of an exception variable
                catch (eg eg1)
                {
                    ev.D("Could not destroy previous mediation adapter.");
                }
            }
        }
        kA.kK.setVisibility(0);
        return true;
    }

    private dt.a c(aj aj1)
    {
        ApplicationInfo applicationinfo = kA.kM.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo;
        Object obj;
        try
        {
            packageinfo = kA.kM.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        if (!kA.kR.md && kA.kK.getParent() != null)
        {
            int ai1[] = new int[2];
            kA.kK.getLocationOnScreen(ai1);
            int j = ai1[0];
            int k = ai1[1];
            obj = kA.kM.getResources().getDisplayMetrics();
            int l = kA.kK.getWidth();
            int i1 = kA.kK.getHeight();
            String s;
            Bundle bundle;
            int i;
            if (kA.kK.isShown() && j + l > 0 && k + i1 > 0 && j <= ((DisplayMetrics) (obj)).widthPixels && k <= ((DisplayMetrics) (obj)).heightPixels)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            obj = new Bundle(5);
            ((Bundle) (obj)).putInt("x", j);
            ((Bundle) (obj)).putInt("y", k);
            ((Bundle) (obj)).putInt("width", l);
            ((Bundle) (obj)).putInt("height", i1);
            ((Bundle) (obj)).putInt("visible", i);
        } else
        {
            obj = null;
        }
        s = ei.bD();
        kA.kT = new eh(s, kA.kL);
        kA.kT.f(aj1);
        bundle = ei.a(kA.kM, this, s);
        return new dt.a(((Bundle) (obj)), aj1, kA.kR, kA.kL, applicationinfo, packageinfo, s, ei.rN, kA.kO, bundle);
    }

    private void c(boolean flag)
    {
        if (kA.kS == null)
        {
            ev.D("Ad state was null when trying to ping impression URLs.");
        } else
        {
            ev.z("Pinging Impression URLs.");
            kA.kT.bw();
            if (kA.kS.ns != null)
            {
                ep.a(kA.kM, kA.kO.st, kA.kS.ns);
            }
            if (kA.kS.rw != null && kA.kS.rw.ns != null)
            {
                bs.a(kA.kM, kA.kO.st, kA.kS, kA.kL, flag, kA.kS.rw.ns);
            }
            if (kA.kS.nK != null && kA.kS.nK.nn != null)
            {
                bs.a(kA.kM, kA.kO.st, kA.kS, kA.kL, flag, kA.kS.nK.nn);
                return;
            }
        }
    }

    public d P()
    {
        hn.ay("getAdFrame must be called on the main UI thread.");
        return e.h(kA.kK);
    }

    public am Q()
    {
        hn.ay("getAdSize must be called on the main UI thread.");
        return kA.kR;
    }

    public void T()
    {
        ad();
    }

    public void U()
    {
        kC.d(kA.kS);
        if (kA.kR.md)
        {
            ai();
        }
        kD = false;
        ac();
        kA.kT.by();
    }

    public void V()
    {
        if (kA.kR.md)
        {
            c(false);
        }
        kD = true;
        ae();
    }

    public void W()
    {
        onAdClicked();
    }

    public void X()
    {
        U();
    }

    public void Y()
    {
        T();
    }

    public void Z()
    {
        V();
    }

    public void a(am am1)
    {
        hn.ay("setAdSize must be called on the main UI thread.");
        kA.kR = am1;
        if (kA.kS != null)
        {
            kA.kS.ow.a(am1);
        }
        if (kA.kK.getChildCount() > 1)
        {
            kA.kK.removeView(kA.kK.getNextView());
        }
        kA.kK.setMinimumWidth(am1.widthPixels);
        kA.kK.setMinimumHeight(am1.heightPixels);
        kA.kK.requestLayout();
    }

    public void a(aq aq1)
    {
        hn.ay("setAdListener must be called on the main UI thread.");
        kA.kP = aq1;
    }

    public void a(at at1)
    {
        hn.ay("setAppEventListener must be called on the main UI thread.");
        kA.kU = at1;
    }

    public void a(dd dd1)
    {
        hn.ay("setInAppPurchaseListener must be called on the main UI thread.");
        kA.kW = dd1;
    }

    public void a(dh dh1, String s)
    {
        hn.ay("setPlayStorePurchaseParams must be called on the main UI thread.");
        kA.kX = new da(s);
        kA.kV = dh1;
        if (!ei.bH() && dh1 != null)
        {
            (new ct(kA.kM, kA.kV, kA.kX)).start();
        }
    }

    public void a(eg eg1)
    {
        int j;
        boolean flag;
        j = 0;
        kA.kQ = null;
        if (eg1.errorCode != -2 && eg1.errorCode != 3)
        {
            ei.b(kA.al());
        }
        if (eg1.errorCode == -1)
        {
            return;
        }
        if (eg1.pV.extras != null)
        {
            flag = eg1.pV.extras.getBoolean("_noRefresh", false);
        } else
        {
            flag = false;
        }
        if (!kA.kR.md) goto _L2; else goto _L1
_L1:
        ep.a(eg1.ow);
_L4:
        if (eg1.errorCode == 3 && eg1.rw != null && eg1.rw.nt != null)
        {
            ev.z("Pinging no fill URLs.");
            bs.a(kA.kM, kA.kO.st, eg1, kA.kL, false, eg1.rw.nt);
        }
        if (eg1.errorCode != -2)
        {
            a(eg1.errorCode);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!flag)
        {
            if (eg1.nv > 0L)
            {
                kB.a(eg1.pV, eg1.nv);
            } else
            if (eg1.rw != null && eg1.rw.nv > 0L)
            {
                kB.a(eg1.pV, eg1.rw.nv);
            } else
            if (!eg1.qd && eg1.errorCode == 2)
            {
                kB.d(eg1.pV);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!kA.kR.md)
        {
            if (!b(eg1))
            {
                a(0);
                return;
            }
            if (kA.kK != null)
            {
                a.a(kA.kK).x(eg1.qi);
            }
        }
        if (kA.kS != null && kA.kS.nN != null)
        {
            kA.kS.nN.a(null);
        }
        if (eg1.nN != null)
        {
            eg1.nN.a(this);
        }
        kC.d(kA.kS);
        kA.kS = eg1;
        if (eg1.rx != null)
        {
            kA.kR = eg1.rx;
        }
        kA.kT.j(eg1.ry);
        kA.kT.k(eg1.rz);
        kA.kT.n(kA.kR.md);
        kA.kT.o(eg1.qd);
        if (!kA.kR.md)
        {
            c(false);
        }
        if (kA.kY == null)
        {
            kA.kY = new el(kA.kL);
        }
        int i;
        if (eg1.rw != null)
        {
            i = eg1.rw.nw;
            j = eg1.rw.nx;
        } else
        {
            i = 0;
        }
        kA.kY.a(i, j);
        if (!kA.kR.md && eg1.ow != null && (eg1.ow.bW().ce() || eg1.rv != null))
        {
            ad ad1 = kC.a(kA.kR, kA.kS);
            if (eg1.ow.bW().ce() && ad1 != null)
            {
                ad1.a(new y(eg1.ow));
            }
        }
        kA.kS.ow.bS();
        af();
        return;
    }

    public void a(String s, ArrayList arraylist)
    {
        arraylist = new cu(s, arraylist, kA.kM, kA.kO.st);
        if (kA.kW != null) goto _L2; else goto _L1
_L1:
        ev.D("InAppPurchaseListener is not set. Try to launch default purchase flow.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(kA.kM) == 0) goto _L4; else goto _L3
_L3:
        ev.D("Google Play Service unavailable, cannot launch default purchase flow.");
_L6:
        return;
_L4:
        if (kA.kV == null)
        {
            ev.D("PlayStorePurchaseListener is not set.");
            return;
        }
        if (kA.kX == null)
        {
            ev.D("PlayStorePurchaseVerifier is not initialized.");
            return;
        }
        boolean flag = kA.kV.isValidPurchase(s);
        if (!flag) goto _L6; else goto _L5
_L5:
        cv.a(kA.kM, kA.kO.sw, new cr(arraylist, kA.kV, kA.kX, kA.kM));
        return;
        s;
        ev.D("Could not start In-App purchase.");
        if (true) goto _L5; else goto _L2
_L2:
        try
        {
            kA.kW.a(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ev.D("Could not start In-App purchase.");
        }
        return;
    }

    public void a(HashSet hashset)
    {
        kA.a(hashset);
    }

    public boolean a(aj aj1)
    {
        hn.ay("loadAd must be called on the main UI thread.");
        if (kA.kQ == null) goto _L2; else goto _L1
_L1:
        ev.D("An ad request is already in progress. Aborting.");
_L4:
        return false;
_L2:
        if (kA.kR.md && kA.kS != null)
        {
            ev.D("An interstitial is already loading. Aborting.");
            return false;
        }
        if (!ag()) goto _L4; else goto _L3
_L3:
        dt.a a1;
        ev.B("Starting ad request.");
        if (!aj1.lT)
        {
            ev.B((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(eu.o(kA.kM)).append("\") to get test ads on this device.").toString());
        }
        kB.cancel();
        kA.kZ = false;
        a1 = c(aj1);
        if (!kA.kR.md) goto _L6; else goto _L5
_L5:
        aj1 = ey.a(kA.kM, kA.kR, false, false, kA.kN, kA.kO);
        aj1.bW().a(this, null, this, this, true, this, this);
_L8:
        kA.kQ = dn.a(kA.kM, a1, kA.kN, aj1, kz, this);
        return true;
_L6:
        aj1 = kA.kK.getNextView();
        if (!(aj1 instanceof ey))
        {
            break; /* Loop/switch isn't completed */
        }
        aj1 = (ey)aj1;
        aj1.a(kA.kM, kA.kR);
_L9:
        aj1.bW().a(this, this, this, this, false, this);
        if (true) goto _L8; else goto _L7
_L7:
        if (aj1 != null)
        {
            kA.kK.removeView(aj1);
        }
        ey ey1 = ey.a(kA.kM, kA.kR, false, false, kA.kN, kA.kO);
        aj1 = ey1;
        if (kA.kR.me == null)
        {
            b(ey1);
            aj1 = ey1;
        }
          goto _L9
        if (true) goto _L8; else goto _L10
_L10:
    }

    public void aa()
    {
        if (kA.kS != null)
        {
            ev.D((new StringBuilder()).append("Mediation adapter ").append(kA.kS.nM).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        c(true);
        af();
    }

    public void ab()
    {
        hn.ay("recordManualImpression must be called on the main UI thread.");
        if (kA.kS == null)
        {
            ev.D("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            ev.z("Pinging manual tracking URLs.");
            if (kA.kS.qf != null)
            {
                ep.a(kA.kM, kA.kO.st, kA.kS.qf);
                return;
            }
        }
    }

    public void b(aj aj1)
    {
        android.view.ViewParent viewparent = kA.kK.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && ep.bL() && !kD)
        {
            a(aj1);
            return;
        } else
        {
            ev.B("Ad is not visible. Not refreshing ad.");
            kB.d(aj1);
            return;
        }
    }

    public void b(boolean flag)
    {
        kA.kZ = flag;
    }

    public void destroy()
    {
        hn.ay("destroy must be called on the main UI thread.");
        S();
        kA.kP = null;
        kA.kU = null;
        kB.cancel();
        kC.stop();
        stopLoading();
        if (kA.kK != null)
        {
            kA.kK.removeAllViews();
        }
        if (kA.kS != null && kA.kS.ow != null)
        {
            kA.kS.ow.destroy();
        }
        if (kA.kS == null || kA.kS.nL == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        kA.kS.nL.destroy();
        return;
        RemoteException remoteexception;
        remoteexception;
        ev.D("Could not destroy mediation adapter.");
        return;
    }

    public boolean isReady()
    {
        hn.ay("isLoaded must be called on the main UI thread.");
        return kA.kQ == null && kA.kS != null;
    }

    public void onAdClicked()
    {
        ah();
    }

    public void onAppEvent(String s, String s1)
    {
        if (kA.kU == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        kA.kU.onAppEvent(s, s1);
        return;
        s;
        ev.c("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        hn.ay("pause must be called on the main UI thread.");
        if (kA.kS != null)
        {
            ep.a(kA.kS.ow);
        }
        if (kA.kS != null && kA.kS.nL != null)
        {
            try
            {
                kA.kS.nL.pause();
            }
            catch (RemoteException remoteexception)
            {
                ev.D("Could not pause mediation adapter.");
            }
        }
        kC.pause();
        kB.pause();
    }

    public void resume()
    {
        hn.ay("resume must be called on the main UI thread.");
        if (kA.kS != null)
        {
            ep.b(kA.kS.ow);
        }
        if (kA.kS != null && kA.kS.nL != null)
        {
            try
            {
                kA.kS.nL.resume();
            }
            catch (RemoteException remoteexception)
            {
                ev.D("Could not resume mediation adapter.");
            }
        }
        kB.resume();
        kC.resume();
    }

    public void showInterstitial()
    {
        hn.ay("showInterstitial must be called on the main UI thread.");
        if (!kA.kR.md)
        {
            ev.D("Cannot call showInterstitial on a banner ad.");
            return;
        }
        if (kA.kS == null)
        {
            ev.D("The interstitial has not loaded.");
            return;
        }
        if (kA.kS.ow.bZ())
        {
            ev.D("The interstitial is already showing.");
            return;
        }
        kA.kS.ow.q(true);
        if (kA.kS.ow.bW().ce() || kA.kS.rv != null)
        {
            ad ad1 = kC.a(kA.kR, kA.kS);
            if (kA.kS.ow.bW().ce() && ad1 != null)
            {
                ad1.a(new y(kA.kS.ow));
            }
        }
        if (kA.kS.qd)
        {
            try
            {
                kA.kS.nL.showInterstitial();
                return;
            }
            catch (RemoteException remoteexception)
            {
                ev.c("Could not show interstitial.", remoteexception);
            }
            ai();
            return;
        }
        w w1 = new w(kA.kZ, false);
        Object obj = w1;
        if (kA.kM instanceof Activity)
        {
            obj = ((Activity)kA.kM).getWindow();
            Rect rect = new Rect();
            Rect rect1 = new Rect();
            ((Window) (obj)).getDecorView().getGlobalVisibleRect(rect);
            ((Window) (obj)).getDecorView().getWindowVisibleDisplayFrame(rect1);
            obj = w1;
            if (rect.bottom != 0)
            {
                obj = w1;
                if (rect1.bottom != 0)
                {
                    boolean flag1 = kA.kZ;
                    boolean flag;
                    if (rect.top == rect1.top)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    obj = new w(flag1, flag);
                }
            }
        }
        obj = new ci(this, this, this, kA.kS.ow, kA.kS.orientation, kA.kO, kA.kS.qi, ((w) (obj)));
        cg.a(kA.kM, ((ci) (obj)));
    }

    public void stopLoading()
    {
        hn.ay("stopLoading must be called on the main UI thread.");
        if (kA.kS != null)
        {
            kA.kS.ow.stopLoading();
            kA.kS = null;
        }
        if (kA.kQ != null)
        {
            kA.kQ.cancel();
        }
    }
}
