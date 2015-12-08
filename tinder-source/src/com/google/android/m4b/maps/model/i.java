// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            MapsEngineLayerInfo, MapsEngineLayerOptions

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    public static MapsEngineLayerOptions a(Parcel parcel)
    {
        boolean flag = false;
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        MapsEngineLayerInfo mapsenginelayerinfo = null;
        float f = 0.0F;
        boolean flag1 = false;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    mapsenginelayerinfo = (MapsEngineLayerInfo)com.google.android.m4b.maps.k.a.a(parcel, l, MapsEngineLayerInfo.CREATOR);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.m4b.maps.k.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    f = com.google.android.m4b.maps.k.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new MapsEngineLayerOptions(j, mapsenginelayerinfo, flag1, f, flag);
            }
        } while (true);
    }

    static void a(MapsEngineLayerOptions mapsenginelayeroptions, Parcel parcel, int j)
    {
        int k = b.a(parcel, 20293);
        b.b(parcel, 1, mapsenginelayeroptions.a);
        b.a(parcel, 2, mapsenginelayeroptions.b, j);
        b.a(parcel, 3, mapsenginelayeroptions.c);
        b.a(parcel, 4, mapsenginelayeroptions.d);
        b.a(parcel, 5, mapsenginelayeroptions.e);
        b.b(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int j)
    {
        return new MapsEngineLayerOptions[j];
    }
}
