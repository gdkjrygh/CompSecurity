// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    public static LocationRequest a(Parcel parcel)
    {
        int l = zza.a(parcel);
        int k = 0;
        int j = 102;
        long l4 = 0x36ee80L;
        long l3 = 0x927c0L;
        boolean flag = false;
        long l2 = 0x7fffffffffffffffL;
        int i = 0x7fffffff;
        float f = 0.0F;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = zza.e(parcel, i1);
                    break;

                case 1000: 
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    l4 = zza.f(parcel, i1);
                    break;

                case 3: // '\003'
                    l3 = zza.f(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = zza.c(parcel, i1);
                    break;

                case 5: // '\005'
                    l2 = zza.f(parcel, i1);
                    break;

                case 6: // '\006'
                    i = zza.e(parcel, i1);
                    break;

                case 7: // '\007'
                    f = zza.i(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = zza.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LocationRequest(k, j, l4, l3, flag, l2, i, f, l1);
            }
        } while (true);
    }

    static void a(LocationRequest locationrequest, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, locationrequest.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, locationrequest.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, locationrequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, locationrequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, locationrequest.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, locationrequest.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, locationrequest.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, locationrequest.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, locationrequest.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocationRequest[i];
    }
}
