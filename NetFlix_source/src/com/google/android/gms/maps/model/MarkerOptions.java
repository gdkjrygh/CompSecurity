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
    private String EB;
    private boolean SO;
    private float SW;
    private float SX;
    private LatLng Sn;
    private String Tf;
    private BitmapDescriptor Tg;
    private boolean Th;
    private boolean Ti;
    private float Tj;
    private float Tk;
    private float Tl;
    private float mAlpha;
    private final int xH;

    public MarkerOptions()
    {
        SW = 0.5F;
        SX = 1.0F;
        SO = true;
        Ti = false;
        Tj = 0.0F;
        Tk = 0.5F;
        Tl = 0.0F;
        mAlpha = 1.0F;
        xH = 1;
    }

    MarkerOptions(int i, LatLng latlng, String s, String s1, IBinder ibinder, float f1, float f2, 
            boolean flag, boolean flag1, boolean flag2, float f3, float f4, float f5, float f6)
    {
        SW = 0.5F;
        SX = 1.0F;
        SO = true;
        Ti = false;
        Tj = 0.0F;
        Tk = 0.5F;
        Tl = 0.0F;
        mAlpha = 1.0F;
        xH = i;
        Sn = latlng;
        EB = s;
        Tf = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new BitmapDescriptor(com.google.android.gms.dynamic.d.a.K(ibinder));
        }
        Tg = latlng;
        SW = f1;
        SX = f2;
        Th = flag;
        SO = flag1;
        Ti = flag2;
        Tj = f3;
        Tk = f4;
        Tl = f5;
        mAlpha = f6;
    }

    public MarkerOptions alpha(float f1)
    {
        mAlpha = f1;
        return this;
    }

    public MarkerOptions anchor(float f1, float f2)
    {
        SW = f1;
        SX = f2;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public MarkerOptions draggable(boolean flag)
    {
        Th = flag;
        return this;
    }

    public MarkerOptions flat(boolean flag)
    {
        Ti = flag;
        return this;
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public float getAnchorU()
    {
        return SW;
    }

    public float getAnchorV()
    {
        return SX;
    }

    public BitmapDescriptor getIcon()
    {
        return Tg;
    }

    public float getInfoWindowAnchorU()
    {
        return Tk;
    }

    public float getInfoWindowAnchorV()
    {
        return Tl;
    }

    public LatLng getPosition()
    {
        return Sn;
    }

    public float getRotation()
    {
        return Tj;
    }

    public String getSnippet()
    {
        return Tf;
    }

    public String getTitle()
    {
        return EB;
    }

    int getVersionCode()
    {
        return xH;
    }

    IBinder iE()
    {
        if (Tg == null)
        {
            return null;
        } else
        {
            return Tg.id().asBinder();
        }
    }

    public MarkerOptions icon(BitmapDescriptor bitmapdescriptor)
    {
        Tg = bitmapdescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f1, float f2)
    {
        Tk = f1;
        Tl = f2;
        return this;
    }

    public boolean isDraggable()
    {
        return Th;
    }

    public boolean isFlat()
    {
        return Ti;
    }

    public boolean isVisible()
    {
        return SO;
    }

    public MarkerOptions position(LatLng latlng)
    {
        Sn = latlng;
        return this;
    }

    public MarkerOptions rotation(float f1)
    {
        Tj = f1;
        return this;
    }

    public MarkerOptions snippet(String s)
    {
        Tf = s;
        return this;
    }

    public MarkerOptions title(String s)
    {
        EB = s;
        return this;
    }

    public MarkerOptions visible(boolean flag)
    {
        SO = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.iB())
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
