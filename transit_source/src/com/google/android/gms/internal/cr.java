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
//            cq, bf, ai, cn, 
//            cm, x, bh, af, 
//            ah, i, h, be, 
//            ag, q, bi, bl

public class cr extends WebViewClient
{
    public static interface a
    {

        public abstract void a(cq cq1);
    }


    private final Object eJ = new Object();
    private ag ey;
    protected final cq fG;
    private final HashMap hZ = new HashMap();
    private q ia;
    private bi ib;
    private a ic;
    private boolean id;
    private boolean ie;
    private bl _fldif;

    public cr(cq cq1, boolean flag)
    {
        id = false;
        fG = cq1;
        ie = flag;
    }

    private void a(bh bh1)
    {
        bf.a(fG.getContext(), bh1);
    }

    private static boolean b(Uri uri)
    {
        uri = uri.getScheme();
        return "http".equalsIgnoreCase(uri) || "https".equalsIgnoreCase(uri);
    }

    private void c(Uri uri)
    {
        String s = uri.getPath();
        ai ai1 = (ai)hZ.get(s);
        if (ai1 != null)
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

            if (cn.k(2))
            {
                cn.p((new StringBuilder()).append("Received GMSG: ").append(s).toString());
                String s1;
                for (uri = hashmap.keySet().iterator(); uri.hasNext(); cn.p((new StringBuilder()).append("  ").append(s1).append(": ").append((String)hashmap.get(s1)).toString()))
                {
                    s1 = (String)uri.next();
                }

            }
            ai1.a(fG, hashmap);
            return;
        } else
        {
            cn.q((new StringBuilder()).append("No GMSG handler found for GMSG: ").append(uri).toString());
            return;
        }
    }

    public final void S()
    {
        Object obj = eJ;
        obj;
        JVM INSTR monitorenter ;
        bf bf1;
        id = false;
        ie = true;
        bf1 = fG.au();
        if (bf1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (cm.ar())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        cm.hO.post(new Runnable(bf1) {

            final bf ig;
            final cr ih;

            public void run()
            {
                ig.S();
            }

            
            {
                ih = cr.this;
                ig = bf1;
                super();
            }
        });
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        bf1.S();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(be be1)
    {
        bi bi = null;
        boolean flag = fG.az();
        q q;
        if (flag && !fG.av().ex)
        {
            q = null;
        } else
        {
            q = ia;
        }
        if (!flag)
        {
            bi = ib;
        }
        a(new bh(be1, q, bi, _fldif, fG.ay()));
    }

    public final void a(a a1)
    {
        ic = a1;
    }

    public void a(q q, bi bi, ag ag, bl bl, boolean flag)
    {
        a("/appEvent", ((ai) (new af(ag))));
        a("/canOpenURLs", ah.ez);
        a("/click", ah.eA);
        a("/close", ah.eB);
        a("/customClose", ah.eC);
        a("/httpTrack", ah.eD);
        a("/log", ah.eE);
        a("/open", ah.eF);
        a("/touch", ah.eG);
        a("/video", ah.eH);
        ia = q;
        ib = bi;
        ey = ag;
        _fldif = bl;
        j(flag);
    }

    public final void a(String s, ai ai1)
    {
        hZ.put(s, ai1);
    }

    public final void a(boolean flag, int k)
    {
        q q;
        if (fG.az() && !fG.av().ex)
        {
            q = null;
        } else
        {
            q = ia;
        }
        a(new bh(q, ib, _fldif, fG, flag, k, fG.ay()));
    }

    public final void a(boolean flag, int k, String s)
    {
        bi bi = null;
        boolean flag1 = fG.az();
        q q;
        if (flag1 && !fG.av().ex)
        {
            q = null;
        } else
        {
            q = ia;
        }
        if (!flag1)
        {
            bi = ib;
        }
        a(new bh(q, bi, ey, _fldif, fG, flag, k, s, fG.ay()));
    }

    public final void a(boolean flag, int k, String s, String s1)
    {
        bi bi = null;
        boolean flag1 = fG.az();
        q q;
        if (flag1 && !fG.av().ex)
        {
            q = null;
        } else
        {
            q = ia;
        }
        if (!flag1)
        {
            bi = ib;
        }
        a(new bh(q, bi, ey, _fldif, fG, flag, k, s, s1, fG.ay()));
    }

    public boolean aD()
    {
        boolean flag;
        synchronized (eJ)
        {
            flag = ie;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void j(boolean flag)
    {
        id = flag;
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (ic != null)
        {
            ic.a(fG);
            ic = null;
        }
    }

    public final void reset()
    {
        synchronized (eJ)
        {
            hZ.clear();
            ia = null;
            ib = null;
            ic = null;
            ey = null;
            id = false;
            ie = false;
            _fldif = null;
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
        cn.p((new StringBuilder()).append("AdWebView shouldOverrideUrlLoading: ").append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        c(uri);
_L4:
        return true;
_L2:
        if (id && b(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
        if (fG.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_188;
        }
        h h1 = fG.ax();
        webview = uri;
        if (h1 != null)
        {
            webview = uri;
            try
            {
                if (h1.a(uri))
                {
                    webview = h1.a(uri, fG.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                cn.q((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
                webview = uri;
            }
        }
        a(new be("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        continue; /* Loop/switch isn't completed */
        cn.q((new StringBuilder()).append("AdWebView unable to handle URL: ").append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }
}
