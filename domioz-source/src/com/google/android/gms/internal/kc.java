// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzpg, zzox

public final class kc
    implements android.os.Parcelable.Creator
{

    public kc()
    {
    }

    public static zzpg a(Parcel parcel)
    {
        String s = null;
        boolean flag = true;
        boolean flag2 = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Object obj = com.google.android.gms.internal.zzpg.a;
        boolean flag1 = true;
        LocationRequest locationrequest = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    locationrequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    obj = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, zzox.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzpg(i, locationrequest, flag2, flag1, flag, ((java.util.List) (obj)), s);
            }
        } while (true);
    }

    static void a(zzpg zzpg1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzpg1.b, i);
        c.a(parcel, 1000, zzpg1.a());
        c.a(parcel, 2, zzpg1.c);
        c.a(parcel, 3, zzpg1.d);
        c.a(parcel, 4, zzpg1.e);
        c.c(parcel, 5, zzpg1.f);
        c.a(parcel, 6, zzpg1.g);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new zzpg[i];
    }
}
