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
//            bb, dq, dw, dz, 
//            ak, ce, cc, ay, 
//            ba, bd, dv, m, 
//            l, cb, az, bc, 
//            u, cf, ci

public class ea extends WebViewClient
{
    public static interface a
    {

        public abstract void a(dz dz1);
    }


    protected final dz lC;
    private final Object li = new Object();
    private az mF;
    private bc mP;
    private a oW;
    private final HashMap rA = new HashMap();
    private u rB;
    private cf rC;
    private boolean rD;
    private boolean rE;
    private ci rF;

    public ea(dz dz1, boolean flag)
    {
        rD = false;
        lC = dz1;
        rE = flag;
    }

    private static boolean c(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void d(Uri uri)
    {
        String s = uri.getPath();
        bb bb1 = (bb)rA.get(s);
        if (bb1 != null)
        {
            uri = dq.b(uri);
            if (dw.n(2))
            {
                dw.y((new StringBuilder()).append("Received GMSG: ").append(s).toString());
                String s1;
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); dw.y((new StringBuilder()).append("  ").append(s1).append(": ").append((String)uri.get(s1)).toString()))
                {
                    s1 = (String)iterator.next();
                }

            }
            bb1.b(lC, uri);
            return;
        } else
        {
            dw.y((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
            return;
        }
    }

    public final void a(cb cb1)
    {
        cf cf = null;
        boolean flag = lC.bL();
        u u;
        if (flag && !lC.R().lT)
        {
            u = null;
        } else
        {
            u = rB;
        }
        if (!flag)
        {
            cf = rC;
        }
        a(new ce(cb1, u, cf, rF, lC.bK()));
    }

    protected void a(ce ce1)
    {
        cc.a(lC.getContext(), ce1);
    }

    public final void a(a a1)
    {
        oW = a1;
    }

    public void a(u u, cf cf, az az, ci ci, boolean flag, bc bc)
    {
        a("/appEvent", ((bb) (new ay(az))));
        a("/canOpenURLs", ba.mH);
        a("/click", ba.mI);
        a("/close", ba.mJ);
        a("/customClose", ba.mK);
        a("/httpTrack", ba.mL);
        a("/log", ba.mM);
        a("/open", ((bb) (new bd(bc))));
        a("/touch", ba.mN);
        a("/video", ba.mO);
        rB = u;
        rC = cf;
        mF = az;
        mP = bc;
        rF = ci;
        q(flag);
    }

    public final void a(String s, bb bb1)
    {
        rA.put(s, bb1);
    }

    public final void a(boolean flag, int i)
    {
        u u;
        if (lC.bL() && !lC.R().lT)
        {
            u = null;
        } else
        {
            u = rB;
        }
        a(new ce(u, rC, rF, lC, flag, i, lC.bK()));
    }

    public final void a(boolean flag, int i, String s)
    {
        cf cf = null;
        boolean flag1 = lC.bL();
        u u;
        if (flag1 && !lC.R().lT)
        {
            u = null;
        } else
        {
            u = rB;
        }
        if (!flag1)
        {
            cf = rC;
        }
        a(new ce(u, cf, mF, rF, lC, flag, i, s, lC.bK(), mP));
    }

    public final void a(boolean flag, int i, String s, String s1)
    {
        boolean flag1 = lC.bL();
        u u;
        cf cf;
        if (flag1 && !lC.R().lT)
        {
            u = null;
        } else
        {
            u = rB;
        }
        if (flag1)
        {
            cf = null;
        } else
        {
            cf = rC;
        }
        a(new ce(u, cf, mF, rF, lC, flag, i, s, s1, lC.bK(), mP));
    }

    public final void aM()
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        cc cc1;
        rD = false;
        rE = true;
        cc1 = lC.bH();
        if (cc1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (dv.bD())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        dv.rp.post(new Runnable(cc1) {

            final cc rG;
            final ea rH;

            public void run()
            {
                rG.aM();
            }

            
            {
                rH = ea.this;
                rG = cc1;
                super();
            }
        });
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        cc1.aM();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean bP()
    {
        boolean flag;
        synchronized (li)
        {
            flag = rE;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onLoadResource(WebView webview, String s)
    {
        dw.y((new StringBuilder()).append("Loading resource: ").append(s).toString());
        webview = Uri.parse(s);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            d(webview);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (oW != null)
        {
            oW.a(lC);
            oW = null;
        }
    }

    public final void q(boolean flag)
    {
        rD = flag;
    }

    public final void reset()
    {
        synchronized (li)
        {
            rA.clear();
            rB = null;
            rC = null;
            oW = null;
            mF = null;
            rD = false;
            rE = false;
            mP = null;
            rF = null;
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
        dw.y((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        d(uri);
_L4:
        return true;
_L2:
        if (rD && webview == lC && c(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (lC.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_196;
        }
        l l1 = lC.bJ();
        webview = uri;
        if (l1 != null)
        {
            webview = uri;
            try
            {
                if (l1.a(uri))
                {
                    webview = l1.a(uri, lC.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                dw.z((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                webview = uri;
            }
        }
        a(new cb("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        continue; /* Loop/switch isn't completed */
        dw.z((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }
}
