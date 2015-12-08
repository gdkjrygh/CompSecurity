// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            AbstractPlaceFilter, NearbyAlertFilterCreator

public final class NearbyAlertFilter extends AbstractPlaceFilter
    implements SafeParcelable
{

    public static final NearbyAlertFilterCreator CREATOR = new NearbyAlertFilterCreator();
    private final Set mPlaceIds;
    final List mPlaceIdsList;
    private final Set mPlaceTypes;
    final List mPlaceTypesList;
    private final Set mRequestedUserDataTypes;
    final List mRequestedUserDataTypesList;
    final int mVersionCode;

    NearbyAlertFilter(int i, List list, List list1, List list2)
    {
        mVersionCode = i;
        if (list1 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list1);
        }
        mPlaceTypesList = list1;
        if (list2 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list2);
        }
        mRequestedUserDataTypesList = list1;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        mPlaceIdsList = list;
        mPlaceTypes = toSet(mPlaceTypesList);
        mRequestedUserDataTypes = toSet(mRequestedUserDataTypesList);
        mPlaceIds = toSet(mPlaceIdsList);
    }

    public static NearbyAlertFilter createNearbyAlertFilterWithPlaceIds(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace ID to match results with.");
        } else
        {
            return new NearbyAlertFilter(0, toList(collection), null, null);
        }
    }

    public static NearbyAlertFilter createNearbyAlertFilterWithPlaceTypes(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace type to match results with.");
        } else
        {
            return new NearbyAlertFilter(0, null, toList(collection), null);
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyAlertFilter))
            {
                return false;
            }
            obj = (NearbyAlertFilter)obj;
            if (!mPlaceTypes.equals(((NearbyAlertFilter) (obj)).mPlaceTypes) || !mRequestedUserDataTypes.equals(((NearbyAlertFilter) (obj)).mRequestedUserDataTypes) || !mPlaceIds.equals(((NearbyAlertFilter) (obj)).mPlaceIds))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mPlaceTypes, mRequestedUserDataTypes, mPlaceIds
        });
    }

    public final String toString()
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this);
        if (!mPlaceTypes.isEmpty())
        {
            tostringhelper.add("types", mPlaceTypes);
        }
        if (!mPlaceIds.isEmpty())
        {
            tostringhelper.add("placeIds", mPlaceIds);
        }
        if (!mRequestedUserDataTypes.isEmpty())
        {
            tostringhelper.add("requestedUserDataTypes", mRequestedUserDataTypes);
        }
        return tostringhelper.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        NearbyAlertFilterCreator.writeToParcel$53f94818(this, parcel);
    }

}
