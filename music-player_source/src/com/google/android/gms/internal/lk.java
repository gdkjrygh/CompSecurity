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
import com.google.android.gms.a.c;
import com.google.android.gms.a.f;

// Referenced classes of package com.google.android.gms.internal:
//            h, ar, bv, ca, 
//            cm, lj, v, ll, 
//            lm, eh, ek, ea, 
//            d, dp, do, db, 
//            aq, ay, ap, bd, 
//            em, ab, dr, cy, 
//            gt, z, at, dt, 
//            m, eo, cn, bq, 
//            bp, dv, ba

public final class lk extends h
    implements ar, bv, ca, cm, lj, v
{

    private final ba a;
    private final ll b;
    private final lm c = new lm(this);

    public lk(Context context, ab ab1, String s1, ba ba, db db1)
    {
        b = new ll(context, ab1, s1, db1);
        a = ba;
        ek.b((new StringBuilder("Use AdRequest.Builder.addTestDevice(\"")).append(eh.a(context)).append("\") to get test ads on this device.").toString());
        ea.b(context);
    }

    private void a(int i1)
    {
        ek.d((new StringBuilder("Failed to load ad: ")).append(i1).toString());
        if (b.f == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        b.f.a(i1);
        return;
        RemoteException remoteexception;
        remoteexception;
        ek.a("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void a(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -2);
        b.a.addView(view, layoutparams);
    }

    private void a(boolean flag)
    {
        if (b.i == null)
        {
            ek.d("Ad state was null when trying to ping impression URLs.");
        } else
        {
            ek.a("Pinging Impression URLs.");
            b.j.a();
            if (b.i.e != null)
            {
                ea.a(b.c, b.e.c, b.i.e);
            }
            if (b.i.n != null && b.i.n.d != null)
            {
                ay.a(b.c, b.e.c, b.i, b.b, flag, b.i.n.d);
            }
            if (b.i.k != null && b.i.k.e != null)
            {
                ay.a(b.c, b.e.c, b.i, b.b, flag, b.i.k.e);
                return;
            }
        }
    }

    private boolean b(do do1)
    {
        if (do1.j)
        {
            View view;
            try
            {
                do1 = (View)com.google.android.gms.a.f.a(do1.l.a());
            }
            // Misplaced declaration of an exception variable
            catch (do do1)
            {
                ek.a("Could not get View from mediation adapter.", do1);
                return false;
            }
            view = b.a.getNextView();
            if (view != null)
            {
                b.a.removeView(view);
            }
            try
            {
                a(do1);
            }
            // Misplaced declaration of an exception variable
            catch (do do1)
            {
                ek.a("Could not add mediation view to view hierarchy.", do1);
                return false;
            }
        } else
        if (do1.q != null)
        {
            do1.b.a(do1.q);
            b.a.removeAllViews();
            b.a.setMinimumWidth(do1.q.h);
            b.a.setMinimumHeight(do1.q.e);
            a(do1.b);
        }
        if (b.a.getChildCount() > 1)
        {
            b.a.showNext();
        }
        if (b.i != null)
        {
            do1 = b.a.getNextView();
            if (do1 instanceof em)
            {
                ((em)do1).a(b.c, b.h);
            } else
            if (do1 != null)
            {
                b.a.removeView(do1);
            }
            if (b.i.l != null)
            {
                try
                {
                    b.i.l.c();
                }
                // Misplaced declaration of an exception variable
                catch (do do1)
                {
                    ek.d("Could not destroy previous mediation adapter.");
                }
            }
        }
        b.a.setVisibility(0);
        return true;
    }

    private cy c(z z1)
    {
        ApplicationInfo applicationinfo = b.c.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo;
        Object obj;
        try
        {
            packageinfo = b.c.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        if (!b.h.f && b.a.getParent() != null)
        {
            int ai[] = new int[2];
            b.a.getLocationOnScreen(ai);
            int j1 = ai[0];
            int k1 = ai[1];
            obj = b.c.getResources().getDisplayMetrics();
            int l1 = b.a.getWidth();
            int i2 = b.a.getHeight();
            String s1;
            Bundle bundle;
            int i1;
            if (b.a.isShown() && j1 + l1 > 0 && k1 + i2 > 0 && j1 <= ((DisplayMetrics) (obj)).widthPixels && k1 <= ((DisplayMetrics) (obj)).heightPixels)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            obj = new Bundle(5);
            ((Bundle) (obj)).putInt("x", j1);
            ((Bundle) (obj)).putInt("y", k1);
            ((Bundle) (obj)).putInt("width", l1);
            ((Bundle) (obj)).putInt("height", i2);
            ((Bundle) (obj)).putInt("visible", i1);
        } else
        {
            obj = null;
        }
        s1 = dr.a();
        b.j = new dp(s1, b.b);
        b.j.a(z1);
        bundle = dr.a(b, s1, b.c);
        return new cy(((Bundle) (obj)), z1, b.h, b.b, applicationinfo, packageinfo, s1, dr.a, b.e, bundle);
    }

    private void s()
    {
        ek.b("Ad finished loading.");
        if (b.f == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        b.f.c();
        return;
        RemoteException remoteexception;
        remoteexception;
        ek.a("Could not call AdListener.onAdLoaded().", remoteexception);
        return;
    }

    private void t()
    {
        if (b.i != null)
        {
            b.i.b.destroy();
            b.i = null;
        }
    }

    public final c a()
    {
        gt.a("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.a.f.a(b.a);
    }

    public final void a(ab ab1)
    {
        gt.a("setAdSize must be called on the main UI thread.");
        b.h = ab1;
        if (b.i != null)
        {
            b.i.b.a(ab1);
        }
        if (b.a.getChildCount() > 1)
        {
            b.a.removeView(b.a.getNextView());
        }
        b.a.setMinimumWidth(ab1.h);
        b.a.setMinimumHeight(ab1.e);
        b.a.requestLayout();
    }

    public final void a(d d1)
    {
        gt.a("setAdListener must be called on the main UI thread.");
        b.f = d1;
    }

    public final void a(do do1)
    {
        int j1;
        boolean flag;
        j1 = 0;
        b.g = null;
        if (do1.d != -2 && do1.d != 3)
        {
            dr.a(b);
        }
        if (do1.d == -1)
        {
            return;
        }
        if (do1.a.d != null)
        {
            flag = do1.a.d.getBoolean("_noRefresh", false);
        } else
        {
            flag = false;
        }
        if (!b.h.f) goto _L2; else goto _L1
_L1:
        ea.a(do1.b);
_L4:
        if (do1.d == 3 && do1.n != null && do1.n.e != null)
        {
            ek.a("Pinging no fill URLs.");
            ay.a(b.c, b.e.c, do1, b.b, false, do1.n.e);
        }
        if (do1.d != -2)
        {
            a(do1.d);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!flag)
        {
            if (do1.h > 0L)
            {
                c.a(do1.a, do1.h);
            } else
            if (do1.n != null && do1.n.g > 0L)
            {
                c.a(do1.a, do1.n.g);
            } else
            if (!do1.j && do1.d == 2)
            {
                c.a(do1.a);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!b.h.f && !b(do1))
        {
            a(0);
            return;
        }
        if (b.i != null && b.i.o != null)
        {
            b.i.o.a(null);
        }
        if (do1.o != null)
        {
            do1.o.a(this);
        }
        b.i = do1;
        if (do1.q != null)
        {
            b.h = do1.q;
        }
        b.j.a(do1.s);
        b.j.b(do1.t);
        b.j.a(b.h.f);
        b.j.b(do1.j);
        if (!b.h.f)
        {
            a(false);
        }
        if (b.l == null)
        {
            b.l = new dt(b.b);
        }
        int i1;
        if (do1.n != null)
        {
            i1 = do1.n.h;
            j1 = do1.n.i;
        } else
        {
            i1 = 0;
        }
        b.l.a(i1, j1);
        s();
        return;
    }

    public final void a(m m1)
    {
        gt.a("setAppEventListener must be called on the main UI thread.");
        b.k = m1;
    }

    public final void a(String s1, String s2)
    {
        if (b.k == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        b.k.a(s1, s2);
        return;
        s1;
        ek.a("Could not call the AppEventListener.", s1);
        return;
    }

    public final boolean a(z z1)
    {
        gt.a("loadAd must be called on the main UI thread.");
        if (b.g == null) goto _L2; else goto _L1
_L1:
        ek.d("An ad request is already in progress. Aborting.");
_L4:
        return false;
_L2:
        if (b.h.f && b.i != null)
        {
            ek.d("An interstitial is already loading. Aborting.");
            return false;
        }
        Object obj;
        cy cy1;
        boolean flag;
        if (!ea.a(b.c.getPackageManager(), b.c.getPackageName(), "android.permission.INTERNET"))
        {
            if (!b.h.f)
            {
                eh.a(b.a, b.h, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        } else
        {
            flag = true;
        }
        if (!ea.a(b.c))
        {
            if (!b.h.f)
            {
                eh.a(b.a, b.h, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && !b.h.f)
        {
            b.a.setVisibility(0);
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        ek.b("Starting ad request.");
        c.a();
        cy1 = c(z1);
        if (!b.h.f) goto _L6; else goto _L5
_L5:
        z1 = em.a(b.c, b.h, false, false, b.d, b.e);
        z1.e().a(this, null, this, this, true);
_L8:
        obj = b;
        z1 = new cn(b.c, cy1, b.d, z1, a, this);
        z1.e();
        obj.g = z1;
        return true;
_L6:
        z1 = b.a.getNextView();
        if (!(z1 instanceof em))
        {
            break; /* Loop/switch isn't completed */
        }
        z1 = (em)z1;
        z1.a(b.c, b.h);
_L9:
        z1.e().a(this, this, this, this, false);
        if (true) goto _L8; else goto _L7
_L7:
        if (z1 != null)
        {
            b.a.removeView(z1);
        }
        obj = em.a(b.c, b.h, false, false, b.d, b.e);
        z1 = ((z) (obj));
        if (b.h.i == null)
        {
            a(((View) (obj)));
            z1 = ((z) (obj));
        }
          goto _L9
        if (true) goto _L8; else goto _L10
_L10:
    }

    public final void b()
    {
        gt.a("destroy must be called on the main UI thread.");
        b.f = null;
        b.k = null;
        c.a();
        g();
        if (b.a != null)
        {
            b.a.removeAllViews();
        }
        if (b.i != null && b.i.b != null)
        {
            b.i.b.destroy();
        }
    }

    public final void b(z z1)
    {
        android.view.ViewParent viewparent = b.a.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && ea.a())
        {
            a(z1);
            return;
        } else
        {
            ek.b("Ad is not visible. Not refreshing ad.");
            c.a(z1);
            return;
        }
    }

    public final boolean c()
    {
        gt.a("isLoaded must be called on the main UI thread.");
        return b.g == null && b.i != null;
    }

    public final void d()
    {
        gt.a("pause must be called on the main UI thread.");
        if (b.i != null)
        {
            ea.a(b.i.b);
        }
    }

    public final void e()
    {
        gt.a("resume must be called on the main UI thread.");
        if (b.i != null)
        {
            ea.b(b.i.b);
        }
    }

    public final void f()
    {
        gt.a("showInterstitial must be called on the main UI thread.");
        if (!b.h.f)
        {
            ek.d("Cannot call showInterstitial on a banner ad.");
            return;
        }
        if (b.i == null)
        {
            ek.d("The interstitial has not loaded.");
            return;
        }
        if (b.i.b.h())
        {
            ek.d("The interstitial is already showing.");
            return;
        }
        b.i.b.a(true);
        if (b.i.j)
        {
            try
            {
                b.i.l.b();
                return;
            }
            catch (RemoteException remoteexception)
            {
                ek.a("Could not show interstitial.", remoteexception);
            }
            t();
            return;
        } else
        {
            bq bq1 = new bq(this, this, this, b.i.b, b.i.g, b.e);
            bp.a(b.c, bq1);
            return;
        }
    }

    public final void g()
    {
        gt.a("stopLoading must be called on the main UI thread.");
        if (b.i != null)
        {
            b.i.b.stopLoading();
            b.i = null;
        }
        if (b.g != null)
        {
            b.g.f();
        }
    }

    public final void h()
    {
        gt.a("recordManualImpression must be called on the main UI thread.");
        if (b.i == null)
        {
            ek.d("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            ek.a("Pinging manual tracking URLs.");
            if (b.i.f != null)
            {
                ea.a(b.c, b.e.c, b.i.f);
                return;
            }
        }
    }

    public final ab i()
    {
        gt.a("getAdSize must be called on the main UI thread.");
        return b.h;
    }

    public final void j()
    {
        r();
    }

    public final void k()
    {
        o();
    }

    public final void l()
    {
        q();
    }

    public final void m()
    {
        p();
    }

    public final void n()
    {
        if (b.i != null)
        {
            ek.d((new StringBuilder("Mediation adapter ")).append(b.i.m).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        a(true);
        s();
    }

    public final void o()
    {
        if (b.h.f)
        {
            t();
        }
        ek.b("Ad closing.");
        if (b.f != null)
        {
            try
            {
                b.f.a();
            }
            catch (RemoteException remoteexception)
            {
                ek.a("Could not call AdListener.onAdClosed().", remoteexception);
            }
        }
        b.j.c();
    }

    public final void p()
    {
        if (b.h.f)
        {
            a(false);
        }
        ek.b("Ad opening.");
        if (b.f == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        b.f.d();
        return;
        RemoteException remoteexception;
        remoteexception;
        ek.a("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    public final void q()
    {
        ek.b("Ad leaving application.");
        if (b.f == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        b.f.b();
        return;
        RemoteException remoteexception;
        remoteexception;
        ek.a("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    public final void r()
    {
        if (b.i == null)
        {
            ek.d("Ad state was null when trying to ping click URLs.");
        } else
        {
            ek.a("Pinging click URLs.");
            b.j.b();
            if (b.i.c != null)
            {
                ea.a(b.c, b.e.c, b.i.c);
            }
            if (b.i.n != null && b.i.n.c != null)
            {
                ay.a(b.c, b.e.c, b.i, b.b, false, b.i.n.c);
                return;
            }
        }
    }
}
