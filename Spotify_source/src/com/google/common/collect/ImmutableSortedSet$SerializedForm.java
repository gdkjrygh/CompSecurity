// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuu;
import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet

class elements
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Comparator comparator;
    final Object elements[];

    Object readResolve()
    {
        cuu cuu1 = (new cuu(comparator)).c((Object[])elements);
        Object aobj[] = (Object[])cuu1.a;
        ImmutableSortedSet immutablesortedset = ImmutableSortedSet.a(cuu1.c, cuu1.b, aobj);
        cuu1.b = immutablesortedset.size();
        return immutablesortedset;
    }

    public A(Comparator comparator1, Object aobj[])
    {
        comparator = comparator1;
        elements = aobj;
    }
}
