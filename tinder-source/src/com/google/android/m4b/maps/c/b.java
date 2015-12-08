// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.c;

import com.google.android.m4b.maps.y.j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class b
{

    private static final OutputStream a = new OutputStream() {

        public final String toString()
        {
            return "ByteStreams.nullOutputStream()";
        }

        public final void write(int i)
        {
        }

        public final void write(byte abyte0[])
        {
            j.a(abyte0);
        }

        public final void write(byte abyte0[], int i, int k)
        {
            j.a(abyte0);
        }

    };

    private static long a(InputStream inputstream, OutputStream outputstream)
    {
        j.a(inputstream);
        j.a(outputstream);
        byte abyte0[] = new byte[4096];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

    public static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a(inputstream, ((OutputStream) (bytearrayoutputstream)));
        return bytearrayoutputstream.toByteArray();
    }

}
