// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, MilestoneEntity

public final class MilestoneRef extends d
    implements Milestone
{

    MilestoneRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private long iI()
    {
        return getLong("initial_value");
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return MilestoneEntity.a(this, obj);
    }

    public Milestone freeze()
    {
        return new MilestoneEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public byte[] getCompletionRewardData()
    {
        return getByteArray("completion_reward_data");
    }

    public long getCurrentProgress()
    {
        switch (getState())
        {
        case 1: // '\001'
        default:
            return 0L;

        case 3: // '\003'
        case 4: // '\004'
            return getTargetProgress();

        case 2: // '\002'
            return getLong("current_value") - iI();
        }
    }

    public String getEventId()
    {
        return getString("external_event_id");
    }

    public String getMilestoneId()
    {
        return getString("external_milestone_id");
    }

    public int getState()
    {
        return getInteger("milestone_state");
    }

    public long getTargetProgress()
    {
        return getLong("target_value");
    }

    public int hashCode()
    {
        return MilestoneEntity.a(this);
    }

    public String toString()
    {
        return MilestoneEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((MilestoneEntity)freeze()).writeToParcel(parcel, i);
    }
}
