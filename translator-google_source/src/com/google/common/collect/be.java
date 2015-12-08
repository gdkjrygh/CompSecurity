// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ej, dm, ImmutableMultiset

final class be extends ej
{

    int a;
    Object b;
    final Iterator c;
    final ImmutableMultiset d;

    be(ImmutableMultiset immutablemultiset, Iterator iterator)
    {
        d = immutablemultiset;
        c = iterator;
        super();
    }

    public final boolean hasNext()
    {
        return a > 0 || c.hasNext();
    }

    public final Object next()
    {
        if (a <= 0)
        {
            dm dm1 = (dm)c.next();
            b = dm1.getElement();
            a = dm1.getCount();
        }
        a = a - 1;
        return b;
    }
}
