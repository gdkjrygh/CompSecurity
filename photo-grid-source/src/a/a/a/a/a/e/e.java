// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.e;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
import java.util.zip.GZIPInputStream;

// Referenced classes of package a.a.a.a.a.e:
//            h, j, f, l

public final class e
{

    private static final String b[] = new String[0];
    private static h c;
    public final URL a;
    private HttpURLConnection d;
    private final String e;
    private l f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private String k;
    private int l;

    private e(CharSequence charsequence, String s)
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
            throw new j(charsequence);
        }
        e = s;
    }

    static int a(e e1)
    {
        return e1.j;
    }

    private e a(InputStream inputstream, OutputStream outputstream)
    {
        return (e)(new f(this, inputstream, h, inputstream, outputstream)).call();
    }

    public static e a(CharSequence charsequence)
    {
        return new e(charsequence, "PUT");
    }

    public static e a(CharSequence charsequence, Map map)
    {
        return new e(c(c(charsequence, map)), "GET");
    }

    private e a(String s, String s1, String s2)
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

    public static e b(CharSequence charsequence)
    {
        return new e(charsequence, "DELETE");
    }

    public static e b(CharSequence charsequence, Map map)
    {
        return new e(c(c(charsequence, map)), "POST");
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
            throw new j(charsequence);
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
            throw new j(ioexception);
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

    private e d(CharSequence charsequence)
    {
        try
        {
            i();
            f.a(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new j(charsequence);
        }
        return this;
    }

    private e d(String s, String s1)
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
            throw new j(s);
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
            throw new j(s);
        }
        return s;
    }

    private e e(String s, String s1)
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
            throw new j(ioexception);
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
            throw new j(((IOException) (obj)));
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
                throw new j(((IOException) (obj)));
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
            throw new j(ioexception);
        }
        return ((InputStream) (obj));
    }

    private e g()
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

    private e h()
    {
        e e1;
        try
        {
            e1 = g();
        }
        catch (IOException ioexception)
        {
            throw new j(ioexception);
        }
        return e1;
    }

    private e i()
    {
        if (f != null)
        {
            return this;
        } else
        {
            a().setDoOutput(true);
            String s = c(a().getRequestProperty("Content-Type"), "charset");
            f = new l(a().getOutputStream(), s, j);
            return this;
        }
    }

    private e j()
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

    public final e a(String s, Number number)
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

    public final e a(String s, String s1)
    {
        a().setRequestProperty(s, s1);
        return this;
    }

    public final e a(String s, String s1, String s2, File file)
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
        throw new j(s);
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

    public final e a(String s, String s1, String s2, InputStream inputstream)
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
            throw new j(s);
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
            throw new j(ioexception);
        }
        return i1;
    }

    public final e b(String s, String s1)
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
        c = h.a;
    }
}
