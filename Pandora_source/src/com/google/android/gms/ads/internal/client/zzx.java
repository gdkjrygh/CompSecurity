// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            SearchAdRequestParcel

public class zzx
    implements android.os.Parcelable.Creator
{

    public zzx()
    {
    }

    static void zza(SearchAdRequestParcel searchadrequestparcel, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, searchadrequestparcel.versionCode);
        zzb.zzc(parcel, 2, searchadrequestparcel.zzqL);
        zzb.zzc(parcel, 3, searchadrequestparcel.backgroundColor);
        zzb.zzc(parcel, 4, searchadrequestparcel.zzqM);
        zzb.zzc(parcel, 5, searchadrequestparcel.zzqN);
        zzb.zzc(parcel, 6, searchadrequestparcel.zzqO);
        zzb.zzc(parcel, 7, searchadrequestparcel.zzqP);
        zzb.zzc(parcel, 8, searchadrequestparcel.zzqQ);
        zzb.zzc(parcel, 9, searchadrequestparcel.zzqR);
        zzb.zza(parcel, 10, searchadrequestparcel.zzqS, false);
        zzb.zzc(parcel, 11, searchadrequestparcel.zzqT);
        zzb.zza(parcel, 12, searchadrequestparcel.zzqU, false);
        zzb.zzc(parcel, 13, searchadrequestparcel.zzqV);
        zzb.zzc(parcel, 14, searchadrequestparcel.zzqW);
        zzb.zza(parcel, 15, searchadrequestparcel.zzqX, false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzd(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzj(i);
    }

    public SearchAdRequestParcel zzd(Parcel parcel)
    {
        int i3 = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int l2 = 0;
        int k2 = 0;
        int j2 = 0;
        int i2 = 0;
        int l1 = 0;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        String s2 = null;
        int k = 0;
        String s1 = null;
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i3)
            {
                int j3 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaV(j3))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j3);
                    break;

                case 1: // '\001'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 2: // '\002'
                    k2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 3: // '\003'
                    j2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 4: // '\004'
                    i2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 6: // '\006'
                    k1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 7: // '\007'
                    j1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 8: // '\b'
                    i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 9: // '\t'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 10: // '\n'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j3);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 12: // '\f'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j3);
                    break;

                case 13: // '\r'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 14: // '\016'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j3);
                    break;
                }
            } else
            if (parcel.dataPosition() != i3)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i3).toString(), parcel);
            } else
            {
                return new SearchAdRequestParcel(l2, k2, j2, i2, l1, k1, j1, i1, l, s2, k, s1, j, i, s);
            }
        } while (true);
    }

    public SearchAdRequestParcel[] zzj(int i)
    {
        return new SearchAdRequestParcel[i];
    }
}
