// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEvent

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(AccountChangeEvent accountchangeevent, Parcel parcel)
    {
        int i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, accountchangeevent.a);
        zzb.zza(parcel, 2, accountchangeevent.b);
        zzb.zza(parcel, 3, accountchangeevent.c, false);
        zzb.zzc(parcel, 4, accountchangeevent.d);
        zzb.zzc(parcel, 5, accountchangeevent.e);
        zzb.zza(parcel, 6, accountchangeevent.f, false);
        zzb.zzH(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = zza.zzaj(parcel);
        long l1 = 0L;
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = zza.zzai(parcel);
                switch (zza.zzbH(i1))
                {
                default:
                    zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = zza.zzi(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = zza.zzo(parcel, i1);
                    break;

                case 4: // '\004'
                    j = zza.zzg(parcel, i1);
                    break;

                case 5: // '\005'
                    i = zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    s = zza.zzo(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AccountChangeEvent(k, l1, s1, j, i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AccountChangeEvent[i];
    }
}
