// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(FullWalletRequest fullwalletrequest, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, fullwalletrequest.getVersionCode());
        b.a(parcel, 2, fullwalletrequest.aiQ, false);
        b.a(parcel, 3, fullwalletrequest.aiR, false);
        b.a(parcel, 4, fullwalletrequest.aja, i, false);
        b.G(parcel, j);
    }

    public FullWalletRequest bV(Parcel parcel)
    {
        Cart cart = null;
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
                    cart = (Cart)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Cart.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FullWalletRequest(i, s, s1, cart);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bV(parcel);
    }

    public FullWalletRequest[] dB(int i)
    {
        return new FullWalletRequest[i];
    }

    public Object[] newArray(int i)
    {
        return dB(i);
    }
}
