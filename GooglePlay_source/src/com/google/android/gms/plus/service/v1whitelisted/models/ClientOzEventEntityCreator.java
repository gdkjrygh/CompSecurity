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
//            ClientOzEventEntity, ClientActionDataEntity, OzEventEntity

public final class ClientOzEventEntityCreator
    implements android.os.Parcelable.Creator
{

    public ClientOzEventEntityCreator()
    {
    }

    static void writeToParcel(ClientOzEventEntity clientozevententity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = clientozevententity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, clientozevententity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, clientozevententity.mActionData, i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeLong(parcel, 3, clientozevententity.mClientTimeMsec);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeParcelable(parcel, 5, clientozevententity.mOzEvent, i, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        OzEventEntity ozevententity = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        long l = 0L;
        ClientActionDataEntity clientactiondataentity = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 4: // '\004'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    clientactiondataentity = (ClientActionDataEntity)SafeParcelReader.createParcelable(parcel, k, ClientActionDataEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    l = SafeParcelReader.readLong(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 5: // '\005'
                    ozevententity = (OzEventEntity)SafeParcelReader.createParcelable(parcel, k, OzEventEntity.CREATOR);
                    hashset.add(Integer.valueOf(5));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ClientOzEventEntity(hashset, i, clientactiondataentity, l, ozevententity);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ClientOzEventEntity[i];
    }
}
