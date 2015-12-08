// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.cleanmaster.sdk.cmloginsdkjar.internal.Logger;
import com.cleanmaster.sdk.cmloginsdkjar.internal.ServerProtocol;
import com.cleanmaster.sdk.cmloginsdkjar.internal.Utility;
import com.cleanmaster.sdk.cmloginsdkjar.internal.Validate;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
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
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            HttpMethod, Settings, CmLoginSdkException, Response, 
//            RequestBatch, RequestAsyncTask, i, n, 
//            h, l, p, t, 
//            g, j, v, e, 
//            k, w, m, u, 
//            q, x, f, s, 
//            aa, y, o, b, 
//            c

public class Request
{

    static final boolean $assertionsDisabled;
    private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
    private static final String ACCESS_TOKEN_PARAM = "access_token";
    private static final String APPID_PARAM = "appid";
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
    private static final String CLIENT_ID_PARAM = "client_id";
    private static final String CLIENT_IP_PARAM = "client_ip";
    public static final String CMBTOKEN = "cgi/cmb_token";
    private static final String COMMON_APPID_HEADER = "appid";
    private static final String COMMON_SID_HEADER = "sid";
    private static final String COMMON_SIG_HEADER = "sig";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final String EMAILACTIVE = "cgi/emailactive";
    private static final String EXTRA_PARAM = "extra";
    public static final String FORGET = "cgi/forget";
    private static final String FORMAT_JSON = "json";
    private static final String FORMAT_PARAM = "format";
    public static final String ISEXIST = "cgi/is_exist";
    private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final String LOGIN = "cgi/login";
    public static final String ME = "cgi/me";
    private static final String MIME_BOUNDARY = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f";
    private static final String OBJECT_PARAM = "object";
    public static final String PASSWORD = "cgi/password";
    private static final String PLAT_PARAM = "plat";
    public static final String REAUTH = "cgi/reauthorize";
    public static final String REFRESH = "cgi/refresh";
    public static final String REGISTER = "cgi/register";
    public static final String RESET = "cgi/reset";
    public static final String REVOKE = "cgi/revoke";
    private static final String SDK_ANDROID = "android";
    private static final String SDK_PARAM = "sdk";
    public static final String SENDMAIL = "cgi/sendmail";
    private static final String SID_PARAM = "sid";
    public static final String SSOTICKET = "cgi/ticket";
    private static final String STAGING_PARAM = "file";
    public static final String TAG = com/cleanmaster/sdk/cmloginsdkjar/Request.getSimpleName();
    public static final String THIRD = "cgi/third";
    private static final String TICKET_PARAM = "ticket";
    private static final String TOKEN_PARAM = "token";
    public static final String UPAVATAR = "cgi/up_avatar";
    public static final String UPNICKNAME = "cgi/up_nick";
    public static final String USERINFO = "cgi/userinfo";
    private static final String USER_AGENT_BASE = "FBAndroidSDK";
    private static final String USER_AGENT_HEADER = "User-Agent";
    private static String defaultBatchApplicationId;
    private static volatile String userAgent;
    private static Pattern versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private String batchEntryDependsOn;
    private String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;
    private Callback callback;
    private HttpMethod httpMethod;
    private boolean isCanceled;
    private String overriddenURL;
    private Bundle parameters;
    private String proxyPath;
    private String sid;
    private boolean skipClientToken;
    private String specificURL;
    private Object tag;
    private int timeoutInMilliseconds;
    private String version;

    public Request()
    {
        this(null, null, null, null, null);
    }

    public Request(String s1, Bundle bundle, HttpMethod httpmethod, Callback callback1)
    {
        this(null, null, bundle, httpmethod, callback1, null);
        specificURL = s1;
    }

    public Request(String s1, String s2)
    {
        this(s1, s2, null, null, null);
    }

    public Request(String s1, String s2, Bundle bundle, HttpMethod httpmethod)
    {
        this(s1, s2, bundle, httpmethod, null);
    }

    public Request(String s1, String s2, Bundle bundle, HttpMethod httpmethod, Callback callback1)
    {
        this(s1, s2, bundle, httpmethod, callback1, null);
    }

