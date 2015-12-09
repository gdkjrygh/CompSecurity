// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a;

import com.google.b.e.a.b;
import java.util.List;

// Referenced classes of package com.google.b.e.a.a:
//            b

final class a
{

    static com.google.b.b.a a(List list)
    {
        int i = list.size() * 2 - 1;
        if (((com.google.b.e.a.a.b)list.get(list.size() - 1)).b() == null)
        {
            i--;
        }
        com.google.b.b.a a1 = new com.google.b.b.a(i * 12);
        int i1 = ((com.google.b.e.a.a.b)list.get(0)).b().a();
        int j = 11;
        for (i = 0; j >= 0; i++)
        {
            if ((1 << j & i1) != 0)
            {
                a1.b(i);
            }
            j--;
        }

        for (int j1 = 1; j1 < list.size();)
        {
            com.google.b.e.a.a.b b1 = (com.google.b.e.a.a.b)list.get(j1);
            int k1 = b1.a().a();
            for (int k = 11; k >= 0;)
            {
                if ((1 << k & k1) != 0)
                {
                    a1.b(i);
                }
                k--;
                i++;
            }

            int l = i;
            if (b1.b() != null)
            {
                int i2 = b1.b().a();
                int l1 = 11;
                do
                {
                    l = i;
                    if (l1 < 0)
                    {
                        break;
                    }
                    if ((1 << l1 & i2) != 0)
                    {
                        a1.b(i);
                    }
                    i++;
                    l1--;
                } while (true);
            }
            j1++;
            i = l;
        }

        return a1;
    }
}
