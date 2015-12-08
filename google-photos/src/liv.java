// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public final class liv
    implements android.os.Parcelable.Creator
{

    public liv()
    {
    }

    public static void a(LatLng latlng, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, latlng.a);
        b.a(parcel, 2, latlng.b);
        b.a(parcel, 3, latlng.c);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        double d = 0.0D;
        int j = b.b(parcel);
        int i = 0;
        double d1 = 0.0D;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    d1 = b.h(parcel, k);
                    break;

                case 3: // '\003'
                    d = b.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LatLng(i, d1, d);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LatLng[i];
    }
}
