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
//            y, LatLng, z

public final class PolygonOptions
    implements SafeParcelable
{

    public static final y CREATOR = new y();
    private final int a;
    private final List b;
    private final List c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;

    public PolygonOptions()
    {
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        i = false;
        a = 1;
        b = new ArrayList();
        c = new ArrayList();
    }

    PolygonOptions(int k, List list, List list1, float f1, int l, int i1, float f2, 
            boolean flag, boolean flag1)
    {
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        i = false;
        a = k;
        b = list;
        c = list1;
        d = f1;
        e = l;
        f = i1;
        g = f2;
        h = flag;
        i = flag1;
    }

    int a()
    {
        return a;
    }

    public PolygonOptions a(float f1)
    {
        d = f1;
        return this;
    }

    public PolygonOptions a(int k)
    {
        e = k;
        return this;
    }

    public PolygonOptions a(LatLng latlng)
    {
        b.add(latlng);
        return this;
    }

    public PolygonOptions a(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); b.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolygonOptions a(boolean flag)
    {
        h = flag;
        return this;
    }

    public transient PolygonOptions a(LatLng alatlng[])
    {
        b.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolygonOptions b(float f1)
    {
        g = f1;
        return this;
    }

    public PolygonOptions b(int k)
    {
        f = k;
        return this;
    }

    public PolygonOptions b(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next())) { }
        c.add(arraylist);
        return this;
    }

    public PolygonOptions b(boolean flag)
    {
        i = flag;
        return this;
    }

    List b()
    {
        return c;
    }

    public List c()
    {
        return b;
    }

    public List d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public float e()
    {
        return d;
    }

    public int f()
    {
        return e;
    }

    public int g()
    {
        return f;
    }

    public float h()
    {
        return g;
    }

    public boolean i()
    {
        return h;
    }

    public boolean j()
    {
        return i;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        if (n.a())
        {
            z.a(this, parcel, k);
            return;
        } else
        {
            y.a(this, parcel, k);
            return;
        }
    }

}
