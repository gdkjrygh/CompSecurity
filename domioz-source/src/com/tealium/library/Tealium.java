// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.app.Activity;
import android.content.SharedPreferences;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.tealium.library:
//            u, d, C, G, 
//            RemoteCommand

public final class Tealium
{

    private static final Map a = Collections.synchronizedMap(new WeakHashMap());
    private static final AtomicReference b = new AtomicReference();

    private Tealium()
    {
    }

    static AtomicReference a()
    {
        return b;
    }

    public static void addRemoteCommand(RemoteCommand remotecommand)
    {
        if (remotecommand == null)
        {
            u.a(new IllegalArgumentException("null RemoteCommand provided; this call will have no effect."));
            return;
        } else
        {
            d.a(remotecommand);
            return;
        }
    }

    public static void disable()
    {
        d.e();
    }

    public static void enable()
    {
        d.d();
    }

    public static Map getCustomData(Object obj)
    {
        Map map1;
        if (obj == null)
        {
            map1 = null;
        } else
        {
            Map map3 = (Map)a.get(obj);
            map1 = map3;
            if (map3 == null)
            {
                Map map2 = Collections.synchronizedMap(new HashMap());
                a.put(obj, map2);
                return map2;
            }
        }
        return map1;
    }

    public static SharedPreferences getGlobalCustomData()
    {
        return (SharedPreferences)b.get();
    }

    public static void initialize(Config config)
    {
        d.a(config);
    }

    public static boolean isActivated()
    {
        return d.c();
    }

    public static transient Map map(String as[])
    {
        if (as == null || as.length % 2 == 1)
        {
            u.a(new IllegalArgumentException("The number of arguments must be even."));
            return new HashMap();
        }
        HashMap hashmap = new HashMap(as.length / 2);
        for (int i = 0; i < as.length; i += 2)
        {
            if (as[i] != null)
            {
                hashmap.put(as[i], as[i + 1]);
            }
        }

        return hashmap;
    }

    public static void onPause(Activity activity)
    {
        if (activity == null)
        {
            u.a(new IllegalArgumentException("Called Tealium.onPause(Activity) with a null Activity, this call will have no effect."));
        } else
        if (!d.b())
        {
            d.a(activity);
            return;
        }
    }

    public static void onResume(Activity activity)
    {
        if (activity == null)
        {
            u.a(new IllegalArgumentException("Called Tealium.onResume(Activity) with a null Activity, this call will have no effect."));
        } else
        if (!d.b())
        {
            d.b(activity);
            return;
        }
    }

    public static void removeRemoteCommand(RemoteCommand remotecommand)
    {
        if (remotecommand == null)
        {
            u.a(new IllegalArgumentException("null RemoteCommand provided; this call will have no effect."));
            return;
        } else
        {
            d.b(remotecommand);
            return;
        }
    }

    public static void track(Object obj, Map map1, String s)
    {
        map1 = new C(map1);
        if ((obj instanceof WebView) && G.a())
        {
            map1.c("url", ((WebView)obj).getUrl());
        }
        d.a(obj, map1, s);
        d.a(map1);
    }

}
