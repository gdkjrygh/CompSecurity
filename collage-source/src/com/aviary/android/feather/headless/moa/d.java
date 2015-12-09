// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            b

public final class d
    implements Serializable, Cloneable, List
{

    protected List a;

    protected d()
    {
        a = Collections.synchronizedList(new LinkedList());
    }

    public b a(int i)
    {
        return (b)a.get(i);
    }

    public b a(String s)
    {
label0:
        {
            b b1;
            synchronized (a)
            {
                Iterator iterator1 = a.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break label0;
                    }
                    b1 = (b)iterator1.next();
                } while (!s.equals(b1.b()));
            }
            return b1;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(int i, b b1)
    {
        a.add(i, b1);
    }

    public boolean a(b b1)
    {
        return a.add(b1);
    }

    public void add(int i, Object obj)
    {
        a(i, (b)obj);
    }

    public boolean add(Object obj)
    {
        return a((b)obj);
    }

    public boolean addAll(int i, Collection collection)
    {
        return a.addAll(i, collection);
    }

    public boolean addAll(Collection collection)
    {
        return a.addAll(collection);
    }

    public b b(int i)
    {
        return (b)a.remove(i);
    }

    public b b(int i, b b1)
    {
        return (b)a.set(i, b1);
    }

    public void clear()
    {
        a.clear();
    }

    public Object clone()
    {
        Object obj = new d();
        List list = a;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator1 = a.iterator();
_L1:
        boolean flag = iterator1.hasNext();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        ((d) (obj)).a((b)((b)iterator1.next()).clone());
          goto _L1
        CloneNotSupportedException clonenotsupportedexception;
        clonenotsupportedexception;
        clonenotsupportedexception.printStackTrace();
          goto _L1
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        list;
        JVM INSTR monitorexit ;
        return obj;
    }

    public boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    public Object get(int i)
    {
        return a(i);
    }

    public int indexOf(Object obj)
    {
        return a.indexOf(obj);
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return a.iterator();
    }

    public int lastIndexOf(Object obj)
    {
        return a.lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        return a.listIterator();
    }

    public ListIterator listIterator(int i)
    {
        return a.listIterator(i);
    }

    public Object remove(int i)
    {
        return b(i);
    }

    public boolean remove(Object obj)
    {
        return a.remove(obj);
    }

    public boolean removeAll(Collection collection)
    {
        return a.removeAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return false;
    }

    public Object set(int i, Object obj)
    {
        return b(i, (b)obj);
    }

    public int size()
    {
        return a.size();
    }

    public List subList(int i, int j)
    {
        return a.subList(i, j);
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
