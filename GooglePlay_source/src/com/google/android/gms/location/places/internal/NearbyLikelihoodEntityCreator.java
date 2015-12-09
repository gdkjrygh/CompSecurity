// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            NearbyLikelihoodEntity, PlaceImpl

public final class NearbyLikelihoodEntityCreator
    implements android.os.Parcelable.Creator
{

    public NearbyLikelihoodEntityCreator()
    {
    }

    static void writeToParcel(NearbyLikelihoodEntity nearbylikelihoodentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, nearbylikelihoodentity.mPlace, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, nearbylikelihoodentity.mVersionCode);
        SafeParcelWriter.writeFloat(parcel, 2, nearbylikelihoodentity.mLikelihood);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        PlaceImpl placeimpl = null;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    placeimpl = (PlaceImpl)SafeParcelReader.createParcelable(parcel, k, PlaceImpl.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    f = SafeParcelReader.readFloat(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new NearbyLikelihoodEntity(i, placeimpl, f);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new NearbyLikelihoodEntity[i];
    }
}
