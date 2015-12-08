// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.hm;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptionsCreator, BitmapDescriptor, c, LatLng, 
//            LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1F;
    private BitmapDescriptor aaA;
    private LatLng aaB;
    private float aaC;
    private float aaD;
    private LatLngBounds aaE;
    private float aaF;
    private float aaG;
    private float aaH;
    private float aaq;
    private float aax;
    private boolean aay;
    private final int xM;

    public GroundOverlayOptions()
    {
        aay = true;
        aaF = 0.0F;
        aaG = 0.5F;
        aaH = 0.5F;
        xM = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, 
            float f3, boolean flag, float f4, float f5, float f6)
    {
        aay = true;
        aaF = 0.0F;
        aaG = 0.5F;
        aaH = 0.5F;
        xM = i;
        aaA = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.ag(ibinder));
        aaB = latlng;
        aaC = f;
        aaD = f1;
        aaE = latlngbounds;
        aaq = f2;
        aax = f3;
        aay = flag;
        aaF = f4;
        aaG = f5;
        aaH = f6;
    }

    private GroundOverlayOptions a(LatLng latlng, float f, float f1)
    {
        aaB = latlng;
        aaC = f;
        aaD = f1;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f1)
    {
        aaG = f;
        aaH = f1;
        return this;
    }

    public GroundOverlayOptions bearing(float f)
    {
        aaq = (f % 360F + 360F) % 360F;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAnchorU()
    {
        return aaG;
    }

    public float getAnchorV()
    {
        return aaH;
    }

    public float getBearing()
    {
        return aaq;
    }

    public LatLngBounds getBounds()
    {
        return aaE;
    }

    public float getHeight()
    {
        return aaD;
    }

    public BitmapDescriptor getImage()
    {
        return aaA;
    }

    public LatLng getLocation()
    {
        return aaB;
    }

    public float getTransparency()
    {
        return aaF;
    }

    int getVersionCode()
    {
        return xM;
    }

    public float getWidth()
    {
        return aaC;
    }

    public float getZIndex()
    {
        return aax;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
    {
        aaA = bitmapdescriptor;
        return this;
    }

    public boolean isVisible()
    {
        return aay;
    }

    IBinder jN()
    {
        return aaA.jn().asBinder();
    }

    public GroundOverlayOptions position(LatLng latlng, float f)
    {
        boolean flag1 = true;
        boolean flag;
        if (aaE == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hm.b(flag, "Width must be non-negative");
        return a(latlng, f, -1F);
    }

    public GroundOverlayOptions position(LatLng latlng, float f, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (aaE == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "Width must be non-negative");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hm.b(flag, "Height must be non-negative");
        return a(latlng, f, f1);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (aaB == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "Position has already been set using position: %s", new Object[] {
            aaB
        });
        aaE = latlngbounds;
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
        hm.b(flag, "Transparency must be in the range [0..1]");
        aaF = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean flag)
    {
        aay = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jL())
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
        aax = f;
        return this;
    }

}
