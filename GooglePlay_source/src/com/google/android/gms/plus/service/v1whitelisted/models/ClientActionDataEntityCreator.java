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
//            ClientActionDataEntity, ClientAclDetailsEntity, ClientLoggedRhsComponentEntity, ClientLoggedCircleEntity, 
//            ClientLoggedCircleMemberEntity

public final class ClientActionDataEntityCreator
    implements android.os.Parcelable.Creator
{

    public ClientActionDataEntityCreator()
    {
    }

    static void writeToParcel(ClientActionDataEntity clientactiondataentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = clientactiondataentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, clientactiondataentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, clientactiondataentity.mAclDetails, i, true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            SafeParcelWriter.writeParcelable(parcel, 20, clientactiondataentity.mRhsComponent, i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeTypedList(parcel, 7, clientactiondataentity.mCircle, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeTypedList(parcel, 8, clientactiondataentity.mCircleMember, true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeStringList(parcel, 13, clientactiondataentity.mObfuscatedGaiaId, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        ClientLoggedRhsComponentEntity clientloggedrhscomponententity = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        java.util.ArrayList arraylist = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
        ClientAclDetailsEntity clientacldetailsentity = null;
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
                    clientacldetailsentity = (ClientAclDetailsEntity)SafeParcelReader.createParcelable(parcel, k, ClientAclDetailsEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 20: // '\024'
                    clientloggedrhscomponententity = (ClientLoggedRhsComponentEntity)SafeParcelReader.createParcelable(parcel, k, ClientLoggedRhsComponentEntity.CREATOR);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 7: // '\007'
                    arraylist2 = SafeParcelReader.createTypedList(parcel, k, ClientLoggedCircleEntity.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, ClientLoggedCircleMemberEntity.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 13: // '\r'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(13));
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ClientActionDataEntity(hashset, i, clientacldetailsentity, arraylist2, arraylist1, arraylist, clientloggedrhscomponententity);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ClientActionDataEntity[i];
    }
}
