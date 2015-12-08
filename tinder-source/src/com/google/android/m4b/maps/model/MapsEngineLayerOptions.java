// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.model:
//            i, MapsEngineLayerInfo

public final class MapsEngineLayerOptions
    implements c
{

    public static final i CREATOR = new i();
    final int a;
    public MapsEngineLayerInfo b;
    public boolean c;
    public float d;
    public boolean e;

    public MapsEngineLayerOptions()
    {
        b = new MapsEngineLayerInfo();
        c = true;
        e = true;
        a = 1;
    }

    MapsEngineLayerOptions(int j, MapsEngineLayerInfo mapsenginelayerinfo, boolean flag, float f, boolean flag1)
    {
        b = new MapsEngineLayerInfo();
        c = true;
        e = true;
        a = j;
        b = mapsenginelayerinfo;
        c = flag;
        d = f;
        e = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
