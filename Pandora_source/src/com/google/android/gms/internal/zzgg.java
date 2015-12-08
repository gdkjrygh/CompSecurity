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
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzgd, zzfl, zzfm, zzic, 
//            zzgh, zzfc, zzge, zzcc, 
//            zzk, zzdg

public class zzgg extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzgd
{
    public static class zza extends MutableContextWrapper
    {

        private Context zzDA;
        private Activity zzDz;
        private Context zzoh;

        public Object getSystemService(String s)
        {
            return zzDA.getSystemService(s);
        }

        public void setBaseContext(Context context)
        {
            zzoh = context.getApplicationContext();
            Activity activity;
            if (context instanceof Activity)
            {
                activity = (Activity)context;
            } else
            {
                activity = null;
            }
            zzDz = activity;
            zzDA = context;
            super.setBaseContext(zzoh);
        }

        public void startActivity(Intent intent)
        {
            if (zzDz != null && !zzic.zznl())
            {
                zzDz.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                zzoh.startActivity(intent);
                return;
            }
        }

        public Activity zzfp()
        {
            return zzDz;
        }

        public Context zzfq()
        {
            return zzDA;
        }

        public zza(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private Boolean zzBV;
    private final zza zzDp;
    private zzc zzDq;
    private boolean zzDr;
    private boolean zzDs;
    private boolean zzDt;
    private boolean zzDu;
    private boolean zzDv;
    private int zzDw;
    private zzc zzDx;
    boolean zzDy;
    private final Object zzoe = new Object();
    private final VersionInfoParcel zzoi;
    private final WindowManager zzor = (WindowManager)getContext().getSystemService("window");
    private final zzk zzsW;
    private AdSizeParcel zzuO;
    private int zzvR;
    private int zzvS;
    private int zzvU;
    private int zzvV;
    private final zzge zzxS;

    protected zzgg(zza zza1, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, zzk zzk1, VersionInfoParcel versioninfoparcel)
    {
        super(zza1);
        zzvS = -1;
        zzvR = -1;
        zzvU = -1;
        zzvV = -1;
        zzDp = zza1;
        zzuO = adsizeparcel;
        zzDt = flag;
        zzDv = false;
        zzDw = -1;
        zzsW = zzk1;
        zzoi = versioninfoparcel;
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
        zzh.zzaQ().zza(zza1, versioninfoparcel.zzCI, adsizeparcel);
        zzh.zzaS().zza(getContext(), adsizeparcel);
        setDownloadListener(this);
        zzxS = zzh.zzaS().zzb(this, flag1);
        setWebViewClient(zzxS);
        setWebChromeClient(zzh.zzaS().zze(this));
        zzfL();
        if (zzic.zznj())
        {
            addJavascriptInterface(new zzgh(this), "googleAdsJsInterface");
        }
    }

    static zzgg zzb(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, zzk zzk1, VersionInfoParcel versioninfoparcel)
    {
        return new zzgg(new zza(context), adsizeparcel, flag, flag1, zzk1, versioninfoparcel);
    }

    private void zzfI()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        zzBV = zzh.zzaT().zzeQ();
        boolean1 = zzBV;
        if (boolean1 != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        evaluateJavascript("(function(){})()", null);
        zzb(Boolean.valueOf(true));
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        zzb(Boolean.valueOf(false));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private void zzfJ()
    {
        Activity activity = zzfp();
        if (zzDv && activity != null)
        {
            zzh.zzaS().zzb(activity, this);
            zzDv = false;
        }
    }

    private void zzfL()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (!zzDt && !zzuO.zzpY) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zzaj("Disabling hardware acceleration on an overlay.");
        zzfM();
_L5:
        return;
_L4:
        com.google.android.gms.ads.internal.util.client.zzb.zzaj("Enabling hardware acceleration on an overlay.");
        zzfN();
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
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Disabling hardware acceleration on an AdView.");
            zzfM();
        }
          goto _L5
        com.google.android.gms.ads.internal.util.client.zzb.zzaj("Enabling hardware acceleration on an AdView.");
        zzfN();
          goto _L5
    }

