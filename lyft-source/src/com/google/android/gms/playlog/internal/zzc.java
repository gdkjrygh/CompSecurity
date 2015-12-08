// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            LogEvent

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(LogEvent logevent, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, logevent.a);
        zzb.a(parcel, 2, logevent.b);
        zzb.a(parcel, 3, logevent.c, false);
        zzb.a(parcel, 4, logevent.d, false);
        zzb.a(parcel, 5, logevent.e, false);
        zzb.a(parcel, i);
    }

    public LogEvent a(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        int j = zza.b(parcel);
        int i = 0;
        long l = 0L;
        byte abyte0[] = null;
        String s = null;
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
                    l = zza.h(parcel, k);
                    break;

                case 3: // '\003'
                    s = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    abyte0 = zza.p(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = zza.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LogEvent(i, l, s, abyte0, bundle);
            }
        } while (true);
    }

    public LogEvent[] a(int i)
    {
        return new LogEvent[i];
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
