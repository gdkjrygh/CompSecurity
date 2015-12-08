// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.j;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cw, cl, cm, el, 
//            db, cr, ac, ad, 
//            z, cf, x, cx, 
//            bq, bl, ax, e, 
//            ab, cv

public final class da extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, cw
{
    public static final class a extends MutableContextWrapper
    {

        Activity a;
        Context b;
        private Context c;

        public final Object getSystemService(String s1)
        {
            return b.getSystemService(s1);
        }

        public final void setBaseContext(Context context)
        {
            c = context.getApplicationContext();
            Activity activity;
            if (context instanceof Activity)
            {
                activity = (Activity)context;
            } else
            {
                activity = null;
            }
            a = activity;
            b = context;
            super.setBaseContext(c);
        }

        public final void startActivity(Intent intent)
        {
            if (a != null && !com.google.android.gms.internal.el.a(21))
            {
                a.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                c.startActivity(intent);
                return;
            }
        }

        public a(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private Map A;
    private final WindowManager B;
    private final a a;
    private final Object b;
    private final e c;
    private final VersionInfoParcel d;
    private final com.google.android.gms.ads.internal.a e;
    private cx f;
    private zzd g;
    private AdSizeParcel h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private Boolean m;
    private int n;
    private boolean o;
    private String p;
    private ab q;
    private ab r;
    private ab s;
    private ac t;
    private zzd u;
    private cr v;
    private int w;
    private int x;
    private int y;
    private int z;

    private da(a a1, AdSizeParcel adsizeparcel, VersionInfoParcel versioninfoparcel)
    {
        super(a1);
        b = new Object();
        o = true;
        p = "";
        w = -1;
        x = -1;
        y = -1;
        z = -1;
        a = a1;
        h = adsizeparcel;
        k = true;
        n = -1;
        c = null;
        d = versioninfoparcel;
        e = null;
        B = (WindowManager)getContext().getSystemService("window");
        setBackgroundColor(0);
        adsizeparcel = getSettings();
        adsizeparcel.setJavaScriptEnabled(true);
        adsizeparcel.setSavePassword(false);
        adsizeparcel.setSupportMultipleWindows(true);
        adsizeparcel.setJavaScriptCanOpenWindowsAutomatically(true);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            adsizeparcel.setMixedContentMode(0);
        }
        adsizeparcel.setUserAgentString(com.google.android.gms.ads.internal.d.c().a(a1, versioninfoparcel.b));
        com.google.android.gms.ads.internal.d.e().a(getContext(), adsizeparcel);
        setDownloadListener(this);
        x();
        if (com.google.android.gms.internal.el.a(17))
        {
            addJavascriptInterface(new db(this), "googleAdsJsInterface");
        }
        v = new cr(a.a, this);
        A();
        t = new ac(new ad("make_wv", h.b));
        adsizeparcel = t.b;
        synchronized (((ad) (adsizeparcel)).b)
        {
            adsizeparcel.c = null;
        }
        r = com.google.android.gms.internal.z.a(t.b);
        t.a("native:view_create", r);
        s = null;
        q = null;
        return;
        adsizeparcel;
        a1;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    private void A()
    {
        ad ad1;
        if (t != null)
        {
            if ((ad1 = t.b) != null && com.google.android.gms.ads.internal.d.f().a() != null)
            {
                com.google.android.gms.ads.internal.d.f().a().a.offer(ad1);
                return;
            }
        }
    }

    public static da a(Context context, AdSizeParcel adsizeparcel, VersionInfoParcel versioninfoparcel)
    {
        return new da(new a(context), adsizeparcel, versioninfoparcel);
    }

    static void a(da da1)
    {
        da1.WebView.destroy();
    }

    private void a(Boolean boolean1)
    {
        m = boolean1;
        cf cf1 = com.google.android.gms.ads.internal.d.f();
        synchronized (cf1.a)
        {
            cf1.b = boolean1;
        }
        return;
        boolean1;
        obj;
        JVM INSTR monitorexit ;
        throw boolean1;
    }

    private void b(String s1)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (n())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s1);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private boolean v()
    {
        if (f.a())
        {
            com.google.android.gms.ads.internal.d.c();
            DisplayMetrics displaymetrics = com.google.android.gms.internal.cl.a(B);
            com.google.android.gms.ads.internal.client.j.a();
            int k1 = com.google.android.gms.ads.internal.util.client.a.b(displaymetrics, displaymetrics.widthPixels);
            com.google.android.gms.ads.internal.client.j.a();
            int l1 = com.google.android.gms.ads.internal.util.client.a.b(displaymetrics, displaymetrics.heightPixels);
            Activity activity = a.a;
            int i1;
            int j1;
            if (activity == null || activity.getWindow() == null)
            {
                j1 = l1;
                i1 = k1;
            } else
            {
                com.google.android.gms.ads.internal.d.c();
                int ai[] = com.google.android.gms.internal.cl.a(activity);
                com.google.android.gms.ads.internal.client.j.a();
                i1 = com.google.android.gms.ads.internal.util.client.a.b(displaymetrics, ai[0]);
                com.google.android.gms.ads.internal.client.j.a();
                j1 = com.google.android.gms.ads.internal.util.client.a.b(displaymetrics, ai[1]);
            }
            if (x != k1 || w != l1 || y != i1 || z != j1)
            {
                boolean flag;
                if (x != k1 || w != l1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                x = k1;
                w = l1;
                y = i1;
                z = j1;
                (new bq(this)).a(k1, l1, i1, j1, displaymetrics.density, B.getDefaultDisplay().getRotation());
                return flag;
            }
        }
        return false;
    }

    private Boolean w()
    {
        Boolean boolean1;
        synchronized (b)
        {
            boolean1 = m;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void x()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (!k && !h.e) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        com.google.android.gms.ads.internal.util.client.b.a("Disabling hardware acceleration on an overlay.");
        y();
_L5:
        return;
_L4:
        com.google.android.gms.ads.internal.util.client.b.a("Enabling hardware acceleration on an overlay.");
        z();
          goto _L5
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                break label0;
            }
            com.google.android.gms.ads.internal.util.client.b.a("Disabling hardware acceleration on an AdView.");
            y();
        }
          goto _L5
        com.google.android.gms.ads.internal.util.client.b.a("Enabling hardware acceleration on an AdView.");
        z();
          goto _L5
    }

