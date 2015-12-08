// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.common.WLTrusteer;
import com.worklight.common.security.WLDeviceAuthManager;
import com.worklight.common.security.WLUserAuthManager;
import com.worklight.location.api.WLDevice;
import com.worklight.location.api.WLEventTransmissionPolicy;
import com.worklight.location.internal.events.EventTransmitter;
import com.worklight.location.internal.nativeImpl.AndroidWLDevice;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.AsynchronousRequestSender;
import com.worklight.wlclient.ConfigProfileRequestPiggybacker;
import com.worklight.wlclient.HttpClientManager;
import com.worklight.wlclient.WLAuthorizationManagerInternal;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.challengehandler.BaseChallengeHandler;
import com.worklight.wlclient.api.challengehandler.ChallengeHandler;
import com.worklight.wlclient.api.challengehandler.WLChallengeHandler;
import com.worklight.wlclient.challengehandler.AntiXSRFChallengeHandler;
import com.worklight.wlclient.challengehandler.AuthenticityChallengeHandler;
import com.worklight.wlclient.challengehandler.AutoProvisioningChallengeHandler;
import com.worklight.wlclient.challengehandler.NoProvisioningChallengeHandler;
import com.worklight.wlclient.challengehandler.RemoteDisableChallengeHandler;
import com.worklight.wlclient.challengehandler.UserAuthenticationChallengeHandler;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLProcedureInvocationData, WLRequestOptions, WLPush, WLResponseListener, 
//            WLResponse, WLHttpResponseListener, WLFailResponse, WLProcedureInvocationFailResponse, 
//            WLProcedureInvocationResult, WLErrorCode, WLAuthorizationException

public class WLClient
{
    class ActivityListener
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        private int activityCount;
        final WLClient this$0;

