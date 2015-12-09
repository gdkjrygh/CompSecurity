// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.ak;
import com.facebook.internal.aw;
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
//            am, ag, l, GraphRequest, 
//            n, AccessToken

public final class aj
{

    private final HttpURLConnection a;
    private final JSONObject b;
    private final JSONArray c;
    private final n d;
    private final String e;
    private final GraphRequest f;

    aj(GraphRequest graphrequest, HttpURLConnection httpurlconnection, n n1)
    {
        this(graphrequest, httpurlconnection, null, null, null, n1);
    }

    private aj(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONArray jsonarray)
    {
        this(graphrequest, httpurlconnection, s, null, jsonarray, null);
    }

    aj(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject)
    {
        this(graphrequest, httpurlconnection, s, jsonobject, null, null);
    }

    private aj(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject, JSONArray jsonarray, n n1)
    {
        f = graphrequest;
        a = httpurlconnection;
        e = s;
        b = jsonobject;
        c = jsonarray;
        d = n1;
    }

    static List a(String s, HttpURLConnection httpurlconnection, ag ag1)
    {
        httpurlconnection = a(httpurlconnection, ((List) (ag1)), (new JSONTokener(s)).nextValue());
        ak.a(am.a, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] {
            ag1.b(), Integer.valueOf(s.length()), httpurlconnection
        });
        return httpurlconnection;
    }

    static List a(HttpURLConnection httpurlconnection, ag ag1)
    {
        java.io.InputStream inputstream;
        Object obj1;
        java.io.InputStream inputstream1;
        Object obj2;
        java.io.InputStream inputstream2;
        java.io.InputStream inputstream3;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj3 = null;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        inputstream = null;
        inputstream1 = inputstream;
        obj2 = obj3;
        inputstream2 = obj4;
        inputstream3 = obj5;
        obj1 = obj6;
        if (httpurlconnection.getResponseCode() < 400) goto _L2; else goto _L1
_L1:
        inputstream1 = inputstream;
        obj2 = obj3;
        inputstream2 = obj4;
        inputstream3 = obj5;
        obj1 = obj6;
        inputstream = httpurlconnection.getErrorStream();
_L4:
        inputstream1 = inputstream;
        obj2 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        obj1 = inputstream;
        obj3 = aw.a(inputstream);
        inputstream1 = inputstream;
        obj2 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        obj1 = inputstream;
        ak.a(am.c, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] {
            Integer.valueOf(((String) (obj3)).length()), obj3
        });
        inputstream1 = inputstream;
        obj2 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        obj1 = inputstream;
        obj3 = a(((String) (obj3)), httpurlconnection, ag1);
        aw.a(inputstream);
        return ((List) (obj3));
_L2:
        inputstream1 = inputstream;
        obj2 = obj3;
        inputstream2 = obj4;
        inputstream3 = obj5;
        obj1 = obj6;
        inputstream = httpurlconnection.getInputStream();
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        obj1 = inputstream1;
        ak.a(am.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream1;
        httpurlconnection = a(((List) (ag1)), httpurlconnection, ((l) (obj)));
        aw.a(inputstream1);
        return httpurlconnection;
        obj;
        obj1 = obj2;
        ak.a(am.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = obj2;
        httpurlconnection = a(((List) (ag1)), httpurlconnection, new l(((Throwable) (obj))));
        aw.a(((java.io.Closeable) (obj2)));
        return httpurlconnection;
        obj;
        obj1 = inputstream2;
        ak.a(am.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream2;
        httpurlconnection = a(((List) (ag1)), httpurlconnection, new l(((Throwable) (obj))));
        aw.a(inputstream2);
        return httpurlconnection;
        obj;
        obj1 = inputstream3;
        ak.a(am.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream3;
        httpurlconnection = a(((List) (ag1)), httpurlconnection, new l(((Throwable) (obj))));
        aw.a(inputstream3);
        return httpurlconnection;
        httpurlconnection;
        aw.a(((java.io.Closeable) (obj1)));
        throw httpurlconnection;
    }

    private static List a(HttpURLConnection httpurlconnection, List list, Object obj)
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
            throw new l("Unexpected number of results");
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = 200;
        continue; /* Loop/switch isn't completed */
        obj1;
        arraylist.add(new aj(((GraphRequest) (obj2)), httpurlconnection, new n(httpurlconnection, ((Exception) (obj1)))));
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
        obj1;
        arraylist.add(new aj(((GraphRequest) (obj2)), httpurlconnection, new n(httpurlconnection, ((Exception) (obj1)))));
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
        n n1;
        obj1 = (JSONObject)obj1;
        n1 = n.a(((JSONObject) (obj1)), obj, httpurlconnection);
        if (n1 == null) goto _L10; else goto _L9
_L9:
        if (n1.b() == 190 && aw.a(((GraphRequest) (obj3)).d()))
        {
            AccessToken.a(null);
        }
        obj1 = new aj(((GraphRequest) (obj3)), httpurlconnection, n1);
_L12:
        arraylist.add(obj1);
        break MISSING_BLOCK_LABEL_504;
_L10:
        obj1 = aw.a(((JSONObject) (obj1)), "body", "FACEBOOK_NON_JSON_RESULT");
        if (obj1 instanceof JSONObject)
        {
            obj1 = new aj(((GraphRequest) (obj3)), httpurlconnection, obj1.toString(), (JSONObject)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 instanceof JSONArray)
        {
            obj1 = new aj(((GraphRequest) (obj3)), httpurlconnection, obj1.toString(), (JSONArray)obj1);
            continue; /* Loop/switch isn't completed */
        }
        obj1 = JSONObject.NULL;
_L8:
        if (obj1 != JSONObject.NULL)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = new aj(((GraphRequest) (obj3)), httpurlconnection, obj1.toString(), ((JSONObject) (null)));
        if (true) goto _L12; else goto _L11
_L11:
        try
        {
            throw new l((new StringBuilder("Got unexpected object type in response, class: ")).append(obj1.getClass().getSimpleName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            arraylist.add(new aj(((GraphRequest) (obj3)), httpurlconnection, new n(httpurlconnection, ((Exception) (obj1)))));
        }
        catch (l l1)
        {
            arraylist.add(new aj(((GraphRequest) (obj3)), httpurlconnection, new n(httpurlconnection, l1)));
        }
        break MISSING_BLOCK_LABEL_504;
        return arraylist;
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        if (true) goto _L16; else goto _L15
_L15:
    }

    static List a(List list, HttpURLConnection httpurlconnection, l l1)
    {
        int j = list.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new aj((GraphRequest)list.get(i), httpurlconnection, new n(httpurlconnection, l1)));
        }

        return arraylist;
    }

    public final n a()
    {
        return d;
    }

    public final JSONObject b()
    {
        return b;
    }

    public final String toString()
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
        return (new StringBuilder("{Response:  responseCode: ")).append(((String) (obj))).append(", graphObject: ").append(b).append(", error: ").append(d).append("}").toString();
_L2:
        i = 200;
          goto _L3
        IOException ioexception;
        ioexception;
        ioexception = "unknown";
          goto _L4
    }
}
