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
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzad, zzba, zzhe, zzdf, 
//            zzia, zzhx, zzah, zzag, 
//            zzab, zzlv, zzhp, zzho, 
//            zzac, zzcv, zzhy, zzic

public class zzaf
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private boolean zzmJ;
    private boolean zznA;
    private boolean zznB;
    private BroadcastReceiver zznC;
    private final HashSet zznD = new HashSet();
    private final zzcv zznE = new zzcv() {

        final zzaf zznI;

        public void zza(zzic zzic1, Map map)
        {
            if (!zznI.zza(map))
            {
                return;
            } else
            {
                zznI.zza(zzic1.getWebView(), map);
                return;
            }
        }

            
            {
                zznI = zzaf.this;
                super();
            }
    };
    private final zzcv zznF = new zzcv() {

        final zzaf zznI;

        public void zza(zzic zzic, Map map)
        {
            if (!zznI.zza(map))
            {
                return;
            } else
            {
                zzhx.zzY((new StringBuilder("Received request to untrack: ")).append(zzaf.zzb(zznI).zzaZ()).toString());
                zznI.destroy();
                return;
            }
        }

            
            {
                zznI = zzaf.this;
                super();
            }
    };
    private final zzcv zznG = new zzcv() {

        final zzaf zznI;

        public void zza(zzic zzic, Map map)
        {
            while (!zznI.zza(map) || !map.containsKey("isVisible")) 
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
            zznI.zzg(Boolean.valueOf(flag).booleanValue());
        }

            
            {
                zznI = zzaf.this;
                super();
            }
    };
    private final Object zznh = new Object();
    private final Context zznk;
    private final WeakReference zznn;
    private WeakReference zzno;
    private final WeakReference zznp;
    private final zzad zznq;
    private final zzdf zznr;
    private final zzia zzns;
    private boolean zznt;
    private final WindowManager zznu;
    private final PowerManager zznv;
    private final KeyguardManager zznw;
    private zzag zznx;
    private boolean zzny;
    private long zznz;

    public zzaf(zzba zzba1, zzhe zzhe1, zzhy zzhy, View view, zzdf zzdf1)
    {
        zzmJ = false;
        zzny = false;
        zznz = 0x8000000000000000L;
        zznr = zzdf1;
        zznn = new WeakReference(zzhe1);
        zznp = new WeakReference(view);
        zzno = new WeakReference(null);
        zznA = true;
        zznq = new zzad(UUID.randomUUID().toString(), zzhy, zzba1.zzpa, zzhe1.zzys, zzhe1.zzba());
        zzns = zznr.zzcJ();
        zznu = (WindowManager)view.getContext().getSystemService("window");
        zznv = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        zznw = (KeyguardManager)view.getContext().getSystemService("keyguard");
        zznk = view.getContext().getApplicationContext();
        try
        {
            zzba1 = zzd(view);
            zzns.zza(new zzia.zzd(zzba1) {

                final JSONObject zznH;
                final zzaf zznI;

                public void zza(Object obj)
                {
                    zzb((zzah)obj);
                }

                public void zzb(zzah zzah1)
                {
                    zznI.zza(zznH);
                }

            
            {
                zznI = zzaf.this;
                zznH = jsonobject;
                super();
            }
            }, new zzia.zza() {

                final zzaf zznI;

                public void run()
                {
                }

            
            {
                zznI = zzaf.this;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (zzba zzba1) { }
        // Misplaced declaration of an exception variable
        catch (zzba zzba1)
        {
            zzhx.zzb("Failure while processing active view data.", zzba1);
        }
        zzns.zza(new zzia.zzd() {

            final zzaf zznI;

            public void zza(Object obj)
            {
                zzb((zzah)obj);
            }

            public void zzb(zzah zzah1)
            {
                zzaf.zzb(zznI, true);
                zznI.zza(zzah1);
                zznI.zzbb();
                zznI.zzh(false);
            }

            
            {
                zznI = zzaf.this;
                super();
            }
        }, new zzia.zza() {

            final zzaf zznI;

            public void run()
            {
                zznI.destroy();
            }

            
            {
                zznI = zzaf.this;
                super();
            }
        });
        zzhx.zzY((new StringBuilder("Tracking ad unit: ")).append(zznq.zzaZ()).toString());
    }

    static zzad zzb(zzaf zzaf1)
    {
        return zzaf1.zznq;
    }

    static boolean zzb(zzaf zzaf1, boolean flag)
    {
        zzaf1.zznt = flag;
        return flag;
    }

    protected void destroy()
    {
        synchronized (zznh)
        {
            zzbh();
            zzbc();
            zznA = false;
            zzbe();
            zznr.zzb(zzns);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
        synchronized (zznh)
        {
            zzmJ = true;
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
        synchronized (zznh)
        {
            zzmJ = false;
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
        synchronized (zznh)
        {
            zzny = true;
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

    public void zza(zzac zzac1)
    {
        zznD.add(zzac1);
    }

    public void zza(zzag zzag1)
    {
        synchronized (zznh)
        {
            zznx = zzag1;
        }
        return;
        zzag1;
        obj;
        JVM INSTR monitorexit ;
        throw zzag1;
    }

    protected void zza(zzah zzah1)
    {
        zzah1.zza("/updateActiveView", zznE);
        zzah1.zza("/untrackActiveViewUnit", zznF);
        zzah1.zza("/visibilityChanged", zznG);
    }

    protected void zza(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonarray.put(jsonobject);
            jsonobject1.put("units", jsonarray);
            zzns.zza(new zzia.zzd(jsonobject1) {

                final zzaf zznI;
                final JSONObject zznJ;

                public void zza(Object obj)
                {
                    zzb((zzah)obj);
                }

                public void zzb(zzah zzah1)
                {
                    zzah1.zza("AFMA_updateActiveView", zznJ);
                }

            
            {
                zznI = zzaf.this;
                zznJ = jsonobject;
                super();
            }
            }, new zzia.zza() {

                final zzaf zznI;

                public void run()
                {
                }

            
            {
                zznI = zzaf.this;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            zzhx.zzb("Skipping active view message.", jsonobject);
        }
    }

    protected boolean zza(Map map)
    {
        if (map == null)
        {
            return false;
        }
        map = (String)map.get("hashCode");
        return !TextUtils.isEmpty(map) && map.equals(zznq.zzaZ());
    }

    protected void zzbb()
    {
label0:
        {
            synchronized (zznh)
            {
                if (zznC == null)
                {
                    break label0;
                }
            }
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        zznC = new BroadcastReceiver() {

            final zzaf zznI;

            public void onReceive(Context context, Intent intent)
            {
                zznI.zzh(false);
            }

            
            {
                zznI = zzaf.this;
                super();
            }
        };
        zznk.registerReceiver(zznC, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzbc()
    {
        synchronized (zznh)
        {
            if (zznC != null)
            {
                zznk.unregisterReceiver(zznC);
                zznC = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbd()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (!zznA) goto _L2; else goto _L1
_L1:
        zznB = true;
        zza(zzbj());
_L3:
        zzhx.zzY((new StringBuilder("Untracking ad unit: ")).append(zznq.zzaZ()).toString());
_L2:
        return;
        Object obj1;
        obj1;
        zzhx.zzb("JSON failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        zzhx.zzb("Failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
    }

    protected void zzbe()
    {
        if (zznx != null)
        {
            zznx.zza(this);
        }
    }

    public boolean zzbf()
    {
        boolean flag;
        synchronized (zznh)
        {
            flag = zznA;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzbg()
    {
        Object obj = (View)zznp.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)zzno.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                zzno = new WeakReference(obj);
                ((ViewTreeObserver) (obj)).addOnScrollChangedListener(this);
                ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(this);
                return;
            }
        }
    }

    protected void zzbh()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)zzno.get();
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

    protected JSONObject zzbi()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", zznq.zzaX()).put("activeViewJSON", zznq.zzaY()).put("timestamp", zzab.zzaQ().elapsedRealtime()).put("adFormat", zznq.zzaW()).put("hashCode", zznq.zzaZ()).put("isMraid", zznq.zzba());
        return jsonobject;
    }

    protected JSONObject zzbj()
    {
        JSONObject jsonobject = zzbi();
        jsonobject.put("doneReasonCode", "u");
        return jsonobject;
    }

    protected JSONObject zzd(View view)
    {
        boolean flag = zzab.zzaO().zzi(view);
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
            zzhx.zzb("Failure getting view location.", exception);
        }
        displaymetrics = view.getContext().getResources().getDisplayMetrics();
        rect = new Rect();
        rect.left = ai1[0];
        rect.top = ai1[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        rect1 = new Rect();
        rect1.right = zznu.getDefaultDisplay().getWidth();
        rect1.bottom = zznu.getDefaultDisplay().getHeight();
        rect2 = new Rect();
        flag1 = view.getGlobalVisibleRect(rect2, null);
        rect3 = new Rect();
        flag2 = view.getLocalVisibleRect(rect3);
        rect4 = new Rect();
        view.getHitRect(rect4);
        jsonobject = zzbi();
        jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isStopped", zzny).put("isPaused", zzmJ).put("isAttachedToWindow", flag).put("viewBox", (new JSONObject()).put("top", zza(rect1.top, displaymetrics)).put("bottom", zza(rect1.bottom, displaymetrics)).put("left", zza(rect1.left, displaymetrics)).put("right", zza(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", zza(rect.top, displaymetrics)).put("bottom", zza(rect.bottom, displaymetrics)).put("left", zza(rect.left, displaymetrics)).put("right", zza(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", zza(rect2.top, displaymetrics)).put("bottom", zza(rect2.bottom, displaymetrics)).put("left", zza(rect2.left, displaymetrics)).put("right", zza(rect2.right, displaymetrics))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", (new JSONObject()).put("top", zza(rect3.top, displaymetrics)).put("bottom", zza(rect3.bottom, displaymetrics)).put("left", zza(rect3.left, displaymetrics)).put("right", zza(rect3.right, displaymetrics))).put("localVisibleBoxVisible", flag2).put("hitBox", (new JSONObject()).put("top", zza(rect4.top, displaymetrics)).put("bottom", zza(rect4.bottom, displaymetrics)).put("left", zza(rect4.left, displaymetrics)).put("right", zza(rect4.right, displaymetrics))).put("screenDensity", displaymetrics.density).put("isVisible", zze(view));
        return jsonobject;
    }

    protected boolean zze(View view)
    {
        return view.getVisibility() == 0 && view.isShown() && zznv.isScreenOn() && (!zznw.inKeyguardRestrictedInputMode() || zzab.zzaM().zzes());
    }

    protected void zzg(boolean flag)
    {
        for (Iterator iterator = zznD.iterator(); iterator.hasNext(); ((zzac)iterator.next()).zza(this, flag)) { }
    }

    protected void zzh(boolean flag)
    {
label0:
        {
            synchronized (zznh)
            {
                if (zznt && zznA)
                {
                    break label0;
                }
            }
            return;
        }
        long l = zzab.zzaQ().elapsedRealtime();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (zznz + 200L <= l)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzhe zzhe1;
        View view;
        zznz = l;
        zzhe1 = (zzhe)zznn.get();
        view = (View)zznp.get();
        Object obj1;
        boolean flag1;
        if (view != null && zzhe1 != null)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        zzbd();
        obj;
        JVM INSTR monitorexit ;
        return;
        zza(zzd(view));
_L1:
        zzbg();
        zzbe();
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        zzhx.zza("Active view update failed.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        zzhx.zza("Active view update failed.", ((Throwable) (obj1)));
          goto _L1
    }
}
