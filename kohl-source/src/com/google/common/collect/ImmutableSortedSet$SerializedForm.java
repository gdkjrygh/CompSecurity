// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet

private static class elements
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Comparator comparator;
    final Object elements[];

    Object readResolve()
    {
        return (new elements(comparator)).comparator((Object[])elements).elements();
    }

    public A(Comparator comparator1, Object aobj[])
    {
        comparator = comparator1;
        elements = aobj;
    }
}
