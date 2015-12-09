// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class PersonEntity_CoverEntity_CoverPhotoEntityCreator
    implements android.os.Parcelable.Creator
{

    public PersonEntity_CoverEntity_CoverPhotoEntityCreator()
    {
    }

    static void writeToParcel$342dbb01(PersonEntity.CoverEntity.CoverPhotoEntity coverphotoentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = coverphotoentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, coverphotoentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeInt(parcel, 2, coverphotoentity.mHeight);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, coverphotoentity.mUrl, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeInt(parcel, 4, coverphotoentity.mWidth);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    k = SafeParcelReader.readInt(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, i1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
                }
                return new PersonEntity.CoverEntity.CoverPhotoEntity(hashset, k, j, s, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonEntity.CoverEntity.CoverPhotoEntity[i];
    }
}
