// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bhi
    implements android.os.Parcelable.Creator
{

    public bhi()
    {
    }

    public static NativeAdOptionsParcel a(Parcel parcel)
    {
        boolean flag1 = false;
        int k = zza.a(parcel);
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
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    flag = zza.c(parcel, l);
                    break;

                case 3: // '\003'
                    j = zza.e(parcel, l);
                    break;

                case 4: // '\004'
                    flag1 = zza.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NativeAdOptionsParcel(i, flag, j, flag1);
            }
        } while (true);
    }

    public static void a(NativeAdOptionsParcel nativeadoptionsparcel, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, nativeadoptionsparcel.a);
        brp.a(parcel, 2, nativeadoptionsparcel.b);
        brp.b(parcel, 3, nativeadoptionsparcel.c);
        brp.a(parcel, 4, nativeadoptionsparcel.d);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new NativeAdOptionsParcel[i];
    }
}
