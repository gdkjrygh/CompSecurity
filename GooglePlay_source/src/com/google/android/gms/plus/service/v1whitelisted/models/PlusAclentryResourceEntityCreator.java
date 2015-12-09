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
//            PlusAclentryResourceEntity

public final class PlusAclentryResourceEntityCreator
    implements android.os.Parcelable.Creator
{

    public PlusAclentryResourceEntityCreator()
    {
    }

    static void writeToParcel$6a27d4cd(PlusAclentryResourceEntity plusaclentryresourceentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = plusaclentryresourceentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, plusaclentryresourceentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, plusaclentryresourceentity.mDisplayName, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, plusaclentryresourceentity.mId, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, plusaclentryresourceentity.mType, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s1 = null;
        String s2 = null;
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
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new PlusAclentryResourceEntity(hashset, i, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlusAclentryResourceEntity[i];
    }
}
