// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.util.Log;
import com.facebook.am;
import com.facebook.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.internal:
//            bc

public final class ak
{

    private static final HashMap a = new HashMap();
    private final am b;
    private final String c;
    private StringBuilder d;
    private int e;

    public ak(am am1, String s)
    {
        e = 3;
        bc.a(s, "tag");
        b = am1;
        c = (new StringBuilder("FacebookSDK.")).append(s).toString();
        d = new StringBuilder();
    }

    public static void a(am am1, int i, String s, String s1)
    {
        if (q.a(am1))
        {
            String s2 = c(s1);
            s1 = s;
            if (!s.startsWith("FacebookSDK."))
            {
                s1 = (new StringBuilder("FacebookSDK.")).append(s).toString();
            }
            Log.println(i, s1, s2);
            if (am1 == am.f)
            {
                (new Exception()).printStackTrace();
            }
        }
    }

    public static void a(am am1, String s, String s1)
    {
        a(am1, 3, s, s1);
    }

    public static transient void a(am am1, String s, String s1, Object aobj[])
    {
        if (q.a(am1))
        {
            a(am1, 3, s, String.format(s1, aobj));
        }
    }

    public static void a(String s)
    {
        com/facebook/internal/ak;
        JVM INSTR monitorenter ;
        if (!q.a(am.b))
        {
            a(s, "ACCESS_TOKEN_REMOVED");
        }
        com/facebook/internal/ak;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private static void a(String s, String s1)
    {
        com/facebook/internal/ak;
        JVM INSTR monitorenter ;
        a.put(s, s1);
        com/facebook/internal/ak;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private static String c(String s)
    {
        com/facebook/internal/ak;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            s = s.replace((CharSequence)entry.getKey(), (CharSequence)entry.getValue());
        }

        com/facebook/internal/ak;
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
        if (q.a(b))
        {
            d.append(String.format("  %s:\t%s\n", new Object[] {
                s, obj
            }));
        }
    }

    public final void b(String s)
    {
        if (q.a(b))
        {
            d.append(s);
        }
    }

}
