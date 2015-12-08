// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            cj, fl, aj, a, 
//            es, fj, bg, cb, 
//            zzeo, cm, zzhy, is, 
//            fo, lf, au, aw, 
//            fp, bj, bm, zzba, 
//            x, fi, fn, co, 
//            hw, hj, zzek, s, 
//            cv, av, bh, bi, 
//            da, cl

public class fm extends WebViewClient
{

    protected final fl a;
    private final HashMap b;
    private final Object c;
    private s d;
    private cv e;
    private fo f;
    private av g;
    private boolean h;
    private bh i;
    private bi j;
    private boolean k;
    private da l;
    private final cj m;
    private lf n;
    private cb o;
    private cl p;
    private boolean q;
    private boolean r;
    private int s;

    public fm(fl fl1, boolean flag)
    {
        this(fl1, flag, new cj(fl1, fl1.d(), new aj(fl1.getContext())));
    }

    private fm(fl fl1, boolean flag, cj cj1)
    {
        b = new HashMap();
        c = new Object();
        h = false;
        a = fl1;
        k = flag;
        m = cj1;
    }

    private void a(Uri uri)
    {
        String s1 = uri.getPath();
        Object obj = (List)b.get(s1);
        if (obj != null)
        {
            com.google.android.gms.internal.a.c();
            uri = es.a(uri);
            if (fj.a(2))
            {
                fj.d((new StringBuilder("Received GMSG: ")).append(s1).toString());
                String s2;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); fj.d((new StringBuilder("  ")).append(s2).append(": ").append((String)uri.get(s2)).toString()))
                {
                    s2 = (String)iterator.next();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((bg)((Iterator) (obj)).next()).a(a, uri)) { }
        } else
        {
            fj.d((new StringBuilder("No GMSG handler found for GMSG: ")).append(uri).toString());
        }
    }

    static void a(fm fm1)
    {
        fm1.s = fm1.s + 1;
        fm1.g();
    }

    private void a(zzeo zzeo1)
    {
        boolean flag1 = false;
        Context context;
        Intent intent;
        boolean flag;
        if (o != null)
        {
            flag = o.a();
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.a.b();
        context = a.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        if (zzeo1.l == 4 && zzeo1.d == null)
        {
            Object obj;
            if (zzeo1.c != null)
            {
                obj = zzeo1.c;
            }
            com.google.android.gms.internal.a.a();
            obj = zzeo1.b;
            zzeo1 = zzeo1.j;
            cm.a(context, ((zzek) (obj)));
            return;
        }
        intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", zzeo1.n.e);
        intent.putExtra("shouldCallOnOverlayOpened", flag1);
        zzeo.a(intent, zzeo1);
        if (!is.e())
        {
            intent.addFlags(0x80000);
        }
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }

    private void a(String s1, bg bg1)
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
        obj = new ArrayList();
        b.put(s1, obj);
        ((List) (obj)).add(bg1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static void b(fm fm1)
    {
        fm1.s = fm1.s - 1;
        fm1.g();
    }

    static void c(fm fm1)
    {
        fm1.r = true;
        fm1.g();
    }

    private void g()
    {
        if (f != null && (q && s == 0 || r))
        {
            f.a(a);
            f = null;
        }
    }

    public final lf a()
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

    public final void a(av av, da da, bh bh, lf lf1)
    {
        lf lf2 = lf1;
        if (lf1 == null)
        {
            lf2 = new lf((byte)0);
        }
        o = new cb(a);
        a("/appEvent", ((bg) (new au(av))));
        a("/canOpenURLs", aw.b);
        a("/canOpenIntents", aw.c);
        a("/click", aw.d);
        a("/close", aw.e);
        a("/customClose", aw.f);
        a("/delayPageLoaded", ((bg) (new fp(this, (byte)0))));
        a("/httpTrack", aw.g);
        a("/log", aw.h);
        a("/mraid", ((bg) (new bj(lf2, o))));
        a("/open", ((bg) (new bm(bh, lf2, o))));
        a("/touch", aw.i);
        a("/video", aw.j);
        d = null;
        e = null;
        g = av;
        i = bh;
        l = da;
        n = lf2;
        p = null;
        j = null;
        h = true;
    }

    public final void a(fo fo1)
    {
        f = fo1;
    }

    public final void a(zzek zzek1)
    {
        cv cv = null;
        boolean flag = a.k();
        s s1;
        if (flag && !a.f().e)
        {
            s1 = null;
        } else
        {
            s1 = d;
        }
        if (!flag)
        {
            cv = e;
        }
        a(new zzeo(zzek1, s1, cv, l, a.j()));
    }

    public final void a(boolean flag, int i1)
    {
        s s1;
        if (a.k() && !a.f().e)
        {
            s1 = null;
        } else
        {
            s1 = d;
        }
        a(new zzeo(s1, e, l, a, flag, i1, a.j()));
    }

    public final void a(boolean flag, int i1, String s1)
    {
        cv cv = null;
        boolean flag1 = a.k();
        s s2;
        if (flag1 && !a.f().e)
        {
            s2 = null;
        } else
        {
            s2 = d;
        }
        if (!flag1)
        {
            cv = e;
        }
        a(new zzeo(s2, cv, g, l, a, flag, i1, s1, a.j(), i));
    }

    public final void a(boolean flag, int i1, String s1, String s2)
    {
        boolean flag1 = a.k();
        s s3;
        cv cv;
        if (flag1 && !a.f().e)
        {
            s3 = null;
        } else
        {
            s3 = d;
        }
        if (flag1)
        {
            cv = null;
        } else
        {
            cv = e;
        }
        a(new zzeo(s3, cv, g, l, a, flag, i1, s1, s2, a.j(), i));
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
        if (b())
        {
            m.a();
        }
    }

    public final void d()
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

    public final void e()
    {
        h = false;
    }

    public final void f()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        co co1;
        h = false;
        k = true;
        a.m();
        co1 = a.e();
        if (co1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        x.a();
        if (fi.a())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        fi.a.post(new fn(this, co1));
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        co1.k();
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
        fj.d((new StringBuilder("Loading resource: ")).append(s1).toString());
        webview = Uri.parse(s1);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            a(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s1)
    {
        q = true;
        g();
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
    {
        Uri uri;
        fj.d((new StringBuilder("AdWebView shouldOverrideUrlLoading: ")).append(s1).toString());
        uri = Uri.parse(s1);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        a(uri);
_L4:
        return true;
_L2:
        if (h && webview == a)
        {
            String s2 = uri.getScheme();
            boolean flag;
            if ("http".equalsIgnoreCase(s2) || "https".equalsIgnoreCase(s2))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return super.shouldOverrideUrlLoading(webview, s1);
            }
        }
        if (a.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_258;
        }
        hj hj1 = a.i();
        webview = uri;
        if (hj1 != null)
        {
            webview = uri;
            try
            {
                if (hj1.a(uri))
                {
                    a.getContext();
                    webview = hj1.b(uri);
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                fj.e((new StringBuilder("Unable to append parameter to URL: ")).append(s1).toString());
                webview = uri;
            }
        }
        if (n == null || n.a())
        {
            a(new zzek("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            fj.a("Action was blocked because no click was detected.");
        }
        continue; /* Loop/switch isn't completed */
        fj.e((new StringBuilder("AdWebView unable to handle URL: ")).append(s1).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }
}
