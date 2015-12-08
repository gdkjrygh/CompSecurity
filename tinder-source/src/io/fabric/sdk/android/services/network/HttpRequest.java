// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public final class HttpRequest
{
    public static class HttpRequestException extends RuntimeException
    {

        private static final long serialVersionUID = 0xefc1aa7964bcfdc9L;

        public volatile Throwable getCause()
        {
            return (IOException)super.getCause();
        }

        protected HttpRequestException(IOException ioexception)
        {
            super(ioexception);
        }
    }

    protected static abstract class a extends c
    {

        private final Closeable a;
        private final boolean b;

        protected final void b()
            throws IOException
        {
            if (a instanceof Flushable)
            {
                ((Flushable)a).flush();
            }
            if (b)
            {
                try
                {
                    a.close();
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            } else
            {
                a.close();
                return;
            }
        }

        protected a(Closeable closeable, boolean flag)
        {
            a = closeable;
            b = flag;
        }
    }

    public static interface b
    {

        public static final b a = new b() {

            public final HttpURLConnection a(URL url)
                throws IOException
            {
                return (HttpURLConnection)url.openConnection();
            }

            public final HttpURLConnection a(URL url, Proxy proxy)
                throws IOException
            {
                return (HttpURLConnection)url.openConnection(proxy);
            }

        };

        public abstract HttpURLConnection a(URL url)
            throws IOException;

        public abstract HttpURLConnection a(URL url, Proxy proxy)
            throws IOException;

    }

    protected static abstract class c
        implements Callable
    {

        protected abstract Object a()
            throws HttpRequestException, IOException;

        protected abstract void b()
            throws IOException;

        public Object call()
            throws HttpRequestException
        {
            boolean flag = true;
            Object obj = a();
            try
            {
                b();
            }
            catch (IOException ioexception)
            {
                throw new HttpRequestException(ioexception);
            }
            return obj;
            Object obj1;
            obj1;
            throw obj1;
            obj1;
_L4:
            b();
_L2:
            throw obj1;
            obj1;
            throw new HttpRequestException(((IOException) (obj1)));
            IOException ioexception1;
            ioexception1;
            if (flag) goto _L2; else goto _L1
_L1:
            throw new HttpRequestException(ioexception1);
            obj1;
            flag = false;
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected c()
        {
        }
    }

    public static final class d extends BufferedOutputStream
    {

        private final CharsetEncoder a;

        public final d a(String s)
            throws IOException
        {
            s = a.encode(CharBuffer.wrap(s));
            super.write(s.array(), 0, s.limit());
            return this;
        }

        public d(OutputStream outputstream, String s, int i1)
        {
            super(outputstream, i1);
            a = Charset.forName(HttpRequest.b(s)).newEncoder();
        }
    }


    private static final String b[] = new String[0];
    private static b c;
    public final URL a;
    private HttpURLConnection d;
    private final String e;
    private d f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private String k;
    private int l;

    private HttpRequest(CharSequence charsequence, String s)
        throws HttpRequestException
    {
        d = null;
        h = true;
        i = false;
        j = 8192;
        try
        {
            a = new URL(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new HttpRequestException(charsequence);
        }
        e = s;
    }

    static int a(HttpRequest httprequest)
    {
        return httprequest.j;
    }

    private HttpRequest a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        return (HttpRequest)(new a(inputstream, h, inputstream, outputstream) {

            final InputStream a;
            final OutputStream b;
            final HttpRequest c;

            public final Object a()
                throws HttpRequestException, IOException
            {
                byte abyte0[] = new byte[HttpRequest.a(c)];
                do
                {
                    int i1 = a.read(abyte0);
                    if (i1 != -1)
                    {
                        b.write(abyte0, 0, i1);
                    } else
                    {
                        return c;
                    }
                } while (true);
            }

            
            {
                c = HttpRequest.this;
                a = inputstream;
                b = outputstream;
                super(closeable, flag);
            }
        }).call();
    }

    public static HttpRequest a(CharSequence charsequence)
        throws HttpRequestException
    {
        return new HttpRequest(charsequence, "PUT");
    }

    public static HttpRequest a(CharSequence charsequence, Map map)
    {
        return new HttpRequest(c(c(charsequence, map)), "GET");
    }

    private HttpRequest a(String s, String s1, String s2)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("form-data; name=\"").append(s);
        if (s1 != null)
        {
            stringbuilder.append("\"; filename=\"").append(s1);
        }
        stringbuilder.append('"');
        d("Content-Disposition", stringbuilder.toString());
        if (s2 != null)
        {
            d("Content-Type", s2);
        }
        return d("\r\n");
    }

    public static HttpRequest b(CharSequence charsequence)
        throws HttpRequestException
    {
        return new HttpRequest(charsequence, "DELETE");
    }

    public static HttpRequest b(CharSequence charsequence, Map map)
    {
        return new HttpRequest(c(c(charsequence, map)), "POST");
    }

    static String b(String s)
    {
        return c(s);
    }

    private static String c(CharSequence charsequence)
        throws HttpRequestException
    {
        String s;
        URL url;
        int i1;
        try
        {
            url = new URL(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new HttpRequestException(charsequence);
        }
        s = url.getHost();
        i1 = url.getPort();
        charsequence = s;
        if (i1 != -1)
        {
            charsequence = (new StringBuilder()).append(s).append(':').append(Integer.toString(i1)).toString();
        }
        try
        {
            s = (new URI(url.getProtocol(), charsequence, url.getPath(), url.getQuery(), null)).toASCIIString();
            i1 = s.indexOf('?');
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            IOException ioexception = new IOException("Parsing URI failed");
            ioexception.initCause(charsequence);
            throw new HttpRequestException(ioexception);
        }
        charsequence = s;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        charsequence = s;
        if (i1 + 1 < s.length())
        {
            charsequence = (new StringBuilder()).append(s.substring(0, i1 + 1)).append(s.substring(i1 + 1).replace("+", "%2B")).toString();
        }
        return charsequence;
    }

    private static String c(CharSequence charsequence, Map map)
    {
        Object obj;
        int i1;
        int j1;
        obj = charsequence.toString();
        if (map == null || map.isEmpty())
        {
            return ((String) (obj));
        }
        charsequence = new StringBuilder(((String) (obj)));
        if (((String) (obj)).indexOf(':') + 2 == ((String) (obj)).lastIndexOf('/'))
        {
            charsequence.append('/');
        }
        i1 = ((String) (obj)).indexOf('?');
        j1 = charsequence.length() - 1;
        if (i1 != -1) goto _L2; else goto _L1
_L1:
        charsequence.append('?');
_L4:
        map = map.entrySet().iterator();
        obj = (java.util.Map.Entry)map.next();
        charsequence.append(((java.util.Map.Entry) (obj)).getKey().toString());
        charsequence.append('=');
        obj = ((java.util.Map.Entry) (obj)).getValue();
        if (obj != null)
        {
            charsequence.append(obj);
        }
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            charsequence.append('&');
            obj = (java.util.Map.Entry)map.next();
            charsequence.append(((java.util.Map.Entry) (obj)).getKey().toString());
            charsequence.append('=');
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (obj != null)
            {
                charsequence.append(obj);
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        if (i1 < j1 && ((String) (obj)).charAt(j1) != '&')
        {
            charsequence.append('&');
        }
        if (true) goto _L4; else goto _L3
_L3:
        return charsequence.toString();
    }

    private static String c(String s)
    {
        if (s != null && s.length() > 0)
        {
            return s;
        } else
        {
            return "UTF-8";
        }
    }

    private static String c(String s, String s1)
    {
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        int k1 = s.length();
        int i1 = s.indexOf(';') + 1;
        if (i1 == 0 || i1 == k1)
        {
            return null;
        }
        int j1 = s.indexOf(';', i1);
        if (j1 == -1)
        {
            j1 = k1;
        }
        int l1;
        for (; i1 < j1; j1 = l1)
        {
            l1 = s.indexOf('=', i1);
            if (l1 != -1 && l1 < j1 && s1.equals(s.substring(i1, l1).trim()))
            {
                String s2 = s.substring(l1 + 1, j1).trim();
                i1 = s2.length();
                if (i1 != 0)
                {
                    s = s2;
                    if (i1 > 2)
                    {
                        s = s2;
                        if ('"' == s2.charAt(0))
                        {
                            s = s2;
                            if ('"' == s2.charAt(i1 - 1))
                            {
                                return s2.substring(1, i1 - 1);
                            }
                        }
                    }
                    continue; /* Loop/switch isn't completed */
                }
            }
            j1++;
            l1 = s.indexOf(';', j1);
            i1 = l1;
            if (l1 == -1)
            {
                i1 = k1;
            }
            l1 = i1;
            i1 = j1;
        }

        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private HttpRequest d(CharSequence charsequence)
        throws HttpRequestException
    {
        try
        {
            h();
            f.a(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new HttpRequestException(charsequence);
        }
        return this;
    }

    private HttpRequest d(String s, String s1)
        throws HttpRequestException
    {
        return d(((CharSequence) (s))).d(": ").d(((CharSequence) (s1))).d("\r\n");
    }

    private String d(String s)
        throws HttpRequestException
    {
        g();
        int i1 = a().getHeaderFieldInt("Content-Length", -1);
        ByteArrayOutputStream bytearrayoutputstream;
        if (i1 > 0)
        {
            bytearrayoutputstream = new ByteArrayOutputStream(i1);
        } else
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
        }
        try
        {
            a(new BufferedInputStream(e(), j), bytearrayoutputstream);
            s = bytearrayoutputstream.toString(c(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new HttpRequestException(s);
        }
        return s;
    }

    private HttpURLConnection d()
    {
        HttpURLConnection httpurlconnection;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        httpurlconnection = c.a(a, new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(k, l)));
_L1:
        httpurlconnection.setRequestMethod(e);
        return httpurlconnection;
        try
        {
            httpurlconnection = c.a(a);
        }
        catch (IOException ioexception)
        {
            throw new HttpRequestException(ioexception);
        }
          goto _L1
    }

    private InputStream e()
        throws HttpRequestException
    {
        if (b() >= 400) goto _L2; else goto _L1
_L1:
        Object obj;
        try
        {
            obj = a().getInputStream();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new HttpRequestException(((IOException) (obj)));
        }
_L4:
        if (!i || !"gzip".equals(a("Content-Encoding")))
        {
            return ((InputStream) (obj));
        }
        break; /* Loop/switch isn't completed */
_L2:
        InputStream inputstream = a().getErrorStream();
        obj = inputstream;
        if (inputstream == null)
        {
            try
            {
                obj = a().getInputStream();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new HttpRequestException(((IOException) (obj)));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            obj = new GZIPInputStream(((InputStream) (obj)));
        }
        catch (IOException ioexception)
        {
            throw new HttpRequestException(ioexception);
        }
        return ((InputStream) (obj));
    }

    private HttpRequest f()
        throws IOException
    {
        if (f == null)
        {
            return this;
        }
        if (g)
        {
            f.a("\r\n--00content0boundary00--\r\n");
        }
        if (h)
        {
            try
            {
                f.close();
            }
            catch (IOException ioexception) { }
        } else
        {
            f.close();
        }
        f = null;
        return this;
    }

    private HttpRequest g()
        throws HttpRequestException
    {
        HttpRequest httprequest;
        try
        {
            httprequest = f();
        }
        catch (IOException ioexception)
        {
            throw new HttpRequestException(ioexception);
        }
        return httprequest;
    }

    private HttpRequest h()
        throws IOException
    {
        if (f != null)
        {
            return this;
        } else
        {
            a().setDoOutput(true);
            String s = c(a().getRequestProperty("Content-Type"), "charset");
            f = new d(a().getOutputStream(), s, j);
            return this;
        }
    }

    private HttpRequest i()
        throws IOException
    {
        if (!g)
        {
            g = true;
            a("Content-Type", "multipart/form-data; boundary=00content0boundary00").h();
            f.a("--00content0boundary00\r\n");
            return this;
        } else
        {
            f.a("\r\n--00content0boundary00\r\n");
            return this;
        }
    }

    public final HttpRequest a(String s, Number number)
        throws HttpRequestException
    {
        if (number != null)
        {
            number = number.toString();
        } else
        {
            number = null;
        }
        return b(s, number);
    }

    public final HttpRequest a(String s, String s1)
    {
        a().setRequestProperty(s, s1);
        return this;
    }

    public final HttpRequest a(String s, String s1, String s2, File file)
        throws HttpRequestException
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(file));
        file = bufferedinputstream;
        s = a(s, s1, s2, ((InputStream) (bufferedinputstream)));
        try
        {
            bufferedinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s;
        }
        return s;
        s;
        file = null;
_L4:
        throw new HttpRequestException(s);
        s;
_L2:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        file = null;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        file = bufferedinputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final HttpRequest a(String s, String s1, String s2, InputStream inputstream)
        throws HttpRequestException
    {
        try
        {
            i();
            a(s, s1, s2);
            a(inputstream, ((OutputStream) (f)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new HttpRequestException(s);
        }
        return this;
    }

    public final String a(String s)
        throws HttpRequestException
    {
        g();
        return a().getHeaderField(s);
    }

    public final HttpURLConnection a()
    {
        if (d == null)
        {
            d = d();
        }
        return d;
    }

    public final int b()
        throws HttpRequestException
    {
        int i1;
        try
        {
            f();
            i1 = a().getResponseCode();
        }
        catch (IOException ioexception)
        {
            throw new HttpRequestException(ioexception);
        }
        return i1;
    }

    public final HttpRequest b(String s, String s1)
        throws HttpRequestException
    {
        try
        {
            i();
            a(s, null, null);
            f.a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new HttpRequestException(s);
        }
        return this;
    }

    public final String c()
        throws HttpRequestException
    {
        return d(c(a("Content-Type"), "charset"));
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a().getRequestMethod()).append(' ').append(a().getURL()).toString();
    }

    static 
    {
        c = b.a;
    }
}
