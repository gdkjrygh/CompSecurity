// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, an, RegularImmutableBiMap, ImmutableMapEntry, 
//            ImmutableSet, ae

final class <init> extends ImmutableBiMap
{

    final RegularImmutableBiMap this$0;

    final ImmutableSet createEntrySet()
    {
        class InverseEntrySet extends ImmutableMapEntrySet
        {

            final RegularImmutableBiMap.Inverse this$1;

            final ImmutableList createAsList()
            {
                class _cls1 extends ImmutableAsList
                {

                    final InverseEntrySet this$2;

                    ImmutableCollection delegateCollection()
                    {
                        return InverseEntrySet.this;
                    }

                    public volatile Object get(int i)
                    {
                        return get(i);
                    }

                    public java.util.Map.Entry get(int i)
                    {
                        ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.access$000(this$0)[i];
                        return Maps.a(immutablemapentry.getValue(), immutablemapentry.getKey());
                    }

                        _cls1()
                        {
                            this$2 = InverseEntrySet.this;
                            super();
                        }
                }

                return new _cls1();
            }

            public final int hashCode()
            {
                return RegularImmutableBiMap.access$100(this$0);
            }

            final boolean isHashCodeFast()
            {
                return true;
            }

            public final ej iterator()
            {
                return asList().iterator();
            }

            public final volatile Iterator iterator()
            {
                return iterator();
            }

            final ImmutableMap map()
            {
                return RegularImmutableBiMap.Inverse.this;
            }

            InverseEntrySet()
            {
                this$1 = RegularImmutableBiMap.Inverse.this;
                super();
            }
        }

        return new InverseEntrySet();
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = an.a(obj.hashCode());
            int j = RegularImmutableBiMap.access$300(RegularImmutableBiMap.this);
            ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.access$400(RegularImmutableBiMap.this)[i & j];
            while (immutablemapentry != null) 
            {
                if (obj.equals(immutablemapentry.getValue()))
                {
                    return immutablemapentry.getKey();
                }
                immutablemapentry = immutablemapentry.getNextInValueBucket();
            }
        }
        return null;
    }

    public final ImmutableBiMap inverse()
    {
        return RegularImmutableBiMap.this;
    }

    public final volatile ae inverse()
    {
        return inverse();
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final int size()
    {
        return inverse().size();
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

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
