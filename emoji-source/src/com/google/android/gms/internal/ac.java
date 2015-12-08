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
//            ef, ex, af, aa, 
//            al, ae, eu, ad, 
//            bb, z, ev, bc

public final class ac
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private static final long lG;
    private final ae lA;
    private boolean lB;
    private final WindowManager lC;
    private final PowerManager lD;
    private final KeyguardManager lE;
    private ad lF;
    private boolean lH;
    private long lI;
    private boolean lJ;
    private BroadcastReceiver lK;
    private HashSet lL;
    private boolean lj;
    private final Object ls;
    private final WeakReference lv;
    private WeakReference lw;
    private final WeakReference lx;
    private final aa ly;
    private final Context lz;

    public ac(al al1, ef ef1)
    {
        this(al1, ef1, ef1.oy.cd(), ((View) (ef1.oy)), ((ae) (new af(ef1.oy.getContext(), ef1.oy.cd()))));
    }

    public ac(al al1, ef ef1, ev ev, View view, ae ae1)
    {
        ls = new Object();
        lj = false;
        lH = false;
        lI = 0x8000000000000000L;
        lL = new HashSet();
        lv = new WeakReference(ef1);
        lx = new WeakReference(view);
        lw = new WeakReference(null);
        lJ = true;
        ly = new aa(Integer.toString(ef1.hashCode()), ev, al1.me, ef1.ry);
        lA = ae1;
        lC = (WindowManager)view.getContext().getSystemService("window");
        lD = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        lE = (KeyguardManager)view.getContext().getSystemService("keyguard");
        lz = view.getContext().getApplicationContext();
        a(ae1);
        lA.a(new ae.a() {

            final ac lM;

            public void aE()
            {
                ac.b(lM, true);
                lM.e(false);
                lM.av();
            }

            
            {
                lM = ac.this;
                super();
            }
        });
        b(lA);
        eu.B((new StringBuilder()).append("Tracking ad unit: ").append(ly.au()).toString());
    }

    static ae b(ac ac1)
    {
        return ac1.lA;
    }

    static boolean b(ac ac1, boolean flag)
    {
        ac1.lB = flag;
        return flag;
    }

    static aa c(ac ac1)
    {
        return ac1.ly;
    }

    protected int a(int i, DisplayMetrics displaymetrics)
    {
        float f = displaymetrics.density;
        return (int)((float)i / f);
    }

    public void a(ad ad1)
    {
        synchronized (ls)
        {
            lF = ad1;
        }
        return;
        ad1;
        obj;
        JVM INSTR monitorexit ;
        throw ad1;
    }

    protected void a(ae ae1)
    {
        ae1.d("http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
    }

    protected void a(ex ex1, Map map)
    {
        e(false);
    }

    public void a(z z1)
    {
        lL.add(z1);
    }

    protected void a(JSONObject jsonobject)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject1 = new JSONObject();
        jsonarray.put(jsonobject);
        jsonobject1.put("units", jsonarray);
        lA.a("AFMA_updateActiveView", jsonobject1);
    }

    protected boolean a(View view, boolean flag)
    {
        return view.getVisibility() == 0 && flag && view.isShown() && lD.isScreenOn() && !lE.inKeyguardRestrictedInputMode();
    }

    protected void aA()
    {
        Object obj = (View)lx.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)lw.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                lw = new WeakReference(obj);
                ((ViewTreeObserver) (obj)).addOnScrollChangedListener(this);
                ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(this);
                return;
            }
        }
    }

    protected void aB()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)lw.get();
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

    protected JSONObject aC()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", ly.as()).put("activeViewJSON", ly.at()).put("timestamp", TimeUnit.NANOSECONDS.toMillis(System.nanoTime())).put("adFormat", ly.ar()).put("hashCode", ly.au());
        return jsonobject;
    }

    protected JSONObject aD()
        throws JSONException
    {
        JSONObject jsonobject = aC();
        jsonobject.put("doneReasonCode", "u");
        return jsonobject;
    }

    protected void av()
    {
label0:
        {
            synchronized (ls)
            {
                if (lK == null)
                {
                    break label0;
                }
            }
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        lK = new BroadcastReceiver() {

            final ac lM;

            public void onReceive(Context context, Intent intent)
            {
                lM.e(false);
            }

            
            {
                lM = ac.this;
                super();
            }
        };
        lz.registerReceiver(lK, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void aw()
    {
        synchronized (ls)
        {
            if (lK != null)
            {
                lz.unregisterReceiver(lK);
                lK = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void ax()
    {
        Object obj = ls;
        obj;
        JVM INSTR monitorenter ;
        if (!lJ) goto _L2; else goto _L1
_L1:
        aB();
        aw();
        a(aD());
_L3:
        lJ = false;
        ay();
        eu.B((new StringBuilder()).append("Untracked ad unit: ").append(ly.au()).toString());
_L2:
        return;
        Object obj1;
        obj1;
        eu.b("JSON Failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    protected void ay()
    {
        if (lF != null)
        {
            lF.a(this);
        }
    }

    public boolean az()
    {
        boolean flag;
        synchronized (ls)
        {
            flag = lJ;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void b(ae ae1)
    {
        ae1.a("/updateActiveView", new bc() {

            final ac lM;

            public void b(ex ex1, Map map)
            {
                lM.a(ex1, map);
            }

            
            {
                lM = ac.this;
                super();
            }
        });
        ae1.a("/activeViewPingSent", new bc() {

            final ac lM;

            public void b(ex ex1, Map map)
            {
                if (map.containsKey("pingType") && "unloadPing".equals(map.get("pingType")))
                {
                    lM.c(ac.b(lM));
                    eu.B((new StringBuilder()).append("Unregistered GMSG handlers for: ").append(ac.c(lM).au()).toString());
                }
            }

            
            {
                lM = ac.this;
                super();
            }
        });
        ae1.a("/visibilityChanged", new bc() {

            final ac lM;

            public void b(ex ex1, Map map)
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
                lM.d(Boolean.valueOf(flag).booleanValue());
            }

            
            {
                lM = ac.this;
                super();
            }
        });
        ae1.a("/viewabilityChanged", bb.mT);
    }

    protected JSONObject c(View view)
        throws JSONException
    {
        int ai1[] = new int[2];
        int ai[] = new int[2];
        view.getLocationOnScreen(ai1);
        view.getLocationInWindow(ai);
        JSONObject jsonobject = aC();
        DisplayMetrics displaymetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = ai1[0];
        rect.top = ai1[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect1 = new Rect();
        rect1.right = lC.getDefaultDisplay().getWidth();
        rect1.bottom = lC.getDefaultDisplay().getHeight();
        Rect rect2 = new Rect();
        boolean flag = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        view.getLocalVisibleRect(rect3);
        jsonobject.put("viewBox", (new JSONObject()).put("top", a(rect1.top, displaymetrics)).put("bottom", a(rect1.bottom, displaymetrics)).put("left", a(rect1.left, displaymetrics)).put("right", a(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", a(rect.top, displaymetrics)).put("bottom", a(rect.bottom, displaymetrics)).put("left", a(rect.left, displaymetrics)).put("right", a(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", a(rect2.top, displaymetrics)).put("bottom", a(rect2.bottom, displaymetrics)).put("left", a(rect2.left, displaymetrics)).put("right", a(rect2.right, displaymetrics))).put("localVisibleBox", (new JSONObject()).put("top", a(rect3.top, displaymetrics)).put("bottom", a(rect3.bottom, displaymetrics)).put("left", a(rect3.left, displaymetrics)).put("right", a(rect3.right, displaymetrics))).put("screenDensity", displaymetrics.density).put("isVisible", a(view, flag)).put("isStopped", lH).put("isPaused", lj);
        return jsonobject;
    }

    protected void c(ae ae1)
    {
        ae1.e("/viewabilityChanged");
        ae1.e("/visibilityChanged");
        ae1.e("/activeViewPingSent");
        ae1.e("/updateActiveView");
    }

    protected void d(boolean flag)
    {
        for (Iterator iterator = lL.iterator(); iterator.hasNext(); ((z)iterator.next()).a(this, flag)) { }
    }

    protected void e(boolean flag)
    {
label0:
        {
            synchronized (ls)
            {
                if (lB && lJ)
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
        if (lI + lG <= l)
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
        ef ef1;
        View view;
        lI = l;
        ef1 = (ef)lv.get();
        view = (View)lx.get();
        JSONException jsonexception;
        boolean flag1;
        if (view != null && ef1 != null)
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
        ax();
        obj;
        JVM INSTR monitorexit ;
        return;
        a(c(view));
_L1:
        aA();
        ay();
        obj;
        JVM INSTR monitorexit ;
        return;
        jsonexception;
        eu.b("Active view update failed.", jsonexception);
          goto _L1
    }

    public void onGlobalLayout()
    {
        e(false);
    }

    public void onScrollChanged()
    {
        e(true);
    }

    public void pause()
    {
        synchronized (ls)
        {
            lj = true;
            e(false);
            lA.pause();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resume()
    {
        synchronized (ls)
        {
            lA.resume();
            lj = false;
            e(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        synchronized (ls)
        {
            lH = true;
            e(false);
            lA.pause();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        lG = TimeUnit.MILLISECONDS.toNanos(100L);
    }
}
