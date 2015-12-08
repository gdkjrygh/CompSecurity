// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.aa;

// Referenced classes of package com.google.android.gms.maps.model:
//            e, BitmapDescriptor, f, LatLng, 
//            LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    public static final float NO_DIMENSION = -1F;
    private final int CK;
    private float alQ;
    private float alX;
    private boolean alY;
    private BitmapDescriptor ama;
    private LatLng amb;
    private float amc;
    private float amd;
    private LatLngBounds ame;
    private float amf;
    private float amg;
    private float amh;

    public GroundOverlayOptions()
    {
        alY = true;
        amf = 0.0F;
        amg = 0.5F;
        amh = 0.5F;
        CK = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        alY = true;
        amf = 0.0F;
        amg = 0.5F;
        amh = 0.5F;
        CK = i;
        ama = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.ap(ibinder));
        amb = latlng;
        amc = f1;
        amd = f2;
        ame = latlngbounds;
        alQ = f3;
        alX = f4;
        alY = flag;
        amf = f5;
        amg = f6;
        amh = f7;
    }

    private GroundOverlayOptions a(LatLng latlng, float f1, float f2)
    {
        amb = latlng;
        amc = f1;
        amd = f2;
        return this;
    }

    public GroundOverlayOptions anchor(float f1, float f2)
    {
        amg = f1;
        amh = f2;
        return this;
    }

    public GroundOverlayOptions bearing(float f1)
    {
        alQ = (f1 % 360F + 360F) % 360F;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAnchorU()
    {
        return amg;
    }

    public float getAnchorV()
    {
        return amh;
    }

    public float getBearing()
    {
        return alQ;
    }

    public LatLngBounds getBounds()
    {
        return ame;
    }

    public float getHeight()
    {
        return amd;
    }

    public BitmapDescriptor getImage()
    {
        return ama;
    }

    public LatLng getLocation()
    {
        return amb;
    }

    public float getTransparency()
    {
        return amf;
    }

    int getVersionCode()
    {
        return CK;
    }

    public float getWidth()
    {
        return amc;
    }

    public float getZIndex()
    {
        return alX;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
    {
        ama = bitmapdescriptor;
        return this;
    }

    public boolean isVisible()
    {
        return alY;
    }

    IBinder od()
    {
        return ama.nA().asBinder();
    }

    public GroundOverlayOptions position(LatLng latlng, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (ame == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Width must be non-negative");
        return a(latlng, f1, -1F);
    }

    public GroundOverlayOptions position(LatLng latlng, float f1, float f2)
    {
        boolean flag1 = true;
        boolean flag;
        if (ame == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Width must be non-negative");
        if (f2 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Height must be non-negative");
        return a(latlng, f1, f2);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (amb == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, (new StringBuilder()).append("Position has already been set using position: ").append(amb).toString());
        ame = latlngbounds;
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
        jx.b(flag, "Transparency must be in the range [0..1]");
        amf = f1;
        return this;
    }

    public GroundOverlayOptions visible(boolean flag)
    {
        alY = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (aa.ob())
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
        alX = f1;
        return this;
    }

}
