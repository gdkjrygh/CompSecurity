// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.Pair;

public final class jnf
{

    private static final byte a[] = {
        0, 0, 0, 1
    };
    private static final int b[] = {
        0x17700, 0x15888, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 
        11025, 8000, 7350
    };
    private static final int c[] = {
        0, 1, 2, 3, 4, 5, 6, 8, -1, -1, 
        -1, 7, 8, -1, 8, -1
    };

    public static Pair a(byte abyte0[])
    {
        int i;
        int j;
        int k;
        boolean flag1 = true;
        abyte0 = new jnk(abyte0);
        i = abyte0.c(5);
        j = abyte0.c(4);
        if (j == 15)
        {
            j = abyte0.c(24);
        } else
        {
            if (j < 13)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c.a(flag);
            j = b[j];
        }
        k = abyte0.c(4);
        if (i != 5 && i != 29) goto _L2; else goto _L1
_L1:
        i = abyte0.c(4);
        if (i == 15)
        {
            i = abyte0.c(24);
        } else
        {
            if (i < 13)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c.a(flag);
            i = b[i];
        }
        j = i;
        if (abyte0.c(5) != 22) goto _L2; else goto _L3
_L3:
        j = abyte0.c(4);
_L5:
        j = c[j];
        boolean flag;
        if (j != -1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c.a(flag);
        return Pair.create(Integer.valueOf(i), Integer.valueOf(j));
_L2:
        i = j;
        j = k;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static jng a(jnk jnk1)
    {
        boolean flag = true;
        boolean flag1 = true;
        int i = jnk1.c(8);
        jnk1.b(16);
        jnk1.e();
        float f;
        float f1;
        int j;
        int l;
        int j1;
        int l1;
        long l3;
        boolean flag2;
        if (i == 100 || i == 110 || i == 122 || i == 244 || i == 44 || i == 83 || i == 86 || i == 118 || i == 128 || i == 138)
        {
            int i3 = jnk1.e();
            if (i3 == 3)
            {
                jnk1.b(1);
            }
            jnk1.e();
            jnk1.e();
            jnk1.b(1);
            if (jnk1.b())
            {
                byte byte0;
                int k;
                if (i3 != 3)
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 12;
                }
label0:
                for (k = 0; k < byte0; k++)
                {
                    if (!jnk1.b())
                    {
                        continue;
                    }
                    byte byte1;
                    int k1;
                    int i2;
                    int k2;
                    if (k < 6)
                    {
                        byte1 = 16;
                    } else
                    {
                        byte1 = 64;
                    }
                    k1 = 0;
                    k2 = 8;
                    i2 = 8;
                    do
                    {
                        if (k1 >= byte1)
                        {
                            continue label0;
                        }
                        i = k2;
                        if (k2 != 0)
                        {
                            i = (jnk1.d() + i2 + 256) % 256;
                        }
                        if (i != 0)
                        {
                            i2 = i;
                        }
                        k1++;
                        k2 = i;
                    } while (true);
                }

            }
            j = i3;
        } else
        {
            j = 1;
        }
        jnk1.e();
        l3 = jnk1.e();
        if (l3 == 0L)
        {
            jnk1.e();
        } else
        if (l3 == 1L)
        {
            jnk1.b(1);
            jnk1.d();
            jnk1.d();
            long l4 = jnk1.e();
            i = 0;
            while ((long)i < l4) 
            {
                jnk1.e();
                i++;
            }
        }
        jnk1.e();
        jnk1.b(1);
        j1 = jnk1.e();
        l = jnk1.e();
        flag2 = jnk1.b();
        if (flag2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!flag2)
        {
            jnk1.b(1);
        }
        jnk1.b(1);
        j1 = j1 + 1 << 4;
        l1 = (2 - i) * (l + 1) << 4;
        if (jnk1.b())
        {
            int j3 = jnk1.e();
            int k3 = jnk1.e();
            int j2 = jnk1.e();
            int l2 = jnk1.e();
            if (j == 0)
            {
                if (flag2)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                i = 2 - i;
                j = ((flag1) ? 1 : 0);
            } else
            {
                if (j == 3)
                {
                    i = 1;
                } else
                {
                    i = 2;
                }
                if (j == 1)
                {
                    j = 2;
                } else
                {
                    j = 1;
                }
                if (flag2)
                {
                    i1 = ((flag) ? 1 : 0);
                } else
                {
                    i1 = 0;
                }
                i1 = j * (2 - i1);
                j = i;
                i = i1;
            }
            j = j1 - (j3 + k3) * j;
            i = l1 - i * (j2 + l2);
        } else
        {
            i = l1;
            j = j1;
        }
        f1 = 1.0F;
        f = f1;
        if (jnk1.b())
        {
            f = f1;
            if (jnk1.b())
            {
                int i1 = jnk1.c(8);
                if (i1 == 255)
                {
                    i1 = jnk1.c(16);
                    j1 = jnk1.c(16);
                    if (i1 != 0 && j1 != 0)
                    {
                        f = (float)i1 / (float)j1;
                    } else
                    {
                        f = 1.0F;
                    }
                } else
                if (i1 < jnj.b.length)
                {
                    f = jnj.b[i1];
                } else
                {
                    Log.w("CodecSpecificDataUtil", (new StringBuilder(46)).append("Unexpected aspect_ratio_idc value: ").append(i1).toString());
                    f = f1;
                }
            }
        }
        return new jng(j, i, f);
    }

    public static byte[] a(int i, int j, int k)
    {
        return (new byte[] {
            (byte)(i << 3 & 0xf8 | j >> 1 & 7), (byte)(j << 7 & 0x80 | k << 3 & 0x78)
        });
    }

    public static byte[] a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[a.length + j];
        System.arraycopy(a, 0, abyte1, 0, a.length);
        System.arraycopy(abyte0, i, abyte1, a.length, j);
        return abyte1;
    }

}
