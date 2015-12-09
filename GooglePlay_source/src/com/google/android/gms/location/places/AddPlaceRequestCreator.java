// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.location.places:
//            AddPlaceRequest

public final class AddPlaceRequestCreator
    implements android.os.Parcelable.Creator
{

    public AddPlaceRequestCreator()
    {
    }

    static void writeToParcel(AddPlaceRequest addplacerequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, addplacerequest.mName, false);
        SafeParcelWriter.writeInt(parcel, 1000, addplacerequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, addplacerequest.mLatLng, i, false);
        SafeParcelWriter.writeString(parcel, 3, addplacerequest.mAddress, false);
        SafeParcelWriter.writeIntegerList$62107c48(parcel, 4, addplacerequest.mPlaceTypes);
        SafeParcelWriter.writeString(parcel, 5, addplacerequest.mPhoneNumber, false);
        SafeParcelWriter.writeParcelable(parcel, 6, addplacerequest.mWebsiteUri, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        java.util.ArrayList arraylist = null;
        String s1 = null;
        LatLng latlng = null;
        String s2 = null;
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
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)SafeParcelReader.createParcelable(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createIntegerList(parcel, k);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AddPlaceRequest(i, s2, latlng, s1, arraylist, s, uri);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AddPlaceRequest[i];
    }
}
