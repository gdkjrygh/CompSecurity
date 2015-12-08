// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.w;
import java.util.Set;

// Referenced classes of package com.google.b:
//            w, y, ac, t

public final class z extends com.google.b.w
{

    private final w a = new w();

    public z()
    {
    }

    private static com.google.b.w a(Object obj)
    {
        if (obj == null)
        {
            return y.a;
        } else
        {
            return new ac(obj);
        }
    }

    public final Set a()
    {
        return a.entrySet();
    }

    public final void a(String s, com.google.b.w w1)
    {
        Object obj = w1;
        if (w1 == null)
        {
            obj = y.a;
        }
        a.put(s, obj);
    }

    public final void a(String s, Boolean boolean1)
    {
        a(s, a(boolean1));
    }

    public final void a(String s, Number number)
    {
        a(s, a(number));
    }

    public final void a(String s, String s1)
    {
        a(s, a(s1));
    }

    public final boolean a(String s)
    {
        return a.containsKey(s);
    }

    public final com.google.b.w b(String s)
    {
        return (com.google.b.w)a.get(s);
    }

    public final t c(String s)
    {
        return (t)a.get(s);
    }

    public final z d(String s)
    {
        return (z)a.get(s);
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof z) && ((z)obj).a.equals(a);
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
