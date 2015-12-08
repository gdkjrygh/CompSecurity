// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import com.umeng.common.Log;
import com.umeng.common.b.f;
import com.umeng.common.b.g;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.umeng.common.net:
//            s, t

public class r
{

    private static final String a = com/umeng/common/net/r.getName();
    private Map b;

    public r()
    {
    }

    private static String a(InputStream inputstream)
    {
        BufferedReader bufferedreader;
        StringBuilder stringbuilder;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream), 8192);
        stringbuilder = new StringBuilder();
_L1:
        String s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            Object obj;
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                Log.b(a, "Caught IOException in convertStreamToString()", inputstream);
                return null;
            }
            return stringbuilder.toString();
        }
        stringbuilder.append((new StringBuilder(String.valueOf(s1))).append("\n").toString());
          goto _L1
        obj;
        Log.b(a, "Caught IOException in convertStreamToString()", ((Exception) (obj)));
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.b(a, "Caught IOException in convertStreamToString()", inputstream);
            return null;
        }
        return null;
        obj;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.b(a, "Caught IOException in convertStreamToString()", inputstream);
            return null;
        }
        throw obj;
    }

    private JSONObject a(String s1)
    {
        int i = (new Random()).nextInt(1000);
        String s2;
        s2 = System.getProperty("line.separator");
        if (s1.length() > 1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        Log.b(a, (new StringBuilder(String.valueOf(i))).append(":\tInvalid baseUrl.").toString());
        return null;
        Object obj;
        Log.a(a, (new StringBuilder(String.valueOf(i))).append(":\tget: ").append(s1).toString());
        obj = new HttpGet(s1);
        if (b == null || b.size() <= 0) goto _L2; else goto _L1
_L1:
        Object obj1 = b.keySet().iterator();
_L16:
        if (((Iterator) (obj1)).hasNext()) goto _L3; else goto _L2
_L2:
        obj1 = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj1)), 10000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj1)), 20000);
        obj1 = (new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj1)))).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        if (((HttpResponse) (obj1)).getStatusLine().getStatusCode() != 200) goto _L5; else goto _L4
_L4:
        obj = ((HttpResponse) (obj1)).getEntity();
        if (obj == null) goto _L7; else goto _L6
_L6:
        try
        {
            obj = ((HttpEntity) (obj)).getContent();
            obj1 = ((HttpResponse) (obj1)).getFirstHeader("Content-Encoding");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.c(a, (new StringBuilder(String.valueOf(i))).append(":\tClientProtocolException,Failed to send message.").append(s1).toString(), ((Exception) (obj)));
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.c(a, (new StringBuilder(String.valueOf(i))).append(":\tIOException,Failed to send message.").append(s1).toString(), ((Exception) (obj)));
            return null;
        }
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        if (!((Header) (obj1)).getValue().equalsIgnoreCase("gzip")) goto _L9; else goto _L10
_L10:
        Log.a(a, (new StringBuilder(String.valueOf(i))).append("  Use GZIPInputStream get data....").toString());
        obj = new GZIPInputStream(((InputStream) (obj)));
_L13:
        obj = a(((InputStream) (obj)));
        Log.a(a, (new StringBuilder(String.valueOf(i))).append(":\tresponse: ").append(s2).append(((String) (obj))).toString());
        if (obj == null)
        {
            return null;
        }
          goto _L11
_L3:
        String s3 = (String)((Iterator) (obj1)).next();
        ((HttpGet) (obj)).addHeader(s3, (String)b.get(s3));
        continue; /* Loop/switch isn't completed */
_L9:
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        if (!((Header) (obj1)).getValue().equalsIgnoreCase("deflate")) goto _L13; else goto _L14
_L14:
        Log.a(a, (new StringBuilder(String.valueOf(i))).append("  Use InflaterInputStream get data....").toString());
        obj = new InflaterInputStream(((InputStream) (obj)));
          goto _L13
_L11:
        return new JSONObject(((String) (obj)));
_L5:
        Log.c(a, (new StringBuilder(String.valueOf(i))).append(":\tFailed to send message. StatusCode = ").append(((HttpResponse) (obj1)).getStatusLine().getStatusCode()).append(g.a).append(s1).toString());
