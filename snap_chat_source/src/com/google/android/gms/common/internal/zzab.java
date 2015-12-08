// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzaa

public class zzab
    implements android.os.Parcelable.Creator
{

    public zzab()
    {
    }

    static void zza(zzaa zzaa1, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, zzaa1.zzFG);
        zzb.zza(parcel, 2, zzaa1.zzPn, false);
        zzb.zza(parcel, 3, zzaa1.zzjo(), i, false);
        zzb.zza(parcel, 4, zzaa1.zzjp());
        zzb.zza(parcel, 5, zzaa1.zzjq());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzG(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzaN(i);
    }

    public zzaa zzG(Parcel parcel)
    {
        ConnectionResult connectionresult = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        boolean flag1 = false;
        android.os.IBinder ibinder = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 3: // '\003'
                    connectionresult = (ConnectionResult)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ConnectionResult.CREATOR);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzaa(i, ibinder, connectionresult, flag1, flag);
            }
        } while (true);
    }

    public zzaa[] zzaN(int i)
    {
        return new zzaa[i];
    }
}
