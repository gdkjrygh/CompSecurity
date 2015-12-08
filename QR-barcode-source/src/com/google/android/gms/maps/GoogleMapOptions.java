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
//            a, b

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.a CREATOR = new com.google.android.gms.maps.a();
    private final int BR;
    private Boolean aiG;
    private Boolean aiH;
    private int aiI;
    private CameraPosition aiJ;
    private Boolean aiK;
    private Boolean aiL;
    private Boolean aiM;
    private Boolean aiN;
    private Boolean aiO;
    private Boolean aiP;

    public GoogleMapOptions()
    {
        aiI = -1;
        BR = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7)
    {
        aiI = -1;
        BR = i;
        aiG = a.a(byte0);
        aiH = a.a(byte1);
        aiI = j;
        aiJ = cameraposition;
        aiK = a.a(byte2);
        aiL = a.a(byte3);
        aiM = a.a(byte4);
        aiN = a.a(byte5);
        aiO = a.a(byte6);
        aiP = a.a(byte7);
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
        googlemapoptions.camera(CameraPosition.createFromAttributes(context, attributeset));
        typedarray.recycle();
        return googlemapoptions;
    }

    public GoogleMapOptions camera(CameraPosition cameraposition)
    {
        aiJ = cameraposition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean flag)
    {
        aiL = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CameraPosition getCamera()
    {
        return aiJ;
    }

    public Boolean getCompassEnabled()
    {
        return aiL;
    }

    public int getMapType()
    {
        return aiI;
    }

    public Boolean getRotateGesturesEnabled()
    {
        return aiP;
    }

    public Boolean getScrollGesturesEnabled()
    {
        return aiM;
    }

    public Boolean getTiltGesturesEnabled()
    {
        return aiO;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return aiH;
    }

    int getVersionCode()
    {
        return BR;
    }

    public Boolean getZOrderOnTop()
    {
        return aiG;
    }

    public Boolean getZoomControlsEnabled()
    {
        return aiK;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return aiN;
    }

    public GoogleMapOptions mapType(int i)
    {
        aiI = i;
        return this;
    }

    byte mr()
    {
        return a.c(aiG);
    }

    byte ms()
    {
        return a.c(aiH);
    }

    byte mt()
    {
        return a.c(aiK);
    }

    byte mu()
    {
        return a.c(aiL);
    }

    byte mv()
    {
        return a.c(aiM);
    }

    byte mw()
    {
        return a.c(aiN);
    }

    byte mx()
    {
        return a.c(aiO);
    }

    byte my()
    {
        return a.c(aiP);
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        aiP = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        aiM = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        aiO = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        aiH = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.mM())
        {
            com.google.android.gms.maps.b.a(this, parcel, i);
            return;
        } else
        {
            com.google.android.gms.maps.a.a(this, parcel, i);
            return;
        }
    }

    public GoogleMapOptions zOrderOnTop(boolean flag)
    {
        aiG = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        aiK = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        aiN = Boolean.valueOf(flag);
        return this;
    }

}
