// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.util.Log;
import com.cleanmaster.sdk.cmloginsdkjar.internal.FileLruCache;
import com.cleanmaster.sdk.cmloginsdkjar.internal.Logger;
import com.cleanmaster.sdk.cmloginsdkjar.internal.Utility;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmObject;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmObjectList;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            Request, CmLoginSdkRequestError, CmLoginSdkException, RequestBatch, 
//            Settings, ae, af

public class Response
{

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
    private final CmLoginSdkRequestError error;
    private final CmObject graphObject;
    private final CmObjectList graphObjectList;
    private final boolean isFromCache;
    private final String rawResponse;
    private final Request request;

    Response(Request request1, HttpURLConnection httpurlconnection, CmLoginSdkRequestError cmloginsdkrequesterror)
    {
        this(request1, httpurlconnection, null, null, null, false, cmloginsdkrequesterror);
    }

    Response(Request request1, HttpURLConnection httpurlconnection, String s, CmObject cmobject, CmObjectList cmobjectlist, boolean flag, CmLoginSdkRequestError cmloginsdkrequesterror)
    {
        request = request1;
        connection = httpurlconnection;
        rawResponse = s;
        graphObject = cmobject;
        graphObjectList = cmobjectlist;
        isFromCache = flag;
        error = cmloginsdkrequesterror;
    }

    Response(Request request1, HttpURLConnection httpurlconnection, String s, CmObject cmobject, boolean flag)
    {
        this(request1, httpurlconnection, s, cmobject, null, flag, null);
    }

    Response(Request request1, HttpURLConnection httpurlconnection, String s, CmObjectList cmobjectlist, boolean flag)
    {
        this(request1, httpurlconnection, s, null, cmobjectlist, flag, null);
    }

    static List constructErrorResponses(List list, HttpURLConnection httpurlconnection, CmLoginSdkException cmloginsdkexception)
    {
        int j = list.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new Response((Request)list.get(i), httpurlconnection, new CmLoginSdkRequestError(httpurlconnection, cmloginsdkexception)));
        }

        return arraylist;
    }

    private static Response createResponseFromObject(Request request1, HttpURLConnection httpurlconnection, Object obj, boolean flag, Object obj1)
    {
        Object obj2 = obj;
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            obj1 = CmLoginSdkRequestError.checkResponseAndCreateError(((JSONObject) (obj)), obj1, httpurlconnection);
            if (obj1 != null)
            {
                ((CmLoginSdkRequestError) (obj1)).getErrorCode();
                return new Response(request1, httpurlconnection, ((CmLoginSdkRequestError) (obj1)));
            }
            obj = Utility.getStringPropertyAsJSON(((JSONObject) (obj)), "body", "FACEBOOK_NON_JSON_RESULT");
            if (obj instanceof JSONObject)
            {
                obj1 = com.cleanmaster.sdk.cmloginsdkjar.model.CmObject.Factory.create((JSONObject)obj);
                return new Response(request1, httpurlconnection, obj.toString(), ((CmObject) (obj1)), flag);
            }
            if (obj instanceof JSONArray)
            {
                obj1 = com.cleanmaster.sdk.cmloginsdkjar.model.CmObject.Factory.createList((JSONArray)obj, com/cleanmaster/sdk/cmloginsdkjar/model/CmObject);
                return new Response(request1, httpurlconnection, obj.toString(), ((CmObjectList) (obj1)), flag);
            }
            obj2 = JSONObject.NULL;
        }
        if (obj2 == JSONObject.NULL)
        {
            return new Response(request1, httpurlconnection, obj2.toString(), ((CmObject) (null)), flag);
        } else
        {
            request1 = new CmLoginSdkException((new StringBuilder("Got unexpected object type in response, class: ")).append(obj2.getClass().getSimpleName()).toString());
            request1.setExceptionRet(20006);
            throw request1;
        }
    }

    private static List createResponsesFromObject(HttpURLConnection httpurlconnection, List list, Object obj, boolean flag)
    {
        ArrayList arraylist;
        boolean flag1;
        int k;
        flag1 = false;
        if (!$assertionsDisabled && httpurlconnection == null && !flag)
        {
            throw new AssertionError();
        }
        k = list.size();
        arraylist = new ArrayList(k);
        if (k != 1) goto _L2; else goto _L1
_L1:
        Request request1 = (Request)list.get(0);
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
            httpurlconnection = new CmLoginSdkException("Unexpected number of results");
            httpurlconnection.setExceptionRet(20005);
            throw httpurlconnection;
        }
        break MISSING_BLOCK_LABEL_275;
