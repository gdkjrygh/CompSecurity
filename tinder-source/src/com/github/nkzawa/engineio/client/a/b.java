// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;

import com.github.nkzawa.e.a;
import com.github.nkzawa.engineio.client.Transport;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            a

public class b extends com.github.nkzawa.engineio.client.a.a
{
    public static final class a extends com.github.nkzawa.b.a
    {

        byte b[];
        HttpURLConnection c;
        private String d;
        private String e;
        private SSLContext f;
        private HostnameVerifier g;

        static void a(a a1)
        {
            Object obj;
            Object obj3;
            IOException ioexception;
            Object obj4;
            Object obj5;
            int i;
            ioexception = null;
            obj3 = null;
            obj5 = null;
            obj4 = null;
            i = 0;
            obj = a1.c.getContentType();
            if (!"application/octet-stream".equalsIgnoreCase(((String) (obj)))) goto _L2; else goto _L1
_L1:
            obj = new BufferedInputStream(a1.c.getInputStream());
            Object obj1;
            obj3 = obj5;
            obj1 = obj;
            Object obj6 = new ArrayList();
            obj3 = obj5;
            obj1 = obj;
            byte abyte0[] = new byte[1024];
_L4:
            obj3 = obj5;
            obj1 = obj;
            int k = ((InputStream) (obj)).read(abyte0);
            if (k <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            obj3 = obj5;
            obj1 = obj;
            byte abyte1[] = new byte[k];
            obj3 = obj5;
            obj1 = obj;
            System.arraycopy(abyte0, 0, abyte1, 0, k);
            obj3 = obj5;
            obj1 = obj;
            ((List) (obj6)).add(abyte1);
            i += k;
            if (true) goto _L4; else goto _L3
_L3:
            obj3 = obj5;
            obj1 = obj;
            ByteBuffer bytebuffer = ByteBuffer.allocate(i);
            obj3 = obj5;
            obj1 = obj;
            obj6 = ((List) (obj6)).iterator();
_L6:
            obj3 = obj5;
            obj1 = obj;
            if (!((Iterator) (obj6)).hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj3 = obj5;
            obj1 = obj;
            bytebuffer.put((byte[])((Iterator) (obj6)).next());
            if (true) goto _L6; else goto _L5
            ioexception;
_L13:
            obj3 = obj4;
            obj1 = obj;
            a1.a(((Exception) (ioexception)));
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (a a1) { }
            }
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_238;
            }
            ((BufferedReader) (obj4)).close();
_L8:
            return;
_L5:
            obj3 = obj5;
            obj1 = obj;
            a1.a("data", new Object[] {
                bytebuffer.array()
            });
            obj3 = obj5;
            obj1 = obj;
            a1.c();
            a1 = ioexception;
_L9:
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            if (a1 == null) goto _L8; else goto _L7
_L7:
            try
            {
                a1.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                return;
            }
_L2:
            try
            {
                obj1 = new StringBuilder();
                obj = new BufferedReader(new InputStreamReader(a1.c.getInputStream()));
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            finally
            {
                obj1 = null;
            }
            obj3 = ((BufferedReader) (obj)).readLine();
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_342;
            }
            try
            {
                ((StringBuilder) (obj1)).append(((String) (obj3)));
                break MISSING_BLOCK_LABEL_324;
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                Object obj2 = null;
                obj4 = obj;
                obj = obj2;
            }
            finally
            {
                obj1 = null;
                obj3 = obj;
            }
            continue; /* Loop/switch isn't completed */
            a1.a("data", new Object[] {
                ((StringBuilder) (obj1)).toString()
            });
            a1.c();
            obj1 = null;
            a1 = ((a) (obj));
            obj = obj1;
              goto _L9
_L11:
            if (obj1 != null)
            {
                try
                {
                    ((InputStream) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            if (obj3 != null)
            {
                try
                {
                    ((BufferedReader) (obj3)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            throw a1;
            a1;
            return;
            a1;
            continue; /* Loop/switch isn't completed */
            if (true) goto _L11; else goto _L10
_L10:
            break MISSING_BLOCK_LABEL_324;
            if (true) goto _L13; else goto _L12
_L12:
        }

        private void c()
        {
            a("success", new Object[0]);
            d();
        }

        private void d()
        {
            if (c == null)
            {
                return;
            } else
            {
                c.disconnect();
                c = null;
                return;
            }
        }

        final void a(Exception exception)
        {
            a("error", new Object[] {
                exception
            });
            d();
        }

        public final void b()
        {
            Object obj;
            try
            {
                b.j().fine(String.format("xhr open %s: %s", new Object[] {
                    d, e
                }));
                c = (HttpURLConnection)(new URL(e)).openConnection();
                c.setRequestMethod(d);
            }
            catch (IOException ioexception)
            {
                a(ioexception);
                return;
            }
            c.setConnectTimeout(10000);
            if (c instanceof HttpsURLConnection)
            {
                if (f != null)
                {
                    ((HttpsURLConnection)c).setSSLSocketFactory(f.getSocketFactory());
                }
                if (g != null)
                {
                    ((HttpsURLConnection)c).setHostnameVerifier(g);
                }
            }
            obj = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            if ("POST".equals(d))
            {
                c.setDoOutput(true);
                ((Map) (obj)).put("Content-type", new LinkedList(Arrays.asList(new String[] {
                    "application/octet-stream"
                })));
            }
            a("requestHeaders", new Object[] {
                obj
            });
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                Iterator iterator = ((List)entry.getValue()).iterator();
                while (iterator.hasNext()) 
                {
                    String s = (String)iterator.next();
                    c.addRequestProperty((String)entry.getKey(), s);
                }
            }

            b.j().fine(String.format("sending xhr with url %s | data %s", new Object[] {
                e, b
            }));
            (new Thread(new Runnable(this, this) {

                final a a;
                final a b;

                public final void run()
                {
                    if (a.b == null) goto _L2; else goto _L1
_L1:
                    Object obj1;
                    b.c.setFixedLengthStreamingMode(a.b.length);
                    obj1 = new BufferedOutputStream(b.c.getOutputStream());
                    Object obj;
                    Object obj2;
                    obj2 = obj1;
                    obj = obj1;
                    ((OutputStream) (obj1)).write(a.b);
                    obj2 = obj1;
                    obj = obj1;
                    ((OutputStream) (obj1)).flush();
_L12:
                    obj2 = obj1;
                    obj = obj1;
                    Map map = b.c.getHeaderFields();
                    obj2 = obj1;
                    obj = obj1;
                    a.a("responseHeaders", new Object[] {
                        map
                    });
                    obj2 = obj1;
                    obj = obj1;
                    int i = b.c.getResponseCode();
                    if (200 != i) goto _L4; else goto _L3
_L3:
                    obj2 = obj1;
                    obj = obj1;
                    com.github.nkzawa.engineio.client.a.a.a(a);
_L5:
                    if (obj1 == null)
                    {
                        break MISSING_BLOCK_LABEL_151;
                    }
                    ((OutputStream) (obj1)).close();
_L7:
                    return;
_L4:
                    obj2 = obj1;
                    obj = obj1;
                    a.a(new IOException(Integer.toString(i)));
                      goto _L5
                    obj1;
_L10:
                    obj = obj2;
                    a.a(((Exception) (obj1)));
                    if (obj2 == null) goto _L7; else goto _L6
_L6:
                    try
                    {
                        ((OutputStream) (obj2)).close();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return;
                    }
                    obj1;
                    obj = null;
_L9:
                    IOException ioexception;
                    if (obj != null)
                    {
                        try
                        {
                            ((OutputStream) (obj)).close();
                        }
                        catch (IOException ioexception1) { }
                    }
                    throw obj1;
                    ioexception;
                    return;
                    obj1;
                    if (true) goto _L9; else goto _L8
_L8:
                    obj1;
                    obj2 = null;
                      goto _L10
_L2:
                    obj1 = null;
                    if (true) goto _L12; else goto _L11
_L11:
                }

            
            {
                b = a1;
                a = a2;
                super();
            }
            })).start();
        }

        public a(a a1)
        {
            String s;
            if (a1.b != null)
            {
                s = a1.b;
            } else
            {
                s = "GET";
            }
            d = s;
            e = a1.a;
            b = a1.c;
            f = a1.d;
            g = a1.e;
        }
    }

    public static final class a.a
    {

        public String a;
        public String b;
        public byte c[];
        public SSLContext d;
        public HostnameVerifier e;

        public a.a()
        {
        }
    }


    private static final Logger p = Logger.getLogger(com/github/nkzawa/engineio/client/a/b.getName());
    private a q;
    private a r;

    public b(com.github.nkzawa.engineio.client.Transport.a a1)
    {
        super(a1);
    }

    static Transport a(b b1, String s, Exception exception)
    {
        return b1.a(s, exception);
    }

    private a a(a.a a1)
    {
        a.a a2 = a1;
        if (a1 == null)
        {
            a2 = new a.a();
        }
        a1 = super.e;
        Object obj = a1;
        if (a1 == null)
        {
            obj = new HashMap();
        }
        String s1;
        if (super.f)
        {
            a1 = "https";
        } else
        {
            a1 = "http";
        }
        if (super.g)
        {
            String s = super.k;
            StringBuilder stringbuilder = (new StringBuilder()).append(String.valueOf((new Date()).getTime())).append("-");
            int i = Transport.b;
            Transport.b = i + 1;
            ((Map) (obj)).put(s, stringbuilder.append(i).toString());
        }
        s1 = com.github.nkzawa.e.a.a(((Map) (obj)));
        if (super.h > 0 && ("https".equals(a1) && super.h != 443 || "http".equals(a1) && super.h != 80))
        {
            obj = (new StringBuilder(":")).append(super.h).toString();
        } else
        {
            obj = "";
        }
        if (s1.length() > 0)
        {
            s1 = (new StringBuilder("?")).append(s1).toString();
        }
        a2.a = (new StringBuilder()).append(a1).append("://").append(super.j).append(((String) (obj))).append(super.i).append(s1).toString();
        a2.d = l;
        a2.e = n;
        a1 = new a(a2);
        a1.a("requestHeaders", new com.github.nkzawa.b.a.a(this) {

            final b a;
            final b b;

            public final transient void a(Object aobj[])
            {
                a.a("requestHeaders", new Object[] {
                    aobj[0]
                });
            }

            
            {
                b = b.this;
                a = b2;
                super();
            }
        }).a("responseHeaders", new com.github.nkzawa.b.a.a(this) {

            final b a;
            final b b;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.f.a.a(new Runnable(this, aobj) {

                    final Object a[];
                    final _cls1 b;

                    public final void run()
                    {
                        b.a.a("responseHeaders", new Object[] {
                            a[0]
                        });
                    }

            
            {
                b = _pcls1;
                a = aobj;
                super();
            }
                });
            }

            
            {
                b = b.this;
                a = b2;
                super();
            }
        });
        return a1;
    }

    static Transport b(b b1, String s, Exception exception)
    {
        return b1.a(s, exception);
    }

    static Logger j()
    {
        return p;
    }

    protected final void a(byte abyte0[], Runnable runnable)
    {
        a.a a1 = new a.a();
        a1.b = "POST";
        a1.c = abyte0;
        abyte0 = a(a1);
        abyte0.a("success", new com.github.nkzawa.b.a.a(runnable) {

            final Runnable a;
            final b b;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.f.a.a(new Runnable(this) {

                    final _cls3 a;

                    public final void run()
                    {
                        a.a.run();
                    }

            
            {
                a = _pcls3;
                super();
            }
                });
            }

            
            {
                b = b.this;
                a = runnable;
                super();
            }
        });
        abyte0.a("error", new com.github.nkzawa.b.a.a(this) {

            final b a;
            final b b;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.f.a.a(new Runnable(this, aobj) {

                    final Object a[];
                    final _cls4 b;

                    public final void run()
                    {
                        Exception exception;
                        if (a.length > 0 && (a[0] instanceof Exception))
                        {
                            exception = (Exception)a[0];
                        } else
                        {
                            exception = null;
                        }
                        com.github.nkzawa.engineio.client.a.b.a(b.a, "xhr post error", exception);
                    }

            
            {
                b = _pcls4;
                a = aobj;
                super();
            }
                });
            }

            
            {
                b = b.this;
                a = b2;
                super();
            }
        });
        abyte0.b();
        q = abyte0;
    }

    protected final void h()
    {
        p.fine("xhr poll");
        a a1 = a(null);
        a1.a("data", new com.github.nkzawa.b.a.a(this) {

            final b a;
            final b b;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.f.a.a(new Runnable(this, aobj) {

                    final Object a[];
                    final _cls5 b;

                    public final void run()
                    {
                        Object obj;
                        if (a.length > 0)
                        {
                            obj = a[0];
                        } else
                        {
                            obj = null;
                        }
                        if (obj instanceof String)
                        {
                            b.a.a((String)obj);
                        } else
                        if (obj instanceof byte[])
                        {
                            b.a.a((byte[])(byte[])obj);
                            return;
                        }
                    }

            
            {
                b = _pcls5;
                a = aobj;
                super();
            }
                });
            }

            
            {
                b = b.this;
                a = b2;
                super();
            }
        });
        a1.a("error", new com.github.nkzawa.b.a.a(this) {

            final b a;
            final b b;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.f.a.a(new Runnable(this, aobj) {

                    final Object a[];
                    final _cls6 b;

                    public final void run()
                    {
                        Exception exception;
                        if (a.length > 0 && (a[0] instanceof Exception))
                        {
                            exception = (Exception)a[0];
                        } else
                        {
                            exception = null;
                        }
                        b.b(b.a, "xhr poll error", exception);
                    }

            
            {
                b = _pcls6;
                a = aobj;
                super();
            }
                });
            }

            
            {
                b = b.this;
                a = b2;
                super();
            }
        });
        a1.b();
        r = a1;
    }

}
