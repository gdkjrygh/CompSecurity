// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

// Referenced classes of package com.google.android.gms.wallet:
//            GiftCardWalletObject

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void a(GiftCardWalletObject giftcardwalletobject, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, giftcardwalletobject.a());
        zzb.a(parcel, 2, giftcardwalletobject.b, i, false);
        zzb.a(parcel, 3, giftcardwalletobject.c, false);
        zzb.a(parcel, 4, giftcardwalletobject.d, false);
        zzb.a(parcel, 5, giftcardwalletobject.e, false);
        zzb.a(parcel, 6, giftcardwalletobject.f);
        zzb.a(parcel, 7, giftcardwalletobject.g, false);
        zzb.a(parcel, 8, giftcardwalletobject.h);
        zzb.a(parcel, 9, giftcardwalletobject.i, false);
        zzb.a(parcel, j);
    }

    public GiftCardWalletObject a(Parcel parcel)
    {
        long l = 0L;
        String s = null;
        int j = zza.b(parcel);
        int i = 0;
        String s1 = null;
        long l1 = 0L;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        CommonWalletObject commonwalletobject = null;
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
                    commonwalletobject = (CommonWalletObject)zza.a(parcel, k, CommonWalletObject.CREATOR);
                    break;

                case 3: // '\003'
                    s4 = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    s3 = zza.m(parcel, k);
                    break;

                case 5: // '\005'
                    s2 = zza.m(parcel, k);
                    break;

                case 6: // '\006'
                    l1 = zza.h(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = zza.m(parcel, k);
                    break;

                case 8: // '\b'
                    l = zza.h(parcel, k);
                    break;

                case 9: // '\t'
                    s = zza.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GiftCardWalletObject(i, commonwalletobject, s4, s3, s2, l1, s1, l, s);
            }
        } while (true);
    }

    public GiftCardWalletObject[] a(int i)
    {
        return new GiftCardWalletObject[i];
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
