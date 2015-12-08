// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ah, ek, em, bp, 
//            ab, bq, u, w, 
//            eh, ep, eq, la, 
//            kz, bn, lj, bv, 
//            v, ca

public class eo extends WebViewClient
{

    protected final em a;
    private final HashMap b = new HashMap();
    private final Object c = new Object();
    private lj d;
    private bv e;
    private eq f;
    private v g;
    private boolean h;
    private boolean i;
    private ca j;

    public eo(em em1, boolean flag)
    {
        h = false;
        a = em1;
        i = flag;
    }

    private void a(Uri uri)
    {
        String s = uri.getPath();
        ah ah1 = (ah)b.get(s);
        if (ah1 != null)
        {
            HashMap hashmap = new HashMap();
            Object obj = new UrlQuerySanitizer();
            ((UrlQuerySanitizer) (obj)).setAllowUnregisteredParamaters(true);
            ((UrlQuerySanitizer) (obj)).setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            ((UrlQuerySanitizer) (obj)).parseUrl(uri.toString());
            for (uri = ((UrlQuerySanitizer) (obj)).getParameterList().iterator(); uri.hasNext(); hashmap.put(((android.net.UrlQuerySanitizer.ParameterValuePair) (obj)).mParameter, ((android.net.UrlQuerySanitizer.ParameterValuePair) (obj)).mValue))
            {
                obj = (android.net.UrlQuerySanitizer.ParameterValuePair)uri.next();
            }

            if (ek.a(2))
            {
                ek.c((new StringBuilder("Received GMSG: ")).append(s).toString());
                String s1;
                for (uri = hashmap.keySet().iterator(); uri.hasNext(); ek.c((new StringBuilder("  ")).append(s1).append(": ").append((String)hashmap.get(s1)).toString()))
                {
                    s1 = (String)uri.next();
                }

            }
            ah1.a(a, hashmap);
            return;
        } else
        {
            ek.d((new StringBuilder("No GMSG handler found for GMSG: ")).append(uri).toString());
            return;
        }
    }

    private void a(bq bq1)
    {
        bp.a(a.getContext(), bq1);
    }

    public final void a(bn bn1)
    {
        bv bv = null;
        boolean flag = a.h();
        lj lj;
        if (flag && !a.d().f)
        {
            lj = null;
        } else
        {
            lj = d;
        }
        if (!flag)
        {
            bv = e;
        }
        a(new bq(bn1, lj, bv, j, a.g()));
    }

    public final void a(eq eq1)
    {
        f = eq1;
    }

    public final void a(lj lj, bv bv, v v, ca ca, boolean flag)
    {
        a("/appEvent", ((ah) (new u(v))));
        a("/canOpenURLs", w.a);
        a("/click", w.b);
        a("/close", w.c);
        a("/customClose", w.d);
        a("/httpTrack", w.e);
        a("/log", w.f);
        a("/open", w.g);
        a("/touch", w.h);
        a("/video", w.i);
        d = lj;
        e = bv;
        g = v;
        j = ca;
        h = flag;
    }

    public final void a(String s, ah ah1)
    {
        b.put(s, ah1);
    }

    public final void a(boolean flag, int k)
    {
        lj lj;
        if (a.h() && !a.d().f)
        {
            lj = null;
        } else
        {
            lj = d;
        }
        a(new bq(lj, e, j, a, flag, k, a.g()));
    }

    public final void a(boolean flag, int k, String s)
    {
        bv bv = null;
        boolean flag1 = a.h();
        lj lj;
        if (flag1 && !a.d().f)
        {
            lj = null;
        } else
        {
            lj = d;
        }
        if (!flag1)
        {
            bv = e;
        }
        a(new bq(lj, bv, g, j, a, flag, k, s, a.g()));
    }

    public final void a(boolean flag, int k, String s, String s1)
    {
        bv bv = null;
        boolean flag1 = a.h();
        lj lj;
        if (flag1 && !a.d().f)
        {
            lj = null;
        } else
        {
            lj = d;
        }
        if (!flag1)
        {
            bv = e;
        }
        a(new bq(lj, bv, g, j, a, flag, k, s, s1, a.g()));
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (c)
        {
            flag = i;
        }
        return flag;
    }

    public final void b()
    {
        synchronized (c)
        {
            b.clear();
            d = null;
            e = null;
            f = null;
            g = null;
            h = false;
            i = false;
            j = null;
        }
    }

    public final void c()
    {
        h = false;
    }

    public final void d()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        bp bp1;
        h = false;
        i = true;
        bp1 = a.c();
        if (bp1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (eh.b())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        eh.a.post(new ep(this, bp1));
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        bp1.j();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (f != null)
        {
            f.a(a);
            f = null;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri;
        ek.c((new StringBuilder("AdWebView shouldOverrideUrlLoading: ")).append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        a(uri);
_L4:
        return true;
_L2:
        if (h && webview == a)
        {
            String s1 = uri.getScheme();
            boolean flag;
            if ("http".equalsIgnoreCase(s1) || "https".equalsIgnoreCase(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return super.shouldOverrideUrlLoading(webview, s);
            }
        }
        if (a.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_225;
        }
        kz kz1 = a.f();
        webview = uri;
        if (kz1 != null)
        {
            webview = uri;
            try
            {
                if (kz1.a(uri))
                {
                    webview = kz1.a(uri, a.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                ek.d((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
                webview = uri;
            }
        }
        a(new bn("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        continue; /* Loop/switch isn't completed */
        ek.d((new StringBuilder("AdWebView unable to handle URL: ")).append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }
}
