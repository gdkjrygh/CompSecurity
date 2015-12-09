// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.b.k;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.internal.ag;

// Referenced classes of package com.google.android.gms.maps.model:
//            n, a, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final n CREATOR = new n();
    private final int a;
    private LatLng b;
    private String c;
    private String d;
    private a e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    private float n;

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
            latlng = new a(com.google.android.gms.b.k.a(ibinder));
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

    final int a()
    {
        return a;
    }

    public final MarkerOptions a(LatLng latlng)
    {
        b = latlng;
        return this;
    }

    public final MarkerOptions a(a a1)
    {
        e = a1;
        return this;
    }

    final IBinder b()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.a().asBinder();
        }
    }

    public final LatLng c()
    {
        return b;
    }

    public final String d()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return d;
    }

    public final float f()
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

    public final boolean i()
    {
        return i;
    }

    public final boolean j()
    {
        return j;
    }

    public final float k()
    {
        return k;
    }

    public final float l()
    {
        return l;
    }

    public final float m()
    {
        return m;
    }

    public final float n()
    {
        return n;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        if (ag.a())
        {
            int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, i1);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, b());
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, g);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, h);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
            return;
        } else
        {
            com.google.android.gms.maps.model.n.a(this, parcel, i1);
            return;
        }
    }

}
