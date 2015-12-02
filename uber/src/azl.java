// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class azl
    implements android.os.Parcelable.Creator
{

    public azl()
    {
    }

    public static GroundOverlayOptions a(Parcel parcel)
    {
        boolean flag = false;
        LatLngBounds latlngbounds = null;
        float f = 0.0F;
        int j = up.b(parcel);
        float f1 = 0.0F;
        float f2 = 0.0F;
        float f3 = 0.0F;
        float f4 = 0.0F;
        float f5 = 0.0F;
        float f6 = 0.0F;
        LatLng latlng = null;
        android.os.IBinder ibinder = null;
        int i = 0;
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
                    ibinder = up.m(parcel, k);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    f6 = up.i(parcel, k);
                    break;

                case 5: // '\005'
                    f5 = up.i(parcel, k);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)up.a(parcel, k, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    f4 = up.i(parcel, k);
                    break;

                case 8: // '\b'
                    f3 = up.i(parcel, k);
                    break;

                case 9: // '\t'
                    flag = up.b(parcel, k);
                    break;

                case 10: // '\n'
                    f2 = up.i(parcel, k);
                    break;

                case 11: // '\013'
                    f1 = up.i(parcel, k);
                    break;

                case 12: // '\f'
                    f = up.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GroundOverlayOptions(i, ibinder, latlng, f6, f5, latlngbounds, f4, f3, flag, f2, f1, f);
            }
        } while (true);
    }

    public static void a(GroundOverlayOptions groundoverlayoptions, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, groundoverlayoptions.b());
        ur.a(parcel, 2, groundoverlayoptions.a());
        ur.a(parcel, 3, groundoverlayoptions.c(), i, false);
        ur.a(parcel, 4, groundoverlayoptions.d());
        ur.a(parcel, 5, groundoverlayoptions.e());
        ur.a(parcel, 6, groundoverlayoptions.f(), i, false);
        ur.a(parcel, 7, groundoverlayoptions.g());
        ur.a(parcel, 8, groundoverlayoptions.h());
        ur.a(parcel, 9, groundoverlayoptions.l());
        ur.a(parcel, 10, groundoverlayoptions.i());
        ur.a(parcel, 11, groundoverlayoptions.j());
        ur.a(parcel, 12, groundoverlayoptions.k());
        ur.a(parcel, j);
    }

    private static GroundOverlayOptions[] a(int i)
    {
        return new GroundOverlayOptions[i];
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
