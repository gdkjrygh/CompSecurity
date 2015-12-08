// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void a(FullWalletRequest fullwalletrequest, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, fullwalletrequest.b());
        zzb.a(parcel, 2, fullwalletrequest.a, false);
        zzb.a(parcel, 3, fullwalletrequest.b, false);
        zzb.a(parcel, 4, fullwalletrequest.c, i, false);
        zzb.a(parcel, j);
    }

    public FullWalletRequest a(Parcel parcel)
    {
        Cart cart = null;
        int j = zza.b(parcel);
        int i = 0;
        String s1 = null;
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
                    cart = (Cart)zza.a(parcel, k, Cart.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FullWalletRequest(i, s, s1, cart);
            }
        } while (true);
    }

    public FullWalletRequest[] a(int i)
    {
        return new FullWalletRequest[i];
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
