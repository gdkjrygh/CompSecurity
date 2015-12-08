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
//            dl, gu, bl, cd, 
//            gi, gr, ay, dr, 
//            dp, cf, v, ca, 
//            cc, ci, ch, gq, 
//            l, k, do, cb, 
//            cg, ce, t, ds, 
//            dv

public class gv extends WebViewClient
{
    public static interface a
    {

        public abstract void a(gu gu1);
    }


    private final Object mH;
    protected final gu mo;
    private cb pP;
    private cg qa;
    private ce qc;
    private v qd;
    private a tu;
    private final HashMap xe;
    private t xf;
    private ds xg;
    private boolean xh;
    private boolean xi;
    private dv xj;
    private final dl xk;

    public gv(gu gu1, boolean flag)
    {
        this(gu1, flag, new dl(gu1, gu1.getContext(), new bl(gu1.getContext())));
    }

    gv(gu gu1, boolean flag, dl dl1)
    {
        xe = new HashMap();
        mH = new Object();
        xh = false;
        mo = gu1;
        xi = flag;
        xk = dl1;
    }

    private static boolean d(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void e(Uri uri)
    {
        String s = uri.getPath();
        cd cd1 = (cd)xe.get(s);
        if (cd1 != null)
        {
            uri = gi.c(uri);
            if (gr.v(2))
            {
                gr.V((new StringBuilder()).append("Received GMSG: ").append(s).toString());
                String s1;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); gr.V((new StringBuilder()).append("  ").append(s1).append(": ").append((String)uri.get(s1)).toString()))
                {
                    s1 = (String)iterator.next();
                }

            }
            cd1.a(mo, uri);
            return;
        } else
        {
            gr.V((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
            return;
        }
    }

    public final void A(boolean flag)
    {
        xh = flag;
    }

    public final void a(do do1)
    {
        ds ds = null;
        boolean flag = mo.dH();
        t t;
        if (flag && !mo.ac().oq)
        {
            t = null;
        } else
        {
            t = xf;
        }
        if (!flag)
        {
            ds = xg;
        }
        a(new dr(do1, t, ds, xj, mo.dG()));
    }

    protected void a(dr dr1)
    {
        dp.a(mo.getContext(), dr1);
    }

    public final void a(a a1)
    {
        tu = a1;
    }

    public void a(t t, ds ds, cb cb, dv dv, boolean flag, ce ce, cg cg1, 
            v v1)
    {
        a(t, ds, cb, dv, flag, ce, v1);
        a("/setInterstitialProperties", ((cd) (new cf(cg1))));
        qa = cg1;
    }

    public void a(t t, ds ds, cb cb, dv dv, boolean flag, ce ce, v v1)
    {
        v v2 = v1;
        if (v1 == null)
        {
            v2 = new v(false);
        }
        a("/appEvent", ((cd) (new ca(cb))));
        a("/canOpenURLs", cc.pR);
        a("/canOpenIntents", cc.pS);
        a("/click", cc.pT);
        a("/close", cc.pU);
        a("/customClose", cc.pV);
        a("/httpTrack", cc.pW);
        a("/log", cc.pX);
        a("/open", ((cd) (new ci(ce, v2))));
        a("/touch", cc.pY);
        a("/video", cc.pZ);
        a("/mraid", ((cd) (new ch())));
        xf = t;
        xg = ds;
        pP = cb;
        qc = ce;
        xj = dv;
        qd = v2;
        A(flag);
    }

    public final void a(String s, cd cd1)
    {
        xe.put(s, cd1);
    }

    public final void a(boolean flag, int i)
    {
        t t;
        if (mo.dH() && !mo.ac().oq)
        {
            t = null;
        } else
        {
            t = xf;
        }
        a(new dr(t, xg, xj, mo, flag, i, mo.dG()));
    }

    public final void a(boolean flag, int i, String s)
    {
        ds ds = null;
        boolean flag1 = mo.dH();
        t t;
        if (flag1 && !mo.ac().oq)
        {
            t = null;
        } else
        {
            t = xf;
        }
        if (!flag1)
        {
            ds = xg;
        }
        a(new dr(t, ds, pP, xj, mo, flag, i, s, mo.dG(), qc));
    }

    public final void a(boolean flag, int i, String s, String s1)
    {
        boolean flag1 = mo.dH();
        t t;
        ds ds;
        if (flag1 && !mo.ac().oq)
        {
            t = null;
        } else
        {
            t = xf;
        }
        if (flag1)
        {
            ds = null;
        } else
        {
            ds = xg;
        }
        a(new dr(t, ds, pP, xj, mo, flag, i, s, s1, mo.dG(), qc));
    }

    public final void cg()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        dp dp1;
        xh = false;
        xi = true;
        dp1 = mo.dC();
        if (dp1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (gq.dB())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        gq.wR.post(new Runnable(dp1) {

            final dp xl;
            final gv xm;

            public void run()
            {
                xl.cg();
            }

            
            {
                xm = gv.this;
                xl = dp1;
                super();
            }
        });
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        dp1.cg();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public v dM()
    {
        return qd;
    }

    public boolean dN()
    {
        boolean flag;
        synchronized (mH)
        {
            flag = xi;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void dO()
    {
        if (dN())
        {
            xk.bY();
        }
    }

    public final void onLoadResource(WebView webview, String s)
    {
        gr.V((new StringBuilder()).append("Loading resource: ").append(s).toString());
        webview = Uri.parse(s);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            e(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (tu != null)
        {
            tu.a(mo);
            tu = null;
        }
    }

    public final void reset()
    {
        synchronized (mH)
        {
            xe.clear();
            xf = null;
            xg = null;
            tu = null;
            pP = null;
            xh = false;
            xi = false;
            qc = null;
            xj = null;
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
        gr.V((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        e(uri);
_L4:
        return true;
_L2:
        if (xh && webview == mo && d(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (mo.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        k k1 = mo.dF();
        webview = uri;
        if (k1 != null)
        {
            webview = uri;
            try
            {
                if (k1.b(uri))
                {
                    webview = k1.a(uri, mo.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                gr.W((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                webview = uri;
            }
        }
        if (qd == null || qd.az())
        {
            a(new do("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            qd.d(s);
        }
        continue; /* Loop/switch isn't completed */
        gr.W((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }
}
