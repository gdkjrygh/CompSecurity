// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            TimeInterval

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void a(TimeInterval timeinterval, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, timeinterval.a());
        zzb.a(parcel, 2, timeinterval.a);
        zzb.a(parcel, 3, timeinterval.b);
        zzb.a(parcel, i);
    }

    public TimeInterval a(Parcel parcel)
    {
        long l = 0L;
        int j = zza.b(parcel);
        int i = 0;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = zza.h(parcel, k);
                    break;

                case 3: // '\003'
                    l = zza.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new TimeInterval(i, l1, l);
            }
        } while (true);
    }

    public TimeInterval[] a(int i)
    {
        return new TimeInterval[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
