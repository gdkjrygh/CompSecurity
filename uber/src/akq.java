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

public final class akq extends WebView
    implements akk, android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener
{

    boolean a;
    private final akl b;
    private final akr c;
    private final Object d = new Object();
    private final amb e;
    private final VersionInfoParcel f;
    private me g;
    private AdSizeParcel h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private Boolean n;
    private int o;
    private me p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final WindowManager u = (WindowManager)getContext().getSystemService("window");

    private akq(akr akr1, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, amb amb1, VersionInfoParcel versioninfoparcel)
    {
        super(akr1);
        q = -1;
        r = -1;
        s = -1;
        t = -1;
        c = akr1;
        h = adsizeparcel;
        k = flag;
        m = false;
        o = -1;
        e = amb1;
        f = versioninfoparcel;
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
        ot.e().a(akr1, versioninfoparcel.b, adsizeparcel);
        ot.g().a(getContext(), adsizeparcel);
        setDownloadListener(this);
        b = ot.g().a(this, flag1);
        setWebViewClient(b);
        setWebChromeClient(ot.g().a(this));
        w();
        if (alv.e())
        {
            addJavascriptInterface(new aks(this), "googleAdsJsInterface");
        }
    }

    static akq a(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, amb amb1, VersionInfoParcel versioninfoparcel)
    {
        return new akq(new akr(context), adsizeparcel, flag, flag1, amb1, versioninfoparcel);
    }

    private void a(Boolean boolean1)
    {
        n = boolean1;
        ot.h().a(boolean1);
    }

    private void b(String s1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (o())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s1);
_L2:
        return;
        of.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private void c(String s1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (o())
        {
            break MISSING_BLOCK_LABEL_23;
        }
        evaluateJavascript(s1, null);
_L2:
        return;
        of.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private void d(String s1)
    {
        if (alv.f())
        {
            if (t() == null)
            {
                s();
            }
            if (t().booleanValue())
            {
                c(s1);
                return;
            } else
            {
                b((new StringBuilder("javascript:")).append(s1).toString());
                return;
            }
        } else
        {
            b((new StringBuilder("javascript:")).append(s1).toString());
            return;
        }
    }

    private boolean r()
    {
        if (i().b())
        {
            ot.e();
            DisplayMetrics displaymetrics = ajc.a(u);
            kx.a();
            int k1 = oe.b(displaymetrics, displaymetrics.widthPixels);
            kx.a();
            int l1 = oe.b(displaymetrics, displaymetrics.heightPixels);
            Activity activity = d();
            int i1;
            int j1;
            if (activity == null || activity.getWindow() == null)
            {
                j1 = l1;
                i1 = k1;
            } else
            {
                ot.e();
                int ai[] = ajc.a(activity);
                kx.a();
                i1 = oe.b(displaymetrics, ai[0]);
                kx.a();
                j1 = oe.b(displaymetrics, ai[1]);
            }
            if (r != k1 || q != l1 || s != i1 || t != j1)
            {
                boolean flag;
                if (r != k1 || q != l1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                r = k1;
                q = l1;
                s = i1;
                t = j1;
                (new afh(this)).a(k1, l1, i1, j1, displaymetrics.density, u.getDefaultDisplay().getRotation());
                return flag;
            }
        }
        return false;
    }

    private void s()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        n = ot.h().h();
        boolean1 = n;
        if (boolean1 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        evaluateJavascript("(function(){})()", null);
        a(Boolean.valueOf(true));
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        a(Boolean.valueOf(false));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private Boolean t()
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

    private void u()
    {
        Activity activity = d();
        if (m && activity != null)
        {
            ot.g().a(activity, this);
            m = false;
        }
    }

    private void v()
    {
        Activity activity = d();
        if (!m && activity != null && a)
        {
            ot.e();
            ajc.a(activity, this);
            m = true;
        }
    }

    private void w()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (!k && !h.e) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        of.a("Disabling hardware acceleration on an overlay.");
        x();
_L5:
        return;
_L4:
        of.a("Enabling hardware acceleration on an overlay.");
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
            of.a("Disabling hardware acceleration on an AdView.");
            x();
        }
          goto _L5
        of.a("Enabling hardware acceleration on an AdView.");
        y();
          goto _L5
    }

    private void x()
    {
        synchronized (d)
        {
            if (!l)
            {
                ot.g().c(this);
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
        synchronized (d)
        {
            if (l)
            {
                ot.g().b(this);
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
        hashmap.put("version", f.b);
        a("onhide", ((Map) (hashmap)));
    }

    public final void a(Context context)
    {
        c.setBaseContext(context);
    }

    public final void a(Context context, AdSizeParcel adsizeparcel)
    {
        synchronized (d)
        {
            u();
            a(context);
            g = null;
            h = adsizeparcel;
            k = false;
            i = false;
            o = -1;
            ot.g().b(this);
            loadUrl("about:blank");
            b.e();
            setOnTouchListener(null);
            setOnClickListener(null);
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(AdSizeParcel adsizeparcel)
    {
        synchronized (d)
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
        synchronized (d)
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
        d((new StringBuilder()).append(s1).append("(").append(s2).append(");").toString());
    }

    public final void a(String s1, Map map)
    {
        try
        {
            map = ot.e().a(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            of.e("Could not convert parameters to JSON.");
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
        of.d((new StringBuilder("Dispatching AFMA event: ")).append(((StringBuilder) (obj)).toString()).toString());
        d(((StringBuilder) (obj)).toString());
    }

    public final void a(me me1)
    {
        synchronized (d)
        {
            g = me1;
        }
        return;
        me1;
        obj;
        JVM INSTR monitorexit ;
        throw me1;
    }

    public final void a(boolean flag)
    {
        synchronized (d)
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

    public final void b()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", f.b);
        a("onhide", hashmap);
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

    public final void b(String s1, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = jsonobject;
        if (jsonobject == null)
        {
            jsonobject1 = new JSONObject();
        }
        a(s1, jsonobject1.toString());
    }

    public final void b(me me1)
    {
        synchronized (d)
        {
            p = me1;
        }
        return;
        me1;
        obj;
        JVM INSTR monitorexit ;
        throw me1;
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

    public final void c()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", f.b);
        a("onshow", hashmap);
    }

    public final Activity d()
    {
        return c.a();
    }

    public final void destroy()
    {
label0:
        {
            synchronized (d)
            {
                u();
                if (g != null)
                {
                    g.a();
                    g.j();
                    g = null;
                }
                b.e();
                if (!j)
                {
                    break label0;
                }
            }
            return;
        }
        ot.p();
        ads.a(this);
        j = true;
        of.d("Initiating WebView self destruct sequence in 3...");
        b.c();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Context e()
    {
        return c.b();
    }

    public final void evaluateJavascript(String s1, ValueCallback valuecallback)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (!o())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        of.e("The webview is destroyed. Ignoring action.");
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

    public final me f()
    {
        me me1;
        synchronized (d)
        {
            me1 = g;
        }
        return me1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final me g()
    {
        me me1;
        synchronized (d)
        {
            me1 = p;
        }
        return me1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final AdSizeParcel h()
    {
        AdSizeParcel adsizeparcel;
        synchronized (d)
        {
            adsizeparcel = h;
        }
        return adsizeparcel;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final akl i()
    {
        return b;
    }

    public final boolean j()
    {
        return i;
    }

    public final amb k()
    {
        return e;
    }

    public final VersionInfoParcel l()
    {
        return f;
    }

    public final void loadData(String s1, String s2, String s3)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (o())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s1, s2, s3);
_L2:
        return;
        of.e("The webview is destroyed. Ignoring action.");
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
        if (o())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s1, s2, s3, s4, s5);
_L2:
        return;
        of.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void loadUrl(String s1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (o())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        super.loadUrl(s1);
_L2:
        return;
        of.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean m()
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

    public final int n()
    {
        int i1;
        synchronized (d)
        {
            i1 = o;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean o()
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

    protected final void onAttachedToWindow()
    {
        synchronized (d)
        {
            super.onAttachedToWindow();
            if (!o())
            {
                a = true;
                if (b.b())
                {
                    v();
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
        synchronized (d)
        {
            if (!o())
            {
                u();
                a = false;
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
            of.a((new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s1).append(" / ").append(s4).toString());
        }
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
        boolean flag = r();
        me me1 = f();
        if (me1 != null && flag)
        {
            me1.m();
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        int l1;
label0:
        {
            l1 = 0x7fffffff;
            synchronized (d)
            {
                if (!o())
                {
                    break label0;
                }
                setMeasuredDimension(0, 0);
            }
            return;
        }
        if (!isInEditMode() && !k)
        {
            break MISSING_BLOCK_LABEL_63;
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
            break MISSING_BLOCK_LABEL_114;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        u.getDefaultDisplay().getMetrics(displaymetrics);
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
        break MISSING_BLOCK_LABEL_138;
_L4:
        if (h.g <= i1 && h.d <= j1)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        float f1 = c.getResources().getDisplayMetrics().density;
        of.e((new StringBuilder("Not enough space to show ad. Needs ")).append((int)((float)h.g / f1)).append("x").append((int)((float)h.d / f1)).append(" dp, but only has ").append((int)((float)k1 / f1)).append("x").append((int)((float)i2 / f1)).append(" dp.").toString());
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
            of.b("Could not pause webview.", exception);
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
            of.b("Could not resume webview.", exception);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (e != null)
        {
            e.a(motionevent);
        }
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
        synchronized (d)
        {
            of.d("Destroying WebView!");
            super.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void q()
    {
        synchronized (d)
        {
            v();
        }
        return;
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
            of.b("Could not stop loading webview.", exception);
        }
    }
}
