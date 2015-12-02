// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aqj
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final Object a = new Object();
    private final WeakReference b;
    private WeakReference c;
    private final WeakReference d;
    private final aqh e;
    private final Context f;
    private final adv g;
    private final ajy h;
    private boolean i;
    private final WindowManager j;
    private final PowerManager k;
    private final KeyguardManager l;
    private aqk m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private BroadcastReceiver s;
    private final HashSet t = new HashSet();
    private ajq u;
    private final acu v = new _cls11();
    private final acu w = new _cls2();
    private final acu x = new _cls3();

    public aqj(AdSizeParcel adsizeparcel, ain ain1, VersionInfoParcel versioninfoparcel, View view, adv adv1)
    {
        o = false;
        p = false;
        g = adv1;
        b = new WeakReference(ain1);
        d = new WeakReference(view);
        c = new WeakReference(null);
        q = true;
        u = new ajq(200L);
        e = new aqh(UUID.randomUUID().toString(), versioninfoparcel, adsizeparcel.b, ain1.j, ain1.a());
        h = g.a();
        j = (WindowManager)view.getContext().getSystemService("window");
        k = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        l = (KeyguardManager)view.getContext().getSystemService("keyguard");
        f = view.getContext().getApplicationContext();
        try
        {
            adsizeparcel = a(view);
            h.a(new _cls1(adsizeparcel), new _cls6());
        }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel)
        {
            of.b("Failure while processing active view data.", adsizeparcel);
        }
        h.a(new _cls7(), new _cls8());
        of.a((new StringBuilder("Tracking ad unit: ")).append(e.d()).toString());
    }

    private static int a(int i1, DisplayMetrics displaymetrics)
    {
        float f1 = displaymetrics.density;
        return (int)((float)i1 / f1);
    }

    private JSONObject a(View view)
    {
        boolean flag = ot.g().a(view);
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
            of.b("Failure getting view location.", exception);
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
        jsonobject = m();
        jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isStopped", p).put("isPaused", o).put("isAttachedToWindow", flag).put("viewBox", (new JSONObject()).put("top", a(rect1.top, displaymetrics)).put("bottom", a(rect1.bottom, displaymetrics)).put("left", a(rect1.left, displaymetrics)).put("right", a(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", a(rect.top, displaymetrics)).put("bottom", a(rect.bottom, displaymetrics)).put("left", a(rect.left, displaymetrics)).put("right", a(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", a(rect2.top, displaymetrics)).put("bottom", a(rect2.bottom, displaymetrics)).put("left", a(rect2.left, displaymetrics)).put("right", a(rect2.right, displaymetrics))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", (new JSONObject()).put("top", a(rect3.top, displaymetrics)).put("bottom", a(rect3.bottom, displaymetrics)).put("left", a(rect3.left, displaymetrics)).put("right", a(rect3.right, displaymetrics))).put("localVisibleBoxVisible", flag2).put("hitBox", (new JSONObject()).put("top", a(rect4.top, displaymetrics)).put("bottom", a(rect4.bottom, displaymetrics)).put("left", a(rect4.left, displaymetrics)).put("right", a(rect4.right, displaymetrics))).put("screenDensity", displaymetrics.density).put("isVisible", b(view));
        return jsonobject;
    }

    static boolean a(aqj aqj1)
    {
        aqj1.i = true;
        return true;
    }

    static aqh b(aqj aqj1)
    {
        return aqj1.e;
    }

    private boolean b(View view)
    {
        return view.getVisibility() == 0 && view.isShown() && n() && (!l.inKeyguardRestrictedInputMode() || ot.e().a());
    }

    private void i()
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

    private void j()
    {
        if (m != null)
        {
            m.a(this);
        }
    }

    private void k()
    {
        Object obj = (View)d.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)c.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                l();
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

    private void l()
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

    private JSONObject m()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", e.b()).put("activeViewJSON", e.c()).put("timestamp", ot.i().b()).put("adFormat", e.a()).put("hashCode", e.d()).put("isMraid", e.e());
        return jsonobject;
    }

    private boolean n()
    {
        return k.isScreenOn();
    }

    private JSONObject o()
    {
        JSONObject jsonobject = m();
        jsonobject.put("doneReasonCode", "u");
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
        s = new _cls9();
        f.registerReceiver(s, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(aqg aqg1)
    {
        t.add(aqg1);
    }

    public final void a(aqk aqk1)
    {
        synchronized (a)
        {
            m = aqk1;
        }
        return;
        aqk1;
        obj;
        JVM INSTR monitorexit ;
        throw aqk1;
    }

    protected final void a(aql aql1)
    {
        aql1.a("/updateActiveView", v);
        aql1.a("/untrackActiveViewUnit", w);
        aql1.a("/visibilityChanged", x);
    }

    protected final void a(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonarray.put(jsonobject);
            jsonobject1.put("units", jsonarray);
            h.a(new _cls4(jsonobject1), new _cls5());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            of.b("Skipping active view message.", jsonobject);
        }
    }

    protected final void a(boolean flag)
    {
        for (Iterator iterator = t.iterator(); iterator.hasNext(); ((aqg)iterator.next()).a(flag)) { }
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
        synchronized (a)
        {
            l();
            i();
            q = false;
            j();
            h.a(new _cls10(), new aka());
            g.a(h);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void b(aql aql1)
    {
        aql1.b("/visibilityChanged", x);
        aql1.b("/untrackActiveViewUnit", w);
        aql1.b("/updateActiveView", v);
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
        obj1;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        ain ain1;
        View view;
        ain1 = (ain)b.get();
        view = (View)d.get();
        Object obj;
        boolean flag1;
        if (view != null && ain1 != null)
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
        obj1;
        JVM INSTR monitorexit ;
        return;
        a(a(view));
_L2:
        k();
        j();
        obj1;
        JVM INSTR monitorexit ;
        return;
_L3:
        of.a("Active view update failed.", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
          goto _L3
        obj;
          goto _L3
    }

    public final void c()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!q) goto _L2; else goto _L1
_L1:
        r = true;
        a(o());
_L3:
        of.a((new StringBuilder("Untracking ad unit: ")).append(e.d()).toString());
_L2:
        return;
        Object obj1;
        obj1;
        of.b("JSON failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        of.b("Failure while processing active view data.", ((Throwable) (obj1)));
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

    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls10 {}

}
