// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class ActivityEntity_ObjectEntityCreator
    implements android.os.Parcelable.Creator
{

    public ActivityEntity_ObjectEntityCreator()
    {
    }

    static void writeToParcel(ActivityEntity.ObjectEntity objectentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = objectentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, objectentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, objectentity.mActor, i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeTypedList(parcel, 3, objectentity.mAttachments, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, objectentity.mContent, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeParcelable(parcel, 9, objectentity.mPlusoners, i, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeParcelable(parcel, 10, objectentity.mReplies, i, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        ActivityEntity.ObjectEntity.RepliesEntity repliesentity = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        ActivityEntity.ObjectEntity.PlusonersEntity plusonersentity = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        ActivityEntity.ObjectEntity.ActorEntity actorentity = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                case 8: // '\b'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    actorentity = (ActivityEntity.ObjectEntity.ActorEntity)SafeParcelReader.createParcelable(parcel, k, ActivityEntity.ObjectEntity.ActorEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, ActivityEntity.ObjectEntity.AttachmentsEntity.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 9: // '\t'
                    plusonersentity = (ActivityEntity.ObjectEntity.PlusonersEntity)SafeParcelReader.createParcelable(parcel, k, ActivityEntity.ObjectEntity.PlusonersEntity.CREATOR);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    repliesentity = (ActivityEntity.ObjectEntity.RepliesEntity)SafeParcelReader.createParcelable(parcel, k, ActivityEntity.ObjectEntity.RepliesEntity.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new ActivityEntity.ObjectEntity(hashset, i, actorentity, arraylist, s, plusonersentity, repliesentity);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActivityEntity.ObjectEntity[i];
    }
}
