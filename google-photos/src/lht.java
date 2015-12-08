// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.places.internal.PlaceLocalization;

public final class lht
    implements android.os.Parcelable.Creator
{

    public lht()
    {
    }

    public static void a(PlaceLocalization placelocalization, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, placelocalization.b, false);
        b.c(parcel, 1000, placelocalization.a);
        b.a(parcel, 2, placelocalization.c, false);
        b.a(parcel, 3, placelocalization.d, false);
        b.a(parcel, 4, placelocalization.e, false);
        b.b(parcel, 5, placelocalization.f, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = b.b(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = b.i(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    s = b.i(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist = b.p(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceLocalization(i, s3, s2, s1, s, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlaceLocalization[i];
    }
}
