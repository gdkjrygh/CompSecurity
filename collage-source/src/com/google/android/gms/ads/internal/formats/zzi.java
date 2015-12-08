// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            NativeAdOptionsParcel

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void zza(NativeAdOptionsParcel nativeadoptionsparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, nativeadoptionsparcel.versionCode);
        b.a(parcel, 2, nativeadoptionsparcel.zzwn);
        b.a(parcel, 3, nativeadoptionsparcel.zzwo);
        b.a(parcel, 4, nativeadoptionsparcel.zzwp);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzf(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzp(i);
    }

    public NativeAdOptionsParcel zzf(Parcel parcel)
    {
        boolean flag1 = false;
        int k = a.b(parcel);
        int j = 0;
        boolean flag = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = a.a(parcel);
                switch (a.a(l))
                {
                default:
                    a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = a.d(parcel, l);
                    break;

                case 2: // '\002'
                    flag = a.c(parcel, l);
                    break;

                case 3: // '\003'
                    j = a.d(parcel, l);
                    break;

                case 4: // '\004'
                    flag1 = a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new NativeAdOptionsParcel(i, flag, j, flag1);
            }
        } while (true);
    }

    public NativeAdOptionsParcel[] zzp(int i)
    {
        return new NativeAdOptionsParcel[i];
    }
}
