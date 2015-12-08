// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            PackageStorageInfo

public class zzba
    implements android.os.Parcelable.Creator
{

    public zzba()
    {
    }

    static void a(PackageStorageInfo packagestorageinfo, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, packagestorageinfo.a);
        zzb.a(parcel, 2, packagestorageinfo.b, false);
        zzb.a(parcel, 3, packagestorageinfo.c, false);
        zzb.a(parcel, 4, packagestorageinfo.d);
        zzb.a(parcel, i);
    }

    public PackageStorageInfo a(Parcel parcel)
    {
        String s = null;
        int j = zza.b(parcel);
        int i = 0;
        long l = 0L;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    s = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    l = zza.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PackageStorageInfo(i, s1, s, l);
            }
        } while (true);
    }

    public PackageStorageInfo[] a(int i)
    {
        return new PackageStorageInfo[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
