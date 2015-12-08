// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.m4b.maps.df.a;
import com.google.android.m4b.maps.k.c;
import com.google.android.m4b.maps.model.CameraPosition;

// Referenced classes of package com.google.android.m4b.maps:
//            d

public final class GoogleMapOptions
    implements c
{

    public static final d CREATOR = new d();
    final int a;
    public Boolean b;
    public Boolean c;
    public int d;
    public CameraPosition e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Boolean n;

    public GoogleMapOptions()
    {
        d = -1;
        a = 1;
    }

    GoogleMapOptions(int i1, byte byte0, byte byte1, int j1, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10)
    {
        d = -1;
        a = i1;
        b = com.google.android.m4b.maps.df.a.a(byte0);
        c = com.google.android.m4b.maps.df.a.a(byte1);
        d = j1;
        e = cameraposition;
        f = com.google.android.m4b.maps.df.a.a(byte2);
        g = com.google.android.m4b.maps.df.a.a(byte3);
        h = com.google.android.m4b.maps.df.a.a(byte4);
        i = com.google.android.m4b.maps.df.a.a(byte5);
        j = com.google.android.m4b.maps.df.a.a(byte6);
        k = com.google.android.m4b.maps.df.a.a(byte7);
        l = com.google.android.m4b.maps.df.a.a(byte8);
        m = com.google.android.m4b.maps.df.a.a(byte9);
        n = com.google.android.m4b.maps.df.a.a(byte10);
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, h.i.MapM4bAttrs);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_mapType))
        {
            googlemapoptions.d = typedarray.getInt(h.i.MapM4bAttrs_m4b_mapType, -1);
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_zOrderOnTop))
        {
            googlemapoptions.b = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_zOrderOnTop, false));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_useViewLifecycle))
        {
            googlemapoptions.c = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_useViewLifecycle, false));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_uiCompass))
        {
            googlemapoptions.g = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_uiCompass, true));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_uiRotateGestures))
        {
            googlemapoptions.k = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_uiRotateGestures, true));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_uiScrollGestures))
        {
            googlemapoptions.h = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_uiScrollGestures, true));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_uiTiltGestures))
        {
            googlemapoptions.j = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_uiTiltGestures, true));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_uiZoomGestures))
        {
            googlemapoptions.i = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_uiZoomGestures, true));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_uiZoomControls))
        {
            googlemapoptions.f = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_uiZoomControls, true));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_liteMode))
        {
            googlemapoptions.l = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_liteMode, false));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_uiMapToolbar))
        {
            googlemapoptions.m = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_uiMapToolbar, true));
        }
        if (typedarray.hasValue(h.i.MapM4bAttrs_m4b_ambientEnabled))
        {
            googlemapoptions.n = Boolean.valueOf(typedarray.getBoolean(h.i.MapM4bAttrs_m4b_ambientEnabled, false));
        }
        googlemapoptions.e = CameraPosition.a(context, attributeset);
        typedarray.recycle();
        return googlemapoptions;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.m4b.maps.d.a(this, parcel, i1);
    }

}
