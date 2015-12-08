// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.internal.aa;

// Referenced classes of package com.google.android.gms.maps.model:
//            e, BitmapDescriptor, f, LatLng, 
//            LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    public static final float NO_DIMENSION = -1F;
    private float aAc;
    private boolean aAd;
    private BitmapDescriptor aAf;
    private LatLng aAg;
    private float aAh;
    private float aAi;
    private LatLngBounds aAj;
    private float aAk;
    private float aAl;
    private float aAm;
    private float azV;
    private final int mVersionCode;

    public GroundOverlayOptions()
    {
        aAd = true;
        aAk = 0.0F;
        aAl = 0.5F;
        aAm = 0.5F;
        mVersionCode = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        aAd = true;
        aAk = 0.0F;
        aAl = 0.5F;
        aAm = 0.5F;
        mVersionCode = i;
        aAf = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.bH(ibinder));
        aAg = latlng;
        aAh = f1;
        aAi = f2;
        aAj = latlngbounds;
        azV = f3;
        aAc = f4;
        aAd = flag;
        aAk = f5;
        aAl = f6;
        aAm = f7;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final float getAnchorU()
    {
        return aAl;
    }

    public final float getAnchorV()
    {
        return aAm;
    }

    public final float getBearing()
    {
        return azV;
    }

    public final LatLngBounds getBounds()
    {
        return aAj;
    }

    public final float getHeight()
    {
        return aAi;
    }

    public final LatLng getLocation()
    {
        return aAg;
    }

    public final float getTransparency()
    {
        return aAk;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final float getWidth()
    {
        return aAh;
    }

    public final float getZIndex()
    {
        return aAc;
    }

    public final boolean isVisible()
    {
        return aAd;
    }

    final IBinder qr()
    {
        return aAf.pO().asBinder();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (aa.qp())
        {
            f.a(this, parcel, i);
            return;
        } else
        {
            e.a(this, parcel, i);
            return;
        }
    }

}
