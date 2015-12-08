// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;


// Referenced classes of package com.a.a:
//            be, f

final class bf extends be
{

    private final be a[];

    public transient bf(be abe[])
    {
        super(0, new be[0]);
        a = abe;
    }

    public final int b()
    {
        int i = 0;
        be abe[] = a;
        int k = abe.length;
        int j = 0;
        for (; i < k; i++)
        {
            j += abe[i].b();
        }

        return j;
    }

    public final void b(f f)
    {
        be abe[] = a;
        int j = abe.length;
        for (int i = 0; i < j; i++)
        {
            abe[i].b(f);
        }

    }
}
