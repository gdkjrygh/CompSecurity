// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            Cart, LineItem

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(Cart cart, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.bU(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, cart.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, cart.aTf, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, cart.aTg, false);
        com.google.android.gms.common.internal.safeparcel.b.d(parcel, 4, cart.aTh, false);
        com.google.android.gms.common.internal.safeparcel.b.J(parcel, i);
    }

    private static Cart hX(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        ArrayList arraylist = new ArrayList();
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, LineItem.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Cart(i, s, s1, arraylist);
            }
        } while (true);
    }

    private static Cart[] kS(int i)
    {
        return new Cart[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return hX(parcel);
    }

    public final Object[] newArray(int i)
    {
        return kS(i);
    }
}
