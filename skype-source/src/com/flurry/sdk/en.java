// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.flurry.sdk:
//            fg, ds, ej, eo, 
//            eh, fe, ek, ev

public class en extends fg
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/flurry/sdk/en$a, s1);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        public final HttpRequestBase a(String s1)
        {
            static class _cls3
            {

                static final int a[];

                static 
                {
                    a = new int[a.values().length];
                    try
                    {
                        a[a.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[a.d.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[a.e.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[a.f.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[a.b.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls3.a[ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return new HttpPost(s1);

            case 2: // '\002'
                return new HttpPut(s1);

            case 3: // '\003'
                return new HttpDelete(s1);

            case 4: // '\004'
                return new HttpHead(s1);

            case 5: // '\005'
                return new HttpGet(s1);
            }
        }

        public final String toString()
        {
            switch (_cls3.a[ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return "POST";

            case 2: // '\002'
                return "PUT";

            case 3: // '\003'
                return "DELETE";

            case 4: // '\004'
                return "HEAD";

            case 5: // '\005'
                return "GET";
            }
        }

        static 
        {
            a = new a("kUnknown", 0);
            b = new a("kGet", 1);
            c = new a("kPost", 2);
            d = new a("kPut", 3);
            e = new a("kDelete", 4);
            f = new a("kHead", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class b
        implements c
    {

        public void a(en en1)
        {
        }

        public void a(en en1, InputStream inputstream)
            throws Exception
        {
        }

        public void a(en en1, OutputStream outputstream)
            throws Exception
        {
        }

        public b()
        {
        }
    }

    public static interface c
    {

        public abstract void a(en en1);

        public abstract void a(en en1, InputStream inputstream)
            throws Exception;

        public abstract void a(en en1, OutputStream outputstream)
            throws Exception;
    }


    private static final String a = com/flurry/sdk/en.getSimpleName();
    private static SSLContext b;
    private static HostnameVerifier c;
    private String d;
    private a e;
    private int f;
    private int i;
    private boolean j;
    private final ds k = new ds();
    private c l;
    private HttpURLConnection m;
    private HttpClient n;
    private boolean o;
    private boolean p;
    private Exception q;
    private int r;
    private final ds s = new ds();
    private final Object t = new Object();

    public en()
    {
        f = 10000;
        i = 15000;
        j = true;
        r = -1;
    }

    static HttpURLConnection a(en en1)
    {
        return en1.m;
    }

    static void a(en en1, OutputStream outputstream)
        throws Exception
    {
        en1.a(outputstream);
    }

    private void a(InputStream inputstream)
        throws Exception
    {
        while (l == null || b() || inputstream == null) 
        {
            return;
        }
        l.a(this, inputstream);
    }

    private void a(OutputStream outputstream)
        throws Exception
    {
        while (l == null || b() || outputstream == null) 
        {
            return;
        }
        l.a(this, outputstream);
    }

    static HttpClient b(en en1)
    {
        return en1.n;
    }

    private static SSLContext m()
    {
        com/flurry/sdk/en;
        JVM INSTR monitorenter ;
        if (b == null) goto _L2; else goto _L1
_L1:
        Object obj = b;
_L4:
        com/flurry/sdk/en;
        JVM INSTR monitorexit ;
        return ((SSLContext) (obj));
_L2:
        obj = new ej(null);
        SSLContext sslcontext = SSLContext.getInstance("TLS");
        b = sslcontext;
        SecureRandom securerandom = new SecureRandom();
        sslcontext.init(null, new TrustManager[] {
            obj
        }, securerandom);
_L5:
        obj = b;
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1;
        obj1;
        eo.a(3, a, "Exception creating SSL context", ((Throwable) (obj1)));
          goto _L5
        obj1;
        throw obj1;
    }

    private static HostnameVerifier n()
    {
        com/flurry/sdk/en;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        Object obj = c;
_L4:
        com/flurry/sdk/en;
        JVM INSTR monitorexit ;
        return ((HostnameVerifier) (obj));
_L2:
        obj = new eh();
        c = ((HostnameVerifier) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void o()
        throws Exception
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        if (p)
        {
            return;
        }
        obj = new URL(d);
        m = (HttpURLConnection)((URL) (obj)).openConnection();
        m.setConnectTimeout(f);
        m.setReadTimeout(i);
        m.setRequestMethod(e.toString());
        m.setInstanceFollowRedirects(j);
        m.setDoOutput(a.c.equals(e));
        m.setDoInput(true);
        if (eo.d() && (m instanceof HttpsURLConnection))
        {
            obj = (HttpsURLConnection)m;
            ((HttpsURLConnection) (obj)).setHostnameVerifier(n());
            ((HttpsURLConnection) (obj)).setSSLSocketFactory(m().getSocketFactory());
        }
        java.util.Map.Entry entry;
        for (obj = k.b().iterator(); ((Iterator) (obj)).hasNext(); m.addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_216;
        Exception exception;
        exception;
        r();
        throw exception;
        boolean flag;
        if (!a.b.equals(e) && !a.c.equals(e))
        {
            m.setRequestProperty("Accept-Encoding", "");
        }
        flag = p;
        if (flag)
        {
            r();
            return;
        }
        flag = a.c.equals(e);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        exception = m.getOutputStream();
        Object obj1 = new BufferedOutputStream(exception);
        a(((OutputStream) (obj1)));
        fe.a(((java.io.Closeable) (obj1)));
        fe.a(exception);
        r = m.getResponseCode();
        for (exception = m.getHeaderFields().entrySet().iterator(); exception.hasNext();)
        {
            obj1 = (java.util.Map.Entry)exception.next();
            obj3 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                String s1 = (String)((Iterator) (obj3)).next();
                s.a(((java.util.Map.Entry) (obj1)).getKey(), s1);
            }
        }

          goto _L1
_L7:
        fe.a(((java.io.Closeable) (obj1)));
        fe.a(((java.io.Closeable) (obj2)));
        throw exception;
_L1:
        if (a.b.equals(e)) goto _L3; else goto _L2
_L2:
        flag = a.c.equals(e);
        if (!flag)
        {
            r();
            return;
        }
_L3:
        flag = p;
        if (flag)
        {
            r();
            return;
        }
        exception = m.getInputStream();
        obj1 = new BufferedInputStream(exception);
        a(((InputStream) (obj1)));
        fe.a(((java.io.Closeable) (obj1)));
        fe.a(exception);
        r();
        return;
        exception;
        obj1 = null;
_L5:
        fe.a(((java.io.Closeable) (obj2)));
        fe.a(((java.io.Closeable) (obj1)));
        throw exception;
        obj3;
        obj1 = exception;
        exception = ((Exception) (obj3));
        continue; /* Loop/switch isn't completed */
        obj3;
        obj2 = obj1;
        obj1 = exception;
        exception = ((Exception) (obj3));
        if (true) goto _L5; else goto _L4
_L4:
        obj3;
        obj1 = null;
        obj2 = exception;
        exception = ((Exception) (obj3));
        continue; /* Loop/switch isn't completed */
        obj3;
        obj2 = exception;
        exception = ((Exception) (obj3));
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = null;
        obj2 = obj3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void p()
        throws Exception
    {
        Object obj;
        Object obj1;
        obj1 = null;
        if (p)
        {
            return;
        }
        obj = e.a(d);
        java.util.Map.Entry entry;
        for (Iterator iterator = k.b().iterator(); iterator.hasNext(); ((HttpRequestBase) (obj)).setHeader((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        if (!a.b.equals(e) && !a.c.equals(e))
        {
            ((HttpRequestBase) (obj)).removeHeaders("Accept-Encoding");
        }
        if (a.c.equals(e))
        {
            ((HttpPost)obj).setEntity(new AbstractHttpEntity() {

                final en a;

                public InputStream getContent()
                    throws IOException
                {
                    throw new UnsupportedOperationException();
                }

                public long getContentLength()
                {
                    return -1L;
                }

                public boolean isRepeatable()
                {
                    return false;
                }

                public boolean isStreaming()
                {
                    return false;
                }

                public void writeTo(OutputStream outputstream)
                    throws IOException
                {
                    Object obj2 = new BufferedOutputStream(outputstream);
                    outputstream = ((OutputStream) (obj2));
                    en.a(a, ((OutputStream) (obj2)));
                    fe.a(((java.io.Closeable) (obj2)));
                    return;
                    Object obj3;
                    obj3;
                    outputstream = null;
_L4:
                    throw obj3;
                    obj3;
                    obj2 = outputstream;
                    outputstream = ((OutputStream) (obj3));
_L1:
                    fe.a(((java.io.Closeable) (obj2)));
                    throw outputstream;
                    obj3;
                    obj2 = null;
_L2:
                    outputstream = ((OutputStream) (obj2));
                    if (android.os.Build.VERSION.SDK_INT < 9)
                    {
                        break MISSING_BLOCK_LABEL_64;
                    }
                    outputstream = ((OutputStream) (obj2));
                    throw new IOException(((Throwable) (obj3)));
                    outputstream = ((OutputStream) (obj2));
                    throw new IOException(((Exception) (obj3)).toString());
                    outputstream;
                    obj2 = null;
                      goto _L1
                    obj3;
                      goto _L2
                    obj3;
                    outputstream = ((OutputStream) (obj2));
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                a = en.this;
                super();
            }
            });
        }
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, f);
        HttpConnectionParams.setSoTimeout(basichttpparams, i);
        basichttpparams.setParameter("http.protocol.handle-redirects", Boolean.valueOf(j));
        n = ek.a(basichttpparams);
        obj = n.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        if (p)
        {
            throw new Exception("Request cancelled");
        }
        break MISSING_BLOCK_LABEL_227;
        obj;
        r();
        throw obj;
        if (obj == null) goto _L2; else goto _L1
_L1:
        Header aheader[];
        r = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        aheader = ((HttpResponse) (obj)).getAllHeaders();
        if (aheader == null) goto _L4; else goto _L3
_L3:
        int k1 = aheader.length;
        int i1 = 0;
_L11:
        if (i1 >= k1) goto _L4; else goto _L5
_L5:
        HeaderElement aheaderelement[];
        int l1;
        aheaderelement = aheader[i1].getElements();
        l1 = aheaderelement.length;
        int j1 = 0;
_L7:
        HeaderElement headerelement;
        if (j1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        headerelement = aheaderelement[j1];
        s.a(headerelement.getName(), headerelement.getValue());
        j1++;
        if (true) goto _L7; else goto _L6
_L4:
        boolean flag;
        if (a.b.equals(e))
        {
            break MISSING_BLOCK_LABEL_369;
        }
        flag = a.c.equals(e);
        if (!flag)
        {
            r();
            return;
        }
        if (p)
        {
            throw new Exception("Request cancelled");
        }
        obj = ((HttpResponse) (obj)).getEntity();
        if (obj == null) goto _L2; else goto _L8
_L8:
        obj = ((HttpEntity) (obj)).getContent();
        BufferedInputStream bufferedinputstream = new BufferedInputStream(((InputStream) (obj)));
        a(bufferedinputstream);
        fe.a(bufferedinputstream);
        fe.a(((java.io.Closeable) (obj)));
_L2:
        r();
        return;
        obj;
        bufferedinputstream = null;
_L9:
        fe.a(bufferedinputstream);
        fe.a(((java.io.Closeable) (obj1)));
        throw obj;
        Exception exception;
        exception;
        bufferedinputstream = null;
        obj1 = obj;
        obj = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L9; else goto _L6
_L6:
        i1++;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void q()
    {
        while (l == null || b()) 
        {
            return;
        }
        l.a(this);
    }

    private void r()
    {
        if (!o)
        {
            o = true;
            if (m != null)
            {
                m.disconnect();
            }
            if (n != null)
            {
                n.getConnectionManager().shutdown();
                return;
            }
        }
    }

    private void s()
    {
        if (!o)
        {
            o = true;
            if (m != null || n != null)
            {
                (new Thread() {

                    final en a;

                    public void run()
                    {
                        if (en.a(a) != null)
                        {
                            en.a(a).disconnect();
                        }
                        if (en.b(a) != null)
                        {
                            en.b(a).getConnectionManager().shutdown();
                        }
                    }

            
            {
                a = en.this;
                super();
            }
                }).start();
                return;
            }
        }
    }

    public void a()
    {
        String s1 = d;
        if (s1 == null)
        {
            q();
            return;
        }
        if (ev.a().c())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        eo.a(3, a, (new StringBuilder("Network not available, aborting http request: ")).append(d).toString());
        q();
        return;
        if (e == null || a.a.equals(e))
        {
            e = a.b;
        }
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        o();
_L1:
        eo.a(4, a, (new StringBuilder("HTTP status: ")).append(r).append(" for url: ").append(d).toString());
        q();
        return;
        p();
          goto _L1
        Object obj;
        obj;
        eo.a(4, a, (new StringBuilder("HTTP status: ")).append(r).append(" for url: ").append(d).toString());
        eo.a(3, a, (new StringBuilder("Exception during http request: ")).append(d).toString(), ((Throwable) (obj)));
        q = ((Exception) (obj));
        q();
        return;
        obj;
        q();
        throw obj;
    }

    public void a(a a1)
    {
        e = a1;
    }

    public void a(c c1)
    {
        l = c1;
    }

    public void a(String s1)
    {
        d = s1;
    }

    public void a(String s1, String s2)
    {
        k.a(s1, s2);
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public List b(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return s.a(s1);
        }
    }

    public boolean b()
    {
        boolean flag;
        synchronized (t)
        {
            flag = p;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean c()
    {
        return !f() && d();
    }

    public boolean d()
    {
        return r >= 200 && r < 400;
    }

    public int e()
    {
        return r;
    }

    public boolean f()
    {
        return q != null;
    }

    public void g()
    {
        synchronized (t)
        {
            p = true;
        }
        s();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void h()
    {
        g();
    }

}
