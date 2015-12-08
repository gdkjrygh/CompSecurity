// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;


// Referenced classes of package com.a.a.c:
//            at, f

private static abstract class b
{

    private final int a;
    private final b b[];

    private int c()
    {
        int j = a();
        t at1[] = b;
        int k = at1.length;
        for (int i = 0; i < k; i++)
        {
            j += at1[i].b();
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
        a aa[] = b;
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            aa[i].b(f1);
        }

    }

    public transient t(int i, t at1[])
    {
        a = i;
        b = at1;
    }
}
