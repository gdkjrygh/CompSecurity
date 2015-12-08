// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.BaseSignInCallbacks;

// Referenced classes of package com.google.android.gms.games.signin:
//            SignInAuthenticator

private static final class mConnectionResultFuture extends BaseSignInCallbacks
{

    private RequestFuture mConnectionResultFuture;

    public final void onAuthAccountComplete(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
    {
        mConnectionResultFuture.onResponse(connectionresult);
    }

    (RequestFuture requestfuture)
    {
        mConnectionResultFuture = requestfuture;
    }
}
