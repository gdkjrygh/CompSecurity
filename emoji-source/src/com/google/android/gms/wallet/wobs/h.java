// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            g

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(g g1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, g1.getVersionCode());
        b.c(parcel, 2, g1.akT);
        b.a(parcel, 3, g1.akU, false);
        b.a(parcel, 4, g1.akV);
        b.a(parcel, 5, g1.akW, false);
        b.a(parcel, 6, g1.akX);
        b.c(parcel, 7, g1.akY);
        b.G(parcel, i);
    }

    public g cm(Parcel parcel)
    {
        String s = null;
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        double d = 0.0D;
        long l1 = 0L;
        int i = -1;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 4: // '\004'
                    d = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 6: // '\006'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new g(k, j, s1, d, s, l1, i);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cm(parcel);
    }

    public g[] dU(int i)
    {
        return new g[i];
    }

    public Object[] newArray(int i)
    {
        return dU(i);
    }
}
