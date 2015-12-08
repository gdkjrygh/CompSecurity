// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

final class ckc
{

    private static final byte a[] = {
        0, 0, 0, 1
    };

    public static double a(int i)
    {
        return (double)i / 65536D;
    }

    public static int a(ckd ckd1)
    {
        return ckd1.c() >> 24 & 0xff;
    }

    public static void a(ByteBuffer bytebuffer, int i)
    {
        int i1 = bytebuffer.position() - i;
        int l;
        for (int j = i1; j < i1 + i; j = l + 4 + j)
        {
            bytebuffer.position(j);
            l = bytebuffer.get() & 0xff;
            for (int k = 1; k < 4; k++)
            {
                l = l << 8 | bytebuffer.get() & 0xff;
            }

            b.a(l, "result", "Non-zero top bit");
            bytebuffer.position(j);
            bytebuffer.put(a);
        }

        bytebuffer.position(i1 + i);
    }

}
