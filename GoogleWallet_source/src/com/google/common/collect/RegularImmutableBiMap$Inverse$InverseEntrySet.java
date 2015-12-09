// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, RegularImmutableBiMap, ImmutableList, UnmodifiableIterator, 
//            ImmutableMap, ImmutableAsList, Maps, ImmutableCollection

final class this._cls1 extends ImmutableMapEntrySet
{

    final this._cls1 this$1;

    final ImmutableList createAsList()
    {
        return new ImmutableAsList() {

            final RegularImmutableBiMap.Inverse.InverseEntrySet this$2;

            private java.util.Map.Entry get(int i)
            {
                ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.access$000(this$0)[i];
                return Maps.immutableEntry(immutablemapentry.getValue(), immutablemapentry.getKey());
            }

            final ImmutableCollection delegateCollection()
            {
                return RegularImmutableBiMap.Inverse.InverseEntrySet.this;
            }

            public final volatile Object get(int i)
            {
                return get(i);
            }

            
            {
                this$2 = RegularImmutableBiMap.Inverse.InverseEntrySet.this;
                super();
            }
        };
    }

    public final int hashCode()
    {
        return RegularImmutableBiMap.access$100(get);
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
        return this._cls1.this;
    }

    _cls1.this._cls2()
    {
        this$1 = this._cls1.this;
        super();
    }
}
