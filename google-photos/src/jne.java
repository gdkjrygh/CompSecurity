// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jne
{

    private static final int a[] = {
        48000, 44100, 32000
    };
    private static final int b[] = {
        2, 1, 2, 3, 3, 4, 4, 5
    };
    private static final int c[] = {
        32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 
        192, 224, 256, 320, 384, 448, 512, 576, 640
    };
    private static final int d[] = {
        69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 
        417, 487, 557, 696, 835, 975, 1114, 1253, 1393
    };

    public static int a(int i, int j)
    {
        return ((i << 3) * j + 0xbb800) / 0x177000;
    }

    public static int a(jnk jnk1)
    {
        jnk1.b(32);
        int j = jnk1.c(2);
        int i = jnk1.c(6);
        j = a[j];
        int k = c[i / 2];
        if (j == 32000)
        {
            return k * 6;
        }
        if (j == 44100)
        {
            return (d[i / 2] + i % 2) * 2;
        } else
        {
            return k * 4;
        }
    }

    public static jjh a(jnk jnk1, int i, long l, String s)
    {
        i = 1;
        jnk1.b(32);
        int j = jnk1.c(2);
        jnk1.b(14);
        int k = jnk1.c(3);
        if ((k & 1) != 0 && k != 1)
        {
            jnk1.b(2);
        }
        if ((k & 4) != 0)
        {
            jnk1.b(2);
        }
        if (k == 2)
        {
            jnk1.b(2);
        }
        boolean flag = jnk1.b();
        k = b[k];
        if (!flag)
        {
            i = 0;
        }
        return jjh.a(-1, "audio/ac3", -1, -1, -1L, k + i, a[j], null, null);
    }

    public static jjh a(jnl jnl1, int i, long l, String s)
    {
        int j = jnl1.d();
        int i1 = a[(j & 0xc0) >> 6];
        int j1 = jnl1.d();
        int k = b[(j1 & 0x38) >> 3];
        j = k;
        if ((j1 & 4) != 0)
        {
            j = k + 1;
        }
        return jjh.a(i, "audio/ac3", -1, -1, l, j, i1, null, s);
    }

    public static jjh b(jnl jnl1, int i, long l, String s)
    {
        jnl1.c(2);
        int j = jnl1.d();
        int i1 = a[(j & 0xc0) >> 6];
        int j1 = jnl1.d();
        int k = b[(j1 & 0xe) >> 1];
        j = k;
        if ((j1 & 1) != 0)
        {
            j = k + 1;
        }
        return jjh.a(i, "audio/eac3", -1, -1, l, j, i1, null, s);
    }

}
