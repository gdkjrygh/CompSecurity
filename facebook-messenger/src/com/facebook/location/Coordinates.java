// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.location:
//            a, b

public class Coordinates
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final double a;
    private final double b;
    private final Double c;
    private final Float d;
    private final Float e;
    private final Float f;
    private final Float g;

    private Coordinates(Parcel parcel)
    {
        a = parcel.readDouble();
        b = parcel.readDouble();
        c = (Double)parcel.readValue(null);
        d = (Float)parcel.readValue(null);
        e = (Float)parcel.readValue(null);
        f = (Float)parcel.readValue(null);
        g = (Float)parcel.readValue(null);
    }

    Coordinates(Parcel parcel, a a1)
    {
        this(parcel);
    }

    Coordinates(b b1)
    {
        boolean flag;
        if (b1.a() != null && b1.b() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = b1.a().doubleValue();
        b = b1.b().doubleValue();
        c = b1.c();
        d = b1.d();
        e = b1.e();
        f = b1.f();
        g = b1.g();
    }

    public static Coordinates a(Location location)
    {
        if (location == null)
        {
            return null;
        } else
        {
            return newBuilder().a(Double.valueOf(location.getLatitude())).b(Double.valueOf(location.getLongitude())).c(Double.valueOf(location.getAltitude())).a(Float.valueOf(location.getAccuracy())).c(Float.valueOf(location.getBearing())).d(Float.valueOf(location.getSpeed())).h();
        }
    }

    public static b newBuilder()
    {
        return new b();
    }

    public Location a()
    {
        Location location = new Location("");
        location.setLatitude(a);
        location.setLongitude(b);
        if (c != null)
        {
            location.setAltitude(c.doubleValue());
        }
        if (d != null)
        {
            location.setAccuracy(d.floatValue());
        }
        if (g != null)
        {
            location.setSpeed(g.floatValue());
        }
        return location;
    }

    public double b()
    {
        return a;
    }

    public double c()
    {
        return b;
    }

    public Double d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return c != null;
    }

    public Float f()
    {
        return d;
    }

    public boolean g()
    {
        return d != null;
    }

    public Float h()
    {
        return e;
    }

    public boolean i()
    {
        return e != null;
    }

    public Float j()
    {
        return f;
    }

    public boolean k()
    {
        return f != null;
    }

    public Float l()
    {
        return g;
    }

    public boolean m()
    {
        return g != null;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeDouble(a);
        parcel.writeDouble(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
        parcel.writeValue(e);
        parcel.writeValue(f);
        parcel.writeValue(g);
    }

}
