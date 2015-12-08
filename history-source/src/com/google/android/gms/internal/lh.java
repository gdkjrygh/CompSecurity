// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class lh
{

    public static long a(InputStream inputstream, OutputStream outputstream, boolean flag)
        throws IOException
    {
        return a(inputstream, outputstream, flag, 1024);
    }

    public static long a(InputStream inputstream, OutputStream outputstream, boolean flag, int i)
        throws IOException
    {
        byte abyte0[];
        long l;
        abyte0 = new byte[i];
        l = 0L;
_L1:
        i = inputstream.read(abyte0, 0, abyte0.length);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        l += i;
        outputstream.write(abyte0, 0, i);
          goto _L1
        Exception exception;
        exception;
        if (flag)
        {
            b(inputstream);
            b(outputstream);
        }
        throw exception;
        if (flag)
        {
            b(inputstream);
            b(outputstream);
        }
        return l;
    }

    public static void a(ParcelFileDescriptor parcelfiledescriptor)
    {
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        parcelfiledescriptor.close();
        return;
        parcelfiledescriptor;
    }

    public static byte[] a(InputStream inputstream, boolean flag)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a(inputstream, ((OutputStream) (bytearrayoutputstream)), flag);
        return bytearrayoutputstream.toByteArray();
    }

    public static void b(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static byte[] d(InputStream inputstream)
        throws IOException
    {
        return a(inputstream, true);
    }
}
