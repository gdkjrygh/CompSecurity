// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, RegularImmutableBiMap, ImmutableMap

public static final class nalEntry extends nalEntry
{

    public final ImmutableBiMap build()
    {
        switch (size)
        {
        default:
            return new RegularImmutableBiMap(size, entries);

        case 0: // '\0'
            return ImmutableBiMap.of();

        case 1: // '\001'
            return ImmutableBiMap.of(entries[0].getKey(), entries[0].getValue());
        }
    }

    public final volatile ImmutableMap build()
    {
        return build();
    }

    public final build put(Object obj, Object obj1)
    {
        super.t(obj, obj1);
        return this;
    }

    public final volatile t put(Object obj, Object obj1)
    {
        return put(obj, obj1);
    }

    public nalEntry()
    {
    }
}
