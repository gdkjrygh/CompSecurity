// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.util.Log;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.tealium.library:
//            g, i, b, C, 
//            G

final class u
    implements g, i
{

    private static AtomicReference a;

    u()
    {
    }

    static Tealium.LogLevel a()
    {
        return (Tealium.LogLevel)a.get();
    }

    static void a(Tealium.LogLevel loglevel)
    {
        a.set(loglevel);
    }

    static void a(String s)
    {
        if (((Tealium.LogLevel)a.get()).a() == Tealium.LogLevel.a.a())
        {
            Log.v(b.b, s);
        }
    }

    private static void a(String s, C c1)
    {
        String s1 = (String)c1.get("call_type");
        if (((Tealium.LogLevel)a.get()).equals(Tealium.LogLevel.a))
        {
            TreeMap treemap = new TreeMap();
            c1.b(treemap);
            Log.v(b.b, String.format(Locale.ROOT, "%s %s : %s", new Object[] {
                s, s1, G.a(treemap)
            }));
        } else
        if (((Tealium.LogLevel)a.get()).equals(Tealium.LogLevel.b))
        {
            TreeMap treemap1 = new TreeMap();
            if (c1.has("object_class"))
            {
                treemap1.put("object_class", (String)c1.get("object_class"));
            }
            if (c1.has("tealium_id"))
            {
                treemap1.put("tealium_id", (String)c1.get("tealium_id"));
            }
            if (c1.has("link_id"))
            {
                treemap1.put("link_id", (String)c1.get("link_id"));
            }
            if (c1.has("screen_title"))
            {
                treemap1.put("screen_title", (String)c1.get("screen_title"));
            }
            if (c1.has("timestamp_unix"))
            {
                treemap1.put("timestamp_unix", (String)c1.get("timestamp_unix"));
            }
            Log.v(b.b, String.format(Locale.ROOT, "%s %s : %s", new Object[] {
                s, s1, G.a(treemap1)
            }));
            return;
        }
    }

    static void a(Throwable throwable)
    {
        if (((Tealium.LogLevel)a.get()).a() <= Tealium.LogLevel.e.a())
        {
            Log.e(b.b, null, throwable);
        }
    }

    static void b(String s)
    {
        if (((Tealium.LogLevel)a.get()).a() <= Tealium.LogLevel.b.a())
        {
            Log.d(b.b, s);
        }
    }

    static void b(Throwable throwable)
    {
        if (((Tealium.LogLevel)a.get()).a() <= Tealium.LogLevel.f.a())
        {
            Log.wtf(b.b, throwable);
        }
    }

    static void c(String s)
    {
        if (((Tealium.LogLevel)a.get()).a() <= Tealium.LogLevel.c.a())
        {
            Log.i(b.b, s);
        }
    }

    static void d(String s)
    {
        if (((Tealium.LogLevel)a.get()).a() <= Tealium.LogLevel.d.a())
        {
            Log.w(b.b, s);
        }
    }

    static void e(String s)
    {
        if (((Tealium.LogLevel)a.get()).a() <= Tealium.LogLevel.e.a())
        {
            Log.e(b.b, s);
        }
    }

    public final void a(C c1)
    {
        a("Queued", c1);
    }

    public final void b(C c1)
    {
        a("Sent", c1);
    }

    static 
    {
        a = new AtomicReference(Tealium.LogLevel.d);
    }
}
