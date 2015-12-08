// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;

import com.ford.syncV4.util.a;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

// Referenced classes of package com.ford.syncV4.i:
//            i, j, k

public final class h
{

    private static Boolean a = Boolean.valueOf(false);
    private static Boolean b = Boolean.valueOf(false);
    private static Socket c = null;
    private static Object d = new Object();
    private static ServerSocket e = null;
    private static OutputStream f = null;
    private static k g = null;
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
        com/ford/syncV4/i/h;
        JVM INSTR monitorenter ;
        if (a.booleanValue()) goto _L2; else goto _L1
_L1:
        integer = Boolean.valueOf(false);
_L4:
        com/ford/syncV4/i/h;
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
        com/ford/syncV4/i/h;
        JVM INSTR monitorexit ;
        throw integer;
        outputstream.write(com.ford.syncV4.util.a.a(i1 + 1 + 1 + 4));
        outputstream.write(new byte[] {
            byte0
        });
        outputstream.write(new byte[] {
            i
        });
        int j1 = integer.intValue();
        outputstream.write(new byte[] {
            (byte)(j1 >>> 24), (byte)(j1 >>> 16), (byte)(j1 >>> 8), (byte)j1
        });
        outputstream.write(abyte0, l, i1);
        integer = Boolean.valueOf(true);
        continue; /* Loop/switch isn't completed */
        integer;
        integer = Boolean.valueOf(false);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Boolean a(int l, byte abyte0[], int i1, int j1)
    {
        int k1;
        boolean flag;
        int l1;
        flag = false;
        l1 = (int)(System.currentTimeMillis() - h);
        k1 = ((flag) ? 1 : 0);
        com.ford.syncV4.i.i.a[l - 1];
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
        k1 = ((flag) ? 1 : 0);
_L9:
        return a((byte)(k1 | 0xffffff80), Integer.valueOf(l1), abyte0, i1, j1);
_L3:
        k1 = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        k1 = 2;
        continue; /* Loop/switch isn't completed */
_L5:
        k1 = 3;
        continue; /* Loop/switch isn't completed */
_L6:
        k1 = 4;
        continue; /* Loop/switch isn't completed */
_L7:
        k1 = 5;
        if (true) goto _L9; else goto _L8
_L8:
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
        return a(j.c, ((byte []) (s)), 0, l);
    }

    public static Boolean a(byte abyte0[], int l)
    {
        if (k.booleanValue())
        {
            return Boolean.valueOf(false);
        } else
        {
            return a(com.ford.syncV4.i.j.a, abyte0, 0, l);
        }
    }

    public static Boolean a(byte abyte0[], int l, int i1)
    {
        if (k.booleanValue())
        {
            return Boolean.valueOf(false);
        } else
        {
            return a(j.b, abyte0, l, i1);
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
                k k1 = new k((byte)0);
                g = k1;
                k1.setName("Siphon");
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
        if (a(j.d, s, 0, l).booleanValue())
        {
            k = Boolean.valueOf(true);
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
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
