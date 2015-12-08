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
//            ClientLoggedRhsComponentItemEntity, ClientLoggedCircleEntity, ClientLoggedCircleMemberEntity

public final class ClientLoggedRhsComponentItemEntityCreator
    implements android.os.Parcelable.Creator
{

    public ClientLoggedRhsComponentItemEntityCreator()
    {
    }

    static void writeToParcel$7dd98243(ClientLoggedRhsComponentItemEntity clientloggedrhscomponentitementity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = clientloggedrhscomponentitementity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, clientloggedrhscomponentitementity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeTypedList(parcel, 2, clientloggedrhscomponentitementity.mCircle, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeTypedList(parcel, 9, clientloggedrhscomponentitementity.mPerson, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist1 = null;
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

                case 2: // '\002'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, ClientLoggedCircleEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 9: // '\t'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, ClientLoggedCircleMemberEntity.CREATOR);
                    hashset.add(Integer.valueOf(9));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ClientLoggedRhsComponentItemEntity(hashset, i, arraylist, arraylist1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ClientLoggedRhsComponentItemEntity[i];
    }
}
