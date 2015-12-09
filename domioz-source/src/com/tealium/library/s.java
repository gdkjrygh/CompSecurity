// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

// Referenced classes of package com.tealium.library:
//            u, d

final class s
{

    private final SharedPreferences a;
    private final AtomicReference b;
    private final AtomicLong c = new AtomicLong(0L);
    private volatile boolean d;
    private volatile boolean e;
    private volatile boolean f;
    private volatile boolean g;
    private volatile boolean h;
    private AtomicReference i;
    private boolean j;
    private boolean k;
    private boolean l;
    private long m;
    private int n;
    private int o;
    private int p;
    private Date q;

    s(SharedPreferences sharedpreferences)
    {
        b = new AtomicReference(H.a.a);
        d = false;
        i = new AtomicReference();
        a = sharedpreferences;
        long l1 = sharedpreferences.getLong("published_at", 0L);
        if (l1 != 0L)
        {
            q = new Date(l1);
        }
        h = sharedpreferences.getBoolean("config_loaded", false);
        try
        {
            b(new JSONObject(sharedpreferences.getString("mps", "{}")));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            u.b(sharedpreferences);
        }
    }

    public static JSONObject a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            throw new IllegalArgumentException("loadedJSON must not be null.");
        } else
        {
            return jsonobject.optJSONObject("4");
        }
    }

    final long a()
    {
        return c.get();
    }

    final void a(int i1)
    {
        o = i1;
    }

    final void a(long l1)
    {
        c.set(l1);
    }

    final void a(H.a a1)
    {
        b.set(a1);
    }

    final void a(String s1)
    {
        i.set(s1);
    }

    final void a(boolean flag)
    {
        h = true;
    }

    final H.a b()
    {
        return (H.a)b.get();
    }

    final void b(JSONObject jsonobject)
    {
        e = true;
        j = true;
        m = -1L;
        o = 1;
        k = false;
        f = false;
        p = -1;
        g = true;
        l = false;
        if (jsonobject == null)
        {
            throw new IllegalArgumentException("config must not be null.");
        }
        if (!jsonobject.optBoolean("_is_enabled", true))
        {
            throw new a();
        }
        if (jsonobject.has("battery_saver"))
        {
            j = jsonobject.getBoolean("battery_saver");
        }
        if (jsonobject.has("dispatch_expiration"))
        {
            int i1 = jsonobject.getInt("dispatch_expiration");
            if (i1 != -1)
            {
                m = 0x5265c00L * (long)i1;
            } else
            {
                m = -1L;
            }
            n = i1;
        }
        if (jsonobject.has("event_batch_size"))
        {
            o = jsonobject.getInt("event_batch_size");
        }
        if (jsonobject.has("ivar_tracking"))
        {
            k = jsonobject.getBoolean("ivar_tracking");
        }
        if (jsonobject.has("mobile_companion"))
        {
            f = jsonobject.getBoolean("mobile_companion");
        }
        if (jsonobject.has("offline_dispatch_limit"))
        {
            p = jsonobject.getInt("offline_dispatch_limit");
        }
        if (jsonobject.has("ui_auto_tracking"))
        {
            g = jsonobject.getBoolean("ui_auto_tracking");
            if (!g)
            {
                com.tealium.library.d.f();
            }
        }
        if (jsonobject.has("wifi_only_sending"))
        {
            l = jsonobject.getBoolean("wifi_only_sending");
        }
        a.edit().putString("mps", jsonobject.toString()).apply();
    }

    final void b(boolean flag)
    {
        d = flag;
    }

    final boolean b(long l1)
    {
        if (l1 > 0L)
        {
            q = new Date(l1);
            a.edit().putLong("published_at", l1).apply();
            return true;
        } else
        {
            return false;
        }
    }

    final void c(boolean flag)
    {
        k = flag;
    }

    final boolean c()
    {
        return j;
    }

    final void d(boolean flag)
    {
        e = flag;
    }

    final boolean d()
    {
        return k;
    }

    final void e(boolean flag)
    {
        f = flag;
    }

    final boolean e()
    {
        return l;
    }

    final boolean f()
    {
        return d;
    }

    final boolean g()
    {
        return h;
    }

    final String h()
    {
        return (String)i.get();
    }

    final int i()
    {
        return p;
    }

    final long j()
    {
        if (m == -1L)
        {
            return -1L;
        } else
        {
            return System.currentTimeMillis() - m;
        }
    }

    final int k()
    {
        return o;
    }

    public final String toString()
    {
        String s1 = (String)i.get();
        Locale locale = Locale.ROOT;
        if (s1 == null)
        {
            s1 = "null";
        } else
        {
            s1 = (new StringBuilder("\"")).append(s1).append('"').toString();
        }
        return String.format(locale, "LibState Configuration : {\r\n\t       \"activeTraceId\" : %s,\r\n\t  \"dispatchExpiration\" : %d,\r\n\t      \"eventBatchSize\" : %d,\r\n\t      \"expirationDays\" : %d,\r\n\t\"isBatterySaverModeOn\" : %b,\r\n\t    \"isIvarTrackingOn\" : %b,\r\n\t \"isMobileCompanionOn\" : %b,\r\n\t \"isOnlySendingOnWifi\" : %b,\r\n\t    \"isUIAutoTracking\" : %b,\r\n\t\"offlineDispatchLimit\" : %d,\r\n\t           \"published\" : \"%s\"\r\n}", new Object[] {
            s1, Long.valueOf(m), Integer.valueOf(o), Integer.valueOf(n), Boolean.valueOf(j), Boolean.valueOf(k), Boolean.valueOf(f), Boolean.valueOf(l), Boolean.valueOf(g), Integer.valueOf(p), 
            q
        });
    }

    private class a extends Exception
    {

        a()
        {
        }
    }

}
