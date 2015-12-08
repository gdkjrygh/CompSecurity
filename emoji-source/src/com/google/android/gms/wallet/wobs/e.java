// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.ig;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            d, b

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(d d1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, d1.getVersionCode());
        b.a(parcel, 2, d1.akP, false);
        b.a(parcel, 3, d1.akQ, false);
        b.b(parcel, 4, d1.akR, false);
        b.G(parcel, i);
    }

    public d cl(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        java.util.ArrayList arraylist = ig.ga();
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, b.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new d(i, s, s1, arraylist);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cl(parcel);
    }

    public d[] dT(int i)
    {
        return new d[i];
    }

    public Object[] newArray(int i)
    {
        return dT(i);
    }
}
