// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet:
//            zzd, LoyaltyWalletObject, OfferWalletObject, GiftCardWalletObject

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(zzd zzd1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zzd1.a());
        c.a(parcel, 2, zzd1.a, i);
        c.a(parcel, 3, zzd1.b, i);
        c.a(parcel, 4, zzd1.c, i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        OfferWalletObject offerwalletobject = null;
        LoyaltyWalletObject loyaltywalletobject = null;
        int i = 0;
        GiftCardWalletObject giftcardwalletobject = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    loyaltywalletobject = (LoyaltyWalletObject)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LoyaltyWalletObject.CREATOR);
                    break;

                case 3: // '\003'
                    offerwalletobject = (OfferWalletObject)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, OfferWalletObject.CREATOR);
                    break;

                case 4: // '\004'
                    giftcardwalletobject = (GiftCardWalletObject)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, GiftCardWalletObject.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzd(i, loyaltywalletobject, offerwalletobject, giftcardwalletobject);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzd[i];
    }
}
