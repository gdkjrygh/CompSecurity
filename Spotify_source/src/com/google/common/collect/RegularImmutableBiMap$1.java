// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cvh;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, RegularImmutableBiMap, ImmutableList, RegularImmutableAsList, 
//            ImmutableMap

class it> extends ImmutableMapEntrySet
{

    final RegularImmutableBiMap this$0;

    public final cvh a()
    {
        return b().a();
    }

    final ImmutableMap d()
    {
        return RegularImmutableBiMap.this;
    }

    final ImmutableList f()
    {
        return new RegularImmutableAsList(this, RegularImmutableBiMap.a(RegularImmutableBiMap.this));
    }

    public int hashCode()
    {
        return RegularImmutableBiMap.b(RegularImmutableBiMap.this);
    }

    public Iterator iterator()
    {
        return b().a();
    }

    final boolean n_()
    {
        return true;
    }

    ()
    {
        this$0 = RegularImmutableBiMap.this;
        super();
    }
}
