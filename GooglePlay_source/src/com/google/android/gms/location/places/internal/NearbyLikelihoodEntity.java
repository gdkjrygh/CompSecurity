// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.NearbyLikelihood;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            NearbyLikelihoodEntityCreator, PlaceImpl

public class NearbyLikelihoodEntity
    implements SafeParcelable, NearbyLikelihood
{

    public static final android.os.Parcelable.Creator CREATOR = new NearbyLikelihoodEntityCreator();
    final float mLikelihood;
    final PlaceImpl mPlace;
    final int mVersionCode;

    NearbyLikelihoodEntity(int i, PlaceImpl placeimpl, float f)
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
            if (!(obj instanceof NearbyLikelihoodEntity))
            {
                return false;
            }
            obj = (NearbyLikelihoodEntity)obj;
            if (!mPlace.equals(((NearbyLikelihoodEntity) (obj)).mPlace) || mLikelihood != ((NearbyLikelihoodEntity) (obj)).mLikelihood)
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
        return Objects.toStringHelper(this).add("nearby place", mPlace).add("likelihood", Float.valueOf(mLikelihood)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NearbyLikelihoodEntityCreator.writeToParcel(this, parcel, i);
    }

}
