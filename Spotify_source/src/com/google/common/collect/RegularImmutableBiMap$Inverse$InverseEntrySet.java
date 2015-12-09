// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cvh;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, ImmutableList, RegularImmutableBiMap, ImmutableMap, 
//            ImmutableAsList, Maps, ImmutableCollection

final class this._cls1 extends ImmutableMapEntrySet
{

    final b this$1;

    public final cvh a()
    {
        return b().a();
    }

    final ImmutableMap d()
    {
        return this._cls1.this;
    }

    final ImmutableList f()
    {
        return new ImmutableAsList() {

            final RegularImmutableBiMap.Inverse.InverseEntrySet this$2;

            final ImmutableCollection c()
            {
                return RegularImmutableBiMap.Inverse.InverseEntrySet.this;
            }

            public Object get(int i)
            {
                ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.a(this$0)[i];
                return Maps.a(immutablemapentry.getValue(), immutablemapentry.getKey());
            }

            
            {
                this$2 = RegularImmutableBiMap.Inverse.InverseEntrySet.this;
                super();
            }
        };
    }

    public final int hashCode()
    {
        return RegularImmutableBiMap.b(_fld1);
    }

    public final Iterator iterator()
    {
        return b().a();
    }

    final boolean n_()
    {
        return true;
    }

    _cls1.this._cls2()
    {
        this$1 = this._cls1.this;
        super();
    }
}
