// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.h;
import c.i;
import c.n;
import c.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.c.a.a.b:
//            l, m, d

final class k
{

    int a;
    final h b;
    private final n c;

    public k(h h1)
    {
        c = new n(new l(this, h1), new m(this));
        b = o.a(c);
    }

    private i a()
        throws IOException
    {
        int j = b.g();
        return b.c(j);
    }

    public final List a(int j)
        throws IOException
    {
        a = a + j;
        int k1 = b.g();
        if (k1 < 0)
        {
            throw new IOException((new StringBuilder("numberOfPairs < 0: ")).append(k1).toString());
        }
        if (k1 > 1024)
        {
            throw new IOException((new StringBuilder("numberOfPairs > 1024: ")).append(k1).toString());
        }
        ArrayList arraylist = new ArrayList(k1);
        for (j = 0; j < k1; j++)
        {
            i i1 = a().c();
            i j1 = a();
            if (i1.c.length == 0)
            {
                throw new IOException("name.size == 0");
            }
            arraylist.add(new d(i1, j1));
        }

        if (a > 0)
        {
            c.a();
            if (a != 0)
            {
                throw new IOException((new StringBuilder("compressedLimit > 0: ")).append(a).toString());
            }
        }
        return arraylist;
    }
}
