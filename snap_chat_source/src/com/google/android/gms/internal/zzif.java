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
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzic, zzab, zzhy, zzho, 
//            zzhp, zzhg, zzba, zzhx, 
//            zzel, zzid, zzk, zzme, 
//            zzbe, zzhw, zzeg

public class zzif extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzic
{
    public static class zza extends MutableContextWrapper
    {

        private Activity zzAj;
        private Context zzAk;
        private Context zznk;

        public Object getSystemService(String s)
        {
            return zzAk.getSystemService(s);
        }

        public void setBaseContext(Context context)
        {
            zznk = context.getApplicationContext();
            Activity activity;
            if (context instanceof Activity)
            {
                activity = (Activity)context;
            } else
            {
                activity = null;
            }
            zzAj = activity;
            zzAk = context;
            super.setBaseContext(zznk);
        }

        public void startActivity(Intent intent)
        {
            if (zzAj != null && !zzme.zzkk())
            {
                zzAj.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                zznk.startActivity(intent);
                return;
            }
        }

        public Activity zzeD()
        {
            return zzAj;
        }

        public Context zzeE()
        {
            return zzAk;
        }

        public zza(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private final zza zzAa;
    private zzel zzAb;
    private boolean zzAc;
    private boolean zzAd;
    private boolean zzAe;
    private boolean zzAf;
    private boolean zzAg;
    private int zzAh;
    boolean zzAi;
    private final Object zznh = new Object();
    private final zzhy zznl;
    private final WindowManager zznu = (WindowManager)getContext().getSystemService("window");
    private zzba zzsF;
    private int zztI;
    private int zztJ;
    private int zztL;
    private int zztM;
    private final zzid zzvy;
    private final zzk zzwg;
    private Boolean zzyV;

    protected zzif(zza zza1, zzba zzba1, boolean flag, boolean flag1, zzk zzk1, zzhy zzhy1)
    {
        super(zza1);
        zztJ = -1;
        zztI = -1;
        zztL = -1;
        zztM = -1;
        zzAa = zza1;
        zzsF = zzba1;
        zzAe = flag;
        zzAg = false;
        zzAh = -1;
        zzwg = zzk1;
        zznl = zzhy1;
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
        zzab.zzaM().zza(zza1, zzhy1.zzzH, zzba1);
        zzab.zzaO().zza(getContext(), zzba1);
        setDownloadListener(this);
        zzvy = zzab.zzaO().zzb(this, flag1);
        setWebViewClient(zzvy);
        setWebChromeClient(zzab.zzaO().zzb(this));
        zzeW();
    }

    static zzif zzb(Context context, zzba zzba1, boolean flag, boolean flag1, zzk zzk1, zzhy zzhy1)
    {
        return new zzif(new zza(context), zzba1, flag, flag1, zzk1, zzhy1);
    }

    private void zzeT()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        zzyV = zzab.zzaP().zzek();
        boolean1 = zzyV;
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

    private void zzeU()
    {
        Activity activity = zzeD();
        if (zzAg && activity != null)
        {
            zzab.zzaO().zzb(activity, this);
            zzAg = false;
        }
    }

    private void zzeW()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (!zzAe && !zzsF.zzpb) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        zzhx.zzY("Disabling hardware acceleration on an overlay.");
        zzeX();
_L5:
        return;
_L4:
        zzhx.zzY("Enabling hardware acceleration on an overlay.");
        zzeY();
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
            zzhx.zzY("Disabling hardware acceleration on an AdView.");
            zzeX();
        }
          goto _L5
        zzhx.zzY("Enabling hardware acceleration on an AdView.");
        zzeY();
          goto _L5
    }

