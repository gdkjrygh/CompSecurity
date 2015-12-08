// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.api:
//            Status

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void a(Status status, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, status.g());
        zzb.a(parcel, 1000, status.d());
        zzb.a(parcel, 2, status.c(), false);
        zzb.a(parcel, 3, status.b(), i, false);
        zzb.a(parcel, j);
    }

    public Status a(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        int j = 0;
        int k = zza.b(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.f(parcel, l);
                    break;

                case 1000: 
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    s = zza.m(parcel, l);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)zza.a(parcel, l, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new Status(i, j, s, pendingintent);
            }
        } while (true);
    }

    public Status[] a(int i)
    {
        return new Status[i];
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
