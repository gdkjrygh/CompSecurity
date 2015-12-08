// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.taplytics:
//            hq, ci, gs, shelduck, 
//            hi, j, e, bp, 
//            cv, wallaby, f, em, 
//            hk, dc, di, cw

public final class d
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private hq a;
    private hq b;
    private ArrayList c;

    public d()
    {
        a = new hq();
        b = new hq();
        c = new ArrayList();
    }

    public static d a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && (context.getApplicationContext() instanceof Application))
        {
            context = (Application)context.getApplicationContext();
            d d1 = new d();
            context.registerActivityLifecycleCallbacks(d1);
            ci.b().h = true;
            return d1;
        } else
        {
            return null;
        }
    }

    public static void a(d d1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            Context context = ci.b().u;
            if (context != null)
            {
                ((Application)context.getApplicationContext()).unregisterActivityLifecycleCallbacks(d1);
                ci.b().h = false;
            }
        }
    }

    static ArrayList b(d d1)
    {
        return d1.c;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
        try
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("Activity has been created: ")).append(activity.getClass().getSimpleName()).toString());
            }
            ci.b().d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.b("Activity null", activity);
        }
    }

    public final void onActivityDestroyed(Activity activity)
    {
        try
        {
            String s = activity.getClass().getSimpleName();
            if (gs.b())
            {
                gs.a((new StringBuilder("Activity has been destroyed: ")).append(s).toString());
            }
            if (ci.b().v.equals(activity) && !hi.a(shelduck.a))
            {
                a.a();
                ci.b().d.a("appTerminate", null, null);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.b("Problem destroying activity: ", activity);
        }
    }

    public final void onActivityPaused(Activity activity)
    {
        try
        {
            if (gs.b())
            {
                gs.a("Activity Paused");
            }
            a = new hq();
            a.a(new e(this));
            bp.a().c();
            if (ci.b().v != null && ci.b().v == activity)
            {
                ci.b().a(false);
            }
            a.a(800);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.b("Error pausing: ", activity);
        }
    }

    public final void onActivityResumed(Activity activity)
    {
        int i = 1;
        if (gs.b())
        {
            gs.a((new StringBuilder("Activity Resumed: ")).append(activity.getClass().getSimpleName()).toString());
        }
        if (ci.b().v != null && ci.b().v == activity)
        {
            ci.b().a(true);
        }
        a.a();
        if (ci.b().g)
        {
            cv.a().b();
        }
        ci.b().b(activity);
        if (!ci.b().k || !ci.b().l || !ci.b().g || !ci.b().j) goto _L2; else goto _L1
_L1:
        if (c.isEmpty() || b.c()) goto _L4; else goto _L3
_L3:
        if (b.a != wallaby.b)
        {
            i = 0;
        }
          goto _L5
_L7:
        i = ((Integer)c.get(c.size() - 1)).intValue();
        k = activity.getResources().getConfiguration().orientation;
        if (k == i) goto _L2; else goto _L6
_L6:
        c.add(Integer.valueOf(k));
        if (c.size() > 3)
        {
            bp.a().b();
            b.a();
            return;
        }
          goto _L2
_L4:
        int k;
        try
        {
            c.clear();
            c.add(Integer.valueOf(activity.getResources().getConfiguration().orientation));
            b = new hq();
            b.a(new f(this));
            b.a(30000);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.b("Error resuming", activity);
        }
        return;
_L5:
        if (i == 0) goto _L7; else goto _L4
_L2:
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
        Object obj;
        obj = activity.getClass().getSimpleName();
        if (gs.b())
        {
            gs.a((new StringBuilder("Activity Started: ")).append(((String) (obj))).toString());
        }
        if (!hi.a(shelduck.a))
        {
            ci.b().d.a("viewAppeared", obj, null);
            j j1 = ci.b().d;
            j.a().put(obj, Long.valueOf(System.currentTimeMillis()));
        }
        ci.b().a(activity);
        ci.b().b(activity);
        if (ci.b().g && !em.a().a)
        {
            em.a().a(null);
        }
        obj = cv.a();
        activity = (ViewGroup)activity.findViewById(0x1020002).getRootView();
        obj.j = activity;
        hk.a(activity, false, new AtomicBoolean(false));
        boolean flag;
        if (ci.b().v != null && !ci.b().v.getIntent().getBooleanExtra("TLRefreshed", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            obj.l = flag;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.b("error starting activity", activity);
            return;
        }
        if (ci.b().t == null) goto _L2; else goto _L1
_L1:
        ((cv) (obj)).b();
_L4:
        ((cv) (obj)).j.post(new dc(((cv) (obj))));
_L5:
        if (!((cv) (obj)).a)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        ((cv) (obj)).d();
_L6:
        if (ci.b().v != null && ci.b().l)
        {
            ci.b().v.runOnUiThread(new di(((cv) (obj))));
        }
        return;
_L2:
        if (ci.b().s.a == wallaby.a) goto _L4; else goto _L3
_L3:
        ci.b().s.a(new cw(((cv) (obj))));
          goto _L4
        activity;
        gs.b("setcurrentviewgroup err", activity);
          goto _L5
        ((cv) (obj)).f();
          goto _L6
    }

    public final void onActivityStopped(Activity activity)
    {
        try
        {
            activity = activity.getClass().getSimpleName();
            if (gs.b())
            {
                gs.a((new StringBuilder("App Activity Stopped: ")).append(activity).toString());
            }
            if (!hi.a(shelduck.a))
            {
                ci.b().d.a("viewDisappeared", activity, null);
                j.a(activity);
            }
            cv.a().i = null;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.b("Error stopping activity: ", activity);
        }
    }
}
