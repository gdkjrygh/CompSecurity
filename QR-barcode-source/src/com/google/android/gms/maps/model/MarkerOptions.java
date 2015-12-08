// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            k, BitmapDescriptor, l, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    private final int BR;
    private String Nw;
    private boolean ajM;
    private float ajU;
    private float ajV;
    private LatLng ajl;
    private String akd;
    private BitmapDescriptor ake;
    private boolean akf;
    private boolean akg;
    private float akh;
    private float aki;
    private float akj;
    private float mAlpha;

    public MarkerOptions()
    {
        ajU = 0.5F;
        ajV = 1.0F;
        ajM = true;
        akg = false;
        akh = 0.0F;
        aki = 0.5F;
        akj = 0.0F;
        mAlpha = 1.0F;
        BR = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f, float f1, 
            boolean flag, boolean flag1, boolean flag2, float f2, float f3, float f4, float f5)
    {
        ajU = 0.5F;
        ajV = 1.0F;
        ajM = true;
        akg = false;
        akh = 0.0F;
        aki = 0.5F;
        akj = 0.0F;
        mAlpha = 1.0F;
        BR = i;
        ajl = latlng;
        Nw = s;
        akd = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.am(ibinder));
        }
        ake = latlng;
        ajU = f;
        ajV = f1;
        akf = flag;
        ajM = flag1;
        akg = flag2;
        akh = f2;
        aki = f3;
        akj = f4;
        mAlpha = f5;
    }

    public MarkerOptions alpha(float f)
    {
        mAlpha = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f1)
    {
        ajU = f;
        ajV = f1;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public MarkerOptions draggable(boolean flag)
    {
        akf = flag;
        return this;
    }

    public MarkerOptions flat(boolean flag)
    {
        akg = flag;
        return this;
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getAnchorU()
    {
        return ajU;
    }

    public float getAnchorV()
    {
        return ajV;
    }

    public BitmapDescriptor getIcon()
    {
        return ake;
    }

    public float getInfoWindowAnchorU()
    {
        return aki;
    }

    public float getInfoWindowAnchorV()
    {
        return akj;
    }

    public LatLng getPosition()
    {
        return ajl;
    }

    public float getRotation()
    {
        return akh;
    }

    public String getSnippet()
    {
        return akd;
    }

    public String getTitle()
    {
        return Nw;
    }

    int getVersionCode()
    {
        return BR;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
    {
        ake = bitmapdescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f1)
    {
        aki = f;
        akj = f1;
        return this;
    }

    public boolean isDraggable()
    {
        return akf;
    }

    public boolean isFlat()
    {
        return akg;
    }

    public boolean isVisible()
    {
        return ajM;
    }

    IBinder mP()
    {
        if (ake == null)
        {
            return null;
        } else
        {
            return ake.mo().asBinder();
        }
    }

    public MarkerOptions position(LatLng latlng)
    {
        ajl = latlng;
        return this;
    }

    public MarkerOptions rotation(float f)
    {
        akh = f;
        return this;
    }

    public MarkerOptions snippet(String s)
    {
        akd = s;
        return this;
    }

    public MarkerOptions title(String s)
    {
        Nw = s;
        return this;
    }

    public MarkerOptions visible(boolean flag)
    {
        ajM = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.mM())
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
