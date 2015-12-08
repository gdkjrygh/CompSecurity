// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.stats:
//            PlayerStatsEntity

public final class PlayerStatsEntityCreator
    implements android.os.Parcelable.Creator
{

    public PlayerStatsEntityCreator()
    {
    }

    static void writeToParcel$642fe241(PlayerStatsEntity playerstatsentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeFloat(parcel, 1, playerstatsentity.mAverageSessionLength);
        SafeParcelWriter.writeInt(parcel, 1000, playerstatsentity.mVersionCode);
        SafeParcelWriter.writeFloat(parcel, 2, playerstatsentity.mChurnProbability);
        SafeParcelWriter.writeInt(parcel, 3, playerstatsentity.mDaysSinceLastPlayed);
        SafeParcelWriter.writeInt(parcel, 4, playerstatsentity.mNumberOfPurchases);
        SafeParcelWriter.writeInt(parcel, 5, playerstatsentity.mNumberOfSessions);
        SafeParcelWriter.writeFloat(parcel, 6, playerstatsentity.mSessionPercentile);
        SafeParcelWriter.writeFloat(parcel, 7, playerstatsentity.mSpendPercentile);
        SafeParcelWriter.writeBundle(parcel, 8, playerstatsentity.mRawValues, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        float f = 0.0F;
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundle = null;
        float f1 = 0.0F;
        int j = 0;
        int k = 0;
        float f2 = 0.0F;
        float f3 = 0.0F;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    f3 = SafeParcelReader.readFloat(parcel, j1);
                    break;

                case 1000: 
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    f2 = SafeParcelReader.readFloat(parcel, j1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 6: // '\006'
                    f1 = SafeParcelReader.readFloat(parcel, j1);
                    break;

                case 7: // '\007'
                    f = SafeParcelReader.readFloat(parcel, j1);
                    break;

                case 8: // '\b'
                    bundle = SafeParcelReader.createBundle(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new PlayerStatsEntity(l, f3, f2, k, j, i, f1, f, bundle);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlayerStatsEntity[i];
    }
}
