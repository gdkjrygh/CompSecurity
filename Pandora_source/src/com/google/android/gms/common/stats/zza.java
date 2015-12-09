// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.stats:
//            ConnectionEvent

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(ConnectionEvent connectionevent, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, connectionevent.zzzH);
        zzb.zza(parcel, 2, connectionevent.getTimeMillis());
        zzb.zza(parcel, 3, connectionevent.zzmS(), false);
        zzb.zza(parcel, 4, connectionevent.zzmT(), false);
        zzb.zza(parcel, 5, connectionevent.zzmU(), false);
        zzb.zza(parcel, 6, connectionevent.zzmV(), false);
        zzb.zza(parcel, 7, connectionevent.zzmW(), false);
        zzb.zza(parcel, 8, connectionevent.zzmX(), false);
        zzb.zza(parcel, 9, connectionevent.zzmY());
        zzb.zza(parcel, 10, connectionevent.zzna());
        zzb.zza(parcel, 11, connectionevent.zzmZ());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzW(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbg(i);
    }

    public ConnectionEvent zzW(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        long l3 = 0L;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        long l = 0L;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaV(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 9: // '\t'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 10: // '\n'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 11: // '\013'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ConnectionEvent(i, l3, s5, s4, s3, s2, s1, s, l2, l1, l);
            }
        } while (true);
    }

    public ConnectionEvent[] zzbg(int i)
    {
        return new ConnectionEvent[i];
    }
}
