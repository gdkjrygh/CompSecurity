// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptions, LatLng

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(PolygonOptions polygonoptions, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, polygonoptions.a());
        b.c(parcel, 2, polygonoptions.c());
        b.a(parcel, polygonoptions.b());
        b.a(parcel, 4, polygonoptions.d());
        b.a(parcel, 5, polygonoptions.e());
        b.a(parcel, 6, polygonoptions.f());
        b.a(parcel, 7, polygonoptions.g());
        b.a(parcel, 8, polygonoptions.h());
        b.a(parcel, 9, polygonoptions.i());
        b.a(parcel, i);
    }

    public final PolygonOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        ArrayList arraylist = null;
        ArrayList arraylist1 = new ArrayList();
        boolean flag1 = false;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() >= i1)
            {
                break;
            }
            int j1 = parcel.readInt();
            switch (0xffff & j1)
            {
            default:
                com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                break;

            case 1: // '\001'
                k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                break;

            case 2: // '\002'
                arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, LatLng.CREATOR);
                break;

            case 3: // '\003'
                ClassLoader classloader = getClass().getClassLoader();
                j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1);
                int k1 = parcel.dataPosition();
                if (j1 != 0)
                {
                    parcel.readList(arraylist1, classloader);
                    parcel.setDataPosition(j1 + k1);
                }
                break;

            case 4: // '\004'
                f1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                break;

            case 5: // '\005'
                j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                break;

            case 6: // '\006'
                i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                break;

            case 7: // '\007'
                f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                break;

            case 8: // '\b'
                flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                break;

            case 9: // '\t'
                flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                break;
            }
        } while (true);
        if (parcel.dataPosition() != i1)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
        } else
        {
            return new PolygonOptions(k, arraylist, arraylist1, f1, j, i, f, flag1, flag);
        }
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new PolygonOptions[i];
    }
}
