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
import com.google.android.gms.maps.internal.aa;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            a, b

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.a CREATOR = new com.google.android.gms.maps.a();
    private Boolean ayL;
    private Boolean ayM;
    private int ayN;
    private CameraPosition ayO;
    private Boolean ayP;
    private Boolean ayQ;
    private Boolean ayR;
    private Boolean ayS;
    private Boolean ayT;
    private Boolean ayU;
    private Boolean ayV;
    private Boolean ayW;
    private final int mVersionCode;

    public GoogleMapOptions()
    {
        ayN = -1;
        mVersionCode = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9)
    {
        ayN = -1;
        mVersionCode = i;
        ayL = a.a(byte0);
        ayM = a.a(byte1);
        ayN = j;
        ayO = cameraposition;
        ayP = a.a(byte2);
        ayQ = a.a(byte3);
        ayR = a.a(byte4);
        ayS = a.a(byte5);
        ayT = a.a(byte6);
        ayU = a.a(byte7);
        ayV = a.a(byte8);
        ayW = a.a(byte9);
    }

    private GoogleMapOptions camera(CameraPosition cameraposition)
    {
        ayO = cameraposition;
        return this;
    }

    private GoogleMapOptions compassEnabled(boolean flag)
    {
        ayQ = Boolean.valueOf(flag);
        return this;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, com.google.android.gms.R.styleable.MapAttrs);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_mapType))
        {
            googlemapoptions.mapType(typedarray.getInt(com.google.android.gms.R.styleable.MapAttrs_mapType, -1));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_zOrderOnTop))
        {
            googlemapoptions.zOrderOnTop(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_useViewLifecycle))
        {
            googlemapoptions.useViewLifecycleInFragment(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiCompass))
        {
            googlemapoptions.compassEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiCompass, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiRotateGestures))
        {
            googlemapoptions.rotateGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiScrollGestures))
        {
            googlemapoptions.scrollGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiTiltGestures))
        {
            googlemapoptions.tiltGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiZoomGestures))
        {
            googlemapoptions.zoomGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiZoomControls))
        {
            googlemapoptions.zoomControlsEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_liteMode))
        {
            googlemapoptions.liteMode(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_liteMode, false));
        }
        if (typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiMapToolbar))
        {
            googlemapoptions.mapToolbarEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiMapToolbar, true));
        }
        googlemapoptions.camera(CameraPosition.createFromAttributes(context, attributeset));
        typedarray.recycle();
        return googlemapoptions;
    }

    private GoogleMapOptions liteMode(boolean flag)
    {
        ayV = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions mapToolbarEnabled(boolean flag)
    {
        ayW = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions mapType(int i)
    {
        ayN = i;
        return this;
    }

    private GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        ayU = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        ayR = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        ayT = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        ayM = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions zOrderOnTop(boolean flag)
    {
        ayL = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        ayP = Boolean.valueOf(flag);
        return this;
    }

    private GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        ayS = Boolean.valueOf(flag);
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final CameraPosition getCamera()
    {
        return ayO;
    }

    public final int getMapType()
    {
        return ayN;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    final byte pR()
    {
        return a.c(ayL);
    }

    final byte pS()
    {
        return a.c(ayM);
    }

    final byte pT()
    {
        return a.c(ayP);
    }

    final byte pU()
    {
        return a.c(ayQ);
    }

    final byte pV()
    {
        return a.c(ayR);
    }

    final byte pW()
    {
        return a.c(ayS);
    }

    final byte pX()
    {
        return a.c(ayT);
    }

    final byte pY()
    {
        return a.c(ayU);
    }

    final byte pZ()
    {
        return a.c(ayV);
    }

    final byte qa()
    {
        return a.c(ayW);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (aa.qp())
        {
            com.google.android.gms.maps.b.a(this, parcel, i);
            return;
        } else
        {
            com.google.android.gms.maps.a.a(this, parcel, i);
            return;
        }
    }

}
