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
//            he, x, gl, cw, 
//            gx, af, w, gw, 
//            ab, ix, ch

public class z
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final Object a = new Object();
    private final WeakReference b;
    private WeakReference c;
    private final WeakReference d;
    private final x e;
    private final Context f;
    private final cw g;
    private final cw.d h;
    private boolean i;
    private final WindowManager j;
    private final PowerManager k;
    private final KeyguardManager l;
    private ab m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private BroadcastReceiver s;
    private final HashSet t = new HashSet();
    private he u;
    private final ch v = new _cls6();
    private final ch w = new _cls7();
    private final ch x = new _cls8();

    public z(AdSizeParcel adsizeparcel, gl gl1, VersionInfoParcel versioninfoparcel, View view, cw cw1)
    {
        o = false;
        p = false;
        g = cw1;
        b = new WeakReference(gl1);
        d = new WeakReference(view);
        c = new WeakReference(null);
        q = true;
        u = new he(200L);
        e = new x(UUID.randomUUID().toString(), versioninfoparcel, adsizeparcel.zzsG, gl1.j, gl1.a());
        h = g.b();
        j = (WindowManager)view.getContext().getSystemService("window");
        k = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        l = (KeyguardManager)view.getContext().getSystemService("keyguard");
        f = view.getContext().getApplicationContext();
        try
        {
            adsizeparcel = a(view);
            h.a(new _cls1(adsizeparcel), new _cls2());
        }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel)
        {
            zzb.zzb("Failure while processing active view data.", adsizeparcel);
        }
        h.a(new _cls3(), new _cls4());
        zzb.zzaC((new StringBuilder()).append("Tracking ad unit: ").append(e.d()).toString());
    }

    static x a(z z1)
    {
        return z1.e;
    }

    static boolean a(z z1, boolean flag)
    {
        z1.i = flag;
        return flag;
    }

    protected int a(int i1, DisplayMetrics displaymetrics)
    {
        float f1 = displaymetrics.density;
        return (int)((float)i1 / f1);
    }

    protected JSONObject a(View view)
        throws JSONException
    {
        boolean flag = zzp.zzbz().a(view);
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
            zzb.zzb("Failure getting view location.", exception);
        }
        displaymetrics = view.getContext().getResources().getDisplayMetrics();
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
        jsonobject = i();
        jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isStopped", p).put("isPaused", o).put("isAttachedToWindow", flag).put("viewBox", (new JSONObject()).put("top", a(rect1.top, displaymetrics)).put("bottom", a(rect1.bottom, displaymetrics)).put("left", a(rect1.left, displaymetrics)).put("right", a(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", a(rect.top, displaymetrics)).put("bottom", a(rect.bottom, displaymetrics)).put("left", a(rect.left, displaymetrics)).put("right", a(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", a(rect2.top, displaymetrics)).put("bottom", a(rect2.bottom, displaymetrics)).put("left", a(rect2.left, displaymetrics)).put("right", a(rect2.right, displaymetrics))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", (new JSONObject()).put("top", a(rect3.top, displaymetrics)).put("bottom", a(rect3.bottom, displaymetrics)).put("left", a(rect3.left, displaymetrics)).put("right", a(rect3.right, displaymetrics))).put("localVisibleBoxVisible", flag2).put("hitBox", (new JSONObject()).put("top", a(rect4.top, displaymetrics)).put("bottom", a(rect4.bottom, displaymetrics)).put("left", a(rect4.left, displaymetrics)).put("right", a(rect4.right, displaymetrics))).put("screenDensity", displaymetrics.density).put("isVisible", b(view));
        return jsonobject;
    }

    protected void a()
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
        s = new _cls5();
        f.registerReceiver(s, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(View view, Map map)
    {
        b(false);
    }

    public void a(ab ab1)
    {
        synchronized (a)
        {
            m = ab1;
        }
        return;
        ab1;
        obj;
        JVM INSTR monitorexit ;
        throw ab1;
    }

    protected void a(af af1)
    {
        af1.a("/updateActiveView", v);
        af1.a("/untrackActiveViewUnit", w);
        af1.a("/visibilityChanged", x);
    }

    public void a(w w1)
    {
        t.add(w1);
    }

    protected void a(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonarray.put(jsonobject);
            jsonobject1.put("units", jsonarray);
            h.a(new _cls9(jsonobject1), new hm.b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            zzb.zzb("Skipping active view message.", jsonobject);
        }
    }

    protected void a(boolean flag)
    {
        for (Iterator iterator = t.iterator(); iterator.hasNext(); ((w)iterator.next()).a(this, flag)) { }
    }

    protected boolean a(Map map)
    {
        if (map == null)
        {
            return false;
        }
        map = (String)map.get("hashCode");
        boolean flag;
        if (!TextUtils.isEmpty(map) && map.equals(e.d()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    protected void b()
    {
        synchronized (a)
        {
            if (s != null)
            {
                f.unregisterReceiver(s);
                s = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void b(boolean flag)
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
        obj1;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        gl gl1;
        View view;
        gl1 = (gl)b.get();
        view = (View)d.get();
        Object obj;
        boolean flag1;
        if (view != null && gl1 != null)
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
        d();
        obj1;
        JVM INSTR monitorexit ;
        return;
        a(a(view));
_L2:
        g();
        e();
        obj1;
        JVM INSTR monitorexit ;
        return;
_L3:
        zzb.zza("Active view update failed.", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
          goto _L3
        obj;
          goto _L3
    }

    protected boolean b(View view)
    {
        return view.getVisibility() == 0 && view.isShown() && j() && (!l.inKeyguardRestrictedInputMode() || zzp.zzbx().a());
    }

    protected void c()
    {
        synchronized (a)
        {
            h();
            b();
            q = false;
            e();
            h.a();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void d()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!q) goto _L2; else goto _L1
_L1:
        r = true;
        a(k());
_L3:
        zzb.zzaC((new StringBuilder()).append("Untracking ad unit: ").append(e.d()).toString());
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

    protected void e()
    {
        if (m != null)
        {
            m.a(this);
        }
    }

    public boolean f()
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

    protected void g()
    {
        Object obj = (View)d.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)c.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                h();
                if (!n || viewtreeobserver != null && viewtreeobserver.isAlive())
                {
                    n = true;
                    ((ViewTreeObserver) (obj)).addOnScrollChangedListener(this);
                    ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(this);
                }
                c = new WeakReference(obj);
                return;
            }
        }
    }

    protected void h()
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

    protected JSONObject i()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", e.b()).put("activeViewJSON", e.c()).put("timestamp", zzp.zzbB().b()).put("adFormat", e.a()).put("hashCode", e.d()).put("isMraid", e.e());
        return jsonobject;
    }

    boolean j()
    {
        return k.isScreenOn();
    }

    protected JSONObject k()
        throws JSONException
    {
        JSONObject jsonobject = i();
        jsonobject.put("doneReasonCode", "u");
        return jsonobject;
    }

    public void l()
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

    public void m()
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

    public void n()
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

    public void onGlobalLayout()
    {
        b(false);
    }

    public void onScrollChanged()
    {
        b(true);
    }

    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls9 {}

}
