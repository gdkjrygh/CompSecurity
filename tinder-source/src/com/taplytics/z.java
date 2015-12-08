// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.PendingIntent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.taplytics:
//            b, gs, ai, t

public final class z
{

    private static z o;
    t a;
    ArrayList b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    PendingIntent i;
    Method j;
    Method k;
    Class l;
    Class m;
    Field n[];

    public z()
    {
        b = new ArrayList();
        c = false;
        d = false;
        e = false;
        f = false;
        g = false;
        h = false;
        n = null;
    }

    public static z a()
    {
        if (o == null)
        {
            o = new z();
        }
        return o;
    }

    public static void a(Map map, Object obj)
    {
        if (obj != null)
        {
            try
            {
                obj = new b(obj);
                String s;
                Object obj1;
                for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ((b) (obj)).a("set", new Class[] {
    java/lang/String, java/lang/String
}, new Object[] {
    s, obj1
}))
                {
                    obj1 = (String)iterator.next();
                    s = (new StringBuilder("&")).append(((String) (obj1)).replace(" ", "_")).toString();
                    obj1 = map.get(obj1);
                }

            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                if (gs.b())
                {
                    gs.a((new StringBuilder("Logging experiment data to GA failed: ")).append(map.getMessage()).toString());
                }
            }
        }
    }

    public static boolean b()
    {
        try
        {
            Class.forName("com.mixpanel.android.mpmetrics.MixpanelAPI");
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public static boolean c()
    {
        try
        {
            Class.forName("com.flurry.android.FlurryAgent");
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public static Boolean d()
    {
        try
        {
            Class.forName("com.adobe.mobile.Analytics");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    public static boolean e()
    {
        try
        {
            Class.forName("com.google.android.gms.analytics.a");
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public static boolean f()
    {
        try
        {
            Class.forName("com.localytics.android.AnalyticsListener");
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public static boolean g()
    {
        try
        {
            Class.forName("com.amplitude.api.Amplitude");
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public final void h()
    {
        (new ai(this, (byte)0)).execute(new ArrayList[] {
            b
        });
    }
}
