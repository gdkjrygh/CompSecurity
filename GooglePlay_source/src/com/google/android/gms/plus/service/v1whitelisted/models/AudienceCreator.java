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
//            Audience, PlusAclentryResourceEntity

public final class AudienceCreator
    implements android.os.Parcelable.Creator
{

    public AudienceCreator()
    {
    }

    static void writeToParcel(Audience audience, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = audience.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, audience.mVersionCode);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeParcelable(parcel, 3, audience.mItem, i, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, audience.mVisibility, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        PlusAclentryResourceEntity plusaclentryresourceentity = null;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 2: // '\002'
                case 4: // '\004'
                case 5: // '\005'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    plusaclentryresourceentity = (PlusAclentryResourceEntity)SafeParcelReader.createParcelable(parcel, k, PlusAclentryResourceEntity.CREATOR);
                    hashset.add(Integer.valueOf(3));
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
                return new Audience(hashset, i, plusaclentryresourceentity, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Audience[i];
    }
}
