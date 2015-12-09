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
import com.google.android.gms.ads.internal.zzh;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzfq, zzu, zzfa, zzcf, 
//            zzfx, zzy, zzx, zzht, 
//            zzfm, zzfl, zzt, zzbs, 
//            zzgd

public class zzw
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private boolean zznE;
    private zzfq zznk;
    private final HashSet zzoA = new HashSet();
    private final zzbs zzoB = new zzbs() {

        final zzw a;

        public void zza(zzgd zzgd1, Map map)
        {
            if (!a.zza(map))
            {
                return;
            } else
            {
                a.zza(zzgd1.getWebView(), map);
                return;
            }
        }

            
            {
                a = zzw.this;
                super();
            }
    };
    private final zzbs zzoC = new zzbs() {

        final zzw a;

        public void zza(zzgd zzgd, Map map)
        {
            if (!a.zza(map))
            {
                return;
            } else
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Received request to untrack: ").append(com.google.android.gms.internal.zzw.zzb(a).zzbf()).toString());
                a.destroy();
                return;
            }
        }

            
            {
                a = zzw.this;
                super();
            }
    };
    private final zzbs zzoD = new zzbs() {

        final zzw a;

        public void zza(zzgd zzgd, Map map)
        {
            while (!a.zza(map) || !map.containsKey("isVisible")) 
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
            a.zzh(Boolean.valueOf(flag).booleanValue());
        }

            
            {
                a = zzw.this;
                super();
            }
    };
    private final Object zzoe = new Object();
    private final Context zzoh;
    private final WeakReference zzok;
    private WeakReference zzol;
    private final WeakReference zzom;
    private final zzu zzon;
    private final zzcf zzoo;
    private final zzfx zzop;
    private boolean zzoq;
    private final WindowManager zzor;
    private final PowerManager zzos;
    private final KeyguardManager zzot;
    private zzx zzou;
    private boolean zzov;
    private boolean zzow;
    private boolean zzox;
    private boolean zzoy;
    private BroadcastReceiver zzoz;

    public zzw(AdSizeParcel adsizeparcel, zzfa zzfa1, VersionInfoParcel versioninfoparcel, View view, zzcf zzcf1)
    {
        zznE = false;
        zzow = false;
        zzoo = zzcf1;
        zzok = new WeakReference(zzfa1);
        zzom = new WeakReference(view);
        zzol = new WeakReference(null);
        zzox = true;
        zznk = new zzfq(200L);
        zzon = new zzu(UUID.randomUUID().toString(), versioninfoparcel, adsizeparcel.zzpX, zzfa1.zzBs, zzfa1.zzbg());
        zzop = zzoo.zzda();
        zzor = (WindowManager)view.getContext().getSystemService("window");
        zzos = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        zzot = (KeyguardManager)view.getContext().getSystemService("keyguard");
        zzoh = view.getContext().getApplicationContext();
        try
        {
            adsizeparcel = zzd(view);
            zzop.zza(new zzfx.zzd(adsizeparcel) {

                final JSONObject a;
                final zzw b;

                public void a(zzy zzy1)
                {
                    b.zza(a);
                }

                public void zza(Object obj)
                {
                    a((zzy)obj);
                }

            
            {
                b = zzw.this;
                a = jsonobject;
                super();
            }
            }, new zzfx.zza() {

                final zzw a;

                public void run()
                {
                }

            
            {
                a = zzw.this;
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
        zzop.zza(new zzfx.zzd() {

            final zzw a;

            public void a(zzy zzy1)
            {
                com.google.android.gms.internal.zzw.zzb(a, true);
                a.zza(zzy1);
                a.zzbh();
                a.zzi(false);
            }

            public void zza(Object obj)
            {
                a((zzy)obj);
            }

            
            {
                a = zzw.this;
                super();
            }
        }, new zzfx.zza() {

            final zzw a;

            public void run()
            {
                a.destroy();
            }

            
            {
                a = zzw.this;
                super();
            }
        });
        com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Tracking ad unit: ").append(zzon.zzbf()).toString());
    }

    static zzu zzb(zzw zzw1)
    {
        return zzw1.zzon;
    }

    static boolean zzb(zzw zzw1, boolean flag)
    {
        zzw1.zzoq = flag;
        return flag;
    }

    protected void destroy()
    {
        synchronized (zzoe)
        {
            zzbn();
            zzbi();
            zzox = false;
            zzbk();
            zzop.zza(new zzfx.zzd() {

                final zzw a;

                public void a(zzy zzy1)
                {
                    a.zzb(zzy1);
                }

                public void zza(Object obj1)
                {
                    a((zzy)obj1);
                }

            
            {
                a = zzw.this;
                super();
            }
            }, new zzfx.zzb());
            zzoo.zzb(zzop);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean isScreenOn()
    {
        return zzos.isScreenOn();
    }

    public void onGlobalLayout()
    {
        zzi(false);
    }

    public void onScrollChanged()
    {
        zzi(true);
    }

    public void pause()
    {
        synchronized (zzoe)
        {
            zznE = true;
            zzi(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resume()
    {
        synchronized (zzoe)
        {
            zznE = false;
            zzi(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        synchronized (zzoe)
        {
            zzow = true;
            zzi(false);
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
        zzi(false);
    }

    public void zza(zzt zzt1)
    {
        zzoA.add(zzt1);
    }

    public void zza(zzx zzx1)
    {
        synchronized (zzoe)
        {
            zzou = zzx1;
        }
        return;
        zzx1;
        obj;
        JVM INSTR monitorexit ;
        throw zzx1;
    }

    protected void zza(zzy zzy1)
    {
        zzy1.zza("/updateActiveView", zzoB);
        zzy1.zza("/untrackActiveViewUnit", zzoC);
        zzy1.zza("/visibilityChanged", zzoD);
    }

    protected void zza(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonarray.put(jsonobject);
            jsonobject1.put("units", jsonarray);
            zzop.zza(new zzfx.zzd(jsonobject1) {

                final JSONObject a;
                final zzw b;

                public void a(zzy zzy1)
                {
                    zzy1.zza("AFMA_updateActiveView", a);
                }

                public void zza(Object obj)
                {
                    a((zzy)obj);
                }

            
            {
                b = zzw.this;
                a = jsonobject;
                super();
            }
            }, new zzfx.zza() {

                final zzw a;

                public void run()
                {
                }

            
            {
                a = zzw.this;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Skipping active view message.", jsonobject);
        }
    }

    protected boolean zza(Map map)
    {
        if (map == null)
        {
            return false;
        }
        map = (String)map.get("hashCode");
        boolean flag;
        if (!TextUtils.isEmpty(map) && map.equals(zzon.zzbf()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    protected void zzb(zzy zzy1)
    {
        zzy1.zzb("/visibilityChanged", zzoD);
        zzy1.zzb("/untrackActiveViewUnit", zzoC);
        zzy1.zzb("/updateActiveView", zzoB);
    }

    protected void zzbh()
    {
label0:
        {
            synchronized (zzoe)
            {
                if (zzoz == null)
                {
                    break label0;
                }
            }
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        zzoz = new BroadcastReceiver() {

            final zzw a;

            public void onReceive(Context context, Intent intent)
            {
                a.zzi(false);
            }

            
            {
                a = zzw.this;
                super();
            }
        };
        zzoh.registerReceiver(zzoz, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzbi()
    {
        synchronized (zzoe)
        {
            if (zzoz != null)
            {
                zzoh.unregisterReceiver(zzoz);
                zzoz = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbj()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (!zzox) goto _L2; else goto _L1
_L1:
        zzoy = true;
        zza(zzbp());
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Untracking ad unit: ").append(zzon.zzbf()).toString());
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

    protected void zzbk()
    {
        if (zzou != null)
        {
            zzou.zza(this);
        }
    }

    public boolean zzbl()
    {
        boolean flag;
        synchronized (zzoe)
        {
            flag = zzox;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzbm()
    {
        Object obj = (View)zzom.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)zzol.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                zzbn();
                if (!zzov || viewtreeobserver != null && viewtreeobserver.isAlive())
                {
                    zzov = true;
                    ((ViewTreeObserver) (obj)).addOnScrollChangedListener(this);
                    ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(this);
                }
                zzol = new WeakReference(obj);
                return;
            }
        }
    }

    protected void zzbn()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)zzol.get();
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

    protected JSONObject zzbo()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", zzon.zzbd()).put("activeViewJSON", zzon.zzbe()).put("timestamp", com.google.android.gms.ads.internal.zzh.zzaU().elapsedRealtime()).put("adFormat", zzon.zzbc()).put("hashCode", zzon.zzbf()).put("isMraid", zzon.zzbg());
        return jsonobject;
    }

    protected JSONObject zzbp()
        throws JSONException
    {
        JSONObject jsonobject = zzbo();
        jsonobject.put("doneReasonCode", "u");
        return jsonobject;
    }

    protected JSONObject zzd(View view)
        throws JSONException
    {
        boolean flag = com.google.android.gms.ads.internal.zzh.zzaS().zzk(view);
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
        rect1.right = zzor.getDefaultDisplay().getWidth();
        rect1.bottom = zzor.getDefaultDisplay().getHeight();
        rect2 = new Rect();
        flag1 = view.getGlobalVisibleRect(rect2, null);
        rect3 = new Rect();
        flag2 = view.getLocalVisibleRect(rect3);
        rect4 = new Rect();
        view.getHitRect(rect4);
        jsonobject = zzbo();
        jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isStopped", zzow).put("isPaused", zznE).put("isAttachedToWindow", flag).put("viewBox", (new JSONObject()).put("top", zza(rect1.top, displaymetrics)).put("bottom", zza(rect1.bottom, displaymetrics)).put("left", zza(rect1.left, displaymetrics)).put("right", zza(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", zza(rect.top, displaymetrics)).put("bottom", zza(rect.bottom, displaymetrics)).put("left", zza(rect.left, displaymetrics)).put("right", zza(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", zza(rect2.top, displaymetrics)).put("bottom", zza(rect2.bottom, displaymetrics)).put("left", zza(rect2.left, displaymetrics)).put("right", zza(rect2.right, displaymetrics))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", (new JSONObject()).put("top", zza(rect3.top, displaymetrics)).put("bottom", zza(rect3.bottom, displaymetrics)).put("left", zza(rect3.left, displaymetrics)).put("right", zza(rect3.right, displaymetrics))).put("localVisibleBoxVisible", flag2).put("hitBox", (new JSONObject()).put("top", zza(rect4.top, displaymetrics)).put("bottom", zza(rect4.bottom, displaymetrics)).put("left", zza(rect4.left, displaymetrics)).put("right", zza(rect4.right, displaymetrics))).put("screenDensity", displaymetrics.density).put("isVisible", zze(view));
        return jsonobject;
    }

    protected boolean zze(View view)
    {
        return view.getVisibility() == 0 && view.isShown() && isScreenOn() && (!zzot.inKeyguardRestrictedInputMode() || com.google.android.gms.ads.internal.zzh.zzaQ().zzeZ());
    }

    protected void zzh(boolean flag)
    {
        for (Iterator iterator = zzoA.iterator(); iterator.hasNext(); ((zzt)iterator.next()).zza(this, flag)) { }
    }

    protected void zzi(boolean flag)
    {
label0:
        {
            synchronized (zzoe)
            {
                if (zzoq && zzox)
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
        if (zznk.tryAcquire())
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
        zzfa zzfa1;
        View view;
        zzfa1 = (zzfa)zzok.get();
        view = (View)zzom.get();
        Object obj;
        boolean flag1;
        if (view != null && zzfa1 != null)
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
        zzbj();
        obj1;
        JVM INSTR monitorexit ;
        return;
        zza(zzd(view));
_L2:
        zzbm();
        zzbk();
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
