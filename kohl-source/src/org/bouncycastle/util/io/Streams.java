// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.util.io:
//            StreamOverflowException

public final class Streams
{

    private static int BUFFER_SIZE = 512;

    public Streams()
    {
    }

    public static void drain(InputStream inputstream)
        throws IOException
    {
        for (byte abyte0[] = new byte[BUFFER_SIZE]; inputstream.read(abyte0, 0, abyte0.length) >= 0;) { }
    }

    public static void pipeAll(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[BUFFER_SIZE];
        do
        {
            int i = inputstream.read(abyte0, 0, abyte0.length);
            if (i >= 0)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                return;
            }
        } while (true);
    }

    public static long pipeAllLimited(InputStream inputstream, long l, OutputStream outputstream)
        throws IOException
    {
        long l1 = 0L;
        byte abyte0[] = new byte[BUFFER_SIZE];
        do
        {
            int i = inputstream.read(abyte0, 0, abyte0.length);
            if (i >= 0)
            {
                l1 += i;
                if (l1 > l)
                {
                    throw new StreamOverflowException("Data Overflow");
                }
                outputstream.write(abyte0, 0, i);
            } else
            {
                return l1;
            }
        } while (true);
    }

    public static byte[] readAll(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        pipeAll(inputstream, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] readAllLimited(InputStream inputstream, int i)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        pipeAllLimited(inputstream, i, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static int readFully(InputStream inputstream, byte abyte0[])
        throws IOException
    {
        return readFully(inputstream, abyte0, 0, abyte0.length);
    }

    public static int readFully(InputStream inputstream, byte abyte0[], int i, int j)
        throws IOException
    {
        int k = 0;
        do
        {
            int l;
label0:
            {
                if (k < j)
                {
                    l = inputstream.read(abyte0, i + k, j - k);
                    if (l >= 0)
                    {
                        break label0;
                    }
                }
                return k;
            }
            k += l;
        } while (true);
    }

}
