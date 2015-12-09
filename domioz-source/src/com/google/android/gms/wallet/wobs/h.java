// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzl

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(zzl zzl1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzl1.a());
        c.a(parcel, 2, zzl1.a);
        c.a(parcel, 3, zzl1.b);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        long l1 = 0L;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzl(i, l1, l);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzl[i];
    }
}
