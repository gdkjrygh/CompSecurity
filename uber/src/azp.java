// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;

public final class azp
    implements android.os.Parcelable.Creator
{

    public azp()
    {
    }

    public static void a(PolygonOptions polygonoptions, Parcel parcel)
    {
        int i = ur.a(parcel);
        ur.a(parcel, 1, polygonoptions.a());
        ur.b(parcel, 2, polygonoptions.c(), false);
        ur.a(parcel, polygonoptions.b());
        ur.a(parcel, 4, polygonoptions.d());
        ur.a(parcel, 5, polygonoptions.e());
        ur.a(parcel, 6, polygonoptions.f());
        ur.a(parcel, 7, polygonoptions.g());
        ur.a(parcel, 8, polygonoptions.h());
        ur.a(parcel, 9, polygonoptions.i());
        ur.a(parcel, i);
    }

    private static PolygonOptions[] a(int i)
    {
        return new PolygonOptions[i];
    }

    public final PolygonOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = up.b(parcel);
        ArrayList arraylist = null;
        ArrayList arraylist1 = new ArrayList();
        boolean flag1 = false;
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
                    arraylist = up.c(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    up.a(parcel, i1, arraylist1, getClass().getClassLoader());
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
                    flag1 = up.b(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = up.b(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new PolygonOptions(k, arraylist, arraylist1, f1, j, i, f, flag1, flag);
            }
        } while (true);
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
