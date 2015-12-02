// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.TileOverlayOptions;

public final class azw
    implements android.os.Parcelable.Creator
{

    public azw()
    {
    }

    public static TileOverlayOptions a(Parcel parcel)
    {
        boolean flag1 = false;
        int j = up.b(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag = true;
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
                    flag1 = up.b(parcel, k);
                    break;

                case 4: // '\004'
                    f = up.i(parcel, k);
                    break;

                case 5: // '\005'
                    flag = up.b(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(i, ibinder, flag1, f, flag);
            }
        } while (true);
    }

    public static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel)
    {
        int i = ur.a(parcel);
        ur.a(parcel, 1, tileoverlayoptions.a());
        ur.a(parcel, 2, tileoverlayoptions.b());
        ur.a(parcel, 3, tileoverlayoptions.d());
        ur.a(parcel, 4, tileoverlayoptions.c());
        ur.a(parcel, 5, tileoverlayoptions.e());
        ur.a(parcel, i);
    }

    private static TileOverlayOptions[] a(int i)
    {
        return new TileOverlayOptions[i];
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
