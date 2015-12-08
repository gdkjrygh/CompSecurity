// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.SignInClient;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting, GoogleApiClientStateHolder, GoogleApiClientImpl

private final class <init> extends 
{

    final GoogleApiClientConnecting this$0;

    public final void runLocked()
    {
        mSignInClient.authAccount(mResolvedAccountAccessor, mHolder.mApiClient.mValidatedScopes, new ackHandler(GoogleApiClientConnecting.this));
    }

    private ackHandler()
    {
        this$0 = GoogleApiClientConnecting.this;
        super(GoogleApiClientConnecting.this, (byte)0);
    }

    (byte byte0)
    {
        this();
    }
}
