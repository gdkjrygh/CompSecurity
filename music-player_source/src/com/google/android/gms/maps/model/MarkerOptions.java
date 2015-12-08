// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            h, a, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final h a = new h();
    private final int b;
    private LatLng c;
    private String d;
    private String e;
    private a f;
    private float g;
    private float h;
    private boolean i;
    private boolean j;
    private boolean k;
    private float l;
    private float m;
    private float n;
    private float o;

    public MarkerOptions()
    {
        g = 0.5F;
        h = 1.0F;
        j = true;
        k = false;
        l = 0.0F;
        m = 0.5F;
        n = 0.0F;
        o = 1.0F;
        b = 1;
    }

    MarkerOptions(int i1, LatLng latlng, String s, String s1, IBinder ibinder, float f1, float f2, 
            boolean flag, boolean flag1, boolean flag2, float f3, float f4, float f5, float f6)
    {
        g = 0.5F;
        h = 1.0F;
        j = true;
        k = false;
        l = 0.0F;
        m = 0.5F;
        n = 0.0F;
        o = 1.0F;
        b = i1;
        c = latlng;
        d = s;
        e = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new a(com.google.android.gms.a.d.a(ibinder));
        }
        f = latlng;
        g = f1;
        h = f2;
        i = flag;
        j = flag1;
        k = flag2;
        l = f3;
        m = f4;
        n = f5;
        o = f6;
    }

    final int a()
    {
        return b;
    }

    final IBinder b()
    {
        if (f == null)
        {
            return null;
        } else
        {
            return f.a().asBinder();
        }
    }

    public final LatLng c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return e;
    }

    public final float f()
    {
        return g;
    }

    public final float g()
    {
        return h;
    }

    public final boolean h()
    {
        return i;
    }

    public final boolean i()
    {
        return j;
    }

    public final boolean j()
    {
        return k;
    }

    public final float k()
    {
        return l;
    }

    public final float l()
    {
        return m;
    }

    public final float m()
    {
        return n;
    }

    public final float n()
    {
        return o;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, c, i1, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, b());
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, g);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, h);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, j);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
            return;
        } else
        {
            com.google.android.gms.maps.model.h.a(this, parcel, i1);
            return;
        }
    }

}