        public boolean isAppInBackground()
        {
            return activityCount == 0;
        }

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
            WLClient.logger.debug((new StringBuilder()).append("on activity created ").append(activity.getClass().getName()).toString());
        }

        public void onActivityDestroyed(Activity activity)
        {
            WLClient.logger.debug((new StringBuilder()).append("on activity destroyed ").append(activity.getClass().getName()).toString());
        }

        public void onActivityPaused(Activity activity)
        {
            activityCount = activityCount - 1;
            WLClient.logger.debug((new StringBuilder()).append("on activity paused ").append(activity.getClass().getName()).append(" . activity count = ").append(activityCount).toString());
        }

        public void onActivityResumed(Activity activity)
        {
            activityCount = activityCount + 1;
            WLClient.logger.debug((new StringBuilder()).append("on activity resumed ").append(activity.getClass().getName()).append(" . activity count = ").append(activityCount).toString());
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
            WLClient.logger.debug((new StringBuilder()).append("on activity save instance state ").append(activity.getClass().getName()).toString());
        }

        public void onActivityStarted(Activity activity)
        {
            WLClient.logger.debug((new StringBuilder()).append("on activity started ").append(activity.getClass().getName()).toString());
        }

        public void onActivityStopped(Activity activity)
        {
            WLClient.logger.debug((new StringBuilder()).append("on activity stopped ").append(activity.getClass().getName()).toString());
        }

        ActivityListener()
        {
            this$0 = WLClient.this;
            super();
            activityCount = 0;
        }
    }

    class HeartBeatTask extends TimerTask
    {

        private Context context;
        final WLClient this$0;

        public void run()
        {
            if (!WLClient.isApplicationSentToBackground(context))
            {
                WLRequestOptions wlrequestoptions = new WLRequestOptions();
                HeartbeatListener heartbeatlistener = new HeartbeatListener();
                WLClient wlclient = WLClient.getInstance();
                if (wlclient != null)
                {
                    (new WLRequest(heartbeatlistener, wlrequestoptions, WLConfig.getInstance(), wlclient.getContext())).makeRequest("heartbeat");
                    return;
                }
            }
        }

        HeartBeatTask(Context context1)
        {
            this$0 = WLClient.this;
            super();
            context = null;
            context = context1;
        }
    }

    class HeartbeatListener
        implements WLRequestListener
    {

        final WLClient this$0;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            WLClient.logger.debug((new StringBuilder()).append("Failed to send heartbeat. Response:  ").append(wlfailresponse.toString()).toString());
        }

        public void onSuccess(WLResponse wlresponse)
        {
            WLClient.logger.debug("Heartbeat sent successfully");
        }

        HeartbeatListener()
        {
            this$0 = WLClient.this;
            super();
        }
    }

    class InitRequestListener
        implements WLRequestListener
    {

        final WLClient this$0;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            wlfailresponse.getOptions().getResponseListener().onFailure(wlfailresponse);
        }

        public void onSuccess(WLResponse wlresponse)
        {
            WLClient wlclient = WLClient.getInstance();
            if (wlclient == null)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            wlclient.sendHeartBeat();
            JSONObject jsonobject = wlresponse.getResponseJSON().getJSONObject("userPrefs");
            if (jsonobject == null)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            Iterator iterator = jsonobject.keys();
_L1:
            boolean flag = iterator.hasNext();
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            String s = (String)iterator.next();
            String s1 = (String)jsonobject.get(s);
            userPreferenceMap.put(s, s1);
              goto _L1
            JSONException jsonexception;
            jsonexception;
            try
            {
                throw new RuntimeException(jsonexception.getMessage());
            }
            catch (JSONException jsonexception1)
            {
                jsonexception1.printStackTrace();
            }
            wlresponse.getOptions().getResponseListener().onSuccess(wlresponse);
            Logger.processAutomaticTrigger();
            return;
        }

        InitRequestListener()
        {
            this$0 = WLClient.this;
            super();
        }
    }

    class InvokeProcedureRequestListener
        implements WLRequestListener
    {

        final WLClient this$0;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            WLProcedureInvocationFailResponse wlprocedureinvocationfailresponse = new WLProcedureInvocationFailResponse(wlfailresponse);
            wlfailresponse.getOptions().getResponseListener().onFailure(wlprocedureinvocationfailresponse);
        }

        public void onSuccess(WLResponse wlresponse)
        {
            WLProcedureInvocationResult wlprocedureinvocationresult = new WLProcedureInvocationResult(wlresponse);
            if (wlprocedureinvocationresult.isSuccessful())
            {
                wlprocedureinvocationresult.getOptions().getResponseListener().onSuccess(wlprocedureinvocationresult);
            } else
            {
                wlresponse = new WLProcedureInvocationFailResponse(wlresponse);
                wlresponse.setErrorCode(WLErrorCode.PROCEDURE_ERROR);
                wlresponse.getOptions().getResponseListener().onFailure(wlresponse);
            }
            Logger.processAutomaticTrigger();
        }

        InvokeProcedureRequestListener()
        {
            this$0 = WLClient.this;
            super();
        }
    }

    class LogActivityListener
        implements WLRequestListener
    {

        final WLClient this$0;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            WLClient.logger.error((new StringBuilder()).append("Activity will not be logged in MobileFirst Platform server using logActivity() because of ").append(wlfailresponse.getErrorMsg()).toString());
        }

        public void onSuccess(WLResponse wlresponse)
        {
            WLClient.logger.debug((new StringBuilder()).append("logActivity success. Response from server is ").append(wlresponse.toString()).toString());
        }

        LogActivityListener()
        {
            this$0 = WLClient.this;
            super();
        }
    }

    class ObtainAccessTokenRequestListener
        implements WLRequestListener
    {

        final WLClient this$0;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            wlfailresponse.getOptions().getResponseListener().onFailure(wlfailresponse);
        }

        public void onSuccess(WLResponse wlresponse)
        {
            try
            {
                String s = wlresponse.getResponseJSON().getString("access_token");
                String s1 = wlresponse.getResponseJSON().getString("scope");
                wlAccessTokens.put(s1, s);
                wlLastAccessToken = s;
                wlresponse.getOptions().getResponseListener().onSuccess(wlresponse);
                return;
            }
            catch (JSONException jsonexception)
            {
                wlresponse.getOptions().getResponseListener().onFailure(new WLFailResponse(wlresponse));
            }
        }

        ObtainAccessTokenRequestListener()
        {
            this$0 = WLClient.this;
            super();
        }
    }

    static class WLResponseListenerWrapper
        implements WLHttpResponseListener
    {

        private WLResponseListener listener;

        public void onFailure(HttpResponse httpresponse, Exception exception)
        {
            if (httpresponse != null)
            {
                listener.onFailure(new WLFailResponse(httpresponse));
                return;
            }
            if (exception instanceof WLAuthorizationException)
            {
                listener.onFailure(((WLAuthorizationException)exception).getWLFailResponse());
                return;
            }
            if (exception instanceof SocketTimeoutException)
            {
                listener.onFailure(new WLFailResponse(WLErrorCode.REQUEST_TIMEOUT, WLErrorCode.REQUEST_TIMEOUT.getDescription(), null));
                return;
            }
            if (exception instanceof ConnectTimeoutException)
            {
                listener.onFailure(new WLFailResponse(WLErrorCode.UNRESPONSIVE_HOST, WLErrorCode.UNRESPONSIVE_HOST.getDescription(), null));
                return;
            } else
            {
                listener.onFailure(new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, WLErrorCode.UNEXPECTED_ERROR.getDescription(), null));
                return;
            }
        }

        public void onSuccess(HttpResponse httpresponse)
        {
            listener.onSuccess(new WLResponse(httpresponse));
        }

        public WLResponseListenerWrapper(WLResponseListener wlresponselistener)
        {
            listener = wlresponselistener;
        }
    }


    private static final String ANTI_XSRF_REALM = "wl_antiXSRFRealm";
    private static final String AUTHENTICITY_REALM = "wl_authenticityRealm";
    private static final String AUTO_PROVISIONING_REALM = "wl_deviceAutoProvisioningRealm";
    private static final String CHALLENGE_HANDLER_NULL_ERROR = "Cannot register 'null' challenge handler";
    private static final String HEART_BEAT_ERROR = "WLClient not initialized - cannot send heart beat message before connect";
    private static final String INVOKE_PROCEDURE_INIT_ERROR = "invokeProcedure() will not be executed because WLCLient is not initialized, ensure WLCLient.connect function has been called.";
    private static final String INVOKE_PROCEDURE_INVALID_INVOCATION_DATA = "Error during invocation of remote procedure, because invocation data can't be null.";
    private static final String INVOKE_PROCEDURE_RUN_ERROR = "Error during invocation of remote procedure, because responseListener parameter can't be null.";
    private static final String LOGIN_RUN_ERROR = "Error during login, because realmName or listener parameter can't be null.";
    private static final String LOGOUT_RUN_ERROR = "Error during logout, because realmName or listener parameter can't be null.";
    protected static final String LOG_ACTIVITY_INIT_ERROR = "logActivity() will not be executed because WLCLient is not initialized, ensure WLCLient.connect function has been called.";
    private static final String NO_PROVISIONING_REALM = "wl_deviceNoProvisioningRealm";
    private static final String NO_REALM_REGISTER_ERROR = "Application will exit because the challengeHandler parameter for registerChallengeHandler (challengeHandler) has a null realm property. Call this API with a valid reference to challenge handler.";
    private static final String REMOTE_DISABLE_REALM = "wl_remoteDisableRealm";
    private static final String REQ_PATH_WL_TOKEN = "oauth/token";
    public static final Object WAIT_LOCK = new Object();
    private static ConfigProfileRequestPiggybacker configProfileRequestPiggybacker;
    private static Logger logger = Logger.getInstance(com/worklight/wlclient/api/WLClient.getSimpleName());
    private static WLClient wlClient = null;
    ActivityListener activityListener;
    private Hashtable chMap;
    private Context context;
    private int heartbeatInterval;
    private JSONObject notificationSubscriptionState;
    private Timer timer;
    private HashMap userPreferenceMap;
    private Map wlAccessTokens;
    private AndroidWLDevice wlDevice;
    private String wlLastAccessToken;
    private WLPush wlPush;

    private WLClient(Context context1)
    {
        heartbeatInterval = 420;
        activityListener = null;
        notificationSubscriptionState = null;
        wlPush = null;
        wlLastAccessToken = null;
        context = context1;
        wlDevice = new AndroidWLDevice(context1);
        chMap = new Hashtable();
        userPreferenceMap = new HashMap();
        wlAccessTokens = new HashMap();
        registerDefaultChallengeHandlers();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            Application application = (Application)context1.getApplicationContext();
            activityListener = new ActivityListener();
            application.registerActivityLifecycleCallbacks(activityListener);
        }
        if (configProfileRequestPiggybacker == null)
        {
            configProfileRequestPiggybacker = new ConfigProfileRequestPiggybacker(context1);
            WLRequest.addRequestPiggybacker(configProfileRequestPiggybacker);
        }
    }

    public static WLClient createInstance(Context context1)
    {
        if (wlClient != null)
        {
            logger.debug("WLClient has already been created.");
            releaseInstance();
        }
        if (!android/app/Activity.isAssignableFrom(context1.getClass()))
        {
            logger.warn("You should pass a context that is assignable from the Activity class. WLClient instance may be used to start an activity.");
        }
        wlClient = new WLClient(context1);
        WLConfig.createInstance(context1);
        HttpClientManager.createInstance(context1);
        WLTrusteer.createInstance(context1);
        WLUtils.clearState();
        return wlClient;
    }

    public static WLClient getInstance()
    {
        if (wlClient == null)
        {
            throw new RuntimeException("WLClient object has not been created. You must call WLClient.createInstance first.");
        } else
        {
            return wlClient;
        }
    }

    private void invokeCacheableProcedure(WLProcedureInvocationData wlprocedureinvocationdata, WLRequestOptions wlrequestoptions)
    {
        Object obj = (new StringBuilder()).append(WLConfig.getInstance().getRootURL()).append("/invoke").toString();
        Map map = wlprocedureinvocationdata.getInvocationDataMap();
        wlprocedureinvocationdata = ((WLProcedureInvocationData) (obj));
        if (map.size() > 0)
        {
            wlprocedureinvocationdata = new LinkedList();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); wlprocedureinvocationdata.add(new BasicNameValuePair(s, (String)map.get(s))))
            {
                s = (String)iterator.next();
            }

            wlprocedureinvocationdata = URLEncodedUtils.format(wlprocedureinvocationdata, "utf-8");
            wlprocedureinvocationdata = (new StringBuilder()).append(((String) (obj))).append("?").append(wlprocedureinvocationdata).toString();
        }
        obj = new HttpGet(wlprocedureinvocationdata);
        logger.debug((new StringBuilder()).append("invokeCacheableProcedure: sending request to URL: ").append(wlprocedureinvocationdata).toString());
        AsynchronousRequestSender.getInstance().sendCacheableInvokeRequestAsync(((org.apache.http.client.methods.HttpRequestBase) (obj)), wlrequestoptions);
    }

    public static boolean isApplicationSentToBackground(Context context1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return wlClient.activityListener.isAppInBackground();
        }
        if (context1.checkCallingOrSelfPermission("android.permission.GET_TASKS") == 0)
        {
            List list = ((ActivityManager)context1.getSystemService("activity")).getRunningTasks(1);
            return !list.isEmpty() && !((android.app.ActivityManager.RunningTaskInfo)list.get(0)).topActivity.getPackageName().equals(context1.getPackageName());
        } else
        {
            logger.warn("Heartbeat calls will continue while the app is in the background. To suspend heartbeat calls while the app is in the background, add the GET_TASKS permission to AndroidManifest.xml");
            return false;
        }
    }

    private Map parseAuthenticationHeader(String s)
    {
        Object obj;
        String as1[];
        obj = null;
        as1 = s.split(" ");
        break MISSING_BLOCK_LABEL_10;
_L2:
        do
        {
            return ((Map) (obj));
        } while (as1.length < 2 || !as1[0].equals("Bearer"));
        as1 = s.substring(as1[0].length() + 1).split(",");
        s = new HashMap();
        int i = 0;
        do
        {
            obj = s;
            if (i >= as1.length)
            {
                continue;
            }
            String as[] = as1[i].split("=");
            if (as.length == 2)
            {
                s.put(as[0], as[1].replace("\"", ""));
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void registerDefaultChallengeHandlers()
    {
        registerChallengeHandler(new AntiXSRFChallengeHandler("wl_antiXSRFRealm"));
        registerChallengeHandler(new NoProvisioningChallengeHandler("wl_deviceNoProvisioningRealm"));
        registerChallengeHandler(new RemoteDisableChallengeHandler("wl_remoteDisableRealm"));
        registerChallengeHandler(new AuthenticityChallengeHandler("wl_authenticityRealm"));
        registerChallengeHandler(new AutoProvisioningChallengeHandler("wl_deviceAutoProvisioningRealm"));
        registerChallengeHandler(new UserAuthenticationChallengeHandler());
    }

    protected static void releaseInstance()
    {
        wlClient = null;
    }

    private void resetServerContext()
    {
        logger.debug("reset HTTP client context");
        AsynchronousRequestSender.reset(getContext());
        for (Iterator iterator = getchMap().values().iterator(); iterator.hasNext(); ((BaseChallengeHandler)iterator.next()).clearChallengeRequests()) { }
        wlDevice.getEventTransmitter().setClientConnected(false);
        WLAuthorizationManagerInternal.getInstance().clearRegistration();
    }

    public void addGlobalHeader(String s, String s1)
    {
        AsynchronousRequestSender.getInstance().addGlobalHeader(s, s1);
    }

    public void checkForNotifications()
    {
        (new WLRequest(new WLRequestListener() {

            final WLClient this$0;

            public void onFailure(WLFailResponse wlfailresponse)
            {
            }

            public void onSuccess(WLResponse wlresponse)
            {
            }

            
            {
                this$0 = WLClient.this;
                super();
            }
        }, new WLRequestOptions(), WLConfig.getInstance(), context)).makeRequest("authenticate");
    }

    public void connect(WLResponseListener wlresponselistener)
    {
        connect(wlresponselistener, null);
    }

    public void connect(WLResponseListener wlresponselistener, WLRequestOptions wlrequestoptions)
    {
        Object obj = WLConfig.getInstance().readWLPref("WL-Instance-Id");
        if (!WLUtils.isStringEmpty(((String) (obj))))
        {
            addGlobalHeader("WL-Instance-Id", ((String) (obj)));
        }
        if (context != null)
        {
            obj = WLDeviceAuthManager.getInstance().getDeviceUUID(context);
            if (obj != null && ((String) (obj)).length() > 0)
            {
                addGlobalHeader("x-wl-device-id", ((String) (obj)));
            }
        }
        obj = WLUserAuthManager.getInstance();
        ((WLUserAuthManager) (obj)).init(context);
        if (((WLUserAuthManager) (obj)).doesValidCertificateExist())
        {
            try
            {
                wlrequestoptions.setResponseListener(wlresponselistener);
                ((WLUserAuthManager) (obj)).authenticateToTheServerWithCertificate(null, wlrequestoptions);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WLResponseListener wlresponselistener)
            {
                return;
            }
        }
        obj = wlrequestoptions;
        if (wlrequestoptions == null)
        {
            obj = new WLRequestOptions();
        }
        ((WLRequestOptions) (obj)).addParameter("action", "test");
        ((WLRequestOptions) (obj)).setResponseListener(wlresponselistener);
        (new WLRequest(new InitRequestListener(), ((WLRequestOptions) (obj)), WLConfig.getInstance(), context)).makeRequest("init");
    }

    public ChallengeHandler getChallengeHandler(WLResponse wlresponse)
    {
        for (Iterator iterator = chMap.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (BaseChallengeHandler)((java.util.Map.Entry)iterator.next()).getValue();
            if (obj instanceof ChallengeHandler)
            {
                obj = (ChallengeHandler)obj;
                if (((ChallengeHandler) (obj)).isCustomResponse(wlresponse))
                {
                    return ((ChallengeHandler) (obj));
                }
            }
        }

        return null;
    }

    public WLConfig getConfig()
    {
        if (wlClient == null)
        {
            throw new RuntimeException("WLClient object has not been created. You must call WLClient.createInstance first.");
        } else
        {
            WLConfig.createInstance(context);
            return WLConfig.getInstance();
        }
    }

    public Context getContext()
    {
        return context;
    }

    public CookieStore getCookieStore()
    {
        return HttpClientManager.getInstance().getHttpClient().getCookieStore();
    }

    protected Map getGlobalHeaders()
    {
        return AsynchronousRequestSender.getInstance().getGlobalHeaders();
    }

    public String getLastAccessToken()
    {
        return wlLastAccessToken;
    }

    public String getLastAccessToken(String s)
    {
        return (String)wlAccessTokens.get(s);
    }

    public WLPush getPush()
    {
        if (wlPush == null)
        {
            wlPush = new WLPush(WLConfig.getInstance(), context, notificationSubscriptionState);
        }
        return wlPush;
    }

    public String getRequiredAccessTokenScope(int i, String s)
    {
        if (i != 401 && i != 403)
        {
            return null;
        } else
        {
            return (String)parseAuthenticationHeader(s).get("scope");
        }
    }

    public URL getServerUrl()
    {
        URL url;
        try
        {
            url = new URL(WLConfig.getInstance().getRootURL());
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException("Invalid server url");
        }
        return url;
    }

    protected Map getUserPreferencemap()
    {
        return userPreferenceMap;
    }

    public WLChallengeHandler getWLChallengeHandler(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = (BaseChallengeHandler)chMap.get(s);
        if (s != null && (s instanceof WLChallengeHandler))
        {
            return (WLChallengeHandler)s;
        } else
        {
            return null;
        }
    }

    public WLDevice getWLDevice()
    {
        return wlDevice;
    }

    protected String getWLServerURL()
    {
        String s = WLConfig.getInstance().getServerContext();
        String s1 = WLConfig.getInstance().getAppURL().getHost();
        if (s != null && s.trim().length() > 1)
        {
            return (new StringBuilder()).append(s1).append(s).toString();
        } else
        {
            return s1;
        }
    }

    protected Hashtable getchMap()
    {
        return chMap;
    }

    public void init(WLResponseListener wlresponselistener)
    {
        connect(wlresponselistener);
    }

    public void invokeProcedure(WLProcedureInvocationData wlprocedureinvocationdata, WLResponseListener wlresponselistener)
    {
        invokeProcedure(wlprocedureinvocationdata, wlresponselistener, null);
    }

    public void invokeProcedure(final WLProcedureInvocationData invokeProcedureWLRequest, WLResponseListener wlresponselistener, WLRequestOptions wlrequestoptions)
    {
        if (invokeProcedureWLRequest == null)
        {
            throw new IllegalArgumentException("Error during invocation of remote procedure, because invocation data can't be null.");
        }
        if (wlresponselistener == null)
        {
            throw new IllegalArgumentException("Error during invocation of remote procedure, because responseListener parameter can't be null.");
        }
        WLRequestOptions wlrequestoptions1 = wlrequestoptions;
        if (wlrequestoptions == null)
        {
            wlrequestoptions1 = new WLRequestOptions();
        }
        wlrequestoptions1.setResponseListener(wlresponselistener);
        if (context != null)
        {
            wlresponselistener = WLDeviceAuthManager.getInstance().getDeviceUUID(context);
            if (wlresponselistener != null && wlresponselistener.length() > 0)
            {
                addGlobalHeader("x-wl-device-id", wlresponselistener);
            }
        }
        if (invokeProcedureWLRequest.isCacheableRequest())
        {
            logger.debug("WLClient: Sending cacheable invokeProcedure GET request");
            invokeCacheableProcedure(invokeProcedureWLRequest, wlrequestoptions1);
            return;
        }
        wlrequestoptions1.addParameters(invokeProcedureWLRequest.getInvocationDataMap());
        invokeProcedureWLRequest = new WLRequest(new InvokeProcedureRequestListener(), wlrequestoptions1, WLConfig.getInstance(), context);
        if (context != null)
        {
            wlresponselistener = WLUserAuthManager.getInstance();
            wlresponselistener.init(context);
            if (wlresponselistener.doesValidCertificateExist())
            {
                try
                {
                    wlresponselistener.authenticateToTheServerWithCertificate(new WLRequestListener() {

                        final WLClient this$0;
                        final WLRequest val$invokeProcedureWLRequest;

                        public void onFailure(WLFailResponse wlfailresponse)
                        {
                            invokeProcedureWLRequest.makeRequest("query");
                        }

                        public void onSuccess(WLResponse wlresponse)
                        {
                            invokeProcedureWLRequest.makeRequest("query");
                        }

            
            {
                this$0 = WLClient.this;
                invokeProcedureWLRequest = wlrequest;
                super();
            }
                    }, wlrequestoptions1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (final WLProcedureInvocationData invokeProcedureWLRequest)
                {
                    return;
                }
            } else
            {
                invokeProcedureWLRequest.makeRequest("query");
                return;
            }
        } else
        {
            invokeProcedureWLRequest.makeRequest("query");
            return;
        }
    }

    public void logActivity(String s)
    {
        if (s == null)
        {
            throw new RuntimeException("ActivityType cannot be null");
        } else
        {
            WLRequestOptions wlrequestoptions = new WLRequestOptions();
            wlrequestoptions.addParameter("activity", s);
            (new WLRequest(new LogActivityListener(), wlrequestoptions, WLConfig.getInstance(), context)).makeRequest("logactivity");
            return;
        }
    }

    public void login(String s, WLRequestListener wlrequestlistener)
    {
        login(s, wlrequestlistener, null);
    }

    public void login(String s, WLRequestListener wlrequestlistener, WLRequestOptions wlrequestoptions)
    {
        if (s == null || wlrequestlistener == null)
        {
            throw new IllegalArgumentException("Error during login, because realmName or listener parameter can't be null.");
        }
        WLRequestOptions wlrequestoptions1 = wlrequestoptions;
        if (wlrequestoptions == null)
        {
            wlrequestoptions1 = new WLRequestOptions();
        }
        wlrequestoptions1.addParameter("realm", s);
        (new WLRequest(wlrequestlistener, wlrequestoptions1, WLConfig.getInstance(), context)).makeRequest("login");
    }

    public void logout(String s, WLRequestListener wlrequestlistener)
    {
        logout(s, wlrequestlistener, null);
    }

    public void logout(String s, WLRequestListener wlrequestlistener, WLRequestOptions wlrequestoptions)
    {
        if (s == null || wlrequestlistener == null)
        {
            throw new IllegalArgumentException("Error during logout, because realmName or listener parameter can't be null.");
        }
        WLRequestOptions wlrequestoptions1 = wlrequestoptions;
        if (wlrequestoptions == null)
        {
            wlrequestoptions1 = new WLRequestOptions();
        }
        wlrequestoptions1.addParameter("realm", s);
        (new WLRequest(wlrequestlistener, wlrequestoptions1, WLConfig.getInstance(), context)).makeRequest("logout");
    }

    public void obtainAccessToken(String s, WLResponseListener wlresponselistener)
    {
        obtainAccessToken(s, wlresponselistener, null);
    }

    public void obtainAccessToken(String s, WLResponseListener wlresponselistener, WLRequestOptions wlrequestoptions)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("scope cannot be null");
        }
        WLConfig wlconfig = WLConfig.getInstance();
        WLRequestOptions wlrequestoptions1 = wlrequestoptions;
        if (wlrequestoptions == null)
        {
            wlrequestoptions1 = new WLRequestOptions();
        }
        wlrequestoptions1.addHeader("wl-oauth-client", String.format("WLapp %s:%s", new Object[] {
            wlconfig.getAppId(), wlconfig.getWLEnvironment()
        }));
        wlrequestoptions1.addParameter("grant_type", "client_credentials");
        wlrequestoptions1.addParameter("scope", s);
        wlrequestoptions1.setResponseListener(wlresponselistener);
        (new WLRequest(new ObtainAccessTokenRequestListener(), wlrequestoptions1, wlconfig, context)).makeRequest("oauth/token", true);
    }

    public void purgeEventTransmissionBuffer()
    {
        wlDevice.getEventTransmitter().purgeEvents();
    }

    public void registerChallengeHandler(BaseChallengeHandler basechallengehandler)
    {
        if (basechallengehandler == null)
        {
            logger.error("Cannot register 'null' challenge handler");
            throw new RuntimeException("Cannot register 'null' challenge handler");
        }
        String s = basechallengehandler.getRealm();
        if (s == null)
        {
            logger.error("Application will exit because the challengeHandler parameter for registerChallengeHandler (challengeHandler) has a null realm property. Call this API with a valid reference to challenge handler.");
            throw new RuntimeException("Application will exit because the challengeHandler parameter for registerChallengeHandler (challengeHandler) has a null realm property. Call this API with a valid reference to challenge handler.");
        } else
        {
            chMap.put(s, basechallengehandler);
            return;
        }
    }

    public void removeGlobalHeader(String s)
    {
        AsynchronousRequestSender.getInstance().removeGlobalHeader(s);
    }

    void sendHeartBeat()
    {
        if (timer == null && heartbeatInterval > 0)
        {
            timer = new Timer();
            timer.scheduleAtFixedRate(new HeartBeatTask(context), heartbeatInterval * 1000, heartbeatInterval * 1000);
        }
    }

    public void sendInvoke(WLProcedureInvocationData wlprocedureinvocationdata, WLResponseListener wlresponselistener, WLRequestOptions wlrequestoptions)
    {
        if (wlresponselistener == null)
        {
            throw new IllegalArgumentException("Error during invocation of remote procedure, because responseListener parameter can't be null.");
        }
        WLRequestOptions wlrequestoptions1 = wlrequestoptions;
        if (wlrequestoptions == null)
        {
            wlrequestoptions1 = new WLRequestOptions();
        }
        wlrequestoptions1.setResponseListener(wlresponselistener);
        wlrequestoptions1.addParameters(wlprocedureinvocationdata.getInvocationDataMap());
        (new WLRequest(new InvokeProcedureRequestListener(), wlrequestoptions1, WLConfig.getInstance(), context)).makeRequest("invoke", true);
    }

    public void sendRequest(HttpUriRequest httpurirequest, WLHttpResponseListener wlhttpresponselistener)
    {
        AsynchronousRequestSender.getInstance().sendWLResourceRequestAsync(httpurirequest, wlhttpresponselistener);
    }

    public void sendRequest(HttpUriRequest httpurirequest, WLResponseListener wlresponselistener)
    {
        AsynchronousRequestSender.getInstance().sendWLResourceRequestAsync(httpurirequest, new WLResponseListenerWrapper(wlresponselistener));
    }

    public void setAllowHTTPClientCircularRedirect(boolean flag)
    {
        HttpClientManager.getInstance().getHttpClient().getParams().setBooleanParameter("http.protocol.allow-circular-redirects", flag);
    }

    public void setEventTransmissionPolicy(WLEventTransmissionPolicy wleventtransmissionpolicy)
    {
        wlDevice.getEventTransmitter().setEventTransmissionPolicy(wleventtransmissionpolicy);
    }

    public void setHeartBeatInterval(int i)
    {
        heartbeatInterval = i;
        if (timer != null)
        {
            timer.cancel();
            timer = null;
        }
        sendHeartBeat();
    }

    public void setNotificationSubscriptionState(JSONObject jsonobject)
    {
        notificationSubscriptionState = jsonobject;
        if (wlPush != null)
        {
            wlPush.updateNotificationSubscriptionState(jsonobject);
        }
    }

    public void setServerUrl(URL url)
    {
        url = url.toString();
        logger.debug((new StringBuilder()).append("set MobileFirst Platform server URL To:").append(url).toString());
        if (url.endsWith("/"))
        {
            url.substring(0, url.length() - 1);
        }
        WLConfig.getInstance().setServerUrl(url);
        resetServerContext();
    }

    public void transmitEvent(JSONObject jsonobject)
    {
        transmitEvent(jsonobject, false);
    }

    public void transmitEvent(JSONObject jsonobject, boolean flag)
    {
        wlDevice.getEventTransmitter().transmitEvent(jsonobject, flag);
    }






/*
    static String access$302(WLClient wlclient, String s)
    {
        wlclient.wlLastAccessToken = s;
        return s;
    }

*/
}
