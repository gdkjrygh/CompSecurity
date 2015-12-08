// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ntru.util;


public class ArrayEncoder
{

    private static final int a[] = {
        0, 0, 0, 1, 1, 1, -1, -1
    };
    private static final int b[] = {
        0, 1, -1, 0, 1, -1, 0, 1
    };
    private static final int c[] = {
        1, 1, 1, 0, 0, 0, 1, 0, 1
    };
    private static final int d[] = {
        1, 1, 1, 1, 0, 0, 0, 1, 0
    };
    private static final int e[] = {
        1, 0, 1, 0, 0, 1, 1, 1, 0
    };

    public ArrayEncoder()
    {
    }

    public static byte[] a(int ai[])
    {
        byte abyte0[];
        abyte0 = new byte[((ai.length * 3 + 1) / 2 + 7) / 8];
        int i1 = 0;
        int j = 0;
        int i = 0;
        do
        {
label0:
            {
                if (i1 >= (ai.length / 2) * 2)
                {
                    break label0;
                }
                int k = i1 + 1;
                int l = ai[i1] + 1;
                int k1 = k + 1;
                k = ai[k] + 1;
                if (l == 0 && k == 0)
                {
                    throw new IllegalStateException("Illegal encoding!");
                }
                k += l * 3;
                int l1 = c[k];
                int i2 = d[k];
                int j2 = e[k];
                k = 0;
                int j1 = i;
                l = j;
                do
                {
                    i1 = k1;
                    j = l;
                    i = j1;
                    if (k >= 3)
                    {
                        break;
                    }
                    abyte0[l] = (byte)(abyte0[l] | (new int[] {
                        l1, i2, j2
                    })[k] << j1);
                    if (j1 == 7)
                    {
                        l++;
                        i = 0;
                    } else
                    {
                        i = j1 + 1;
                    }
                    k++;
                    j1 = i;
                } while (true);
            }
        } while (true);
        return abyte0;
    }

    public static byte[] a(int ai[], int i)
    {
        int i1 = 31 - Integer.numberOfLeadingZeros(i);
        byte abyte0[] = new byte[(ai.length * i1 + 7) / 8];
        int j = 0;
        int l = 0;
        i = 0;
        for (; j < ai.length; j++)
        {
            int k = 0;
            while (k < i1) 
            {
                abyte0[l] = (byte)((ai[j] >> k & 1) << i | abyte0[l]);
                if (i == 7)
                {
                    l++;
                    i = 0;
                } else
                {
                    i++;
                }
                k++;
            }
        }

        return abyte0;
    }

    public static int[] a(byte abyte0[], int i)
    {
        int k = 0;
        int ai[] = new int[i];
        int j = 0;
        int l;
        do
        {
            if (k >= abyte0.length * 8)
            {
                break;
            }
            int j1 = k + 1;
            l = b(abyte0, k);
            int i1 = j1 + 1;
            j1 = b(abyte0, j1);
            k = i1 + 1;
            i1 = j1 * 2 + l * 4 + b(abyte0, i1);
            j1 = j + 1;
            ai[j] = a[i1];
            l = j1 + 1;
            ai[j1] = b[i1];
            j = l;
        } while (l <= i - 2);
        return ai;
    }

    public static int[] a(byte abyte0[], int i, int j)
    {
        int k = 0;
        int ai[] = new int[i];
        int i1 = 31 - Integer.numberOfLeadingZeros(j);
        for (j = 0; j < i * i1;)
        {
            int l = k;
            if (j > 0)
            {
                l = k;
                if (j % i1 == 0)
                {
                    l = k + 1;
                }
            }
            ai[l] = (b(abyte0, j) << j % i1) + ai[l];
            j++;
            k = l;
        }

        return ai;
    }

    private static int b(byte abyte0[], int i)
    {
        return (abyte0[i / 8] & 0xff) >> i % 8 & 1;
    }

}
