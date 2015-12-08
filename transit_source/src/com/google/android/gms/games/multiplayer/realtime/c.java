// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.d;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntity, RoomConfig

public final class c extends b
    implements Room
{

    private final int nu;

    c(com.google.android.gms.common.data.d d1, int i, int j)
    {
        super(d1, i);
        nu = j;
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

    public String getParticipantId(String s)
    {
        ArrayList arraylist = getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(s))
            {
                return participant.getParticipantId();
            }
        }

        return null;
    }

    public ArrayList getParticipantIds()
    {
        ArrayList arraylist = getParticipants();
        ArrayList arraylist1 = new ArrayList(nu);
        for (int i = 0; i < nu; i++)
        {
            arraylist1.add(((Participant)arraylist.get(i)).getParticipantId());
        }

        return arraylist1;
    }

    public int getParticipantStatus(String s)
    {
        ArrayList arraylist = getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant.getStatus();
            }
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in room ").append(getRoomId()).toString());
    }

    public ArrayList getParticipants()
    {
        ArrayList arraylist = new ArrayList(nu);
        for (int i = 0; i < nu; i++)
        {
            arraylist.add(new d(jf, ji + i));
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
        return com.google.android.gms.games.multiplayer.realtime.RoomEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((RoomEntity)freeze()).writeToParcel(parcel, i);
    }
}
