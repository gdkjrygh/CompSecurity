// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(AdSizeParcel adsizeparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, adsizeparcel.versionCode);
        b.a(parcel, 2, adsizeparcel.zzsG, false);
        b.a(parcel, 3, adsizeparcel.height);
        b.a(parcel, 4, adsizeparcel.heightPixels);
        b.a(parcel, 5, adsizeparcel.zzsH);
        b.a(parcel, 6, adsizeparcel.width);
        b.a(parcel, 7, adsizeparcel.widthPixels);
        b.a(parcel, 8, adsizeparcel.zzsI, i, false);
        b.a(parcel, 9, adsizeparcel.zzsJ);
        b.a(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzc(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzl(i);
    }

    public AdSizeParcel zzc(Parcel parcel)
    {
        AdSizeParcel aadsizeparcel[] = null;
        boolean flag = false;
        int j1 = a.b(parcel);
        int i = 0;
        int j = 0;
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        String s = null;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = a.a(parcel);
                switch (a.a(k1))
                {
                default:
                    a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = a.d(parcel, k1);
                    break;

                case 2: // '\002'
                    s = a.g(parcel, k1);
                    break;

                case 3: // '\003'
                    l = a.d(parcel, k1);
                    break;

                case 4: // '\004'
                    k = a.d(parcel, k1);
                    break;

                case 5: // '\005'
                    flag1 = a.c(parcel, k1);
                    break;

                case 6: // '\006'
                    j = a.d(parcel, k1);
                    break;

                case 7: // '\007'
                    i = a.d(parcel, k1);
                    break;

                case 8: // '\b'
                    aadsizeparcel = (AdSizeParcel[])a.b(parcel, k1, AdSizeParcel.CREATOR);
                    break;

                case 9: // '\t'
                    flag = a.c(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            } else
            {
                return new AdSizeParcel(i1, s, l, k, flag1, j, i, aadsizeparcel, flag);
            }
        } while (true);
    }

    public AdSizeParcel[] zzl(int i)
    {
        return new AdSizeParcel[i];
    }
}
