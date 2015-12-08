// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            StorageInfoResponse, PackageStorageInfo

public class zzbh
    implements android.os.Parcelable.Creator
{

    public zzbh()
    {
    }

    static void a(StorageInfoResponse storageinforesponse, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, storageinforesponse.a);
        zzb.a(parcel, 2, storageinforesponse.b);
        zzb.a(parcel, 3, storageinforesponse.c);
        zzb.c(parcel, 4, storageinforesponse.d, false);
        zzb.a(parcel, i);
    }

    public StorageInfoResponse a(Parcel parcel)
    {
        int i = 0;
        int k = zza.b(parcel);
        long l1 = 0L;
        java.util.ArrayList arraylist = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = zza.h(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = zza.c(parcel, l, PackageStorageInfo.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new StorageInfoResponse(j, i, l1, arraylist);
            }
        } while (true);
    }

    public StorageInfoResponse[] a(int i)
    {
        return new StorageInfoResponse[i];
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
