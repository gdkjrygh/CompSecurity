// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package okio:
//            RealBufferedSink, RealBufferedSource, Timeout, AsyncTimeout, 
//            Sink, BufferedSink, Source, BufferedSource, 
//            Buffer, Util, Segment, SegmentPool

public final class Okio
{

    private static final Logger logger = Logger.getLogger(okio/Okio.getName());

    private Okio()
    {
    }

    public static Sink appendingSink(File file)
        throws FileNotFoundException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return sink(new FileOutputStream(file, true));
        }
    }

    public static BufferedSink buffer(Sink sink1)
    {
        if (sink1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            return new RealBufferedSink(sink1);
        }
    }

    public static BufferedSource buffer(Source source1)
    {
        if (source1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return new RealBufferedSource(source1);
        }
    }

    public static Sink sink(File file)
        throws FileNotFoundException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return sink(((OutputStream) (new FileOutputStream(file))));
        }
    }

    public static Sink sink(OutputStream outputstream)
    {
        return sink(outputstream, new Timeout());
    }

    private static Sink sink(OutputStream outputstream, Timeout timeout1)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        if (timeout1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new Sink(timeout1, outputstream) {

                final OutputStream val$out;
                final Timeout val$timeout;

                public void close()
                    throws IOException
                {
                    out.close();
                }

                public void flush()
                    throws IOException
                {
                    out.flush();
                }

                public Timeout timeout()
                {
                    return timeout;
                }

                public String toString()
                {
                    return (new StringBuilder()).append("sink(").append(out).append(")").toString();
                }

                public void write(Buffer buffer1, long l)
                    throws IOException
                {
                    Util.checkOffsetAndCount(buffer1.size, 0L, l);
                    do
                    {
                        if (l <= 0L)
                        {
                            break;
                        }
                        timeout.throwIfReached();
                        Segment segment = buffer1.head;
                        int i = (int)Math.min(l, segment.limit - segment.pos);
                        out.write(segment.data, segment.pos, i);
                        segment.pos = segment.pos + i;
                        long l1 = l - (long)i;
                        buffer1.size = buffer1.size - (long)i;
                        l = l1;
                        if (segment.pos == segment.limit)
                        {
                            buffer1.head = segment.pop();
                            SegmentPool.recycle(segment);
                            l = l1;
                        }
                    } while (true);
                }

            
            {
                timeout = timeout1;
                out = outputstream;
                super();
            }
            };
        }
    }

    public static Sink sink(Socket socket)
        throws IOException
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            AsyncTimeout asynctimeout = timeout(socket);
            return asynctimeout.sink(sink(socket.getOutputStream(), ((Timeout) (asynctimeout))));
        }
    }

    public static Source source(File file)
        throws FileNotFoundException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return source(((InputStream) (new FileInputStream(file))));
        }
    }

    public static Source source(InputStream inputstream)
    {
        return source(inputstream, new Timeout());
    }

    private static Source source(InputStream inputstream, Timeout timeout1)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (timeout1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new Source(timeout1, inputstream) {

                final InputStream val$in;
                final Timeout val$timeout;

                public void close()
                    throws IOException
                {
                    in.close();
                }

                public long read(Buffer buffer1, long l)
                    throws IOException
                {
                    if (l < 0L)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
                    }
                    if (l == 0L)
                    {
                        return 0L;
                    }
                    timeout.throwIfReached();
                    Segment segment = buffer1.writableSegment(1);
                    int i = (int)Math.min(l, 2048 - segment.limit);
                    i = in.read(segment.data, segment.limit, i);
                    if (i == -1)
                    {
                        return -1L;
                    } else
                    {
                        segment.limit = segment.limit + i;
                        buffer1.size = buffer1.size + (long)i;
                        return (long)i;
                    }
                }

                public Timeout timeout()
                {
                    return timeout;
                }

                public String toString()
                {
                    return (new StringBuilder()).append("source(").append(in).append(")").toString();
                }

            
            {
                timeout = timeout1;
                in = inputstream;
                super();
            }
            };
        }
    }

    public static Source source(Socket socket)
        throws IOException
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            AsyncTimeout asynctimeout = timeout(socket);
            return asynctimeout.source(source(socket.getInputStream(), ((Timeout) (asynctimeout))));
        }
    }

    private static AsyncTimeout timeout(Socket socket)
    {
        return new AsyncTimeout(socket) {

            final Socket val$socket;

            protected void timedOut()
            {
                try
                {
                    socket.close();
                    return;
                }
                catch (Exception exception)
                {
                    Okio.logger.log(Level.WARNING, (new StringBuilder()).append("Failed to close timed out socket ").append(socket).toString(), exception);
                }
            }

            
            {
                socket = socket1;
                super();
            }
        };
    }


}
