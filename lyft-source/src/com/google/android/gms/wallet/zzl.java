// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.CountrySpecification;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWalletRequest, Cart, CountrySpecification, PaymentMethodTokenizationParameters

public class zzl
    implements android.os.Parcelable.Creator
{

    public zzl()
    {
    }

    static void a(MaskedWalletRequest maskedwalletrequest, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, maskedwalletrequest.b());
        zzb.a(parcel, 2, maskedwalletrequest.a, false);
        zzb.a(parcel, 3, maskedwalletrequest.b);
        zzb.a(parcel, 4, maskedwalletrequest.c);
        zzb.a(parcel, 5, maskedwalletrequest.d);
        zzb.a(parcel, 6, maskedwalletrequest.e, false);
        zzb.a(parcel, 7, maskedwalletrequest.f, false);
        zzb.a(parcel, 8, maskedwalletrequest.g, false);
        zzb.a(parcel, 9, maskedwalletrequest.h, i, false);
        zzb.a(parcel, 10, maskedwalletrequest.i);
        zzb.a(parcel, 11, maskedwalletrequest.j);
        zzb.a(parcel, 12, maskedwalletrequest.k, i, false);
        zzb.a(parcel, 13, maskedwalletrequest.l);
        zzb.a(parcel, 14, maskedwalletrequest.m);
        zzb.c(parcel, 15, maskedwalletrequest.n, false);
        zzb.a(parcel, 17, maskedwalletrequest.p, false);
        zzb.a(parcel, 16, maskedwalletrequest.o, i, false);
        zzb.a(parcel, j);
    }

    public MaskedWalletRequest a(Parcel parcel)
    {
        int j = zza.b(parcel);
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
        java.util.ArrayList arraylist1 = null;
        PaymentMethodTokenizationParameters paymentmethodtokenizationparameters = null;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    flag6 = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag5 = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag4 = zza.c(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = zza.m(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = zza.m(parcel, k);
                    break;

                case 8: // '\b'
                    s = zza.m(parcel, k);
                    break;

                case 9: // '\t'
                    cart = (Cart)zza.a(parcel, k, Cart.CREATOR);
                    break;

                case 10: // '\n'
                    flag3 = zza.c(parcel, k);
                    break;

                case 11: // '\013'
                    flag2 = zza.c(parcel, k);
                    break;

                case 12: // '\f'
                    acountryspecification = (com.google.android.gms.wallet.CountrySpecification[])zza.b(parcel, k, CountrySpecification.CREATOR);
                    break;

                case 13: // '\r'
                    flag1 = zza.c(parcel, k);
                    break;

                case 14: // '\016'
                    flag = zza.c(parcel, k);
                    break;

                case 15: // '\017'
                    arraylist1 = zza.c(parcel, k, CountrySpecification.CREATOR);
                    break;

                case 17: // '\021'
                    arraylist = zza.z(parcel, k);
                    break;

                case 16: // '\020'
                    paymentmethodtokenizationparameters = (PaymentMethodTokenizationParameters)zza.a(parcel, k, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MaskedWalletRequest(i, s3, flag6, flag5, flag4, s2, s1, s, cart, flag3, flag2, acountryspecification, flag1, flag, arraylist1, paymentmethodtokenizationparameters, arraylist);
            }
        } while (true);
    }

    public MaskedWalletRequest[] a(int i)
    {
        return new MaskedWalletRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
