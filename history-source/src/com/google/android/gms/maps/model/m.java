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

public class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    static void a(PolygonOptions polygonoptions, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, polygonoptions.getVersionCode());
        b.c(parcel, 2, polygonoptions.getPoints(), false);
        b.d(parcel, 3, polygonoptions.of(), false);
        b.a(parcel, 4, polygonoptions.getStrokeWidth());
        b.c(parcel, 5, polygonoptions.getStrokeColor());
        b.c(parcel, 6, polygonoptions.getFillColor());
        b.a(parcel, 7, polygonoptions.getZIndex());
        b.a(parcel, 8, polygonoptions.isVisible());
        b.a(parcel, 9, polygonoptions.isGeodesic());
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dg(parcel);
    }

    public PolygonOptions dg(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
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
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, arraylist1, getClass().getClassLoader());
                    break;

                case 4: // '\004'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 8: // '\b'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new PolygonOptions(k, arraylist, arraylist1, f1, j, i, f, flag1, flag);
            }
        } while (true);
    }

    public PolygonOptions[] fc(int i)
    {
        return new PolygonOptions[i];
    }

    public Object[] newArray(int i)
    {
        return fc(i);
    }
}
