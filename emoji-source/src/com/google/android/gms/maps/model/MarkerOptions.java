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
//            MarkerOptionsCreator, BitmapDescriptor, f, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final MarkerOptionsCreator CREATOR = new MarkerOptionsCreator();
    private String HY;
    private LatLng ZX;
    private float aaG;
    private float aaH;
    private String aaP;
    private BitmapDescriptor aaQ;
    private boolean aaR;
    private boolean aaS;
    private float aaT;
    private float aaU;
    private float aaV;
    private boolean aay;
    private float mAlpha;
    private final int xM;

    public MarkerOptions()
    {
        aaG = 0.5F;
        aaH = 1.0F;
        aay = true;
        aaS = false;
        aaT = 0.0F;
        aaU = 0.5F;
        aaV = 0.0F;
        mAlpha = 1.0F;
        xM = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f1, float f2, 
            boolean flag, boolean flag1, boolean flag2, float f3, float f4, float f5, float f6)
    {
        aaG = 0.5F;
        aaH = 1.0F;
        aay = true;
        aaS = false;
        aaT = 0.0F;
        aaU = 0.5F;
        aaV = 0.0F;
        mAlpha = 1.0F;
        xM = i;
        ZX = latlng;
        HY = s;
        aaP = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.ag(ibinder));
        }
        aaQ = latlng;
        aaG = f1;
        aaH = f2;
        aaR = flag;
        aay = flag1;
        aaS = flag2;
        aaT = f3;
        aaU = f4;
        aaV = f5;
        mAlpha = f6;
    }

    public MarkerOptions alpha(float f1)
    {
        mAlpha = f1;
        return this;
    }

    public MarkerOptions anchor(float f1, float f2)
    {
        aaG = f1;
        aaH = f2;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public MarkerOptions draggable(boolean flag)
    {
        aaR = flag;
        return this;
    }

    public MarkerOptions flat(boolean flag)
    {
        aaS = flag;
        return this;
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getAnchorU()
    {
        return aaG;
    }

    public float getAnchorV()
    {
        return aaH;
    }

    public BitmapDescriptor getIcon()
    {
        return aaQ;
    }

    public float getInfoWindowAnchorU()
    {
        return aaU;
    }

    public float getInfoWindowAnchorV()
    {
        return aaV;
    }

    public LatLng getPosition()
    {
        return ZX;
    }

    public float getRotation()
    {
        return aaT;
    }

    public String getSnippet()
    {
        return aaP;
    }

    public String getTitle()
    {
        return HY;
    }

    int getVersionCode()
    {
        return xM;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
    {
        aaQ = bitmapdescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f1, float f2)
    {
        aaU = f1;
        aaV = f2;
        return this;
    }

    public boolean isDraggable()
    {
        return aaR;
    }

    public boolean isFlat()
    {
        return aaS;
    }

    public boolean isVisible()
    {
        return aay;
    }

    IBinder jO()
    {
        if (aaQ == null)
        {
            return null;
        } else
        {
            return aaQ.jn().asBinder();
        }
    }

    public MarkerOptions position(LatLng latlng)
    {
        ZX = latlng;
        return this;
    }

    public MarkerOptions rotation(float f1)
    {
        aaT = f1;
        return this;
    }

    public MarkerOptions snippet(String s)
    {
        aaP = s;
        return this;
    }

    public MarkerOptions title(String s)
    {
        HY = s;
        return this;
    }

    public MarkerOptions visible(boolean flag)
    {
        aay = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jL())
        {
            f.a(this, parcel, i);
            return;
        } else
        {
            MarkerOptionsCreator.a(this, parcel, i);
            return;
        }
    }

}
