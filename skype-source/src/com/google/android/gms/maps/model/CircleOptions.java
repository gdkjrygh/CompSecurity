// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            f, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final int a;
    private LatLng b;
    private double c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;

    public CircleOptions()
    {
        b = null;
        c = 0.0D;
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        a = 1;
    }

    CircleOptions(int i, LatLng latlng, double d1, float f1, int j, int k, 
            float f2, boolean flag)
    {
        b = null;
        c = 0.0D;
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        a = i;
        b = latlng;
        c = d1;
        d = f1;
        e = j;
        f = k;
        g = f2;
        h = flag;
    }

    final int a()
    {
        return a;
    }

    public final LatLng b()
    {
        return b;
    }

    public final double c()
    {
        return c;
    }

    public final float d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return e;
    }

    public final int f()
    {
        return f;
    }

    public final float g()
    {
        return g;
    }

    public final boolean h()
    {
        return h;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.model.f.a(this, parcel, i);
    }

}
