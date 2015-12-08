// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import java.io.ByteArrayOutputStream;

public class Hex
{

    private static final char DIGITS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };

    public Hex()
    {
    }

    public static byte[] decodeHex(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        int i = 0;
        do
        {
            if (i >= s.length())
            {
                return bytearrayoutputstream.toByteArray();
            }
            bytearrayoutputstream.write(Integer.parseInt(s.substring(i, i + 2), 16));
            i += 2;
        } while (true);
    }

    public static String encodeHex(byte abyte0[])
    {
        return encodeHex(abyte0, 0);
    }

    public static String encodeHex(byte abyte0[], int i)
    {
        boolean flag = false;
        int j1 = abyte0.length;
        char ac[];
        int j;
        int k;
        if (i > 0)
        {
            j = j1 / i;
        } else
        {
            j = 0;
        }
        ac = new char[j + (j1 << 1)];
        k = 0;
        j = ((flag) ? 1 : 0);
        do
        {
            if (k >= j1)
            {
                return new String(ac);
            }
            if (i > 0 && k % i == 0 && j > 0)
            {
                int l = j + 1;
                ac[j] = '-';
                j = l;
            }
            int i1 = j + 1;
            ac[j] = DIGITS[(abyte0[k] & 0xf0) >>> 4];
            j = i1 + 1;
            ac[i1] = DIGITS[abyte0[k] & 0xf];
            k++;
        } while (true);
    }

}
