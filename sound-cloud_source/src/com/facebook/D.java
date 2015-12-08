// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.K;
import com.facebook.internal.U;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook:
//            p, G, C, GraphRequest, 
//            r, AccessToken

public final class D
{

    public final JSONObject a;
    public final r b;
    private final HttpURLConnection c;
    private final JSONArray d;
    private final String e;
    private final GraphRequest f;

    private D(GraphRequest graphrequest, HttpURLConnection httpurlconnection, r r1)
    {
        this(graphrequest, httpurlconnection, null, null, null, r1);
    }

    private D(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONArray jsonarray)
    {
        this(graphrequest, httpurlconnection, s, null, jsonarray, null);
    }

    private D(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject)
    {
        this(graphrequest, httpurlconnection, s, jsonobject, null, null);
    }

    private D(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject, JSONArray jsonarray, r r1)
    {
        f = graphrequest;
        c = httpurlconnection;
        e = s;
        a = jsonobject;
        d = jsonarray;
        b = r1;
    }

    static List a(HttpURLConnection httpurlconnection, C c1)
    {
        java.io.InputStream inputstream;
        Object obj1;
        java.io.InputStream inputstream1;
        Object obj2;
        Object obj3;
        java.io.InputStream inputstream2;
        String s;
        List list;
        Object obj4;
        Object obj5;
        s = null;
        list = null;
        obj4 = null;
        obj5 = null;
        inputstream = null;
        inputstream1 = inputstream;
        obj2 = s;
        obj3 = list;
        inputstream2 = obj4;
        obj1 = obj5;
        if (httpurlconnection.getResponseCode() < 400) goto _L2; else goto _L1
_L1:
        inputstream1 = inputstream;
        obj2 = s;
        obj3 = list;
        inputstream2 = obj4;
        obj1 = obj5;
        inputstream = httpurlconnection.getErrorStream();
_L4:
        inputstream1 = inputstream;
        obj2 = inputstream;
        obj3 = inputstream;
        inputstream2 = inputstream;
        obj1 = inputstream;
        s = U.a(inputstream);
        inputstream1 = inputstream;
        obj2 = inputstream;
        obj3 = inputstream;
        inputstream2 = inputstream;
        obj1 = inputstream;
        K.a(G.c, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] {
            Integer.valueOf(s.length()), s
        });
        inputstream1 = inputstream;
        obj2 = inputstream;
        obj3 = inputstream;
        inputstream2 = inputstream;
        obj1 = inputstream;
        list = a(httpurlconnection, ((List) (c1)), (new JSONTokener(s)).nextValue());
        inputstream1 = inputstream;
        obj2 = inputstream;
        obj3 = inputstream;
        inputstream2 = inputstream;
        obj1 = inputstream;
        K.a(G.a, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] {
            c1.d, Integer.valueOf(s.length()), list
        });
        U.a(inputstream);
        return list;
