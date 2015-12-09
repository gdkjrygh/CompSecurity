// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceAliasResultCreator, PlaceUserData

public class PlaceAliasResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PlaceAliasResultCreator();
    final PlaceUserData mPlaceUserData;
    final Status mStatus;
    final int mVersionCode;

    PlaceAliasResult(int i, Status status, PlaceUserData placeuserdata)
    {
        mVersionCode = i;
        mStatus = status;
        mPlaceUserData = placeuserdata;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlaceAliasResultCreator.writeToParcel(this, parcel, i);
    }

}
