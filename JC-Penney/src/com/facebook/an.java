// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.b.al;
import com.facebook.b.z;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook:
//            o, GraphRequest, AccessToken, m, 
//            aq, ak

public class an
{

    private final HttpURLConnection a;
    private final JSONObject b;
    private final JSONArray c;
    private final o d;
    private final String e;
    private final GraphRequest f;

    an(GraphRequest graphrequest, HttpURLConnection httpurlconnection, o o1)
    {
        this(graphrequest, httpurlconnection, null, null, null, o1);
    }

    an(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONArray jsonarray)
    {
        this(graphrequest, httpurlconnection, s, null, jsonarray, null);
    }

    an(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject)
    {
        this(graphrequest, httpurlconnection, s, jsonobject, null, null);
    }

    an(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject, JSONArray jsonarray, o o1)
    {
        f = graphrequest;
        a = httpurlconnection;
        e = s;
        b = jsonobject;
        c = jsonarray;
        d = o1;
    }

    private static an a(GraphRequest graphrequest, HttpURLConnection httpurlconnection, Object obj, Object obj1)
    {
        Object obj2 = obj;
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            obj1 = o.a(((JSONObject) (obj)), obj1, httpurlconnection);
            if (obj1 != null)
            {
                if (((o) (obj1)).b() == 190 && al.a(graphrequest.d()))
                {
                    AccessToken.a(null);
                }
                return new an(graphrequest, httpurlconnection, ((o) (obj1)));
            }
            obj = al.a(((JSONObject) (obj)), "body", "FACEBOOK_NON_JSON_RESULT");
            if (obj instanceof JSONObject)
            {
                return new an(graphrequest, httpurlconnection, obj.toString(), (JSONObject)obj);
            }
            if (obj instanceof JSONArray)
            {
                return new an(graphrequest, httpurlconnection, obj.toString(), (JSONArray)obj);
            }
            obj2 = JSONObject.NULL;
        }
        if (obj2 == JSONObject.NULL)
        {
            return new an(graphrequest, httpurlconnection, obj2.toString(), (JSONObject)null);
        } else
        {
            throw new m((new StringBuilder()).append("Got unexpected object type in response, class: ").append(obj2.getClass().getSimpleName()).toString());
        }
    }

    static List a(InputStream inputstream, HttpURLConnection httpurlconnection, ak ak1)
    {
        inputstream = al.a(inputstream);
        z.a(aq.c, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] {
            Integer.valueOf(inputstream.length()), inputstream
        });
        return a(((String) (inputstream)), httpurlconnection, ak1);
    }

    static List a(String s, HttpURLConnection httpurlconnection, ak ak1)
    {
        httpurlconnection = a(httpurlconnection, ((List) (ak1)), (new JSONTokener(s)).nextValue());
        z.a(aq.a, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] {
            ak1.b(), Integer.valueOf(s.length()), httpurlconnection
        });
        return httpurlconnection;
    }

    static List a(HttpURLConnection httpurlconnection, ak ak1)
    {
        InputStream inputstream;
        Object obj1;
        InputStream inputstream1;
        Object obj2;
        InputStream inputstream2;
        InputStream inputstream3;
        List list;
        Object obj3;
        Object obj4;
        Object obj5;
        list = null;
        obj3 = null;
        obj4 = null;
        obj5 = null;
        inputstream = null;
        inputstream1 = inputstream;
        obj2 = list;
        inputstream2 = obj3;
        inputstream3 = obj4;
        obj1 = obj5;
        if (httpurlconnection.getResponseCode() < 400) goto _L2; else goto _L1
_L1:
        inputstream1 = inputstream;
        obj2 = list;
        inputstream2 = obj3;
        inputstream3 = obj4;
        obj1 = obj5;
        inputstream = httpurlconnection.getErrorStream();
_L4:
        inputstream1 = inputstream;
        obj2 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        obj1 = inputstream;
        list = a(inputstream, httpurlconnection, ak1);
        al.a(inputstream);
        return list;
_L2:
        inputstream1 = inputstream;
        obj2 = list;
        inputstream2 = obj3;
        inputstream3 = obj4;
        obj1 = obj5;
        inputstream = httpurlconnection.getInputStream();
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        obj1 = inputstream1;
        z.a(aq.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream1;
        httpurlconnection = a(((List) (ak1)), httpurlconnection, ((m) (obj)));
        al.a(inputstream1);
        return httpurlconnection;
        obj;
        obj1 = obj2;
        z.a(aq.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = obj2;
        httpurlconnection = a(((List) (ak1)), httpurlconnection, new m(((Throwable) (obj))));
        al.a(((java.io.Closeable) (obj2)));
        return httpurlconnection;
        obj;
        obj1 = inputstream2;
        z.a(aq.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream2;
        httpurlconnection = a(((List) (ak1)), httpurlconnection, new m(((Throwable) (obj))));
        al.a(inputstream2);
        return httpurlconnection;
        obj;
        obj1 = inputstream3;
        z.a(aq.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream3;
        httpurlconnection = a(((List) (ak1)), httpurlconnection, new m(((Throwable) (obj))));
        al.a(inputstream3);
        return httpurlconnection;
        httpurlconnection;
        al.a(((java.io.Closeable) (obj1)));
        throw httpurlconnection;
    }

    private static List a(HttpURLConnection httpurlconnection, List list, Object obj)
    {
        ArrayList arraylist;
        boolean flag;
        int k;
        flag = false;
        k = list.size();
        arraylist = new ArrayList(k);
        if (k != 1) goto _L2; else goto _L1
_L1:
        GraphRequest graphrequest = (GraphRequest)list.get(0);
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("body", obj);
        if (httpurlconnection == null) goto _L4; else goto _L3
_L3:
        int i = httpurlconnection.getResponseCode();
_L5:
        Object obj1;
        jsonobject.put("code", i);
        obj1 = new JSONArray();
        ((JSONArray) (obj1)).put(jsonobject);
_L6:
        if (!(obj1 instanceof JSONArray) || ((JSONArray)obj1).length() != k)
        {
            throw new m("Unexpected number of results");
        }
        break MISSING_BLOCK_LABEL_196;
_L4:
        i = 200;
          goto _L5
        obj1;
        arraylist.add(new an(graphrequest, httpurlconnection, new o(httpurlconnection, ((Exception) (obj1)))));
        obj1 = obj;
          goto _L6
        obj1;
        arraylist.add(new an(graphrequest, httpurlconnection, new o(httpurlconnection, ((Exception) (obj1)))));
_L2:
        obj1 = obj;
          goto _L6
        obj1 = (JSONArray)obj1;
        int j = ((flag) ? 1 : 0);
        while (j < ((JSONArray) (obj1)).length()) 
        {
            GraphRequest graphrequest1 = (GraphRequest)list.get(j);
            try
            {
                arraylist.add(a(graphrequest1, httpurlconnection, ((JSONArray) (obj1)).get(j), obj));
            }
            catch (JSONException jsonexception)
            {
                arraylist.add(new an(graphrequest1, httpurlconnection, new o(httpurlconnection, jsonexception)));
            }
            catch (m m1)
            {
                arraylist.add(new an(graphrequest1, httpurlconnection, new o(httpurlconnection, m1)));
            }
            j++;
        }
        return arraylist;
          goto _L5
    }

    static List a(List list, HttpURLConnection httpurlconnection, m m1)
    {
        int j = list.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new an((GraphRequest)list.get(i), httpurlconnection, new o(httpurlconnection, m1)));
        }

        return arraylist;
    }

    public final o a()
    {
        return d;
    }

    public final JSONObject b()
    {
        return b;
    }

    public String toString()
    {
        Object obj = Locale.US;
        if (a == null) goto _L2; else goto _L1
_L1:
        int i = a.getResponseCode();
_L3:
        obj = String.format(((Locale) (obj)), "%d", new Object[] {
            Integer.valueOf(i)
        });
_L4:
        return (new StringBuilder()).append("{Response: ").append(" responseCode: ").append(((String) (obj))).append(", graphObject: ").append(b).append(", error: ").append(d).append("}").toString();
_L2:
        i = 200;
          goto _L3
        IOException ioexception;
        ioexception;
        ioexception = "unknown";
          goto _L4
    }
}
