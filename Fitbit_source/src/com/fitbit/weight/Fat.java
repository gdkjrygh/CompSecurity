// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight;

import android.os.Parcel;
import android.util.Pair;
import com.fitbit.data.domain.Measurable;
import com.fitbit.data.domain.m;
import com.fitbit.data.domain.s;
import com.fitbit.util.format.e;
import java.io.Serializable;

public class Fat extends Measurable
    implements Serializable, Cloneable
{
    public static final class FatUnits extends Enum
        implements m, s
    {

        public static final FatUnits a;
        private static final FatUnits b[];

        public static FatUnits valueOf(String s1)
        {
            return (FatUnits)Enum.valueOf(com/fitbit/weight/Fat$FatUnits, s1);
        }

        public static FatUnits[] values()
        {
            return (FatUnits[])b.clone();
        }

        public String getDisplayName()
        {
            return "%";
        }

        public String getSerializableName()
        {
            return "%";
        }

        public String getShortDisplayName()
        {
            return "%";
        }

        public String toString()
        {
            return getSerializableName();
        }

        static 
        {
            a = new FatUnits("PERCENT", 0);
            b = (new FatUnits[] {
                a
            });
        }

        private FatUnits(String s1, int i)
        {
            super(s1, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Fat a(Parcel parcel)
        {
            return new Fat(((Double)Fat.b(parcel).first).doubleValue());
        }

        public Fat[] a(int i)
        {
            return new Fat[i];
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
    private static final long serialVersionUID = 0x249896c929aa998cL;

    public Fat(double d)
    {
        b(FatUnits.a);
        a(d);
    }

    static Pair b(Parcel parcel)
    {
        return a(parcel);
    }

    public Measurable a(FatUnits fatunits)
    {
        return (Measurable)clone();
    }

    public volatile Measurable a(Enum enum)
    {
        return a((FatUnits)enum);
    }

    public void a(double d)
    {
        double d1 = 100D;
        double d2 = 0.0D;
        if (d < 0.0D && d != -1D)
        {
            d = d2;
        }
        if (d > 100D)
        {
            d = d1;
        }
        super.a(d);
    }

    public String toString()
    {
        return String.format("%s%s", new Object[] {
            e.a(b()), ((FatUnits)a()).getDisplayName()
        });
    }

}
