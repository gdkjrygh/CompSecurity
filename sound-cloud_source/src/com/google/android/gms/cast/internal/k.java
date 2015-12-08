// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.cast.internal:
//            DeviceStatus

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(DeviceStatus devicestatus, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, devicestatus.a);
        zzb.zza(parcel, 2, devicestatus.b);
        zzb.zza(parcel, 3, devicestatus.c);
        zzb.zzc(parcel, 4, devicestatus.d);
        zzb.zza(parcel, 5, devicestatus.e, i, false);
        zzb.zzc(parcel, 6, devicestatus.f);
        zzb.zzH(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int i1 = zza.zzaj(parcel);
        double d = 0.0D;
        ApplicationMetadata applicationmetadata = null;
        int j = 0;
        boolean flag = false;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = zza.zzai(parcel);
                switch (zza.zzbH(j1))
                {
                default:
                    zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    d = zza.zzm(parcel, j1);
                    break;

                case 3: // '\003'
                    flag = zza.zzc(parcel, j1);
                    break;

                case 4: // '\004'
                    j = zza.zzg(parcel, j1);
                    break;

                case 5: // '\005'
                    applicationmetadata = (ApplicationMetadata)zza.zza(parcel, j1, ApplicationMetadata.CREATOR);
                    break;

                case 6: // '\006'
                    i = zza.zzg(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new DeviceStatus(l, d, flag, j, applicationmetadata, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DeviceStatus[i];
    }
}
