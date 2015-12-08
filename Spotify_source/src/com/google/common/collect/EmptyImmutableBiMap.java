// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, ImmutableSet

final class EmptyImmutableBiMap extends ImmutableBiMap
{

    static final EmptyImmutableBiMap a = new EmptyImmutableBiMap();

    private EmptyImmutableBiMap()
    {
    }

    public final ImmutableSet b()
    {
        return ImmutableSet.g();
    }

    final ImmutableSet c()
    {
        throw new AssertionError("should never be called");
    }

    public final ImmutableSet d()
    {
        return ImmutableSet.g();
    }

    final boolean e()
    {
        return false;
    }

    public final Set entrySet()
    {
        return ImmutableSet.g();
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    public final Set keySet()
    {
        return ImmutableSet.g();
    }

    public final ImmutableBiMap o_()
    {
        return this;
    }

    final Object readResolve()
    {
        return a;
    }

    public final int size()
    {
        return 0;
    }

}
