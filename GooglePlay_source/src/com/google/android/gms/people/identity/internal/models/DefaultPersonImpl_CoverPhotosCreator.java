// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class DefaultPersonImpl_CoverPhotosCreator
    implements android.os.Parcelable.Creator
{

    public DefaultPersonImpl_CoverPhotosCreator()
    {
    }

    static void writeToParcel$2ce9a6c2(DefaultPersonImpl.CoverPhotos coverphotos, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = coverphotos.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, coverphotos.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeInt(parcel, 2, coverphotos.mHeight);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, coverphotos.mId, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeBoolean(parcel, 4, coverphotos.mIsDefault);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, coverphotos.mUrl, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeInt(parcel, 6, coverphotos.mWidth);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        boolean flag = false;
        String s1 = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    k = SafeParcelReader.readInt(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, i1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, i1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, i1);
                    hashset.add(Integer.valueOf(6));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
                }
                return new DefaultPersonImpl.CoverPhotos(hashset, k, j, s1, flag, s, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DefaultPersonImpl.CoverPhotos[i];
    }
}
