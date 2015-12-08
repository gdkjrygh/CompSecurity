// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.BufferedInputStream;
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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public class HttpRequest
{

    private static final String b[] = new String[0];
    private static ConnectionFactory c;
    public final URL a;
    private HttpURLConnection d;
    private final String e;
    private RequestOutputStream f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private String k;
    private int l;

    public HttpRequest(CharSequence charsequence, String s)
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

    public static HttpRequest a(CharSequence charsequence, Map map, boolean flag)
    {
        map = a(charsequence, map);
        charsequence = map;
        if (flag)
        {
            charsequence = a(((CharSequence) (map)));
        }
        return b(charsequence);
    }

    public static String a(CharSequence charsequence)
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

    public static String a(CharSequence charsequence, Map map)
    {
        Object obj = charsequence.toString();
        if (map == null || map.isEmpty())
        {
            return ((String) (obj));
        }
        charsequence = new StringBuilder(((String) (obj)));
        a(((String) (obj)), ((StringBuilder) (charsequence)));
        b(((String) (obj)), charsequence);
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
            Object obj1 = (java.util.Map.Entry)map.next();
            charsequence.append(((java.util.Map.Entry) (obj1)).getKey().toString());
            charsequence.append('=');
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            if (obj1 != null)
            {
                charsequence.append(obj1);
            }
        } while (true);
        return charsequence.toString();
    }

    private static StringBuilder a(String s, StringBuilder stringbuilder)
    {
        if (s.indexOf(':') + 2 == s.lastIndexOf('/'))
        {
            stringbuilder.append('/');
        }
        return stringbuilder;
    }

    public static HttpRequest b(CharSequence charsequence)
    {
        return new HttpRequest(charsequence, "GET");
    }

    public static HttpRequest b(CharSequence charsequence, Map map, boolean flag)
    {
        map = a(charsequence, map);
        charsequence = map;
        if (flag)
        {
            charsequence = a(map);
        }
        return c(charsequence);
    }

    private static StringBuilder b(String s, StringBuilder stringbuilder)
    {
        int i1 = s.indexOf('?');
        int j1 = stringbuilder.length() - 1;
        if (i1 == -1)
        {
            stringbuilder.append('?');
        } else
        if (i1 < j1 && s.charAt(j1) != '&')
        {
            stringbuilder.append('&');
            return stringbuilder;
        }
        return stringbuilder;
    }

    public static HttpRequest c(CharSequence charsequence)
    {
        return new HttpRequest(charsequence, "POST");
    }

    public static HttpRequest d(CharSequence charsequence)
    {
        return new HttpRequest(charsequence, "PUT");
    }

    public static HttpRequest e(CharSequence charsequence)
    {
        return new HttpRequest(charsequence, "DELETE");
    }

    static String e(String s)
    {
        return f(s);
    }

    private static String f(String s)
    {
        if (s != null && s.length() > 0)
        {
            return s;
        } else
        {
            return "UTF-8";
        }
    }

    private Proxy q()
    {
        return new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(k, l));
    }

    private HttpURLConnection r()
    {
        HttpURLConnection httpurlconnection;
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        httpurlconnection = c.a(a, q());
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

    public int a(String s, int i1)
    {
        l();
        return a().getHeaderFieldInt(s, i1);
    }

    public HttpRequest a(int i1)
    {
        a().setConnectTimeout(i1);
        return this;
    }

    protected HttpRequest a(InputStream inputstream, OutputStream outputstream)
    {
        return (HttpRequest)(new CloseOperation(inputstream, h, inputstream, outputstream) {
            private class CloseOperation extends Operation
            {
                private class Operation
                    implements Callable
                {

                    protected abstract Object b();

                    protected abstract void c();

                    public Object call()
                    {
                        boolean flag = true;
                        Object obj = b();
                        try
                        {
                            c();
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
                        c();
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

                    protected Operation()
                    {
                    }
                }


                private final Closeable a;
                private final boolean b;

                protected void c()
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

                protected CloseOperation(Closeable closeable, boolean flag)
                {
                    a = closeable;
                    b = flag;
                }
            }


            final InputStream a;
            final OutputStream b;
            final HttpRequest c;

            public HttpRequest a()
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

            public Object b()
            {
                return a();
            }

            
            {
                c = HttpRequest.this;
                a = inputstream;
                b = outputstream;
                super(closeable, flag);
            }
        }).call();
    }

    public HttpRequest a(String s, Number number)
    {
        return a(s, ((String) (null)), number);
    }

    public HttpRequest a(String s, String s1)
    {
        a().setRequestProperty(s, s1);
        return this;
    }

    public HttpRequest a(String s, String s1, Number number)
    {
        if (number != null)
        {
            number = number.toString();
        } else
        {
            number = null;
        }
        return b(s, s1, number);
    }

    protected HttpRequest a(String s, String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("form-data; name=\"").append(s);
        if (s1 != null)
        {
            stringbuilder.append("\"; filename=\"").append(s1);
        }
        stringbuilder.append('"');
        f("Content-Disposition", stringbuilder.toString());
        if (s2 != null)
        {
            f("Content-Type", s2);
        }
        return f("\r\n");
    }

    public HttpRequest a(String s, String s1, String s2, File file)
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(file));
        file = bufferedinputstream;
        s = a(s, s1, s2, ((InputStream) (bufferedinputstream)));
        if (bufferedinputstream != null)
        {
            try
            {
                bufferedinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return s;
            }
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

    public HttpRequest a(String s, String s1, String s2, InputStream inputstream)
    {
        try
        {
            n();
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

    public HttpRequest a(String s, String s1, String s2, String s3)
    {
        try
        {
            n();
            a(s, s1, s2);
            f.a(s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new HttpRequestException(s);
        }
        return this;
    }

    public HttpRequest a(java.util.Map.Entry entry)
    {
        return a((String)entry.getKey(), (String)entry.getValue());
    }

    public HttpRequest a(boolean flag)
    {
        a().setUseCaches(flag);
        return this;
    }

    public String a(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = d();
        try
        {
            a(((InputStream) (f())), ((OutputStream) (bytearrayoutputstream)));
            s = bytearrayoutputstream.toString(f(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new HttpRequestException(s);
        }
        return s;
    }

    public HttpURLConnection a()
    {
        if (d == null)
        {
            d = r();
        }
        return d;
    }

    public int b()
    {
        int i1;
        try
        {
            k();
            i1 = a().getResponseCode();
        }
        catch (IOException ioexception)
        {
            throw new HttpRequestException(ioexception);
        }
        return i1;
    }

    public HttpRequest b(String s, String s1, String s2)
    {
        return a(s, s1, null, s2);
    }

    public String b(String s)
    {
        l();
        return a().getHeaderField(s);
    }

    public String b(String s, String s1)
    {
        return c(b(s), s1);
    }

    public int c(String s)
    {
        return a(s, -1);
    }

    protected String c(String s, String s1)
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

    public boolean c()
    {
        return 200 == b();
    }

    public HttpRequest d(String s)
    {
        return d(s, null);
    }

    public HttpRequest d(String s, String s1)
    {
        if (s1 != null && s1.length() > 0)
        {
            return a("Content-Type", (new StringBuilder()).append(s).append("; charset=").append(s1).toString());
        } else
        {
            return a("Content-Type", s);
        }
    }

    protected ByteArrayOutputStream d()
    {
        int i1 = j();
        if (i1 > 0)
        {
            return new ByteArrayOutputStream(i1);
        } else
        {
            return new ByteArrayOutputStream();
        }
    }

    public HttpRequest e(String s, String s1)
    {
        return b(s, ((String) (null)), s1);
    }

    public String e()
    {
        return a(h());
    }

    public HttpRequest f(CharSequence charsequence)
    {
        try
        {
            m();
            f.a(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new HttpRequestException(charsequence);
        }
        return this;
    }

    public HttpRequest f(String s, String s1)
    {
        return f(((CharSequence) (s))).f(": ").f(((CharSequence) (s1))).f("\r\n");
    }

    public BufferedInputStream f()
    {
        return new BufferedInputStream(g(), j);
    }

    public InputStream g()
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
        if (!i || !"gzip".equals(i()))
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

    public String h()
    {
        return b("Content-Type", "charset");
    }

    public String i()
    {
        return b("Content-Encoding");
    }

    public int j()
    {
        return c("Content-Length");
    }

    protected HttpRequest k()
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

    protected HttpRequest l()
    {
        HttpRequest httprequest;
        try
        {
            httprequest = k();
        }
        catch (IOException ioexception)
        {
            throw new HttpRequestException(ioexception);
        }
        return httprequest;
    }

    protected HttpRequest m()
    {
        if (f != null)
        {
            return this;
        } else
        {
            a().setDoOutput(true);
            String s = c(a().getRequestProperty("Content-Type"), "charset");
            f = new RequestOutputStream(a().getOutputStream(), s, j);
            return this;
        }
    }

    protected HttpRequest n()
    {
        if (!g)
        {
            g = true;
            d("multipart/form-data; boundary=00content0boundary00").m();
            f.a("--00content0boundary00\r\n");
            return this;
        } else
        {
            f.a("\r\n--00content0boundary00\r\n");
            return this;
        }
    }

    public URL o()
    {
        return a().getURL();
    }

    public String p()
    {
        return a().getRequestMethod();
    }

    public String toString()
    {
        return (new StringBuilder()).append(p()).append(' ').append(o()).toString();
    }

    static 
    {
        c = ConnectionFactory.a;
    }

    private class HttpRequestException extends RuntimeException
    {

        private static final long serialVersionUID = 0xefc1aa7964bcfdc9L;

        public IOException a()
        {
            return (IOException)super.getCause();
        }

        public Throwable getCause()
        {
            return a();
        }

        protected HttpRequestException(IOException ioexception)
        {
            super(ioexception);
        }
    }


    private class ConnectionFactory
    {

        public static final ConnectionFactory a = new ConnectionFactory() {

            public HttpURLConnection a(URL url)
            {
                return (HttpURLConnection)url.openConnection();
            }

            public HttpURLConnection a(URL url, Proxy proxy)
            {
                return (HttpURLConnection)url.openConnection(proxy);
            }

        };

        public abstract HttpURLConnection a(URL url);

        public abstract HttpURLConnection a(URL url, Proxy proxy);

    }


    private class RequestOutputStream extends BufferedOutputStream
    {

        private final CharsetEncoder a;

        public RequestOutputStream a(String s)
        {
            s = a.encode(CharBuffer.wrap(s));
            super.write(s.array(), 0, s.limit());
            return this;
        }

        public RequestOutputStream(OutputStream outputstream, String s, int i1)
        {
            super(outputstream, i1);
            a = Charset.forName(HttpRequest.e(s)).newEncoder();
        }
    }

}
