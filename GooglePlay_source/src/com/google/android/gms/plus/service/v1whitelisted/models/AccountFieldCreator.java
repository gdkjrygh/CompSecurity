// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            AccountField

public final class AccountFieldCreator
    implements android.os.Parcelable.Creator
{

    public AccountFieldCreator()
    {
    }

    static void writeToParcel(AccountField accountfield, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = accountfield.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, accountfield.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeTypedList(parcel, 2, accountfield.mErrors, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeBoolean(parcel, 3, accountfield.mHidden);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, accountfield.mId, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeParcelable(parcel, 6, accountfield.mLabel, i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeBoolean(parcel, 7, accountfield.mMandatory);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeTypedList(parcel, 8, accountfield.mOptions, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeString(parcel, 9, accountfield.mType, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeParcelable(parcel, 10, accountfield.mValue, i, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeString(parcel, 11, accountfield.mVersion, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        AccountField.ValueEntity valueentity = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        AccountField.LabelEntity labelentity = null;
        String s2 = null;
        boolean flag1 = false;
        java.util.ArrayList arraylist1 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 5: // '\005'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, AccountField.ErrorsEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 6: // '\006'
                    labelentity = (AccountField.LabelEntity)SafeParcelReader.createParcelable(parcel, k, AccountField.LabelEntity.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, AccountField.OptionsEntity.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    valueentity = (AccountField.ValueEntity)SafeParcelReader.createParcelable(parcel, k, AccountField.ValueEntity.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(11));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new AccountField(hashset, i, arraylist1, flag1, s2, labelentity, flag, arraylist, s1, valueentity, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountField[i];
    }
}
