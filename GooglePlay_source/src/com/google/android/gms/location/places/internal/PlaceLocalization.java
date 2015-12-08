// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLocalizationCreator

public final class PlaceLocalization
    implements SafeParcelable
{

    public static final PlaceLocalizationCreator CREATOR = new PlaceLocalizationCreator();
    public final String address;
    public final List attributions;
    public final String internationalPhoneNumber;
    public final String name;
    public final String regularOpenHours;
    public final int versionCode;

    public PlaceLocalization(int i, String s, String s1, String s2, String s3, List list)
    {
        versionCode = i;
        name = s;
        address = s1;
        internationalPhoneNumber = s2;
        regularOpenHours = s3;
        attributions = list;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLocalization))
            {
                return false;
            }
            obj = (PlaceLocalization)obj;
            if (!Objects.equal(name, ((PlaceLocalization) (obj)).name) || !Objects.equal(address, ((PlaceLocalization) (obj)).address) || !Objects.equal(internationalPhoneNumber, ((PlaceLocalization) (obj)).internationalPhoneNumber) || !Objects.equal(regularOpenHours, ((PlaceLocalization) (obj)).regularOpenHours) || !Objects.equal(attributions, ((PlaceLocalization) (obj)).attributions))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            name, address, internationalPhoneNumber, regularOpenHours
        });
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("name", name).add("address", address).add("internationalPhoneNumber", internationalPhoneNumber).add("regularOpenHours", regularOpenHours).add("attributions", attributions).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PlaceLocalizationCreator.writeToParcel$34e571bf(this, parcel);
    }

}
