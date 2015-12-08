// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.matches;

import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.common.matches.ParticipantListActivity;
import com.google.android.gms.games.ui.util.UiUtils;

public class DestinationParticipantListActivity extends ParticipantListActivity
{

    public DestinationParticipantListActivity()
    {
        super(3);
    }

    protected final void addApisToGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient.Builder builder)
    {
        super.addApisToGoogleApiClient(builder);
        builder.addApi(Games.API_1P);
    }

    public final void onParticipantClicked(Participant participant)
    {
        participant = participant.getPlayer();
        if (participant == null)
        {
            GamesLog.w("DestPartListActvity", "participant.getPlayer() returned null. Ignoring click");
            return;
        }
        if (mCurrentPlayerId.equals(participant.getPlayerId()))
        {
            UiUtils.viewMyProfile(this, participant, null);
            return;
        } else
        {
            UiUtils.viewProfileComparison(this, participant, null);
            return;
        }
    }
}
