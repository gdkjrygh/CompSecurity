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
    private LatLng aap;
    private double aaq;
    private float aar;
    private int aas;
    private int aat;
    private float aau;
    private boolean aav;
    private final int xJ;

    public CircleOptions()
    {
        aap = null;
        aaq = 0.0D;
        aar = 10F;
        aas = 0xff000000;
        aat = 0;
        aau = 0.0F;
        aav = true;
        xJ = 1;
    }

    CircleOptions(int i, LatLng latlng, double d, float f, int j, int k, 
            float f1, boolean flag)
    {
        aap = null;
        aaq = 0.0D;
        aar = 10F;
        aas = 0xff000000;
        aat = 0;
        aau = 0.0F;
        aav = true;
        xJ = i;
        aap = latlng;
        aaq = d;
        aar = f;
        aas = j;
        aat = k;
        aau = f1;
        aav = flag;
    }

    public CircleOptions center(LatLng latlng)
    {
        aap = latlng;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CircleOptions fillColor(int i)
    {
        aat = i;
        return this;
    }

    public LatLng getCenter()
    {
        return aap;
    }

    public int getFillColor()
    {
        return aat;
    }

    public double getRadius()
    {
        return aaq;
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

    public boolean isVisible()
    {
        return aav;
    }

    public CircleOptions radius(double d)
    {
        aaq = d;
        return this;
    }

    public CircleOptions strokeColor(int i)
    {
        aas = i;
        return this;
    }

    public CircleOptions strokeWidth(float f)
    {
        aar = f;
        return this;
    }

    public CircleOptions visible(boolean flag)
    {
        aav = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jG())
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
        aau = f;
        return this;
    }

}
