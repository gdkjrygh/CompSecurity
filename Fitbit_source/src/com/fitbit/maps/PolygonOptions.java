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

public class PolygonOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private com.google.android.gms.maps.model.PolygonOptions a;

    public PolygonOptions(com.google.android.gms.maps.model.PolygonOptions polygonoptions)
    {
        a = polygonoptions;
    }

    public PolygonOptions a(float f1)
    {
        a = a.a(f1);
        return this;
    }

    public PolygonOptions a(int j)
    {
        a = a.a(j);
        return this;
    }

    public PolygonOptions a(com.fitbit.maps.LatLng latlng)
    {
        a = a.a(latlng.a());
        return this;
    }

    public PolygonOptions a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); a((com.fitbit.maps.LatLng)iterable.next())) { }
        return this;
    }

    public PolygonOptions a(boolean flag)
    {
        a = a.a(flag);
        return this;
    }

    public transient PolygonOptions a(com.fitbit.maps.LatLng alatlng[])
    {
        a(((Iterable) (Arrays.asList(alatlng))));
        return this;
    }

    public com.google.android.gms.maps.model.PolygonOptions a()
    {
        return a;
    }

    public PolygonOptions b(float f1)
    {
        a = a.b(f1);
        return this;
    }

    public PolygonOptions b(int j)
    {
        a = a.b(j);
        return this;
    }

    public PolygonOptions b(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(((com.fitbit.maps.LatLng)iterable.next()).a())) { }
        a = a.b(arraylist);
        return this;
    }

    public PolygonOptions b(boolean flag)
    {
        a = a.b(flag);
        return this;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.c().iterator(); iterator.hasNext(); arraylist.add(new com.fitbit.maps.LatLng((LatLng)iterator.next()))) { }
        return arraylist;
    }

    public List c()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1;
        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); arraylist.add(arraylist1))
        {
            Object obj = (List)iterator.next();
            arraylist1 = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist1.add(new com.fitbit.maps.LatLng((LatLng)((Iterator) (obj)).next()))) { }
        }

        return arraylist;
    }

    public float d()
    {
        return a.e();
    }

    public int describeContents()
    {
        return a.describeContents();
    }

    public int e()
    {
        return a.f();
    }

    public int f()
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

    public void writeToParcel(Parcel parcel, int j)
    {
        a.writeToParcel(parcel, j);
    }


    /* member class not found */
    class _cls1 {}

}
