// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package okio:
//            RealBufferedSource, Buffer, Source, Util

final class  extends InputStream
{

    final RealBufferedSource this$0;

    public final int available()
        throws IOException
    {
        if (RealBufferedSource.access$000(RealBufferedSource.this))
        {
            throw new IOException("closed");
        } else
        {
            return (int)Math.min(buffer.size, 0x7fffffffL);
        }
    }

    public final void close()
        throws IOException
    {
        RealBufferedSource.this.close();
    }

    public final int read()
        throws IOException
    {
        if (RealBufferedSource.access$000(RealBufferedSource.this))
        {
            throw new IOException("closed");
        }
        if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
        {
            return -1;
        } else
        {
            return buffer.readByte() & 0xff;
        }
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (RealBufferedSource.access$000(RealBufferedSource.this))
        {
            throw new IOException("closed");
        }
        Util.checkOffsetAndCount(abyte0.length, i, j);
        if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
        {
            return -1;
        } else
        {
            return buffer.read(abyte0, i, j);
        }
    }

    public final String toString()
    {
        return (new StringBuilder()).append(RealBufferedSource.this).append(".inputStream()").toString();
    }

    ()
    {
        this$0 = RealBufferedSource.this;
        super();
    }
}