_L4:
        i = 200;
          goto _L5
        obj1;
        obj1 = new CmLoginSdkException(((Throwable) (obj1)));
        ((CmLoginSdkException) (obj1)).setExceptionRet(20001);
        arraylist.add(new Response(request1, httpurlconnection, new CmLoginSdkRequestError(httpurlconnection, ((Exception) (obj1)))));
        obj1 = obj;
          goto _L6
        obj1;
        obj1 = new CmLoginSdkException(((Throwable) (obj1)));
        ((CmLoginSdkException) (obj1)).setExceptionRet(20002);
        arraylist.add(new Response(request1, httpurlconnection, new CmLoginSdkRequestError(httpurlconnection, ((Exception) (obj1)))));
_L2:
        obj1 = obj;
          goto _L6
        obj1 = (JSONArray)obj1;
        int j = ((flag1) ? 1 : 0);
        do
        {
            if (j >= ((JSONArray) (obj1)).length())
            {
                break;
            }
            Request request2 = (Request)list.get(j);
            try
            {
                arraylist.add(createResponseFromObject(request2, httpurlconnection, ((JSONArray) (obj1)).get(j), flag, obj));
            }
            catch (JSONException jsonexception)
            {
                CmLoginSdkException cmloginsdkexception = new CmLoginSdkException(jsonexception);
                cmloginsdkexception.setExceptionRet(20001);
                arraylist.add(new Response(request2, httpurlconnection, new CmLoginSdkRequestError(httpurlconnection, cmloginsdkexception)));
            }
            catch (CmLoginSdkException cmloginsdkexception1)
            {
                arraylist.add(new Response(request2, httpurlconnection, new CmLoginSdkRequestError(httpurlconnection, cmloginsdkexception1)));
            }
            j++;
        } while (true);
        return arraylist;
          goto _L5
    }

    static List createResponsesFromStream(InputStream inputstream, HttpURLConnection httpurlconnection, RequestBatch requestbatch, boolean flag)
    {
        inputstream = Utility.readStreamToString(inputstream);
        Logger.log("Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] {
            Integer.valueOf(inputstream.length()), inputstream
        });
        return createResponsesFromString(inputstream, httpurlconnection, requestbatch, flag);
    }

    static List createResponsesFromString(String s, HttpURLConnection httpurlconnection, RequestBatch requestbatch, boolean flag)
    {
        Object obj = (new JSONTokener(s)).nextValue();
        if (!(obj instanceof JSONObject))
        {
            Log.e("CmLoginSDK.ERROR", (new StringBuilder("createResponsesFromString wrong response:")).append(s).toString());
        }
        httpurlconnection = createResponsesFromObject(httpurlconnection, requestbatch, (JSONObject)obj, flag);
        Logger.log("Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] {
            requestbatch.getId(), Integer.valueOf(s.length()), httpurlconnection
        });
        return httpurlconnection;
    }

    static List fromHttpConnection(HttpURLConnection httpurlconnection, RequestBatch requestbatch)
    {
        Object obj;
        Object obj2;
        Object obj3;
        InputStream inputstream;
        InputStream inputstream1;
        InputStream inputstream2;
        InputStream inputstream3;
        InputStream inputstream4;
        List list;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        list = null;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj7 = null;
        obj8 = null;
        obj = null;
        inputstream4 = ((InputStream) (obj));
        obj3 = list;
        inputstream = obj4;
        inputstream1 = obj5;
        inputstream2 = obj6;
        inputstream3 = obj7;
        obj2 = obj8;
        if (httpurlconnection.getResponseCode() < 400) goto _L2; else goto _L1
_L1:
        inputstream4 = ((InputStream) (obj));
        obj3 = list;
        inputstream = obj4;
        inputstream1 = obj5;
        inputstream2 = obj6;
        inputstream3 = obj7;
        obj2 = obj8;
        obj = httpurlconnection.getErrorStream();
_L4:
        inputstream4 = ((InputStream) (obj));
        obj3 = obj;
        inputstream = ((InputStream) (obj));
        inputstream1 = ((InputStream) (obj));
        inputstream2 = ((InputStream) (obj));
        inputstream3 = ((InputStream) (obj));
        obj2 = obj;
        list = createResponsesFromStream(((InputStream) (obj)), httpurlconnection, requestbatch, false);
        Utility.closeQuietly(((java.io.Closeable) (obj)));
        return list;
_L2:
        inputstream4 = ((InputStream) (obj));
        obj3 = list;
        inputstream = obj4;
        inputstream1 = obj5;
        inputstream2 = obj6;
        inputstream3 = obj7;
        obj2 = obj8;
        obj = httpurlconnection.getInputStream();
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1;
        obj1;
        obj2 = inputstream4;
        Logger.log("Response", "Response <Error>: %s", new Object[] {
            obj1
        });
        obj2 = inputstream4;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, ((CmLoginSdkException) (obj1)));
        Utility.closeQuietly(inputstream4);
        return httpurlconnection;
        obj1;
        obj2 = obj3;
        obj1 = new CmLoginSdkException(((Throwable) (obj1)));
        obj2 = obj3;
        ((CmLoginSdkException) (obj1)).setExceptionRet(20004);
        obj2 = obj3;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, ((CmLoginSdkException) (obj1)));
        Utility.closeQuietly(((java.io.Closeable) (obj3)));
        return httpurlconnection;
        obj1;
        obj2 = inputstream;
        Logger.log("Response", "Response <Error>: %s", new Object[] {
            obj1
        });
        obj2 = inputstream;
        obj1 = new CmLoginSdkException(((Throwable) (obj1)));
        obj2 = inputstream;
        ((CmLoginSdkException) (obj1)).setExceptionRet(20001);
        obj2 = inputstream;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, ((CmLoginSdkException) (obj1)));
        Utility.closeQuietly(inputstream);
        return httpurlconnection;
        obj1;
        obj2 = inputstream1;
        Logger.log("Response", "Response <Error>: %s", new Object[] {
            obj1
        });
        obj2 = inputstream1;
        obj1 = new CmLoginSdkException(((Throwable) (obj1)));
        obj2 = inputstream1;
        ((CmLoginSdkException) (obj1)).setExceptionRet(20002);
        obj2 = inputstream1;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, ((CmLoginSdkException) (obj1)));
        Utility.closeQuietly(inputstream1);
        return httpurlconnection;
        obj1;
        obj2 = inputstream2;
        Logger.log("Response", "Response <Error>: %s", new Object[] {
            obj1
        });
        obj2 = inputstream2;
        obj1 = new CmLoginSdkException(((Throwable) (obj1)));
        obj2 = inputstream2;
        ((CmLoginSdkException) (obj1)).setExceptionRet(20003);
        obj2 = inputstream2;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, ((CmLoginSdkException) (obj1)));
        Utility.closeQuietly(inputstream2);
        return httpurlconnection;
        obj1;
        obj2 = inputstream3;
        Logger.log("Response", "Response <Error>: %s", new Object[] {
            obj1
        });
        obj2 = inputstream3;
        obj1 = new CmLoginSdkException(((Throwable) (obj1)));
        obj2 = inputstream3;
        ((CmLoginSdkException) (obj1)).setExceptionRet(20004);
        obj2 = inputstream3;
        httpurlconnection = constructErrorResponses(requestbatch, httpurlconnection, ((CmLoginSdkException) (obj1)));
        Utility.closeQuietly(inputstream3);
        return httpurlconnection;
        httpurlconnection;
        Utility.closeQuietly(((java.io.Closeable) (obj2)));
        throw httpurlconnection;
    }

    static FileLruCache getResponseCache()
    {
        if (responseCache == null)
        {
            android.app.Activity activity = Settings.getParentActivity();
            if (activity != null)
            {
                responseCache = new FileLruCache(activity, "ResponseCache", new com.cleanmaster.sdk.cmloginsdkjar.internal.FileLruCache.Limits());
            }
        }
        return responseCache;
    }

    static void writeResponseToFile(HttpURLConnection httpurlconnection, Request request1, File file)
    {
        InputStream inputstream = null;
        InputStream inputstream2 = httpurlconnection.getInputStream();
        InputStream inputstream1;
        inputstream = inputstream2;
        inputstream1 = inputstream2;
        Utility.readStreamToFile(httpurlconnection, request1, inputstream2, file);
        Utility.closeQuietly(inputstream2);
        return;
        httpurlconnection;
        inputstream1 = inputstream;
        file.delete();
        Utility.closeQuietly(inputstream);
        return;
        httpurlconnection;
        inputstream1 = null;
_L2:
        Utility.closeQuietly(inputstream1);
        throw httpurlconnection;
        httpurlconnection;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final HttpURLConnection getConnection()
    {
        return connection;
    }

    public final CmLoginSdkRequestError getError()
    {
        return error;
    }

    public final CmObject getGraphObject()
    {
        return graphObject;
    }

    public final CmObject getGraphObjectAs(Class class1)
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

    public final CmObjectList getGraphObjectList()
    {
        return graphObjectList;
    }

    public final CmObjectList getGraphObjectListAs(Class class1)
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
        if (graphObject == null) goto _L2; else goto _L1
_L1:
        af af1 = ((ae)graphObject.cast(com/cleanmaster/sdk/cmloginsdkjar/ae)).a();
        if (af1 == null) goto _L2; else goto _L3
_L3:
        if (pagingdirection == PagingDirection.NEXT)
        {
            pagingdirection = af1.a();
        } else
        {
            pagingdirection = af1.b();
        }
_L5:
        while (Utility.isNullOrEmpty(pagingdirection) || pagingdirection != null && pagingdirection.equals(request.getUrlForSingleRequest())) 
        {
            return null;
        }
        try
        {
            pagingdirection = new Request(request.getSid(), new URL(pagingdirection));
        }
        // Misplaced declaration of an exception variable
        catch (PagingDirection pagingdirection)
        {
            return null;
        }
        return pagingdirection;
_L2:
        pagingdirection = null;
        if (true) goto _L5; else goto _L4
_L4:
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
        return (new StringBuilder("{Response:  responseCode: ")).append(s).append(", graphObject: ").append(graphObject).append(", error: ").append(error).append(", isFromCache:").append(isFromCache).append("}").toString();
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
        if (!com/cleanmaster/sdk/cmloginsdkjar/Response.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    private class PagingDirection extends Enum
    {

        private static final PagingDirection $VALUES[];
        public static final PagingDirection NEXT;
        public static final PagingDirection PREVIOUS;

        public static PagingDirection valueOf(String s)
        {
            return (PagingDirection)Enum.valueOf(com/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection, s);
        }

        public static PagingDirection[] values()
        {
            return (PagingDirection[])$VALUES.clone();
        }

        static 
        {
            NEXT = new PagingDirection("NEXT", 0);
            PREVIOUS = new PagingDirection("PREVIOUS", 1);
            $VALUES = (new PagingDirection[] {
                NEXT, PREVIOUS
            });
        }

        private PagingDirection(String s, int i)
        {
            super(s, i);
        }
    }

}
