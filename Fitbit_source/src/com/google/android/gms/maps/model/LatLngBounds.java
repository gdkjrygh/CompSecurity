// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ak;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.internal.n;

// Referenced classes of package com.google.android.gms.maps.model:
//            s, LatLng, t

public final class LatLngBounds
    implements SafeParcelable
{

    public static final s CREATOR = new s();
    public final LatLng a;
    public final LatLng b;
    private final int c;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        am.a(latlng, "null southwest");
        am.a(latlng1, "null northeast");
        boolean flag;
        if (latlng1.a >= latlng.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.a), Double.valueOf(latlng1.a)
        });
        c = i;
        a = latlng;
        b = latlng1;
    }

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        this(1, latlng, latlng1);
    }

    static double a(double d1, double d2)
    {
        return c(d1, d2);
    }

    private boolean a(double d1)
    {
        return a.a <= d1 && d1 <= b.a;
    }

    static double b(double d1, double d2)
    {
        return d(d1, d2);
    }

    public static a b()
    {
    /* block-local class not found */
    class a {}

        return new a();
    }

    private boolean b(double d1)
    {
        boolean flag = false;
        if (a.b <= b.b)
        {
            return a.b <= d1 && d1 <= b.b;
        }
        if (a.b <= d1 || d1 <= b.b)
        {
            flag = true;
        }
        return flag;
    }

    private static double c(double d1, double d2)
    {
        return ((d1 - d2) + 360D) % 360D;
    }

    private static double d(double d1, double d2)
    {
        return ((d2 - d1) + 360D) % 360D;
    }

    int a()
    {
        return c;
    }

    public boolean a(LatLng latlng)
    {
        return a(latlng.a) && b(latlng.b);
    }

    public LatLngBounds b(LatLng latlng)
    {
        double d4 = Math.min(a.a, latlng.a);
        double d5 = Math.max(b.a, latlng.a);
        double d2 = b.b;
        double d3 = a.b;
        double d1 = latlng.b;
        if (!b(d1))
        {
            if (c(d3, d1) >= d(d2, d1))
            {
                d2 = d1;
                d1 = d3;
            }
        } else
        {
            d1 = d3;
        }
        return new LatLngBounds(new LatLng(d4, d1), new LatLng(d5, d2));
    }

    public LatLng c()
    {
        double d2 = (a.a + b.a) / 2D;
        double d1 = b.b;
        double d3 = a.b;
        if (d3 <= d1)
        {
            d1 = (d1 + d3) / 2D;
        } else
        {
            d1 = (d1 + 360D + d3) / 2D;
        }
        return new LatLng(d2, d1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLngBounds))
            {
                return false;
            }
            obj = (LatLngBounds)obj;
            if (!a.equals(((LatLngBounds) (obj)).a) || !b.equals(((LatLngBounds) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ak.a(new Object[] {
            a, b
        });
    }

    public String toString()
    {
        return ak.a(this).a("southwest", a).a("northeast", b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (n.a())
        {
            t.a(this, parcel, i);
            return;
        } else
        {
            s.a(this, parcel, i);
            return;
        }
    }

}
