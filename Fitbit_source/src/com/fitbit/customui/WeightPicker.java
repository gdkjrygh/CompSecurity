// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.util.AttributeSet;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

public class WeightPicker extends MeasurablePicker
{
    public static interface a
    {

        public abstract void a(com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits);
    }

    public class b extends MeasurablePicker.b
    {

        final WeightPicker a;

        public b()
        {
            a = WeightPicker.this;
            super(WeightPicker.this);
            a(new Weight(0.0D, WeightPicker.this.a[0][0]));
        }
    }


    com.fitbit.data.domain.WeightLogEntry.WeightUnits a[][];
    float b[][];
    private a c;

    public WeightPicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS;
        com.fitbit.data.domain.WeightLogEntry.WeightUnits aweightunits[] = {
            com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE, com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS
        };
        attributeset = com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG;
        a = (new com.fitbit.data.domain.WeightLogEntry.WeightUnits[][] {
            new com.fitbit.data.domain.WeightLogEntry.WeightUnits[] {
                context, null
            }, aweightunits, new com.fitbit.data.domain.WeightLogEntry.WeightUnits[] {
                attributeset, null
            }
        });
        context = (new float[] {
            1500F, 0.0F
        });
        attributeset = (new float[] {
            680.4F, 0.0F
        });
        b = (new float[][] {
            context, new float[] {
                106F, 13F
            }, attributeset
        });
        i = new b();
        m();
    }

    protected void a(int i)
    {
        if (a[i][1] != null)
        {
            a(((com.fitbit.data.domain.Measurable) (new Weight(0.0D, a[i][0]))), ((com.fitbit.data.domain.Measurable) (new Weight(0.0D, a[i][1]))), b[i][0], b[i][1]);
        } else
        {
            a(((com.fitbit.data.domain.Measurable) (new Weight(0.0D, a[i][0]))), null, b[i][0], b[i][1]);
        }
        if (c != null)
        {
            c.a(a[i][0]);
        }
    }

    public void a(a a1)
    {
        c = a1;
    }

    public void a(com.fitbit.data.domain.WeightLogEntry.WeightUnits aweightunits[][], float af[][])
    {
        a = aweightunits;
        b = af;
        i = new b();
        m();
    }

    public volatile void a(Enum aenum[][], float af[][])
    {
        a((com.fitbit.data.domain.WeightLogEntry.WeightUnits[][])aenum, af);
    }

    protected com.fitbit.data.domain.WeightLogEntry.WeightUnits[][] a()
    {
        return a;
    }

    protected String b()
    {
        return getContext().getString(0x7f080596);
    }

    protected Enum[][] c()
    {
        return a();
    }

    public a q()
    {
        return c;
    }
}
