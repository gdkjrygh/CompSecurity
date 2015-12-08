// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.math.ec:
//            ECConstants

final class c
{

    private int a[];

    public c(int i)
    {
        a = new int[i];
    }

    public c(BigInteger biginteger, int i)
    {
        int j = 1;
        super();
        if (biginteger.signum() == -1)
        {
            throw new IllegalArgumentException("Only positive Integers allowed");
        }
        if (biginteger.equals(ECConstants.f))
        {
            a = (new int[] {
                0
            });
        } else
        {
            biginteger = biginteger.toByteArray();
            int k = biginteger.length;
            int k1;
            int i2;
            if (biginteger[0] == 0)
            {
                k--;
            } else
            {
                j = 0;
            }
            k1 = (k + 3) / 4;
            if (k1 < i)
            {
                a = new int[i];
            } else
            {
                a = new int[k1];
            }
            k1--;
            i2 = k % 4 + j;
            if (j < i2)
            {
                i = j;
                int l;
                for (j = 0; i < i2; j = l | j << 8)
                {
                    byte byte0 = biginteger[i];
                    l = byte0;
                    if (byte0 < 0)
                    {
                        l = byte0 + 256;
                    }
                    i++;
                }

                a[k1] = j;
                int i1 = k1 - 1;
                j = i;
                i = i1;
            } else
            {
                i = k1;
            }
            while (i >= 0) 
            {
                int j1 = 0;
                for (k1 = 0; k1 < 4;)
                {
                    byte byte1 = biginteger[j];
                    int l1 = byte1;
                    if (byte1 < 0)
                    {
                        l1 = byte1 + 256;
                    }
                    k1++;
                    j1 = l1 | j1 << 8;
                    j++;
                }

                a[i] = j1;
                i--;
            }
        }
    }

    private c(int ai[])
    {
        a = ai;
    }

    private int d()
    {
        int j = a.length;
        if (j <= 0)
        {
            return 0;
        }
        int i = j;
        if (a[0] != 0)
        {
            int ai[];
            do
            {
                ai = a;
                i = j - 1;
                j = i;
            } while (ai[i] == 0);
            return i + 1;
        }
        do
        {
            int ai1[] = a;
            j = i - 1;
            if (ai1[j] != 0)
            {
                return j + 1;
            }
            i = j;
        } while (j > 0);
        return 0;
    }

    private int[] d(int i)
    {
        int ai[] = new int[i];
        int k = a.length;
        int j = i;
        if (k < i)
        {
            j = k;
        }
        System.arraycopy(a, 0, ai, 0, j);
        return ai;
    }

    private void e(int i)
    {
        int j = i >> 5;
        int ai[] = a;
        ai[j] = 1 << (i & 0x1f) ^ ai[j];
    }

    public final c a(int i)
    {
        int k;
        for (k = d(); k == 0 || i == 0;)
        {
            return this;
        }

        if (i > 31)
        {
            throw new IllegalArgumentException((new StringBuilder("shiftLeft() for max 31 bits , ")).append(i).append("bit shift is not possible").toString());
        }
        int ai[] = new int[k + 1];
        int l = 32 - i;
        ai[0] = a[0] << i;
        for (int j = 1; j < k; j++)
        {
            ai[j] = a[j] << i | a[j - 1] >>> l;
        }

        ai[k] = a[k - 1] >>> l;
        return new c(ai);
    }

    public final void a(int i, int ai[])
    {
label0:
        for (int j = (i + i) - 2; j >= i; j--)
        {
            int k;
            int l;
            if ((a[j >> 5] & 1 << (j & 0x1f)) != 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k == 0)
            {
                continue;
            }
            l = j - i;
            e(l);
            e(j);
            k = 3;
            do
            {
                k--;
                if (k < 0)
                {
                    continue label0;
                }
                e(ai[k] + l);
            } while (true);
        }

        a = d(i + 31 >> 5);
    }

    public final void a(c c1, int i)
    {
        int l = c1.d();
        int j = l + i;
        if (j > a.length)
        {
            a = d(j);
        }
        for (int k = 0; k < l; k++)
        {
            int ai[] = a;
            int i1 = k + i;
            ai[i1] = ai[i1] ^ c1.a[k];
        }

    }

