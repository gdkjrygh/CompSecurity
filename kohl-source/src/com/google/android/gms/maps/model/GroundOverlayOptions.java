// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.hn;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptionsCreator, BitmapDescriptor, c, LatLngBounds, 
//            LatLng

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1F;
    private float aaA;
    private LatLngBounds aaB;
    private float aaC;
    private float aaD;
    private float aaE;
    private float aan;
    private float aau;
    private boolean aav;
    private BitmapDescriptor aax;
    private LatLng aay;
    private float aaz;
    private final int xJ;

    public GroundOverlayOptions()
    {
        aav = true;
        aaC = 0.0F;
        aaD = 0.5F;
        aaE = 0.5F;
        xJ = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, 
            float f3, boolean flag, float f4, float f5, float f6)
    {
        aav = true;
        aaC = 0.0F;
        aaD = 0.5F;
        aaE = 0.5F;
        xJ = i;
        aax = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.ag(ibinder));
        aay = latlng;
        aaz = f;
        aaA = f1;
        aaB = latlngbounds;
        aan = f2;
        aau = f3;
        aav = flag;
        aaC = f4;
        aaD = f5;
        aaE = f6;
    }

    private GroundOverlayOptions a(LatLng latlng, float f, float f1)
    {
        aay = latlng;
        aaz = f;
        aaA = f1;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f1)
    {
        aaD = f;
        aaE = f1;
        return this;
    }

    public GroundOverlayOptions bearing(float f)
    {
        aan = (f % 360F + 360F) % 360F;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAnchorU()
    {
        return aaD;
    }

    public float getAnchorV()
    {
        return aaE;
    }

    public float getBearing()
    {
        return aan;
    }

    public LatLngBounds getBounds()
    {
        return aaB;
    }

    public float getHeight()
    {
        return aaA;
    }

    public BitmapDescriptor getImage()
    {
        return aax;
    }

    public LatLng getLocation()
    {
        return aay;
    }

    public float getTransparency()
    {
        return aaC;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public float getWidth()
    {
        return aaz;
    }

    public float getZIndex()
    {
        return aau;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
    {
        aax = bitmapdescriptor;
        return this;
    }

    public boolean isVisible()
    {
        return aav;
    }

    IBinder jI()
    {
        return aax.ji().asBinder();
    }

    public GroundOverlayOptions position(LatLng latlng, float f)
    {
        boolean flag1 = true;
        boolean flag;
        if (aaB == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hn.b(flag, "Width must be non-negative");
        return a(latlng, f, -1F);
    }

    public GroundOverlayOptions position(LatLng latlng, float f, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (aaB == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "Location must be specified");
        if (f >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "Width must be non-negative");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hn.b(flag, "Height must be non-negative");
        return a(latlng, f, f1);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (aay == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.a(flag, "Position has already been set using position: %s", new Object[] {
            aay
        });
        aaB = latlngbounds;
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
        hn.b(flag, "Transparency must be in the range [0..1]");
        aaC = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean flag)
    {
        aav = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jG())
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
        aau = f;
        return this;
    }

}
