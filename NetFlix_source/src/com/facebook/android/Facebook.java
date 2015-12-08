// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.LegacyHelper;
import com.facebook.Session;
import com.facebook.SessionLoginBehavior;
import com.facebook.SessionState;
import com.facebook.Settings;
import com.facebook.TokenCachingStrategy;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.facebook.android:
//            DialogError, FacebookError, Util, FbDialog

public class Facebook
{
    public static interface DialogListener
    {

        public abstract void onCancel();

        public abstract void onComplete(Bundle bundle);

        public abstract void onError(DialogError dialogerror);

        public abstract void onFacebookError(FacebookError facebookerror);
    }

    public static interface ServiceListener
    {

        public abstract void onComplete(Bundle bundle);

        public abstract void onError(Error error);

        public abstract void onFacebookError(FacebookError facebookerror);
    }

    private class SetterTokenCachingStrategy extends TokenCachingStrategy
    {

        final Facebook this$0;

        public void clear()
        {
            accessToken = null;
        }

        public Bundle load()
        {
            Bundle bundle = new Bundle();
            if (accessToken != null)
            {
                TokenCachingStrategy.putToken(bundle, accessToken);
                TokenCachingStrategy.putExpirationMilliseconds(bundle, accessExpiresMillisecondsAfterEpoch);
                TokenCachingStrategy.putPermissions(bundle, Facebook.stringList(pendingAuthorizationPermissions));
                TokenCachingStrategy.putSource(bundle, AccessTokenSource.WEB_VIEW);
                TokenCachingStrategy.putLastRefreshMilliseconds(bundle, lastAccessUpdateMillisecondsAfterEpoch);
            }
            return bundle;
        }

        public void save(Bundle bundle)
        {
            accessToken = TokenCachingStrategy.getToken(bundle);
            accessExpiresMillisecondsAfterEpoch = TokenCachingStrategy.getExpirationMilliseconds(bundle);
            pendingAuthorizationPermissions = Facebook.stringArray(TokenCachingStrategy.getPermissions(bundle));
            lastAccessUpdateMillisecondsAfterEpoch = TokenCachingStrategy.getLastRefreshMilliseconds(bundle);
        }

        private SetterTokenCachingStrategy()
        {
            this$0 = Facebook.this;
            super();
        }

    }

    private static class TokenRefreshConnectionHandler extends Handler
    {

        WeakReference connectionWeakReference;
        WeakReference facebookWeakReference;

        public void handleMessage(Message message)
        {
            Object obj = (Facebook)facebookWeakReference.get();
            TokenRefreshServiceConnection tokenrefreshserviceconnection = (TokenRefreshServiceConnection)connectionWeakReference.get();
            if (obj != null && tokenrefreshserviceconnection != null)
            {
                String s1 = message.getData().getString("access_token");
                long l = message.getData().getLong("expires_in") * 1000L;
                if (s1 != null)
                {
                    ((Facebook) (obj)).setAccessToken(s1);
                    ((Facebook) (obj)).setAccessExpires(l);
                    obj = ((Facebook) (obj)).session;
                    if (obj != null)
                    {
                        LegacyHelper.extendTokenCompleted(((Session) (obj)), message.getData());
                    }
                    if (tokenrefreshserviceconnection.serviceListener != null)
                    {
                        message = (Bundle)message.getData().clone();
                        message.putLong("expires_in", l);
                        tokenrefreshserviceconnection.serviceListener.onComplete(message);
                    }
                } else
                if (tokenrefreshserviceconnection.serviceListener != null)
                {
                    String s = message.getData().getString("error");
                    if (message.getData().containsKey("error_code"))
                    {
                        int i = message.getData().getInt("error_code");
                        tokenrefreshserviceconnection.serviceListener.onFacebookError(new FacebookError(s, null, i));
                    } else
                    {
                        ServiceListener servicelistener = tokenrefreshserviceconnection.serviceListener;
                        if (s != null)
                        {
                            message = s;
                        } else
                        {
                            message = "Unknown service error";
                        }
                        servicelistener.onError(new Error(message));
                    }
                }
                if (tokenrefreshserviceconnection != null)
                {
                    tokenrefreshserviceconnection.applicationsContext.unbindService(tokenrefreshserviceconnection);
                    return;
                }
            }
        }

        TokenRefreshConnectionHandler(Facebook facebook, TokenRefreshServiceConnection tokenrefreshserviceconnection)
        {
            facebookWeakReference = new WeakReference(facebook);
            connectionWeakReference = new WeakReference(tokenrefreshserviceconnection);
        }
    }

