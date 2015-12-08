// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, TurnBasedMatchEntity, TurnBasedMatchConfig

public final class TurnBasedMatchRef extends d
    implements TurnBasedMatch
{

    private final int RG;
    private final Game Ss;

    TurnBasedMatchRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        Ss = new GameRef(dataholder, i);
        RG = j;
    }

    public boolean canRematch()
    {
        return getTurnStatus() == 3 && getRematchId() == null && getParticipants().size() > 1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return TurnBasedMatchEntity.a(this, obj);
    }

    public TurnBasedMatch freeze()
    {
        return new TurnBasedMatchEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public Bundle getAutoMatchCriteria()
    {
        if (!getBoolean("has_automatch_criteria"))
        {
            return null;
        } else
        {
            return TurnBasedMatchConfig.createAutoMatchCriteria(getInteger("automatch_min_players"), getInteger("automatch_max_players"), getLong("automatch_bit_mask"));
        }
    }

    public int getAvailableAutoMatchSlots()
    {
        if (!getBoolean("has_automatch_criteria"))
        {
            return 0;
        } else
        {
            return getInteger("automatch_max_players");
        }
    }

    public long getCreationTimestamp()
    {
        return getLong("creation_timestamp");
    }

    public String getCreatorId()
    {
        return getString("creator_external");
    }

    public byte[] getData()
    {
        return getByteArray("data");
    }

    public String getDescription()
    {
        return getString("description");
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        a("description", chararraybuffer);
    }

    public Participant getDescriptionParticipant()
    {
        return getParticipant(getDescriptionParticipantId());
    }

    public String getDescriptionParticipantId()
    {
        return getString("description_participant_id");
    }

    public Game getGame()
    {
        return Ss;
    }

    public long getLastUpdatedTimestamp()
    {
        return getLong("last_updated_timestamp");
    }

    public String getLastUpdaterId()
    {
        return getString("last_updater_external");
    }

    public String getMatchId()
    {
        return getString("external_match_id");
    }

    public int getMatchNumber()
    {
        return getInteger("match_number");
    }

    public Participant getParticipant(String s)
    {
        return TurnBasedMatchEntity.c(this, s);
    }

    public String getParticipantId(String s)
    {
        return TurnBasedMatchEntity.b(this, s);
    }

    public ArrayList getParticipantIds()
    {
        return TurnBasedMatchEntity.c(this);
    }

    public int getParticipantStatus(String s)
    {
        return TurnBasedMatchEntity.a(this, s);
    }

    public ArrayList getParticipants()
    {
        ArrayList arraylist = new ArrayList(RG);
        for (int i = 0; i < RG; i++)
        {
            arraylist.add(new ParticipantRef(DG, EC + i));
        }

        return arraylist;
    }

    public String getPendingParticipantId()
    {
        return getString("pending_participant_external");
    }

    public byte[] getPreviousMatchData()
    {
        return getByteArray("previous_match_data");
    }

    public String getRematchId()
    {
        return getString("rematch_id");
    }

    public int getStatus()
    {
        return getInteger("status");
    }

    public int getTurnStatus()
    {
        return getInteger("user_match_status");
    }

    public int getVariant()
    {
        return getInteger("variant");
    }

    public int getVersion()
    {
        return getInteger("version");
    }

    public int hashCode()
    {
        return TurnBasedMatchEntity.a(this);
    }

    public boolean isLocallyModified()
    {
        return getBoolean("upsync_required");
    }

    public String toString()
    {
        return TurnBasedMatchEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((TurnBasedMatchEntity)freeze()).writeToParcel(parcel, i);
    }
}
