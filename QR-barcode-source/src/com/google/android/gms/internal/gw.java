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
//            dg, gv, bl, by, 
//            gj, gs, ay, dm, 
//            dk, ca, v, bv, 
//            bx, cd, cc, gr, 
//            l, k, dj, cb, 
//            bz, bw, t, dn, 
//            dq

public class gw extends WebViewClient
{
    public static interface a
    {

        public abstract void a(gv gv1);
    }


    protected final gv md;
    private final Object mw;
    private cb pJ;
    private bz pL;
    private v pM;
    private bw pz;
    private a tg;
    private final HashMap wP;
    private t wQ;
    private dn wR;
    private boolean wS;
    private boolean wT;
    private dq wU;
    private final dg wV;

    public gw(gv gv1, boolean flag)
    {
        this(gv1, flag, new dg(gv1, gv1.getContext(), new bl(gv1.getContext())));
    }

    gw(gv gv1, boolean flag, dg dg1)
    {
        wP = new HashMap();
        mw = new Object();
        wS = false;
        md = gv1;
        wT = flag;
        wV = dg1;
    }

    private static boolean d(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void e(Uri uri)
    {
        String s = uri.getPath();
        by by1 = (by)wP.get(s);
        if (by1 != null)
        {
            uri = gj.c(uri);
            if (gs.u(2))
            {
                gs.V((new StringBuilder()).append("Received GMSG: ").append(s).toString());
                String s1;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); gs.V((new StringBuilder()).append("  ").append(s1).append(": ").append((String)uri.get(s1)).toString()))
                {
                    s1 = (String)iterator.next();
                }

            }
            by1.a(md, uri);
            return;
        } else
        {
            gs.V((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
            return;
        }
    }

    public final void a(dj dj1)
    {
        dn dn = null;
        boolean flag = md.dy();
        t t;
        if (flag && !md.Y().og)
        {
            t = null;
        } else
        {
            t = wQ;
        }
        if (!flag)
        {
            dn = wR;
        }
        a(new dm(dj1, t, dn, wU, md.dx()));
    }

    protected void a(dm dm1)
    {
        dk.a(md.getContext(), dm1);
    }

    public final void a(a a1)
    {
        tg = a1;
    }

    public void a(t t, dn dn, bw bw, dq dq, boolean flag, bz bz, cb cb, 
            v v1)
    {
        a(t, dn, bw, dq, flag, bz, v1);
        a("/setInterstitialProperties", ((by) (new ca(cb))));
        pJ = cb;
    }

    public void a(t t, dn dn, bw bw, dq dq, boolean flag, bz bz, v v1)
    {
        v v2 = v1;
        if (v1 == null)
        {
            v2 = new v(false);
        }
        a("/appEvent", ((by) (new bv(bw))));
        a("/canOpenURLs", bx.pB);
        a("/click", bx.pC);
        a("/close", bx.pD);
        a("/customClose", bx.pE);
        a("/httpTrack", bx.pF);
        a("/log", bx.pG);
        a("/open", ((by) (new cd(bz, v2))));
        a("/touch", bx.pH);
        a("/video", bx.pI);
        a("/mraid", ((by) (new cc())));
        wQ = t;
        wR = dn;
        pz = bw;
        pL = bz;
        wU = dq;
        pM = v2;
        y(flag);
    }

    public final void a(String s, by by1)
    {
        wP.put(s, by1);
    }

    public final void a(boolean flag, int i)
    {
        t t;
        if (md.dy() && !md.Y().og)
        {
            t = null;
        } else
        {
            t = wQ;
        }
        a(new dm(t, wR, wU, md, flag, i, md.dx()));
    }

    public final void a(boolean flag, int i, String s)
    {
        dn dn = null;
        boolean flag1 = md.dy();
        t t;
        if (flag1 && !md.Y().og)
        {
            t = null;
        } else
        {
            t = wQ;
        }
        if (!flag1)
        {
            dn = wR;
        }
        a(new dm(t, dn, pz, wU, md, flag, i, s, md.dx(), pL));
    }

    public final void a(boolean flag, int i, String s, String s1)
    {
        boolean flag1 = md.dy();
        t t;
        dn dn;
        if (flag1 && !md.Y().og)
        {
            t = null;
        } else
        {
            t = wQ;
        }
        if (flag1)
        {
            dn = null;
        } else
        {
            dn = wR;
        }
        a(new dm(t, dn, pz, wU, md, flag, i, s, s1, md.dx(), pL));
    }

    public final void bX()
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        dk dk1;
        wS = false;
        wT = true;
        dk1 = md.dt();
        if (dk1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (gr.ds())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        gr.wC.post(new Runnable(dk1) {

            final dk wW;
            final gw wX;

            public void run()
            {
                wW.bX();
            }

            
            {
                wX = gw.this;
                wW = dk1;
                super();
            }
        });
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        dk1.bX();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public v dD()
    {
        return pM;
    }

    public boolean dE()
    {
        boolean flag;
        synchronized (mw)
        {
            flag = wT;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void dF()
    {
        if (dE())
        {
            wV.bP();
        }
    }

    public final void onLoadResource(WebView webview, String s)
    {
        gs.V((new StringBuilder()).append("Loading resource: ").append(s).toString());
        webview = Uri.parse(s);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            e(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (tg != null)
        {
            tg.a(md);
            tg = null;
        }
    }

    public final void reset()
    {
        synchronized (mw)
        {
            wP.clear();
            wQ = null;
            wR = null;
            tg = null;
            pz = null;
            wS = false;
            wT = false;
            pL = null;
            wU = null;
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
        gs.V((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        e(uri);
_L4:
        return true;
_L2:
        if (wS && webview == md && d(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (md.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        k k1 = md.dw();
        webview = uri;
        if (k1 != null)
        {
            webview = uri;
            try
            {
                if (k1.b(uri))
                {
                    webview = k1.a(uri, md.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                gs.W((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                webview = uri;
            }
        }
        if (pM == null || pM.av())
        {
            a(new dj("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            pM.d(s);
        }
        continue; /* Loop/switch isn't completed */
        gs.W((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void y(boolean flag)
    {
        wS = flag;
    }
}
