// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    public static AdSizeParcel a(Parcel parcel)
    {
        AdSizeParcel aadsizeparcel[] = null;
        boolean flag = false;
        int k1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        int j = 0;
        boolean flag1 = false;
        int l = 0;
        int i1 = 0;
        String s = null;
        int j1 = 0;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = parcel.readInt();
                switch (0xffff & l1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1);
                    break;

                case 1: // '\001'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    break;

                case 3: // '\003'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    break;

                case 5: // '\005'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    break;

                case 8: // '\b'
                    aadsizeparcel = (AdSizeParcel[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1, AdSizeParcel.CREATOR);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k1).toString(), parcel);
            } else
            {
                return new AdSizeParcel(j1, s, i1, l, flag1, j, i, aadsizeparcel, flag);
            }
        } while (true);
    }

    static void a(AdSizeParcel adsizeparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, adsizeparcel.a);
        b.a(parcel, 2, adsizeparcel.b);
        b.a(parcel, 3, adsizeparcel.c);
        b.a(parcel, 4, adsizeparcel.d);
        b.a(parcel, 5, adsizeparcel.e);
        b.a(parcel, 6, adsizeparcel.f);
        b.a(parcel, 7, adsizeparcel.g);
        b.a(parcel, 8, adsizeparcel.h, i);
        b.a(parcel, 9, adsizeparcel.i);
        b.a(parcel, j);
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
