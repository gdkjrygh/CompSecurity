// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ViewSwitcher;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.c;

// Referenced classes of package com.google.android.gms.internal:
//            ag, aq, bi, bl, 
//            q, s, cm, cn, 
//            ci, ab, x, ce, 
//            co, ap, au, cq, 
//            ao, ax, cf, dm, 
//            v, ar, ae, cr, 
//            bp, bh, bf, cg, 
//            aw, h, g

public final class r extends ac.a
    implements ag, aq, bi, bl, bp.a, q
{
    private static final class a
    {

        public final String adUnitId;
        public final ViewSwitcher ec;
        public final x ed;
        public final Context ee;
        public final h ef;
        public final co eg;
        public ab eh;
        public cg ei;
        public ce ej;
        public ae ek;

        public a(Context context, x x1, String s1, co co1)
        {
            if (x1.ex)
            {
                ec = null;
            } else
            {
                ec = new ViewSwitcher(context);
                ec.setMinimumWidth(x1.widthPixels);
                ec.setMinimumHeight(x1.heightPixels);
                ec.setVisibility(4);
            }
            ed = x1;
            adUnitId = s1;
            ee = context;
            ef = new h(g.a(co1.hP, context));
            eg = co1;
        }
    }


    private final aw dZ;
    private final a ea;
    private final s eb = new s(this);

    public r(Context context, x x1, String s1, aw aw, co co1)
    {
        ea = new a(context, x1, s1, co1);
        dZ = aw;
        cn.o((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(cm.l(context)).append("\") to get test ads on this device.").toString());
        ci.i(context);
    }

    private void I()
    {
        cn.o("Ad closing.");
        if (ea.eh == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ea.eh.onAdClosed();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.cn.b("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void J()
    {
        cn.o("Ad leaving application.");
        if (ea.eh == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ea.eh.onAdLeftApplication();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.cn.b("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void K()
    {
        cn.o("Ad opening.");
        if (ea.eh == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ea.eh.onAdOpened();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.cn.b("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void L()
    {
        cn.o("Ad finished loading.");
        if (ea.eh == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ea.eh.onAdLoaded();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.cn.b("Could not call AdListener.onAdLoaded().", remoteexception);
        return;
    }

    private boolean M()
    {
        boolean flag = true;
        if (!ci.a(ea.ee.getPackageManager(), ea.ee.getPackageName(), "android.permission.INTERNET"))
        {
            if (!ea.ed.ex)
            {
                cm.a(ea.ec, ea.ed, "Missing internet permission in AndroidManifest.xml.");
            }
            flag = false;
        }
        if (!ci.h(ea.ee))
        {
            if (!ea.ed.ex)
            {
                cm.a(ea.ec, ea.ed, "Missing AdActivity with android:configChanges in AndroidManifest.xml.");
            }
            flag = false;
        }
        if (!flag)
        {
            ea.ec.setVisibility(0);
        }
        return flag;
    }

    private void N()
    {
        if (ea.ej == null)
        {
            cn.q("Ad state was null when trying to ping click URLs.");
        } else
        {
            cn.m("Pinging click URLs.");
            if (ea.ej.eW != null)
            {
                ci.a(ea.ee, ea.eg.hP, ea.ej.eW);
            }
            if (ea.ej.hA != null && ea.ej.hA.eW != null)
            {
                au.a(ea.ee, ea.eg.hP, ea.ej, ea.adUnitId, false, ea.ej.hA.eW);
                return;
            }
        }
    }

    private void O()
    {
        if (ea.ej != null)
        {
            ea.ej.fU.destroy();
            ea.ej = null;
        }
    }

    private void a(int i)
    {
        cn.q((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (ea.eh == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ea.eh.onAdFailedToLoad(i);
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.cn.b("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void b(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
        ea.ec.addView(view, layoutparams);
    }

    private void b(boolean flag)
    {
        if (ea.ej == null)
        {
            cn.q("Ad state was null when trying to ping impression URLs.");
        } else
        {
            cn.m("Pinging Impression URLs.");
            if (ea.ej.eX != null)
            {
                ci.a(ea.ee, ea.eg.hP, ea.ej.eX);
            }
            if (ea.ej.hA != null && ea.ej.hA.eX != null)
            {
                au.a(ea.ee, ea.eg.hP, ea.ej, ea.adUnitId, flag, ea.ej.hA.eX);
            }
            if (ea.ej.fm != null && ea.ej.fm.eT != null)
            {
                au.a(ea.ee, ea.eg.hP, ea.ej, ea.adUnitId, flag, ea.ej.fm.eT);
                return;
            }
        }
    }

    private boolean b(ce ce1)
    {
        if (ce1.gI)
        {
            View view;
            try
            {
                ce1 = (View)com.google.android.gms.dynamic.c.b(ce1.fn.getView());
            }
            // Misplaced declaration of an exception variable
            catch (ce ce1)
            {
                com.google.android.gms.internal.cn.b("Could not get View from mediation adapter.", ce1);
                return false;
            }
            view = ea.ec.getNextView();
            if (view != null)
            {
                ea.ec.removeView(view);
            }
            try
            {
                b(((View) (ce1)));
            }
            // Misplaced declaration of an exception variable
            catch (ce ce1)
            {
                com.google.android.gms.internal.cn.b("Could not add mediation view to view hierarchy.", ce1);
                return false;
            }
        }
        if (ea.ec.getChildCount() > 1)
        {
            ea.ec.showNext();
        }
        if (ea.ej != null)
        {
            ce1 = ea.ec.getNextView();
            if (ce1 instanceof cq)
            {
                ((cq)ce1).a(ea.ee, ea.ed);
            } else
            if (ce1 != null)
            {
                ea.ec.removeView(ce1);
            }
            if (ea.ej.fn != null)
            {
                try
                {
                    ea.ej.fn.destroy();
                }
                // Misplaced declaration of an exception variable
                catch (ce ce1)
                {
                    cn.q("Could not destroy previous mediation adapter.");
                }
            }
        }
        ea.ec.setVisibility(0);
        return true;
    }

    private bu.a c(v v1)
    {
        ApplicationInfo applicationinfo = ea.ee.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo;
        Object obj;
        try
        {
            packageinfo = ea.ee.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        if (!ea.ed.ex && ea.ec.getParent() != null)
        {
            int ai[] = new int[2];
            ea.ec.getLocationOnScreen(ai);
            int j = ai[0];
            int k = ai[1];
            obj = ea.ee.getResources().getDisplayMetrics();
            int l = ea.ec.getWidth();
            int i1 = ea.ec.getHeight();
            int i;
            if (ea.ec.isShown() && j + l > 0 && k + i1 > 0 && j <= ((DisplayMetrics) (obj)).widthPixels && k <= ((DisplayMetrics) (obj)).heightPixels)
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
        return new bu.a(((Bundle) (obj)), v1, ea.ed, ea.adUnitId, applicationinfo, packageinfo, cf.al(), cf.hB, ea.eg);
    }

    public void A()
    {
        J();
    }

    public void B()
    {
        if (ea.ed.ex)
        {
            O();
        }
        I();
    }

    public void C()
    {
        if (ea.ed.ex)
        {
            b(false);
        }
        K();
    }

    public void D()
    {
        y();
    }

    public void E()
    {
        B();
    }

    public void F()
    {
        A();
    }

    public void G()
    {
        C();
    }

    public void H()
    {
        if (ea.ej != null)
        {
            cn.q((new StringBuilder()).append("Mediation adapter ").append(ea.ej.fo).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        b(true);
        L();
    }

    public void a(ab ab1)
    {
        dm.w("setAdListener must be called on the main UI thread.");
        ea.eh = ab1;
    }

    public void a(ae ae1)
    {
        dm.w("setAppEventListener must be called on the main UI thread.");
        ea.ek = ae1;
    }

    public void a(ce ce1)
    {
        boolean flag;
        ea.ei = null;
        if (ce1.errorCode == -1)
        {
            return;
        }
        if (ce1.gB.extras != null)
        {
            flag = ce1.gB.extras.getBoolean("_noRefresh", false);
        } else
        {
            flag = false;
        }
        if (!ea.ed.ex) goto _L2; else goto _L1
_L1:
        ci.a(ce1.fU);
_L4:
        if (ce1.errorCode == 3 && ce1.hA != null && ce1.hA.eY != null)
        {
            cn.m("Pinging no fill URLs.");
            au.a(ea.ee, ea.eg.hP, ce1, ea.adUnitId, false, ce1.hA.eY);
        }
        if (ce1.errorCode != -2)
        {
            a(ce1.errorCode);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!flag)
        {
            if (ce1.fa > 0L)
            {
                eb.a(ce1.gB, ce1.fa);
            } else
            if (ce1.hA != null && ce1.hA.fa > 0L)
            {
                eb.a(ce1.gB, ce1.hA.fa);
            } else
            if (!ce1.gI && ce1.errorCode == 2)
            {
                eb.d(ce1.gB);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!ea.ed.ex && !b(ce1))
        {
            a(0);
            return;
        }
        if (ea.ej != null && ea.ej.fp != null)
        {
            ea.ej.fp.a(null);
        }
        if (ce1.fp != null)
        {
            ce1.fp.a(this);
        }
        ea.ej = ce1;
        if (!ea.ed.ex)
        {
            b(false);
        }
        L();
        return;
    }

    public void a(String s1, String s2)
    {
        if (ea.ek == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        ea.ek.a(s1, s2);
        return;
        s1;
        com.google.android.gms.internal.cn.b("Could not call the AppEventListener.", s1);
        return;
    }

    public boolean a(v v1)
    {
        dm.w("loadAd must be called on the main UI thread.");
        if (ea.ei == null) goto _L2; else goto _L1
_L1:
        cn.q("An ad request is already in progress. Aborting.");
_L4:
        return false;
_L2:
        if (ea.ed.ex && ea.ej != null)
        {
            cn.q("An interstitial is already loading. Aborting.");
            return false;
        }
        if (!M()) goto _L4; else goto _L3
_L3:
        bu.a a1;
        cn.o("Starting ad request.");
        eb.cancel();
        a1 = c(v1);
        if (!ea.ed.ex) goto _L6; else goto _L5
_L5:
        v1 = cq.a(ea.ee, ea.ed, false, false, ea.ef, ea.eg);
        v1.aw().a(this, null, this, this, true);
_L8:
        ea.ei = bp.a(ea.ee, a1, ea.ef, v1, dZ, this);
        return true;
_L6:
        v1 = ea.ec.getNextView();
        if (!(v1 instanceof cq))
        {
            break; /* Loop/switch isn't completed */
        }
        v1 = (cq)v1;
        v1.a(ea.ee, ea.ed);
_L9:
        v1.aw().a(this, this, this, this, false);
        if (true) goto _L8; else goto _L7
_L7:
        if (v1 != null)
        {
            ea.ec.removeView(v1);
        }
        v1 = cq.a(ea.ee, ea.ed, false, false, ea.ef, ea.eg);
        b(v1);
          goto _L9
        if (true) goto _L8; else goto _L10
_L10:
    }

    public void b(v v1)
    {
        android.view.ViewParent viewparent = ea.ec.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && ci.am())
        {
            a(v1);
            return;
        } else
        {
            cn.o("Ad is not visible. Not refreshing ad.");
            eb.d(v1);
            return;
        }
    }

    public void destroy()
    {
        dm.w("destroy must be called on the main UI thread.");
        ea.eh = null;
        ea.ek = null;
        eb.cancel();
        stopLoading();
        if (ea.ec != null)
        {
            ea.ec.removeAllViews();
        }
        if (ea.ej != null && ea.ej.fU != null)
        {
            ea.ej.fU.destroy();
        }
    }

    public boolean isReady()
    {
        dm.w("isReady must be called on the main UI thread.");
        return ea.ei == null && ea.ej != null;
    }

    public void pause()
    {
        dm.w("pause must be called on the main UI thread.");
        if (ea.ej != null)
        {
            ci.a(ea.ej.fU);
        }
    }

    public void resume()
    {
        dm.w("resume must be called on the main UI thread.");
        if (ea.ej != null)
        {
            com.google.android.gms.internal.ci.b(ea.ej.fU);
        }
    }

    public void showInterstitial()
    {
        dm.w("showInterstitial must be called on the main UI thread.");
        if (!ea.ed.ex)
        {
            cn.q("Cannot call showInterstitial on a banner ad.");
            return;
        }
        if (ea.ej == null)
        {
            cn.q("The interstitial has not loaded.");
            return;
        }
        if (ea.ej.fU.az())
        {
            cn.q("The interstitial is already showing.");
            return;
        }
        ea.ej.fU.i(true);
        if (ea.ej.gI)
        {
            try
            {
                ea.ej.fn.showInterstitial();
                return;
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.internal.cn.b("Could not show interstitial.", remoteexception);
            }
            O();
            return;
        } else
        {
            bh bh1 = new bh(this, this, this, ea.ej.fU, ea.ej.orientation, ea.eg);
            bf.a(ea.ee, bh1);
            return;
        }
    }

    public void stopLoading()
    {
        dm.w("stopLoading must be called on the main UI thread.");
        if (ea.ej != null)
        {
            ea.ej.fU.stopLoading();
            ea.ej = null;
        }
        if (ea.ei != null)
        {
            ea.ei.cancel();
        }
    }

    public void y()
    {
        N();
    }

    public b z()
    {
        dm.w("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.c.g(ea.ec);
    }
}
