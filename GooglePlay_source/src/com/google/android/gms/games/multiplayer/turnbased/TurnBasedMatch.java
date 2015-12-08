// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.Participatable;

public interface TurnBasedMatch
    extends Parcelable, Freezable, Participatable
{

    public static final int MATCH_TURN_STATUS_ALL[] = {
        0, 1, 2, 3
    };

    public abstract boolean canRematch();

    public abstract Bundle getAutoMatchCriteria();

    public abstract int getAvailableAutoMatchSlots();

    public abstract long getCreationTimestamp();

    public abstract String getCreatorId();

    public abstract byte[] getData();

    public abstract String getDescription();

    public abstract Participant getDescriptionParticipant();

    public abstract String getDescriptionParticipantId();

    public abstract Game getGame();

    public abstract long getLastUpdatedTimestamp();

    public abstract String getLastUpdaterId();

    public abstract String getMatchId();

    public abstract int getMatchNumber();

    public abstract String getParticipantId(String s);

    public abstract String getPendingParticipantId();

    public abstract byte[] getPreviousMatchData();

    public abstract String getRematchId();

    public abstract int getStatus();

    public abstract int getTurnStatus();

    public abstract int getVariant();

    public abstract int getVersion();

    public abstract boolean isLocallyModified();

}
