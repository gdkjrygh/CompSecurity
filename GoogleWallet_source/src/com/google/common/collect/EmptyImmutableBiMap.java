// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, ImmutableSet

final class EmptyImmutableBiMap extends ImmutableBiMap
{

    static final EmptyImmutableBiMap INSTANCE = new EmptyImmutableBiMap();

    private EmptyImmutableBiMap()
    {
    }

    final ImmutableSet createEntrySet()
    {
        throw new AssertionError("should never be called");
    }

    public final ImmutableSet entrySet()
    {
        return ImmutableSet.of();
    }

    public final volatile Set entrySet()
    {
        return entrySet();
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final ImmutableBiMap inverse()
    {
        return this;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final ImmutableSet keySet()
    {
        return ImmutableSet.of();
    }

    public final volatile Set keySet()
    {
        return keySet();
    }

    public final int size()
    {
        return 0;
    }

}
