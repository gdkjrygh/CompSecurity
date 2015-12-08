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
//            ClientAclDetailsEntity, ClientLoggedCircleEntity, ClientLoggedCircleMemberEntity

public final class ClientAclDetailsEntityCreator
    implements android.os.Parcelable.Creator
{

    public ClientAclDetailsEntityCreator()
    {
    }

    static void writeToParcel$12494460(ClientAclDetailsEntity clientacldetailsentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = clientacldetailsentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, clientacldetailsentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeTypedList(parcel, 2, clientacldetailsentity.mCircle, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeTypedList(parcel, 4, clientacldetailsentity.mPerson, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeStringList(parcel, 5, clientacldetailsentity.mSystemGroup, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    arraylist2 = SafeParcelReader.createTypedList(parcel, k, ClientLoggedCircleEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, ClientLoggedCircleMemberEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ClientAclDetailsEntity(hashset, i, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ClientAclDetailsEntity[i];
    }
}
