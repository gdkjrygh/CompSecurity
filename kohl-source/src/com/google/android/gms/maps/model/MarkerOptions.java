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
    private String HV;
    private LatLng ZU;
    private float aaD;
    private float aaE;
    private String aaM;
    private BitmapDescriptor aaN;
    private boolean aaO;
    private boolean aaP;
    private float aaQ;
    private float aaR;
    private float aaS;
    private boolean aav;
    private float mAlpha;
    private final int xJ;

    public MarkerOptions()
    {
        aaD = 0.5F;
        aaE = 1.0F;
        aav = true;
        aaP = false;
        aaQ = 0.0F;
        aaR = 0.5F;
        aaS = 0.0F;
        mAlpha = 1.0F;
        xJ = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f1, float f2, 
            boolean flag, boolean flag1, boolean flag2, float f3, float f4, float f5, float f6)
    {
        aaD = 0.5F;
        aaE = 1.0F;
        aav = true;
        aaP = false;
        aaQ = 0.0F;
        aaR = 0.5F;
        aaS = 0.0F;
        mAlpha = 1.0F;
        xJ = i;
        ZU = latlng;
        HV = s;
        aaM = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.ag(ibinder));
        }
        aaN = latlng;
        aaD = f1;
        aaE = f2;
        aaO = flag;
        aav = flag1;
        aaP = flag2;
        aaQ = f3;
        aaR = f4;
        aaS = f5;
        mAlpha = f6;
    }

    public MarkerOptions alpha(float f1)
    {
        mAlpha = f1;
        return this;
    }

    public MarkerOptions anchor(float f1, float f2)
    {
        aaD = f1;
        aaE = f2;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public MarkerOptions draggable(boolean flag)
    {
        aaO = flag;
        return this;
    }

    public MarkerOptions flat(boolean flag)
    {
        aaP = flag;
        return this;
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getAnchorU()
    {
        return aaD;
    }

    public float getAnchorV()
    {
        return aaE;
    }

    public BitmapDescriptor getIcon()
    {
        return aaN;
    }

    public float getInfoWindowAnchorU()
    {
        return aaR;
    }

    public float getInfoWindowAnchorV()
    {
        return aaS;
    }

    public LatLng getPosition()
    {
        return ZU;
    }

    public float getRotation()
    {
        return aaQ;
    }

    public String getSnippet()
    {
        return aaM;
    }

    public String getTitle()
    {
        return HV;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
    {
        aaN = bitmapdescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f1, float f2)
    {
        aaR = f1;
        aaS = f2;
        return this;
    }

    public boolean isDraggable()
    {
        return aaO;
    }

    public boolean isFlat()
    {
        return aaP;
    }

    public boolean isVisible()
    {
        return aav;
    }

    IBinder jJ()
    {
        if (aaN == null)
        {
            return null;
        } else
        {
            return aaN.ji().asBinder();
        }
    }

    public MarkerOptions position(LatLng latlng)
    {
        ZU = latlng;
        return this;
    }

    public MarkerOptions rotation(float f1)
    {
        aaQ = f1;
        return this;
    }

    public MarkerOptions snippet(String s)
    {
        aaM = s;
        return this;
    }

    public MarkerOptions title(String s)
    {
        HV = s;
        return this;
    }

    public MarkerOptions visible(boolean flag)
    {
        aav = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jG())
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
