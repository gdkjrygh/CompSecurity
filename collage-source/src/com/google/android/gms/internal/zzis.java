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
import com.google.android.gms.ads.internal.client.zzk;
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
//            hs, gw, gx, jc, 
//            hv, hg, gn, cs, 
//            ht, cr, n, ed, 
//            z

public class zzis extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, hs
{
    public static class a extends MutableContextWrapper
    {

        private Activity a;
        private Context b;
        private Context c;

        public Activity a()
        {
            return a;
        }

        public Context b()
        {
            return c;
        }

        public Object getSystemService(String s1)
        {
            return c.getSystemService(s1);
        }

        public void setBaseContext(Context context)
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

        public void startActivity(Intent intent)
        {
            if (a != null && !jc.h())
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


    private final ht a;
    private final a b;
    private final Object c = new Object();
    private final n d;
    private final VersionInfoParcel e;
    private final com.google.android.gms.ads.internal.zzd f;
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
    private String q;
    private zzd r;
    private hg s;
    private int t;
    private int u;
    private int v;
    private int w;
    private Map x;
    private final WindowManager y = (WindowManager)getContext().getSystemService("window");

    protected zzis(a a1, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, n n1, VersionInfoParcel versioninfoparcel, com.google.android.gms.ads.internal.zzd zzd1)
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
        d = n1;
        e = versioninfoparcel;
        f = zzd1;
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
        zzp.zzbx().a(a1, versioninfoparcel.zzIz, adsizeparcel);
        zzp.zzbz().a(getContext(), adsizeparcel);
        setDownloadListener(this);
        a = zzp.zzbz().a(this, flag1);
        setWebViewClient(a);
        setWebChromeClient(zzp.zzbz().a(this));
        v();
        if (jc.d())
        {
            addJavascriptInterface(new hv(this), "googleAdsJsInterface");
        }
        s = new hg(b.a(), this, null);
    }

    static zzis a(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, n n1, VersionInfoParcel versioninfoparcel, com.google.android.gms.ads.internal.zzd zzd1)
    {
        return new zzis(new a(context), adsizeparcel, flag, flag1, n1, versioninfoparcel, zzd1);
    }

    static void a(zzis zzis1)
    {
        zzis1.WebView.destroy();
    }

    private void u()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        m = zzp.zzbA().i();
        boolean1 = m;
        if (boolean1 != null)
        {
            break MISSING_BLOCK_LABEL_41;
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

    private void v()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!k && !h.zzsH) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        zzb.zzaC("Disabling hardware acceleration on an overlay.");
        w();
_L5:
        return;
_L4:
        zzb.zzaC("Enabling hardware acceleration on an overlay.");
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
            zzb.zzaC("Disabling hardware acceleration on an AdView.");
            w();
        }
          goto _L5
        zzb.zzaC("Enabling hardware acceleration on an AdView.");
        x();
          goto _L5
    }

    private void w()
    {
        synchronized (c)
        {
            if (!l)
            {
                zzp.zzbz().c(this);
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
                zzp.zzbz().b(this);
            }
            l = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void y()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (x != null)
        {
            for (Iterator iterator = x.values().iterator(); iterator.hasNext(); ((cs)iterator.next()).b()) { }
        }
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.zzIz);
        a("onhide", ((Map) (hashmap)));
    }

    public void a(int i1)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("closetype", String.valueOf(i1));
        hashmap.put("version", e.zzIz);
        a("onhide", ((Map) (hashmap)));
    }

    public void a(Context context, AdSizeParcel adsizeparcel)
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
            zzp.zzbz().b(this);
            loadUrl("about:blank");
            a.f();
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

    public void a(AdSizeParcel adsizeparcel)
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

    public void a(zzd zzd1)
    {
        synchronized (c)
        {
            g = zzd1;
        }
        return;
        zzd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzd1;
    }

    public void a(z z, boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (flag)
        {
            z = "1";
        } else
        {
            z = "0";
        }
        hashmap.put("isVisible", z);
        a("onAdVisibilityChanged", ((Map) (hashmap)));
    }

    void a(Boolean boolean1)
    {
        m = boolean1;
        zzp.zzbA().a(boolean1);
    }

    public void a(String s1)
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

    protected void a(String s1, ValueCallback valuecallback)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (n()) goto _L2; else goto _L1
_L1:
        evaluateJavascript(s1, valuecallback);
_L4:
        return;
_L2:
        zzb.zzaE("The webview is destroyed. Ignoring action.");
        if (valuecallback == null) goto _L4; else goto _L3
_L3:
        valuecallback.onReceiveValue(null);
          goto _L4
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void a(String s1, String s2)
    {
        e((new StringBuilder()).append(s1).append("(").append(s2).append(");").toString());
    }

    public void a(String s1, Map map)
    {
        try
        {
            map = zzp.zzbx().a(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            zzb.zzaE("Could not convert parameters to JSON.");
            return;
        }
        a(s1, ((JSONObject) (map)));
    }

    public void a(String s1, JSONObject jsonobject)
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
        zzb.v((new StringBuilder()).append("Dispatching AFMA event: ").append(((StringBuilder) (obj)).toString()).toString());
        e(((StringBuilder) (obj)).toString());
    }

    public void a(boolean flag)
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

    public void b()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.zzIz);
        a("onshow", hashmap);
    }

    public void b(zzd zzd1)
    {
        synchronized (c)
        {
            r = zzd1;
        }
        return;
        zzd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzd1;
    }

    public void b(String s1)
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

    public void b(String s1, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = jsonobject;
        if (jsonobject == null)
        {
            jsonobject1 = new JSONObject();
        }
        a(s1, jsonobject1.toString());
    }

    public void b(boolean flag)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        g.zza(a.b(), flag);
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

    public Activity c()
    {
        return b.a();
    }

    public void c(String s1)
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

    public void c(boolean flag)
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

    public Context d()
    {
        return b.b();
    }

    protected void d(String s1)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (n())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s1);
