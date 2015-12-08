// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.a.a;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.net.a.a:
//            b

public class a
{

    private static final Logger b;
    String a;
    private int c;

    public a()
    {
        c = -1;
    }

    public static Map a(URL url)
    {
        Object obj = url.getHost();
        int j = url.getPort();
        url = (new StringBuilder()).append(((String) (obj))).append(":");
        int i = j;
        if (j == -1)
        {
            i = 80;
        }
        url = url.append(i).toString();
        obj = new Hashtable();
        ((Map) (obj)).put("Host", Arrays.asList(new String[] {
            url
        }));
        return ((Map) (obj));
    }

    private static void a(Map map, URLConnection urlconnection)
    {
        if (map != null)
        {
            for (map = map.entrySet().iterator(); map.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                Iterator iterator = ((List)entry.getValue()).iterator();
                while (iterator.hasNext()) 
                {
                    String s = (String)iterator.next();
                    urlconnection.addRequestProperty((String)entry.getKey(), s);
                }
            }

        }
    }

    private static byte[] a(InputStream inputstream)
    {
        byte abyte0[] = new byte[1024];
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(1024);
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                return bytearrayoutputstream.toByteArray();
            }
        } while (true);
    }

    private b b(URL url, Map map, byte abyte0[])
    {
        Map map1;
        Object obj1;
        Object obj2;
        obj1 = null;
        map1 = null;
        obj2 = null;
        a = null;
        Object obj = (HttpURLConnection)url.openConnection();
        a(map, ((URLConnection) (obj)));
        ((HttpURLConnection) (obj)).setRequestProperty("Connection", "close");
        if (c > 0)
        {
            ((HttpURLConnection) (obj)).setReadTimeout(c);
        }
        ((HttpURLConnection) (obj)).setDoOutput(true);
        ((HttpURLConnection) (obj)).setFixedLengthStreamingMode(abyte0.length);
        ((HttpURLConnection) (obj)).getOutputStream().write(abyte0);
        url = obj2;
        if (((HttpURLConnection) (obj)).getResponseCode() / 100 == 2)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        url = ((HttpURLConnection) (obj)).getHeaderFields();
        if (url != null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        url = new Hashtable();
        url = new b(((HttpURLConnection) (obj)).getResponseCode(), url, ((HttpURLConnection) (obj)).getResponseMessage(), ((HttpURLConnection) (obj)).getResponseMessage().getBytes("UTF-8"));
        if (url != null)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        map = a(new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream()));
        map = new b(((HttpURLConnection) (obj)).getResponseCode(), ((HttpURLConnection) (obj)).getHeaderFields(), ((HttpURLConnection) (obj)).getResponseMessage(), map);
        url = map;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        ((HttpURLConnection) (obj)).disconnect();
        abyte0 = url;
_L2:
        return abyte0;
        abyte0;
        url = null;
        map = obj1;
_L5:
        map1 = map;
        a = (new StringBuilder("Error sending POST: ")).append(abyte0.getLocalizedMessage()).toString();
        abyte0 = url;
        if (map == null) goto _L2; else goto _L1
_L1:
        map.disconnect();
        return url;
        url;
        obj = map1;
_L4:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw url;
        url;
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        map = ((Map) (obj));
        url = null;
          goto _L5
        abyte0;
        map = ((Map) (obj));
          goto _L5
        return url;
    }

    public static Map b(URL url)
    {
        Object obj = url.getHost();
        int j = url.getPort();
        url = (new StringBuilder()).append(((String) (obj))).append(":");
        int i = j;
        if (j == -1)
        {
            i = 80;
        }
        url = url.append(i).toString();
        obj = new Hashtable();
        ((Map) (obj)).put("Host", Arrays.asList(new String[] {
            url
        }));
        return ((Map) (obj));
    }

    private b c(URL url, Map map)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj1 = null;
        obj3 = null;
        a = null;
        Object obj = (HttpURLConnection)url.openConnection();
        int i;
        a(map, ((URLConnection) (obj)));
        ((HttpURLConnection) (obj)).setRequestProperty("Connection", "close");
        if (c > 0)
        {
            ((HttpURLConnection) (obj)).setReadTimeout(c);
        }
        i = ((HttpURLConnection) (obj)).getResponseCode();
        map = ((HttpURLConnection) (obj)).getResponseMessage();
        url = obj3;
        if (i / 100 == 2)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        url = ((HttpURLConnection) (obj)).getHeaderFields();
        if (url != null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        url = new Hashtable();
        url = new b(((HttpURLConnection) (obj)).getResponseCode(), url, ((HttpURLConnection) (obj)).getResponseMessage(), ((HttpURLConnection) (obj)).getResponseMessage().getBytes("UTF-8"));
        if (url != null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        obj1 = a(new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream()));
        map = new b(((HttpURLConnection) (obj)).getResponseCode(), ((HttpURLConnection) (obj)).getHeaderFields(), map, ((byte []) (obj1)));
        url = map;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        ((HttpURLConnection) (obj)).disconnect();
        obj = url;
_L2:
        return ((b) (obj));
        obj;
        url = null;
        map = obj2;
_L5:
        obj1 = map;
        a = (new StringBuilder("Error reading response: ")).append(((IOException) (obj)).getLocalizedMessage()).toString();
        obj1 = map;
        b.info(a);
        obj = url;
        if (map == null) goto _L2; else goto _L1
_L1:
        map.disconnect();
        return url;
        url;
        obj = obj1;
_L4:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw url;
        url;
        if (true) goto _L4; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
        map = ((Map) (obj));
        url = null;
        obj = ioexception;
          goto _L5
        ioexception;
        map = ((Map) (obj));
        obj = ioexception;
          goto _L5
        return url;
    }

    public static Map c(URL url)
    {
        Object obj = url.getHost();
        int j = url.getPort();
        url = (new StringBuilder()).append(((String) (obj))).append(":");
        int i = j;
        if (j == -1)
        {
            i = 80;
        }
        url = url.append(i).toString();
        obj = new Hashtable();
        ((Map) (obj)).put("Host", Arrays.asList(new String[] {
            url
        }));
        return ((Map) (obj));
    }

    private b d(URL url, Map map)
    {
        Map map1;
        Object obj1;
        Object obj2;
        obj1 = null;
        map1 = null;
        obj2 = null;
        a = null;
        Object obj = (HttpURLConnection)url.openConnection();
        ((HttpURLConnection) (obj)).setRequestMethod("DELETE");
        a(map, ((URLConnection) (obj)));
        ((HttpURLConnection) (obj)).setRequestProperty("Connection", "close");
        if (c > 0)
        {
            ((HttpURLConnection) (obj)).setReadTimeout(c);
        }
        url = obj2;
        if (((HttpURLConnection) (obj)).getResponseCode() / 100 == 2)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        url = ((HttpURLConnection) (obj)).getHeaderFields();
        if (url != null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        url = new Hashtable();
        url = new b(((HttpURLConnection) (obj)).getResponseCode(), url, ((HttpURLConnection) (obj)).getResponseMessage(), ((HttpURLConnection) (obj)).getResponseMessage().getBytes("UTF-8"));
        if (url != null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        map = a(new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream()));
        map = new b(((HttpURLConnection) (obj)).getResponseCode(), ((HttpURLConnection) (obj)).getHeaderFields(), ((HttpURLConnection) (obj)).getResponseMessage(), map);
        url = map;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        ((HttpURLConnection) (obj)).disconnect();
        obj = url;
_L2:
        return ((b) (obj));
        obj;
        url = null;
        map = obj1;
_L5:
        map1 = map;
        a = (new StringBuilder("Error reading response: ")).append(((IOException) (obj)).getLocalizedMessage()).toString();
        obj = url;
        if (map == null) goto _L2; else goto _L1
_L1:
        map.disconnect();
        return url;
        url;
        obj = map1;
_L4:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw url;
        url;
        if (true) goto _L4; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
        map = ((Map) (obj));
        url = null;
        obj = ioexception;
          goto _L5
        ioexception;
        map = ((Map) (obj));
        obj = ioexception;
          goto _L5
        return url;
    }

    public static Map d(URL url)
    {
        url = c(url);
        url.put("Content-Type", Arrays.asList(new String[] {
            "application/json"
        }));
        return url;
    }

    public final b a(URL url, Map map)
    {
        return c(url, map);
    }

    public final b a(URL url, Map map, byte abyte0[])
    {
        return b(url, map, abyte0);
    }

    public final String a()
    {
        return a;
    }

    public final void a(int i)
    {
        c = i;
    }

    public final b b(URL url, Map map)
    {
        return d(url, map);
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/net/a/a/a.getName());
        b = logger;
        logger.setLevel(Level.OFF);
    }
}
