// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhq, zzax, zzha, zzdt, 
//            zzbe, zzba, zzlb, zzhm, 
//            zzhl, zzaw, zzdg, zzid

public class zzaz
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private boolean zzpj;
    private final WeakReference zzqA;
    private final zzax zzqB;
    private final zzdt zzqC;
    private final zzdt.zzd zzqD;
    private boolean zzqE;
    private final WindowManager zzqF;
    private final PowerManager zzqG;
    private final KeyguardManager zzqH;
    private zzba zzqI;
    private boolean zzqJ;
    private boolean zzqK;
    private boolean zzqL;
    private boolean zzqM;
    private BroadcastReceiver zzqN;
    private final HashSet zzqO = new HashSet();
    private final zzdg zzqP = new zzdg() {

        final zzaz zzqT;

        public void zza(zzid zzid1, Map map)
        {
            if (!zzqT.zzb(map))
            {
                return;
            } else
            {
                zzqT.zza(zzid1.getWebView(), map);
                return;
            }
        }

            
            {
                zzqT = zzaz.this;
                super();
            }
    };
    private final zzdg zzqQ = new zzdg() {

        final zzaz zzqT;

        public void zza(zzid zzid, Map map)
        {
            if (!zzqT.zzb(map))
            {
                return;
            } else
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("Received request to untrack: ").append(com.google.android.gms.internal.zzaz.zzb(zzqT).zzbT()).toString());
                zzqT.destroy();
                return;
            }
        }

            
            {
                zzqT = zzaz.this;
                super();
            }
    };
    private final zzdg zzqR = new zzdg() {

        final zzaz zzqT;

        public void zza(zzid zzid, Map map)
        {
            while (!zzqT.zzb(map) || !map.containsKey("isVisible")) 
            {
                return;
            }
            boolean flag;
            if ("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible")))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzqT.zzg(Boolean.valueOf(flag).booleanValue());
        }

            
            {
                zzqT = zzaz.this;
                super();
            }
    };
    private zzhq zzqm;
    private final Object zzqt = new Object();
    private final Context zzqw;
    private final WeakReference zzqy;
    private WeakReference zzqz;

    public zzaz(AdSizeParcel adsizeparcel, zzha zzha1, VersionInfoParcel versioninfoparcel, View view, zzdt zzdt1)
    {
        zzpj = false;
        zzqK = false;
        zzqC = zzdt1;
        zzqy = new WeakReference(zzha1);
        zzqA = new WeakReference(view);
        zzqz = new WeakReference(null);
        zzqL = true;
        zzqm = new zzhq(200L);
        zzqB = new zzax(UUID.randomUUID().toString(), versioninfoparcel, adsizeparcel.zzsm, zzha1.zzFl, zzha1.zzbU());
        zzqD = zzqC.zzdU();
        zzqF = (WindowManager)view.getContext().getSystemService("window");
        zzqG = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        zzqH = (KeyguardManager)view.getContext().getSystemService("keyguard");
        zzqw = view.getContext().getApplicationContext();
        try
        {
            adsizeparcel = zzd(view);
            zzqD.zza(new zzhx.zzc(adsizeparcel) {

                final JSONObject zzqS;
                final zzaz zzqT;

                public void zzb(zzbe zzbe1)
                {
                    zzqT.zza(zzqS);
                }

                public void zzc(Object obj)
                {
                    zzb((zzbe)obj);
                }

            
            {
                zzqT = zzaz.this;
                zzqS = jsonobject;
                super();
            }
            }, new zzhx.zza() {

                final zzaz zzqT;

                public void run()
                {
                }

            
            {
                zzqT = zzaz.this;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Failure while processing active view data.", adsizeparcel);
        }
        zzqD.zza(new zzhx.zzc() {

            final zzaz zzqT;

            public void zzb(zzbe zzbe1)
            {
                com.google.android.gms.internal.zzaz.zzb(zzqT, true);
                zzqT.zza(zzbe1);
                zzqT.zzbV();
                zzqT.zzh(false);
            }

            public void zzc(Object obj)
            {
                zzb((zzbe)obj);
            }

            
            {
                zzqT = zzaz.this;
                super();
            }
        }, new zzhx.zza() {

            final zzaz zzqT;

            public void run()
            {
                zzqT.destroy();
            }

            
            {
                zzqT = zzaz.this;
                super();
            }
        });
        com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("Tracking ad unit: ").append(zzqB.zzbT()).toString());
    }

    static zzax zzb(zzaz zzaz1)
    {
        return zzaz1.zzqB;
    }

    static boolean zzb(zzaz zzaz1, boolean flag)
    {
        zzaz1.zzqE = flag;
        return flag;
    }

    protected void destroy()
    {
        synchronized (zzqt)
        {
            zzcb();
            zzbW();
            zzqL = false;
            zzbY();
            zzqD.release();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean isScreenOn()
    {
        return zzqG.isScreenOn();
    }

    public void onGlobalLayout()
    {
        zzh(false);
    }

    public void onScrollChanged()
    {
        zzh(true);
    }

    public void pause()
    {
        synchronized (zzqt)
        {
            zzpj = true;
            zzh(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resume()
    {
        synchronized (zzqt)
        {
            zzpj = false;
            zzh(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        synchronized (zzqt)
        {
            zzqK = true;
            zzh(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int zza(int i, DisplayMetrics displaymetrics)
    {
        float f = displaymetrics.density;
        return (int)((float)i / f);
    }

    protected void zza(View view, Map map)
    {
        zzh(false);
    }

    public void zza(zzaw zzaw1)
    {
        zzqO.add(zzaw1);
    }

    public void zza(zzba zzba1)
    {
        synchronized (zzqt)
        {
            zzqI = zzba1;
        }
        return;
        zzba1;
        obj;
        JVM INSTR monitorexit ;
        throw zzba1;
    }

    protected void zza(zzbe zzbe1)
    {
        zzbe1.zza("/updateActiveView", zzqP);
        zzbe1.zza("/untrackActiveViewUnit", zzqQ);
        zzbe1.zza("/visibilityChanged", zzqR);
    }

    protected void zza(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonarray.put(jsonobject);
            jsonobject1.put("units", jsonarray);
            zzqD.zza(new zzhx.zzc(jsonobject1) {

                final zzaz zzqT;
                final JSONObject zzqU;

                public void zzb(zzbe zzbe1)
                {
                    zzbe1.zza("AFMA_updateActiveView", zzqU);
                }

                public void zzc(Object obj)
                {
                    zzb((zzbe)obj);
                }

            
            {
                zzqT = zzaz.this;
                zzqU = jsonobject;
                super();
            }
            }, new zzhx.zzb());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Skipping active view message.", jsonobject);
        }
    }

    protected boolean zzb(Map map)
    {
        if (map == null)
        {
            return false;
        }
        map = (String)map.get("hashCode");
        boolean flag;
        if (!TextUtils.isEmpty(map) && map.equals(zzqB.zzbT()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    protected void zzbV()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzqN == null)
                {
                    break label0;
                }
            }
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        zzqN = new BroadcastReceiver() {

            final zzaz zzqT;

            public void onReceive(Context context, Intent intent)
            {
                zzqT.zzh(false);
            }

            
            {
                zzqT = zzaz.this;
                super();
            }
        };
        zzqw.registerReceiver(zzqN, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzbW()
    {
        synchronized (zzqt)
        {
            if (zzqN != null)
            {
                zzqw.unregisterReceiver(zzqN);
                zzqN = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbX()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (!zzqL) goto _L2; else goto _L1
_L1:
        zzqM = true;
        zza(zzcd());
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("Untracking ad unit: ").append(zzqB.zzbT()).toString());
_L2:
        return;
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzb("JSON failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzb("Failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
    }

    protected void zzbY()
    {
        if (zzqI != null)
        {
            zzqI.zza(this);
        }
    }

    public boolean zzbZ()
    {
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzqL;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzca()
    {
        Object obj = (View)zzqA.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)zzqz.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                zzcb();
                if (!zzqJ || viewtreeobserver != null && viewtreeobserver.isAlive())
                {
                    zzqJ = true;
                    ((ViewTreeObserver) (obj)).addOnScrollChangedListener(this);
                    ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(this);
                }
                zzqz = new WeakReference(obj);
                return;
            }
        }
    }

    protected void zzcb()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)zzqz.get();
        if (viewtreeobserver == null || !viewtreeobserver.isAlive())
        {
            return;
        } else
        {
            viewtreeobserver.removeOnScrollChangedListener(this);
            viewtreeobserver.removeGlobalOnLayoutListener(this);
            return;
        }
    }

    protected JSONObject zzcc()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", zzqB.zzbR()).put("activeViewJSON", zzqB.zzbS()).put("timestamp", zzo.zzbz().elapsedRealtime()).put("adFormat", zzqB.zzbQ()).put("hashCode", zzqB.zzbT()).put("isMraid", zzqB.zzbU());
        return jsonobject;
    }

    protected JSONObject zzcd()
        throws JSONException
    {
        JSONObject jsonobject = zzcc();
        jsonobject.put("doneReasonCode", "u");
        return jsonobject;
    }

    protected JSONObject zzd(View view)
        throws JSONException
    {
        boolean flag = zzo.zzbx().zzk(view);
        int ai1[] = new int[2];
        int ai[] = new int[2];
        DisplayMetrics displaymetrics;
        Rect rect;
        Rect rect1;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        JSONObject jsonobject;
        boolean flag1;
        boolean flag2;
        try
        {
            view.getLocationOnScreen(ai1);
            view.getLocationInWindow(ai);
        }
        catch (Exception exception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Failure getting view location.", exception);
        }
        displaymetrics = view.getContext().getResources().getDisplayMetrics();
        rect = new Rect();
        rect.left = ai1[0];
        rect.top = ai1[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        rect1 = new Rect();
        rect1.right = zzqF.getDefaultDisplay().getWidth();
        rect1.bottom = zzqF.getDefaultDisplay().getHeight();
        rect2 = new Rect();
        flag1 = view.getGlobalVisibleRect(rect2, null);
        rect3 = new Rect();
        flag2 = view.getLocalVisibleRect(rect3);
        rect4 = new Rect();
        view.getHitRect(rect4);
        jsonobject = zzcc();
        jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isStopped", zzqK).put("isPaused", zzpj).put("isAttachedToWindow", flag).put("viewBox", (new JSONObject()).put("top", zza(rect1.top, displaymetrics)).put("bottom", zza(rect1.bottom, displaymetrics)).put("left", zza(rect1.left, displaymetrics)).put("right", zza(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", zza(rect.top, displaymetrics)).put("bottom", zza(rect.bottom, displaymetrics)).put("left", zza(rect.left, displaymetrics)).put("right", zza(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", zza(rect2.top, displaymetrics)).put("bottom", zza(rect2.bottom, displaymetrics)).put("left", zza(rect2.left, displaymetrics)).put("right", zza(rect2.right, displaymetrics))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", (new JSONObject()).put("top", zza(rect3.top, displaymetrics)).put("bottom", zza(rect3.bottom, displaymetrics)).put("left", zza(rect3.left, displaymetrics)).put("right", zza(rect3.right, displaymetrics))).put("localVisibleBoxVisible", flag2).put("hitBox", (new JSONObject()).put("top", zza(rect4.top, displaymetrics)).put("bottom", zza(rect4.bottom, displaymetrics)).put("left", zza(rect4.left, displaymetrics)).put("right", zza(rect4.right, displaymetrics))).put("screenDensity", displaymetrics.density).put("isVisible", zze(view));
        return jsonobject;
    }

    protected boolean zze(View view)
    {
        return view.getVisibility() == 0 && view.isShown() && isScreenOn() && (!zzqH.inKeyguardRestrictedInputMode() || zzo.zzbv().zzgl());
    }

    protected void zzg(boolean flag)
    {
        for (Iterator iterator = zzqO.iterator(); iterator.hasNext(); ((zzaw)iterator.next()).zza(this, flag)) { }
    }

    protected void zzh(boolean flag)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzqE && zzqL)
                {
                    break label0;
                }
            }
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (zzqm.tryAcquire())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        zzha zzha1;
        View view;
        zzha1 = (zzha)zzqy.get();
        view = (View)zzqA.get();
        Object obj;
        boolean flag1;
        if (view != null && zzha1 != null)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        zzbX();
        obj1;
        JVM INSTR monitorexit ;
        return;
        zza(zzd(view));
_L2:
        zzca();
        zzbY();
        obj1;
        JVM INSTR monitorexit ;
        return;
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zza("Active view update failed.", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
          goto _L3
        obj;
          goto _L3
    }
}
