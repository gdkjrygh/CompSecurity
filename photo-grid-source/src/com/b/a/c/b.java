// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

final class b
{

    public static final b a = new b(new byte[0]);
    private final byte b[];
    private volatile int c;

    private b(byte abyte0[])
    {
        c = 0;
        b = abyte0;
    }

    public static b a(String s)
    {
        try
        {
            s = new b(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.", s);
        }
        return s;
    }

    public static b a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        return new b(abyte1);
    }

    public final int a()
    {
        return b.length;
    }

    public final void a(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(b, i, abyte0, j, k);
    }

    public final InputStream b()
    {
        return new ByteArrayInputStream(b);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof b))
            {
                return false;
            }
            b b1 = (b)obj;
            int j = b.length;
            if (j != b1.b.length)
            {
                return false;
            }
            obj = b;
            byte abyte0[] = b1.b;
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

    public final int hashCode()
    {
        int i = c;
        int k = i;
        if (i == 0)
        {
            byte abyte0[] = b;
            int l = b.length;
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
            c = k;
        }
        return k;
    }

}
