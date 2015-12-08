// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzpk

public class zzpl
    implements android.os.Parcelable.Creator
{

    public zzpl()
    {
    }

    static void zza(zzpk zzpk1, Parcel parcel, int i)
    {
        i = zzb.zzK(parcel);
        zzb.zza(parcel, 1, zzpk1.getRequestId(), false);
        zzb.zzc(parcel, 1000, zzpk1.getVersionCode());
        zzb.zza(parcel, 2, zzpk1.getExpirationTime());
        zzb.zza(parcel, 3, zzpk1.zzpB());
        zzb.zza(parcel, 4, zzpk1.getLatitude());
        zzb.zza(parcel, 5, zzpk1.getLongitude());
        zzb.zza(parcel, 6, zzpk1.zzpC());
        zzb.zzc(parcel, 7, zzpk1.zzpD());
        zzb.zzc(parcel, 8, zzpk1.getNotificationResponsiveness());
        zzb.zzc(parcel, 9, zzpk1.zzpE());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdx(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfy(i);
    }

    public zzpk zzdx(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        int l = 0;
        String s = null;
        int k = 0;
        short word0 = 0;
        double d1 = 0.0D;
        double d = 0.0D;
        float f = 0.0F;
        long l1 = 0L;
        int j = 0;
        int i = -1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 3: // '\003'
                    word0 = com.google.android.gms.common.internal.safeparcel.zza.zzf(parcel, j1);
                    break;

                case 4: // '\004'
                    d1 = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, j1);
                    break;

                case 5: // '\005'
                    d = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, j1);
                    break;

                case 6: // '\006'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, j1);
                    break;

                case 7: // '\007'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 8: // '\b'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new zzpk(l, s, k, word0, d1, d, f, l1, j, i);
            }
        } while (true);
    }

    public zzpk[] zzfy(int i)
    {
        return new zzpk[i];
    }
}
