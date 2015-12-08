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
import com.google.android.gms.maps.internal.r;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptionsCreator, a

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final GoogleMapOptionsCreator CREATOR = new GoogleMapOptionsCreator();
    private final int iM;
    private CameraPosition pA;
    private Boolean pB;
    private Boolean pC;
    private Boolean pD;
    private Boolean pE;
    private Boolean pF;
    private Boolean pG;
    private Boolean px;
    private Boolean py;
    private int pz;

    public GoogleMapOptions()
    {
        pz = -1;
        iM = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7)
    {
        pz = -1;
        iM = i;
        px = a.a(byte0);
        py = a.a(byte1);
        pz = j;
        pA = cameraposition;
        pB = a.a(byte2);
        pC = a.a(byte3);
        pD = a.a(byte4);
        pE = a.a(byte5);
        pF = a.a(byte6);
        pG = a.a(byte7);
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

    byte cA()
    {
        return a.b(pE);
    }

    byte cB()
    {
        return a.b(pF);
    }

    byte cC()
    {
        return a.b(pG);
    }

    public GoogleMapOptions camera(CameraPosition cameraposition)
    {
        pA = cameraposition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean flag)
    {
        pC = Boolean.valueOf(flag);
        return this;
    }

    byte cv()
    {
        return a.b(px);
    }

    byte cw()
    {
        return a.b(py);
    }

    byte cx()
    {
        return a.b(pB);
    }

    byte cy()
    {
        return a.b(pC);
    }

    byte cz()
    {
        return a.b(pD);
    }

    public int describeContents()
    {
        return 0;
    }

    public CameraPosition getCamera()
    {
        return pA;
    }

    public Boolean getCompassEnabled()
    {
        return pC;
    }

    public int getMapType()
    {
        return pz;
    }

    public Boolean getRotateGesturesEnabled()
    {
        return pG;
    }

    public Boolean getScrollGesturesEnabled()
    {
        return pD;
    }

    public Boolean getTiltGesturesEnabled()
    {
        return pF;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return py;
    }

    int getVersionCode()
    {
        return iM;
    }

    public Boolean getZOrderOnTop()
    {
        return px;
    }

    public Boolean getZoomControlsEnabled()
    {
        return pB;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return pE;
    }

    public GoogleMapOptions mapType(int i)
    {
        pz = i;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        pG = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        pD = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        pF = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        py = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (r.cK())
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
        px = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        pB = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        pE = Boolean.valueOf(flag);
        return this;
    }

}
