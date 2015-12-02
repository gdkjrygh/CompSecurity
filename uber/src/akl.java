// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class akl extends WebViewClient
{

    protected final akk a;
    private final HashMap b;
    private final Object c;
    private kp d;
    private mk e;
    private akm f;
    private acs g;
    private boolean h;
    private ada i;
    private adc j;
    private boolean k;
    private mo l;
    private final afg m;
    private ok n;
    private afb o;
    private afi p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;

    public akl(akk akk1, boolean flag)
    {
        this(akk1, flag, new afg(akk1, akk1.e(), new abe(akk1.getContext())));
    }

    private akl(akk akk1, boolean flag, afg afg1)
    {
        b = new HashMap();
        c = new Object();
        h = false;
        a = akk1;
        k = flag;
        m = afg1;
        o = null;
    }

    static void a(akl akl1)
    {
        akl1.g();
    }

    private void a(AdOverlayInfoParcel adoverlayinfoparcel)
    {
        boolean flag1 = false;
        android.content.Context context;
        boolean flag;
        if (o != null)
        {
            flag = o.a();
        } else
        {
            flag = false;
        }
        ot.c();
        context = a.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        mi.a(context, adoverlayinfoparcel, flag1);
    }

    private static boolean a(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    static void b(akl akl1)
    {
        akl1.h();
    }

    private void b(Uri uri)
    {
        String s1 = uri.getPath();
        Object obj = (List)b.get(s1);
        if (obj != null)
        {
            ot.e();
            uri = ajc.a(uri);
            if (of.a(2))
            {
                of.d((new StringBuilder("Received GMSG: ")).append(s1).toString());
                String s2;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); of.d((new StringBuilder("  ")).append(s2).append(": ").append((String)uri.get(s2)).toString()))
                {
                    s2 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((acu)((Iterator) (obj)).next()).a(a, uri)) { }
        } else
        {
            of.d((new StringBuilder("No GMSG handler found for GMSG: ")).append(uri).toString());
        }
    }

    static void c(akl akl1)
    {
        akl1.i();
    }

    private void g()
    {
        t = t + 1;
        j();
    }

    private void h()
    {
        t = t - 1;
        j();
    }

    private void i()
    {
        s = true;
        j();
    }

    private void j()
    {
        if (f != null && (r && t <= 0 || s))
        {
            akm akm1 = f;
            akk akk1 = a;
            boolean flag;
            if (!s)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            akm1.a(akk1, flag);
            f = null;
        }
    }

    public final ok a()
    {
        return n;
    }

    public final void a(int i1, int j1)
    {
        if (o != null)
        {
            o.a(i1, j1);
        }
    }

    public final void a(int i1, int j1, boolean flag)
    {
        m.a(i1, j1);
        if (o != null)
        {
            o.a(i1, j1, flag);
        }
    }

    public final void a(akm akm1)
    {
        f = akm1;
    }

    public final void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        mk mk = null;
        boolean flag = a.m();
        kp kp;
        if (flag && !a.h().e)
        {
            kp = null;
        } else
        {
            kp = d;
        }
        if (!flag)
        {
            mk = e;
        }
        a(new AdOverlayInfoParcel(adlauncherintentinfoparcel, kp, mk, l, a.l()));
    }

    public final void a(String s1, acu acu1)
    {
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        List list = (List)b.get(s1);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        obj = new CopyOnWriteArrayList();
        b.put(s1, obj);
        ((List) (obj)).add(acu1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(kp kp, mk mk, acs acs, mo mo, boolean flag, ada ada, adc adc, 
            ok ok1, afi afi)
    {
        ok ok2 = ok1;
        if (ok1 == null)
        {
            ok2 = new ok((byte)0);
        }
        o = new afb(a, afi);
        a("/appEvent", ((acu) (new acr(acs))));
        a("/canOpenURLs", act.b);
        a("/canOpenIntents", act.c);
        a("/click", act.d);
        a("/close", act.e);
        a("/customClose", act.f);
        a("/delayPageLoaded", ((acu) (new ako(this, (byte)0))));
        a("/httpTrack", act.g);
        a("/log", act.h);
        a("/mraid", ((acu) (new ade(ok2, o))));
        a("/open", ((acu) (new adf(ada, ok2, o))));
        a("/precache", act.k);
        a("/touch", act.i);
        a("/video", act.j);
        if (adc != null)
        {
            a("/setInterstitialProperties", ((acu) (new adb(adc))));
        }
        d = kp;
        e = mk;
        g = acs;
        i = ada;
        l = mo;
        n = ok2;
        p = afi;
        j = adc;
        a(flag);
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final void a(boolean flag, int i1)
    {
        kp kp;
        if (a.m() && !a.h().e)
        {
            kp = null;
        } else
        {
            kp = d;
        }
        a(new AdOverlayInfoParcel(kp, e, l, a, flag, i1, a.l()));
    }

    public final void a(boolean flag, int i1, String s1)
    {
        Object obj = null;
        boolean flag1 = a.m();
        kp kp;
        if (flag1 && !a.h().e)
        {
            kp = null;
        } else
        {
            kp = d;
        }
        if (!flag1)
        {
            obj = new akn(a, e);
        }
        a(new AdOverlayInfoParcel(kp, ((mk) (obj)), g, l, a, flag, i1, s1, a.l(), i));
    }

    public final void a(boolean flag, int i1, String s1, String s2)
    {
        boolean flag1 = a.m();
        kp kp;
        Object obj;
        if (flag1 && !a.h().e)
        {
            kp = null;
        } else
        {
            kp = d;
        }
        if (flag1)
        {
            obj = null;
        } else
        {
            obj = new akn(a, e);
        }
        a(new AdOverlayInfoParcel(kp, ((mk) (obj)), g, l, a, flag, i1, s1, s2, a.l(), i));
    }

    public final void b(String s1, acu acu1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        s1 = (List)b.get(s1);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s1.remove(acu1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean b()
    {
        boolean flag;
        synchronized (c)
        {
            flag = k;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        synchronized (c)
        {
            of.d("Loading blank page in WebView, 2...");
            q = true;
            a.a("about:blank");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
        if (b())
        {
            m.a();
        }
    }

    public final void e()
    {
        synchronized (c)
        {
            b.clear();
            d = null;
            e = null;
            f = null;
            g = null;
            h = false;
            k = false;
            i = null;
            l = null;
            if (o != null)
            {
                o.a(true);
                o = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void f()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        me me1;
        h = false;
        k = true;
        a.q();
        me1 = a.f();
        if (me1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        kx.a();
        if (oe.b())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        ajc.a.post(new _cls1(me1));
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        me1.l();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onLoadResource(WebView webview, String s1)
    {
        of.d((new StringBuilder("Loading resource: ")).append(s1).toString());
        webview = Uri.parse(s1);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            b(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s1)
    {
label0:
        {
            synchronized (c)
            {
                if (!q || !"about:blank".equals(s1))
                {
                    break label0;
                }
                of.d("Blank page loaded, 1...");
                a.p();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        r = true;
        j();
        return;
        s1;
        webview;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
    {
        Uri uri;
        of.d((new StringBuilder("AdWebView shouldOverrideUrlLoading: ")).append(s1).toString());
        uri = Uri.parse(s1);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        b(uri);
_L4:
        return true;
_L2:
        if (h && webview == a && a(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s1);
        }
        if (a.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        amb amb1 = a.k();
        webview = uri;
        if (amb1 != null)
        {
            webview = uri;
            try
            {
                if (amb1.a(uri))
                {
                    webview = amb1.a(uri, a.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                of.e((new StringBuilder("Unable to append parameter to URL: ")).append(s1).toString());
                webview = uri;
            }
        }
        if (n == null || n.b())
        {
            a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            n.a(s1);
        }
        continue; /* Loop/switch isn't completed */
        of.e((new StringBuilder("AdWebView unable to handle URL: ")).append(s1).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    /* member class not found */
    class _cls1 {}

}
