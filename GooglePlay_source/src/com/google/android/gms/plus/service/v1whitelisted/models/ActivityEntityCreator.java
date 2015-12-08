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
//            ActivityEntity, AclEntity

public final class ActivityEntityCreator
    implements android.os.Parcelable.Creator
{

    public ActivityEntityCreator()
    {
    }

    static void writeToParcel(ActivityEntity activityentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = activityentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(17)))
        {
            SafeParcelWriter.writeString(parcel, 17, activityentity.mPlaceName, true);
        }
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, activityentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            SafeParcelWriter.writeString(parcel, 19, activityentity.mPublished, true);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, activityentity.mAccess, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, activityentity.mAnnotation, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            SafeParcelWriter.writeString(parcel, 23, activityentity.mUpdated, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            SafeParcelWriter.writeString(parcel, 25, activityentity.mVerb, true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            SafeParcelWriter.writeString(parcel, 24, activityentity.mUrl, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeString(parcel, 10, activityentity.mId, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            SafeParcelWriter.writeParcelable(parcel, 15, activityentity.mObject, i, true);
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
        String s2 = null;
        String s3 = null;
        String s4 = null;
        ActivityEntity.ObjectEntity objectentity = null;
        String s5 = null;
        String s6 = null;
        AclEntity aclentity = null;
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

                case 17: // '\021'
                    s4 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 19: // '\023'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 2: // '\002'
                    aclentity = (AclEntity)SafeParcelReader.createParcelable(parcel, k, AclEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 5: // '\005'
                    s6 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 23: // '\027'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 25: // '\031'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 10: // '\n'
                    s5 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 15: // '\017'
                    objectentity = (ActivityEntity.ObjectEntity)SafeParcelReader.createParcelable(parcel, k, ActivityEntity.ObjectEntity.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ActivityEntity(hashset, i, aclentity, s6, s5, objectentity, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActivityEntity[i];
    }
}
