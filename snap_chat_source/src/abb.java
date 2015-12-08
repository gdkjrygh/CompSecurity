// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.util.Date;
import org.json.JSONArray;

public final class abb extends aaf
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static a f;
        private static a g;
        private static a h;
        private static a i;
        private static a j;
        private static a k;
        private static a l;
        private static final a n[];
        private String m;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(abb$a, s);
        }

        public static a[] values()
        {
            return (a[])n.clone();
        }

        public final String toString()
        {
            return m;
        }

        static 
        {
            a = new a("NOT_LOGGED_YET", 0, "Not logged");
            f = new a("INPUT_STREAM_READ", 1, "InputStream.read()");
            g = new a("INPUT_STREAM_CLOSE", 2, "InputStream.close()");
            h = new a("SOCKET_CLOSE", 3, "Socket.close()");
            i = new a("LEGACY_JAVANET", 4, "Legacy java.net");
            j = new a("HTTP_CONTENT_LENGTH_PARSER", 5, "parse()");
            b = new a("INPUT_STREAM_FINISHED", 6, "finishedMessage()");
            c = new a("PARSING_INPUT_STREAM_LOG_ERROR", 7, "logError()");
            d = new a("SOCKET_IMPL_CONNECT", 8, "MonitoredSocketImpl.connect()");
            e = new a("SSL_SOCKET_START_HANDSHAKE", 9, "MonitoredSSLSocket.startHandshake");
            k = new a("UNIT_TEST", 10, "Unit test");
            l = new a("LOG_ENDPOINT", 11, "logEndpoint");
            n = (new a[] {
                a, f, g, h, i, j, b, c, d, e, 
                k, l
            });
        }

        private a(String s, int i1, String s1)
        {
            super(s, i1);
            m = s1;
        }
    }


    public long a;
    boolean b;
    boolean c;
    a d;
    long e;
    public long f;
    public int g;
    public String h;
    public aaE i;
    public aeU j;
    public String k;
    public ZZ l;
    private long m;
    private String n;

    public abb()
    {
        a = 0x7fffffffffffffffL;
        m = 0x7fffffffffffffffL;
        b = false;
        c = false;
        d = a.a;
        e = 0L;
        f = 0L;
        g = 0;
        h = "";
        i = new aaE(null);
        j = new aeU();
        l = ZZ.a;
        n = aaw.a.a();
    }

    public abb(String s)
    {
        a = 0x7fffffffffffffffL;
        m = 0x7fffffffffffffffL;
        b = false;
        c = false;
        d = a.a;
        e = 0L;
        f = 0L;
        g = 0;
        h = "";
        i = new aaE(null);
        j = new aeU();
        l = ZZ.a;
        n = aaw.a.a();
        if (s != null)
        {
            k = s;
        }
    }

    private long g()
    {
        long l2 = 0x7fffffffffffffffL;
        long l1 = l2;
        if (a != 0x7fffffffffffffffL)
        {
            l1 = l2;
            if (m != 0x7fffffffffffffffL)
            {
                l1 = m - a;
            }
        }
        return l1;
    }

    public final String a()
    {
        String s;
        String s1;
        boolean flag;
        flag = true;
        s1 = k;
        s = s1;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        Object obj = j;
        String s2;
        String s3;
        String s4;
        String s5;
        int i1;
        if (((aeU) (obj)).b != null)
        {
            s2 = ((aeU) (obj)).b;
        } else
        if (((aeU) (obj)).a != null)
        {
            s2 = ((aeU) (obj)).a.getHostName();
        } else
        {
            s2 = "unknown-host";
        }
        if (!((aeU) (obj)).f) goto _L4; else goto _L3
_L3:
        i1 = ((aeU) (obj)).e;
        s = s2;
        if (i1 > 0)
        {
            s3 = (new StringBuilder(":")).append(i1).toString();
            s = s2;
            if (!s2.endsWith(s3))
            {
                s = (new StringBuilder()).append(s2).append(s3).toString();
            }
        }
_L12:
        k = s;
_L2:
        return s;
_L4:
        s3 = ((aeU) (obj)).c;
        if (s3 == null) goto _L6; else goto _L5
_L5:
        i1 = ((flag) ? 1 : 0);
        if (s3.regionMatches(true, 0, "http:", 0, 5)) goto _L8; else goto _L7
_L7:
        if (!s3.regionMatches(true, 0, "https:", 0, 6)) goto _L6; else goto _L9
_L9:
        i1 = ((flag) ? 1 : 0);
_L8:
        if (!i1)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s3;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0;
        if (true) goto _L8; else goto _L10
_L10:
label0:
        {
            if (((aeU) (obj)).d != null)
            {
                s = (new StringBuilder()).append("").append(aeU.a.a(((aeU) (obj)).d)).append(":").toString();
            } else
            {
                s = "";
            }
            if (s3.startsWith("//"))
            {
                s = (new StringBuilder()).append(s).append(s3).toString();
                continue; /* Loop/switch isn't completed */
            }
            s5 = (new StringBuilder()).append(s).append("//").toString();
            if (s3.startsWith(s2))
            {
                s = (new StringBuilder()).append(s5).append(s3).toString();
                continue; /* Loop/switch isn't completed */
            }
            s4 = "";
            s = s4;
            if (((aeU) (obj)).e <= 0)
            {
                break label0;
            }
            if (((aeU) (obj)).d != null)
            {
                s = s4;
                if (aeU.a.b(((aeU) (obj)).d) == ((aeU) (obj)).e)
                {
                    break label0;
                }
            }
            obj = (new StringBuilder(":")).append(((aeU) (obj)).e).toString();
            s = s4;
            if (!s2.endsWith(((String) (obj))))
            {
                s = ((String) (obj));
            }
        }
        s = (new StringBuilder()).append(s5).append(s2).append(s).append(s3).toString();
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void a(int i1)
    {
        aeU aeu = j;
        if (i1 > 0)
        {
            aeu.e = i1;
        }
    }

    public final void a(aeU.a a1)
    {
        j.d = a1;
    }

    public final void a(OutputStream outputstream)
    {
        outputstream.write(d().toString().getBytes());
    }

    public final void a(String s)
    {
        k = null;
        j.b = s;
    }

    public final void a(Throwable throwable)
    {
        i = new aaE(throwable);
    }

    public final void a(InetAddress inetaddress)
    {
        k = null;
        j.a = inetaddress;
    }

    public final void b()
    {
        if (!b && a == 0x7fffffffffffffffL)
        {
            a = System.currentTimeMillis();
        }
    }

    public final void c()
    {
        if (m == 0x7fffffffffffffffL)
        {
            m = System.currentTimeMillis();
        }
    }

    public final JSONArray d()
    {
        JSONArray jsonarray = new JSONArray();
        try
        {
            jsonarray.put(h);
            jsonarray.put(a());
            jsonarray.put(abp.a.a(new Date(a)));
            jsonarray.put(g());
            jsonarray.put(l.d);
            jsonarray.put(e);
            jsonarray.put(f);
            jsonarray.put(g);
            jsonarray.put(i.a);
            jsonarray.put(i.b);
        }
        catch (Exception exception)
        {
            System.out.println("Failed to create statsArray");
            exception.printStackTrace();
            return null;
        }
        return jsonarray;
    }

    public final String e()
    {
        return n;
    }

    public final void f()
    {
        j.f = true;
    }

    public final String toString()
    {
        String s = (new StringBuilder()).append("").append("URI            : ").append(k).append("\n").toString();
        s = (new StringBuilder()).append(s).append("URI Builder    : ").append(j.toString()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Logged by      : ").append(d.toString()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Error type:         : ").append(i.a).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Error code:         : ").append(i.b).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Response time  : ").append(g()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Start time     : ").append(a).append("\n").toString();
        s = (new StringBuilder()).append(s).append("End time       : ").append(m).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Bytes out    : ").append(f).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Bytes in     : ").append(e).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Response code  : ").append(g).append("\n").toString();
        return (new StringBuilder()).append(s).append("Request method : ").append(h).append("\n").toString();
    }
}
