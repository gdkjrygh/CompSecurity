// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;


// Referenced classes of package com.a.a.c:
//            at, f

private static final class a extends a
{

    private final b a[];

    public final int b()
    {
        int j = 0;
        a aa[] = a;
        int l = aa.length;
        int k = 0;
        for (; j < l; j++)
        {
            k += aa[j].b();
        }

        return k;
    }

    public final void b(f f)
    {
        b ab[] = a;
        int k = ab.length;
        for (int j = 0; j < k; j++)
        {
            ab[j].b(f);
        }

    }

    public transient ( a1[])
    {
        super(0, new <init>[0]);
        a = a1;
    }
}
