// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fl, a, zzhy, es, 
//            eu, fs, ek, fj, 
//            zzba, is, co, fm, 
//            x, fi, ck, hj

public final class fr extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, fl
{

    boolean a;
    private final fm b;
    private final fs c;
    private final Object d = new Object();
    private final hj e = null;
    private final zzhy f;
    private co g;
    private zzba h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private Boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final WindowManager t = (WindowManager)getContext().getSystemService("window");

    private fr(fs fs1, zzba zzba1, boolean flag, zzhy zzhy1)
    {
        super(fs1);
        p = -1;
        q = -1;
        r = -1;
        s = -1;
        c = fs1;
        h = zzba1;
        k = true;
        m = false;
        o = -1;
        f = zzhy1;
        setBackgroundColor(0);
        zzba1 = getSettings();
        zzba1.setJavaScriptEnabled(true);
        zzba1.setSavePassword(false);
        zzba1.setSupportMultipleWindows(true);
        zzba1.setJavaScriptCanOpenWindowsAutomatically(true);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            zzba1.setMixedContentMode(0);
        }
        zzba1.setUserAgentString(com.google.android.gms.internal.a.c().a(fs1, zzhy1.b));
        com.google.android.gms.internal.a.e().a(getContext(), zzba1);
        setDownloadListener(this);
        b = com.google.android.gms.internal.a.e().a(this, flag);
        setWebViewClient(b);
        setWebChromeClient(com.google.android.gms.internal.a.e().a(this));
        q();
    }

    static fr a(Context context, zzba zzba1, boolean flag, zzhy zzhy1)
    {
        return new fr(new fs(context), zzba1, flag, zzhy1);
    }

    private void a(Boolean boolean1)
    {
        n = boolean1;
        com.google.android.gms.internal.a.f().a(boolean1);
    }

    private void a(String s1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (l())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s1);
