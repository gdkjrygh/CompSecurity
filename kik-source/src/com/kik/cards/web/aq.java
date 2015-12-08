// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.StatFs;
import android.view.SurfaceView;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.k;
import com.kik.sdkutils.y;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kik.a.e.q;
import kik.android.chat.KikApplication;
import kik.android.f.a.ae;
import kik.android.util.DeviceUtils;
import kik.android.util.au;
import kik.android.util.d;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.cards.web:
//            ar, as, bb, bf, 
//            at

public abstract class aq extends WebView
{
    private final class a extends WebViewClient
    {

        final aq a;

        public final void onPageFinished(WebView webview, String s1)
        {
            if (a.a(s1))
            {
                return;
            }
            if (com.kik.cards.web.aq.k(a))
            {
                aq.l(a);
                webview.clearHistory();
            }
            if (aq.h(a) == null || !aq.h(a).equals(s1))
            {
                aq.o();
                aq.m(a).a(s1);
                aq.n(a).a(null);
                aq.a(a, true);
            }
            super.onPageFinished(webview, s1);
        }

        public final void onPageStarted(WebView webview, String s1, Bitmap bitmap)
        {
            if (a.a(s1))
            {
                return;
            }
            com.kik.cards.web.aq.b(a, s1);
            if (aq.h(a) == null || !aq.h(a).equals(s1))
            {
                com.kik.cards.web.aq.i(a);
            }
            aq.j(a).a(s1);
            super.onPageStarted(webview, s1, bitmap);
        }

        public final void onReceivedError(WebView webview, int i1, String s1, String s2)
        {
            aq.a.c("Error in {} : {}", s2, s1);
            webview = a.getContext();
            if (i1 != -10) goto _L2; else goto _L1
_L1:
            try
            {
                webview.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s2)));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Toast.makeText(webview, 0x7f0900dd, 0).show();
            }
_L4:
            aq.g(a).a(Integer.valueOf(i1));
            return;
_L2:
            if (i1 < 0)
            {
                com.kik.cards.web.aq.e(a);
                aq.a(a, s2);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            super.onReceivedSslError(webview, sslerrorhandler, sslerror);
            aq.a.c("SslError error", sslerror);
            com.kik.cards.web.aq.e(a);
            aq.a(a, com.kik.cards.web.aq.f(a));
            webview = aq.g(a);
            int i1;
            if (sslerror == null)
            {
                i1 = -11;
            } else
            {
                i1 = sslerror.getPrimaryError();
            }
            webview.a(Integer.valueOf(i1));
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            if (a.a(s1))
            {
                return false;
            }
            if (s1 == null) goto _L2; else goto _L1
_L1:
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s1));
            if (com.kik.cards.web.bf.f(s1)) goto _L4; else goto _L3
_L3:
            boolean flag = true;
_L6:
            boolean flag1;
            if (com.kik.cards.util.b.d(s1))
            {
                webview = com.kik.cards.util.b.c(s1);
                flag1 = com.kik.cards.util.b.a(a.j(), webview);
                if (flag1)
                {
                    s1 = webview;
                }
                a.loadUrl(com.kik.cards.util.b.c(s1));
                flag = false;
            } else
            {
                flag1 = false;
            }
            if (flag)
            {
                aq.o(a).a(s1);
            } else
            {
                aq.m(a).a(s1);
            }
            if (!flag)
            {
                com.kik.cards.web.aq.b(a, s1);
            }
            if (flag || flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                aq.p(a).a(s1);
            }
            if (!flag1)
            {
                aq.a(a, false);
            }
            return flag1;
