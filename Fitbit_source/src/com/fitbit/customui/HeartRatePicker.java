// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.util.AttributeSet;
import com.fitbit.heartrate.HeartRate;
import com.fitbit.util.format.f;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

public class HeartRatePicker extends MeasurablePicker
{
    public class a extends MeasurablePicker.b
    {

        final HeartRatePicker a;

        public android.view.View.OnFocusChangeListener a()
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
                    return ((com.fitbit.heartrate.HeartRate.HeartRateUnits)((HeartRate)b).a()).getShortDisplayName();
                } else
                {
                    return f.a(a.getContext(), (HeartRate)b);
                }
            } else
            {
                return a(((HeartRate)b).b());
            }
        }

        public a()
        {
            a = HeartRatePicker.this;
            super(HeartRatePicker.this);
            a(new HeartRate(0.0D));
        }
    }


    private static final com.fitbit.heartrate.HeartRate.HeartRateUnits a[][];
    private static final float b[][] = {
        {
            220F, 0.0F
        }
    };

    public HeartRatePicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = new a();
        b(0);
    }

    protected void a(int i)
    {
        a(((com.fitbit.data.domain.Measurable) (new HeartRate(0.0D))), null, b[i][0], b[i][1]);
    }

    public void a(com.fitbit.heartrate.HeartRate.HeartRateUnits aheartrateunits[][], float af[][])
    {
        throw new UnsupportedOperationException();
    }

    public volatile void a(Enum aenum[][], float af[][])
    {
        a((com.fitbit.heartrate.HeartRate.HeartRateUnits[][])aenum, af);
    }

    protected com.fitbit.heartrate.HeartRate.HeartRateUnits[][] a()
    {
        return a;
    }

    protected String b()
    {
        return getClass().getName();
    }

    protected Enum[][] c()
    {
        return a();
    }

    static 
    {
        a = (new com.fitbit.heartrate.HeartRate.HeartRateUnits[][] {
            new com.fitbit.heartrate.HeartRate.HeartRateUnits[] {
                com.fitbit.heartrate.HeartRate.HeartRateUnits.a, null
            }
        });
    }
}
