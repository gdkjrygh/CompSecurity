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
    private LatLng SI;
    private double SJ;
    private float SK;
    private int SL;
    private int SM;
    private float SN;
    private boolean SO;
    private final int xH;

    public CircleOptions()
    {
        SI = null;
        SJ = 0.0D;
        SK = 10F;
        SL = 0xff000000;
        SM = 0;
        SN = 0.0F;
        SO = true;
        xH = 1;
    }

    CircleOptions(int i, LatLng latlng, double d, float f, int j, int k, 
            float f1, boolean flag)
    {
        SI = null;
        SJ = 0.0D;
        SK = 10F;
        SL = 0xff000000;
        SM = 0;
        SN = 0.0F;
        SO = true;
        xH = i;
        SI = latlng;
        SJ = d;
        SK = f;
        SL = j;
        SM = k;
        SN = f1;
        SO = flag;
    }

    public CircleOptions center(LatLng latlng)
    {
        SI = latlng;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CircleOptions fillColor(int i)
    {
        SM = i;
        return this;
    }

    public LatLng getCenter()
    {
        return SI;
    }

    public int getFillColor()
    {
        return SM;
    }

    public double getRadius()
    {
        return SJ;
    }

    public int getStrokeColor()
    {
        return SL;
    }

    public float getStrokeWidth()
    {
        return SK;
    }

    int getVersionCode()
    {
        return xH;
    }

    public float getZIndex()
    {
        return SN;
    }

    public boolean isVisible()
    {
        return SO;
    }

    public CircleOptions radius(double d)
    {
        SJ = d;
        return this;
    }

    public CircleOptions strokeColor(int i)
    {
        SL = i;
        return this;
    }

    public CircleOptions strokeWidth(float f)
    {
        SK = f;
        return this;
    }

    public CircleOptions visible(boolean flag)
    {
        SO = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.iB())
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
        SN = f;
        return this;
    }

}
