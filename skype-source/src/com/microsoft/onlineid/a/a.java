// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.a;

import android.content.Context;
import com.google.android.gms.analytics.b;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.g;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.j;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.a:
//            b, d, e, g, 
//            c

public final class a
    implements com.microsoft.onlineid.a.b
{

    private static com.microsoft.onlineid.a.b a;
    private final Context b;
    private final g c;
    private boolean d;

    protected a()
    {
        d = false;
        b = null;
        c = null;
    }

    private a(Context context)
    {
        d = false;
        b = context;
        Object obj = com.google.android.gms.analytics.c.a(context);
        ((c) (obj)).h();
        c = ((c) (obj)).a("UA-50206275-2");
        c.b("Authenticator");
        c.b();
        obj = new b(c, Thread.getDefaultUncaughtExceptionHandler(), context);
        ((b) (obj)).a(new com.microsoft.onlineid.a.d(context));
        Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (obj)));
        c.a("&cd1", j.b(context));
    }

    public static com.microsoft.onlineid.a.b a()
    {
        com/microsoft/onlineid/a/a;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        Object obj = new com.microsoft.onlineid.a.e();
_L4:
        com/microsoft/onlineid/a/a;
        JVM INSTR monitorexit ;
        return ((com.microsoft.onlineid.a.b) (obj));
_L2:
        obj = a;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(Context context)
    {
        com/microsoft/onlineid/a/a;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        if (!"com.microsoft.msa.authenticator".equals(context.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_38;
        }
        context = new a(context);
_L3:
        a = context;
_L2:
        com/microsoft/onlineid/a/a;
        JVM INSTR monitorexit ;
        return;
        context = new com.microsoft.onlineid.a.e();
          goto _L3
        context;
        throw context;
    }

    private com.microsoft.onlineid.a.b b(Map map)
    {
        c.a(map);
        return this;
    }

    public final com.microsoft.onlineid.a.b a(long l)
    {
        if (!d)
        {
            com.google.android.gms.analytics.d.f f = (new com.google.android.gms.analytics.d.f()).b("Clock skew").a("Clock skew adjusted");
            String s;
            if (l < 0L)
            {
                s = "Server ahead";
            } else
            {
                s = "Client ahead";
            }
            b(f.c(s).a(Math.abs(l)).a());
            d = true;
        }
        return this;
    }

    public final com.microsoft.onlineid.a.b a(String s)
    {
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e.a(flag);
        c.a(s);
        b((new com.google.android.gms.analytics.d.a()).a());
        return this;
    }

    public final com.microsoft.onlineid.a.b a(String s, String s1)
    {
        return a(s, s1, null, null);
    }

    public final com.microsoft.onlineid.a.b a(String s, String s1, String s2)
    {
        return a(s, s1, s2, null);
    }

    public final com.microsoft.onlineid.a.b a(String s, String s1, String s2, Long long1)
    {
        if (s == null || s1 == null)
        {
            com.microsoft.onlineid.internal.c.d.c("At least category and action must be specified to log an event.");
            e.a(false);
            return this;
        }
        com.google.android.gms.analytics.d.b b1 = new com.google.android.gms.analytics.d.b();
        b1.a(s);
        b1.b(s1);
        if (s2 != null)
        {
            b1.c(s2);
        }
        if (long1 != null)
        {
            b1.a("&ev", Long.toString(long1.longValue()));
        }
        b(b1.a());
        return this;
    }

    public final com.microsoft.onlineid.a.b a(Throwable throwable)
    {
        boolean flag;
        if (throwable != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e.a(flag);
        throwable = (new com.microsoft.onlineid.a.d(b)).a(Thread.currentThread().getName(), throwable);
        b((new com.google.android.gms.analytics.d.c()).a(throwable).a(false).a());
        return this;
    }

    public final com.microsoft.onlineid.a.b a(Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        java.util.Map.Entry entry;
        String s;
        for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append(s).append('(').append((String)entry.getKey()).append(')'))
        {
            entry = (java.util.Map.Entry)map.next();
            s = com.microsoft.onlineid.sts.e.a((byte[])entry.getValue());
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
        }

        b((new com.google.android.gms.analytics.d.b()).a("Application certificates").b("Available certificates").c(stringbuilder.toString()).a());
        return this;
    }

    public final com.microsoft.onlineid.a.c b(String s, String s1, String s2)
    {
        return new com.microsoft.onlineid.a.g(c, s, s1, s2);
    }
}
