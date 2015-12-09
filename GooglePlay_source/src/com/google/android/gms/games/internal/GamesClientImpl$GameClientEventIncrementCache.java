// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.games.internal.events.EventIncrementCache;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl, IGamesService, GamesLog

private final class this._cls0 extends EventIncrementCache
{

    final GamesClientImpl this$0;

    protected final void doIncrementEvent(String s, int i)
    {
        if (isConnected())
        {
            ((IGamesService)getService()).incrementEvent(s, i);
            return;
        }
        try
        {
            GamesLog.e("GamesClientImpl", (new StringBuilder("Unable to increment event ")).append(s).append(" by ").append(i).append(" because the games client is no longer connected").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesClientImpl.access$000$7ffb5f55(s);
        }
        return;
    }

    public Y()
    {
        this$0 = GamesClientImpl.this;
        super(mContext.getMainLooper(), 1000);
    }
}
