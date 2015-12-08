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
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            hi, gm, gn, it, 
//            hl, gw, gd, hj, 
//            cp, cq, ec, o

public class zzis extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, hi
{
    public static final class a extends MutableContextWrapper
    {

        private Activity a;
        private Context b;
        private Context c;

        public final Activity a()
        {
            return a;
        }

        public final Context b()
        {
            return c;
        }

        public final Object getSystemService(String s1)
        {
            return c.getSystemService(s1);
        }

        public final void setBaseContext(Context context)
        {
            b = context.getApplicationContext();
            Activity activity;
            if (context instanceof Activity)
            {
                activity = (Activity)context;
            } else
            {
                activity = null;
            }
            a = activity;
            c = context;
            super.setBaseContext(b);
        }

        public final void startActivity(Intent intent)
        {
            if (a != null && !it.h())
            {
                a.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                b.startActivity(intent);
                return;
            }
        }

        public a(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private final hj a;
    private final a b;
    private final Object c = new Object();
    private final o d;
    private final VersionInfoParcel e;
    private final d f;
    private c g;
    private AdSizeParcel h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private Boolean m;
    private int n;
    private boolean o;
    private String p;
    private String q;
    private c r;
    private gw s;
    private int t;
    private int u;
    private int v;
    private int w;
    private Map x;
    private final WindowManager y = (WindowManager)getContext().getSystemService("window");

    private zzis(a a1, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, o o1, VersionInfoParcel versioninfoparcel, d d1)
    {
        super(a1);
        o = true;
        p = "";
        t = -1;
        u = -1;
        v = -1;
        w = -1;
        b = a1;
        h = adsizeparcel;
        k = flag;
        n = -1;
        d = o1;
        e = versioninfoparcel;
        f = d1;
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
        adsizeparcel.setUserAgentString(com.google.android.gms.ads.internal.p.e().a(a1, versioninfoparcel.b));
        com.google.android.gms.ads.internal.p.g().a(getContext(), adsizeparcel);
        setDownloadListener(this);
        a = com.google.android.gms.ads.internal.p.g().a(this, flag1);
        setWebViewClient(a);
        setWebChromeClient(com.google.android.gms.ads.internal.p.g().a(this));
        w();
        if (com.google.android.gms.internal.it.d())
        {
            addJavascriptInterface(new hl(this), "googleAdsJsInterface");
        }
        s = new gw(b.a(), this, null);
    }

    static zzis a(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, o o1, VersionInfoParcel versioninfoparcel, d d1)
    {
        return new zzis(new a(context), adsizeparcel, flag, flag1, o1, versioninfoparcel, d1);
    }

    static void a(zzis zzis1)
    {
        zzis1.WebView.destroy();
    }

    private void a(Boolean boolean1)
    {
        m = boolean1;
        com.google.android.gms.ads.internal.p.h().a(boolean1);
    }

    private void d(String s1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (p())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s1);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.b.c("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private void e(String s1)
    {
        if (!it.f())
        {
            break MISSING_BLOCK_LABEL_142;
        }
        if (v() != null) goto _L2; else goto _L1
_L1:
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        m = com.google.android.gms.ads.internal.p.h().h();
        boolean1 = m;
        if (boolean1 != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        evaluateJavascript("(function(){})()", null);
        a(Boolean.valueOf(true));
_L3:
        obj;
        JVM INSTR monitorexit ;
_L2:
        if (!v().booleanValue())
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (p())
        {
            break MISSING_BLOCK_LABEL_107;
        }
        evaluateJavascript(s1, null);
_L4:
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        a(Boolean.valueOf(false));
          goto _L3
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        com.google.android.gms.ads.internal.util.client.b.c("The webview is destroyed. Ignoring action.");
          goto _L4
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        d((new StringBuilder("javascript:")).append(s1).toString());
        return;
        d((new StringBuilder("javascript:")).append(s1).toString());
        return;
          goto _L3
    }

    private Boolean v()
    {
        Boolean boolean1;
        synchronized (c)
        {
            boolean1 = m;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void w()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!k && !h.e) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        com.google.android.gms.ads.internal.util.client.b.a(3);
        x();
_L5:
        return;
_L4:
        com.google.android.gms.ads.internal.util.client.b.a(3);
        y();
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
            com.google.android.gms.ads.internal.util.client.b.a(3);
            x();
        }
          goto _L5
        com.google.android.gms.ads.internal.util.client.b.a(3);
        y();
          goto _L5
    }

    private void x()
    {
        synchronized (c)
        {
            if (!l)
            {
                com.google.android.gms.ads.internal.p.g().c(this);
            }
            l = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void y()
    {
        synchronized (c)
        {
            if (l)
            {
                com.google.android.gms.ads.internal.p.g().b(this);
            }
            l = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final WebView a()
    {
        return this;
    }

    public final void a(int i1)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("closetype", String.valueOf(i1));
        hashmap.put("version", e.b);
        a("onhide", ((Map) (hashmap)));
    }

    public final void a(Context context, AdSizeParcel adsizeparcel)
    {
        synchronized (c)
        {
            s.b();
            setContext(context);
            g = null;
            h = adsizeparcel;
            k = false;
            i = false;
            p = "";
            n = -1;
            com.google.android.gms.ads.internal.p.g().b(this);
            loadUrl("about:blank");
            a.e();
            setOnTouchListener(null);
            setOnClickListener(null);
            o = true;
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(AdSizeParcel adsizeparcel)
    {
        synchronized (c)
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

    public final void a(c c1)
    {
        synchronized (c)
        {
            g = c1;
        }
        return;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final void a(String s1)
    {
        synchronized (c)
        {
            super.loadUrl(s1);
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(String s1, String s2)
    {
        e((new StringBuilder()).append(s1).append("(").append(s2).append(");").toString());
    }

    public final void a(String s1, Map map)
    {
        try
        {
            map = com.google.android.gms.ads.internal.p.e().a(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Could not convert parameters to JSON.");
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
        (new StringBuilder("Dispatching AFMA event: ")).append(((StringBuilder) (obj)).toString());
        com.google.android.gms.ads.internal.util.client.b.a(2);
        e(((StringBuilder) (obj)).toString());
    }

    public final void a(boolean flag)
    {
        HashMap hashmap = new HashMap();
        String s1;
        if (flag)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        hashmap.put("isVisible", s1);
        a("onAdVisibilityChanged", ((Map) (hashmap)));
    }

    public final void b()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.b);
        a("onhide", hashmap);
    }

    public final void b(c c1)
    {
        synchronized (c)
        {
            r = c1;
        }
        return;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final void b(String s1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        String s2;
        s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        p = s2;
        obj;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void b(String s1, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = jsonobject;
        if (jsonobject == null)
        {
            jsonobject1 = new JSONObject();
        }
        a(s1, jsonobject1.toString());
    }

    public final void b(boolean flag)
    {
        synchronized (c)
        {
            k = flag;
            w();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.b);
        a("onshow", hashmap);
    }

    public final void c(String s1)
    {
        synchronized (c)
        {
            q = s1;
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void c(boolean flag)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        g.a(a.b(), flag);
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

    public final Activity d()
    {
        return b.a();
    }

    public final void d(boolean flag)
    {
        synchronized (c)
        {
            o = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void destroy()
    {
label0:
        {
            synchronized (c)
            {
                s.b();
                if (g != null)
                {
                    g.a();
                    g.l();
                    g = null;
                }
                a.e();
                if (!j)
                {
                    break label0;
                }
            }
            return;
        }
        com.google.android.gms.ads.internal.p.r();
        com.google.android.gms.internal.cp.a(this);
        obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        if (x != null)
        {
            for (Iterator iterator = x.values().iterator(); iterator.hasNext(); ((cq)iterator.next()).a()) { }
        }
        break MISSING_BLOCK_LABEL_129;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        JVM INSTR monitorexit ;
        j = true;
        com.google.android.gms.ads.internal.util.client.b.a(2);
        a.d();
        obj;
        JVM INSTR monitorexit ;
    }

    public final Context e()
    {
        return b.b();
    }

    public void evaluateJavascript(String s1, ValueCallback valuecallback)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!p())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        com.google.android.gms.ads.internal.util.client.b.c("The webview is destroyed. Ignoring action.");
        if (valuecallback == null)
        {
            break MISSING_BLOCK_LABEL_30;
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

    public final d f()
    {
        return f;
    }

    public final c g()
    {
        c c1;
        synchronized (c)
        {
            c1 = g;
        }
        return c1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final c h()
    {
        c c1;
        synchronized (c)
        {
            c1 = r;
        }
        return c1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final AdSizeParcel i()
    {
        AdSizeParcel adsizeparcel;
        synchronized (c)
        {
            adsizeparcel = h;
        }
        return adsizeparcel;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final hj j()
    {
        return a;
    }

    public final boolean k()
    {
        return i;
    }

    public final o l()
    {
        return d;
    }

    public void loadData(String s1, String s2, String s3)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (p())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s1, s2, s3);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.b.c("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (p())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s1, s2, s3, s4, s5);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.b.c("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void loadUrl(String s1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (p())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        super.loadUrl(s1);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.b.c("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final VersionInfoParcel m()
    {
        return e;
    }

    public final boolean n()
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

    public final int o()
    {
        int i1;
        synchronized (c)
        {
            i1 = n;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onAttachedToWindow()
    {
        synchronized (c)
        {
            super.onAttachedToWindow();
            if (!p())
            {
                s.c();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onDetachedFromWindow()
    {
        synchronized (c)
        {
            if (!p())
            {
                s.d();
            }
            super.onDetachedFromWindow();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onDownloadStart(String s1, String s2, String s3, String s4, long l1)
    {
        try
        {
            s2 = new Intent("android.intent.action.VIEW");
            s2.setDataAndType(Uri.parse(s1), s4);
            getContext().startActivity(s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            (new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s1).append(" / ").append(s4);
        }
        com.google.android.gms.ads.internal.util.client.b.a(3);
    }

    protected void onDraw(Canvas canvas)
    {
        while (p() || android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) 
        {
            return;
        }
        super.onDraw(canvas);
    }

    public void onGlobalLayout()
    {
        boolean flag = false;
        if (a.b()) goto _L2; else goto _L1
_L1:
        c c1 = g();
        if (c1 != null && flag)
        {
            c1.o();
        }
        return;
_L2:
        com.google.android.gms.ads.internal.p.e();
        DisplayMetrics displaymetrics = com.google.android.gms.internal.gm.a(y);
        com.google.android.gms.ads.internal.client.n.a();
        int k1 = com.google.android.gms.ads.internal.util.client.a.b(displaymetrics, displaymetrics.widthPixels);
        com.google.android.gms.ads.internal.client.n.a();
        int l1 = com.google.android.gms.ads.internal.util.client.a.b(displaymetrics, displaymetrics.heightPixels);
        Activity activity = b.a();
        int i1;
        int j1;
        if (activity == null || activity.getWindow() == null)
        {
            j1 = l1;
            i1 = k1;
        } else
        {
            com.google.android.gms.ads.internal.p.e();
            int ai[] = com.google.android.gms.internal.gm.a(activity);
            com.google.android.gms.ads.internal.client.n.a();
            i1 = com.google.android.gms.ads.internal.util.client.a.b(displaymetrics, ai[0]);
            com.google.android.gms.ads.internal.client.n.a();
            j1 = com.google.android.gms.ads.internal.util.client.a.b(displaymetrics, ai[1]);
        }
        if (u != k1 || t != l1 || v != i1 || w != j1)
        {
            if (u != k1 || t != l1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u = k1;
            t = l1;
            v = i1;
            w = j1;
            (new ec(this)).a(k1, l1, i1, j1, displaymetrics.density, y.getDefaultDisplay().getRotation());
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1;
label0:
        {
            l1 = 0x7fffffff;
            synchronized (c)
            {
                if (!p())
                {
                    break label0;
                }
                setMeasuredDimension(0, 0);
            }
            return;
        }
        if (!isInEditMode() && !k && !h.i)
        {
            break MISSING_BLOCK_LABEL_73;
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
            break MISSING_BLOCK_LABEL_124;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        y.getDefaultDisplay().getMetrics(displaymetrics);
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
        break MISSING_BLOCK_LABEL_148;
_L4:
        if (h.g <= i1 && h.d <= j1)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        float f1 = b.getResources().getDisplayMetrics().density;
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Not enough space to show ad. Needs ")).append((int)((float)h.g / f1)).append("x").append((int)((float)h.d / f1)).append(" dp, but only has ").append((int)((float)k1 / f1)).append("x").append((int)((float)i2 / f1)).append(" dp.").toString());
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

    public void onPause()
    {
        if (p())
        {
            return;
        }
        try
        {
            super.onPause();
            return;
        }
        catch (Exception exception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Could not pause webview.", exception);
        }
    }

    public void onResume()
    {
        if (p())
        {
            return;
        }
        try
        {
            super.onResume();
            return;
        }
        catch (Exception exception)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Could not resume webview.", exception);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (d != null)
        {
            d.a(motionevent);
        }
        if (p())
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
        synchronized (c)
        {
            flag = j;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void q()
    {
        synchronized (c)
        {
            com.google.android.gms.ads.internal.util.client.b.a(2);
            com.google.android.gms.internal.gm.a.post(new Runnable() {

                final zzis a;

                public final void run()
                {
                    com.google.android.gms.internal.zzis.a(a);
                }

            
            {
                a = zzis.this;
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

    public final boolean r()
    {
        boolean flag;
        synchronized (c)
        {
            flag = o;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String s()
    {
        String s1;
        synchronized (c)
        {
            s1 = p;
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setContext(Context context)
    {
        b.setBaseContext(context);
        s.a(b.a());
    }

    public void setRequestedOrientation(int i1)
    {
        synchronized (c)
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

    public void stopLoading()
    {
        if (p())
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
            com.google.android.gms.ads.internal.util.client.b.a("Could not stop loading webview.", exception);
        }
    }

    public final void t()
    {
        s.a();
    }

    public final String u()
    {
        String s1;
        synchronized (c)
        {
            s1 = q;
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
