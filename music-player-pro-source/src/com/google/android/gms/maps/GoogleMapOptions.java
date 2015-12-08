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
    private final int CK;
    private Boolean akF;
    private Boolean akG;
    private int akH;
    private CameraPosition akI;
    private Boolean akJ;
    private Boolean akK;
    private Boolean akL;
    private Boolean akM;
    private Boolean akN;
    private Boolean akO;
    private Boolean akP;
    private Boolean akQ;

    public GoogleMapOptions()
    {
        akH = -1;
        CK = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9)
    {
        akH = -1;
        CK = i;
        akF = a.a(byte0);
        akG = a.a(byte1);
        akH = j;
        akI = cameraposition;
        akJ = a.a(byte2);
        akK = a.a(byte3);
        akL = a.a(byte4);
        akM = a.a(byte5);
        akN = a.a(byte6);
        akO = a.a(byte7);
        akP = a.a(byte8);
        akQ = a.a(byte9);
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

    public GoogleMapOptions camera(CameraPosition cameraposition)
    {
        akI = cameraposition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean flag)
    {
        akK = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CameraPosition getCamera()
    {
        return akI;
    }

    public Boolean getCompassEnabled()
    {
        return akK;
    }

    public Boolean getLiteMode()
    {
        return akP;
    }

    public Boolean getMapToolbarEnabled()
    {
        return akQ;
    }

    public int getMapType()
    {
        return akH;
    }

    public Boolean getRotateGesturesEnabled()
    {
        return akO;
    }

    public Boolean getScrollGesturesEnabled()
    {
        return akL;
    }

    public Boolean getTiltGesturesEnabled()
    {
        return akN;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return akG;
    }

    int getVersionCode()
    {
        return CK;
    }

    public Boolean getZOrderOnTop()
    {
        return akF;
    }

    public Boolean getZoomControlsEnabled()
    {
        return akJ;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return akM;
    }

    public GoogleMapOptions liteMode(boolean flag)
    {
        akP = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean flag)
    {
        akQ = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions mapType(int i)
    {
        akH = i;
        return this;
    }

    byte nD()
    {
        return a.c(akF);
    }

    byte nE()
    {
        return a.c(akG);
    }

    byte nF()
    {
        return a.c(akJ);
    }

    byte nG()
    {
        return a.c(akK);
    }

    byte nH()
    {
        return a.c(akL);
    }

    byte nI()
    {
        return a.c(akM);
    }

    byte nJ()
    {
        return a.c(akN);
    }

    byte nK()
    {
        return a.c(akO);
    }

    byte nL()
    {
        return a.c(akP);
    }

    byte nM()
    {
        return a.c(akQ);
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        akO = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        akL = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        akN = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        akG = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (aa.ob())
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
        akF = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        akJ = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        akM = Boolean.valueOf(flag);
        return this;
    }

}
