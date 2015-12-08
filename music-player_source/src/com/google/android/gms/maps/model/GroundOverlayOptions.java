// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            e, a, LatLng, LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final e a = new e();
    private final int b;
    private a c;
    private LatLng d;
    private float e;
    private float f;
    private LatLngBounds g;
    private float h;
    private float i;
    private boolean j;
    private float k;
    private float l;
    private float m;

    public GroundOverlayOptions()
    {
        j = true;
        k = 0.0F;
        l = 0.5F;
        m = 0.5F;
        b = 1;
    }

    GroundOverlayOptions(int i1, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        j = true;
        k = 0.0F;
        l = 0.5F;
        m = 0.5F;
        b = i1;
        c = new a(com.google.android.gms.a.d.a(ibinder));
        d = latlng;
        e = f1;
        f = f2;
        g = latlngbounds;
        h = f3;
        i = f4;
        j = flag;
        k = f5;
        l = f6;
        m = f7;
    }

    final IBinder a()
    {
        return c.a().asBinder();
    }

    final int b()
    {
        return b;
    }

    public final LatLng c()
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

    public final float e()
    {
        return f;
    }

    public final LatLngBounds f()
    {
        return g;
    }

    public final float g()
    {
        return h;
    }

    public final float h()
    {
        return i;
    }

    public final float i()
    {
        return k;
    }

    public final float j()
    {
        return l;
    }

    public final float k()
    {
        return m;
    }

    public final boolean l()
    {
        return j;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a());
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d, i1, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, f);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, g, i1, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, h);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, j);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, k);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, l);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, m);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
            return;
        } else
        {
            com.google.android.gms.maps.model.e.a(this, parcel, i1);
            return;
        }
    }

}
