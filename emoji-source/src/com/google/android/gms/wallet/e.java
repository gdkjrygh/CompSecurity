// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            d, LoyaltyWalletObject, OfferWalletObject

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(d d1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, d1.getVersionCode());
        b.a(parcel, 2, d1.aiO, i, false);
        b.a(parcel, 3, d1.aiP, i, false);
        b.G(parcel, j);
    }

    public d bT(Parcel parcel)
    {
        OfferWalletObject offerwalletobject = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        LoyaltyWalletObject loyaltywalletobject = null;
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
                    loyaltywalletobject = (LoyaltyWalletObject)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LoyaltyWalletObject.CREATOR);
                    break;

                case 3: // '\003'
                    offerwalletobject = (OfferWalletObject)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, OfferWalletObject.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new d(i, loyaltywalletobject, offerwalletobject);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bT(parcel);
    }

    public d[] dz(int i)
    {
        return new d[i];
    }

    public Object[] newArray(int i)
    {
        return dz(i);
    }
}
