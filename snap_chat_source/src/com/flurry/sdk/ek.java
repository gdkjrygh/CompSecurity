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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
//            fd, ds, fb, eh, 
//            es, el

public class ek extends fd
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

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/flurry/sdk/ek$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        public final HttpRequestBase a(String s)
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
                return new HttpPost(s);

            case 2: // '\002'
                return new HttpPut(s);

            case 3: // '\003'
                return new HttpDelete(s);

            case 4: // '\004'
                return new HttpHead(s);

            case 5: // '\005'
                return new HttpGet(s);
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

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static interface c
    {

        public abstract void a(ek ek1);

        public abstract void a(ek ek1, InputStream inputstream);

        public abstract void a(ek ek1, OutputStream outputstream);
    }


    private static final String a = com/flurry/sdk/ek.getSimpleName();
    private String b;
    private a c;
    private int d;
    private int e;
    private boolean f;
    private final ds i = new ds();
    private c j;
    private HttpURLConnection k;
    private HttpClient l;
    private boolean m;
    private boolean n;
    private Exception o;
    private int p;
    private final ds q = new ds();
    private final Object r = new Object();

    public ek()
    {
        d = 10000;
        e = 15000;
        f = true;
        p = -1;
    }

    static void a(ek ek1, OutputStream outputstream)
    {
        ek1.a(outputstream);
    }

    private void a(InputStream inputstream)
    {
        while (j == null || b() || inputstream == null) 
        {
            return;
        }
        j.a(this, inputstream);
    }

    private void a(OutputStream outputstream)
    {
        while (j == null || b() || outputstream == null) 
        {
            return;
        }
        j.a(this, outputstream);
    }

    private void m()
    {
        Object obj;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        if (n)
        {
            return;
        }
        obj = new URL(b);
        k = (HttpURLConnection)((URL) (obj)).openConnection();
        k.setConnectTimeout(d);
        k.setReadTimeout(e);
        k.setRequestMethod(c.toString());
        k.setInstanceFollowRedirects(f);
        k.setDoOutput(a.c.equals(c));
        k.setDoInput(true);
        java.util.Map.Entry entry;
        for (obj = i.b().iterator(); ((Iterator) (obj)).hasNext(); k.addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_175;
        Exception exception;
        exception;
        p();
        throw exception;
        boolean flag;
        if (!a.b.equals(c) && !a.c.equals(c))
        {
            k.setRequestProperty("Accept-Encoding", "");
        }
        flag = n;
        if (flag)
        {
            p();
            return;
        }
        flag = a.c.equals(c);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        exception = k.getOutputStream();
        Object obj1 = new BufferedOutputStream(exception);
        a(((OutputStream) (obj1)));
        fb.a(((java.io.Closeable) (obj1)));
        fb.a(exception);
        p = k.getResponseCode();
        for (exception = k.getHeaderFields().entrySet().iterator(); exception.hasNext();)
        {
            obj1 = (java.util.Map.Entry)exception.next();
            obj3 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                String s = (String)((Iterator) (obj3)).next();
                q.a(((java.util.Map.Entry) (obj1)).getKey(), s);
            }
        }

          goto _L1
_L7:
        fb.a(((java.io.Closeable) (obj1)));
        fb.a(((java.io.Closeable) (obj2)));
        throw exception;
_L1:
        if (a.b.equals(c)) goto _L3; else goto _L2
_L2:
        flag = a.c.equals(c);
        if (!flag)
        {
            p();
            return;
        }
_L3:
        flag = n;
        if (flag)
        {
            p();
            return;
        }
        exception = k.getInputStream();
        obj1 = new BufferedInputStream(exception);
        a(((InputStream) (obj1)));
        fb.a(((java.io.Closeable) (obj1)));
        fb.a(exception);
        p();
        return;
        exception;
        obj1 = null;
_L5:
        fb.a(((java.io.Closeable) (obj1)));
        fb.a(((java.io.Closeable) (obj2)));
        throw exception;
        obj3;
        obj1 = null;
        obj2 = exception;
        exception = ((Exception) (obj3));
        continue; /* Loop/switch isn't completed */
        obj3;
        obj2 = exception;
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

    private void n()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        if (n)
        {
            return;
        }
        obj = c.a(b);
        java.util.Map.Entry entry;
        for (Iterator iterator = i.b().iterator(); iterator.hasNext(); ((HttpRequestBase) (obj)).setHeader((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        if (!a.b.equals(c) && !a.c.equals(c))
        {
            ((HttpRequestBase) (obj)).removeHeaders("Accept-Encoding");
        }
        if (a.c.equals(c))
        {
            ((HttpPost)obj).setEntity(new AbstractHttpEntity() {

                final ek a;

                public InputStream getContent()
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
                {
                    Object obj2 = new BufferedOutputStream(outputstream);
                    outputstream = ((OutputStream) (obj2));
                    ek.a(a, ((OutputStream) (obj2)));
                    fb.a(((java.io.Closeable) (obj2)));
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
                    fb.a(((java.io.Closeable) (obj2)));
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
                a = ek.this;
                super();
            }
            });
        }
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, d);
        HttpConnectionParams.setSoTimeout(basichttpparams, e);
        basichttpparams.setParameter("http.protocol.handle-redirects", Boolean.valueOf(f));
        l = eh.a(basichttpparams);
        obj = l.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        if (n)
        {
            throw new Exception("Request cancelled");
        }
        break MISSING_BLOCK_LABEL_226;
        obj;
        p();
        throw obj;
        if (obj == null) goto _L2; else goto _L1
_L1:
        Header aheader[];
        p = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
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
        q.a(headerelement.getName(), headerelement.getValue());
        j1++;
        if (true) goto _L7; else goto _L6
_L4:
        boolean flag;
        if (a.b.equals(c))
        {
            break MISSING_BLOCK_LABEL_368;
        }
        flag = a.c.equals(c);
        if (!flag)
        {
            p();
            return;
        }
        if (n)
        {
            throw new Exception("Request cancelled");
        }
        obj = ((HttpResponse) (obj)).getEntity();
        if (obj == null) goto _L2; else goto _L8
_L8:
        obj = ((HttpEntity) (obj)).getContent();
        BufferedInputStream bufferedinputstream = new BufferedInputStream(((InputStream) (obj)));
        a(bufferedinputstream);
        fb.a(bufferedinputstream);
        fb.a(((java.io.Closeable) (obj)));
_L2:
        p();
        return;
        obj;
        bufferedinputstream = null;
_L9:
        fb.a(bufferedinputstream);
        fb.a(((java.io.Closeable) (obj1)));
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

    private void o()
    {
        while (j == null || b()) 
        {
            return;
        }
        j.a(this);
    }

    private void p()
    {
        if (!m)
        {
            m = true;
            if (k != null)
            {
                k.disconnect();
            }
            if (l != null)
            {
                l.getConnectionManager().shutdown();
                return;
            }
        }
    }

    public void a()
    {
        String s = b;
        if (s == null)
        {
            o();
            return;
        }
        if (es.a().c())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        el.a(3, a, (new StringBuilder("Network not available, aborting http request: ")).append(b).toString());
        o();
        return;
        if (c == null || a.a.equals(c))
        {
            c = a.b;
        }
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        m();
_L1:
        el.a(4, a, (new StringBuilder("HTTP status: ")).append(p).append(" for url: ").append(b).toString());
        o();
        return;
        n();
          goto _L1
        Object obj;
        obj;
        el.a(4, a, (new StringBuilder("HTTP status: ")).append(p).append(" for url: ").append(b).toString());
        el.a(3, a, (new StringBuilder("Exception during http request: ")).append(b).toString(), ((Throwable) (obj)));
        o = ((Exception) (obj));
        o();
        return;
        obj;
        o();
        throw obj;
    }

    public void a(a a1)
    {
        c = a1;
    }

    public void a(c c1)
    {
        j = c1;
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(String s, String s1)
    {
        i.a(s, s1);
    }

    public boolean b()
    {
        boolean flag;
        synchronized (r)
        {
            flag = n;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean d()
    {
        return p >= 200 && p < 400;
    }

    public int e()
    {
        return p;
    }

}
