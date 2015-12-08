// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            Strategy

public final class StrategyCreator
    implements android.os.Parcelable.Creator
{

    public StrategyCreator()
    {
    }

    static void writeToParcel$1d51236e(Strategy strategy, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, strategy.mBroadcastScanStrategy);
        SafeParcelWriter.writeInt(parcel, 1000, strategy.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, strategy.mTtlSeconds);
        SafeParcelWriter.writeInt(parcel, 3, strategy.mDistanceType);
        SafeParcelWriter.writeBoolean(parcel, 4, strategy.mIsBleBeaconStrategy);
        SafeParcelWriter.writeInt(parcel, 5, strategy.mDiscoveryMedium);
        SafeParcelWriter.writeInt(parcel, 6, strategy.mDiscoveryMode);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int k1 = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        boolean flag = false;
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = parcel.readInt();
                switch (0xffff & l1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l1);
                    break;

                case 1: // '\001'
                    i1 = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 1000: 
                    j1 = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 2: // '\002'
                    l = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, l1);
                    break;

                case 5: // '\005'
                    j = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k1).toString(), parcel);
            } else
            {
                return new Strategy(j1, i1, l, k, flag, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Strategy[i];
    }
}
