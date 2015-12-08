// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

// Referenced classes of package com.google.android.gms.wallet:
//            OfferWalletObject

public class zzn
    implements android.os.Parcelable.Creator
{

    public zzn()
    {
    }

    static void a(OfferWalletObject offerwalletobject, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, offerwalletobject.a());
        zzb.a(parcel, 2, offerwalletobject.a, false);
        zzb.a(parcel, 3, offerwalletobject.b, false);
        zzb.a(parcel, 4, offerwalletobject.c, i, false);
        zzb.a(parcel, j);
    }

    public OfferWalletObject a(Parcel parcel)
    {
        CommonWalletObject commonwalletobject = null;
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
                    commonwalletobject = (CommonWalletObject)zza.a(parcel, k, CommonWalletObject.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OfferWalletObject(i, s, s1, commonwalletobject);
            }
        } while (true);
    }

    public OfferWalletObject[] a(int i)
    {
        return new OfferWalletObject[i];
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
