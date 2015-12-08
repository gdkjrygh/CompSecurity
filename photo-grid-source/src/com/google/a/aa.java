// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.b.a;
import com.google.a.b.v;
import java.util.Set;

// Referenced classes of package com.google.a:
//            x, z, u

public final class aa extends x
{

    private final v a = new v();

    public aa()
    {
    }

    public final x a(String s)
    {
        if (a.containsKey(s))
        {
            x x1 = (x)a.get(s);
            s = x1;
            if (x1 == null)
            {
                s = com.google.a.z.a;
            }
            return s;
        } else
        {
            return null;
        }
    }

    public final Set a()
    {
        return a.entrySet();
    }

    public final void a(String s, x x1)
    {
        Object obj = x1;
        if (x1 == null)
        {
            obj = com.google.a.z.a;
        }
        a.a((String)com.google.a.b.a.a(s), obj);
    }

    public final u b(String s)
    {
        return (u)a.get(s);
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof aa) && ((aa)obj).a.equals(a);
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
