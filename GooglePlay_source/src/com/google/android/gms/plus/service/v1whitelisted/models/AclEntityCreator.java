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
//            AclEntity, PlusAclentryResourceEntity

public final class AclEntityCreator
    implements android.os.Parcelable.Creator
{

    public AclEntityCreator()
    {
    }

    static void writeToParcel$1d3dde57(AclEntity aclentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = aclentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, aclentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, aclentity.mAccessSummary, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, aclentity.mDescription, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeBoolean(parcel, 4, aclentity.mDomainRestricted);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, aclentity.mEtag, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeTypedList(parcel, 6, aclentity.mItems, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeBoolean(parcel, 8, aclentity.mReadOnly);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeBoolean(parcel, 9, aclentity.mRestricted);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeBoolean(parcel, 10, aclentity.mShowCircles);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeBoolean(parcel, 11, aclentity.mShowContacts);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeString(parcel, 12, aclentity.mTitle, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s3 = null;
        String s2 = null;
        boolean flag4 = false;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 7: // '\007'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    flag4 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, PlusAclentryResourceEntity.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 8: // '\b'
                    flag3 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    flag = SafeParcelReader.readBoolean(parcel, k);
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
                return new AclEntity(hashset, i, s3, s2, flag4, s1, arraylist, flag3, flag2, flag1, flag, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AclEntity[i];
    }
}
