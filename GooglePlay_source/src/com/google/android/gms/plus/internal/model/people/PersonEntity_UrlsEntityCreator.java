// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class PersonEntity_UrlsEntityCreator
    implements android.os.Parcelable.Creator
{

    public PersonEntity_UrlsEntityCreator()
    {
    }

    static void writeToParcel$b21cc82(PersonEntity.UrlsEntity urlsentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = urlsentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, urlsentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeInt(parcel, 3, PersonEntity.UrlsEntity.getType_DEPRECATED_FENACHO());
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, urlsentity.mValue, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, urlsentity.mLabel, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeInt(parcel, 6, urlsentity.mType);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 2: // '\002'
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new PersonEntity.UrlsEntity(hashset, j, s1, i, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonEntity.UrlsEntity[i];
    }
}
