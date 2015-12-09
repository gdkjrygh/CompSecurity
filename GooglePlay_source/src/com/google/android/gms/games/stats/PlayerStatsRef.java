// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.internal.Asserts;

// Referenced classes of package com.google.android.gms.games.stats:
//            PlayerStats, PlayerStatsEntity

public class PlayerStatsRef extends DataBufferRef
    implements PlayerStats
{

    private Bundle mRawValues;

    private PlayerStats freeze()
    {
        return new PlayerStatsEntity(this);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return PlayerStatsEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final float getAverageSessionLength()
    {
        return getFloat("ave_session_length_minutes");
    }

    public final float getChurnProbability()
    {
        return getFloat("churn_probability");
    }

    public final int getDaysSinceLastPlayed()
    {
        return getInteger("days_since_last_played");
    }

    public final int getNumberOfPurchases()
    {
        return getInteger("num_purchases");
    }

    public final int getNumberOfSessions()
    {
        return getInteger("num_sessions");
    }

    public final Bundle getRawValues()
    {
        if (mRawValues != null)
        {
            return mRawValues;
        }
        mRawValues = new Bundle();
        String s1 = getString("unknown_raw_keys");
        String s = getString("unknown_raw_values");
        if (s1 != null && s != null)
        {
            String as1[] = s1.split(",");
            String as[] = s.split(",");
            boolean flag;
            if (as1.length <= as.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "Invalid raw arguments!");
            for (int i = 0; i < as1.length; i++)
            {
                mRawValues.putString(as1[i], as[i]);
            }

        }
        return mRawValues;
    }

    public final float getSessionPercentile()
    {
        return getFloat("num_sessions_percentile");
    }

    public final float getSpendPercentile()
    {
        return getFloat("spend_percentile");
    }

    public int hashCode()
    {
        return PlayerStatsEntity.hashCode(this);
    }

    public String toString()
    {
        return PlayerStatsEntity.toString(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((PlayerStatsEntity)freeze()).writeToParcel(parcel, i);
    }
}
