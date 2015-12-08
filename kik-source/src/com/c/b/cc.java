// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


final class cc
{

    private static int a(int i, int j)
    {
        if (i > -12 || j > -65)
        {
            return -1;
        } else
        {
            return j << 8 ^ i;
        }
    }

    private static int a(int i, int j, int k)
    {
        if (i > -12 || j > -65 || k > -65)
        {
            return -1;
        } else
        {
            return j << 8 ^ i ^ k << 16;
        }
    }

    public static int a(int i, byte abyte0[], int j, int k)
    {
        int l = j;
        if (i == 0) goto _L2; else goto _L1
_L1:
        byte byte1;
        if (j >= k)
        {
            return i;
        }
        byte1 = (byte)i;
        if (byte1 >= -32) goto _L4; else goto _L3
_L4:
        if (byte1 >= -16) goto _L6; else goto _L5
_L5:
        l = (byte)(~(i >> 8));
        if (l == 0)
        {
            l = j + 1;
            byte byte0 = abyte0[j];
            j = byte0;
            i = l;
            if (l >= k)
            {
                return a(byte1, byte0);
            }
        } else
        {
            i = j;
            j = l;
        }
        if (j > -65 || byte1 == -32 && j < -96 || byte1 == -19 && j >= -96) goto _L8; else goto _L7
_L7:
        l = i + 1;
        if (abyte0[i] <= -65) goto _L2; else goto _L8
_L8:
        return -1;
_L6:
        int i1;
        l = (byte)(~(i >> 8));
        i1 = 0;
        if (l != 0) goto _L10; else goto _L9
_L9:
        int j1 = j + 1;
        l = abyte0[j];
        if (j1 >= k)
        {
            return a(byte1, l);
        }
        i = i1;
        j = j1;
          goto _L11
_L10:
        i = (byte)(i >> 16);
_L15:
        if (i == 0)
        {
            i1 = j + 1;
            j1 = abyte0[j];
            i = j1;
            j = i1;
            if (i1 >= k)
            {
                return a(byte1, l, j1);
            }
        }
        if (l > -65 || (byte1 << 28) + (l + 112) >> 30 != 0 || i > -65) goto _L13; else goto _L12
_L12:
        l = j + 1;
        if (abyte0[j] <= -65) goto _L2; else goto _L13
_L13:
        return -1;
_L3:
        if (byte1 < -62 || abyte0[j] > -65)
        {
            return -1;
        }
        l = j + 1;
_L2:
        return b(abyte0, l, k);
_L11:
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static boolean a(byte abyte0[], int i, int j)
    {
        return b(abyte0, i, j) == 0;
    }

    private static int b(byte abyte0[], int i, int j)
    {
        int k;
        for (k = i; k < j && abyte0[k] >= 0; k++) { }
        i = k;
        if (k < j) goto _L2; else goto _L1
_L1:
        i = 0;
_L6:
        return i;
_L4:
        i = k;
_L2:
        byte byte0;
        if (i >= j)
        {
            return 0;
        }
        k = i + 1;
        byte0 = abyte0[i];
        if (byte0 >= 0) goto _L4; else goto _L3
_L3:
        if (byte0 >= -32)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        i = byte0;
        if (k >= j) goto _L6; else goto _L5
_L5:
        if (byte0 < -62)
        {
            break; /* Loop/switch isn't completed */
        }
        i = k + 1;
        if (abyte0[k] <= -65) goto _L2; else goto _L7
_L7:
        return -1;
        int l;
        if (byte0 >= -16)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (k >= j - 1)
        {
            return c(abyte0, k, j);
        }
        l = k + 1;
        i = abyte0[k];
        if (i > -65 || byte0 == -32 && i < -96 || byte0 == -19 && i >= -96)
        {
            break; /* Loop/switch isn't completed */
        }
        i = l + 1;
        if (abyte0[l] <= -65) goto _L2; else goto _L8
_L8:
        return -1;
        if (k >= j - 2)
        {
            return c(abyte0, k, j);
        }
        i = k + 1;
        k = abyte0[k];
        if (k > -65 || (byte0 << 28) + (k + 112) >> 30 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i + 1;
        if (abyte0[i] > -65)
        {
            break; /* Loop/switch isn't completed */
        }
        i = k + 1;
        if (abyte0[k] <= -65) goto _L2; else goto _L9
_L9:
        return -1;
    }

    private static int c(byte abyte0[], int i, int j)
    {
        byte byte0 = abyte0[i - 1];
        switch (j - i)
        {
        default:
            throw new AssertionError();

        case 0: // '\0'
            i = byte0;
            if (byte0 > -12)
            {
                i = -1;
            }
            return i;

        case 1: // '\001'
            return a(byte0, abyte0[i]);

        case 2: // '\002'
            return a(byte0, abyte0[i], abyte0[i + 1]);
        }
    }
}
