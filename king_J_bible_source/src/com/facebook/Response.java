// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.CacheableRequestBatch;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook:
//            Request, FacebookRequestError, Session, FacebookException, 
//            LoggingBehavior, RequestBatch

public class Response
{
    static interface PagedResults
        extends GraphObject
    {

        public abstract GraphObjectList getData();

        public abstract PagingInfo getPaging();
    }

    public static final class PagingDirection extends Enum
    {

        private static final PagingDirection ENUM$VALUES[];
        public static final PagingDirection NEXT;
        public static final PagingDirection PREVIOUS;

        public static PagingDirection valueOf(String s)
        {
            return (PagingDirection)Enum.valueOf(com/facebook/Response$PagingDirection, s);
        }

        public static PagingDirection[] values()
        {
            PagingDirection apagingdirection[] = ENUM$VALUES;
            int i = apagingdirection.length;
            PagingDirection apagingdirection1[] = new PagingDirection[i];
            System.arraycopy(apagingdirection, 0, apagingdirection1, 0, i);
            return apagingdirection1;
        }

        static 
        {
            NEXT = new PagingDirection("NEXT", 0);
            PREVIOUS = new PagingDirection("PREVIOUS", 1);
            ENUM$VALUES = (new PagingDirection[] {
                NEXT, PREVIOUS
            });
        }

        private PagingDirection(String s, int i)
        {
            super(s, i);
        }
    }

    static interface PagingInfo
        extends GraphObject
    {

        public abstract String getNext();

        public abstract String getPrevious();
    }


    static final boolean $assertionsDisabled;
    private static final String BODY_KEY = "body";
    private static final String CODE_KEY = "code";
    private static final int INVALID_SESSION_FACEBOOK_ERROR_CODE = 190;
    public static final String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";
    private static final String RESPONSE_CACHE_TAG = "ResponseCache";
    private static final String RESPONSE_LOG_TAG = "Response";
    public static final String SUCCESS_KEY = "success";
    private static FileLruCache responseCache;
    private final HttpURLConnection connection;
    private final FacebookRequestError error;
    private final GraphObject graphObject;
    private final GraphObjectList graphObjectList;
    private final boolean isFromCache;
    private final String rawResponse;
    private final Request request;

    Response(Request request1, HttpURLConnection httpurlconnection, FacebookRequestError facebookrequesterror)
    {
        this(request1, httpurlconnection, null, null, null, false, facebookrequesterror);
    }

    Response(Request request1, HttpURLConnection httpurlconnection, String s, GraphObject graphobject, GraphObjectList graphobjectlist, boolean flag, FacebookRequestError facebookrequesterror)
    {
        request = request1;
        connection = httpurlconnection;
        rawResponse = s;
        graphObject = graphobject;
        graphObjectList = graphobjectlist;
        isFromCache = flag;
        error = facebookrequesterror;
    }

    Response(Request request1, HttpURLConnection httpurlconnection, String s, GraphObject graphobject, boolean flag)
    {
        this(request1, httpurlconnection, s, graphobject, null, flag, null);
    }

    Response(Request request1, HttpURLConnection httpurlconnection, String s, GraphObjectList graphobjectlist, boolean flag)
    {
        this(request1, httpurlconnection, s, null, graphobjectlist, flag, null);
    }

