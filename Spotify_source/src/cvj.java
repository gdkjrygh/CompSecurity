// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.io.OutputStream;

public final class cvj
{

    public static long a(InputStream inputstream, OutputStream outputstream)
    {
        ctz.a(inputstream);
        ctz.a(outputstream);
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

    static 
    {
        new OutputStream() {

            public final String toString()
            {
                return "ByteStreams.nullOutputStream()";
            }

            public final void write(int i)
            {
            }

            public final void write(byte abyte0[])
            {
                ctz.a(abyte0);
            }

            public final void write(byte abyte0[], int i, int j)
            {
                ctz.a(abyte0);
            }

        };
    }
}
