// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.fitbit.maps:
//            LatLng, LatLngBounds, a

public class GroundOverlayOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private com.google.android.gms.maps.model.GroundOverlayOptions a;

    public GroundOverlayOptions(com.google.android.gms.maps.model.GroundOverlayOptions groundoverlayoptions)
    {
        a = groundoverlayoptions;
    }

    public GroundOverlayOptions a(float f1)
    {
        a = a.a(f1);
        return this;
    }

    public GroundOverlayOptions a(float f1, float f2)
    {
        a = a.a(f1, f2);
        return this;
    }

    public GroundOverlayOptions a(LatLng latlng, float f1)
    {
        a = a.a(latlng.a(), f1);
        return this;
    }

    public GroundOverlayOptions a(LatLng latlng, float f1, float f2)
    {
        a = a.a(latlng.a(), f1, f2);
        return this;
    }

    public GroundOverlayOptions a(LatLngBounds latlngbounds)
    {
        a = a.a(latlngbounds.a());
        return this;
    }

    public GroundOverlayOptions a(a a1)
    {
        a = a.a(a1.a());
        return this;
    }

    public GroundOverlayOptions a(boolean flag)
    {
        a = a.a(flag);
        return this;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions a()
    {
        return a;
    }

    public GroundOverlayOptions b(float f1)
    {
        a = a.b(f1);
        return this;
    }

    public a b()
    {
        return new a(a.c());
    }

    public GroundOverlayOptions c(float f1)
    {
        a = a.c(f1);
        return this;
    }

    public LatLng c()
    {
        return new LatLng(a.d());
    }

    public float d()
    {
        return a.e();
    }

    public int describeContents()
    {
        return a.describeContents();
    }

    public float e()
    {
        return a.f();
    }

    public LatLngBounds f()
    {
        return new LatLngBounds(a.g());
    }

    public float g()
    {
        return a.h();
    }

    public float h()
    {
        return a.i();
    }

    public float i()
    {
        return a.j();
    }

    public float j()
    {
        return a.k();
    }

    public float k()
    {
        return a.l();
    }

    public boolean l()
    {
        return a.m();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        a.writeToParcel(parcel, i1);
    }


    /* member class not found */
    class _cls1 {}

}
