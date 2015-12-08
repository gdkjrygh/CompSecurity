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
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package okio:
//            m, n, s, q, 
//            d, r, e, a, 
//            c, t, o, p

public final class l
{

    private static final Logger a = Logger.getLogger(okio/l.getName());

    private l()
    {
    }

    static Logger a()
    {
        return a;
    }

    public static d a(q q)
    {
        if (q == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            return new m(q);
        }
    }

    public static e a(r r)
    {
        if (r == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return new n(r);
        }
    }

    private static q a(OutputStream outputstream)
    {
        return a(outputstream, new s());
    }

    private static q a(OutputStream outputstream, s s1)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new q(s1, outputstream) {

                final s a;
                final OutputStream b;

                public final void a_(c c1, long l1)
                    throws IOException
                {
                    t.a(c1.b, 0L, l1);
                    do
                    {
                        if (l1 <= 0L)
                        {
                            break;
                        }
                        a.f();
                        o o1 = c1.a;
                        int i = (int)Math.min(l1, o1.c - o1.b);
                        b.write(o1.a, o1.b, i);
                        o1.b = o1.b + i;
                        long l2 = l1 - (long)i;
                        c1.b = c1.b - (long)i;
                        l1 = l2;
                        if (o1.b == o1.c)
                        {
                            c1.a = o1.a();
                            p.a(o1);
                            l1 = l2;
                        }
                    } while (true);
                }

                public final void close()
                    throws IOException
                {
                    b.close();
                }

                public final void flush()
                    throws IOException
                {
                    b.flush();
                }

                public final s q_()
                {
                    return a;
                }

                public final String toString()
                {
                    return (new StringBuilder("sink(")).append(b).append(")").toString();
                }

            
            {
                a = s1;
                b = outputstream;
                super();
            }
            };
        }
    }

    public static q a(Socket socket)
        throws IOException
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            a a1 = c(socket);
            return new a._cls1(a1, a(socket.getOutputStream(), ((s) (a1))));
        }
    }

    public static r a(File file)
        throws FileNotFoundException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(((InputStream) (new FileInputStream(file))), new s());
        }
    }

    private static r a(InputStream inputstream, s s1)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new r(s1, inputstream) {

                final s a;
                final InputStream b;

                public final long a(c c1, long l1)
                    throws IOException
                {
                    if (l1 < 0L)
                    {
                        throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
                    }
                    if (l1 == 0L)
                    {
                        return 0L;
                    }
                    a.f();
                    o o1 = c1.e(1);
                    int i = (int)Math.min(l1, 2048 - o1.c);
                    i = b.read(o1.a, o1.c, i);
                    if (i == -1)
                    {
                        return -1L;
                    } else
                    {
                        o1.c = o1.c + i;
                        c1.b = c1.b + (long)i;
                        return (long)i;
                    }
                }

                public final void close()
                    throws IOException
                {
                    b.close();
                }

                public final s q_()
                {
                    return a;
                }

                public final String toString()
                {
                    return (new StringBuilder("source(")).append(b).append(")").toString();
                }

            
            {
                a = s1;
                b = inputstream;
                super();
            }
            };
        }
    }

    public static q b(File file)
        throws FileNotFoundException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(new FileOutputStream(file));
        }
    }

    public static r b(Socket socket)
        throws IOException
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            a a1 = c(socket);
            return new a._cls2(a1, a(socket.getInputStream(), a1));
        }
    }

    private static a c(Socket socket)
    {
        return new a(socket) {

            final Socket a;

            protected final IOException a(IOException ioexception)
            {
                SocketTimeoutException sockettimeoutexception = new SocketTimeoutException("timeout");
                if (ioexception != null)
                {
                    sockettimeoutexception.initCause(ioexception);
                }
                return sockettimeoutexception;
            }

            protected final void a()
            {
                try
                {
                    a.close();
                    return;
                }
                catch (Exception exception)
                {
                    l.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), exception);
                    return;
                }
                catch (AssertionError assertionerror)
                {
                    if (assertionerror.getCause() != null && assertionerror.getMessage() != null && assertionerror.getMessage().contains("getsockname failed"))
                    {
                        l.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), assertionerror);
                        return;
                    } else
                    {
                        throw assertionerror;
                    }
                }
            }

            
            {
                a = socket;
                super();
            }
        };
    }

    public static q c(File file)
        throws FileNotFoundException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(new FileOutputStream(file, true));
        }
    }

}
