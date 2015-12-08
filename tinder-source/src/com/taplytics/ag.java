// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, bd, z, gs

final class ag
    implements Runnable
{

    final Map a;
    final Object b;
    final z c;

    ag(z z1, Map map, Object obj)
    {
        c = z1;
        a = map;
        b = obj;
        super();
    }

    public final void run()
    {
        Object obj = ci.b().t;
        if (obj != null && a != null && a.size() != 0 && ((bd) (obj)).q != null)
        {
            obj = ((bd) (obj)).q;
            if (c.h && z.g() && ((JSONObject) (obj)).optBoolean("amplitude", false))
            {
                Map map = a;
                Class class1;
                Object obj2;
                try
                {
                    Object obj1 = Class.forName("com.amplitude.api.Amplitude");
                    obj1 = ((Class) (obj1)).getMethod("getInstance", new Class[0]).invoke(obj1, new Object[0]);
                    obj1.getClass().getMethod("logEvent", new Class[] {
                        java/lang/String, org/json/JSONObject
                    }).invoke(obj1, new Object[] {
                        "TL_experiments", new JSONObject(map)
                    });
                }
                catch (Exception exception)
                {
                    if (gs.b())
                    {
                        gs.a((new StringBuilder("Logging experiment data to Amplitude failed: ")).append(exception.getMessage()).toString());
                    }
                }
            }
            if (c.e && z.d().booleanValue() && ((JSONObject) (obj)).optBoolean("adobe", false))
            {
                map = a;
                try
                {
                    class1 = Class.forName("com.adobe.mobile.Analytics");
                    class1.getMethod("trackAction", new Class[] {
                        java/lang/String, java/util/Map
                    }).invoke(class1, new Object[] {
                        "TL_experiments", map
                    });
                }
                catch (Exception exception1)
                {
                    if (gs.b())
                    {
                        gs.a((new StringBuilder("Logging experiment data to Adobe failed: ")).append(exception1.getMessage()).toString());
                    }
                }
            }
            if (c.g && z.f() && ((JSONObject) (obj)).optBoolean("localytics", false))
            {
                map = a;
                try
                {
                    class1 = Class.forName("com.localytics.android.Localytics");
                    class1.getMethod("tagEvent", new Class[] {
                        java/lang/String, java/util/Map
                    }).invoke(class1, new Object[] {
                        "TL_experiments", map
                    });
                }
                catch (Exception exception2)
                {
                    if (gs.b())
                    {
                        gs.a((new StringBuilder("Logging experiment data to localytics failed: ")).append(exception2.getMessage()).toString());
                    }
                }
            }
            if (c.d && z.c() && ((JSONObject) (obj)).optBoolean("flurry", false))
            {
                map = a;
                try
                {
                    class1 = Class.forName("com.flurry.android.FlurryAgent");
                    class1.getMethod("logEvent", new Class[] {
                        java/lang/String, java/util/Map
                    }).invoke(class1, new Object[] {
                        "TL_experiments", map
                    });
                }
                catch (Exception exception3)
                {
                    if (gs.b())
                    {
                        gs.a((new StringBuilder("Logging experiment data to flurry failed: ")).append(exception3.getMessage()).toString());
                    }
                }
            }
            if (c.c && z.b() && ((JSONObject) (obj)).optBoolean("mixpanel", false))
            {
                map = a;
                try
                {
                    class1 = Class.forName("com.mixpanel.android.mpmetrics.MixpanelAPI");
                    obj2 = class1.getDeclaredField("sInstanceMap");
                    ((Field) (obj2)).setAccessible(true);
                    obj2 = (String)((Map)((Field) (obj2)).get(null)).keySet().toArray()[0];
                    obj2 = class1.getMethod("getInstance", new Class[] {
                        android/content/Context, java/lang/String
                    }).invoke(null, new Object[] {
                        ci.b().u, obj2
                    });
                    class1.getMethod("registerSuperProperties", new Class[] {
                        org/json/JSONObject
                    }).invoke(obj2, new Object[] {
                        new JSONObject(map)
                    });
                }
                catch (Exception exception4)
                {
                    if (gs.b())
                    {
                        gs.a((new StringBuilder("Mixpanel registering super properties failed: ")).append(exception4.getMessage()).toString());
                    }
                }
            }
            if (c.f && z.e() && ((JSONObject) (obj)).optBoolean("googleAnalytics", false))
            {
                z.a(a, b);
            }
        }
    }
}
