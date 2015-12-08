// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;

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

// Referenced classes of package b.a.a.a.a.e:
//            e, f

public final class b.a.a.a.a.e.d
{
    protected static abstract class a extends d
    {

        private final Closeable a;
        private final boolean b;

        protected final void b()
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

        public static final b a = new f();

        public abstract HttpURLConnection a(URL url);

        public abstract HttpURLConnection a(URL url, Proxy proxy);

    }

    public static final class c extends RuntimeException
    {

        public final volatile Throwable getCause()
        {
            return (IOException)super.getCause();
        }

        protected c(IOException ioexception)
        {
            super(ioexception);
        }
    }

    protected static abstract class d
        implements Callable
    {

        protected abstract Object a();

        protected abstract void b();

        public Object call()
        {
            boolean flag = true;
            Object obj = a();
            try
            {
                b();
            }
            catch (IOException ioexception)
            {
                throw new c(ioexception);
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
            throw new c(((IOException) (obj1)));
            IOException ioexception1;
            ioexception1;
            if (flag) goto _L2; else goto _L1
_L1:
            throw new c(ioexception1);
            obj1;
            flag = false;
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected d()
        {
        }
    }

    public static final class e extends BufferedOutputStream
    {

        private final CharsetEncoder a;

        public final e a(String s)
        {
            s = a.encode(CharBuffer.wrap(s));
            super.write(s.array(), 0, s.limit());
            return this;
        }

        public e(OutputStream outputstream, String s, int i1)
        {
            super(outputstream, i1);
            a = Charset.forName(b.a.a.a.a.e.d.b(s)).newEncoder();
        }
    }


    private static final String b[] = new String[0];
    private static b c;
    public final URL a;
    private HttpURLConnection d;
    private final String e;
    private e f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private String k;
    private int l;

    private b.a.a.a.a.e.d(CharSequence charsequence, String s)
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
            throw new c(charsequence);
        }
        e = s;
    }

    static int a(b.a.a.a.a.e.d d1)
    {
        return d1.j;
    }

    private b.a.a.a.a.e.d a(InputStream inputstream, OutputStream outputstream)
    {
        return (b.a.a.a.a.e.d)(new b.a.a.a.a.e.e(this, inputstream, h, inputstream, outputstream)).call();
    }

    public static b.a.a.a.a.e.d a(CharSequence charsequence)
    {
        return new b.a.a.a.a.e.d(charsequence, "PUT");
    }

    public static b.a.a.a.a.e.d a(CharSequence charsequence, Map map)
    {
        return new b.a.a.a.a.e.d(c(c(charsequence, map)), "GET");
    }

    private b.a.a.a.a.e.d a(String s, String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("form-data; name=\"").append(s);
        if (s1 != null)
        {
            stringbuilder.append("\"; filename=\"").append(s1);
        }
        stringbuilder.append('"');
        e("Content-Disposition", stringbuilder.toString());
        if (s2 != null)
        {
            e("Content-Type", s2);
        }
        return d("\r\n");
    }

    public static b.a.a.a.a.e.d b(CharSequence charsequence)
    {
        return new b.a.a.a.a.e.d(charsequence, "DELETE");
    }

    public static b.a.a.a.a.e.d b(CharSequence charsequence, Map map)
    {
        return new b.a.a.a.a.e.d(c(c(charsequence, map)), "POST");
    }

    static String b(String s)
    {
        return c(s);
    }

    private static String c(CharSequence charsequence)
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
            throw new c(charsequence);
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
            throw new c(ioexception);
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

    private b.a.a.a.a.e.d d(CharSequence charsequence)
    {
        try
        {
            i();
            f.a(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new c(charsequence);
        }
        return this;
    }

    private b.a.a.a.a.e.d d(String s, String s1)
    {
        try
        {
            j();
            a(s, null, null);
            f.a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new c(s);
        }
        return this;
    }

    private String d(String s)
    {
        h();
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
            a(new BufferedInputStream(f(), j), bytearrayoutputstream);
            s = bytearrayoutputstream.toString(c(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new c(s);
        }
        return s;
    }

    private b.a.a.a.a.e.d e(String s, String s1)
    {
        return d(s).d(": ").d(s1).d("\r\n");
    }

    private HttpURLConnection e()
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
            throw new c(ioexception);
        }
          goto _L1
    }

    private InputStream f()
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
            throw new c(((IOException) (obj)));
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
                throw new c(((IOException) (obj)));
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
            throw new c(ioexception);
        }
        return ((InputStream) (obj));
    }

    private b.a.a.a.a.e.d g()
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

    private b.a.a.a.a.e.d h()
    {
        b.a.a.a.a.e.d d1;
        try
        {
            d1 = g();
        }
        catch (IOException ioexception)
        {
            throw new c(ioexception);
        }
        return d1;
    }

    private b.a.a.a.a.e.d i()
    {
        if (f != null)
        {
            return this;
        } else
        {
            a().setDoOutput(true);
            String s = c(a().getRequestProperty("Content-Type"), "charset");
            f = new e(a().getOutputStream(), s, j);
            return this;
        }
    }

    private b.a.a.a.a.e.d j()
    {
        if (!g)
        {
            g = true;
            a("Content-Type", "multipart/form-data; boundary=00content0boundary00").i();
            f.a("--00content0boundary00\r\n");
            return this;
        } else
        {
            f.a("\r\n--00content0boundary00\r\n");
            return this;
        }
    }

    public final b.a.a.a.a.e.d a(String s, Number number)
    {
        if (number != null)
        {
            number = number.toString();
        } else
        {
            number = null;
        }
        return d(s, number);
    }

    public final b.a.a.a.a.e.d a(String s, String s1)
    {
        a().setRequestProperty(s, s1);
        return this;
    }

    public final b.a.a.a.a.e.d a(String s, String s1, String s2, File file)
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
        throw new c(s);
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

    public final b.a.a.a.a.e.d a(String s, String s1, String s2, InputStream inputstream)
    {
        try
        {
            j();
            a(s, s1, s2);
            a(inputstream, ((OutputStream) (f)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new c(s);
        }
        return this;
    }

    public final String a(String s)
    {
        h();
        return a().getHeaderField(s);
    }

    public final HttpURLConnection a()
    {
        if (d == null)
        {
            d = e();
        }
        return d;
    }

    public final int b()
    {
        int i1;
        try
        {
            g();
            i1 = a().getResponseCode();
        }
        catch (IOException ioexception)
        {
            throw new c(ioexception);
        }
        return i1;
    }

    public final b.a.a.a.a.e.d b(String s, String s1)
    {
        return d(s, s1);
    }

    public final String c()
    {
        return d(c(a("Content-Type"), "charset"));
    }

    public final String d()
    {
        return a().getRequestMethod();
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
