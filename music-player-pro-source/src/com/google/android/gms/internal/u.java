// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
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
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            cb, ce, cg, cs, 
//            ds, dv, ej, gc, 
//            t, w, ae, gi, 
//            ga, ab, ay, fz, 
//            gu, gv, gr, bc, 
//            fy, bt, by, bu, 
//            bz, cz, gs, cr, 
//            cw, cq, an, ak, 
//            jx, ek, ec, fj, 
//            v, bo, br, fc, 
//            gl, ct, gd, aa, 
//            af, ed, er, ea, 
//            ee, en, eg, gq, 
//            av, ez, bf, y, 
//            dr, dp, gf, cy, 
//            ef, k, x, ei

public class u extends bd.a
    implements cb, ce, cg, cs, ds, dv, ej, ez.a, fc.a, gc, t, w
{
    private static final class a extends ViewSwitcher
    {

        private final gl lJ;

        static gl a(a a1)
        {
            return a1.lJ;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            lJ.c(motionevent);
            return false;
        }

        public a(Context context)
        {
            super(context);
            lJ = new gl(context);
        }
    }

    static class b
    {

        public final a lK;
        public final String lL;
        public final Context lM;
        public final k lN = new k(new x(this));
        public final gs lO;
        public bc lP;
        public gf lQ;
        public gf lR;
        public ay lS;
        public fy lT;
        public fy.a lU;
        public fz lV;
        public bf lW;
        public er lX;
        public en lY;
        public by lZ;
        public bz ma;
        public br mb;
        public List mc;
        public ek md;
        public gd me;
        public View mf;
        public int mg;
        public boolean mh;
        public boolean mi;
        private HashSet mj;

        public void a(HashSet hashset)
        {
            mj = hashset;
        }

        public HashSet ay()
        {
            return mj;
        }

        public b(Context context, ay ay1, String s, gs gs1)
        {
            me = null;
            mf = null;
            mg = 0;
            mh = false;
            mi = false;
            mj = null;
            if (ay1.oq)
            {
                lK = null;
            } else
            {
                lK = new a(context);
                lK.setMinimumWidth(ay1.widthPixels);
                lK.setMinimumHeight(ay1.heightPixels);
                lK.setVisibility(4);
            }
            lS = ay1;
            lL = s;
            lM = context;
            lO = gs1;
        }
    }


    private final cy lA;
    private final b lB;
    private final ab lC;
    private final ae lD;
    private boolean lE;
    private final ComponentCallbacks lF;
    private av lz;

    public u(Context context, ay ay1, String s, cy cy, gs gs1)
    {
        this(new b(context, ay1, s, gs1), cy, null);
    }

    u(b b1, cy cy, ab ab1)
    {
        lF = new ComponentCallbacks() {

            final u lG;

            public void onConfigurationChanged(Configuration configuration)
            {
                if (u.a(lG) != null && u.a(lG).lT != null && u.a(lG).lT.se != null)
                {
                    u.a(lG).lT.se.cb();
                }
            }

            public void onLowMemory()
            {
            }

            
            {
                lG = u.this;
                super();
            }
        };
        lB = b1;
        lA = cy;
        if (ab1 == null)
        {
            ab1 = new ab(this);
        }
        lC = ab1;
        lD = new ae();
        gi.q(lB.lM);
        ga.a(lB.lM, lB.lO);
        ad();
    }

    private fh.a a(av av1, Bundle bundle)
    {
        ApplicationInfo applicationinfo = lB.lM.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo;
        Object obj;
        String s;
        Bundle bundle1;
        try
        {
            packageinfo = lB.lM.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        s = null;
        obj = s;
        if (!lB.lS.oq)
        {
            obj = s;
            if (lB.lK.getParent() != null)
            {
                obj = new int[2];
                lB.lK.getLocationOnScreen(((int []) (obj)));
                int j = obj[0];
                int k = obj[1];
                obj = lB.lM.getResources().getDisplayMetrics();
                int l = lB.lK.getWidth();
                int i1 = lB.lK.getHeight();
                boolean flag = false;
                int i = ((flag) ? 1 : 0);
                if (lB.lK.isShown())
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
        s = ga.df();
        lB.lV = new fz(s, lB.lL);
        lB.lV.e(av1);
        bundle1 = ga.a(lB.lM, this, s);
        return new fh.a(((Bundle) (obj)), av1, lB.lS, lB.lL, applicationinfo, packageinfo, s, ga.vY, lB.lO, bundle1, lB.mc, bundle, ga.dl());
    }

    private gu a(v v1)
    {
        Object obj;
        if (lB.lS.oq)
        {
            gu gu1 = gu.a(lB.lM, lB.lS, false, false, lB.lN, lB.lO);
            gu1.dD().a(this, null, this, this, true, this, this, v1);
            return gu1;
        }
        obj = lB.lK.getNextView();
        if (!(obj instanceof gu)) goto _L2; else goto _L1
_L1:
        obj = (gu)obj;
        ((gu) (obj)).a(lB.lM, lB.lS);
_L4:
        ((gu) (obj)).dD().a(this, this, this, this, false, this, v1);
        return ((gu) (obj));
_L2:
        if (obj != null)
        {
            lB.lK.removeView(((View) (obj)));
        }
        gu gu2 = gu.a(lB.lM, lB.lS, false, false, lB.lN, lB.lO);
        obj = gu2;
        if (lB.lS.or == null)
        {
            c(gu2);
            obj = gu2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static b a(u u1)
    {
        return u1.lB;
    }

    private void a(int i)
    {
        gr.W((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (lB.lP == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        lB.lP.onAdFailedToLoad(i);
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gr.d("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void ad()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && lB != null && lB.lM != null)
        {
            lB.lM.registerComponentCallbacks(lF);
        }
    }

    private void ae()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && lB != null && lB.lM != null)
        {
            lB.lM.unregisterComponentCallbacks(lF);
        }
    }

    private void ao()
    {
        gr.U("Ad closing.");
        if (lB.lP == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lB.lP.onAdClosed();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gr.d("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void ap()
    {
        gr.U("Ad leaving application.");
        if (lB.lP == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lB.lP.onAdLeftApplication();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gr.d("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void aq()
    {
        gr.U("Ad opening.");
        if (lB.lP == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lB.lP.onAdOpened();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gr.d("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void ar()
    {
        gr.U("Ad finished loading.");
        if (lB.lP == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lB.lP.onAdLoaded();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.gr.d("Could not call AdListener.onAdLoaded().", remoteexception);
        return;
    }

    private void as()
    {
        try
        {
            if ((lB.lT.vI instanceof bt) && lB.lZ != null)
            {
                lB.lZ.a((bt)lB.lT.vI);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.gr.d("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
        }
    }

    private void at()
    {
        try
        {
            if ((lB.lT.vI instanceof bu) && lB.ma != null)
            {
                lB.ma.a((bu)lB.lT.vI);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.gr.d("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
        }
    }

    private void ax()
    {
        if (lB.lT != null)
        {
            if (lB.mg == 0)
            {
                lB.lT.se.destroy();
            }
            lB.lT = null;
            lB.mi = false;
        }
    }

    private boolean b(fy fy1)
    {
        if (fy1.tW)
        {
            View view;
            try
            {
                fy1 = (View)com.google.android.gms.dynamic.e.f(fy1.qQ.getView());
            }
            // Misplaced declaration of an exception variable
            catch (fy fy1)
            {
                com.google.android.gms.internal.gr.d("Could not get View from mediation adapter.", fy1);
                return false;
            }
            view = lB.lK.getNextView();
            if (view != null)
            {
                lB.lK.removeView(view);
            }
            try
            {
                c(fy1);
            }
            // Misplaced declaration of an exception variable
            catch (fy fy1)
            {
                com.google.android.gms.internal.gr.d("Could not add mediation view to view hierarchy.", fy1);
                return false;
            }
        } else
        if (fy1.vF != null)
        {
            fy1.se.a(fy1.vF);
            lB.lK.removeAllViews();
            lB.lK.setMinimumWidth(fy1.vF.widthPixels);
            lB.lK.setMinimumHeight(fy1.vF.heightPixels);
            c(fy1.se);
        }
        if (lB.lK.getChildCount() > 1)
        {
            lB.lK.showNext();
        }
        if (lB.lT != null)
        {
            fy1 = lB.lK.getNextView();
            if (fy1 instanceof gu)
            {
                ((gu)fy1).a(lB.lM, lB.lS);
            } else
            if (fy1 != null)
            {
                lB.lK.removeView(fy1);
            }
            if (lB.lT.qQ != null)
            {
                try
                {
                    lB.lT.qQ.destroy();
                }
                // Misplaced declaration of an exception variable
                catch (fy fy1)
                {
                    gr.W("Could not destroy previous mediation adapter.");
                }
            }
        }
        lB.lK.setVisibility(0);
        return true;
    }

    private void c(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
        lB.lK.addView(view, layoutparams);
    }

    private void e(boolean flag)
    {
        if (lB.lT == null)
        {
            gr.W("Ad state was null when trying to ping impression URLs.");
        } else
        {
            gr.S("Pinging Impression URLs.");
            lB.lV.cW();
            if (lB.lT.qx != null)
            {
                gi.a(lB.lM, lB.lO.wS, lB.lT.qx);
            }
            if (lB.lT.vE != null && lB.lT.vE.qx != null)
            {
                cw.a(lB.lM, lB.lO.wS, lB.lT, lB.lL, flag, lB.lT.vE.qx);
            }
            if (lB.lT.qP != null && lB.lT.qP.qs != null)
            {
                cw.a(lB.lM, lB.lO.wS, lB.lT, lB.lL, flag, lB.lT.qP.qs);
                return;
            }
        }
    }

    Bundle a(an an1)
    {
        if (an1 != null)
        {
            if (an1.be())
            {
                an1.wakeup();
            }
            ak ak1 = an1.bc();
            if (ak1 != null)
            {
                an1 = ak1.aT();
                gr.S((new StringBuilder()).append("In AdManger: loadAd, ").append(ak1.toString()).toString());
            } else
            {
                an1 = null;
            }
            if (an1 != null)
            {
                Bundle bundle = new Bundle(1);
                bundle.putString("fingerprint", an1);
                bundle.putInt("v", 1);
                return bundle;
            }
        }
        return null;
    }

    public void a(ay ay1)
    {
        jx.aU("setAdSize must be called on the main UI thread.");
        lB.lS = ay1;
        if (lB.lT != null && lB.mg == 0)
        {
            lB.lT.se.a(ay1);
        }
        if (lB.lK.getChildCount() > 1)
        {
            lB.lK.removeView(lB.lK.getNextView());
        }
        lB.lK.setMinimumWidth(ay1.widthPixels);
        lB.lK.setMinimumHeight(ay1.heightPixels);
        lB.lK.requestLayout();
    }

    public void a(bc bc1)
    {
        jx.aU("setAdListener must be called on the main UI thread.");
        lB.lP = bc1;
    }

    public void a(bf bf1)
    {
        jx.aU("setAppEventListener must be called on the main UI thread.");
        lB.lW = bf1;
    }

    public void a(br br1)
    {
        jx.aU("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        lB.mb = br1;
    }

    public void a(en en1)
    {
        jx.aU("setInAppPurchaseListener must be called on the main UI thread.");
        lB.lY = en1;
    }

    public void a(er er1, String s)
    {
        jx.aU("setPlayStorePurchaseParams must be called on the main UI thread.");
        lB.md = new ek(s);
        lB.lX = er1;
        if (!ga.dj() && er1 != null)
        {
            (new ec(lB.lM, lB.lX, lB.md)).start();
        }
    }

    public void a(fy.a a1)
    {
        Object obj = null;
        lB.lQ = null;
        lB.lU = a1;
        a(((List) (null)));
        gu gu1;
        if (!a1.vK.ug)
        {
            v v1 = new v();
            gu1 = a(v1);
            v1.a(new v.b(a1, gu1));
            gu1.setOnTouchListener(new android.view.View.OnTouchListener(v1) {

                final u lG;
                final v lH;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    lH.av();
                    return false;
                }

            
            {
                lG = u.this;
                lH = v1;
                super();
            }
            });
            gu1.setOnClickListener(new android.view.View.OnClickListener(v1) {

                final u lG;
                final v lH;

                public void onClick(View view)
                {
                    lH.av();
                }

            
            {
                lG = u.this;
                lH = v1;
                super();
            }
            });
        } else
        {
            gu1 = null;
        }
        if (a1.lS != null)
        {
            lB.lS = a1.lS;
        }
        if (a1.errorCode != -2)
        {
            a(new fy(a1, gu1, null, null, null, null, null));
            return;
        }
        if (!a1.vK.tW && a1.vK.uf)
        {
            if (a1.vK.sg != null)
            {
                obj = Uri.parse(a1.vK.sg).buildUpon().query(null).build().toString();
            }
            obj = new bo(this, ((String) (obj)), a1.vK.tU);
            try
            {
                if (lB.mb != null)
                {
                    lB.mg = 1;
                    lB.mb.a(((bq) (obj)));
                    return;
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.internal.gr.d("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
            }
        }
        lB.mg = 0;
        lB.lR = fc.a(lB.lM, this, a1, gu1, lA, this);
    }

    public void a(fy fy1)
    {
        lB.lR = null;
        boolean flag;
        if (fy1.vI != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (fy1.errorCode != -2 && fy1.errorCode != 3)
        {
            ga.b(lB.ay());
        }
        if (fy1.errorCode != -1)
        {
            if (a(fy1, flag))
            {
                gr.S("Ad refresh scheduled.");
            }
            if (fy1.errorCode == 3 && fy1.vE != null && fy1.vE.qy != null)
            {
                gr.S("Pinging no fill URLs.");
                cw.a(lB.lM, lB.lO.wS, fy1, lB.lL, false, fy1.vE.qy);
            }
            if (fy1.errorCode != -2)
            {
                a(fy1.errorCode);
                return;
            }
            if (!lB.lS.oq && !flag && lB.mg == 0)
            {
                if (!b(fy1))
                {
                    a(0);
                    return;
                }
                if (lB.lK != null)
                {
                    a.a(lB.lK).Q(fy1.ub);
                }
            }
            if (lB.lT != null && lB.lT.qS != null)
            {
                lB.lT.qS.a(null);
            }
            if (fy1.qS != null)
            {
                fy1.qS.a(this);
            }
            lD.d(lB.lT);
            lB.lT = fy1;
            lB.lV.j(fy1.vG);
            lB.lV.k(fy1.vH);
            lB.lV.v(lB.lS.oq);
            lB.lV.w(fy1.tW);
            if (!lB.lS.oq && !flag && lB.mg == 0)
            {
                e(false);
            }
            if (lB.me == null)
            {
                lB.me = new gd(lB.lL);
            }
            int i;
            int j;
            if (fy1.vE != null)
            {
                j = fy1.vE.qB;
                i = fy1.vE.qC;
            } else
            {
                i = 0;
                j = 0;
            }
            lB.me.d(j, i);
            if (lB.mg == 0)
            {
                if (!lB.lS.oq && fy1.se != null && (fy1.se.dD().dN() || fy1.vD != null))
                {
                    af af1 = lD.a(lB.lS, lB.lT);
                    if (fy1.se.dD().dN() && af1 != null)
                    {
                        af1.a(new aa(fy1.se));
                    }
                }
                if (lB.lT.se != null)
                {
                    lB.lT.se.cb();
                    lB.lT.se.dD().dO();
                }
                if (flag)
                {
                    fy1 = fy1.vI;
                    if ((fy1 instanceof bu) && lB.ma != null)
                    {
                        at();
                    } else
                    if ((fy1 instanceof bt) && lB.lZ != null)
                    {
                        as();
                    } else
                    {
                        gr.W("No matching listener for retrieved native ad template.");
                        a(0);
                        return;
                    }
                }
                ar();
                return;
            }
            if (lB.mf != null && fy1.vD != null)
            {
                lD.a(lB.lM, lB.lS, lB.lT, lB.mf, lB.lO);
                return;
            }
        }
    }

    public void a(String s, ArrayList arraylist)
    {
        arraylist = new ed(s, arraylist, lB.lM, lB.lO.wS);
        if (lB.lY == null)
        {
            gr.W("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(lB.lM) != 0)
            {
                gr.W("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (lB.lX == null)
            {
                gr.W("PlayStorePurchaseListener is not set.");
                return;
            }
            if (lB.md == null)
            {
                gr.W("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (lB.mh)
            {
                gr.W("An in-app purchase request is already in progress, abort");
                return;
            }
            lB.mh = true;
            try
            {
                if (!lB.lX.isValidPurchase(s))
                {
                    lB.mh = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                gr.W("Could not start In-App purchase.");
                lB.mh = false;
                return;
            }
            ee.a(lB.lM, lB.lO.wV, new ea(lB.lM, lB.md, arraylist, this));
            return;
        }
        try
        {
            lB.lY.a(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gr.W("Could not start In-App purchase.");
        }
    }

    public void a(String s, boolean flag, int i, Intent intent, ef ef)
    {
        try
        {
            if (lB.lX != null)
            {
                lB.lX.a(new eg(lB.lM, s, flag, i, intent, ef));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gr.W("Fail to invoke PlayStorePurchaseListener.");
        }
        gq.wR.postDelayed(new Runnable(intent) {

            final u lG;
            final Intent lI;

            public void run()
            {
                if (com.google.android.gms.internal.ei.d(lI) == 0 && u.a(lG).lT != null && u.a(lG).lT.se != null && u.a(lG).lT.se.dC() != null)
                {
                    u.a(lG).lT.se.dC().close();
                }
                u.a(lG).mh = false;
            }

            
            {
                lG = u.this;
                lI = intent;
                super();
            }
        }, 500L);
    }

    public void a(HashSet hashset)
    {
        lB.a(hashset);
    }

    public void a(List list)
    {
        jx.aU("setNativeTemplates must be called on the main UI thread.");
        lB.mc = list;
    }

    public boolean a(av av1)
    {
        jx.aU("loadAd must be called on the main UI thread.");
        if (lB.lQ != null || lB.lR != null)
        {
            if (lz != null)
            {
                gr.W("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            lz = av1;
        } else
        {
            if (lB.lS.oq && lB.lT != null)
            {
                gr.W("An interstitial is already loading. Aborting.");
                return false;
            }
            if (au())
            {
                gr.U("Starting ad request.");
                if (!av1.og)
                {
                    gr.U((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(gq.v(lB.lM)).append("\") to get test ads on this device.").toString());
                }
                Bundle bundle = a(ga.dc().l(lB.lM));
                lC.cancel();
                lB.mg = 0;
                av1 = a(av1, bundle);
                lB.lQ = ez.a(lB.lM, av1, lB.lN, this);
                return true;
            }
        }
        return false;
    }

    boolean a(fy fy1, boolean flag)
    {
        boolean flag1 = false;
        av av1;
        if (lz != null)
        {
            av1 = lz;
            lz = null;
        } else
        {
            av av2 = fy1.tL;
            av1 = av2;
            if (av2.extras != null)
            {
                flag1 = av2.extras.getBoolean("_noRefresh", false);
                av1 = av2;
            }
        }
        if (lB.lS.oq)
        {
            if (lB.mg == 0)
            {
                gi.a(fy1.se);
            }
        } else
        if (!(flag1 | flag) && lB.mg == 0)
        {
            if (fy1.qA > 0L)
            {
                lC.a(av1, fy1.qA);
            } else
            if (fy1.vE != null && fy1.vE.qA > 0L)
            {
                lC.a(av1, fy1.vE.qA);
            } else
            if (!fy1.tW && fy1.errorCode == 2)
            {
                lC.c(av1);
            }
        }
        return lC.aD();
    }

    public d ab()
    {
        jx.aU("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.e.k(lB.lK);
    }

    public ay ac()
    {
        jx.aU("getAdSize must be called on the main UI thread.");
        return lB.lS;
    }

    public void af()
    {
        ap();
    }

    public void ag()
    {
        lD.d(lB.lT);
        if (lB.lS.oq)
        {
            ax();
        }
        lE = false;
        ao();
        lB.lV.cY();
    }

    public void ah()
    {
        if (lB.lS.oq)
        {
            e(false);
        }
        lE = true;
        aq();
    }

    public void ai()
    {
        onAdClicked();
    }

    public void aj()
    {
        ag();
    }

    public void ak()
    {
        af();
    }

    public void al()
    {
        ah();
    }

    public void am()
    {
        if (lB.lT != null)
        {
            gr.W((new StringBuilder()).append("Mediation adapter ").append(lB.lT.qR).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        e(true);
        ar();
    }

    public void an()
    {
        jx.aU("recordManualImpression must be called on the main UI thread.");
        if (lB.lT == null)
        {
            gr.W("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            gr.S("Pinging manual tracking URLs.");
            if (lB.lT.tY != null)
            {
                gi.a(lB.lM, lB.lO.wS, lB.lT.tY);
                return;
            }
        }
    }

    public boolean au()
    {
        boolean flag = true;
        if (!gi.a(lB.lM.getPackageManager(), lB.lM.getPackageName(), "android.permission.INTERNET"))
        {
            if (!lB.lS.oq)
            {
                gq.a(lB.lK, lB.lS, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        }
        if (!gi.p(lB.lM))
        {
            if (!lB.lS.oq)
            {
                gq.a(lB.lK, lB.lS, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && !lB.lS.oq)
        {
            lB.lK.setVisibility(0);
        }
        return flag;
    }

    public void av()
    {
        if (lB.lT == null)
        {
            gr.W("Ad state was null when trying to ping click URLs.");
        } else
        {
            gr.S("Pinging click URLs.");
            lB.lV.cX();
            if (lB.lT.qw != null)
            {
                gi.a(lB.lM, lB.lO.wS, lB.lT.qw);
            }
            if (lB.lT.vE != null && lB.lT.vE.qw != null)
            {
                cw.a(lB.lM, lB.lO.wS, lB.lT, lB.lL, false, lB.lT.vE.qw);
                return;
            }
        }
    }

    public void aw()
    {
        e(false);
    }

    public void b(View view)
    {
        lB.mf = view;
        a(new fy(lB.lU, null, null, null, null, null, null));
    }

    public void b(av av1)
    {
        android.view.ViewParent viewparent = lB.lK.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && gi.dt() && !lE)
        {
            a(av1);
            return;
        } else
        {
            gr.U("Ad is not visible. Not refreshing ad.");
            lC.c(av1);
            return;
        }
    }

    public void d(boolean flag)
    {
        lB.mi = flag;
    }

    public void destroy()
    {
        jx.aU("destroy must be called on the main UI thread.");
        ae();
        lB.lP = null;
        lB.lW = null;
        lB.lX = null;
        lB.lY = null;
        lB.mb = null;
        lC.cancel();
        lD.stop();
        stopLoading();
        if (lB.lK != null)
        {
            lB.lK.removeAllViews();
        }
        if (lB.lT != null && lB.lT.se != null)
        {
            lB.lT.se.destroy();
        }
        if (lB.lT == null || lB.lT.qQ == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        lB.lT.qQ.destroy();
        return;
        RemoteException remoteexception;
        remoteexception;
        gr.W("Could not destroy mediation adapter.");
        return;
    }

    public String getMediationAdapterClassName()
    {
        if (lB.lT != null)
        {
            return lB.lT.qR;
        } else
        {
            return null;
        }
    }

    public boolean isReady()
    {
        jx.aU("isLoaded must be called on the main UI thread.");
        return lB.lQ == null && lB.lR == null && lB.lT != null;
    }

    public void onAdClicked()
    {
        av();
    }

    public void onAppEvent(String s, String s1)
    {
        if (lB.lW == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        lB.lW.onAppEvent(s, s1);
        return;
        s;
        com.google.android.gms.internal.gr.d("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        jx.aU("pause must be called on the main UI thread.");
        if (lB.lT != null && lB.mg == 0)
        {
            gi.a(lB.lT.se);
        }
        if (lB.lT != null && lB.lT.qQ != null)
        {
            try
            {
                lB.lT.qQ.pause();
            }
            catch (RemoteException remoteexception)
            {
                gr.W("Could not pause mediation adapter.");
            }
        }
        lD.pause();
        lC.pause();
    }

    public void resume()
    {
        jx.aU("resume must be called on the main UI thread.");
        if (lB.lT != null && lB.mg == 0)
        {
            gi.b(lB.lT.se);
        }
        if (lB.lT != null && lB.lT.qQ != null)
        {
            try
            {
                lB.lT.qQ.resume();
            }
            catch (RemoteException remoteexception)
            {
                gr.W("Could not resume mediation adapter.");
            }
        }
        lC.resume();
        lD.resume();
    }

    public void showInterstitial()
    {
        jx.aU("showInterstitial must be called on the main UI thread.");
        if (!lB.lS.oq)
        {
            gr.W("Cannot call showInterstitial on a banner ad.");
        } else
        {
            if (lB.lT == null)
            {
                gr.W("The interstitial has not loaded.");
                return;
            }
            if (lB.mg != 1)
            {
                if (lB.lT.se.dH())
                {
                    gr.W("The interstitial is already showing.");
                    return;
                }
                lB.lT.se.z(true);
                if (lB.lT.se.dD().dN() || lB.lT.vD != null)
                {
                    af af1 = lD.a(lB.lS, lB.lT);
                    if (lB.lT.se.dD().dN() && af1 != null)
                    {
                        af1.a(new aa(lB.lT.se));
                    }
                }
                if (lB.lT.tW)
                {
                    try
                    {
                        lB.lT.qQ.showInterstitial();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        com.google.android.gms.internal.gr.d("Could not show interstitial.", remoteexception);
                    }
                    ax();
                    return;
                }
                y y1 = new y(lB.mi, false);
                Object obj = y1;
                if (lB.lM instanceof Activity)
                {
                    obj = ((Activity)lB.lM).getWindow();
                    Rect rect = new Rect();
                    Rect rect1 = new Rect();
                    ((Window) (obj)).getDecorView().getGlobalVisibleRect(rect);
                    ((Window) (obj)).getDecorView().getWindowVisibleDisplayFrame(rect1);
                    obj = y1;
                    if (rect.bottom != 0)
                    {
                        obj = y1;
                        if (rect1.bottom != 0)
                        {
                            boolean flag1 = lB.mi;
                            boolean flag;
                            if (rect.top == rect1.top)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            obj = new y(flag1, flag);
                        }
                    }
                }
                obj = new dr(this, this, this, lB.lT.se, lB.lT.orientation, lB.lO, lB.lT.ub, ((y) (obj)));
                dp.a(lB.lM, ((dr) (obj)));
                return;
            }
        }
    }

    public void stopLoading()
    {
        jx.aU("stopLoading must be called on the main UI thread.");
        if (lB.lT != null && lB.mg == 0)
        {
            lB.lT.se.stopLoading();
            lB.lT = null;
        }
        if (lB.lQ != null)
        {
            lB.lQ.cancel();
        }
        if (lB.lR != null)
        {
            lB.lR.cancel();
        }
    }
}
