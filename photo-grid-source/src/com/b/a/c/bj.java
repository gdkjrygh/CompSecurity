// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;


// Referenced classes of package com.b.a.c:
//            az, f

abstract class bj
{

    private final int a;
    private final bj b[];

    public transient bj(int i, bj abj[])
    {
        a = i;
        if (abj == null)
        {
            abj = az.a();
        }
        b = abj;
    }

    private int c()
    {
        int j = a();
        bj abj[] = b;
        int k = abj.length;
        for (int i = 0; i < k; i++)
        {
            j += abj[i].b();
        }

        return j;
    }

    public int a()
    {
        return 0;
    }

    public void a(f f1)
    {
    }

    public int b()
    {
        int i = c();
        return i + f.f(i) + f.d(a);
    }

    public void b(f f1)
    {
        f1.e(a, 2);
        f1.e(c());
        a(f1);
        bj abj[] = b;
        int j = abj.length;
        for (int i = 0; i < j; i++)
        {
            abj[i].b(f1);
        }

    }
}
