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
//            AbstractPlaceFilter, PlaceFilterCreator

public final class PlaceFilter extends AbstractPlaceFilter
    implements SafeParcelable
{

    public static final PlaceFilterCreator CREATOR = new PlaceFilterCreator();
    final Set mPlaceIds;
    final List mPlaceIdsList;
    final Set mPlaceTypes;
    final List mPlaceTypesList;
    private final Set mRequestedUserDataTypes;
    final List mRequestedUserDataTypesList;
    final boolean mRequireOpenNow;
    final int mVersionCode;

    public PlaceFilter()
    {
        this((byte)0);
    }

    private PlaceFilter(byte byte0)
    {
        this(false, null);
    }

    PlaceFilter(int i, List list, boolean flag, List list1, List list2)
    {
        mVersionCode = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        mPlaceTypesList = list;
        mRequireOpenNow = flag;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        mRequestedUserDataTypesList = list;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        mPlaceIdsList = list;
        mPlaceTypes = toSet(mPlaceTypesList);
        mRequestedUserDataTypes = toSet(mRequestedUserDataTypesList);
        mPlaceIds = toSet(mPlaceIdsList);
    }

    private PlaceFilter(boolean flag, Collection collection)
    {
        this(0, toList(null), false, toList(null), toList(null));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceFilter))
            {
                return false;
            }
            obj = (PlaceFilter)obj;
            if (!mPlaceTypes.equals(((PlaceFilter) (obj)).mPlaceTypes) || mRequireOpenNow != ((PlaceFilter) (obj)).mRequireOpenNow || !mRequestedUserDataTypes.equals(((PlaceFilter) (obj)).mRequestedUserDataTypes) || !mPlaceIds.equals(((PlaceFilter) (obj)).mPlaceIds))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mPlaceTypes, Boolean.valueOf(mRequireOpenNow), mRequestedUserDataTypes, mPlaceIds
        });
    }

    public final String toString()
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this);
        if (!mPlaceTypes.isEmpty())
        {
            tostringhelper.add("types", mPlaceTypes);
        }
        tostringhelper.add("requireOpenNow", Boolean.valueOf(mRequireOpenNow));
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
        PlaceFilterCreator.writeToParcel$6e88bb52(this, parcel);
    }

}
