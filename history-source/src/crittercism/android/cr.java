// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.UnsupportedEncodingException;

public final class cr
{

    private static final byte a[];
    private static final byte b[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte c[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9
    };

    public static String a(byte abyte0[])
    {
        return a(abyte0, abyte0.length);
    }

    private static String a(byte abyte0[], int i)
    {
        int k = (i * 4) / 3;
        byte abyte1[];
        int j;
        int l;
        if (i % 3 > 0)
        {
            j = 4;
        } else
        {
            j = 0;
        }
        abyte1 = new byte[j + k + k / 76];
        k = 0;
        j = 0;
        for (l = 0; l < i - 2;)
        {
            a(abyte0, l + 0, 3, abyte1, j);
            int j1 = k + 4;
            k = j1;
            int i1 = j;
            if (j1 == 76)
            {
                abyte1[j + 4] = 10;
                i1 = j + 1;
                k = 0;
            }
            l += 3;
            j = i1 + 4;
        }

        k = j;
        if (l < i)
        {
            a(abyte0, l + 0, i - l, abyte1, j);
            k = j + 4;
        }
        try
        {
            abyte0 = new String(abyte1, 0, k, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return new String(abyte1, 0, k);
        }
        return abyte0;
    }

    private static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int j1 = 0;
        int l;
        int i1;
        if (j > 0)
        {
            l = (abyte0[i] << 24) >>> 8;
        } else
        {
            l = 0;
        }
        if (j > 1)
        {
            i1 = (abyte0[i + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (j > 2)
        {
            j1 = (abyte0[i + 2] << 24) >>> 24;
        }
        i = j1 | (i1 | l);
        switch (j)
        {
        default:
            return abyte1;

        case 3: // '\003'
            abyte1[k] = a[i >>> 18];
            abyte1[k + 1] = a[i >>> 12 & 0x3f];
            abyte1[k + 2] = a[i >>> 6 & 0x3f];
            abyte1[k + 3] = a[i & 0x3f];
            return abyte1;

        case 2: // '\002'
            abyte1[k] = a[i >>> 18];
            abyte1[k + 1] = a[i >>> 12 & 0x3f];
            abyte1[k + 2] = a[i >>> 6 & 0x3f];
            abyte1[k + 3] = 61;
            return abyte1;

        case 1: // '\001'
            abyte1[k] = a[i >>> 18];
            abyte1[k + 1] = a[i >>> 12 & 0x3f];
            abyte1[k + 2] = 61;
            abyte1[k + 3] = 61;
            return abyte1;
        }
    }

    static 
    {
        byte abyte0[];
        try
        {
            abyte0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = b;
        }
        a = abyte0;
    }
}
