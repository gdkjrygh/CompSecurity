// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class azr
    implements android.os.Parcelable.Creator
{

    public azr()
    {
    }

    public static StreetViewPanoramaCamera a(Parcel parcel)
    {
        float f2 = 0.0F;
        int j = up.b(parcel);
        float f = 0.0F;
        int i = 0;
        float f1 = 0.0F;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = up.a(parcel);
                switch (up.a(k))
                {
                default:
                    up.a(parcel, k);
                    break;

                case 1: // '\001'
                    i = up.e(parcel, k);
                    break;

                case 2: // '\002'
                    f = up.i(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = up.i(parcel, k);
                    break;

                case 4: // '\004'
                    f2 = up.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaCamera(i, f, f1, f2);
            }
        } while (true);
    }

    public static void a(StreetViewPanoramaCamera streetviewpanoramacamera, Parcel parcel)
    {
        int i = ur.a(parcel);
        ur.a(parcel, 1, streetviewpanoramacamera.a());
        ur.a(parcel, 2, streetviewpanoramacamera.a);
        ur.a(parcel, 3, streetviewpanoramacamera.b);
        ur.a(parcel, 4, streetviewpanoramacamera.c);
        ur.a(parcel, i);
    }

    private static StreetViewPanoramaCamera[] a(int i)
    {
        return new StreetViewPanoramaCamera[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }
}
