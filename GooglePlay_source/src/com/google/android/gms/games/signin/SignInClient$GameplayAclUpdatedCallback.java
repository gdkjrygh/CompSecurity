// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.signin:
//            SignInClient

final class mStatus
    implements mStatus
{

    private final com.google.android.gms.games.internal.game. mCallback;
    private final Status mStatus;
    final SignInClient this$0;

    public final void deliverCallback()
    {
        mCallback.playAclUpdated(mStatus);
    }

    (com.google.android.gms.games.internal.game. , int i)
    {
        this$0 = SignInClient.this;
        super();
        mCallback = ;
        mStatus = GamesStatusCodes.create(i);
    }
}
