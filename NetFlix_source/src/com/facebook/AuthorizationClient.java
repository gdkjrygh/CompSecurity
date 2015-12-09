// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import com.facebook.model.GraphUser;
import com.facebook.widget.WebDialog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook:
//            SessionLoginBehavior, FacebookException, Request, HttpMethod, 
//            AccessToken, RequestBatch, SessionDefaultAudience, GetTokenClient, 
//            AccessTokenSource, NativeProtocol, FacebookOperationCanceledException, Response

class AuthorizationClient
    implements Serializable
{
    static class AuthDialogBuilder extends com.facebook.widget.WebDialog.Builder
    {

        private static final String OAUTH_DIALOG = "oauth";
        static final String REDIRECT_URI = "fbconnect://success";

        public WebDialog build()
        {
            Bundle bundle = getParameters();
            bundle.putString("redirect_uri", "fbconnect://success");
            bundle.putString("client_id", getApplicationId());
            return new WebDialog(getContext(), "oauth", bundle, getTheme(), getListener());
        }

        public AuthDialogBuilder(Context context1, String s, Bundle bundle)
        {
            super(context1, s, "oauth", bundle);
        }
    }

    abstract class AuthHandler
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        final AuthorizationClient this$0;

        void cancel()
        {
        }

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

    static class AuthorizationRequest
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        private String applicationId;
        private SessionDefaultAudience defaultAudience;
        private boolean isLegacy;
        private SessionLoginBehavior loginBehavior;
        private List permissions;
        private String previousAccessToken;
        private int requestCode;
        private final transient StartActivityDelegate startActivityDelegate;

        String getApplicationId()
        {
            return applicationId;
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

        AuthorizationRequest(SessionLoginBehavior sessionloginbehavior, int i, boolean flag, List list, SessionDefaultAudience sessiondefaultaudience, String s, String s1, 
                StartActivityDelegate startactivitydelegate)
        {
            isLegacy = false;
            loginBehavior = sessionloginbehavior;
            requestCode = i;
            isLegacy = flag;
            permissions = list;
            defaultAudience = sessiondefaultaudience;
            applicationId = s;
            previousAccessToken = s1;
            startActivityDelegate = startactivitydelegate;
        }
    }

    static interface BackgroundProcessingListener
    {

        public abstract void onBackgroundProcessingStarted();

        public abstract void onBackgroundProcessingStopped();
    }

    class GetTokenAuthHandler extends AuthHandler
    {

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
                    authorizationrequest = Result.createTokenResult(AccessToken.createFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE));
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
                authorizationrequest.setPermissions(bundle);
            }
            tryNextHandler();
        }

        boolean tryAuthorize(AuthorizationRequest authorizationrequest)
        {
            getTokenClient = new GetTokenClient(context, authorizationrequest.getApplicationId());
            if (!getTokenClient.start())
            {
                return false;
            } else
            {
                notifyBackgroundProcessingStart();
                authorizationrequest = authorizationrequest. new GetTokenClient.CompletedListener() {

                    final GetTokenAuthHandler this$1;
                    final AuthorizationRequest val$request;

                    public void completed(Bundle bundle)
                    {
                        getTokenCompleted(request, bundle);
                    }

            
            {
                this$1 = final_gettokenauthhandler;
                request = AuthorizationRequest.this;
                super();
            }
                };
                getTokenClient.setCompletedListener(authorizationrequest);
                return true;
            }
        }

        GetTokenAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }

    abstract class KatanaAuthHandler extends AuthHandler
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
    }

    class KatanaLoginDialogAuthHandler extends KatanaAuthHandler
    {

        private static final long serialVersionUID = 1L;
        final AuthorizationClient this$0;

        private Result handleResultOk(Intent intent)
        {
            Object obj = null;
            Bundle bundle = intent.getExtras();
            String s = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            if (s == null)
            {
                intent = Result.createTokenResult(AccessToken.createFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_NATIVE));
            } else
            {
                intent = obj;
                if (!"ServiceDisabled".equals(s))
                {
                    if ("UserCanceled".equals(s))
                    {
                        return Result.createCancelResult(null);
                    } else
                    {
                        return Result.createErrorResult(s, bundle.getString("error_description"));
                    }
                }
            }
            return intent;
        }

        boolean onActivityResult(int i, int j, Intent intent)
        {
            if (intent == null)
            {
                intent = Result.createCancelResult("Operation canceled");
            } else
            if (NativeProtocol.isServiceDisabledResult20121101(intent))
            {
                intent = null;
            } else
            if (j == 0)
            {
                intent = Result.createCancelResult(intent.getStringExtra("com.facebook.platform.status.ERROR_DESCRIPTION"));
            } else
            if (j != -1)
            {
                intent = Result.createErrorResult("Unexpected resultCode from authorization.", null);
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
            return tryIntent(NativeProtocol.createLoginDialog20121101Intent(context, authorizationrequest.getApplicationId(), new ArrayList(authorizationrequest.getPermissions()), authorizationrequest.getDefaultAudience().getNativeProtocolAudience()), authorizationrequest.getRequestCode());
        }

        KatanaLoginDialogAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }

    class KatanaProxyAuthHandler extends KatanaAuthHandler
    {

        private static final long serialVersionUID = 1L;
        final AuthorizationClient this$0;

        private Result handleResultOk(Intent intent)
        {
            Result result = null;
            Bundle bundle = intent.getExtras();
            String s = bundle.getString("error");
            intent = s;
            if (s == null)
            {
                intent = bundle.getString("error_type");
            }
            if (intent == null)
            {
                result = Result.createTokenResult(AccessToken.createFromWebBundle(pendingRequest.getPermissions(), bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB));
            } else
            if (!ServerProtocol.errorsProxyAuthDisabled.contains(intent))
            {
                if (ServerProtocol.errorsUserCanceled.contains(intent))
                {
                    return Result.createCancelResult(null);
                } else
                {
                    return Result.createErrorResult(intent, bundle.getString("error_description"));
                }
            }
            return result;
        }

        boolean onActivityResult(int i, int j, Intent intent)
        {
            if (intent == null)
            {
                intent = Result.createCancelResult("Operation canceled");
            } else
            if (j == 0)
            {
                intent = Result.createCancelResult(intent.getStringExtra("error"));
            } else
            if (j != -1)
            {
                intent = Result.createErrorResult("Unexpected resultCode from authorization.", null);
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
            return tryIntent(NativeProtocol.createProxyAuthIntent(context, authorizationrequest.getApplicationId(), authorizationrequest.getPermissions()), authorizationrequest.getRequestCode());
        }

        KatanaProxyAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }

    static interface OnCompletedListener
    {

        public abstract void onCompleted(Result result);
    }

    static class Result
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        final Code code;
        final String errorMessage;
        final AccessToken token;

        static Result createCancelResult(String s)
        {
            return new Result(Code.CANCEL, null, s);
        }

        static Result createErrorResult(String s, String s1)
        {
            String s2 = s;
            if (s1 != null)
            {
                s2 = (new StringBuilder()).append(s).append(": ").append(s1).toString();
            }
            return new Result(Code.ERROR, null, s2);
        }

        static Result createTokenResult(AccessToken accesstoken)
        {
            return new Result(Code.SUCCESS, accesstoken, null);
        }

        private Result(Code code1, AccessToken accesstoken, String s)
        {
            token = accesstoken;
            errorMessage = s;
            code = code1;
        }
    }

    static final class Result.Code extends Enum
    {

        private static final Result.Code $VALUES[];
        public static final Result.Code CANCEL;
        public static final Result.Code ERROR;
        public static final Result.Code SUCCESS;

        public static Result.Code valueOf(String s)
        {
            return (Result.Code)Enum.valueOf(com/facebook/AuthorizationClient$Result$Code, s);
        }

        public static Result.Code[] values()
        {
            return (Result.Code[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new Result.Code("SUCCESS", 0);
            CANCEL = new Result.Code("CANCEL", 1);
            ERROR = new Result.Code("ERROR", 2);
            $VALUES = (new Result.Code[] {
                SUCCESS, CANCEL, ERROR
            });
        }

        private Result.Code(String s, int i)
        {
            super(s, i);
        }
    }

    static interface StartActivityDelegate
    {

        public abstract Activity getActivityContext();

        public abstract void startActivityForResult(Intent intent, int i);
    }

    class WebViewAuthHandler extends AuthHandler
    {

        private static final long serialVersionUID = 1L;
        private transient WebDialog loginDialog;
        final AuthorizationClient this$0;

        private String loadCookieToken()
        {
            return getStartActivityDelegate().getActivityContext().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
        }

        private void saveCookieToken(String s)
        {
            android.content.SharedPreferences.Editor editor = getStartActivityDelegate().getActivityContext().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit();
            editor.putString("TOKEN", s);
            if (!editor.commit())
            {
                Utility.logd("Facebook-AuthorizationClient", "Could not update saved web view auth handler token.");
            }
        }

        void cancel()
        {
            if (loginDialog != null)
            {
                loginDialog.dismiss();
                loginDialog = null;
            }
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
                bundle = AccessToken.createFromWebBundle(authorizationrequest.getPermissions(), bundle, AccessTokenSource.WEB_VIEW);
                authorizationrequest = Result.createTokenResult(bundle);
                CookieSyncManager.createInstance(context).sync();
                saveCookieToken(bundle.getToken());
            } else
            if (facebookexception instanceof FacebookOperationCanceledException)
            {
                authorizationrequest = Result.createCancelResult("User canceled log in.");
            } else
            {
                authorizationrequest = Result.createErrorResult(facebookexception.getMessage(), null);
            }
            completeAndValidate(authorizationrequest);
        }

        boolean tryAuthorize(AuthorizationRequest authorizationrequest)
        {
            String s = authorizationrequest.getApplicationId();
            Bundle bundle = new Bundle();
            if (!Utility.isNullOrEmpty(authorizationrequest.getPermissions()))
            {
                bundle.putString("scope", TextUtils.join(",", authorizationrequest.getPermissions()));
            }
            String s1 = authorizationrequest.getPreviousAccessToken();
            if (!Utility.isNullOrEmpty(s1) && s1.equals(loadCookieToken()))
            {
                bundle.putString("access_token", s1);
            } else
            {
                Utility.clearFacebookCookies(context);
            }
            authorizationrequest = authorizationrequest. new com.facebook.widget.WebDialog.OnCompleteListener() {

                final WebViewAuthHandler this$1;
                final AuthorizationRequest val$request;

                public void onComplete(Bundle bundle, FacebookException facebookexception)
                {
                    onWebDialogComplete(request, bundle, facebookexception);
                }

            
            {
                this$1 = final_webviewauthhandler;
                request = AuthorizationRequest.this;
                super();
            }
            };
            loginDialog = ((com.facebook.widget.WebDialog.Builder)(new AuthDialogBuilder(getStartActivityDelegate().getActivityContext(), s, bundle)).setOnCompleteListener(authorizationrequest)).build();
            loginDialog.show();
            return true;
        }

        WebViewAuthHandler()
        {
            this$0 = AuthorizationClient.this;
            super();
        }
    }


    private static final String TAG = "Facebook-AuthorizationClient";
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private static final long serialVersionUID = 1L;
    transient BackgroundProcessingListener backgroundProcessingListener;
    transient boolean checkedInternetPermission;
    transient Context context;
    AuthHandler currentHandler;
    List handlersToTry;
    transient OnCompletedListener onCompletedListener;
    AuthorizationRequest pendingRequest;
    transient StartActivityDelegate startActivityDelegate;

    AuthorizationClient()
    {
    }

    private void completeWithFailure()
    {
        complete(Result.createErrorResult("Login attempt failed.", null));
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
                arraylist.add(new KatanaLoginDialogAuthHandler());
            }
            arraylist.add(new KatanaProxyAuthHandler());
        }
        if (sessionloginbehavior.allowsWebViewAuth())
        {
            arraylist.add(new WebViewAuthHandler());
        }
        return arraylist;
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
            complete(Result.createErrorResult(context.getString(com.facebook.android.R.string.com_facebook_internet_permission_error_title), context.getString(com.facebook.android.R.string.com_facebook_internet_permission_error_message)));
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
        handlersToTry = null;
        currentHandler = null;
        pendingRequest = null;
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
        bundle.putString("fields", "id");
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
        final ArrayList tokenPermissions = new ArrayList();
        Object obj2 = pendingResult.token.getToken();
        Object obj1 = new Request.Callback() {

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

            
            {
                this$0 = AuthorizationClient.this;
                fbids = arraylist;
                super();
            }
        };
        String s = pendingRequest.getPreviousAccessToken();
        Object obj = createGetProfileIdRequest(s);
        ((Request) (obj)).setCallback(((Request.Callback) (obj1)));
        obj2 = createGetProfileIdRequest(((String) (obj2)));
        ((Request) (obj2)).setCallback(((Request.Callback) (obj1)));
        obj1 = createGetPermissionsRequest(s);
        ((Request) (obj1)).setCallback(new Request.Callback() {

            final AuthorizationClient this$0;
            final ArrayList val$tokenPermissions;

            public void onCompleted(Response response)
            {
                try
                {
                    response = (GraphMultiResult)response.getGraphObjectAs(com/facebook/model/GraphMultiResult);
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    return;
                }
                if (response == null)
                {
                    break MISSING_BLOCK_LABEL_65;
                }
                response = response.getData();
                if (response == null)
                {
                    break MISSING_BLOCK_LABEL_65;
                }
                if (response.size() == 1)
                {
                    response = (GraphObject)response.get(0);
                    tokenPermissions.addAll(response.asMap().keySet());
                }
            }

            
            {
                this$0 = AuthorizationClient.this;
                tokenPermissions = arraylist;
                super();
            }
        });
        obj = new RequestBatch(new Request[] {
            obj, obj2, obj1
        });
        ((RequestBatch) (obj)).setBatchApplicationId(pendingRequest.getApplicationId());
        ((RequestBatch) (obj)).addCallback(new RequestBatch.Callback() {

            final AuthorizationClient this$0;
            final ArrayList val$fbids;
            final Result val$pendingResult;
            final ArrayList val$tokenPermissions;

            public void onBatchCompleted(RequestBatch requestbatch)
            {
                if (fbids.size() != 2 || fbids.get(0) == null || fbids.get(1) == null || !((String)fbids.get(0)).equals(fbids.get(1)))
                {
                    break MISSING_BLOCK_LABEL_92;
                }
                requestbatch = Result.createTokenResult(AccessToken.createFromTokenWithRefreshedPermissions(pendingResult.token, tokenPermissions));
_L1:
                complete(requestbatch);
                notifyBackgroundProcessingStop();
                return;
                requestbatch = Result.createErrorResult("User logged in as different Facebook user.", null);
                  goto _L1
                requestbatch;
                complete(Result.createErrorResult("Caught exception", requestbatch.getMessage()));
                notifyBackgroundProcessingStop();
                return;
                requestbatch;
                notifyBackgroundProcessingStop();
                throw requestbatch;
            }

            
            {
                this$0 = AuthorizationClient.this;
                fbids = arraylist;
                pendingResult = result;
                tokenPermissions = arraylist1;
                super();
            }
        });
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
            return new StartActivityDelegate() {

                final AuthorizationClient this$0;

                public Activity getActivityContext()
                {
                    return pendingRequest.getStartActivityDelegate().getActivityContext();
                }

                public void startActivityForResult(Intent intent, int i)
                {
                    pendingRequest.getStartActivityDelegate().startActivityForResult(intent, i);
                }

            
            {
                this$0 = AuthorizationClient.this;
                super();
            }
            };
        } else
        {
            return null;
        }
    }

    boolean onActivityResult(int i, int j, Intent intent)
    {
        if (i == pendingRequest.getRequestCode())
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
        startActivityDelegate = new StartActivityDelegate() {

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

            
            {
                this$0 = AuthorizationClient.this;
                activity = activity1;
                super();
            }
        };
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
            return false;
        } else
        {
            return currentHandler.tryAuthorize(pendingRequest);
        }
    }

    void tryNextHandler()
    {
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


}