    private void zzfM()
    {
        synchronized (zzoe)
        {
            if (!zzDu)
            {
                zzh.zzaS().zzm(this);
            }
            zzDu = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzfN()
    {
        synchronized (zzoe)
        {
            if (zzDu)
            {
                zzh.zzaS().zzl(this);
            }
            zzDu = false;
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
            synchronized (zzoe)
            {
                zzfJ();
                if (zzDq != null)
                {
                    zzDq.close();
                    zzDq.onDestroy();
                    zzDq = null;
                }
                zzxS.reset();
                if (!zzDs)
                {
                    break label0;
                }
            }
            return;
        }
        zzh.zzbb().zza(this);
        zzDs = true;
        com.google.android.gms.ads.internal.util.client.zzb.zzam("Initiating WebView self destruct sequence in 3...");
        zzxS.zzfB();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void evaluateJavascript(String s, ValueCallback valuecallback)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (!isDestroyed())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzan("The webview is destroyed. Ignoring action.");
        if (valuecallback == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        valuecallback.onReceiveValue(null);
        obj;
        JVM INSTR monitorexit ;
        return;
        super.evaluateJavascript(s, valuecallback);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public int getRequestedOrientation()
    {
        int i;
        synchronized (zzoe)
        {
            i = zzDw;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public WebView getWebView()
    {
        return this;
    }

    public boolean isDestroyed()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzDs;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void loadData(String s, String s1, String s2)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s, s1, s2);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzan("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s, s1, s2, s3, s4);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzan("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void loadUrl(String s)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        super.loadUrl(s);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzan("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void onAttachedToWindow()
    {
        synchronized (zzoe)
        {
            super.onAttachedToWindow();
            if (!isDestroyed())
            {
                zzDy = true;
                if (zzxS.zzbg())
                {
                    zzfK();
                }
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
        synchronized (zzoe)
        {
            if (!isDestroyed())
            {
                zzfJ();
                zzDy = false;
            }
            super.onDetachedFromWindow();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        try
        {
            s1 = new Intent("android.intent.action.VIEW");
            s1.setDataAndType(Uri.parse(s), s3);
            getContext().startActivity(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
        }
    }

    protected void onDraw(Canvas canvas)
    {
        while (isDestroyed() || android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) 
        {
            return;
        }
        super.onDraw(canvas);
    }

    public void onGlobalLayout()
    {
        boolean flag = zzfH();
        zzc zzc1 = zzfr();
        if (zzc1 != null && flag)
        {
            zzc1.zzdx();
        }
    }

    protected void onMeasure(int i, int j)
    {
        int l;
label0:
        {
            l = 0x7fffffff;
            synchronized (zzoe)
            {
                if (!isDestroyed())
                {
                    break label0;
                }
                setMeasuredDimension(0, 0);
            }
            return;
        }
        if (!isInEditMode() && !zzDt)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        super.onMeasure(i, j);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (!zzuO.zzpY)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        zzor.getDefaultDisplay().getMetrics(displaymetrics);
        setMeasuredDimension(displaymetrics.widthPixels, displaymetrics.heightPixels);
        obj;
        JVM INSTR monitorexit ;
        return;
        int k;
        int i1;
        int j1;
        int k1;
        k1 = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        j1 = android.view.View.MeasureSpec.getMode(j);
        i1 = android.view.View.MeasureSpec.getSize(j);
        break MISSING_BLOCK_LABEL_138;
_L4:
        if (zzuO.widthPixels <= i && zzuO.heightPixels <= j)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        float f = zzDp.getResources().getDisplayMetrics().density;
        com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Not enough space to show ad. Needs ").append((int)((float)zzuO.widthPixels / f)).append("x").append((int)((float)zzuO.heightPixels / f)).append(" dp, but only has ").append((int)((float)k / f)).append("x").append((int)((float)i1 / f)).append(" dp.").toString());
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
        setMeasuredDimension(zzuO.widthPixels, zzuO.heightPixels);
        if (true) goto _L2; else goto _L1
_L1:
        if (k1 != 0x80000000 && k1 != 0x40000000)
        {
            i = 0x7fffffff;
        } else
        {
            i = k;
        }
        if (j1 != 0x80000000)
        {
            j = l;
            if (j1 != 0x40000000)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j = i1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPause()
    {
        if (isDestroyed())
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
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not pause webview.", exception);
        }
    }

    public void onResume()
    {
        if (isDestroyed())
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
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not resume webview.", exception);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (zzsW != null)
        {
            zzsW.zza(motionevent);
        }
        if (isDestroyed())
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void setContext(Context context)
    {
        zzDp.setBaseContext(context);
    }

    public void setRequestedOrientation(int i)
    {
        synchronized (zzoe)
        {
            zzDw = i;
            if (zzDq != null)
            {
                zzDq.setRequestedOrientation(zzDw);
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
        if (isDestroyed())
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
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not stop loading webview.", exception);
        }
    }

    public void zzB(boolean flag)
    {
        synchronized (zzoe)
        {
            zzDt = flag;
            zzfL();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzC(boolean flag)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzDq == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        zzDq.zza(zzxS.zzbg(), flag);
_L2:
        return;
        zzDr = flag;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(Context context, AdSizeParcel adsizeparcel)
    {
        synchronized (zzoe)
        {
            zzfJ();
            setContext(context);
            zzDq = null;
            zzuO = adsizeparcel;
            zzDt = false;
            zzDr = false;
            zzDw = -1;
            zzh.zzaS().zzb(this);
            loadUrl("about:blank");
            zzxS.reset();
            setOnTouchListener(null);
            setOnClickListener(null);
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(AdSizeParcel adsizeparcel)
    {
        synchronized (zzoe)
        {
            zzuO = adsizeparcel;
            requestLayout();
        }
        return;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public void zza(zzc zzc1)
    {
        synchronized (zzoe)
        {
            zzDq = zzc1;
        }
        return;
        zzc1;
        obj;
        JVM INSTR monitorexit ;
        throw zzc1;
    }

    protected void zza(String s, ValueCallback valuecallback)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed()) goto _L2; else goto _L1
_L1:
        evaluateJavascript(s, valuecallback);
_L4:
        return;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzan("The webview is destroyed. Ignoring action.");
        if (valuecallback == null) goto _L4; else goto _L3
_L3:
        valuecallback.onReceiveValue(null);
          goto _L4
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zza(String s, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = jsonobject;
        if (jsonobject == null)
        {
            jsonobject1 = new JSONObject();
        }
        zzb(s, jsonobject1.toString());
    }

    public AdSizeParcel zzah()
    {
        AdSizeParcel adsizeparcel;
        synchronized (zzoe)
        {
            adsizeparcel = zzuO;
        }
        return adsizeparcel;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzao(String s)
    {
        synchronized (zzoe)
        {
            super.loadUrl(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void zzap(String s)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzan("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void zzaq(String s)
    {
        if (zzic.zznk())
        {
            if (zzeQ() == null)
            {
                zzfI();
            }
            if (zzeQ().booleanValue())
            {
                zza(s, ((ValueCallback) (null)));
                return;
            } else
            {
                zzap((new StringBuilder()).append("javascript:").append(s).toString());
                return;
            }
        } else
        {
            zzap((new StringBuilder()).append("javascript:").append(s).toString());
            return;
        }
    }

    public void zzb(zzc zzc1)
    {
        synchronized (zzoe)
        {
            zzDx = zzc1;
        }
        return;
        zzc1;
        obj;
        JVM INSTR monitorexit ;
        throw zzc1;
    }

    void zzb(Boolean boolean1)
    {
        zzBV = boolean1;
        zzh.zzaT().zzb(boolean1);
    }

    public void zzb(String s, String s1)
    {
        zzaq((new StringBuilder()).append(s).append("(").append(s1).append(");").toString());
    }

    public void zzb(String s, Map map)
    {
        try
        {
            map = zzh.zzaQ().zzx(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Could not convert parameters to JSON.");
            return;
        }
        zzb(s, ((JSONObject) (map)));
    }

    public void zzb(String s, JSONObject jsonobject)
    {
        Object obj = jsonobject;
        if (jsonobject == null)
        {
            obj = new JSONObject();
        }
        jsonobject = ((JSONObject) (obj)).toString();
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("AFMA_ReceiveMessage('");
        ((StringBuilder) (obj)).append(s);
        ((StringBuilder) (obj)).append("'");
        ((StringBuilder) (obj)).append(",");
        ((StringBuilder) (obj)).append(jsonobject);
        ((StringBuilder) (obj)).append(");");
        com.google.android.gms.ads.internal.util.client.zzb.zzam((new StringBuilder()).append("Dispatching AFMA event: ").append(((StringBuilder) (obj)).toString()).toString());
        zzaq(((StringBuilder) (obj)).toString());
    }

    public void zzdy()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", zzoi.zzCI);
        zzb("onshow", hashmap);
    }

    Boolean zzeQ()
    {
        Boolean boolean1;
        synchronized (zzoe)
        {
            boolean1 = zzBV;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzfH()
    {
        if (zzft().zzbg())
        {
            DisplayMetrics displaymetrics = zzh.zzaQ().zza(zzor);
            int k = zzj.zzbJ().zzb(displaymetrics, displaymetrics.widthPixels);
            int l = zzj.zzbJ().zzb(displaymetrics, displaymetrics.heightPixels);
            Activity activity = zzfp();
            int i;
            int j;
            if (activity == null || activity.getWindow() == null)
            {
                j = l;
                i = k;
            } else
            {
                int ai[] = zzh.zzaQ().zzg(activity);
                i = zzj.zzbJ().zzb(displaymetrics, ai[0]);
                j = zzj.zzbJ().zzb(displaymetrics, ai[1]);
            }
            if (zzvR != k || zzvS != l || zzvU != i || zzvV != j)
            {
                boolean flag;
                if (zzvR != k || zzvS != l)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzvR = k;
                zzvS = l;
                zzvU = i;
                zzvV = j;
                (new zzdg(this)).zza(k, l, i, j, displaymetrics.density, zzor.getDefaultDisplay().getRotation());
                return flag;
            }
        }
        return false;
    }

    void zzfK()
    {
        Activity activity = zzfp();
        if (!zzDv && activity != null && zzDy)
        {
            zzh.zzaQ().zza(activity, this);
            zzDv = true;
        }
    }

    public void zzfo()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", zzoi.zzCI);
        zzb("onhide", hashmap);
    }

    public Activity zzfp()
    {
        return zzDp.zzfp();
    }

    public Context zzfq()
    {
        return zzDp.zzfq();
    }

    public zzc zzfr()
    {
        zzc zzc1;
        synchronized (zzoe)
        {
            zzc1 = zzDq;
        }
        return zzc1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzc zzfs()
    {
        zzc zzc1;
        synchronized (zzoe)
        {
            zzc1 = zzDx;
        }
        return zzc1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzge zzft()
    {
        return zzxS;
    }

    public boolean zzfu()
    {
        return zzDr;
    }

    public zzk zzfv()
    {
        return zzsW;
    }

    public VersionInfoParcel zzfw()
    {
        return zzoi;
    }

    public boolean zzfx()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzDt;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzfy()
    {
        synchronized (zzoe)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzam("Destroying WebView!");
            super.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzfz()
    {
        synchronized (zzoe)
        {
            zzfK();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzp(int i)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("closetype", String.valueOf(i));
        hashmap.put("version", zzoi.zzCI);
        zzb("onhide", hashmap);
    }
}
