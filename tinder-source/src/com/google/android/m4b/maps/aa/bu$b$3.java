// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bu

static final class nit> extends nit>
{

    final int a(Comparator comparator, Object obj, List list, int i)
    {
        int j;
        for (j = 0; j < i;)
        {
            int k = j + i >>> 1;
            if (comparator.compare(list.get(k), obj) < 0)
            {
                j = k + 1;
            } else
            {
                i = k;
            }
        }

        return j;
    }

    (String s)
    {
        super(s, 2, (byte)0);
    }
}
