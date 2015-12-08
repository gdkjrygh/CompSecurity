// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            LogEvent

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    public static LogEvent a(Parcel parcel)
    {
        long l = 0L;
        android.os.Bundle bundle = null;
        int j = zza.zzaj(parcel);
        int i = 0;
        byte abyte0[] = null;
        String s = null;
        long l1 = 0L;
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
                    l1 = zza.zzi(parcel, k);
                    break;

                case 3: // '\003'
                    s = zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    abyte0 = zza.zzr(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = zza.zzq(parcel, k);
                    break;

                case 6: // '\006'
                    l = zza.zzi(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LogEvent(i, l1, l, s, abyte0, bundle);
            }
        } while (true);
    }

    static void a(LogEvent logevent, Parcel parcel)
    {
        int i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, logevent.a);
        zzb.zza(parcel, 2, logevent.b);
        zzb.zza(parcel, 3, logevent.d, false);
        zzb.zza(parcel, 4, logevent.e, false);
        zzb.zza(parcel, 5, logevent.f, false);
        zzb.zza(parcel, 6, logevent.c);
        zzb.zzH(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new LogEvent[i];
    }
}
