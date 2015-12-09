// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaLocation, StreetViewPanoramaLink, LatLng

public final class StreetViewPanoramaLocationCreator
    implements android.os.Parcelable.Creator
{

    public StreetViewPanoramaLocationCreator()
    {
    }

    static void writeToParcel(StreetViewPanoramaLocation streetviewpanoramalocation, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, streetviewpanoramalocation.mVersionCode);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 2, streetviewpanoramalocation.links, i);
        SafeParcelWriter.writeParcelable(parcel, 3, streetviewpanoramalocation.position, i, false);
        SafeParcelWriter.writeString(parcel, 4, streetviewpanoramalocation.panoId, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        LatLng latlng = null;
        StreetViewPanoramaLink astreetviewpanoramalink[] = null;
        int i = 0;
        String s = null;
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
                    astreetviewpanoramalink = (StreetViewPanoramaLink[])SafeParcelReader.createTypedArray(parcel, k, StreetViewPanoramaLink.CREATOR);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)SafeParcelReader.createParcelable(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLocation(i, astreetviewpanoramalink, latlng, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StreetViewPanoramaLocation[i];
    }
}
