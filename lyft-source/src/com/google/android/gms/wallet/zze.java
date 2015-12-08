// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWallet, ProxyCard, Address, InstrumentInfo, 
//            PaymentMethodToken

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(FullWallet fullwallet, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, fullwallet.a());
        zzb.a(parcel, 2, fullwallet.a, false);
        zzb.a(parcel, 3, fullwallet.b, false);
        zzb.a(parcel, 4, fullwallet.c, i, false);
        zzb.a(parcel, 5, fullwallet.d, false);
        zzb.a(parcel, 6, fullwallet.e, i, false);
        zzb.a(parcel, 7, fullwallet.f, i, false);
        zzb.a(parcel, 8, fullwallet.g, false);
        zzb.a(parcel, 9, fullwallet.h, i, false);
        zzb.a(parcel, 10, fullwallet.i, i, false);
        zzb.a(parcel, 11, fullwallet.j, i, false);
        zzb.a(parcel, 12, fullwallet.k, i, false);
        zzb.a(parcel, j);
    }

    public FullWallet a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        String s2 = null;
        String s1 = null;
        ProxyCard proxycard = null;
        String s = null;
        Address address1 = null;
        Address address = null;
        String as[] = null;
        UserAddress useraddress1 = null;
        UserAddress useraddress = null;
        InstrumentInfo ainstrumentinfo[] = null;
        PaymentMethodToken paymentmethodtoken = null;
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
                    s2 = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    proxycard = (ProxyCard)zza.a(parcel, k, ProxyCard.CREATOR);
                    break;

                case 5: // '\005'
                    s = zza.m(parcel, k);
                    break;

                case 6: // '\006'
                    address1 = (Address)zza.a(parcel, k, Address.CREATOR);
                    break;

                case 7: // '\007'
                    address = (Address)zza.a(parcel, k, Address.CREATOR);
                    break;

                case 8: // '\b'
                    as = zza.y(parcel, k);
                    break;

                case 9: // '\t'
                    useraddress1 = (UserAddress)zza.a(parcel, k, UserAddress.CREATOR);
                    break;

                case 10: // '\n'
                    useraddress = (UserAddress)zza.a(parcel, k, UserAddress.CREATOR);
                    break;

                case 11: // '\013'
                    ainstrumentinfo = (InstrumentInfo[])zza.b(parcel, k, InstrumentInfo.CREATOR);
                    break;

                case 12: // '\f'
                    paymentmethodtoken = (PaymentMethodToken)zza.a(parcel, k, PaymentMethodToken.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FullWallet(i, s2, s1, proxycard, s, address1, address, as, useraddress1, useraddress, ainstrumentinfo, paymentmethodtoken);
            }
        } while (true);
    }

    public FullWallet[] a(int i)
    {
        return new FullWallet[i];
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