    private class TokenRefreshServiceConnection
        implements ServiceConnection
    {

        final Context applicationsContext;
        final Messenger messageReceiver;
        Messenger messageSender;
        final ServiceListener serviceListener;
        final Facebook this$0;

        private void refreshToken()
        {
            Bundle bundle = new Bundle();
            bundle.putString("access_token", accessToken);
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
                serviceListener.onError(new Error("Service connection error"));
            }
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            messageSender = new Messenger(ibinder);
            refreshToken();
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            serviceListener.onError(new Error("Service disconnected"));
            applicationsContext.unbindService(this);
        }

        public TokenRefreshServiceConnection(Context context, ServiceListener servicelistener)
        {
            this$0 = Facebook.this;
            super();
            messageReceiver = new Messenger(new TokenRefreshConnectionHandler(Facebook.this, this));
            messageSender = null;
            applicationsContext = context;
            serviceListener = servicelistener;
        }
    }


    public static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    public static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    public static final String CANCEL_URI = "fbconnect://cancel";
    private static final int DEFAULT_AUTH_ACTIVITY_CODE = 32665;
    protected static String DIALOG_BASE_URL = "https://m.facebook.com/dialog/";
    public static final String EXPIRES = "expires_in";
    public static final String FB_APP_SIGNATURE = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2";
    public static final int FORCE_DIALOG_AUTH = -1;
    protected static String GRAPH_BASE_URL = "https://graph.facebook.com/";
    private static final String LOGIN = "oauth";
    public static final String REDIRECT_URI = "fbconnect://success";
    protected static String RESTSERVER_URL = "https://api.facebook.com/restserver.php";
    public static final String SINGLE_SIGN_ON_DISABLED = "service_disabled";
    public static final String TOKEN = "access_token";
    private final long REFRESH_TOKEN_BARRIER = 0x5265c00L;
    private long accessExpiresMillisecondsAfterEpoch;
    private String accessToken;
    private long lastAccessUpdateMillisecondsAfterEpoch;
    private final Object lock = new Object();
    private String mAppId;
    private Activity pendingAuthorizationActivity;
    private String pendingAuthorizationPermissions[];
    private Session pendingOpeningSession;
    private volatile Session session;
    private boolean sessionInvalidated;
    private SetterTokenCachingStrategy tokenCache;
    private volatile Session userSetSession;

    public Facebook(String s)
    {
        accessToken = null;
        accessExpiresMillisecondsAfterEpoch = 0L;
        lastAccessUpdateMillisecondsAfterEpoch = 0L;
        if (s == null)
        {
            throw new IllegalArgumentException("You must specify your application ID when instantiating a Facebook object. See README for details.");
        } else
        {
            mAppId = s;
            return;
        }
    }

    private void authorize(Activity activity, String as[], int i, SessionLoginBehavior sessionloginbehavior, final DialogListener listener)
    {
        checkUserSession("authorize");
        pendingOpeningSession = (new com.facebook.Session.Builder(activity)).setApplicationId(mAppId).setTokenCachingStrategy(getTokenCache()).build();
        pendingAuthorizationActivity = activity;
        String as1[];
        boolean flag;
        if (as != null)
        {
            as1 = as;
        } else
        {
            as1 = new String[0];
        }
        pendingAuthorizationPermissions = as1;
        listener = new com.facebook.Session.StatusCallback() {

            final Facebook this$0;
            final DialogListener val$listener;

            public void call(Session session1, SessionState sessionstate, Exception exception)
            {
                onSessionCallback(session1, sessionstate, exception, listener);
            }

            
            {
                this$0 = Facebook.this;
                listener = dialoglistener;
                super();
            }
        };
        activity = (new com.facebook.Session.OpenRequest(activity)).setCallback(listener).setLoginBehavior(sessionloginbehavior).setRequestCode(i).setPermissions(Arrays.asList(as));
        as = pendingOpeningSession;
        if (pendingAuthorizationPermissions.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        openSession(as, activity, flag);
    }

    private void checkUserSession(String s)
    {
        if (userSetSession != null)
        {
            throw new UnsupportedOperationException(String.format("Cannot call %s after setSession has been called.", new Object[] {
                s
            }));
        } else
        {
            return;
        }
    }

    public static String getAttributionId(ContentResolver contentresolver)
    {
        return Settings.getAttributionId(contentresolver);
    }

    private TokenCachingStrategy getTokenCache()
    {
        if (tokenCache == null)
        {
            tokenCache = new SetterTokenCachingStrategy();
        }
        return tokenCache;
    }

    private void onSessionCallback(Session session1, SessionState sessionstate, Exception exception, DialogListener dialoglistener)
    {
        Bundle bundle = session1.getAuthorizationBundle();
        if (sessionstate == SessionState.OPENED)
        {
            sessionstate = null;
            synchronized (lock)
            {
                if (session1 != session)
                {
                    sessionstate = session;
                    session = session1;
                    sessionInvalidated = false;
                }
            }
            if (sessionstate != null)
            {
                sessionstate.close();
            }
            dialoglistener.onComplete(bundle);
        } else
        if (exception != null)
        {
            if (exception instanceof FacebookOperationCanceledException)
            {
                dialoglistener.onCancel();
                return;
            }
            if ((exception instanceof FacebookAuthorizationException) && bundle != null && bundle.containsKey("com.facebook.sdk.WebViewErrorCode") && bundle.containsKey("com.facebook.sdk.FailingUrl"))
            {
                dialoglistener.onError(new DialogError(exception.getMessage(), bundle.getInt("com.facebook.sdk.WebViewErrorCode"), bundle.getString("com.facebook.sdk.FailingUrl")));
                return;
            } else
            {
                dialoglistener.onFacebookError(new FacebookError(exception.getMessage()));
                return;
            }
        }
        return;
        session1;
        exception;
        JVM INSTR monitorexit ;
        throw session1;
    }

    private void openSession(Session session1, com.facebook.Session.OpenRequest openrequest, boolean flag)
    {
        openrequest.setIsLegacy(true);
        if (flag)
        {
            session1.openForPublish(openrequest);
            return;
        } else
        {
            session1.openForRead(openrequest);
            return;
        }
    }

    private static String[] stringArray(List list)
    {
        String as[] = new String[list.size()];
        if (list != null)
        {
            for (int i = 0; i < as.length; i++)
            {
                as[i] = (String)list.get(i);
            }

        }
        return as;
    }

    private static List stringList(String as[])
    {
        if (as != null)
        {
            return Arrays.asList(as);
        } else
        {
            return Collections.emptyList();
        }
    }

    private boolean validateAppSignatureForPackage(Context context, String s)
    {
        boolean flag1 = false;
        int i;
        int j;
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        context = ((PackageInfo) (context)).signatures;
        j = context.length;
        i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!context[i].toCharsString().equals("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private boolean validateServiceIntent(Context context, Intent intent)
    {
        intent = context.getPackageManager().resolveService(intent, 0);
        if (intent == null)
        {
            return false;
        } else
        {
            return validateAppSignatureForPackage(context, ((ResolveInfo) (intent)).serviceInfo.packageName);
        }
    }

    public void authorize(Activity activity, DialogListener dialoglistener)
    {
        SessionLoginBehavior sessionloginbehavior = SessionLoginBehavior.SSO_WITH_FALLBACK;
        authorize(activity, new String[0], 32665, sessionloginbehavior, dialoglistener);
    }

    public void authorize(Activity activity, String as[], int i, DialogListener dialoglistener)
    {
        SessionLoginBehavior sessionloginbehavior;
        if (i >= 0)
        {
            sessionloginbehavior = SessionLoginBehavior.SSO_WITH_FALLBACK;
        } else
        {
            sessionloginbehavior = SessionLoginBehavior.SUPPRESS_SSO;
        }
        authorize(activity, as, i, sessionloginbehavior, dialoglistener);
    }

    public void authorize(Activity activity, String as[], DialogListener dialoglistener)
    {
        authorize(activity, as, 32665, SessionLoginBehavior.SSO_WITH_FALLBACK, dialoglistener);
    }

    public void authorizeCallback(int i, int j, Intent intent)
    {
        checkUserSession("authorizeCallback");
        Session session1 = pendingOpeningSession;
        if (session1 != null && session1.onActivityResult(pendingAuthorizationActivity, i, j, intent))
        {
            pendingOpeningSession = null;
            pendingAuthorizationActivity = null;
            pendingAuthorizationPermissions = null;
        }
    }

    public void dialog(Context context, String s, Bundle bundle, DialogListener dialoglistener)
    {
        bundle.putString("display", "touch");
        bundle.putString("redirect_uri", "fbconnect://success");
        if (s.equals("oauth"))
        {
            bundle.putString("type", "user_agent");
            bundle.putString("client_id", mAppId);
        } else
        {
            bundle.putString("app_id", mAppId);
            if (isSessionValid())
            {
                bundle.putString("access_token", getAccessToken());
            }
        }
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
        {
            Util.showAlert(context, "Error", "Application requires permission to access the Internet");
            return;
        } else
        {
            (new FbDialog(context, s, bundle, dialoglistener)).show();
            return;
        }
    }

    public void dialog(Context context, String s, DialogListener dialoglistener)
    {
        dialog(context, s, new Bundle(), dialoglistener);
    }

    public boolean extendAccessToken(Context context, ServiceListener servicelistener)
    {
        checkUserSession("extendAccessToken");
        Intent intent = new Intent();
        intent.setClassName("com.facebook.katana", "com.facebook.katana.platform.TokenRefreshService");
        if (!validateServiceIntent(context, intent))
        {
            return false;
        } else
        {
            return context.bindService(intent, new TokenRefreshServiceConnection(context, servicelistener), 1);
        }
    }

    public boolean extendAccessTokenIfNeeded(Context context, ServiceListener servicelistener)
    {
        checkUserSession("extendAccessTokenIfNeeded");
        if (shouldExtendAccessToken())
        {
            return extendAccessToken(context, servicelistener);
        } else
        {
            return true;
        }
    }

    public long getAccessExpires()
    {
        Session session1 = getSession();
        if (session1 != null)
        {
            return session1.getExpirationDate().getTime();
        } else
        {
            return accessExpiresMillisecondsAfterEpoch;
        }
    }

    public String getAccessToken()
    {
        Session session1 = getSession();
        if (session1 != null)
        {
            return session1.getAccessToken();
        } else
        {
            return null;
        }
    }

    public String getAppId()
    {
        return mAppId;
    }

    public long getLastAccessUpdate()
    {
        return lastAccessUpdateMillisecondsAfterEpoch;
    }

    public final Session getSession()
    {
_L2:
label0:
        {
            Session session1;
            synchronized (lock)
            {
                if (userSetSession == null)
                {
                    break label0;
                }
                session1 = userSetSession;
            }
            return session1;
        }
        Object obj2;
        if (session == null && sessionInvalidated)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        obj2 = session;
        obj;
        JVM INSTR monitorexit ;
        return ((Session) (obj2));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Session session2;
        exception1 = accessToken;
        session2 = session;
        obj;
        JVM INSTR monitorexit ;
        Object obj3;
        if (exception1 == null)
        {
            return null;
        }
        Object obj1;
        if (session2 != null)
        {
            obj1 = session2.getPermissions();
        } else
        if (pendingAuthorizationPermissions != null)
        {
            obj1 = Arrays.asList(pendingAuthorizationPermissions);
        } else
        {
            obj1 = Collections.emptyList();
        }
        session2 = (new com.facebook.Session.Builder(pendingAuthorizationActivity)).setApplicationId(mAppId).setTokenCachingStrategy(getTokenCache()).build();
        if (session2.getState() != SessionState.CREATED_TOKEN_LOADED)
        {
            return null;
        }
        exception1 = (new com.facebook.Session.OpenRequest(pendingAuthorizationActivity)).setPermissions(((List) (obj1)));
        boolean flag;
        if (!((List) (obj1)).isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        openSession(session2, exception1, flag);
        obj1 = null;
        exception1 = null;
        obj3 = lock;
        obj3;
        JVM INSTR monitorenter ;
        if (!sessionInvalidated && session != null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        obj1 = session;
        session = session2;
        exception1 = session2;
        sessionInvalidated = false;
        obj3;
        JVM INSTR monitorexit ;
        if (obj1 != null)
        {
            ((Session) (obj1)).close();
        }
        if (exception1 == null) goto _L2; else goto _L1
_L1:
        return exception1;
        Exception exception;
        exception;
        obj3;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getShouldAutoPublishInstall()
    {
        return Settings.getShouldAutoPublishInstall();
    }

    public boolean isSessionValid()
    {
        return getAccessToken() != null && (getAccessExpires() == 0L || System.currentTimeMillis() < getAccessExpires());
    }

    public String logout(Context context)
        throws MalformedURLException, IOException
    {
        return logoutImpl(context);
    }

    String logoutImpl(Context context)
        throws MalformedURLException, IOException
    {
        checkUserSession("logout");
        context = new Bundle();
        context.putString("method", "auth.expireSession");
        String s = request(context);
        long l = System.currentTimeMillis();
        Session session1;
        synchronized (lock)
        {
            session1 = session;
            session = null;
            accessToken = null;
            accessExpiresMillisecondsAfterEpoch = 0L;
            lastAccessUpdateMillisecondsAfterEpoch = l;
            sessionInvalidated = false;
        }
        if (session1 != null)
        {
            session1.closeAndClearTokenInformation();
        }
        return s;
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean publishInstall(Context context)
    {
        Settings.publishInstallAsync(context, mAppId);
        return false;
    }

    public String request(Bundle bundle)
        throws MalformedURLException, IOException
    {
        if (!bundle.containsKey("method"))
        {
            throw new IllegalArgumentException("API method must be specified. (parameters must contain key \"method\" and value). See http://developers.facebook.com/docs/reference/rest/");
        } else
        {
            return requestImpl(null, bundle, "GET");
        }
    }

    public String request(String s)
        throws MalformedURLException, IOException
    {
        return requestImpl(s, new Bundle(), "GET");
    }

    public String request(String s, Bundle bundle)
        throws MalformedURLException, IOException
    {
        return requestImpl(s, bundle, "GET");
    }

    public String request(String s, Bundle bundle, String s1)
        throws FileNotFoundException, MalformedURLException, IOException
    {
        return requestImpl(s, bundle, s1);
    }

    String requestImpl(String s, Bundle bundle, String s1)
        throws FileNotFoundException, MalformedURLException, IOException
    {
        bundle.putString("format", "json");
        if (isSessionValid())
        {
            bundle.putString("access_token", getAccessToken());
        }
        if (s != null)
        {
            s = (new StringBuilder()).append(GRAPH_BASE_URL).append(s).toString();
        } else
        {
            s = RESTSERVER_URL;
        }
        return Util.openUrl(s, s1, bundle);
    }

    public void setAccessExpires(long l)
    {
        checkUserSession("setAccessExpires");
        synchronized (lock)
        {
            accessExpiresMillisecondsAfterEpoch = l;
            lastAccessUpdateMillisecondsAfterEpoch = System.currentTimeMillis();
            sessionInvalidated = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setAccessExpiresIn(String s)
    {
        checkUserSession("setAccessExpiresIn");
        if (s != null)
        {
            long l;
            if (s.equals("0"))
            {
                l = 0L;
            } else
            {
                l = System.currentTimeMillis() + Long.parseLong(s) * 1000L;
            }
            setAccessExpires(l);
        }
    }

    public void setAccessToken(String s)
    {
        checkUserSession("setAccessToken");
        synchronized (lock)
        {
            accessToken = s;
            lastAccessUpdateMillisecondsAfterEpoch = System.currentTimeMillis();
            sessionInvalidated = true;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void setAppId(String s)
    {
        checkUserSession("setAppId");
        synchronized (lock)
        {
            mAppId = s;
            sessionInvalidated = true;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void setSession(Session session1)
    {
        if (session1 == null)
        {
            throw new IllegalArgumentException("session cannot be null");
        }
        synchronized (lock)
        {
            userSetSession = session1;
        }
        return;
        session1;
        obj;
        JVM INSTR monitorexit ;
        throw session1;
    }

    public void setShouldAutoPublishInstall(boolean flag)
    {
        Settings.setShouldAutoPublishInstall(flag);
    }

    public void setTokenFromCache(String s, long l, long l1)
    {
        checkUserSession("setTokenFromCache");
        synchronized (lock)
        {
            accessToken = s;
            accessExpiresMillisecondsAfterEpoch = l;
            lastAccessUpdateMillisecondsAfterEpoch = l1;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean shouldExtendAccessToken()
    {
        checkUserSession("shouldExtendAccessToken");
        return isSessionValid() && System.currentTimeMillis() - lastAccessUpdateMillisecondsAfterEpoch >= 0x5265c00L;
    }





/*
    static String access$102(Facebook facebook, String s)
    {
        facebook.accessToken = s;
        return s;
    }

*/




/*
    static long access$402(Facebook facebook, long l)
    {
        facebook.accessExpiresMillisecondsAfterEpoch = l;
        return l;
    }

*/



/*
    static String[] access$502(Facebook facebook, String as[])
    {
        facebook.pendingAuthorizationPermissions = as;
        return as;
    }

*/




/*
    static long access$702(Facebook facebook, long l)
    {
        facebook.lastAccessUpdateMillisecondsAfterEpoch = l;
        return l;
    }

*/

}
