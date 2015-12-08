// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            h, LatLng

public final class LatLngBounds
    implements SafeParcelable
{
    public static final class a
    {

        private double a;
        private double b;
        private double c;
        private double d;

        public final a a(LatLng latlng)
        {
            double d1;
            boolean flag1;
            flag1 = true;
            a = Math.min(a, latlng.a);
            b = Math.max(b, latlng.a);
            d1 = latlng.b;
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

        public final LatLngBounds a()
        {
            boolean flag;
            if (!Double.isNaN(c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            y.a(flag, "no included points");
            return new LatLngBounds(new LatLng(a, c), new LatLng(b, d));
        }

        public a()
        {
            a = (1.0D / 0.0D);
            b = (-1.0D / 0.0D);
            c = (0.0D / 0.0D);
            d = (0.0D / 0.0D);
        }
    }


    public static final h CREATOR = new h();
    public final LatLng a;
    public final LatLng b;
    private final int c;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        y.a(latlng, "null southwest");
        y.a(latlng1, "null northeast");
        boolean flag;
        if (latlng1.a >= latlng.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.b(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
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

    static double a(double d, double d1)
    {
        return ((d - d1) + 360D) % 360D;
    }

    static double b(double d, double d1)
    {
        return ((d1 - d) + 360D) % 360D;
    }

    final int a()
    {
        return c;
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
            if (!a.equals(((LatLngBounds) (obj)).a) || !b.equals(((LatLngBounds) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b
        });
    }

    public final String toString()
    {
        return x.a(this).a("southwest", a).a("northeast", b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
