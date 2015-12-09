// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.support.v4.content.j;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            SharedPreferencesTokenCachingStrategy, SessionState, TokenCachingStrategy, AccessToken, 
//            Settings, AppEventsLogger, LoginActivity, SessionLoginBehavior, 
//            FacebookAuthorizationException, FacebookOperationCanceledException, Response, AuthorizationClient, 
//            SessionDefaultAudience, FacebookException, Request, AccessTokenSource

public class Session
    implements Serializable
{
    public static class AuthorizationRequest
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        private String applicationId;
        private final String authId;
        private SessionDefaultAudience defaultAudience;
        private boolean isLegacy;
        private final Map loggingExtras;
        private SessionLoginBehavior loginBehavior;
        private List permissions;
        private int requestCode;
        private final StartActivityDelegate startActivityDelegate;
        private StatusCallback statusCallback;
        private String validateSameFbidAsToken;

        private void readObject(ObjectInputStream objectinputstream)
            throws InvalidObjectException
        {
            throw new InvalidObjectException("Cannot readObject, serialization proxy required");
        }

        String getApplicationId()
        {
            return applicationId;
        }

        String getAuthId()
        {
            return authId;
        }

        AuthorizationClient.AuthorizationRequest getAuthorizationClientRequest()
        {
            AuthorizationClient.StartActivityDelegate startactivitydelegate = new AuthorizationClient.StartActivityDelegate() {

                final AuthorizationRequest this$0;

                public Activity getActivityContext()
                {
                    return startActivityDelegate.getActivityContext();
                }

                public void startActivityForResult(Intent intent, int i)
                {
                    startActivityDelegate.startActivityForResult(intent, i);
                }

            
            {
                this$0 = AuthorizationRequest.this;
                super();
            }
            };
            return new AuthorizationClient.AuthorizationRequest(loginBehavior, requestCode, isLegacy, permissions, defaultAudience, applicationId, validateSameFbidAsToken, startactivitydelegate, authId);
        }

        StatusCallback getCallback()
        {
            return statusCallback;
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

        int getRequestCode()
        {
            return requestCode;
        }

        StartActivityDelegate getStartActivityDelegate()
        {
            return startActivityDelegate;
        }

        String getValidateSameFbidAsToken()
        {
            return validateSameFbidAsToken;
        }

        boolean isLegacy()
        {
            return isLegacy;
        }

        void setApplicationId(String s)
        {
            applicationId = s;
        }

        AuthorizationRequest setCallback(StatusCallback statuscallback)
        {
            statusCallback = statuscallback;
            return this;
        }

        AuthorizationRequest setDefaultAudience(SessionDefaultAudience sessiondefaultaudience)
        {
            if (sessiondefaultaudience != null)
            {
                defaultAudience = sessiondefaultaudience;
            }
            return this;
        }

        public void setIsLegacy(boolean flag)
        {
            isLegacy = flag;
        }

        AuthorizationRequest setLoginBehavior(SessionLoginBehavior sessionloginbehavior)
        {
            if (sessionloginbehavior != null)
            {
                loginBehavior = sessionloginbehavior;
            }
            return this;
        }

        AuthorizationRequest setPermissions(List list)
        {
            if (list != null)
            {
                permissions = list;
            }
            return this;
        }

        transient AuthorizationRequest setPermissions(String as[])
        {
            return setPermissions(Arrays.asList(as));
        }

        AuthorizationRequest setRequestCode(int i)
        {
            if (i >= 0)
            {
                requestCode = i;
            }
            return this;
        }

        void setValidateSameFbidAsToken(String s)
        {
            validateSameFbidAsToken = s;
        }

        Object writeReplace()
        {
            return new AuthRequestSerializationProxyV1(loginBehavior, requestCode, permissions, defaultAudience.name(), isLegacy, applicationId, validateSameFbidAsToken);
        }








        AuthorizationRequest(Activity activity)
        {
            loginBehavior = SessionLoginBehavior.SSO_WITH_FALLBACK;
            requestCode = 64206;
            isLegacy = false;
            permissions = Collections.emptyList();
            defaultAudience = SessionDefaultAudience.FRIENDS;
            authId = UUID.randomUUID().toString();
            loggingExtras = new HashMap();
            startActivityDelegate = activity. new _cls1();
        }

        AuthorizationRequest(Fragment fragment)
        {
            loginBehavior = SessionLoginBehavior.SSO_WITH_FALLBACK;
            requestCode = 64206;
            isLegacy = false;
            permissions = Collections.emptyList();
            defaultAudience = SessionDefaultAudience.FRIENDS;
            authId = UUID.randomUUID().toString();
            loggingExtras = new HashMap();
            startActivityDelegate = fragment. new _cls2();
        }

        private AuthorizationRequest(SessionLoginBehavior sessionloginbehavior, int i, List list, String s, boolean flag, String s1, String s2)
        {
            loginBehavior = SessionLoginBehavior.SSO_WITH_FALLBACK;
            requestCode = 64206;
            isLegacy = false;
            permissions = Collections.emptyList();
            defaultAudience = SessionDefaultAudience.FRIENDS;
            authId = UUID.randomUUID().toString();
            loggingExtras = new HashMap();
            startActivityDelegate = new _cls3();
            loginBehavior = sessionloginbehavior;
            requestCode = i;
            permissions = list;
            defaultAudience = SessionDefaultAudience.valueOf(s);
            isLegacy = flag;
            applicationId = s1;
            validateSameFbidAsToken = s2;
        }

    }

    private static class AuthorizationRequest.AuthRequestSerializationProxyV1
        implements Serializable
    {

        private static final long serialVersionUID = 0x8697a02191312db1L;
        private final String applicationId;
        private final String defaultAudience;
        private boolean isLegacy;
        private final SessionLoginBehavior loginBehavior;
        private final List permissions;
        private final int requestCode;
        private final String validateSameFbidAsToken;

        private Object readResolve()
        {
            return new AuthorizationRequest(loginBehavior, requestCode, permissions, defaultAudience, isLegacy, applicationId, validateSameFbidAsToken);
        }

        private AuthorizationRequest.AuthRequestSerializationProxyV1(SessionLoginBehavior sessionloginbehavior, int i, List list, String s, boolean flag, String s1, String s2)
        {
            loginBehavior = sessionloginbehavior;
            requestCode = i;
            permissions = list;
            defaultAudience = s;
            isLegacy = flag;
            applicationId = s1;
            validateSameFbidAsToken = s2;
        }

    }

    private class AutoPublishAsyncTask extends AsyncTask
    {

        private final Context mApplicationContext;
        private final String mApplicationId;
        final Session this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            try
            {
                Settings.publishInstallAndWaitForResponse(mApplicationContext, mApplicationId, true);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Utility.logd("Facebook-publish", avoid);
            }
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            synchronized (Session.this)
            {
                autoPublishAsyncTask = null;
            }
            return;
            exception;
            void1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public AutoPublishAsyncTask(String s, Context context)
        {
            this$0 = Session.this;
            super();
            mApplicationId = s;
            mApplicationContext = context.getApplicationContext();
        }
    }

    public static final class Builder
    {

        private String applicationId;
        private final Context context;
        private TokenCachingStrategy tokenCachingStrategy;

        public Session build()
        {
            return new Session(context, applicationId, tokenCachingStrategy);
        }

        public Builder setApplicationId(String s)
        {
            applicationId = s;
            return this;
        }

        public Builder setTokenCachingStrategy(TokenCachingStrategy tokencachingstrategy)
        {
            tokenCachingStrategy = tokencachingstrategy;
            return this;
        }

        public Builder(Context context1)
        {
            context = context1;
        }
    }

    public static final class NewPermissionsRequest extends AuthorizationRequest
    {

        private static final long serialVersionUID = 1L;

        AuthorizationClient.AuthorizationRequest getAuthorizationClientRequest()
        {
            AuthorizationClient.AuthorizationRequest authorizationrequest = super.getAuthorizationClientRequest();
            authorizationrequest.setRerequest(true);
            return authorizationrequest;
        }

        public volatile AuthorizationRequest setCallback(StatusCallback statuscallback)
        {
            return setCallback(statuscallback);
        }

        public final NewPermissionsRequest setCallback(StatusCallback statuscallback)
        {
            super.setCallback(statuscallback);
            return this;
        }

        public volatile AuthorizationRequest setDefaultAudience(SessionDefaultAudience sessiondefaultaudience)
        {
            return setDefaultAudience(sessiondefaultaudience);
        }

        public final NewPermissionsRequest setDefaultAudience(SessionDefaultAudience sessiondefaultaudience)
        {
            super.setDefaultAudience(sessiondefaultaudience);
            return this;
        }

        public volatile AuthorizationRequest setLoginBehavior(SessionLoginBehavior sessionloginbehavior)
        {
            return setLoginBehavior(sessionloginbehavior);
        }

        public final NewPermissionsRequest setLoginBehavior(SessionLoginBehavior sessionloginbehavior)
        {
            super.setLoginBehavior(sessionloginbehavior);
            return this;
        }

        public volatile AuthorizationRequest setRequestCode(int i)
        {
            return setRequestCode(i);
        }

        public final NewPermissionsRequest setRequestCode(int i)
        {
            super.setRequestCode(i);
            return this;
        }

        public NewPermissionsRequest(Activity activity, List list)
        {
            super(activity);
            setPermissions(list);
        }

        public transient NewPermissionsRequest(Activity activity, String as[])
        {
            super(activity);
            setPermissions(as);
        }

        public NewPermissionsRequest(Fragment fragment, List list)
        {
            super(fragment);
            setPermissions(list);
        }

        public transient NewPermissionsRequest(Fragment fragment, String as[])
        {
            super(fragment);
            setPermissions(as);
        }
    }

    public static final class OpenRequest extends AuthorizationRequest
    {

        private static final long serialVersionUID = 1L;

        public volatile AuthorizationRequest setCallback(StatusCallback statuscallback)
        {
            return setCallback(statuscallback);
        }

        public final OpenRequest setCallback(StatusCallback statuscallback)
        {
            super.setCallback(statuscallback);
            return this;
        }

        public volatile AuthorizationRequest setDefaultAudience(SessionDefaultAudience sessiondefaultaudience)
        {
            return setDefaultAudience(sessiondefaultaudience);
        }

        public final OpenRequest setDefaultAudience(SessionDefaultAudience sessiondefaultaudience)
        {
            super.setDefaultAudience(sessiondefaultaudience);
            return this;
        }

        public volatile AuthorizationRequest setLoginBehavior(SessionLoginBehavior sessionloginbehavior)
        {
            return setLoginBehavior(sessionloginbehavior);
        }

        public final OpenRequest setLoginBehavior(SessionLoginBehavior sessionloginbehavior)
        {
            super.setLoginBehavior(sessionloginbehavior);
            return this;
        }

        public volatile AuthorizationRequest setPermissions(List list)
        {
            return setPermissions(list);
        }

        public volatile AuthorizationRequest setPermissions(String as[])
        {
            return setPermissions(as);
        }

        public final OpenRequest setPermissions(List list)
        {
            super.setPermissions(list);
            return this;
        }

        public final transient OpenRequest setPermissions(String as[])
        {
            super.setPermissions(as);
            return this;
        }

        public volatile AuthorizationRequest setRequestCode(int i)
        {
            return setRequestCode(i);
        }

        public final OpenRequest setRequestCode(int i)
        {
            super.setRequestCode(i);
            return this;
        }

        public OpenRequest(Activity activity)
        {
            super(activity);
        }

        public OpenRequest(Fragment fragment)
        {
            super(fragment);
        }
    }

    static class PermissionsPair
    {

        List declinedPermissions;
        List grantedPermissions;

        public List getDeclinedPermissions()
        {
            return declinedPermissions;
        }

        public List getGrantedPermissions()
        {
            return grantedPermissions;
        }

        public PermissionsPair(List list, List list1)
        {
            grantedPermissions = list;
            declinedPermissions = list1;
        }
    }

    private static class SerializationProxyV1
        implements Serializable
    {

        private static final long serialVersionUID = 0x6a59fe98cd935affL;
        private final String applicationId;
        private final Date lastAttemptedTokenExtendDate;
        private final AuthorizationRequest pendingAuthorizationRequest;
        private final boolean shouldAutoPublish;
        private final SessionState state;
        private final AccessToken tokenInfo;

        private Object readResolve()
        {
            return new Session(applicationId, state, tokenInfo, lastAttemptedTokenExtendDate, shouldAutoPublish, pendingAuthorizationRequest);
        }

        SerializationProxyV1(String s, SessionState sessionstate, AccessToken accesstoken, Date date, boolean flag, AuthorizationRequest authorizationrequest)
        {
            applicationId = s;
            state = sessionstate;
            tokenInfo = accesstoken;
            lastAttemptedTokenExtendDate = date;
            shouldAutoPublish = flag;
            pendingAuthorizationRequest = authorizationrequest;
        }
    }

    private static class SerializationProxyV2
        implements Serializable
    {

        private static final long serialVersionUID = 0x6a59fe98cd935b00L;
        private final String applicationId;
        private final Date lastAttemptedTokenExtendDate;
        private final AuthorizationRequest pendingAuthorizationRequest;
        private final Set requestedPermissions;
        private final boolean shouldAutoPublish;
        private final SessionState state;
        private final AccessToken tokenInfo;

        private Object readResolve()
        {
            return new Session(applicationId, state, tokenInfo, lastAttemptedTokenExtendDate, shouldAutoPublish, pendingAuthorizationRequest, requestedPermissions);
        }

        SerializationProxyV2(String s, SessionState sessionstate, AccessToken accesstoken, Date date, boolean flag, AuthorizationRequest authorizationrequest, Set set)
        {
            applicationId = s;
            state = sessionstate;
            tokenInfo = accesstoken;
            lastAttemptedTokenExtendDate = date;
            shouldAutoPublish = flag;
            pendingAuthorizationRequest = authorizationrequest;
            requestedPermissions = set;
        }
    }

    static interface StartActivityDelegate
    {

        public abstract Activity getActivityContext();

        public abstract void startActivityForResult(Intent intent, int i);
    }

    public static interface StatusCallback
    {

        public abstract void call(Session session, SessionState sessionstate, Exception exception);
    }

    class TokenRefreshRequest
        implements ServiceConnection
    {

        final Messenger messageReceiver;
        Messenger messageSender;
        final Session this$0;

        private void cleanup()
        {
            if (currentTokenRefreshRequest == this)
            {
                currentTokenRefreshRequest = null;
            }
        }

        private void refreshToken()
        {
            Bundle bundle = new Bundle();
            bundle.putString("access_token", getTokenInfo().getToken());
            Message message = Message.obtain();
            message.setData(bundle);
            message.replyTo = messageReceiver;
            try
            {
                messageSender.send(message);
                return;
            }
            catch (RemoteException remoteexception)
            {
                cleanup();
            }
        }

        public void bind()
        {
            Intent intent = NativeProtocol.createTokenRefreshIntent(Session.getStaticContext());
            if (intent != null && Session.staticContext.bindService(intent, this, 1))
            {
                setLastAttemptedTokenExtendDate(new Date());
                return;
            } else
            {
                cleanup();
                return;
            }
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            messageSender = new Messenger(ibinder);
            refreshToken();
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            cleanup();
            Session.staticContext.unbindService(this);
        }


        TokenRefreshRequest()
        {
            this$0 = Session.this;
            super();
            messageReceiver = new Messenger(new TokenRefreshRequestHandler(Session.this, this));
            messageSender = null;
        }
    }

    static class TokenRefreshRequestHandler extends Handler
    {

        private WeakReference refreshRequestWeakReference;
        private WeakReference sessionWeakReference;

        public void handleMessage(Message message)
        {
            String s = message.getData().getString("access_token");
            Session session = (Session)sessionWeakReference.get();
            if (session != null && s != null)
            {
                session.extendTokenCompleted(message.getData());
            }
            message = (TokenRefreshRequest)refreshRequestWeakReference.get();
            if (message != null)
            {
                Session.staticContext.unbindService(message);
                message.cleanup();
            }
        }

        TokenRefreshRequestHandler(Session session, TokenRefreshRequest tokenrefreshrequest)
        {
            super(Looper.getMainLooper());
            sessionWeakReference = new WeakReference(session);
            refreshRequestWeakReference = new WeakReference(tokenrefreshrequest);
        }
    }


    public static final String ACTION_ACTIVE_SESSION_CLOSED = "com.facebook.sdk.ACTIVE_SESSION_CLOSED";
    public static final String ACTION_ACTIVE_SESSION_OPENED = "com.facebook.sdk.ACTIVE_SESSION_OPENED";
    public static final String ACTION_ACTIVE_SESSION_SET = "com.facebook.sdk.ACTIVE_SESSION_SET";
    public static final String ACTION_ACTIVE_SESSION_UNSET = "com.facebook.sdk.ACTIVE_SESSION_UNSET";
    private static final String AUTH_BUNDLE_SAVE_KEY = "com.facebook.sdk.Session.authBundleKey";
    public static final int DEFAULT_AUTHORIZE_ACTIVITY_CODE = 64206;
    private static final String MANAGE_PERMISSION_PREFIX = "manage";
    private static final Set OTHER_PUBLISH_PERMISSIONS = new HashSet() {

            
            {
                add("ads_management");
                add("create_event");
                add("rsvp_event");
            }
    };
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";
    private static final String SESSION_BUNDLE_SAVE_KEY = "com.facebook.sdk.Session.saveSessionKey";
    private static final Object STATIC_LOCK = new Object();
    public static final String TAG = com/facebook/Session.getCanonicalName();
    private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
    private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 0x15180;
    public static final String WEB_VIEW_ERROR_CODE_KEY = "com.facebook.sdk.WebViewErrorCode";
    public static final String WEB_VIEW_FAILING_URL_KEY = "com.facebook.sdk.FailingUrl";
    private static Session activeSession;
    private static final long serialVersionUID = 1L;
    private static volatile Context staticContext;
    private AppEventsLogger appEventsLogger;
    private String applicationId;
    private volatile Bundle authorizationBundle;
    private AuthorizationClient authorizationClient;
    private AutoPublishAsyncTask autoPublishAsyncTask;
    private final List callbacks;
    private volatile TokenRefreshRequest currentTokenRefreshRequest;
    private Handler handler;
    private Date lastAttemptedTokenExtendDate;
    private final Object lock;
    private AuthorizationRequest pendingAuthorizationRequest;
    private SessionState state;
    private TokenCachingStrategy tokenCachingStrategy;
    private AccessToken tokenInfo;

    public Session(Context context)
    {
        this(context, null, null, true);
    }

    Session(Context context, String s, TokenCachingStrategy tokencachingstrategy)
    {
        this(context, s, tokencachingstrategy, true);
    }

    Session(Context context, String s, TokenCachingStrategy tokencachingstrategy, boolean flag)
    {
        Object obj = null;
        super();
        lastAttemptedTokenExtendDate = new Date(0L);
        lock = new Object();
        String s1 = s;
        if (context != null)
        {
            s1 = s;
            if (s == null)
            {
                s1 = Utility.getMetadataApplicationId(context);
            }
        }
        Validate.notNull(s1, "applicationId");
        initializeStaticContext(context);
        context = tokencachingstrategy;
        if (tokencachingstrategy == null)
        {
            context = new SharedPreferencesTokenCachingStrategy(staticContext);
        }
        applicationId = s1;
        tokenCachingStrategy = context;
        state = SessionState.CREATED;
        pendingAuthorizationRequest = null;
        callbacks = new ArrayList();
        handler = new Handler(Looper.getMainLooper());
        s = obj;
        if (flag)
        {
            s = context.load();
        }
        if (TokenCachingStrategy.hasTokenInformation(s))
        {
            tokencachingstrategy = TokenCachingStrategy.getDate(s, "com.facebook.TokenCachingStrategy.ExpirationDate");
            Date date = new Date();
            if (tokencachingstrategy == null || tokencachingstrategy.before(date))
            {
                context.clear();
                tokenInfo = AccessToken.createEmptyToken();
                return;
            } else
            {
                tokenInfo = AccessToken.createFromCache(s);
                state = SessionState.CREATED_TOKEN_LOADED;
                return;
            }
        } else
        {
            tokenInfo = AccessToken.createEmptyToken();
            return;
        }
    }

    private Session(String s, SessionState sessionstate, AccessToken accesstoken, Date date, boolean flag, AuthorizationRequest authorizationrequest)
    {
        lastAttemptedTokenExtendDate = new Date(0L);
        lock = new Object();
        applicationId = s;
        state = sessionstate;
        tokenInfo = accesstoken;
        lastAttemptedTokenExtendDate = date;
        pendingAuthorizationRequest = authorizationrequest;
        handler = new Handler(Looper.getMainLooper());
        currentTokenRefreshRequest = null;
        tokenCachingStrategy = null;
        callbacks = new ArrayList();
    }


    private Session(String s, SessionState sessionstate, AccessToken accesstoken, Date date, boolean flag, AuthorizationRequest authorizationrequest, Set set)
    {
        lastAttemptedTokenExtendDate = new Date(0L);
        lock = new Object();
        applicationId = s;
        state = sessionstate;
        tokenInfo = accesstoken;
        lastAttemptedTokenExtendDate = date;
        pendingAuthorizationRequest = authorizationrequest;
        handler = new Handler(Looper.getMainLooper());
        currentTokenRefreshRequest = null;
        tokenCachingStrategy = null;
        callbacks = new ArrayList();
    }


    private static boolean areEqual(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    private void autoPublishAsync()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        AutoPublishAsyncTask autopublishasynctask = obj;
        if (autoPublishAsyncTask != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        autopublishasynctask = obj;
        String s;
        if (!Settings.getShouldAutoPublishInstall())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        s = applicationId;
        autopublishasynctask = obj;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        autopublishasynctask = new AutoPublishAsyncTask(s, staticContext);
        autoPublishAsyncTask = autopublishasynctask;
        this;
        JVM INSTR monitorexit ;
        if (autopublishasynctask != null)
        {
            autopublishasynctask.execute(new Void[0]);
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void finishAuthorization(AccessToken accesstoken, Exception exception)
    {
        SessionState sessionstate = state;
        if (accesstoken == null) goto _L2; else goto _L1
_L1:
        tokenInfo = accesstoken;
        saveTokenToCache(accesstoken);
        state = SessionState.OPENED;
_L4:
        pendingAuthorizationRequest = null;
        postStateChange(sessionstate, state, exception);
        return;
_L2:
        if (exception != null)
        {
            state = SessionState.CLOSED_LOGIN_FAILED;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void finishReauthorization(AccessToken accesstoken, Exception exception)
    {
        SessionState sessionstate = state;
        if (accesstoken != null)
        {
            tokenInfo = accesstoken;
            saveTokenToCache(accesstoken);
            state = SessionState.OPENED_TOKEN_UPDATED;
        }
        pendingAuthorizationRequest = null;
        postStateChange(sessionstate, state, exception);
    }

    public static final Session getActiveSession()
    {
        Session session;
        synchronized (STATIC_LOCK)
        {
            session = activeSession;
        }
        return session;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private AppEventsLogger getAppEventsLogger()
    {
        AppEventsLogger appeventslogger;
        synchronized (lock)
        {
            if (appEventsLogger == null)
            {
                appEventsLogger = AppEventsLogger.newLogger(staticContext, applicationId);
            }
            appeventslogger = appEventsLogger;
        }
        return appeventslogger;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private Intent getLoginActivityIntent(AuthorizationRequest authorizationrequest)
    {
        Intent intent = new Intent();
        intent.setClass(getStaticContext(), com/facebook/LoginActivity);
        intent.setAction(authorizationrequest.getLoginBehavior().toString());
        intent.putExtras(LoginActivity.populateIntentExtras(authorizationrequest.getAuthorizationClientRequest()));
        return intent;
    }

    static Context getStaticContext()
    {
        return staticContext;
    }

    private void handleAuthorizationResult(int i, AuthorizationClient.Result result)
    {
        Object obj;
        AccessToken accesstoken;
        if (i == -1)
        {
            if (result.code == AuthorizationClient.Result.Code.SUCCESS)
            {
                accesstoken = result.token;
                obj = null;
            } else
            {
                obj = new FacebookAuthorizationException(result.errorMessage);
                accesstoken = null;
            }
        } else
        if (i == 0)
        {
            obj = new FacebookOperationCanceledException(result.errorMessage);
            accesstoken = null;
        } else
        {
            obj = null;
            accesstoken = null;
        }
        logAuthorizationComplete(result.code, result.loggingExtras, ((Exception) (obj)));
        authorizationClient = null;
        finishAuthOrReauth(accesstoken, ((Exception) (obj)));
    }

    static PermissionsPair handlePermissionResponse(Response response)
    {
        if (response.getError() != null)
        {
            return null;
        }
        response = (GraphMultiResult)response.getGraphObjectAs(com/facebook/model/GraphMultiResult);
        if (response == null)
        {
            return null;
        }
        Object obj = response.getData();
        if (obj == null || ((GraphObjectList) (obj)).size() == 0)
        {
            return null;
        }
        response = new ArrayList(((GraphObjectList) (obj)).size());
        ArrayList arraylist = new ArrayList(((GraphObjectList) (obj)).size());
        Object obj1 = (GraphObject)((GraphObjectList) (obj)).get(0);
        if (((GraphObject) (obj1)).getProperty("permission") != null)
        {
            obj = ((GraphObjectList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj2 = (GraphObject)((Iterator) (obj)).next();
                obj1 = (String)((GraphObject) (obj2)).getProperty("permission");
                if (!((String) (obj1)).equals("installed"))
                {
                    obj2 = (String)((GraphObject) (obj2)).getProperty("status");
                    if (((String) (obj2)).equals("granted"))
                    {
                        response.add(obj1);
                    } else
                    if (((String) (obj2)).equals("declined"))
                    {
                        arraylist.add(obj1);
                    }
                }
            } while (true);
        } else
        {
            Iterator iterator = ((GraphObject) (obj1)).asMap().entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (!((String)entry.getKey()).equals("installed") && ((Integer)entry.getValue()).intValue() == 1)
                {
                    response.add(entry.getKey());
                }
            } while (true);
        }
        return new PermissionsPair(response, arraylist);
    }

    static void initializeStaticContext(Context context)
    {
        if (context != null && staticContext == null)
        {
            Context context1 = context.getApplicationContext();
            if (context1 != null)
            {
                context = context1;
            }
            staticContext = context;
        }
    }

    public static boolean isPublishPermission(String s)
    {
        return s != null && (s.startsWith("publish") || s.startsWith("manage") || OTHER_PUBLISH_PERMISSIONS.contains(s));
    }

    private void logAuthorizationComplete(AuthorizationClient.Result.Code code, Map map, Exception exception)
    {
        if (pendingAuthorizationRequest != null) goto _L2; else goto _L1
_L1:
        code = AuthorizationClient.newAuthorizationLoggingBundle("");
        code.putString("2_result", AuthorizationClient.Result.Code.ERROR.getLoggingValue());
        code.putString("5_error_message", "Unexpected call to logAuthorizationComplete with null pendingAuthorizationRequest.");
_L4:
        code.putLong("1_timestamp_ms", System.currentTimeMillis());
        getAppEventsLogger().logSdkEvent("fb_mobile_login_complete", null, code);
        return;
_L2:
        Bundle bundle = AuthorizationClient.newAuthorizationLoggingBundle(pendingAuthorizationRequest.getAuthId());
        if (code != null)
        {
            bundle.putString("2_result", code.getLoggingValue());
        }
        if (exception != null && exception.getMessage() != null)
        {
            bundle.putString("5_error_message", exception.getMessage());
        }
        if (!pendingAuthorizationRequest.loggingExtras.isEmpty())
        {
            code = new JSONObject(pendingAuthorizationRequest.loggingExtras);
        } else
        {
            code = null;
        }
        exception = code;
        if (map != null)
        {
            if (code == null)
            {
                code = new JSONObject();
            }
            try
            {
                for (map = map.entrySet().iterator(); map.hasNext(); code.put((String)exception.getKey(), exception.getValue()))
                {
                    exception = (java.util.Map.Entry)map.next();
                }

                break; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                exception = code;
            }
        }
        if (exception != null)
        {
            bundle.putString("6_extras", exception.toString());
        }
        code = bundle;
        if (true) goto _L4; else goto _L3
_L3:
        exception = code;
        break MISSING_BLOCK_LABEL_216;
        if (true) goto _L4; else goto _L5
_L5:
    }

    private void logAuthorizationStart()
    {
        Bundle bundle = AuthorizationClient.newAuthorizationLoggingBundle(pendingAuthorizationRequest.getAuthId());
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("login_behavior", pendingAuthorizationRequest.loginBehavior.toString());
            jsonobject.put("request_code", pendingAuthorizationRequest.requestCode);
            jsonobject.put("is_legacy", pendingAuthorizationRequest.isLegacy);
            jsonobject.put("permissions", TextUtils.join(",", pendingAuthorizationRequest.permissions));
            jsonobject.put("default_audience", pendingAuthorizationRequest.defaultAudience.toString());
            bundle.putString("6_extras", jsonobject.toString());
        }
        catch (JSONException jsonexception) { }
        getAppEventsLogger().logSdkEvent("fb_mobile_login_start", null, bundle);
    }

    private void open(OpenRequest openrequest, SessionAuthorizationType sessionauthorizationtype)
    {
label0:
        {
            validatePermissions(openrequest, sessionauthorizationtype);
            validateLoginBehavior(openrequest);
            synchronized (lock)
            {
                if (pendingAuthorizationRequest == null)
                {
                    break label0;
                }
                postStateChange(state, state, new UnsupportedOperationException("Session: an attempt was made to open a session that has a pending request."));
            }
            return;
        }
        SessionState sessionstate = state;
        static class _cls5
        {

            static final int $SwitchMap$com$facebook$SessionState[];

            static 
            {
                $SwitchMap$com$facebook$SessionState = new int[SessionState.values().length];
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.CREATED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.OPENING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.CREATED_TOKEN_LOADED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.OPENED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.OPENED_TOKEN_UPDATED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.CLOSED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.CLOSED_LOGIN_FAILED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5..SwitchMap.com.facebook.SessionState[state.ordinal()];
        JVM INSTR tableswitch 1 3: default 237
    //                   1 108
    //                   2 92
    //                   3 172;
           goto _L1 _L2 _L1 _L3
_L1:
        throw new UnsupportedOperationException("Session: an attempt was made to open an already opened session.");
        openrequest;
        obj;
        JVM INSTR monitorexit ;
        throw openrequest;
_L2:
        sessionauthorizationtype = SessionState.OPENING;
        state = sessionauthorizationtype;
        if (openrequest != null) goto _L5; else goto _L4
_L4:
        throw new IllegalArgumentException("openRequest cannot be null when opening a new Session");
_L5:
        pendingAuthorizationRequest = openrequest;
_L12:
        if (openrequest == null) goto _L7; else goto _L6
_L6:
        addCallback(openrequest.getCallback());
_L7:
        postStateChange(sessionstate, sessionauthorizationtype, null);
        obj;
        JVM INSTR monitorexit ;
        if (sessionauthorizationtype == SessionState.OPENING)
        {
            authorize(openrequest);
            return;
        } else
        {
            return;
        }
_L3:
        if (openrequest == null) goto _L9; else goto _L8
_L8:
        if (!Utility.isNullOrEmpty(openrequest.getPermissions()) && !Utility.isSubset(openrequest.getPermissions(), getPermissions()))
        {
            pendingAuthorizationRequest = openrequest;
        }
_L9:
        if (pendingAuthorizationRequest != null) goto _L11; else goto _L10
_L10:
        sessionauthorizationtype = SessionState.OPENED;
        state = sessionauthorizationtype;
          goto _L12
_L11:
        sessionauthorizationtype = SessionState.OPENING;
        state = sessionauthorizationtype;
          goto _L12
    }

    public static Session openActiveSession(Activity activity, boolean flag, StatusCallback statuscallback)
    {
        return openActiveSession(((Context) (activity)), flag, (new OpenRequest(activity)).setCallback(statuscallback));
    }

    public static Session openActiveSession(Activity activity, boolean flag, List list, StatusCallback statuscallback)
    {
        return openActiveSession(((Context) (activity)), flag, (new OpenRequest(activity)).setCallback(statuscallback).setPermissions(list));
    }

    public static Session openActiveSession(Context context, Fragment fragment, boolean flag, StatusCallback statuscallback)
    {
        return openActiveSession(context, flag, (new OpenRequest(fragment)).setCallback(statuscallback));
    }

    public static Session openActiveSession(Context context, Fragment fragment, boolean flag, List list, StatusCallback statuscallback)
    {
        return openActiveSession(context, flag, (new OpenRequest(fragment)).setCallback(statuscallback).setPermissions(list));
    }

    private static Session openActiveSession(Context context, boolean flag, OpenRequest openrequest)
    {
        context = (new Builder(context)).build();
        if (SessionState.CREATED_TOKEN_LOADED.equals(context.getState()) || flag)
        {
            setActiveSession(context);
            context.openForRead(openrequest);
            return context;
        } else
        {
            return null;
        }
    }

    public static Session openActiveSessionFromCache(Context context)
    {
        return openActiveSession(context, false, ((OpenRequest) (null)));
    }

    public static Session openActiveSessionWithAccessToken(Context context, AccessToken accesstoken, StatusCallback statuscallback)
    {
        context = new Session(context, null, null, false);
        setActiveSession(context);
        context.open(accesstoken, statuscallback);
        return context;
    }

    public static Session openActiveSessionWithAccessToken(Context context, String s, AccessToken accesstoken, TokenCachingStrategy tokencachingstrategy, StatusCallback statuscallback)
    {
        context = new Session(context, s, tokencachingstrategy, false);
        setActiveSession(context);
        context.open(accesstoken, statuscallback);
        return context;
    }

    static void postActiveSessionAction(String s)
    {
        s = new Intent(s);
        j.a(getStaticContext()).a(s);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws InvalidObjectException
    {
        throw new InvalidObjectException("Cannot readObject, serialization proxy required");
    }

    private void requestNewPermissions(NewPermissionsRequest newpermissionsrequest, SessionAuthorizationType sessionauthorizationtype)
    {
        validatePermissions(newpermissionsrequest, sessionauthorizationtype);
        validateLoginBehavior(newpermissionsrequest);
        if (newpermissionsrequest == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        sessionauthorizationtype = ((SessionAuthorizationType) (lock));
        sessionauthorizationtype;
        JVM INSTR monitorenter ;
        if (pendingAuthorizationRequest != null)
        {
            throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that has a pending request.");
        }
        break MISSING_BLOCK_LABEL_45;
        newpermissionsrequest;
        sessionauthorizationtype;
        JVM INSTR monitorexit ;
        throw newpermissionsrequest;
        if (!state.isOpened())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        pendingAuthorizationRequest = newpermissionsrequest;
        sessionauthorizationtype;
        JVM INSTR monitorexit ;
        newpermissionsrequest.setValidateSameFbidAsToken(getAccessToken());
        addCallback(newpermissionsrequest.getCallback());
        authorize(newpermissionsrequest);
        return;
        if (state.isClosed())
        {
            throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that has been closed.");
        } else
        {
            throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that is not currently open.");
        }
    }

    private boolean resolveIntent(Intent intent)
    {
        return getStaticContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    public static final Session restoreSession(Context context, TokenCachingStrategy tokencachingstrategy, StatusCallback statuscallback, Bundle bundle)
    {
        byte abyte0[];
        if (bundle == null)
        {
            return null;
        }
        abyte0 = bundle.getByteArray("com.facebook.sdk.Session.saveSessionKey");
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        Object obj = new ByteArrayInputStream(abyte0);
        obj = (Session)(new ObjectInputStream(((java.io.InputStream) (obj)))).readObject();
        initializeStaticContext(context);
        if (tokencachingstrategy == null) goto _L4; else goto _L3
_L3:
        obj.tokenCachingStrategy = tokencachingstrategy;
_L5:
        if (statuscallback == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        ((Session) (obj)).addCallback(statuscallback);
        obj.authorizationBundle = bundle.getBundle("com.facebook.sdk.Session.authBundleKey");
        return ((Session) (obj));
        context;
        Log.w(TAG, "Unable to restore session", context);
_L2:
        return null;
_L4:
        obj.tokenCachingStrategy = new SharedPreferencesTokenCachingStrategy(context);
          goto _L5
        context;
        Log.w(TAG, "Unable to restore session.", context);
          goto _L2
    }

    private static void runWithHandlerOrExecutor(Handler handler1, Runnable runnable)
    {
        if (handler1 != null)
        {
            handler1.post(runnable);
            return;
        } else
        {
            Settings.getExecutor().execute(runnable);
            return;
        }
    }

    public static final void saveSession(Session session, Bundle bundle)
    {
        if (bundle != null && session != null && !bundle.containsKey("com.facebook.sdk.Session.saveSessionKey"))
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            try
            {
                (new ObjectOutputStream(bytearrayoutputstream)).writeObject(session);
            }
            // Misplaced declaration of an exception variable
            catch (Session session)
            {
                throw new FacebookException("Unable to save session.", session);
            }
            bundle.putByteArray("com.facebook.sdk.Session.saveSessionKey", bytearrayoutputstream.toByteArray());
            bundle.putBundle("com.facebook.sdk.Session.authBundleKey", session.authorizationBundle);
        }
    }

    private void saveTokenToCache(AccessToken accesstoken)
    {
        if (accesstoken != null && tokenCachingStrategy != null)
        {
            tokenCachingStrategy.save(accesstoken.toCacheBundle());
        }
    }

    public static final void setActiveSession(Session session)
    {
        Object obj = STATIC_LOCK;
        obj;
        JVM INSTR monitorenter ;
        Session session1;
        if (session == activeSession)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        session1 = activeSession;
        if (session1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        session1.close();
        activeSession = session;
        if (session1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
        if (session == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_SET");
        if (session.isOpened())
        {
            postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_OPENED");
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        session;
        obj;
        JVM INSTR monitorexit ;
        throw session;
    }

    private void tryLegacyAuth(AuthorizationRequest authorizationrequest)
    {
        authorizationClient = new AuthorizationClient();
        authorizationClient.setOnCompletedListener(new AuthorizationClient.OnCompletedListener() {

            final Session this$0;

            public void onCompleted(AuthorizationClient.Result result)
            {
                int i;
                if (result.code == AuthorizationClient.Result.Code.CANCEL)
                {
                    i = 0;
                } else
                {
                    i = -1;
                }
                handleAuthorizationResult(i, result);
            }

            
            {
                this$0 = Session.this;
                super();
            }
        });
        authorizationClient.setContext(getStaticContext());
        authorizationClient.startOrContinueAuth(authorizationrequest.getAuthorizationClientRequest());
    }

    private boolean tryLoginActivity(AuthorizationRequest authorizationrequest)
    {
        Intent intent = getLoginActivityIntent(authorizationrequest);
        if (!resolveIntent(intent))
        {
            return false;
        }
        try
        {
            authorizationrequest.getStartActivityDelegate().startActivityForResult(intent, authorizationrequest.getRequestCode());
        }
        // Misplaced declaration of an exception variable
        catch (AuthorizationRequest authorizationrequest)
        {
            return false;
        }
        return true;
    }

    private void validateLoginBehavior(AuthorizationRequest authorizationrequest)
    {
        if (authorizationrequest != null && !authorizationrequest.isLegacy)
        {
            Intent intent = new Intent();
            intent.setClass(getStaticContext(), com/facebook/LoginActivity);
            if (!resolveIntent(intent))
            {
                throw new FacebookException(String.format("Cannot use SessionLoginBehavior %s when %s is not declared as an activity in AndroidManifest.xml", new Object[] {
                    authorizationrequest.getLoginBehavior(), com/facebook/LoginActivity.getName()
                }));
            }
        }
    }

    private void validatePermissions(AuthorizationRequest authorizationrequest, SessionAuthorizationType sessionauthorizationtype)
    {
        if (authorizationrequest == null || Utility.isNullOrEmpty(authorizationrequest.getPermissions()))
        {
            if (SessionAuthorizationType.PUBLISH.equals(sessionauthorizationtype))
            {
                throw new FacebookException("Cannot request publish or manage authorization with no permissions.");
            }
        } else
        {
            authorizationrequest = authorizationrequest.getPermissions().iterator();
            do
            {
                if (!authorizationrequest.hasNext())
                {
                    break;
                }
                String s = (String)authorizationrequest.next();
                if (isPublishPermission(s))
                {
                    if (SessionAuthorizationType.READ.equals(sessionauthorizationtype))
                    {
                        throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] {
                            s
                        }));
                    }
                } else
                if (SessionAuthorizationType.PUBLISH.equals(sessionauthorizationtype))
                {
                    Log.w(TAG, String.format("Should not pass a read permission (%s) to a request for publish or manage authorization", new Object[] {
                        s
                    }));
                }
            } while (true);
        }
    }

    private Object writeReplace()
    {
        return new SerializationProxyV1(applicationId, state, tokenInfo, lastAttemptedTokenExtendDate, false, pendingAuthorizationRequest);
    }

    public final void addCallback(StatusCallback statuscallback)
    {
        List list = callbacks;
        list;
        JVM INSTR monitorenter ;
        if (statuscallback == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (!callbacks.contains(statuscallback))
        {
            callbacks.add(statuscallback);
        }
        list;
        JVM INSTR monitorexit ;
        return;
        statuscallback;
        list;
        JVM INSTR monitorexit ;
        throw statuscallback;
    }

    void authorize(AuthorizationRequest authorizationrequest)
    {
        authorizationrequest.setApplicationId(applicationId);
        autoPublishAsync();
        logAuthorizationStart();
        boolean flag = tryLoginActivity(authorizationrequest);
        Object obj1 = pendingAuthorizationRequest.loggingExtras;
        Object obj;
        if (flag)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        ((Map) (obj1)).put("try_login_activity", obj);
        if (!flag && authorizationrequest.isLegacy)
        {
            pendingAuthorizationRequest.loggingExtras.put("try_legacy", "1");
            tryLegacyAuth(authorizationrequest);
            flag = true;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        authorizationrequest = ((AuthorizationRequest) (lock));
        authorizationrequest;
        JVM INSTR monitorenter ;
        obj = state;
        switch (_cls5..SwitchMap.com.facebook.SessionState[state.ordinal()])
        {
        default:
            state = SessionState.CLOSED_LOGIN_FAILED;
            obj1 = new FacebookException("Log in attempt failed: LoginActivity could not be started, and not legacy request");
            logAuthorizationComplete(AuthorizationClient.Result.Code.ERROR, null, ((Exception) (obj1)));
            postStateChange(((SessionState) (obj)), state, ((Exception) (obj1)));
            break;

        case 6: // '\006'
        case 7: // '\007'
            break MISSING_BLOCK_LABEL_187;
        }
        return;
        authorizationrequest;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        authorizationrequest;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void close()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = state;
        _cls5..SwitchMap.com.facebook.SessionState[state.ordinal()];
        JVM INSTR tableswitch 1 5: default 113
    //                   1 59
    //                   2 59
    //                   3 93
    //                   4 93
    //                   5 93;
           goto _L1 _L2 _L2 _L3 _L3 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_93;
_L4:
        return;
_L2:
        state = SessionState.CLOSED_LOGIN_FAILED;
        postStateChange(((SessionState) (obj1)), state, new FacebookException("Log in attempt aborted."));
          goto _L4
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        state = SessionState.CLOSED;
        postStateChange(((SessionState) (obj1)), state, null);
          goto _L4
    }

    public final void closeAndClearTokenInformation()
    {
        if (tokenCachingStrategy != null)
        {
            tokenCachingStrategy.clear();
        }
        Utility.clearFacebookCookies(staticContext);
        Utility.clearCaches(staticContext);
        close();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Session)
        {
            if (areEqual(((Session) (obj = (Session)obj)).applicationId, applicationId) && areEqual(((Session) (obj)).authorizationBundle, authorizationBundle) && areEqual(((Session) (obj)).state, state) && areEqual(((Session) (obj)).getExpirationDate(), getExpirationDate()))
            {
                return true;
            }
        }
        return false;
    }

    void extendAccessToken()
    {
        TokenRefreshRequest tokenrefreshrequest = null;
        synchronized (lock)
        {
            if (currentTokenRefreshRequest == null)
            {
                tokenrefreshrequest = new TokenRefreshRequest();
                currentTokenRefreshRequest = tokenrefreshrequest;
            }
        }
        if (tokenrefreshrequest != null)
        {
            tokenrefreshrequest.bind();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void extendAccessTokenIfNeeded()
    {
        if (shouldExtendAccessToken())
        {
            extendAccessToken();
        }
    }

    void extendTokenCompleted(Bundle bundle)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        SessionState sessionstate = state;
        _cls5..SwitchMap.com.facebook.SessionState[state.ordinal()];
        JVM INSTR tableswitch 4 5: default 135
    //                   4 77
    //                   5 94;
           goto _L1 _L2 _L3
_L1:
        Log.d(TAG, (new StringBuilder()).append("refreshToken ignored in state ").append(state).toString());
        return;
_L2:
        state = SessionState.OPENED_TOKEN_UPDATED;
        postStateChange(sessionstate, state, null);
_L3:
        tokenInfo = AccessToken.createFromRefresh(tokenInfo, bundle);
        if (tokenCachingStrategy != null)
        {
            tokenCachingStrategy.save(tokenInfo.toCacheBundle());
        }
        return;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    void finishAuthOrReauth(AccessToken accesstoken, Exception exception)
    {
        Object obj;
        AccessToken accesstoken1;
        accesstoken1 = accesstoken;
        obj = exception;
        if (accesstoken != null)
        {
            accesstoken1 = accesstoken;
            obj = exception;
            if (accesstoken.isInvalid())
            {
                accesstoken1 = null;
                obj = new FacebookException("Invalid access token.");
            }
        }
        accesstoken = ((AccessToken) (lock));
        accesstoken;
        JVM INSTR monitorenter ;
        _cls5..SwitchMap.com.facebook.SessionState[state.ordinal()];
        JVM INSTR tableswitch 1 7: default 157
    //                   1 124
    //                   2 99
    //                   3 124
    //                   4 114
    //                   5 114
    //                   6 124
    //                   7 124;
           goto _L1 _L2 _L3 _L2 _L4 _L4 _L2 _L2
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_124;
_L5:
        return;
_L3:
        finishAuthorization(accesstoken1, ((Exception) (obj)));
          goto _L5
        exception;
        accesstoken;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        finishReauthorization(accesstoken1, ((Exception) (obj)));
          goto _L5
        Log.d(TAG, (new StringBuilder()).append("Unexpected call to finishAuthOrReauth in state ").append(state).toString());
          goto _L5
    }

    public final String getAccessToken()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (tokenInfo != null) goto _L2; else goto _L1
_L1:
        String s = null;
_L4:
        obj;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = tokenInfo.getToken();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String getApplicationId()
    {
        return applicationId;
    }

    public final Bundle getAuthorizationBundle()
    {
        Bundle bundle;
        synchronized (lock)
        {
            bundle = authorizationBundle;
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List getDeclinedPermissions()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (tokenInfo != null) goto _L2; else goto _L1
_L1:
        List list = null;
_L4:
        obj;
        JVM INSTR monitorexit ;
        return list;
_L2:
        list = tokenInfo.getDeclinedPermissions();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Date getExpirationDate()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (tokenInfo != null) goto _L2; else goto _L1
_L1:
        Date date = null;
_L4:
        obj;
        JVM INSTR monitorexit ;
        return date;
_L2:
        date = tokenInfo.getExpires();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    Date getLastAttemptedTokenExtendDate()
    {
        return lastAttemptedTokenExtendDate;
    }

    public final List getPermissions()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (tokenInfo != null) goto _L2; else goto _L1
_L1:
        List list = null;
_L4:
        obj;
        JVM INSTR monitorexit ;
        return list;
_L2:
        list = tokenInfo.getPermissions();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final SessionState getState()
    {
        SessionState sessionstate;
        synchronized (lock)
        {
            sessionstate = state;
        }
        return sessionstate;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    AccessToken getTokenInfo()
    {
        return tokenInfo;
    }

    public int hashCode()
    {
        return 0;
    }

    public final boolean isClosed()
    {
        boolean flag;
        synchronized (lock)
        {
            flag = state.isClosed();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isOpened()
    {
        boolean flag;
        synchronized (lock)
        {
            flag = state.isOpened();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isPermissionGranted(String s)
    {
        List list = getPermissions();
        if (list != null)
        {
            return list.contains(s);
        } else
        {
            return false;
        }
    }

    public final boolean onActivityResult(Activity activity, int i, int k, Intent intent)
    {
label0:
        {
            Validate.notNull(activity, "currentActivity");
            initializeStaticContext(activity);
            synchronized (lock)
            {
                if (pendingAuthorizationRequest != null && i == pendingAuthorizationRequest.getRequestCode())
                {
                    break label0;
                }
            }
            return false;
        }
        activity;
        JVM INSTR monitorexit ;
        Object obj = AuthorizationClient.Result.Code.ERROR;
        if (intent != null)
        {
            activity = (AuthorizationClient.Result)intent.getSerializableExtra("com.facebook.LoginActivity:Result");
            if (activity != null)
            {
                handleAuthorizationResult(k, activity);
                return true;
            }
            break MISSING_BLOCK_LABEL_83;
        }
        if (k == 0)
        {
            activity = new FacebookOperationCanceledException("User canceled operation.");
            intent = AuthorizationClient.Result.Code.CANCEL;
        } else
        {
            activity = null;
            intent = ((Intent) (obj));
        }
          goto _L1
        intent;
        activity;
        JVM INSTR monitorexit ;
        throw intent;
        if (authorizationClient != null)
        {
            authorizationClient.onActivityResult(i, k, intent);
            return true;
        }
        activity = null;
        intent = ((Intent) (obj));
_L3:
        obj = activity;
        if (activity == null)
        {
            obj = new FacebookException("Unexpected call to Session.onActivityResult");
        }
        logAuthorizationComplete(intent, null, ((Exception) (obj)));
        finishAuthOrReauth(null, ((Exception) (obj)));
        return true;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final void open(AccessToken accesstoken, StatusCallback statuscallback)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (pendingAuthorizationRequest != null)
        {
            throw new UnsupportedOperationException("Session: an attempt was made to open a session that has a pending request.");
        }
        break MISSING_BLOCK_LABEL_30;
        accesstoken;
        obj;
        JVM INSTR monitorexit ;
        throw accesstoken;
        if (state.isClosed())
        {
            throw new UnsupportedOperationException("Session: an attempt was made to open a previously-closed session.");
        }
        if (state != SessionState.CREATED && state != SessionState.CREATED_TOKEN_LOADED)
        {
            throw new UnsupportedOperationException("Session: an attempt was made to open an already opened session.");
        }
        if (statuscallback == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        addCallback(statuscallback);
        tokenInfo = accesstoken;
        if (tokenCachingStrategy != null)
        {
            tokenCachingStrategy.save(accesstoken.toCacheBundle());
        }
        accesstoken = state;
        state = SessionState.OPENED;
        postStateChange(accesstoken, state, null);
        obj;
        JVM INSTR monitorexit ;
        autoPublishAsync();
        return;
    }

    public final void openForPublish(OpenRequest openrequest)
    {
        open(openrequest, SessionAuthorizationType.PUBLISH);
    }

    public final void openForRead(OpenRequest openrequest)
    {
        open(openrequest, SessionAuthorizationType.READ);
    }

    void postStateChange(SessionState sessionstate, final SessionState newState, final Exception exception)
    {
        if (sessionstate != newState || sessionstate == SessionState.OPENED_TOKEN_UPDATED || exception != null)
        {
            if (newState.isClosed())
            {
                tokenInfo = AccessToken.createEmptyToken();
            }
            exception = new Runnable() {

                final Session this$0;
                final Exception val$exception;
                final SessionState val$newState;

                public void run()
                {
                    List list = callbacks;
                    list;
                    JVM INSTR monitorenter ;
                    Runnable runnable;
                    for (Iterator iterator = callbacks.iterator(); iterator.hasNext(); Session.runWithHandlerOrExecutor(handler, runnable))
                    {
                        runnable = ((StatusCallback)iterator.next()). new Runnable() {

                            final _cls4 this$1;
                            final StatusCallback val$callback;

                            public void run()
                            {
                                callback.call(_fld0, newState, exception);
                            }

            
            {
                this$1 = final__pcls4;
                callback = StatusCallback.this;
                super();
            }
                        };
                    }

                    break MISSING_BLOCK_LABEL_69;
                    Exception exception1;
                    exception1;
                    list;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    list;
                    JVM INSTR monitorexit ;
                }

            
            {
                this$0 = Session.this;
                newState = sessionstate;
                exception = exception1;
                super();
            }
            };
            runWithHandlerOrExecutor(handler, exception);
            if (this == activeSession && sessionstate.isOpened() != newState.isOpened())
            {
                if (newState.isOpened())
                {
                    postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_OPENED");
                    return;
                } else
                {
                    postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_CLOSED");
                    return;
                }
            }
        }
    }

    public final void refreshPermissions()
    {
        Request request = new Request(this, "me/permissions");
        request.setCallback(new Request.Callback() {

            final Session this$0;

            public void onCompleted(Response response)
            {
                PermissionsPair permissionspair = Session.handlePermissionResponse(response);
                if (permissionspair != null)
                {
                    synchronized (lock)
                    {
                        tokenInfo = AccessToken.createFromTokenWithRefreshedPermissions(tokenInfo, permissionspair.getGrantedPermissions(), permissionspair.getDeclinedPermissions());
                        postStateChange(state, SessionState.OPENED_TOKEN_UPDATED, null);
                    }
                    return;
                } else
                {
                    return;
                }
                exception;
                response;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = Session.this;
                super();
            }
        });
        request.executeAsync();
    }

    public final void removeCallback(StatusCallback statuscallback)
    {
        synchronized (callbacks)
        {
            callbacks.remove(statuscallback);
        }
        return;
        statuscallback;
        list;
        JVM INSTR monitorexit ;
        throw statuscallback;
    }

    public final void requestNewPublishPermissions(NewPermissionsRequest newpermissionsrequest)
    {
        requestNewPermissions(newpermissionsrequest, SessionAuthorizationType.PUBLISH);
    }

    public final void requestNewReadPermissions(NewPermissionsRequest newpermissionsrequest)
    {
        requestNewPermissions(newpermissionsrequest, SessionAuthorizationType.READ);
    }

    void setCurrentTokenRefreshRequest(TokenRefreshRequest tokenrefreshrequest)
    {
        currentTokenRefreshRequest = tokenrefreshrequest;
    }

    void setLastAttemptedTokenExtendDate(Date date)
    {
        lastAttemptedTokenExtendDate = date;
    }

    void setTokenInfo(AccessToken accesstoken)
    {
        tokenInfo = accesstoken;
    }

    boolean shouldExtendAccessToken()
    {
        if (currentTokenRefreshRequest == null)
        {
            Date date = new Date();
            if (state.isOpened() && tokenInfo.getSource().canExtendToken() && date.getTime() - lastAttemptedTokenExtendDate.getTime() > 0x36ee80L && date.getTime() - tokenInfo.getLastRefresh().getTime() > 0x5265c00L)
            {
                return true;
            }
        }
        return false;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("{Session").append(" state:").append(state).append(", token:");
        Object obj;
        if (tokenInfo == null)
        {
            obj = "null";
        } else
        {
            obj = tokenInfo;
        }
        stringbuilder = stringbuilder.append(obj).append(", appId:");
        if (applicationId == null)
        {
            obj = "null";
        } else
        {
            obj = applicationId;
        }
        return stringbuilder.append(((String) (obj))).append("}").toString();
    }









/*
    static TokenRefreshRequest access$1602(Session session, TokenRefreshRequest tokenrefreshrequest)
    {
        session.currentTokenRefreshRequest = tokenrefreshrequest;
        return tokenrefreshrequest;
    }

*/


/*
    static AutoPublishAsyncTask access$1802(Session session, AutoPublishAsyncTask autopublishasynctask)
    {
        session.autoPublishAsyncTask = autopublishasynctask;
        return autopublishasynctask;
    }

*/




/*
    static AccessToken access$302(Session session, AccessToken accesstoken)
    {
        session.tokenInfo = accesstoken;
        return accesstoken;
    }

*/


    // Unreferenced inner class com/facebook/Session$AuthorizationRequest$1

/* anonymous class */
    class AuthorizationRequest._cls1
        implements StartActivityDelegate
    {

        final AuthorizationRequest this$0;
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
                this$0 = final_authorizationrequest;
                activity = Activity.this;
                super();
            }
    }


    // Unreferenced inner class com/facebook/Session$AuthorizationRequest$2

/* anonymous class */
    class AuthorizationRequest._cls2
        implements StartActivityDelegate
    {

        final AuthorizationRequest this$0;
        final Fragment val$fragment;

        public Activity getActivityContext()
        {
            return fragment.getActivity();
        }

        public void startActivityForResult(Intent intent, int i)
        {
            fragment.startActivityForResult(intent, i);
        }

            
            {
                this$0 = final_authorizationrequest;
                fragment = Fragment.this;
                super();
            }
    }


    // Unreferenced inner class com/facebook/Session$AuthorizationRequest$3

/* anonymous class */
    class AuthorizationRequest._cls3
        implements StartActivityDelegate
    {

        final AuthorizationRequest this$0;

        public Activity getActivityContext()
        {
            throw new UnsupportedOperationException("Cannot create an AuthorizationRequest without a valid Activity or Fragment");
        }

        public void startActivityForResult(Intent intent, int i)
        {
            throw new UnsupportedOperationException("Cannot create an AuthorizationRequest without a valid Activity or Fragment");
        }

            
            {
                this$0 = AuthorizationRequest.this;
                super();
            }
    }

}