    public Request(String s1, String s2, Bundle bundle, HttpMethod httpmethod, Callback callback1, String s3)
    {
        batchEntryOmitResultOnSuccess = true;
        skipClientToken = false;
        isCanceled = false;
        timeoutInMilliseconds = 0;
        setSid(s1);
        proxyPath = s2;
        callback = callback1;
        version = s3;
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

    Request(String s1, URL url)
    {
        batchEntryOmitResultOnSuccess = true;
        skipClientToken = false;
        isCanceled = false;
        timeoutInMilliseconds = 0;
        setSid(s1);
        overriddenURL = url.toString();
        setHttpMethod(HttpMethod.GET);
        parameters = new Bundle();
    }

    private String appendParametersToBaseUrl(String s1)
    {
        android.net.Uri.Builder builder;
label0:
        {
            builder = (new android.net.Uri.Builder()).encodedPath(s1);
label1:
            do
            {
                String s2;
                for (Iterator iterator = parameters.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s2, parameterToString(s1).toString()))
                {
                    s2 = (String)iterator.next();
                    Object obj = parameters.get(s2);
                    s1 = ((String) (obj));
                    if (obj == null)
                    {
                        s1 = "";
                    }
                    if (!isSupportedParameterType(s1))
                    {
                        continue label1;
                    }
                }

                break label0;
            } while (httpMethod != HttpMethod.GET);
            throw new IllegalArgumentException(String.format("Unsupported parameter type for GET request: %s", new Object[] {
                s1.getClass().getSimpleName()
            }));
        }
        return builder.toString();
    }

    static HttpURLConnection createConnection(URL url, String s1)
    {
        url = (HttpURLConnection)url.openConnection();
        url.setRequestProperty("Connection", "close");
        url.setRequestProperty("User-Agent", getUserAgent());
        url.setRequestProperty("Content-Type", getMimeContentType());
        url.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        if (s1 == "cgi/login") goto _L2; else goto _L1
_L1:
        if (s1 != "cgi/register") goto _L4; else goto _L3
_L3:
        url.setRequestProperty("appid", Settings.getApplicationId());
        url.setRequestProperty("sid", Settings.getRegistSid());
        url.setRequestProperty("sig", Settings.getRegistSidSig());
_L6:
        url.setChunkedStreamingMode(0);
        return url;
_L4:
        if (s1 == "cgi/third")
        {
            url.setRequestProperty("appid", Settings.getApplicationId());
            url.setRequestProperty("sid", Settings.getThirdSid());
            url.setRequestProperty("sig", Settings.getThirdSidSig());
            continue; /* Loop/switch isn't completed */
        }
        if (s1 == "cgi/cmb_token")
        {
            url.setRequestProperty("appid", Settings.getApplicationId());
            url.setRequestProperty("sid", Settings.getThirdSid());
            url.setRequestProperty("sig", Settings.getThirdSidSig());
            continue; /* Loop/switch isn't completed */
        }
        if (s1 == "cgi/refresh")
        {
            url.setRequestProperty("appid", Settings.getApplicationId());
            url.setRequestProperty("sid", Settings.getThirdSid());
            url.setRequestProperty("sig", Settings.getThirdSidSig());
            continue; /* Loop/switch isn't completed */
        }
_L2:
        url.setRequestProperty("appid", Settings.getApplicationId());
        url.setRequestProperty("sid", Settings.getLoginSid());
        url.setRequestProperty("sig", Settings.getLoginSidSig());
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Response executeAndWait(Request request)
    {
        request = executeBatchAndWait(new Request[] {
            request
        });
        if (request == null || request.size() != 1)
        {
            throw new CmLoginSdkException("invalid state: expected a single response");
        } else
        {
            return (Response)request.get(0);
        }
    }

    public static List executeBatchAndWait(RequestBatch requestbatch)
    {
        Validate.notEmptyAndContainsNoNulls(requestbatch, "requests");
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = toHttpConnection(requestbatch);
        }
        catch (Exception exception)
        {
            List list = Response.constructErrorResponses(requestbatch.getRequests(), null, new CmLoginSdkException(exception));
            runCallbacks(requestbatch, list);
            return list;
        }
        return executeConnectionAndWait(httpurlconnection, requestbatch);
    }

    public static List executeBatchAndWait(Collection collection)
    {
        return executeBatchAndWait(new RequestBatch(collection));
    }

    public static transient List executeBatchAndWait(Request arequest[])
    {
        Validate.notNull(arequest, "requests");
        return executeBatchAndWait(((Collection) (Arrays.asList(arequest))));
    }

    public static RequestAsyncTask executeBatchAsync(RequestBatch requestbatch)
    {
        Validate.notEmptyAndContainsNoNulls(requestbatch, "requests");
        requestbatch = new RequestAsyncTask(requestbatch);
        requestbatch.executeOnSettingsExecutor();
        return requestbatch;
    }

