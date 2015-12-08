// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptionsCreator, b, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final CircleOptionsCreator CREATOR = new CircleOptionsCreator();
    private LatLng aas;
    private double aat;
    private float aau;
    private int aav;
    private int aaw;
    private float aax;
    private boolean aay;
    private final int xM;

    public CircleOptions()
    {
        aas = null;
        aat = 0.0D;
        aau = 10F;
        aav = 0xff000000;
        aaw = 0;
        aax = 0.0F;
        aay = true;
        xM = 1;
    }

    CircleOptions(int i, LatLng latlng, double d, float f, int j, int k, 
            float f1, boolean flag)
    {
        aas = null;
        aat = 0.0D;
        aau = 10F;
        aav = 0xff000000;
        aaw = 0;
        aax = 0.0F;
        aay = true;
        xM = i;
        aas = latlng;
        aat = d;
        aau = f;
        aav = j;
        aaw = k;
        aax = f1;
        aay = flag;
    }

    public CircleOptions center(LatLng latlng)
    {
        aas = latlng;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CircleOptions fillColor(int i)
    {
        aaw = i;
        return this;
    }

    public LatLng getCenter()
    {
        return aas;
    }

    public int getFillColor()
    {
        return aaw;
    }

    public double getRadius()
    {
        return aat;
    }

    public int getStrokeColor()
    {
        return aav;
    }

    public float getStrokeWidth()
    {
        return aau;
    }

    int getVersionCode()
    {
        return xM;
    }

    public float getZIndex()
    {
        return aax;
    }

    public boolean isVisible()
    {
        return aay;
    }

    public CircleOptions radius(double d)
    {
        aat = d;
        return this;
    }

    public CircleOptions strokeColor(int i)
    {
        aav = i;
        return this;
    }

    public CircleOptions strokeWidth(float f)
    {
        aau = f;
        return this;
    }

    public CircleOptions visible(boolean flag)
    {
        aay = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jL())
        {
            b.a(this, parcel, i);
            return;
        } else
        {
            CircleOptionsCreator.a(this, parcel, i);
            return;
        }
    }

    public CircleOptions zIndex(float f)
    {
        aax = f;
        return this;
    }

}
