// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            ProxyCard

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(ProxyCard proxycard, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, proxycard.getVersionCode());
        b.a(parcel, 2, proxycard.aUv, false);
        b.a(parcel, 3, proxycard.aUw, false);
        b.c(parcel, 4, proxycard.aUx);
        b.c(parcel, 5, proxycard.aUy);
        b.J(parcel, i);
    }

    private static ProxyCard ik(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ProxyCard(k, s1, s, j, i);
            }
        } while (true);
    }

    private static ProxyCard[] lf(int i)
    {
        return new ProxyCard[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return ik(parcel);
    }

    public final Object[] newArray(int i)
    {
        return lf(i);
    }
}
