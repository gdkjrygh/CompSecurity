// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.s;
import com.google.android.gms.location.v;

// Referenced classes of package com.google.android.gms.internal:
//            zzpg, zzpi

public final class kd
    implements android.os.Parcelable.Creator
{

    public kd()
    {
    }

    public static zzpi a(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        int i = 1;
        PendingIntent pendingintent = null;
        android.os.IBinder ibinder1 = null;
        zzpg zzpg1 = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    zzpg1 = (zzpg)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, zzpg.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 4: // '\004'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PendingIntent.CREATOR);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zzpi(j, i, zzpg1, ibinder1, pendingintent, ibinder);
            }
        } while (true);
    }

    static void a(zzpi zzpi1, Parcel parcel, int i)
    {
        Object obj = null;
        int j = c.a(parcel);
        c.a(parcel, 1, zzpi1.a);
        c.a(parcel, 1000, zzpi1.a());
        c.a(parcel, 2, zzpi1.b, i);
        android.os.IBinder ibinder;
        if (zzpi1.c == null)
        {
            ibinder = null;
        } else
        {
            ibinder = zzpi1.c.asBinder();
        }
        c.a(parcel, 3, ibinder);
        c.a(parcel, 4, zzpi1.d, i);
        if (zzpi1.e == null)
        {
            zzpi1 = obj;
        } else
        {
            zzpi1 = zzpi1.e.asBinder();
        }
        c.a(parcel, 5, zzpi1);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new zzpi[i];
    }
}
