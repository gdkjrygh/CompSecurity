// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ap, q, o, ax, 
//            ae, bj, bk, aq, 
//            aa, al, af

public abstract class ao extends ap
    implements SortedMap
{
    public static final class a extends af.a
    {

        private final Comparator c;

        public final af.a a(Object obj, Object obj1)
        {
            super.a(obj, obj1);
            return this;
        }

        public final af.a a(java.util.Map.Entry entry)
        {
            super.a(entry);
            return this;
        }

        public final af.a a(Map map)
        {
            super.a(map);
            return this;
        }

        public final af a()
        {
            return ao.a(c, b, a);
        }

        public a(Comparator comparator1)
        {
            c = (Comparator)j.a(comparator1);
        }
    }

    static final class b extends af.b
    {

        private static final long serialVersionUID = 0L;
        private final Comparator a;

        final Object readResolve()
        {
            return a(new a(a));
        }

        b(ao ao1)
        {
            super(ao1);
            a = ao1.comparator();
        }
    }


    private static final Comparator a;
    private static final ao b;
    private static final long serialVersionUID = 0L;

    ao()
    {
    }

    static ao a(Comparator comparator1)
    {
        if (q.b().equals(comparator1))
        {
            return b;
        } else
        {
            return new o(comparator1);
        }
    }

    static transient ao a(Comparator comparator1, int k, java.util.Map.Entry aentry[])
    {
        boolean flag = false;
        for (int l = 0; l < k; l++)
        {
            java.util.Map.Entry entry = aentry[l];
            aentry[l] = b(entry.getKey(), entry.getValue());
        }

        Arrays.sort(aentry, 0, k, q.a(comparator1).a(ax.a()));
        int i1 = 1;
        while (i1 < k) 
        {
            boolean flag1;
            if (comparator1.compare(aentry[i1 - 1].getKey(), aentry[i1].getKey()) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a(flag1, "key", aentry[i1 - 1], aentry[i1]);
            i1++;
        }
        if (k == 0)
        {
            return a(comparator1);
        }
        ae.a a1 = ae.g();
        ae.a a2 = ae.g();
        for (int j1 = ((flag) ? 1 : 0); j1 < k; j1++)
        {
            java.util.Map.Entry entry1 = aentry[j1];
            a1.c(entry1.getKey());
            a2.c(entry1.getValue());
        }

        return new bj(new bk(a1.a(), comparator1), a2.a());
    }

    public abstract ao a(Object obj);

    public abstract ao b(Object obj);

    boolean c()
    {
        return i().d() || h().d();
    }

    public Comparator comparator()
    {
        return i().comparator();
    }

    public boolean containsValue(Object obj)
    {
        return h().contains(obj);
    }

    public Set entrySet()
    {
        return f();
    }

    public al f()
    {
        return super.f();
    }

    public Object firstKey()
    {
        return i().first();
    }

    public al g()
    {
        return i();
    }

    public abstract aa h();

    public SortedMap headMap(Object obj)
    {
        return a(obj);
    }

    public abstract aq i();

    public Set keySet()
    {
        return i();
    }

    public Object lastKey()
    {
        return i().last();
    }

    public int size()
    {
        return h().size();
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        j.a(obj);
        j.a(obj1);
        boolean flag;
        if (comparator().compare(obj, obj1) <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "expected fromKey <= toKey but %s > %s", new Object[] {
            obj, obj1
        });
        return a(obj1).b(obj);
    }

    public SortedMap tailMap(Object obj)
    {
        return b(obj);
    }

    public Collection values()
    {
        return h();
    }

    Object writeReplace()
    {
        return new b(this);
    }

    static 
    {
        a = q.b();
        b = new o(a);
    }
}
