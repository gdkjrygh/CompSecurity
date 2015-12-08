// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.signin:
//            SignInClient

final class mBuffer
    implements com.google.android.gms.games.llback, mBuffer
{

    private final GameBuffer mBuffer;
    private final ResultCallback mCallback;
    private final Status mStatus;
    final SignInClient this$0;

    public final void deliverCallback()
    {
        mCallback.onResult(this);
    }

    public final GameBuffer getGames()
    {
        return mBuffer;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final void release()
    {
        mBuffer.release();
    }

    I(ResultCallback resultcallback, DataHolder dataholder)
    {
        this$0 = SignInClient.this;
        super();
        mCallback = resultcallback;
        mStatus = GamesStatusCodes.create(dataholder.mStatusCode);
        mBuffer = new GameBuffer(dataholder);
    }
}
