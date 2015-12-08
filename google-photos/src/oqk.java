// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.nio.ByteBuffer;

public final class oqk extends InputStream
{

    private final ByteBuffer a;
    private int b;

    public oqk(ByteBuffer bytebuffer)
    {
        b = 0;
        a = bytebuffer;
    }

    public final int available()
    {
        return a.remaining();
    }

    public final void mark(int i)
    {
        b = a.position();
    }

    public final boolean markSupported()
    {
        return true;
    }

    public final int read()
    {
        if (!a.hasRemaining())
        {
            return -1;
        } else
        {
            return a.get() & 0xff;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (a.hasRemaining())
        {
            j = Math.min(a.remaining(), j);
            a.get(abyte0, i, j);
            return j;
        } else
        {
            return -1;
        }
    }

    public final void reset()
    {
        a.position(b);
    }

    public final long skip(long l)
    {
        int i = (int)Math.min(l, a.remaining());
        a.position(a.position() + i);
        return (long)i;
    }
}
