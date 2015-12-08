// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, Constraints, Constraint

static class constraint extends ForwardingSet
{

    private final Constraint constraint;
    private final Set _flddelegate;

    public boolean add(Object obj)
    {
        constraint.checkElement(obj);
        return _flddelegate.add(obj);
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

    protected Set _mthdelegate()
    {
        return _flddelegate;
    }

    public (Set set, Constraint constraint1)
    {
        _flddelegate = (Set)Preconditions.checkNotNull(set);
        constraint = (Constraint)Preconditions.checkNotNull(constraint1);
    }
}
