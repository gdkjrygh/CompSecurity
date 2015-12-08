// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            fn

public class fp
    implements android.os.Parcelable.Creator
{

    public fp()
    {
    }

    static void a(fn fn1, Parcel parcel, int i)
    {
        i = b.k(parcel);
        b.a(parcel, 1, fn1.getAccountName(), false);
        b.c(parcel, 1000, fn1.getVersionCode());
        b.a(parcel, 2, fn1.cZ(), false);
        b.a(parcel, 3, fn1.da(), false);
        b.a(parcel, 4, fn1.db(), false);
        b.a(parcel, 5, fn1.dc(), false);
        b.a(parcel, 6, fn1.dd(), false);
        b.a(parcel, 7, fn1.de(), false);
        b.a(parcel, 8, fn1.df(), false);
        b.C(parcel, i);
    }

    public fn A(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String as[] = null;
        String as1[] = null;
        String as2[] = null;
        String s4 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    as2 = com.google.android.gms.common.internal.safeparcel.a.w(parcel, k);
                    break;

                case 3: // '\003'
                    as1 = com.google.android.gms.common.internal.safeparcel.a.w(parcel, k);
                    break;

                case 4: // '\004'
                    as = com.google.android.gms.common.internal.safeparcel.a.w(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new fn(i, s4, as2, as1, as, s3, s2, s1, s);
            }
        } while (true);
    }

    public fn[] af(int i)
    {
        return new fn[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return A(parcel);
    }

    public Object[] newArray(int i)
    {
        return af(i);
    }
}
