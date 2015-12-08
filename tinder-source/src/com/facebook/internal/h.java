// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.internal:
//            n

public final class h
{

    private static final HashMap a = new HashMap();
    private final LoggingBehavior b;
    private final String c;
    private StringBuilder d;
    private int e;

    public h(LoggingBehavior loggingbehavior, String s)
    {
        e = 3;
        n.a(s, "tag");
        b = loggingbehavior;
        c = (new StringBuilder("FacebookSDK.")).append(s).toString();
        d = new StringBuilder();
    }

    public static void a(LoggingBehavior loggingbehavior, int i, String s, String s1)
    {
        if (g.a(loggingbehavior))
        {
            String s2 = c(s1);
            s1 = s;
            if (!s.startsWith("FacebookSDK."))
            {
                s1 = (new StringBuilder("FacebookSDK.")).append(s).toString();
            }
            Log.println(i, s1, s2);
            if (loggingbehavior == LoggingBehavior.f)
            {
                (new Exception()).printStackTrace();
            }
        }
    }

    public static void a(LoggingBehavior loggingbehavior, String s, String s1)
    {
        a(loggingbehavior, 3, s, s1);
    }

    public static transient void a(LoggingBehavior loggingbehavior, String s, String s1, Object aobj[])
    {
        if (g.a(loggingbehavior))
        {
            a(loggingbehavior, 3, s, String.format(s1, aobj));
        }
    }

    public static void a(String s)
    {
        com/facebook/internal/h;
        JVM INSTR monitorenter ;
        if (!g.a(LoggingBehavior.b))
        {
            a(s, "ACCESS_TOKEN_REMOVED");
        }
        com/facebook/internal/h;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private static void a(String s, String s1)
    {
        com/facebook/internal/h;
        JVM INSTR monitorenter ;
        a.put(s, s1);
        com/facebook/internal/h;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static transient void b(LoggingBehavior loggingbehavior, String s, String s1, Object aobj[])
    {
        if (g.a(loggingbehavior))
        {
            a(loggingbehavior, 5, s, String.format(s1, aobj));
        }
    }

    private static String c(String s)
    {
        com/facebook/internal/h;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            s = s.replace((CharSequence)entry.getKey(), (CharSequence)entry.getValue());
        }

        com/facebook/internal/h;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public final void a()
    {
        String s = d.toString();
        a(b, e, c, s);
        d = new StringBuilder();
    }

    public final void a(String s, Object obj)
    {
        if (g.a(b))
        {
            d.append(String.format("  %s:\t%s\n", new Object[] {
                s, obj
            }));
        }
    }

    public final void b(String s)
    {
        if (g.a(b))
        {
            d.append(s);
        }
    }

}
