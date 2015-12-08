// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConnectedCapabilitiesResponse, CapabilityInfoParcelable

public final class GetConnectedCapabilitiesResponseCreator
    implements android.os.Parcelable.Creator
{

    public GetConnectedCapabilitiesResponseCreator()
    {
    }

    static void writeToParcel$6a1c8e72(GetConnectedCapabilitiesResponse getconnectedcapabilitiesresponse, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, getconnectedcapabilitiesresponse.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, getconnectedcapabilitiesresponse.statusCode);
        SafeParcelWriter.writeTypedList(parcel, 3, getconnectedcapabilitiesresponse.capabilities, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, CapabilityInfoParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetConnectedCapabilitiesResponse(i, j, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GetConnectedCapabilitiesResponse[i];
    }
}
