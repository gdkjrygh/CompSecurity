// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            NativeAdOptionsParcel

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    public static NativeAdOptionsParcel a(Parcel parcel)
    {
        boolean flag1 = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = 0;
        boolean flag = false;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new NativeAdOptionsParcel(j, flag, k, flag1);
            }
        } while (true);
    }

    static void a(NativeAdOptionsParcel nativeadoptionsparcel, Parcel parcel)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, nativeadoptionsparcel.a);
        b.a(parcel, 2, nativeadoptionsparcel.b);
        b.a(parcel, 3, nativeadoptionsparcel.c);
        b.a(parcel, 4, nativeadoptionsparcel.d);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int j)
    {
        return new NativeAdOptionsParcel[j];
    }
}
