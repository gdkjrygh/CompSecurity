// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.model:
//            f, LatLng

public final class LatLngBounds
    implements c
{
    public static final class a
    {

        public double a;
        public double b;
        public double c;
        public double d;

        public final a a(LatLng latlng)
        {
            double d1;
            boolean flag1;
            flag1 = true;
            a = Math.min(a, latlng.b);
            b = Math.max(b, latlng.b);
            d1 = latlng.c;
            if (!Double.isNaN(c)) goto _L2; else goto _L1
_L1:
            c = d1;
_L6:
            d = d1;
_L4:
            return this;
_L2:
            boolean flag;
            if (c <= d)
            {
                if (c <= d1 && d1 <= d)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = flag1;
                if (c > d1)
                {
                    flag = flag1;
                    if (d1 > d)
                    {
                        flag = false;
                    }
                }
            }
            if (flag) goto _L4; else goto _L3
_L3:
            if (LatLngBounds.a(c, d1) < LatLngBounds.b(d, d1))
            {
                c = d1;
                return this;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public a()
        {
            a = (1.0D / 0.0D);
            b = (-1.0D / 0.0D);
            c = (0.0D / 0.0D);
            d = (0.0D / 0.0D);
        }
    }


    public static final f CREATOR = new f();
    final int a;
    public final LatLng b;
    public final LatLng c;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        x.a(latlng, "null southwest");
        x.a(latlng1, "null northeast");
        boolean flag;
        if (latlng1.b >= latlng.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.b), Double.valueOf(latlng1.b)
        });
        a = i;
        b = latlng;
        c = latlng1;
    }

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        this(1, latlng, latlng1);
    }

    static double a(double d, double d1)
    {
        return ((d - d1) + 360D) % 360D;
    }

    public static a a()
    {
        return new a();
    }

    static double b(double d, double d1)
    {
        return ((d1 - d) + 360D) % 360D;
    }

    public final LatLng b()
    {
        double d1 = (b.b + c.b) / 2D;
        double d = c.c;
        double d2 = b.c;
        if (d2 <= d)
        {
            d = (d + d2) / 2D;
        } else
        {
            d = (d + 360D + d2) / 2D;
        }
        return new LatLng(d1, d);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLngBounds))
            {
                return false;
            }
            obj = (LatLngBounds)obj;
            if (!b.equals(((LatLngBounds) (obj)).b) || !c.equals(((LatLngBounds) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c
        });
    }

    public final String toString()
    {
        return v.a(this).a("southwest", b).a("northeast", c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
