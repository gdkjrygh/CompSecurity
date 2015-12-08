// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.server.auth.AuthSessionAuthenticator;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.service.operations:
//            AbstractStatusReportingOperation

public final class GetGamesAuthTokenOperation extends AbstractStatusReportingOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private String mToken;

    public GetGamesAuthTokenOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        databroker = new AuthSessionAuthenticator(mClientContext);
        try
        {
            mToken = databroker.getOrThrow(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 6;
        }
        return 0;
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
        WrappedGamesCallbacks wrappedgamescallbacks = mCallbacks;
        String s = mToken;
        wrappedgamescallbacks.mCallbacks.onAuthTokenLoaded(i, s);
    }
}
