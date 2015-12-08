// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptions, LatLng

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void a(PolygonOptions polygonoptions, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, polygonoptions.a());
        zzb.c(parcel, 2, polygonoptions.c(), false);
        zzb.d(parcel, 3, polygonoptions.b(), false);
        zzb.a(parcel, 4, polygonoptions.d());
        zzb.a(parcel, 5, polygonoptions.e());
        zzb.a(parcel, 6, polygonoptions.f());
        zzb.a(parcel, 7, polygonoptions.g());
        zzb.a(parcel, 8, polygonoptions.h());
        zzb.a(parcel, 9, polygonoptions.i());
        zzb.a(parcel, i);
    }

    public PolygonOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = zza.b(parcel);
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
                int i1 = zza.a(parcel);
                switch (zza.a(i1))
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist = zza.c(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    zza.a(parcel, i1, arraylist1, getClass().getClassLoader());
                    break;

                case 4: // '\004'
                    f1 = zza.j(parcel, i1);
                    break;

                case 5: // '\005'
                    j = zza.f(parcel, i1);
                    break;

                case 6: // '\006'
                    i = zza.f(parcel, i1);
                    break;

                case 7: // '\007'
                    f = zza.j(parcel, i1);
                    break;

                case 8: // '\b'
                    flag1 = zza.c(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = zza.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new PolygonOptions(k, arraylist, arraylist1, f1, j, i, f, flag1, flag);
            }
        } while (true);
    }

    public PolygonOptions[] a(int i)
    {
        return new PolygonOptions[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
