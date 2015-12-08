// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

// Referenced classes of package com.google.android.gms.wallet:
//            OfferWalletObject

public class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(OfferWalletObject offerwalletobject, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, offerwalletobject.getVersionCode());
        b.a(parcel, 2, offerwalletobject.eC, false);
        b.a(parcel, 3, offerwalletobject.ajT, false);
        b.a(parcel, 4, offerwalletobject.ajU, i, false);
        b.G(parcel, j);
    }

    public OfferWalletObject cc(Parcel parcel)
    {
        CommonWalletObject commonwalletobject = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        String s1 = null;
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
                    commonwalletobject = (CommonWalletObject)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CommonWalletObject.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OfferWalletObject(i, s, s1, commonwalletobject);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cc(parcel);
    }

    public OfferWalletObject[] dI(int i)
    {
        return new OfferWalletObject[i];
    }

    public Object[] newArray(int i)
    {
        return dI(i);
    }
}
