// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import com.google.android.gms.games.service.AbstractSignInCallbacks;

// Referenced classes of package com.google.android.gms.games.signin:
//            SignInClient

public final class mCallback extends AbstractSignInCallbacks
{

    private final mCallback mCallback;
    final SignInClient this$0;

    public final void onAccountValidated(int i)
    {
        mHandler.mCallback(mHandler.mCallback(0, new (SignInClient.this, mCallback, i)));
    }

    public ( )
    {
        this$0 = SignInClient.this;
        super();
        mCallback = ;
    }
}
