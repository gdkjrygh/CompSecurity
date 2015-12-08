// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.maps:
//            LatLng

public class PolylineOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private com.google.android.gms.maps.model.PolylineOptions a;

    public PolylineOptions()
    {
        this(new com.google.android.gms.maps.model.PolylineOptions());
    }

    public PolylineOptions(com.google.android.gms.maps.model.PolylineOptions polylineoptions)
    {
        a = polylineoptions;
    }

    public PolylineOptions a(float f1)
    {
        a = a.a(f1);
        return this;
    }

    public PolylineOptions a(int i)
    {
        a = a.a(i);
        return this;
    }

    public PolylineOptions a(com.fitbit.maps.LatLng latlng)
    {
        a = a.a(latlng.a());
        return this;
    }

    public PolylineOptions a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); a((com.fitbit.maps.LatLng)iterable.next())) { }
        return this;
    }

    public PolylineOptions a(boolean flag)
    {
        a = a.a(flag);
        return this;
    }

    public transient PolylineOptions a(com.fitbit.maps.LatLng alatlng[])
    {
        a(((Iterable) (Arrays.asList(alatlng))));
        return this;
    }

    public com.google.android.gms.maps.model.PolylineOptions a()
    {
        return a;
    }

    public PolylineOptions b(float f1)
    {
        a = a.b(f1);
        return this;
    }

    public PolylineOptions b(boolean flag)
    {
        a = a.b(flag);
        return this;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.b().iterator(); iterator.hasNext(); arraylist.add(new com.fitbit.maps.LatLng((LatLng)iterator.next()))) { }
        return arraylist;
    }

    public float c()
    {
        return a.c();
    }

    public int d()
    {
        return a.d();
    }

    public int describeContents()
    {
        return a.describeContents();
    }

    public float e()
    {
        return a.e();
    }

    public boolean f()
    {
        return a.f();
    }

    public boolean g()
    {
        return a.g();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }


    /* member class not found */
    class _cls1 {}

}
