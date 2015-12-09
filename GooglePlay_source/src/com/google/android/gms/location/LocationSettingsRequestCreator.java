// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsRequest, LocationRequest

public final class LocationSettingsRequestCreator
    implements android.os.Parcelable.Creator
{

    public LocationSettingsRequestCreator()
    {
    }

    static void writeToParcel$3b05d9e5(LocationSettingsRequest locationsettingsrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(locationsettingsrequest.mLocationRequests), false);
        SafeParcelWriter.writeInt(parcel, 1000, locationsettingsrequest.mVersionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, locationsettingsrequest.mAlwaysShow);
        SafeParcelWriter.writeBoolean(parcel, 3, locationsettingsrequest.mNeedBle);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        boolean flag = false;
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
                    arraylist = SafeParcelReader.createTypedList(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsRequest(i, arraylist, flag, flag1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocationSettingsRequest[i];
    }
}
