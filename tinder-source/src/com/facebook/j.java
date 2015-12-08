// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.h;
import com.facebook.internal.m;
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
//            FacebookException, LoggingBehavior, i, GraphRequest, 
//            FacebookRequestError, AccessToken

public final class j
{

    public final JSONObject a;
    public final FacebookRequestError b;
    private final HttpURLConnection c;
    private final JSONArray d;
    private final String e;
    private final GraphRequest f;

    j(GraphRequest graphrequest, HttpURLConnection httpurlconnection, FacebookRequestError facebookrequesterror)
    {
        this(graphrequest, httpurlconnection, null, null, null, facebookrequesterror);
    }

    private j(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONArray jsonarray)
    {
        this(graphrequest, httpurlconnection, s, null, jsonarray, null);
    }

    j(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject)
    {
        this(graphrequest, httpurlconnection, s, jsonobject, null, null);
    }

    private j(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject, JSONArray jsonarray, FacebookRequestError facebookrequesterror)
    {
        f = graphrequest;
        c = httpurlconnection;
        e = s;
        a = jsonobject;
        d = jsonarray;
        b = facebookrequesterror;
    }

    static List a(String s, HttpURLConnection httpurlconnection, i k)
        throws FacebookException, JSONException, IOException
    {
        httpurlconnection = a(httpurlconnection, ((List) (k)), (new JSONTokener(s)).nextValue());
        h.a(LoggingBehavior.a, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] {
            k.d, Integer.valueOf(s.length()), httpurlconnection
        });
        return httpurlconnection;
    }

    static List a(HttpURLConnection httpurlconnection, i k)
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
        obj3 = m.a(inputstream);
        inputstream1 = inputstream;
        obj2 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        obj1 = inputstream;
        h.a(LoggingBehavior.c, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] {
            Integer.valueOf(((String) (obj3)).length()), obj3
        });
        inputstream1 = inputstream;
        obj2 = inputstream;
        inputstream2 = inputstream;
        inputstream3 = inputstream;
        obj1 = inputstream;
        obj3 = a(((String) (obj3)), httpurlconnection, k);
        m.a(inputstream);
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
        h.a(LoggingBehavior.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream1;
        httpurlconnection = a(((List) (k)), httpurlconnection, ((FacebookException) (obj)));
        m.a(inputstream1);
        return httpurlconnection;
        obj;
        obj1 = obj2;
        h.a(LoggingBehavior.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = obj2;
        httpurlconnection = a(((List) (k)), httpurlconnection, new FacebookException(((Throwable) (obj))));
        m.a(((java.io.Closeable) (obj2)));
        return httpurlconnection;
        obj;
        obj1 = inputstream2;
        h.a(LoggingBehavior.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream2;
        httpurlconnection = a(((List) (k)), httpurlconnection, new FacebookException(((Throwable) (obj))));
        m.a(inputstream2);
        return httpurlconnection;
        obj;
        obj1 = inputstream3;
        h.a(LoggingBehavior.a, "Response", "Response <Error>: %s", new Object[] {
            obj
        });
        obj1 = inputstream3;
        httpurlconnection = a(((List) (k)), httpurlconnection, new FacebookException(((Throwable) (obj))));
        m.a(inputstream3);
        return httpurlconnection;
        httpurlconnection;
        m.a(((java.io.Closeable) (obj1)));
        throw httpurlconnection;
    }

    private static List a(HttpURLConnection httpurlconnection, List list, Object obj)
        throws FacebookException, JSONException
    {
        ArrayList arraylist;
        int l;
        l = list.size();
        arraylist = new ArrayList(l);
        if (l != 1) goto _L2; else goto _L1
_L1:
        Object obj2 = (GraphRequest)list.get(0);
        Object obj3;
        obj3 = new JSONObject();
        ((JSONObject) (obj3)).put("body", obj);
        if (httpurlconnection == null) goto _L4; else goto _L3
_L3:
        int k = httpurlconnection.getResponseCode();
_L16:
        Object obj1;
        ((JSONObject) (obj3)).put("code", k);
        obj1 = new JSONArray();
        ((JSONArray) (obj1)).put(obj3);
_L6:
        if (!(obj1 instanceof JSONArray) || ((JSONArray)obj1).length() != l)
        {
            throw new FacebookException("Unexpected number of results");
        }
        break; /* Loop/switch isn't completed */
_L4:
        k = 200;
        continue; /* Loop/switch isn't completed */
        obj1;
        arraylist.add(new j(((GraphRequest) (obj2)), httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (obj1)))));
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
        obj1;
        arraylist.add(new j(((GraphRequest) (obj2)), httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (obj1)))));
