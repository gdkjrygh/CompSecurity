// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.signin.internal:
//            CheckServerAuthResult

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(CheckServerAuthResult checkserverauthresult, Parcel parcel)
    {
        int i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, checkserverauthresult.a);
        zzb.zza(parcel, 2, checkserverauthresult.b);
        zzb.zzc(parcel, 3, checkserverauthresult.c, false);
        zzb.zzH(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.zzaj(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.zzai(parcel);
                switch (zza.zzbH(k))
                {
                default:
                    zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    flag = zza.zzc(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = zza.zzc(parcel, k, Scope.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CheckServerAuthResult(i, flag, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CheckServerAuthResult[i];
    }
}
