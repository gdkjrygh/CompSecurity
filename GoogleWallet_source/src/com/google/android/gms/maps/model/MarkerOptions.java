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
//            k, BitmapDescriptor, l, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    private String Yv;
    private float aAA;
    private boolean aAd;
    private float aAl;
    private float aAm;
    private String aAu;
    private BitmapDescriptor aAv;
    private boolean aAw;
    private boolean aAx;
    private float aAy;
    private float aAz;
    private LatLng azz;
    private float mAlpha;
    private final int mVersionCode;

    public MarkerOptions()
    {
        aAl = 0.5F;
        aAm = 1.0F;
        aAd = true;
        aAx = false;
        aAy = 0.0F;
        aAz = 0.5F;
        aAA = 0.0F;
        mAlpha = 1.0F;
        mVersionCode = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, 
            boolean flag, boolean flag1, boolean flag2, float f2, float f3, float f4, float f5)
    {
        aAl = 0.5F;
        aAm = 1.0F;
        aAd = true;
        aAx = false;
        aAy = 0.0F;
        aAz = 0.5F;
        aAA = 0.0F;
        mAlpha = 1.0F;
        mVersionCode = i;
        azz = latlng;
        Yv = s;
        aAu = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.bH(ibinder));
        }
        aAv = latlng;
        aAl = f;
        aAm = f1;
        aAw = flag;
        aAd = flag1;
        aAx = flag2;
        aAy = f2;
        aAz = f3;
        aAA = f4;
        mAlpha = f5;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final float getAlpha()
    {
        return mAlpha;
    }

    public final float getAnchorU()
    {
        return aAl;
    }

    public final float getAnchorV()
    {
        return aAm;
    }

    public final float getInfoWindowAnchorU()
    {
        return aAz;
    }

    public final float getInfoWindowAnchorV()
    {
        return aAA;
    }

    public final LatLng getPosition()
    {
        return azz;
    }

    public final float getRotation()
    {
        return aAy;
    }

    public final String getSnippet()
    {
        return aAu;
    }

    public final String getTitle()
    {
        return Yv;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final boolean isDraggable()
    {
        return aAw;
    }

    public final boolean isFlat()
    {
        return aAx;
    }

    public final boolean isVisible()
    {
        return aAd;
    }

    final IBinder qs()
    {
        if (aAv == null)
        {
            return null;
        } else
        {
            return aAv.pO().asBinder();
        }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (aa.qp())
        {
            l.a(this, parcel, i);
            return;
        } else
        {
            k.a(this, parcel, i);
            return;
        }
    }

}
