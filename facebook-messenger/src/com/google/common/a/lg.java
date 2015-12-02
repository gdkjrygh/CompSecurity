// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.a:
//            ld

final class lg extends ld
{

    lg(String s, int i)
    {
        super(s, i, null);
    }

    int resultIndex(Comparator comparator, Object obj, List list, int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < j;)
        {
            int k = i + j >>> 1;
            if (comparator.compare(list.get(k), obj) < 0)
            {
                i = k + 1;
            } else
            {
                j = k;
            }
        }

        return i;
    }
}
