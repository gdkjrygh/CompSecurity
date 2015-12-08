// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, ImmutableMap, BiMap, ImmutableCollection

static class _cls9 extends ImmutableBiMap
{

    ImmutableMap _mthdelegate()
    {
        return ImmutableMap.of();
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public volatile BiMap inverse()
    {
        return inverse();
    }

    public ImmutableBiMap inverse()
    {
        return this;
    }

    boolean isPartialView()
    {
        return false;
    }

    public volatile Set keySet()
    {
        return super.keySet();
    }

    Object readResolve()
    {
        return ImmutableBiMap.access$000();
    }

    public volatile ImmutableCollection values()
    {
        return super.values();
    }

    public volatile Collection values()
    {
        return super.values();
    }

    public volatile Set values()
    {
        return super.values();
    }

    _cls9()
    {
    }
}
