// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.graphics.Point;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.internal:
//            Point

public class zzz
    implements android.os.Parcelable.Creator
{

    public zzz()
    {
    }

    static void a(com.google.android.gms.maps.internal.Point point, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, point.a());
        zzb.a(parcel, 2, point.b(), i, false);
        zzb.a(parcel, j);
    }

    public com.google.android.gms.maps.internal.Point a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        Point point = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    point = (Point)zza.a(parcel, k, Point.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new com.google.android.gms.maps.internal.Point(i, point);
            }
        } while (true);
    }

    public com.google.android.gms.maps.internal.Point[] a(int i)
    {
        return new com.google.android.gms.maps.internal.Point[i];
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
