// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultMetadataImpl

public final class DefaultMetadataImplCreator
    implements android.os.Parcelable.Creator
{

    public DefaultMetadataImplCreator()
    {
    }

    static void writeToParcel$559d2448(DefaultMetadataImpl defaultmetadataimpl, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = defaultmetadataimpl.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, defaultmetadataimpl.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeTypedList(parcel, 2, defaultmetadataimpl.mAffinities, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, defaultmetadataimpl.mContainer, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, defaultmetadataimpl.mContainerContactId, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, defaultmetadataimpl.mContainerId, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeBoolean(parcel, 6, defaultmetadataimpl.mEdgeKey);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeBoolean(parcel, 7, defaultmetadataimpl.mPrimary);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeBoolean(parcel, 8, defaultmetadataimpl.mVerified);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeString(parcel, 9, defaultmetadataimpl.mVisibility, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeBoolean(parcel, 10, defaultmetadataimpl.mWriteable);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        java.util.ArrayList arraylist = null;
        int i = 0;
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
                    arraylist = SafeParcelReader.createTypedList(parcel, k, DefaultMetadataImpl.Affinities.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    flag3 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(10));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new DefaultMetadataImpl(hashset, i, arraylist, s3, s2, s1, flag3, flag2, flag1, s, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DefaultMetadataImpl[i];
    }
}
