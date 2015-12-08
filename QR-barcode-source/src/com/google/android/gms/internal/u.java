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
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ViewSwitcher;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            aa, bw, bz, cb, 
//            cn, dn, dq, gd, 
//            t, ae, gj, gb, 
//            ab, ay, ga, gv, 
//            gw, gs, bc, fz, 
//            bo, bt, bp, bu, 
//            cu, gt, cm, cr, 
//            cl, an, ak, ee, 
//            dx, fk, v, er, 
//            et, eu, fd, gm, 
//            co, ge, z, af, 
//            dy, el, dv, dz, 
//            eh, av, gr, fa, 
//            bf, x, dm, dk, 
//            gg, ct, k, w

public class u extends bd.a
    implements aa, bw, bz, cb, cn, dn, dq, fa.a, fd.a, gd, t
{
    private static final class a extends ViewSwitcher
    {

        private final gm ly;

        static gm a(a a1)
        {
            return a1.ly;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            ly.c(motionevent);
            return false;
        }

        public a(Context context)
        {
            super(context);
            ly = new gm(context);
        }
    }

    static class b
    {

        public final String lA;
        public final Context lB;
        public final k lC = new k(new w(this));
        public final gt lD;
        public bc lE;
        public gg lF;
        public gg lG;
        public ay lH;
        public fz lI;
        public fz.a lJ;
        public ga lK;
        public bf lL;
        public el lM;
        public eh lN;
        public et lO;
        public eu lP;
        public bt lQ;
        public bu lR;
        public List lS;
        public ee lT;
        public ge lU;
        public View lV;
        public int lW;
        public boolean lX;
        private HashSet lY;
        public final a lz;

        public void a(HashSet hashset)
        {
            lY = hashset;
        }

        public HashSet au()
        {
            return lY;
        }

        public b(Context context, ay ay1, String s, gt gt1)
        {
            lU = null;
            lV = null;
            lW = 0;
            lX = false;
            lY = null;
            if (ay1.og)
            {
                lz = null;
            } else
            {
                lz = new a(context);
                lz.setMinimumWidth(ay1.widthPixels);
                lz.setMinimumHeight(ay1.heightPixels);
                lz.setVisibility(4);
            }
            lH = ay1;
            lA = s;
            lB = context;
            lD = gt1;
        }
    }


    private av lp;
    private final ct lq;
    private final b lr;
    private final ab ls;
    private final ae lt;
    private boolean lu;
    private final ComponentCallbacks lv;

    public u(Context context, ay ay1, String s, ct ct, gt gt1)
    {
        this(new b(context, ay1, s, gt1), ct, null);
    }

    u(b b1, ct ct, ab ab1)
    {
        lv = new ComponentCallbacks() {

            final u lw;

            public void onConfigurationChanged(Configuration configuration)
            {
                if (u.a(lw) != null && u.a(lw).lI != null && u.a(lw).lI.rN != null)
                {
                    u.a(lw).lI.rN.bS();
                }
            }

            public void onLowMemory()
            {
            }

            
            {
                lw = u.this;
                super();
            }
        };
        lr = b1;
        lq = ct;
        if (ab1 == null)
        {
            ab1 = new ab(this);
        }
        ls = ab1;
        lt = new ae();
        gj.q(lr.lB);
        gb.a(lr.lB, lr.lD);
        Z();
    }

    private void Z()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && lr != null && lr.lB != null)
        {
            lr.lB.registerComponentCallbacks(lv);
        }
    }

    private fi.a a(av av1, Bundle bundle)
    {
        ApplicationInfo applicationinfo = lr.lB.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo;
        Object obj;
        String s;
        Bundle bundle1;
        try
        {
            packageinfo = lr.lB.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        s = null;
        obj = s;
        if (!lr.lH.og)
        {
            obj = s;
            if (lr.lz.getParent() != null)
            {
                obj = new int[2];
                lr.lz.getLocationOnScreen(((int []) (obj)));
                int j = obj[0];
                int k = obj[1];
                obj = lr.lB.getResources().getDisplayMetrics();
                int l = lr.lz.getWidth();
                int i1 = lr.lz.getHeight();
                boolean flag = false;
                int i = ((flag) ? 1 : 0);
                if (lr.lz.isShown())
                {
                    i = ((flag) ? 1 : 0);
                    if (j + l > 0)
                    {
                        i = ((flag) ? 1 : 0);
                        if (k + i1 > 0)
                        {
                            i = ((flag) ? 1 : 0);
                            if (j <= ((DisplayMetrics) (obj)).widthPixels)
                            {
                                i = ((flag) ? 1 : 0);
                                if (k <= ((DisplayMetrics) (obj)).heightPixels)
                                {
                                    i = 1;
                                }
                            }
                        }
                    }
                }
                obj = new Bundle(5);
                ((Bundle) (obj)).putInt("x", j);
                ((Bundle) (obj)).putInt("y", k);
                ((Bundle) (obj)).putInt("width", l);
                ((Bundle) (obj)).putInt("height", i1);
                ((Bundle) (obj)).putInt("visible", i);
            }
        }
        s = gb.cW();
        lr.lK = new ga(s, lr.lA);
        lr.lK.e(av1);
        bundle1 = gb.a(lr.lB, this, s);
        return new fi.a(((Bundle) (obj)), av1, lr.lH, lr.lA, applicationinfo, packageinfo, s, gb.vK, lr.lD, bundle1, lr.lS, bundle, gb.dc());
    }

    private gv a(v v1)
    {
        Object obj;
        if (lr.lH.og)
        {
            gv gv1 = gv.a(lr.lB, lr.lH, false, false, lr.lC, lr.lD);
            gv1.du().a(this, null, this, this, true, this, this, v1);
            return gv1;
        }
        obj = lr.lz.getNextView();
        if (!(obj instanceof gv)) goto _L2; else goto _L1
_L1:
        obj = (gv)obj;
        ((gv) (obj)).a(lr.lB, lr.lH);
_L4:
        ((gv) (obj)).du().a(this, this, this, this, false, this, v1);
        return ((gv) (obj));
_L2:
        if (obj != null)
        {
            lr.lz.removeView(((View) (obj)));
        }
        gv gv2 = gv.a(lr.lB, lr.lH, false, false, lr.lC, lr.lD);
        obj = gv2;
        if (lr.lH.oh == null)
        {
            c(gv2);
            obj = gv2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static b a(u u1)
    {
        return u1.lr;
    }

    private void a(int i)
    {
        gs.W((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (lr.lE == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        lr.lE.onAdFailedToLoad(i);
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gs.d("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void aa()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && lr != null && lr.lB != null)
        {
            lr.lB.unregisterComponentCallbacks(lv);
        }
    }

    private void ak()
    {
        gs.U("Ad closing.");
        if (lr.lE == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lr.lE.onAdClosed();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gs.d("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void al()
    {
        gs.U("Ad leaving application.");
        if (lr.lE == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lr.lE.onAdLeftApplication();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gs.d("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void am()
    {
        gs.U("Ad opening.");
        if (lr.lE == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lr.lE.onAdOpened();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gs.d("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void an()
    {
        gs.U("Ad finished loading.");
        if (lr.lE == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lr.lE.onAdLoaded();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gs.d("Could not call AdListener.onAdLoaded().", remoteexception);
        return;
    }

    private void ao()
    {
        try
        {
            if ((lr.lI.vu instanceof bo) && lr.lQ != null)
            {
                lr.lQ.a((bo)lr.lI.vu);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.gs.d("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
        }
    }

    private void ap()
    {
        try
        {
            if ((lr.lI.vu instanceof bp) && lr.lR != null)
            {
                lr.lR.a((bp)lr.lI.vu);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.gs.d("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
        }
    }

    private void at()
    {
        if (lr.lI != null)
        {
            if (lr.lW == 0)
            {
                lr.lI.rN.destroy();
            }
            lr.lI = null;
            lr.lX = false;
        }
    }

    private boolean b(fz fz1)
    {
        if (fz1.tI)
        {
            View view;
            try
            {
                fz1 = (View)e.f(fz1.qz.getView());
            }
            // Misplaced declaration of an exception variable
            catch (fz fz1)
            {
                com.google.android.gms.internal.gs.d("Could not get View from mediation adapter.", fz1);
                return false;
            }
            view = lr.lz.getNextView();
            if (view != null)
            {
                lr.lz.removeView(view);
            }
            try
            {
                c(fz1);
            }
            // Misplaced declaration of an exception variable
            catch (fz fz1)
            {
                com.google.android.gms.internal.gs.d("Could not add mediation view to view hierarchy.", fz1);
                return false;
            }
        } else
        if (fz1.vr != null)
        {
            fz1.rN.a(fz1.vr);
            lr.lz.removeAllViews();
            lr.lz.setMinimumWidth(fz1.vr.widthPixels);
            lr.lz.setMinimumHeight(fz1.vr.heightPixels);
            c(fz1.rN);
        }
        if (lr.lz.getChildCount() > 1)
        {
            lr.lz.showNext();
        }
        if (lr.lI != null)
        {
            fz1 = lr.lz.getNextView();
            if (fz1 instanceof gv)
            {
                ((gv)fz1).a(lr.lB, lr.lH);
            } else
            if (fz1 != null)
            {
                lr.lz.removeView(fz1);
            }
            if (lr.lI.qz != null)
            {
                try
                {
                    lr.lI.qz.destroy();
                }
                // Misplaced declaration of an exception variable
                catch (fz fz1)
                {
                    gs.W("Could not destroy previous mediation adapter.");
                }
            }
        }
        lr.lz.setVisibility(0);
        return true;
    }

    private void c(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
        lr.lz.addView(view, layoutparams);
    }

    private void c(boolean flag)
    {
        if (lr.lI == null)
        {
            gs.W("Ad state was null when trying to ping impression URLs.");
        } else
        {
            gs.S("Pinging Impression URLs.");
            lr.lK.cO();
            if (lr.lI.qg != null)
            {
                gj.a(lr.lB, lr.lD.wD, lr.lI.qg);
            }
            if (lr.lI.vq != null && lr.lI.vq.qg != null)
            {
                cr.a(lr.lB, lr.lD.wD, lr.lI, lr.lA, flag, lr.lI.vq.qg);
            }
            if (lr.lI.qy != null && lr.lI.qy.qb != null)
            {
                cr.a(lr.lB, lr.lD.wD, lr.lI, lr.lA, flag, lr.lI.qy.qb);
                return;
            }
        }
    }

    public d X()
    {
        o.aT("getAdFrame must be called on the main UI thread.");
        return e.k(lr.lz);
    }

    public ay Y()
    {
        o.aT("getAdSize must be called on the main UI thread.");
        return lr.lH;
    }

    Bundle a(an an1)
    {
        if (an1 != null)
        {
            if (an1.aZ())
            {
                an1.wakeup();
            }
            ak ak1 = an1.aX();
            if (ak1 != null)
            {
                an1 = ak1.aO();
                gs.S((new StringBuilder()).append("In AdManger: loadAd, ").append(ak1.toString()).toString());
            } else
            {
                an1 = null;
            }
            if (an1 != null)
            {
                Bundle bundle = new Bundle(1);
                bundle.putString("fingerprint", an1);
                return bundle;
            }
        }
        return null;
    }

    public void a(ay ay1)
    {
        o.aT("setAdSize must be called on the main UI thread.");
        lr.lH = ay1;
        if (lr.lI != null && lr.lW == 0)
        {
            lr.lI.rN.a(ay1);
        }
        if (lr.lz.getChildCount() > 1)
        {
            lr.lz.removeView(lr.lz.getNextView());
        }
        lr.lz.setMinimumWidth(ay1.widthPixels);
        lr.lz.setMinimumHeight(ay1.heightPixels);
        lr.lz.requestLayout();
    }

    public void a(bc bc1)
    {
        o.aT("setAdListener must be called on the main UI thread.");
        lr.lE = bc1;
    }

    public void a(bf bf1)
    {
        o.aT("setAppEventListener must be called on the main UI thread.");
        lr.lL = bf1;
    }

    public void a(eh eh1)
    {
        o.aT("setInAppPurchaseListener must be called on the main UI thread.");
        lr.lN = eh1;
    }

    public void a(el el1, String s)
    {
        o.aT("setPlayStorePurchaseParams must be called on the main UI thread.");
        lr.lT = new ee(s);
        lr.lM = el1;
        if (!gb.da() && el1 != null)
        {
            (new dx(lr.lB, lr.lM, lr.lT)).start();
        }
    }

    public void a(et et1)
    {
        o.aT("setRawHtmlPublisherAdViewListener must be called on the main UI thread.");
        lr.lO = et1;
    }

    public void a(eu eu1)
    {
        o.aT("setRawHtmlPublisherInterstitialAdListener must be called on the main UI thread.");
        lr.lP = eu1;
    }

    public void a(fz.a a1)
    {
        String s = null;
        lr.lF = null;
        lr.lJ = a1;
        a(((List) (null)));
        gv gv1;
        if (!a1.vw.tS)
        {
            v v1 = new v();
            gv1 = a(v1);
            v1.a(new v.b(a1, gv1));
            gv1.setOnTouchListener(new android.view.View.OnTouchListener(v1) {

                final u lw;
                final v lx;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    lx.ar();
                    return false;
                }

            
            {
                lw = u.this;
                lx = v1;
                super();
            }
            });
            gv1.setOnClickListener(new android.view.View.OnClickListener(v1) {

                final u lw;
                final v lx;

                public void onClick(View view)
                {
                    lx.ar();
                }

            
            {
                lw = u.this;
                lx = v1;
                super();
            }
            });
        } else
        {
            gv1 = null;
        }
        if (a1.lH != null)
        {
            lr.lH = a1.lH;
        }
        if (a1.errorCode != -2)
        {
            a(new fz(a1, gv1, null, null, null, null, null));
            return;
        }
        if (!a1.vw.tI && a1.vw.tR)
        {
            if (a1.vw.rP != null)
            {
                s = Uri.parse(a1.vw.rP).buildUpon().query(null).build().toString();
            }
            er er1 = new er(this, s, a1.vw.tG);
            try
            {
                if (lr.lO != null && !lr.lH.og && lr.lO.e(s, a1.vw.tG))
                {
                    lr.lW = 1;
                    lr.lO.a(er1);
                    return;
                }
            }
            catch (RemoteException remoteexception1)
            {
                com.google.android.gms.internal.gs.d("Could not call the rawHtmlPublisherAdViewListener.", remoteexception1);
            }
            try
            {
                if (lr.lP != null && lr.lH.og && lr.lP.e(s, a1.vw.tG))
                {
                    lr.lW = 1;
                    lr.lP.a(er1);
                    return;
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.internal.gs.d("Could not call the RawHtmlPublisherInterstitialAdListener.", remoteexception);
            }
        }
        lr.lW = 0;
        lr.lG = fd.a(lr.lB, this, a1, gv1, lq, this);
    }

    public void a(fz fz1)
    {
        lr.lG = null;
        boolean flag;
        if (fz1.vu != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (fz1.errorCode != -2 && fz1.errorCode != 3)
        {
            gb.b(lr.au());
        }
        if (fz1.errorCode != -1)
        {
            if (a(fz1, flag))
            {
                gs.S("Ad refresh scheduled.");
            }
            if (fz1.errorCode == 3 && fz1.vq != null && fz1.vq.qh != null)
            {
                gs.S("Pinging no fill URLs.");
                cr.a(lr.lB, lr.lD.wD, fz1, lr.lA, false, fz1.vq.qh);
            }
            if (fz1.errorCode != -2)
            {
                a(fz1.errorCode);
                return;
            }
            if (!lr.lH.og && !flag && lr.lW == 0)
            {
                if (!b(fz1))
                {
                    a(0);
                    return;
                }
                if (lr.lz != null)
                {
                    a.a(lr.lz).Q(fz1.tN);
                }
            }
            if (lr.lI != null && lr.lI.qB != null)
            {
                lr.lI.qB.a(null);
            }
            if (fz1.qB != null)
            {
                fz1.qB.a(this);
            }
            lt.d(lr.lI);
            lr.lI = fz1;
            lr.lK.j(fz1.vs);
            lr.lK.k(fz1.vt);
            lr.lK.t(lr.lH.og);
            lr.lK.u(fz1.tI);
            if (!lr.lH.og && !flag && lr.lW == 0)
            {
                c(false);
            }
            if (lr.lU == null)
            {
                lr.lU = new ge(lr.lA);
            }
            int i;
            int j;
            if (fz1.vq != null)
            {
                j = fz1.vq.qk;
                i = fz1.vq.ql;
            } else
            {
                i = 0;
                j = 0;
            }
            lr.lU.d(j, i);
            if (lr.lW == 0)
            {
                if (!lr.lH.og && fz1.rN != null && (fz1.rN.du().dE() || fz1.vp != null))
                {
                    af af1 = lt.a(lr.lH, lr.lI);
                    if (fz1.rN.du().dE() && af1 != null)
                    {
                        af1.a(new z(fz1.rN));
                    }
                }
                if (lr.lI.rN != null)
                {
                    lr.lI.rN.bS();
                    lr.lI.rN.du().dF();
                }
                if (flag)
                {
                    fz1 = fz1.vu;
                    if ((fz1 instanceof bp) && lr.lR != null)
                    {
                        ap();
                    } else
                    if ((fz1 instanceof bo) && lr.lQ != null)
                    {
                        ao();
                    } else
                    {
                        gs.W("No matching listener for retrieved native ad template.");
                        a(0);
                        return;
                    }
                }
                an();
                return;
            }
            if (lr.lV != null && fz1.vp != null)
            {
                lt.a(lr.lB, lr.lH, lr.lI, lr.lV, lr.lD);
                return;
            }
        }
    }

    public void a(String s, ArrayList arraylist)
    {
        arraylist = new dy(s, arraylist, lr.lB, lr.lD.wD);
        if (lr.lN != null) goto _L2; else goto _L1
_L1:
        gs.W("InAppPurchaseListener is not set. Try to launch default purchase flow.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(lr.lB) == 0) goto _L4; else goto _L3
_L3:
        gs.W("Google Play Service unavailable, cannot launch default purchase flow.");
_L6:
        return;
_L4:
        if (lr.lM == null)
        {
            gs.W("PlayStorePurchaseListener is not set.");
            return;
        }
        if (lr.lT == null)
        {
            gs.W("PlayStorePurchaseVerifier is not initialized.");
            return;
        }
        boolean flag = lr.lM.isValidPurchase(s);
        if (!flag) goto _L6; else goto _L5
_L5:
        dz.a(lr.lB, lr.lD.wG, new dv(arraylist, lr.lM, lr.lT, lr.lB));
        return;
        s;
        gs.W("Could not start In-App purchase.");
        if (true) goto _L5; else goto _L2
_L2:
        try
        {
            lr.lN.a(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.W("Could not start In-App purchase.");
        }
        return;
    }

    public void a(HashSet hashset)
    {
        lr.a(hashset);
    }

    public void a(List list)
    {
        o.aT("setNativeTemplates must be called on the main UI thread.");
        lr.lS = list;
    }

    public boolean a(av av1)
    {
        o.aT("loadAd must be called on the main UI thread.");
        if (lr.lF != null || lr.lG != null)
        {
            if (lp != null)
            {
                gs.W("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            lp = av1;
        } else
        {
            if (lr.lH.og && lr.lI != null)
            {
                gs.W("An interstitial is already loading. Aborting.");
                return false;
            }
            if (aq())
            {
                gs.U("Starting ad request.");
                if (!av1.nW)
                {
                    gs.U((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(gr.v(lr.lB)).append("\") to get test ads on this device.").toString());
                }
                Bundle bundle = a(gb.cU().l(lr.lB));
                ls.cancel();
                lr.lW = 0;
                av1 = a(av1, bundle);
                lr.lF = fa.a(lr.lB, av1, lr.lC, this);
                return true;
            }
        }
        return false;
    }

    boolean a(fz fz1, boolean flag)
    {
        boolean flag1 = false;
        av av1;
        if (lp != null)
        {
            av1 = lp;
            lp = null;
        } else
        {
            av av2 = fz1.tx;
            av1 = av2;
            if (av2.extras != null)
            {
                flag1 = av2.extras.getBoolean("_noRefresh", false);
                av1 = av2;
            }
        }
        if (lr.lH.og)
        {
            if (lr.lW == 0)
            {
                gj.a(fz1.rN);
            }
        } else
        if (!(flag1 | flag) && lr.lW == 0)
        {
            if (fz1.qj > 0L)
            {
                ls.a(av1, fz1.qj);
            } else
            if (fz1.vq != null && fz1.vq.qj > 0L)
            {
                ls.a(av1, fz1.vq.qj);
            } else
            if (!fz1.tI && fz1.errorCode == 2)
            {
                ls.c(av1);
            }
        }
        return ls.ay();
    }

    public void ab()
    {
        al();
    }

    public void ac()
    {
        lt.d(lr.lI);
        if (lr.lH.og)
        {
            at();
        }
        lu = false;
        ak();
        lr.lK.cQ();
    }

    public void ad()
    {
        if (lr.lH.og)
        {
            c(false);
        }
        lu = true;
        am();
    }

    public void ae()
    {
        onAdClicked();
    }

    public void af()
    {
        ac();
    }

    public void ag()
    {
        ab();
    }

    public void ah()
    {
        ad();
    }

    public void ai()
    {
        if (lr.lI != null)
        {
            gs.W((new StringBuilder()).append("Mediation adapter ").append(lr.lI.qA).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        c(true);
        an();
    }

    public void aj()
    {
        o.aT("recordManualImpression must be called on the main UI thread.");
        if (lr.lI == null)
        {
            gs.W("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            gs.S("Pinging manual tracking URLs.");
            if (lr.lI.tK != null)
            {
                gj.a(lr.lB, lr.lD.wD, lr.lI.tK);
                return;
            }
        }
    }

    public boolean aq()
    {
        boolean flag = true;
        if (!gj.a(lr.lB.getPackageManager(), lr.lB.getPackageName(), "android.permission.INTERNET"))
        {
            if (!lr.lH.og)
            {
                gr.a(lr.lz, lr.lH, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        }
        if (!gj.p(lr.lB))
        {
            if (!lr.lH.og)
            {
                gr.a(lr.lz, lr.lH, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && !lr.lH.og)
        {
            lr.lz.setVisibility(0);
        }
        return flag;
    }

    public void ar()
    {
        if (lr.lI == null)
        {
            gs.W("Ad state was null when trying to ping click URLs.");
        } else
        {
            gs.S("Pinging click URLs.");
            lr.lK.cP();
            if (lr.lI.qf != null)
            {
                gj.a(lr.lB, lr.lD.wD, lr.lI.qf);
            }
            if (lr.lI.vq != null && lr.lI.vq.qf != null)
            {
                cr.a(lr.lB, lr.lD.wD, lr.lI, lr.lA, false, lr.lI.vq.qf);
                return;
            }
        }
    }

    public void as()
    {
        c(false);
    }

    public void b(View view)
    {
        lr.lV = view;
        a(new fz(lr.lJ, null, null, null, null, null, null));
    }

    public void b(av av1)
    {
        android.view.ViewParent viewparent = lr.lz.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && gj.dk() && !lu)
        {
            a(av1);
            return;
        } else
        {
            gs.U("Ad is not visible. Not refreshing ad.");
            ls.c(av1);
            return;
        }
    }

    public void b(boolean flag)
    {
        lr.lX = flag;
    }

    public void destroy()
    {
        o.aT("destroy must be called on the main UI thread.");
        aa();
        lr.lE = null;
        lr.lL = null;
        lr.lM = null;
        lr.lN = null;
        lr.lO = null;
        lr.lP = null;
        ls.cancel();
        lt.stop();
        stopLoading();
        if (lr.lz != null)
        {
            lr.lz.removeAllViews();
        }
        if (lr.lI != null && lr.lI.rN != null)
        {
            lr.lI.rN.destroy();
        }
        if (lr.lI == null || lr.lI.qz == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        lr.lI.qz.destroy();
        return;
        RemoteException remoteexception;
        remoteexception;
        gs.W("Could not destroy mediation adapter.");
        return;
    }

    public String getMediationAdapterClassName()
    {
        if (lr.lI != null)
        {
            return lr.lI.qA;
        } else
        {
            return null;
        }
    }

    public boolean isReady()
    {
        o.aT("isLoaded must be called on the main UI thread.");
        return lr.lF == null && lr.lG == null && lr.lI != null;
    }

    public void onAdClicked()
    {
        ar();
    }

    public void onAppEvent(String s, String s1)
    {
        if (lr.lL == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        lr.lL.onAppEvent(s, s1);
        return;
        s;
        com.google.android.gms.internal.gs.d("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        o.aT("pause must be called on the main UI thread.");
        if (lr.lI != null && lr.lW == 0)
        {
            gj.a(lr.lI.rN);
        }
        if (lr.lI != null && lr.lI.qz != null)
        {
            try
            {
                lr.lI.qz.pause();
            }
            catch (RemoteException remoteexception)
            {
                gs.W("Could not pause mediation adapter.");
            }
        }
        lt.pause();
        ls.pause();
    }

    public void resume()
    {
        o.aT("resume must be called on the main UI thread.");
        if (lr.lI != null && lr.lW == 0)
        {
            gj.b(lr.lI.rN);
        }
        if (lr.lI != null && lr.lI.qz != null)
        {
            try
            {
                lr.lI.qz.resume();
            }
            catch (RemoteException remoteexception)
            {
                gs.W("Could not resume mediation adapter.");
            }
        }
        ls.resume();
        lt.resume();
    }

    public void showInterstitial()
    {
        o.aT("showInterstitial must be called on the main UI thread.");
        if (!lr.lH.og)
        {
            gs.W("Cannot call showInterstitial on a banner ad.");
        } else
        {
            if (lr.lI == null)
            {
                gs.W("The interstitial has not loaded.");
                return;
            }
            if (lr.lW != 1)
            {
                if (lr.lI.rN.dy())
                {
                    gs.W("The interstitial is already showing.");
                    return;
                }
                lr.lI.rN.x(true);
                if (lr.lI.rN.du().dE() || lr.lI.vp != null)
                {
                    af af1 = lt.a(lr.lH, lr.lI);
                    if (lr.lI.rN.du().dE() && af1 != null)
                    {
                        af1.a(new z(lr.lI.rN));
                    }
                }
                if (lr.lI.tI)
                {
                    try
                    {
                        lr.lI.qz.showInterstitial();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        com.google.android.gms.internal.gs.d("Could not show interstitial.", remoteexception);
                    }
                    at();
                    return;
                }
                x x1 = new x(lr.lX, false);
                Object obj = x1;
                if (lr.lB instanceof Activity)
                {
                    obj = ((Activity)lr.lB).getWindow();
                    Rect rect = new Rect();
                    Rect rect1 = new Rect();
                    ((Window) (obj)).getDecorView().getGlobalVisibleRect(rect);
                    ((Window) (obj)).getDecorView().getWindowVisibleDisplayFrame(rect1);
                    obj = x1;
                    if (rect.bottom != 0)
                    {
                        obj = x1;
                        if (rect1.bottom != 0)
                        {
                            boolean flag1 = lr.lX;
                            boolean flag;
                            if (rect.top == rect1.top)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            obj = new x(flag1, flag);
                        }
                    }
                }
                obj = new dm(this, this, this, lr.lI.rN, lr.lI.orientation, lr.lD, lr.lI.tN, ((x) (obj)));
                dk.a(lr.lB, ((dm) (obj)));
                return;
            }
        }
    }

    public void stopLoading()
    {
        o.aT("stopLoading must be called on the main UI thread.");
        if (lr.lI != null && lr.lW == 0)
        {
            lr.lI.rN.stopLoading();
            lr.lI = null;
        }
        if (lr.lF != null)
        {
            lr.lF.cancel();
        }
        if (lr.lG != null)
        {
            lr.lG.cancel();
        }
    }
}
