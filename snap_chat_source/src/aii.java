// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class aii
{

    private static final Logger a = Logger.getLogger(aii.getName());

    private aii()
    {
    }

    public static ahY a(ain ain)
    {
        if (ain == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            return new aij(ain);
        }
    }

    public static ahZ a(aio aio)
    {
        if (aio == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return new aik(aio);
        }
    }

    private static ain a(OutputStream outputstream)
    {
        return a(outputstream, new aip());
    }

    private static ain a(OutputStream outputstream, aip aip1)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        if (aip1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new ain(aip1, outputstream) {

                private aip a;
                private OutputStream b;

                public final void a_(ahX ahx, long l)
                {
                    aiq.a(ahx.b, 0L, l);
                    do
                    {
                        if (l <= 0L)
                        {
                            break;
                        }
                        a.f();
                        ail ail1 = ahx.a;
                        int i = (int)Math.min(l, ail1.c - ail1.b);
                        b.write(ail1.a, ail1.b, i);
                        ail1.b = ail1.b + i;
                        long l1 = l - (long)i;
                        ahx.b = ahx.b - (long)i;
                        l = l1;
                        if (ail1.b == ail1.c)
                        {
                            ahx.a = ail1.a();
                            aim.a(ail1);
                            l = l1;
                        }
                    } while (true);
                }

                public final aip aa_()
                {
                    return a;
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
                a = aip1;
                b = outputstream;
                super();
            }
            };
        }
    }

    public static ain a(Socket socket)
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            ahV ahv = c(socket);
            return new ahV._cls1(ahv, a(socket.getOutputStream(), ((aip) (ahv))));
        }
    }

    public static aio a(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(((InputStream) (new FileInputStream(file))), new aip());
        }
    }

    private static aio a(InputStream inputstream, aip aip1)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (aip1 == null)
        {
            throw new IllegalArgumentException("timeout == null");
        } else
        {
            return new aio(aip1, inputstream) {

                private aip a;
                private InputStream b;

                public final long a(ahX ahx, long l)
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
                    ail ail1 = ahx.f(1);
                    int i = (int)Math.min(l, 2048 - ail1.c);
                    i = b.read(ail1.a, ail1.c, i);
                    if (i == -1)
                    {
                        return -1L;
                    } else
                    {
                        ail1.c = ail1.c + i;
                        ahx.b = ahx.b + (long)i;
                        return (long)i;
                    }
                }

                public final aip aa_()
                {
                    return a;
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
                a = aip1;
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

    public static ain b(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("file == null");
        } else
        {
            return a(new FileOutputStream(file));
        }
    }

    public static aio b(Socket socket)
    {
        if (socket == null)
        {
            throw new IllegalArgumentException("socket == null");
        } else
        {
            ahV ahv = c(socket);
            return new ahV._cls2(ahv, a(socket.getInputStream(), ahv));
        }
    }

    private static ahV c(Socket socket)
    {
        return new ahV(socket) {

            private Socket a;

            protected final void a()
            {
                try
                {
                    a.close();
                    return;
                }
                catch (Exception exception)
                {
                    aii.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), exception);
                }
            }

            
            {
                a = socket;
                super();
            }
        };
    }

    public static ain c(File file)
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
