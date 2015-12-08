// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWallet, Address, LoyaltyWalletObject, OfferWalletObject, 
//            InstrumentInfo

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void a(MaskedWallet maskedwallet, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, maskedwallet.a());
        zzb.a(parcel, 2, maskedwallet.a, false);
        zzb.a(parcel, 3, maskedwallet.b, false);
        zzb.a(parcel, 4, maskedwallet.c, false);
        zzb.a(parcel, 5, maskedwallet.d, false);
        zzb.a(parcel, 6, maskedwallet.e, i, false);
        zzb.a(parcel, 7, maskedwallet.f, i, false);
        zzb.a(parcel, 8, maskedwallet.g, i, false);
        zzb.a(parcel, 9, maskedwallet.h, i, false);
        zzb.a(parcel, 10, maskedwallet.i, i, false);
        zzb.a(parcel, 11, maskedwallet.j, i, false);
        zzb.a(parcel, 12, maskedwallet.k, i, false);
        zzb.a(parcel, j);
    }

    public MaskedWallet a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        String s2 = null;
        String s1 = null;
        String as[] = null;
        String s = null;
        Address address1 = null;
        Address address = null;
        LoyaltyWalletObject aloyaltywalletobject[] = null;
        OfferWalletObject aofferwalletobject[] = null;
        UserAddress useraddress1 = null;
        UserAddress useraddress = null;
        InstrumentInfo ainstrumentinfo[] = null;
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
                    as = zza.y(parcel, k);
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
                    aloyaltywalletobject = (LoyaltyWalletObject[])zza.b(parcel, k, LoyaltyWalletObject.CREATOR);
                    break;

                case 9: // '\t'
                    aofferwalletobject = (OfferWalletObject[])zza.b(parcel, k, OfferWalletObject.CREATOR);
                    break;

                case 10: // '\n'
                    useraddress1 = (UserAddress)zza.a(parcel, k, UserAddress.CREATOR);
                    break;

                case 11: // '\013'
                    useraddress = (UserAddress)zza.a(parcel, k, UserAddress.CREATOR);
                    break;

                case 12: // '\f'
                    ainstrumentinfo = (InstrumentInfo[])zza.b(parcel, k, InstrumentInfo.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MaskedWallet(i, s2, s1, as, s, address1, address, aloyaltywalletobject, aofferwalletobject, useraddress1, useraddress, ainstrumentinfo);
            }
        } while (true);
    }

    public MaskedWallet[] a(int i)
    {
        return new MaskedWallet[i];
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
