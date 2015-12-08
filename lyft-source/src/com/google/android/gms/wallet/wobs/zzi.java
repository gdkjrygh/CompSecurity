// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            WalletObjectMessage, TimeInterval, UriData

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void a(WalletObjectMessage walletobjectmessage, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, walletobjectmessage.a());
        zzb.a(parcel, 2, walletobjectmessage.a, false);
        zzb.a(parcel, 3, walletobjectmessage.b, false);
        zzb.a(parcel, 4, walletobjectmessage.c, i, false);
        zzb.a(parcel, 5, walletobjectmessage.d, i, false);
        zzb.a(parcel, 6, walletobjectmessage.e, i, false);
        zzb.a(parcel, j);
    }

    public WalletObjectMessage a(Parcel parcel)
    {
        UriData uridata = null;
        int j = zza.b(parcel);
        int i = 0;
        UriData uridata1 = null;
        TimeInterval timeinterval = null;
        String s = null;
        String s1 = null;
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
                    s1 = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    s = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    timeinterval = (TimeInterval)zza.a(parcel, k, TimeInterval.CREATOR);
                    break;

                case 5: // '\005'
                    uridata1 = (UriData)zza.a(parcel, k, UriData.CREATOR);
                    break;

                case 6: // '\006'
                    uridata = (UriData)zza.a(parcel, k, UriData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new WalletObjectMessage(i, s1, s, timeinterval, uridata1, uridata);
            }
        } while (true);
    }

    public WalletObjectMessage[] a(int i)
    {
        return new WalletObjectMessage[i];
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
