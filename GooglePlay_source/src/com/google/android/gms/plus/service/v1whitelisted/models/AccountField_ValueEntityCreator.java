// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class AccountField_ValueEntityCreator
    implements android.os.Parcelable.Creator
{

    public AccountField_ValueEntityCreator()
    {
    }

    static void writeToParcel(AccountField.ValueEntity valueentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = valueentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, valueentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeBoolean(parcel, 2, valueentity.mCheck);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, valueentity.mDate, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeParcelable(parcel, 4, valueentity.mName, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, valueentity.mOption, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, valueentity.mString, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        String s1 = null;
        AccountField.ValueEntity.NameEntity nameentity = null;
        String s2 = null;
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
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    nameentity = (AccountField.ValueEntity.NameEntity)SafeParcelReader.createParcelable(parcel, k, AccountField.ValueEntity.NameEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new AccountField.ValueEntity(hashset, i, flag, s2, nameentity, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountField.ValueEntity[i];
    }
}
