// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kik.a.f.m;
import kik.android.net.e;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpResponseException;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.net.a:
//            m

public final class l extends OutputStream
{

    private static final b l = org.c.c.a("ManualHttpUpload");
    private final Object a = new Object();
    private List b;
    private volatile int c;
    private Socket d;
    private OutputStream e;
    private InputStream f;
    private volatile int g;
    private volatile String h;
    private volatile IOException i;
    private volatile String j;
    private HashMap k;
    private final Runnable m = new kik.android.net.a.m(this);

    public l()
    {
        b = new ArrayList();
        c = 1;
        g = -1;
        k = null;
    }

    static int a(l l1, int i1)
    {
        l1.g = i1;
        return i1;
    }

    static IOException a(l l1, IOException ioexception)
    {
        l1.i = ioexception;
        return ioexception;
    }

    static InputStream a(l l1, InputStream inputstream)
    {
        l1.f = inputstream;
        return inputstream;
    }

    static String a(l l1, String s)
    {
        l1.h = s;
        return s;
    }

    static Socket a(l l1)
    {
        return l1.d;
    }

    static HashMap a(l l1, HashMap hashmap)
    {
        l1.k = hashmap;
        return hashmap;
    }

    static InputStream b(l l1)
    {
        return l1.f;
    }

    static String b(l l1, String s)
    {
        l1.j = s;
        return s;
    }

    static int c(l l1)
    {
        return l1.c;
    }

    static Object d(l l1)
    {
        return l1.a;
    }

    private void e()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c != 2)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (g != -1 && g != 200)
        {
            throw new HttpResponseException(g, h);
        }
        if (i != null)
        {
            IOException ioexception = i;
            throw new IOException((new StringBuilder("IOException from read thread: ")).append(i).toString());
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public final int a()
    {
        e.flush();
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c == 1)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_35;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        int i1;
        if (i != null)
        {
            IOException ioexception = i;
            throw new IOException((new StringBuilder("IOException from read thread: ")).append(i).toString());
        }
        i1 = g;
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        try
        {
            a.wait(30000L);
        }
        catch (InterruptedException interruptedexception) { }
        if (c != 2)
        {
            throw new IllegalStateException();
        }
        if (i != null)
        {
            IOException ioexception1 = i;
            throw new IOException((new StringBuilder("IOException from read thread: ")).append(i).toString());
        }
        if (g == -1)
        {
            throw new NoHttpResponseException("Timed out while waiting for response");
        }
        obj;
        JVM INSTR monitorexit ;
        return g;
    }

    public final void a(String s, String s1)
    {
        b.add((new StringBuilder()).append(s).append(": ").append(s1).toString());
    }

    public final void a(String s, String s1, l l1)
    {
        if (c != 1)
        {
            throw new IllegalStateException("only open me once");
        }
        String s2;
        int i1;
        boolean flag;
        URL url = new URL(s);
        flag = "https".equals(url.getProtocol());
        s = url.getHost();
        s2 = url.getPath();
        i1 = url.getPort();
        char c1;
        if (i1 < 0)
        {
            String s3;
            if (flag)
            {
                c1 = '\u01BB';
            } else
            {
                c1 = 'P';
            }
            i1 = c1;
        }
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_602;
        }
        if (l1.c == 2) goto _L2; else goto _L1
_L1:
        c1 = '\0';
_L12:
        if (c1 == 0) goto _L4; else goto _L3
_L3:
        d = l1.d;
        f = l1.f;
        e = l1.e;
        l1.f = null;
        l1.e = null;
        l1.d = null;
        l1.c = 3;
        c1 = '\001';
_L17:
        if (c1 != 0) goto _L6; else goto _L5
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        d = SSLSocketFactory.getDefault().createSocket(s, i1);
_L16:
        d.setSoTimeout(15000);
        d.setKeepAlive(true);
        d.setTrafficClass(8);
        e = d.getOutputStream();
        e = new m(e, 20000L, new e(d));
_L6:
        l1 = new BufferedWriter(new OutputStreamWriter(e));
        l1.write((new StringBuilder()).append(s1).append(" ").append(s2).append(" HTTP/1.1\r\n").toString());
        l1.write((new StringBuilder("Host: ")).append(s).append("\r\n").toString());
        l1.write("Connection: Keep-Alive\r\n");
        for (s = b.iterator(); s.hasNext(); l1.write((new StringBuilder()).append(s1).append("\r\n").toString()))
        {
            s1 = (String)s.next();
        }

          goto _L9
        s1;
        synchronized (a)
        {
            if (c != 2)
            {
                c = 3;
            }
        }
        throw s1;
_L2:
        if (l1.d != null && l1.d.isConnected()) goto _L11; else goto _L10
_L11:
        if (l1.k != null)
        {
            break MISSING_BLOCK_LABEL_438;
        }
        c1 = '\0';
          goto _L12
        s3 = (String)l1.k.get("connection");
        if (s3 == null) goto _L14; else goto _L13
_L13:
        if ("keep-alive".equals(s3.toLowerCase())) goto _L14; else goto _L15
_L15:
        c1 = '\0';
          goto _L12
_L4:
        l1.c();
        break MISSING_BLOCK_LABEL_602;
_L8:
        d = new Socket(s, i1);
          goto _L16
_L9:
        l1.write("\r\n");
        l1.flush();
        (new Thread(m, "ManualHttp-read")).start();
        synchronized (a)
        {
            c = 2;
        }
        synchronized (a)
        {
            if (c != 2)
            {
                c = 3;
            }
        }
        return;
        s1;
        s;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        s;
        JVM INSTR monitorexit ;
        throw s1;
        s1;
        s;
        JVM INSTR monitorexit ;
        throw s1;
_L10:
        c1 = '\0';
          goto _L12
_L14:
        c1 = '\001';
          goto _L12
        c1 = '\0';
          goto _L17
    }

    public final String b()
    {
        return j;
    }

    public final void c()
    {
        try
        {
            close();
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public final void close()
    {
        synchronized (a)
        {
            c = 3;
        }
        IOException ioexception;
        if (f != null)
        {
            try
            {
                f.close();
            }
            catch (IOException ioexception2) { }
        }
        if (e != null)
        {
            try
            {
                e.close();
            }
            catch (IOException ioexception1) { }
        }
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        d.close();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        ioexception;
    }

    public final String d()
    {
        return h;
    }

    public final void flush()
    {
        e();
        super.flush();
        if (e != null)
        {
            e.flush();
        }
    }

    public final void write(int i1)
    {
        e();
        e.write(i1);
    }

    public final void write(byte abyte0[], int i1, int j1)
    {
        e();
        e.write(abyte0, i1, j1);
    }

}
