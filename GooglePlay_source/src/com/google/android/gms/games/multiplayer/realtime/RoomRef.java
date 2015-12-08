// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntity

public final class RoomRef extends DataBufferRef
    implements Room
{

    private final int mNumChildren;

    RoomRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        mNumChildren = j;
    }

    private Room freeze()
    {
        return new RoomEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return RoomEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final Bundle getAutoMatchCriteria()
    {
        if (!getBoolean("has_automatch_criteria"))
        {
            return null;
        } else
        {
            int i = getInteger("automatch_min_players");
            int j = getInteger("automatch_max_players");
            long l = getLong("automatch_bit_mask");
            Bundle bundle = new Bundle();
            bundle.putInt("min_automatch_players", i);
            bundle.putInt("max_automatch_players", j);
            bundle.putLong("exclusive_bit_mask", l);
            return bundle;
        }
    }

    public final int getAutoMatchWaitEstimateSeconds()
    {
        return getInteger("automatch_wait_estimate_sec");
    }

    public final long getCreationTimestamp()
    {
        return getLong("creation_timestamp");
    }

    public final String getCreatorId()
    {
        return getString("creator_external");
    }

    public final String getDescription()
    {
        return getString("description");
    }

    public final String getParticipantId(String s)
    {
        return RoomEntity.getParticipantId(this, s);
    }

    public final ArrayList getParticipants()
    {
        ArrayList arraylist = new ArrayList(mNumChildren);
        for (int i = 0; i < mNumChildren; i++)
        {
            arraylist.add(new ParticipantRef(mDataHolder, mDataRow + i));
        }

        return arraylist;
    }

    public final String getRoomId()
    {
        return getString("external_match_id");
    }

    public final int getStatus()
    {
        return getInteger("status");
    }

    public final int getVariant()
    {
        return getInteger("variant");
    }

    public final int hashCode()
    {
        return RoomEntity.hashCode(this);
    }

    public final String toString()
    {
        return RoomEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((RoomEntity)freeze()).writeToParcel(parcel, i);
    }
}
