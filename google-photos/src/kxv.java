// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class kxv extends WebViewClient
{

    private static final String r[] = {
        "UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", 
        "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"
    };
    private static final String s[] = {
        "NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"
    };
    public final kxu a;
    final HashMap b;
    final Object c;
    public k d;
    public jpc e;
    public kxx f;
    public k g;
    k h;
    public boolean i;
    public k j;
    boolean k;
    public k l;
    public final kvt m;
    public jpz n;
    public kvl o;
    public boolean p;
    boolean q;
    private boolean t;
    private boolean u;
    private int v;

    public kxv(kxu kxu1, boolean flag)
    {
        this(kxu1, flag, new kvt(kxu1, kxu1.e(), new kta(kxu1.getContext())), null);
    }

    private kxv(kxu kxu1, boolean flag, kvt kvt1, kvl kvl1)
    {
        b = new HashMap();
        c = new Object();
        i = false;
        a = kxu1;
        k = flag;
        m = kvt1;
        o = null;
    }

    static k a(kxv kxv1, k k1)
    {
        kxv1.h = null;
        return null;
    }

    private void a(Context context, String s1, String s2, String s3)
    {
        Object obj;
        obj = ktk.k;
        if (!((Boolean)jqc.i().a(((ktd) (obj)))).booleanValue())
        {
            return;
        }
        obj = new Bundle();
        ((Bundle) (obj)).putString("err", s1);
        ((Bundle) (obj)).putString("code", s2);
        if (TextUtils.isEmpty(s3)) goto _L2; else goto _L1
_L1:
        s1 = Uri.parse(s3);
        if (s1.getHost() == null) goto _L2; else goto _L3
_L3:
        s1 = s1.getHost();
_L5:
        ((Bundle) (obj)).putString("host", s1);
        jqc.c();
        kwz.a(context, a.m().b, "gmob-apps", ((Bundle) (obj)), true);
        return;
_L2:
        s1 = "";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(Uri uri)
    {
        String s1 = uri.getPath();
        Object obj = (List)b.get(s1);
        if (obj != null)
        {
            jqc.c();
            uri = kwz.a(uri);
            if (b.p(2))
            {
                (new StringBuilder("Received GMSG: ")).append(s1).toString();
                b.p(2);
                for (Iterator iterator = uri.keySet().iterator(); iterator.hasNext(); b.p(2))
                {
                    String s2 = (String)iterator.next();
                    (new StringBuilder("  ")).append(s2).append(": ").append((String)uri.get(s2)).toString();
                }

            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((kuf)((Iterator) (obj)).next()).a(a, uri)) { }
        } else
        {
            (new StringBuilder("No GMSG handler found for GMSG: ")).append(uri).toString();
            b.p(2);
        }
    }

    static void a(kxv kxv1)
    {
        synchronized (kxv1.c) { }
        kxv1.v = kxv1.v + 1;
        kxv1.b();
        return;
        kxv1;
        obj;
        JVM INSTR monitorexit ;
        throw kxv1;
    }

    private void b()
    {
        if (f != null && (t && v <= 0 || u))
        {
            f.a(a);
            f = null;
        }
    }

    static void b(kxv kxv1)
    {
        kxv1.v = kxv1.v - 1;
        kxv1.b();
    }

    static void c(kxv kxv1)
    {
        kxv1.u = true;
        kxv1.b();
    }

    static k d(kxv kxv1)
    {
        return kxv1.h;
    }

    public final void a(AdLauncherIntentInfoParcel adlauncherintentinfoparcel)
    {
        jpc jpc = null;
        boolean flag = a.n();
        k k1;
        if (flag && !a.i().e)
        {
            k1 = null;
        } else
        {
            k1 = d;
        }
        if (!flag)
        {
            jpc = e;
        }
        a(new AdOverlayInfoParcel(adlauncherintentinfoparcel, k1, jpc, l, a.m()));
    }

    public final void a(AdOverlayInfoParcel adoverlayinfoparcel)
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
        jqc.b();
        context = a.getContext();
        if (!flag)
        {
            flag1 = true;
        }
        if (adoverlayinfoparcel.l == 4 && adoverlayinfoparcel.d == null)
        {
            jqc.a();
            jot.a(context, adoverlayinfoparcel.b, adoverlayinfoparcel.j);
            return;
        }
        intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adoverlayinfoparcel.n.e);
        intent.putExtra("shouldCallOnOverlayOpened", flag1);
        AdOverlayInfoParcel.a(intent, adoverlayinfoparcel);
        if (!c.a(21))
        {
            intent.addFlags(0x80000);
        }
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }

    public final void a(String s1, kuf kuf1)
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
        ((List) (obj)).add(kuf1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean a()
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

    public final void onLoadResource(WebView webview, String s1)
    {
        (new StringBuilder("Loading resource: ")).append(s1).toString();
        b.p(2);
        webview = Uri.parse(s1);
        if ("gmsg".equalsIgnoreCase(webview.getScheme()) && "mobileads.google.com".equalsIgnoreCase(webview.getHost()))
        {
            a(webview);
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
                b.p(2);
                a.p();
            }
            return;
        }
        webview;
        JVM INSTR monitorexit ;
        t = true;
        b();
        return;
        s1;
        webview;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void onReceivedError(WebView webview, int i1, String s1, String s2)
    {
        String s3;
        if (i1 < 0 && -i1 - 1 < r.length)
        {
            s3 = r[-i1 - 1];
        } else
        {
            s3 = String.valueOf(i1);
        }
        a(a.getContext(), "http_err", s3, s2);
        super.onReceivedError(webview, i1, s1, s2);
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        if (sslerror != null)
        {
            int i1 = sslerror.getPrimaryError();
            String s1;
            if (i1 >= 0 && i1 < s.length)
            {
                s1 = s[i1];
            } else
            {
                s1 = String.valueOf(i1);
            }
            a(a.getContext(), "ssl_err", s1, jqc.e().a(sslerror));
        }
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
    }

    public boolean shouldOverrideKeyEvent(WebView webview, KeyEvent keyevent)
    {
        switch (keyevent.getKeyCode())
        {
        default:
            return false;

        case 79: // 'O'
        case 85: // 'U'
        case 86: // 'V'
        case 87: // 'W'
        case 88: // 'X'
        case 89: // 'Y'
        case 90: // 'Z'
        case 91: // '['
        case 126: // '~'
        case 127: // '\177'
        case 128: 
        case 129: 
        case 130: 
        case 222: 
            return true;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
    {
        Object obj;
        (new StringBuilder("AdWebView shouldOverrideUrlLoading: ")).append(s1).toString();
        b.p(2);
        obj = Uri.parse(s1);
        if (!"gmsg".equalsIgnoreCase(((Uri) (obj)).getScheme()) || !"mobileads.google.com".equalsIgnoreCase(((Uri) (obj)).getHost())) goto _L2; else goto _L1
_L1:
        a(((Uri) (obj)));
_L4:
        return true;
_L2:
        if (i && webview == a)
        {
            String s2 = ((Uri) (obj)).getScheme();
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
                if (!p)
                {
                    p = true;
                    if (d != null)
                    {
                        obj = ktk.h;
                        ((Boolean)jqc.i().a(((ktd) (obj)))).booleanValue();
                    }
                }
                return super.shouldOverrideUrlLoading(webview, s1);
            }
        }
        if (a.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_299;
        }
        ksq ksq1 = a.l();
        webview = ((WebView) (obj));
        if (ksq1 != null)
        {
            webview = ((WebView) (obj));
            try
            {
                if (ksq1.a(((Uri) (obj))))
                {
                    webview = ksq1.a(((Uri) (obj)), a.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                b.m((new StringBuilder("Unable to append parameter to URL: ")).append(s1).toString());
                webview = ((WebView) (obj));
            }
        }
        if (n == null || n.a())
        {
            a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        } else
        {
            n.a(s1);
        }
        continue; /* Loop/switch isn't completed */
        b.m((new StringBuilder("AdWebView unable to handle URL: ")).append(s1).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

}