_L2:
        return;
        zzb.zzaE("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
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
                    g.close();
                    g.onDestroy();
                    g = null;
                }
                a.f();
                if (!j)
                {
                    break label0;
                }
            }
            return;
        }
        zzp.zzbK().a(this);
        y();
        j = true;
        zzb.v("Initiating WebView self destruct sequence in 3...");
        a.d();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public com.google.android.gms.ads.internal.zzd e()
    {
        return f;
    }

    protected void e(String s1)
    {
        if (jc.f())
        {
            if (t() == null)
            {
                u();
            }
            if (t().booleanValue())
            {
                a(s1, ((ValueCallback) (null)));
                return;
            } else
            {
                d((new StringBuilder()).append("javascript:").append(s1).toString());
                return;
            }
        } else
        {
            d((new StringBuilder()).append("javascript:").append(s1).toString());
            return;
        }
    }

    public void evaluateJavascript(String s1, ValueCallback valuecallback)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!n())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        zzb.zzaE("The webview is destroyed. Ignoring action.");
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

    public zzd f()
    {
        zzd zzd1;
        synchronized (c)
        {
            zzd1 = g;
        }
        return zzd1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzd g()
    {
        zzd zzd1;
        synchronized (c)
        {
            zzd1 = r;
        }
        return zzd1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getRequestId()
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

    public int getRequestedOrientation()
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

    public WebView getWebView()
    {
        return this;
    }

    public AdSizeParcel h()
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

    public ht i()
    {
        return a;
    }

    public boolean j()
    {
        return i;
    }

    public n k()
    {
        return d;
    }

    public VersionInfoParcel l()
    {
        return e;
    }

    public void loadData(String s1, String s2, String s3)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (n())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s1, s2, s3);
_L2:
        return;
        zzb.zzaE("The webview is destroyed. Ignoring action.");
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
        if (n())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s1, s2, s3, s4, s5);
_L2:
        return;
        zzb.zzaE("The webview is destroyed. Ignoring action.");
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
        if (n())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        super.loadUrl(s1);
_L2:
        return;
        zzb.zzaE("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public boolean m()
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

    public boolean n()
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

    public void o()
    {
        synchronized (c)
        {
            zzb.v("Destroying WebView!");
            gw.a.post(new _cls1());
        }
        return;
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
            if (!n())
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
            if (!n())
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
            zzb.zzaC((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s1).append(" / ").append(s4).toString());
        }
    }

    protected void onDraw(Canvas canvas)
    {
        while (n() || android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) 
        {
            return;
        }
        super.onDraw(canvas);
    }

    public void onGlobalLayout()
    {
        boolean flag = s();
        zzd zzd1 = f();
        if (zzd1 != null && flag)
        {
            zzd1.zzeC();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1;
label0:
        {
            l1 = 0x7fffffff;
            synchronized (c)
            {
                if (!n())
                {
                    break label0;
                }
                setMeasuredDimension(0, 0);
            }
            return;
        }
        if (!isInEditMode() && !k && !h.zzsJ)
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
        if (!h.zzsH)
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
        if (h.widthPixels <= i1 && h.heightPixels <= j1)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        float f1 = b.getResources().getDisplayMetrics().density;
        zzb.zzaE((new StringBuilder()).append("Not enough space to show ad. Needs ").append((int)((float)h.widthPixels / f1)).append("x").append((int)((float)h.heightPixels / f1)).append(" dp, but only has ").append((int)((float)k1 / f1)).append("x").append((int)((float)i2 / f1)).append(" dp.").toString());
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

    public void onPause()
    {
        if (n())
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
            zzb.zzb("Could not pause webview.", exception);
        }
    }

    public void onResume()
    {
        if (n())
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
            zzb.zzb("Could not resume webview.", exception);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (d != null)
        {
            d.a(motionevent);
        }
        if (n())
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public boolean p()
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

    public void q()
    {
        s.a();
    }

    public String r()
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

    public boolean s()
    {
        if (i().b())
        {
            DisplayMetrics displaymetrics = zzp.zzbx().a(y);
            int k1 = zzk.zzcE().zzb(displaymetrics, displaymetrics.widthPixels);
            int l1 = zzk.zzcE().zzb(displaymetrics, displaymetrics.heightPixels);
            Activity activity = c();
            int i1;
            int j1;
            if (activity == null || activity.getWindow() == null)
            {
                j1 = l1;
                i1 = k1;
            } else
            {
                int ai[] = zzp.zzbx().a(activity);
                i1 = zzk.zzcE().zzb(displaymetrics, ai[0]);
                j1 = zzk.zzcE().zzb(displaymetrics, ai[1]);
            }
            if (u != k1 || t != l1 || v != i1 || w != j1)
            {
                boolean flag;
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
                (new ed(this)).a(k1, l1, i1, j1, displaymetrics.density, y.getDefaultDisplay().getRotation());
                return flag;
            }
        }
        return false;
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
                g.setRequestedOrientation(n);
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
            zzb.zzb("Could not stop loading webview.", exception);
        }
    }

    Boolean t()
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

    /* member class not found */
    class _cls1 {}

}
