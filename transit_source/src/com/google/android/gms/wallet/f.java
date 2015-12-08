// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            LoyaltyWalletObject

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(LoyaltyWalletObject loyaltywalletobject, Parcel parcel, int i)
    {
        i = b.k(parcel);
        b.c(parcel, 1, loyaltywalletobject.getVersionCode());
        b.a(parcel, 2, loyaltywalletobject.tU, false);
        b.a(parcel, 3, loyaltywalletobject.tV, false);
        b.a(parcel, 4, loyaltywalletobject.tW, false);
        b.a(parcel, 5, loyaltywalletobject.tX, false);
        b.a(parcel, 6, loyaltywalletobject.tY, false);
        b.C(parcel, i);
    }

    public LoyaltyWalletObject S(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LoyaltyWalletObject(i, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public LoyaltyWalletObject[] ax(int i)
    {
        return new LoyaltyWalletObject[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return S(parcel);
    }

    public Object[] newArray(int i)
    {
        return ax(i);
    }
}
