// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.aa;
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
    private final int CK;
    private float alU;
    private int alV;
    private int alW;
    private float alX;
    private boolean alY;
    private final List amx;
    private final List amy;
    private boolean amz;

    public PolygonOptions()
    {
        alU = 10F;
        alV = 0xff000000;
        alW = 0;
        alX = 0.0F;
        alY = true;
        amz = false;
        CK = 1;
        amx = new ArrayList();
        amy = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        alU = 10F;
        alV = 0xff000000;
        alW = 0;
        alX = 0.0F;
        alY = true;
        amz = false;
        CK = i;
        amx = list;
        amy = list1;
        alU = f;
        alV = j;
        alW = k;
        alX = f1;
        alY = flag;
        amz = flag1;
    }

    public PolygonOptions add(LatLng latlng)
    {
        amx.add(latlng);
        return this;
    }

    public transient PolygonOptions add(LatLng alatlng[])
    {
        amx.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolygonOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); amx.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolygonOptions addHole(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next())) { }
        amy.add(arraylist);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolygonOptions fillColor(int i)
    {
        alW = i;
        return this;
    }

    public PolygonOptions geodesic(boolean flag)
    {
        amz = flag;
        return this;
    }

    public int getFillColor()
    {
        return alW;
    }

    public List getHoles()
    {
        return amy;
    }

    public List getPoints()
    {
        return amx;
    }

    public int getStrokeColor()
    {
        return alV;
    }

    public float getStrokeWidth()
    {
        return alU;
    }

    int getVersionCode()
    {
        return CK;
    }

    public float getZIndex()
    {
        return alX;
    }

    public boolean isGeodesic()
    {
        return amz;
    }

    public boolean isVisible()
    {
        return alY;
    }

    List of()
    {
        return amy;
    }

    public PolygonOptions strokeColor(int i)
    {
        alV = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f)
    {
        alU = f;
        return this;
    }

    public PolygonOptions visible(boolean flag)
    {
        alY = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (aa.ob())
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
        alX = f;
        return this;
    }

}
