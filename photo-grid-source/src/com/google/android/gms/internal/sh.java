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
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ry, qa, qd, wn, 
//            sk, re, sj, dl, 
//            pe, dc, dm, df, 
//            zzja, gs, gt, kp, 
//            ad, si, dk, at, 
//            rx

final class sh extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, ry
{

    private Map A;
    private final WindowManager B = (WindowManager)getContext().getSystemService("window");
    private final sj a;
    private final Object b = new Object();
    private final ad c;
    private final VersionInfoParcel d;
    private final com.google.android.gms.ads.internal.zzd e;
    private zzja f;
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
    private dk q;
    private dk r;
    private dk s;
    private dl t;
    private zzd u;
    private re v;
    private int w;
    private int x;
    private int y;
    private int z;

    private sh(sj sj1, AdSizeParcel adsizeparcel, boolean flag, ad ad1, VersionInfoParcel versioninfoparcel, dm dm1, com.google.android.gms.ads.internal.zzd zzd1)
    {
        super(sj1);
        o = true;
        p = "";
        w = -1;
        x = -1;
        y = -1;
        z = -1;
        a = sj1;
        h = adsizeparcel;
        k = flag;
        n = -1;
        c = ad1;
        d = versioninfoparcel;
        e = zzd1;
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
        adsizeparcel.setUserAgentString(zzp.zzbv().a(sj1, versioninfoparcel.zzJu));
        zzp.zzbx().a(getContext(), adsizeparcel);
        setDownloadListener(this);
        A();
        if (wn.e())
        {
            addJavascriptInterface(new sk(this), "googleAdsJsInterface");
        }
        v = new re(a.a(), this, null);
        a(dm1);
    }

