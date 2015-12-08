// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import com.fitbit.heartrate.HeartRate;
import com.fitbit.util.format.f;

// Referenced classes of package com.fitbit.customui:
//            HeartRatePicker

public class a extends 
{

    final HeartRatePicker a;

    public android.view.Listener a()
    {
    /* block-local class not found */
    class _cls1 {}

        return new _cls1();
    }

    protected String a(double d)
    {
        double d1 = d;
        if (d < 0.0D)
        {
            d1 = 0.0D;
        }
        if (d1 == 0.0D)
        {
            return "";
        } else
        {
            return super.a(d1);
        }
    }

    public String a(boolean flag)
    {
        if (!flag)
        {
            if (((HeartRate)b).b() < 0.0D)
            {
                return ((com.fitbit.heartrate.eUnits)((HeartRate)b).a()).getShortDisplayName();
            } else
            {
                return f.a(a.getContext(), (HeartRate)b);
            }
        } else
        {
            return a(((HeartRate)b).b());
        }
    }

    public r(HeartRatePicker heartratepicker)
    {
        a = heartratepicker;
        super(heartratepicker);
        a(new HeartRate(0.0D));
    }
}
