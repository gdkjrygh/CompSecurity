// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.common.b:
//            i, j, c

public final class a
{

    private a()
    {
    }

    public static long a(i k, j j1)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        k = (InputStream)k.b();
        flag = flag1;
        j1 = (OutputStream)j1.b();
        long l = a(((InputStream) (k)), ((OutputStream) (j1)));
        flag = false;
        c.a(j1, false);
        c.a(k, false);
        return l;
        Exception exception;
        exception;
        flag = flag1;
        c.a(j1, true);
        flag = flag1;
        throw exception;
        j1;
        c.a(k, flag);
        throw j1;
    }

    public static long a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[4096];
        long l = 0L;
        do
        {
            int k = inputstream.read(abyte0);
            if (k == -1)
            {
                return l;
            }
            outputstream.write(abyte0, 0, k);
            l += k;
        } while (true);
    }

    public static void a(InputStream inputstream, byte abyte0[])
    {
        a(inputstream, abyte0, 0, abyte0.length);
    }

    public static void a(InputStream inputstream, byte abyte0[], int k, int l)
    {
        if (b(inputstream, abyte0, k, l) != l)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public static byte[] a(i k)
    {
        k = (InputStream)k.b();
        byte abyte0[] = a(((InputStream) (k)));
        c.a(k, false);
        return abyte0;
        Exception exception;
        exception;
        c.a(k, true);
        throw exception;
    }

    public static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a(inputstream, ((OutputStream) (bytearrayoutputstream)));
        return bytearrayoutputstream.toByteArray();
    }

    public static int b(InputStream inputstream, byte abyte0[], int k, int l)
    {
        if (l < 0)
        {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i1 = 0;
        do
        {
            int j1;
label0:
            {
                if (i1 < l)
                {
                    j1 = inputstream.read(abyte0, k + i1, l - i1);
                    if (j1 != -1)
                    {
                        break label0;
                    }
                }
                return i1;
            }
            i1 += j1;
        } while (true);
    }
}