    static List constructErrorResponses(List list, HttpURLConnection httpurlconnection, FacebookException facebookexception)
    {
        int j = list.size();
        ArrayList arraylist = new ArrayList(j);
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            arraylist.add(new Response((Request)list.get(i), httpurlconnection, new FacebookRequestError(httpurlconnection, facebookexception)));
            i++;
        } while (true);
    }

    private static Response createResponseFromObject(Request request1, HttpURLConnection httpurlconnection, Object obj, boolean flag, Object obj1)
        throws JSONException
    {
        Object obj2 = obj;
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            obj1 = FacebookRequestError.checkResponseAndCreateError(((JSONObject) (obj)), obj1, httpurlconnection);
            if (obj1 != null)
            {
                if (((FacebookRequestError) (obj1)).getErrorCode() == 190)
                {
                    obj = request1.getSession();
                    if (obj != null)
                    {
                        ((Session) (obj)).closeAndClearTokenInformation();
                    }
                }
                return new Response(request1, httpurlconnection, ((FacebookRequestError) (obj1)));
            }
            obj = Utility.getStringPropertyAsJSON(((JSONObject) (obj)), "body", "FACEBOOK_NON_JSON_RESULT");
            if (obj instanceof JSONObject)
            {
                obj1 = com.facebook.model.GraphObject.Factory.create((JSONObject)obj);
                return new Response(request1, httpurlconnection, obj.toString(), ((GraphObject) (obj1)), flag);
            }
            if (obj instanceof JSONArray)
            {
                obj1 = com.facebook.model.GraphObject.Factory.createList((JSONArray)obj, com/facebook/model/GraphObject);
                return new Response(request1, httpurlconnection, obj.toString(), ((GraphObjectList) (obj1)), flag);
            }
            obj2 = JSONObject.NULL;
        }
        if (obj2 == JSONObject.NULL)
        {
            return new Response(request1, httpurlconnection, obj2.toString(), ((GraphObject) (null)), flag);
        } else
        {
            throw new FacebookException((new StringBuilder("Got unexpected object type in response, class: ")).append(obj2.getClass().getSimpleName()).toString());
        }
    }

    private static List createResponsesFromObject(HttpURLConnection httpurlconnection, List list, Object obj, boolean flag)
        throws FacebookException, JSONException
    {
        Object obj1;
        ArrayList arraylist;
        int k;
        if (!$assertionsDisabled && httpurlconnection == null && !flag)
        {
            throw new AssertionError();
        }
        k = list.size();
        arraylist = new ArrayList(k);
        obj1 = obj;
        if (k != 1) goto _L2; else goto _L1
_L1:
        Request request1 = (Request)list.get(0);
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("body", obj);
        if (httpurlconnection == null) goto _L4; else goto _L3
_L3:
        int i = httpurlconnection.getResponseCode();
_L7:
        jsonobject.put("code", i);
        obj1 = new JSONArray();
        ((JSONArray) (obj1)).put(jsonobject);
_L2:
        if (!(obj1 instanceof JSONArray) || ((JSONArray)obj1).length() != k)
        {
            throw new FacebookException("Unexpected number of results");
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = 200;
        continue; /* Loop/switch isn't completed */
        obj1;
        arraylist.add(new Response(request1, httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (obj1)))));
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
        obj1;
        arraylist.add(new Response(request1, httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (obj1)))));
        obj1 = obj;
        if (true) goto _L2; else goto _L5
_L5:
        obj1 = (JSONArray)obj1;
        int j = 0;
        do
        {
            if (j >= ((JSONArray) (obj1)).length())
            {
                return arraylist;
            }
            Request request2 = (Request)list.get(j);
            try
            {
                arraylist.add(createResponseFromObject(request2, httpurlconnection, ((JSONArray) (obj1)).get(j), flag, obj));
            }
            catch (JSONException jsonexception)
            {
                arraylist.add(new Response(request2, httpurlconnection, new FacebookRequestError(httpurlconnection, jsonexception)));
            }
            catch (FacebookException facebookexception)
            {
                arraylist.add(new Response(request2, httpurlconnection, new FacebookRequestError(httpurlconnection, facebookexception)));
            }
            j++;
        } while (true);
        if (true) goto _L7; else goto _L6
