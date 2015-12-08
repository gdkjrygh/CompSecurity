// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

public final class joe
    implements android.os.Parcelable.Creator
{

    public joe()
    {
    }

    public static AdSizeParcel a(Parcel parcel)
    {
        AdSizeParcel aadsizeparcel[] = null;
        boolean flag = false;
        int j1 = b.b(parcel);
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
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    b.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = b.e(parcel, k1);
                    break;

                case 2: // '\002'
                    s = b.i(parcel, k1);
                    break;

                case 3: // '\003'
                    l = b.e(parcel, k1);
                    break;

                case 4: // '\004'
                    k = b.e(parcel, k1);
                    break;

                case 5: // '\005'
                    flag1 = b.c(parcel, k1);
                    break;

                case 6: // '\006'
                    j = b.e(parcel, k1);
                    break;

                case 7: // '\007'
                    i = b.e(parcel, k1);
                    break;

                case 8: // '\b'
                    aadsizeparcel = (AdSizeParcel[])b.b(parcel, k1, AdSizeParcel.CREATOR);
                    break;

                case 9: // '\t'
                    flag = b.c(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new AdSizeParcel(i1, s, l, k, flag1, j, i, aadsizeparcel, flag);
            }
        } while (true);
    }

    public static void a(AdSizeParcel adsizeparcel, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, adsizeparcel.a);
        b.a(parcel, 2, adsizeparcel.b, false);
        b.c(parcel, 3, adsizeparcel.c);
        b.c(parcel, 4, adsizeparcel.d);
        b.a(parcel, 5, adsizeparcel.e);
        b.c(parcel, 6, adsizeparcel.f);
        b.c(parcel, 7, adsizeparcel.g);
        b.a(parcel, 8, adsizeparcel.h, i, false);
        b.a(parcel, 9, adsizeparcel.i);
        b.r(parcel, j);
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
