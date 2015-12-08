// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.b;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.b.b.b:
//            b, a

public final class d
{

    private final a a;
    private final List b = new ArrayList();

    public d(a a1)
    {
        a = a1;
        b.add(new b(a1, new int[] {
            1
        }));
    }

    private b a(int i)
    {
        if (i >= b.size())
        {
            b b1 = (b)b.get(b.size() - 1);
            for (int j = b.size(); j <= i; j++)
            {
                b1 = b1.b(new b(a, new int[] {
                    1, a.a((j - 1) + a.d())
                }));
                b.add(b1);
            }

        }
        return (b)b.get(i);
    }

    public void a(int ai[], int i)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int j = ai.length - i;
        if (j <= 0)
        {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b b1 = a(i);
        int ai2[] = new int[j];
        System.arraycopy(ai, 0, ai2, 0, j);
        int ai1[] = (new b(a, ai2)).a(i, 1).c(b1)[1].a();
        int k = i - ai1.length;
        for (i = 0; i < k; i++)
        {
            ai[j + i] = 0;
        }

        System.arraycopy(ai1, 0, ai, j + k, ai1.length);
    }
}
