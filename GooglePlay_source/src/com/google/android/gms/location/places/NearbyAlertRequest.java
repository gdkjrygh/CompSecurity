// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertRequestCreator, PlaceFilter, NearbyAlertFilter

public final class NearbyAlertRequest
    implements SafeParcelable
{

    public static final NearbyAlertRequestCreator CREATOR = new NearbyAlertRequestCreator();
    final boolean mIsDebugInfoRequested;
    final int mLoiteringTimeMillis;
    final NearbyAlertFilter mNearbyAlertFilter;
    private final PlaceFilter mPlaceFilter = null;
    final int mRadiusType;
    final int mTransitionTypes;
    final int mVersionCode;

    NearbyAlertRequest(int i, int j, int k, PlaceFilter placefilter, NearbyAlertFilter nearbyalertfilter, boolean flag, int l)
    {
        mVersionCode = i;
        mTransitionTypes = j;
        mLoiteringTimeMillis = k;
        mIsDebugInfoRequested = flag;
        if (nearbyalertfilter != null)
        {
            mNearbyAlertFilter = nearbyalertfilter;
        } else
        if (placefilter != null)
        {
            if (placefilter.mPlaceIds != null && !placefilter.mPlaceIds.isEmpty())
            {
                mNearbyAlertFilter = NearbyAlertFilter.createNearbyAlertFilterWithPlaceIds(placefilter.mPlaceIds);
            } else
            if (placefilter.mPlaceTypes != null && !placefilter.mPlaceTypes.isEmpty())
            {
                mNearbyAlertFilter = NearbyAlertFilter.createNearbyAlertFilterWithPlaceTypes(placefilter.mPlaceTypes);
            } else
            {
                mNearbyAlertFilter = null;
            }
        } else
        {
            mNearbyAlertFilter = null;
        }
        mRadiusType = l;
    }

    public static PlaceFilter getFilter()
    {
        return null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyAlertRequest))
            {
                return false;
            }
            obj = (NearbyAlertRequest)obj;
            if (mTransitionTypes != ((NearbyAlertRequest) (obj)).mTransitionTypes || mLoiteringTimeMillis != ((NearbyAlertRequest) (obj)).mLoiteringTimeMillis || !Objects.equal(null, null) || !Objects.equal(mNearbyAlertFilter, ((NearbyAlertRequest) (obj)).mNearbyAlertFilter))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mTransitionTypes), Integer.valueOf(mLoiteringTimeMillis)
        });
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("transitionTypes", Integer.valueOf(mTransitionTypes)).add("loiteringTimeMillis", Integer.valueOf(mLoiteringTimeMillis)).add("nearbyAlertFilter", mNearbyAlertFilter).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        NearbyAlertRequestCreator.writeToParcel(this, parcel, i);
    }

}
