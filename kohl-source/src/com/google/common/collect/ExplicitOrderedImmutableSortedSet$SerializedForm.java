// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.google.common.collect:
//            ExplicitOrderedImmutableSortedSet, ImmutableSortedSet

private static class elements
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Object elements[];

    Object readResolve()
    {
        return ImmutableSortedSet.withExplicitOrder(Arrays.asList(elements));
    }

    public (Object aobj[])
    {
        elements = aobj;
    }
}
