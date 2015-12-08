// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.util;


public final class f
{

    public static int a(int i, int j)
    {
        if (i > j)
        {
            return j;
        }
        if (i < 0)
        {
            return 0;
        } else
        {
            return i;
        }
    }

    public static int a(byte abyte0[], int i)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Null data to bytesToInt");
        }
        if (i + 4 > abyte0.length)
        {
            throw new IllegalArgumentException((new StringBuilder(61)).append("Incorrect length! offset=").append(i).append(" out of bounds bytesToInt").toString());
        } else
        {
            return abyte0[i + 3] << 24 & 0xff000000 | abyte0[i + 2] << 16 & 0xff0000 | abyte0[i + 1] << 8 & 0xff00 | abyte0[i] & 0xff;
        }
    }

    public static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "byte[] null";
        }
        StringBuilder stringbuilder = new StringBuilder("Bytes: [");
        for (int i = 0; i < abyte0.length; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Integer.toHexString(abyte0[i] & 0xff));
        }

        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public static double b(byte abyte0[], int i)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Null data to bytesToLong");
        }
        if (i + 8 > abyte0.length)
        {
            throw new IllegalArgumentException((new StringBuilder(62)).append("Incorrect length! offset=").append(i).append(" out of bounds bytesToLong").toString());
        }
        long l = (long)abyte0[i + 7] << 56 & 0xff00000000000000L | (long)abyte0[i + 6] << 48 & 0xff000000000000L | (long)abyte0[i + 5] << 40 & 0xff0000000000L | (long)abyte0[i + 4] << 32 & 0xff00000000L | (long)abyte0[i + 3] << 24 & 0xff000000L | (long)abyte0[i + 2] << 16 & 0xff0000L | (long)abyte0[i + 1] << 8 & 65280L | (long)abyte0[i] & 255L;
        double d;
        try
        {
            d = Double.longBitsToDouble(l);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            (new StringBuilder(54)).append("Unable to parse double from long: ").append(l);
            return 0.0D;
        }
        return d;
    }

    public static float b(byte abyte0[])
    {
        int i = a(abyte0, 0);
        float f1;
        try
        {
            f1 = Float.intBitsToFloat(i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            (new StringBuilder(43)).append("Unable to parse float from int: ").append(i);
            return 0.0F;
        }
        return f1;
    }
}
