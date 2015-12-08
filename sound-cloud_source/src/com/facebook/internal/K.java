// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.util.Log;
import com.facebook.G;
import com.facebook.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.internal:
//            Y

public final class K
{

    private static final HashMap a = new HashMap();
    private final G b;
    private final String c;
    private StringBuilder d;
    private int e;

    public K(G g, String s1)
    {
        e = 3;
        Y.a(s1, "tag");
        b = g;
        c = (new StringBuilder("FacebookSDK.")).append(s1).toString();
        d = new StringBuilder();
    }

    public static void a(G g, int i, String s1, String s2)
    {
        if (s.a(g))
        {
            String s3 = c(s2);
            s2 = s1;
            if (!s1.startsWith("FacebookSDK."))
            {
                s2 = (new StringBuilder("FacebookSDK.")).append(s1).toString();
            }
            Log.println(i, s2, s3);
            if (g == G.f)
            {
                (new Exception()).printStackTrace();
            }
        }
    }

    public static void a(G g, String s1, String s2)
    {
        a(g, 3, s1, s2);
    }

    public static transient void a(G g, String s1, String s2, Object aobj[])
    {
        if (s.a(g))
        {
            a(g, 3, s1, String.format(s2, aobj));
        }
    }

    public static void a(String s1)
    {
        com/facebook/internal/K;
        JVM INSTR monitorenter ;
        if (!s.a(G.b))
        {
            a(s1, "ACCESS_TOKEN_REMOVED");
        }
        com/facebook/internal/K;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    private static void a(String s1, String s2)
    {
        com/facebook/internal/K;
        JVM INSTR monitorenter ;
        a.put(s1, s2);
        com/facebook/internal/K;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    private static String c(String s1)
    {
        com/facebook/internal/K;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            s1 = s1.replace((CharSequence)entry.getKey(), (CharSequence)entry.getValue());
        }

        com/facebook/internal/K;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        throw s1;
    }

    public final void a()
    {
        String s1 = d.toString();
        a(b, e, c, s1);
        d = new StringBuilder();
    }

    public final void a(String s1, Object obj)
    {
        if (s.a(b))
        {
            d.append(String.format("  %s:\t%s\n", new Object[] {
                s1, obj
            }));
        }
    }

    public final void b(String s1)
    {
        if (s.a(b))
        {
            d.append(s1);
        }
    }

}
