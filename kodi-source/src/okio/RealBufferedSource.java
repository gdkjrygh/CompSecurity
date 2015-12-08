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

    public RealBufferedSource(Source source1, Buffer buffer1)
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

    public Buffer buffer()
    {
        return buffer;
    }

    public void close()
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

    public boolean exhausted()
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        return buffer.exhausted() && source.read(buffer, 2048L) == -1L;
    }

    public long indexOf(byte byte0)
        throws IOException
    {
        return indexOf(byte0, 0L);
    }

    public long indexOf(byte byte0, long l)
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

    public InputStream inputStream()
    {
        return new InputStream() {

            final RealBufferedSource this$0;

            public int available()
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

            public void close()
                throws IOException
            {
                RealBufferedSource.this.close();
            }

            public int read()
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

            public int read(byte abyte0[], int i, int j)
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

            public String toString()
            {
                return (new StringBuilder()).append(RealBufferedSource.this).append(".inputStream()").toString();
            }

            
            {
                this$0 = RealBufferedSource.this;
                super();
            }
        };
    }

    public long read(Buffer buffer1, long l)
        throws IOException
    {
        if (buffer1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
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

    public byte readByte()
        throws IOException
    {
        require(1L);
        return buffer.readByte();
    }

    public byte[] readByteArray()
        throws IOException
    {
        buffer.writeAll(source);
        return buffer.readByteArray();
    }

    public byte[] readByteArray(long l)
        throws IOException
    {
        require(l);
        return buffer.readByteArray(l);
    }

    public ByteString readByteString(long l)
        throws IOException
    {
        require(l);
        return buffer.readByteString(l);
    }

    public long readDecimalLong()
        throws IOException
    {
        int i = 0;
_L5:
        if (request(i + 1)) goto _L2; else goto _L1
_L1:
        byte byte0;
        if (i == 0)
        {
            throw new NumberFormatException((new StringBuilder()).append("Expected leading [0-9] or '-' character but was 0x").append(Integer.toHexString(buffer.getByte(0L))).toString());
        } else
        {
            return buffer.readDecimalLong();
        }
_L2:
        if (((byte0 = buffer.getByte(i)) < 48 || byte0 > 57) && (i != 0 || byte0 != 45)) goto _L1; else goto _L3
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public long readHexadecimalUnsignedLong()
        throws IOException
    {
        int i = 0;
_L5:
        if (request(i + 1)) goto _L2; else goto _L1
_L1:
        byte byte0;
        if (i == 0)
        {
            throw new NumberFormatException((new StringBuilder()).append("Expected leading [0-9a-fA-F] character but was 0x").append(Integer.toHexString(buffer.getByte(0L))).toString());
        } else
        {
            return buffer.readHexadecimalUnsignedLong();
        }
_L2:
        if (((byte0 = buffer.getByte(i)) < 48 || byte0 > 57) && (byte0 < 97 || byte0 > 102) && (byte0 < 65 || byte0 > 70)) goto _L1; else goto _L3
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int readInt()
        throws IOException
    {
        require(4L);
        return buffer.readInt();
    }

    public int readIntLe()
        throws IOException
    {
        require(4L);
        return buffer.readIntLe();
    }

    public short readShort()
        throws IOException
    {
        require(2L);
        return buffer.readShort();
    }

    public short readShortLe()
        throws IOException
    {
        require(2L);
        return buffer.readShortLe();
    }

    public String readUtf8LineStrict()
        throws IOException
    {
        long l = indexOf((byte)10);
        if (l == -1L)
        {
            Buffer buffer1 = new Buffer();
            buffer.copyTo(buffer1, 0L, Math.min(32L, buffer.size()));
            throw new EOFException((new StringBuilder()).append("\\n not found: size=").append(buffer.size()).append(" content=").append(buffer1.readByteString().hex()).append("...").toString());
        } else
        {
            return buffer.readUtf8Line(l);
        }
    }

    public boolean request(long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
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

    public void require(long l)
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

    public void skip(long l)
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

    public Timeout timeout()
    {
        return source.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append("buffer(").append(source).append(")").toString();
    }

}
