// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            es, me, md, gg, 
//            jp, mi

abstract class mc extends es
{

    private final transient es a;

    mc(es es1)
    {
        a = (es)Preconditions.checkNotNull(es1);
    }

    public es a(int i, int j)
    {
        return new me(this, a.a(i, j));
    }

    public mi a(int i)
    {
        return new md(this, size(), i);
    }

    boolean a()
    {
        return true;
    }

    abstract Object b(Object obj);

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof List)
            {
                if (size() != ((List) (obj = (List)obj)).size() || !gg.a(h_(), ((List) (obj)).iterator()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public Object get(int i)
    {
        return b(a.get(i));
    }

    public int hashCode()
    {
        int i = 1;
        Iterator iterator = iterator();
        while (iterator.hasNext()) 
        {
            Object obj = iterator.next();
            int j;
            if (obj == null)
            {
                j = 0;
            } else
            {
                j = obj.hashCode();
            }
            i = j + i * 31;
        }
        return i;
    }

    public int indexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= size())
                {
                    break label1;
                }
                j = i;
                if (get(i).equals(obj))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj != null)
        {
            int i = size() - 1;
            while (i >= 0) 
            {
                if (get(i).equals(obj))
                {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public int size()
    {
        return a.size();
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    public Object[] toArray()
    {
        return jp.a(this);
    }

    public Object[] toArray(Object aobj[])
    {
        return jp.a(this, aobj);
    }
}
