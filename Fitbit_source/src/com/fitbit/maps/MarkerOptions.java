// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.fitbit.maps:
//            LatLng, a

public class MarkerOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private com.google.android.gms.maps.model.MarkerOptions a;

    public MarkerOptions()
    {
        this(new com.google.android.gms.maps.model.MarkerOptions());
    }

    public MarkerOptions(com.google.android.gms.maps.model.MarkerOptions markeroptions)
    {
        a = markeroptions;
    }

    public MarkerOptions a(float f1)
    {
        a = a.a(f1);
        return this;
    }

    public MarkerOptions a(float f1, float f2)
    {
        a = a.a(f1, f2);
        return this;
    }

    public MarkerOptions a(LatLng latlng)
    {
        a = a.a(latlng.a());
        return this;
    }

    public MarkerOptions a(a a1)
    {
        a = a.a(a1.a());
        return this;
    }

    public MarkerOptions a(String s)
    {
        a = a.a(s);
        return this;
    }

    public MarkerOptions a(boolean flag)
    {
        a = a.a(flag);
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions a()
    {
        return a;
    }

    public LatLng b()
    {
        return new LatLng(a.c());
    }

    public MarkerOptions b(float f1)
    {
        a = a.b(f1);
        return this;
    }

    public MarkerOptions b(float f1, float f2)
    {
        a = a.b(f1, f2);
        return this;
    }

    public MarkerOptions b(String s)
    {
        a = a.b(s);
        return this;
    }

    public MarkerOptions b(boolean flag)
    {
        a = a.b(flag);
        return this;
    }

    public MarkerOptions c(boolean flag)
    {
        a = a.c(flag);
        return this;
    }

    public String c()
    {
        return a.d();
    }

    public String d()
    {
        return a.e();
    }

    public int describeContents()
    {
        return a.describeContents();
    }

    public a e()
    {
        return new a(a.f());
    }

    public float f()
    {
        return a.g();
    }

    public float g()
    {
        return a.h();
    }

    public boolean h()
    {
        return a.i();
    }

    public boolean i()
    {
        return a.j();
    }

    public boolean j()
    {
        return a.k();
    }

    public float k()
    {
        return a.l();
    }

    public float l()
    {
        return a.m();
    }

    public float m()
    {
        return a.n();
    }

    public float n()
    {
        return a.o();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeParcelable(a, i1);
    }


    /* member class not found */
    class _cls1 {}

}
