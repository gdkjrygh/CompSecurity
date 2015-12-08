// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package okio:
//            BufferedSource, Buffer, Source, ByteString, 
//            Timeout, Util

final class RealBufferedSource
    implements BufferedSource
{

    public final Buffer buffer;
    private boolean closed;
    public final Source source;

    public RealBufferedSource(Source source1)
    {
        this(source1, new Buffer());
    }

    private RealBufferedSource(Source source1, Buffer buffer1)
    {
        if (source1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            buffer = buffer1;
            source = source1;
            return;
        }
    }

    private long indexOf(byte byte0, long l)
        throws IOException
    {
        long l1;
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        do
        {
            l1 = l;
            if (l < buffer.size)
            {
                do
                {
                    l1 = buffer.indexOf(byte0, l1);
                    l = l1;
                    if (l1 != -1L)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    l1 = buffer.size;
                    if (source.read(buffer, 2048L) == -1L)
                    {
                        return -1L;
                    }
                } while (true);
            }
        } while (source.read(buffer, 2048L) != -1L);
        l = -1L;
_L2:
        return l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean request(long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        while (buffer.size < l) 
        {
            if (source.read(buffer, 2048L) == -1L)
            {
                return false;
            }
        }
        return true;
    }

    public final Buffer buffer()
    {
        return buffer;
    }

    public final void close()
        throws IOException
    {
        if (closed)
        {
            return;
        } else
        {
            closed = true;
            source.close();
            buffer.clear();
            return;
        }
    }

    public final boolean exhausted()
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        return buffer.exhausted() && source.read(buffer, 2048L) == -1L;
    }

    public final long indexOf(byte byte0)
        throws IOException
    {
        return indexOf(byte0, 0L);
    }

    public final InputStream inputStream()
    {
        return new InputStream() {

            final RealBufferedSource this$0;

            public final int available()
                throws IOException
            {
                if (closed)
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
                if (closed)
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
                if (closed)
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

            
            {
                this$0 = RealBufferedSource.this;
                super();
            }
        };
    }

    public final long read(Buffer buffer1, long l)
        throws IOException
    {
        if (buffer1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
        {
            return -1L;
        } else
        {
            l = Math.min(l, buffer.size);
            return buffer.read(buffer1, l);
        }
    }

    public final byte readByte()
        throws IOException
    {
        require(1L);
        return buffer.readByte();
    }

    public final byte[] readByteArray(long l)
        throws IOException
    {
        require(l);
        return buffer.readByteArray(l);
    }

    public final ByteString readByteString(long l)
        throws IOException
    {
        require(l);
        return buffer.readByteString(l);
    }

    public final int readInt()
        throws IOException
    {
        require(4L);
        return buffer.readInt();
    }

    public final int readIntLe()
        throws IOException
    {
        require(4L);
        return buffer.readIntLe();
    }

    public final short readShort()
        throws IOException
    {
        require(2L);
        return buffer.readShort();
    }

    public final short readShortLe()
        throws IOException
    {
        require(2L);
        return buffer.readShortLe();
    }

    public final String readUtf8LineStrict()
        throws IOException
    {
        long l = indexOf((byte)10);
        if (l == -1L)
        {
            Buffer buffer1 = new Buffer();
            buffer.copyTo(buffer1, 0L, Math.min(32L, buffer.size()));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(buffer.size()).append(" content=").append(buffer1.readByteString().hex()).append("...").toString());
        } else
        {
            return buffer.readUtf8Line(l);
        }
    }

    public final void require(long l)
        throws IOException
    {
        if (!request(l))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final void skip(long l)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
_L3:
        if (l > 0L)
        {
            if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
            {
                throw new EOFException();
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        long l1 = Math.min(l, buffer.size());
        buffer.skip(l1);
        l -= l1;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public final Timeout timeout()
    {
        return source.timeout();
    }

    public final String toString()
    {
        return (new StringBuilder("buffer(")).append(source).append(")").toString();
    }

}
