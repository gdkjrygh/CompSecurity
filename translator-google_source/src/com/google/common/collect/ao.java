// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            aw, RegularImmutableBiMap, ImmutableBiMap, ImmutableMap

public final class ao extends aw
{

    public ao()
    {
    }

    public final ImmutableMap a()
    {
        switch (b)
        {
        default:
            return new RegularImmutableBiMap(b, a);

        case 0: // '\0'
            return ImmutableBiMap.of();

        case 1: // '\001'
            return ImmutableBiMap.of(a[0].getKey(), a[0].getValue());
        }
    }

    public final aw a(Object obj, Object obj1)
    {
        super.a(obj, obj1);
        return this;
    }
}
