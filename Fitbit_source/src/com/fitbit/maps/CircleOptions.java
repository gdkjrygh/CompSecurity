// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.fitbit.maps:
//            LatLng

public class CircleOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private com.google.android.gms.maps.model.CircleOptions a;

    public CircleOptions()
    {
        this(new com.google.android.gms.maps.model.CircleOptions());
    }

    public CircleOptions(com.google.android.gms.maps.model.CircleOptions circleoptions)
    {
        a = circleoptions;
    }

    public CircleOptions a(double d1)
    {
        a = a.a(d1);
        return this;
    }

    public CircleOptions a(float f1)
    {
        a = a.a(f1);
        return this;
    }

    public CircleOptions a(int i)
    {
        a = a.a(i);
        return this;
    }

    public CircleOptions a(LatLng latlng)
    {
        a = a.a(latlng.a());
        return this;
    }

    public CircleOptions a(boolean flag)
    {
        a = a.a(flag);
        return this;
    }

    public com.google.android.gms.maps.model.CircleOptions a()
    {
        return a;
    }

    public CircleOptions b(float f1)
    {
        a = a.b(f1);
        return this;
    }

    public CircleOptions b(int i)
    {
        a = a.b(i);
        return this;
    }

    public LatLng b()
    {
        return new LatLng(a.b());
    }

    public double c()
    {
        return a.c();
    }

    public float d()
    {
        return a.d();
    }

    public int describeContents()
    {
        return a.describeContents();
    }

    public int e()
    {
        return a.e();
    }

    public int f()
    {
        return a.f();
    }

    public float g()
    {
        return a.g();
    }

    public boolean h()
    {
        return a.h();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }


    /* member class not found */
    class _cls1 {}

}
