// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.facebook:
//            AccessToken, FacebookSdk

class tokenRefreshRequest extends Handler
{

    private AccessToken accessToken;
    private tokenRefreshRequest tokenRefreshRequest;

    public void handleMessage(Message message)
    {
        AccessToken accesstoken = AccessToken.getCurrentAccessToken();
        if (accesstoken != null && accesstoken.equals(accessToken) && message.getData().getString("access_token") != null)
        {
            AccessToken.setCurrentAccessToken(AccessToken.createFromRefresh(accessToken, message.getData()));
        }
        FacebookSdk.getApplicationContext().unbindService(tokenRefreshRequest);
        _mth200(tokenRefreshRequest);
    }

    (AccessToken accesstoken,  )
    {
        super(Looper.getMainLooper());
        accessToken = accesstoken;
        tokenRefreshRequest = ;
    }
}
