// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import com.appboy.f.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            ic, dk, al, k

public final class hb
    implements ic
{

    private static final String a;
    private final int b = 5000;

    public hb()
    {
    }

    private static String a(BufferedReader bufferedreader)
    {
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            String s = bufferedreader.readLine();
            if (s != null)
            {
                stringbuilder.append(s);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    private JSONObject a(URI uri, JSONObject jsonobject, Map map, k k1)
    {
        Object obj = null;
        URL url = a.a.dk.a(uri);
        uri = obj;
        if (url != null)
        {
            try
            {
                uri = a(url, jsonobject, map, k1);
            }
            // Misplaced declaration of an exception variable
            catch (URI uri)
            {
                try
                {
                    uri = a(url, jsonobject, map, k1);
                }
                // Misplaced declaration of an exception variable
                catch (URI uri)
                {
                    throw new al(String.format("Experienced IOException twice during request to [%s], failing: [%s]", new Object[] {
                        url.toString(), uri.getMessage()
                    }), uri);
                }
                return uri;
            }
        }
        return uri;
    }

    private JSONObject a(URL url, JSONObject jsonobject, Map map, k k1)
    {
        Object obj = null;
        if (url == null) goto _L2; else goto _L1
_L1:
        jsonobject = b(url, jsonobject, map, k1);
_L11:
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        jsonobject.connect();
        if (jsonobject.getResponseCode() / 100 != 2) goto _L4; else goto _L3
_L3:
        if (!"gzip".equalsIgnoreCase(jsonobject.getContentEncoding())) goto _L6; else goto _L5
_L5:
        map = new GZIPInputStream(jsonobject.getInputStream());
_L7:
        k1 = new BufferedReader(new InputStreamReader(map, "UTF-8"));
        k1 = new JSONObject(a(((BufferedReader) (k1))));
        if (jsonobject != null)
        {
            jsonobject.disconnect();
        }
        try
        {
            map.close();
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            com.appboy.f.a.c(a, "Caught an error trying to close the inputStream in getResult", url);
            return k1;
        }
        return k1;
_L6:
        map = new BufferedInputStream(jsonobject.getInputStream());
          goto _L7
        url;
        map = obj;
_L9:
        if (jsonobject != null)
        {
            jsonobject.disconnect();
        }
        if (map != null)
        {
            try
            {
                map.close();
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                com.appboy.f.a.c(a, "Caught an error trying to close the inputStream in getResult", jsonobject);
            }
        }
        throw url;
_L4:
        throw new al(String.format("Bad Http response code from Appboy: [%d]", new Object[] {
            Integer.valueOf(jsonobject.getResponseCode())
        }));
        k1;
        com.appboy.f.a.d(a, String.format("Could not read from response stream [%s]", new Object[] {
            k1.getMessage()
        }));
_L8:
        if (jsonobject != null)
        {
            jsonobject.disconnect();
        }
        if (map != null)
        {
            try
            {
                map.close();
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                com.appboy.f.a.c(a, "Caught an error trying to close the inputStream in getResult", jsonobject);
            }
        }
        com.appboy.f.a.c(a, String.format("Failed to get result from [%s]. Returning null.", new Object[] {
            String.valueOf(url)
        }));
        return null;
        k1;
        com.appboy.f.a.d(a, String.format("Unable to parse response [%s]", new Object[] {
            k1
        }));
          goto _L8
        url;
          goto _L9
        url;
        jsonobject = null;
        map = obj;
          goto _L9
        map = null;
          goto _L8
_L2:
        jsonobject = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private HttpURLConnection b(URL url, JSONObject jsonobject, Map map, k k1)
    {
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = (HttpURLConnection)url.openConnection();
            httpurlconnection.setConnectTimeout(5000);
            httpurlconnection.setReadTimeout(b);
            httpurlconnection.setInstanceFollowRedirects(false);
            httpurlconnection.setRequestMethod(k1.toString());
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); httpurlconnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new al(String.format("Could not setup connection [%s] [%s].  Appboy will try to reconnect periodically.", new Object[] {
                url.toString(), jsonobject.getMessage()
            }), jsonobject);
        }
        if (k1 == k.b)
        {
            httpurlconnection.setDoOutput(true);
            map = new BufferedOutputStream(httpurlconnection.getOutputStream());
            map.write(jsonobject.toString().getBytes("UTF-8"));
            map.flush();
            map.close();
        }
        return httpurlconnection;
    }

    public final JSONObject a(URI uri, Map map)
    {
        return a(uri, null, map, a.a.k.a);
    }

    public final JSONObject a(URI uri, Map map, JSONObject jsonobject)
    {
        return a(uri, jsonobject, map, k.b);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/hb.getName()
        });
    }
}
