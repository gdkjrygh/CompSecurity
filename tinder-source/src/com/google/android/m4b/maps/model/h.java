// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            MapsEngineLayerInfo

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    public static MapsEngineLayerInfo a(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MapsEngineLayerInfo(i, s3, s2, s1, flag, s);
            }
        } while (true);
    }

    static void a(MapsEngineLayerInfo mapsenginelayerinfo, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, mapsenginelayerinfo.a);
        b.a(parcel, 2, mapsenginelayerinfo.b);
        b.a(parcel, 3, mapsenginelayerinfo.c);
        b.a(parcel, 4, mapsenginelayerinfo.d);
        b.a(parcel, 5, mapsenginelayerinfo.e);
        b.a(parcel, 6, mapsenginelayerinfo.f);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new MapsEngineLayerInfo[i];
    }
}
