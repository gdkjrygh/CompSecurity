// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import java.util.Collection;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMap, RegularImmutableSortedSet, ImmutableList, ImmutableSortedSet, 
//            ImmutableSet, ImmutableCollection

final class RegularImmutableSortedMap extends ImmutableSortedMap
{

    final transient RegularImmutableSortedSet a;
    private final transient ImmutableList b;

    RegularImmutableSortedMap(RegularImmutableSortedSet regularimmutablesortedset, ImmutableList immutablelist)
    {
        a = regularimmutablesortedset;
        b = immutablelist;
    }

    private RegularImmutableSortedMap(RegularImmutableSortedSet regularimmutablesortedset, ImmutableList immutablelist, ImmutableSortedMap immutablesortedmap)
    {
        super(immutablesortedmap);
        a = regularimmutablesortedset;
        b = immutablelist;
    }

    static ImmutableList a(RegularImmutableSortedMap regularimmutablesortedmap)
    {
        return regularimmutablesortedmap.b;
    }

    private ImmutableSortedMap a(int i, int j)
    {
        if (i == 0 && j == size())
        {
            return this;
        }
        if (i == j)
        {
            return a(comparator());
        }
        ImmutableSortedSet immutablesortedset = a.a(i, j);
        ImmutableList immutablelist = b.a(i, j);
        if (immutablesortedset.isEmpty())
        {
            return ImmutableSortedMap.a(immutablesortedset.comparator());
        } else
        {
            return new RegularImmutableSortedMap((RegularImmutableSortedSet)immutablesortedset, immutablelist);
        }
    }

    public final ImmutableSortedMap a(Object obj, boolean flag)
    {
        return a(0, a.e(ctz.a(obj), flag));
    }

    public final ImmutableSortedMap b(Object obj, boolean flag)
    {
        return a(a.f(ctz.a(obj), flag), size());
    }

    final ImmutableSet c()
    {
        return new EntrySet((byte)0);
    }

    public final volatile ImmutableSet d()
    {
        return a;
    }

    public final ImmutableCollection f()
    {
        return b;
    }

    final ImmutableSortedMap g()
    {
        return new RegularImmutableSortedMap((RegularImmutableSortedSet)a.m_(), b.g(), this);
    }

    public final Object get(Object obj)
    {
        int i = a.a(obj);
        if (i == -1)
        {
            return null;
        } else
        {
            return b.get(i);
        }
    }

    public final NavigableMap headMap(Object obj, boolean flag)
    {
        return a(obj, flag);
    }

    public final volatile Set keySet()
    {
        return a;
    }

    public final ImmutableSortedSet p_()
    {
        return a;
    }

    public final NavigableMap tailMap(Object obj, boolean flag)
    {
        return b(obj, flag);
    }

    public final volatile Collection values()
    {
        return b;
    }

    private class EntrySet extends ImmutableMapEntrySet
    {

        final RegularImmutableSortedMap this$0;

        public final cvh a()
        {
            return b().a();
        }

        final ImmutableMap d()
        {
            return RegularImmutableSortedMap.this;
        }

        final ImmutableList f()
        {
            return new ImmutableAsList() {

                private final ImmutableList keyList;
                final EntrySet this$1;

                final ImmutableCollection c()
                {
                    return EntrySet.this;
                }

                public Object get(int i)
                {
                    return Maps.a(keyList.get(i), RegularImmutableSortedMap.a(_fld0).get(i));
                }

                
                {
                    this$1 = EntrySet.this;
                    super();
                    keyList = a.b();
                }
            };
        }

        public Iterator iterator()
        {
            return b().a();
        }

        private EntrySet()
        {
            this$0 = RegularImmutableSortedMap.this;
            super();
        }

        EntrySet(byte byte0)
        {
            this();
        }
    }

}
