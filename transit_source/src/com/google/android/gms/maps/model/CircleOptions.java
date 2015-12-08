// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.r;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptionsCreator, b, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final CircleOptionsCreator CREATOR = new CircleOptionsCreator();
    private final int iM;
    private LatLng qf;
    private double qg;
    private float qh;
    private int qi;
    private int qj;
    private float qk;
    private boolean ql;

    public CircleOptions()
    {
        qf = null;
        qg = 0.0D;
        qh = 10F;
        qi = 0xff000000;
        qj = 0;
        qk = 0.0F;
        ql = true;
        iM = 1;
    }

    CircleOptions(int i, LatLng latlng, double d, float f, int j, int k, 
            float f1, boolean flag)
    {
        qf = null;
        qg = 0.0D;
        qh = 10F;
        qi = 0xff000000;
        qj = 0;
        qk = 0.0F;
        ql = true;
        iM = i;
        qf = latlng;
        qg = d;
        qh = f;
        qi = j;
        qj = k;
        qk = f1;
        ql = flag;
    }

    public CircleOptions center(LatLng latlng)
    {
        qf = latlng;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CircleOptions fillColor(int i)
    {
        qj = i;
        return this;
    }

    public LatLng getCenter()
    {
        return qf;
    }

    public int getFillColor()
    {
        return qj;
    }

    public double getRadius()
    {
        return qg;
    }

    public int getStrokeColor()
    {
        return qi;
    }

    public float getStrokeWidth()
    {
        return qh;
    }

    int getVersionCode()
    {
        return iM;
    }

    public float getZIndex()
    {
        return qk;
    }

    public boolean isVisible()
    {
        return ql;
    }

    public CircleOptions radius(double d)
    {
        qg = d;
        return this;
    }

    public CircleOptions strokeColor(int i)
    {
        qi = i;
        return this;
    }

    public CircleOptions strokeWidth(float f)
    {
        qh = f;
        return this;
    }

    public CircleOptions visible(boolean flag)
    {
        ql = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (r.cK())
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
        qk = f;
        return this;
    }

}