_L2:
        inputstream1 = inputstream;
        obj2 = s;
        obj3 = list;
        inputstream2 = obj4;
        obj1 = obj5;
        inputstream = httpurlconnection.getInputStream();
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        obj1 = inputstream1;
        K.a(G.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream1;
        httpurlconnection = a(((List) (c1)), httpurlconnection, ((p) (obj)));
        U.a(inputstream1);
        return httpurlconnection;
        obj;
        obj1 = obj2;
        K.a(G.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = obj2;
        httpurlconnection = a(((List) (c1)), httpurlconnection, new p(((Throwable) (obj))));
        U.a(((java.io.Closeable) (obj2)));
        return httpurlconnection;
        obj;
        obj1 = obj3;
        K.a(G.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = obj3;
        httpurlconnection = a(((List) (c1)), httpurlconnection, new p(((Throwable) (obj))));
        U.a(((java.io.Closeable) (obj3)));
        return httpurlconnection;
        obj;
        obj1 = inputstream2;
        K.a(G.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream2;
        httpurlconnection = a(((List) (c1)), httpurlconnection, new p(((Throwable) (obj))));
        U.a(inputstream2);
        return httpurlconnection;
        httpurlconnection;
        U.a(((java.io.Closeable) (obj1)));
        throw httpurlconnection;
    }

    private static List a(HttpURLConnection httpurlconnection, List list, Object obj)
        throws p, JSONException
    {
        ArrayList arraylist;
        int j;
        j = list.size();
        arraylist = new ArrayList(j);
        if (j != 1) goto _L2; else goto _L1
_L1:
        Object obj2 = (GraphRequest)list.get(0);
        Object obj3;
        obj3 = new JSONObject();
        ((JSONObject) (obj3)).put("body", obj);
        if (httpurlconnection == null) goto _L4; else goto _L3
_L3:
        int i = httpurlconnection.getResponseCode();
_L16:
        Object obj1;
        ((JSONObject) (obj3)).put("code", i);
        obj1 = new JSONArray();
        ((JSONArray) (obj1)).put(obj3);
_L6:
        if (!(obj1 instanceof JSONArray) || ((JSONArray)obj1).length() != j)
        {
            throw new p("Unexpected number of results");
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = 200;
        continue; /* Loop/switch isn't completed */
        obj1;
        arraylist.add(new D(((GraphRequest) (obj2)), httpurlconnection, new r(httpurlconnection, ((Exception) (obj1)))));
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
        obj1;
        arraylist.add(new D(((GraphRequest) (obj2)), httpurlconnection, new r(httpurlconnection, ((Exception) (obj1)))));
_L2:
        obj1 = obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj2 = (JSONArray)obj1;
        i = 0;
_L14:
        if (i >= ((JSONArray) (obj2)).length())
        {
            break MISSING_BLOCK_LABEL_498;
        }
        obj3 = (GraphRequest)list.get(i);
        obj1 = ((JSONArray) (obj2)).get(i);
        if (!(obj1 instanceof JSONObject)) goto _L8; else goto _L7
_L7:
        r r1;
        obj1 = (JSONObject)obj1;
        r1 = r.a(((JSONObject) (obj1)), obj, httpurlconnection);
        if (r1 == null) goto _L10; else goto _L9
_L9:
        if (r1.c == 190 && U.a(((GraphRequest) (obj3)).b))
        {
            AccessToken.a(null);
        }
        obj1 = new D(((GraphRequest) (obj3)), httpurlconnection, r1);
_L12:
        arraylist.add(obj1);
        break MISSING_BLOCK_LABEL_504;
_L10:
        obj1 = U.a(((JSONObject) (obj1)), "body", "FACEBOOK_NON_JSON_RESULT");
        if (obj1 instanceof JSONObject)
        {
            obj1 = new D(((GraphRequest) (obj3)), httpurlconnection, obj1.toString(), (JSONObject)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 instanceof JSONArray)
        {
            obj1 = new D(((GraphRequest) (obj3)), httpurlconnection, obj1.toString(), (JSONArray)obj1);
            continue; /* Loop/switch isn't completed */
        }
        obj1 = JSONObject.NULL;
_L8:
        if (obj1 != JSONObject.NULL)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = new D(((GraphRequest) (obj3)), httpurlconnection, obj1.toString(), ((JSONObject) (null)));
        if (true) goto _L12; else goto _L11
_L11:
        try
        {
            throw new p((new StringBuilder("Got unexpected object type in response, class: ")).append(obj1.getClass().getSimpleName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            arraylist.add(new D(((GraphRequest) (obj3)), httpurlconnection, new r(httpurlconnection, ((Exception) (obj1)))));
        }
        catch (p p1)
        {
            arraylist.add(new D(((GraphRequest) (obj3)), httpurlconnection, new r(httpurlconnection, p1)));
        }
        break MISSING_BLOCK_LABEL_504;
        return arraylist;
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        if (true) goto _L16; else goto _L15
_L15:
    }

    static List a(List list, HttpURLConnection httpurlconnection, p p1)
    {
        int j = list.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new D((GraphRequest)list.get(i), httpurlconnection, new r(httpurlconnection, p1)));
        }

        return arraylist;
    }

    public final String toString()
    {
        Object obj = Locale.US;
        if (c == null) goto _L2; else goto _L1
_L1:
        int i = c.getResponseCode();
_L3:
        obj = String.format(((Locale) (obj)), "%d", new Object[] {
            Integer.valueOf(i)
        });
_L4:
        return (new StringBuilder("{Response:  responseCode: ")).append(((String) (obj))).append(", graphObject: ").append(a).append(", error: ").append(b).append("}").toString();
_L2:
        i = 200;
          goto _L3
        IOException ioexception;
        ioexception;
        ioexception = "unknown";
          goto _L4
    }
}
