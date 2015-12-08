// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

final class am
{

    private final byte a[];
    private volatile int b;

    private am(byte abyte0[])
    {
        b = 0;
        a = abyte0;
    }

    public static am a(String s)
    {
        try
        {
            s = new am(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.", s);
        }
        return s;
    }

    public static am a(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, 0, abyte1, 0, j);
        return new am(abyte1);
    }

    public final int a()
    {
        return a.length;
    }

    public final void a(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(a, i, abyte0, j, k);
    }

    public final InputStream b()
    {
        return new ByteArrayInputStream(a);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof am))
            {
                return false;
            }
            am am1 = (am)obj;
            int j = a.length;
            if (j != am1.a.length)
            {
                return false;
            }
            obj = a;
            byte abyte0[] = am1.a;
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
        int i = b;
        int k = i;
        if (i == 0)
        {
            byte abyte0[] = a;
            int l = a.length;
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

    static 
    {
        new am(new byte[0]);
    }
}
