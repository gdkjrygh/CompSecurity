// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public final class HttpHelper
{
    public static final class ContentType extends Enum
    {

        private static final ContentType ENUM$VALUES[];
        public static final ContentType HTML;
        public static final ContentType JSON;
        public static final ContentType TEXT;
        public static final ContentType XML;

        public static ContentType valueOf(String s)
        {
            return (ContentType)Enum.valueOf(com/google/zxing/client/android/HttpHelper$ContentType, s);
        }

        public static ContentType[] values()
        {
            ContentType acontenttype[] = ENUM$VALUES;
            int i = acontenttype.length;
            ContentType acontenttype1[] = new ContentType[i];
            System.arraycopy(acontenttype, 0, acontenttype1, 0, i);
            return acontenttype1;
        }

        static 
        {
            HTML = new ContentType("HTML", 0);
            JSON = new ContentType("JSON", 1);
            XML = new ContentType("XML", 2);
            TEXT = new ContentType("TEXT", 3);
            ENUM$VALUES = (new ContentType[] {
                HTML, JSON, XML, TEXT
            });
        }

        private ContentType(String s, int i)
        {
            super(s, i);
        }
    }


    private static int $SWITCH_TABLE$com$google$zxing$client$android$HttpHelper$ContentType[];
    private static final Collection REDIRECTOR_DOMAINS = new HashSet(Arrays.asList(new String[] {
        "amzn.to", "bit.ly", "bitly.com", "fb.me", "goo.gl", "is.gd", "j.mp", "lnkd.in", "ow.ly", "R.BEETAGG.COM", 
        "r.beetagg.com", "SCN.BY", "su.pr", "t.co", "tinyurl.com", "tr.im"
    }));
    private static final String TAG = com/google/zxing/client/android/HttpHelper.getSimpleName();

    static int[] $SWITCH_TABLE$com$google$zxing$client$android$HttpHelper$ContentType()
    {
        int ai[] = $SWITCH_TABLE$com$google$zxing$client$android$HttpHelper$ContentType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[ContentType.values().length];
        try
        {
            ai[ContentType.HTML.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[ContentType.JSON.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[ContentType.TEXT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[ContentType.XML.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$google$zxing$client$android$HttpHelper$ContentType = ai;
        return ai;
    }

    private HttpHelper()
    {
    }

    private static CharSequence consume(URLConnection urlconnection, int i)
        throws IOException
    {
        char ac[];
        Object obj1;
        String s;
        s = getEncoding(urlconnection);
        obj1 = new StringBuilder();
        ac = null;
        urlconnection = new InputStreamReader(urlconnection.getInputStream(), s);
        ac = new char[1024];
_L3:
        if (((StringBuilder) (obj1)).length() >= i) goto _L2; else goto _L1
_L1:
        int j = urlconnection.read(ac);
        if (j > 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
_L2:
        Object obj;
        if (urlconnection != null)
        {
            try
            {
                urlconnection.close();
            }
            // Misplaced declaration of an exception variable
            catch (URLConnection urlconnection)
            {
                return ((CharSequence) (obj1));
            }
            // Misplaced declaration of an exception variable
            catch (URLConnection urlconnection)
            {
                return ((CharSequence) (obj1));
            }
        }
        return ((CharSequence) (obj1));
        ((StringBuilder) (obj1)).append(ac, 0, j);
          goto _L3
        obj1;
        ac = urlconnection;
        urlconnection = ((URLConnection) (obj1));
_L5:
        if (ac != null)
        {
            try
            {
                ac.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw urlconnection;
        urlconnection;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static CharSequence downloadViaHttp(String s, ContentType contenttype)
        throws IOException
    {
        return downloadViaHttp(s, contenttype, 0x7fffffff);
    }

    public static CharSequence downloadViaHttp(String s, ContentType contenttype, int i)
        throws IOException
    {
        $SWITCH_TABLE$com$google$zxing$client$android$HttpHelper$ContentType()[contenttype.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 46
    //                   2 52
    //                   3 58;
           goto _L1 _L2 _L3 _L4
_L1:
        contenttype = "text/*,*/*";
_L6:
        return downloadViaHttp(s, ((String) (contenttype)), i);
_L2:
        contenttype = "application/xhtml+xml,text/html,text/*,*/*";
        continue; /* Loop/switch isn't completed */
_L3:
        contenttype = "application/json,text/*,*/*";
        continue; /* Loop/switch isn't completed */
_L4:
        contenttype = "application/xml,text/*,*/*";
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static CharSequence downloadViaHttp(String s, String s1, int i)
        throws IOException
    {
        int j = 0;
_L5:
        HttpURLConnection httpurlconnection;
        if (j >= 5)
        {
            throw new IOException("Too many redirects");
        }
        httpurlconnection = safelyOpenConnection(new URL(s));
        httpurlconnection.setInstanceFollowRedirects(true);
        httpurlconnection.setRequestProperty("Accept", s1);
        httpurlconnection.setRequestProperty("Accept-Charset", "utf-8,*");
        httpurlconnection.setRequestProperty("User-Agent", "ZXing (Android)");
        int k = safelyConnect(s, httpurlconnection);
        k;
        JVM INSTR lookupswitch 2: default 174
    //                   200: 128
    //                   302: 140;
           goto _L1 _L2 _L3
_L1:
        throw new IOException((new StringBuilder("Bad HTTP response: ")).append(k).toString());
        s;
        httpurlconnection.disconnect();
        throw s;
_L2:
        s = consume(httpurlconnection, i);
        httpurlconnection.disconnect();
        return s;
_L3:
        s = httpurlconnection.getHeaderField("Location");
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        j++;
        httpurlconnection.disconnect();
        if (true) goto _L5; else goto _L4
_L4:
        throw new IOException("No Location");
    }

    private static String getEncoding(URLConnection urlconnection)
    {
        urlconnection = urlconnection.getHeaderField("Content-Type");
        if (urlconnection != null)
        {
            int i = urlconnection.indexOf("charset=");
            if (i >= 0)
            {
                return urlconnection.substring("charset=".length() + i);
            }
        }
        return "UTF-8";
    }

    private static int safelyConnect(String s, HttpURLConnection httpurlconnection)
        throws IOException
    {
        int i;
        try
        {
            httpurlconnection.connect();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            Log.w(TAG, (new StringBuilder("Bad URI? ")).append(s).toString());
            throw new IOException(httpurlconnection.toString());
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            Log.w(TAG, (new StringBuilder("Bad URI? ")).append(s).toString());
            throw new IOException(httpurlconnection.toString());
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            Log.w(TAG, (new StringBuilder("Restricted URI? ")).append(s).toString());
            throw new IOException(httpurlconnection.toString());
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            Log.w(TAG, (new StringBuilder("Bad URI? ")).append(s).toString());
            throw new IOException(httpurlconnection.toString());
        }
        try
        {
            i = httpurlconnection.getResponseCode();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            Log.w(TAG, (new StringBuilder("Bad URI? ")).append(s).toString());
            throw new IOException(httpurlconnection.toString());
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            Log.w(TAG, (new StringBuilder("Bad server status? ")).append(s).toString());
            throw new IOException(httpurlconnection.toString());
        }
        return i;
    }

    private static HttpURLConnection safelyOpenConnection(URL url)
        throws IOException
    {
        Object obj;
        try
        {
            obj = url.openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w(TAG, (new StringBuilder("Bad URI? ")).append(url).toString());
            throw new IOException(((NullPointerException) (obj)).toString());
        }
        if (!(obj instanceof HttpURLConnection))
        {
            throw new IOException();
        } else
        {
            return (HttpURLConnection)obj;
        }
    }

    public static URI unredirect(URI uri)
        throws IOException
    {
        HttpURLConnection httpurlconnection;
        if (!REDIRECTOR_DOMAINS.contains(uri.getHost()))
        {
            return uri;
        }
        httpurlconnection = safelyOpenConnection(uri.toURL());
        httpurlconnection.setInstanceFollowRedirects(false);
        httpurlconnection.setDoInput(false);
        httpurlconnection.setRequestMethod("HEAD");
        httpurlconnection.setRequestProperty("User-Agent", "ZXing (Android)");
        int i = safelyConnect(uri.toString(), httpurlconnection);
        i;
        JVM INSTR tableswitch 300 307: default 108
    //                   300 114
    //                   301 114
    //                   302 114
    //                   303 114
    //                   304 108
    //                   305 108
    //                   306 108
    //                   307 114;
           goto _L1 _L2 _L2 _L2 _L2 _L1 _L1 _L1 _L2
_L1:
        httpurlconnection.disconnect();
        return uri;
_L2:
        Object obj = httpurlconnection.getHeaderField("Location");
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new URI(((String) (obj)));
        httpurlconnection.disconnect();
        return ((URI) (obj));
        uri;
        httpurlconnection.disconnect();
        throw uri;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        if (true) goto _L1; else goto _L3
_L3:
    }

}
