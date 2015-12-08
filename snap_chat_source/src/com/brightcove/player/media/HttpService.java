// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.StringUtil;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class HttpService
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/brightcove/player/media/HttpService$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("GET", 0);
            b = new a("POST", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int DEFAULT_CONNECT_TIMEOUT = 10000;
    public static final int DEFAULT_READ_TIMEOUT = 10000;
    public static final String TAG = com/brightcove/player/media/HttpService.getSimpleName();
    private int a;
    private int b;

    public HttpService()
    {
        a = 10000;
        b = 10000;
    }

    public HttpService(int i, int j)
    {
        a = 10000;
        b = 10000;
        a = i;
        b = j;
    }

    private static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        boolean flag;
        int i1;
        int j1;
        int k1;
        k1 = options.outHeight;
        j1 = options.outWidth;
        i1 = 1;
        flag = true;
        (new StringBuilder("calculateInSampleSize: height = ")).append(k1).append(", width = ").append(j1).append(", maxWidth = ").append(i).append(", maxHeight = ").append(j);
        if (j1 * j <= i * k1) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        l = (i * k1) / j1;
        k = i;
_L4:
        (new StringBuilder("calculateInSampleSize: maxWidth = ")).append(k).append(", maxHeight = ").append(l);
        if (k1 <= l)
        {
            j = i1;
            if (j1 <= k)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        i1 = k1 / 2;
        j1 /= 2;
        i = ((flag) ? 1 : 0);
        do
        {
            j = i;
            if (i1 / i <= l)
            {
                break;
            }
            j = i;
            if (j1 / i <= k)
            {
                break;
            }
            i <<= 1;
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        k = i;
        l = j;
        if (j1 * j < i * k1)
        {
            k = (j * j1) / k1;
            l = j;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return j;
    }

    private Bitmap a(URL url, int i, int j)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        Object obj = url.openConnection();
        ((URLConnection) (obj)).setConnectTimeout(a);
        ((URLConnection) (obj)).setReadTimeout(b);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(((URLConnection) (obj)).getInputStream(), null, options);
        options.inSampleSize = a(options, i, j);
        if (obj != null && (obj instanceof HttpURLConnection))
        {
            ((HttpURLConnection)obj).disconnect();
        }
        (new StringBuilder("decodeSampledBitmap: total memory = ")).append(Runtime.getRuntime().totalMemory());
        url = url.openConnection();
        url.setConnectTimeout(a);
        url.setReadTimeout(b);
        options.inJustDecodeBounds = false;
        obj = BitmapFactory.decodeStream(url.getInputStream(), null, options);
        if (url != null && (url instanceof HttpURLConnection))
        {
            ((HttpURLConnection)url).disconnect();
        }
        (new StringBuilder("decodeSampledBitmap: total memory = ")).append(Runtime.getRuntime().totalMemory());
        return ((Bitmap) (obj));
        obj;
        url = null;
_L4:
        if (url != null && (url instanceof HttpURLConnection))
        {
            ((HttpURLConnection)url).disconnect();
        }
        throw obj;
        Exception exception;
        exception;
        url = ((URL) (obj));
_L2:
        if (url != null && (url instanceof HttpURLConnection))
        {
            ((HttpURLConnection)url).disconnect();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        url = ((URL) (obj));
        obj = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String a(a a1, URI uri, Map map)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("uriRequired"));
        }
        if (map == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("headersRequired"));
        }
        uri = uri.toURL();
        (new StringBuilder("issuing ")).append(a1).append(" request: ").append(uri.toString()).append(", headers: ").append(map);
        uri = uri.openConnection();
        uri.setConnectTimeout(a);
        uri.setReadTimeout(b);
        if (uri instanceof HttpURLConnection)
        {
            HttpURLConnection httpurlconnection = (HttpURLConnection)uri;
            if (a1.equals(a.b))
            {
                httpurlconnection.setRequestMethod("POST");
            }
            a1 = map.entrySet().iterator();
            do
            {
                if (!a1.hasNext())
                {
                    break;
                }
                map = (java.util.Map.Entry)a1.next();
                if (!StringUtil.isEmpty((String)map.getKey()) && !StringUtil.isEmpty((String)map.getValue()))
                {
                    httpurlconnection.setRequestProperty((String)map.getKey(), (String)map.getValue());
                }
            } while (true);
        }
          goto _L1
        map;
        a1 = uri;
        uri = map;
_L3:
        if (a1 != null && (a1 instanceof HttpURLConnection))
        {
            ((HttpURLConnection)a1).disconnect();
        }
        throw uri;
_L1:
        a1 = inputStreamToString(uri.getInputStream());
        if (uri instanceof HttpURLConnection)
        {
            map = (HttpURLConnection)uri;
            (new StringBuilder("code: ")).append(map.getResponseCode());
            (new StringBuilder("message: ")).append(map.getResponseMessage());
        }
        if (uri != null && (uri instanceof HttpURLConnection))
        {
            ((HttpURLConnection)uri).disconnect();
        }
        return a1;
        uri;
        a1 = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private JSONObject b(a a1, URI uri, Map map)
    {
        a1 = a(a1, uri, map);
        if (a1 != null && !a1.trim().isEmpty() && !a1.equals("null"))
        {
            return parseToJSONObject(a1);
        } else
        {
            return null;
        }
    }

    public static URI buildURIWithQueryParameters(String s, Map map)
    {
        if (s == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("baseURLRequired"));
        }
        StringBuilder stringbuilder = new StringBuilder(s);
        if (map == null || map.size() == 0)
        {
            return new URI(stringbuilder.toString());
        }
        if (s.contains("?"))
        {
            stringbuilder.append("&");
        } else
        {
            stringbuilder.append("?");
        }
        s = map.entrySet().iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            map = (java.util.Map.Entry)s.next();
            if (map != null && map.getKey() != null && map.getValue() != null)
            {
                stringbuilder.append(URLEncoder.encode((String)map.getKey(), "UTF-8"));
                stringbuilder.append("=");
                stringbuilder.append(URLEncoder.encode(map.getValue().toString(), "UTF-8"));
                if (s.hasNext())
                {
                    stringbuilder.append("&");
                }
            }
        } while (true);
        return new URI(stringbuilder.toString());
    }

    public static String inputStreamToString(InputStream inputstream)
    {
        return readerToString(new InputStreamReader(inputstream));
    }

    public static JSONObject parseToJSONObject(String s)
    {
        if (s == null || s.trim().isEmpty())
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("jsonRequired"));
        }
        s = ((String) ((new JSONTokener(s)).nextValue()));
        if (s instanceof JSONObject)
        {
            return (JSONObject)s;
        }
        if (s instanceof JSONArray)
        {
            throw new JSONException(ErrorUtil.getMessage("jsonArray"));
        } else
        {
            throw new JSONException(String.format(ErrorUtil.getMessage("unexpectedType"), new Object[] {
                s.getClass().getName()
            }));
        }
    }

    public static String readerToString(Reader reader)
    {
        Object obj;
        obj = new StringBuilder();
        reader = new BufferedReader(reader);
_L1:
        String s = reader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        ((StringBuilder) (obj)).append(s);
          goto _L1
        obj;
        reader.close();
        throw obj;
        reader.close();
        return ((StringBuilder) (obj)).toString();
    }

    public String doGetRequest(URI uri)
    {
        return doGetRequest(uri, ((Map) (new HashMap())));
    }

    public String doGetRequest(URI uri, Map map)
    {
        return a(a.a, uri, map);
    }

    public Bitmap doImageGetRequest(URI uri)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("uriRequired"));
        }
        uri = uri.toURL();
        (new StringBuilder("issuing GET request: ")).append(uri.toString());
        uri = uri.openConnection();
        Bitmap bitmap;
        uri.setConnectTimeout(a);
        uri.setReadTimeout(b);
        bitmap = BitmapFactory.decodeStream(uri.getInputStream());
        if (uri != null && (uri instanceof HttpURLConnection))
        {
            ((HttpURLConnection)uri).disconnect();
        }
        (new StringBuilder("doImageGetRequest: total memory = ")).append(Runtime.getRuntime().totalMemory());
        return bitmap;
        Exception exception;
        exception;
        uri = null;
_L2:
        if (uri != null && (uri instanceof HttpURLConnection))
        {
            ((HttpURLConnection)uri).disconnect();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Bitmap doImageGetRequest(URI uri, int i, int j)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("uriRequired"));
        } else
        {
            return a(uri.toURL(), i, j);
        }
    }

    public JSONObject doJSONGetRequest(URI uri)
    {
        return doJSONGetRequest(uri, ((Map) (new HashMap())));
    }

    public JSONObject doJSONGetRequest(URI uri, Map map)
    {
        return b(a.a, uri, map);
    }

    public JSONObject doJSONPostRequest(URI uri)
    {
        return doJSONPostRequest(uri, ((Map) (new HashMap())));
    }

    public JSONObject doJSONPostRequest(URI uri, Map map)
    {
        return b(a.b, uri, map);
    }

    public String doPostRequest(URI uri)
    {
        return doPostRequest(uri, ((Map) (new HashMap())));
    }

    public String doPostRequest(URI uri, Map map)
    {
        return a(a.b, uri, map);
    }

    public int getConnectTimeout()
    {
        return a;
    }

    public int getReadTimeout()
    {
        return b;
    }

}
