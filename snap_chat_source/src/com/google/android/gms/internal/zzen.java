// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzeo, zzek, zzhy, zzx

public class zzen
    implements android.os.Parcelable.Creator
{

    public zzen()
    {
    }

    static void zza(zzeo zzeo1, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, zzeo1.versionCode);
        zzb.zza(parcel, 2, zzeo1.zzun, i, false);
        zzb.zza(parcel, 3, zzeo1.zzdi(), false);
        zzb.zza(parcel, 4, zzeo1.zzdj(), false);
        zzb.zza(parcel, 5, zzeo1.zzdk(), false);
        zzb.zza(parcel, 6, zzeo1.zzdl(), false);
        zzb.zza(parcel, 7, zzeo1.zzus, false);
        zzb.zza(parcel, 8, zzeo1.zzut);
        zzb.zza(parcel, 9, zzeo1.zzuu, false);
        zzb.zza(parcel, 10, zzeo1.zzdn(), false);
        zzb.zzc(parcel, 11, zzeo1.orientation);
        zzb.zzc(parcel, 12, zzeo1.zzuw);
        zzb.zza(parcel, 13, zzeo1.zztR, false);
        zzb.zza(parcel, 14, zzeo1.zzlP, i, false);
        zzb.zza(parcel, 15, zzeo1.zzdm(), false);
        zzb.zza(parcel, 17, zzeo1.zzuz, i, false);
        zzb.zza(parcel, 16, zzeo1.zzuy, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzf(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzq(i);
    }

    public zzeo zzf(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        int k = 0;
        zzek zzek1 = null;
        android.os.IBinder ibinder5 = null;
        android.os.IBinder ibinder4 = null;
        android.os.IBinder ibinder3 = null;
        android.os.IBinder ibinder2 = null;
        String s3 = null;
        boolean flag = false;
        String s2 = null;
        android.os.IBinder ibinder1 = null;
        int j = 0;
        int i = 0;
        String s1 = null;
        zzhy zzhy1 = null;
        android.os.IBinder ibinder = null;
        String s = null;
        zzx zzx1 = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    zzek1 = (zzek)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, zzek.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 4: // '\004'
                    ibinder4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 6: // '\006'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 9: // '\t'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 10: // '\n'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 11: // '\013'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 13: // '\r'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 14: // '\016'
                    zzhy1 = (zzhy)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, zzhy.CREATOR);
                    break;

                case 15: // '\017'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 17: // '\021'
                    zzx1 = (zzx)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, zzx.CREATOR);
                    break;

                case 16: // '\020'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new zzeo(k, zzek1, ibinder5, ibinder4, ibinder3, ibinder2, s3, flag, s2, ibinder1, j, i, s1, zzhy1, ibinder, s, zzx1);
            }
        } while (true);
    }

    public zzeo[] zzq(int i)
    {
        return new zzeo[i];
    }
}
