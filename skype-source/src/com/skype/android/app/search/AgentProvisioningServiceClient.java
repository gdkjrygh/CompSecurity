// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.text.TextUtils;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.app.token.SkypeTokenCallback;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ExponentialTime;
import com.skype.android.util.HttpUtil;
import java.io.EOFException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.search:
//            AgentInfo, AgentProvisioningServiceResponse

public class AgentProvisioningServiceClient
{
    private final class a
    {

        private String response;
        private boolean success;
        final AgentProvisioningServiceClient this$0;

        public final String getResponse()
        {
            return response;
        }

        public final boolean isSuccess()
        {
            return success;
        }

        public a(boolean flag, String s)
        {
            this$0 = AgentProvisioningServiceClient.this;
            super();
            success = flag;
            response = s;
        }
    }

    private static final class b extends Enum
    {

        private static final b $VALUES[];
        public static final b DELETE;
        public static final b GET;
        public static final b PUT;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/app/search/AgentProvisioningServiceClient$b, s);
        }

        public static b[] values()
        {
            return (b[])$VALUES.clone();
        }

        static 
        {
            GET = new b("GET", 0);
            PUT = new b("PUT", 1);
            DELETE = new b("DELETE", 2);
            $VALUES = (new b[] {
                GET, PUT, DELETE
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int CONNECTION_ERROR = -1;
    private static final String HEADER_APPLICATION_ID = "X-Application-ID";
    private static final String HEADER_SKYPE_TOKEN = "X-SkypeToken";
    private static final String HEADER_UNIQUE_ID = "X-Microsoft-Skype-Chain-ID";
    private static final int INITIAL_TIME = 500;
    private static final int MAX_RETRIES = 2;
    private static final int MAX_TIME = 5000;
    private static final Logger log = Logger.getLogger("AgentProvisioningServiceClient");
    private final String APSServiceUri;
    private final AsyncService asyncService;
    private final ExponentialTime expTimeDelay = new ExponentialTime();
    private final HttpUtil httpUtil;
    private final SkypeTokenAccess skypeTokenAccess;

    public AgentProvisioningServiceClient(HttpUtil httputil, AsyncService asyncservice, SkypeTokenAccess skypetokenaccess, EcsConfiguration ecsconfiguration)
    {
        httpUtil = httputil;
        asyncService = asyncservice;
        skypeTokenAccess = skypetokenaccess;
        APSServiceUri = ecsconfiguration.getAPSServiceUrl();
    }

    private void addHeaders(HttpURLConnection httpurlconnection, String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("X-SkypeToken", s);
        hashmap.put("X-Microsoft-Skype-Chain-ID", UUID.randomUUID().toString());
        hashmap.put("X-Application-ID", "D1604CB9-CFF6-4A1B-8A91-3C6751D6D79A");
        httpUtil.a(httpurlconnection, hashmap);
    }

    private void booleanResultCall(final b method, final AgentInfo serviceUri, final AsyncCallback callback)
    {
        serviceUri = String.format(getAPSServiceUriModify(), new Object[] {
            serviceUri.getAgentId()
        });
        skypeTokenAccess.requestSkypeToken(new SkypeTokenCallback() {

            final AgentProvisioningServiceClient this$0;
            final AsyncCallback val$callback;
            final b val$method;
            final String val$serviceUri;

            public final void onSkypeTokenRetrieved(String s)
            {
                s = s. new Callable() {

                    final _cls2 this$1;
                    final String val$token;

                    public final Boolean call()
                        throws Exception
                    {
                        return Boolean.valueOf(doHttpCall(method, serviceUri, token).isSuccess());
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$1 = final__pcls2;
                token = String.this;
                super();
            }
                };
                asyncService.a(s, callback);
            }

            
            {
                this$0 = AgentProvisioningServiceClient.this;
                method = b1;
                serviceUri = s;
                callback = asynccallback;
                super();
            }
        });
    }

    private a doHttpCall(b b1, String s, String s1)
    {
        HttpURLConnection httpurlconnection;
        Object obj;
        int i;
        expTimeDelay.b();
        obj = null;
        httpurlconnection = null;
        i = 0;
_L4:
        HttpURLConnection httpurlconnection1 = httpurlconnection;
        HttpURLConnection httpurlconnection2 = getConnection(b1, s, s1);
        httpurlconnection1 = httpurlconnection2;
        httpurlconnection = httpurlconnection2;
        int j = getResponseCode(httpurlconnection2);
        if (j < 200 || j > 300)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s = obj;
        httpurlconnection1 = httpurlconnection2;
        httpurlconnection = httpurlconnection2;
        if (b1 != b.GET)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        httpurlconnection1 = httpurlconnection2;
        httpurlconnection = httpurlconnection2;
        s = getResponse(httpurlconnection2);
        httpurlconnection1 = httpurlconnection2;
        httpurlconnection = httpurlconnection2;
        b1 = new a(true, s);
        if (httpurlconnection2 != null)
        {
            httpurlconnection2.disconnect();
        }
        return b1;
        String s2;
        boolean flag;
        if (j != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        httpurlconnection1 = httpurlconnection2;
        httpurlconnection = httpurlconnection2;
        s2 = Integer.toString(j);
        httpurlconnection1 = httpurlconnection2;
        httpurlconnection = httpurlconnection2;
        j = expTimeDelay.a();
        httpurlconnection1 = httpurlconnection2;
        httpurlconnection = httpurlconnection2;
        log.severe(String.format("doHttpCall retries: %d, response code: %s, time to retry: %d", new Object[] {
            Integer.valueOf(i), s2, Integer.valueOf(j)
        }));
        httpurlconnection1 = httpurlconnection2;
        httpurlconnection = httpurlconnection2;
        Thread.sleep(j);
        if (flag && i < 2)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        if (httpurlconnection2 != null)
        {
            httpurlconnection2.disconnect();
        }
_L2:
        return new a(false, null);
        b1;
        httpurlconnection = httpurlconnection1;
        log.severe((new StringBuilder("doHttpCall Exception: ")).append(b1.getMessage()).toString());
        if (httpurlconnection1 != null)
        {
            httpurlconnection1.disconnect();
        }
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        throw b1;
        i++;
        httpurlconnection = httpurlconnection2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private HttpURLConnection getConnection(b b1, String s, String s1)
    {
        try
        {
            s = httpUtil.b(s);
            s.setRequestMethod(b1.name());
            addHeaders(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            log.severe((new StringBuilder("getConnection IOException: ")).append(b1.getMessage()).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            log.severe((new StringBuilder("getConnection Exception: ")).append(b1.getMessage()).toString());
            return null;
        }
        return s;
    }

    private String getResponse(HttpURLConnection httpurlconnection)
    {
        httpurlconnection = httpUtil.c(httpurlconnection);
        log.info((new StringBuilder("getResponse response: ")).append(httpurlconnection).toString());
        return httpurlconnection;
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
        log.severe((new StringBuilder("getResponseCode EOFException: ")).append(httpurlconnection.getMessage()).toString());
        continue; /* Loop/switch isn't completed */
        httpurlconnection;
        log.severe((new StringBuilder("getResponseCode IOException: ")).append(httpurlconnection.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void delete(AgentInfo agentinfo, AsyncCallback asynccallback)
    {
        booleanResultCall(b.DELETE, agentinfo, asynccallback);
    }

    public void get(final AsyncCallback callback)
    {
        skypeTokenAccess.requestSkypeToken(new SkypeTokenCallback() {

            final AgentProvisioningServiceClient this$0;
            final AsyncCallback val$callback;

            public final void onSkypeTokenRetrieved(String s)
            {
                s = s. new Callable() {

                    final _cls1 this$1;
                    final String val$token;

                    public final AgentProvisioningServiceResponse call()
                        throws Exception
                    {
                        if (!TextUtils.isEmpty(token))
                        {
                            a a1 = doHttpCall(b.GET, getAPSServiceUriGET(), token);
                            if (a1.isSuccess())
                            {
                                return AgentProvisioningServiceResponse.parse(a1.getResponse());
                            }
                        }
                        return new AgentProvisioningServiceResponse();
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$1 = final__pcls1;
                token = String.this;
                super();
            }
                };
                asyncService.a(s, callback);
            }

            
            {
                this$0 = AgentProvisioningServiceClient.this;
                callback = asynccallback;
                super();
            }
        });
    }

    public String getAPSServiceUriGET()
    {
        return (new StringBuilder()).append(APSServiceUri).append("agents").toString();
    }

    public String getAPSServiceUriModify()
    {
        return (new StringBuilder()).append(APSServiceUri).append("relationship/me/%s").toString();
    }

    public void put(AgentInfo agentinfo, AsyncCallback asynccallback)
    {
        booleanResultCall(b.PUT, agentinfo, asynccallback);
    }



}
