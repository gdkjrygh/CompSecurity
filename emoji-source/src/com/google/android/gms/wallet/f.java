// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWallet, ProxyCard, Address, InstrumentInfo

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(FullWallet fullwallet, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, fullwallet.getVersionCode());
        b.a(parcel, 2, fullwallet.aiQ, false);
        b.a(parcel, 3, fullwallet.aiR, false);
        b.a(parcel, 4, fullwallet.aiS, i, false);
        b.a(parcel, 5, fullwallet.aiT, false);
        b.a(parcel, 6, fullwallet.aiU, i, false);
        b.a(parcel, 7, fullwallet.aiV, i, false);
        b.a(parcel, 8, fullwallet.aiW, false);
        b.a(parcel, 9, fullwallet.aiX, i, false);
        b.a(parcel, 10, fullwallet.aiY, i, false);
        b.a(parcel, 11, fullwallet.aiZ, i, false);
        b.G(parcel, j);
    }

    public FullWallet bU(Parcel parcel)
    {
        InstrumentInfo ainstrumentinfo[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        UserAddress useraddress = null;
        UserAddress useraddress1 = null;
        String as[] = null;
        Address address = null;
        Address address1 = null;
        String s = null;
        ProxyCard proxycard = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    proxycard = (ProxyCard)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ProxyCard.CREATOR);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    address1 = (Address)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Address.CREATOR);
                    break;

                case 7: // '\007'
                    address = (Address)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Address.CREATOR);
                    break;

                case 8: // '\b'
                    as = com.google.android.gms.common.internal.safeparcel.a.A(parcel, k);
                    break;

                case 9: // '\t'
                    useraddress1 = (UserAddress)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, UserAddress.CREATOR);
                    break;

                case 10: // '\n'
                    useraddress = (UserAddress)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, UserAddress.CREATOR);
                    break;

                case 11: // '\013'
                    ainstrumentinfo = (InstrumentInfo[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, InstrumentInfo.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FullWallet(i, s2, s1, proxycard, s, address1, address, as, useraddress1, useraddress, ainstrumentinfo);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bU(parcel);
    }

    public FullWallet[] dA(int i)
    {
        return new FullWallet[i];
    }

    public Object[] newArray(int i)
    {
        return dA(i);
    }
}
