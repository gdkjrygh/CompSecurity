// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.microsoft.advertising.android:
//            av, ak

final class al
{
    public static final class a
    {

        public static int a = 0;
        protected InputStream b;
        protected int c;
        protected long d;

        public final int a()
        {
            return c;
        }

        public final InputStream b()
        {
            return b;
        }


        public a()
        {
            b = null;
            c = a;
            d = 0L;
        }
    }


    private static al a = new al();

    al()
    {
    }

    private static long a(HttpResponse httpresponse)
    {
        Object obj;
        Object obj1;
        long l;
        long l1;
        long l2;
        l1 = System.currentTimeMillis() + 0x112a880L;
        obj = httpresponse.getFirstHeader("Expires");
        l = l1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        obj1 = new SimpleDateFormat("EEE, dd MMM yyyy kk:mm:ss zzz", Locale.US);
        l2 = l1;
        obj1 = ((SimpleDateFormat) (obj1)).parse(((Header) (obj)).getValue());
        l = l1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        l2 = l1;
        l = ((Date) (obj1)).getTime();
        l2 = l;
        (new StringBuilder("parsed Expires header value ")).append(obj1);
        l2 = l;
        try
        {
            av.a("HttpGetter");
        }
        catch (ParseException parseexception)
        {
            (new StringBuilder("Unexpected date format found in http header 'Expires' - value seen was: <")).append(((Header) (obj)).getValue()).append("> (").append(parseexception.getMessage()).append(")");
            av.a("HttpGetter");
            l = l2;
        }
        httpresponse = httpresponse.getFirstHeader("Cache-Control");
        l1 = l;
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        l1 = l;
        if (httpresponse.getValue() == null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        obj = Pattern.compile(".*max-age=(\\d+).*").matcher(httpresponse.getValue().toLowerCase(Locale.ENGLISH));
        l1 = l;
        if (!((Matcher) (obj)).find())
        {
            break MISSING_BLOCK_LABEL_191;
        }
        l1 = l;
        try
        {
            l2 = Long.parseLong(((Matcher) (obj)).group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            (new StringBuilder("Exception caught parsing http header 'Cache-Control:max-age' value: <")).append(httpresponse.getValue()).append("> (").append(numberformatexception.getMessage()).append(")");
            av.a("HttpGetter");
            return l1;
        }
        l1 = l;
        l = System.currentTimeMillis() + 1000L * l2;
        l1 = l;
        av.a("HttpGetter");
        l1 = l;
        return l1;
    }

    public static a a(HttpGet httpget)
        throws IOException
    {
        return c(httpget);
    }

    public static al a()
    {
        return a;
    }

    public static a b(HttpGet httpget)
        throws IOException
    {
        String s = httpget.getURI().toURL().toString();
        ak.a();
        a a1 = ak.b(s);
        Object obj = a1;
        if (a1 == null)
        {
            httpget = c(httpget);
            obj = httpget;
            if (((a) (httpget)).c == 200)
            {
                ak.a();
                ak.a(s, httpget);
                httpget.b().close();
                ak.a();
                obj = ak.b(s);
            }
        }
        return ((a) (obj));
    }

    private static a c(HttpGet httpget)
        throws IOException
    {
        a a1 = new a();
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        if (httpget.getFirstHeader("Accept-Encoding") == null)
        {
            httpget.addHeader("Accept-Encoding", "gzip");
        }
        HttpConnectionParams.setConnectionTimeout(httpget.getParams(), 20000);
        HttpConnectionParams.setSoTimeout(httpget.getParams(), 20000);
        if (!Thread.interrupted())
        {
            httpget = defaulthttpclient.execute(httpget);
            a1.c = httpget.getStatusLine().getStatusCode();
            if (a1.c == 200)
            {
                Object obj = httpget.getEntity();
                if (Thread.interrupted())
                {
                    a1.c = a.a;
                    return a1;
                }
                Header header = httpget.getFirstHeader("Content-Encoding");
                obj = ((HttpEntity) (obj)).getContent();
                if (header != null && header.getValue().equalsIgnoreCase("gzip"))
                {
                    a1.b = new GZIPInputStream(((InputStream) (obj)));
                } else
                {
                    a1.b = ((InputStream) (obj));
                }
                a1.d = a(httpget);
                return a1;
            }
        }
        return a1;
    }

}
