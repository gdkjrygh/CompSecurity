// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate;

import android.content.res.Resources;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.Measurable;
import com.fitbit.data.domain.m;
import com.fitbit.data.domain.s;
import com.fitbit.util.format.e;
import java.io.Serializable;

public class HeartRate extends Measurable
    implements Serializable, Cloneable
{
    public static final class HeartRateUnits extends Enum
        implements m, s
    {

        public static final HeartRateUnits a;
        private static final HeartRateUnits b[];
        private int resId;
        private String serializableName;

        public static HeartRateUnits valueOf(String s1)
        {
            return (HeartRateUnits)Enum.valueOf(com/fitbit/heartrate/HeartRate$HeartRateUnits, s1);
        }

        public static HeartRateUnits[] values()
        {
            return (HeartRateUnits[])b.clone();
        }

        public String getDisplayName()
        {
            return FitBitApplication.a().getResources().getString(resId);
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        public String getShortDisplayName()
        {
            return FitBitApplication.a().getResources().getString(resId);
        }

        public String toString()
        {
            return getSerializableName();
        }

        static 
        {
            a = new HeartRateUnits("BPM", 0, 0x7f0802bc, "bpm");
            b = (new HeartRateUnits[] {
                a
            });
        }

        private HeartRateUnits(String s1, int i, int j, String s2)
        {
            super(s1, i);
            resId = j;
            serializableName = s2;
        }
    }


    private static final long serialVersionUID = 0x249896c929aa998cL;

    public HeartRate(double d)
    {
        b(HeartRateUnits.a);
        a(d);
    }

    public Measurable a(HeartRateUnits heartrateunits)
    {
        return (Measurable)clone();
    }

    public volatile Measurable a(Enum enum)
    {
        return a((HeartRateUnits)enum);
    }

    public void a(double d)
    {
        double d1 = d;
        if (d < 0.0D)
        {
            d1 = d;
            if (d != -1D)
            {
                d1 = 0.0D;
            }
        }
        super.a(d1);
    }

    public String toString()
    {
        return String.format("%s %s", new Object[] {
            e.a(b()), a()
        });
    }
}
