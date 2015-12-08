// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.model.GraphObject;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class aoz
{

    private static apt e;
    private static boolean f;
    public final GraphObject a;
    public final FacebookRequestError b;
    private final HttpURLConnection c;
    private final boolean d;

    aoz(HttpURLConnection httpurlconnection, FacebookRequestError facebookrequesterror)
    {
        this(httpurlconnection, null, false, facebookrequesterror);
    }

    aoz(HttpURLConnection httpurlconnection, GraphObject graphobject, boolean flag)
    {
        this(httpurlconnection, graphobject, flag, null);
    }

    private aoz(HttpURLConnection httpurlconnection, GraphObject graphobject, boolean flag, FacebookRequestError facebookrequesterror)
    {
        c = httpurlconnection;
        a = graphobject;
        d = flag;
        b = facebookrequesterror;
    }

    private aoz(HttpURLConnection httpurlconnection, boolean flag)
    {
        this(httpurlconnection, null, flag, null);
    }

    private static List a(InputStream inputstream, HttpURLConnection httpurlconnection, aou aou1, boolean flag)
    {
        inputstream = arp.a(inputstream);
        LoggingBehavior loggingbehavior = LoggingBehavior.c;
        inputstream.length();
        arb.b();
        return a(((String) (inputstream)), httpurlconnection, aou1, flag);
    }

    static List a(String s, HttpURLConnection httpurlconnection, aou aou1, boolean flag)
    {
        httpurlconnection = a(httpurlconnection, ((List) (aou1)), (new JSONTokener(s)).nextValue(), flag);
        LoggingBehavior loggingbehavior = LoggingBehavior.a;
        aou1 = aou1.c;
        s.length();
        arb.b();
        return httpurlconnection;
    }

    public static List a(HttpURLConnection httpurlconnection, aou aou1)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        if (!(aou1 instanceof apr)) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj3;
        if (e == null)
        {
            android.content.Context context = Session.h();
            if (context != null)
            {
                e = new apt(context, "ResponseCache", new apx());
            }
        }
        obj2 = e;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        if (arp.a(null))
        {
            if (aou1.size() == 1)
            {
                obj = aou1.a(0).b();
            } else
            {
                obj = LoggingBehavior.a;
                obj = null;
                arb.a();
            }
        } else
        {
            obj = null;
        }
        if (obj2 == null || arp.a(((String) (obj)))) goto _L4; else goto _L3
_L3:
        obj3 = ((apt) (obj2)).a(((String) (obj)), null);
        obj1 = obj3;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj3 = a(((InputStream) (obj1)), ((HttpURLConnection) (null)), aou1, true);
        arp.a(((java.io.Closeable) (obj1)));
        return ((List) (obj3));
        arp.a(((java.io.Closeable) (obj1)));
        obj4 = obj;
        obj3 = obj2;
        obj = obj1;
        obj2 = obj4;
_L16:
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj8 = obj;
        obj1 = obj;
        if (httpurlconnection.getResponseCode() < 400) goto _L6; else goto _L5
_L5:
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj8 = obj;
        obj1 = obj;
        obj = httpurlconnection.getErrorStream();
_L8:
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj8 = obj;
        obj1 = obj;
        obj2 = a(((InputStream) (obj)), httpurlconnection, aou1, false);
        arp.a(((java.io.Closeable) (obj)));
        return ((List) (obj2));
        obj3;
_L14:
        arp.a(((java.io.Closeable) (obj1)));
        obj3 = obj2;
        obj2 = obj;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj1 = null;
_L13:
        arp.a(((java.io.Closeable) (obj1)));
        obj3 = obj2;
        obj2 = obj;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj1 = null;
_L12:
        arp.a(((java.io.Closeable) (obj1)));
        obj3 = obj2;
        obj2 = obj;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        httpurlconnection;
        obj1 = null;
_L11:
        arp.a(((java.io.Closeable) (obj1)));
        throw httpurlconnection;
_L6:
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj8 = obj;
        obj1 = obj;
        obj4 = httpurlconnection.getInputStream();
        obj = obj4;
        if (obj3 == null) goto _L8; else goto _L7
_L7:
        obj = obj4;
        if (obj2 == null) goto _L8; else goto _L9
_L9:
        obj = obj4;
        if (obj4 == null) goto _L8; else goto _L10
_L10:
        obj5 = obj4;
        obj6 = obj4;
        obj7 = obj4;
        obj8 = obj4;
        obj1 = obj4;
        obj = ((apt) (obj3)).a(((String) (obj2)), ((InputStream) (obj4)));
          goto _L8
        obj;
        obj1 = obj5;
        obj2 = LoggingBehavior.a;
        obj1 = obj5;
        arb.b();
        obj1 = obj5;
        httpurlconnection = a(((List) (aou1)), httpurlconnection, ((FacebookException) (obj)));
        arp.a(((java.io.Closeable) (obj5)));
        return httpurlconnection;
        obj;
        obj1 = obj6;
        obj2 = LoggingBehavior.a;
        obj1 = obj6;
        arb.b();
        obj1 = obj6;
        httpurlconnection = a(((List) (aou1)), httpurlconnection, new FacebookException(((Throwable) (obj))));
        arp.a(((java.io.Closeable) (obj6)));
        return httpurlconnection;
        obj;
        obj1 = obj7;
        obj2 = LoggingBehavior.a;
        obj1 = obj7;
        arb.b();
        obj1 = obj7;
        httpurlconnection = a(((List) (aou1)), httpurlconnection, new FacebookException(((Throwable) (obj))));
        arp.a(((java.io.Closeable) (obj7)));
        return httpurlconnection;
        obj;
        obj1 = obj8;
        obj2 = LoggingBehavior.a;
        obj1 = obj8;
        arb.b();
        obj1 = obj8;
        httpurlconnection = a(((List) (aou1)), httpurlconnection, new FacebookException(((Throwable) (obj))));
        arp.a(((java.io.Closeable) (obj8)));
        return httpurlconnection;
        httpurlconnection;
        arp.a(((java.io.Closeable) (obj1)));
        throw httpurlconnection;
        httpurlconnection;
          goto _L11
        obj3;
          goto _L12
        obj3;
          goto _L13
        obj3;
          goto _L14
_L4:
        obj1 = null;
        obj3 = obj2;
        obj2 = obj;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L2:
        obj3 = null;
        obj = null;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private static List a(HttpURLConnection httpurlconnection, List list, Object obj, boolean flag)
    {
        ArrayList arraylist;
        int j;
        if (!f && httpurlconnection == null && !flag)
        {
            throw new AssertionError();
        }
        j = list.size();
        arraylist = new ArrayList(j);
        if (j != 1) goto _L2; else goto _L1
_L1:
        list.get(0);
        Object obj2;
        obj2 = new JSONObject();
        ((JSONObject) (obj2)).put("body", obj);
        if (httpurlconnection == null) goto _L4; else goto _L3
_L3:
        int i = httpurlconnection.getResponseCode();
_L15:
        JSONArray jsonarray;
        ((JSONObject) (obj2)).put("code", i);
        jsonarray = new JSONArray();
        jsonarray.put(obj2);
        obj = jsonarray;
_L2:
        if (!(obj instanceof JSONArray) || ((JSONArray)obj).length() != j)
        {
            throw new FacebookException("Unexpected number of results");
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = 200;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        arraylist.add(new aoz(httpurlconnection, new FacebookRequestError(((Exception) (obj1)))));
        continue; /* Loop/switch isn't completed */
        obj1;
        arraylist.add(new aoz(httpurlconnection, new FacebookRequestError(((Exception) (obj1)))));
        if (true) goto _L2; else goto _L5
_L5:
        obj1 = (JSONArray)obj;
        i = 0;
_L13:
        if (i >= ((JSONArray) (obj1)).length())
        {
            break MISSING_BLOCK_LABEL_520;
        }
        obj2 = (Request)list.get(i);
        obj = ((JSONArray) (obj1)).get(i);
        if (!(obj instanceof JSONObject)) goto _L7; else goto _L6
_L6:
        JSONObject jsonobject;
        jsonobject = (JSONObject)obj;
        obj = FacebookRequestError.a(jsonobject);
        if (obj == null) goto _L9; else goto _L8
_L8:
        if (((FacebookRequestError) (obj)).b != 190)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        obj2 = ((Request) (obj2)).a;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        ((Session) (obj2)).f();
        obj = new aoz(httpurlconnection, ((FacebookRequestError) (obj)));
_L11:
        arraylist.add(obj);
        break MISSING_BLOCK_LABEL_526;
_L9:
        obj = arp.a(jsonobject, "body", "FACEBOOK_NON_JSON_RESULT");
        if (obj instanceof JSONObject)
        {
            GraphObject graphobject = com.facebook.model.GraphObject.Factory.create((JSONObject)obj);
            obj.toString();
            obj = new aoz(httpurlconnection, graphobject, flag);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof JSONArray)
        {
            com.facebook.model.GraphObject.Factory.createList((JSONArray)obj, com/facebook/model/GraphObject);
            obj.toString();
            obj = new aoz(httpurlconnection, flag);
            continue; /* Loop/switch isn't completed */
        }
        obj = JSONObject.NULL;
_L7:
        if (obj != JSONObject.NULL)
        {
            break; /* Loop/switch isn't completed */
        }
        obj.toString();
        obj = new aoz(httpurlconnection, null, flag);
        if (true) goto _L11; else goto _L10
_L10:
        try
        {
            throw new FacebookException((new StringBuilder("Got unexpected object type in response, class: ")).append(obj.getClass().getSimpleName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            arraylist.add(new aoz(httpurlconnection, new FacebookRequestError(((Exception) (obj)))));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            arraylist.add(new aoz(httpurlconnection, new FacebookRequestError(((Exception) (obj)))));
        }
        break MISSING_BLOCK_LABEL_526;
        return arraylist;
        i++;
        if (true) goto _L13; else goto _L12
_L12:
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static List a(List list, HttpURLConnection httpurlconnection, FacebookException facebookexception)
    {
        int j = list.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            list.get(i);
            arraylist.add(new aoz(httpurlconnection, new FacebookRequestError(facebookexception)));
        }

        return arraylist;
    }

    public final GraphObject a(Class class1)
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.cast(class1);
        }
    }

    public String toString()
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        int i = c.getResponseCode();
_L3:
        String s = String.format("%d", new Object[] {
            Integer.valueOf(i)
        });
_L4:
        return (new StringBuilder("{Response:  responseCode: ")).append(s).append(", graphObject: ").append(a).append(", error: ").append(b).append(", isFromCache:").append(d).append("}").toString();
_L2:
        i = 200;
          goto _L3
        IOException ioexception;
        ioexception;
        ioexception = "unknown";
          goto _L4
    }

    static 
    {
        boolean flag;
        if (!aoz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
