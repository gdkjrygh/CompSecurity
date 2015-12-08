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
//            AclDetailsEntity, LoggedCircleEntity, LoggedCircleMemberEntity

public final class AclDetailsEntityCreator
    implements android.os.Parcelable.Creator
{

    public AclDetailsEntityCreator()
    {
    }

    static void writeToParcel$4513f3eb(AclDetailsEntity acldetailsentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = acldetailsentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, acldetailsentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeTypedList(parcel, 2, acldetailsentity.mCircle, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeTypedList(parcel, 4, acldetailsentity.mPerson, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeInt(parcel, 5, acldetailsentity.mPersonCount);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeInt(parcel, 6, acldetailsentity.mSelectedAlphabeticalIndividualCount);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeFloat(parcel, 7, acldetailsentity.mSelectedAlphabeticalIndividualCtr);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeInt(parcel, 8, acldetailsentity.mSelectedAvatarCount);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeFloat(parcel, 9, acldetailsentity.mSelectedAvatarCtr);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeInt(parcel, 10, acldetailsentity.mSelectedRankedIndividualCount);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeFloat(parcel, 11, acldetailsentity.mSelectedRankedIndividualCtr);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeInt(parcel, 13, acldetailsentity.mTotalAvatarCount);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeInt(parcel, 14, acldetailsentity.mTotalRankedIndividualCount);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int l1 = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int k1 = 0;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
        int j1 = 0;
        int i1 = 0;
        float f2 = 0.0F;
        int l = 0;
        float f1 = 0.0F;
        int k = 0;
        float f = 0.0F;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l1)
            {
                int i2 = parcel.readInt();
                switch (0xffff & i2)
                {
                case 3: // '\003'
                case 12: // '\f'
                default:
                    SafeParcelReader.skipUnknownField(parcel, i2);
                    break;

                case 1: // '\001'
                    k1 = SafeParcelReader.readInt(parcel, i2);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, i2, LoggedCircleEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createTypedList(parcel, i2, LoggedCircleMemberEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    j1 = SafeParcelReader.readInt(parcel, i2);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i1 = SafeParcelReader.readInt(parcel, i2);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    f2 = SafeParcelReader.readFloat(parcel, i2);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    l = SafeParcelReader.readInt(parcel, i2);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    f1 = SafeParcelReader.readFloat(parcel, i2);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    k = SafeParcelReader.readInt(parcel, i2);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    f = SafeParcelReader.readFloat(parcel, i2);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 13: // '\r'
                    j = SafeParcelReader.readInt(parcel, i2);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    i = SafeParcelReader.readInt(parcel, i2);
                    hashset.add(Integer.valueOf(14));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l1)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l1).toString(), parcel);
                }
                return new AclDetailsEntity(hashset, k1, arraylist1, arraylist, j1, i1, f2, l, f1, k, f, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AclDetailsEntity[i];
    }
}
