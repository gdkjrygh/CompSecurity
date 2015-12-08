// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.c;


// Referenced classes of package com.google.android.m4b.maps.c:
//            a

final class c
    implements c
{

    private int a;
    private int b;
    private int c;
    private c d;
    private c e;

    public final void a()
    {
        if (b > 0)
        {
            int i = a;
            int j = a(e).e;
            int k = b;
            int l = b(e).e;
            d.d(d(e).e[i << j - k & l]);
            c = c + 1;
            if (c(e) != null)
            {
                for (; c % c(e).e != 0; c = c + 1)
                {
                    d.d(d(e).charValue());
                }

            }
        }
    }

    public final void a(byte byte0)
    {
        a = a << 8;
        a = a | byte0 & 0xff;
        for (b = b + 8; b >= b(e).e; b = b - b(e).e)
        {
            byte0 = a;
            int i = b;
            int j = b(e).e;
            int k = e(e).e;
            d.d(d(e).e[byte0 >> i - j & k]);
            c = c + 1;
        }

    }

    ( ,  1)
    {
        e = ;
        d = 1;
        super();
        a = 0;
        b = 0;
        c = 0;
    }
}
