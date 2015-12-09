// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, RegularImmutableBiMap, RegularImmutableAsList, ImmutableList, 
//            UnmodifiableIterator, ImmutableMap

final class it> extends ImmutableMapEntrySet
{

    final RegularImmutableBiMap this$0;

    final ImmutableList createAsList()
    {
        return new RegularImmutableAsList(this, RegularImmutableBiMap.access$000(RegularImmutableBiMap.this));
    }

    public final int hashCode()
    {
        return RegularImmutableBiMap.access$100(RegularImmutableBiMap.this);
    }

    final boolean isHashCodeFast()
    {
        return true;
    }

    public final UnmodifiableIterator iterator()
    {
        return asList().iterator();
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    final ImmutableMap map()
    {
        return RegularImmutableBiMap.this;
    }

    ()
    {
        this$0 = RegularImmutableBiMap.this;
        super();
    }
}
