// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntityCreator
    implements android.os.Parcelable.Creator
{

    public ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntityCreator()
    {
    }

    static void writeToParcel(ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity actionentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = actionentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, actionentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, actionentity.mDeepLink, i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, actionentity.mDisplayName, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, actionentity.mType, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s1 = null;
        ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity deeplinkentity = null;
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
                    deeplinkentity = (ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity)SafeParcelReader.createParcelable(parcel, k, ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity.CREATOR);
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
                return new ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity(hashset, i, deeplinkentity, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity[i];
    }
}