    private void y()
    {
        synchronized (b)
        {
            if (!l)
            {
                com.google.android.gms.ads.internal.d.e().b(this);
            }
            l = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void z()
    {
        synchronized (b)
        {
            if (l)
            {
                com.google.android.gms.ads.internal.d.e().a(this);
            }
            l = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", d.b);
        a("onhide", ((Map) (hashmap)));
    }

    public final void a(int i1)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("closetype", String.valueOf(i1));
        hashmap.put("version", d.b);
        a("onhide", ((Map) (hashmap)));
    }

    public final void a(AdSizeParcel adsizeparcel)
    {
        synchronized (b)
        {
            h = adsizeparcel;
            requestLayout();
        }
        return;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public final void a(zzd zzd1)
    {
        synchronized (b)
        {
            g = zzd1;
        }
        return;
        zzd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzd1;
    }

    public final void a(String s1)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        super.loadUrl(s1);
_L1:
        return;
        s1;
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Could not call loadUrl. ")).append(s1).toString());
          goto _L1
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(String s1, Map map)
    {
        try
        {
            map = com.google.android.gms.ads.internal.d.c().a(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.ads.internal.util.client.b.e("Could not convert parameters to JSON.");
            return;
        }
        a(s1, ((JSONObject) (map)));
    }

    public final void a(String s1, JSONObject jsonobject)
    {
        Object obj = jsonobject;
        if (jsonobject == null)
        {
            obj = new JSONObject();
        }
        jsonobject = ((JSONObject) (obj)).toString();
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("AFMA_ReceiveMessage('");
        ((StringBuilder) (obj)).append(s1);
        ((StringBuilder) (obj)).append("'");
        ((StringBuilder) (obj)).append(",");
        ((StringBuilder) (obj)).append(jsonobject);
        ((StringBuilder) (obj)).append(");");
        com.google.android.gms.ads.internal.util.client.b.d((new StringBuilder("Dispatching AFMA event: ")).append(((StringBuilder) (obj)).toString()).toString());
        s1 = ((StringBuilder) (obj)).toString();
        if (!com.google.android.gms.internal.el.a(19))
        {
            break MISSING_BLOCK_LABEL_244;
        }
        if (w() != null) goto _L2; else goto _L1
_L1:
        jsonobject = ((JSONObject) (b));
        jsonobject;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        m = com.google.android.gms.ads.internal.d.f().c();
        boolean1 = m;
        if (boolean1 != null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        evaluateJavascript("(function(){})()", null);
        a(Boolean.valueOf(true));
_L3:
        jsonobject;
        JVM INSTR monitorexit ;
_L2:
        if (!w().booleanValue())
        {
            break MISSING_BLOCK_LABEL_222;
        }
        jsonobject = ((JSONObject) (b));
        jsonobject;
        JVM INSTR monitorenter ;
        if (n())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        evaluateJavascript(s1, null);
_L4:
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        a(Boolean.valueOf(false));
          goto _L3
        s1;
        jsonobject;
        JVM INSTR monitorexit ;
        throw s1;
        com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
          goto _L4
        s1;
        jsonobject;
        JVM INSTR monitorexit ;
        throw s1;
        b((new StringBuilder("javascript:")).append(s1).toString());
        return;
        b((new StringBuilder("javascript:")).append(s1).toString());
        return;
          goto _L3
    }

    public final void a(boolean flag)
    {
        synchronized (b)
        {
            k = flag;
            x();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        if (q != null)
        {
            com.google.android.gms.internal.z.a(t.b, s, new String[] {
                "aes"
            });
            q = com.google.android.gms.internal.z.a(t.b);
            t.a("native:view_show", s);
        }
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", d.b);
        a("onshow", hashmap);
    }

    public final void b(zzd zzd1)
    {
        synchronized (b)
        {
            u = zzd1;
        }
        return;
        zzd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzd1;
    }

    public final void b(boolean flag)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        g.a(f.a(), flag);
_L2:
        return;
        i = flag;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Activity c()
    {
        return a.a;
    }

    public final void c(boolean flag)
    {
        synchronized (b)
        {
            o = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Context d()
    {
        return a.b;
    }

    public final void destroy()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        cx cx1;
        A();
        cr cr1 = v;
        cr1.c = false;
        cr1.b();
        if (g != null)
        {
            g.a();
            g.k();
            g = null;
        }
        cx1 = f;
        synchronized (cx1.c)
        {
            cx1.b.clear();
            cx1.d = null;
            cx1.e = null;
            cx1.f = null;
            cx1.g = null;
            cx1.i = false;
            cx1.k = false;
            cx1.l = false;
            cx1.j = null;
            cx1.m = null;
            cx1.h = null;
            if (cx1.o != null)
            {
                cx1.o.a(true);
                cx1.o = null;
            }
            cx1.p = false;
        }
        if (!j)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        com.google.android.gms.ads.internal.d.k();
        com.google.android.gms.internal.ax.a(this);
        Object obj2 = b;
        obj2;
        JVM INSTR monitorenter ;
        if (A != null)
        {
            for (Iterator iterator = A.values().iterator(); iterator.hasNext(); iterator.next()) { }
        }
        break MISSING_BLOCK_LABEL_229;
        Exception exception2;
        exception2;
        obj2;
        JVM INSTR monitorexit ;
        throw exception2;
        obj2;
        JVM INSTR monitorexit ;
        j = true;
        com.google.android.gms.ads.internal.util.client.b.d("Initiating WebView self destruct sequence in 3...");
        f.b();
        obj;
        JVM INSTR monitorexit ;
    }

    public final com.google.android.gms.ads.internal.a e()
    {
        return e;
    }

    public final void evaluateJavascript(String s1, ValueCallback valuecallback)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (!n())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
        if (valuecallback == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        valuecallback.onReceiveValue(null);
        obj;
        JVM INSTR monitorexit ;
        return;
        super.evaluateJavascript(s1, valuecallback);
        obj;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final zzd f()
    {
        zzd zzd1;
        synchronized (b)
        {
            zzd1 = g;
        }
        return zzd1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final zzd g()
    {
        zzd zzd1;
        synchronized (b)
        {
            zzd1 = u;
        }
        return zzd1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final View getView()
    {
        return this;
    }

    public final WebView getWebView()
    {
        return this;
    }

    public final AdSizeParcel h()
    {
        AdSizeParcel adsizeparcel;
        synchronized (b)
        {
            adsizeparcel = h;
        }
        return adsizeparcel;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final cx i()
    {
        return f;
    }

    public final boolean j()
    {
        return i;
    }

    public final e k()
    {
        return c;
    }

    public final VersionInfoParcel l()
    {
        return d;
    }

    public final void loadData(String s1, String s2, String s3)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (n())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s1, s2, s3);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (n())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s1, s2, s3, s4, s5);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void loadUrl(String s1)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = n();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        super.loadUrl(s1);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        s1;
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Could not call loadUrl. ")).append(s1).toString());
          goto _L1
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        com.google.android.gms.ads.internal.util.client.b.e("The webview is destroyed. Ignoring action.");
          goto _L1
    }

    public final boolean m()
    {
        boolean flag;
        synchronized (b)
        {
            flag = k;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean n()
    {
        boolean flag;
        synchronized (b)
        {
            flag = j;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void o()
    {
        synchronized (b)
        {
            com.google.android.gms.ads.internal.util.client.b.d("Destroying WebView!");
            com.google.android.gms.internal.cl.a.post(new Runnable() {

                final da a;

                public final void run()
                {
                    com.google.android.gms.internal.da.a(a);
                }

            
            {
                a = da.this;
                super();
            }
            });
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void onAttachedToWindow()
    {
        synchronized (b)
        {
            super.onAttachedToWindow();
            if (!n())
            {
                cr cr1 = v;
                cr1.b = true;
                if (cr1.c)
                {
                    cr1.a();
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void onDetachedFromWindow()
    {
        synchronized (b)
        {
            if (!n())
            {
                cr cr1 = v;
                cr1.b = false;
                cr1.b();
            }
            super.onDetachedFromWindow();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onDownloadStart(String s1, String s2, String s3, String s4, long l1)
    {
        try
        {
            s2 = new Intent("android.intent.action.VIEW");
            s2.setDataAndType(Uri.parse(s1), s4);
            com.google.android.gms.ads.internal.d.c();
            com.google.android.gms.internal.cl.a(getContext(), s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            com.google.android.gms.ads.internal.util.client.b.a((new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s1).append(" / ").append(s4).toString());
        }
    }

    protected final void onDraw(Canvas canvas)
    {
        while (n() || android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) 
        {
            return;
        }
        super.onDraw(canvas);
    }

    public final void onGlobalLayout()
    {
        boolean flag = v();
        zzd zzd1 = f();
        if (zzd1 != null && flag && zzd1.m)
        {
            zzd1.m = false;
            zzd1.m();
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        int l1;
label0:
        {
            l1 = 0x7fffffff;
            synchronized (b)
            {
                if (!n())
                {
                    break label0;
                }
                setMeasuredDimension(0, 0);
            }
            return;
        }
        if (!isInEditMode() && !k && !h.i && !h.j)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        super.onMeasure(i1, j1);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (!h.e)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        B.getDefaultDisplay().getMetrics(displaymetrics);
        setMeasuredDimension(displaymetrics.widthPixels, displaymetrics.heightPixels);
        obj;
        JVM INSTR monitorexit ;
        return;
        int k1;
        int i2;
        int j2;
        int k2;
        k2 = android.view.View.MeasureSpec.getMode(i1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getMode(j1);
        i2 = android.view.View.MeasureSpec.getSize(j1);
        break MISSING_BLOCK_LABEL_158;
_L4:
        if (h.g <= i1 && h.d <= j1)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        float f1 = a.getResources().getDisplayMetrics().density;
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Not enough space to show ad. Needs ")).append((int)((float)h.g / f1)).append("x").append((int)((float)h.d / f1)).append(" dp, but only has ").append((int)((float)k1 / f1)).append("x").append((int)((float)i2 / f1)).append(" dp.").toString());
        if (getVisibility() != 8)
        {
            setVisibility(4);
        }
        setMeasuredDimension(0, 0);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        if (getVisibility() != 8)
        {
            setVisibility(0);
        }
        setMeasuredDimension(h.g, h.d);
        if (true) goto _L2; else goto _L1
_L1:
        if (k2 != 0x80000000 && k2 != 0x40000000)
        {
            i1 = 0x7fffffff;
        } else
        {
            i1 = k1;
        }
        if (j2 != 0x80000000)
        {
            j1 = l1;
            if (j2 != 0x40000000)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j1 = i2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onPause()
    {
        if (!n()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!com.google.android.gms.internal.el.a(11)) goto _L1; else goto _L3
_L3:
        super.onPause();
        return;
        Exception exception;
        exception;
        com.google.android.gms.ads.internal.util.client.b.b("Could not pause webview.", exception);
        return;
    }

    public final void onResume()
    {
        if (!n()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!com.google.android.gms.internal.el.a(11)) goto _L1; else goto _L3
_L3:
        super.onResume();
        return;
        Exception exception;
        exception;
        com.google.android.gms.ads.internal.util.client.b.b("Could not resume webview.", exception);
        return;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (n())
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public final boolean p()
    {
        boolean flag;
        synchronized (b)
        {
            flag = o;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final cv q()
    {
        return null;
    }

    public final ab r()
    {
        return s;
    }

    public final ac s()
    {
        return t;
    }

    public final void setContext(Context context)
    {
        a.setBaseContext(context);
        v.a = a.a;
    }

    public final void setRequestedOrientation(int i1)
    {
        synchronized (b)
        {
            n = i1;
            if (g != null)
            {
                g.a(n);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void setWebViewClient(WebViewClient webviewclient)
    {
        super.setWebViewClient(webviewclient);
        if (webviewclient instanceof cx)
        {
            f = (cx)webviewclient;
        }
    }

    public final void stopLoading()
    {
        if (n())
        {
            return;
        }
        try
        {
            super.stopLoading();
            return;
        }
        catch (Exception exception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not stop loading webview.", exception);
        }
    }

    public final void t()
    {
        cr cr1 = v;
        cr1.c = true;
        if (cr1.b)
        {
            cr1.a();
        }
    }

    public final void u()
    {
        if (s == null && !"about:blank".equals(getUrl()))
        {
            s = com.google.android.gms.internal.z.a(t.b);
            t.a("native:view_load", s);
        }
    }
}
