// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator
    implements android.os.Parcelable.Creator
{

    public ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator()
    {
    }

    static void writeToParcel(ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity thumbnailsentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = thumbnailsentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, thumbnailsentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeParcelable(parcel, 4, thumbnailsentity.mImage, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, thumbnailsentity.mUrl, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity imageentity = null;
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
                case 3: // '\003'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 4: // '\004'
                    imageentity = (ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity)SafeParcelReader.createParcelable(parcel, k, ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity(hashset, i, imageentity, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity[i];
    }
}
