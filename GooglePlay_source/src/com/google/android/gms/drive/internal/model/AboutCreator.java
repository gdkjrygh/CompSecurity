// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal.model:
//            About

public final class AboutCreator
    implements android.os.Parcelable.Creator
{

    public AboutCreator()
    {
    }

    static void writeToParcel$10935f22(About about, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = about.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, about.mVersionCode);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeStringList(parcel, 8, about.mFolderColorPalette, true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            SafeParcelWriter.writeLong(parcel, 24, about.mRemainingChangeIds);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeLong(parcel, 13, about.mLargestChangeId);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeTypedList(parcel, 14, about.mMaxUploadSizes, true);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        java.util.ArrayList arraylist = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        long l1 = 0L;
        java.util.ArrayList arraylist1 = null;
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

                case 8: // '\b'
                    arraylist1 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 24: // '\030'
                    l = SafeParcelReader.readLong(parcel, k);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 13: // '\r'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, About.MaxUploadSizes.CREATOR);
                    hashset.add(Integer.valueOf(14));
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new About(hashset, i, arraylist1, l1, arraylist, l);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new About[i];
    }
}
