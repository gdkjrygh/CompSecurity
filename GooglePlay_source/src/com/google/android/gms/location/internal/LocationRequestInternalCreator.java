// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal, ClientIdentity

public final class LocationRequestInternalCreator
    implements android.os.Parcelable.Creator
{

    public LocationRequestInternalCreator()
    {
    }

    static void writeToParcel(LocationRequestInternal locationrequestinternal, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, locationrequestinternal.mLocationRequest, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, locationrequestinternal.mVersionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, locationrequestinternal.mRequestNlpDebugInfo);
        SafeParcelWriter.writeBoolean(parcel, 3, locationrequestinternal.mRestorePendingIntentListeners);
        SafeParcelWriter.writeBoolean(parcel, 4, locationrequestinternal.mTriggerUpdate);
        SafeParcelWriter.writeTypedList(parcel, 5, locationrequestinternal.mClients, false);
        SafeParcelWriter.writeString(parcel, 6, locationrequestinternal.mTag, false);
        SafeParcelWriter.writeBoolean(parcel, 7, locationrequestinternal.mHideFromAppOps);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag1 = true;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        Object obj = LocationRequestInternal.DEFAULT_CLIENTS;
        boolean flag2 = true;
        boolean flag3 = false;
        LocationRequest locationrequest = null;
        int i = 0;
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
                    locationrequest = (LocationRequest)SafeParcelReader.createParcelable(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    flag3 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    obj = SafeParcelReader.createTypedList(parcel, k, ClientIdentity.CREATOR);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationRequestInternal(i, locationrequest, flag3, flag2, flag1, ((java.util.List) (obj)), s, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocationRequestInternal[i];
    }
}
