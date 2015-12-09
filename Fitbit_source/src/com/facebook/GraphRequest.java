// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Logger;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            HttpMethod, AccessToken, LoggingBehavior, FacebookSdk, 
//            FacebookException, GraphResponse, GraphRequestBatch, GraphRequestAsyncTask, 
//            AccessTokenManager, ProgressNoopOutputStream, ProgressOutputStream

public class GraphRequest
{
    public static interface Callback
    {

        public abstract void onCompleted(GraphResponse graphresponse);
    }

    public static interface GraphJSONObjectCallback
    {

        public abstract void onCompleted(JSONObject jsonobject, GraphResponse graphresponse);
    }


    private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
    private static final String ACCESS_TOKEN_PARAM = "access_token";
    private static final String ATTACHED_FILES_PARAM = "attached_files";
    private static final String ATTACHMENT_FILENAME_PREFIX = "file";
    private static final String BATCH_APP_ID_PARAM = "batch_app_id";
    private static final String BATCH_BODY_PARAM = "body";
    private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
    private static final String BATCH_ENTRY_NAME_PARAM = "name";
    private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
    private static final String BATCH_METHOD_PARAM = "method";
    private static final String BATCH_PARAM = "batch";
    private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
    private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String DEBUG_KEY = "__debug__";
    private static final String DEBUG_MESSAGES_KEY = "messages";
    private static final String DEBUG_MESSAGE_KEY = "message";
    private static final String DEBUG_MESSAGE_LINK_KEY = "link";
    private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
    private static final String DEBUG_PARAM = "debug";
    private static final String DEBUG_SEVERITY_INFO = "info";
    private static final String DEBUG_SEVERITY_WARNING = "warning";
    private static final String FORMAT_JSON = "json";
    private static final String FORMAT_PARAM = "format";
    private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;
    private static final String ME = "me";
    private static final String MIME_BOUNDARY = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f";
    private static final String MY_FRIENDS = "me/friends";
    private static final String SDK_ANDROID = "android";
    private static final String SDK_PARAM = "sdk";
    private static final String SEARCH = "search";
    public static final String TAG = com/facebook/GraphRequest.getSimpleName();
    private static final String USER_AGENT_BASE = "FBAndroidSDK";
    private static final String USER_AGENT_HEADER = "User-Agent";
    private static final String VIDEOS_SUFFIX = "/videos";
    private static String defaultBatchApplicationId;
    private static volatile String userAgent;
    private static Pattern versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private AccessToken accessToken;
    private String batchEntryDependsOn;
    private String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;
    private Callback callback;
    private JSONObject graphObject;
    private String graphPath;
    private HttpMethod httpMethod;
    private String overriddenURL;
    private Bundle parameters;
    private boolean skipClientToken;
    private Object tag;
    private String version;

    public GraphRequest()
    {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accesstoken, String s)
    {
        this(accesstoken, s, null, null, null);
    }

    public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod)
    {
        this(accesstoken, s, bundle, httpmethod, null);
    }

    public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod, Callback callback1)
    {
        this(accesstoken, s, bundle, httpmethod, callback1, null);
    }

    public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod, Callback callback1, String s1)
    {
        batchEntryOmitResultOnSuccess = true;
        skipClientToken = false;
        accessToken = accesstoken;
        graphPath = s;
        version = s1;
        setCallback(callback1);
        setHttpMethod(httpmethod);
        if (bundle != null)
        {
            parameters = new Bundle(bundle);
        } else
        {
            parameters = new Bundle();
        }
        if (version == null)
        {
            version = ServerProtocol.getAPIVersion();
        }
    }

    GraphRequest(AccessToken accesstoken, URL url)
    {
        batchEntryOmitResultOnSuccess = true;
        skipClientToken = false;
        accessToken = accesstoken;
        overriddenURL = url.toString();
        setHttpMethod(HttpMethod.GET);
        parameters = new Bundle();
    }

    private void addCommonParameters()
    {
        if (accessToken == null) goto _L2; else goto _L1
_L1:
        if (!parameters.containsKey("access_token"))
        {
            String s = accessToken.getToken();
            Logger.registerAccessToken(s);
            parameters.putString("access_token", s);
        }
_L8:
        parameters.putString("sdk", "android");
        parameters.putString("format", "json");
        if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) goto _L4; else goto _L3
