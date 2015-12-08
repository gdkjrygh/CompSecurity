// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableMap, ImmutableList, UnmodifiableIterator, 
//            ImmutableAsList, ImmutableCollection

final class ImmutableMapKeySet extends ImmutableSet
{
    static final class KeySetSerializedForm
        implements Serializable
    {

        final ImmutableMap map;

        KeySetSerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }


    private final ImmutableMap map;

    ImmutableMapKeySet(ImmutableMap immutablemap)
    {
        map = immutablemap;
    }

    public final boolean contains(Object obj)
    {
        return map.containsKey(obj);
    }

    final ImmutableList createAsList()
    {
        return new ImmutableAsList() {

            final ImmutableMapKeySet this$0;
            final ImmutableList val$entryList;

            final ImmutableCollection delegateCollection()
            {
                return ImmutableMapKeySet.this;
            }

            public final Object get(int i)
            {
                return ((java.util.Map.Entry)entryList.get(i)).getKey();
            }

            
            {
                this$0 = ImmutableMapKeySet.this;
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
        return asList().iterator();
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
        return new KeySetSerializedForm(map);
    }
}
