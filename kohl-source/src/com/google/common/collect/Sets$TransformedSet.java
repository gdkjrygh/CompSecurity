// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Sets, Iterators

private static class bijection extends AbstractSet
{

    final ion bijection;
    final Set _flddelegate;

    public boolean add(Object obj)
    {
        return _flddelegate.add(bijection.invert(obj));
    }

    public void clear()
    {
        _flddelegate.clear();
    }

    public boolean contains(Object obj)
    {
        Object obj1 = bijection.invert(obj);
        return _flddelegate.contains(obj1) && Objects.equal(bijection.apply(obj1), obj);
    }

    public Iterator iterator()
    {
        return Iterators.transform(_flddelegate.iterator(), bijection);
    }

    public boolean remove(Object obj)
    {
        if (contains(obj))
        {
            return _flddelegate.remove(bijection.invert(obj));
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return _flddelegate.size();
    }

    ion(Set set, ion ion)
    {
        _flddelegate = set;
        bijection = ion;
    }
}
