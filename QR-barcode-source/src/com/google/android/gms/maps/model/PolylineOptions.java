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
//            o, LatLng, p

public final class PolylineOptions
    implements SafeParcelable
{

    public static final o CREATOR = new o();
    private final int BR;
    private float ajL;
    private boolean ajM;
    private float ajQ;
    private final List akl;
    private boolean akn;
    private int mColor;

    public PolylineOptions()
    {
        ajQ = 10F;
        mColor = 0xff000000;
        ajL = 0.0F;
        ajM = true;
        akn = false;
        BR = 1;
        akl = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        ajQ = 10F;
        mColor = 0xff000000;
        ajL = 0.0F;
        ajM = true;
        akn = false;
        BR = i;
        akl = list;
        ajQ = f;
        mColor = j;
        ajL = f1;
        ajM = flag;
        akn = flag1;
    }

    public PolylineOptions add(LatLng latlng)
    {
        akl.add(latlng);
        return this;
    }

    public transient PolylineOptions add(LatLng alatlng[])
    {
        akl.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolylineOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); akl.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public PolylineOptions color(int i)
    {
        mColor = i;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolylineOptions geodesic(boolean flag)
    {
        akn = flag;
        return this;
    }

    public int getColor()
    {
        return mColor;
    }

    public List getPoints()
    {
        return akl;
    }

    int getVersionCode()
    {
        return BR;
    }

    public float getWidth()
    {
        return ajQ;
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

    public PolylineOptions visible(boolean flag)
    {
        ajM = flag;
        return this;
    }

    public PolylineOptions width(float f)
    {
        ajQ = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.mM())
        {
            p.a(this, parcel, i);
            return;
        } else
        {
            o.a(this, parcel, i);
            return;
        }
    }

    public PolylineOptions zIndex(float f)
    {
        ajL = f;
        return this;
    }

}
