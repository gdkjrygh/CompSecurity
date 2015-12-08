// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            OfferWalletObject

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(OfferWalletObject offerwalletobject, Parcel parcel, int i)
    {
        i = b.k(parcel);
        b.c(parcel, 1, offerwalletobject.getVersionCode());
        b.a(parcel, 2, offerwalletobject.tU, false);
        b.a(parcel, 3, offerwalletobject.ul, false);
        b.C(parcel, i);
    }

    public OfferWalletObject W(Parcel parcel)
    {
        String s1 = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new OfferWalletObject(i, s, s1);
            }
        } while (true);
    }

    public OfferWalletObject[] aB(int i)
    {
        return new OfferWalletObject[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return W(parcel);
    }

    public Object[] newArray(int i)
    {
        return aB(i);
    }
}
