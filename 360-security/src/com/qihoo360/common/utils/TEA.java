// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


public class TEA
{

    static final boolean a;
    private int b[];

    public TEA(byte abyte0[])
    {
        int i = 0;
        super();
        b = new int[4];
        if (abyte0 == null)
        {
            throw new RuntimeException("Invalid key: Key was null");
        }
        if (abyte0.length < 16)
        {
            throw new RuntimeException("Invalid key: Length was less than 16 bytes");
        }
        int j = 0;
        do
        {
            if (i >= 4)
            {
                return;
            }
            int ai[] = b;
            int k = j + 1;
            byte byte0 = abyte0[j];
            j = k + 1;
            k = abyte0[k];
            int l = j + 1;
            byte byte1 = abyte0[j];
            j = l + 1;
            ai[i] = (abyte0[l] & 0xff) << 24 | ((byte1 & 0xff) << 16 | (byte0 & 0xff | (k & 0xff) << 8));
            i++;
        } while (true);
    }

    private void a(byte abyte0[], int ai[], int i)
    {
        if (!a && abyte0.length / 4 + i > ai.length)
        {
            throw new AssertionError();
        }
        ai[i] = 0;
        byte byte0 = 24;
        int j = 0;
        int k = i;
        i = byte0;
        do
        {
            if (j >= abyte0.length)
            {
                return;
            }
            ai[k] = ai[k] | (abyte0[j] & 0xff) << i;
            if (i == 0)
            {
                k++;
                if (k < ai.length)
                {
                    ai[k] = 0;
                    i = 24;
                } else
                {
                    i = 24;
                }
            } else
            {
                i -= 8;
            }
            j++;
        } while (true);
    }

    private byte[] a(int ai[], int i, int j)
    {
        if (!a && j > (ai.length - i) * 4)
        {
            throw new AssertionError();
        }
        byte abyte0[] = new byte[j];
        int k = 0;
        boolean flag = false;
        int l = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if (k >= j)
            {
                return abyte0;
            }
            abyte0[k] = (byte)(ai[l] >> 24 - i * 8 & 0xff);
            int j1 = i + 1;
            i = j1;
            int i1 = l;
            if (j1 == 4)
            {
                i1 = l + 1;
                i = 0;
            }
            k++;
            l = i1;
        } while (true);
    }

    private void b(int ai[])
    {
        int i;
        if (!a && ai.length % 2 != 1)
        {
            throw new AssertionError();
        }
        i = 1;
_L2:
        if (i >= ai.length)
        {
            return;
        }
        int k = 32;
        int j = ai[i];
        int i1 = ai[i + 1];
        int l = 0xc6ef3720;
        do
        {
label0:
            {
                if (k > 0)
                {
                    break label0;
                }
                ai[i] = j;
                ai[i + 1] = i1;
                i += 2;
            }
            if (true)
            {
                continue;
            }
            i1 -= ((j << 4) + b[2] ^ j) + (j >>> 5 ^ l) + b[3];
            j -= ((i1 << 4) + b[0] ^ i1) + (i1 >>> 5 ^ l) + b[1];
            l += 0x61c88647;
            k--;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    void a(int ai[])
    {
        int i;
        if (!a && ai.length % 2 != 1)
        {
            throw new AssertionError();
        }
        i = 1;
_L2:
        if (i >= ai.length)
        {
            return;
        }
        int j = 32;
        int l = ai[i];
        int k = ai[i + 1];
        int i1 = 0;
        do
        {
label0:
            {
                if (j > 0)
                {
                    break label0;
                }
                ai[i] = l;
                ai[i + 1] = k;
                i += 2;
            }
            if (true)
            {
                continue;
            }
            i1 = 0x9e3779b9 + i1;
            l += ((k << 4) + b[0] ^ k) + (k >>> 5 ^ i1) + b[1];
            k = ((l << 4) + b[2] ^ l) + (l >>> 5 ^ i1) + b[3] + k;
            j--;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public byte[] decrypt(byte abyte0[])
    {
        if (!a && abyte0.length % 4 != 0)
        {
            throw new AssertionError();
        }
        if (!a && (abyte0.length / 4) % 2 != 1)
        {
            throw new AssertionError();
        } else
        {
            int ai[] = new int[abyte0.length / 4];
            a(abyte0, ai, 0);
            b(ai);
            return a(ai, 1, ai[0]);
        }
    }

    public byte[] encrypt(byte abyte0[])
    {
        int j = abyte0.length / 8;
        int ai[];
        int i;
        if (abyte0.length % 8 == 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ai = new int[(i + j) * 2 + 1];
        ai[0] = abyte0.length;
        a(abyte0, ai, 1);
        a(ai);
        return a(ai, 0, ai.length * 4);
    }

    static 
    {
        boolean flag;
        if (!com/qihoo360/common/utils/TEA.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
