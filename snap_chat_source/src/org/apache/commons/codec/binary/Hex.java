// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;


public class Hex
{

    private static final char DIGITS_LOWER[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final char DIGITS_UPPER[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private final String charsetName;

    public static char[] encodeHex(byte abyte0[])
    {
        return encodeHex(abyte0, true);
    }

    public static char[] encodeHex(byte abyte0[], boolean flag)
    {
        char ac[];
        if (flag)
        {
            ac = DIGITS_LOWER;
        } else
        {
            ac = DIGITS_UPPER;
        }
        return encodeHex(abyte0, ac);
    }

    protected static char[] encodeHex(byte abyte0[], char ac[])
    {
        int j = 0;
        int k = abyte0.length;
        char ac1[] = new char[k << 1];
        for (int i = 0; i < k; i++)
        {
            int l = j + 1;
            ac1[j] = ac[(abyte0[i] & 0xf0) >>> 4];
            j = l + 1;
            ac1[l] = ac[abyte0[i] & 0xf];
        }

        return ac1;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("[charsetName=").append(charsetName).append("]").toString();
    }

}
