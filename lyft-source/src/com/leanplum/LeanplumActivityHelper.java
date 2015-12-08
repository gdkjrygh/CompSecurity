// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import com.leanplum.annotations.Parser;
import com.leanplum.callbacks.VariablesChangedCallback;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.leanplum:
//            Leanplum, c, ag, O, 
//            LeanplumResources, LeanplumInflater

public class LeanplumActivityHelper
{

    static boolean a = false;
    static Activity b;
    private static boolean c;
    private static Queue g = new LinkedList();
    private Activity d;
    private LeanplumResources e;
    private LeanplumInflater f;

    public LeanplumActivityHelper(Activity activity)
    {
        d = activity;
        Leanplum.setApplicationContext(activity.getApplicationContext());
        Parser.parseVariables(new Object[] {
            activity
        });
    }

    static void a(Activity activity)
    {
        e(activity);
    }

    static void b(Activity activity)
    {
        d(activity);
    }

    static void c(Activity activity)
    {
        a = true;
    }

    private static void d(Activity activity)
    {
        a = false;
        b = activity;
        if (Leanplum.b || Leanplum.c)
        {
            Leanplum.c();
            activity = com.leanplum.c.b();
            if (activity != null)
            {
                activity.updateGeofencing();
            }
        }
        LinkedList linkedlist;
        synchronized (g)
        {
            linkedlist = new LinkedList(g);
            g.clear();
        }
        activity = linkedlist.iterator();
        do
        {
            if (!activity.hasNext())
            {
                return;
            }
            ((VariablesChangedCallback)activity.next()).variablesChanged();
        } while (true);
    }

    private static void e(Activity activity)
    {
        if (a)
        {
            Leanplum.b();
            ag ag1 = com.leanplum.c.b();
            if (ag1 != null)
            {
                ag1.updateGeofencing();
            }
        }
        if (b == activity)
        {
            b = null;
        }
    }

    public static void enableLifecycleCallbacks(Application application)
    {
        Leanplum.setApplicationContext(application.getApplicationContext());
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return;
        } else
        {
            application.registerActivityLifecycleCallbacks(new O());
            c = true;
            return;
        }
    }

    public static Activity getCurrentActivity()
    {
        return b;
    }

    public static void queueActionUponActive(VariablesChangedCallback variableschangedcallback)
    {
        if (b != null && !b.isFinishing() && !a)
        {
            variableschangedcallback.variablesChanged();
            return;
        }
        synchronized (g)
        {
            g.add(variableschangedcallback);
        }
    }

    public LeanplumResources getLeanplumResources()
    {
        return getLeanplumResources(null);
    }

    public LeanplumResources getLeanplumResources(Resources resources)
    {
        if (e != null)
        {
            return e;
        }
        if (resources == null)
        {
            resources = d.getResources();
        }
        if (resources instanceof LeanplumResources)
        {
            return (LeanplumResources)resources;
        } else
        {
            e = new LeanplumResources(resources);
            return e;
        }
    }

    public void onPause()
    {
        if (!c)
        {
            Activity activity = d;
            a = true;
        }
    }

    public void onResume()
    {
        if (!c)
        {
            d(d);
        }
    }

    public void onStop()
    {
        if (!c)
        {
            e(d);
        }
    }

    public void setContentView(int i)
    {
        if (f == null)
        {
            f = LeanplumInflater.from(d);
        }
        d.setContentView(f.inflate(i));
    }

}
