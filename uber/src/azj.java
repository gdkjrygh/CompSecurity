// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public final class azj
    implements android.os.Parcelable.Creator
{

    public azj()
    {
    }

    public static CameraPosition a(Parcel parcel)
    {
        float f = 0.0F;
        int j = up.b(parcel);
        int i = 0;
        LatLng latlng = null;
        float f1 = 0.0F;
        float f2 = 0.0F;
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
                    latlng = (LatLng)up.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f2 = up.i(parcel, k);
                    break;

                case 4: // '\004'
                    f1 = up.i(parcel, k);
                    break;

                case 5: // '\005'
                    f = up.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CameraPosition(i, latlng, f2, f1, f);
            }
        } while (true);
    }

    public static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, cameraposition.a());
        ur.a(parcel, 2, cameraposition.a, i, false);
        ur.a(parcel, 3, cameraposition.b);
        ur.a(parcel, 4, cameraposition.c);
        ur.a(parcel, 5, cameraposition.d);
        ur.a(parcel, j);
    }

    private static CameraPosition[] a(int i)
    {
        return new CameraPosition[i];
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
