// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class kyb extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, kxu
{

    private final kxv a;
    private final kyd b;
    private final Object c = new Object();
    private final ksq d;
    private final VersionInfoParcel e;
    private final im f;
    private jov g;
    private AdSizeParcel h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private Boolean m;
    private int n;
    private boolean o;
    private jov p;
    private kxr q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final WindowManager v = (WindowManager)getContext().getSystemService("window");

    private kyb(kyd kyd1, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, ksq ksq, VersionInfoParcel versioninfoparcel, im im)
    {
        super(kyd1);
        o = true;
        r = -1;
        s = -1;
        t = -1;
        u = -1;
        b = kyd1;
        h = adsizeparcel;
        k = flag;
        n = -1;
        d = ksq;
        e = versioninfoparcel;
        f = im;
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
        adsizeparcel.setUserAgentString(jqc.c().a(kyd1, versioninfoparcel.b));
        jqc.e().a(getContext(), adsizeparcel);
        setDownloadListener(this);
        a = jqc.e().a(this, flag1);
        setWebViewClient(a);
        setWebChromeClient(jqc.e().a(this));
        v();
        if (c.a(17))
        {
            addJavascriptInterface(new kye(this), "googleAdsJsInterface");
        }
        q = new kxr(b.a, this, null);
    }

    public static kyb a(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, ksq ksq, VersionInfoParcel versioninfoparcel, im im)
    {
        return new kyb(new kyd(context), adsizeparcel, flag, flag1, ksq, versioninfoparcel, null);
    }

    private void a(Boolean boolean1)
    {
        m = boolean1;
        kwq kwq1 = jqc.f();
        synchronized (kwq1.a)
        {
            kwq1.b = boolean1;
        }
        return;
        boolean1;
        obj;
        JVM INSTR monitorexit ;
        throw boolean1;
    }

    static void a(kyb kyb1)
    {
        kyb1.WebView.destroy();
    }

    private void b(String s1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (o())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s1);
_L2:
        return;
        b.m("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private boolean t()
    {
        if (a.a())
        {
            jqc.c();
            DisplayMetrics displaymetrics = kwz.a(v);
            jof.a();
            int k1 = jpx.b(displaymetrics, displaymetrics.widthPixels);
            jof.a();
            int l1 = jpx.b(displaymetrics, displaymetrics.heightPixels);
            Activity activity = b.a;
            int i1;
            int j1;
            if (activity == null || activity.getWindow() == null)
            {
                j1 = l1;
                i1 = k1;
            } else
            {
                int ai[] = jqc.c().a(activity);
                jof.a();
                i1 = jpx.b(displaymetrics, ai[0]);
                jof.a();
                j1 = jpx.b(displaymetrics, ai[1]);
            }
            if (s != k1 || r != l1 || t != i1 || u != j1)
            {
                boolean flag;
                if (s != k1 || r != l1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                s = k1;
                r = l1;
                t = i1;
                u = j1;
                (new kvu(this)).a(k1, l1, i1, j1, displaymetrics.density, v.getDefaultDisplay().getRotation());
                return flag;
            }
        }
        return false;
    }

    private Boolean u()
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

    private void v()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!k && !h.e) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        b.p(3);
        w();
_L5:
        return;
_L4:
        b.p(3);
        x();
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
            b.p(3);
            w();
        }
          goto _L5
        b.p(3);
        x();
          goto _L5
    }

    private void w()
    {
        synchronized (c)
        {
            if (!l)
            {
                jqc.e().b(this);
            }
            l = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void x()
    {
        synchronized (c)
        {
            if (l)
            {
                jqc.e().a(this);
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

    public final void a(Context context)
    {
        b.setBaseContext(context);
        q.a = b.a;
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

    public final void a(String s1, Map map)
    {
        try
        {
            map = jqc.c().a(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            b.m("Could not convert parameters to JSON.");
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
        (new StringBuilder("Dispatching AFMA event: ")).append(((StringBuilder) (obj)).toString()).toString();
        b.p(2);
        s1 = ((StringBuilder) (obj)).toString();
        if (!c.a(19))
        {
            break MISSING_BLOCK_LABEL_246;
        }
        if (u() != null) goto _L2; else goto _L1
_L1:
        jsonobject = ((JSONObject) (c));
        jsonobject;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        m = jqc.f().c();
        boolean1 = m;
        if (boolean1 != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        evaluateJavascript("(function(){})()", null);
        a(Boolean.valueOf(true));
_L3:
        jsonobject;
        JVM INSTR monitorexit ;
_L2:
        if (!u().booleanValue())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        jsonobject = ((JSONObject) (c));
        jsonobject;
        JVM INSTR monitorenter ;
        if (o())
        {
            break MISSING_BLOCK_LABEL_211;
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
        b.m("The webview is destroyed. Ignoring action.");
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

    public final void a(jov jov1)
    {
        synchronized (c)
        {
            g = jov1;
        }
        return;
        jov1;
        obj;
        JVM INSTR monitorexit ;
        throw jov1;
    }

    public final void a(boolean flag)
    {
        synchronized (c)
        {
            k = flag;
            v();
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
        hashmap.put("version", e.b);
        a("onhide", hashmap);
    }

    public final void b(int i1)
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

    public final void b(jov jov1)
    {
        synchronized (c)
        {
            p = jov1;
        }
        return;
        jov1;
        obj;
        JVM INSTR monitorexit ;
        throw jov1;
    }

    public final void b(boolean flag)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        g.a(a.a(), flag);
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

    public final void c()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.b);
        a("onshow", hashmap);
    }

    public final void c(boolean flag)
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

    public final Activity d()
    {
        return b.a;
    }

    public final void destroy()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        kxv kxv1;
        kxr kxr1 = q;
        kxr1.c = false;
        kxr1.b();
        if (g != null)
        {
            g.a();
            g.k();
            g = null;
        }
        kxv1 = a;
        synchronized (kxv1.c)
        {
            kxv1.b.clear();
            kxv1.d = null;
            kxv1.e = null;
            kxv1.f = null;
            kxv1.g = null;
            kxv1.i = false;
            kxv1.k = false;
            kxv1.j = null;
            kxv1.l = null;
            kxv1.h = null;
            if (kxv1.o != null)
            {
                kxv1.o.a(true);
                kxv1.o = null;
            }
            kxv1.p = false;
        }
        if (!j)
        {
            break MISSING_BLOCK_LABEL_158;
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
        jqc.k().a(this);
        synchronized (c) { }
        j = true;
        b.p(2);
        exception1 = a;
        synchronized (((kxv) (exception1)).c)
        {
            b.p(2);
            exception1.q = true;
            ((kxv) (exception1)).a.a("about:blank");
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception2;
        obj2;
        JVM INSTR monitorexit ;
        throw exception2;
        exception3;
        obj2;
        JVM INSTR monitorexit ;
        throw exception3;
    }

    public final Context e()
    {
        return b.b;
    }

    public final void evaluateJavascript(String s1, ValueCallback valuecallback)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!o())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        b.m("The webview is destroyed. Ignoring action.");
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

    public final im f()
    {
        return f;
    }

    public final jov g()
    {
        jov jov1;
        synchronized (c)
        {
            jov1 = g;
        }
        return jov1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final jov h()
    {
        jov jov1;
        synchronized (c)
        {
            jov1 = p;
        }
        return jov1;
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

    public final kxv j()
    {
        return a;
    }

    public final boolean k()
    {
        return i;
    }

    public final ksq l()
    {
        return d;
    }

    public final void loadData(String s1, String s2, String s3)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (o())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s1, s2, s3);
_L2:
        return;
        b.m("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (o())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s1, s2, s3, s4, s5);
_L2:
        return;
        b.m("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void loadUrl(String s1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (o())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        super.loadUrl(s1);
_L2:
        return;
        b.m("The webview is destroyed. Ignoring action.");
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

    public final boolean o()
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

    protected final void onAttachedToWindow()
    {
        synchronized (c)
        {
            super.onAttachedToWindow();
            if (!o())
            {
                kxr kxr1 = q;
                kxr1.b = true;
                if (kxr1.c)
                {
                    kxr1.a();
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
        synchronized (c)
        {
            if (!o())
            {
                kxr kxr1 = q;
                kxr1.b = false;
                kxr1.b();
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
            getContext().startActivity(s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            (new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s1).append(" / ").append(s4).toString();
        }
        b.p(3);
    }

    protected final void onDraw(Canvas canvas)
    {
        while (o() || android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) 
        {
            return;
        }
        super.onDraw(canvas);
    }

    public final void onGlobalLayout()
    {
        boolean flag = t();
        jov jov1 = g();
        if (jov1 != null && flag)
        {
            jov1.m();
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        int l1;
label0:
        {
            l1 = 0x7fffffff;
            synchronized (c)
            {
                if (!o())
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
        v.getDefaultDisplay().getMetrics(displaymetrics);
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
        b.m((new StringBuilder("Not enough space to show ad. Needs ")).append((int)((float)h.g / f1)).append("x").append((int)((float)h.d / f1)).append(" dp, but only has ").append((int)((float)k1 / f1)).append("x").append((int)((float)i2 / f1)).append(" dp.").toString());
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
        if (o())
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
            b.a("Could not pause webview.", exception);
        }
    }

    public final void onResume()
    {
        if (o())
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
            b.a("Could not resume webview.", exception);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (o())
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public final void p()
    {
        synchronized (c)
        {
            b.p(2);
            kwz.a.post(new kyc(this));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean q()
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

    public final void r()
    {
        kxr kxr1 = q;
        kxr1.c = true;
        if (kxr1.b)
        {
            kxr1.a();
        }
    }

    public final String s()
    {
        synchronized (c) { }
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void stopLoading()
    {
        if (o())
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
            b.a("Could not stop loading webview.", exception);
        }
    }
}
