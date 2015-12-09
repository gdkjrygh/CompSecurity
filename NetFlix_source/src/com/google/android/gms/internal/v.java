// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ViewSwitcher;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            az, bc, bk, cf, 
//            ci, dl, u, x, 
//            aa, dv, dw, dq, 
//            ao, ak, di, dh, 
//            dx, bj, bo, dz, 
//            bi, br, dj, fq, 
//            ah, dr, bl, dm, 
//            ea, w, ab, cm, 
//            co, cr, ar, ce, 
//            cc, do, bq, l, 
//            k

public class v extends ap.a
    implements az, bc, bk, cf, ci, cr.a, dl, u
{
    private static final class a extends ViewSwitcher
    {

        private final dr kF;

        static dr a(a a1)
        {
            return a1.kF;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            kF.c(motionevent);
            return false;
        }

        public a(Context context)
        {
            super(context);
            kF = new dr(context);
        }
    }

    private static final class b
    {

        public final a kG;
        public final String kH;
        public final Context kI;
        public final l kJ;
        public final dx kK;
        public ao kL;
        public do kM;
        public ak kN;
        public dh kO;
        public di kP;
        public ar kQ;
        public co kR;
        public dm kS;
        private HashSet kT;

        public void a(HashSet hashset)
        {
            kT = hashset;
        }

        public HashSet ak()
        {
            return kT;
        }

        public b(Context context, ak ak1, String s, dx dx1)
        {
            kS = null;
            kT = null;
            if (ak1.lT)
            {
                kG = null;
            } else
            {
                kG = new a(context);
                kG.setMinimumWidth(ak1.widthPixels);
                kG.setMinimumHeight(ak1.heightPixels);
                kG.setVisibility(4);
            }
            kN = ak1;
            kH = s;
            kI = context;
            kJ = new l(k.a(dx1.rq, context));
            kK = dx1;
        }
    }


    private final x kA = new x(this);
    private final aa kB = new aa();
    private boolean kC;
    private final ComponentCallbacks kD = new ComponentCallbacks() {

        final v kE;

        public void onConfigurationChanged(Configuration configuration)
        {
            if (v.a(kE) != null && v.a(kE).kO != null && v.a(kE).kO.oj != null)
            {
                v.a(kE).kO.oj.bE();
            }
        }

        public void onLowMemory()
        {
        }

            
            {
                kE = v.this;
                super();
            }
    };
    private final bq ky;
    private final b kz;

    public v(Context context, ak ak1, String s, bq bq, dx dx1)
    {
        kz = new b(context, ak1, s, dx1);
        ky = bq;
        dw.x((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(dv.l(context)).append("\") to get test ads on this device.").toString());
        dq.i(context);
        S();
    }

    private void S()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && kz != null && kz.kI != null)
        {
            kz.kI.registerComponentCallbacks(kD);
        }
    }

    private void T()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && kz != null && kz.kI != null)
        {
            kz.kI.unregisterComponentCallbacks(kD);
        }
    }

    static b a(v v1)
    {
        return v1.kz;
    }

    private void a(int i)
    {
        dw.z((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (kz.kL == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        kz.kL.onAdFailedToLoad(i);
        return;
        RemoteException remoteexception;
        remoteexception;
        dw.c("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void ad()
    {
        dw.x("Ad closing.");
        if (kz.kL == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        kz.kL.onAdClosed();
        return;
        RemoteException remoteexception;
        remoteexception;
        dw.c("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void ae()
    {
        dw.x("Ad leaving application.");
        if (kz.kL == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        kz.kL.onAdLeftApplication();
        return;
        RemoteException remoteexception;
        remoteexception;
        dw.c("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void af()
    {
        dw.x("Ad opening.");
        if (kz.kL == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        kz.kL.onAdOpened();
        return;
        RemoteException remoteexception;
        remoteexception;
        dw.c("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void ag()
    {
        dw.x("Ad finished loading.");
        if (kz.kL == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        kz.kL.onAdLoaded();
        return;
        RemoteException remoteexception;
        remoteexception;
        dw.c("Could not call AdListener.onAdLoaded().", remoteexception);
        return;
    }

    private boolean ah()
    {
        boolean flag = true;
        if (!dq.a(kz.kI.getPackageManager(), kz.kI.getPackageName(), "android.permission.INTERNET"))
        {
            if (!kz.kN.lT)
            {
                dv.a(kz.kG, kz.kN, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        }
        if (!dq.h(kz.kI))
        {
            if (!kz.kN.lT)
            {
                dv.a(kz.kG, kz.kN, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && !kz.kN.lT)
        {
            kz.kG.setVisibility(0);
        }
        return flag;
    }

    private void ai()
    {
        if (kz.kO == null)
        {
            dw.z("Ad state was null when trying to ping click URLs.");
        } else
        {
            dw.v("Pinging click URLs.");
            kz.kP.bl();
            if (kz.kO.ne != null)
            {
                dq.a(kz.kI, kz.kK.rq, kz.kO.ne);
            }
            if (kz.kO.qt != null && kz.kO.qt.ne != null)
            {
                bo.a(kz.kI, kz.kK.rq, kz.kO, kz.kH, false, kz.kO.qt.ne);
                return;
            }
        }
    }

    private void aj()
    {
        if (kz.kO != null)
        {
            kz.kO.oj.destroy();
            kz.kO = null;
        }
    }

    private void b(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
        kz.kG.addView(view, layoutparams);
    }

    private void b(boolean flag)
    {
        if (kz.kO == null)
        {
            dw.z("Ad state was null when trying to ping impression URLs.");
        } else
        {
            dw.v("Pinging Impression URLs.");
            kz.kP.bk();
            if (kz.kO.nf != null)
            {
                dq.a(kz.kI, kz.kK.rq, kz.kO.nf);
            }
            if (kz.kO.qt != null && kz.kO.qt.nf != null)
            {
                bo.a(kz.kI, kz.kK.rq, kz.kO, kz.kH, flag, kz.kO.qt.nf);
            }
            if (kz.kO.nx != null && kz.kO.nx.na != null)
            {
                bo.a(kz.kI, kz.kK.rq, kz.kO, kz.kH, flag, kz.kO.nx.na);
                return;
            }
        }
    }

    private boolean b(dh dh1)
    {
        if (dh1.po)
        {
            View view;
            try
            {
                dh1 = (View)e.d(dh1.ny.getView());
            }
            // Misplaced declaration of an exception variable
            catch (dh dh1)
            {
                dw.c("Could not get View from mediation adapter.", dh1);
                return false;
            }
            view = kz.kG.getNextView();
            if (view != null)
            {
                kz.kG.removeView(view);
            }
            try
            {
                b(((View) (dh1)));
            }
            // Misplaced declaration of an exception variable
            catch (dh dh1)
            {
                dw.c("Could not add mediation view to view hierarchy.", dh1);
                return false;
            }
        } else
        if (dh1.qu != null)
        {
            dh1.oj.a(dh1.qu);
            kz.kG.removeAllViews();
            kz.kG.setMinimumWidth(dh1.qu.widthPixels);
            kz.kG.setMinimumHeight(dh1.qu.heightPixels);
            b(((View) (dh1.oj)));
        }
        if (kz.kG.getChildCount() > 1)
        {
            kz.kG.showNext();
        }
        if (kz.kO != null)
        {
            dh1 = kz.kG.getNextView();
            if (dh1 instanceof dz)
            {
                ((dz)dh1).a(kz.kI, kz.kN);
            } else
            if (dh1 != null)
            {
                kz.kG.removeView(dh1);
            }
            if (kz.kO.ny != null)
            {
                try
                {
                    kz.kO.ny.destroy();
                }
                // Misplaced declaration of an exception variable
                catch (dh dh1)
                {
                    dw.z("Could not destroy previous mediation adapter.");
                }
            }
        }
        kz.kG.setVisibility(0);
        return true;
    }

    private cx.a c(ah ah1)
    {
        ApplicationInfo applicationinfo = kz.kI.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo;
        Object obj;
        try
        {
            packageinfo = kz.kI.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        if (!kz.kN.lT && kz.kG.getParent() != null)
        {
            int ai1[] = new int[2];
            kz.kG.getLocationOnScreen(ai1);
            int j = ai1[0];
            int k = ai1[1];
            obj = kz.kI.getResources().getDisplayMetrics();
            int l = kz.kG.getWidth();
            int i1 = kz.kG.getHeight();
            String s;
            Bundle bundle;
            int i;
            if (kz.kG.isShown() && j + l > 0 && k + i1 > 0 && j <= ((DisplayMetrics) (obj)).widthPixels && k <= ((DisplayMetrics) (obj)).heightPixels)
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
        s = dj.bs();
        kz.kP = new di(s, kz.kH);
        kz.kP.f(ah1);
        bundle = dj.a(this, s);
        return new cx.a(((Bundle) (obj)), ah1, kz.kN, kz.kH, applicationinfo, packageinfo, s, dj.qK, kz.kK, bundle);
    }

    public void P()
    {
        ai();
    }

    public d Q()
    {
        fq.aj("getAdFrame must be called on the main UI thread.");
        return e.h(kz.kG);
    }

    public ak R()
    {
        fq.aj("getAdSize must be called on the main UI thread.");
        return kz.kN;
    }

    public void U()
    {
        ae();
    }

    public void V()
    {
        kB.d(kz.kO);
        if (kz.kN.lT)
        {
            aj();
        }
        kC = false;
        ad();
        kz.kP.bm();
    }

    public void W()
    {
        if (kz.kN.lT)
        {
            b(false);
        }
        kC = true;
        af();
    }

    public void X()
    {
        P();
    }

    public void Y()
    {
        V();
    }

    public void Z()
    {
        U();
    }

    public void a(ak ak1)
    {
        fq.aj("setAdSize must be called on the main UI thread.");
        kz.kN = ak1;
        if (kz.kO != null)
        {
            kz.kO.oj.a(ak1);
        }
        if (kz.kG.getChildCount() > 1)
        {
            kz.kG.removeView(kz.kG.getNextView());
        }
        kz.kG.setMinimumWidth(ak1.widthPixels);
        kz.kG.setMinimumHeight(ak1.heightPixels);
        kz.kG.requestLayout();
    }

    public void a(ao ao1)
    {
        fq.aj("setAdListener must be called on the main UI thread.");
        kz.kL = ao1;
    }

    public void a(ar ar1)
    {
        fq.aj("setAppEventListener must be called on the main UI thread.");
        kz.kQ = ar1;
    }

    public void a(co co1)
    {
        fq.aj("setInAppPurchaseListener must be called on the main UI thread.");
        kz.kR = co1;
    }

    public void a(dh dh1)
    {
        int j;
        boolean flag;
        j = 0;
        kz.kM = null;
        if (dh1.errorCode != -2 && dh1.errorCode != 3)
        {
            dj.b(kz.ak());
        }
        if (dh1.errorCode == -1)
        {
            return;
        }
        if (dh1.pg.extras != null)
        {
            flag = dh1.pg.extras.getBoolean("_noRefresh", false);
        } else
        {
            flag = false;
        }
        if (!kz.kN.lT) goto _L2; else goto _L1
_L1:
        dq.a(dh1.oj);
_L4:
        if (dh1.errorCode == 3 && dh1.qt != null && dh1.qt.ng != null)
        {
            dw.v("Pinging no fill URLs.");
            bo.a(kz.kI, kz.kK.rq, dh1, kz.kH, false, dh1.qt.ng);
        }
        if (dh1.errorCode != -2)
        {
            a(dh1.errorCode);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!flag)
        {
            if (dh1.ni > 0L)
            {
                kA.a(dh1.pg, dh1.ni);
            } else
            if (dh1.qt != null && dh1.qt.ni > 0L)
            {
                kA.a(dh1.pg, dh1.qt.ni);
            } else
            if (!dh1.po && dh1.errorCode == 2)
            {
                kA.d(dh1.pg);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!kz.kN.lT)
        {
            if (!b(dh1))
            {
                a(0);
                return;
            }
            if (kz.kG != null)
            {
                a.a(kz.kG).t(dh1.pt);
            }
        }
        if (kz.kO != null && kz.kO.nA != null)
        {
            kz.kO.nA.a(null);
        }
        if (dh1.nA != null)
        {
            dh1.nA.a(this);
        }
        kB.d(kz.kO);
        kz.kO = dh1;
        if (dh1.qu != null)
        {
            kz.kN = dh1.qu;
        }
        kz.kP.h(dh1.qv);
        kz.kP.i(dh1.qw);
        kz.kP.m(kz.kN.lT);
        kz.kP.n(dh1.po);
        if (!kz.kN.lT)
        {
            b(false);
        }
        if (kz.kS == null)
        {
            kz.kS = new dm(kz.kH);
        }
        int i;
        if (dh1.qt != null)
        {
            i = dh1.qt.nj;
            j = dh1.qt.nk;
        } else
        {
            i = 0;
        }
        kz.kS.a(i, j);
        if (!kz.kN.lT && dh1.oj != null && (dh1.oj.bI().bP() || dh1.qs != null))
        {
            ab ab1 = kB.a(kz.kN, kz.kO);
            if (dh1.oj.bI().bP() && ab1 != null)
            {
                ab1.a(new w(dh1.oj));
            }
        }
        kz.kO.oj.bE();
        ag();
        return;
    }

    public void a(String s, ArrayList arraylist)
    {
        if (kz.kR == null)
        {
            dw.z("InAppPurchaseListener is not set");
            return;
        }
        try
        {
            kz.kR.a(new cm(s, arraylist, kz.kI, kz.kK.rq));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            dw.z("Could not start In-App purchase.");
        }
    }

    public void a(HashSet hashset)
    {
        kz.a(hashset);
    }

    public boolean a(ah ah1)
    {
        fq.aj("loadAd must be called on the main UI thread.");
        if (kz.kM == null) goto _L2; else goto _L1
_L1:
        dw.z("An ad request is already in progress. Aborting.");
_L4:
        return false;
_L2:
        if (kz.kN.lT && kz.kO != null)
        {
            dw.z("An interstitial is already loading. Aborting.");
            return false;
        }
        if (!ah()) goto _L4; else goto _L3
_L3:
        cx.a a1;
        dw.x("Starting ad request.");
        kA.cancel();
        a1 = c(ah1);
        if (!kz.kN.lT) goto _L6; else goto _L5
_L5:
        ah1 = dz.a(kz.kI, kz.kN, false, false, kz.kJ, kz.kK);
        ah1.bI().a(this, null, this, this, true, this);
_L8:
        kz.kM = cr.a(kz.kI, a1, kz.kJ, ah1, ky, this);
        return true;
_L6:
        ah1 = kz.kG.getNextView();
        if (!(ah1 instanceof dz))
        {
            break; /* Loop/switch isn't completed */
        }
        ah1 = (dz)ah1;
        ah1.a(kz.kI, kz.kN);
_L9:
        ah1.bI().a(this, this, this, this, false, this);
        if (true) goto _L8; else goto _L7
_L7:
        if (ah1 != null)
        {
            kz.kG.removeView(ah1);
        }
        dz dz1 = dz.a(kz.kI, kz.kN, false, false, kz.kJ, kz.kK);
        ah1 = dz1;
        if (kz.kN.lU == null)
        {
            b(dz1);
            ah1 = dz1;
        }
          goto _L9
        if (true) goto _L8; else goto _L10
_L10:
    }

    public void aa()
    {
        W();
    }

    public void ab()
    {
        if (kz.kO != null)
        {
            dw.z((new StringBuilder()).append("Mediation adapter ").append(kz.kO.nz).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        b(true);
        ag();
    }

    public void ac()
    {
        fq.aj("recordManualImpression must be called on the main UI thread.");
        if (kz.kO == null)
        {
            dw.z("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            dw.v("Pinging manual tracking URLs.");
            if (kz.kO.pq != null)
            {
                dq.a(kz.kI, kz.kK.rq, kz.kO.pq);
                return;
            }
        }
    }

    public void b(ah ah1)
    {
        android.view.ViewParent viewparent = kz.kG.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && dq.by() && !kC)
        {
            a(ah1);
            return;
        } else
        {
            dw.x("Ad is not visible. Not refreshing ad.");
            kA.d(ah1);
            return;
        }
    }

    public void destroy()
    {
        fq.aj("destroy must be called on the main UI thread.");
        T();
        kz.kL = null;
        kz.kQ = null;
        kA.cancel();
        stopLoading();
        if (kz.kG != null)
        {
            kz.kG.removeAllViews();
        }
        if (kz.kO != null && kz.kO.oj != null)
        {
            kz.kO.oj.destroy();
        }
        if (kz.kO == null || kz.kO.ny == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        kz.kO.ny.destroy();
        return;
        RemoteException remoteexception;
        remoteexception;
        dw.z("Could not destroy mediation adapter.");
        return;
    }

    public boolean isReady()
    {
        fq.aj("isLoaded must be called on the main UI thread.");
        return kz.kM == null && kz.kO != null;
    }

    public void onAppEvent(String s, String s1)
    {
        if (kz.kQ == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        kz.kQ.onAppEvent(s, s1);
        return;
        s;
        dw.c("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        fq.aj("pause must be called on the main UI thread.");
        if (kz.kO != null)
        {
            dq.a(kz.kO.oj);
        }
        if (kz.kO != null && kz.kO.ny != null)
        {
            try
            {
                kz.kO.ny.pause();
            }
            catch (RemoteException remoteexception)
            {
                dw.z("Could not pause mediation adapter.");
            }
        }
        kA.pause();
    }

    public void resume()
    {
        fq.aj("resume must be called on the main UI thread.");
        if (kz.kO != null)
        {
            dq.b(kz.kO.oj);
        }
        if (kz.kO != null && kz.kO.ny != null)
        {
            try
            {
                kz.kO.ny.resume();
            }
            catch (RemoteException remoteexception)
            {
                dw.z("Could not resume mediation adapter.");
            }
        }
        kA.resume();
    }

    public void showInterstitial()
    {
        fq.aj("showInterstitial must be called on the main UI thread.");
        if (!kz.kN.lT)
        {
            dw.z("Cannot call showInterstitial on a banner ad.");
            return;
        }
        if (kz.kO == null)
        {
            dw.z("The interstitial has not loaded.");
            return;
        }
        if (kz.kO.oj.bL())
        {
            dw.z("The interstitial is already showing.");
            return;
        }
        kz.kO.oj.p(true);
        if (kz.kO.oj.bI().bP() || kz.kO.qs != null)
        {
            ab ab1 = kB.a(kz.kN, kz.kO);
            if (kz.kO.oj.bI().bP() && ab1 != null)
            {
                ab1.a(new w(kz.kO.oj));
            }
        }
        if (kz.kO.po)
        {
            try
            {
                kz.kO.ny.showInterstitial();
                return;
            }
            catch (RemoteException remoteexception)
            {
                dw.c("Could not show interstitial.", remoteexception);
            }
            aj();
            return;
        } else
        {
            ce ce1 = new ce(this, this, this, kz.kO.oj, kz.kO.orientation, kz.kK, kz.kO.pt);
            cc.a(kz.kI, ce1);
            return;
        }
    }

    public void stopLoading()
    {
        fq.aj("stopLoading must be called on the main UI thread.");
        if (kz.kO != null)
        {
            kz.kO.oj.stopLoading();
            kz.kO = null;
        }
        if (kz.kM != null)
        {
            kz.kM.cancel();
        }
    }
}