_L2:
        return;
        fj.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private Boolean n()
    {
        Boolean boolean1;
        synchronized (d)
        {
            boolean1 = n;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void o()
    {
        Activity activity = c.a();
        if (m && activity != null)
        {
            com.google.android.gms.internal.a.e().a(activity, this);
            m = false;
        }
    }

    private void p()
    {
        Object obj = c.a();
        if (!m && obj != null && a)
        {
            com.google.android.gms.internal.a.c();
            obj = ((Activity) (obj)).getWindow();
            if (obj != null && ((Window) (obj)).getDecorView() != null && ((Window) (obj)).getDecorView().getViewTreeObserver() != null)
            {
                ((Window) (obj)).getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
            m = true;
        }
    }

    private void q()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (!k && !h.e) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        fj.a("Disabling hardware acceleration on an overlay.");
        r();
_L5:
        return;
_L4:
        fj.a("Enabling hardware acceleration on an overlay.");
        s();
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
            fj.a("Disabling hardware acceleration on an AdView.");
            r();
        }
          goto _L5
        fj.a("Enabling hardware acceleration on an AdView.");
        s();
          goto _L5
    }

    private void r()
    {
        synchronized (d)
        {
            if (!l)
            {
                com.google.android.gms.internal.a.e().b(this);
            }
            l = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void s()
    {
        synchronized (d)
        {
            if (l)
            {
                com.google.android.gms.internal.a.e().a(this);
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
        HashMap hashmap = new HashMap(1);
        hashmap.put("closetype", String.valueOf(i1));
        hashmap.put("version", f.b);
        a("onhide", ((Map) (hashmap)));
    }

    public final void a(Context context)
    {
        c.setBaseContext(context);
    }

    public final void a(co co1)
    {
        synchronized (d)
        {
            g = co1;
        }
        return;
        co1;
        obj;
        JVM INSTR monitorexit ;
        throw co1;
    }

    public final void a(zzba zzba1)
    {
        synchronized (d)
        {
            h = zzba1;
            requestLayout();
        }
        return;
        zzba1;
        obj;
        JVM INSTR monitorexit ;
        throw zzba1;
    }

    public final void a(String s1, Map map)
    {
        try
        {
            map = com.google.android.gms.internal.a.c().a(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            fj.e("Could not convert parameters to JSON.");
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
        fj.d((new StringBuilder("Dispatching AFMA event: ")).append(((StringBuilder) (obj)).toString()).toString());
        s1 = ((StringBuilder) (obj)).toString();
        if (!is.d())
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (n() != null) goto _L2; else goto _L1
_L1:
        jsonobject = ((JSONObject) (d));
        jsonobject;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        n = com.google.android.gms.internal.a.f().b();
        boolean1 = n;
        if (boolean1 != null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        evaluateJavascript("(function(){})()", null);
        a(Boolean.valueOf(true));
_L3:
        jsonobject;
        JVM INSTR monitorexit ;
_L2:
        if (!n().booleanValue())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        jsonobject = ((JSONObject) (d));
        jsonobject;
        JVM INSTR monitorenter ;
        if (l())
        {
            break MISSING_BLOCK_LABEL_206;
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
        fj.e("The webview is destroyed. Ignoring action.");
          goto _L4
        s1;
        jsonobject;
        JVM INSTR monitorexit ;
        throw s1;
        a((new StringBuilder("javascript:")).append(s1).toString());
        return;
        a((new StringBuilder("javascript:")).append(s1).toString());
        return;
          goto _L3
    }

    public final void a(boolean flag)
    {
        synchronized (d)
        {
            k = flag;
            q();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", f.b);
        a("onshow", hashmap);
    }

    public final void b(int i1)
    {
        synchronized (d)
        {
            o = i1;
            if (g != null)
            {
                g.a(o);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(boolean flag)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        g.a(b.b(), flag);
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
        return c.a();
    }

    public final Context d()
    {
        return c.b();
    }

    public final void destroy()
    {
label0:
        {
            synchronized (d)
            {
                o();
                if (g != null)
                {
                    g.a();
                    g.i();
                    g = null;
                }
                b.d();
                if (!j)
                {
                    break label0;
                }
            }
            return;
        }
        j = true;
        super.destroy();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final co e()
    {
        co co1;
        synchronized (d)
        {
            co1 = g;
        }
        return co1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void evaluateJavascript(String s1, ValueCallback valuecallback)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (!l())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        fj.e("The webview is destroyed. Ignoring action.");
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

    public final zzba f()
    {
        zzba zzba1;
        synchronized (d)
        {
            zzba1 = h;
        }
        return zzba1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final fm g()
    {
        return b;
    }

    public final boolean h()
    {
        return i;
    }

    public final hj i()
    {
        return e;
    }

    public final zzhy j()
    {
        return f;
    }

    public final boolean k()
    {
        boolean flag;
        synchronized (d)
        {
            flag = k;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean l()
    {
        boolean flag;
        synchronized (d)
        {
            flag = j;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void loadData(String s1, String s2, String s3)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (l())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s1, s2, s3);
_L2:
        return;
        fj.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (l())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s1, s2, s3, s4, s5);
_L2:
        return;
        fj.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void m()
    {
        synchronized (d)
        {
            p();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void onAttachedToWindow()
    {
        synchronized (d)
        {
            super.onAttachedToWindow();
            a = true;
            if (b.b())
            {
                p();
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
        synchronized (d)
        {
            o();
            a = false;
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
            getContext().startActivity(s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            fj.a((new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s1).append(" / ").append(s4).toString());
        }
    }

    protected final void onDraw(Canvas canvas)
    {
        if (android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow())
        {
            return;
        } else
        {
            super.onDraw(canvas);
            return;
        }
    }

    public final void onGlobalLayout()
    {
        boolean flag = false;
        if (b.b()) goto _L2; else goto _L1
_L1:
        co co1 = e();
        if (co1 != null && flag)
        {
            co1.l();
        }
        return;
_L2:
        com.google.android.gms.internal.a.c();
        Object obj = t;
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager) (obj)).getDefaultDisplay().getMetrics(displaymetrics);
        x.a();
        int k1 = fi.b(displaymetrics, displaymetrics.widthPixels);
        x.a();
        int l1 = fi.b(displaymetrics, displaymetrics.heightPixels);
        obj = c.a();
        int i1;
        int j1;
        if (obj == null || ((Activity) (obj)).getWindow() == null)
        {
            j1 = l1;
            i1 = k1;
        } else
        {
            com.google.android.gms.internal.a.c();
            int ai[] = es.a(((Activity) (obj)));
            x.a();
            i1 = fi.b(displaymetrics, ai[0]);
            x.a();
            j1 = fi.b(displaymetrics, ai[1]);
        }
        if (q != k1 || p != l1 || r != i1 || s != j1)
        {
            if (q != k1 || p != l1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            q = k1;
            p = l1;
            r = i1;
            s = j1;
            (new ck(this)).a(k1, l1, i1, j1, displaymetrics.density, t.getDefaultDisplay().getRotation());
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected final void onMeasure(int i1, int j1)
    {
        int l1;
label0:
        {
            l1 = 0x7fffffff;
            synchronized (d)
            {
                if (!isInEditMode() && !k)
                {
                    break label0;
                }
                super.onMeasure(i1, j1);
            }
            return;
        }
        if (!h.e)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        t.getDefaultDisplay().getMetrics(displaymetrics);
        setMeasuredDimension(displaymetrics.widthPixels, displaymetrics.heightPixels);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        int k1;
        int i2;
        int j2;
        int k2;
        k2 = android.view.View.MeasureSpec.getMode(i1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getMode(j1);
        i2 = android.view.View.MeasureSpec.getSize(j1);
        break MISSING_BLOCK_LABEL_121;
_L4:
        if (h.g <= i1 && h.d <= j1)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        float f1 = c.getResources().getDisplayMetrics().density;
        fj.e((new StringBuilder("Not enough space to show ad. Needs ")).append((int)((float)h.g / f1)).append("x").append((int)((float)h.d / f1)).append(" dp, but only has ").append((int)((float)k1 / f1)).append("x").append((int)((float)i2 / f1)).append(" dp.").toString());
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
        if (l())
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
            fj.b("Could not pause webview.", exception);
        }
    }

    public final void onResume()
    {
        if (l())
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
            fj.b("Could not resume webview.", exception);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    public final void stopLoading()
    {
        if (l())
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
            fj.b("Could not stop loading webview.", exception);
        }
    }
}
