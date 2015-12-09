// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cvi;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableAsList, ImmutableList, ImmutableCollection

class RegularImmutableAsList extends ImmutableAsList
{

    private final ImmutableCollection _flddelegate;
    private final ImmutableList delegateList;

    RegularImmutableAsList(ImmutableCollection immutablecollection, ImmutableList immutablelist)
    {
        _flddelegate = immutablecollection;
        delegateList = immutablelist;
    }

    RegularImmutableAsList(ImmutableCollection immutablecollection, Object aobj[])
    {
        this(immutablecollection, ImmutableList.b(aobj, aobj.length));
    }

    final int a(Object aobj[], int i)
    {
        return delegateList.a(aobj, i);
    }

    public final cvi a(int i)
    {
        return delegateList.a(i);
    }

    ImmutableCollection c()
    {
        return _flddelegate;
    }

    public Object get(int i)
    {
        return delegateList.get(i);
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }
}
