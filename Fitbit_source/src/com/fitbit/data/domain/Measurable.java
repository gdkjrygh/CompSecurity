// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.fitbit.util.e;
import java.io.Serializable;

public abstract class Measurable
    implements Parcelable, Serializable, Cloneable
{

    public static final double a = -1D;
    private Enum units;
    private double value;

    public Measurable()
    {
    }

    protected static Pair a(Parcel parcel)
    {
        return Pair.create(Double.valueOf(parcel.readDouble()), (Enum)parcel.readSerializable());
    }

    public abstract Measurable a(Enum enum);

    public Enum a()
    {
        return units;
    }

    public void a(double d)
    {
        value = d;
    }

    public boolean a(double d, double d1, Enum enum)
    {
        double d2 = a(enum).b();
        return d2 >= d && d2 <= d1;
    }

    public double b()
    {
        return value;
    }

    public void b(Enum enum)
    {
        boolean flag;
        if (enum != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e.a(flag);
        units = enum;
    }

    protected Object clone()
    {
        Measurable measurable = (Measurable)super.clone();
        boolean flag;
        if (measurable.units != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            e.a(flag);
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new RuntimeException(clonenotsupportedexception);
        }
        return measurable;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !obj.getClass().equals(getClass())) 
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }
        obj = (Measurable)obj;
        double d;
        boolean flag;
        if (units == ((Measurable) (obj)).units)
        {
            d = ((Measurable) (obj)).value;
        } else
        {
            d = ((Measurable) (obj)).a(units).value;
        }
        if (Math.abs(value - d) < 0.001D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public String toString()
    {
        return String.format("%s %s", new Object[] {
            com.fitbit.util.format.e.a(b()), a().toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeDouble(value);
        parcel.writeSerializable(units);
    }
}