_L4:
            if (webview != null && au.a(intent, webview.getContext()))
            {
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
            webview = com.kik.cards.util.b.e(s1.toLowerCase());
            if (webview != null && webview.endsWith(".pdf"))
            {
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
_L2:
            flag = false;
            if (true) goto _L6; else goto _L5
_L5:
        }

        private a()
        {
            a = aq.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static final class b
    {

        public final String a;
        public final boolean b = false;
        public final boolean c;

        public b(String s1, boolean flag)
        {
            a = s1;
            c = flag;
        }
    }


    private static final LinkedHashMap E = new LinkedHashMap(16, 0.75F, true);
    protected static final org.c.b a = org.c.c.a("K-WebLog");
    private static final org.c.b c = org.c.c.a("ExtWebView");
    private static int d = 0;
    private long A;
    private ArrayList B;
    private String C;
    private boolean D;
    ValueCallback b;
    private final k e = new k(this);
    private final k f = new k(this);
    private final k g = new k(this);
    private final k h = new k(this);
    private final k i = new k(this);
    private final k j = new k(this);
    private final k k = new k(this);
    private final k l = new k(this);
    private final k m = new k(this);
    private final i n = new ar(this);
    private boolean o;
    private int p;
    private boolean q;
    private String r;
    private String s;
    private boolean t;
    private a u;
    private bb v;
    private boolean w;
    private f x;
    private File y;
    private long z;

    public aq(Context context, q q1)
    {
        super(context);
        b = new as(this);
        int i1 = d + 1;
        d = i1;
        p = i1;
        x = new f();
        z = 0L;
        A = 0L;
        D = true;
        u = new a((byte)0);
        setWebViewClient(u);
        resumeTimers();
        v = new bb(context);
        v.c();
        x.a(v.a(), n);
        setNetworkAvailable(v.b());
        context = getSettings();
        context.setUserAgentString(KikApplication.a(context.getUserAgentString()));
        context.setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        context.setLoadWithOverviewMode(true);
        context.setUseWideViewPort(true);
        context.setBuiltInZoomControls(true);
        context.setSupportZoom(true);
        if (context != null && com.kik.sdkutils.y.a(14))
        {
            context.setDisplayZoomControls(false);
        }
        context.setJavaScriptEnabled(true);
        context.setJavaScriptCanOpenWindowsAutomatically(true);
        context.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);
        context.setDomStorageEnabled(true);
        context.setPluginState(android.webkit.WebSettings.PluginState.ON);
        Object obj;
        if (com.kik.sdkutils.y.b(14))
        {
            try
            {
                Class.forName("android.webkit.WebSettings").getMethod("setPluginsEnabled", new Class[] {
                    Boolean.TYPE
                }).invoke(context, new Object[] {
                    Boolean.valueOf(true)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (DeviceUtils.c())
                {
                    throw new RuntimeException(((Throwable) (obj)));
                }
            }
        }
        context.setDatabaseEnabled(true);
        obj = getContext().getApplicationContext().getDir("cardsAppCache", 0);
        if (obj == null)
        {
            c.b("Failed to create database dir, local storage will likely not persist correctly");
        } else
        {
            context.setDatabasePath(((File) (obj)).getPath());
        }
        requestFocusFromTouch();
        y = q1.a("appCache");
        kik.android.util.d.a(new File(getContext().getCacheDir(), "appCache"), y);
    }

    static long a(aq aq1)
    {
        return aq1.z;
    }

    static long a(aq aq1, long l1)
    {
        l1 = aq1.z - l1;
        aq1.z = l1;
        return l1;
    }

    static String a(aq aq1, String s1)
    {
        aq1.r = s1;
        return s1;
    }

    static ArrayList a(aq aq1, ArrayList arraylist)
    {
        aq1.B = arraylist;
        return arraylist;
    }

    static boolean a(aq aq1, boolean flag)
    {
        aq1.w = flag;
        return flag;
    }

    static long b(aq aq1)
    {
        return aq1.A;
    }

    static long b(aq aq1, long l1)
    {
        aq1.z = l1;
        return l1;
    }

    static String b(aq aq1, String s1)
    {
        aq1.C = s1;
        return s1;
    }

    static ArrayList c(aq aq1)
    {
        return aq1.B;
    }

    static File d(aq aq1)
    {
        return aq1.y;
    }

    static boolean e(aq aq1)
    {
        aq1.q = true;
        return true;
    }

    static String f(aq aq1)
    {
        return aq1.C;
    }

    static k g(aq aq1)
    {
        return aq1.e;
    }

    static String h(aq aq1)
    {
        return aq1.r;
    }

    static void i(aq aq1)
    {
        aq1.q();
    }

    static k j(aq aq1)
    {
        return aq1.f;
    }

    static boolean k(aq aq1)
    {
        return aq1.D;
    }

    static boolean l(aq aq1)
    {
        aq1.D = false;
        return false;
    }

    static k m(aq aq1)
    {
        return aq1.j;
    }

    static k n(aq aq1)
    {
        return aq1.g;
    }

    static k o(aq aq1)
    {
        return aq1.k;
    }

    static org.c.b o()
    {
        return c;
    }

    static k p(aq aq1)
    {
        return aq1.l;
    }

    static LinkedHashMap p()
    {
        return E;
    }

    private void q()
    {
        q = false;
        r = null;
    }

    public final void a()
    {
        D = false;
        s = "";
        t = false;
    }

    public final void a(String s1, boolean flag)
    {
        double d1 = 52428800D;
        if (!y.isDirectory() && !y.mkdirs())
        {
            a.b("App cache root not a directory and can't be created. AppCache will likely not work.");
        }
        s1 = com.kik.cards.web.bf.e(s1);
        if (s1 != null)
        {
            E.put(s1, s1);
        }
        getSettings().setAppCacheEnabled(true);
        s1 = new StatFs(y.getAbsolutePath());
        long l2 = (long)s1.getBlockSize() * (long)s1.getAvailableBlocks();
        long l1 = ae.a(y);
        double d2 = Math.max((double)(l2 + l1) * 0.01D, l1);
        if (d2 <= 52428800D)
        {
            if (d2 < 23068672D)
            {
                d1 = 23068672D;
            } else
            {
                d1 = d2;
            }
        }
        l2 = (l1 + l2) - 0x100000L;
        d2 = d1;
        if (d1 > (double)l2)
        {
            d2 = l2;
        }
        l2 = (long)d2;
        getSettings().setAppCacheMaxSize(l2);
        getSettings().setAppCachePath(y.getAbsolutePath());
        if ((double)l1 > (double)l2 * 0.90000000000000002D)
        {
            s1 = WebStorage.getInstance();
            A = (l2 * 3L) / 4L;
            s1.getOrigins(new at(this, s1));
        }
        if (flag)
        {
            getSettings().setCacheMode(2);
            return;
        } else
        {
            getSettings().setCacheMode(-1);
            return;
        }
    }

    public final boolean a(String s1)
    {
        if (s1 == null || s1.equals("about:none") || s1.equals("about:blank") || s1.equals("data:text/html,chromewebdata"))
        {
            return true;
        }
        if (s == null || s1.equals(s))
        {
            s = s1;
            return true;
        } else
        {
            return false;
        }
    }

    public void addView(View view, int i1)
    {
        if (view.getClass().getName().equals("com.adobe.flashplayer.FlashPaintSurface"))
        {
            ((SurfaceView)view).setZOrderOnTop(false);
        }
        super.addView(view, i1);
    }

    public final boolean b()
    {
        return w;
    }

    public final e c()
    {
        return e.a();
    }

    public final e d()
    {
        return f.a();
    }

    public final e e()
    {
        return g.a();
    }

    public final e f()
    {
        return i.a();
    }

    public final e g()
    {
        return j.a();
    }

    public final e h()
    {
        return k.a();
    }

    public final boolean i()
    {
        return q;
    }

    protected final String j()
    {
        String s2 = C;
        String s1 = s2;
        if (s2 == null)
        {
            s1 = getUrl();
        }
        return s1;
    }

    public final void k()
    {
        q();
        super.reload();
    }

    protected final f l()
    {
        return x;
    }

    public final void m()
    {
        if (!o)
        {
            o = true;
            setInitialScale(0);
            setVerticalScrollBarEnabled(false);
        }
    }

    public final void n()
    {
        x.a();
        v.d();
        WebSettings websettings = getSettings();
        if (websettings != null)
        {
            websettings.setJavaScriptEnabled(false);
        }
        stopLoading();
        loadData("<!DOCTYPE html><html lang=\"en\"></html>", "text/html", "UTF-8");
    }

    protected void onAttachedToWindow()
    {
        v.c();
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        v.d();
        super.onDetachedFromWindow();
    }

    protected void onDisplayHint(int i1)
    {
        StringBuilder stringbuilder = new StringBuilder("TIME Display hint ");
        String s1;
        if (i1 == 0)
        {
            s1 = "VISIBLE";
        } else
        {
            s1 = "HIDDEN";
        }
        stringbuilder.append(s1);
        super.onDisplayHint(i1);
    }

    public void reload()
    {
        super.reload();
        if (getUrl() != null)
        {
            i.a(new b(getUrl(), false));
        }
    }

    public WebBackForwardList restoreState(Bundle bundle)
    {
        D = false;
        s = "";
        t = false;
        return super.restoreState(bundle);
    }

    public void stopLoading()
    {
        try
        {
            super.stopLoading();
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            a.b("Internal error attempting to stop loading", nullpointerexception);
        }
    }

}
