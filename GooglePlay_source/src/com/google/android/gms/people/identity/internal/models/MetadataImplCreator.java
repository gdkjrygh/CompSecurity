// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class MetadataImplCreator
    implements android.os.Parcelable.Creator
{

    public MetadataImplCreator()
    {
    }

    static void writeToParcel$ca4ed76(PersonImpl.MetadataImpl metadataimpl, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = metadataimpl.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, metadataimpl.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, metadataimpl.mContainer, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, metadataimpl.mContainerContactId, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, metadataimpl.mContainerId, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, metadataimpl.mVisibility, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeBoolean(parcel, 6, metadataimpl.mEdgeKey);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeBoolean(parcel, 7, metadataimpl.mPrimary);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeBoolean(parcel, 8, metadataimpl.mVerified);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeBoolean(parcel, 9, metadataimpl.mWriteable);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeInt(parcel, 10, metadataimpl.mRawContactId);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int j = 0;
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
                    j = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    flag3 = SafeParcelReader.readBoolean(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    flag2 = SafeParcelReader.readBoolean(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    flag1 = SafeParcelReader.readBoolean(parcel, l);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    i = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(10));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new PersonImpl.MetadataImpl(hashset, j, s3, s2, s1, s, flag3, flag2, flag1, flag, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonImpl.MetadataImpl[i];
    }
}
