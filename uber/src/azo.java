// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public final class azo
    implements android.os.Parcelable.Creator
{

    public azo()
    {
    }

    public static MarkerOptions a(Parcel parcel)
    {
        int j = up.b(parcel);
        int i = 0;
        LatLng latlng = null;
        String s1 = null;
        String s = null;
        android.os.IBinder ibinder = null;
        float f5 = 0.0F;
        float f4 = 0.0F;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        float f3 = 0.0F;
        float f2 = 0.5F;
        float f1 = 0.0F;
        float f = 1.0F;
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
                    s1 = up.l(parcel, k);
                    break;

                case 4: // '\004'
                    s = up.l(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = up.m(parcel, k);
                    break;

                case 6: // '\006'
                    f5 = up.i(parcel, k);
                    break;

                case 7: // '\007'
                    f4 = up.i(parcel, k);
                    break;

                case 8: // '\b'
                    flag2 = up.b(parcel, k);
                    break;

                case 9: // '\t'
                    flag1 = up.b(parcel, k);
                    break;

                case 10: // '\n'
                    flag = up.b(parcel, k);
                    break;

                case 11: // '\013'
                    f3 = up.i(parcel, k);
                    break;

                case 12: // '\f'
                    f2 = up.i(parcel, k);
                    break;

                case 13: // '\r'
                    f1 = up.i(parcel, k);
                    break;

                case 14: // '\016'
                    f = up.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MarkerOptions(i, latlng, s1, s, ibinder, f5, f4, flag2, flag1, flag, f3, f2, f1, f);
            }
        } while (true);
    }

    public static void a(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, markeroptions.a());
        ur.a(parcel, 2, markeroptions.c(), i, false);
        ur.a(parcel, 3, markeroptions.d(), false);
        ur.a(parcel, 4, markeroptions.e(), false);
        ur.a(parcel, 5, markeroptions.b());
        ur.a(parcel, 6, markeroptions.f());
        ur.a(parcel, 7, markeroptions.g());
        ur.a(parcel, 8, markeroptions.h());
        ur.a(parcel, 9, markeroptions.i());
        ur.a(parcel, 10, markeroptions.j());
        ur.a(parcel, 11, markeroptions.k());
        ur.a(parcel, 12, markeroptions.l());
        ur.a(parcel, 13, markeroptions.m());
        ur.a(parcel, 14, markeroptions.n());
        ur.a(parcel, j);
    }

    private static MarkerOptions[] a(int i)
    {
        return new MarkerOptions[i];
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
