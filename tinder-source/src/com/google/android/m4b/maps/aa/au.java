// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            g

abstract class au
    implements g
{

    private transient Set a;
    private transient Map b;

    au()
    {
    }

    public boolean a(Object obj, Object obj1)
    {
        return b(obj).add(obj1);
    }

    abstract Map b();

    public Map c()
    {
        Map map1 = b;
        Map map = map1;
        if (map1 == null)
        {
            map = b();
            b = map;
        }
        return map;
    }

    public Set d()
    {
        Set set1 = a;
        Set set = set1;
        if (set1 == null)
        {
            set = h_();
            a = set;
        }
        return set;
    }

    public boolean e()
    {
        return a() == 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof g)
        {
            obj = (g)obj;
            return c().equals(((g) (obj)).c());
        } else
        {
            return false;
        }
    }

    Set h_()
    {
        return new ax.d(c());
    }

    public int hashCode()
    {
        return c().hashCode();
    }

    public String toString()
    {
        return c().toString();
    }
}
