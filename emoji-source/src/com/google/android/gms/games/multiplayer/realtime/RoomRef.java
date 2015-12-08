// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntity, RoomConfig

public final class RoomRef extends d
    implements Room
{

    private final int RG;

    RoomRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        RG = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return RoomEntity.a(this, obj);
    }

    public Room freeze()
    {
        return new RoomEntity(this);
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
            return RoomConfig.createAutoMatchCriteria(getInteger("automatch_min_players"), getInteger("automatch_max_players"), getLong("automatch_bit_mask"));
        }
    }

    public int getAutoMatchWaitEstimateSeconds()
    {
        return getInteger("automatch_wait_estimate_sec");
    }

    public long getCreationTimestamp()
    {
        return getLong("creation_timestamp");
    }

    public String getCreatorId()
    {
        return getString("creator_external");
    }

    public String getDescription()
    {
        return getString("description");
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        a("description", chararraybuffer);
    }

    public Participant getParticipant(String s)
    {
        return RoomEntity.c(this, s);
    }

    public String getParticipantId(String s)
    {
        return RoomEntity.b(this, s);
    }

    public ArrayList getParticipantIds()
    {
        return RoomEntity.c(this);
    }

    public int getParticipantStatus(String s)
    {
        return RoomEntity.a(this, s);
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

    public String getRoomId()
    {
        return getString("external_match_id");
    }

    public int getStatus()
    {
        return getInteger("status");
    }

    public int getVariant()
    {
        return getInteger("variant");
    }

    public int hashCode()
    {
        return RoomEntity.a(this);
    }

    public String toString()
    {
        return RoomEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((RoomEntity)freeze()).writeToParcel(parcel, i);
    }
}
