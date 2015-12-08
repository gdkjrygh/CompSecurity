// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzjb, zzip, zzin

public final class gt
    implements android.os.Parcelable.Creator
{

    public gt()
    {
    }

    static void a(zzjb zzjb1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzjb1.b, i);
        c.a(parcel, 1000, zzjb1.a);
        c.a(parcel, 2, zzjb1.c);
        c.a(parcel, 3, zzjb1.d);
        c.a(parcel, 4, zzjb1.e);
        c.a(parcel, 5, zzjb1.f, i);
        c.a(parcel, 6, zzjb1.g);
        c.a(parcel, 7, zzjb1.h);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        zzin zzin1 = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        long l1 = 0L;
        int i = -1;
        String s = null;
        int j = 0;
        zzip zzip1 = null;
        int k = 0;
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
                    zzip1 = (zzip)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, zzip.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 5: // '\005'
                    zzin1 = (zzin)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, zzin.CREATOR);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new zzjb(k, zzip1, l1, j, s, zzin1, flag, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzjb[i];
    }
}
