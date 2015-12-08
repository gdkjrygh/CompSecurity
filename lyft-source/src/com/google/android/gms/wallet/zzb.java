// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            Cart, LineItem

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(Cart cart, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, cart.a());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, cart.a, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, cart.b, false);
        com.google.android.gms.common.internal.safeparcel.zzb.c(parcel, 4, cart.c, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, i);
    }

    public Cart a(Parcel parcel)
    {
        String s1 = null;
        int j = zza.b(parcel);
        int i = 0;
        ArrayList arraylist = new ArrayList();
        String s = null;
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
                    s = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = zza.c(parcel, k, LineItem.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new Cart(i, s, s1, arraylist);
            }
        } while (true);
    }

    public Cart[] a(int i)
    {
        return new Cart[i];
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
