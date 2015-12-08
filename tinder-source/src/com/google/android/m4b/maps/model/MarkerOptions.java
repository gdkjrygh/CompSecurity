// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.model:
//            k, a, LatLng

public final class MarkerOptions
    implements c
{

    public static final k CREATOR = new k();
    final int a;
    public LatLng b;
    public String c;
    public String d;
    public a e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public boolean j;
    public float k;
    public float l;
    public float m;
    public float n;

    public MarkerOptions()
    {
        f = 0.5F;
        g = 1.0F;
        i = true;
        j = false;
        k = 0.0F;
        l = 0.5F;
        m = 0.0F;
        n = 1.0F;
        a = 1;
    }

    MarkerOptions(int i1, LatLng latlng, String s, String s1, IBinder ibinder, float f1, float f2, 
            boolean flag, boolean flag1, boolean flag2, float f3, float f4, float f5, float f6)
    {
        f = 0.5F;
        g = 1.0F;
        i = true;
        j = false;
        k = 0.0F;
        l = 0.5F;
        m = 0.0F;
        n = 1.0F;
        a = i1;
        b = latlng;
        c = s;
        d = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new a(com.google.android.m4b.maps.da.b.a.a(ibinder));
        }
        e = latlng;
        f = f1;
        g = f2;
        h = flag;
        i = flag1;
        j = flag2;
        k = f3;
        l = f4;
        m = f5;
        n = f6;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.m4b.maps.model.k.a(this, parcel, i1);
    }

}
