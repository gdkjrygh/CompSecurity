// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.cast.internal:
//            ApplicationStatus

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ApplicationStatus applicationstatus, Parcel parcel)
    {
        int i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, applicationstatus.a);
        zzb.zza(parcel, 2, applicationstatus.b, false);
        zzb.zzH(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.zzaj(parcel);
        int i = 0;
        String s = null;
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
                    s = zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ApplicationStatus(i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ApplicationStatus[i];
    }
}
