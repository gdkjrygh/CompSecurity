// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            PackageStorageInfo

public final class PackageStorageInfoCreator
    implements android.os.Parcelable.Creator
{

    public PackageStorageInfoCreator()
    {
    }

    static void writeToParcel$7f7ed7c7(PackageStorageInfo packagestorageinfo, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, packagestorageinfo.versionCode);
        SafeParcelWriter.writeString(parcel, 2, packagestorageinfo.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, packagestorageinfo.label, false);
        SafeParcelWriter.writeLong(parcel, 4, packagestorageinfo.totalSizeBytes);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        String s1 = null;
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
                    break;

                case 2: // '\002'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PackageStorageInfo(i, s1, s, l);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PackageStorageInfo[i];
    }
}
