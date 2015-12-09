// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mMatch
    implements com.google.android.gms.common.api.internal.h
{

    private final TurnBasedMatch mMatch;

    public final volatile void notifyListener(Object obj)
    {
        ((OnTurnBasedMatchUpdateReceivedListener)obj).onTurnBasedMatchReceived$660f1cd7();
    }

    public final void onNotifyListenerFailed()
    {
    }

    istener(TurnBasedMatch turnbasedmatch)
    {
        mMatch = turnbasedmatch;
    }
}
