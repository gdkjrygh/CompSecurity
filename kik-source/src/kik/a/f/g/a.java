// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.g;

import java.io.InputStream;
import org.bouncycastle.crypto.StreamCipher;

public final class a extends InputStream
{

    private final StreamCipher a;
    private final InputStream b;
    private final byte c[] = new byte[8192];

    public a(StreamCipher streamcipher, InputStream inputstream)
    {
        a = streamcipher;
        b = inputstream;
    }

    public final int available()
    {
        return b.available();
    }

    public final void close()
    {
        b.close();
    }

    public final int read()
    {
        int i = b.read();
        if (i == -1)
        {
            return -1;
        } else
        {
            return a.returnByte((byte)i);
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        j = Math.min(c.length, j);
        j = b.read(c, 0, j);
        if (j > 0)
        {
            a.processBytes(c, 0, j, abyte0, i);
        }
        return j;
    }

    public final long skip(long l)
    {
        throw new RuntimeException("Not implemented.");
    }
}
