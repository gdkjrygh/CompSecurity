// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            PackageStorageInfo

public final class ag
    implements android.os.Parcelable.Creator
{

    public ag()
    {
    }

    static void a(PackageStorageInfo packagestorageinfo, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, packagestorageinfo.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, packagestorageinfo.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, packagestorageinfo.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, packagestorageinfo.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    s = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    l = zza.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PackageStorageInfo(i, s1, s, l);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PackageStorageInfo[i];
    }
}
