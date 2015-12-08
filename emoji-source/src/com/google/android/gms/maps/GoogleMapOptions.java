// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.a;
import com.google.android.gms.maps.internal.v;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptionsCreator, a

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final GoogleMapOptionsCreator CREATOR = new GoogleMapOptionsCreator();
    private Boolean ZA;
    private Boolean ZB;
    private Boolean Zs;
    private Boolean Zt;
    private int Zu;
    private CameraPosition Zv;
    private Boolean Zw;
    private Boolean Zx;
    private Boolean Zy;
    private Boolean Zz;
    private final int xM;

    public GoogleMapOptions()
    {
        Zu = -1;
        xM = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7)
    {
        Zu = -1;
        xM = i;
        Zs = a.a(byte0);
        Zt = a.a(byte1);
        Zu = j;
        Zv = cameraposition;
        Zw = a.a(byte2);
        Zx = a.a(byte3);
        Zy = a.a(byte4);
        Zz = a.a(byte5);
        ZA = a.a(byte6);
        ZB = a.a(byte7);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, com.google.android.gms.R.styleable.MapAttrs);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if (typedarray.hasValue(0))
        {
            googlemapoptions.mapType(typedarray.getInt(0, -1));
        }
        if (typedarray.hasValue(13))
        {
            googlemapoptions.zOrderOnTop(typedarray.getBoolean(13, false));
        }
        if (typedarray.hasValue(12))
        {
            googlemapoptions.useViewLifecycleInFragment(typedarray.getBoolean(12, false));
        }
        if (typedarray.hasValue(6))
        {
            googlemapoptions.compassEnabled(typedarray.getBoolean(6, true));
        }
        if (typedarray.hasValue(7))
        {
            googlemapoptions.rotateGesturesEnabled(typedarray.getBoolean(7, true));
        }
        if (typedarray.hasValue(8))
        {
            googlemapoptions.scrollGesturesEnabled(typedarray.getBoolean(8, true));
        }
        if (typedarray.hasValue(9))
        {
            googlemapoptions.tiltGesturesEnabled(typedarray.getBoolean(9, true));
        }
        if (typedarray.hasValue(11))
        {
            googlemapoptions.zoomGesturesEnabled(typedarray.getBoolean(11, true));
        }
        if (typedarray.hasValue(10))
        {
            googlemapoptions.zoomControlsEnabled(typedarray.getBoolean(10, true));
        }
        googlemapoptions.camera(CameraPosition.createFromAttributes(context, attributeset));
        typedarray.recycle();
        return googlemapoptions;
    }

    public GoogleMapOptions camera(CameraPosition cameraposition)
    {
        Zv = cameraposition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean flag)
    {
        Zx = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CameraPosition getCamera()
    {
        return Zv;
    }

    public Boolean getCompassEnabled()
    {
        return Zx;
    }

    public int getMapType()
    {
        return Zu;
    }

    public Boolean getRotateGesturesEnabled()
    {
        return ZB;
    }

    public Boolean getScrollGesturesEnabled()
    {
        return Zy;
    }

    public Boolean getTiltGesturesEnabled()
    {
        return ZA;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return Zt;
    }

    int getVersionCode()
    {
        return xM;
    }

    public Boolean getZOrderOnTop()
    {
        return Zs;
    }

    public Boolean getZoomControlsEnabled()
    {
        return Zw;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return Zz;
    }

    byte jq()
    {
        return a.c(Zs);
    }

    byte jr()
    {
        return a.c(Zt);
    }

    byte js()
    {
        return a.c(Zw);
    }

    byte jt()
    {
        return a.c(Zx);
    }

    byte ju()
    {
        return a.c(Zy);
    }

    byte jv()
    {
        return a.c(Zz);
    }

    byte jw()
    {
        return a.c(ZA);
    }

    byte jx()
    {
        return a.c(ZB);
    }

    public GoogleMapOptions mapType(int i)
    {
        Zu = i;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        ZB = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        Zy = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        ZA = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        Zt = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jL())
        {
            com.google.android.gms.maps.a.a(this, parcel, i);
            return;
        } else
        {
            com.google.android.gms.maps.GoogleMapOptionsCreator.a(this, parcel, i);
            return;
        }
    }

    public GoogleMapOptions zOrderOnTop(boolean flag)
    {
        Zs = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        Zw = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        Zz = Boolean.valueOf(flag);
        return this;
    }

}
