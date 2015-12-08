// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.io.IOException;

// Referenced classes of package com.a.a.c:
//            V, f

private static abstract class b
{

    private final int a;
    private final b b[];

    private int c()
    {
        int k = a();
        ct act[] = b;
        int l = act.length;
        for (int i = 0; i < l; i++)
        {
            k += act[i].b();
        }

        return k;
    }

    public int a()
    {
        return 0;
    }

    public void a(f f1)
        throws IOException
    {
    }

    public int b()
    {
        int i = c();
        return i + f.f(i) + f.d(a);
    }

    public void b(f f1)
        throws IOException
    {
        f1.e(a, 2);
        f1.e(c());
        a(f1);
        a aa[] = b;
        int k = aa.length;
        for (int i = 0; i < k; i++)
        {
            aa[i].b(f1);
        }

    }

    public transient ption(int i, ption aption[])
    {
        a = i;
        if (aption == null)
        {
            aption = V.a();
        }
        b = aption;
    }
}
