// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            WalletObjectMessage, TimeInterval, UriData

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(WalletObjectMessage walletobjectmessage, Parcel parcel, int j)
    {
        int k = b.bU(parcel);
        b.c(parcel, 1, walletobjectmessage.getVersionCode());
        b.a(parcel, 2, walletobjectmessage.aVY, false);
        b.a(parcel, 3, walletobjectmessage.tU, false);
        b.a(parcel, 4, walletobjectmessage.aWb, j, false);
        b.a(parcel, 5, walletobjectmessage.aWc, j, false);
        b.a(parcel, 6, walletobjectmessage.aWd, j, false);
        b.J(parcel, k);
    }

    private static WalletObjectMessage iC(Parcel parcel)
    {
        UriData uridata = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int j = 0;
        UriData uridata1 = null;
        TimeInterval timeinterval = null;
        String s = null;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 4: // '\004'
                    timeinterval = (TimeInterval)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, TimeInterval.CREATOR);
                    break;

                case 5: // '\005'
                    uridata1 = (UriData)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, UriData.CREATOR);
                    break;

                case 6: // '\006'
                    uridata = (UriData)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, UriData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new WalletObjectMessage(j, s1, s, timeinterval, uridata1, uridata);
            }
        } while (true);
    }

    private static WalletObjectMessage[] lC(int j)
    {
        return new WalletObjectMessage[j];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return iC(parcel);
    }

    public final Object[] newArray(int j)
    {
        return lC(j);
    }
}