_L2:
        obj1 = obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj2 = (JSONArray)obj1;
        k = 0;
_L14:
        if (k >= ((JSONArray) (obj2)).length())
        {
            break MISSING_BLOCK_LABEL_498;
        }
        obj3 = (GraphRequest)list.get(k);
        obj1 = ((JSONArray) (obj2)).get(k);
        if (!(obj1 instanceof JSONObject)) goto _L8; else goto _L7
_L7:
        FacebookRequestError facebookrequesterror;
        obj1 = (JSONObject)obj1;
        facebookrequesterror = FacebookRequestError.a(((JSONObject) (obj1)), obj, httpurlconnection);
        if (facebookrequesterror == null) goto _L10; else goto _L9
_L9:
        if (facebookrequesterror.c == 190 && m.a(((GraphRequest) (obj3)).b))
        {
            AccessToken.a(null);
        }
        obj1 = new j(((GraphRequest) (obj3)), httpurlconnection, facebookrequesterror);
_L12:
        arraylist.add(obj1);
        break MISSING_BLOCK_LABEL_504;
_L10:
        obj1 = m.a(((JSONObject) (obj1)), "body", "FACEBOOK_NON_JSON_RESULT");
        if (obj1 instanceof JSONObject)
        {
            obj1 = new j(((GraphRequest) (obj3)), httpurlconnection, obj1.toString(), (JSONObject)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 instanceof JSONArray)
        {
            obj1 = new j(((GraphRequest) (obj3)), httpurlconnection, obj1.toString(), (JSONArray)obj1);
            continue; /* Loop/switch isn't completed */
        }
        obj1 = JSONObject.NULL;
_L8:
        if (obj1 != JSONObject.NULL)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = new j(((GraphRequest) (obj3)), httpurlconnection, obj1.toString(), ((JSONObject) (null)));
        if (true) goto _L12; else goto _L11
_L11:
        try
        {
            throw new FacebookException((new StringBuilder("Got unexpected object type in response, class: ")).append(obj1.getClass().getSimpleName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            arraylist.add(new j(((GraphRequest) (obj3)), httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (obj1)))));
        }
        catch (FacebookException facebookexception)
        {
            arraylist.add(new j(((GraphRequest) (obj3)), httpurlconnection, new FacebookRequestError(httpurlconnection, facebookexception)));
        }
        break MISSING_BLOCK_LABEL_504;
        return arraylist;
        k++;
        if (true) goto _L14; else goto _L13
_L13:
        if (true) goto _L16; else goto _L15
_L15:
    }

    static List a(List list, HttpURLConnection httpurlconnection, FacebookException facebookexception)
    {
        int l = list.size();
        ArrayList arraylist = new ArrayList(l);
        for (int k = 0; k < l; k++)
        {
            arraylist.add(new j((GraphRequest)list.get(k), httpurlconnection, new FacebookRequestError(httpurlconnection, facebookexception)));
        }

        return arraylist;
    }

    public final String toString()
    {
        Object obj = Locale.US;
        if (c == null) goto _L2; else goto _L1
_L1:
        int k = c.getResponseCode();
_L3:
        obj = String.format(((Locale) (obj)), "%d", new Object[] {
            Integer.valueOf(k)
        });
_L4:
        return (new StringBuilder("{Response:  responseCode: ")).append(((String) (obj))).append(", graphObject: ").append(a).append(", error: ").append(b).append("}").toString();
_L2:
        k = 200;
          goto _L3
        IOException ioexception;
        ioexception;
        ioexception = "unknown";
          goto _L4
    }
}
