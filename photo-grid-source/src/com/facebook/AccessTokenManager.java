// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.Date;

// Referenced classes of package com.facebook:
//            FacebookSdk, AccessTokenCache, AccessToken, AccessTokenSource

final class AccessTokenManager
{

    static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
    static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
    static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
    static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
    private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 0x15180;
    private static volatile AccessTokenManager instance;
    private final AccessTokenCache accessTokenCache;
    private AccessToken currentAccessToken;
    private TokenRefreshRequest currentTokenRefreshRequest;
    private Date lastAttemptedTokenExtendDate;
    private final LocalBroadcastManager localBroadcastManager;

    AccessTokenManager(LocalBroadcastManager localbroadcastmanager, AccessTokenCache accesstokencache)
    {
        lastAttemptedTokenExtendDate = new Date(0L);
        Validate.notNull(localbroadcastmanager, "localBroadcastManager");
        Validate.notNull(accesstokencache, "accessTokenCache");
        localBroadcastManager = localbroadcastmanager;
        accessTokenCache = accesstokencache;
    }

    static AccessTokenManager getInstance()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/facebook/AccessTokenManager;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new AccessTokenManager(LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()), new AccessTokenCache());
        }
        com/facebook/AccessTokenManager;
        JVM INSTR monitorexit ;
_L2:
        return instance;
        Exception exception;
        exception;
        com/facebook/AccessTokenManager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void sendCurrentAccessTokenChangedBroadcast(AccessToken accesstoken, AccessToken accesstoken1)
    {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accesstoken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accesstoken1);
        localBroadcastManager.sendBroadcast(intent);
    }

    private void setCurrentAccessToken(AccessToken accesstoken, boolean flag)
    {
        AccessToken accesstoken1 = currentAccessToken;
        currentAccessToken = accesstoken;
        currentTokenRefreshRequest = null;
        lastAttemptedTokenExtendDate = new Date(0L);
        if (flag)
        {
            if (accesstoken != null)
            {
                accessTokenCache.save(accesstoken);
            } else
            {
                accessTokenCache.clear();
            }
        }
        if (!Utility.areObjectsEqual(accesstoken1, accesstoken))
        {
            sendCurrentAccessTokenChangedBroadcast(accesstoken1, accesstoken);
        }
    }

    private boolean shouldExtendAccessToken()
    {
        if (currentAccessToken != null && currentTokenRefreshRequest == null)
        {
            Long long1 = Long.valueOf((new Date()).getTime());
            if (currentAccessToken.getSource().canExtendToken() && long1.longValue() - lastAttemptedTokenExtendDate.getTime() > 0x36ee80L && long1.longValue() - currentAccessToken.getLastRefresh().getTime() > 0x5265c00L)
            {
                return true;
            }
        }
        return false;
    }

    final void extendAccessTokenIfNeeded()
    {
        if (!shouldExtendAccessToken())
        {
            return;
        } else
        {
            currentTokenRefreshRequest = new TokenRefreshRequest(currentAccessToken);
            currentTokenRefreshRequest.bind();
            return;
        }
    }

    final AccessToken getCurrentAccessToken()
    {
        return currentAccessToken;
    }

    final boolean loadCurrentAccessToken()
    {
        boolean flag = false;
        AccessToken accesstoken = accessTokenCache.load();
        if (accesstoken != null)
        {
            setCurrentAccessToken(accesstoken, false);
            flag = true;
        }
        return flag;
    }

    final void setCurrentAccessToken(AccessToken accesstoken)
    {
        setCurrentAccessToken(accesstoken, true);
    }


/*
    static Date access$002(AccessTokenManager accesstokenmanager, Date date)
    {
        accesstokenmanager.lastAttemptedTokenExtendDate = date;
        return date;
    }

*/



/*
    static TokenRefreshRequest access$102(AccessTokenManager accesstokenmanager, TokenRefreshRequest tokenrefreshrequest)
    {
        accesstokenmanager.currentTokenRefreshRequest = tokenrefreshrequest;
        return tokenrefreshrequest;
    }

*/

    private class TokenRefreshRequest
        implements ServiceConnection
    {
        private class TokenRefreshRequestHandler extends Handler
        {

            private AccessToken accessToken;
            private TokenRefreshRequest tokenRefreshRequest;

            public void handleMessage(Message message)
            {
                AccessToken accesstoken = AccessToken.getCurrentAccessToken();
                if (accesstoken != null && accesstoken.equals(accessToken) && message.getData().getString("access_token") != null)
                {
                    AccessToken.setCurrentAccessToken(AccessToken.createFromRefresh(accessToken, message.getData()));
                }
                FacebookSdk.getApplicationContext().unbindService(tokenRefreshRequest);
                tokenRefreshRequest.cleanup();
            }

            TokenRefreshRequestHandler(AccessToken accesstoken, TokenRefreshRequest tokenrefreshrequest)
            {
                super(Looper.getMainLooper());
                accessToken = accesstoken;
                tokenRefreshRequest = tokenrefreshrequest;
            }
        }


        final Messenger messageReceiver;
        Messenger messageSender;
        final AccessTokenManager this$0;

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
            bundle.putString("access_token", getCurrentAccessToken().getToken());
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
            Context context = FacebookSdk.getApplicationContext();
            Intent intent = NativeProtocol.createTokenRefreshIntent(context);
            if (intent != null && context.bindService(intent, this, 1))
            {
                lastAttemptedTokenExtendDate = new Date();
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
            try
            {
                FacebookSdk.getApplicationContext().unbindService(this);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname)
            {
                return;
            }
        }


        TokenRefreshRequest(AccessToken accesstoken)
        {
            this$0 = AccessTokenManager.this;
            super();
            messageSender = null;
            messageReceiver = new Messenger(new TokenRefreshRequestHandler(accesstoken, this));
        }
    }

}
