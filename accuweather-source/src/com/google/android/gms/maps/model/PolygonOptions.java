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
//            PolygonOptionsCreator, LatLng, g

public final class PolygonOptions
    implements SafeParcelable
{

    public static final PolygonOptionsCreator CREATOR = new PolygonOptionsCreator();
    private final List aaU;
    private final List aaV;
    private boolean aaW;
    private float aar;
    private int aas;
    private int aat;
    private float aau;
    private boolean aav;
    private final int xJ;

    public PolygonOptions()
    {
        aar = 10F;
        aas = 0xff000000;
        aat = 0;
        aau = 0.0F;
        aav = true;
        aaW = false;
        xJ = 1;
        aaU = new ArrayList();
        aaV = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        aar = 10F;
        aas = 0xff000000;
        aat = 0;
        aau = 0.0F;
        aav = true;
        aaW = false;
        xJ = i;
        aaU = list;
        aaV = list1;
        aar = f;
        aas = j;
        aat = k;
        aau = f1;
        aav = flag;
        aaW = flag1;
    }

    public PolygonOptions add(LatLng latlng)
    {
        aaU.add(latlng);
        return this;
    }

    public transient PolygonOptions add(LatLng alatlng[])
    {
        aaU.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolygonOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); aaU.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolygonOptions addHole(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next())) { }
        aaV.add(arraylist);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolygonOptions fillColor(int i)
    {
        aat = i;
        return this;
    }

    public PolygonOptions geodesic(boolean flag)
    {
        aaW = flag;
        return this;
    }

    public int getFillColor()
    {
        return aat;
    }

    public List getHoles()
    {
        return aaV;
    }

    public List getPoints()
    {
        return aaU;
    }

    public int getStrokeColor()
    {
        return aas;
    }

    public float getStrokeWidth()
    {
        return aar;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public float getZIndex()
    {
        return aau;
    }

    public boolean isGeodesic()
    {
        return aaW;
    }

    public boolean isVisible()
    {
        return aav;
    }

    List jK()
    {
        return aaV;
    }

    public PolygonOptions strokeColor(int i)
    {
        aas = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f)
    {
        aar = f;
        return this;
    }

    public PolygonOptions visible(boolean flag)
    {
        aav = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jG())
        {
            g.a(this, parcel, i);
            return;
        } else
        {
            PolygonOptionsCreator.a(this, parcel, i);
            return;
        }
    }

    public PolygonOptions zIndex(float f)
    {
        aau = f;
        return this;
    }

}
