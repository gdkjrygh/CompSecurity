// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            x, hp

abstract class p extends x
    implements hp
{

    protected p(Map map)
    {
        super(map);
    }

    abstract List a();

    public List a(Object obj)
    {
        return (List)super.c(obj);
    }

    public List a(Object obj, Iterable iterable)
    {
        return (List)super.b(obj, iterable);
    }

    public boolean a(Object obj, Object obj1)
    {
        return super.a(obj, obj1);
    }

    public Collection b(Object obj, Iterable iterable)
    {
        return a(obj, iterable);
    }

    public List b(Object obj)
    {
        return (List)super.d(obj);
    }

    public Map b()
    {
        return super.b();
    }

    Collection c()
    {
        return a();
    }

    public Collection c(Object obj)
    {
        return a(obj);
    }

    public Collection d(Object obj)
    {
        return b(obj);
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}
