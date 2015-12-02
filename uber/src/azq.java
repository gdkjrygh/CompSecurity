// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

public final class azq
    implements android.os.Parcelable.Creator
{

    public azq()
    {
    }

    public static PolylineOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int k = up.b(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        float f1 = 0.0F;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = up.a(parcel);
                switch (up.a(l))
                {
                default:
                    up.a(parcel, l);
                    break;

                case 1: // '\001'
                    j = up.e(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist = up.c(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f1 = up.i(parcel, l);
                    break;

                case 4: // '\004'
                    i = up.e(parcel, l);
                    break;

                case 5: // '\005'
                    f = up.i(parcel, l);
                    break;

                case 6: // '\006'
                    flag1 = up.b(parcel, l);
                    break;

                case 7: // '\007'
                    flag = up.b(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PolylineOptions(j, arraylist, f1, i, f, flag1, flag);
            }
        } while (true);
    }

    public static void a(PolylineOptions polylineoptions, Parcel parcel)
    {
        int i = ur.a(parcel);
        ur.a(parcel, 1, polylineoptions.a());
        ur.b(parcel, 2, polylineoptions.b(), false);
        ur.a(parcel, 3, polylineoptions.c());
        ur.a(parcel, 4, polylineoptions.d());
        ur.a(parcel, 5, polylineoptions.e());
        ur.a(parcel, 6, polylineoptions.f());
        ur.a(parcel, 7, polylineoptions.g());
        ur.a(parcel, i);
    }

    private static PolylineOptions[] a(int i)
    {
        return new PolylineOptions[i];
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
