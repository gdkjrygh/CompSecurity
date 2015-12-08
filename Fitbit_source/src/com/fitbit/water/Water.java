// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water;

import android.os.Parcel;
import android.util.Pair;
import com.fitbit.b.a;
import com.fitbit.data.domain.Measurable;
import com.fitbit.util.an;
import com.fitbit.util.format.e;

public class Water extends Measurable
    implements Cloneable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Water a(Parcel parcel)
        {
            parcel = Water.b(parcel);
            return new Water(((Double)((Pair) (parcel)).first).doubleValue(), (com.fitbit.data.domain.WaterLogEntry.WaterUnits)((Pair) (parcel)).second);
        }

        public Water[] a(int i)
        {
            return new Water[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public static final Water b;
    private static final long serialVersionUID = 0x844f9e9cba27cbc7L;

    public Water()
    {
        this(0.0D, com.fitbit.data.domain.WaterLogEntry.WaterUnits.CUP);
    }

    public Water(double d, com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits)
    {
        a(d);
        b(waterunits);
    }

    static Pair b(Parcel parcel)
    {
        return a(parcel);
    }

    public volatile Measurable a(Enum enum)
    {
        return a((com.fitbit.data.domain.WaterLogEntry.WaterUnits)enum);
    }

    public Water a(com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits)
    {
        return com.fitbit.b.a.a(this, waterunits);
    }

    public Water c()
    {
        return (Water)super.clone();
    }

    public Object clone()
    {
        return c();
    }

    public String toString()
    {
        String s1 = e.a(b());
        String s;
        if (an.a(b(), 1) == 1.0D)
        {
            s = ((com.fitbit.data.domain.WaterLogEntry.WaterUnits)a()).getDisplayName();
        } else
        {
            s = ((com.fitbit.data.domain.WaterLogEntry.WaterUnits)a()).getQuantityDisplayName("");
        }
        return String.format("%s %s", new Object[] {
            s1, s
        });
    }

    static 
    {
        b = new Water(9999999D, com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
    }
}
