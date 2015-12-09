// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location:
//            zzh

public final class ac
    implements android.os.Parcelable.Creator
{

    public ac()
    {
    }

    public static zzh a(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        Object obj = com.google.android.gms.location.zzh.a;
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
                    obj = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Location.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzh(i, ((java.util.List) (obj)));
            }
        } while (true);
    }

    static void a(zzh zzh1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.c(parcel, 1, zzh1.b);
        c.a(parcel, 1000, zzh1.a());
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new zzh[i];
    }
}
