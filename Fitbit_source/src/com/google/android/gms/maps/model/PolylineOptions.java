// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            aa, LatLng, ab

public final class PolylineOptions
    implements SafeParcelable
{

    public static final aa CREATOR = new aa();
    private final int a;
    private final List b;
    private float c;
    private int d;
    private float e;
    private boolean f;
    private boolean g;

    public PolylineOptions()
    {
        c = 10F;
        d = 0xff000000;
        e = 0.0F;
        f = true;
        g = false;
        a = 1;
        b = new ArrayList();
    }

    PolylineOptions(int i, List list, float f1, int j, float f2, boolean flag, boolean flag1)
    {
        c = 10F;
        d = 0xff000000;
        e = 0.0F;
        f = true;
        g = false;
        a = i;
        b = list;
        c = f1;
        d = j;
        e = f2;
        f = flag;
        g = flag1;
    }

    int a()
    {
        return a;
    }

    public PolylineOptions a(float f1)
    {
        c = f1;
        return this;
    }

    public PolylineOptions a(int i)
    {
        d = i;
        return this;
    }

    public PolylineOptions a(LatLng latlng)
    {
        b.add(latlng);
        return this;
    }

    public PolylineOptions a(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); b.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolylineOptions a(boolean flag)
    {
        f = flag;
        return this;
    }

    public transient PolylineOptions a(LatLng alatlng[])
    {
        b.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolylineOptions b(float f1)
    {
        e = f1;
        return this;
    }

    public PolylineOptions b(boolean flag)
    {
        g = flag;
        return this;
    }

    public List b()
    {
        return b;
    }

    public float c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public float e()
    {
        return e;
    }

    public boolean f()
    {
        return f;
    }

    public boolean g()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (n.a())
        {
            ab.a(this, parcel, i);
            return;
        } else
        {
            aa.a(this, parcel, i);
            return;
        }
    }

}
