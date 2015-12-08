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
//            OzDeviceInfoEntity

public final class OzDeviceInfoEntityCreator
    implements android.os.Parcelable.Creator
{

    public OzDeviceInfoEntityCreator()
    {
    }

    static void writeToParcel$76fee4cc(OzDeviceInfoEntity ozdeviceinfoentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = ozdeviceinfoentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, ozdeviceinfoentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeInt(parcel, 2, ozdeviceinfoentity.mDensityDpi);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeBoolean(parcel, 3, ozdeviceinfoentity.mFeatureLandscape);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeBoolean(parcel, 4, ozdeviceinfoentity.mFeaturePortrait);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, ozdeviceinfoentity.mFingerprint, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, ozdeviceinfoentity.mManufacturer, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeString(parcel, 7, ozdeviceinfoentity.mOrientation, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeInt(parcel, 8, ozdeviceinfoentity.mScreenHeightDp);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeInt(parcel, 9, ozdeviceinfoentity.mScreenWidthDp);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        String s1 = null;
        String s2 = null;
        boolean flag = false;
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    l = SafeParcelReader.readInt(parcel, j1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    k = SafeParcelReader.readInt(parcel, j1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    flag1 = SafeParcelReader.readBoolean(parcel, j1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, j1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s2 = SafeParcelReader.createString(parcel, j1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, j1);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, j1);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    j = SafeParcelReader.readInt(parcel, j1);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    i = SafeParcelReader.readInt(parcel, j1);
                    hashset.add(Integer.valueOf(9));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != i1)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
                }
                return new OzDeviceInfoEntity(hashset, l, k, flag1, flag, s2, s1, s, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OzDeviceInfoEntity[i];
    }
}
