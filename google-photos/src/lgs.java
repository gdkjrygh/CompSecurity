// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;

public final class lgs
    implements android.os.Parcelable.Creator
{

    public lgs()
    {
    }

    public static LocationAvailability a(Parcel parcel)
    {
        int i = 1;
        int i1 = b.b(parcel);
        int l = 0;
        int k = 1000;
        long l1 = 0L;
        int j = 1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    b.b(parcel, j1);
                    break;

                case 1: // '\001'
                    j = b.e(parcel, j1);
                    break;

                case 1000: 
                    l = b.e(parcel, j1);
                    break;

                case 2: // '\002'
                    i = b.e(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = b.f(parcel, j1);
                    break;

                case 4: // '\004'
                    k = b.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new LocationAvailability(l, k, j, i, l1);
            }
        } while (true);
    }

    public static void a(LocationAvailability locationavailability, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, locationavailability.b);
        b.c(parcel, 1000, locationavailability.a);
        b.c(parcel, 2, locationavailability.c);
        b.a(parcel, 3, locationavailability.d);
        b.c(parcel, 4, locationavailability.e);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new LocationAvailability[i];
    }
}
