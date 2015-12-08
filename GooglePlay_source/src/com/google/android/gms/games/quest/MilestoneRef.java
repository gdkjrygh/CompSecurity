// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, MilestoneEntity

public final class MilestoneRef extends DataBufferRef
    implements Milestone
{

    MilestoneRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private Milestone freeze()
    {
        return new MilestoneEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return MilestoneEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final byte[] getCompletionRewardData()
    {
        return getByteArray("completion_reward_data");
    }

    public final long getCurrentProgress()
    {
        getInteger("milestone_state");
        JVM INSTR tableswitch 1 4: default 36
    //                   1 94
    //                   2 99
    //                   3 84
    //                   4 84;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        long l = 0L;
_L6:
        long l1 = l;
        if (l < 0L)
        {
            GamesLog.e("MilestoneRef", "Current progress should never be negative");
            l1 = 0L;
        }
        l = l1;
        if (l1 > getLong("target_value"))
        {
            GamesLog.e("MilestoneRef", "Current progress should never exceed target progress");
            l = getLong("target_value");
        }
        return l;
_L4:
        l = getLong("target_value");
        continue; /* Loop/switch isn't completed */
_L2:
        l = 0L;
        continue; /* Loop/switch isn't completed */
_L3:
        long l2 = getLong("current_value");
        l = l2;
        if (getLong("quest_state") != 6L)
        {
            l = l2 - getLong("initial_value");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final String getEventId()
    {
        return getString("external_event_id");
    }

    public final String getMilestoneId()
    {
        return getString("external_milestone_id");
    }

    public final int getState()
    {
        return getInteger("milestone_state");
    }

    public final long getTargetProgress()
    {
        return getLong("target_value");
    }

    public final int hashCode()
    {
        return MilestoneEntity.hashCode(this);
    }

    public final String toString()
    {
        return MilestoneEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((MilestoneEntity)freeze()).writeToParcel(parcel, i);
    }
}
