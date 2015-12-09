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
//            CommentEntity

public final class CommentEntityCreator
    implements android.os.Parcelable.Creator
{

    public CommentEntityCreator()
    {
    }

    static void writeToParcel(CommentEntity commententity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = commententity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, commententity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, commententity.mActor, i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, commententity.mId, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeTypedList(parcel, 5, commententity.mInReplyTo, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeParcelable(parcel, 7, commententity.mObject, i, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeParcelable(parcel, 8, commententity.mPlusoners, i, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeString(parcel, 9, commententity.mPublished, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeParcelable(parcel, 11, commententity.mStatusForViewer, i, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeString(parcel, 12, commententity.mUpdated, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        CommentEntity.StatusForViewerEntity statusforviewerentity = null;
        String s1 = null;
        CommentEntity.PlusonersEntity plusonersentity = null;
        CommentEntity.ObjectEntity objectentity = null;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        CommentEntity.ActorEntity actorentity = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                case 6: // '\006'
                case 10: // '\n'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    actorentity = (CommentEntity.ActorEntity)SafeParcelReader.createParcelable(parcel, k, CommentEntity.ActorEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, CommentEntity.InReplyToEntity.CREATOR);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 7: // '\007'
                    objectentity = (CommentEntity.ObjectEntity)SafeParcelReader.createParcelable(parcel, k, CommentEntity.ObjectEntity.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    plusonersentity = (CommentEntity.PlusonersEntity)SafeParcelReader.createParcelable(parcel, k, CommentEntity.PlusonersEntity.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 11: // '\013'
                    statusforviewerentity = (CommentEntity.StatusForViewerEntity)SafeParcelReader.createParcelable(parcel, k, CommentEntity.StatusForViewerEntity.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(12));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new CommentEntity(hashset, i, actorentity, s2, arraylist, objectentity, plusonersentity, s1, statusforviewerentity, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CommentEntity[i];
    }
}
