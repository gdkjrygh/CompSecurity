// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class jnj
{

    public static final byte a[] = {
        0, 0, 0, 1
    };
    public static final float b[] = {
        1.0F, 1.0F, 1.090909F, 0.9090909F, 1.454545F, 1.212121F, 2.181818F, 1.818182F, 2.909091F, 2.424242F, 
        1.636364F, 1.363636F, 1.939394F, 1.616162F, 1.333333F, 1.5F, 2.0F
    };
    private static final Object c = new Object();
    private static int d[] = new int[10];

    public static int a(byte abyte0[], int i)
    {
        int i1 = 0;
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        int j;
        int l;
        l = 0;
        j = 0;
_L6:
        if (j >= i)
        {
            break MISSING_BLOCK_LABEL_211;
        }
_L8:
        if (j >= i - 2) goto _L2; else goto _L1
_L1:
        if (abyte0[j] != 0 || abyte0[j + 1] != 0 || abyte0[j + 2] != 3) goto _L4; else goto _L3
_L3:
        int k = j;
_L9:
        j = k;
        if (k >= i) goto _L6; else goto _L5
_L5:
        if (d.length <= l)
        {
            d = Arrays.copyOf(d, d.length << 1);
        }
        d[l] = k;
        j = k + 3;
        l++;
          goto _L6
_L7:
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        i1 = d[i] - j;
        System.arraycopy(abyte0, j, abyte0, k, i1);
        k += i1;
        int k1 = k + 1;
        abyte0[k] = 0;
        k = k1 + 1;
        abyte0[k1] = 0;
        j += i1 + 3;
        i++;
          goto _L7
        int j1;
        System.arraycopy(abyte0, j, abyte0, k, j1 - k);
        obj;
        JVM INSTR monitorexit ;
        return j1;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
_L4:
        j++;
          goto _L8
_L2:
        k = i;
          goto _L9
        j1 = i - l;
        k = 0;
        j = 0;
        i = i1;
          goto _L7
    }

    public static int a(byte abyte0[], int i, int j, boolean aflag[])
    {
        boolean flag2 = true;
        int l = j - i;
        boolean flag;
        if (l >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        if (l != 0)
        {
            if (aflag != null)
            {
                if (aflag[0])
                {
                    a(aflag);
                    return i - 3;
                }
                if (l > 1 && aflag[1] && abyte0[i] == 1)
                {
                    a(aflag);
                    return i - 2;
                }
                if (l > 2 && aflag[2] && abyte0[i] == 0 && abyte0[i + 1] == 1)
                {
                    a(aflag);
                    return i - 1;
                }
            }
            int k;
            for (i += 2; i < j - 1; i = k + 3)
            {
                k = i;
                if ((abyte0[i] & 0xfe) != 0)
                {
                    continue;
                }
                if (abyte0[i - 2] == 0 && abyte0[i - 1] == 0 && abyte0[i] == 1)
                {
                    if (aflag != null)
                    {
                        a(aflag);
                    }
                    return i - 2;
                }
                k = i - 2;
            }

            if (aflag != null)
            {
                boolean flag1;
                if (l > 2)
                {
                    if (abyte0[j - 3] == 0 && abyte0[j - 2] == 0 && abyte0[j - 1] == 1)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                if (l == 2)
                {
                    if (aflag[2] && abyte0[j - 2] == 0 && abyte0[j - 1] == 1)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                if (aflag[1] && abyte0[j - 1] == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                aflag[0] = flag1;
                if (l > 1)
                {
                    if (abyte0[j - 2] == 0 && abyte0[j - 1] == 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                if (aflag[2] && abyte0[j - 1] == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                aflag[1] = flag1;
                if (abyte0[j - 1] == 0)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                aflag[2] = flag1;
                return j;
            }
        }
        return j;
    }

    public static void a(boolean aflag[])
    {
        aflag[0] = false;
        aflag[1] = false;
        aflag[2] = false;
    }

    public static byte[] a(jnl jnl1)
    {
        int i = jnl1.e();
        int j = jnl1.b;
        jnl1.c(i);
        return jnf.a(jnl1.a, j, i);
    }

    public static int b(byte abyte0[], int i)
    {
        return abyte0[i + 3] & 0x1f;
    }

    public static int c(byte abyte0[], int i)
    {
        return (abyte0[i + 3] & 0x7e) >> 1;
    }

}
