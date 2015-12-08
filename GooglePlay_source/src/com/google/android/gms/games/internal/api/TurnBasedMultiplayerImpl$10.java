// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

final class dMatchImpl extends dMatchImpl
{

    final TurnBasedMultiplayerImpl this$0;
    final String val$matchId;

    protected final volatile void doExecute(com.google.android.gms.common.api.Impl._cls10 _pcls10)
        throws RemoteException
    {
        _pcls10 = (GamesClientImpl)_pcls10;
        String s = val$matchId;
        ((IGamesService)_pcls10.getService()).getTurnBasedMatch(new com.google.android.gms.games.internal.chLoadedBinderCallbacks(this), s);
    }

    adedBinderCallbacks(String s)
    {
        this$0 = final_turnbasedmultiplayerimpl;
        val$matchId = s;
        super(GoogleApiClient.this, (byte)0);
    }
}
