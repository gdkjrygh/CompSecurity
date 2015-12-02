// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

public final class azk
    implements android.os.Parcelable.Creator
{

    public azk()
    {
    }

    public static CircleOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = up.b(parcel);
        LatLng latlng = null;
        double d = 0.0D;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = up.a(parcel);
                switch (up.a(i1))
                {
                default:
                    up.a(parcel, i1);
                    break;

                case 1: // '\001'
                    k = up.e(parcel, i1);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)up.a(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    d = up.j(parcel, i1);
                    break;

                case 4: // '\004'
                    f1 = up.i(parcel, i1);
                    break;

                case 5: // '\005'
                    j = up.e(parcel, i1);
                    break;

                case 6: // '\006'
                    i = up.e(parcel, i1);
                    break;

                case 7: // '\007'
                    f = up.i(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = up.b(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new CircleOptions(k, latlng, d, f1, j, i, f, flag);
            }
        } while (true);
    }

    public static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, circleoptions.a());
        ur.a(parcel, 2, circleoptions.b(), i, false);
        ur.a(parcel, 3, circleoptions.c());
        ur.a(parcel, 4, circleoptions.d());
        ur.a(parcel, 5, circleoptions.e());
        ur.a(parcel, 6, circleoptions.f());
        ur.a(parcel, 7, circleoptions.g());
        ur.a(parcel, 8, circleoptions.h());
        ur.a(parcel, j);
    }

    private static CircleOptions[] a(int i)
    {
        return new CircleOptions[i];
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
