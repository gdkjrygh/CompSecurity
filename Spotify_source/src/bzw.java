// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bzw
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    final Object a = new Object();
    final Context b;
    bzz c;
    BroadcastReceiver d;
    final HashSet e = new HashSet();
    final cdi f = new cdi() {

        private bzw a;

        public final void a(ckw ckw, Map map)
        {
            if (!a.a(map))
            {
                return;
            } else
            {
                a.c();
                return;
            }
        }

            
            {
                a = bzw.this;
                super();
            }
    };
    final cdi g = new cdi() {

        private bzw a;

        public final void a(ckw ckw, Map map)
        {
            if (!a.a(map))
            {
                return;
            } else
            {
                bka.a((new StringBuilder("Received request to untrack: ")).append(bzw.b(a).c).toString());
                a.a();
                return;
            }
        }

            
            {
                a = bzw.this;
                super();
            }
    };
    final cdi h = new cdi() {

        private bzw a;

        public final void a(ckw ckw, Map map)
        {
            if (a.a(map) && map.containsKey("isVisible"))
            {
                boolean flag;
                if ("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible")))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ckw = a;
                flag = Boolean.valueOf(flag).booleanValue();
                map = ((bzw) (ckw)).e.iterator();
                while (map.hasNext()) 
                {
                    ((bzt)map.next()).a(ckw, flag);
                }
            }
        }

            
            {
                a = bzw.this;
                super();
            }
    };
    private final WeakReference i;
    private WeakReference j;
    private final WeakReference k;
    private final bzu l;
    private final ced m;
    private final ceh n;
    private boolean o;
    private final WindowManager p;
    private final PowerManager q;
    private final KeyguardManager r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private ckd w;

    public bzw(AdSizeParcel adsizeparcel, cit cit1, VersionInfoParcel versioninfoparcel, View view, ced ced1)
    {
        t = false;
        u = false;
        m = ced1;
        i = new WeakReference(cit1);
        k = new WeakReference(view);
        j = new WeakReference(null);
        v = true;
        w = new ckd(200L);
        l = new bzu(UUID.randomUUID().toString(), versioninfoparcel, adsizeparcel.b, cit1.j, cit1.a());
        n = m.b();
        p = (WindowManager)view.getContext().getSystemService("window");
        q = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        r = (KeyguardManager)view.getContext().getSystemService("keyguard");
        b = view.getContext().getApplicationContext();
        try
        {
            adsizeparcel = a(view);
            n.a(new ckp(adsizeparcel) {

                private JSONObject a;
                private bzw b;

                public final void a(Object obj)
                {
                    b.a(a);
                }

            
            {
                b = bzw.this;
                a = jsonobject;
                super();
            }
            }, new ckn() {

                public final void a()
                {
                }

            });
        }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel)
        {
            bka.b("Failure while processing active view data.", adsizeparcel);
        }
        n.a(new ckp() {

            private bzw a;

            public final void a(Object obj)
            {
                bzw bzw1;
                obj = (cae)obj;
                bzw.a(a);
                bzw1 = a;
                ((cae) (obj)).a("/updateActiveView", bzw1.f);
                ((cae) (obj)).a("/untrackActiveViewUnit", bzw1.g);
                ((cae) (obj)).a("/visibilityChanged", bzw1.h);
                bzw1 = a;
                obj = bzw1.a;
                obj;
                JVM INSTR monitorenter ;
                if (bzw1.d == null) goto _L2; else goto _L1
_L1:
                a.a(false);
                return;
_L2:
                IntentFilter intentfilter = new IntentFilter();
                intentfilter.addAction("android.intent.action.SCREEN_ON");
                intentfilter.addAction("android.intent.action.SCREEN_OFF");
                bzw1.d = bzw1. new BroadcastReceiver() {

                    private bzw a;

                    public final void onReceive(Context context, Intent intent)
                    {
                        a.a(false);
                    }

            
            {
                a = bzw.this;
                super();
            }
                };
                bzw1.b.registerReceiver(bzw1.d, intentfilter);
                obj;
                JVM INSTR monitorexit ;
                if (true) goto _L1; else goto _L3
_L3:
                Exception exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = bzw.this;
                super();
            }
        }, new ckn() {

            private bzw a;

            public final void a()
            {
                a.a();
            }

            
            {
                a = bzw.this;
                super();
            }
        });
        bka.a((new StringBuilder("Tracking ad unit: ")).append(l.c).toString());
    }

    private static int a(int i1, DisplayMetrics displaymetrics)
    {
        float f1 = displaymetrics.density;
        return (int)((float)i1 / f1);
    }

    private JSONObject a(View view)
    {
        boolean flag = bkv.g().a(view);
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
            bka.b("Failure getting view location.", exception);
        }
        obj = view.getContext().getResources().getDisplayMetrics();
        rect = new Rect();
        rect.left = ai1[0];
        rect.top = ai1[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        rect1 = new Rect();
        rect1.right = p.getDefaultDisplay().getWidth();
        rect1.bottom = p.getDefaultDisplay().getHeight();
        rect2 = new Rect();
        flag1 = view.getGlobalVisibleRect(rect2, null);
        rect3 = new Rect();
        flag2 = view.getLocalVisibleRect(rect3);
        rect4 = new Rect();
        view.getHitRect(rect4);
        jsonobject = j();
        obj = jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isStopped", u).put("isPaused", t).put("isScreenOn", q.isScreenOn()).put("isAttachedToWindow", flag).put("viewBox", (new JSONObject()).put("top", a(rect1.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect1.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect1.left, ((DisplayMetrics) (obj)))).put("right", a(rect1.right, ((DisplayMetrics) (obj))))).put("adBox", (new JSONObject()).put("top", a(rect.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect.left, ((DisplayMetrics) (obj)))).put("right", a(rect.right, ((DisplayMetrics) (obj))))).put("globalVisibleBox", (new JSONObject()).put("top", a(rect2.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect2.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect2.left, ((DisplayMetrics) (obj)))).put("right", a(rect2.right, ((DisplayMetrics) (obj))))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", (new JSONObject()).put("top", a(rect3.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect3.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect3.left, ((DisplayMetrics) (obj)))).put("right", a(rect3.right, ((DisplayMetrics) (obj))))).put("localVisibleBoxVisible", flag2).put("hitBox", (new JSONObject()).put("top", a(rect4.top, ((DisplayMetrics) (obj)))).put("bottom", a(rect4.bottom, ((DisplayMetrics) (obj)))).put("left", a(rect4.left, ((DisplayMetrics) (obj)))).put("right", a(rect4.right, ((DisplayMetrics) (obj))))).put("screenDensity", ((DisplayMetrics) (obj)).density);
        if (view.getVisibility() == 0 && view.isShown() && q.isScreenOn() && (!r.inKeyguardRestrictedInputMode() || bkv.e().b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((JSONObject) (obj)).put("isVisible", flag);
        return jsonobject;
    }

    static boolean a(bzw bzw1)
    {
        bzw1.o = true;
        return true;
    }

    static bzu b(bzw bzw1)
    {
        return bzw1.l;
    }

    private void h()
    {
        if (c != null)
        {
            c.a(this);
        }
    }

    private void i()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)j.get();
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

    private JSONObject j()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", l.d).put("activeViewJSON", l.b).put("timestamp", bkv.i().b()).put("adFormat", l.a).put("hashCode", l.c).put("isMraid", l.e);
        return jsonobject;
    }

    protected final void a()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        i();
        synchronized (a)
        {
            if (d != null)
            {
                b.unregisterReceiver(d);
                d = null;
            }
        }
        v = false;
        h();
        n.a();
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

    public final void a(bzt bzt)
    {
        e.add(bzt);
    }

    protected final void a(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonarray.put(jsonobject);
            jsonobject1.put("units", jsonarray);
            n.a(new ckp(jsonobject1) {

                private JSONObject a;

                public final void a(Object obj)
                {
                    ((cae)obj).a("AFMA_updateActiveView", a);
                }

            
            {
                a = jsonobject;
                super();
            }
            }, new cko());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            bka.b("Skipping active view message.", jsonobject);
        }
    }

    protected final void a(boolean flag)
    {
label0:
        {
            synchronized (a)
            {
                if (o && v)
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
        if (w.a())
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
        obj = (cit)i.get();
        obj3 = (View)k.get();
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
        b();
        obj2;
        JVM INSTR monitorexit ;
        return;
        a(a(((View) (obj3))));
_L1:
        obj3 = (View)k.get();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj = (ViewTreeObserver)j.get();
        obj3 = ((View) (obj3)).getViewTreeObserver();
        if (obj3 == obj)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        i();
        if (!s)
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
        s = true;
        ((ViewTreeObserver) (obj3)).addOnScrollChangedListener(this);
        ((ViewTreeObserver) (obj3)).addOnGlobalLayoutListener(this);
        j = new WeakReference(obj3);
        h();
        obj2;
        JVM INSTR monitorexit ;
        return;
_L2:
        bka.a("Active view update failed.", ((Throwable) (obj1)));
          goto _L1
        obj1;
          goto _L2
        obj1;
          goto _L2
    }

    protected final boolean a(Map map)
    {
        if (map == null)
        {
            return false;
        }
        map = (String)map.get("hashCode");
        return !TextUtils.isEmpty(map) && map.equals(l.c);
    }

    public final void b()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = v;
        if (!flag) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = j();
        jsonobject.put("doneReasonCode", "u");
        a(jsonobject);
_L3:
        bka.a((new StringBuilder("Untracking ad unit: ")).append(l.c).toString());
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        bka.b("JSON failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        bka.b("Failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
    }

    protected final void c()
    {
        a(false);
    }

    public final boolean d()
    {
        boolean flag;
        synchronized (a)
        {
            flag = v;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        synchronized (a)
        {
            u = true;
            a(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void f()
    {
        synchronized (a)
        {
            t = true;
            a(false);
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
            t = false;
            a(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onGlobalLayout()
    {
        a(false);
    }

    public final void onScrollChanged()
    {
        a(true);
    }
}
