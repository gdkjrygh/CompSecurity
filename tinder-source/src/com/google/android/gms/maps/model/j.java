// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptions, LatLng

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(PolygonOptions polygonoptions, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, polygonoptions.a);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 2, polygonoptions.b);
        java.util.List list = polygonoptions.c;
        if (list != null)
        {
            int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3);
            parcel.writeList(list);
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, polygonoptions.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, polygonoptions.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, polygonoptions.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, polygonoptions.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, polygonoptions.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, polygonoptions.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int i1 = zza.a(parcel);
        ArrayList arraylist = null;
        ArrayList arraylist1 = new ArrayList();
        boolean flag1 = false;
        int i = 0;
        int k = 0;
        float f1 = 0.0F;
        int l = 0;
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
                zza.b(parcel, j1);
                break;

            case 1: // '\001'
                l = zza.e(parcel, j1);
                break;

            case 2: // '\002'
                arraylist = zza.c(parcel, j1, LatLng.CREATOR);
                break;

            case 3: // '\003'
                ClassLoader classloader = getClass().getClassLoader();
                j1 = zza.a(parcel, j1);
                int k1 = parcel.dataPosition();
                if (j1 != 0)
                {
                    parcel.readList(arraylist1, classloader);
                    parcel.setDataPosition(j1 + k1);
                }
                break;

            case 4: // '\004'
                f1 = zza.i(parcel, j1);
                break;

            case 5: // '\005'
                k = zza.e(parcel, j1);
                break;

            case 6: // '\006'
                i = zza.e(parcel, j1);
                break;

            case 7: // '\007'
                f = zza.i(parcel, j1);
                break;

            case 8: // '\b'
                flag1 = zza.c(parcel, j1);
                break;

            case 9: // '\t'
                flag = zza.c(parcel, j1);
                break;
            }
        } while (true);
        if (parcel.dataPosition() != i1)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
        } else
        {
            return new PolygonOptions(l, arraylist, arraylist1, f1, k, i, f, flag1, flag);
        }
    }

    public final Object[] newArray(int i)
    {
        return new PolygonOptions[i];
    }
}
