// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cum;

// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, RegularImmutableBiMap, ImmutableMapEntry, ImmutableSet

final class <init> extends ImmutableBiMap
{

    final RegularImmutableBiMap this$0;

    final ImmutableSet c()
    {
        class InverseEntrySet extends ImmutableMapEntrySet
        {

            final RegularImmutableBiMap.Inverse this$1;

            public final cvh a()
            {
                return b().a();
            }

            final ImmutableMap d()
            {
                return RegularImmutableBiMap.Inverse.this;
            }

            final ImmutableList f()
            {
                return new ImmutableAsList() {

                    final InverseEntrySet this$2;

                    final ImmutableCollection c()
                    {
                        return InverseEntrySet.this;
                    }

                    public Object get(int i)
                    {
                        ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.a(this$0)[i];
                        return Maps.a(immutablemapentry.getValue(), immutablemapentry.getKey());
                    }

                    
                    {
                        this$2 = InverseEntrySet.this;
                        super();
                    }
                };
            }

            public final int hashCode()
            {
                return RegularImmutableBiMap.b(this$0);
            }

            public final Iterator iterator()
            {
                return b().a();
            }

            final boolean n_()
            {
                return true;
            }

            InverseEntrySet()
            {
                this$1 = RegularImmutableBiMap.Inverse.this;
                super();
            }
        }

        return new InverseEntrySet();
    }

    final boolean e()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = cum.a(obj.hashCode());
            int j = RegularImmutableBiMap.c(RegularImmutableBiMap.this);
            ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.d(RegularImmutableBiMap.this)[i & j];
            while (immutablemapentry != null) 
            {
                if (obj.equals(immutablemapentry.getValue()))
                {
                    return immutablemapentry.getKey();
                }
                immutablemapentry = immutablemapentry.b();
            }
        }
        return null;
    }

    public final ImmutableBiMap o_()
    {
        return RegularImmutableBiMap.this;
    }

    public final int size()
    {
        return ImmutableBiMap.this.size();
    }

    final Object writeReplace()
    {
        return new erializedForm(RegularImmutableBiMap.this);
    }

    private erializedForm()
    {
        this$0 = RegularImmutableBiMap.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
