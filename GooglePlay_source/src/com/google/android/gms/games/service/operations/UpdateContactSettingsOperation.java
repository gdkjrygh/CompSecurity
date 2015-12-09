// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;

// Referenced classes of package com.google.android.gms.games.service.operations:
//            AbstractStatusReportingOperation

public final class UpdateContactSettingsOperation extends AbstractStatusReportingOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final Bundle mChannelSettings;
    private final boolean mEnableMobileNotifications;

    public UpdateContactSettingsOperation(ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, boolean flag, Bundle bundle)
    {
        super(clientcontext);
        mCallbacks = wrappedgamescallbacks;
        mEnableMobileNotifications = flag;
        mChannelSettings = bundle;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.updateContactSettings(mClientContext, mEnableMobileNotifications, mChannelSettings);
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
        mCallbacks.mCallbacks.onContactSettingsUpdated(i);
    }
}
