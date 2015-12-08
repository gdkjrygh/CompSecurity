// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, RegularImmutableAsList, RegularImmutableBiMap, ImmutableList, 
//            ej, ImmutableMap

class it> extends ImmutableMapEntrySet
{

    final RegularImmutableBiMap this$0;

    ImmutableList createAsList()
    {
        return new RegularImmutableAsList(this, RegularImmutableBiMap.access$000(RegularImmutableBiMap.this));
    }

    public int hashCode()
    {
        return RegularImmutableBiMap.access$100(RegularImmutableBiMap.this);
    }

    boolean isHashCodeFast()
    {
        return true;
    }

    public ej iterator()
    {
        return asList().iterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    ImmutableMap map()
    {
        return RegularImmutableBiMap.this;
    }

    ()
    {
        this$0 = RegularImmutableBiMap.this;
        super();
    }
}
