// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.CountrySpecification;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWalletRequest, Cart, CountrySpecification

public class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(MaskedWalletRequest maskedwalletrequest, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, maskedwalletrequest.getVersionCode());
        b.a(parcel, 2, maskedwalletrequest.abi, false);
        b.a(parcel, 3, maskedwalletrequest.abV);
        b.a(parcel, 4, maskedwalletrequest.abW);
        b.a(parcel, 5, maskedwalletrequest.abX);
        b.a(parcel, 6, maskedwalletrequest.abY, false);
        b.a(parcel, 7, maskedwalletrequest.abd, false);
        b.a(parcel, 8, maskedwalletrequest.abZ, false);
        b.a(parcel, 9, maskedwalletrequest.abr, i, false);
        b.a(parcel, 10, maskedwalletrequest.aca);
        b.a(parcel, 11, maskedwalletrequest.acb);
        b.a(parcel, 12, maskedwalletrequest.acc, i, false);
        b.a(parcel, 13, maskedwalletrequest.acd);
        b.a(parcel, 14, maskedwalletrequest.ace);
        b.b(parcel, 15, maskedwalletrequest.acf, false);
        b.F(parcel, j);
    }

    public MaskedWalletRequest bh(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        String s3 = null;
        boolean flag6 = false;
        boolean flag5 = false;
        boolean flag4 = false;
        String s2 = null;
        String s1 = null;
        String s = null;
        Cart cart = null;
        boolean flag3 = false;
        boolean flag2 = false;
        com.google.android.gms.wallet.CountrySpecification acountryspecification[] = null;
        boolean flag1 = true;
        boolean flag = true;
        java.util.ArrayList arraylist = null;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 3: // '\003'
                    flag6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 9: // '\t'
                    cart = (Cart)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Cart.CREATOR);
                    break;

                case 10: // '\n'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 11: // '\013'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 12: // '\f'
                    acountryspecification = (com.google.android.gms.wallet.CountrySpecification[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, CountrySpecification.CREATOR);
                    break;

                case 13: // '\r'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 14: // '\016'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 15: // '\017'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, CountrySpecification.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MaskedWalletRequest(i, s3, flag6, flag5, flag4, s2, s1, s, cart, flag3, flag2, acountryspecification, flag1, flag, arraylist);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bh(parcel);
    }

    public MaskedWalletRequest[] ct(int i)
    {
        return new MaskedWalletRequest[i];
    }

    public Object[] newArray(int i)
    {
        return ct(i);
    }
}
