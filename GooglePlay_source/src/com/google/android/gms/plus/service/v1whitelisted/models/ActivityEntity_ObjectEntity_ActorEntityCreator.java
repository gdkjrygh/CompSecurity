// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class ActivityEntity_ObjectEntity_ActorEntityCreator
    implements android.os.Parcelable.Creator
{

    public ActivityEntity_ObjectEntity_ActorEntityCreator()
    {
    }

    static void writeToParcel$3816d2(ActivityEntity.ObjectEntity.ActorEntity actorentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = actorentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, actorentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, actorentity.mDisplayName, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s = null;
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
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ActivityEntity.ObjectEntity.ActorEntity(hashset, i, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActivityEntity.ObjectEntity.ActorEntity[i];
    }
}
