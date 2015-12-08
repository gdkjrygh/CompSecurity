// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertRequest, PlaceFilter, NearbyAlertFilter

public final class NearbyAlertRequestCreator
    implements android.os.Parcelable.Creator
{

    public NearbyAlertRequestCreator()
    {
    }

    static void writeToParcel(NearbyAlertRequest nearbyalertrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, nearbyalertrequest.mTransitionTypes);
        SafeParcelWriter.writeInt(parcel, 1000, nearbyalertrequest.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, nearbyalertrequest.mLoiteringTimeMillis);
        SafeParcelWriter.writeParcelable(parcel, 3, NearbyAlertRequest.getFilter(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, nearbyalertrequest.mNearbyAlertFilter, i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, nearbyalertrequest.mIsDebugInfoRequested);
        SafeParcelWriter.writeInt(parcel, 6, nearbyalertrequest.mRadiusType);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        NearbyAlertFilter nearbyalertfilter = null;
        int i = 0;
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int j = -1;
        boolean flag = false;
        PlaceFilter placefilter = null;
        int k = 0;
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
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 1000: 
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 3: // '\003'
                    placefilter = (PlaceFilter)SafeParcelReader.createParcelable(parcel, j1, PlaceFilter.CREATOR);
                    break;

                case 4: // '\004'
                    nearbyalertfilter = (NearbyAlertFilter)SafeParcelReader.createParcelable(parcel, j1, NearbyAlertFilter.CREATOR);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new NearbyAlertRequest(l, k, j, placefilter, nearbyalertfilter, flag, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new NearbyAlertRequest[i];
    }
}
