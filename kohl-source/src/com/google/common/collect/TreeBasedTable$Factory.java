// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Comparator;
import java.util.TreeMap;

// Referenced classes of package com.google.common.collect:
//            TreeBasedTable

private static class comparator
    implements Supplier, Serializable
{

    private static final long serialVersionUID = 0L;
    final Comparator comparator;

    public volatile Object get()
    {
        return get();
    }

    public TreeMap get()
    {
        return new TreeMap(comparator);
    }

    (Comparator comparator1)
    {
        comparator = comparator1;
    }
}
