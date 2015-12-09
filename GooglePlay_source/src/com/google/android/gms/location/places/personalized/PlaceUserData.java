// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceUserDataCreator

public class PlaceUserData
    implements SafeParcelable
{

    public static final PlaceUserDataCreator CREATOR = new PlaceUserDataCreator();
    final String mAccountName;
    final List mPlaceAliases;
    final String mPlaceId;
    final int mVersionCode;

    PlaceUserData(int i, String s, String s1, List list)
    {
        mVersionCode = i;
        mAccountName = s;
        mPlaceId = s1;
        mPlaceAliases = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceUserData))
            {
                return false;
            }
            obj = (PlaceUserData)obj;
            if (!mAccountName.equals(((PlaceUserData) (obj)).mAccountName) || !mPlaceId.equals(((PlaceUserData) (obj)).mPlaceId) || !mPlaceAliases.equals(((PlaceUserData) (obj)).mPlaceAliases))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mAccountName, mPlaceId, mPlaceAliases
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("accountName", mAccountName).add("placeId", mPlaceId).add("placeAliases", mPlaceAliases).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlaceUserDataCreator.writeToParcel$328ccc6e(this, parcel);
    }

}
