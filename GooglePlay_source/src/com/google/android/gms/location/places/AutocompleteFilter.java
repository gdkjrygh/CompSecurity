// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            AutocompleteFilterCreator

public class AutocompleteFilter
    implements SafeParcelable
{

    public static final AutocompleteFilterCreator CREATOR = new AutocompleteFilterCreator();
    private final Set mPlaceTypes;
    final List mPlaceTypesList;
    final boolean mRestrictedToPlaces;
    final int mVersionCode;

    AutocompleteFilter(int i, boolean flag, Collection collection)
    {
        mVersionCode = i;
        mRestrictedToPlaces = flag;
        if (collection == null)
        {
            collection = Collections.emptyList();
        } else
        {
            collection = new ArrayList(collection);
        }
        mPlaceTypesList = collection;
        if (mPlaceTypesList.isEmpty())
        {
            mPlaceTypes = Collections.emptySet();
            return;
        } else
        {
            mPlaceTypes = Collections.unmodifiableSet(new HashSet(mPlaceTypesList));
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AutocompleteFilter))
            {
                return false;
            }
            obj = (AutocompleteFilter)obj;
            if (!mPlaceTypes.equals(((AutocompleteFilter) (obj)).mPlaceTypes) || mRestrictedToPlaces != ((AutocompleteFilter) (obj)).mRestrictedToPlaces)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Boolean.valueOf(mRestrictedToPlaces), mPlaceTypes
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this);
        if (!mRestrictedToPlaces)
        {
            tostringhelper.add("restrictedToPlaces", Boolean.valueOf(mRestrictedToPlaces));
        }
        tostringhelper.add("placeTypes", mPlaceTypes);
        return tostringhelper.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AutocompleteFilterCreator.writeToParcel$121d2c51(this, parcel);
    }

}