_L6:
    }

    static List createResponsesFromStream(InputStream inputstream, HttpURLConnection httpurlconnection, RequestBatch requestbatch, boolean flag)
        throws FacebookException, JSONException, IOException
    {
        inputstream = Utility.readStreamToString(inputstream);
        Logger.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] {
            Integer.valueOf(inputstream.length()), inputstream
        });
        return createResponsesFromString(inputstream, httpurlconnection, requestbatch, flag);
    }

    static List createResponsesFromString(String s, HttpURLConnection httpurlconnection, RequestBatch requestbatch, boolean flag)
        throws FacebookException, JSONException, IOException
    {
        httpurlconnection = createResponsesFromObject(httpurlconnection, requestbatch, (new JSONTokener(s)).nextValue(), flag);
        Logger.log(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] {
            requestbatch.getId(), Integer.valueOf(s.length()), httpurlconnection
        });
        return httpurlconnection;
    }

    static List fromHttpConnection(HttpURLConnection httpurlconnection, RequestBatch requestbatch)
    {
        Object obj;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj8;
        Object obj9;
        Object obj10;
        obj10 = null;
        obj3 = null;
        obj5 = null;
        obj6 = null;
        obj4 = null;
        obj8 = null;
        obj9 = null;
        obj = obj10;
        if (!(requestbatch instanceof CacheableRequestBatch)) goto _L2; else goto _L1
_L1:
        Object obj2;
        Object obj7;
        CacheableRequestBatch cacheablerequestbatch = (CacheableRequestBatch)requestbatch;
        obj7 = getResponseCache();
        obj = cacheablerequestbatch.getCacheKeyOverride();
        obj2 = obj;
        if (Utility.isNullOrEmpty(((String) (obj))))
        {
            if (requestbatch.size() == 1)
            {
                obj2 = requestbatch.get(0).getUrlForSingleRequest();
            } else
            {
                Logger.log(LoggingBehavior.REQUESTS, "ResponseCache", "Not using cache for cacheable request because no key was specified");
                obj2 = obj;
            }
        }
        obj8 = obj7;
        obj9 = obj2;
        obj = obj10;
        if (cacheablerequestbatch.getForceRoundTrip()) goto _L2; else goto _L3
_L3:
        obj8 = obj7;
        obj9 = obj2;
        obj = obj10;
        if (obj7 == null) goto _L2; else goto _L4
_L4:
        obj8 = obj7;
        obj9 = obj2;
        obj = obj10;
        if (Utility.isNullOrEmpty(((String) (obj2)))) goto _L2; else goto _L5
_L5:
        obj = ((FileLruCache) (obj7)).get(((String) (obj2)));
        if (obj == null) goto _L7; else goto _L6
_L6:
        obj4 = obj;
        obj3 = obj;
        obj5 = obj;
        obj6 = obj;
        obj8 = createResponsesFromStream(((InputStream) (obj)), null, requestbatch, true);
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return ((List) (obj8));
        obj;
        Utility.closeQuietly(((java.io.Closeable) (obj4)));
        obj = obj4;
        obj9 = obj2;
        obj8 = obj7;
_L2:
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj2 = obj;
        if (httpurlconnection.getResponseCode() < 400) goto _L9; else goto _L8
_L8:
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj2 = obj;
        obj = httpurlconnection.getErrorStream();
_L11:
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj2 = obj;
        obj3 = createResponsesFromStream(((InputStream) (obj)), httpurlconnection, requestbatch, false);
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return ((List) (obj3));
        obj;
        Utility.closeQuietly(((java.io.Closeable) (obj3)));
        obj8 = obj7;
        obj9 = obj2;
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        obj;
        Utility.closeQuietly(((java.io.Closeable) (obj5)));
        obj8 = obj7;
        obj9 = obj2;
        obj = obj5;
        continue; /* Loop/switch isn't completed */
        httpurlconnection;
        Utility.closeQuietly(((java.io.Closeable) (obj6)));
        throw httpurlconnection;
_L7:
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        obj8 = obj7;
        obj9 = obj2;
        continue; /* Loop/switch isn't completed */
_L9:
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj2 = obj;
        obj3 = httpurlconnection.getInputStream();
        obj = obj3;
        if (obj8 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj3;
        if (obj9 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj3;
        if (obj3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj4 = obj3;
        obj5 = obj3;
        obj6 = obj3;
        obj7 = obj3;
        obj2 = obj3;
        obj8 = ((FileLruCache) (obj8)).interceptAndPut(((String) (obj9)), ((InputStream) (obj3)));
        obj = obj3;
        if (obj8 != null)
        {
            obj = obj8;
        }
        if (true) goto _L11; else goto _L10
_L10:
        Object obj1;
        obj1;
        obj2 = obj4;
        Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
            obj1
        });
        obj2 = obj4;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, ((FacebookException) (obj1)));
        Utility.closeQuietly(((java.io.Closeable) (obj4)));
        return httpurlconnection;
        obj1;
        obj2 = obj5;
        Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
            obj1
        });
        obj2 = obj5;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, new FacebookException(((Throwable) (obj1))));
        Utility.closeQuietly(((java.io.Closeable) (obj5)));
        return httpurlconnection;
        obj1;
        obj2 = obj6;
        Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
            obj1
        });
        obj2 = obj6;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, new FacebookException(((Throwable) (obj1))));
        Utility.closeQuietly(((java.io.Closeable) (obj6)));
        return httpurlconnection;
        obj1;
        obj2 = obj7;
        Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
            obj1
        });
        obj2 = obj7;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, new FacebookException(((Throwable) (obj1))));
        Utility.closeQuietly(((java.io.Closeable) (obj7)));
        return httpurlconnection;
        httpurlconnection;
        Utility.closeQuietly(((java.io.Closeable) (obj2)));
        throw httpurlconnection;
        if (true) goto _L2; else goto _L12
