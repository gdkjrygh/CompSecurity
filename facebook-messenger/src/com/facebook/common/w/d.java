// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;


public class d
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private static final char b[];
    private static final char c[];
    private static final byte d[];

    public d()
    {
    }

    public static String a(byte abyte0[], boolean flag)
    {
        char ac[] = new char[abyte0.length * 2];
        int i = 0;
        int j = 0;
        do
        {
            int k;
label0:
            {
                if (i < abyte0.length)
                {
                    k = abyte0[i] & 0xff;
                    if (k != 0 || !flag)
                    {
                        break label0;
                    }
                }
                return new String(ac, 0, j);
            }
            int l = j + 1;
            ac[j] = b[k];
            j = l + 1;
            ac[l] = c[k];
            i++;
        } while (true);
    }

    static 
    {
        boolean flag = false;
        b = new char[256];
        c = new char[256];
        for (int i = 0; i < 256; i++)
        {
            b[i] = a[i >> 4 & 0xf];
            c[i] = a[i & 0xf];
        }

        d = new byte[103];
        for (int j = 0; j <= 70; j++)
        {
            d[j] = -1;
        }

        byte byte0 = 0;
        byte byte1;
        do
        {
            byte1 = flag;
            if (byte0 >= 10)
            {
                break;
            }
            d[byte0 + 48] = byte0;
            byte0++;
        } while (true);
        for (; byte1 < 6; byte1++)
        {
            d[byte1 + 65] = (byte)(byte1 + 10);
            d[byte1 + 97] = (byte)(byte1 + 10);
        }

    }
}
