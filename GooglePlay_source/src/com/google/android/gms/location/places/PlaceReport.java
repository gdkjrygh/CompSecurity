// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceReportCreator

public class PlaceReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PlaceReportCreator();
    final String mPlaceId;
    final String mSource;
    final String mTag;
    final int mVersionCode;

    PlaceReport(int i, String s, String s1, String s2)
    {
        mVersionCode = i;
        mPlaceId = s;
        mTag = s1;
        mSource = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlaceReport)
        {
            if (Objects.equal(mPlaceId, ((PlaceReport) (obj = (PlaceReport)obj)).mPlaceId) && Objects.equal(mTag, ((PlaceReport) (obj)).mTag) && Objects.equal(mSource, ((PlaceReport) (obj)).mSource))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mPlaceId, mTag, mSource
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this);
        tostringhelper.add("placeId", mPlaceId);
        tostringhelper.add("tag", mTag);
        if (!"unknown".equals(mSource))
        {
            tostringhelper.add("source", mSource);
        }
        return tostringhelper.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlaceReportCreator.writeToParcel$486e8772(this, parcel);
    }

}
