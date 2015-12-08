// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.places.PlaceReport;

public final class lhx
    implements android.os.Parcelable.Creator
{

    public lhx()
    {
    }

    public static void a(PlaceReport placereport, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, placereport.a);
        b.a(parcel, 2, placereport.b, false);
        b.a(parcel, 3, placereport.c, false);
        b.a(parcel, 4, placereport.d, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s2 = null;
        int j = b.b(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
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
                    s = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceReport(i, s, s1, s2);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlaceReport[i];
    }
}
