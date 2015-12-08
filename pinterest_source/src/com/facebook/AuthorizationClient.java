// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            AppEventsLogger, SessionLoginBehavior, FacebookException, Request, 
//            HttpMethod, AccessToken, RequestBatch

class AuthorizationClient
    implements Serializable
{

    static final String EVENT_EXTRAS_DEFAULT_AUDIENCE = "default_audience";
    static final String EVENT_EXTRAS_IS_LEGACY = "is_legacy";
    static final String EVENT_EXTRAS_LOGIN_BEHAVIOR = "login_behavior";
    static final String EVENT_EXTRAS_MISSING_INTERNET_PERMISSION = "no_internet_permission";
    static final String EVENT_EXTRAS_NEW_PERMISSIONS = "new_permissions";
    static final String EVENT_EXTRAS_NOT_TRIED = "not_tried";
    static final String EVENT_EXTRAS_PERMISSIONS = "permissions";
    static final String EVENT_EXTRAS_REQUEST_CODE = "request_code";
    static final String EVENT_EXTRAS_TRY_LEGACY = "try_legacy";
    static final String EVENT_EXTRAS_TRY_LOGIN_ACTIVITY = "try_login_activity";
    static final String EVENT_NAME_LOGIN_COMPLETE = "fb_mobile_login_complete";
    private static final String EVENT_NAME_LOGIN_METHOD_COMPLETE = "fb_mobile_login_method_complete";
    private static final String EVENT_NAME_LOGIN_METHOD_START = "fb_mobile_login_method_start";
    static final String EVENT_NAME_LOGIN_START = "fb_mobile_login_start";
    static final String EVENT_PARAM_AUTH_LOGGER_ID = "0_auth_logger_id";
    static final String EVENT_PARAM_ERROR_CODE = "4_error_code";
    static final String EVENT_PARAM_ERROR_MESSAGE = "5_error_message";
    static final String EVENT_PARAM_EXTRAS = "6_extras";
    static final String EVENT_PARAM_LOGIN_RESULT = "2_result";
    static final String EVENT_PARAM_METHOD = "3_method";
    private static final String EVENT_PARAM_METHOD_RESULT_SKIPPED = "skipped";
    static final String EVENT_PARAM_TIMESTAMP = "1_timestamp_ms";
    private static final String TAG = "Facebook-AuthorizationClient";
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private static final long serialVersionUID = 1L;
    private transient AppEventsLogger appEventsLogger;
    transient BackgroundProcessingListener backgroundProcessingListener;
    transient boolean checkedInternetPermission;
    transient Context context;
    AuthHandler currentHandler;
    List handlersToTry;
    Map loggingExtras;
    transient OnCompletedListener onCompletedListener;
    AuthorizationRequest pendingRequest;
    transient StartActivityDelegate startActivityDelegate;

    AuthorizationClient()
    {
    }

    private void addLoggingExtra(String s, String s1, boolean flag)
    {
        if (loggingExtras == null)
        {
            loggingExtras = new HashMap();
        }
        String s2 = s1;
        if (loggingExtras.containsKey(s))
        {
            s2 = s1;
            if (flag)
            {
                s2 = (new StringBuilder()).append((String)loggingExtras.get(s)).append(",").append(s1).toString();
            }
        }
        loggingExtras.put(s, s2);
    }

    private void completeWithFailure()
    {
        complete(Result.createErrorResult(pendingRequest, "Login attempt failed.", null));
    }

    private AppEventsLogger getAppEventsLogger()
    {
        if (appEventsLogger == null || !appEventsLogger.getApplicationId().equals(pendingRequest.getApplicationId()))
        {
            appEventsLogger = AppEventsLogger.newLogger(context, pendingRequest.getApplicationId());
        }
        return appEventsLogger;
    }

    private static String getE2E()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("init", System.currentTimeMillis());
        }
        catch (JSONException jsonexception) { }
        return jsonobject.toString();
    }

    private List getHandlerTypes(AuthorizationRequest authorizationrequest)
    {
        ArrayList arraylist = new ArrayList();
        SessionLoginBehavior sessionloginbehavior = authorizationrequest.getLoginBehavior();
        if (sessionloginbehavior.allowsKatanaAuth())
        {
            if (!authorizationrequest.isLegacy())
            {
                arraylist.add(new GetTokenAuthHandler());
            }
            arraylist.add(new KatanaProxyAuthHandler());
        }
        if (sessionloginbehavior.allowsWebViewAuth())
        {
            arraylist.add(new WebViewAuthHandler());
        }
        return arraylist;
    }

    private void logAuthorizationMethodComplete(String s, Result result, Map map)
    {
        class Result.Code extends Enum
        {

            private static final Result.Code $VALUES[];
            public static final Result.Code CANCEL;
            public static final Result.Code ERROR;
            public static final Result.Code SUCCESS;
            private final String loggingValue;

            public static Result.Code valueOf(String s1)
            {
                return (Result.Code)Enum.valueOf(com/facebook/AuthorizationClient$Result$Code, s1);
            }

            public static Result.Code[] values()
            {
                return (Result.Code[])$VALUES.clone();
            }

            final String getLoggingValue()
            {
                return loggingValue;
            }

            static 
            {
                SUCCESS = new Result.Code("SUCCESS", 0, "success");
                CANCEL = new Result.Code("CANCEL", 1, "cancel");
                ERROR = new Result.Code("ERROR", 2, "error");
                $VALUES = (new Result.Code[] {
                    SUCCESS, CANCEL, ERROR
                });
            }

            private Result.Code(String s, int i, String s1)
            {
                super(s, i);
                loggingValue = s1;
            }
        }

        logAuthorizationMethodComplete(s, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    private void logAuthorizationMethodComplete(String s, String s1, String s2, String s3, Map map)
    {
        if (pendingRequest != null) goto _L2; else goto _L1
_L1:
        s1 = newAuthorizationLoggingBundle("");
        s1.putString("2_result", Result.Code.ERROR.getLoggingValue());
        s1.putString("5_error_message", "Unexpected call to logAuthorizationMethodComplete with null pendingRequest.");
_L4:
        s1.putString("3_method", s);
        s1.putLong("1_timestamp_ms", System.currentTimeMillis());
        getAppEventsLogger().logSdkEvent("fb_mobile_login_method_complete", null, s1);
        return;
_L2:
        Bundle bundle = newAuthorizationLoggingBundle(pendingRequest.getAuthId());
        if (s1 != null)
        {
            bundle.putString("2_result", s1);
        }
        if (s2 != null)
        {
            bundle.putString("5_error_message", s2);
        }
        if (s3 != null)
        {
            bundle.putString("4_error_code", s3);
        }
        s1 = bundle;
        if (map != null)
        {
            s1 = bundle;
            if (!map.isEmpty())
            {
                bundle.putString("6_extras", (new JSONObject(map)).toString());
                s1 = bundle;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void logAuthorizationMethodStart(String s)
    {
        Bundle bundle = newAuthorizationLoggingBundle(pendingRequest.getAuthId());
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("3_method", s);
        getAppEventsLogger().logSdkEvent("fb_mobile_login_method_start", null, bundle);
    }

    private void logWebLoginCompleted(String s, String s1)
    {
        AppEventsLogger appeventslogger = AppEventsLogger.newLogger(context, s);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", s1);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", s);
        appeventslogger.logSdkEvent("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    static Bundle newAuthorizationLoggingBundle(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", s);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    private void notifyBackgroundProcessingStart()
    {
        if (backgroundProcessingListener != null)
        {
            backgroundProcessingListener.onBackgroundProcessingStarted();
        }
    }

    private void notifyBackgroundProcessingStop()
    {
        if (backgroundProcessingListener != null)
        {
            backgroundProcessingListener.onBackgroundProcessingStopped();
        }
    }

    private void notifyOnCompleteListener(Result result)
    {
        if (onCompletedListener != null)
        {
            onCompletedListener.onCompleted(result);
        }
    }

    void authorize(AuthorizationRequest authorizationrequest)
    {
        if (authorizationrequest != null)
        {
            if (pendingRequest != null)
            {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            if (!authorizationrequest.needsNewTokenValidation() || checkInternetPermission())
            {
                pendingRequest = authorizationrequest;
                handlersToTry = getHandlerTypes(authorizationrequest);
                tryNextHandler();
                return;
            }
        }
    }

    void cancelCurrentHandler()
    {
        if (currentHandler != null)
        {
            currentHandler.cancel();
        }
    }

    boolean checkInternetPermission()
    {
        if (checkedInternetPermission)
        {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") != 0)
        {
            String s = context.getString(com.facebook.android.R.string.com_facebook_internet_permission_error_title);
            String s1 = context.getString(com.facebook.android.R.string.com_facebook_internet_permission_error_message);
            complete(Result.createErrorResult(pendingRequest, s, s1));
            return false;
        } else
        {
            checkedInternetPermission = true;
            return true;
        }
    }

    int checkPermission(String s)
    {
        return context.checkCallingOrSelfPermission(s);
    }

    void complete(Result result)
    {
        if (currentHandler != null)
        {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), result, currentHandler.methodLoggingExtras);
        }
        if (loggingExtras != null)
        {
            result.loggingExtras = loggingExtras;
        }
        handlersToTry = null;
        currentHandler = null;
        pendingRequest = null;
        loggingExtras = null;
        notifyOnCompleteListener(result);
    }

    void completeAndValidate(Result result)
    {
        if (result.token != null && pendingRequest.needsNewTokenValidation())
        {
            validateSameFbidAndFinish(result);
            return;
        } else
        {
            complete(result);
            return;
        }
    }

    void continueAuth()
    {
        if (pendingRequest == null || currentHandler == null)
        {
            throw new FacebookException("Attempted to continue authorization without a pending request.");
        }
        if (currentHandler.needsRestart())
        {
            currentHandler.cancel();
            tryCurrentHandler();
        }
    }

    Request createGetPermissionsRequest(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("access_token", s);
        return new Request(null, "me/permissions", bundle, HttpMethod.GET, null);
    }

    Request createGetProfileIdRequest(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id");
        bundle.putString("access_token", s);
        return new Request(null, "me", bundle, HttpMethod.GET, null);
    }

    RequestBatch createReauthValidationBatch(final Result pendingResult)
    {
        final ArrayList fbids = new ArrayList();
        final ArrayList grantedPermissions = new ArrayList();
        final ArrayList declinedPermissions = new ArrayList();
        Object obj2 = pendingResult.token.getToken();
        Object obj1 = new _cls3();
        String s = pendingRequest.getPreviousAccessToken();
        Object obj = createGetProfileIdRequest(s);
        ((Request) (obj)).setCallback(((Request.Callback) (obj1)));
        obj2 = createGetProfileIdRequest(((String) (obj2)));
        ((Request) (obj2)).setCallback(((Request.Callback) (obj1)));
        obj1 = createGetPermissionsRequest(s);
        ((Request) (obj1)).setCallback(new _cls4());
        obj = new RequestBatch(new Request[] {
            obj, obj2, obj1
        });
        ((RequestBatch) (obj)).setBatchApplicationId(pendingRequest.getApplicationId());
        ((RequestBatch) (obj)).addCallback(new _cls5());
        return ((RequestBatch) (obj));
    }

    BackgroundProcessingListener getBackgroundProcessingListener()
    {
        return backgroundProcessingListener;
    }

    boolean getInProgress()
    {
        return pendingRequest != null && currentHandler != null;
    }

    OnCompletedListener getOnCompletedListener()
    {
        return onCompletedListener;
    }

    StartActivityDelegate getStartActivityDelegate()
    {
        if (startActivityDelegate != null)
        {
            return startActivityDelegate;
        }
        if (pendingRequest != null)
        {
            return new _cls2();
        } else
        {
            return null;
        }
    }

    boolean onActivityResult(int i, int j, Intent intent)
    {
        if (pendingRequest != null && i == pendingRequest.getRequestCode())
        {
            return currentHandler.onActivityResult(i, j, intent);
        } else
        {
            return false;
        }
    }

    void setBackgroundProcessingListener(BackgroundProcessingListener backgroundprocessinglistener)
    {
        backgroundProcessingListener = backgroundprocessinglistener;
    }

    void setContext(final Activity activity)
    {
        context = activity;
        startActivityDelegate = new _cls1();
    }

    void setContext(Context context1)
    {
        context = context1;
        startActivityDelegate = null;
    }

    void setOnCompletedListener(OnCompletedListener oncompletedlistener)
    {
        onCompletedListener = oncompletedlistener;
    }

    void startOrContinueAuth(AuthorizationRequest authorizationrequest)
    {
        if (getInProgress())
        {
            continueAuth();
            return;
        } else
        {
            authorize(authorizationrequest);
            return;
        }
    }

    boolean tryCurrentHandler()
    {
        if (currentHandler.needsInternetPermission() && !checkInternetPermission())
        {
            addLoggingExtra("no_internet_permission", "1", false);
            return false;
        }
        boolean flag = currentHandler.tryAuthorize(pendingRequest);
        if (flag)
        {
            logAuthorizationMethodStart(currentHandler.getNameForLogging());
            return flag;
        } else
        {
            addLoggingExtra("not_tried", currentHandler.getNameForLogging(), true);
            return flag;
        }
    }

    void tryNextHandler()
    {
        if (currentHandler != null)
        {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), "skipped", null, null, currentHandler.methodLoggingExtras);
        }
_L4:
        if (handlersToTry == null || handlersToTry.isEmpty()) goto _L2; else goto _L1
_L1:
        currentHandler = (AuthHandler)handlersToTry.remove(0);
        if (!tryCurrentHandler()) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (pendingRequest != null)
        {
            completeWithFailure();
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    void validateSameFbidAndFinish(Result result)
    {
        if (result.token == null)
        {
            throw new FacebookException("Can't validate without a token");
        } else
        {
            result = createReauthValidationBatch(result);
            notifyBackgroundProcessingStart();
            result.executeAsync();
            return;
        }
    }





    private class Result
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        final Code code;
        final String errorCode;
        final String errorMessage;
        Map loggingExtras;
        final AuthorizationRequest request;
        final AccessToken token;

        static Result createCancelResult(AuthorizationRequest authorizationrequest, String s)
        {
            return new Result(authorizationrequest, Code.CANCEL, null, s, null);
        }

        static Result createErrorResult(AuthorizationRequest authorizationrequest, String s, String s1)
        {
            return createErrorResult(authorizationrequest, s, s1, null);
        }

        static Result createErrorResult(AuthorizationRequest authorizationrequest, String s, String s1, String s2)
        {
            s = TextUtils.join(": ", Utility.asListNoNulls(new String[] {
                s, s1
            }));
            return new Result(authorizationrequest, Code.ERROR, null, s, s2);
        }

        static Result createTokenResult(AuthorizationRequest authorizationrequest, AccessToken accesstoken)
        {
            return new Result(authorizationrequest, Code.SUCCESS, accesstoken, null, null);
        }

        private Result(AuthorizationRequest authorizationrequest, Code code1, AccessToken accesstoken, String s, String s1)
        {
            request = authorizationrequest;
            token = accesstoken;
            errorMessage = s;
            code = code1;
            errorCode = s1;
        }
    }


    private class AuthorizationRequest
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        private final String applicationId;
        private final String authId;
        private final SessionDefaultAudience defaultAudience;
        private boolean isLegacy;
        private boolean isRerequest;
        private final SessionLoginBehavior loginBehavior;
        private List permissions;
        private final String previousAccessToken;
        private final int requestCode;
        private final transient StartActivityDelegate startActivityDelegate;

        String getApplicationId()
        {
            return applicationId;
        }

        String getAuthId()
        {
            return authId;
        }

        SessionDefaultAudience getDefaultAudience()
        {
            return defaultAudience;
        }

        SessionLoginBehavior getLoginBehavior()
        {
            return loginBehavior;
        }

        List getPermissions()
        {
            return permissions;
        }

        String getPreviousAccessToken()
        {
            return previousAccessToken;
        }

        int getRequestCode()
        {
            return requestCode;
        }

        StartActivityDelegate getStartActivityDelegate()
        {
            return startActivityDelegate;
        }

        boolean isLegacy()
        {
            return isLegacy;
        }

        boolean isRerequest()
        {
            return isRerequest;
        }

        boolean needsNewTokenValidation()
        {
            return previousAccessToken != null && !isLegacy;
        }

        void setIsLegacy(boolean flag)
        {
            isLegacy = flag;
        }

        void setPermissions(List list)
        {
            permissions = list;
        }

        void setRerequest(boolean flag)
        {
            isRerequest = flag;
        }

        AuthorizationRequest(SessionLoginBehavior sessionloginbehavior, int i, boolean flag, List list, SessionDefaultAudience sessiondefaultaudience, String s, String s1, 
                StartActivityDelegate startactivitydelegate, String s2)
        {
            isLegacy = false;
            isRerequest = false;
            loginBehavior = sessionloginbehavior;
            requestCode = i;
            isLegacy = flag;
            permissions = list;
            defaultAudience = sessiondefaultaudience;
            applicationId = s;
            previousAccessToken = s1;
            startActivityDelegate = startactivitydelegate;
            authId = s2;
        }
    }


    private class GetTokenAuthHandler extends AuthHandler
    {
        private class AuthHandler
            implements Serializable
        {

            private static final long serialVersionUID = 1L;
            Map methodLoggingExtras;
            final AuthorizationClient this$0;

            protected void addLoggingExtra(String s, Object obj)
            {
                if (methodLoggingExtras == null)
                {
                    methodLoggingExtras = new HashMap();
                }
                Map map = methodLoggingExtras;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = obj.toString();
                }
                map.put(s, obj);
            }

            void cancel()
            {
            }

            abstract String getNameForLogging();

            boolean needsInternetPermission()
            {
                return false;
            }

            boolean needsRestart()
            {
                return false;
            }

            boolean onActivityResult(int i, int j, Intent intent)
            {
                return false;
            }

            abstract boolean tryAuthorize(AuthorizationRequest authorizationrequest);

            AuthHandler()
            {
                this$0 = AuthorizationClient.this;
                super();
            }
        }


        private static final long serialVersionUID = 1L;
        private transient GetTokenClient getTokenClient;
        final AuthorizationClient this$0;

        void cancel()
        {
            if (getTokenClient != null)
            {
                getTokenClient.cancel();
                getTokenClient = null;
            }
        }

        String getNameForLogging()
        {
            return "get_token";
        }

        void getTokenCompleted(AuthorizationRequest authorizationrequest, Bundle bundle)
        {
            getTokenClient = null;
            notifyBackgroundProcessingStop();
            if (bundle != null)
            {
                ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                Object obj = authorizationrequest.getPermissions();
                if (arraylist != null && (obj == null || arraylist.containsAll(((Collection) (obj)))))
                {
                    authorizationrequest = AccessToken.createFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE);
                    authorizationrequest = Result.createTokenResult(pendingRequest, authorizationrequest);
                    completeAndValidate(authorizationrequest);
                    return;
                }
                bundle = new ArrayList();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s = (String)((Iterator) (obj)).next();
                    if (!arraylist.contains(s))
                    {
                        bundle.add(s);
                    }
                } while (true);
                if (!bundle.isEmpty())
                {
                    addLoggingExtra("new_permissions", TextUtils.join(",", bundle));
                }
                authorizationrequest.setPermissions(bundle);
            }
            tryNextHandler();
        }

        boolean needsRestart()
        {
            return getTokenClient == null;
        }

        boolean tryAuthorize(final AuthorizationRequest request)
        {
            getTokenClient = new GetTokenClient(context, request.getApplicationId());
            if (!getTokenClient.start())
            {
                return false;
            } else
            {
                notifyBackgroundProcessingStart();
                class _cls1
                    implements com.facebook.internal.PlatformServiceClient.CompletedListener
                {

                    final GetTokenAuthHandler this$1;
                    final AuthorizationRequest val$request;

                    public void completed(Bundle bundle)
                    {
                        getTokenCompleted(request, bundle);
                    }

                _cls1()
                {
                    this$1 = GetTokenAuthHandler.this;
                    request = authorizationrequest;
                    super();
                }
                }

                request = new _cls1();
                getTokenClient.setCompletedListener(request);
                return true;
            }
        }

        GetTokenAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }


    private class KatanaProxyAuthHandler extends KatanaAuthHandler
    {
        private class KatanaAuthHandler extends AuthHandler
        {

            private static final long serialVersionUID = 1L;
            final AuthorizationClient this$0;

            protected boolean tryIntent(Intent intent, int i)
            {
                if (intent == null)
                {
                    return false;
                }
                try
                {
                    getStartActivityDelegate().startActivityForResult(intent, i);
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    return false;
                }
                return true;
            }

            KatanaAuthHandler()
            {
                this$0 = AuthorizationClient.this;
                super();
            }

            private class StartActivityDelegate
            {

                public abstract Activity getActivityContext();

                public abstract void startActivityForResult(Intent intent, int i);
            }

        }


        private static final long serialVersionUID = 1L;
        private String applicationId;
        final AuthorizationClient this$0;

        private Result handleResultOk(Intent intent)
        {
            Bundle bundle = intent.getExtras();
            String s = bundle.getString("error");
            intent = s;
            if (s == null)
            {
                intent = bundle.getString("error_type");
            }
            String s2 = bundle.getString("error_code");
            String s1 = bundle.getString("error_message");
            s = s1;
            if (s1 == null)
            {
                s = bundle.getString("error_description");
            }
            s1 = bundle.getString("e2e");
            if (!Utility.isNullOrEmpty(s1))
            {
                logWebLoginCompleted(applicationId, s1);
            }
            if (intent == null && s2 == null && s == null)
            {
                intent = AccessToken.createFromWebBundle(pendingRequest.getPermissions(), bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB);
                return Result.createTokenResult(pendingRequest, intent);
            }
            if (ServerProtocol.errorsProxyAuthDisabled.contains(intent))
            {
                return null;
            }
            if (ServerProtocol.errorsUserCanceled.contains(intent))
            {
                return Result.createCancelResult(pendingRequest, null);
            } else
            {
                return Result.createErrorResult(pendingRequest, intent, s, s2);
            }
        }

        String getNameForLogging()
        {
            return "katana_proxy_auth";
        }

        boolean onActivityResult(int i, int j, Intent intent)
        {
            if (intent == null)
            {
                intent = Result.createCancelResult(pendingRequest, "Operation canceled");
            } else
            if (j == 0)
            {
                intent = Result.createCancelResult(pendingRequest, intent.getStringExtra("error"));
            } else
            if (j != -1)
            {
                intent = Result.createErrorResult(pendingRequest, "Unexpected resultCode from authorization.", null);
            } else
            {
                intent = handleResultOk(intent);
            }
            if (intent != null)
            {
                completeAndValidate(intent);
            } else
            {
                tryNextHandler();
            }
            return true;
        }

        boolean tryAuthorize(AuthorizationRequest authorizationrequest)
        {
            applicationId = authorizationrequest.getApplicationId();
            String s = AuthorizationClient.getE2E();
            Intent intent = NativeProtocol.createProxyAuthIntent(context, authorizationrequest.getApplicationId(), authorizationrequest.getPermissions(), s, authorizationrequest.isRerequest(), authorizationrequest.getDefaultAudience());
            addLoggingExtra("e2e", s);
            return tryIntent(intent, authorizationrequest.getRequestCode());
        }

        KatanaProxyAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }


    private class WebViewAuthHandler extends AuthHandler
    {

        private static final long serialVersionUID = 1L;
        private String applicationId;
        private String e2e;
        private transient WebDialog loginDialog;
        final AuthorizationClient this$0;

        private String loadCookieToken()
        {
            return getStartActivityDelegate().getActivityContext().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
        }

        private void saveCookieToken(String s)
        {
            getStartActivityDelegate().getActivityContext().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", s).apply();
        }

        void cancel()
        {
            if (loginDialog != null)
            {
                loginDialog.setOnCompleteListener(null);
                loginDialog.dismiss();
                loginDialog = null;
            }
        }

        String getNameForLogging()
        {
            return "web_view";
        }

        boolean needsInternetPermission()
        {
            return true;
        }

        boolean needsRestart()
        {
            return true;
        }

        void onWebDialogComplete(AuthorizationRequest authorizationrequest, Bundle bundle, FacebookException facebookexception)
        {
            if (bundle != null)
            {
                if (bundle.containsKey("e2e"))
                {
                    e2e = bundle.getString("e2e");
                }
                bundle = AccessToken.createFromWebBundle(authorizationrequest.getPermissions(), bundle, AccessTokenSource.WEB_VIEW);
                authorizationrequest = Result.createTokenResult(pendingRequest, bundle);
                CookieSyncManager.createInstance(context).sync();
                saveCookieToken(bundle.getToken());
            } else
            if (facebookexception instanceof FacebookOperationCanceledException)
            {
                authorizationrequest = Result.createCancelResult(pendingRequest, "User canceled log in.");
            } else
            {
                e2e = null;
                bundle = facebookexception.getMessage();
                if (facebookexception instanceof FacebookServiceException)
                {
                    bundle = ((FacebookServiceException)facebookexception).getRequestError();
                    authorizationrequest = String.format("%d", new Object[] {
                        Integer.valueOf(bundle.getErrorCode())
                    });
                    bundle = bundle.toString();
                } else
                {
                    authorizationrequest = null;
                }
                authorizationrequest = Result.createErrorResult(pendingRequest, null, bundle, authorizationrequest);
            }
            if (!Utility.isNullOrEmpty(e2e))
            {
                logWebLoginCompleted(applicationId, e2e);
            }
            completeAndValidate(authorizationrequest);
        }

        boolean tryAuthorize(final AuthorizationRequest request)
        {
            applicationId = request.getApplicationId();
            Bundle bundle = new Bundle();
            if (!Utility.isNullOrEmpty(request.getPermissions()))
            {
                String s = TextUtils.join(",", request.getPermissions());
                bundle.putString("scope", s);
                addLoggingExtra("scope", s);
            }
            bundle.putString("default_audience", request.getDefaultAudience().getNativeProtocolAudience());
            Object obj = request.getPreviousAccessToken();
            class _cls1
                implements com.facebook.widget.WebDialog.OnCompleteListener
            {

                final WebViewAuthHandler this$1;
                final AuthorizationRequest val$request;

                public void onComplete(Bundle bundle1, FacebookException facebookexception)
                {
                    onWebDialogComplete(request, bundle1, facebookexception);
                }

                _cls1()
                {
                    this$1 = WebViewAuthHandler.this;
                    request = authorizationrequest;
                    super();
                }
            }

            if (!Utility.isNullOrEmpty(((String) (obj))) && ((String) (obj)).equals(loadCookieToken()))
            {
                bundle.putString("access_token", ((String) (obj)));
                addLoggingExtra("access_token", "1");
            } else
            {
                Utility.clearFacebookCookies(context);
                addLoggingExtra("access_token", "0");
            }
            obj = new _cls1();
            e2e = AuthorizationClient.getE2E();
            addLoggingExtra("e2e", e2e);
            loginDialog = ((com.facebook.widget.WebDialog.Builder)(new AuthDialogBuilder(getStartActivityDelegate().getActivityContext(), applicationId, bundle)).setE2E(e2e).setIsRerequest(request.isRerequest()).setOnCompleteListener(((com.facebook.widget.WebDialog.OnCompleteListener) (obj)))).build();
            loginDialog.show();
            return true;
        }

        WebViewAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }

        private class AuthDialogBuilder extends com.facebook.widget.WebDialog.Builder
        {

            private static final String OAUTH_DIALOG = "oauth";
            static final String REDIRECT_URI = "fbconnect://success";
            private String e2e;
            private boolean isRerequest;

            public WebDialog build()
            {
                Bundle bundle = getParameters();
                bundle.putString("redirect_uri", "fbconnect://success");
                bundle.putString("client_id", getApplicationId());
                bundle.putString("e2e", e2e);
                bundle.putString("response_type", "token");
                bundle.putString("return_scopes", "true");
                if (isRerequest && !Settings.getPlatformCompatibilityEnabled())
                {
                    bundle.putString("auth_type", "rerequest");
                }
                return new WebDialog(getContext(), "oauth", bundle, getTheme(), getListener());
            }

            public AuthDialogBuilder setE2E(String s)
            {
                e2e = s;
                return this;
            }

            public AuthDialogBuilder setIsRerequest(boolean flag)
            {
                isRerequest = flag;
                return this;
            }

            public AuthDialogBuilder(Context context1, String s, Bundle bundle)
            {
                super(context1, s, "oauth", bundle);
            }
        }

    }


    private class BackgroundProcessingListener
    {

        public abstract void onBackgroundProcessingStarted();

        public abstract void onBackgroundProcessingStopped();
    }


    private class OnCompletedListener
    {

        public abstract void onCompleted(Result result);
    }


    private class _cls3
        implements Request.Callback
    {

        final AuthorizationClient this$0;
        final ArrayList val$fbids;

        public void onCompleted(Response response)
        {
            try
            {
                response = (GraphUser)response.getGraphObjectAs(com/facebook/model/GraphUser);
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                return;
            }
            if (response == null)
            {
                break MISSING_BLOCK_LABEL_28;
            }
            fbids.add(response.getId());
        }

        _cls3()
        {
            this$0 = AuthorizationClient.this;
            fbids = arraylist;
            super();
        }
    }


    private class _cls4
        implements Request.Callback
    {

        final AuthorizationClient this$0;
        final ArrayList val$declinedPermissions;
        final ArrayList val$grantedPermissions;

        public void onCompleted(Response response)
        {
            try
            {
                response = Session.handlePermissionResponse(response);
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                return;
            }
            if (response == null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            grantedPermissions.addAll(response.getGrantedPermissions());
            declinedPermissions.addAll(response.getDeclinedPermissions());
        }

        _cls4()
        {
            this$0 = AuthorizationClient.this;
            grantedPermissions = arraylist;
            declinedPermissions = arraylist1;
            super();
        }
    }


    private class _cls5
        implements RequestBatch.Callback
    {

        final AuthorizationClient this$0;
        final ArrayList val$declinedPermissions;
        final ArrayList val$fbids;
        final ArrayList val$grantedPermissions;
        final Result val$pendingResult;

        public void onBatchCompleted(RequestBatch requestbatch)
        {
            if (fbids.size() != 2 || fbids.get(0) == null || fbids.get(1) == null || !((String)fbids.get(0)).equals(fbids.get(1)))
            {
                break MISSING_BLOCK_LABEL_105;
            }
            requestbatch = AccessToken.createFromTokenWithRefreshedPermissions(pendingResult.token, grantedPermissions, declinedPermissions);
            requestbatch = Result.createTokenResult(pendingRequest, requestbatch);
_L1:
            complete(requestbatch);
            notifyBackgroundProcessingStop();
            return;
            requestbatch = Result.createErrorResult(pendingRequest, "User logged in as different Facebook user.", null);
              goto _L1
            requestbatch;
            complete(Result.createErrorResult(pendingRequest, "Caught exception", requestbatch.getMessage()));
            notifyBackgroundProcessingStop();
            return;
            requestbatch;
            notifyBackgroundProcessingStop();
            throw requestbatch;
        }

        _cls5()
        {
            this$0 = AuthorizationClient.this;
            fbids = arraylist;
            pendingResult = result;
            grantedPermissions = arraylist1;
            declinedPermissions = arraylist2;
            super();
        }
    }


    private class _cls2
        implements StartActivityDelegate
    {

        final AuthorizationClient this$0;

        public Activity getActivityContext()
        {
            return pendingRequest.getStartActivityDelegate().getActivityContext();
        }

        public void startActivityForResult(Intent intent, int i)
        {
            pendingRequest.getStartActivityDelegate().startActivityForResult(intent, i);
        }

        _cls2()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }


    private class _cls1
        implements StartActivityDelegate
    {

        final AuthorizationClient this$0;
        final Activity val$activity;

        public Activity getActivityContext()
        {
            return activity;
        }

        public void startActivityForResult(Intent intent, int i)
        {
            activity.startActivityForResult(intent, i);
        }

        _cls1()
        {
            this$0 = AuthorizationClient.this;
            activity = activity1;
            super();
        }
    }

}
