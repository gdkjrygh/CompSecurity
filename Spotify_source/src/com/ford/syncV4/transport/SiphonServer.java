// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.transport;

import axn;
import axr;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

public final class SiphonServer
{

    private static Boolean a = Boolean.valueOf(false);
    private static Boolean b = Boolean.valueOf(false);
    private static Socket c = null;
    private static Object d = new Object();
    private static ServerSocket e = null;
    private static OutputStream f = null;
    private static axn g = null;
    private static long h = 0L;
    private static byte i = 1;
    private static final Integer j = Integer.valueOf(1000);
    private static Boolean k = Boolean.valueOf(false);

    public static OutputStream a(OutputStream outputstream)
    {
        f = outputstream;
        return outputstream;
    }

    private static Boolean a(byte byte0, Integer integer, byte abyte0[], int l, int i1)
    {
        com/ford/syncV4/transport/SiphonServer;
        JVM INSTR monitorenter ;
        if (a.booleanValue()) goto _L2; else goto _L1
_L1:
        integer = Boolean.valueOf(false);
_L4:
        com/ford/syncV4/transport/SiphonServer;
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
        com/ford/syncV4/transport/SiphonServer;
        JVM INSTR monitorexit ;
        throw integer;
        outputstream.write(axr.a(i1 + 1 + 1 + 4));
        outputstream.write(new byte[] {
            byte0
        });
        outputstream.write(new byte[] {
            i
        });
        int j1 = integer.intValue();
        outputstream.write(new byte[] {
            j1 >> 24, (byte)(j1 >>> 16), (byte)(j1 >>> 8), (byte)j1
        });
        outputstream.write(abyte0, l, i1);
        integer = Boolean.valueOf(true);
        continue; /* Loop/switch isn't completed */
        integer;
        integer = Boolean.valueOf(false);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Boolean a(SiphonDataType siphondatatype, byte abyte0[], int l, int i1)
    {
        int j1;
        boolean flag;
        int k1;
        flag = false;
        k1 = (int)(System.currentTimeMillis() - h);
        j1 = ((flag) ? 1 : 0);
        public final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[SiphonDataType.values().length];
                try
                {
                    a[SiphonDataType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[SiphonDataType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[SiphonDataType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SiphonDataType.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SiphonDataType.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SiphonDataType.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[siphondatatype.ordinal()];
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
        return a(SiphonDataType.c, ((byte []) (s)), 0, l);
    }

    public static Boolean a(byte abyte0[], int l)
    {
        if (k.booleanValue())
        {
            return Boolean.valueOf(false);
        } else
        {
            return a(SiphonDataType.a, abyte0, 0, l);
        }
    }

    public static Boolean a(byte abyte0[], int l, int i1)
    {
        if (k.booleanValue())
        {
            return Boolean.valueOf(false);
        } else
        {
            return a(SiphonDataType.b, abyte0, l, i1);
        }
    }

    public static ServerSocket a(ServerSocket serversocket)
    {
        e = serversocket;
        return serversocket;
    }

    public static Socket a(Socket socket)
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
                axn axn1 = new axn((byte)0);
                g = axn1;
                axn1.setName("Siphon");
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
        if (a(SiphonDataType.d, s, 0, l).booleanValue())
        {
            k = Boolean.valueOf(true);
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public static Integer b()
    {
        return j;
    }

    public static ServerSocket c()
    {
        return e;
    }

    public static Object d()
    {
        return d;
    }

    public static OutputStream e()
    {
        return f;
    }

    public static Socket f()
    {
        return c;
    }


    private class SiphonDataType extends Enum
    {

        public static final SiphonDataType a;
        public static final SiphonDataType b;
        public static final SiphonDataType c;
        public static final SiphonDataType d;
        public static final SiphonDataType e;
        public static final SiphonDataType f;
        private static final SiphonDataType g[];

        public static SiphonDataType valueOf(String s)
        {
            return (SiphonDataType)Enum.valueOf(com/ford/syncV4/transport/SiphonServer$SiphonDataType, s);
        }

        public static SiphonDataType[] values()
        {
            return (SiphonDataType[])g.clone();
        }

        static 
        {
            a = new SiphonDataType("fromSync", 0);
            b = new SiphonDataType("fromApp", 1);
            c = new SiphonDataType("appLog", 2);
            d = new SiphonDataType("formattedTrace", 3);
            e = new SiphonDataType("baselineTimeStamp", 4);
            f = new SiphonDataType("traceSettings", 5);
            g = (new SiphonDataType[] {
                a, b, c, d, e, f
            });
        }

        private SiphonDataType(String s, int l)
        {
            super(s, l);
        }
    }

}