_L12:
    }

    static FileLruCache getResponseCache()
    {
        if (responseCache == null)
        {
            android.content.Context context = Session.getStaticContext();
            if (context != null)
            {
                responseCache = new FileLruCache(context, "ResponseCache", new com.facebook.internal.FileLruCache.Limits());
            }
        }
        return responseCache;
    }

    public final HttpURLConnection getConnection()
    {
        return connection;
    }

    public final FacebookRequestError getError()
    {
        return error;
    }

    public final GraphObject getGraphObject()
    {
        return graphObject;
    }

    public final GraphObject getGraphObjectAs(Class class1)
    {
        if (graphObject == null)
        {
            return null;
        }
        if (class1 == null)
        {
            throw new NullPointerException("Must pass in a valid interface that extends GraphObject");
        } else
        {
            return graphObject.cast(class1);
        }
    }

    public final GraphObjectList getGraphObjectList()
    {
        return graphObjectList;
    }

    public final GraphObjectList getGraphObjectListAs(Class class1)
    {
        if (graphObjectList == null)
        {
            return null;
        } else
        {
            return graphObjectList.castToListOf(class1);
        }
    }

    public final boolean getIsFromCache()
    {
        return isFromCache;
    }

    public String getRawResponse()
    {
        return rawResponse;
    }

    public Request getRequest()
    {
        return request;
    }

    public Request getRequestForPagedResults(PagingDirection pagingdirection)
    {
        Object obj = null;
        String s = obj;
        if (graphObject != null)
        {
            PagingInfo paginginfo = ((PagedResults)graphObject.cast(com/facebook/Response$PagedResults)).getPaging();
            s = obj;
            if (paginginfo != null)
            {
                if (pagingdirection == PagingDirection.NEXT)
                {
                    s = paginginfo.getNext();
                } else
                {
                    s = paginginfo.getPrevious();
                }
            }
        }
        if (Utility.isNullOrEmpty(s))
        {
            return null;
        }
        if (s != null && s.equals(request.getUrlForSingleRequest()))
        {
            return null;
        }
        try
        {
            pagingdirection = new Request(request.getSession(), new URL(s));
        }
        // Misplaced declaration of an exception variable
        catch (PagingDirection pagingdirection)
        {
            return null;
        }
        return pagingdirection;
    }

    public String toString()
    {
        if (connection == null) goto _L2; else goto _L1
_L1:
        int i = connection.getResponseCode();
_L3:
        String s = String.format("%d", new Object[] {
            Integer.valueOf(i)
        });
_L4:
        return (new StringBuilder()).append("{Response: ").append(" responseCode: ").append(s).append(", graphObject: ").append(graphObject).append(", error: ").append(error).append(", isFromCache:").append(isFromCache).append("}").toString();
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
        if (!com/facebook/Response.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
