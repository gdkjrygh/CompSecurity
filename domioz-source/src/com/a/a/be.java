// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;


// Referenced classes of package com.a.a:
//            f

abstract class be
{

    private final int a;
    private final be b[];

    public transient be(int i, be abe[])
    {
        a = i;
        b = abe;
    }

    private int c()
    {
        int j = a();
        be abe[] = b;
        int k = abe.length;
        for (int i = 0; i < k; i++)
        {
            j += abe[i].b();
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
        be abe[] = b;
        int j = abe.length;
        for (int i = 0; i < j; i++)
        {
            abe[i].b(f1);
        }

    }
}
