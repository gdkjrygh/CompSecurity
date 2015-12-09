// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.PlaceLikelihood;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLikelihoodEntityCreator, PlaceImpl

public class PlaceLikelihoodEntity
    implements SafeParcelable, PlaceLikelihood
{

    public static final android.os.Parcelable.Creator CREATOR = new PlaceLikelihoodEntityCreator();
    final float mLikelihood;
    final PlaceImpl mPlace;
    final int mVersionCode;

    PlaceLikelihoodEntity(int i, PlaceImpl placeimpl, float f)
    {
        mVersionCode = i;
        mPlace = placeimpl;
        mLikelihood = f;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLikelihoodEntity))
            {
                return false;
            }
            obj = (PlaceLikelihoodEntity)obj;
            if (!mPlace.equals(((PlaceLikelihoodEntity) (obj)).mPlace) || mLikelihood != ((PlaceLikelihoodEntity) (obj)).mLikelihood)
            {
                return false;
            }
        }
        return true;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mPlace, Float.valueOf(mLikelihood)
        });
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("place", mPlace).add("likelihood", Float.valueOf(mLikelihood)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlaceLikelihoodEntityCreator.writeToParcel(this, parcel, i);
    }

}
