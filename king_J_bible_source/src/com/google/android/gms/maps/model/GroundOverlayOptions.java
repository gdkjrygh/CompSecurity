// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.fq;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptionsCreator, BitmapDescriptor, c, LatLng, 
//            LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1F;
    private float SG;
    private float SN;
    private boolean SO;
    private BitmapDescriptor SQ;
    private LatLng SR;
    private float SS;
    private float ST;
    private LatLngBounds SU;
    private float SV;
    private float SW;
    private float SX;
    private final int xH;

    public GroundOverlayOptions()
    {
        SO = true;
        SV = 0.0F;
        SW = 0.5F;
        SX = 0.5F;
        xH = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, 
            float f3, boolean flag, float f4, float f5, float f6)
    {
        SO = true;
        SV = 0.0F;
        SW = 0.5F;
        SX = 0.5F;
        xH = i;
        SQ = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.K(ibinder));
        SR = latlng;
        SS = f;
        ST = f1;
        SU = latlngbounds;
        SG = f2;
        SN = f3;
        SO = flag;
        SV = f4;
        SW = f5;
        SX = f6;
    }

    private GroundOverlayOptions a(LatLng latlng, float f, float f1)
    {
        SR = latlng;
        SS = f;
        ST = f1;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f1)
    {
        SW = f;
        SX = f1;
        return this;
    }

    public GroundOverlayOptions bearing(float f)
    {
        SG = (f % 360F + 360F) % 360F;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAnchorU()
    {
        return SW;
    }

    public float getAnchorV()
    {
        return SX;
    }

    public float getBearing()
    {
        return SG;
    }

    public LatLngBounds getBounds()
    {
        return SU;
    }

    public float getHeight()
    {
        return ST;
    }

    public BitmapDescriptor getImage()
    {
        return SQ;
    }

    public LatLng getLocation()
    {
        return SR;
    }

    public float getTransparency()
    {
        return SV;
    }

    int getVersionCode()
    {
        return xH;
    }

    public float getWidth()
    {
        return SS;
    }

    public float getZIndex()
    {
        return SN;
    }

    IBinder iD()
    {
        return SQ.id().asBinder();
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
    {
        SQ = bitmapdescriptor;
        return this;
    }

    public boolean isVisible()
    {
        return SO;
    }

    public GroundOverlayOptions position(LatLng latlng, float f)
    {
        boolean flag1 = true;
        boolean flag;
        if (SU == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fq.b(flag, "Width must be non-negative");
        return a(latlng, f, -1F);
    }

    public GroundOverlayOptions position(LatLng latlng, float f, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (SU == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "Width must be non-negative");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fq.b(flag, "Height must be non-negative");
        return a(latlng, f, f1);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (SR == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.a(flag, (new StringBuilder()).append("Position has already been set using position: ").append(SR).toString());
        SU = latlngbounds;
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
        fq.b(flag, "Transparency must be in the range [0..1]");
        SV = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean flag)
    {
        SO = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.iB())
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
        SN = f;
        return this;
    }

}
