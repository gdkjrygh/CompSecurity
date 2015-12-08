// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import java.util.Arrays;

class Base64
{

    private static final char CA[];
    private static final int IA[];

    Base64()
    {
    }

    public static final byte[] decode(String s)
    {
        int ai[];
        int i;
        if (s != null)
        {
            i = s.length();
        } else
        {
            i = 0;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        ai = new byte[0];
_L4:
        return ai;
_L2:
        int j = 0;
        for (int l = 0; l < i;)
        {
            int j1 = j;
            if (IA[s.charAt(l)] < 0)
            {
                j1 = j + 1;
            }
            l++;
            j = j1;
        }

        if ((i - j) % 4 != 0)
        {
            return null;
        }
        int k1 = 0;
        int i1 = i;
        do
        {
            if (i1 <= 1)
            {
                break;
            }
            ai = IA;
            int i2 = i1 - 1;
            if (ai[s.charAt(i2)] > 0)
            {
                break;
            }
            i1 = i2;
            if (s.charAt(i2) == '=')
            {
                k1++;
                i1 = i2;
            }
        } while (true);
        int k2 = ((i - j) * 6 >> 3) - k1;
        byte abyte0[] = new byte[k2];
        i = 0;
        i1 = 0;
        do
        {
            ai = abyte0;
            if (i1 >= k2)
            {
                continue;
            }
            int l1 = 0;
            int j2 = 0;
            int k = i;
            i = j2;
            while (i < 4) 
            {
                j2 = IA[s.charAt(k)];
                if (j2 >= 0)
                {
                    l1 |= j2 << 18 - i * 6;
                } else
                {
                    i--;
                }
                i++;
                k++;
            }
            j2 = i1 + 1;
            abyte0[i1] = (byte)(l1 >> 16);
            i = j2;
            if (j2 < k2)
            {
                i = j2 + 1;
                abyte0[j2] = (byte)(l1 >> 8);
                if (i < k2)
                {
                    i1 = i + 1;
                    abyte0[i] = (byte)l1;
                    i = i1;
                }
            }
            i1 = i;
            i = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static final byte[] decode(byte abyte0[])
    {
        int i;
        int k1;
        k1 = abyte0.length;
        i = 0;
        for (int j = 0; j < k1;)
        {
            int i1 = i;
            if (IA[abyte0[j] & 0xff] < 0)
            {
                i1 = i + 1;
            }
            j++;
            i = i1;
        }

        if ((k1 - i) % 4 == 0) goto _L2; else goto _L1
_L1:
        byte abyte1[] = null;
_L4:
        return abyte1;
_L2:
        int j1 = 0;
        int k = k1;
        do
        {
            if (k <= 1)
            {
                break;
            }
            abyte1 = IA;
            int i2 = k - 1;
            if (abyte1[abyte0[i2] & 0xff] > 0)
            {
                break;
            }
            k = i2;
            if (abyte0[i2] == 61)
            {
                j1++;
                k = i2;
            }
        } while (true);
        int k2 = ((k1 - i) * 6 >> 3) - j1;
        byte abyte2[] = new byte[k2];
        i = 0;
        j1 = 0;
        do
        {
            abyte1 = abyte2;
            if (j1 >= k2)
            {
                continue;
            }
            int l1 = 0;
            int j2 = 0;
            int l = i;
            i = j2;
            while (i < 4) 
            {
                j2 = IA[abyte0[l] & 0xff];
                if (j2 >= 0)
                {
                    l1 |= j2 << 18 - i * 6;
                } else
                {
                    i--;
                }
                i++;
                l++;
            }
            j2 = j1 + 1;
            abyte2[j1] = (byte)(l1 >> 16);
            i = j2;
            if (j2 < k2)
            {
                i = j2 + 1;
                abyte2[j2] = (byte)(l1 >> 8);
                if (i < k2)
                {
                    j1 = i + 1;
                    abyte2[i] = (byte)l1;
                    i = j1;
                }
            }
            j1 = i;
            i = l;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static final char[] encodeToChar(byte abyte0[], boolean flag)
    {
        char ac[];
        int k;
        if (abyte0 != null)
        {
            k = abyte0.length;
        } else
        {
            k = 0;
        }
        if (k != 0) goto _L2; else goto _L1
_L1:
        ac = new char[0];
_L5:
        return ac;
_L2:
        char ac1[];
        int i;
        int j;
        int l;
        int i1;
        int j1;
        j1 = (k / 3) * 3;
        j = (k - 1) / 3 + 1 << 2;
        int k1;
        int l1;
        int i2;
        if (flag)
        {
            i = (j - 1) / 76 << 1;
        } else
        {
            i = 0;
        }
        i1 = j + i;
        ac1 = new char[i1];
        i = 0;
        j = 0;
        l = 0;
        if (l >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = l + 1;
        l = abyte0[l];
        k1 = l1 + 1;
        l1 = (l & 0xff) << 16 | (abyte0[l1] & 0xff) << 8 | abyte0[k1] & 0xff;
        l = j + 1;
        ac1[j] = CA[l1 >>> 18 & 0x3f];
        j = l + 1;
        ac1[l] = CA[l1 >>> 12 & 0x3f];
        i2 = j + 1;
        ac1[j] = CA[l1 >>> 6 & 0x3f];
        l = i2 + 1;
        ac1[i2] = CA[l1 & 0x3f];
        j = i;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        i++;
        j = i;
        if (i != 19)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        j = i;
        if (l >= i1 - 2)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        j = l + 1;
        ac1[l] = '\r';
        ac1[j] = '\n';
        i = 0;
        j++;
_L6:
        l = k1 + 1;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_82;
_L3:
        j = k - j1;
        ac = ac1;
        if (j > 0)
        {
            l = abyte0[j1];
            char c;
            if (j == 2)
            {
                i = (abyte0[k - 1] & 0xff) << 2;
            } else
            {
                i = 0;
            }
            i = (l & 0xff) << 10 | i;
            ac1[i1 - 4] = CA[i >> 12];
            ac1[i1 - 3] = CA[i >>> 6 & 0x3f];
            if (j == 2)
            {
                c = CA[i & 0x3f];
            } else
            {
                c = '=';
            }
            ac1[i1 - 2] = c;
            ac1[i1 - 1] = '=';
            return ac1;
        }
          goto _L5
        i = j;
        j = l;
          goto _L6
    }

    public static final String encodeToString(byte abyte0[], boolean flag)
    {
        return new String(encodeToChar(abyte0, flag));
    }

    static 
    {
        CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        IA = new int[256];
        Arrays.fill(IA, -1);
        int i = 0;
        for (int j = CA.length; i < j; i++)
        {
            IA[CA[i]] = i;
        }

        IA[61] = 0;
    }
}
