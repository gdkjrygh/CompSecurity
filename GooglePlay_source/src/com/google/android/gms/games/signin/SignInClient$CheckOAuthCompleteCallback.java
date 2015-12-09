// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import android.app.PendingIntent;

// Referenced classes of package com.google.android.gms.games.signin:
//            SignInClient

final class mResolution
    implements mResolution
{

    private final k mCallback;
    private final PendingIntent mResolution;
    private final int mStatusCode;
    final SignInClient this$0;

    public final void deliverCallback()
    {
        mCallback.onCheckOAuthComplete(mStatusCode, mResolution);
    }

    k(k k, int i, PendingIntent pendingintent)
    {
        this$0 = SignInClient.this;
        super();
        mCallback = k;
        mStatusCode = i;
        mResolution = pendingintent;
    }
}
