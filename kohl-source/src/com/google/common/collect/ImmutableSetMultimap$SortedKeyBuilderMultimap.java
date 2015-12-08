// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeMap;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, ImmutableSetMultimap, Sets, Multimap

private static class putAll extends AbstractMultimap
{

    private static final long serialVersionUID = 0L;

    Collection createCollection()
    {
        return Sets.newLinkedHashSet();
    }

    (Comparator comparator, Multimap multimap)
    {
        super(new TreeMap(comparator));
        putAll(multimap);
    }
}
