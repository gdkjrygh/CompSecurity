// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.location.Location;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;

// Referenced classes of package crittercism.android:
//            bo, cm, k, b, 
//            cf, ed

public final class c extends bo
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        private static final a n[];
        private String m;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(crittercism/android/c$a, s);
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
            b = new a("INPUT_STREAM_READ", 1, "InputStream.read()");
            c = new a("INPUT_STREAM_CLOSE", 2, "InputStream.close()");
            d = new a("SOCKET_CLOSE", 3, "Socket.close()");
            e = new a("LEGACY_JAVANET", 4, "Legacy java.net");
            f = new a("HTTP_CONTENT_LENGTH_PARSER", 5, "parse()");
            g = new a("INPUT_STREAM_FINISHED", 6, "finishedMessage()");
            h = new a("PARSING_INPUT_STREAM_LOG_ERROR", 7, "logError()");
            i = new a("SOCKET_IMPL_CONNECT", 8, "MonitoredSocketImpl.connect()");
            j = new a("SSL_SOCKET_START_HANDSHAKE", 9, "MonitoredSSLSocket.startHandshake");
            k = new a("UNIT_TEST", 10, "Unit test");
            l = new a("LOG_ENDPOINT", 11, "logEndpoint");
            n = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
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
    public boolean b;
    a c;
    public long d;
    public int e;
    public String f;
    public cm g;
    public k h;
    public String i;
    public b j;
    private long k;
    private boolean l;
    private boolean m;
    private String n;
    private long o;
    private boolean p;
    private boolean q;
    private double r[];

    public c()
    {
        a = 0x7fffffffffffffffL;
        k = 0x7fffffffffffffffL;
        l = false;
        m = false;
        b = false;
        c = a.a;
        o = 0L;
        d = 0L;
        p = false;
        q = false;
        e = 0;
        f = "";
        g = new cm(null);
        h = new k();
        j = b.a;
        n = cf.a.a();
    }

    public c(String s)
    {
        a = 0x7fffffffffffffffL;
        k = 0x7fffffffffffffffL;
        l = false;
        m = false;
        b = false;
        c = a.a;
        o = 0L;
        d = 0L;
        p = false;
        q = false;
        e = 0;
        f = "";
        g = new cm(null);
        h = new k();
        j = b.a;
        n = cf.a.a();
        if (s != null)
        {
            i = s;
        }
    }

    public c(URL url)
    {
        a = 0x7fffffffffffffffL;
        k = 0x7fffffffffffffffL;
        l = false;
        m = false;
        b = false;
        c = a.a;
        o = 0L;
        d = 0L;
        p = false;
        q = false;
        e = 0;
        f = "";
        g = new cm(null);
        h = new k();
        j = b.a;
        n = cf.a.a();
        if (url != null)
        {
            i = url.toExternalForm();
        }
    }

    private long g()
    {
        long l2 = 0x7fffffffffffffffL;
        long l1 = l2;
        if (a != 0x7fffffffffffffffL)
        {
            l1 = l2;
            if (k != 0x7fffffffffffffffL)
            {
                l1 = k - a;
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
        s1 = i;
        s = s1;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        Object obj = h;
        String s2;
        String s3;
        String s4;
        String s5;
        int i1;
        if (((k) (obj)).b != null)
        {
            s2 = ((k) (obj)).b;
        } else
        if (((k) (obj)).a != null)
        {
            s2 = ((k) (obj)).a.getHostName();
        } else
        {
            s2 = "unknown-host";
        }
        if (!((k) (obj)).f) goto _L4; else goto _L3
_L3:
        i1 = ((k) (obj)).e;
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
        i = s;
_L2:
        return s;
_L4:
        s3 = ((k) (obj)).c;
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
            if (((k) (obj)).d != null)
            {
                s = (new StringBuilder()).append("").append(crittercism.android.k.a.a(((k) (obj)).d)).append(":").toString();
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
            if (((k) (obj)).e <= 0)
            {
                break label0;
            }
            if (((k) (obj)).d != null)
            {
                s = s4;
                if (crittercism.android.k.a.b(((k) (obj)).d) == ((k) (obj)).e)
                {
                    break label0;
                }
            }
            obj = (new StringBuilder(":")).append(((k) (obj)).e).toString();
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
        k k1 = h;
        if (i1 > 0)
        {
            k1.e = i1;
        }
    }

    public final void a(long l1)
    {
        if (!p)
        {
            o = o + l1;
        }
    }

    public final void a(Location location)
    {
        r = (new double[] {
            location.getLatitude(), location.getLongitude()
        });
    }

    public final void a(k.a a1)
    {
        h.d = a1;
    }

    public final void a(OutputStream outputstream)
    {
        outputstream.write(d().toString().getBytes());
    }

    public final void a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            i = s;
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        g = new cm(throwable);
    }

    public final void a(InetAddress inetaddress)
    {
        i = null;
        h.a = inetaddress;
    }

    public final void b()
    {
        if (!l && a == 0x7fffffffffffffffL)
        {
            a = System.currentTimeMillis();
        }
    }

    public final void b(long l1)
    {
        p = true;
        o = l1;
    }

    public final void b(String s)
    {
        i = null;
        h.b = s;
    }

    public final void c()
    {
        if (!m && k == 0x7fffffffffffffffL)
        {
            k = System.currentTimeMillis();
        }
    }

    public final void c(long l1)
    {
        if (!q)
        {
            d = d + l1;
        }
    }

    public final JSONArray d()
    {
        JSONArray jsonarray = new JSONArray();
        try
        {
            jsonarray.put(f);
            jsonarray.put(a());
            jsonarray.put(ed.a.a(new Date(a)));
            jsonarray.put(g());
            jsonarray.put(j.a());
            jsonarray.put(o);
            jsonarray.put(d);
            jsonarray.put(e);
            jsonarray.put(g.a);
            jsonarray.put(g.b);
            if (r != null)
            {
                JSONArray jsonarray1 = new JSONArray();
                jsonarray1.put(r[0]);
                jsonarray1.put(r[1]);
                jsonarray.put(jsonarray1);
            }
        }
        catch (Exception exception)
        {
            System.out.println("Failed to create statsArray");
            exception.printStackTrace();
            return null;
        }
        return jsonarray;
    }

    public final void d(long l1)
    {
        q = true;
        d = l1;
    }

    public final String e()
    {
        return n;
    }

    public final void e(long l1)
    {
        a = l1;
        l = true;
    }

    public final void f()
    {
        h.f = true;
    }

    public final void f(long l1)
    {
        k = l1;
        m = true;
    }

    public final String toString()
    {
        String s = (new StringBuilder()).append("").append("URI            : ").append(i).append("\n").toString();
        s = (new StringBuilder()).append(s).append("URI Builder    : ").append(h.toString()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Logged by      : ").append(c.toString()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Error type:         : ").append(g.a).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Error code:         : ").append(g.b).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Response time  : ").append(g()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Start time     : ").append(a).append("\n").toString();
        s = (new StringBuilder()).append(s).append("End time       : ").append(k).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Bytes out    : ").append(d).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Bytes in     : ").append(o).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Response code  : ").append(e).append("\n").toString();
        String s1 = (new StringBuilder()).append(s).append("Request method : ").append(f).append("\n").toString();
        s = s1;
        if (r != null)
        {
            s = (new StringBuilder()).append(s1).append("Location       : ").append(Arrays.toString(r)).append("\n").toString();
        }
        return s;
    }
}
