// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingListIterator, Constraints, Constraint

static class constraint extends ForwardingListIterator
{

    private final Constraint constraint;
    private final ListIterator _flddelegate;

    public void add(Object obj)
    {
        constraint.checkElement(obj);
        _flddelegate.add(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Iterator _mthdelegate()
    {
        return _mthdelegate();
    }

    protected ListIterator _mthdelegate()
    {
        return _flddelegate;
    }

    public void set(Object obj)
    {
        constraint.checkElement(obj);
        _flddelegate.set(obj);
    }

    public (ListIterator listiterator, Constraint constraint1)
    {
        _flddelegate = listiterator;
        constraint = constraint1;
    }
}
