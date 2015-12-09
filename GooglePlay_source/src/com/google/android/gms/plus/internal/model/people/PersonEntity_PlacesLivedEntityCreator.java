// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class PersonEntity_PlacesLivedEntityCreator
    implements android.os.Parcelable.Creator
{

    public PersonEntity_PlacesLivedEntityCreator()
    {
    }

    static void writeToParcel$2d65ad9c(PersonEntity.PlacesLivedEntity placeslivedentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = placeslivedentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, placeslivedentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeBoolean(parcel, 2, placeslivedentity.mPrimary);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, placeslivedentity.mValue, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int i = 0;
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
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new PersonEntity.PlacesLivedEntity(hashset, i, flag, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonEntity.PlacesLivedEntity[i];
    }
}
