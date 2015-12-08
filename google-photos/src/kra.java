// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public final class kra
    implements android.os.Parcelable.Creator
{

    public kra()
    {
    }

    public static void a(PredictedNetworkQuality predictednetworkquality, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, predictednetworkquality.a);
        b.c(parcel, 2, predictednetworkquality.b);
        b.c(parcel, 3, predictednetworkquality.c);
        b.a(parcel, 4, predictednetworkquality.d);
        b.a(parcel, 5, predictednetworkquality.e);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int l = b.b(parcel);
        long l2 = 0L;
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
                    i = b.e(parcel, i1);
                    break;

                case 4: // '\004'
                    l2 = b.f(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = b.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new PredictedNetworkQuality(k, j, i, l2, l1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PredictedNetworkQuality[i];
    }
}
