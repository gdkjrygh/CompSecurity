// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Collection;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMap, RegularImmutableSortedSet, ImmutableList, ImmutableSet, 
//            ImmutableSortedSet, ImmutableCollection

final class RegularImmutableSortedMap extends ImmutableSortedMap
{

    private final transient RegularImmutableSortedSet a;
    private final transient ImmutableList b;

    RegularImmutableSortedMap(RegularImmutableSortedSet regularimmutablesortedset, ImmutableList immutablelist)
    {
        a = regularimmutablesortedset;
        b = immutablelist;
    }

    RegularImmutableSortedMap(RegularImmutableSortedSet regularimmutablesortedset, ImmutableList immutablelist, ImmutableSortedMap immutablesortedmap)
    {
        super(immutablesortedmap);
        a = regularimmutablesortedset;
        b = immutablelist;
    }

    private ImmutableSortedMap a(int i, int j)
    {
        if (i == 0 && j == size())
        {
            return this;
        }
        if (i == j)
        {
            return emptyMap(comparator());
        } else
        {
            return from(a.getSubSet(i, j), b.subList(i, j));
        }
    }

    final ImmutableSortedMap createDescendingMap()
    {
        return new RegularImmutableSortedMap((RegularImmutableSortedSet)a.descendingSet(), b.reverse(), this);
    }

    final ImmutableSet createEntrySet()
    {
        return new EntrySet(null);
    }

    public final Object get(Object obj)
    {
        int i = a.indexOf(obj);
        if (i == -1)
        {
            return null;
        } else
        {
            return b.get(i);
        }
    }

    public final ImmutableSortedMap headMap(Object obj, boolean flag)
    {
        return a(0, a.headIndex(p.a(obj), flag));
    }

    public final volatile NavigableMap headMap(Object obj, boolean flag)
    {
        return headMap(obj, flag);
    }

    public final volatile ImmutableSet keySet()
    {
        return keySet();
    }

    public final ImmutableSortedSet keySet()
    {
        return a;
    }

    public final volatile Set keySet()
    {
        return keySet();
    }

    public final ImmutableSortedMap tailMap(Object obj, boolean flag)
    {
        return a(a.tailIndex(p.a(obj), flag), size());
    }

    public final volatile NavigableMap tailMap(Object obj, boolean flag)
    {
        return tailMap(obj, flag);
    }

    public final ImmutableCollection values()
    {
        return b;
    }

    public final volatile Collection values()
    {
        return values();
    }


    private class EntrySet extends ImmutableMapEntrySet
    {

        final RegularImmutableSortedMap this$0;

        ImmutableList createAsList()
        {
            class _cls1 extends ImmutableAsList
            {

                private final ImmutableList keyList;
                final EntrySet this$1;

                ImmutableCollection delegateCollection()
                {
                    return EntrySet.this;
                }

                public volatile Object get(int i)
                {
                    return get(i);
                }

                public java.util.Map.Entry get(int i)
                {
                    return Maps.a(keyList.get(i), b.get(i));
                }

                _cls1()
                {
                    this$1 = EntrySet.this;
                    super();
                    keyList = keySet().asList();
                }
            }

            return new _cls1();
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
            return RegularImmutableSortedMap.this;
        }

        private EntrySet()
        {
            this$0 = RegularImmutableSortedMap.this;
            super();
        }

        EntrySet(dz dz)
        {
            this();
        }
    }

}
