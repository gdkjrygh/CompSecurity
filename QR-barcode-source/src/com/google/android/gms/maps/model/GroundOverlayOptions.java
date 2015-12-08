// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            e, BitmapDescriptor, f, LatLng, 
//            LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    public static final float NO_DIMENSION = -1F;
    private final int BR;
    private float ajE;
    private float ajL;
    private boolean ajM;
    private BitmapDescriptor ajO;
    private LatLng ajP;
    private float ajQ;
    private float ajR;
    private LatLngBounds ajS;
    private float ajT;
    private float ajU;
    private float ajV;

    public GroundOverlayOptions()
    {
        ajM = true;
        ajT = 0.0F;
        ajU = 0.5F;
        ajV = 0.5F;
        BR = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        ajM = true;
        ajT = 0.0F;
        ajU = 0.5F;
        ajV = 0.5F;
        BR = i;
        ajO = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.am(ibinder));
        ajP = latlng;
        ajQ = f1;
        ajR = f2;
        ajS = latlngbounds;
        ajE = f3;
        ajL = f4;
        ajM = flag;
        ajT = f5;
        ajU = f6;
        ajV = f7;
    }

    private GroundOverlayOptions a(LatLng latlng, float f1, float f2)
    {
        ajP = latlng;
        ajQ = f1;
        ajR = f2;
        return this;
    }

    public GroundOverlayOptions anchor(float f1, float f2)
    {
        ajU = f1;
        ajV = f2;
        return this;
    }

    public GroundOverlayOptions bearing(float f1)
    {
        ajE = (f1 % 360F + 360F) % 360F;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAnchorU()
    {
        return ajU;
    }

    public float getAnchorV()
    {
        return ajV;
    }

    public float getBearing()
    {
        return ajE;
    }

    public LatLngBounds getBounds()
    {
        return ajS;
    }

    public float getHeight()
    {
        return ajR;
    }

    public BitmapDescriptor getImage()
    {
        return ajO;
    }

    public LatLng getLocation()
    {
        return ajP;
    }

    public float getTransparency()
    {
        return ajT;
    }

    int getVersionCode()
    {
        return BR;
    }

    public float getWidth()
    {
        return ajQ;
    }

    public float getZIndex()
    {
        return ajL;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
    {
        ajO = bitmapdescriptor;
        return this;
    }

    public boolean isVisible()
    {
        return ajM;
    }

    IBinder mO()
    {
        return ajO.mo().asBinder();
    }

    public GroundOverlayOptions position(LatLng latlng, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (ajS == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.b(flag, "Width must be non-negative");
        return a(latlng, f1, -1F);
    }

    public GroundOverlayOptions position(LatLng latlng, float f1, float f2)
    {
        boolean flag1 = true;
        boolean flag;
        if (ajS == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Width must be non-negative");
        if (f2 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.b(flag, "Height must be non-negative");
        return a(latlng, f1, f2);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (ajP == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, (new StringBuilder()).append("Position has already been set using position: ").append(ajP).toString());
        ajS = latlngbounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f1)
    {
        boolean flag;
        if (f1 >= 0.0F && f1 <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Transparency must be in the range [0..1]");
        ajT = f1;
        return this;
    }

    public GroundOverlayOptions visible(boolean flag)
    {
        ajM = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.mM())
        {
            f.a(this, parcel, i);
            return;
        } else
        {
            e.a(this, parcel, i);
            return;
        }
    }

    public GroundOverlayOptions zIndex(float f1)
    {
        ajL = f1;
        return this;
    }

}
