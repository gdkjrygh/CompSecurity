// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.r;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBoundsCreator, LatLng, d

public final class LatLngBounds
    implements SafeParcelable
{
    public static final class Builder
    {

        private double qv;
        private double qw;
        private double qx;
        private double qy;

        private boolean b(double d1)
        {
            boolean flag = false;
            if (qx <= qy)
            {
                return qx <= d1 && d1 <= qy;
            }
            if (qx <= d1 || d1 <= qy)
            {
                flag = true;
            }
            return flag;
        }

        public LatLngBounds build()
        {
            boolean flag;
            if (!Double.isNaN(qx))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dm.a(flag, "no included points");
            return new LatLngBounds(new LatLng(qv, qx), new LatLng(qw, qy));
        }

        public Builder include(LatLng latlng)
        {
            qv = Math.min(qv, latlng.latitude);
            qw = Math.max(qw, latlng.latitude);
            double d1 = latlng.longitude;
            if (Double.isNaN(qx))
            {
                qx = d1;
                qy = d1;
            } else
            if (!b(d1))
            {
                if (LatLngBounds.d(qx, d1) < LatLngBounds.e(qy, d1))
                {
                    qx = d1;
                    return this;
                } else
                {
                    qy = d1;
                    return this;
                }
            }
            return this;
        }

        public Builder()
        {
            qv = (1.0D / 0.0D);
            qw = (-1.0D / 0.0D);
            qx = (0.0D / 0.0D);
            qy = (0.0D / 0.0D);
        }
    }


    public static final LatLngBoundsCreator CREATOR = new LatLngBoundsCreator();
    private final int iM;
    public final LatLng northeast;
    public final LatLng southwest;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        dm.a(latlng, "null southwest");
        dm.a(latlng1, "null northeast");
        boolean flag;
        if (latlng1.latitude >= latlng.latitude)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.a(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.latitude), Double.valueOf(latlng1.latitude)
        });
        iM = i;
        southwest = latlng;
        northeast = latlng1;
    }

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        this(1, latlng, latlng1);
    }

    private boolean a(double d1)
    {
        return southwest.latitude <= d1 && d1 <= northeast.latitude;
    }

    private static double b(double d1, double d2)
    {
        return ((d1 - d2) + 360D) % 360D;
    }

    private boolean b(double d1)
    {
        boolean flag = false;
        if (southwest.longitude <= northeast.longitude)
        {
            return southwest.longitude <= d1 && d1 <= northeast.longitude;
        }
        if (southwest.longitude <= d1 || d1 <= northeast.longitude)
        {
            flag = true;
        }
        return flag;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    private static double c(double d1, double d2)
    {
        return ((d2 - d1) + 360D) % 360D;
    }

    static double d(double d1, double d2)
    {
        return b(d1, d2);
    }

    static double e(double d1, double d2)
    {
        return c(d1, d2);
    }

    public boolean contains(LatLng latlng)
    {
        return a(latlng.latitude) && b(latlng.longitude);
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
            if (!southwest.equals(((LatLngBounds) (obj)).southwest) || !northeast.equals(((LatLngBounds) (obj)).northeast))
            {
                return false;
            }
        }
        return true;
    }

    public LatLng getCenter()
    {
        double d2 = (southwest.latitude + northeast.latitude) / 2D;
        double d1 = northeast.longitude;
        double d3 = southwest.longitude;
        if (d3 <= d1)
        {
            d1 = (d1 + d3) / 2D;
        } else
        {
            d1 = (d1 + 360D + d3) / 2D;
        }
        return new LatLng(d2, d1);
    }

    int getVersionCode()
    {
        return iM;
    }

    public int hashCode()
    {
        return dl.hashCode(new Object[] {
            southwest, northeast
        });
    }

    public LatLngBounds including(LatLng latlng)
    {
        double d4 = Math.min(southwest.latitude, latlng.latitude);
        double d5 = Math.max(northeast.latitude, latlng.latitude);
        double d2 = northeast.longitude;
        double d3 = southwest.longitude;
        double d1 = latlng.longitude;
        if (!b(d1))
        {
            if (b(d3, d1) >= c(d2, d1))
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

    public String toString()
    {
        return dl.d(this).a("southwest", southwest).a("northeast", northeast).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (r.cK())
        {
            com.google.android.gms.maps.model.d.a(this, parcel, i);
            return;
        } else
        {
            LatLngBoundsCreator.a(this, parcel, i);
            return;
        }
    }

}
