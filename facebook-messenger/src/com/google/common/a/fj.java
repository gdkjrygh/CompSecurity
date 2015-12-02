// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            fi, gg, ei, jp, 
//            mh, es

abstract class fj extends fi
{

    final transient Object a[];

    fj(Object aobj[])
    {
        a = aobj;
    }

    boolean a()
    {
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        if (collection != this)
        {
            if (!(collection instanceof fj))
            {
                return super.containsAll(collection);
            }
            if (collection.size() > size())
            {
                return false;
            }
            collection = ((Collection) (((fj)collection).a));
            int k = collection.length;
            int j = 0;
            while (j < k) 
            {
                if (!contains(collection[j]))
                {
                    return false;
                }
                j++;
            }
        }
        return true;
    }

    public mh h_()
    {
        return gg.a(a);
    }

    es i()
    {
        return new ei(a, this);
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return a.length;
    }

    public Object[] toArray()
    {
        Object aobj[] = new Object[size()];
        System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, size());
        return aobj;
    }

    public Object[] toArray(Object aobj[])
    {
        int j = size();
        if (aobj.length >= j) goto _L2; else goto _L1
_L1:
        Object aobj1[] = jp.a(aobj, j);
_L4:
        System.arraycopy(((Object) (a)), 0, ((Object) (aobj1)), 0, j);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > j)
        {
            aobj[j] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
