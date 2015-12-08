// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            ForwardingMultiset, Constraints, Multiset, Constraint

static class constraint extends ForwardingMultiset
{

    private final Constraint constraint;
    private Multiset _flddelegate;

    public int add(Object obj, int i)
    {
        constraint.checkElement(obj);
        return _flddelegate.add(obj, i);
    }

    public boolean add(Object obj)
    {
        return standardAdd(obj);
    }

    public boolean addAll(Collection collection)
    {
        return _flddelegate.addAll(Constraints.access$000(collection, constraint));
    }

    protected Multiset _mthdelegate()
    {
        return _flddelegate;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    public int setCount(Object obj, int i)
    {
        constraint.checkElement(obj);
        return _flddelegate.setCount(obj, i);
    }

    public boolean setCount(Object obj, int i, int j)
    {
        constraint.checkElement(obj);
        return _flddelegate.setCount(obj, i, j);
    }

    public (Multiset multiset, Constraint constraint1)
    {
        _flddelegate = (Multiset)Preconditions.checkNotNull(multiset);
        constraint = (Constraint)Preconditions.checkNotNull(constraint1);
    }
}
