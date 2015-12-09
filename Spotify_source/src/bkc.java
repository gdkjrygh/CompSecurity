// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.WeakHashMap;

public abstract class bkc extends bgi
    implements bfe, bhz, bis, cde, chq, ciz
{

    protected cbk a;
    protected final bkt b = new bkt(this);
    protected final bkw c;
    protected transient AdRequestParcel d;
    protected final bzv e;
    protected final bkf f;
    private cbi g;
    private cbi h;
    private boolean i;

    bkc(bkw bkw1, bkf bkf)
    {
        i = false;
        c = bkw1;
        f = bkf;
        bkw1 = bkv.e();
        bkf = c.c;
        if (!((cjj) (bkw1)).c)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            bkf.getApplicationContext().registerReceiver(new cjk(bkw1, (byte)0), intentfilter);
            bkw1.c = true;
        }
        bkv.h().a(c.c, c.e);
        e = bkv.h().c;
    }

    private static long a(String s)
    {
        int k;
        int j1;
        j1 = s.indexOf("ufe");
        int i1 = s.indexOf(',', j1);
        k = i1;
        if (i1 == -1)
        {
            k = s.length();
        }
        long l1 = Long.parseLong(s.substring(j1 + 4, k));
        return l1;
        s;
        bka.e("Invalid index for Url fetch time in CSI latency info.");
_L2:
        return -1L;
        s;
        bka.e("Cannot find valid format of Url fetch time in CSI latency info.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    static Bundle a(cak cak1)
    {
        if (cak1 != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (cak1.a)
        {
            synchronized (cak1.b)
            {
                cak1.a = false;
                cak1.b.notifyAll();
                bka.a("ContentFetchThread: wakeup");
            }
        }
        obj = cak1.c.a();
        if (obj != null)
        {
            cak1 = ((cah) (obj)).f;
            bka.a((new StringBuilder("In AdManger: loadAd, ")).append(((cah) (obj)).toString()).toString());
        } else
        {
            cak1 = null;
        }
        if (cak1 == null) goto _L1; else goto _L3
_L3:
        obj = new Bundle(1);
        ((Bundle) (obj)).putString("fingerprint", cak1);
        ((Bundle) (obj)).putInt("v", 1);
        return ((Bundle) (obj));
        cak1;
        obj;
        JVM INSTR monitorexit ;
        throw cak1;
    }

    public final byb a()
    {
        btl.b("getAdFrame must be called on the main UI thread.");
        return bye.a(c.f);
    }

    protected final void a(View view)
    {
        c.f.addView(view, bkv.g().d());
    }

    public final void a(bfs bfs1)
    {
        btl.b("setAdListener must be called on the main UI thread.");
        c.m = bfs1;
    }

    public final void a(bfv bfv1)
    {
        btl.b("setAdListener must be called on the main UI thread.");
        c.n = bfv1;
    }

    public final void a(bgn bgn1)
    {
        btl.b("setAppEventListener must be called on the main UI thread.");
        c.o = bgn1;
    }

    public final void a(bgq bgq)
    {
        btl.b("setCorrelationIdProvider must be called on the main UI thread");
        c.p = bgq;
    }

    public void a(cbp cbp)
    {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void a(cgv cgv)
    {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void a(chh chh, String s)
    {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public final void a(ciu ciu1)
    {
        if (ciu1.b.n != -1L && !TextUtils.isEmpty(ciu1.b.z))
        {
            long l1 = a(ciu1.b.z);
            if (l1 != -1L)
            {
                cbi cbi1 = a.a(l1 + ciu1.b.n);
                a.a(cbi1, new String[] {
                    "stc"
                });
            }
        }
        cbk cbk1 = a;
        String s = ciu1.b.z;
        if (cbk1.a)
        {
            synchronized (cbk1.b)
            {
                cbk1.c = s;
            }
        }
        a.a(g, new String[] {
            "arf"
        });
        h = a.a();
        a.a("gqi", ciu1.b.A);
        c.g = null;
        c.k = ciu1;
        a(ciu1, a);
        return;
        ciu1;
        obj;
        JVM INSTR monitorexit ;
        throw ciu1;
    }

    protected abstract void a(ciu ciu1, cbk cbk1);

    public final void a(AdSizeParcel adsizeparcel)
    {
        btl.b("setAdSize must be called on the main UI thread.");
        c.i = adsizeparcel;
        if (c.j != null && c.j.b != null && c.C == 0)
        {
            c.j.b.a(adsizeparcel);
        }
        if (c.f == null)
        {
            return;
        }
        if (c.f.getChildCount() > 1)
        {
            c.f.removeView(c.f.getNextView());
        }
        c.f.setMinimumWidth(adsizeparcel.g);
        c.f.setMinimumHeight(adsizeparcel.d);
        c.f.requestLayout();
    }

    public final void a(String s, String s1)
    {
        if (c.o == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        c.o.a(s, s1);
        return;
        s;
        bka.c("Could not call the AppEventListener.", s);
        return;
    }

    public final void a(HashSet hashset)
    {
        c.F = hashset;
    }

    public void a(boolean flag)
    {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    protected final boolean a(int k)
    {
        bka.e((new StringBuilder("Failed to load ad: ")).append(k).toString());
        i = false;
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.a(k);
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call AdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }

    boolean a(cit cit1)
    {
        return false;
    }

    protected abstract boolean a(cit cit1, cit cit2);

    public boolean a(AdRequestParcel adrequestparcel)
    {
        btl.b("loadAd must be called on the main UI thread.");
        AdRequestParcel adrequestparcel1 = adrequestparcel;
        if (GooglePlayServicesUtil.zzag(c.c))
        {
            adrequestparcel1 = adrequestparcel;
            if (adrequestparcel.k != null)
            {
                adrequestparcel = new bfm(adrequestparcel);
                adrequestparcel.j = null;
                adrequestparcel1 = new AdRequestParcel(6, ((bfm) (adrequestparcel)).a, ((bfm) (adrequestparcel)).b, ((bfm) (adrequestparcel)).c, ((bfm) (adrequestparcel)).d, ((bfm) (adrequestparcel)).e, ((bfm) (adrequestparcel)).f, ((bfm) (adrequestparcel)).g, ((bfm) (adrequestparcel)).h, ((bfm) (adrequestparcel)).i, ((bfm) (adrequestparcel)).j, ((bfm) (adrequestparcel)).k, ((bfm) (adrequestparcel)).l, ((bfm) (adrequestparcel)).m, ((bfm) (adrequestparcel)).n, ((bfm) (adrequestparcel)).o, ((bfm) (adrequestparcel)).p);
            }
        }
        if (i)
        {
            if (d != null)
            {
                bka.e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            d = adrequestparcel1;
            return false;
        }
        bka.c("Starting ad request.");
        i = true;
        adrequestparcel = cbb.u;
        a = new cbk(((Boolean)bkv.n().a(adrequestparcel)).booleanValue(), "load_ad", c.i.b);
        g = new cbi(-1L, null, null);
        h = new cbi(-1L, null, null);
        g = a.a();
        if (!adrequestparcel1.f)
        {
            adrequestparcel = new StringBuilder("Use AdRequest.Builder.addTestDevice(\"");
            bfq.a();
            bka.c(adrequestparcel.append(bjz.a(c.c)).append("\") to get test ads on this device.").toString());
        }
        return a(adrequestparcel1, a);
    }

    protected abstract boolean a(AdRequestParcel adrequestparcel, cbk cbk1);

    public final void b()
    {
        Object obj1;
        cit cit1;
        btl.b("destroy must be called on the main UI thread.");
        b.a();
        obj1 = e;
        cit1 = c.j;
        Object obj = ((bzv) (obj1)).a;
        obj;
        JVM INSTR monitorenter ;
        obj1 = (bzw)((bzv) (obj1)).b.get(cit1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        ((bzw) (obj1)).e();
        obj;
        JVM INSTR monitorexit ;
        obj = c;
        if (((bkw) (obj)).f != null)
        {
            bkx bkx1 = ((bkw) (obj)).f;
            bka.d("Disable position monitoring on adFrame.");
            if (bkx1.b != null)
            {
                bkx1.b.b();
            }
        }
        obj.n = null;
        obj.o = null;
        obj.r = null;
        obj.q = null;
        obj.x = null;
        obj.p = null;
        ((bkw) (obj)).a(false);
        if (((bkw) (obj)).f != null)
        {
            ((bkw) (obj)).f.removeAllViews();
        }
        ((bkw) (obj)).a();
        ((bkw) (obj)).b();
        obj.j = null;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(cit cit1)
    {
        a.a(h, new String[] {
            "awr"
        });
        c.h = null;
        if (cit1.d != -2 && cit1.d != 3)
        {
            cix cix1 = bkv.h();
            HashSet hashset = c.F;
            synchronized (cix1.a)
            {
                cix1.d.addAll(hashset);
            }
        }
        if (cit1.d != -1) goto _L2; else goto _L1
_L1:
        i = false;
_L4:
        return;
        cit1;
        obj;
        JVM INSTR monitorexit ;
        throw cit1;
_L2:
        if (a(cit1))
        {
            bka.a("Ad refresh scheduled.");
        }
        if (cit1.d != -2)
        {
            a(cit1.d);
            return;
        }
        if (c.A == null)
        {
            c.A = new cja(c.b);
        }
        e.a(c.j);
        if (!a(c.j, cit1)) goto _L4; else goto _L3
_L3:
        civ civ1;
        boolean flag;
        c.j = cit1;
        cit1 = c;
        civ1 = ((bkw) (cit1)).l;
        long l1 = ((bkw) (cit1)).j.r;
        synchronized (civ1.c)
        {
            civ1.j = l1;
            if (civ1.j != -1L)
            {
                civ1.a.a(civ1);
            }
        }
        civ1 = ((bkw) (cit1)).l;
        l1 = ((bkw) (cit1)).j.s;
        synchronized (civ1.c)
        {
            if (civ1.j != -1L)
            {
                civ1.d = l1;
                civ1.a.a(civ1);
            }
        }
        civ1 = ((bkw) (cit1)).l;
        flag = ((bkw) (cit1)).i.e;
        obj1 = civ1.c;
        obj1;
        JVM INSTR monitorenter ;
        if (civ1.j == -1L)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        civ1.g = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        civ1.e = civ1.g;
        civ1.a.a(civ1);
        obj1;
        JVM INSTR monitorexit ;
        obj1 = ((bkw) (cit1)).l;
        boolean flag1 = ((bkw) (cit1)).j.k;
        synchronized (((civ) (obj1)).c)
        {
            if (((civ) (obj1)).j != -1L)
            {
                obj1.f = flag1;
                ((civ) (obj1)).a.a(((civ) (obj1)));
            }
        }
        obj1 = a;
        if (c.j.a())
        {
            cit1 = "1";
        } else
        {
            cit1 = "0";
        }
        ((cbk) (obj1)).a("is_mraid", cit1);
        obj1 = a;
        if (c.j.k)
        {
            cit1 = "1";
        } else
        {
            cit1 = "0";
        }
        ((cbk) (obj1)).a("is_mediation", cit1);
        if (c.j.b != null && c.j.b.k() != null)
        {
            obj1 = a;
            if (c.j.b.k().b())
            {
                cit1 = "1";
            } else
            {
                cit1 = "0";
            }
            ((cbk) (obj1)).a("is_video", cit1);
        }
        a.a(g, new String[] {
            "ttc"
        });
        if (bkv.h().c() != null)
        {
            bkv.h().c().a(a);
        }
        if (!c.c()) goto _L4; else goto _L5
_L5:
        q();
        return;
        cit1;
        obj1;
        JVM INSTR monitorexit ;
        throw cit1;
        cit1;
        obj1;
        JVM INSTR monitorexit ;
        throw cit1;
        cit1;
        obj1;
        JVM INSTR monitorexit ;
        throw cit1;
        exception;
        cit1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean b(AdRequestParcel adrequestparcel)
    {
        adrequestparcel = c.f.getParent();
        return (adrequestparcel instanceof View) && ((View)adrequestparcel).isShown() && bkv.e().b;
    }

    protected final void c(cit cit1)
    {
        if (cit1 != null) goto _L2; else goto _L1
_L1:
        bka.e("Ad state was null when trying to ping impression URLs.");
_L4:
        return;
_L2:
        civ civ1;
        bka.a("Pinging Impression URLs.");
        civ1 = c.l;
        Object obj = civ1.c;
        obj;
        JVM INSTR monitorenter ;
        ciy ciy1;
        if (civ1.j != -1L && civ1.e == -1L)
        {
            civ1.e = SystemClock.elapsedRealtime();
            civ1.a.a(civ1);
        }
        ciy1 = civ1.a.b();
        synchronized (ciy1.d)
        {
            ciy1.f = ciy1.f + 1;
        }
        obj;
        JVM INSTR monitorexit ;
        if (cit1.e == null) goto _L4; else goto _L3
_L3:
        bkv.e();
        cjj.a(c.c, c.e.b, cit1.e);
        return;
        cit1;
        obj1;
        JVM INSTR monitorexit ;
        throw cit1;
        cit1;
        obj;
        JVM INSTR monitorexit ;
        throw cit1;
    }

    public final void c(AdRequestParcel adrequestparcel)
    {
        if (b(adrequestparcel))
        {
            a(adrequestparcel);
            return;
        } else
        {
            bka.c("Ad is not visible. Not refreshing ad.");
            b.a(adrequestparcel);
            return;
        }
    }

    public final boolean c()
    {
        btl.b("isLoaded must be called on the main UI thread.");
        return c.g == null && c.h == null && c.j != null;
    }

    public void d()
    {
        btl.b("pause must be called on the main UI thread.");
    }

    public void e()
    {
        if (c.j != null) goto _L2; else goto _L1
_L1:
        bka.e("Ad state was null when trying to ping click URLs.");
_L4:
        return;
_L2:
        civ civ1;
        bka.a("Pinging click URLs.");
        civ1 = c.l;
        Object obj = civ1.c;
        obj;
        JVM INSTR monitorenter ;
        ciy ciy1;
        if (civ1.j == -1L)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        ciw ciw1 = new ciw();
        ciw1.a = SystemClock.elapsedRealtime();
        civ1.b.add(ciw1);
        civ1.h = civ1.h + 1L;
        ciy1 = civ1.a.b();
        synchronized (ciy1.d)
        {
            ciy1.e = ciy1.e + 1;
        }
        civ1.a.a(civ1);
        obj;
        JVM INSTR monitorexit ;
        if (c.j.c != null)
        {
            bkv.e();
            cjj.a(c.c, c.e.b, c.j.c);
        }
        if (c.m == null) goto _L4; else goto _L3
_L3:
        try
        {
            c.m.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bka.c("Could not notify onAdClicked event.", ((Throwable) (obj)));
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void f()
    {
        btl.b("resume must be called on the main UI thread.");
    }

    public final void h()
    {
        btl.b("stopLoading must be called on the main UI thread.");
        i = false;
        c.a(true);
    }

    public final void i()
    {
        btl.b("recordManualImpression must be called on the main UI thread.");
        if (c.j == null)
        {
            bka.e("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            bka.a("Pinging manual tracking URLs.");
            if (c.j.f != null)
            {
                bkv.e();
                cjj.a(c.c, c.e.b, c.j.f);
                return;
            }
        }
    }

    public final AdSizeParcel j()
    {
        btl.b("getAdSize must be called on the main UI thread.");
        if (c.i == null)
        {
            return null;
        } else
        {
            return new ThinAdSizeParcel(c.i);
        }
    }

    public final boolean l()
    {
        return i;
    }

    public final void m()
    {
        o();
    }

    protected boolean n()
    {
        bka.d("Ad closing.");
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.a();
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call AdListener.onAdClosed().", remoteexception);
            return false;
        }
        return true;
    }

    final boolean o()
    {
        bka.c("Ad leaving application.");
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.b();
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call AdListener.onAdLeftApplication().", remoteexception);
            return false;
        }
        return true;
    }

    protected final boolean p()
    {
        bka.c("Ad opening.");
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.d();
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call AdListener.onAdOpened().", remoteexception);
            return false;
        }
        return true;
    }

    protected boolean q()
    {
        bka.c("Ad finished loading.");
        i = false;
        if (c.n == null)
        {
            return false;
        }
        try
        {
            c.n.c();
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Could not call AdListener.onAdLoaded().", remoteexception);
            return false;
        }
        return true;
    }

    protected void r()
    {
        c(c.j);
    }
}
