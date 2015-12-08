// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.aa;

// Referenced classes of package com.google.android.gms.maps.model:
//            c, d, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    private final int CK;
    private LatLng alS;
    private double alT;
    private float alU;
    private int alV;
    private int alW;
    private float alX;
    private boolean alY;

    public CircleOptions()
    {
        alS = null;
        alT = 0.0D;
        alU = 10F;
        alV = 0xff000000;
        alW = 0;
        alX = 0.0F;
        alY = true;
        CK = 1;
    }

    CircleOptions(int i, LatLng latlng, double d1, float f, int j, int k, 
            float f1, boolean flag)
    {
        alS = null;
        alT = 0.0D;
        alU = 10F;
        alV = 0xff000000;
        alW = 0;
        alX = 0.0F;
        alY = true;
        CK = i;
        alS = latlng;
        alT = d1;
        alU = f;
        alV = j;
        alW = k;
        alX = f1;
        alY = flag;
    }

    public CircleOptions center(LatLng latlng)
    {
        alS = latlng;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CircleOptions fillColor(int i)
    {
        alW = i;
        return this;
    }

    public LatLng getCenter()
    {
        return alS;
    }

    public int getFillColor()
    {
        return alW;
    }

    public double getRadius()
    {
        return alT;
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

    public boolean isVisible()
    {
        return alY;
    }

    public CircleOptions radius(double d1)
    {
        alT = d1;
        return this;
    }

    public CircleOptions strokeColor(int i)
    {
        alV = i;
        return this;
    }

    public CircleOptions strokeWidth(float f)
    {
        alU = f;
        return this;
    }

    public CircleOptions visible(boolean flag)
    {
        alY = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (aa.ob())
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
        alX = f;
        return this;
    }

}
