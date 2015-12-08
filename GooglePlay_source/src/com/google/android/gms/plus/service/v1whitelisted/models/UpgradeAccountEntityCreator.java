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
//            UpgradeAccountEntity

public final class UpgradeAccountEntityCreator
    implements android.os.Parcelable.Creator
{

    public UpgradeAccountEntityCreator()
    {
    }

    static void writeToParcel(UpgradeAccountEntity upgradeaccountentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = upgradeaccountentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, upgradeaccountentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, upgradeaccountentity.mDescription, i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeParcelable(parcel, 4, upgradeaccountentity.mForm, i, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, upgradeaccountentity.mState, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        UpgradeAccountEntity.FormEntity formentity = null;
        UpgradeAccountEntity.DescriptionEntity descriptionentity = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                case 5: // '\005'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    descriptionentity = (UpgradeAccountEntity.DescriptionEntity)SafeParcelReader.createParcelable(parcel, k, UpgradeAccountEntity.DescriptionEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    formentity = (UpgradeAccountEntity.FormEntity)SafeParcelReader.createParcelable(parcel, k, UpgradeAccountEntity.FormEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
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
                return new UpgradeAccountEntity(hashset, i, descriptionentity, formentity, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UpgradeAccountEntity[i];
    }
}
