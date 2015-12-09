// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            d, LoyaltyWalletObject

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(d d1, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, d1.getVersionCode());
        b.a(parcel, 2, d1.abg, i, false);
        b.F(parcel, j);
    }

    public d ba(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        LoyaltyWalletObject loyaltywalletobject = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new d(i, loyaltywalletobject);
            }
        } while (true);
    }

    public d[] cm(int i)
    {
        return new d[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ba(parcel);
    }

    public Object[] newArray(int i)
    {
        return cm(i);
    }
}
