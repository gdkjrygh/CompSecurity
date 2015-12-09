// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class hcq
{

    private static final Logger a = Logger.getLogger(hcq.getName());

    private hcq()
    {
    }

    public static hci a(hcv hcv)
    {
        if (hcv == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            return new hcr(hcv);
        }
    }

    public static hcj a(hcw hcw)
    {
        if (hcw == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return new hcs(hcw);
        }
    }

    private static hcv a(OutputStream outputstream)
    {
        return a(outputstream, new hcx());
    }

    private static hcv a(OutputStream outputstream, hcx hcx1)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        if (hcx1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new hcv(hcx1, outputstream) {

                private hcx a;
                private OutputStream b;

                public final hcx T_()
                {
                    return a;
                }

                public final void a_(hch hch1, long l)
                {
                    hcy.a(hch1.b, 0L, l);
                    do
                    {
                        if (l <= 0L)
                        {
                            break;
                        }
                        a.f();
                        hct hct1 = hch1.a;
                        int i = (int)Math.min(l, hct1.c - hct1.b);
                        b.write(hct1.a, hct1.b, i);
                        hct1.b = hct1.b + i;
                        long l1 = l - (long)i;
                        hch1.b = hch1.b - (long)i;
                        l = l1;
                        if (hct1.b == hct1.c)
                        {
                            hch1.a = hct1.a();
                            hcu.a(hct1);
                            l = l1;
                        }
                    } while (true);
                }

                public final void close()
                {
                    b.close();
                }

                public final void flush()
                {
                    b.flush();
                }

                public final String toString()
                {
                    return (new StringBuilder("sink(")).append(b).append(")").toString();
                }

            
            {
                a = hcx1;
                b = outputstream;
                super();
            }
            };
        }
    }

    public static hcv a(Socket socket)
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            hce hce = c(socket);
            return new hce._cls1(hce, a(socket.getOutputStream(), ((hcx) (hce))));
        }
    }

    public static hcw a(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(((InputStream) (new FileInputStream(file))), new hcx());
        }
    }

    private static hcw a(InputStream inputstream, hcx hcx1)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (hcx1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new hcw(hcx1, inputstream) {

                private hcx a;
                private InputStream b;

                public final hcx T_()
                {
                    return a;
                }

                public final long a(hch hch1, long l)
                {
                    if (l < 0L)
                    {
                        throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
                    }
                    if (l == 0L)
                    {
                        return 0L;
                    }
                    a.f();
                    hct hct1 = hch1.e(1);
                    int i = (int)Math.min(l, 2048 - hct1.c);
                    i = b.read(hct1.a, hct1.c, i);
                    if (i == -1)
                    {
                        return -1L;
                    } else
                    {
                        hct1.c = hct1.c + i;
                        hch1.b = hch1.b + (long)i;
                        return (long)i;
                    }
                }

                public final void close()
                {
                    b.close();
                }

                public final String toString()
                {
                    return (new StringBuilder("source(")).append(b).append(")").toString();
                }

            
            {
                a = hcx1;
                b = inputstream;
                super();
            }
            };
        }
    }

    static Logger a()
    {
        return a;
    }

    public static hcv b(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(new FileOutputStream(file));
        }
    }

    public static hcw b(Socket socket)
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            hce hce = c(socket);
            return new hce._cls2(hce, a(socket.getInputStream(), hce));
        }
    }

    private static hce c(Socket socket)
    {
        return new hce(socket) {

            private Socket a;

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
                    hcq.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), exception);
                    return;
                }
                catch (AssertionError assertionerror)
                {
                    if (assertionerror.getCause() != null && assertionerror.getMessage() != null && assertionerror.getMessage().contains("getsockname failed"))
                    {
                        hcq.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), assertionerror);
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

    public static hcv c(File file)
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
