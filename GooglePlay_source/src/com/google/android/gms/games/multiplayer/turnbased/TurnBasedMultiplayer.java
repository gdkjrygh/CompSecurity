// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            OnTurnBasedMatchUpdateReceivedListener, TurnBasedMatch, LoadMatchesResponse

public interface TurnBasedMultiplayer
{
    public static interface InitiateMatchResult
        extends Result
    {

        public abstract TurnBasedMatch getMatch();
    }

    public static interface LoadMatchResult
        extends Result
    {

        public abstract TurnBasedMatch getMatch();
    }

    public static interface LoadMatchesResult
        extends Releasable, Result
    {

        public abstract LoadMatchesResponse getMatches();
    }


    public abstract PendingResult acceptInvitation(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult acceptInvitationFirstParty(GoogleApiClient googleapiclient, String s, String s1);

    public abstract void declineInvitation(GoogleApiClient googleapiclient, String s);

    public abstract void declineInvitationFirstParty(GoogleApiClient googleapiclient, String s, String s1);

    public abstract void dismissInvitation(GoogleApiClient googleapiclient, String s);

    public abstract void dismissInvitationFirstParty(GoogleApiClient googleapiclient, String s, String s1);

    public abstract void dismissMatch(GoogleApiClient googleapiclient, String s);

    public abstract void dismissMatchFirstParty(GoogleApiClient googleapiclient, String s, String s1);

    public abstract PendingResult loadMatch(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int i, int ai[]);

    public abstract PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int ai[]);

    public abstract PendingResult loadMatchesByStatusFirstParty$1a7105dc(GoogleApiClient googleapiclient, String s, int ai[]);

    public abstract void registerMatchUpdateListener(GoogleApiClient googleapiclient, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener);

    public abstract void registerMatchUpdateListenerFirstParty(GoogleApiClient googleapiclient, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, String s);

    public abstract PendingResult rematch(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult rematchFirstParty(GoogleApiClient googleapiclient, String s, String s1);

    public abstract void unregisterMatchUpdateListener(GoogleApiClient googleapiclient);

    public abstract void unregisterMatchUpdateListenerFirstParty(GoogleApiClient googleapiclient, String s);
}
