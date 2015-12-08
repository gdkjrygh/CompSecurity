// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptions, LatLng

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(PolygonOptions polygonoptions, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, polygonoptions.a());
        c.c(parcel, 2, polygonoptions.c());
        c.a(parcel, polygonoptions.b());
        c.a(parcel, 4, polygonoptions.d());
        c.a(parcel, 5, polygonoptions.e());
        c.a(parcel, 6, polygonoptions.f());
        c.a(parcel, 7, polygonoptions.g());
        c.a(parcel, 8, polygonoptions.h());
        c.a(parcel, 9, polygonoptions.i());
        c.a(parcel, i);
    }

    public final PolygonOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        ArrayList arraylist = null;
        ArrayList arraylist1 = new ArrayList();
        boolean flag1 = false;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() >= l)
            {
                break;
            }
            int i1 = parcel.readInt();
            switch (0xffff & i1)
            {
            default:
                com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                break;

            case 1: // '\001'
                k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                break;

            case 2: // '\002'
                arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, LatLng.CREATOR);
                break;

            case 3: // '\003'
                ClassLoader classloader = getClass().getClassLoader();
                i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1);
                int j1 = parcel.dataPosition();
                if (i1 != 0)
                {
                    parcel.readList(arraylist1, classloader);
                    parcel.setDataPosition(i1 + j1);
                }
                break;

            case 4: // '\004'
                f1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                break;

            case 5: // '\005'
                j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                break;

            case 6: // '\006'
                i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                break;

            case 7: // '\007'
                f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                break;

            case 8: // '\b'
                flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                break;

            case 9: // '\t'
                flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                break;
            }
        } while (true);
        if (parcel.dataPosition() != l)
        {
            throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
