// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.skype.android.util:
//            HttpUtil, SkypeSSLSocketFactory, Charsets

public class HttpUtilImpl
    implements HttpUtil
{

    private SSLSocketFactory a;

    public HttpUtilImpl()
    {
    }

    private SSLSocketFactory a()
    {
        if (a == null)
        {
            a = (SSLSocketFactory)SkypeSSLSocketFactory.getDefault();
        }
        return a;
    }

    private static void a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        do
        {
            int i = inputstream.read();
            if (i != -1)
            {
                outputstream.write(i);
            } else
            {
                return;
            }
        } while (true);
    }

    private byte[] e(HttpURLConnection httpurlconnection)
    {
        HttpURLConnection httpurlconnection1;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj2 = null;
        obj3 = null;
        httpurlconnection1 = null;
        obj1 = null;
        obj = obj2;
        httpurlconnection = httpurlconnection.getInputStream();
        obj1 = httpurlconnection;
        obj = obj2;
        httpurlconnection1 = httpurlconnection;
        obj2 = new BufferedInputStream(httpurlconnection);
        a(httpurlconnection, bytearrayoutputstream);
        a(httpurlconnection);
        a(((Closeable) (obj2)));
        a(bytearrayoutputstream);
_L1:
        return bytearrayoutputstream.toByteArray();
        obj2;
        httpurlconnection = ((HttpURLConnection) (obj1));
        obj1 = obj3;
_L4:
        obj = obj1;
        httpurlconnection1 = httpurlconnection;
        ((IOException) (obj2)).printStackTrace();
        a(httpurlconnection);
        a(((Closeable) (obj1)));
        a(bytearrayoutputstream);
          goto _L1
        Exception exception;
        exception;
        httpurlconnection = httpurlconnection1;
_L3:
        a(httpurlconnection);
        a(((Closeable) (obj)));
        a(bytearrayoutputstream);
        throw exception;
        exception;
        obj = obj2;
        if (true) goto _L3; else goto _L2
_L2:
        IOException ioexception;
        ioexception;
        exception = ((Exception) (obj2));
        obj2 = ioexception;
          goto _L4
    }

    public final String a(HttpURLConnection httpurlconnection)
    {
        java.nio.charset.Charset charset = Charsets.a;
        return new String(e(httpurlconnection), charset);
    }

    public final HttpURLConnection a(String s)
    {
        String s1 = null;
        try
        {
            s = (HttpURLConnection)(new URL(s)).openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s1;
        }
        s1 = s;
        if (!(s instanceof HttpsURLConnection))
        {
            break MISSING_BLOCK_LABEL_39;
        }
        s1 = s;
        ((HttpsURLConnection)s).setSSLSocketFactory(a());
        return s;
    }

    public final void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        closeable.printStackTrace();
        return;
    }

    public final void a(Flushable flushable)
    {
        if (flushable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        flushable.flush();
        return;
        flushable;
        flushable.printStackTrace();
        return;
    }

    public final void a(HttpURLConnection httpurlconnection, String s)
        throws IOException
    {
        if (!TextUtils.isEmpty(s))
        {
            httpurlconnection = new OutputStreamWriter(httpurlconnection.getOutputStream(), Charsets.a);
            httpurlconnection.write(s);
            a(((Flushable) (httpurlconnection)));
            a(((Closeable) (httpurlconnection)));
        }
    }

    public final void a(HttpURLConnection httpurlconnection, Map map)
    {
        if (map != null)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); httpurlconnection.addRequestProperty((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
    }

    public final HttpURLConnection b(String s)
        throws Exception
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        if (s instanceof HttpsURLConnection)
        {
            ((HttpsURLConnection)s).setSSLSocketFactory(a());
        }
        return s;
    }

    public final byte[] b(HttpURLConnection httpurlconnection)
    {
        byte abyte0[] = null;
        if (httpurlconnection != null)
        {
            abyte0 = e(httpurlconnection);
            httpurlconnection.disconnect();
        }
        return abyte0;
    }

    public final String c(HttpURLConnection httpurlconnection)
    {
        String s = null;
        if (httpurlconnection != null)
        {
            s = a(httpurlconnection);
            httpurlconnection.disconnect();
        }
        return s;
    }

    public final String d(HttpURLConnection httpurlconnection)
        throws Exception
    {
        Object obj;
        Object obj1;
        char ac[];
        Object obj3;
        obj = null;
        obj3 = null;
        ac = null;
        obj1 = obj;
        Object obj2 = httpurlconnection.getInputStream();
        obj1 = obj;
        HttpUtil.Encoding encoding = HttpUtil.Encoding.valueOf(httpurlconnection.getContentEncoding().toUpperCase(Locale.US));
        obj1 = obj;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[HttpUtil.Encoding.values().length];
                try
                {
                    a[HttpUtil.Encoding.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[HttpUtil.Encoding.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[HttpUtil.Encoding.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[encoding.ordinal()];
        JVM INSTR tableswitch 1 3: default 289
    //                   1 128
    //                   2 128
    //                   3 220;
           goto _L1 _L2 _L2 _L3
_L1:
        obj1 = obj;
        throw new IllegalArgumentException((new StringBuilder("Illegal argument exception: ")).append(encoding.name()).toString());
        obj;
        obj2 = ac;
        httpurlconnection = obj3;
_L8:
        a(((Closeable) (obj2)));
        a(httpurlconnection);
        a(((Closeable) (obj1)));
        throw obj;
_L2:
        obj1 = obj;
        obj = new GZIPInputStream(((InputStream) (obj2)));
_L6:
        obj1 = obj;
        obj2 = new InputStreamReader(((InputStream) (obj)), Charsets.a);
        obj1 = new StringWriter();
        ac = new char[10240];
_L4:
        int i = ((Reader) (obj2)).read(ac, 0, 1024);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringWriter) (obj1)).write(ac, 0, i);
          goto _L4
        Exception exception;
        exception;
        ac = ((char []) (obj1));
        httpurlconnection = ((HttpURLConnection) (obj2));
        obj1 = obj;
        obj2 = ac;
        obj = exception;
        continue; /* Loop/switch isn't completed */
_L3:
        obj1 = obj;
        obj = new InflaterInputStream(((InputStream) (obj2)), new Inflater(true));
        if (true) goto _L6; else goto _L5
_L5:
        a(((Closeable) (obj1)));
        a(((Closeable) (obj2)));
        a(((Closeable) (obj)));
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        return ((StringWriter) (obj1)).toString();
        exception;
        httpurlconnection = ((HttpURLConnection) (obj2));
        obj1 = obj;
        obj2 = ac;
        obj = exception;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
