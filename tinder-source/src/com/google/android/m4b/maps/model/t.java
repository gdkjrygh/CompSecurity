// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;
import com.google.android.m4b.maps.model.internal.o;

// Referenced classes of package com.google.android.m4b.maps.model:
//            TileOverlayOptions

public final class t
    implements android.os.Parcelable.Creator
{

    public t()
    {
    }

    public static TileOverlayOptions a(Parcel parcel)
    {
        boolean flag1 = false;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag = true;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.m4b.maps.k.a.e(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.m4b.maps.k.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    f = com.google.android.m4b.maps.k.a.g(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(i, ibinder, flag1, f, flag);
            }
        } while (true);
    }

    static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, tileoverlayoptions.a);
        b.a(parcel, 2, tileoverlayoptions.b.asBinder());
        b.a(parcel, 3, tileoverlayoptions.d);
        b.a(parcel, 4, tileoverlayoptions.e);
        b.a(parcel, 5, tileoverlayoptions.f);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TileOverlayOptions[i];
    }
}
