// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.a;

import com.nuance.a.a.a.c.b.c.a;
import com.nuance.a.a.a.c.b.c.b;
import java.util.Hashtable;

// Referenced classes of package com.nuance.a.a.a.c.b.a.a:
//            a, g, d, b

public final class c
    implements a
{

    private final com.nuance.a.a.a.c.b.a.a.a a;
    private final Hashtable b = new Hashtable();
    private boolean c;
    private int d;

    private c(com.nuance.a.a.a.c.b.a.a.a a1)
    {
        c = false;
        d = 0;
        a = a1;
        g g1 = a.b;
        com.nuance.a.a.a.c.b.a.a.g.b(a1);
    }

    static c a(com.nuance.a.a.a.c.b.a.a.a a1, String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("eventName is null.");
        } else
        {
            return new c(new d(a1, s));
        }
    }

    static c a(String s, String s1, String s2, int i, g g1, String s3)
    {
        return new c(new com.nuance.a.a.a.c.b.a.a.b(s, s1, s2, i, g1, s3));
    }

    public final a a(String s)
    {
        a.a(s);
        return this;
    }

    public final a a(String s, int i)
    {
        if (c)
        {
            throw new b("SessionEvent is already committed.");
        }
        int j = s.getBytes().length;
        if ((double)(j + 4 + d) > 135000D)
        {
            throw new IllegalArgumentException("Trying to add too much data in putBinary. Maximum is : 135000.0");
        } else
        {
            d = j + 4 + 16 + d;
            b.put(s, new Integer(i));
            return this;
        }
    }

    public final a a(String s, String s1)
    {
        if (c)
        {
            throw new b("SessionEvent is already committed.");
        }
        int i = s.getBytes().length;
        int j = s1.getBytes().length;
        if ((double)(j + i + d) > 135000D)
        {
            throw new IllegalArgumentException("Trying to add too much data in putBinary. Maximum is : 135000.0");
        } else
        {
            d = i + j + 16 + d;
            b.put(s, s1);
            return this;
        }
    }

    public final a a(String s, boolean flag)
    {
        if (c)
        {
            throw new b("SessionEvent is already committed.");
        }
        int i = s.getBytes().length;
        int j = Boolean.valueOf(flag).toString().getBytes().length;
        if ((double)(j + i + d) > 135000D)
        {
            throw new IllegalArgumentException("Trying to add too much data in putBinary. Maximum is : 135000.0");
        } else
        {
            d = i + j + 16 + d;
            b.put(s, new Boolean(flag));
            return this;
        }
    }

    public final com.nuance.a.a.a.c.b.c.c a()
    {
        if (!c)
        {
            a.a(b);
            c = true;
            return a;
        } else
        {
            return null;
        }
    }

    public final void b(String s, String s1)
    {
        a.e = s;
        a.f = s1;
    }
}
