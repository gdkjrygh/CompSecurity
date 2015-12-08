// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, Iterators, ImmutableMap, ImmutableSet, 
//            Maps, ImmutableList, UnmodifiableIterator, ImmutableAsList

final class ImmutableMapValues extends ImmutableCollection
{
    static final class SerializedForm
        implements Serializable
    {

        final ImmutableMap map;

        SerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }


    private final ImmutableMap map;

    ImmutableMapValues(ImmutableMap immutablemap)
    {
        map = immutablemap;
    }

    public final boolean contains(Object obj)
    {
        return obj != null && Iterators.contains(iterator(), obj);
    }

    final ImmutableList createAsList()
    {
        return new ImmutableAsList() {

            final ImmutableMapValues this$0;
            final ImmutableList val$entryList;

            final ImmutableCollection delegateCollection()
            {
                return ImmutableMapValues.this;
            }

            public final Object get(int i)
            {
                return ((java.util.Map.Entry)entryList.get(i)).getValue();
            }

            
            {
                this$0 = ImmutableMapValues.this;
                entryList = immutablelist;
                super();
            }
        };
    }

    final boolean isPartialView()
    {
        return true;
    }

    public final UnmodifiableIterator iterator()
    {
        return Maps.valueIterator(map.entrySet().iterator());
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int size()
    {
        return map.size();
    }

    final Object writeReplace()
    {
        return new SerializedForm(map);
    }
}
