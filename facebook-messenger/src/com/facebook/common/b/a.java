// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.b;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.common.b:
//            b

public class a
    implements Set
{

    private ArrayList a;
    private final boolean b;
    private HashMap c;

    public a()
    {
        this(true);
    }

    public a(boolean flag)
    {
        a = new ArrayList();
        b = flag;
        if (b)
        {
            c = new HashMap();
        }
    }

    private int a(Object obj)
    {
        if (b)
        {
            obj = (Integer)c.get(obj);
            if (obj != null)
            {
                return ((Integer) (obj)).intValue();
            } else
            {
                return -1;
            }
        } else
        {
            return a.indexOf(obj);
        }
    }

    static ArrayList a(a a1)
    {
        return a1.a;
    }

    private void a(Object obj, int i)
    {
        if (b)
        {
            Preconditions.checkState(Objects.equal(a.get(i), obj));
            c.put(obj, Integer.valueOf(i));
        }
    }

    private void b(Object obj)
    {
        if (b)
        {
            c.remove(obj);
        }
    }

    public Object a(int i)
    {
        return a.get(i);
    }

    public boolean add(Object obj)
    {
        if (a(obj) == -1)
        {
            a.add(obj);
            a(obj, a.size() - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean addAll(Collection collection)
    {
        boolean flag = false;
        for (collection = collection.iterator(); collection.hasNext();)
        {
            flag |= add(collection.next());
        }

        return flag;
    }

    public void clear()
    {
        a.clear();
        if (b)
        {
            c.clear();
        }
    }

    public boolean contains(Object obj)
    {
        return a(obj) != -1;
    }

    public boolean containsAll(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public boolean isEmpty()
    {
        return a.size() == 0;
    }

    public Iterator iterator()
    {
        return new b(this);
    }

    public boolean remove(Object obj)
    {
        int i = a(obj);
        if (i == -1)
        {
            return false;
        }
        Preconditions.checkState(Objects.equal(a.get(i), obj));
        int j = a.size() - 1;
        if (i < j)
        {
            Object obj1 = a.get(j);
            a.set(i, obj1);
            a(obj1, i);
        }
        b(obj);
        a.remove(j);
        return true;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag = false;
        for (collection = collection.iterator(); collection.hasNext();)
        {
            flag |= remove(collection.next());
        }

        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException("Operation not supported by this set");
    }

    public int size()
    {
        return a.size();
    }

    public Object[] toArray()
    {
        return a.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return a.toArray(aobj);
    }
}
