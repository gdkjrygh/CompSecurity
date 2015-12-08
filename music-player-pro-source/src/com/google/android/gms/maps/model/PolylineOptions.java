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
//            o, LatLng, p

public final class PolylineOptions
    implements SafeParcelable
{

    public static final o CREATOR = new o();
    private final int CK;
    private float alX;
    private boolean alY;
    private float amc;
    private final List amx;
    private boolean amz;
    private int mColor;

    public PolylineOptions()
    {
        amc = 10F;
        mColor = 0xff000000;
        alX = 0.0F;
        alY = true;
        amz = false;
        CK = 1;
        amx = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        amc = 10F;
        mColor = 0xff000000;
        alX = 0.0F;
        alY = true;
        amz = false;
        CK = i;
        amx = list;
        amc = f;
        mColor = j;
        alX = f1;
        alY = flag;
        amz = flag1;
    }

    public PolylineOptions add(LatLng latlng)
    {
        amx.add(latlng);
        return this;
    }

    public transient PolylineOptions add(LatLng alatlng[])
    {
        amx.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolylineOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); amx.add(latlng))
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
        amz = flag;
        return this;
    }

    public int getColor()
    {
        return mColor;
    }

    public List getPoints()
    {
        return amx;
    }

    int getVersionCode()
    {
        return CK;
    }

    public float getWidth()
    {
        return amc;
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

    public PolylineOptions visible(boolean flag)
    {
        alY = flag;
        return this;
    }

    public PolylineOptions width(float f)
    {
        amc = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (aa.ob())
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
        alX = f;
        return this;
    }

}
