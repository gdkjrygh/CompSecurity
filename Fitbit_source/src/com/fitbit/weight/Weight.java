// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight;

import android.os.Parcel;
import android.util.Pair;
import com.fitbit.b.b;
import com.fitbit.data.domain.Measurable;
import com.fitbit.util.format.e;
import java.io.Serializable;

public class Weight extends Measurable
    implements Serializable, Cloneable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Weight a(Parcel parcel)
        {
            parcel = com.fitbit.weight.Weight.b(parcel);
            return new Weight(((Double)((Pair) (parcel)).first).doubleValue(), (com.fitbit.data.domain.WeightLogEntry.WeightUnits)((Pair) (parcel)).second);
        }

        public Weight[] a(int i)
        {
            return new Weight[i];
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
    private static final long serialVersionUID = 0x2d291dd8ad241cbdL;
    private boolean isDefault;

    public Weight()
    {
        this(0.0D, com.fitbit.data.domain.WeightLogEntry.WeightUnits.GRAMS);
    }

    public Weight(double d1, com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits)
    {
        isDefault = false;
        a(d1);
        b(weightunits);
    }

    static Pair b(Parcel parcel)
    {
        return a(parcel);
    }

    public volatile Measurable a(Enum enum)
    {
        return a((com.fitbit.data.domain.WeightLogEntry.WeightUnits)enum);
    }

    public Weight a(com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits)
    {
        return com.fitbit.b.b.a(this, weightunits);
    }

    public void a(boolean flag)
    {
        isDefault = flag;
    }

    public Weight c()
    {
        return (Weight)super.clone();
    }

    public Object clone()
    {
        return c();
    }

    public boolean d()
    {
        return isDefault;
    }

    public String e()
    {
        if (!((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).hasChild())
        {
            return String.format("%s %s", new Object[] {
                com.fitbit.util.format.e.a(b()), ((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).toString()
            });
        }
        int i = (int)b();
        double d1 = (b() - (double)i) * (double)((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).getChildrenCount();
        if (i != 0 && d1 >= 0.10000000000000001D)
        {
            return String.format("%s %s %s %s", new Object[] {
                com.fitbit.util.format.e.a(i), ((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).toString(), com.fitbit.util.format.e.a(d1), ((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).getChild().toString()
            });
        }
        if (d1 < 0.10000000000000001D)
        {
            return String.format("%s %s", new Object[] {
                com.fitbit.util.format.e.a(i), ((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).toString()
            });
        } else
        {
            return String.format("%s %s", new Object[] {
                com.fitbit.util.format.e.a(d1), ((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).getChild().toString()
            });
        }
    }

    public double f()
    {
        if (!((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).hasChild())
        {
            return b();
        } else
        {
            return (double)(Math.round(a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).getChild()).b()) / (long)((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).getChildrenCount());
        }
    }

    public double g()
    {
        if (!((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).hasChild())
        {
            return -1D;
        } else
        {
            return (double)(Math.round(a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).getChild()).b()) % (long)((com.fitbit.data.domain.WeightLogEntry.WeightUnits)a()).getChildrenCount());
        }
    }

}
