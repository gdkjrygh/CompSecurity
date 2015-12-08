// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            EventParams, EventParcel

public final class q
    implements android.os.Parcelable.Creator
{

    public q()
    {
    }

    public static EventParcel a(Parcel parcel)
    {
        String s = null;
        int j = zza.a(parcel);
        int i = 0;
        long l = 0L;
        EventParams eventparams = null;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    eventparams = (EventParams)zza.a(parcel, k, EventParams.CREATOR);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, k);
                    break;

                case 5: // '\005'
                    l = zza.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new EventParcel(i, s1, eventparams, s, l);
            }
        } while (true);
    }

    static void a(EventParcel eventparcel, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, eventparcel.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, eventparcel.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, eventparcel.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, eventparcel.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, eventparcel.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new EventParcel[i];
    }
}
