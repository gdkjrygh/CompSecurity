// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, ParticipantRef, InvitationEntity, Participant

public final class InvitationRef extends DataBufferRef
    implements Invitation
{

    private final Game mGame;
    private final ParticipantRef mInviter;
    private final ArrayList mParticipants;

    InvitationRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        mGame = new GameRef(dataholder, i);
        mParticipants = new ArrayList(j);
        dataholder = null;
        String s = getString("external_inviter_id");
        for (i = 0; i < j; i++)
        {
            ParticipantRef participantref = new ParticipantRef(mDataHolder, mDataRow + i);
            if (participantref.getString("external_participant_id").equals(s))
            {
                dataholder = participantref;
            }
            mParticipants.add(participantref);
        }

        mInviter = (ParticipantRef)Preconditions.checkNotNull(dataholder, "Must have a valid inviter!");
    }

    private Invitation freeze()
    {
        return new InvitationEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return InvitationEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getAvailableAutoMatchSlots()
    {
        if (!getBoolean("has_automatch_criteria"))
        {
            return 0;
        } else
        {
            return getInteger("automatch_max_players");
        }
    }

    public final long getCreationTimestamp()
    {
        return Math.max(getLong("creation_timestamp"), getLong("last_modified_timestamp"));
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final String getInvitationId()
    {
        return getString("external_invitation_id");
    }

    public final int getInvitationType()
    {
        return getInteger("type");
    }

    public final Participant getInviter()
    {
        return mInviter;
    }

    public final ArrayList getParticipants()
    {
        return mParticipants;
    }

    public final int getVariant()
    {
        return getInteger("variant");
    }

    public final int hashCode()
    {
        return InvitationEntity.hashCode(this);
    }

    public final String toString()
    {
        return InvitationEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((InvitationEntity)freeze()).writeToParcel(parcel, i);
    }
}
