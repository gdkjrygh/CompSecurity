// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class PersonEntity_OrganizationsEntityCreator
    implements android.os.Parcelable.Creator
{

    public PersonEntity_OrganizationsEntityCreator()
    {
    }

    static void writeToParcel$1290ebf0(PersonEntity.OrganizationsEntity organizationsentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = organizationsentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, organizationsentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, organizationsentity.mDepartment, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, organizationsentity.mDescription, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, organizationsentity.mEndDate, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, organizationsentity.mLocation, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, organizationsentity.mName, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeBoolean(parcel, 7, organizationsentity.mPrimary);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeString(parcel, 8, organizationsentity.mStartDate, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeString(parcel, 9, organizationsentity.mTitle, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeInt(parcel, 10, organizationsentity.mType);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        String s1 = null;
        boolean flag = false;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s6 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s5 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s4 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s3 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s2 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    s1 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    i = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(10));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new PersonEntity.OrganizationsEntity(hashset, j, s6, s5, s4, s3, s2, flag, s1, s, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonEntity.OrganizationsEntity[i];
    }
}
