// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, ImmutableMap, ImmutableSet, BiMap

class RegularImmutableBiMap extends ImmutableBiMap
{

    final transient ImmutableMap _flddelegate;
    final transient ImmutableBiMap inverse;

    RegularImmutableBiMap(ImmutableMap immutablemap)
    {
        _flddelegate = immutablemap;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        java.util.Map.Entry entry;
        for (immutablemap = immutablemap.entrySet().iterator(); immutablemap.hasNext(); builder.put(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)immutablemap.next();
        }

        inverse = new RegularImmutableBiMap(builder.build(), this);
    }

    RegularImmutableBiMap(ImmutableMap immutablemap, ImmutableBiMap immutablebimap)
    {
        _flddelegate = immutablemap;
        inverse = immutablebimap;
    }

    ImmutableMap _mthdelegate()
    {
        return _flddelegate;
    }

    public volatile BiMap inverse()
    {
        return inverse();
    }

    public ImmutableBiMap inverse()
    {
        return inverse;
    }

    boolean isPartialView()
    {
        return _flddelegate.isPartialView() || inverse._mthdelegate().isPartialView();
    }
}
