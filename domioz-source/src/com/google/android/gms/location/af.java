// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location:
//            zzl

public final class af
    implements android.os.Parcelable.Creator
{

    public af()
    {
    }

    public static zzl a(Parcel parcel)
    {
        int i = 1;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = 0;
        long l1 = 0L;
        int j = 1;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new zzl(k, j, i, l1);
            }
        } while (true);
    }

    static void a(zzl zzl1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzl1.a);
        c.a(parcel, 1000, zzl1.a());
        c.a(parcel, 2, zzl1.b);
        c.a(parcel, 3, zzl1.c);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new zzl[i];
    }
}
