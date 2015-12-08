// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.restricted.matches;

import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.api.DestinationApiHelper;
import com.google.android.gms.games.ui.common.matches.ParticipantListActivity;
import com.google.android.gms.games.ui.util.UiUtils;

public final class RestrictedParticipantListActivity extends ParticipantListActivity
{

    public RestrictedParticipantListActivity()
    {
        super(0);
    }

    public final DestinationApiHelper getDestinationApiHelper()
    {
        return new DestinationApiHelper(this);
    }

    public final void onParticipantClicked(Participant participant)
    {
        participant = participant.getPlayer();
        if (participant == null)
        {
            GamesLog.w("RestPartListActvity", "participant.getPlayer() returned null. Ignoring click");
            return;
        } else
        {
            UiUtils.showProfileSummaryDialog(this, participant, mCurrentPlayerId.equals(participant.getPlayerId()));
            return;
        }
    }
}
