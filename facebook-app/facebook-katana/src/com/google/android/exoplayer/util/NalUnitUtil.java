// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.util:
//            Assertions, ParsableByteArray, CodecSpecificDataUtil

public final class NalUnitUtil
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

    private NalUnitUtil()
    {
    }

    public static int a(byte abyte0[], int i)
    {
        int l = 0;
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        int j;
        int k;
        k = 0;
        j = 0;
_L2:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        j = a(abyte0, j, i);
        if (j >= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d.length <= k)
        {
            d = Arrays.copyOf(d, d.length * 2);
        }
        d[k] = j;
        k++;
        j += 3;
        if (true) goto _L2; else goto _L1
_L4:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        int i1;
        i1 = d[i] - j;
        System.arraycopy(abyte0, j, abyte0, l, i1);
        l += i1;
        int k1 = l + 1;
        abyte0[l] = 0;
        l = k1 + 1;
        abyte0[k1] = 0;
        j += i1 + 3;
        i++;
        continue; /* Loop/switch isn't completed */
        int j1;
        System.arraycopy(abyte0, j, abyte0, l, j1 - l);
        obj;
        JVM INSTR monitorexit ;
        return j1;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
_L1:
        j1 = i - k;
        boolean flag = false;
        j = 0;
        i = l;
        l = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static int a(byte abyte0[], int i, int j)
    {
        do
        {
label0:
            {
                int k = j;
                if (i < j - 2)
                {
                    if (abyte0[i] != 0 || abyte0[i + 1] != 0 || abyte0[i + 2] != 3)
                    {
                        break label0;
                    }
                    k = i;
                }
                return k;
            }
            i++;
        } while (true);
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
        Assertions.b(flag);
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
            int i1 = j - 1;
            int k;
            for (i += 2; i < i1; i = k + 3)
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
                    if (abyte0[j - 3] == 0 && abyte0[j - 2] == 0 && abyte0[i1] == 1)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                if (l == 2)
                {
                    if (aflag[2] && abyte0[j - 2] == 0 && abyte0[i1] == 1)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                if (aflag[1] && abyte0[i1] == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                aflag[0] = flag1;
                if (l > 1)
                {
                    if (abyte0[j - 2] == 0 && abyte0[i1] == 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                if (aflag[2] && abyte0[i1] == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                aflag[1] = flag1;
                if (abyte0[i1] == 0)
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

    public static byte[] a(ParsableByteArray parsablebytearray)
    {
        int i = parsablebytearray.g();
        int j = parsablebytearray.d();
        parsablebytearray.c(i);
        return CodecSpecificDataUtil.a(parsablebytearray.a, j, i);
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
