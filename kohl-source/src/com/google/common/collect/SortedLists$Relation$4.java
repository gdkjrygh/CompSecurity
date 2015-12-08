// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            SortedLists

static final class nit> extends nit>
{

    int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag)
    {
        if (!flag)
        {
            return j;
        }
        for (i = j; i < k;)
        {
            j = i + ((k - i) + 1) / 2;
            if (comparator.compare(list.get(j), obj) > 0)
            {
                k = j - 1;
            } else
            {
                i = j;
            }
        }

        return i;
    }

    int exactMatchNotFound(List list, Object obj, int i, Comparator comparator)
    {
        return i;
    }

    nit> reverse()
    {
        return FLOOR;
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
