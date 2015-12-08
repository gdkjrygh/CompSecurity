// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.content.ContentValues;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.shortcircuit.ProfileServiceToken;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.concurrent.ExecutorAsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ExponentialTime;
import com.skype.android.util.HttpServicesConfiguration;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.PerformanceLog;
import java.io.EOFException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.mnv:
//            b, c, ProfileServiceConfiguration, MnvAnalytics, 
//            ProfileServicesResponse, MnvUtil, MnvCases, e, 
//            d

public class ProfileServicesClient
    implements AsyncCallback
{
    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a GET;
        public static final a POST;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesClient$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            GET = new a("GET", 0);
            POST = new a("POST", 1);
            $VALUES = (new a[] {
                GET, POST
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int CONNECTION_ERROR = -1;
    private static final String HTTP_CANNOT_DECODE_CONTENT_EXCEPTION = "MnvHttpCannotDecodeContentException";
    private static final String HTTP_CONNECTION_EXCEPTION = "MnvHttpConnectionException";
    private static final String HTTP_CONNECTION_IO_EXCEPTION = "MnvHttpConnectionIOException";
    private static final String HTTP_GET_DATA_EXCEPTION = "MnvHttpGetDataException";
    private static final String HTTP_POST_DATA_EXCEPTION = "MnvHttpPostDataException";
    private static final String HTTP_POST_DATA_IO_EXCEPTION = "MnvHttpPostDataIOException";
    private static final String HTTP_POST_DATA_PROTOCOL_EXCEPTION = "MnvHttpPostDataProtocolException";
    private static final String HTTP_RESPONSE_CODE_EOF_EXCEPTION = "MnvHttpResponseCodeEOFException";
    private static final String HTTP_RESPONSE_CODE_IO_EXCEPTION = "MnvHttpResponseCodeIOException";
    private static final String HTTP_RESPONSE_CODE_WHEN_POST = "MnvHttpResponseCodeWhenPost";
    private static final int INITIAL_TIME = 500;
    private static final int MAX_RETRIES = 2;
    private static final int MAX_TIME = 5000;
    private static final Logger log = Logger.getLogger("ProfileServicesClient");
    private final com.skype.android.util.HttpUtil.Encoding acceptEncoding;
    private AccountProvider accountProvider;
    private final AsyncService async = new ExecutorAsyncService(Executors.newSingleThreadExecutor());
    private d callback;
    private int connectTimeout;
    private HttpURLConnection connection;
    private ContactUtil contactUtil;
    private EcsConfiguration ecsConfiguration;
    private final ExponentialTime expTimeDelay = new ExponentialTime();
    private Map headers;
    private final HttpUtil httpUtil;
    private a method;
    private final MnvAnalytics mnvAnalytics;
    private final MnvCases mnvCases;
    private final b mnvUserData = new b();
    private final MnvUtil mnvUtil;
    private final NetworkUtil networkUtil;
    private String payload;
    private final String profileServiceUri;
    private final ProfileServicesResponse profileServicesResponse;
    private int readTimeout;
    private String scenario;
    private ProfileServiceToken token;

    public ProfileServicesClient(MnvUtil mnvutil, MnvCases mnvcases, HttpUtil httputil, MnvAnalytics mnvanalytics, NetworkUtil networkutil, ContactUtil contactutil, AccountProvider accountprovider, 
            ProfileServicesResponse profileservicesresponse, EcsConfiguration ecsconfiguration)
    {
        connectTimeout = -1;
        readTimeout = -1;
        mnvUtil = mnvutil;
        mnvCases = mnvcases;
        httpUtil = httputil;
        mnvAnalytics = mnvanalytics;
        profileServicesResponse = profileservicesresponse;
        ecsConfiguration = ecsconfiguration;
        mnvutil = getConfiguration();
        profileServiceUri = ((HttpServicesConfiguration) (mnvutil)).a;
        acceptEncoding = ((HttpServicesConfiguration) (mnvutil)).b;
        networkUtil = networkutil;
        contactUtil = contactutil;
        accountProvider = accountprovider;
    }

    private Map buildHeaders()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("PS-ApplicationId", mnvUserData.getAppId());
        hashmap.put("X-CallerEnvironmentId", mnvUserData.getCallerEnvironmentId());
        hashmap.put("PS-Scenario", mnvUserData.getScenario());
        hashmap.put(token.getTokenHeader(), token.getToken());
        return hashmap;
    }

    private String buildPayload(c c1, ContentValues contentvalues)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add(getUserInputPhoneNumber(contentvalues, mnvUserData));
        arraylist.add(getUserInputCountry(contentvalues, mnvUserData));
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[];

            static 
            {
                $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi = new int[c.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[c.PRE_CHECK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[c.ADD_VERIFIED_SOURCE_MSA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[c.ADD_PHONE_VERIFY_BY_SMS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[c.EDIT_PHONE_VERIFY_BY_SMS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[c.ADD_PHONE_VERIFY_BY_VOICE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[c.EDIT_PHONE_VERIFY_BY_VOICE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[c.EDIT_RESEND_PIN_BY_SMS.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[c.EDIT_RESEND_PIN_BY_VOICE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$ProfileServicesApi[c.EDIT_VERIFY_PIN.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.skype.android.app.mnv.ProfileServicesApi[c1.ordinal()];
        JVM INSTR tableswitch 1 9: default 100
    //                   1 129
    //                   2 147
    //                   3 133
    //                   4 133
    //                   5 133
    //                   6 133
    //                   7 133
    //                   8 133
    //                   9 162;
           goto _L1 _L2 _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        log.info((new StringBuilder("MNV unknown payload case: ")).append(c1.name()).toString());
        return "";
_L2:
        return "";
_L4:
        arraylist.add(mnvUserData.getLanguage());
_L7:
        return buildPayload(c1.getPayload(), arraylist.toArray());
_L5:
        arraylist.add(getUserInputPinCode(contentvalues));
        if (true) goto _L7; else goto _L6
_L6:
    }

    private String buildPayload(String s, Object aobj[])
    {
        s = String.format(Locale.US, s, aobj);
        log.info((new StringBuilder("MNV formatted payload: ")).append(s).toString());
        return s;
    }

    private void debugRequestHeader(HttpURLConnection httpurlconnection)
    {
        Iterator iterator = httpurlconnection.getRequestProperties().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s != null)
            {
                Iterator iterator1 = ((List)httpurlconnection.getRequestProperties().get(s)).iterator();
                while (iterator1.hasNext()) 
                {
                    String s1 = (String)iterator1.next();
                    log.info((new StringBuilder("MNV HTTP request header: ")).append(s).append(" => ").append(s1).toString());
                }
            }
        } while (true);
    }

    private void debugResponseHeader(HttpURLConnection httpurlconnection)
        throws IOException
    {
        int i = httpurlconnection.getResponseCode();
        log.info((new StringBuilder("MNV http response code: ")).append(i).toString());
        Iterator iterator = httpurlconnection.getHeaderFields().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s != null)
            {
                Iterator iterator1 = ((List)httpurlconnection.getHeaderFields().get(s)).iterator();
                while (iterator1.hasNext()) 
                {
                    String s1 = (String)iterator1.next();
                    log.info((new StringBuilder("MNV HTTP response header: ")).append(s).append(" => ").append(s1).toString());
                }
            }
        } while (true);
    }

    private HttpServicesConfiguration getConfiguration()
    {
        return (new ProfileServiceConfiguration(ecsConfiguration)).getProfileServiceUrl();
    }

    private HttpURLConnection getConnection(a a1)
    {
        HttpURLConnection httpurlconnection;
        PerformanceLog.f.b();
        httpurlconnection = httpUtil.b(profileServiceUri);
        log.info((new StringBuilder("MNV getConnection: Opened connection with Uri: ")).append(profileServiceUri).toString());
        httpurlconnection.setRequestMethod(a1.name());
        if (!acceptEncoding.equals(com.skype.android.util.HttpUtil.Encoding.c)) goto _L2; else goto _L1
_L1:
        httpurlconnection.addRequestProperty("Accept-Encoding", acceptEncoding.name());
_L5:
        if (connectTimeout >= 0)
        {
            httpurlconnection.setConnectTimeout(connectTimeout);
        }
        if (readTimeout >= 0)
        {
            httpurlconnection.setReadTimeout(readTimeout);
        }
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setDoInput(true);
        if (!a1.equals(a.POST)) goto _L4; else goto _L3
_L3:
        httpurlconnection.setDoOutput(true);
        a1 = httpurlconnection;
_L6:
        log.info((new StringBuilder("MNV device information: ")).append(getDeviceInfo()).toString());
        return a1;
_L2:
        httpurlconnection.setRequestProperty("Content-Type", "application/json");
        httpurlconnection.setRequestProperty("Accept", "application/json");
          goto _L5
        a1;
        log.severe((new StringBuilder("MNV ProfileServicesRestful.getConnection IOException: ")).append(a1.getMessage()).toString());
        PerformanceLog.f.c();
        long l = PerformanceLog.f.a("IOException");
        mnvAnalytics.reportServerError("MnvHttpConnectionIOException", Long.toString(l), getDeviceInfo(), AnalyticsEvent.cB);
        a1 = null;
          goto _L6
_L4:
        httpurlconnection.setDoOutput(false);
        a1 = httpurlconnection;
          goto _L6
        a1;
        log.severe((new StringBuilder("MNV ProfileServicesRestful.getConnection Exception: ")).append(a1.getMessage()).toString());
        PerformanceLog.f.c();
        long l1 = PerformanceLog.f.a("Exception");
        mnvAnalytics.reportServerError("MnvHttpConnectionException", Long.toString(l1), getDeviceInfo(), AnalyticsEvent.cB);
        a1 = null;
          goto _L6
    }

    private String getData()
    {
        String s1;
        boolean flag;
        int i;
        expTimeDelay.b();
        flag = false;
        s1 = null;
        i = 0;
_L8:
        String s = s1;
        connection = getConnection(method);
        s = s1;
        httpUtil.a(connection, headers);
        s = s1;
        int j = getResponseCode(connection);
        if (j < 200 || j > 300) goto _L2; else goto _L1
_L1:
        s = s1;
        s1 = getResponse(connection);
        s = s1;
        mnvAnalytics.reportSuccessCount(Integer.toString(i), AnalyticsEvent.cz);
          goto _L3
_L6:
        s = s1;
        String s2;
        mnvAnalytics.reportServerError("MnvHttpResponseCodeWhenRetry", s2, getDeviceInfo(), AnalyticsEvent.cB);
        s = s1;
        mnvAnalytics.reportServerError("MnvHttpRetryCount", Integer.toString(i), getDeviceInfo(), AnalyticsEvent.cB);
        s = s1;
        getMsnServer(connection);
        s = s1;
        log.severe(String.format("MNV ProfileServicesRestful retries: %d, response code: %s", new Object[] {
            Integer.valueOf(i), s2
        }));
        s = s1;
        j = expTimeDelay.a();
        s = s1;
        log.severe((new StringBuilder("MNV http time to retry: ")).append(j).toString());
        s = s1;
        Thread.sleep(j);
_L10:
        if (flag && i < 2) goto _L5; else goto _L4
_L4:
        disconnect();
        s = s1;
_L7:
        return s;
_L2:
        if (j != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        s = s1;
        s2 = Integer.toString(j);
          goto _L6
        Object obj;
        obj;
        disconnect();
        return null;
        Exception exception;
        exception;
        log.severe((new StringBuilder("MNV ProfileServicesRestful.getData Exception: ")).append(exception.getMessage()).toString());
        PerformanceLog.f.c();
        long l = PerformanceLog.f.a("getData Exception");
        mnvAnalytics.reportServerError("MnvHttpGetDataException", Long.toString(l), getDeviceInfo(), AnalyticsEvent.cB);
        getMsnServer(connection);
        disconnect();
          goto _L7
        obj;
        disconnect();
        throw obj;
_L5:
        i++;
          goto _L8
_L3:
        if (!flag) goto _L10; else goto _L9
_L9:
        if (j != -1) goto _L12; else goto _L11
_L11:
        s2 = "NoConnection";
          goto _L6
    }

    private String getDecodedContent(HttpURLConnection httpurlconnection)
    {
        Object obj = null;
        long l;
        try
        {
            httpurlconnection = httpUtil.d(httpurlconnection);
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            log.info((new StringBuilder("MNV ProfileServicesRestful.getDecodedContent: ")).append(httpurlconnection.getMessage()).toString());
            mnvAnalytics.reportServerError("MnvHttpCannotDecodeContentException", AnalyticsEvent.cB);
            httpurlconnection = obj;
        }
        log.info((new StringBuilder("MNV ProfileServicesRestful.getDecodedContent response: ")).append(httpurlconnection).toString());
        PerformanceLog.f.c();
        l = PerformanceLog.f.a("getDecodedContent completed");
        mnvAnalytics.reportCompleted(Long.toString(l), AnalyticsEvent.cw);
        return httpurlconnection;
    }

    private String getDeviceInfo()
    {
        return networkUtil.b(contactUtil, accountProvider.get());
    }

    private void getMsnServer(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection != null)
        {
            httpurlconnection = httpurlconnection.getHeaderField("X-MSNSERVER");
            httpurlconnection = String.format(Locale.US, "%s_%s", new Object[] {
                httpurlconnection, scenario
            });
            log.info((new StringBuilder("MNV MSN server info: ")).append(httpurlconnection).toString());
            mnvAnalytics.reportCompleted(httpurlconnection, AnalyticsEvent.cx);
        }
    }

    private String getResponse(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getContentEncoding();
        log.info((new StringBuilder("MNV ProfileServicesRestful decoding: ")).append(acceptEncoding.name()).toString());
        if (s != null && s.equalsIgnoreCase(acceptEncoding.name()))
        {
            return getDecodedContent(httpurlconnection);
        } else
        {
            return getStringAndDisconnect(httpurlconnection);
        }
    }

    private int getResponseCode(HttpURLConnection httpurlconnection)
    {
        int i;
        i = -1;
        if (httpurlconnection == null)
        {
            return -1;
        }
        int j = httpurlconnection.getResponseCode();
        i = j;
_L2:
        return i;
        httpurlconnection;
        log.severe((new StringBuilder("MNV ProfileServicesRestful.getResponseCode EOFException: ")).append(httpurlconnection.getMessage()).toString());
        mnvAnalytics.reportServerErrorDeviceDetail("MnvHttpResponseCodeEOFException", getDeviceInfo(), AnalyticsEvent.cB);
        disconnect();
        continue; /* Loop/switch isn't completed */
        httpurlconnection;
        log.severe((new StringBuilder("MNV ProfileServicesRestful.getResponseCode IOException: ")).append(httpurlconnection.getMessage()).toString());
        mnvAnalytics.reportServerErrorDeviceDetail("MnvHttpResponseCodeIOException", getDeviceInfo(), AnalyticsEvent.cB);
        disconnect();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String getStringAndDisconnect(HttpURLConnection httpurlconnection)
    {
        httpurlconnection = httpUtil.c(httpurlconnection);
        log.info((new StringBuilder("MNV ProfileServicesRestful.getStringAndDisconnect response: ")).append(httpurlconnection).toString());
        PerformanceLog.f.c();
        long l = PerformanceLog.f.a("getStringAndDisconnect completed");
        mnvAnalytics.reportCompleted(Long.toString(l), AnalyticsEvent.cw);
        return httpurlconnection;
    }

    private String getUserInputCountry(ContentValues contentvalues, b b1)
    {
        if (contentvalues != null && contentvalues.containsKey("userInputCountry"))
        {
            return contentvalues.getAsString("userInputCountry");
        } else
        {
            return b1.getCountry();
        }
    }

    private String getUserInputPhoneNumber(ContentValues contentvalues, b b1)
    {
        if (contentvalues != null && contentvalues.containsKey("userInputPhoneNumber"))
        {
            return contentvalues.getAsString("userInputPhoneNumber");
        } else
        {
            return b1.getPhoneNumber();
        }
    }

    private String getUserInputPinCode(ContentValues contentvalues)
    {
        if (contentvalues != null && contentvalues.containsKey("userInputPinCode"))
        {
            return contentvalues.getAsString("userInputPinCode");
        } else
        {
            return null;
        }
    }

    private void handlePostDataException(Exception exception, String s)
    {
        log.severe((new StringBuilder("MNV ProfileServicesRestful.postData Exception: ")).append(exception.getMessage()).toString());
        PerformanceLog.f.c();
        long l = PerformanceLog.f.a("postData Exception");
        mnvAnalytics.reportServerError(s, Long.toString(l), getDeviceInfo(), AnalyticsEvent.cB);
        getMsnServer(connection);
    }

    private ProfileServicesResponse makeRequest()
    {
        String s;
        String s1;
        if (!networkUtil.a())
        {
            s = "{ \"Errors\": [ { \"Code\": \"ConnectionFailed\", \"HttpResult\": 400 } ], \"Views\": [], \"TraceGraph\": null }";
        } else
        if (method.equals(a.GET))
        {
            s = getData();
        } else
        if (method.equals(a.POST))
        {
            s = postData();
        } else
        {
            return null;
        }
        s1 = s;
        if (s == null)
        {
            s1 = "{ \"Errors\": [ { \"Code\": \"TimeoutException\", \"HttpResult\": 400 } ], \"Views\": [], \"TraceGraph\": null }";
        }
        profileServicesResponse.parse(s1);
        return profileServicesResponse;
    }

    private String postData()
    {
        String s;
        Object obj1;
        s = null;
        obj1 = null;
        if (payload == null) goto _L2; else goto _L1
_L1:
        int i;
        connection = getConnection(method);
        httpUtil.a(connection, headers);
        httpUtil.a(connection, payload);
        i = getResponseCode(connection);
        if (i != -1) goto _L4; else goto _L3
_L3:
        s = "NoConnection";
_L10:
        if (i < 200 || i > 300) goto _L6; else goto _L5
_L5:
        s = getResponse(connection);
_L8:
        disconnect();
_L2:
        return s;
_L4:
        s = Integer.toString(i);
        continue; /* Loop/switch isn't completed */
_L6:
        log.severe((new StringBuilder("MNV ProfileServicesRestful.postData: ")).append(s).toString());
        mnvAnalytics.reportServerError("MnvHttpResponseCodeWhenPost", s, getDeviceInfo(), AnalyticsEvent.cB);
        getMsnServer(connection);
        s = obj1;
        if (true) goto _L8; else goto _L7
_L7:
        Object obj;
        obj;
        handlePostDataException(((Exception) (obj)), "MnvHttpPostDataProtocolException");
        disconnect();
        return null;
        obj;
        handlePostDataException(((Exception) (obj)), "MnvHttpPostDataIOException");
        disconnect();
        return null;
        obj;
        handlePostDataException(((Exception) (obj)), "MnvHttpPostDataException");
        disconnect();
        return null;
        obj;
        disconnect();
        throw obj;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void setPsScenario(Map map)
    {
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (((String)entry.getKey()).equalsIgnoreCase("PS-Scenario"))
            {
                scenario = (String)entry.getValue();
                log.info((new StringBuilder("MNV Profile Services scenario: ")).append(scenario).toString());
            }
        } while (true);
    }

    private void setUserData(String s)
    {
        mnvUserData.setPhoneNumber(mnvUtil.getUserPhoneNumber());
        mnvUserData.setCountry(mnvUtil.getUserCountry());
        mnvUserData.setLanguage(mnvUtil.getUserLanguage());
        mnvUserData.setGuid(UUID.randomUUID().toString());
        mnvUserData.setScenario(s);
    }

    public boolean call(c c1, ContentValues contentvalues)
    {
        setUserData(c1.name());
        log.info((new StringBuilder("MNV unformatted payload: ")).append(c1).toString());
        setMethod(c1.getMethod());
        setPayload(buildPayload(c1, contentvalues));
        setHeaders(buildHeaders());
        setConnectTimeout(mnvCases.getMnvHttpConnectionTimeout());
        setReadTimeout(mnvCases.getMnvHttpConnectionTimeout());
        return makeRequest(this);
    }

    boolean disconnect()
    {
        if (connection != null)
        {
            connection.disconnect();
            connection = null;
            return true;
        } else
        {
            return false;
        }
    }

    public void done(AsyncResult asyncresult)
    {
        if (asyncresult.e())
        {
            asyncresult = ((ProfileServicesResponse)asyncresult.a()).getProfileResponse();
            if (asyncresult != null)
            {
                if (asyncresult.isSuccess())
                {
                    callback.processSuccess((ProfileServicesResponse.ProfileData)asyncresult);
                    return;
                } else
                {
                    callback.processServiceError((ProfileServicesResponse.ProfileError)asyncresult);
                    return;
                }
            } else
            {
                callback.processAsyncError(new RuntimeException("MNV Profile Services is timed out"));
                return;
            }
        } else
        {
            callback.processAsyncError(asyncresult.c());
            return;
        }
    }

    boolean makeRequest(AsyncCallback asynccallback)
    {
        Callable callable = new Callable() {

            final ProfileServicesClient this$0;

            public final ProfileServicesResponse call()
                throws Exception
            {
                return makeRequest();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = ProfileServicesClient.this;
                super();
            }
        };
        async.a(callable, asynccallback);
        return true;
    }

    public void register(d d1)
    {
        callback = d1;
    }

    void setConnectTimeout(int i)
    {
        connectTimeout = i;
    }

    void setHeaders(Map map)
    {
        setPsScenario(map);
        headers = map;
    }

    void setMethod(String s)
    {
        if (s.equalsIgnoreCase("POST"))
        {
            s = a.POST;
        } else
        {
            s = a.GET;
        }
        method = s;
    }

    void setPayload(String s)
    {
        payload = s;
    }

    void setReadTimeout(int i)
    {
        readTimeout = i;
    }

    public void setToken(ProfileServiceToken profileservicetoken)
    {
        token = profileservicetoken;
    }


}
