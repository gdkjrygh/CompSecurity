// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wallet:
//            OfferWalletObject

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(OfferWalletObject offerwalletobject, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, offerwalletobject.a());
        c.a(parcel, 2, offerwalletobject.a, false);
        c.a(parcel, 3, offerwalletobject.b, false);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new OfferWalletObject(i, s, s1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new OfferWalletObject[i];
    }
}
