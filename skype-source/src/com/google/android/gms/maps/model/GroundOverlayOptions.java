// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            g, a, LatLng, LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    private final int a;
    private a b;
    private LatLng c;
    private float d;
    private float e;
    private LatLngBounds f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;

    public GroundOverlayOptions()
    {
        i = true;
        j = 0.0F;
        k = 0.5F;
        l = 0.5F;
        a = 1;
    }

    GroundOverlayOptions(int i1, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        i = true;
        j = 0.0F;
        k = 0.5F;
        l = 0.5F;
        a = i1;
        b = new a(com.google.android.gms.b.c.a.a(ibinder));
        c = latlng;
        d = f1;
        e = f2;
        f = latlngbounds;
        g = f3;
        h = f4;
        i = flag;
        j = f5;
        k = f6;
        l = f7;
    }

    final IBinder a()
    {
        return b.a().asBinder();
    }

    final int b()
    {
        return a;
    }

    public final LatLng c()
    {
        return c;
    }

    public final float d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final float e()
    {
        return e;
    }

    public final LatLngBounds f()
    {
        return f;
    }

    public final float g()
    {
        return g;
    }

    public final float h()
    {
        return h;
    }

    public final float i()
    {
        return j;
    }

    public final float j()
    {
        return k;
    }

    public final float k()
    {
        return l;
    }

    public final boolean l()
    {
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.maps.model.g.a(this, parcel, i1);
    }

}
