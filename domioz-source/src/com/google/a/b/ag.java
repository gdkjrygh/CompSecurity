// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.a.b:
//            cn, av, co, aw

final class ag extends cn
    implements Serializable
{

    final av a;

    private ag(av av1)
    {
        a = av1;
    }

    ag(List list)
    {
        this(a(list));
    }

    private int a(Object obj)
    {
        Integer integer = (Integer)a.get(obj);
        if (integer == null)
        {
            throw new co(obj);
        } else
        {
            return integer.intValue();
        }
    }

    private static av a(List list)
    {
        aw aw1 = av.h();
        int i = 0;
        for (list = list.iterator(); list.hasNext();)
        {
            aw1.a(list.next(), Integer.valueOf(i));
            i++;
        }

        return aw1.a();
    }

    public final int compare(Object obj, Object obj1)
    {
        return a(obj) - a(obj1);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ag)
        {
            obj = (ag)obj;
            return a.equals(((ag) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a.d()));
        return (new StringBuilder(s.length() + 19)).append("Ordering.explicit(").append(s).append(")").toString();
    }
}