    private void A()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (!k && !h.zztf) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        zzb.zzaF("Disabling hardware acceleration on an overlay.");
        B();
_L5:
        return;
_L4:
        zzb.zzaF("Enabling hardware acceleration on an overlay.");
        C();
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
            zzb.zzaF("Disabling hardware acceleration on an AdView.");
            B();
        }
          goto _L5
        zzb.zzaF("Enabling hardware acceleration on an AdView.");
        C();
          goto _L5
    }

    private void B()
    {
        synchronized (b)
        {
            if (!l)
            {
                zzp.zzbx().c(this);
            }
            l = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void C()
    {
        synchronized (b)
        {
            if (l)
            {
                zzp.zzbx().b(this);
            }
            l = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void D()
    {
        dm dm1;
        if (t != null)
        {
            if ((dm1 = t.a()) != null && zzp.zzby().d() != null)
            {
                zzp.zzby().d().a(dm1);
                return;
            }
        }
    }

    static sh a(Context context, AdSizeParcel adsizeparcel, boolean flag, ad ad1, VersionInfoParcel versioninfoparcel, dm dm1, com.google.android.gms.ads.internal.zzd zzd1)
    {
        return new sh(new sj(context), adsizeparcel, flag, ad1, versioninfoparcel, dm1, zzd1);
    }

    private void a(dm dm1)
    {
        D();
        t = new dl(new dm(true, "make_wv", h.zzte));
        t.a().a(dm1);
        r = df.a(t.a());
        t.a("native:view_create", r);
        s = null;
        q = null;
    }

    static void a(sh sh1)
    {
        sh1.WebView.destroy();
    }

    private void a(Boolean boolean1)
    {
        m = boolean1;
        zzp.zzby().a(boolean1);
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
        zzb.zzaH("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private void d(String s1)
    {
        if (!wn.g())
        {
            break MISSING_BLOCK_LABEL_143;
        }
        if (z() != null) goto _L2; else goto _L1
_L1:
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        m = zzp.zzby().h();
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
        if (!z().booleanValue())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (q())
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
        zzb.zzaH("The webview is destroyed. Ignoring action.");
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

    private Boolean z()
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

    public final WebView a()
    {
        return this;
    }

    public final void a(int i1)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("closetype", String.valueOf(i1));
        hashmap.put("version", d.zzJu);
        a("onhide", ((Map) (hashmap)));
    }

    public final void a(Context context)
    {
        a.setBaseContext(context);
        v.a(a.a());
    }

    public final void a(Context context, AdSizeParcel adsizeparcel, dm dm1)
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
            zzp.zzbx();
            qd.b(this);
            loadUrl("about:blank");
            f.reset();
            setOnTouchListener(null);
            setOnClickListener(null);
            o = true;
            a(dm1);
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
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

    public final void a(at at, boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (flag)
        {
            at = "1";
        } else
        {
            at = "0";
        }
        hashmap.put("isVisible", at);
        a("onAdVisibilityChanged", ((Map) (hashmap)));
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
        zzb.zzaH((new StringBuilder("Could not call loadUrl. ")).append(s1).toString());
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
            map = zzp.zzbv().a(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            zzb.zzaH("Could not convert parameters to JSON.");
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
        zzb.v((new StringBuilder("Dispatching AFMA event: ")).append(((StringBuilder) (obj)).toString()).toString());
        d(((StringBuilder) (obj)).toString());
    }

    public final void a(boolean flag)
    {
        synchronized (b)
        {
            k = flag;
            A();
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
                g.setRequestedOrientation(n);
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
        g.zza(f.zzbY(), flag);
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
        hashmap.put("version", d.zzJu);
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
            df.a(t.a(), s, new String[] {
                "aes"
            });
            q = df.a(t.a());
            t.a("native:view_show", s);
        }
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", d.zzJu);
        a("onshow", hashmap);
    }

    public final void destroy()
    {
label0:
        {
            synchronized (b)
            {
                D();
                v.b();
                if (g != null)
                {
                    g.close();
                    g.onDestroy();
                    g = null;
                }
                f.reset();
                if (!j)
                {
                    break label0;
                }
            }
            return;
        }
        zzp.zzbI();
        gs.a(this);
        obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        if (A != null)
        {
            for (Iterator iterator = A.values().iterator(); iterator.hasNext(); ((gt)iterator.next()).b()) { }
        }
        break MISSING_BLOCK_LABEL_133;
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
        zzb.v("Initiating WebView self destruct sequence in 3...");
        f.zzhs();
        obj;
        JVM INSTR monitorexit ;
    }

    public final Activity e()
    {
        return a.a();
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
        zzb.zzaH("The webview is destroyed. Ignoring action.");
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
        return a.b();
    }

    public final com.google.android.gms.ads.internal.zzd g()
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

    public final zzja k()
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
        zzb.zzaH("The webview is destroyed. Ignoring action.");
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
        zzb.zzaH("The webview is destroyed. Ignoring action.");
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
        zzb.zzaH((new StringBuilder("Could not call loadUrl. ")).append(s1).toString());
          goto _L1
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        zzb.zzaH("The webview is destroyed. Ignoring action.");
          goto _L1
    }

    public final ad m()
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
            zzp.zzbv();
            qa.a(getContext(), s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            zzb.zzaF((new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s1).append(" / ").append(s4).toString());
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
        boolean flag = false;
        if (f.zzbY()) goto _L2; else goto _L1
_L1:
        zzd zzd1 = h();
        if (zzd1 != null && flag)
        {
            zzd1.zzeI();
        }
        return;
_L2:
        zzp.zzbv();
        DisplayMetrics displaymetrics = qa.a(B);
        int k1 = zzl.zzcF().zzb(displaymetrics, displaymetrics.widthPixels);
        int l1 = zzl.zzcF().zzb(displaymetrics, displaymetrics.heightPixels);
        Activity activity = a.a();
        int i1;
        int j1;
        if (activity == null || activity.getWindow() == null)
        {
            j1 = l1;
            i1 = k1;
        } else
        {
            zzp.zzbv();
            int ai[] = qa.a(activity);
            i1 = zzl.zzcF().zzb(displaymetrics, ai[0]);
            j1 = zzl.zzcF().zzb(displaymetrics, ai[1]);
        }
        if (x != k1 || w != l1 || y != i1 || z != j1)
        {
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
            (new kp(this)).a(k1, l1, i1, j1, displaymetrics.density, B.getDefaultDisplay().getRotation());
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
        if (!isInEditMode() && !k && !h.zzth && !h.zzti)
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
        if (!h.zztf)
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
        if (h.widthPixels <= i1 && h.heightPixels <= j1)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        float f1 = a.getResources().getDisplayMetrics().density;
        zzb.zzaH((new StringBuilder("Not enough space to show ad. Needs ")).append((int)((float)h.widthPixels / f1)).append("x").append((int)((float)h.heightPixels / f1)).append(" dp, but only has ").append((int)((float)k1 / f1)).append("x").append((int)((float)i2 / f1)).append(" dp.").toString());
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
        setMeasuredDimension(h.widthPixels, h.heightPixels);
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
        if (!wn.a()) goto _L1; else goto _L3
_L3:
        super.onPause();
        return;
        Exception exception;
        exception;
        zzb.zzb("Could not pause webview.", exception);
        return;
    }

    public final void onResume()
    {
        if (!q()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!wn.a()) goto _L1; else goto _L3
_L3:
        super.onResume();
        return;
        Exception exception;
        exception;
        zzb.zzb("Could not resume webview.", exception);
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
            zzb.v("Destroying WebView!");
            qa.a.post(new si(this));
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
        if (webviewclient instanceof zzja)
        {
            f = (zzja)webviewclient;
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
            zzb.zzb("Could not stop loading webview.", exception);
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

    public final rx u()
    {
        return null;
    }

    public final dk v()
    {
        return s;
    }

    public final dl w()
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
            s = df.a(t.a());
            t.a("native:view_load", s);
        }
    }
}
