// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.herrevad;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.herrevad:
//            PredictedNetworkQuality

public final class PredictedNetworkQualityCreator
    implements android.os.Parcelable.Creator
{

    public PredictedNetworkQualityCreator()
    {
    }

    static void writeToParcel$5858cc2d(PredictedNetworkQuality predictednetworkquality, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, predictednetworkquality.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, predictednetworkquality.networkType);
        SafeParcelWriter.writeInt(parcel, 3, predictednetworkquality.predictedLatencyMicros);
        SafeParcelWriter.writeLong(parcel, 4, predictednetworkquality.predictedDownThroughputBps);
        SafeParcelWriter.writeLong(parcel, 5, predictednetworkquality.predictedUpThroughputBps);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        long l2 = 0L;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    l2 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new PredictedNetworkQuality(k, j, i, l2, l1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PredictedNetworkQuality[i];
    }
}
