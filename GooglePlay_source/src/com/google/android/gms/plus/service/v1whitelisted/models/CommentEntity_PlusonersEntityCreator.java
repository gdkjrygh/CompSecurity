// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class CommentEntity_PlusonersEntityCreator
    implements android.os.Parcelable.Creator
{

    public CommentEntity_PlusonersEntityCreator()
    {
    }

    static void writeToParcel$3e23f28(CommentEntity.PlusonersEntity plusonersentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = plusonersentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, plusonersentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeInt(parcel, 2, plusonersentity.mTotalItems);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(2));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new CommentEntity.PlusonersEntity(hashset, i, j);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CommentEntity.PlusonersEntity[i];
    }
}
