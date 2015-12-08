// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.g;

import java.io.OutputStream;
import org.bouncycastle.crypto.StreamCipher;

public final class b extends OutputStream
{

    private final OutputStream a;
    private final StreamCipher b;
    private final byte c[] = new byte[8192];

    public b(OutputStream outputstream, StreamCipher streamcipher)
    {
        a = outputstream;
        b = streamcipher;
    }

    public final void close()
    {
        a.close();
    }

    public final void flush()
    {
        a.flush();
    }

    public final void write(int i)
    {
        if (i == -1)
        {
            a.write(-1);
        }
        a.write(b.returnByte((byte)i));
    }

    public final void write(byte abyte0[], int i, int j)
    {
        j = Math.min(j, c.length);
        b.processBytes(abyte0, i, j, c, 0);
        a.write(c, 0, j);
    }
}
