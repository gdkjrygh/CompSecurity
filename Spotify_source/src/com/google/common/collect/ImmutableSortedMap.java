// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cuq;
import cva;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMapFauxverideShim, EmptyImmutableSortedMap, Maps, ImmutableList, 
//            RegularImmutableSortedMap, RegularImmutableSortedSet, ImmutableSortedSet, ImmutableCollection, 
//            ImmutableSet

public abstract class ImmutableSortedMap extends ImmutableSortedMapFauxverideShim
    implements NavigableMap
{

    private static final Comparator a;
    private static final ImmutableSortedMap b;
    private static final long serialVersionUID = 0L;
    private transient ImmutableSortedMap c;

    ImmutableSortedMap()
    {
    }

    ImmutableSortedMap(ImmutableSortedMap immutablesortedmap)
    {
        c = immutablesortedmap;
    }

    private ImmutableSortedMap a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        ctz.a(obj);
        ctz.a(obj1);
        boolean flag2;
        if (comparator().compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ctz.a(flag2, "expected fromKey <= toKey but %s > %s", new Object[] {
            obj, obj1
        });
        return a(obj1, flag1).b(obj, flag);
    }

    static ImmutableSortedMap a(Comparator comparator1)
    {
        if (cva.b().equals(comparator1))
        {
            return b;
        } else
        {
            return new EmptyImmutableSortedMap(comparator1);
        }
    }

    public static transient ImmutableSortedMap a(Comparator comparator1, int i, java.util.Map.Entry aentry[])
    {
        boolean flag = false;
        for (int j = 0; j < i; j++)
        {
            java.util.Map.Entry entry = aentry[j];
            aentry[j] = c(entry.getKey(), entry.getValue());
        }

        Arrays.sort(aentry, 0, i, cva.a(comparator1).a(Maps.a()));
        int k = 1;
        while (k < i) 
        {
            boolean flag1;
            if (comparator1.compare(aentry[k - 1].getKey(), aentry[k].getKey()) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a(flag1, "key", aentry[k - 1], aentry[k]);
            k++;
        }
        if (i == 0)
        {
            return a(comparator1);
        }
        cuq cuq1 = ImmutableList.h();
        cuq cuq2 = ImmutableList.h();
        for (int l = ((flag) ? 1 : 0); l < i; l++)
        {
            java.util.Map.Entry entry1 = aentry[l];
            cuq1.c(entry1.getKey());
            cuq2.c(entry1.getValue());
        }

        return new RegularImmutableSortedMap(new RegularImmutableSortedSet(cuq1.a(), comparator1), cuq2.a());
    }

    public abstract ImmutableSortedMap a(Object obj, boolean flag);

    public ImmutableSet b()
    {
        return super.b();
    }

    public abstract ImmutableSortedMap b(Object obj, boolean flag);

    public java.util.Map.Entry ceilingEntry(Object obj)
    {
        return b(obj, true).firstEntry();
    }

    public Object ceilingKey(Object obj)
    {
        return Maps.a(ceilingEntry(obj));
    }

    public Comparator comparator()
    {
        return p_().comparator();
    }

    public boolean containsValue(Object obj)
    {
        return f().contains(obj);
    }

    public ImmutableSet d()
    {
        return p_();
    }

    public NavigableSet descendingKeySet()
    {
        return p_().m_();
    }

    public NavigableMap descendingMap()
    {
        ImmutableSortedMap immutablesortedmap1 = c;
        ImmutableSortedMap immutablesortedmap = immutablesortedmap1;
        if (immutablesortedmap1 == null)
        {
            immutablesortedmap = g();
            c = immutablesortedmap;
        }
        return immutablesortedmap;
    }

    boolean e()
    {
        return p_().e() || f().e();
    }

    public Set entrySet()
    {
        return b();
    }

    public abstract ImmutableCollection f();

    public java.util.Map.Entry firstEntry()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return (java.util.Map.Entry)b().b().get(0);
        }
    }

    public Object firstKey()
    {
        return p_().first();
    }

    public java.util.Map.Entry floorEntry(Object obj)
    {
        return a(obj, true).lastEntry();
    }

    public Object floorKey(Object obj)
    {
        return Maps.a(floorEntry(obj));
    }

    abstract ImmutableSortedMap g();

    public NavigableMap headMap(Object obj, boolean flag)
    {
        return a(obj, flag);
    }

    public SortedMap headMap(Object obj)
    {
        return a(obj, false);
    }

    public java.util.Map.Entry higherEntry(Object obj)
    {
        return b(obj, false).firstEntry();
    }

    public Object higherKey(Object obj)
    {
        return Maps.a(higherEntry(obj));
    }

    public Set keySet()
    {
        return p_();
    }

    public java.util.Map.Entry lastEntry()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return (java.util.Map.Entry)b().b().get(size() - 1);
        }
    }

    public Object lastKey()
    {
        return p_().last();
    }

    public java.util.Map.Entry lowerEntry(Object obj)
    {
        return a(obj, false).lastEntry();
    }

    public Object lowerKey(Object obj)
    {
        return Maps.a(lowerEntry(obj));
    }

    public NavigableSet navigableKeySet()
    {
        return p_();
    }

    public abstract ImmutableSortedSet p_();

    public final java.util.Map.Entry pollFirstEntry()
    {
        throw new UnsupportedOperationException();
    }

    public final java.util.Map.Entry pollLastEntry()
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return f().size();
    }

    public NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return a(obj, flag, obj1, flag1);
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return a(obj, true, obj1, false);
    }

    public NavigableMap tailMap(Object obj, boolean flag)
    {
        return b(obj, flag);
    }

    public SortedMap tailMap(Object obj)
    {
        return b(obj, true);
    }

    public Collection values()
    {
        return f();
    }

    Object writeReplace()
    {
        return new SerializedForm();
    }

    static 
    {
        a = cva.b();
        b = new EmptyImmutableSortedMap(a);
    }

    private class SerializedForm extends ImmutableMap.SerializedForm
    {

        private static final long serialVersionUID = 0L;
        private final Comparator comparator;

        Object readResolve()
        {
            return a(new cut(comparator));
        }

        SerializedForm()
        {
            comparator = ImmutableSortedMap.this.comparator();
        }
    }

}
