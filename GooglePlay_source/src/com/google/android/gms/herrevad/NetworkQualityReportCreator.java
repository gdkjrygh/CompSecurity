// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.herrevad;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.herrevad:
//            NetworkQualityReport

public final class NetworkQualityReportCreator
    implements android.os.Parcelable.Creator
{

    public NetworkQualityReportCreator()
    {
    }

    static void writeToParcel$14c21a41(NetworkQualityReport networkqualityreport, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, networkqualityreport.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, networkqualityreport.mLatencyMicros);
        SafeParcelWriter.writeLong(parcel, 3, networkqualityreport.mDurationMicros);
        SafeParcelWriter.writeLong(parcel, 4, networkqualityreport.mBytesDownloaded);
        SafeParcelWriter.writeLong(parcel, 5, networkqualityreport.mBytesUploaded);
        SafeParcelWriter.writeInt(parcel, 6, networkqualityreport.mMeasurementType);
        SafeParcelWriter.writeBundle(parcel, 7, networkqualityreport.mCustomParams, false);
        SafeParcelWriter.writeBoolean(parcel, 8, networkqualityreport.mIsNoConnectivity);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        long l2 = 0L;
        long l3 = 0L;
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
                    l3 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 4: // '\004'
                    l2 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 7: // '\007'
                    bundle = SafeParcelReader.createBundle(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new NetworkQualityReport(k, j, l3, l2, l1, i, bundle, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new NetworkQualityReport[i];
    }
}
