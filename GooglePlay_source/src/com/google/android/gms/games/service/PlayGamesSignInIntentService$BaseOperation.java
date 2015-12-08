// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.error.GamesException;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSignInIntentService

static abstract class 
{

    public final void execute(Context context, DataBroker databroker)
    {
        int i;
        try
        {
            i = executeInternal(context, databroker);
        }
        catch (GamesException gamesexception)
        {
            GamesLog.e("SignInIntentService", gamesexception.mLogMessage, gamesexception);
            if (gamesexception.mInternalStatusCode == 1003)
            {
                databroker.clearRevisionCheck(context);
            }
            onGamesException(gamesexception);
            i = gamesexception.mClientStatusCode;
        }
        provideResult(i);
    }

    public abstract int executeInternal(Context context, DataBroker databroker);

    protected void onGamesException(GamesException gamesexception)
    {
    }

    public abstract void provideResult(int i);

    ()
    {
    }
}
