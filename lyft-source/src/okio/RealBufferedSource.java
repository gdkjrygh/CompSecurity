// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// Referenced classes of package okio:
//            BufferedSource, Buffer, Source, Util, 
//            Sink, ByteString, Timeout

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
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        return buffer.exhausted() && source.read(buffer, 2048L) == -1L;
    }

    public long indexOf(byte byte0)
    {
        return indexOf(byte0, 0L);
    }

    public long indexOf(byte byte0, long l)
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        do
        {
            long l1 = l;
            if (l >= buffer.size)
            {
                if (source.read(buffer, 2048L) == -1L)
                {
                    return -1L;
                }
            } else
            {
                do
                {
                    l = buffer.indexOf(byte0, l1);
                    if (l == -1L)
                    {
                        l1 = buffer.size;
                        if (source.read(buffer, 2048L) == -1L)
                        {
                            return -1L;
                        }
                    } else
                    {
                        return l;
                    }
                } while (true);
            }
        } while (true);
    }

    public long indexOfElement(ByteString bytestring)
    {
        return indexOfElement(bytestring, 0L);
    }

    public long indexOfElement(ByteString bytestring, long l)
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        do
        {
            long l1 = l;
            if (l >= buffer.size)
            {
                if (source.read(buffer, 2048L) == -1L)
                {
                    return -1L;
                }
            } else
            {
                do
                {
                    l = buffer.indexOfElement(bytestring, l1);
                    if (l == -1L)
                    {
                        l1 = buffer.size;
                        if (source.read(buffer, 2048L) == -1L)
                        {
                            return -1L;
                        }
                    } else
                    {
                        return l;
                    }
                } while (true);
            }
        } while (true);
    }

    public InputStream inputStream()
    {
        return new InputStream() {

            final RealBufferedSource this$0;

            public int available()
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
            {
                RealBufferedSource.this.close();
            }

            public int read()
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

    public int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
    {
        Util.checkOffsetAndCount(abyte0.length, i, j);
        if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
        {
            return -1;
        } else
        {
            j = (int)Math.min(j, buffer.size);
            return buffer.read(abyte0, i, j);
        }
    }

    public long read(Buffer buffer1, long l)
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

    public long readAll(Sink sink)
    {
        if (sink == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        long l = 0L;
        do
        {
            if (source.read(buffer, 2048L) == -1L)
            {
                break;
            }
            long l1 = buffer.completeSegmentByteCount();
            if (l1 > 0L)
            {
                l += l1;
                sink.write(buffer, l1);
            }
        } while (true);
        long l2 = l;
        if (buffer.size() > 0L)
        {
            l2 = l + buffer.size();
            sink.write(buffer, buffer.size());
        }
        return l2;
    }

    public byte readByte()
    {
        require(1L);
        return buffer.readByte();
    }

    public byte[] readByteArray()
    {
        buffer.writeAll(source);
        return buffer.readByteArray();
    }

    public byte[] readByteArray(long l)
    {
        require(l);
        return buffer.readByteArray(l);
    }

    public ByteString readByteString()
    {
        buffer.writeAll(source);
        return buffer.readByteString();
    }

    public ByteString readByteString(long l)
    {
        require(l);
        return buffer.readByteString(l);
    }

    public long readDecimalLong()
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

    public void readFully(Buffer buffer1, long l)
    {
        try
        {
            require(l);
        }
        catch (EOFException eofexception)
        {
            buffer1.writeAll(buffer);
            throw eofexception;
        }
        buffer.readFully(buffer1, l);
    }

    public void readFully(byte abyte0[])
    {
        try
        {
            require(abyte0.length);
        }
        catch (EOFException eofexception)
        {
            int j;
            for (int i = 0; buffer.size > 0L; i += j)
            {
                j = buffer.read(abyte0, i, (int)buffer.size - i);
                if (j == -1)
                {
                    throw new AssertionError();
                }
            }

            throw eofexception;
        }
        buffer.readFully(abyte0);
    }

    public long readHexadecimalUnsignedLong()
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
    {
        require(4L);
        return buffer.readInt();
    }

    public int readIntLe()
    {
        require(4L);
        return buffer.readIntLe();
    }

    public long readLong()
    {
        require(8L);
        return buffer.readLong();
    }

    public long readLongLe()
    {
        require(8L);
        return buffer.readLongLe();
    }

    public short readShort()
    {
        require(2L);
        return buffer.readShort();
    }

    public short readShortLe()
    {
        require(2L);
        return buffer.readShortLe();
    }

    public String readString(long l, Charset charset)
    {
        require(l);
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        } else
        {
            return buffer.readString(l, charset);
        }
    }

    public String readString(Charset charset)
    {
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        } else
        {
            buffer.writeAll(source);
            return buffer.readString(charset);
        }
    }

    public String readUtf8()
    {
        buffer.writeAll(source);
        return buffer.readUtf8();
    }

    public String readUtf8(long l)
    {
        require(l);
        return buffer.readUtf8(l);
    }

    public String readUtf8Line()
    {
        long l = indexOf((byte)10);
        if (l == -1L)
        {
            if (buffer.size != 0L)
            {
                return readUtf8(buffer.size);
            } else
            {
                return null;
            }
        } else
        {
            return buffer.readUtf8Line(l);
        }
    }

    public String readUtf8LineStrict()
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
