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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            aj, ad, ay, fy, 
//            ah, gr, ag, ga, 
//            ld, cc, ll, ac, 
//            gs, cd, gu

public final class af
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final Object mH;
    private final WeakReference mK;
    private WeakReference mL;
    private final WeakReference mM;
    private final ad mN;
    private final Context mO;
    private final ah mP;
    private boolean mQ;
    private final WindowManager mR;
    private final PowerManager mS;
    private final KeyguardManager mT;
    private ag mU;
    private boolean mV;
    private final BlockingQueue mW;
    private long mX;
    private boolean mY;
    private boolean mZ;
    private boolean my;
    private BroadcastReceiver na;
    private final HashSet nb;

    public af(Context context, ay ay1, fy fy1, View view, gs gs)
    {
        this(ay1, fy1, gs, view, ((ah) (new aj(context, gs))));
    }

    public af(ay ay1, fy fy1, gs gs, View view, ah ah1)
    {
        mH = new Object();
        my = false;
        mV = false;
        mW = new ArrayBlockingQueue(2);
        mX = 0x8000000000000000L;
        nb = new HashSet();
        mK = new WeakReference(fy1);
        mM = new WeakReference(view);
        mL = new WeakReference(null);
        mY = true;
        mN = new ad(UUID.randomUUID().toString(), gs, ay1.op, fy1.vD);
        mP = ah1;
        mR = (WindowManager)view.getContext().getSystemService("window");
        mS = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        mT = (KeyguardManager)view.getContext().getSystemService("keyguard");
        mO = view.getContext().getApplicationContext();
        a(ah1);
        mP.a(new ah.a(view) {

            final View nc;
            final af nd;

            public void aR()
            {
                af.b(nd, true);
                nd.d(nc);
                nd.aI();
            }

            
            {
                nd = af.this;
                nc = view;
                super();
            }
        });
        b(mP);
        try
        {
            ay1 = e(view);
            mW.add(new Runnable(ay1) {

                final af nd;
                final JSONObject ne;

                public void run()
                {
                    nd.a(ne);
                }

            
            {
                nd = af.this;
                ne = jsonobject;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (ay ay1) { }
        mW.add(new Runnable() {

            final af nd;

            public void run()
            {
                nd.g(false);
            }

            
            {
                nd = af.this;
                super();
            }
        });
        gr.S((new StringBuilder()).append("Tracking ad unit: ").append(mN.aH()).toString());
    }

    static ad b(af af1)
    {
        return af1.mN;
    }

    static boolean b(af af1, boolean flag)
    {
        af1.mQ = flag;
        return flag;
    }

    protected int a(int i, DisplayMetrics displaymetrics)
    {
        float f1 = displaymetrics.density;
        return (int)((float)i / f1);
    }

    protected void a(View view, Map map)
    {
        g(false);
    }

    public void a(ac ac1)
    {
        nb.add(ac1);
    }

    public void a(ag ag1)
    {
        synchronized (mH)
        {
            mU = ag1;
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
            mP.a("AFMA_updateActiveView", jsonobject1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            gr.b("Skipping active view message.", jsonobject);
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
        if (!TextUtils.isEmpty(map) && map.equals(mN.aH()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    protected void aI()
    {
label0:
        {
            synchronized (mH)
            {
                if (na == null)
                {
                    break label0;
                }
            }
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        na = new BroadcastReceiver() {

            final af nd;

            public void onReceive(Context context, Intent intent)
            {
                nd.g(false);
            }

            
            {
                nd = af.this;
                super();
            }
        };
        mO.registerReceiver(na, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void aJ()
    {
        synchronized (mH)
        {
            if (na != null)
            {
                mO.unregisterReceiver(na);
                na = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void aK()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (!mY) goto _L2; else goto _L1
_L1:
        mZ = true;
        a(aQ());
_L3:
        gr.S((new StringBuilder()).append("Untracking ad unit: ").append(mN.aH()).toString());
_L2:
        return;
        Object obj1;
        obj1;
        gr.b("JSON Failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    protected void aL()
    {
        if (mU != null)
        {
            mU.a(this);
        }
    }

    public boolean aM()
    {
        boolean flag;
        synchronized (mH)
        {
            flag = mY;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void aN()
    {
        Object obj = (View)mM.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)mL.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                mL = new WeakReference(obj);
                ((ViewTreeObserver) (obj)).addOnScrollChangedListener(this);
                ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(this);
                return;
            }
        }
    }

    protected void aO()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)mL.get();
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

    protected JSONObject aP()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", mN.aF()).put("activeViewJSON", mN.aG()).put("timestamp", ga.dc().dd().elapsedRealtime()).put("adFormat", mN.aE()).put("hashCode", mN.aH());
        return jsonobject;
    }

    protected JSONObject aQ()
        throws JSONException
    {
        JSONObject jsonobject = aP();
        jsonobject.put("doneReasonCode", "u");
        return jsonobject;
    }

    protected void b(ah ah1)
    {
        ah1.a("/updateActiveView", new cd() {

            final af nd;

            public void a(gu gu, Map map)
            {
                if (!nd.a(map))
                {
                    return;
                } else
                {
                    nd.a(gu, map);
                    return;
                }
            }

            
            {
                nd = af.this;
                super();
            }
        });
        ah1.a("/untrackActiveViewUnit", new cd() {

            final af nd;

            public void a(gu gu, Map map)
            {
                if (!nd.a(map))
                {
                    return;
                } else
                {
                    gr.S((new StringBuilder()).append("Received request to untrack: ").append(af.b(nd).aH()).toString());
                    nd.destroy();
                    return;
                }
            }

            
            {
                nd = af.this;
                super();
            }
        });
        ah1.a("/visibilityChanged", new cd() {

            final af nd;

            public void a(gu gu, Map map)
            {
                while (!nd.a(map) || !map.containsKey("isVisible")) 
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
                nd.f(Boolean.valueOf(flag).booleanValue());
            }

            
            {
                nd = af.this;
                super();
            }
        });
        ah1.a("/viewabilityChanged", cc.pQ);
    }

    protected void d(View view)
    {
        view = new ArrayList();
        mW.drainTo(view);
        for (view = view.iterator(); view.hasNext(); ((Runnable)view.next()).run()) { }
    }

    protected void destroy()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        aO();
        aJ();
        mY = false;
        Exception exception;
        try
        {
            mP.destroy();
        }
        catch (Throwable throwable) { }
        aL();
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
        JSONObject jsonobject = aP();
        DisplayMetrics displaymetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = ai1[0];
        rect.top = ai1[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect1 = new Rect();
        rect1.right = mR.getDefaultDisplay().getWidth();
        rect1.bottom = mR.getDefaultDisplay().getHeight();
        Rect rect2 = new Rect();
        boolean flag = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean flag1 = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        jsonobject.put("viewBox", (new JSONObject()).put("top", a(rect1.top, displaymetrics)).put("bottom", a(rect1.bottom, displaymetrics)).put("left", a(rect1.left, displaymetrics)).put("right", a(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", a(rect.top, displaymetrics)).put("bottom", a(rect.bottom, displaymetrics)).put("left", a(rect.left, displaymetrics)).put("right", a(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", a(rect2.top, displaymetrics)).put("bottom", a(rect2.bottom, displaymetrics)).put("left", a(rect2.left, displaymetrics)).put("right", a(rect2.right, displaymetrics))).put("globalVisibleBoxVisible", flag).put("localVisibleBox", (new JSONObject()).put("top", a(rect3.top, displaymetrics)).put("bottom", a(rect3.bottom, displaymetrics)).put("left", a(rect3.left, displaymetrics)).put("right", a(rect3.right, displaymetrics))).put("localVisibleBoxVisible", flag1).put("hitBox", (new JSONObject()).put("top", a(rect4.top, displaymetrics)).put("bottom", a(rect4.bottom, displaymetrics)).put("left", a(rect4.left, displaymetrics)).put("right", a(rect4.right, displaymetrics))).put("windowVisibility", view.getWindowVisibility()).put("screenDensity", displaymetrics.density).put("isVisible", f(view)).put("isStopped", mV).put("isPaused", my);
        if (ll.im())
        {
            jsonobject.put("isAttachedToWindow", view.isAttachedToWindow());
        }
        return jsonobject;
    }

    protected void f(boolean flag)
    {
        for (Iterator iterator = nb.iterator(); iterator.hasNext(); ((ac)iterator.next()).a(this, flag)) { }
    }

    protected boolean f(View view)
    {
        return view.getVisibility() == 0 && view.isShown() && mS.isScreenOn() && !mT.inKeyguardRestrictedInputMode();
    }

    protected void g(boolean flag)
    {
label0:
        {
            synchronized (mH)
            {
                if (mQ && mY)
                {
                    break label0;
                }
            }
            return;
        }
        long l = ga.dc().dd().elapsedRealtime();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (mX + 200L <= l)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        fy fy1;
        View view;
        mX = l;
        fy1 = (fy)mK.get();
        view = (View)mM.get();
        JSONException jsonexception;
        boolean flag1;
        if (view != null && fy1 != null)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        aK();
        obj;
        JVM INSTR monitorexit ;
        return;
        a(e(view));
_L1:
        aN();
        aL();
        obj;
        JVM INSTR monitorexit ;
        return;
        jsonexception;
        gr.a("Active view update failed.", jsonexception);
          goto _L1
    }

    public void onGlobalLayout()
    {
        g(false);
    }

    public void onScrollChanged()
    {
        g(true);
    }

    public void pause()
    {
        synchronized (mH)
        {
            my = true;
            g(false);
            mP.pause();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resume()
    {
        synchronized (mH)
        {
            mP.resume();
            my = false;
            g(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        synchronized (mH)
        {
            mV = true;
            g(false);
            mP.pause();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
