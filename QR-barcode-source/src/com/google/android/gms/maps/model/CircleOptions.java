// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            c, d, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    private final int BR;
    private LatLng ajG;
    private double ajH;
    private float ajI;
    private int ajJ;
    private int ajK;
    private float ajL;
    private boolean ajM;

    public CircleOptions()
    {
        ajG = null;
        ajH = 0.0D;
        ajI = 10F;
        ajJ = 0xff000000;
        ajK = 0;
        ajL = 0.0F;
        ajM = true;
        BR = 1;
    }

    CircleOptions(int i, LatLng latlng, double d1, float f, int j, int k, 
            float f1, boolean flag)
    {
        ajG = null;
        ajH = 0.0D;
        ajI = 10F;
        ajJ = 0xff000000;
        ajK = 0;
        ajL = 0.0F;
        ajM = true;
        BR = i;
        ajG = latlng;
        ajH = d1;
        ajI = f;
        ajJ = j;
        ajK = k;
        ajL = f1;
        ajM = flag;
    }

    public CircleOptions center(LatLng latlng)
    {
        ajG = latlng;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CircleOptions fillColor(int i)
    {
        ajK = i;
        return this;
    }

    public LatLng getCenter()
    {
        return ajG;
    }

    public int getFillColor()
    {
        return ajK;
    }

    public double getRadius()
    {
        return ajH;
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

    public boolean isVisible()
    {
        return ajM;
    }

    public CircleOptions radius(double d1)
    {
        ajH = d1;
        return this;
    }

    public CircleOptions strokeColor(int i)
    {
        ajJ = i;
        return this;
    }

    public CircleOptions strokeWidth(float f)
    {
        ajI = f;
        return this;
    }

    public CircleOptions visible(boolean flag)
    {
        ajM = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.mM())
        {
            d.a(this, parcel, i);
            return;
        } else
        {
            c.a(this, parcel, i);
            return;
        }
    }

    public CircleOptions zIndex(float f)
    {
        ajL = f;
        return this;
    }

}
