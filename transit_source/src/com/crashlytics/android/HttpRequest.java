// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android:
//            ai

final class HttpRequest
{

    private final HttpURLConnection a;
    private RequestOutputStream b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;

    private HttpRequest(CharSequence charsequence, String s)
        throws HttpRequestException
    {
        d = true;
        e = false;
        f = 8192;
        try
        {
            a = (HttpURLConnection)(new URL(charsequence.toString())).openConnection();
            a.setRequestMethod(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new HttpRequestException(charsequence);
        }
    }

    private HttpRequest(URL url, String s)
        throws HttpRequestException
    {
        d = true;
        e = false;
        f = 8192;
        try
        {
            a = (HttpURLConnection)url.openConnection();
            a.setRequestMethod(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            throw new HttpRequestException(url);
        }
    }

    static int a(HttpRequest httprequest)
    {
        return httprequest.f;
    }

    private HttpRequest a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        return (HttpRequest)(new ai(this, inputstream, d, inputstream, outputstream)).call();
    }

    public static HttpRequest a(CharSequence charsequence)
        throws HttpRequestException
    {
        return new HttpRequest(charsequence, "POST");
    }

    public static HttpRequest a(CharSequence charsequence, Map map, boolean flag)
    {
        Object obj;
        obj = charsequence.toString();
        charsequence = ((CharSequence) (obj));
        if (map == null) goto _L2; else goto _L1
_L1:
        if (!map.isEmpty()) goto _L4; else goto _L3
_L3:
        charsequence = ((CharSequence) (obj));
_L2:
        return new HttpRequest(c(charsequence), "GET");
_L4:
        int j;
        int k;
        charsequence = new StringBuilder(((String) (obj)));
        if (((String) (obj)).indexOf(':') + 2 == ((String) (obj)).lastIndexOf('/'))
        {
            charsequence.append('/');
        }
        j = ((String) (obj)).indexOf('?');
        k = charsequence.length() - 1;
        if (j != -1) goto _L6; else goto _L5
_L5:
        charsequence.append('?');
_L8:
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
_L6:
        if (j < k && ((String) (obj)).charAt(k) != '&')
        {
            charsequence.append('&');
        }
        if (true) goto _L8; else goto _L7
_L7:
        charsequence = charsequence.toString();
        if (true) goto _L2; else goto _L9
_L9:
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

    private HttpRequest a(String s, String s1, String s2, String s3)
        throws HttpRequestException
    {
        try
        {
            i();
            a(s, s1, ((String) (null)));
            b.write(s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new HttpRequestException(s);
        }
        return this;
    }

    public static HttpRequest a(URL url)
        throws HttpRequestException
    {
        return new HttpRequest(url, "GET");
    }

    public static HttpRequest b(CharSequence charsequence)
        throws HttpRequestException
    {
        return new HttpRequest(charsequence, "PUT");
    }

    private HttpRequest b(String s, String s1, String s2)
        throws HttpRequestException
    {
        return a(s, s1, null, s2);
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
        int j;
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
        j = url.getPort();
        charsequence = s;
        if (j != -1)
        {
            charsequence = (new StringBuilder()).append(s).append(':').append(Integer.toString(j)).toString();
        }
        try
        {
            charsequence = (new URI(url.getProtocol(), charsequence, url.getPath(), url.getQuery(), null)).toASCIIString();
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            IOException ioexception = new IOException("Parsing URI failed");
            ioexception.initCause(charsequence);
            throw new HttpRequestException(ioexception);
        }
        return charsequence;
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
        int l = s.length();
        int j = s.indexOf(';') + 1;
        if (j == 0 || j == l)
        {
            return null;
        }
        int k = s.indexOf(';', j);
        if (k == -1)
        {
            k = l;
        }
        int i1;
        for (; j < k; k = i1)
        {
            i1 = s.indexOf('=', j);
            if (i1 != -1 && i1 < k && s1.equals(s.substring(j, i1).trim()))
            {
                String s2 = s.substring(i1 + 1, k).trim();
                j = s2.length();
                if (j != 0)
                {
                    s = s2;
                    if (j > 2)
                    {
                        s = s2;
                        if ('"' == s2.charAt(0))
                        {
                            s = s2;
                            if ('"' == s2.charAt(j - 1))
                            {
                                return s2.substring(1, j - 1);
                            }
                        }
                    }
                    continue; /* Loop/switch isn't completed */
                }
            }
            k++;
            i1 = s.indexOf(';', k);
            j = i1;
            if (i1 == -1)
            {
                j = l;
            }
            i1 = j;
            j = k;
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
            b.write(charsequence.toString());
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
        int j = a.getHeaderFieldInt("Content-Length", -1);
        ByteArrayOutputStream bytearrayoutputstream;
        if (j > 0)
        {
            bytearrayoutputstream = new ByteArrayOutputStream(j);
        } else
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
        }
        try
        {
            a(new BufferedInputStream(e(), f), bytearrayoutputstream);
            s = bytearrayoutputstream.toString(c(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new HttpRequestException(s);
        }
        return s;
    }

    private InputStream e()
        throws HttpRequestException
    {
        Object obj;
        if (b() < 400)
        {
            try
            {
                obj = a.getInputStream();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new HttpRequestException(((IOException) (obj)));
            }
        } else
        {
            InputStream inputstream1 = a.getErrorStream();
            obj = inputstream1;
            if (inputstream1 == null)
            {
                InputStream inputstream;
                try
                {
                    inputstream = a.getInputStream();
                }
                catch (IOException ioexception)
                {
                    throw new HttpRequestException(ioexception);
                }
                return inputstream;
            }
        }
        return ((InputStream) (obj));
    }

    private HttpRequest f()
        throws IOException
    {
        if (b == null)
        {
            return this;
        }
        if (c)
        {
            b.write("\r\n--00content0boundary00--\r\n");
        }
        if (d)
        {
            try
            {
                b.close();
            }
            catch (IOException ioexception) { }
        } else
        {
            b.close();
        }
        b = null;
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
        if (b != null)
        {
            return this;
        } else
        {
            a.setDoOutput(true);
            String s = c(a.getRequestProperty("Content-Type"), "charset");
            b = new RequestOutputStream(a.getOutputStream(), s, f);
            return this;
        }
    }

    private HttpRequest i()
        throws IOException
    {
        if (!c)
        {
            c = true;
            a("Content-Type", "multipart/form-data; boundary=00content0boundary00").h();
            b.write("--00content0boundary00\r\n");
            return this;
        } else
        {
            b.write("\r\n--00content0boundary00\r\n");
            return this;
        }
    }

    public final HttpRequest a(int j)
    {
        a.setConnectTimeout(10000);
        return this;
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
        return b(s, null, number);
    }

    public final HttpRequest a(String s, String s1)
    {
        a.setRequestProperty(s, s1);
        return this;
    }

    public final HttpRequest a(String s, String s1, String s2, File file)
        throws HttpRequestException
    {
        try
        {
            file = new BufferedInputStream(new FileInputStream(file));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new HttpRequestException(s);
        }
        return a(s, s1, s2, ((InputStream) (file)));
    }

    public final HttpRequest a(String s, String s1, String s2, InputStream inputstream)
        throws HttpRequestException
    {
        try
        {
            i();
            a(s, s1, s2);
            a(inputstream, ((OutputStream) (b)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new HttpRequestException(s);
        }
        return this;
    }

    public final HttpRequest a(java.util.Map.Entry entry)
    {
        return a((String)entry.getKey(), (String)entry.getValue());
    }

    public final HttpRequest a(boolean flag)
    {
        a.setUseCaches(false);
        return this;
    }

    public final String a(String s)
        throws HttpRequestException
    {
        g();
        return a.getHeaderField(s);
    }

    public final HttpURLConnection a()
    {
        return a;
    }

    public final int b()
        throws HttpRequestException
    {
        int j;
        try
        {
            f();
            j = a.getResponseCode();
        }
        catch (IOException ioexception)
        {
            throw new HttpRequestException(ioexception);
        }
        return j;
    }

    public final HttpRequest b(String s, String s1)
    {
        return b(s, null, s1);
    }

    public final String c()
        throws HttpRequestException
    {
        return d(c(a("Content-Type"), "charset"));
    }

    public final String d()
    {
        return a.getRequestMethod();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a.getRequestMethod()).append(' ').append(a.getURL()).toString();
    }

    private class HttpRequestException extends RuntimeException
    {

        private static final long serialVersionUID = 0xefc1aa7964bcfdc9L;

        public IOException getCause()
        {
            return (IOException)super.getCause();
        }

        public volatile Throwable getCause()
        {
            return getCause();
        }

        protected HttpRequestException(IOException ioexception)
        {
            super(ioexception);
        }
    }


    private class RequestOutputStream extends BufferedOutputStream
    {

        private final CharsetEncoder a;

        public RequestOutputStream write(String s)
            throws IOException
        {
            s = a.encode(CharBuffer.wrap(s));
            super.write(s.array(), 0, s.limit());
            return this;
        }

        public RequestOutputStream(OutputStream outputstream, String s, int j)
        {
            super(outputstream, j);
            a = Charset.forName(HttpRequest.b(s)).newEncoder();
        }
    }

}
