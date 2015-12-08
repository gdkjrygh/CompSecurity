// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.location.LocationResult;

public final class lip
    implements android.os.Parcelable.Creator
{

    public lip()
    {
    }

    public static void a(LocationResult locationresult, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, locationresult.c, false);
        b.c(parcel, 1000, locationresult.b);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        int i = 0;
        Object obj = LocationResult.a;
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
                    obj = b.c(parcel, k, Location.CREATOR);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationResult(i, ((java.util.List) (obj)));
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LocationResult[i];
    }
}
