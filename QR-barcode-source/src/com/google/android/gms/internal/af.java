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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            aj, ad, ay, fz, 
//            ah, gs, ag, bx, 
//            ac, gt, by, gv

public final class af
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private static final long mK;
    private WeakReference mA;
    private final WeakReference mB;
    private final ad mC;
    private final Context mD;
    private final ah mE;
    private boolean mF;
    private final WindowManager mG;
    private final PowerManager mH;
    private final KeyguardManager mI;
    private ag mJ;
    private boolean mL;
    private final BlockingQueue mM;
    private long mN;
    private boolean mO;
    private boolean mP;
    private BroadcastReceiver mQ;
    private final HashSet mR;
    private boolean mn;
    private final Object mw;
    private final WeakReference mz;

    public af(Context context, ay ay1, fz fz1, View view, gt gt)
    {
        this(ay1, fz1, gt, view, ((ah) (new aj(context, gt))));
    }

    public af(ay ay1, fz fz1, gt gt, View view, ah ah1)
    {
        mw = new Object();
        mn = false;
        mL = false;
        mM = new ArrayBlockingQueue(2);
        mN = 0x8000000000000000L;
        mR = new HashSet();
        mz = new WeakReference(fz1);
        mB = new WeakReference(view);
        mA = new WeakReference(null);
        mO = true;
        mC = new ad(UUID.randomUUID().toString(), gt, ay1.of, fz1.vp);
        mE = ah1;
        mG = (WindowManager)view.getContext().getSystemService("window");
        mH = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        mI = (KeyguardManager)view.getContext().getSystemService("keyguard");
        mD = view.getContext().getApplicationContext();
        a(ah1);
        mE.a(new ah.a(view) {

            final View mS;
            final af mT;

            public void aM()
            {
                af.b(mT, true);
                mT.d(mS);
                mT.aD();
            }

            
            {
                mT = af.this;
                mS = view;
                super();
            }
        });
        b(mE);
        try
        {
            ay1 = e(view);
            mM.add(new Runnable(ay1) {

                final af mT;
                final JSONObject mU;

                public void run()
                {
                    mT.a(mU);
                }

            
            {
                mT = af.this;
                mU = jsonobject;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (ay ay1) { }
        mM.add(new Runnable() {

            final af mT;

            public void run()
            {
                mT.e(false);
            }

            
            {
                mT = af.this;
                super();
            }
        });
        gs.S((new StringBuilder()).append("Tracking ad unit: ").append(mC.aC()).toString());
    }

    static ad b(af af1)
    {
        return af1.mC;
    }

    static boolean b(af af1, boolean flag)
    {
        af1.mF = flag;
        return flag;
    }

    protected int a(int i, DisplayMetrics displaymetrics)
    {
        float f1 = displaymetrics.density;
        return (int)((float)i / f1);
    }

    protected void a(View view, Map map)
    {
        e(false);
    }

    public void a(ac ac1)
    {
        mR.add(ac1);
    }

    public void a(ag ag1)
    {
        synchronized (mw)
        {
            mJ = ag1;
        }
        return;
        ag1;
        obj;
        JVM INSTR monitorexit ;
        throw ag1;
    }

    protected void a(ah ah1)
    {
        ah1.f("https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
    }

    protected void a(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonarray.put(jsonobject);
            jsonobject1.put("units", jsonarray);
            mE.a("AFMA_updateActiveView", jsonobject1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            gs.b("Skipping active view message.", jsonobject);
        }
    }

    protected boolean a(Map map)
    {
        if (map == null)
        {
            return false;
        }
        map = (String)map.get("hashCode");
        boolean flag;
        if (!TextUtils.isEmpty(map) && map.equals(mC.aC()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    protected void aD()
    {
label0:
        {
            synchronized (mw)
            {
                if (mQ == null)
                {
                    break label0;
                }
            }
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        mQ = new BroadcastReceiver() {

            final af mT;

            public void onReceive(Context context, Intent intent)
            {
                mT.e(false);
            }

            
            {
                mT = af.this;
                super();
            }
        };
        mD.registerReceiver(mQ, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void aE()
    {
        synchronized (mw)
        {
            if (mQ != null)
            {
                mD.unregisterReceiver(mQ);
                mQ = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void aF()
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (!mO) goto _L2; else goto _L1
_L1:
        mP = true;
        a(aL());
_L3:
        gs.S((new StringBuilder()).append("Untracking ad unit: ").append(mC.aC()).toString());
_L2:
        return;
        Object obj1;
        obj1;
        gs.b("JSON Failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    protected void aG()
    {
        if (mJ != null)
        {
            mJ.a(this);
        }
    }

    public boolean aH()
    {
        boolean flag;
        synchronized (mw)
        {
            flag = mO;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void aI()
    {
        Object obj = (View)mB.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)mA.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                mA = new WeakReference(obj);
                ((ViewTreeObserver) (obj)).addOnScrollChangedListener(this);
                ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(this);
                return;
            }
        }
    }

    protected void aJ()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)mA.get();
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

    protected JSONObject aK()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", mC.aA()).put("activeViewJSON", mC.aB()).put("timestamp", TimeUnit.NANOSECONDS.toMillis(System.nanoTime())).put("adFormat", mC.az()).put("hashCode", mC.aC());
        return jsonobject;
    }

    protected JSONObject aL()
        throws JSONException
    {
        JSONObject jsonobject = aK();
        jsonobject.put("doneReasonCode", "u");
        return jsonobject;
    }

    protected void b(ah ah1)
    {
        ah1.a("/updateActiveView", new by() {

            final af mT;

            public void a(gv gv, Map map)
            {
                if (!mT.a(map))
                {
                    return;
                } else
                {
                    mT.a(gv, map);
                    return;
                }
            }

            
            {
                mT = af.this;
                super();
            }
        });
        ah1.a("/untrackActiveViewUnit", new by() {

            final af mT;

            public void a(gv gv, Map map)
            {
                if (!mT.a(map))
                {
                    return;
                } else
                {
                    gs.S((new StringBuilder()).append("Received request to untrack: ").append(af.b(mT).aC()).toString());
                    mT.destroy();
                    return;
                }
            }

            
            {
                mT = af.this;
                super();
            }
        });
        ah1.a("/visibilityChanged", new by() {

            final af mT;

            public void a(gv gv, Map map)
            {
                while (!mT.a(map) || !map.containsKey("isVisible")) 
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
                mT.d(Boolean.valueOf(flag).booleanValue());
            }

            
            {
                mT = af.this;
                super();
            }
        });
        ah1.a("/viewabilityChanged", bx.pA);
    }

    protected void d(View view)
    {
        view = new ArrayList();
        mM.drainTo(view);
        for (view = view.iterator(); view.hasNext(); ((Runnable)view.next()).run()) { }
    }

    protected void d(boolean flag)
    {
        for (Iterator iterator = mR.iterator(); iterator.hasNext(); ((ac)iterator.next()).a(this, flag)) { }
    }

    protected void destroy()
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        aJ();
        aE();
        mO = false;
        Exception exception;
        try
        {
            mE.destroy();
        }
        catch (Throwable throwable) { }
        aG();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected JSONObject e(View view)
        throws JSONException
    {
        int ai1[] = new int[2];
        int ai[] = new int[2];
        view.getLocationOnScreen(ai1);
        view.getLocationInWindow(ai);
        JSONObject jsonobject = aK();
        DisplayMetrics displaymetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = ai1[0];
        rect.top = ai1[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect1 = new Rect();
        rect1.right = mG.getDefaultDisplay().getWidth();
        rect1.bottom = mG.getDefaultDisplay().getHeight();
        Rect rect2 = new Rect();
        boolean flag = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean flag1 = view.getLocalVisibleRect(rect3);
        jsonobject.put("viewBox", (new JSONObject()).put("top", a(rect1.top, displaymetrics)).put("bottom", a(rect1.bottom, displaymetrics)).put("left", a(rect1.left, displaymetrics)).put("right", a(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", a(rect.top, displaymetrics)).put("bottom", a(rect.bottom, displaymetrics)).put("left", a(rect.left, displaymetrics)).put("right", a(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", a(rect2.top, displaymetrics)).put("bottom", a(rect2.bottom, displaymetrics)).put("left", a(rect2.left, displaymetrics)).put("right", a(rect2.right, displaymetrics))).put("globalVisibleBoxVisible", flag).put("localVisibleBox", (new JSONObject()).put("top", a(rect3.top, displaymetrics)).put("bottom", a(rect3.bottom, displaymetrics)).put("left", a(rect3.left, displaymetrics)).put("right", a(rect3.right, displaymetrics))).put("localVisibleBoxVisible", flag1).put("screenDensity", displaymetrics.density).put("isVisible", f(view)).put("isStopped", mL).put("isPaused", mn);
        return jsonobject;
    }

    protected void e(boolean flag)
    {
label0:
        {
            synchronized (mw)
            {
                if (mF && mO)
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
        if (mN + mK <= l)
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
        fz fz1;
        View view;
        mN = l;
        fz1 = (fz)mz.get();
        view = (View)mB.get();
        JSONException jsonexception;
        boolean flag1;
        if (view != null && fz1 != null)
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
        aF();
        obj;
        JVM INSTR monitorexit ;
        return;
        a(e(view));
_L1:
        aI();
        aG();
        obj;
        JVM INSTR monitorexit ;
        return;
        jsonexception;
        gs.a("Active view update failed.", jsonexception);
          goto _L1
    }

    protected boolean f(View view)
    {
        return view.getVisibility() == 0 && view.isShown() && mH.isScreenOn() && !mI.inKeyguardRestrictedInputMode();
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
        synchronized (mw)
        {
            mn = true;
            e(false);
            mE.pause();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resume()
    {
        synchronized (mw)
        {
            mE.resume();
            mn = false;
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
        synchronized (mw)
        {
            mL = true;
            e(false);
            mE.pause();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        mK = TimeUnit.MILLISECONDS.toNanos(100L);
    }
}
