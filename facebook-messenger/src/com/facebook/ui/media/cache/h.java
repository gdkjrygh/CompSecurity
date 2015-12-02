// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import com.facebook.common.time.a;
import java.util.Comparator;

// Referenced classes of package com.facebook.ui.media.cache:
//            g, i

class h
    implements Comparator
{

    final g a;
    private long b;

    public h(g g1)
    {
        a = g1;
        super();
        b = com.facebook.ui.media.cache.g.a(g1).a() / 0x1d4c0L;
    }

    public int a(i j, i k)
    {
        long l = i.e(j) / 0x1d4c0L;
        long l1 = i.e(k) / 0x1d4c0L;
        long l2 = i.e(j);
        long l3 = i.e(k);
        if (l >= l1)
        {
            if (l > l1)
            {
                return 1;
            }
            if (l == b)
            {
                if (l2 >= l3)
                {
                    return l2 <= l3 ? 0 : 1;
                }
            } else
            {
                return i.b(k) - i.b(j);
            }
        }
        return -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((i)obj, (i)obj1);
    }
}
