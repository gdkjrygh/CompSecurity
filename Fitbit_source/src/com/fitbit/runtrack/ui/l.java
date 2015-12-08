// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.util.format.DistanceDecimalFormat;
import com.fitbit.util.format.e;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class l
{

    private final int a;
    private final int b;
    private final Profile c;
    private final int d;

    public l(Profile profile)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.Length.LengthUnits.values().length];
                try
                {
                    a[com.fitbit.data.domain.Length.LengthUnits.MILES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.Length.LengthUnits.KM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.Length.LengthUnits.METERS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[profile.t().ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 64
    //                   2 85
    //                   3 106;
           goto _L1 _L2 _L3 _L4
_L1:
        a = 0x7f0b0021;
        d = 0x7f0805aa;
        b = 0x7f0803d4;
_L6:
        c = profile;
        return;
_L2:
        a = 0x7f0b0021;
        d = 0x7f0805aa;
        b = 0x7f0803d4;
        continue; /* Loop/switch isn't completed */
_L3:
        a = 0x7f0b001f;
        d = 0x7f0805a8;
        b = 0x7f0802a0;
        continue; /* Loop/switch isn't completed */
_L4:
        a = 0x7f0b0020;
        d = 0x7f0805a9;
        b = 0x7f0802a0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private String a(Context context, Duration duration)
    {
        if (duration == null)
        {
            return "";
        } else
        {
            return e.a(context, duration.a(TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS);
        }
    }

    public Profile a()
    {
        return c;
    }

    public String a(Context context, double d1)
    {
        return context.getString(d, new Object[] {
            Double.valueOf(d1)
        });
    }

    public String a(Context context, ExerciseStat exercisestat)
    {
        return a(context, exercisestat.a(c.t()));
    }

    String a(Length length)
    {
        DistanceDecimalFormat distancedecimalformat = new DistanceDecimalFormat(c.t());
        distancedecimalformat.setMinimumFractionDigits(2);
        distancedecimalformat.setMaximumFractionDigits(2);
        return distancedecimalformat.format(length.a(c.t()).b());
    }

    String a(ExerciseStat exercisestat)
    {
        return a(exercisestat.a().a(c.t()));
    }

    public String b(Context context, ExerciseStat exercisestat)
    {
        DecimalFormat decimalformat = new DecimalFormat();
        decimalformat.setMinimumFractionDigits(1);
        decimalformat.setMaximumFractionDigits(1);
        return context.getString(b, new Object[] {
            decimalformat.format(exercisestat.b(c.t()))
        });
    }

    public String b(Length length)
    {
        DecimalFormat decimalformat = new DecimalFormat();
        decimalformat.setMinimumFractionDigits(2);
        decimalformat.setMaximumFractionDigits(2);
        return decimalformat.format(length.a(c.t()).b());
    }
}
