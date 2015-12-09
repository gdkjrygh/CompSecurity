// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuj;

// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, ImmutableSet, Maps

final class SingletonImmutableBiMap extends ImmutableBiMap
{

    private transient Object a;
    private transient Object b;
    private transient ImmutableBiMap c;

    SingletonImmutableBiMap(Object obj, Object obj1)
    {
        cuj.a(obj, obj1);
        a = obj;
        b = obj1;
    }

    private SingletonImmutableBiMap(Object obj, Object obj1, ImmutableBiMap immutablebimap)
    {
        a = obj;
        b = obj1;
        c = immutablebimap;
    }

    final ImmutableSet a()
    {
        return ImmutableSet.b(a);
    }

    final ImmutableSet c()
    {
        return ImmutableSet.b(Maps.a(a, b));
    }

    public final boolean containsKey(Object obj)
    {
        return a.equals(obj);
    }

    public final boolean containsValue(Object obj)
    {
        return b.equals(obj);
    }

    final boolean e()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        if (a.equals(obj))
        {
            return b;
        } else
        {
            return null;
        }
    }

    public final ImmutableBiMap o_()
    {
        ImmutableBiMap immutablebimap = c;
        Object obj = immutablebimap;
        if (immutablebimap == null)
        {
            obj = new SingletonImmutableBiMap(b, a, this);
            c = ((ImmutableBiMap) (obj));
        }
        return ((ImmutableBiMap) (obj));
    }

    public final int size()
    {
        return 1;
    }
}
