// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.herrevad.NetworkQualityReport;

public final class kqz
    implements android.os.Parcelable.Creator
{

    public kqz()
    {
    }

    public static void a(NetworkQualityReport networkqualityreport, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, networkqualityreport.a);
        b.c(parcel, 2, networkqualityreport.b);
        b.a(parcel, 3, networkqualityreport.c);
        b.a(parcel, 4, networkqualityreport.d);
        b.a(parcel, 5, networkqualityreport.e);
        b.c(parcel, 6, networkqualityreport.f);
        b.a(parcel, 7, networkqualityreport.g, false);
        b.a(parcel, 8, networkqualityreport.h);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        boolean flag = false;
        int l = b.b(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        long l2 = 0L;
        long l3 = 0L;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    b.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = b.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = b.e(parcel, i1);
                    break;

                case 3: // '\003'
                    l3 = b.f(parcel, i1);
                    break;

                case 4: // '\004'
                    l2 = b.f(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = b.f(parcel, i1);
                    break;

                case 6: // '\006'
                    i = b.e(parcel, i1);
                    break;

                case 7: // '\007'
                    bundle = b.k(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = b.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new NetworkQualityReport(k, j, l3, l2, l1, i, bundle, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new NetworkQualityReport[i];
    }
}
