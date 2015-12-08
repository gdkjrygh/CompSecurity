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
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dh, dz, ae, z, 
//            ak, ad, dw, ac, 
//            ba, y, dx, bb

public final class ab
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private static final long lw;
    private HashSet lA;
    private final Object li;
    private final WeakReference ll;
    private WeakReference lm;
    private final WeakReference ln;
    private final z lo;
    private final Context lp;
    private final ad lq;
    private boolean lr;
    private final WindowManager ls;
    private final PowerManager lt;
    private final KeyguardManager lu;
    private ac lv;
    private long lx;
    private boolean ly;
    private BroadcastReceiver lz;

    public ab(ak ak1, dh dh1)
    {
        this(ak1, dh1, dh1.oj.bK(), ((View) (dh1.oj)), ((ad) (new ae(dh1.oj.getContext(), dh1.oj.bK()))));
    }

    public ab(ak ak1, dh dh1, dx dx, View view, ad ad1)
    {
        li = new Object();
        lx = 0x8000000000000000L;
        lA = new HashSet();
        ll = new WeakReference(dh1);
        ln = new WeakReference(view);
        lm = new WeakReference(null);
        ly = true;
        lo = new z(Integer.toString(dh1.hashCode()), dx, ak1.lS, dh1.qs);
        lq = ad1;
        ls = (WindowManager)view.getContext().getSystemService("window");
        lt = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        lu = (KeyguardManager)view.getContext().getSystemService("keyguard");
        lp = view.getContext().getApplicationContext();
        a(ad1);
        lq.a(new ad.a() {

            final ab lB;

            public void ay()
            {
                ab.b(lB, true);
                lB.d(false);
                lB.ap();
            }

            
            {
                lB = ab.this;
                super();
            }
        });
        b(lq);
        dw.x((new StringBuilder()).append("Tracking ad unit: ").append(lo.ao()).toString());
    }

    static ad b(ab ab1)
    {
        return ab1.lq;
    }

    static boolean b(ab ab1, boolean flag)
    {
        ab1.lr = flag;
        return flag;
    }

    static z c(ab ab1)
    {
        return ab1.lo;
    }

    protected int a(int i, DisplayMetrics displaymetrics)
    {
        float f = displaymetrics.density;
        return (int)((float)i / f);
    }

    public void a(ac ac1)
    {
        synchronized (li)
        {
            lv = ac1;
        }
        return;
        ac1;
        obj;
        JVM INSTR monitorexit ;
        throw ac1;
    }

    protected void a(ad ad1)
    {
        ad1.d("http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
    }

    protected void a(dz dz1, Map map)
    {
        d(false);
    }

    public void a(y y1)
    {
        lA.add(y1);
    }

    protected void a(JSONObject jsonobject)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject1 = new JSONObject();
        jsonarray.put(jsonobject);
        jsonobject1.put("units", jsonarray);
        lq.a("AFMA_updateActiveView", jsonobject1);
    }

    protected boolean a(View view, boolean flag)
    {
        return view.getVisibility() == 0 && flag && view.isShown() && lt.isScreenOn() && !lu.inKeyguardRestrictedInputMode();
    }

    protected void ap()
    {
label0:
        {
            synchronized (li)
            {
                if (lz == null)
                {
                    break label0;
                }
            }
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        lz = new BroadcastReceiver() {

            final ab lB;

            public void onReceive(Context context, Intent intent)
            {
                lB.d(false);
            }

            
            {
                lB = ab.this;
                super();
            }
        };
        lp.registerReceiver(lz, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void aq()
    {
        synchronized (li)
        {
            if (lz != null)
            {
                lp.unregisterReceiver(lz);
                lz = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void ar()
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        if (!ly) goto _L2; else goto _L1
_L1:
        av();
        aq();
        a(ax());
_L3:
        ly = false;
        as();
        dw.x((new StringBuilder()).append("Untracked ad unit: ").append(lo.ao()).toString());
_L2:
        return;
        Object obj1;
        obj1;
        dw.b("JSON Failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    protected void as()
    {
        if (lv != null)
        {
            lv.a(this);
        }
    }

    public boolean at()
    {
        boolean flag;
        synchronized (li)
        {
            flag = ly;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void au()
    {
        Object obj = (View)ln.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)lm.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                lm = new WeakReference(obj);
                ((ViewTreeObserver) (obj)).addOnScrollChangedListener(this);
                ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(this);
                return;
            }
        }
    }

    protected void av()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)lm.get();
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

    protected JSONObject aw()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", lo.am()).put("activeViewJSON", lo.an()).put("timestamp", TimeUnit.NANOSECONDS.toMillis(System.nanoTime())).put("adFormat", lo.al()).put("hashCode", lo.ao());
        return jsonobject;
    }

    protected JSONObject ax()
        throws JSONException
    {
        JSONObject jsonobject = aw();
        jsonobject.put("doneReasonCode", "u");
        return jsonobject;
    }

    protected void b(ad ad1)
    {
        ad1.a("/updateActiveView", new bb() {

            final ab lB;

            public void b(dz dz1, Map map)
            {
                lB.a(dz1, map);
            }

            
            {
                lB = ab.this;
                super();
            }
        });
        ad1.a("/activeViewPingSent", new bb() {

            final ab lB;

            public void b(dz dz1, Map map)
            {
                if (map.containsKey("pingType") && "unloadPing".equals(map.get("pingType")))
                {
                    lB.c(ab.b(lB));
                    dw.x((new StringBuilder()).append("Unregistered GMSG handlers for: ").append(ab.c(lB).ao()).toString());
                }
            }

            
            {
                lB = ab.this;
                super();
            }
        });
        ad1.a("/visibilityChanged", new bb() {

            final ab lB;

            public void b(dz dz1, Map map)
            {
                if (!map.containsKey("isVisible"))
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
                lB.c(Boolean.valueOf(flag).booleanValue());
            }

            
            {
                lB = ab.this;
                super();
            }
        });
        ad1.a("/viewabilityChanged", ba.mG);
    }

    protected JSONObject c(View view)
        throws JSONException
    {
        int ai1[] = new int[2];
        int ai[] = new int[2];
        view.getLocationOnScreen(ai1);
        view.getLocationInWindow(ai);
        JSONObject jsonobject = aw();
        DisplayMetrics displaymetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = ai1[0];
        rect.top = ai1[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect1 = new Rect();
        rect1.right = ls.getDefaultDisplay().getWidth();
        rect1.bottom = ls.getDefaultDisplay().getHeight();
        Rect rect2 = new Rect();
        boolean flag = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        view.getLocalVisibleRect(rect3);
        jsonobject.put("viewBox", (new JSONObject()).put("top", a(rect1.top, displaymetrics)).put("bottom", a(rect1.bottom, displaymetrics)).put("left", a(rect1.left, displaymetrics)).put("right", a(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", a(rect.top, displaymetrics)).put("bottom", a(rect.bottom, displaymetrics)).put("left", a(rect.left, displaymetrics)).put("right", a(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", a(rect2.top, displaymetrics)).put("bottom", a(rect2.bottom, displaymetrics)).put("left", a(rect2.left, displaymetrics)).put("right", a(rect2.right, displaymetrics))).put("localVisibleBox", (new JSONObject()).put("top", a(rect3.top, displaymetrics)).put("bottom", a(rect3.bottom, displaymetrics)).put("left", a(rect3.left, displaymetrics)).put("right", a(rect3.right, displaymetrics))).put("screenDensity", displaymetrics.density).put("isVisible", a(view, flag));
        return jsonobject;
    }

    protected void c(ad ad1)
    {
        ad1.e("/viewabilityChanged");
        ad1.e("/visibilityChanged");
        ad1.e("/activeViewPingSent");
        ad1.e("/updateActiveView");
    }

    protected void c(boolean flag)
    {
        for (Iterator iterator = lA.iterator(); iterator.hasNext(); ((y)iterator.next()).a(this, flag)) { }
    }

    protected void d(boolean flag)
    {
label0:
        {
            synchronized (li)
            {
                if (lr && ly)
                {
                    break label0;
                }
            }
            return;
        }
        long l = System.nanoTime();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (lx + lw <= l)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        dh dh1;
        View view;
        lx = l;
        dh1 = (dh)ll.get();
        view = (View)ln.get();
        JSONException jsonexception;
        boolean flag1;
        if (view != null && dh1 != null)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        ar();
        obj;
        JVM INSTR monitorexit ;
        return;
        a(c(view));
_L1:
        au();
        as();
        obj;
        JVM INSTR monitorexit ;
        return;
        jsonexception;
        dw.b("Active view update failed.", jsonexception);
          goto _L1
    }

    public void onGlobalLayout()
    {
        d(false);
    }

    public void onScrollChanged()
    {
        d(true);
    }

    static 
    {
        lw = TimeUnit.MILLISECONDS.toNanos(100L);
    }
}
