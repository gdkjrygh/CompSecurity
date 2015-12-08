// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.internal.events.EventIncrementManager;

// Referenced classes of package com.google.android.gms.games:
//            Games

static final class gleApiClient extends gnOutImpl
{

    protected final volatile void doExecute(com.google.android.gms.common.api.nt nt)
        throws RemoteException
    {
        nt = (GamesClientImpl)nt;
        ((GamesClientImpl) (nt)).mIncrementCache.flush();
        ((IGamesService)nt.getService()).signOut(new com.google.android.gms.games.internal.entImpl.SignOutCompleteBinderCallbacks(this));
    }

    gleApiClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient, (byte)0);
    }
}
