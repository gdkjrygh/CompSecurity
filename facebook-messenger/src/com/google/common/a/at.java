// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            x, kk

abstract class at extends x
    implements kk
{

    protected at(Map map)
    {
        super(map);
    }

    abstract Set a();

    public Set a(Object obj)
    {
        return (Set)super.c(obj);
    }

    public Set a(Object obj, Iterable iterable)
    {
        return (Set)super.b(obj, iterable);
    }

    public boolean a(Object obj, Object obj1)
    {
        return super.a(obj, obj1);
    }

    public Collection b(Object obj, Iterable iterable)
    {
        return a(obj, iterable);
    }

    public Map b()
    {
        return super.b();
    }

    public Set b(Object obj)
    {
        return (Set)super.d(obj);
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

    public Collection i()
    {
        return l();
    }

    public Set l()
    {
        return (Set)super.i();
    }
}
