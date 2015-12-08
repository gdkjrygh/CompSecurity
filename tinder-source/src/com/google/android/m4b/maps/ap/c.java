// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ap;

import com.google.android.m4b.maps.ad.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class c
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static DataInput a(byte abyte0[])
    {
        return new a(abyte0);
    }

    private static void a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[512];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                return;
            }
        } while (true);
    }

    public static void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        outputstream.close();
        return;
        outputstream;
    }

    public static byte[] a(InputStream inputstream)
    {
        return c(inputstream);
    }

    public static void b(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
    }

    private static byte[] c(InputStream inputstream)
    {
        OutputStream outputstream = new ByteArrayOutputStream(32);
        a(inputstream, outputstream);
        a(outputstream);
        outputstream = outputstream.toByteArray();
        b(inputstream);
        return outputstream;
        Exception exception1;
        exception1;
        a(outputstream);
        throw exception1;
        Exception exception;
        exception;
        b(inputstream);
        throw exception;
    }

}
