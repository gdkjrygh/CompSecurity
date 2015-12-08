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
//            ClientLoggedRhsComponentEntity, ClientLoggedRhsComponentItemEntity

public final class ClientLoggedRhsComponentEntityCreator
    implements android.os.Parcelable.Creator
{

    public ClientLoggedRhsComponentEntityCreator()
    {
    }

    static void writeToParcel$ec95616(ClientLoggedRhsComponentEntity clientloggedrhscomponententity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = clientloggedrhscomponententity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, clientloggedrhscomponententity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeTypedList(parcel, 5, clientloggedrhscomponententity.mItem, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        java.util.ArrayList arraylist = null;
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

                case 5: // '\005'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, ClientLoggedRhsComponentItemEntity.CREATOR);
                    hashset.add(Integer.valueOf(5));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ClientLoggedRhsComponentEntity(hashset, i, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ClientLoggedRhsComponentEntity[i];
    }
}
