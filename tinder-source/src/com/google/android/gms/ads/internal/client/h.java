// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    public static AdSizeParcel a(Parcel parcel)
    {
        AdSizeParcel aadsizeparcel[] = null;
        boolean flag = false;
        int j1 = zza.a(parcel);
        boolean flag1 = false;
        int i = 0;
        int j = 0;
        boolean flag2 = false;
        int k = 0;
        int l = 0;
        String s = null;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    zza.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = zza.e(parcel, k1);
                    break;

                case 2: // '\002'
                    s = zza.l(parcel, k1);
                    break;

                case 3: // '\003'
                    l = zza.e(parcel, k1);
                    break;

                case 4: // '\004'
                    k = zza.e(parcel, k1);
                    break;

                case 5: // '\005'
                    flag2 = zza.c(parcel, k1);
                    break;

                case 6: // '\006'
                    j = zza.e(parcel, k1);
                    break;

                case 7: // '\007'
                    i = zza.e(parcel, k1);
                    break;

                case 8: // '\b'
                    aadsizeparcel = (AdSizeParcel[])zza.b(parcel, k1, AdSizeParcel.CREATOR);
                    break;

                case 9: // '\t'
                    flag1 = zza.c(parcel, k1);
                    break;

                case 10: // '\n'
                    flag = zza.c(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new AdSizeParcel(i1, s, l, k, flag2, j, i, aadsizeparcel, flag1, flag);
            }
        } while (true);
    }

    static void a(AdSizeParcel adsizeparcel, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, adsizeparcel.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, adsizeparcel.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, adsizeparcel.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, adsizeparcel.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, adsizeparcel.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, adsizeparcel.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, adsizeparcel.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, adsizeparcel.h, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, adsizeparcel.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, adsizeparcel.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new AdSizeParcel[i];
    }
}
