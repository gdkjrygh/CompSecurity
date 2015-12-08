// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
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
import com.google.android.gms.ads.internal.zzp;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            az, ba, bb, rc, 
//            ar, pa, ha, au, 
//            av, ho, aw, ax, 
//            qd, qa, bf, wg, 
//            ay, bs, bc, rp, 
//            aq, fz

public final class at
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final Object a = new Object();
    private final WeakReference b;
    private WeakReference c;
    private final WeakReference d;
    private final ar e;
    private final Context f;
    private final ha g;
    private final ho h;
    private boolean i;
    private final WindowManager j;
    private final PowerManager k;
    private final KeyguardManager l;
    private bf m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private BroadcastReceiver s;
    private final HashSet t = new HashSet();
    private rc u;
    private final fz v = new az(this);
    private final fz w = new ba(this);
    private final fz x = new bb(this);

    public at(AdSizeParcel adsizeparcel, pa pa1, VersionInfoParcel versioninfoparcel, View view, ha ha1)
    {
        o = false;
        p = false;
        g = ha1;
        b = new WeakReference(pa1);
        d = new WeakReference(view);
        c = new WeakReference(null);
        q = true;
        u = new rc(200L);
        e = new ar(UUID.randomUUID().toString(), versioninfoparcel, adsizeparcel.zzte, pa1.j, pa1.a());
        h = g.b();
        j = (WindowManager)view.getContext().getSystemService("window");
        k = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        l = (KeyguardManager)view.getContext().getSystemService("keyguard");
        f = view.getContext().getApplicationContext();
        try
        {
            adsizeparcel = a(view);
            h.a(new au(this, adsizeparcel), new av(this));
        }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel)
        {
            zzb.zzb("Failure while processing active view data.", adsizeparcel);
        }
        h.a(new aw(this), new ax(this));
        zzb.zzaF((new StringBuilder("Tracking ad unit: ")).append(e.d()).toString());
    }

    private static int a(int i1, DisplayMetrics displaymetrics)
    {
        float f1 = displaymetrics.density;
        return (int)((float)i1 / f1);
    }

    private JSONObject a(View view)
    {
        boolean flag = zzp.zzbx().a(view);
        int ai1[] = new int[2];
        int ai[] = new int[2];
        Object obj;
        Rect rect;
        JSONObject jsonobject;
        Rect rect1;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        boolean flag1;
        boolean flag2;
        try
        {
            view.getLocationOnScreen(ai1);
            view.getLocationInWindow(ai);
        }
        catch (Exception exception)
        {
            zzb.zzb("Failure getting view location.", exception);
        }
        obj = view.getContext().getResources().getDisplayMetrics();
        rect = new Rect();
        rect.left = ai1[0];
        rect.top = ai1[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        rect1 = new Rect();
        rect1.right = j.getDefaultDisplay().getWidth();
        rect1.bottom = j.getDefaultDisplay().getHeight();
        rect2 = new Rect();
        flag1 = view.getGlobalVisibleRect(rect2, null);
        rect3 = new Rect();
        flag2 = view.getLocalVisibleRect(rect3);
        rect4 = new Rect();
        view.getHitRect(rect4);
        jsonobject = k();
        obj = jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isStopped", p).put("isPaused", o).put("isScreenOn", k.isScreenOn()).put("isAttachedToWindow", flag).put("viewBox", (new JSONObject()).put("top", a(rect1.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect1.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect1.left, ((DisplayMetrics) (obj)))).put("right", a(rect1.right, ((DisplayMetrics) (obj))))).put("adBox", (new JSONObject()).put("top", a(rect.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect.left, ((DisplayMetrics) (obj)))).put("right", a(rect.right, ((DisplayMetrics) (obj))))).put("globalVisibleBox", (new JSONObject()).put("top", a(rect2.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect2.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect2.left, ((DisplayMetrics) (obj)))).put("right", a(rect2.right, ((DisplayMetrics) (obj))))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", (new JSONObject()).put("top", a(rect3.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect3.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect3.left, ((DisplayMetrics) (obj)))).put("right", a(rect3.right, ((DisplayMetrics) (obj))))).put("localVisibleBoxVisible", flag2).put("hitBox", (new JSONObject()).put("top", a(rect4.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect4.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect4.left, ((DisplayMetrics) (obj)))).put("right", a(rect4.right, ((DisplayMetrics) (obj))))).put("screenDensity", ((DisplayMetrics) (obj)).density);
        if (view.getVisibility() == 0 && view.isShown() && k.isScreenOn() && (!l.inKeyguardRestrictedInputMode() || zzp.zzbv().a()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((JSONObject) (obj)).put("isVisible", flag);
        return jsonobject;
    }

    static boolean a(at at1)
    {
        at1.i = true;
        return true;
    }

    static ar b(at at1)
    {
        return at1.e;
    }

    private void i()
    {
        if (m != null)
        {
            m.a(this);
        }
    }

    private void j()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)c.get();
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

    private JSONObject k()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", e.b()).put("activeViewJSON", e.c()).put("timestamp", zzp.zzbz().b()).put("adFormat", e.a()).put("hashCode", e.d()).put("isMraid", e.e());
        return jsonobject;
    }

    protected final void a()
    {
label0:
        {
            synchronized (a)
            {
                if (s == null)
                {
                    break label0;
                }
            }
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        s = new ay(this);
        f.registerReceiver(s, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(aq aq1)
    {
        t.add(aq1);
    }

    public final void a(bf bf1)
    {
        synchronized (a)
        {
            m = bf1;
        }
        return;
        bf1;
        obj;
        JVM INSTR monitorexit ;
        throw bf1;
    }

    protected final void a(bs bs1)
    {
        bs1.a("/updateActiveView", v);
        bs1.a("/untrackActiveViewUnit", w);
        bs1.a("/visibilityChanged", x);
    }

    protected final void a(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonarray.put(jsonobject);
            jsonobject1.put("units", jsonarray);
            h.a(new bc(this, jsonobject1), new rp());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            zzb.zzb("Skipping active view message.", jsonobject);
        }
    }

    protected final void a(boolean flag)
    {
        for (Iterator iterator = t.iterator(); iterator.hasNext(); ((aq)iterator.next()).a(this, flag)) { }
    }

    protected final boolean a(Map map)
    {
        if (map == null)
        {
            return false;
        }
        map = (String)map.get("hashCode");
        return !TextUtils.isEmpty(map) && map.equals(e.d());
    }

    protected final void b()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        j();
        synchronized (a)
        {
            if (s != null)
            {
                f.unregisterReceiver(s);
                s = null;
            }
        }
        q = false;
        i();
        h.a();
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
    }

    protected final void b(boolean flag)
    {
label0:
        {
            synchronized (a)
            {
                if (i && q)
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
        if (u.a())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj2;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        Object obj3;
        obj = (pa)b.get();
        obj3 = (View)d.get();
        Object obj1;
        boolean flag1;
        if (obj3 != null && obj != null)
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
        c();
        obj2;
        JVM INSTR monitorexit ;
        return;
        a(a(((View) (obj3))));
_L1:
        obj3 = (View)d.get();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj = (ViewTreeObserver)c.get();
        obj3 = ((View) (obj3)).getViewTreeObserver();
        if (obj3 == obj)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        j();
        if (!n)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        if (!((ViewTreeObserver) (obj)).isAlive())
        {
            break MISSING_BLOCK_LABEL_189;
        }
        n = true;
        ((ViewTreeObserver) (obj3)).addOnScrollChangedListener(this);
        ((ViewTreeObserver) (obj3)).addOnGlobalLayoutListener(this);
        c = new WeakReference(obj3);
        i();
        obj2;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzb.zza("Active view update failed.", ((Throwable) (obj1)));
          goto _L1
        obj1;
          goto _L2
        obj1;
          goto _L2
    }

    public final void c()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!q) goto _L2; else goto _L1
_L1:
        r = true;
        JSONObject jsonobject = k();
        jsonobject.put("doneReasonCode", "u");
        a(jsonobject);
_L3:
        zzb.zzaF((new StringBuilder("Untracking ad unit: ")).append(e.d()).toString());
_L2:
        return;
        Object obj1;
        obj1;
        zzb.zzb("JSON failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        zzb.zzb("Failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
    }

    protected final void d()
    {
        b(false);
    }

    public final boolean e()
    {
        boolean flag;
        synchronized (a)
        {
            flag = q;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void f()
    {
        synchronized (a)
        {
            p = true;
            b(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void g()
    {
        synchronized (a)
        {
            o = true;
            b(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void h()
    {
        synchronized (a)
        {
            o = false;
            b(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onGlobalLayout()
    {
        b(false);
    }

    public final void onScrollChanged()
    {
        b(true);
    }
}
