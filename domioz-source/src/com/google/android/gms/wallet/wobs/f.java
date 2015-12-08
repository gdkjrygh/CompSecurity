// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzf, zzg, zzl

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(zzf zzf1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzf1.a());
        c.a(parcel, 2, zzf1.a);
        c.a(parcel, 3, zzf1.b, i);
        c.a(parcel, 4, zzf1.c);
        c.a(parcel, 5, zzf1.d, i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        zzl zzl1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
        zzg zzg1 = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    zzg1 = (zzg)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, zzg.CREATOR);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 5: // '\005'
                    zzl1 = (zzl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, zzl.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzf(i, s1, zzg1, s, zzl1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzf[i];
    }
}