    public static RequestAsyncTask executeBatchAsync(Collection collection)
    {
        return executeBatchAsync(new RequestBatch(collection));
    }

    public static transient RequestAsyncTask executeBatchAsync(Request arequest[])
    {
        Validate.notNull(arequest, "requests");
        return executeBatchAsync(((Collection) (Arrays.asList(arequest))));
    }

    public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, RequestBatch requestbatch)
    {
        List list = Response.fromHttpConnection(httpurlconnection, requestbatch);
        Utility.disconnectQuietly(httpurlconnection);
        int i1 = requestbatch.size();
        if (i1 != list.size())
        {
            httpurlconnection = new CmLoginSdkException(String.format("Received %d responses while expecting %d", new Object[] {
                Integer.valueOf(list.size()), Integer.valueOf(i1)
            }));
            httpurlconnection.setExceptionRet(20005);
            throw httpurlconnection;
        } else
        {
            runCallbacks(requestbatch, list);
            return list;
        }
    }

    public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, Collection collection)
    {
        return executeConnectionAndWait(httpurlconnection, new RequestBatch(collection));
    }

    public static RequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpurlconnection, RequestBatch requestbatch)
    {
        Validate.notNull(httpurlconnection, "connection");
        httpurlconnection = new RequestAsyncTask(httpurlconnection, requestbatch);
        requestbatch.setCallbackHandler(handler);
        httpurlconnection.executeOnSettingsExecutor();
        return httpurlconnection;
    }

    public static RequestAsyncTask executeConnectionAsync(HttpURLConnection httpurlconnection, RequestBatch requestbatch)
    {
        return executeConnectionAsync(null, httpurlconnection, requestbatch);
    }

    public static RequestAsyncTask executePostRequestAsync(String s1, String s2, Callback callback1)
    {
        return newPostRequest(s1, s2, callback1).executeAsync();
    }

    public static void executeWriteFile(Request request, File file)
    {
        if (request == null || file == null)
        {
            return;
        }
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = toHttpConnection(new RequestBatch(Arrays.asList(new Request[] {
                request
            })));
        }
        // Misplaced declaration of an exception variable
        catch (Request request)
        {
            return;
        }
        Response.writeResponseToFile(httpurlconnection, request, file);
        Utility.disconnectQuietly(httpurlconnection);
    }

    private static String getBatchAppId(RequestBatch requestbatch)
    {
        if (!Utility.isNullOrEmpty(requestbatch.getBatchApplicationId()))
        {
            return requestbatch.getBatchApplicationId();
        } else
        {
            return defaultBatchApplicationId;
        }
    }

    public static final String getDefaultBatchApplicationId()
    {
        return defaultBatchApplicationId;
    }

    private String getGraphPathWithVersion()
    {
        if (versionPattern.matcher(proxyPath).matches())
        {
            return proxyPath;
        } else
        {
            return String.format("%s/%s", new Object[] {
                version, proxyPath
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
                "FBAndroidSDK", "0.0.1"
            });
        }
        return userAgent;
    }

    private static boolean hasOnProgressCallbacks(RequestBatch requestbatch)
    {
        for (Iterator iterator = requestbatch.getCallbacks().iterator(); iterator.hasNext();)
        {
            if ((RequestBatch.Callback)iterator.next() instanceof RequestBatch.OnProgressCallback)
            {
                return true;
            }
        }

        for (requestbatch = requestbatch.iterator(); requestbatch.hasNext();)
        {
            if (((Request)requestbatch.next()).getCallback() instanceof OnProgressCallback)
            {
                return true;
            }
        }

        return false;
    }

    private static boolean isMeRequest(String s1)
    {
        Matcher matcher = versionPattern.matcher(s1);
        if (matcher.matches())
        {
            s1 = matcher.group(1);
        }
        return s1.startsWith("me/") || s1.startsWith("/me/");
    }

    private static boolean isSupportedAttachmentType(Object obj)
    {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelFileDescriptorWithMimeType);
    }

    private static boolean isSupportedParameterType(Object obj)
    {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static Request newCmbTokenRequest(String s1, String s2, String s3, String s4, String s5, String s6, String s7, boolean flag, 
            String s8, String s9, CmProxyCmbTokenCallback cmproxycmbtokencallback)
    {
        cmproxycmbtokencallback = new i(cmproxycmbtokencallback);
        Settings.setThirdSid(s1);
        Settings.setThirdSidSig(s2);
        s1 = new Bundle();
        s1.putString("cmuuid", s8);
        s1.putString("cmversion", s9);
        s1.putString("cmb_token", s3);
        s1.putString("uuid", s4);
        s1.putString("user", s5);
        s1.putString("cnl", s6);
        s2 = Long.toString(System.currentTimeMillis());
        s1.putString("tstamp", s2);
        s2 = (new StringBuilder()).append(s5).append(s3).append(s4).append(s6).append(s7).append(s2).toString().getBytes();
        s3 = new CRC32();
        s3.update(s2, 0, s2.length);
        s1.putString("vc", Long.toString(s3.getValue() & -1L));
        if (flag)
        {
            s1.putString("extra", "userinfo");
        }
        return new Request(null, "cgi/cmb_token", s1, HttpMethod.POST, cmproxycmbtokencallback);
    }

    public static Request newDeleteObjectRequest(String s1, String s2, Callback callback1)
    {
        return new Request(s1, s2, null, HttpMethod.DELETE, callback1);
    }

    public static Request newEmailActiveRequest(String s1, String s2, String s3, String s4, String s5, String s6, CmProxyCallback cmproxycallback)
    {
        cmproxycallback = new n(cmproxycallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putString("code", s4);
        s1.putString("cmuuid", s5);
        s1.putString("cmversion", s6);
        return new Request(null, "cgi/emailactive", s1, HttpMethod.POST, cmproxycallback);
    }

    public static Request newForgetRequest(String s1, String s2, String s3, String s4, String s5, CmProxyForgetCallback cmproxyforgetcallback)
    {
        cmproxyforgetcallback = new h(cmproxyforgetcallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("address", s3);
        s1.putString("type", "2");
        s1.putString("cmuuid", s4);
        s1.putString("cmversion", s5);
        return new Request(null, "cgi/forget", s1, HttpMethod.POST, cmproxyforgetcallback);
    }

    public static Request newIsExistRequest(String s1, String s2, String s3, String s4, String s5, CmProxyIsExistCallback cmproxyisexistcallback)
    {
        cmproxyisexistcallback = new l(cmproxyisexistcallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("name", s3);
        s1.putString("cmuuid", s4);
        s1.putString("cmversion", s5);
        return new Request(null, "cgi/is_exist", s1, HttpMethod.POST, cmproxyisexistcallback);
    }

    public static Request newLoginRequest(String s1, String s2, String s3, String s4, String s5, boolean flag, String s6, String s7, 
            CmProxyLoginLoginCallback cmproxyloginlogincallback)
    {
        cmproxyloginlogincallback = new p(cmproxyloginlogincallback);
        Settings.setLoginSidSig(s2);
        Settings.setLoginSid(s1);
        s1 = new Bundle();
        s1.putString("name", s3);
        s1.putString("password", s4);
        s1.putString("cmuuid", s6);
        s1.putString("cmversion", s7);
        if (flag)
        {
            s1.putString("extra", "userinfo");
        }
        if (s5 != null)
        {
            s1.putString("code", s5);
        }
        return new Request(null, "cgi/login", s1, HttpMethod.POST, cmproxyloginlogincallback);
    }

    public static Request newMeRequest(String s1, String s2, String s3, String s4, String s5, CmProxyMeCallback cmproxymecallback)
    {
        cmproxymecallback = new t(cmproxymecallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putString("cmuuid", s4);
        s1.putString("cmversion", s5);
        return new Request(s3, "cgi/me", s1, HttpMethod.POST, cmproxymecallback);
    }

    public static Request newPasswordRequest(String s1, String s2, String s3, String s4, String s5, String s6, String s7, CmProxyPasswordCallback cmproxypasswordcallback)
    {
        cmproxypasswordcallback = new g(cmproxypasswordcallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putString("old_pwd", s4);
        s1.putString("new_pwd", s5);
        s1.putString("cmuuid", s6);
        s1.putString("cmversion", s7);
        return new Request(s3, "cgi/password", s1, HttpMethod.POST, cmproxypasswordcallback);
    }

    public static Request newPostRequest(String s1, String s2, Callback callback1)
    {
        return new Request(s1, s2, null, HttpMethod.POST, callback1);
    }

    public static Request newReFreshRequest(String s1, String s2, String s3, String s4, String s5, CmProxyRefreshCallback cmproxyrefreshcallback)
    {
        cmproxyrefreshcallback = new j(cmproxyrefreshcallback);
        Settings.setThirdSid(s1);
        Settings.setThirdSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putString("cmuuid", s4);
        s1.putString("cmversion", s5);
        return new Request(null, "cgi/refresh", s1, HttpMethod.POST, cmproxyrefreshcallback);
    }

    public static Request newReauthRequest(String s1, String s2, String s3, String s4, String s5, String s6, String s7, CmProxyReauthCallback cmproxyreauthcallback)
    {
        cmproxyreauthcallback = new v(cmproxyreauthcallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putString("package", s4);
        s1.putString("signature", s5);
        s1.putString("cmuuid", s6);
        s1.putString("cmversion", s7);
        return new Request(s3, "cgi/reauthorize", s1, HttpMethod.POST, cmproxyreauthcallback);
    }

    public static Request newRegisterRequest(String s1, String s2, String s3, String s4, String s5, boolean flag, String s6, String s7, 
            CmProxyLoginRegisterCallback cmproxyloginregistercallback)
    {
        cmproxyloginregistercallback = new e(cmproxyloginregistercallback);
        Settings.setRegistSid(s1);
        Settings.setRegistSidSig(s2);
        s1 = new Bundle();
        s1.putString("name", s3);
        s1.putString("password", s4);
        s1.putInt("code_type", 1);
        s1.putString("cmuuid", s6);
        s1.putString("cmversion", s7);
        if (flag)
        {
            s1.putString("extra", "userinfo");
        }
        if (s5 != null)
        {
            s1.putString("code", s5);
        }
        return new Request(null, "cgi/register", s1, HttpMethod.POST, cmproxyloginregistercallback);
    }

    public static Request newResetRequest(String s1, String s2, String s3, String s4, String s5, String s6, String s7, CmProxyResetCallback cmproxyresetcallback)
    {
        cmproxyresetcallback = new k(cmproxyresetcallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("code", s3);
        s1.putString("address", s4);
        s1.putString("password", s5);
        s1.putString("cmuuid", s6);
        s1.putString("cmversion", s7);
        return new Request(null, "cgi/reset", s1, HttpMethod.POST, cmproxyresetcallback);
    }

    public static Request newRevokeRequest(String s1, String s2, String s3, String s4, String s5, CmProxyRevokeCallback cmproxyrevokecallback)
    {
        cmproxyrevokecallback = new w(cmproxyrevokecallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putString("cmuuid", s4);
        s1.putString("cmversion", s5);
        return new Request(s3, "cgi/revoke", s1, HttpMethod.POST, cmproxyrevokecallback);
    }

    public static Request newSendMailRequest(String s1, String s2, String s3, int i1, String s4, String s5, String s6, CmProxySendMailCallback cmproxysendmailcallback)
    {
        cmproxysendmailcallback = new m(cmproxysendmailcallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putInt("type", i1);
        if (s4 != null)
        {
            s1.putString("email", s4);
        }
        s1.putInt("code_type", 1);
        s1.putString("cmuuid", s5);
        s1.putString("cmversion", s6);
        return new Request(null, "cgi/sendmail", s1, HttpMethod.POST, cmproxysendmailcallback);
    }

    public static Request newSsoTicketRequest(String s1, CmProxySsoTicketCallback cmproxyssoticketcallback)
    {
        cmproxyssoticketcallback = new u(cmproxyssoticketcallback);
        Bundle bundle = new Bundle();
        bundle.putString("sid", s1);
        return new Request(s1, "cgi/ticket", bundle, HttpMethod.POST, cmproxyssoticketcallback);
    }

    public static Request newThirdRequest(String s1, String s2, String s3, String s4, String s5, boolean flag, String s6, String s7, 
            CmProxyLoginThirdCallback cmproxyloginthirdcallback)
    {
        cmproxyloginthirdcallback = new q(cmproxyloginthirdcallback);
        Settings.setThirdSid(s1);
        Settings.setThirdSidSig(s2);
        s1 = new Bundle();
        s1.putString("token", s3);
        s1.putString("plat", s5);
        s1.putString("cmuuid", s6);
        s1.putString("cmversion", s7);
        if (flag)
        {
            s1.putString("extra", "userinfo");
        }
        if (s4 != null)
        {
            s1.putString("code", s4);
        }
        return new Request(null, "cgi/third", s1, HttpMethod.POST, cmproxyloginthirdcallback);
    }

    public static Request newUpAvatarRequest(String s1, String s2, String s3, Bitmap bitmap, String s4, String s5, CmProxyUpAvatarCallback cmproxyupavatarcallback)
    {
        cmproxyupavatarcallback = new x(cmproxyupavatarcallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putParcelable("pic", bitmap);
        s1.putString("cmuuid", s4);
        s1.putString("cmversion", s5);
        return new Request(s3, "cgi/up_avatar", s1, HttpMethod.POST, cmproxyupavatarcallback);
    }

    public static Request newUpNicknameRequest(String s1, String s2, String s3, String s4, String s5, String s6, CmProxyUpNicknameCallback cmproxyupnicknamecallback)
    {
        cmproxyupnicknamecallback = new f(cmproxyupnicknamecallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putString("nick", s4);
        s1.putString("cmuuid", s5);
        s1.putString("cmversion", s6);
        return new Request(s3, "cgi/up_nick", s1, HttpMethod.POST, cmproxyupnicknamecallback);
    }

    public static Request newUserinfoRequest(String s1, String s2, String s3, String s4, String s5, CmProxyUserinfoCallback cmproxyuserinfocallback)
    {
        cmproxyuserinfocallback = new s(cmproxyuserinfocallback);
        Settings.setLoginSid(s1);
        Settings.setLoginSidSig(s2);
        s1 = new Bundle();
        s1.putString("sid", s3);
        s1.putString("cmuuid", s4);
        s1.putString("cmversion", s5);
        return new Request(s3, "cgi/userinfo", s1, HttpMethod.POST, cmproxyuserinfocallback);
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

    private static void processRequest(RequestBatch requestbatch, Logger logger, int i1, URL url, OutputStream outputstream)
    {
        url = new aa(outputstream, logger);
        if (i1 == 1)
        {
            requestbatch = requestbatch.get(0);
            outputstream = new HashMap();
            Iterator iterator = ((Request) (requestbatch)).parameters.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                Object obj = ((Request) (requestbatch)).parameters.get(s1);
                if (isSupportedAttachmentType(obj))
                {
                    outputstream.put(s1, new y(requestbatch, obj));
                }
            } while (true);
            if (logger != null)
            {
                logger.append("  Parameters:\n");
            }
            serializeParameters(((Request) (requestbatch)).parameters, url, requestbatch);
            if (logger != null)
            {
                logger.append("  Attachments:\n");
            }
            serializeAttachments(outputstream, url);
            return;
        }
        outputstream = getBatchAppId(requestbatch);
        if (Utility.isNullOrEmpty(outputstream))
        {
            throw new CmLoginSdkException("At least one request in a batch must have an open CmLoginSession, or a default app ID must be specified.");
        }
        url.a("batch_app_id", outputstream);
        outputstream = new HashMap();
        serializeRequestsAsJSON(url, requestbatch, outputstream);
        if (logger != null)
        {
            logger.append("  Attachments:\n");
        }
        serializeAttachments(outputstream, url);
    }

    static void runCallbacks(RequestBatch requestbatch, List list)
    {
label0:
        {
            int j1 = requestbatch.size();
            ArrayList arraylist = new ArrayList();
            for (int i1 = 0; i1 < j1; i1++)
            {
                Request request = requestbatch.get(i1);
                if (request.callback != null)
                {
                    arraylist.add(new Pair(request.callback, list.get(i1)));
                }
            }

            if (arraylist.size() > 0)
            {
                list = new o(arraylist, requestbatch);
                requestbatch = requestbatch.getCallbackHandler();
                if (requestbatch != null)
                {
                    break label0;
                }
                list.run();
            }
            return;
        }
        requestbatch.post(list);
    }

    private static void serializeAttachments(Map map, aa aa1)
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            y y1 = (y)map.get(s1);
            if (isSupportedAttachmentType(y1.b()))
            {
                aa1.a(s1, y1.b(), y1.a());
            }
        } while (true);
    }

    private static void serializeParameters(Bundle bundle, aa aa1, Request request)
    {
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            Object obj = bundle.get(s1);
            if (isSupportedParameterType(obj))
            {
                aa1.a(s1, obj, request);
            }
        } while (true);
    }

    private static void serializeRequestsAsJSON(aa aa1, Collection collection, Map map)
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ((Request)iterator.next()).serializeToBatch(jsonarray, map)) { }
        aa1.a("batch", jsonarray, collection);
    }

    private void serializeToBatch(JSONArray jsonarray, Map map)
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
        jsonobject.put("relative_url", getUrlForBatchedRequest());
        jsonobject.put("method", httpMethod);
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
                String s1 = String.format("%s%d", new Object[] {
                    "file", Integer.valueOf(map.size())
                });
                arraylist.add(s1);
                map.put(s1, new y(this, obj));
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            jsonobject.put("attached_files", TextUtils.join(",", arraylist));
        }
        jsonarray.put(jsonobject);
    }

    static final void serializeToUrlConnection(RequestBatch requestbatch, HttpURLConnection httpurlconnection)
    {
        Logger logger;
        URL url;
        int j1;
        logger = new Logger("Request");
        j1 = requestbatch.size();
        HttpMethod httpmethod;
        boolean flag;
        if (j1 == 1)
        {
            httpmethod = requestbatch.get(0).httpMethod;
        } else
        {
            httpmethod = HttpMethod.POST;
        }
        httpurlconnection.setRequestMethod(httpmethod.name());
        url = httpurlconnection.getURL();
        logger.append("Request:\n");
        logger.appendKeyValue("Id", requestbatch.getId());
        logger.appendKeyValue("URL", url);
        logger.appendKeyValue("Method", httpurlconnection.getRequestMethod());
        logger.appendKeyValue("User-Agent", httpurlconnection.getRequestProperty("User-Agent"));
        logger.appendKeyValue("Content-Type", httpurlconnection.getRequestProperty("Content-Type"));
        httpurlconnection.setConnectTimeout(requestbatch.getTimeout());
        httpurlconnection.setReadTimeout(requestbatch.getTimeout());
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
        if (!hasOnProgressCallbacks(requestbatch))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        Object obj = new b(requestbatch.getCallbackHandler());
        processRequest(requestbatch, null, j1, url, ((OutputStream) (obj)));
        int i1 = ((b) (obj)).a();
        obj = ((b) (obj)).b();
        httpurlconnection = new c(new BufferedOutputStream(httpurlconnection.getOutputStream()), requestbatch, ((Map) (obj)), i1);
_L1:
        processRequest(requestbatch, logger, j1, url, httpurlconnection);
        httpurlconnection.close();
        logger.log();
        return;
        httpurlconnection = new BufferedOutputStream(httpurlconnection.getOutputStream());
          goto _L1
        requestbatch;
        httpurlconnection = null;
_L3:
        if (httpurlconnection != null)
        {
            httpurlconnection.close();
        }
        throw requestbatch;
        requestbatch;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static final void setDefaultBatchApplicationId(String s1)
    {
        defaultBatchApplicationId = s1;
    }

    public static HttpURLConnection toHttpConnection(RequestBatch requestbatch)
    {
        try
        {
            if (!$assertionsDisabled && requestbatch.size() != 1)
            {
                throw new AssertionError();
            }
        }
        // Misplaced declaration of an exception variable
        catch (RequestBatch requestbatch)
        {
            throw new CmLoginSdkException("could not construct URL for request", requestbatch);
        }
        if (requestbatch.size() != 1) goto _L2; else goto _L1
_L1:
        Object obj = new URL(requestbatch.get(0).getUrlForSingleRequest());
_L4:
        try
        {
            obj = createConnection(((URL) (obj)), requestbatch.get(0).getProxyPath());
            serializeToUrlConnection(requestbatch, ((HttpURLConnection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (RequestBatch requestbatch)
        {
            requestbatch = new CmLoginSdkException(requestbatch);
            requestbatch.setExceptionRet(20004);
            throw requestbatch;
        }
        // Misplaced declaration of an exception variable
        catch (RequestBatch requestbatch)
        {
            requestbatch = new CmLoginSdkException("could not construct request body", requestbatch);
            requestbatch.setExceptionRet(20002);
            throw requestbatch;
        }
        // Misplaced declaration of an exception variable
        catch (RequestBatch requestbatch)
        {
            requestbatch = new CmLoginSdkException("could not construct request body", requestbatch);
            requestbatch.setExceptionRet(20001);
            throw requestbatch;
        }
        return ((HttpURLConnection) (obj));
_L2:
        obj = new URL(ServerProtocol.getProxyUrlBase());
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static HttpURLConnection toHttpConnection(Collection collection)
    {
        Validate.notEmptyAndContainsNoNulls(collection, "requests");
        return toHttpConnection(new RequestBatch(collection));
    }

    public static transient HttpURLConnection toHttpConnection(Request arequest[])
    {
        return toHttpConnection(((Collection) (Arrays.asList(arequest))));
    }

    public void addCommonParametersForLogin()
    {
        if (!skipClientToken && !parameters.containsKey("token") && !parameters.containsKey("appid") && !parameters.containsKey("plat") && !parameters.containsKey("extra"))
        {
            String s1 = Settings.getApplicationId();
            String s2 = Settings.getFbId();
            String s3 = Settings.getFbToken();
            Settings.getClientLoginSid();
            Settings.getLoginSidSig();
            if (!Utility.isNullOrEmpty(s1))
            {
                parameters.putString("appid", s1);
            }
            if (!Utility.isNullOrEmpty(s2))
            {
                parameters.putString("plat", s2);
            }
            if (!Utility.isNullOrEmpty(s3))
            {
                parameters.putString("token", s3);
            }
        }
    }

    public void addCommonParametersForPlatfrom()
    {
        if (!skipClientToken && !parameters.containsKey("access_token"))
        {
            String s1 = Settings.getAccessToken();
            if (!Utility.isNullOrEmpty(s1))
            {
                parameters.putString("access_token", s1);
            }
        }
    }

    public final Response executeAndWait()
    {
        return executeAndWait(this);
    }

    public final RequestAsyncTask executeAsync()
    {
        return executeBatchAsync(new Request[] {
            this
        });
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

    public final HttpMethod getHttpMethod()
    {
        return httpMethod;
    }

    public final Bundle getParameters()
    {
        return parameters;
    }

    public final String getProxyPath()
    {
        return proxyPath;
    }

    public String getSid()
    {
        return sid;
    }

    public final Object getTag()
    {
        return tag;
    }

    public int getTimeout()
    {
        return timeoutInMilliseconds;
    }

    final String getUrlForBatchedRequest()
    {
        if (overriddenURL != null)
        {
            throw new CmLoginSdkException("Can't override URL for a batch request");
        } else
        {
            return getGraphPathWithVersion();
        }
    }

    final String getUrlForSingleRequest()
    {
        if (specificURL != null)
        {
            return specificURL;
        }
        if (overriddenURL != null)
        {
            return overriddenURL.toString();
        } else
        {
            return String.format("%s/%s", new Object[] {
                ServerProtocol.getProxyUrlBase(), getGraphPathWithVersion()
            });
        }
    }

    public final String getVersion()
    {
        return version;
    }

    public boolean isCanceled()
    {
        return isCanceled;
    }

    public final void setBatchEntryDependsOn(String s1)
    {
        batchEntryDependsOn = s1;
    }

    public final void setBatchEntryName(String s1)
    {
        batchEntryName = s1;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean flag)
    {
        batchEntryOmitResultOnSuccess = flag;
    }

    public final void setCallback(Callback callback1)
    {
        callback = callback1;
    }

    public void setCancel()
    {
        isCanceled = true;
    }

    public final void setHttpMethod(HttpMethod httpmethod)
    {
        if (overriddenURL != null && httpmethod != HttpMethod.GET)
        {
            throw new CmLoginSdkException("Can't change HTTP method on request with overridden URL.");
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

    public final void setProxyPath(String s1)
    {
        proxyPath = s1;
    }

    public void setSid(String s1)
    {
        sid = s1;
    }

    public final void setSkipClientToken(boolean flag)
    {
        skipClientToken = flag;
    }

    public final void setTag(Object obj)
    {
        tag = obj;
    }

    public void setTimeout(int i1)
    {
        timeoutInMilliseconds = i1;
    }

    public final void setVersion(String s1)
    {
        version = s1;
    }

    public String toString()
    {
        return (new StringBuilder("{Request:  sid: ")).append(getSid()).append(", proxyPath: ").append(proxyPath).append(", httpMethod: ").append(httpMethod).append(", parameters: ").append(parameters).append("}").toString();
    }

    static 
    {
        boolean flag;
        if (!com/cleanmaster/sdk/cmloginsdkjar/Request.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



    private class OnProgressCallback
        implements Callback
    {

        public abstract void onProgress(long l1, long l2);
    }


    private class ParcelFileDescriptorWithMimeType
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new z();
        private final String a;
        private final ParcelFileDescriptor b;

        public final String a()
        {
            return a;
        }

        public final ParcelFileDescriptor b()
        {
            return b;
        }

        public int describeContents()
        {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeString(a);
            parcel.writeFileDescriptor(b.getFileDescriptor());
        }


        private ParcelFileDescriptorWithMimeType(Parcel parcel)
        {
            a = parcel.readString();
            b = parcel.readFileDescriptor();
        }

        ParcelFileDescriptorWithMimeType(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }

}
