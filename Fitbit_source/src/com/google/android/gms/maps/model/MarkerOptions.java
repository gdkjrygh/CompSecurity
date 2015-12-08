// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.internal.n;

// Referenced classes of package com.google.android.gms.maps.model:
//            w, a, x, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final w CREATOR = new w();
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
            latlng = new a(com.google.android.gms.dynamic.e.a.a(ibinder));
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

    int a()
    {
        return a;
    }

    public MarkerOptions a(float f1)
    {
        k = f1;
        return this;
    }

    public MarkerOptions a(float f1, float f2)
    {
        f = f1;
        g = f2;
        return this;
    }

    public MarkerOptions a(LatLng latlng)
    {
        b = latlng;
        return this;
    }

    public MarkerOptions a(a a1)
    {
        e = a1;
        return this;
    }

    public MarkerOptions a(String s)
    {
        c = s;
        return this;
    }

    public MarkerOptions a(boolean flag)
    {
        h = flag;
        return this;
    }

    IBinder b()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.a().asBinder();
        }
    }

    public MarkerOptions b(float f1)
    {
        n = f1;
        return this;
    }

    public MarkerOptions b(float f1, float f2)
    {
        l = f1;
        m = f2;
        return this;
    }

    public MarkerOptions b(String s)
    {
        d = s;
        return this;
    }

    public MarkerOptions b(boolean flag)
    {
        i = flag;
        return this;
    }

    public LatLng c()
    {
        return b;
    }

    public MarkerOptions c(boolean flag)
    {
        j = flag;
        return this;
    }

    public String d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return d;
    }

    public a f()
    {
        return e;
    }

    public float g()
    {
        return f;
    }

    public float h()
    {
        return g;
    }

    public boolean i()
    {
        return h;
    }

    public boolean j()
    {
        return i;
    }

    public boolean k()
    {
        return j;
    }

    public float l()
    {
        return k;
    }

    public float m()
    {
        return l;
    }

    public float n()
    {
        return m;
    }

    public float o()
    {
        return n;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        if (com.google.android.gms.maps.internal.n.a())
        {
            x.a(this, parcel, i1);
            return;
        } else
        {
            w.a(this, parcel, i1);
            return;
        }
    }

}
