// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package okio:
//            BufferedSink, Buffer, Sink, Util, 
//            Source, Timeout, ByteString

final class RealBufferedSink
    implements BufferedSink
{

    public final Buffer buffer;
    private boolean closed;
    public final Sink sink;

    public RealBufferedSink(Sink sink1)
    {
        this(sink1, new Buffer());
    }

    private RealBufferedSink(Sink sink1, Buffer buffer1)
    {
        if (sink1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            buffer = buffer1;
            sink = sink1;
            return;
        }
    }

    public final Buffer buffer()
    {
        return buffer;
    }

    public final void close()
        throws IOException
    {
        if (!closed) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Throwable throwable;
        Throwable throwable1;
        throwable1 = null;
        throwable = throwable1;
        if (buffer.size <= 0L)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        sink.write(buffer, buffer.size);
        throwable = throwable1;
_L3:
        sink.close();
        throwable1 = throwable;
_L4:
        closed = true;
        if (throwable1 != null)
        {
            Util.sneakyRethrow(throwable1);
            return;
        }
          goto _L1
        throwable;
          goto _L3
        Throwable throwable2;
        throwable2;
        throwable1 = throwable;
        if (throwable == null)
        {
            throwable1 = throwable2;
        }
          goto _L4
    }

    public final BufferedSink emit()
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        long l = buffer.size();
        if (l > 0L)
        {
            sink.write(buffer, l);
        }
        return this;
    }

    public final BufferedSink emitCompleteSegments()
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        long l = buffer.completeSegmentByteCount();
        if (l > 0L)
        {
            sink.write(buffer, l);
        }
        return this;
    }

    public final void flush()
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        if (buffer.size > 0L)
        {
            sink.write(buffer, buffer.size);
        }
        sink.flush();
    }

    public final OutputStream outputStream()
    {
        return new OutputStream() {

            final RealBufferedSink this$0;

            public final void close()
                throws IOException
            {
                RealBufferedSink.this.close();
            }

            public final void flush()
                throws IOException
            {
                if (!closed)
                {
                    RealBufferedSink.this.flush();
                }
            }

            public final String toString()
            {
                return (new StringBuilder()).append(RealBufferedSink.this).append(".outputStream()").toString();
            }

            public final void write(int i)
                throws IOException
            {
                if (closed)
                {
                    throw new IOException("closed");
                } else
                {
                    buffer.writeByte((byte)i);
                    emitCompleteSegments();
                    return;
                }
            }

            public final void write(byte abyte0[], int i, int j)
                throws IOException
            {
                if (closed)
                {
                    throw new IOException("closed");
                } else
                {
                    buffer.write(abyte0, i, j);
                    emitCompleteSegments();
                    return;
                }
            }

            
            {
                this$0 = RealBufferedSink.this;
                super();
            }
        };
    }

    public final Timeout timeout()
    {
        return sink.timeout();
    }

    public final String toString()
    {
        return (new StringBuilder("buffer(")).append(sink).append(")").toString();
    }

    public final BufferedSink write(ByteString bytestring)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.write(bytestring);
            return emitCompleteSegments();
        }
    }

    public final BufferedSink write(byte abyte0[])
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.write(abyte0);
            return emitCompleteSegments();
        }
    }

    public final BufferedSink write(byte abyte0[], int i, int j)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.write(abyte0, i, j);
            return emitCompleteSegments();
        }
    }

    public final void write(Buffer buffer1, long l)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.write(buffer1, l);
            emitCompleteSegments();
            return;
        }
    }

    public final long writeAll(Source source)
        throws IOException
    {
        if (source == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l = 0L;
        do
        {
            long l1 = source.read(buffer, 2048L);
            if (l1 != -1L)
            {
                l += l1;
                emitCompleteSegments();
            } else
            {
                return l;
            }
        } while (true);
    }

    public final BufferedSink writeByte(int i)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeByte(i);
            return emitCompleteSegments();
        }
    }

    public final BufferedSink writeInt(int i)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeInt(i);
            return emitCompleteSegments();
        }
    }

    public final BufferedSink writeShort(int i)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeShort(i);
            return emitCompleteSegments();
        }
    }

    public final BufferedSink writeUtf8(String s)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeUtf8(s);
            return emitCompleteSegments();
        }
    }

}
