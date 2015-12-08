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
    private int aAa;
    private int aAb;
    private float aAc;
    private boolean aAd;
    private LatLng azX;
    private double azY;
    private float azZ;
    private final int mVersionCode;

    public CircleOptions()
    {
        azX = null;
        azY = 0.0D;
        azZ = 10F;
        aAa = 0xff000000;
        aAb = 0;
        aAc = 0.0F;
        aAd = true;
        mVersionCode = 1;
    }

    CircleOptions(int i, LatLng latlng, double d1, float f, int j, int k, 
            float f1, boolean flag)
    {
        azX = null;
        azY = 0.0D;
        azZ = 10F;
        aAa = 0xff000000;
        aAb = 0;
        aAc = 0.0F;
        aAd = true;
        mVersionCode = i;
        azX = latlng;
        azY = d1;
        azZ = f;
        aAa = j;
        aAb = k;
        aAc = f1;
        aAd = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final LatLng getCenter()
    {
        return azX;
    }

    public final int getFillColor()
    {
        return aAb;
    }

    public final double getRadius()
    {
        return azY;
    }

    public final int getStrokeColor()
    {
        return aAa;
    }

    public final float getStrokeWidth()
    {
        return azZ;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final float getZIndex()
    {
        return aAc;
    }

    public final boolean isVisible()
    {
        return aAd;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (aa.qp())
        {
            d.a(this, parcel, i);
            return;
        } else
        {
            c.a(this, parcel, i);
            return;
        }
    }

}
