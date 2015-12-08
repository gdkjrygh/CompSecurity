// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import com.google.common.c.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            aa, Count, Maps, s, 
//            u, af

class AbstractMapBasedMultiset extends aa
    implements Serializable
{

    private static final long serialVersionUID = 0xe0c3ab9b328ff63aL;
    private transient Map a;
    private transient long b;

    protected AbstractMapBasedMultiset(Map map)
    {
        a = (Map)p.a(map);
        b = super.size();
    }

    private static int a(Count count1, int i)
    {
        if (count1 == null)
        {
            return 0;
        } else
        {
            return count1.getAndSet(i);
        }
    }

    public int add(Object obj, int i)
    {
        int j = 0;
        if (i == 0)
        {
            return count(obj);
        }
        Count count1;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "occurrences cannot be negative: %s", new Object[] {
            Integer.valueOf(i)
        });
        count1 = (Count)a.get(obj);
        if (count1 == null)
        {
            a.put(obj, new Count(i));
        } else
        {
            j = count1.get();
            long l = (long)j + (long)i;
            boolean flag1;
            if (l <= 0x7fffffffL)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.a(flag1, "too many occurrences: %s", new Object[] {
                Long.valueOf(l)
            });
            count1.getAndAdd(i);
        }
        b = b + (long)i;
        return j;
    }

    public void clear()
    {
        for (Iterator iterator1 = a.values().iterator(); iterator1.hasNext(); ((Count)iterator1.next()).set(0)) { }
        a.clear();
        b = 0L;
    }

    public int count(Object obj)
    {
        obj = (Count)com.google.common.collect.Maps.a(a, obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Count) (obj)).get();
        }
    }

    int distinctElements()
    {
        return a.size();
    }

    Iterator entryIterator()
    {
        return new s(this, a.entrySet().iterator());
    }

    public Set entrySet()
    {
        return super.entrySet();
    }

    public Iterator iterator()
    {
        return new u(this);
    }

    public int remove(Object obj, int i)
    {
        int j = 0;
        if (i == 0)
        {
            j = count(obj);
        } else
        {
            Count count1;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "occurrences cannot be negative: %s", new Object[] {
                Integer.valueOf(i)
            });
            count1 = (Count)a.get(obj);
            if (count1 != null)
            {
                int l = count1.get();
                int k = i;
                if (l <= i)
                {
                    a.remove(obj);
                    k = l;
                }
                count1.addAndGet(-k);
                b = b - (long)k;
                return l;
            }
        }
        return j;
    }

    void setBackingMap(Map map)
    {
        a = map;
    }

    public int setCount(Object obj, int i)
    {
        com.google.common.collect.af.a(i, "count");
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j = a((Count)a.remove(obj), i);
_L4:
        b = b + (long)(i - j);
        return j;
_L2:
        Count count1 = (Count)a.get(obj);
        j = a(count1, i);
        if (count1 == null)
        {
            a.put(obj, new Count(i));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int size()
    {
        return com.google.common.c.a.a(b);
    }



/*
    static long access$110(AbstractMapBasedMultiset abstractmapbasedmultiset)
    {
        long l = abstractmapbasedmultiset.b;
        abstractmapbasedmultiset.b = l - 1L;
        return l;
    }

*/


/*
    static long access$122(AbstractMapBasedMultiset abstractmapbasedmultiset, long l)
    {
        l = abstractmapbasedmultiset.b - l;
        abstractmapbasedmultiset.b = l;
        return l;
    }

*/
}
