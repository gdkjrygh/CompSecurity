// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GetAndAdvanceOtpCounterResponse

public final class GetAndAdvanceOtpCounterResponseCreator
    implements android.os.Parcelable.Creator
{

    public GetAndAdvanceOtpCounterResponseCreator()
    {
    }

    static void writeToParcel$4804b059(GetAndAdvanceOtpCounterResponse getandadvanceotpcounterresponse, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, getandadvanceotpcounterresponse.mVersion);
        SafeParcelWriter.writeLongObject$53422a(parcel, 2, getandadvanceotpcounterresponse.counter);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        Long long1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    long1 = SafeParcelReader.readLongObject(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GetAndAdvanceOtpCounterResponse(i, long1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GetAndAdvanceOtpCounterResponse[i];
    }
}
