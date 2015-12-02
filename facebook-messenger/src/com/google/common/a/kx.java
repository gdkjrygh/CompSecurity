// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.a:
//            hq, ld, kz

final class kx
{

    private kx()
    {
    }

    public static int a(List list, Object obj, Comparator comparator, ld ld1, kz kz1)
    {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(ld1);
        Preconditions.checkNotNull(kz1);
        Object obj1 = list;
        if (!(list instanceof RandomAccess))
        {
            obj1 = hq.a(list);
        }
        int i = 0;
        for (int j = ((List) (obj1)).size() - 1; i <= j;)
        {
            int k = i + j >>> 1;
            int l = comparator.compare(obj, ((List) (obj1)).get(k));
            if (l < 0)
            {
                j = k - 1;
            } else
            if (l > 0)
            {
                i = k + 1;
            } else
            {
                return ld1.resultIndex(comparator, obj, ((List) (obj1)).subList(i, j + 1), k - i) + i;
            }
        }

        return kz1.resultIndex(i);
    }
}
