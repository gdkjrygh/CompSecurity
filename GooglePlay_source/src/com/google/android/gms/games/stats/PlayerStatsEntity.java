// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.stats:
//            PlayerStats, PlayerStatsEntityCreator

public class PlayerStatsEntity
    implements SafeParcelable, PlayerStats
{

    public static final android.os.Parcelable.Creator CREATOR = new PlayerStatsEntityCreator();
    final float mAverageSessionLength;
    final float mChurnProbability;
    final int mDaysSinceLastPlayed;
    final int mNumberOfPurchases;
    final int mNumberOfSessions;
    final Bundle mRawValues;
    final float mSessionPercentile;
    final float mSpendPercentile;
    final int mVersionCode;

    PlayerStatsEntity(int i, float f, float f1, int j, int k, int l, float f2, 
            float f3, Bundle bundle)
    {
        mVersionCode = i;
        mAverageSessionLength = f;
        mChurnProbability = f1;
        mDaysSinceLastPlayed = j;
        mNumberOfPurchases = k;
        mNumberOfSessions = l;
        mSessionPercentile = f2;
        mSpendPercentile = f3;
        mRawValues = bundle;
    }

    public PlayerStatsEntity(PlayerStats playerstats)
    {
        mVersionCode = 2;
        mAverageSessionLength = playerstats.getAverageSessionLength();
        mChurnProbability = playerstats.getChurnProbability();
        mDaysSinceLastPlayed = playerstats.getDaysSinceLastPlayed();
        mNumberOfPurchases = playerstats.getNumberOfPurchases();
        mNumberOfSessions = playerstats.getNumberOfSessions();
        mSessionPercentile = playerstats.getSessionPercentile();
        mSpendPercentile = playerstats.getSpendPercentile();
        mRawValues = playerstats.getRawValues();
    }

    static boolean equals(PlayerStats playerstats, Object obj)
    {
        if (obj instanceof PlayerStats)
        {
            if (playerstats == obj)
            {
                return true;
            }
            obj = (PlayerStats)obj;
            if (Objects.equal(Float.valueOf(((PlayerStats) (obj)).getAverageSessionLength()), Float.valueOf(playerstats.getAverageSessionLength())) && Objects.equal(Float.valueOf(((PlayerStats) (obj)).getChurnProbability()), Float.valueOf(playerstats.getChurnProbability())) && Objects.equal(Integer.valueOf(((PlayerStats) (obj)).getDaysSinceLastPlayed()), Integer.valueOf(playerstats.getDaysSinceLastPlayed())) && Objects.equal(Integer.valueOf(((PlayerStats) (obj)).getNumberOfPurchases()), Integer.valueOf(playerstats.getNumberOfPurchases())) && Objects.equal(Integer.valueOf(((PlayerStats) (obj)).getNumberOfSessions()), Integer.valueOf(playerstats.getNumberOfSessions())) && Objects.equal(Float.valueOf(((PlayerStats) (obj)).getSessionPercentile()), Float.valueOf(playerstats.getSessionPercentile())) && Objects.equal(Float.valueOf(((PlayerStats) (obj)).getSpendPercentile()), Float.valueOf(playerstats.getSpendPercentile())))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(PlayerStats playerstats)
    {
        return Arrays.hashCode(new Object[] {
            Float.valueOf(playerstats.getAverageSessionLength()), Float.valueOf(playerstats.getChurnProbability()), Integer.valueOf(playerstats.getDaysSinceLastPlayed()), Integer.valueOf(playerstats.getNumberOfPurchases()), Integer.valueOf(playerstats.getNumberOfSessions()), Float.valueOf(playerstats.getSessionPercentile()), Float.valueOf(playerstats.getSpendPercentile())
        });
    }

    static String toString(PlayerStats playerstats)
    {
        return Objects.toStringHelper(playerstats).add("AverageSessionLength", Float.valueOf(playerstats.getAverageSessionLength())).add("ChurnProbability", Float.valueOf(playerstats.getChurnProbability())).add("DaysSinceLastPlayed", Integer.valueOf(playerstats.getDaysSinceLastPlayed())).add("NumberOfPurchases", Integer.valueOf(playerstats.getNumberOfPurchases())).add("NumberOfSessions", Integer.valueOf(playerstats.getNumberOfSessions())).add("SessionPercentile", Float.valueOf(playerstats.getSessionPercentile())).add("SpendPercentile", Float.valueOf(playerstats.getSpendPercentile())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return equals(((PlayerStats) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final float getAverageSessionLength()
    {
        return mAverageSessionLength;
    }

    public final float getChurnProbability()
    {
        return mChurnProbability;
    }

    public final int getDaysSinceLastPlayed()
    {
        return mDaysSinceLastPlayed;
    }

    public final int getNumberOfPurchases()
    {
        return mNumberOfPurchases;
    }

    public final int getNumberOfSessions()
    {
        return mNumberOfSessions;
    }

    public final Bundle getRawValues()
    {
        return mRawValues;
    }

    public final float getSessionPercentile()
    {
        return mSessionPercentile;
    }

    public final float getSpendPercentile()
    {
        return mSpendPercentile;
    }

    public int hashCode()
    {
        return hashCode(((PlayerStats) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return toString(((PlayerStats) (this)));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerStatsEntityCreator.writeToParcel$642fe241(this, parcel);
    }

}
