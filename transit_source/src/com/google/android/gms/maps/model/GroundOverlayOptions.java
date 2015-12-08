// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.r;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptionsCreator, BitmapDescriptor, c, LatLng, 
//            LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1F;
    private final int iM;
    private float qd;
    private float qk;
    private boolean ql;
    private BitmapDescriptor qn;
    private LatLng qo;
    private float qp;
    private float qq;
    private LatLngBounds qr;
    private float qs;
    private float qt;
    private float qu;

    public GroundOverlayOptions()
    {
        ql = true;
        qs = 0.0F;
        qt = 0.5F;
        qu = 0.5F;
        iM = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, 
            float f3, boolean flag, float f4, float f5, float f6)
    {
        ql = true;
        qs = 0.0F;
        qt = 0.5F;
        qu = 0.5F;
        iM = i;
        qn = new BitmapDescriptor(com.google.android.gms.dynamic.b.a.z(ibinder));
        qo = latlng;
        qp = f;
        qq = f1;
        qr = latlngbounds;
        qd = f2;
        qk = f3;
        ql = flag;
        qs = f4;
        qt = f5;
        qu = f6;
    }

    private GroundOverlayOptions a(LatLng latlng, float f, float f1)
    {
        qo = latlng;
        qp = f;
        qq = f1;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f1)
    {
        qt = f;
        qu = f1;
        return this;
    }

    public GroundOverlayOptions bearing(float f)
    {
        qd = (f % 360F + 360F) % 360F;
        return this;
    }

    IBinder cM()
    {
        return qn.cs().asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAnchorU()
    {
        return qt;
    }

    public float getAnchorV()
    {
        return qu;
    }

    public float getBearing()
    {
        return qd;
    }

    public LatLngBounds getBounds()
    {
        return qr;
    }

    public float getHeight()
    {
        return qq;
    }

    public BitmapDescriptor getImage()
    {
        return qn;
    }

    public LatLng getLocation()
    {
        return qo;
    }

    public float getTransparency()
    {
        return qs;
    }

    int getVersionCode()
    {
        return iM;
    }

    public float getWidth()
    {
        return qp;
    }

    public float getZIndex()
    {
        return qk;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
    {
        qn = bitmapdescriptor;
        return this;
    }

    public boolean isVisible()
    {
        return ql;
    }

    public GroundOverlayOptions position(LatLng latlng, float f)
    {
        boolean flag1 = true;
        boolean flag;
        if (qr == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        dm.b(flag, "Width must be non-negative");
        return a(latlng, f, -1F);
    }

    public GroundOverlayOptions position(LatLng latlng, float f, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (qr == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "Width must be non-negative");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        dm.b(flag, "Height must be non-negative");
        return a(latlng, f, f1);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (qo == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.a(flag, (new StringBuilder()).append("Position has already been set using position: ").append(qo).toString());
        qr = latlngbounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f)
    {
        boolean flag;
        if (f >= 0.0F && f <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "Transparency must be in the range [0..1]");
        qs = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean flag)
    {
        ql = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (r.cK())
        {
            c.a(this, parcel, i);
            return;
        } else
        {
            GroundOverlayOptionsCreator.a(this, parcel, i);
            return;
        }
    }

    public GroundOverlayOptions zIndex(float f)
    {
        qk = f;
        return this;
    }

}
