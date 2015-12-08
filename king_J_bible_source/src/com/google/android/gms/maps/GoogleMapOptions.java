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
    private Boolean RI;
    private Boolean RJ;
    private int RK;
    private CameraPosition RL;
    private Boolean RM;
    private Boolean RN;
    private Boolean RO;
    private Boolean RP;
    private Boolean RQ;
    private Boolean RR;
    private final int xH;

    public GoogleMapOptions()
    {
        RK = -1;
        xH = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7)
    {
        RK = -1;
        xH = i;
        RI = a.a(byte0);
        RJ = a.a(byte1);
        RK = j;
        RL = cameraposition;
        RM = a.a(byte2);
        RN = a.a(byte3);
        RO = a.a(byte4);
        RP = a.a(byte5);
        RQ = a.a(byte6);
        RR = a.a(byte7);
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
        RL = cameraposition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean flag)
    {
        RN = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CameraPosition getCamera()
    {
        return RL;
    }

    public Boolean getCompassEnabled()
    {
        return RN;
    }

    public int getMapType()
    {
        return RK;
    }

    public Boolean getRotateGesturesEnabled()
    {
        return RR;
    }

    public Boolean getScrollGesturesEnabled()
    {
        return RO;
    }

    public Boolean getTiltGesturesEnabled()
    {
        return RQ;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return RJ;
    }

    int getVersionCode()
    {
        return xH;
    }

    public Boolean getZOrderOnTop()
    {
        return RI;
    }

    public Boolean getZoomControlsEnabled()
    {
        return RM;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return RP;
    }

    byte ig()
    {
        return a.c(RI);
    }

    byte ih()
    {
        return a.c(RJ);
    }

    byte ii()
    {
        return a.c(RM);
    }

    byte ij()
    {
        return a.c(RN);
    }

    byte ik()
    {
        return a.c(RO);
    }

    byte il()
    {
        return a.c(RP);
    }

    byte im()
    {
        return a.c(RQ);
    }

    byte in()
    {
        return a.c(RR);
    }

    public GoogleMapOptions mapType(int i)
    {
        RK = i;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        RR = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        RO = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        RQ = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        RJ = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.iB())
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
        RI = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        RM = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        RP = Boolean.valueOf(flag);
        return this;
    }

}
