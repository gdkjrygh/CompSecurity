// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.c.d.m;

// Referenced classes of package org.c.e.b:
//            e, h, a, s

final class c
    implements e
{

    private final String a;

    c(String s)
    {
        a = s;
    }

    public final String a()
    {
        return a;
    }

    public final e a(String s)
    {
        return new c(org.c.e.b.a.a(a, s, h.f));
    }

    public final e a(s s)
    {
        return new c(org.c.e.b.a.a(a, s));
    }

    public final List b()
    {
        String s = new String(new char[] {
            '/'
        });
        return Collections.unmodifiableList(Arrays.asList(m.tokenizeToStringArray(a, s)));
    }

    public final void c()
    {
        org.c.e.b.a.a(a, h.f);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof c)
        {
            obj = (c)obj;
            return a.equals(((c) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
