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
import android.view.View;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class cle extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, ckw
{

    private final WindowManager A = (WindowManager)getContext().getSystemService("window");
    private final clf a;
    private final Object b = new Object();
    private final bzm c;
    private final VersionInfoParcel d;
    private final bkf e;
    private ckx f;
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
    private cbi q;
    private cbi r;
    private cbi s;
    private cbj t;
    private zzd u;
    private ckf v;
    private int w;
    private int x;
    private int y;
    private int z;

    private cle(clf clf1, AdSizeParcel adsizeparcel, boolean flag, bzm bzm1, VersionInfoParcel versioninfoparcel, cbk cbk1, bkf bkf)
    {
        super(clf1);
        o = true;
        p = "";
        w = -1;
        x = -1;
        y = -1;
        z = -1;
        a = clf1;
        h = adsizeparcel;
        k = flag;
        n = -1;
        c = bzm1;
        d = versioninfoparcel;
        e = bkf;
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
        adsizeparcel.setUserAgentString(bkv.e().a(clf1, versioninfoparcel.b));
        bkv.g().a(getContext(), adsizeparcel);
        setDownloadListener(this);
        B();
        if (cnv.a(17))
        {
            addJavascriptInterface(new clg(), "googleAdsJsInterface");
        }
        v = new ckf(a.a, this, null);
        a(cbk1);
    }

    private Boolean A()
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

    private void B()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (!k && !h.e) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        bka.a("Disabling hardware acceleration on an overlay.");
        C();
_L5:
        return;
_L4:
        bka.a("Enabling hardware acceleration on an overlay.");
        D();
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
            bka.a("Disabling hardware acceleration on an AdView.");
            C();
        }
          goto _L5
        bka.a("Enabling hardware acceleration on an AdView.");
        D();
          goto _L5
    }

    private void C()
    {
        synchronized (b)
        {
            if (!l)
            {
                bkv.g().c(this);
            }
            l = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void D()
    {
        synchronized (b)
        {
            if (l)
            {
                bkv.g().b(this);
            }
            l = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void E()
    {
        cbk cbk1;
        if (t != null)
        {
            if ((cbk1 = t.b) != null && bkv.h().c() != null)
            {
                bkv.h().c().a(cbk1);
                return;
            }
        }
    }

    static cle a(Context context, AdSizeParcel adsizeparcel, boolean flag, bzm bzm1, VersionInfoParcel versioninfoparcel, cbk cbk1, bkf bkf)
    {
        return new cle(new clf(context), adsizeparcel, flag, bzm1, versioninfoparcel, cbk1, bkf);
    }

    private void a(cbk cbk1)
    {
        E();
        t = new cbj(new cbk(true, "make_wv", h.b));
        cbk cbk2 = t.b;
        synchronized (cbk2.b)
        {
            cbk2.d = cbk1;
        }
        r = cbg.a(t.b);
        t.a("native:view_create", r);
        s = null;
        q = null;
        return;
        cbk1;
        obj;
        JVM INSTR monitorexit ;
        throw cbk1;
    }

    static void a(cle cle1)
    {
        cle1.WebView.destroy();
    }

    private void a(Boolean boolean1)
    {
        m = boolean1;
        cix cix1 = bkv.h();
        synchronized (cix1.a)
        {
            cix1.g = boolean1;
        }
        return;
        boolean1;
        obj;
        JVM INSTR monitorexit ;
        throw boolean1;
    }

    private void c(String s1)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (q())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s1);
_L2:
        return;
        bka.e("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private void d(String s1)
    {
        if (!cnv.a(19))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (A() != null) goto _L2; else goto _L1
_L1:
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        m = bkv.h().g();
        boolean1 = m;
        if (boolean1 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        evaluateJavascript("(function(){})()", null);
        a(Boolean.valueOf(true));
_L3:
        obj;
        JVM INSTR monitorexit ;
_L2:
        if (!A().booleanValue())
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (q())
        {
            break MISSING_BLOCK_LABEL_109;
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
        bka.e("The webview is destroyed. Ignoring action.");
          goto _L4
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        c((new StringBuilder("javascript:")).append(s1).toString());
        return;
        c((new StringBuilder("javascript:")).append(s1).toString());
        return;
          goto _L3
    }

    private boolean z()
    {
        if (f.a())
        {
            bkv.e();
            DisplayMetrics displaymetrics = cjj.a(A);
            bfq.a();
            int k1 = bjz.b(displaymetrics, displaymetrics.widthPixels);
            bfq.a();
            int l1 = bjz.b(displaymetrics, displaymetrics.heightPixels);
            Activity activity = a.a;
            int i1;
            int j1;
            if (activity == null || activity.getWindow() == null)
            {
                j1 = l1;
                i1 = k1;
            } else
            {
                bkv.e();
                int ai[] = cjj.a(activity);
                bfq.a();
                i1 = bjz.b(displaymetrics, ai[0]);
                bfq.a();
                j1 = bjz.b(displaymetrics, ai[1]);
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
                (new cgg(this)).a(k1, l1, i1, j1, displaymetrics.density, A.getDefaultDisplay().getRotation());
                return flag;
            }
        }
        return false;
    }

    public final WebView a()
    {
        return this;
    }

    public final void a(int i1)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("closetype", String.valueOf(i1));
        hashmap.put("version", d.b);
        a("onhide", ((Map) (hashmap)));
    }

    public final void a(Context context)
    {
        a.setBaseContext(context);
        v.a = a.a;
    }

    public final void a(Context context, AdSizeParcel adsizeparcel, cbk cbk1)
    {
        synchronized (b)
        {
            v.b();
            a(context);
            g = null;
            h = adsizeparcel;
            k = false;
            i = false;
            p = "";
            n = -1;
            bkv.g();
            cjl.b(this);
            loadUrl("about:blank");
            f.d();
            setOnTouchListener(null);
            setOnClickListener(null);
            o = true;
            a(cbk1);
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(bzw bzw, boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (flag)
        {
            bzw = "1";
        } else
        {
            bzw = "0";
        }
        hashmap.put("isVisible", bzw);
        a("onAdVisibilityChanged", ((Map) (hashmap)));
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
        bka.e((new StringBuilder("Could not call loadUrl. ")).append(s1).toString());
          goto _L1
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
            map = bkv.e().a(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            bka.e("Could not convert parameters to JSON.");
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
        bka.d((new StringBuilder("Dispatching AFMA event: ")).append(((StringBuilder) (obj)).toString()).toString());
        d(((StringBuilder) (obj)).toString());
    }

    public final void a(boolean flag)
    {
        synchronized (b)
        {
            k = flag;
            B();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final View b()
    {
        return this;
    }

    public final void b(int i1)
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

    public final void b(String s1)
    {
        Object obj = b;
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

    public final void c()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", d.b);
        a("onhide", hashmap);
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

    public final void d()
    {
        if (q != null)
        {
            cbg.a(t.b, s, new String[] {
                "aes"
            });
            q = cbg.a(t.b);
            t.a("native:view_show", s);
        }
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", d.b);
        a("onshow", hashmap);
    }

    public final void destroy()
    {
label0:
        {
            synchronized (b)
            {
                E();
                v.b();
                if (g != null)
                {
                    g.a();
                    g.k();
                    g = null;
                }
                f.d();
                if (!j)
                {
                    break label0;
                }
            }
            return;
        }
        bkv.r();
        cdy.a(this);
        synchronized (b) { }
        j = true;
        bka.d("Initiating WebView self destruct sequence in 3...");
        f.c();
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Activity e()
    {
        return a.a;
    }

    public final void evaluateJavascript(String s1, ValueCallback valuecallback)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (!q())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        bka.e("The webview is destroyed. Ignoring action.");
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

    public final Context f()
    {
        return a.b;
    }

    public final bkf g()
    {
        return e;
    }

    public final zzd h()
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

    public final zzd i()
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

    public final AdSizeParcel j()
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

    public final ckx k()
    {
        return f;
    }

    public final boolean l()
    {
        return i;
    }

    public final void loadData(String s1, String s2, String s3)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (q())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s1, s2, s3);
_L2:
        return;
        bka.e("The webview is destroyed. Ignoring action.");
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
        if (q())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s1, s2, s3, s4, s5);
_L2:
        return;
        bka.e("The webview is destroyed. Ignoring action.");
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
        boolean flag = q();
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
        bka.e((new StringBuilder("Could not call loadUrl. ")).append(s1).toString());
          goto _L1
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        bka.e("The webview is destroyed. Ignoring action.");
          goto _L1
    }

    public final bzm m()
    {
        return c;
    }

    public final VersionInfoParcel n()
    {
        return d;
    }

    public final boolean o()
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

    protected final void onAttachedToWindow()
    {
        synchronized (b)
        {
            super.onAttachedToWindow();
            if (!q())
            {
                v.c();
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
            if (!q())
            {
                v.d();
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
            bkv.e();
            cjj.a(getContext(), s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            bka.a((new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s1).append(" / ").append(s4).toString());
        }
    }

    protected final void onDraw(Canvas canvas)
    {
        while (q() || android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) 
        {
            return;
        }
        super.onDraw(canvas);
    }

    public final void onGlobalLayout()
    {
        boolean flag = z();
        zzd zzd1 = h();
        if (zzd1 != null && flag && zzd1.h)
        {
            zzd1.h = false;
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
                if (!q())
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
        A.getDefaultDisplay().getMetrics(displaymetrics);
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
        bka.e((new StringBuilder("Not enough space to show ad. Needs ")).append((int)((float)h.g / f1)).append("x").append((int)((float)h.d / f1)).append(" dp, but only has ").append((int)((float)k1 / f1)).append("x").append((int)((float)i2 / f1)).append(" dp.").toString());
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
        if (!q()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!cnv.a(11)) goto _L1; else goto _L3
_L3:
        super.onPause();
        return;
        Exception exception;
        exception;
        bka.b("Could not pause webview.", exception);
        return;
    }

    public final void onResume()
    {
        if (!q()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!cnv.a(11)) goto _L1; else goto _L3
_L3:
        super.onResume();
        return;
        Exception exception;
        exception;
        bka.b("Could not resume webview.", exception);
        return;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (c != null)
        {
            c.a(motionevent);
        }
        if (q())
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public final int p()
    {
        int i1;
        synchronized (b)
        {
            i1 = n;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean q()
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

    public final void r()
    {
        synchronized (b)
        {
            bka.d("Destroying WebView!");
            cjj.a.post(new Runnable() {

                private cle a;

                public final void run()
                {
                    cle.a(a);
                }

            
            {
                a = cle.this;
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

    public final boolean s()
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

    public final void setWebViewClient(WebViewClient webviewclient)
    {
        super.setWebViewClient(webviewclient);
        if (webviewclient instanceof ckx)
        {
            f = (ckx)webviewclient;
        }
    }

    public final void stopLoading()
    {
        if (q())
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
            bka.b("Could not stop loading webview.", exception);
        }
    }

    public final String t()
    {
        String s1;
        synchronized (b)
        {
            s1 = p;
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ckv u()
    {
        return null;
    }

    public final cbi v()
    {
        return s;
    }

    public final cbj w()
    {
        return t;
    }

    public final void x()
    {
        v.a();
    }

    public final void y()
    {
        if (s == null && !"about:blank".equals(getUrl()))
        {
            s = cbg.a(t.b);
            t.a("native:view_load", s);
        }
    }
}
