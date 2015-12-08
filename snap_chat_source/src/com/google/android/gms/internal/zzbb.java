// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzba

public class zzbb
    implements android.os.Parcelable.Creator
{

    public zzbb()
    {
    }

    static void zza(zzba zzba1, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, zzba1.versionCode);
        zzb.zza(parcel, 2, zzba1.zzpa, false);
        zzb.zzc(parcel, 3, zzba1.height);
        zzb.zzc(parcel, 4, zzba1.heightPixels);
        zzb.zza(parcel, 5, zzba1.zzpb);
        zzb.zzc(parcel, 6, zzba1.width);
        zzb.zzc(parcel, 7, zzba1.widthPixels);
        zzb.zza(parcel, 8, zzba1.zzpc, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzc(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzg(i);
    }

    public zzba zzc(Parcel parcel)
    {
        zzba azzba[] = null;
        int i = 0;
        int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        int j = 0;
        boolean flag = false;
        int k = 0;
        int l = 0;
        String s = null;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(k1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 8: // '\b'
                    azzba = (zzba[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k1, zzba.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new zzba(i1, s, l, k, flag, j, i, azzba);
            }
        } while (true);
    }

    public zzba[] zzg(int i)
    {
        return new zzba[i];
    }
}
