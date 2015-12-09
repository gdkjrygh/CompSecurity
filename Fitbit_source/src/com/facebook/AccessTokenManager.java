// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook:
//            GraphRequest, HttpMethod, FacebookSdk, AccessTokenCache, 
//            GraphRequestBatch, AccessToken, AccessTokenSource

final class AccessTokenManager
{

    static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
    static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";
    static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";
    private static final String ME_PERMISSIONS_GRAPH_PATH = "me/permissions";
    static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    static final String TAG = "AccessTokenManager";
    private static final String TOKEN_EXTEND_GRAPH_PATH = "oauth/access_token";
    private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
    private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 0x15180;
    private static volatile AccessTokenManager instance;
    private final AccessTokenCache accessTokenCache;
    private AccessToken currentAccessToken;
    private Date lastAttemptedTokenExtendDate;
    private final LocalBroadcastManager localBroadcastManager;
    private AtomicBoolean tokenRefreshInProgress;

    AccessTokenManager(LocalBroadcastManager localbroadcastmanager, AccessTokenCache accesstokencache)
    {
        tokenRefreshInProgress = new AtomicBoolean(false);
        lastAttemptedTokenExtendDate = new Date(0L);
        Validate.notNull(localbroadcastmanager, "localBroadcastManager");
        Validate.notNull(accesstokencache, "accessTokenCache");
        localBroadcastManager = localbroadcastmanager;
        accessTokenCache = accesstokencache;
    }

    private static GraphRequest createExtendAccessTokenRequest(AccessToken accesstoken, GraphRequest.Callback callback)
    {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        return new GraphRequest(accesstoken, "oauth/access_token", bundle, HttpMethod.GET, callback);
    }

    private static GraphRequest createGrantedPermissionsRequest(AccessToken accesstoken, GraphRequest.Callback callback)
    {
        return new GraphRequest(accesstoken, "me/permissions", new Bundle(), HttpMethod.GET, callback);
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

    private void refreshCurrentAccessTokenImpl()
    {
        AccessToken accesstoken;
        for (accesstoken = currentAccessToken; accesstoken == null || !tokenRefreshInProgress.compareAndSet(false, true);)
        {
            return;
        }

        Validate.runningOnUiThread();
        lastAttemptedTokenExtendDate = new Date();
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
    /* block-local class not found */
    class RefreshResult {}

        RefreshResult refreshresult = new RefreshResult(null);
        GraphRequestBatch graphrequestbatch = new GraphRequestBatch(new GraphRequest[] {
            createGrantedPermissionsRequest(accesstoken, new _cls2(atomicboolean, hashset, hashset1)), createExtendAccessTokenRequest(accesstoken, new _cls3(refreshresult))
        });
        graphrequestbatch.addCallback(new _cls4(accesstoken, atomicboolean, refreshresult, hashset, hashset1));
        graphrequestbatch.executeAsync();
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
        tokenRefreshInProgress.set(false);
        lastAttemptedTokenExtendDate = new Date(0L);
        if (flag)
        {
            if (accesstoken != null)
            {
                accessTokenCache.save(accesstoken);
            } else
            {
                accessTokenCache.clear();
                Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
            }
        }
        if (!Utility.areObjectsEqual(accesstoken1, accesstoken))
        {
            sendCurrentAccessTokenChangedBroadcast(accesstoken1, accesstoken);
        }
    }

    private boolean shouldExtendAccessToken()
    {
        if (currentAccessToken != null)
        {
            Long long1 = Long.valueOf((new Date()).getTime());
            if (currentAccessToken.getSource().canExtendToken() && long1.longValue() - lastAttemptedTokenExtendDate.getTime() > 0x36ee80L && long1.longValue() - currentAccessToken.getLastRefresh().getTime() > 0x5265c00L)
            {
                return true;
            }
        }
        return false;
    }

    void extendAccessTokenIfNeeded()
    {
        if (!shouldExtendAccessToken())
        {
            return;
        } else
        {
            refreshCurrentAccessToken();
            return;
        }
    }

    AccessToken getCurrentAccessToken()
    {
        return currentAccessToken;
    }

    boolean loadCurrentAccessToken()
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

    void refreshCurrentAccessToken()
    {
        if (Looper.getMainLooper().equals(Looper.myLooper()))
        {
            refreshCurrentAccessTokenImpl();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(new _cls1());
            return;
        }
    }

    void setCurrentAccessToken(AccessToken accesstoken)
    {
        setCurrentAccessToken(accesstoken, true);
    }



    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}

}