_L7:
        return null;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private JSONObject a(String s1, JSONObject jsonobject)
    {
        Object obj;
        Object obj1;
        int i;
        obj = jsonobject.toString();
        i = (new Random()).nextInt(1000);
        Log.c(a, (new StringBuilder(String.valueOf(i))).append(":\trequest: ").append(s1).append(g.a).append(((String) (obj))).toString());
        jsonobject = new HttpPost(s1);
        obj1 = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj1)), 10000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj1)), 20000);
        obj1 = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj1)));
        if (!a())
        {
            break MISSING_BLOCK_LABEL_295;
        }
        obj = f.a((new StringBuilder("content=")).append(((String) (obj))).toString(), Charset.defaultCharset().toString());
        jsonobject.addHeader("Content-Encoding", "deflate");
        jsonobject.setEntity(new InputStreamEntity(new ByteArrayInputStream(((byte []) (obj))), obj.length));
_L1:
        obj = ((HttpClient) (obj1)).execute(jsonobject);
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() != 200)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        jsonobject = ((HttpResponse) (obj)).getEntity();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        ArrayList arraylist;
        try
        {
            jsonobject = jsonobject.getContent();
            obj = ((HttpResponse) (obj)).getFirstHeader("Content-Encoding");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.c(a, (new StringBuilder(String.valueOf(i))).append(":\tClientProtocolException,Failed to send message.").append(s1).toString(), jsonobject);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.c(a, (new StringBuilder(String.valueOf(i))).append(":\tIOException,Failed to send message.").append(s1).toString(), jsonobject);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.c(a, (new StringBuilder(String.valueOf(i))).append(":\tIOException,Failed to send message.").append(s1).toString(), jsonobject);
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        if (((Header) (obj)).getValue().equalsIgnoreCase("deflate"))
        {
            jsonobject = new InflaterInputStream(jsonobject);
        }
        jsonobject = a(((InputStream) (jsonobject)));
        Log.a(a, (new StringBuilder(String.valueOf(i))).append(":\tresponse: ").append(g.a).append(jsonobject).toString());
        if (jsonobject == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_377;
        arraylist = new ArrayList(1);
        arraylist.add(new BasicNameValuePair("content", ((String) (obj))));
        jsonobject.setEntity(new UrlEncodedFormEntity(arraylist, "UTF-8"));
          goto _L1
        return new JSONObject(jsonobject);
        Log.c(a, (new StringBuilder(String.valueOf(i))).append(":\tFailed to send message. StatusCode = ").append(((HttpResponse) (obj)).getStatusLine().getStatusCode()).append(g.a).append(s1).toString());
        return null;
        return null;
    }

    private void b(String s1)
    {
        if (g.c(s1) || !(s.b.equals(s1.trim()) ^ s.a.equals(s1.trim())))
        {
            throw new RuntimeException((new StringBuilder("\u9A8C\u8BC1\u8BF7\u6C42\u65B9\u5F0F\u5931\u8D25[")).append(s1).append("]").toString());
        } else
        {
            return;
        }
    }

    public r a(Map map)
    {
        b = map;
        return this;
    }

    public t a(s s1, Class class1)
    {
        String s2 = s1.c().trim();
        b(s2);
        if (s.b.equals(s2))
        {
            s1 = a(s1.b());
        } else
        if (s.a.equals(s2))
        {
            s1 = a(s1.c, s1.a());
        } else
        {
            s1 = null;
        }
        if (s1 == null)
        {
            return null;
        }
        s1 = (t)class1.getConstructor(new Class[] {
            org/json/JSONObject
        }).newInstance(new Object[] {
            s1
        });
        return s1;
        s1;
        Log.b(a, "SecurityException", s1);
_L2:
        return null;
        s1;
        Log.b(a, "NoSuchMethodException", s1);
        continue; /* Loop/switch isn't completed */
        s1;
        Log.b(a, "IllegalArgumentException", s1);
        continue; /* Loop/switch isn't completed */
        s1;
        Log.b(a, "InstantiationException", s1);
        continue; /* Loop/switch isn't completed */
        s1;
        Log.b(a, "IllegalAccessException", s1);
        continue; /* Loop/switch isn't completed */
        s1;
        Log.b(a, "InvocationTargetException", s1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean a()
    {
        return false;
    }

}
