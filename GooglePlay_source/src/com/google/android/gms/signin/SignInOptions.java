// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;


public final class SignInOptions
    implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
    public static final class Builder
    {

        public Builder()
        {
        }
    }


    public static final SignInOptions DEFAULT = new SignInOptions(false, false, null, null, false, false, false, (byte)0);
    public final boolean mForceCodeForRefreshToken;
    public final boolean mIdTokenRequested;
    public final com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks mOfflineAccessCallbacks;
    public final boolean mOfflineAccessRequested;
    public final String mServerClientId;
    public final boolean mUsePromptModeForAuthCode;
    public final boolean mWaitForAccessTokenRefresh;

    private SignInOptions(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks, boolean flag2, boolean flag3, boolean flag4)
    {
        mOfflineAccessRequested = flag;
        mIdTokenRequested = flag1;
        mServerClientId = s;
        mOfflineAccessCallbacks = serverauthcodecallbacks;
        mUsePromptModeForAuthCode = flag2;
        mForceCodeForRefreshToken = flag3;
        mWaitForAccessTokenRefresh = flag4;
    }

    private SignInOptions(boolean flag, boolean flag1, String s, com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks serverauthcodecallbacks, boolean flag2, boolean flag3, boolean flag4, 
            byte byte0)
    {
        this(false, false, null, null, false, false, false);
    }

    static 
    {
        new Builder();
    }
}
