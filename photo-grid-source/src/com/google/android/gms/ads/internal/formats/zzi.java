// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            NativeAdOptionsParcel

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void a(NativeAdOptionsParcel nativeadoptionsparcel, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, nativeadoptionsparcel.versionCode);
        c.a(parcel, 2, nativeadoptionsparcel.zzwR);
        c.a(parcel, 3, nativeadoptionsparcel.zzwS);
        c.a(parcel, 4, nativeadoptionsparcel.zzwT);
        c.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zze(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzo(i);
    }

    public NativeAdOptionsParcel zze(Parcel parcel)
    {
        boolean flag1 = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        boolean flag = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NativeAdOptionsParcel(i, flag, j, flag1);
            }
        } while (true);
    }

    public NativeAdOptionsParcel[] zzo(int i)
    {
        return new NativeAdOptionsParcel[i];
    }
}
