// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;


// Referenced classes of package com.b.a.c:
//            bj, f

final class bk extends bj
{

    private final bj a[];

    public transient bk(bj abj[])
    {
        super(0, new bj[0]);
        a = abj;
    }

    public final int b()
    {
        int i = 0;
        bj abj[] = a;
        int k = abj.length;
        int j = 0;
        for (; i < k; i++)
        {
            j += abj[i].b();
        }

        return j;
    }

    public final void b(f f)
    {
        bj abj[] = a;
        int j = abj.length;
        for (int i = 0; i < j; i++)
        {
            abj[i].b(f);
        }

    }
}
