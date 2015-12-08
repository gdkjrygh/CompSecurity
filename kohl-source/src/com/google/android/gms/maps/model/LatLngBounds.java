// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.hn;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBoundsCreator, LatLng, d

public final class LatLngBounds
    implements SafeParcelable
{
    public static final class Builder
    {

        private double aaH;
        private double aaI;
        private double aaJ;
        private double aaK;

        private boolean d(double d1)
        {
            boolean flag = false;
            if (aaJ <= aaK)
            {
                return aaJ <= d1 && d1 <= aaK;
            }
            if (aaJ <= d1 || d1 <= aaK)
            {
                flag = true;
            }
            return flag;
        }

        public LatLngBounds build()
        {
            boolean flag;
            if (!Double.isNaN(aaJ))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hn.a(flag, "no included points");
            return new LatLngBounds(new LatLng(aaH, aaJ), new LatLng(aaI, aaK));
        }

        public Builder include(LatLng latlng)
        {
            aaH = Math.min(aaH, latlng.latitude);
            aaI = Math.max(aaI, latlng.latitude);
            double d1 = latlng.longitude;
            if (Double.isNaN(aaJ))
            {
                aaJ = d1;
                aaK = d1;
            } else
            if (!d(d1))
            {
                if (LatLngBounds.d(aaJ, d1) < LatLngBounds.e(aaK, d1))
                {
                    aaJ = d1;
                    return this;
                } else
                {
                    aaK = d1;
                    return this;
                }
            }
            return this;
        }

        public Builder()
        {
            aaH = (1.0D / 0.0D);
            aaI = (-1.0D / 0.0D);
            aaJ = (0.0D / 0.0D);
            aaK = (0.0D / 0.0D);
        }
    }


    public static final LatLngBoundsCreator CREATOR = new LatLngBoundsCreator();
    public final LatLng northeast;
    public final LatLng southwest;
    private final int xJ;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        hn.b(latlng, "null southwest");
        hn.b(latlng1, "null northeast");
        boolean flag;
        if (latlng1.latitude >= latlng.latitude)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.latitude), Double.valueOf(latlng1.latitude)
        });
        xJ = i;
        southwest = latlng;
        northeast = latlng1;
    }

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        this(1, latlng, latlng1);
    }

    private static double b(double d1, double d2)
    {
        return ((d1 - d2) + 360D) % 360D;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    private static double c(double d1, double d2)
    {
        return ((d2 - d1) + 360D) % 360D;
    }

    private boolean c(double d1)
    {
        return southwest.latitude <= d1 && d1 <= northeast.latitude;
    }

    static double d(double d1, double d2)
    {
        return b(d1, d2);
    }

    private boolean d(double d1)
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

    static double e(double d1, double d2)
    {
        return c(d1, d2);
    }

    public boolean contains(LatLng latlng)
    {
        return c(latlng.latitude) && d(latlng.longitude);
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
        return xJ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
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
        if (!d(d1))
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
        return hl.e(this).a("southwest", southwest).a("northeast", northeast).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jG())
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
