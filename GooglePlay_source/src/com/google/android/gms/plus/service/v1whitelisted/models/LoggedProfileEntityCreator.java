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
//            LoggedProfileEntity, LoggedContactDataEntity

public final class LoggedProfileEntityCreator
    implements android.os.Parcelable.Creator
{

    public LoggedProfileEntityCreator()
    {
    }

    static void writeToParcel(LoggedProfileEntity loggedprofileentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = loggedprofileentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, loggedprofileentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeParcelable(parcel, 3, loggedprofileentity.mContactData, i, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        LoggedContactDataEntity loggedcontactdataentity = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 2: // '\002'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    loggedcontactdataentity = (LoggedContactDataEntity)SafeParcelReader.createParcelable(parcel, k, LoggedContactDataEntity.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new LoggedProfileEntity(hashset, i, loggedcontactdataentity);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LoggedProfileEntity[i];
    }
}
