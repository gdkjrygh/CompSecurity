// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class IOUtils
{

    public static void closeQuietly(ParcelFileDescriptor parcelfiledescriptor)
    {
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        parcelfiledescriptor.close();
        return;
        parcelfiledescriptor;
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static long copyStream(InputStream inputstream, OutputStream outputstream, boolean flag, int i)
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
            closeQuietly(inputstream);
            closeQuietly(outputstream);
        }
        throw exception;
        if (flag)
        {
            closeQuietly(inputstream);
            closeQuietly(outputstream);
        }
        return l;
    }

    public static boolean isGzipByteBuffer(byte abyte0[])
    {
        return abyte0.length > 1 && (abyte0[0] & 0xff | (abyte0[1] & 0xff) << 8) == 35615;
    }
}