    public final boolean a()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (a.length != 0)
            {
                flag = flag1;
                if (a[0] != 0)
                {
                    break label0;
                }
                flag = flag1;
                if (d() != 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final int b()
    {
        int i = d();
        if (i != 0) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        i--;
        int j = a[i];
        i = (i << 5) + 1;
        if ((0xffff0000 & j) != 0)
        {
            if ((0xff000000 & j) != 0)
            {
                i += 24;
                j >>>= 24;
            } else
            {
                i += 16;
                j >>>= 16;
            }
        } else
        if (j > 255)
        {
            i += 8;
            j >>>= 8;
        }
        k = i;
        if (j != 1)
        {
            j >>>= 1;
            i++;
            break MISSING_BLOCK_LABEL_54;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final c b(c c1, int i)
    {
        int k1 = i + 31 >> 5;
        if (a.length < k1)
        {
            a = d(k1);
        }
        c1 = new c(c1.d(c1.a.length + 1));
        c c2 = new c(i + i + 31 >> 5);
        int k = 0;
        for (int j = 1; k < 32; j <<= 1)
        {
            for (i = 0; i < k1; i++)
            {
                if ((a[i] & j) != 0)
                {
                    c2.a(c1, i);
                }
            }

            i = c1.d();
            if (i != 0)
            {
                int l = i;
                if (c1.a[i - 1] < 0)
                {
                    i++;
                    l = i;
                    if (i > c1.a.length)
                    {
                        c1.a = c1.d(c1.a.length + 1);
                        l = i;
                    }
                }
                int i1 = 0;
                int j1 = 0;
                while (i1 < l) 
                {
                    int ai[];
                    if (c1.a[i1] < 0)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    ai = c1.a;
                    ai[i1] = ai[i1] << 1;
                    if (j1 != 0)
                    {
                        int ai1[] = c1.a;
                        ai1[i1] = ai1[i1] | 1;
                    }
                    i1++;
                    j1 = i;
                }
            }
            k++;
        }

        return c2;
    }

    public final void b(int i)
    {
        int j = i >> 5;
        int ai[] = a;
        ai[j] = 1 << (i & 0x1f) | ai[j];
    }

    public final BigInteger c()
    {
        int k1 = d();
        if (k1 == 0)
        {
            return ECConstants.f;
        }
        int l1 = a[k1 - 1];
        byte abyte0[] = new byte[4];
        int k = 3;
        boolean flag = false;
        int i;
        int l;
        for (i = 0; k >= 0; i = l)
        {
label0:
            {
                byte byte0 = (byte)(l1 >>> k * 8);
                if (!flag)
                {
                    l = i;
                    if (byte0 == 0)
                    {
                        break label0;
                    }
                }
                abyte0[i] = byte0;
                l = i + 1;
                flag = true;
            }
            k--;
        }

        byte abyte1[] = new byte[(k1 - 1) * 4 + i];
        for (k = 0; k < i; k++)
        {
            abyte1[k] = abyte0[k];
        }

        int i1 = k1 - 2;
        k = i;
        for (int j = i1; j >= 0; j--)
        {
            for (int j1 = 3; j1 >= 0;)
            {
                abyte1[k] = (byte)(a[j] >>> j1 * 8);
                j1--;
                k++;
            }

        }

        return new BigInteger(1, abyte1);
    }

    public final c c(int i)
    {
        int ai[] = new int[16];
        int[] _tmp = ai;
        ai[0] = 0;
        ai[1] = 1;
        ai[2] = 4;
        ai[3] = 5;
        ai[4] = 16;
        ai[5] = 17;
        ai[6] = 20;
        ai[7] = 21;
        ai[8] = 64;
        ai[9] = 65;
        ai[10] = 68;
        ai[11] = 69;
        ai[12] = 80;
        ai[13] = 81;
        ai[14] = 84;
        ai[15] = 85;
        int l = i + 31 >> 5;
        if (a.length < l)
        {
            a = d(l);
        }
        c c1 = new c(l + l);
        for (i = 0; i < l; i++)
        {
            int j = 0;
            int k = 0;
            for (; j < 4; j++)
            {
                k = k >>> 8 | ai[a[i] >>> j * 4 & 0xf] << 24;
            }

            c1.a[i + i] = k;
            int i1 = a[i];
            j = 0;
            k = 0;
            for (; j < 4; j++)
            {
                k = k >>> 8 | ai[i1 >>> 16 >>> j * 4 & 0xf] << 24;
            }

            c1.a[i + i + 1] = k;
        }

        return c1;
    }

    public final Object clone()
    {
        return new c(Arrays.b(a));
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof c) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (c)obj;
        int j = d();
        if (((c) (obj)).d() == j)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (a[i] != ((c) (obj)).a[i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final int hashCode()
    {
        int k = d();
        int j = 1;
        for (int i = 0; i < k; i++)
        {
            j = j * 31 + a[i];
        }

        return j;
    }

    public final String toString()
    {
        int i = d();
        if (i == 0)
        {
            return "0";
        }
        StringBuffer stringbuffer = new StringBuffer(Integer.toBinaryString(a[i - 1]));
        for (i -= 2; i >= 0; i--)
        {
            String s = Integer.toBinaryString(a[i]);
            for (int j = s.length(); j < 8; j++)
            {
                s = (new StringBuilder("0")).append(s).toString();
            }

            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }
}
