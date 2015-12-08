// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.c;
import com.google.b.h;
import com.google.b.q;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            x, h

public final class s extends x
{

    private final x a = new com.google.b.e.h();

    public s()
    {
    }

    private static q a(q q1)
    {
        String s1 = q1.a();
        if (s1.charAt(0) == '0')
        {
            return new q(s1.substring(1), null, q1.c(), a.o);
        } else
        {
            throw h.a();
        }
    }

    protected int a(com.google.b.b.a a1, int ai[], StringBuilder stringbuilder)
    {
        return a.a(a1, ai, stringbuilder);
    }

    public q a(int i, com.google.b.b.a a1, Map map)
    {
        return a(a.a(i, a1, map));
    }

    public q a(int i, com.google.b.b.a a1, int ai[], Map map)
    {
        return a(a.a(i, a1, ai, map));
    }

    public q a(c c, Map map)
    {
        return a(a.a(c, map));
    }

    a b()
    {
        return a.o;
    }
}
