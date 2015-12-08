// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            bc, eo, eu, ex, 
//            al, ch, cf, az, 
//            bb, bg, be, et, 
//            l, k, ce, ba, 
//            bf, bd, t, ci, 
//            cl

public class ey extends WebViewClient
{
    public static interface a
    {

        public abstract void a(ex ex1);
    }


    protected final ex lN;
    private final Object ls = new Object();
    private ba mS;
    private bf nc;
    private bd nd;
    private a pN;
    private final HashMap sH = new HashMap();
    private t sI;
    private ci sJ;
    private boolean sK;
    private boolean sL;
    private cl sM;

    public ey(ex ex1, boolean flag)
    {
        sK = false;
        lN = ex1;
        sL = flag;
    }

    private static boolean d(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void e(Uri uri)
    {
        String s = uri.getPath();
        bc bc1 = (bc)sH.get(s);
        if (bc1 != null)
        {
            uri = eo.c(uri);
            if (eu.p(2))
            {
                eu.C((new StringBuilder()).append("Received GMSG: ").append(s).toString());
                String s1;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); eu.C((new StringBuilder()).append("  ").append(s1).append(": ").append((String)uri.get(s1)).toString()))
                {
                    s1 = (String)iterator.next();
                }

            }
            bc1.b(lN, uri);
            return;
        } else
        {
            eu.C((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
            return;
        }
    }

    public final void a(ce ce1)
    {
        ci ci = null;
        boolean flag = lN.ce();
        t t;
        if (flag && !lN.V().mf)
        {
            t = null;
        } else
        {
            t = sI;
        }
        if (!flag)
        {
            ci = sJ;
        }
        a(new ch(ce1, t, ci, sM, lN.cd()));
    }

    protected void a(ch ch1)
    {
        cf.a(lN.getContext(), ch1);
    }

    public final void a(a a1)
    {
        pN = a1;
    }

    public void a(t t, ci ci, ba ba, cl cl, boolean flag, bd bd)
    {
        a("/appEvent", ((bc) (new az(ba))));
        a("/canOpenURLs", bb.mU);
        a("/click", bb.mV);
        a("/close", bb.mW);
        a("/customClose", bb.mX);
        a("/httpTrack", bb.mY);
        a("/log", bb.mZ);
        a("/open", ((bc) (new bg(bd))));
        a("/touch", bb.na);
        a("/video", bb.nb);
        sI = t;
        sJ = ci;
        mS = ba;
        nd = bd;
        sM = cl;
        r(flag);
    }

    public void a(t t, ci ci, ba ba, cl cl, boolean flag, bd bd, bf bf)
    {
        a(t, ci, ba, cl, flag, bd);
        a("/setInterstitialProperties", ((bc) (new be(bf))));
        nc = bf;
    }

    public final void a(String s, bc bc1)
    {
        sH.put(s, bc1);
    }

    public final void a(boolean flag, int i)
    {
        t t;
        if (lN.ce() && !lN.V().mf)
        {
            t = null;
        } else
        {
            t = sI;
        }
        a(new ch(t, sJ, sM, lN, flag, i, lN.cd()));
    }

    public final void a(boolean flag, int i, String s)
    {
        ci ci = null;
        boolean flag1 = lN.ce();
        t t;
        if (flag1 && !lN.V().mf)
        {
            t = null;
        } else
        {
            t = sI;
        }
        if (!flag1)
        {
            ci = sJ;
        }
        a(new ch(t, ci, mS, sM, lN, flag, i, s, lN.cd(), nd));
    }

    public final void a(boolean flag, int i, String s, String s1)
    {
        boolean flag1 = lN.ce();
        t t;
        ci ci;
        if (flag1 && !lN.V().mf)
        {
            t = null;
        } else
        {
            t = sI;
        }
        if (flag1)
        {
            ci = null;
        } else
        {
            ci = sJ;
        }
        a(new ch(t, ci, mS, sM, lN, flag, i, s, s1, lN.cd(), nd));
    }

    public final void aS()
    {
        Object obj = ls;
        obj;
        JVM INSTR monitorenter ;
        cf cf1;
        sK = false;
        sL = true;
        cf1 = lN.ca();
        if (cf1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (et.bW())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        et.sv.post(new Runnable(cf1) {

            final cf sN;
            final ey sO;

            public void run()
            {
                sN.aS();
            }

            
            {
                sO = ey.this;
                sN = cf1;
                super();
            }
        });
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        cf1.aS();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean cj()
    {
        boolean flag;
        synchronized (ls)
        {
            flag = sL;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onLoadResource(WebView webview, String s)
    {
        eu.C((new StringBuilder()).append("Loading resource: ").append(s).toString());
        webview = Uri.parse(s);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            e(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (pN != null)
        {
            pN.a(lN);
            pN = null;
        }
    }

    public final void r(boolean flag)
    {
        sK = flag;
    }

    public final void reset()
    {
        synchronized (ls)
        {
            sH.clear();
            sI = null;
            sJ = null;
            pN = null;
            mS = null;
            sK = false;
            sL = false;
            nd = null;
            sM = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri;
        eu.C((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        e(uri);
_L4:
        return true;
_L2:
        if (sK && webview == lN && d(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (lN.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_196;
        }
        k k1 = lN.cc();
        webview = uri;
        if (k1 != null)
        {
            webview = uri;
            try
            {
                if (k1.b(uri))
                {
                    webview = k1.a(uri, lN.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                eu.D((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                webview = uri;
            }
        }
        a(new ce("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        continue; /* Loop/switch isn't completed */
        eu.D((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }
}
