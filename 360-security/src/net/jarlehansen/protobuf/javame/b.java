// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.jarlehansen.protobuf.javame;

import java.io.UnsupportedEncodingException;

public final class b
{

    public static final b a = new b(new byte[0]);
    volatile int b;
    private final byte c[];

    private b(byte abyte0[])
    {
        b = 0;
        c = abyte0;
    }

    public static b a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static b a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return new b(abyte1);
    }

    public int a()
    {
        return c.length;
    }

    public byte[] b()
    {
        int i = c.length;
        byte abyte0[] = new byte[i];
        System.arraycopy(c, 0, abyte0, 0, i);
        return abyte0;
    }

    public String c()
    {
        String s;
        try
        {
            s = new String(c, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException("UTF-8 not supported?");
        }
        return s;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof b))
            {
                return false;
            }
            b b1 = (b)obj;
            int j = c.length;
            if (j != b1.c.length)
            {
                return false;
            }
            obj = c;
            byte abyte0[] = b1.c;
            int i = 0;
            while (i < j) 
            {
                if (obj[i] != abyte0[i])
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i = b;
        int k = i;
        if (i == 0)
        {
            byte abyte0[] = c;
            int l = c.length;
            k = 0;
            int j;
            byte byte0;
            for (j = l; k < l; j = byte0 + j * 31)
            {
                byte0 = abyte0[k];
                k++;
            }

            k = j;
            if (j == 0)
            {
                k = 1;
            }
            b = k;
        }
        return k;
    }

}