_L3:
        parameters.putString("debug", "info");
_L6:
        return;
_L2:
        if (!skipClientToken && !parameters.containsKey("access_token"))
        {
            String s1 = FacebookSdk.getApplicationId();
            String s2 = FacebookSdk.getClientToken();
            if (!Utility.isNullOrEmpty(s1) && !Utility.isNullOrEmpty(s2))
            {
                s1 = (new StringBuilder()).append(s1).append("|").append(s2).toString();
                parameters.putString("access_token", s1);
            } else
            {
                Log.d(TAG, "Warning: Request without access token missing application ID or client token.");
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) goto _L6; else goto _L5
_L5:
        parameters.putString("debug", "warning");
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private String appendParametersToBaseUrl(String s)
    {
        android.net.Uri.Builder builder;
label0:
        {
            builder = (new android.net.Uri.Builder()).encodedPath(s);
label1:
            do
            {
                String s1;
                for (Iterator iterator = parameters.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s1, parameterToString(s).toString()))
                {
                    s1 = (String)iterator.next();
                    Object obj = parameters.get(s1);
                    s = ((String) (obj));
                    if (obj == null)
                    {
                        s = "";
                    }
                    if (!isSupportedParameterType(s))
                    {
                        continue label1;
                    }
                }

                break label0;
            } while (httpMethod != HttpMethod.GET);
            throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] {
                s.getClass().getSimpleName()
            }));
        }
        return builder.toString();
    }

    private static HttpURLConnection createConnection(URL url)
        throws IOException
    {
        url = (HttpURLConnection)url.openConnection();
        url.setRequestProperty("User-Agent", getUserAgent());
        url.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        url.setChunkedStreamingMode(0);
        return url;
    }

    public static GraphResponse executeAndWait(GraphRequest graphrequest)
    {
        graphrequest = executeBatchAndWait(new GraphRequest[] {
            graphrequest
        });
        if (graphrequest == null || graphrequest.size() != 1)
        {
            throw new FacebookException("invalid state: expected a single response");
        } else
        {
            return (GraphResponse)graphrequest.get(0);
        }
    }

    public static List executeBatchAndWait(GraphRequestBatch graphrequestbatch)
    {
        Validate.notEmptyAndContainsNoNulls(graphrequestbatch, "requests");
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = toHttpConnection(graphrequestbatch);
        }
        catch (Exception exception)
        {
            List list = GraphResponse.constructErrorResponses(graphrequestbatch.getRequests(), null, new FacebookException(exception));
            runCallbacks(graphrequestbatch, list);
            return list;
        }
        return executeConnectionAndWait(httpurlconnection, graphrequestbatch);
    }

    public static List executeBatchAndWait(Collection collection)
    {
        return executeBatchAndWait(new GraphRequestBatch(collection));
    }

    public static transient List executeBatchAndWait(GraphRequest agraphrequest[])
    {
        Validate.notNull(agraphrequest, "requests");
        return executeBatchAndWait(((Collection) (Arrays.asList(agraphrequest))));
    }

    public static GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphrequestbatch)
    {
        Validate.notEmptyAndContainsNoNulls(graphrequestbatch, "requests");
        graphrequestbatch = new GraphRequestAsyncTask(graphrequestbatch);
        graphrequestbatch.executeOnSettingsExecutor();
        return graphrequestbatch;
    }

    public static GraphRequestAsyncTask executeBatchAsync(Collection collection)
    {
        return executeBatchAsync(new GraphRequestBatch(collection));
    }

    public static transient GraphRequestAsyncTask executeBatchAsync(GraphRequest agraphrequest[])
    {
        Validate.notNull(agraphrequest, "requests");
        return executeBatchAsync(((Collection) (Arrays.asList(agraphrequest))));
    }

    public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
    {
        List list = GraphResponse.fromHttpConnection(httpurlconnection, graphrequestbatch);
        Utility.disconnectQuietly(httpurlconnection);
        int i = graphrequestbatch.size();
        if (i != list.size())
        {
            throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] {
                Integer.valueOf(list.size()), Integer.valueOf(i)
            }));
        } else
        {
            runCallbacks(graphrequestbatch, list);
            AccessTokenManager.getInstance().extendAccessTokenIfNeeded();
            return list;
        }
    }

    public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, Collection collection)
    {
        return executeConnectionAndWait(httpurlconnection, new GraphRequestBatch(collection));
    }

    public static GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
    {
        Validate.notNull(httpurlconnection, "connection");
        httpurlconnection = new GraphRequestAsyncTask(httpurlconnection, graphrequestbatch);
        graphrequestbatch.setCallbackHandler(handler);
        httpurlconnection.executeOnSettingsExecutor();
        return httpurlconnection;
    }

    public static GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
    {
        return executeConnectionAsync(null, httpurlconnection, graphrequestbatch);
    }

    private static String getBatchAppId(GraphRequestBatch graphrequestbatch)
    {
        if (!Utility.isNullOrEmpty(graphrequestbatch.getBatchApplicationId()))
        {
            return graphrequestbatch.getBatchApplicationId();
        }
        for (graphrequestbatch = graphrequestbatch.iterator(); graphrequestbatch.hasNext();)
        {
            Object obj = ((GraphRequest)graphrequestbatch.next()).accessToken;
            if (obj != null)
            {
                obj = ((AccessToken) (obj)).getApplicationId();
                if (obj != null)
                {
                    return ((String) (obj));
                }
            }
        }

        if (!Utility.isNullOrEmpty(defaultBatchApplicationId))
        {
            return defaultBatchApplicationId;
        } else
        {
            return FacebookSdk.getApplicationId();
        }
    }

    public static final String getDefaultBatchApplicationId()
    {
        return defaultBatchApplicationId;
    }

    private String getGraphPathWithVersion()
    {
        if (versionPattern.matcher(graphPath).matches())
        {
            return graphPath;
        } else
        {
            return String.format("%s/%s", new Object[] {
                version, graphPath
            });
        }
    }

    private static String getMimeContentType()
    {
        return String.format("multipart/form-data; boundary=%s", new Object[] {
            "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
        });
    }

    private static String getUserAgent()
    {
        if (userAgent == null)
        {
            userAgent = String.format("%s.%s", new Object[] {
                "FBAndroidSDK", "4.1.2"
            });
        }
        return userAgent;
    }

    private static boolean hasOnProgressCallbacks(GraphRequestBatch graphrequestbatch)
    {
        for (Iterator iterator = graphrequestbatch.getCallbacks().iterator(); iterator.hasNext();)
        {
            if ((GraphRequestBatch.Callback)iterator.next() instanceof GraphRequestBatch.OnProgressCallback)
            {
                return true;
            }
        }

    /* block-local class not found */
    class OnProgressCallback {}

        for (graphrequestbatch = graphrequestbatch.iterator(); graphrequestbatch.hasNext();)
        {
            if (((GraphRequest)graphrequestbatch.next()).getCallback() instanceof OnProgressCallback)
            {
                return true;
            }
        }

        return false;
    }

    private static boolean isGzipCompressible(GraphRequestBatch graphrequestbatch)
    {
        graphrequestbatch = graphrequestbatch.iterator();
label0:
        do
        {
            if (graphrequestbatch.hasNext())
            {
                GraphRequest graphrequest = (GraphRequest)graphrequestbatch.next();
                Iterator iterator = graphrequest.parameters.keySet().iterator();
                String s;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    s = (String)iterator.next();
                } while (!isSupportedAttachmentType(graphrequest.parameters.get(s)));
                break;
            } else
            {
                return true;
            }
        } while (true);
        return false;
    }

    private static boolean isMeRequest(String s)
    {
        Matcher matcher = versionPattern.matcher(s);
        if (matcher.matches())
        {
            s = matcher.group(1);
        }
        return s.startsWith("me/") || s.startsWith("/me/");
    }

    private static boolean isSupportedAttachmentType(Object obj)
    {
    /* block-local class not found */
    class ParcelableResourceWithMimeType {}

        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    private static boolean isSupportedParameterType(Object obj)
    {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accesstoken, Context context, Callback callback1)
    {
        return newCustomAudienceThirdPartyIdRequest(accesstoken, context, null, callback1);
    }

    public static GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accesstoken, Context context, String s, Callback callback1)
    {
        if (s == null && accesstoken != null)
        {
            s = accesstoken.getApplicationId();
        }
        String s1 = s;
        if (s == null)
        {
            s1 = Utility.getMetadataApplicationId(context);
        }
        if (s1 == null)
        {
            throw new FacebookException("Facebook App ID cannot be determined");
        }
        s1 = (new StringBuilder()).append(s1).append("/custom_audience_third_party_id").toString();
        AttributionIdentifiers attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
        Bundle bundle = new Bundle();
        if (accesstoken == null)
        {
            if (attributionidentifiers.getAttributionId() != null)
            {
                s = attributionidentifiers.getAttributionId();
            } else
            {
                s = attributionidentifiers.getAndroidAdvertiserId();
            }
            if (attributionidentifiers.getAttributionId() != null)
            {
                bundle.putString("udid", s);
            }
        }
        if (FacebookSdk.getLimitEventAndDataUsage(context) || attributionidentifiers.isTrackingLimited())
        {
            bundle.putString("limit_event_usage", "1");
        }
        return new GraphRequest(accesstoken, s1, bundle, HttpMethod.GET, callback1);
    }

    public static GraphRequest newDeleteObjectRequest(AccessToken accesstoken, String s, Callback callback1)
    {
        return new GraphRequest(accesstoken, s, null, HttpMethod.DELETE, callback1);
    }

    public static GraphRequest newGraphPathRequest(AccessToken accesstoken, String s, Callback callback1)
    {
        return new GraphRequest(accesstoken, s, null, null, callback1);
    }

    public static GraphRequest newMeRequest(AccessToken accesstoken, GraphJSONObjectCallback graphjsonobjectcallback)
    {
        return new GraphRequest(accesstoken, "me", null, null, new _cls1(graphjsonobjectcallback));
    }

    public static GraphRequest newMyFriendsRequest(AccessToken accesstoken, GraphJSONArrayCallback graphjsonarraycallback)
    {
        return new GraphRequest(accesstoken, "me/friends", null, null, new _cls2(graphjsonarraycallback));
    }

    public static GraphRequest newPlacesSearchRequest(AccessToken accesstoken, Location location, int i, int j, String s, GraphJSONArrayCallback graphjsonarraycallback)
    {
        if (location == null && Utility.isNullOrEmpty(s))
        {
            throw new FacebookException("Either location or searchText must be specified.");
        }
        Bundle bundle = new Bundle(5);
        bundle.putString("type", "place");
        bundle.putInt("limit", j);
        if (location != null)
        {
            bundle.putString("center", String.format(Locale.US, "%f,%f", new Object[] {
                Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())
            }));
            bundle.putInt("distance", i);
        }
        if (!Utility.isNullOrEmpty(s))
        {
            bundle.putString("q", s);
        }
        location = new _cls3(graphjsonarraycallback);
        return new GraphRequest(accesstoken, "search", bundle, HttpMethod.GET, location);
    }

    public static GraphRequest newPostRequest(AccessToken accesstoken, String s, JSONObject jsonobject, Callback callback1)
    {
        accesstoken = new GraphRequest(accesstoken, s, null, HttpMethod.POST, callback1);
        accesstoken.setGraphObject(jsonobject);
        return accesstoken;
    }

    private static String parameterToString(Object obj)
    {
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number))
        {
            return obj.toString();
        }
        if (obj instanceof Date)
        {
            return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(obj);
        } else
        {
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
    }

    private static void processGraphObject(JSONObject jsonobject, String s, KeyValueSerializer keyvalueserializer)
        throws IOException
    {
        int i;
        if (isMeRequest(s))
        {
            i = s.indexOf(":");
            int j = s.indexOf("?");
            String s1;
            Object obj;
            if (i > 3 && (j == -1 || i < j))
            {
                i = 1;
            } else
            {
                i = 0;
            }
        } else
        {
            i = 0;
        }
        s = jsonobject.keys();
        while (s.hasNext()) 
        {
            s1 = (String)s.next();
            obj = jsonobject.opt(s1);
            boolean flag;
            if (i && s1.equalsIgnoreCase("image"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            processGraphObjectProperty(s1, obj, keyvalueserializer, flag);
        }
    }

    private static void processGraphObjectProperty(String s, Object obj, KeyValueSerializer keyvalueserializer, boolean flag)
        throws IOException
    {
        Object obj1 = obj.getClass();
        if (!org/json/JSONObject.isAssignableFrom(((Class) (obj1)))) goto _L2; else goto _L1
_L1:
        obj = (JSONObject)obj;
        if (!flag) goto _L4; else goto _L3
_L3:
        String s1;
        for (obj1 = ((JSONObject) (obj)).keys(); ((Iterator) (obj1)).hasNext(); processGraphObjectProperty(String.format("%s[%s]", new Object[] {
    s, s1
}), ((JSONObject) (obj)).opt(s1), keyvalueserializer, flag))
        {
            s1 = (String)((Iterator) (obj1)).next();
        }

          goto _L5
_L4:
        if (!((JSONObject) (obj)).has("id")) goto _L7; else goto _L6
_L6:
        processGraphObjectProperty(s, ((JSONObject) (obj)).optString("id"), keyvalueserializer, flag);
_L5:
        return;
_L7:
        if (((JSONObject) (obj)).has("url"))
        {
            processGraphObjectProperty(s, ((JSONObject) (obj)).optString("url"), keyvalueserializer, flag);
            return;
        }
        if (((JSONObject) (obj)).has("fbsdk:create_object"))
        {
            processGraphObjectProperty(s, ((JSONObject) (obj)).toString(), keyvalueserializer, flag);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!org/json/JSONArray.isAssignableFrom(((Class) (obj1))))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (JSONArray)obj;
        int j = ((JSONArray) (obj)).length();
        int i = 0;
        while (i < j) 
        {
            processGraphObjectProperty(String.format(Locale.ROOT, "%s[%d]", new Object[] {
                s, Integer.valueOf(i)
            }), ((JSONArray) (obj)).opt(i), keyvalueserializer, flag);
            i++;
        }
        if (true) goto _L5; else goto _L8
_L8:
    /* block-local class not found */
    class KeyValueSerializer {}

        if (java/lang/String.isAssignableFrom(((Class) (obj1))) || java/lang/Number.isAssignableFrom(((Class) (obj1))) || java/lang/Boolean.isAssignableFrom(((Class) (obj1))))
        {
            keyvalueserializer.writeString(s, obj.toString());
            return;
        }
        if (java/util/Date.isAssignableFrom(((Class) (obj1))))
        {
            obj = (Date)obj;
            keyvalueserializer.writeString(s, (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(((Date) (obj))));
            return;
        }
        if (true) goto _L5; else goto _L9
_L9:
    }

    private static void processRequest(GraphRequestBatch graphrequestbatch, Logger logger, int i, URL url, OutputStream outputstream, boolean flag)
        throws IOException, JSONException
    {
    /* block-local class not found */
    class Serializer {}

        outputstream = new Serializer(outputstream, logger, flag);
        if (i == 1)
        {
            graphrequestbatch = graphrequestbatch.get(0);
            HashMap hashmap = new HashMap();
            Iterator iterator = ((GraphRequest) (graphrequestbatch)).parameters.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Object obj = ((GraphRequest) (graphrequestbatch)).parameters.get(s);
    /* block-local class not found */
    class Attachment {}

                if (isSupportedAttachmentType(obj))
                {
                    hashmap.put(s, new Attachment(graphrequestbatch, obj));
                }
            } while (true);
            if (logger != null)
            {
                logger.append("  Parameters:\n");
            }
            serializeParameters(((GraphRequest) (graphrequestbatch)).parameters, outputstream, graphrequestbatch);
            if (logger != null)
            {
                logger.append("  Attachments:\n");
            }
            serializeAttachments(hashmap, outputstream);
            if (((GraphRequest) (graphrequestbatch)).graphObject != null)
            {
                processGraphObject(((GraphRequest) (graphrequestbatch)).graphObject, url.getPath(), outputstream);
            }
            return;
        }
        url = getBatchAppId(graphrequestbatch);
        if (Utility.isNullOrEmpty(url))
        {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        outputstream.writeString("batch_app_id", url);
        url = new HashMap();
        serializeRequestsAsJSON(outputstream, graphrequestbatch, url);
        if (logger != null)
        {
            logger.append("  Attachments:\n");
        }
        serializeAttachments(url, outputstream);
    }

    static void runCallbacks(GraphRequestBatch graphrequestbatch, List list)
    {
label0:
        {
            int j = graphrequestbatch.size();
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < j; i++)
            {
                GraphRequest graphrequest = graphrequestbatch.get(i);
                if (graphrequest.callback != null)
                {
                    arraylist.add(new Pair(graphrequest.callback, list.get(i)));
                }
            }

            if (arraylist.size() > 0)
            {
                list = new _cls5(arraylist, graphrequestbatch);
                graphrequestbatch = graphrequestbatch.getCallbackHandler();
                if (graphrequestbatch != null)
                {
                    break label0;
                }
                list.run();
            }
            return;
        }
        graphrequestbatch.post(list);
    }

    private static void serializeAttachments(Map map, Serializer serializer)
        throws IOException
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Attachment attachment = (Attachment)map.get(s);
            if (isSupportedAttachmentType(attachment.getValue()))
            {
                serializer.writeObject(s, attachment.getValue(), attachment.getRequest());
            }
        } while (true);
    }

    private static void serializeParameters(Bundle bundle, Serializer serializer, GraphRequest graphrequest)
        throws IOException
    {
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = bundle.get(s);
            if (isSupportedParameterType(obj))
            {
                serializer.writeObject(s, obj, graphrequest);
            }
        } while (true);
    }

    private static void serializeRequestsAsJSON(Serializer serializer, Collection collection, Map map)
        throws JSONException, IOException
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ((GraphRequest)iterator.next()).serializeToBatch(jsonarray, map)) { }
        serializer.writeRequestsAsJson("batch", jsonarray, collection);
    }

    private void serializeToBatch(JSONArray jsonarray, Map map)
        throws JSONException, IOException
    {
        JSONObject jsonobject = new JSONObject();
        if (batchEntryName != null)
        {
            jsonobject.put("name", batchEntryName);
            jsonobject.put("omit_response_on_success", batchEntryOmitResultOnSuccess);
        }
        if (batchEntryDependsOn != null)
        {
            jsonobject.put("depends_on", batchEntryDependsOn);
        }
        String s = getUrlForBatchedRequest();
        jsonobject.put("relative_url", s);
        jsonobject.put("method", httpMethod);
        if (accessToken != null)
        {
            Logger.registerAccessToken(accessToken.getToken());
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = parameters.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = parameters.get(((String) (obj)));
            if (isSupportedAttachmentType(obj))
            {
                String s1 = String.format(Locale.ROOT, "%s%d", new Object[] {
                    "file", Integer.valueOf(map.size())
                });
                arraylist.add(s1);
                map.put(s1, new Attachment(obj));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            jsonobject.put("attached_files", TextUtils.join(",", arraylist));
        }
        if (graphObject != null)
        {
            map = new ArrayList();
            processGraphObject(graphObject, s, new _cls6(map));
            jsonobject.put("body", TextUtils.join("&", map));
        }
        jsonarray.put(jsonobject);
    }

    static final void serializeToUrlConnection(GraphRequestBatch graphrequestbatch, HttpURLConnection httpurlconnection)
        throws IOException, JSONException
    {
        Logger logger;
        URL url;
        int j;
        boolean flag1;
        logger = new Logger(LoggingBehavior.REQUESTS, "Request");
        j = graphrequestbatch.size();
        flag1 = isGzipCompressible(graphrequestbatch);
        HttpMethod httpmethod;
        boolean flag;
        if (j == 1)
        {
            httpmethod = graphrequestbatch.get(0).httpMethod;
        } else
        {
            httpmethod = HttpMethod.POST;
        }
        httpurlconnection.setRequestMethod(httpmethod.name());
        setConnectionContentType(httpurlconnection, flag1);
        url = httpurlconnection.getURL();
        logger.append("Request:\n");
        logger.appendKeyValue("Id", graphrequestbatch.getId());
        logger.appendKeyValue("URL", url);
        logger.appendKeyValue("Method", httpurlconnection.getRequestMethod());
        logger.appendKeyValue("User-Agent", httpurlconnection.getRequestProperty("User-Agent"));
        logger.appendKeyValue("Content-Type", httpurlconnection.getRequestProperty("Content-Type"));
        httpurlconnection.setConnectTimeout(graphrequestbatch.getTimeout());
        httpurlconnection.setReadTimeout(graphrequestbatch.getTimeout());
        if (httpmethod == HttpMethod.POST)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            logger.log();
            return;
        }
        httpurlconnection.setDoOutput(true);
        Object obj1 = new BufferedOutputStream(httpurlconnection.getOutputStream());
        Object obj;
        httpurlconnection = ((HttpURLConnection) (obj1));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        obj = obj1;
        httpurlconnection = new GZIPOutputStream(((OutputStream) (obj1)));
        obj = httpurlconnection;
        if (!hasOnProgressCallbacks(graphrequestbatch))
        {
            break MISSING_BLOCK_LABEL_279;
        }
        obj = httpurlconnection;
        obj1 = new ProgressNoopOutputStream(graphrequestbatch.getCallbackHandler());
        obj = httpurlconnection;
        processRequest(graphrequestbatch, null, j, url, ((OutputStream) (obj1)), flag1);
        obj = httpurlconnection;
        int i = ((ProgressNoopOutputStream) (obj1)).getMaxProgress();
        obj = httpurlconnection;
        httpurlconnection = new ProgressOutputStream(httpurlconnection, graphrequestbatch, ((ProgressNoopOutputStream) (obj1)).getProgressMap(), i);
        processRequest(graphrequestbatch, logger, j, url, httpurlconnection, flag1);
        if (httpurlconnection != null)
        {
            httpurlconnection.close();
        }
        logger.log();
        return;
        graphrequestbatch;
        obj = null;
_L2:
        if (obj != null)
        {
            ((OutputStream) (obj)).close();
        }
        throw graphrequestbatch;
        graphrequestbatch;
        continue; /* Loop/switch isn't completed */
        graphrequestbatch;
        obj = httpurlconnection;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void setConnectionContentType(HttpURLConnection httpurlconnection, boolean flag)
    {
        if (flag)
        {
            httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpurlconnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        } else
        {
            httpurlconnection.setRequestProperty("Content-Type", getMimeContentType());
            return;
        }
    }

    public static final void setDefaultBatchApplicationId(String s)
    {
        defaultBatchApplicationId = s;
    }

    public static HttpURLConnection toHttpConnection(GraphRequestBatch graphrequestbatch)
    {
        Object obj;
        if (graphrequestbatch.size() != 1)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = new URL(graphrequestbatch.get(0).getUrlForSingleRequest());
_L1:
        try
        {
            obj = createConnection(((URL) (obj)));
            serializeToUrlConnection(graphrequestbatch, ((HttpURLConnection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (GraphRequestBatch graphrequestbatch)
        {
            throw new FacebookException("could not construct request body", graphrequestbatch);
        }
        // Misplaced declaration of an exception variable
        catch (GraphRequestBatch graphrequestbatch)
        {
            throw new FacebookException("could not construct request body", graphrequestbatch);
        }
        return ((HttpURLConnection) (obj));
        try
        {
            obj = new URL(ServerProtocol.getGraphUrlBase());
        }
        // Misplaced declaration of an exception variable
        catch (GraphRequestBatch graphrequestbatch)
        {
            throw new FacebookException("could not construct URL for request", graphrequestbatch);
        }
          goto _L1
    }

    public static HttpURLConnection toHttpConnection(Collection collection)
    {
        Validate.notEmptyAndContainsNoNulls(collection, "requests");
        return toHttpConnection(new GraphRequestBatch(collection));
    }

    public static transient HttpURLConnection toHttpConnection(GraphRequest agraphrequest[])
    {
        return toHttpConnection(((Collection) (Arrays.asList(agraphrequest))));
    }

    public final GraphResponse executeAndWait()
    {
        return executeAndWait(this);
    }

    public final GraphRequestAsyncTask executeAsync()
    {
        return executeBatchAsync(new GraphRequest[] {
            this
        });
    }

    public final AccessToken getAccessToken()
    {
        return accessToken;
    }

    public final String getBatchEntryDependsOn()
    {
        return batchEntryDependsOn;
    }

    public final String getBatchEntryName()
    {
        return batchEntryName;
    }

    public final boolean getBatchEntryOmitResultOnSuccess()
    {
        return batchEntryOmitResultOnSuccess;
    }

    public final Callback getCallback()
    {
        return callback;
    }

    public final JSONObject getGraphObject()
    {
        return graphObject;
    }

    public final String getGraphPath()
    {
        return graphPath;
    }

    public final HttpMethod getHttpMethod()
    {
        return httpMethod;
    }

    public final Bundle getParameters()
    {
        return parameters;
    }

    public final Object getTag()
    {
        return tag;
    }

    final String getUrlForBatchedRequest()
    {
        if (overriddenURL != null)
        {
            throw new FacebookException("Can't override URL for a batch request");
        } else
        {
            String s = getGraphPathWithVersion();
            addCommonParameters();
            return appendParametersToBaseUrl(s);
        }
    }

    final String getUrlForSingleRequest()
    {
        if (overriddenURL != null)
        {
            return overriddenURL.toString();
        }
        String s;
        if (getHttpMethod() == HttpMethod.POST && graphPath != null && graphPath.endsWith("/videos"))
        {
            s = ServerProtocol.getGraphVideoUrlBase();
        } else
        {
            s = ServerProtocol.getGraphUrlBase();
        }
        s = String.format("%s/%s", new Object[] {
            s, getGraphPathWithVersion()
        });
        addCommonParameters();
        return appendParametersToBaseUrl(s);
    }

    public final String getVersion()
    {
        return version;
    }

    public final void setAccessToken(AccessToken accesstoken)
    {
        accessToken = accesstoken;
    }

    public final void setBatchEntryDependsOn(String s)
    {
        batchEntryDependsOn = s;
    }

    public final void setBatchEntryName(String s)
    {
        batchEntryName = s;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean flag)
    {
        batchEntryOmitResultOnSuccess = flag;
    }

    public final void setCallback(Callback callback1)
    {
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) || FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING))
        {
            callback = new _cls4(callback1);
            return;
        } else
        {
            callback = callback1;
            return;
        }
    }

    public final void setGraphObject(JSONObject jsonobject)
    {
        graphObject = jsonobject;
    }

    public final void setGraphPath(String s)
    {
        graphPath = s;
    }

    public final void setHttpMethod(HttpMethod httpmethod)
    {
        if (overriddenURL != null && httpmethod != HttpMethod.GET)
        {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpmethod == null)
        {
            httpmethod = HttpMethod.GET;
        }
        httpMethod = httpmethod;
    }

    public final void setParameters(Bundle bundle)
    {
        parameters = bundle;
    }

    public final void setSkipClientToken(boolean flag)
    {
        skipClientToken = flag;
    }

    public final void setTag(Object obj)
    {
        tag = obj;
    }

    public final void setVersion(String s)
    {
        version = s;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("{Request: ").append(" accessToken: ");
        Object obj;
        if (accessToken == null)
        {
            obj = "null";
        } else
        {
            obj = accessToken;
        }
        return stringbuilder.append(obj).append(", graphPath: ").append(graphPath).append(", graphObject: ").append(graphObject).append(", httpMethod: ").append(httpMethod).append(", parameters: ").append(parameters).append("}").toString();
    }




    // Unreferenced inner class com/facebook/GraphRequest$GraphJSONArrayCallback
    /* block-local class not found */
    class GraphJSONArrayCallback {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls4 {}

}
