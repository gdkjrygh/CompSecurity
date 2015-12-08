// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingList, Constraints, Constraint

private static class constraint extends ForwardingList
{

    final Constraint constraint;
    final List _flddelegate;

    public void add(int i, Object obj)
    {
        constraint.checkElement(obj);
        _flddelegate.add(i, obj);
    }

    public boolean add(Object obj)
    {
        constraint.checkElement(obj);
        return _flddelegate.add(obj);
    }

    public boolean addAll(int i, Collection collection)
    {
        return _flddelegate.addAll(i, Constraints.access$000(collection, constraint));
    }

    public boolean addAll(Collection collection)
    {
        return _flddelegate.addAll(Constraints.access$000(collection, constraint));
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected List _mthdelegate()
    {
        return _flddelegate;
    }

    public ListIterator listIterator()
    {
        return Constraints.access$100(_flddelegate.listIterator(), constraint);
    }

    public ListIterator listIterator(int i)
    {
        return Constraints.access$100(_flddelegate.listIterator(i), constraint);
    }

    public Object set(int i, Object obj)
    {
        constraint.checkElement(obj);
        return _flddelegate.set(i, obj);
    }

    public List subList(int i, int j)
    {
        return Constraints.constrainedList(_flddelegate.subList(i, j), constraint);
    }

    (List list, Constraint constraint1)
    {
        _flddelegate = (List)Preconditions.checkNotNull(list);
        constraint = (Constraint)Preconditions.checkNotNull(constraint1);
    }
}