    private void zzeX()
    {
        synchronized (zznh)
        {
            if (!zzAf)
            {
                zzab.zzaO().zzk(this);
            }
            zzAf = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzeY()
    {
        synchronized (zznh)
        {
            if (zzAf)
            {
                zzab.zzaO().zzj(this);
            }
            zzAf = false;
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
            synchronized (zznh)
            {
                zzeU();
                if (zzAb != null)
                {
                    zzAb.close();
                    zzAb.onDestroy();
                    zzAb = null;
                }
                zzvy.reset();
                if (!zzAd)
                {
                    break label0;
                }
            }
            return;
        }
        zzAd = true;
        super.destroy();
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
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (!isDestroyed())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        zzhx.zzac("The webview is destroyed. Ignoring action.");
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
        synchronized (zznh)
        {
            i = zzAh;
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
        synchronized (zznh)
        {
            flag = zzAd;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void loadData(String s, String s1, String s2)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s, s1, s2);
_L2:
        return;
        zzhx.zzac("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s, s1, s2, s3, s4);
_L2:
        return;
        zzhx.zzac("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void onAttachedToWindow()
    {
        synchronized (zznh)
        {
            super.onAttachedToWindow();
            zzAi = true;
            if (zzvy.zzba())
            {
                zzeV();
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
        synchronized (zznh)
        {
            zzeU();
            zzAi = false;
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
            zzhx.zzY((new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s).append(" / ").append(s3).toString());
        }
    }

    protected void onDraw(Canvas canvas)
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

    public void onGlobalLayout()
    {
        boolean flag = zzeS();
        zzel zzel1 = zzeF();
        if (zzel1 != null && flag)
        {
            zzel1.zzdg();
        }
    }

    protected void onMeasure(int i, int j)
    {
        int l;
label0:
        {
            l = 0x7fffffff;
            synchronized (zznh)
            {
                if (!isInEditMode() && !zzAe)
                {
                    break label0;
                }
                super.onMeasure(i, j);
            }
            return;
        }
        if (!zzsF.zzpb)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        zznu.getDefaultDisplay().getMetrics(displaymetrics);
        setMeasuredDimension(displaymetrics.widthPixels, displaymetrics.heightPixels);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        int k;
        int i1;
        int j1;
        int k1;
        k1 = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        j1 = android.view.View.MeasureSpec.getMode(j);
        i1 = android.view.View.MeasureSpec.getSize(j);
        break MISSING_BLOCK_LABEL_121;
_L4:
        if (zzsF.widthPixels <= i && zzsF.heightPixels <= j)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        float f = zzAa.getResources().getDisplayMetrics().density;
        zzhx.zzac((new StringBuilder("Not enough space to show ad. Needs ")).append((int)((float)zzsF.widthPixels / f)).append("x").append((int)((float)zzsF.heightPixels / f)).append(" dp, but only has ").append((int)((float)k / f)).append("x").append((int)((float)i1 / f)).append(" dp.").toString());
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
        setMeasuredDimension(zzsF.widthPixels, zzsF.heightPixels);
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
            zzhx.zzb("Could not pause webview.", exception);
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
            zzhx.zzb("Could not resume webview.", exception);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (zzwg != null)
        {
            zzwg.zza(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public void setContext(Context context)
    {
        zzAa.setBaseContext(context);
    }

    public void setRequestedOrientation(int i)
    {
        synchronized (zznh)
        {
            zzAh = i;
            if (zzAb != null)
            {
                zzAb.setRequestedOrientation(zzAh);
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
            zzhx.zzb("Could not stop loading webview.", exception);
        }
    }

    public void zzA(boolean flag)
    {
        synchronized (zznh)
        {
            zzAe = flag;
            zzeW();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzB(boolean flag)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzAb == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        zzAb.zza(zzvy.zzba(), flag);
_L2:
        return;
        zzAc = flag;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(Context context, zzba zzba1)
    {
        synchronized (zznh)
        {
            zzeU();
            setContext(context);
            zzAb = null;
            zzsF = zzba1;
            zzAe = false;
            zzAc = false;
            zzAh = -1;
            zzab.zzaO().zzb(this);
            loadUrl("about:blank");
            zzvy.reset();
            setOnTouchListener(null);
            setOnClickListener(null);
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(zzba zzba1)
    {
        synchronized (zznh)
        {
            zzsF = zzba1;
            requestLayout();
        }
        return;
        zzba1;
        obj;
        JVM INSTR monitorexit ;
        throw zzba1;
    }

    public void zza(zzel zzel1)
    {
        synchronized (zznh)
        {
            zzAb = zzel1;
        }
        return;
        zzel1;
        obj;
        JVM INSTR monitorexit ;
        throw zzel1;
    }

    protected void zza(String s, ValueCallback valuecallback)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed()) goto _L2; else goto _L1
_L1:
        evaluateJavascript(s, valuecallback);
_L4:
        return;
_L2:
        zzhx.zzac("The webview is destroyed. Ignoring action.");
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

    public zzba zzad()
    {
        zzba zzba1;
        synchronized (zznh)
        {
            zzba1 = zzsF;
        }
        return zzba1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzad(String s)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s);
_L2:
        return;
        zzhx.zzac("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void zzae(String s)
    {
        if (zzme.zzkj())
        {
            if (zzek() == null)
            {
                zzeT();
            }
            if (zzek().booleanValue())
            {
                zza(s, ((ValueCallback) (null)));
                return;
            } else
            {
                zzad((new StringBuilder("javascript:")).append(s).toString());
                return;
            }
        } else
        {
            zzad((new StringBuilder("javascript:")).append(s).toString());
            return;
        }
    }

    void zzb(Boolean boolean1)
    {
        zzyV = boolean1;
        zzab.zzaP().zzb(boolean1);
    }

    public void zzb(String s, String s1)
    {
        zzae((new StringBuilder()).append(s).append("(").append(s1).append(");").toString());
    }

    public void zzb(String s, Map map)
    {
        try
        {
            map = zzab.zzaM().zzw(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzhx.zzac("Could not convert parameters to JSON.");
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
        zzhx.zzab((new StringBuilder("Dispatching AFMA event: ")).append(((StringBuilder) (obj)).toString()).toString());
        zzae(((StringBuilder) (obj)).toString());
    }

    public void zzdh()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", zznl.zzzH);
        zzb("onshow", hashmap);
    }

    public Activity zzeD()
    {
        return zzAa.zzeD();
    }

    public Context zzeE()
    {
        return zzAa.zzeE();
    }

    public zzel zzeF()
    {
        zzel zzel1;
        synchronized (zznh)
        {
            zzel1 = zzAb;
        }
        return zzel1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzid zzeG()
    {
        return zzvy;
    }

    public boolean zzeH()
    {
        return zzAc;
    }

    public zzk zzeI()
    {
        return zzwg;
    }

    public zzhy zzeJ()
    {
        return zznl;
    }

    public boolean zzeK()
    {
        boolean flag;
        synchronized (zznh)
        {
            flag = zzAe;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzeL()
    {
        synchronized (zznh)
        {
            zzeV();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzeS()
    {
        if (zzeG().zzba())
        {
            DisplayMetrics displaymetrics = zzab.zzaM().zza(zznu);
            int k = zzbe.zzbD().zzb(displaymetrics, displaymetrics.widthPixels);
            int l = zzbe.zzbD().zzb(displaymetrics, displaymetrics.heightPixels);
            Activity activity = zzeD();
            int i;
            int j;
            if (activity == null || activity.getWindow() == null)
            {
                j = l;
                i = k;
            } else
            {
                int ai[] = zzab.zzaM().zzg(activity);
                i = zzbe.zzbD().zzb(displaymetrics, ai[0]);
                j = zzbe.zzbD().zzb(displaymetrics, ai[1]);
            }
            if (zztI != k || zztJ != l || zztL != i || zztM != j)
            {
                boolean flag;
                if (zztI != k || zztJ != l)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zztI = k;
                zztJ = l;
                zztL = i;
                zztM = j;
                (new zzeg(this)).zza(k, l, i, j, displaymetrics.density, zznu.getDefaultDisplay().getRotation());
                return flag;
            }
        }
        return false;
    }

    void zzeV()
    {
        Activity activity = zzeD();
        if (!zzAg && activity != null && zzAi)
        {
            zzab.zzaM().zza(activity, this);
            zzAg = true;
        }
    }

    Boolean zzek()
    {
        Boolean boolean1;
        synchronized (zznh)
        {
            boolean1 = zzyV;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzp(int i)
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("closetype", String.valueOf(i));
        hashmap.put("version", zznl.zzzH);
        zzb("onhide", hashmap);
    }
}
