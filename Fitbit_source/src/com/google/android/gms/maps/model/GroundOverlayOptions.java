// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.internal.n;

// Referenced classes of package com.google.android.gms.maps.model:
//            q, a, r, LatLng, 
//            LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final q CREATOR = new q();
    public static final float a = -1F;
    private final int b;
    private a c;
    private LatLng d;
    private float e;
    private float f;
    private LatLngBounds g;
    private float h;
    private float i;
    private boolean j;
    private float k;
    private float l;
    private float m;

    public GroundOverlayOptions()
    {
        j = true;
        k = 0.0F;
        l = 0.5F;
        m = 0.5F;
        b = 1;
    }

    GroundOverlayOptions(int i1, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        j = true;
        k = 0.0F;
        l = 0.5F;
        m = 0.5F;
        b = i1;
        c = new a(com.google.android.gms.dynamic.e.a.a(ibinder));
        d = latlng;
        e = f1;
        f = f2;
        g = latlngbounds;
        h = f3;
        i = f4;
        j = flag;
        k = f5;
        l = f6;
        m = f7;
    }

    private GroundOverlayOptions b(LatLng latlng, float f1, float f2)
    {
        d = latlng;
        e = f1;
        f = f2;
        return this;
    }

    IBinder a()
    {
        return c.a().asBinder();
    }

    public GroundOverlayOptions a(float f1)
    {
        h = (f1 % 360F + 360F) % 360F;
        return this;
    }

    public GroundOverlayOptions a(float f1, float f2)
    {
        l = f1;
        m = f2;
        return this;
    }

    public GroundOverlayOptions a(LatLng latlng, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        am.b(flag, "Width must be non-negative");
        return b(latlng, f1, -1F);
    }

    public GroundOverlayOptions a(LatLng latlng, float f1, float f2)
    {
        boolean flag1 = true;
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "Width must be non-negative");
        if (f2 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        am.b(flag, "Height must be non-negative");
        return b(latlng, f1, f2);
    }

    public GroundOverlayOptions a(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (d == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a(flag, (new StringBuilder()).append("Position has already been set using position: ").append(d).toString());
        g = latlngbounds;
        return this;
    }

    public GroundOverlayOptions a(a a1)
    {
        c = a1;
        return this;
    }

    public GroundOverlayOptions a(boolean flag)
    {
        j = flag;
        return this;
    }

    int b()
    {
        return b;
    }

    public GroundOverlayOptions b(float f1)
    {
        i = f1;
        return this;
    }

    public GroundOverlayOptions c(float f1)
    {
        boolean flag;
        if (f1 >= 0.0F && f1 <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "Transparency must be in the range [0..1]");
        k = f1;
        return this;
    }

    public a c()
    {
        return c;
    }

    public LatLng d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public float e()
    {
        return e;
    }

    public float f()
    {
        return f;
    }

    public LatLngBounds g()
    {
        return g;
    }

    public float h()
    {
        return h;
    }

    public float i()
    {
        return i;
    }

    public float j()
    {
        return k;
    }

    public float k()
    {
        return l;
    }

    public float l()
    {
        return m;
    }

    public boolean m()
    {
        return j;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        if (n.a())
        {
            r.a(this, parcel, i1);
            return;
        } else
        {
            q.a(this, parcel, i1);
            return;
        }
    }

}
