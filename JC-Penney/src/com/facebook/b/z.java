// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.util.Log;
import com.facebook.aq;
import com.facebook.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.b:
//            ar

public class z
{

    private static final HashMap a = new HashMap();
    private final aq b;
    private final String c;
    private StringBuilder d;
    private int e;

    public z(aq aq1, String s1)
    {
        e = 3;
        ar.a(s1, "tag");
        b = aq1;
        c = (new StringBuilder()).append("FacebookSDK.").append(s1).toString();
        d = new StringBuilder();
    }

    public static void a(aq aq1, int i, String s1, String s2)
    {
        if (s.a(aq1))
        {
            String s3 = d(s2);
            s2 = s1;
            if (!s1.startsWith("FacebookSDK."))
            {
                s2 = (new StringBuilder()).append("FacebookSDK.").append(s1).toString();
            }
            Log.println(i, s2, s3);
            if (aq1 == aq.f)
            {
                (new Exception()).printStackTrace();
            }
        }
    }

    public static void a(aq aq1, String s1, String s2)
    {
        a(aq1, 3, s1, s2);
    }

    public static transient void a(aq aq1, String s1, String s2, Object aobj[])
    {
        if (s.a(aq1))
        {
            a(aq1, 3, s1, String.format(s2, aobj));
        }
    }

    public static void a(String s1)
    {
        com/facebook/b/z;
        JVM INSTR monitorenter ;
        if (!s.a(aq.b))
        {
            a(s1, "ACCESS_TOKEN_REMOVED");
        }
        com/facebook/b/z;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public static void a(String s1, String s2)
    {
        com/facebook/b/z;
        JVM INSTR monitorenter ;
        a.put(s1, s2);
        com/facebook/b/z;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    private boolean b()
    {
        return s.a(b);
    }

    private static String d(String s1)
    {
        com/facebook/b/z;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            s1 = s1.replace((CharSequence)entry.getKey(), (CharSequence)entry.getValue());
        }

        com/facebook/b/z;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        throw s1;
    }

    public void a()
    {
        b(d.toString());
        d = new StringBuilder();
    }

    public void a(String s1, Object obj)
    {
        a("  %s:\t%s\n", new Object[] {
            s1, obj
        });
    }

    public transient void a(String s1, Object aobj[])
    {
        if (b())
        {
            d.append(String.format(s1, aobj));
        }
    }

    public void b(String s1)
    {
        a(b, e, c, s1);
    }

    public void c(String s1)
    {
        if (b())
        {
            d.append(s1);
        }
    }

}
