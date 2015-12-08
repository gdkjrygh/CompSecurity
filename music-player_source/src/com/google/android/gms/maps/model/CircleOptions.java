// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            d, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final d a = new d();
    private final int b;
    private LatLng c;
    private double d;
    private float e;
    private int f;
    private int g;
    private float h;
    private boolean i;

    public CircleOptions()
    {
        c = null;
        d = 0.0D;
        e = 10F;
        f = 0xff000000;
        g = 0;
        h = 0.0F;
        i = true;
        b = 1;
    }

    CircleOptions(int j, LatLng latlng, double d1, float f1, int k, int l, 
            float f2, boolean flag)
    {
        c = null;
        d = 0.0D;
        e = 10F;
        f = 0xff000000;
        g = 0;
        h = 0.0F;
        i = true;
        b = j;
        c = latlng;
        d = d1;
        e = f1;
        f = k;
        g = l;
        h = f2;
        i = flag;
    }

    final int a()
    {
        return b;
    }

    public final LatLng b()
    {
        return c;
    }

    public final double c()
    {
        return d;
    }

    public final float d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return f;
    }

    public final int f()
    {
        return g;
    }

    public final float g()
    {
        return h;
    }

    public final boolean h()
    {
        return i;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            int k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, c, j, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, f);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, g);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, h);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
            return;
        } else
        {
            com.google.android.gms.maps.model.d.a(this, parcel, j);
            return;
        }
    }

}
