// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

final class ByteString
{

    public static final ByteString a = new ByteString(new byte[0]);
    private final byte b[];
    private volatile int c;

    private ByteString(byte abyte0[])
    {
        c = 0;
        b = abyte0;
    }

    public static ByteString a(String s)
    {
        try
        {
            s = new ByteString(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.", s);
        }
        return s;
    }

    public static ByteString a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return new ByteString(abyte1);
    }

    public int a()
    {
        return b.length;
    }

    public void a(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(b, i, abyte0, j, k);
    }

    public InputStream b()
    {
        return new ByteArrayInputStream(b);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ByteString))
            {
                return false;
            }
            ByteString bytestring = (ByteString)obj;
            int j = b.length;
            if (j != bytestring.b.length)
            {
                return false;
            }
            obj = b;
            byte abyte0[] = bytestring.b;
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
