// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class Streams
{

    private static int a = 512;

    public Streams()
    {
    }

    public static int a(InputStream inputstream, byte abyte0[])
    {
        int j = abyte0.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            int k = inputstream.read(abyte0, i + 0, j - i);
            if (k < 0)
            {
                break;
            }
            i += k;
        } while (true);
        return i;
    }

    private static void a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[a];
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

    public static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a(inputstream, ((OutputStream) (bytearrayoutputstream)));
        return bytearrayoutputstream.toByteArray();
    }

}
