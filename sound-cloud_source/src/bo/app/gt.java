// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package bo.app:
//            gu, hi, fs, fa, 
//            he, gv, fx, gr, 
//            gg

public abstract class gt extends gu
    implements NavigableMap
{

    private static final Comparator a;
    private static final gt b;
    private transient gt c;

    gt()
    {
    }

    gt(gt gt1)
    {
        c = gt1;
    }

    private gt a(Object obj, Object obj1)
    {
        fa.a(obj);
        fa.a(obj1);
        boolean flag;
        if (comparator().compare(obj, obj1) <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalArgumentException(fa.a("expected fromKey <= toKey but %s > %s", new Object[] {
                obj, obj1
            }));
        } else
        {
            return a(obj1).b(obj);
        }
    }

    public abstract gt a(Object obj);

    public gr b()
    {
        return super.b();
    }

    public abstract gt b(Object obj);

    public java.util.Map.Entry ceilingEntry(Object obj)
    {
        return b(obj).firstEntry();
    }

    public Object ceilingKey(Object obj)
    {
        return he.a(ceilingEntry(obj));
    }

    public Comparator comparator()
    {
        return d_().comparator();
    }

    public boolean containsValue(Object obj)
    {
        return f().contains(obj);
    }

    public gr d()
    {
        return d_();
    }

    public abstract gv d_();

    public NavigableSet descendingKeySet()
    {
        return d_().a_();
    }

    public NavigableMap descendingMap()
    {
        gt gt2 = c;
        gt gt1 = gt2;
        if (gt2 == null)
        {
            gt1 = g();
            c = gt1;
        }
        return gt1;
    }

    boolean e()
    {
        return d_().e() || f().e();
    }

    public Set entrySet()
    {
        return b();
    }

    public abstract fx f();

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
        return d_().first();
    }

    public java.util.Map.Entry floorEntry(Object obj)
    {
        return a(obj).lastEntry();
    }

    public Object floorKey(Object obj)
    {
        return he.a(floorEntry(obj));
    }

    abstract gt g();

    public NavigableMap headMap(Object obj, boolean flag)
    {
        return a(obj);
    }

    public SortedMap headMap(Object obj)
    {
        return a(obj);
    }

    public java.util.Map.Entry higherEntry(Object obj)
    {
        return b(obj).firstEntry();
    }

    public Object higherKey(Object obj)
    {
        return he.a(higherEntry(obj));
    }

    public Set keySet()
    {
        return d_();
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
        return d_().last();
    }

    public java.util.Map.Entry lowerEntry(Object obj)
    {
        return a(obj).lastEntry();
    }

    public Object lowerKey(Object obj)
    {
        return he.a(lowerEntry(obj));
    }

    public NavigableSet navigableKeySet()
    {
        return d_();
    }

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
        return a(obj, obj1);
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return a(obj, obj1);
    }

    public NavigableMap tailMap(Object obj, boolean flag)
    {
        return b(obj);
    }

    public SortedMap tailMap(Object obj)
    {
        return b(obj);
    }

    public Collection values()
    {
        return f();
    }

    static 
    {
        a = hi.b();
        b = new fs(a);
    }
}
