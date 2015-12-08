// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            SetMultimap

public interface SortedSetMultimap
    extends SetMultimap
{

    public abstract Map asMap();

    public abstract SortedSet get(Object obj);

    public abstract SortedSet removeAll(Object obj);

    public abstract SortedSet replaceValues(Object obj, Iterable iterable);

    public abstract Comparator valueComparator();
}
