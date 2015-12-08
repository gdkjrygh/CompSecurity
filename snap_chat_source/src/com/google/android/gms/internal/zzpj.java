// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzpi, zzpg

public class zzpj
    implements android.os.Parcelable.Creator
{

    public zzpj()
    {
    }

    static void zza(zzpi zzpi1, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, zzpi1.zzanl);
        zzb.zzc(parcel, 1000, zzpi1.getVersionCode());
        zzb.zza(parcel, 2, zzpi1.zzanm, i, false);
        zzb.zza(parcel, 3, zzpi1.zzpz(), false);
        zzb.zza(parcel, 4, zzpi1.mPendingIntent, i, false);
        zzb.zza(parcel, 5, zzpi1.zzpA(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdw(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfv(i);
    }

    public zzpi zzdw(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        int j = 0;
        int i = 1;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder1 = null;
        zzpg zzpg1 = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    zzpg1 = (zzpg)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, zzpg.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, l);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zzpi(j, i, zzpg1, ibinder1, pendingintent, ibinder);
            }
        } while (true);
    }

    public zzpi[] zzfv(int i)
    {
        return new zzpi[i];
    }
}
