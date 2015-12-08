// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;

public final class jos
    implements android.os.Parcelable.Creator
{

    public jos()
    {
    }

    public static NativeAdOptionsParcel a(Parcel parcel)
    {
        boolean flag1 = false;
        int k = b.b(parcel);
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
                    b.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, l);
                    break;

                case 2: // '\002'
                    flag = b.c(parcel, l);
                    break;

                case 3: // '\003'
                    j = b.e(parcel, l);
                    break;

                case 4: // '\004'
                    flag1 = b.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NativeAdOptionsParcel(i, flag, j, flag1);
            }
        } while (true);
    }

    public static void a(NativeAdOptionsParcel nativeadoptionsparcel, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, nativeadoptionsparcel.a);
        b.a(parcel, 2, nativeadoptionsparcel.b);
        b.c(parcel, 3, nativeadoptionsparcel.c);
        b.a(parcel, 4, nativeadoptionsparcel.d);
        b.r(parcel, i);
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
