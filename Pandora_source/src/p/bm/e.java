// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bm;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import p.bn.b;
import p.bn.d;

public class e
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/bm/e$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("fromSync", 0);
            b = new a("fromApp", 1);
            c = new a("appLog", 2);
            d = new a("formattedTrace", 3);
            e = new a("baselineTimeStamp", 4);
            f = new a("traceSettings", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s, int l)
        {
            super(s, l);
        }
    }

    private static class b extends Thread
    {

        short a;
        private Boolean b;

        private void a()
            throws IOException
        {
            Socket socket;
            socket = e.c().accept();
            if (b.booleanValue())
            {
                return;
            }
            Object obj = p.bm.e.d();
            obj;
            JVM INSTR monitorenter ;
            Object obj1 = e.e();
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            Exception exception;
            try
            {
                e.e().close();
            }
            catch (IOException ioexception1) { }
            e.a(null);
            obj1 = e.f();
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            try
            {
                e.f().close();
            }
            catch (IOException ioexception) { }
            e.a(null);
            e.a(socket);
            e.f().setKeepAlive(true);
            e.a(e.f().getOutputStream());
            p.bn.d.c("Siphon connected.");
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private boolean a(short word0)
        {
            Object obj = Boolean.valueOf(false);
            a = word0;
            do
            {
                if (!((Boolean) (obj)).booleanValue())
                {
                    try
                    {
                        e.a(new ServerSocket(a));
                    }
                    catch (BindException bindexception)
                    {
                        a = (short)(a + 1);
                        if (a > p.bm.e.b().intValue() + word0)
                        {
                            return false;
                        }
                        continue;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return false;
                    }
                    obj = Boolean.valueOf(true);
                    continue;
                }
                return ((Boolean) (obj)).booleanValue();
            } while (true);
        }

        public void run()
        {
            try
            {
                if (a((short)7474))
                {
                    for (; !b.booleanValue(); a()) { }
                }
                break MISSING_BLOCK_LABEL_46;
            }
            catch (Exception exception)
            {
                if (e.c() != null)
                {
                    Exception exception1;
                    IOException ioexception2;
                    try
                    {
                        e.c().close();
                    }
                    catch (IOException ioexception) { }
                    e.a(null);
                }
            }
            finally
            {
                if (e.c() != null)
                {
                    try
                    {
                        e.c().close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (IOException ioexception2) { }
                    e.a(null);
                }
                throw exception1;
            }
            return;
            if (e.c() != null)
            {
                try
                {
                    e.c().close();
                }
                catch (IOException ioexception1) { }
                e.a(null);
                return;
            } else
            {
                break MISSING_BLOCK_LABEL_45;
            }
        }

        private b()
        {
            b = Boolean.valueOf(false);
        }

    }


    private static Boolean a = Boolean.valueOf(false);
    private static Boolean b = Boolean.valueOf(false);
    private static Socket c = null;
    private static Object d = new Object();
    private static ServerSocket e = null;
    private static OutputStream f = null;
    private static b g = null;
    private static long h = 0L;
    private static byte i = 1;
    private static final Integer j = Integer.valueOf(1000);
    private static Boolean k = Boolean.valueOf(false);

    static OutputStream a(OutputStream outputstream)
    {
        f = outputstream;
        return outputstream;
    }

    private static Boolean a(byte byte0, Integer integer, byte abyte0[], int l, int i1)
    {
        p/bm/e;
        JVM INSTR monitorenter ;
        if (a.booleanValue()) goto _L2; else goto _L1
_L1:
        integer = Boolean.valueOf(false);
_L4:
        p/bm/e;
        JVM INSTR monitorexit ;
        return integer;
_L2:
        if (abyte0 != null && i1 != 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        integer = Boolean.valueOf(false);
        continue; /* Loop/switch isn't completed */
        OutputStream outputstream;
        synchronized (d)
        {
            outputstream = f;
        }
        if (outputstream == null)
        {
            integer = Boolean.valueOf(false);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_80;
        integer;
        obj;
        JVM INSTR monitorexit ;
        throw integer;
        integer;
        p/bm/e;
        JVM INSTR monitorexit ;
        throw integer;
        outputstream.write(p.bn.b.a(i1 + 1 + 1 + 4));
        outputstream.write(new byte[] {
            byte0
        });
        outputstream.write(new byte[] {
            i
        });
        outputstream.write(a(integer.intValue()));
        outputstream.write(abyte0, l, i1);
        integer = Boolean.valueOf(true);
        continue; /* Loop/switch isn't completed */
        integer;
        integer = Boolean.valueOf(false);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Boolean a(String s)
    {
        if (k.booleanValue())
        {
            return Boolean.valueOf(false);
        }
        if (s == null || s.length() == 0)
        {
            return Boolean.valueOf(false);
        }
        int l;
        try
        {
            s = s.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return Boolean.valueOf(false);
        }
        l = s.length;
        return a(a.c, ((byte []) (s)), 0, l);
    }

    private static Boolean a(a a1, byte abyte0[], int l, int i1)
    {
        int j1;
        boolean flag;
        int k1;
        flag = false;
        k1 = (int)(System.currentTimeMillis() - h);
        j1 = ((flag) ? 1 : 0);
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[p.bm.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.bm.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 6: default 64
    //                   1 68
    //                   2 86
    //                   3 92
    //                   4 98
    //                   5 104
    //                   6 110;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j1 = ((flag) ? 1 : 0);
_L9:
        return a((byte)(j1 | 0xffffff80), Integer.valueOf(k1), abyte0, l, i1);
_L3:
        j1 = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        j1 = 2;
        continue; /* Loop/switch isn't completed */
_L5:
        j1 = 3;
        continue; /* Loop/switch isn't completed */
_L6:
        j1 = 4;
        continue; /* Loop/switch isn't completed */
_L7:
        j1 = 5;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static Boolean a(byte abyte0[], int l, int i1)
    {
        if (k.booleanValue())
        {
            return Boolean.valueOf(false);
        } else
        {
            return a(p.bm.a.b, abyte0, l, i1);
        }
    }

    static ServerSocket a(ServerSocket serversocket)
    {
        e = serversocket;
        return serversocket;
    }

    static Socket a(Socket socket)
    {
        c = socket;
        return socket;
    }

    public static boolean a()
    {
        if (b.booleanValue())
        {
            return true;
        }
        synchronized (d)
        {
            if (!b.booleanValue() && g == null)
            {
                h = System.currentTimeMillis();
                g = new b(null);
                g.setName("Siphon");
                g.setDaemon(true);
                g.start();
                b = Boolean.valueOf(true);
            }
        }
        return b.booleanValue();
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static final byte[] a(int l)
    {
        return (new byte[] {
            (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l
        });
    }

    public static Boolean b(String s)
    {
        if (s == null || s.length() == 0)
        {
            return Boolean.valueOf(false);
        }
        int l;
        try
        {
            s = s.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return Boolean.valueOf(false);
        }
        l = s.length;
        if (a(p.bm.a.d, s, 0, l).booleanValue())
        {
            k = Boolean.valueOf(true);
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public static Boolean b(byte abyte0[], int l, int i1)
    {
        if (k.booleanValue())
        {
            return Boolean.valueOf(false);
        } else
        {
            return a(a.a, abyte0, l, i1);
        }
    }

    static Integer b()
    {
        return j;
    }

    static ServerSocket c()
    {
        return e;
    }

    static Object d()
    {
        return d;
    }

    static OutputStream e()
    {
        return f;
    }

    static Socket f()
    {
        return c;
    }

}
