// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            ProxyCard

public class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(ProxyCard proxycard, Parcel parcel, int i)
    {
        i = b.k(parcel);
        b.c(parcel, 1, proxycard.getVersionCode());
        b.a(parcel, 2, proxycard.um, false);
        b.a(parcel, 3, proxycard.un, false);
        b.c(parcel, 4, proxycard.uo);
        b.c(parcel, 5, proxycard.up);
        b.C(parcel, i);
    }

    public ProxyCard X(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int j = 0;
        String s1 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new ProxyCard(l, s1, s, j, i);
            }
        } while (true);
    }

    public ProxyCard[] aC(int i)
    {
        return new ProxyCard[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return X(parcel);
    }

    public Object[] newArray(int i)
    {
        return aC(i);
    }
}
