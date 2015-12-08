// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.FilterOutputStream;
import java.io.UnsupportedEncodingException;

final class ByteString
{
    static final class CodedBuilder
    {
    }

    static final class Output extends FilterOutputStream
    {
    }


    public static final ByteString b = new ByteString(new byte[0]);
    final byte a[];
    private volatile int c;

    private ByteString(byte abyte0[])
    {
        c = 0;
        a = abyte0;
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

    public static ByteString a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        return new ByteString(abyte1);
    }

    public final void a(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(a, i, abyte0, j, k);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ByteString))
            {
                return false;
            }
            ByteString bytestring = (ByteString)obj;
            int j = a.length;
            if (j != bytestring.a.length)
            {
                return false;
            }
            obj = a;
            byte abyte0[] = bytestring.a;
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
            c = k;
        }
        return k;
    }

}
