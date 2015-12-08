// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            h, a, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    final int a;
    LatLng b;
    String c;
    String d;
    a e;
    float f;
    float g;
    boolean h;
    boolean i;
    boolean j;
    float k;
    float l;
    float m;
    float n;

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
            latlng = new a(com.google.android.gms.dynamic.a.a.a(ibinder));
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
        com.google.android.gms.maps.model.h.a(this, parcel, i1);
    }

}
