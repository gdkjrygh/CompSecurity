// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class ActivityEntity_ObjectEntity_AttachmentsEntityCreator
    implements android.os.Parcelable.Creator
{

    public ActivityEntity_ObjectEntity_AttachmentsEntityCreator()
    {
    }

    static void writeToParcel(ActivityEntity.ObjectEntity.AttachmentsEntity attachmentsentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = attachmentsentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, attachmentsentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, attachmentsentity.mAction, i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, attachmentsentity.mContent, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeParcelable(parcel, 5, attachmentsentity.mDeepLink, i, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, attachmentsentity.mDisplayName, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeParcelable(parcel, 10, attachmentsentity.mImage, i, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeString(parcel, 11, attachmentsentity.mObjectType, true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeTypedList(parcel, 13, attachmentsentity.mThumbnails, true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeString(parcel, 14, attachmentsentity.mUrl, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        java.util.ArrayList arraylist = null;
        String s1 = null;
        ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity imageentity = null;
        String s2 = null;
        ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity deeplinkentity = null;
        String s3 = null;
        ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity actionentity = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                case 7: // '\007'
                case 8: // '\b'
                case 9: // '\t'
                case 12: // '\f'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    actionentity = (ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity)SafeParcelReader.createParcelable(parcel, k, ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    deeplinkentity = (ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity)SafeParcelReader.createParcelable(parcel, k, ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity.CREATOR);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 10: // '\n'
                    imageentity = (ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity)SafeParcelReader.createParcelable(parcel, k, ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 13: // '\r'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, ActivityEntity.ObjectEntity.AttachmentsEntity.ThumbnailsEntity.CREATOR);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(14));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ActivityEntity.ObjectEntity.AttachmentsEntity(hashset, i, actionentity, s3, deeplinkentity, s2, imageentity, s1, arraylist, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActivityEntity.ObjectEntity.AttachmentsEntity[i];
    }
}
