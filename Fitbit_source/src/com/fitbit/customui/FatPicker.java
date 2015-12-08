// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.util.AttributeSet;
import com.fitbit.util.format.f;
import com.fitbit.weight.Fat;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

public class FatPicker extends MeasurablePicker
{
    public class a extends MeasurablePicker.b
    {

        final FatPicker a;

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
                if (((Fat)b).b() < 0.0D)
                {
                    return ((com.fitbit.weight.Fat.FatUnits)((Fat)b).a()).getShortDisplayName();
                } else
                {
                    return f.a(a.getContext(), (Fat)b);
                }
            } else
            {
                return a(((Fat)b).b());
            }
        }

        public a()
        {
            a = FatPicker.this;
            super(FatPicker.this);
            a(new Fat(0.0D));
        }
    }


    private static final com.fitbit.weight.Fat.FatUnits a[][];
    private static final float b[][] = {
        {
            100F, 0.0F
        }
    };

    public FatPicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = new a();
        b(1);
    }

    protected void a(int i)
    {
        a(((com.fitbit.data.domain.Measurable) (new Fat(0.0D))), null, b[i][0], b[i][1]);
    }

    public void a(com.fitbit.weight.Fat.FatUnits afatunits[][], float af[][])
    {
        throw new UnsupportedOperationException();
    }

    public volatile void a(Enum aenum[][], float af[][])
    {
        a((com.fitbit.weight.Fat.FatUnits[][])aenum, af);
    }

    protected com.fitbit.weight.Fat.FatUnits[][] a()
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
        a = (new com.fitbit.weight.Fat.FatUnits[][] {
            new com.fitbit.weight.Fat.FatUnits[] {
                com.fitbit.weight.Fat.FatUnits.a, null
            }
        });
    }
}
