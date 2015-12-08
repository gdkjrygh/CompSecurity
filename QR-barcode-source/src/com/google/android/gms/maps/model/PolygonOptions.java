// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            m, LatLng, n

public final class PolygonOptions
    implements SafeParcelable
{

    public static final m CREATOR = new m();
    private final int BR;
    private float ajI;
    private int ajJ;
    private int ajK;
    private float ajL;
    private boolean ajM;
    private final List akl;
    private final List akm;
    private boolean akn;

    public PolygonOptions()
    {
        ajI = 10F;
        ajJ = 0xff000000;
        ajK = 0;
        ajL = 0.0F;
        ajM = true;
        akn = false;
        BR = 1;
        akl = new ArrayList();
        akm = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        ajI = 10F;
        ajJ = 0xff000000;
        ajK = 0;
        ajL = 0.0F;
        ajM = true;
        akn = false;
        BR = i;
        akl = list;
        akm = list1;
        ajI = f;
        ajJ = j;
        ajK = k;
        ajL = f1;
        ajM = flag;
        akn = flag1;
    }

    public PolygonOptions add(LatLng latlng)
    {
        akl.add(latlng);
        return this;
    }

    public transient PolygonOptions add(LatLng alatlng[])
    {
        akl.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolygonOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); akl.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolygonOptions addHole(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next())) { }
        akm.add(arraylist);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolygonOptions fillColor(int i)
    {
        ajK = i;
        return this;
    }

    public PolygonOptions geodesic(boolean flag)
    {
        akn = flag;
        return this;
    }

    public int getFillColor()
    {
        return ajK;
    }

    public List getHoles()
    {
        return akm;
    }

    public List getPoints()
    {
        return akl;
    }

    public int getStrokeColor()
    {
        return ajJ;
    }

    public float getStrokeWidth()
    {
        return ajI;
    }

    int getVersionCode()
    {
        return BR;
    }

    public float getZIndex()
    {
        return ajL;
    }

    public boolean isGeodesic()
    {
        return akn;
    }

    public boolean isVisible()
    {
        return ajM;
    }

    List mQ()
    {
        return akm;
    }

    public PolygonOptions strokeColor(int i)
    {
        ajJ = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f)
    {
        ajI = f;
        return this;
    }

    public PolygonOptions visible(boolean flag)
    {
        ajM = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.mM())
        {
            n.a(this, parcel, i);
            return;
        } else
        {
            m.a(this, parcel, i);
            return;
        }
    }

    public PolygonOptions zIndex(float f)
    {
        ajL = f;
        return this;
    }

}
