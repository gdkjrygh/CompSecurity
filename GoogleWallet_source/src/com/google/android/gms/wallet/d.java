// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            CreateWalletObjectsRequest, LoyaltyWalletObject, OfferWalletObject

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(CreateWalletObjectsRequest createwalletobjectsrequest, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, createwalletobjectsrequest.getVersionCode());
        b.a(parcel, 2, createwalletobjectsrequest.aTj, i, false);
        b.a(parcel, 3, createwalletobjectsrequest.aTk, i, false);
        b.J(parcel, j);
    }

    private static CreateWalletObjectsRequest hZ(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        LoyaltyWalletObject loyaltywalletobject = null;
        int i = 0;
        OfferWalletObject offerwalletobject = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
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
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CreateWalletObjectsRequest(i, loyaltywalletobject, offerwalletobject);
            }
        } while (true);
    }

    private static CreateWalletObjectsRequest[] kU(int i)
    {
        return new CreateWalletObjectsRequest[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return hZ(parcel);
    }

    public final Object[] newArray(int i)
    {
        return kU(i);
    }
}
