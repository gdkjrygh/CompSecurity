// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.util.AttributeSet;
import com.fitbit.data.domain.Length;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

public class LengthPicker extends MeasurablePicker
{
    public class a extends MeasurablePicker.b
    {

        final LengthPicker a;

        public a()
        {
            a = LengthPicker.this;
            super(LengthPicker.this);
            a(new Length(0.0D, c[0][0]));
        }
    }

    public static interface b
    {

        public abstract void a(com.fitbit.data.domain.Length.LengthUnits lengthunits);
    }


    public static final float a = 300F;
    float b[][] = {
        {
            9F, 11F
        }, {
            300F, 0.0F
        }
    };
    com.fitbit.data.domain.Length.LengthUnits c[][];
    private int n;
    private b o;

    public LengthPicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = com.fitbit.data.domain.Length.LengthUnits.FEET;
        attributeset = com.fitbit.data.domain.Length.LengthUnits.INCH;
        com.fitbit.data.domain.Length.LengthUnits alengthunits[] = {
            com.fitbit.data.domain.Length.LengthUnits.CM, null
        };
        c = (new com.fitbit.data.domain.Length.LengthUnits[][] {
            new com.fitbit.data.domain.Length.LengthUnits[] {
                context, attributeset
            }, alengthunits
        });
        b(2);
        i = new a();
        m();
    }

    protected void a(int i)
    {
        n = i;
        if (c[i][1] != null)
        {
            a(((com.fitbit.data.domain.Measurable) (new Length(0.0D, c[i][0]))), ((com.fitbit.data.domain.Measurable) (new Length(0.0D, c[i][1]))), b[i][0], b[i][1]);
        } else
        {
            a(((com.fitbit.data.domain.Measurable) (new Length(0.0D, c[i][0]))), null, b[i][0], b[i][1]);
        }
        if (o != null)
        {
            o.a(c[i][0]);
        }
    }

    public void a(b b1)
    {
        o = b1;
    }

    public void a(com.fitbit.data.domain.Length.LengthUnits alengthunits[][], float af[][])
    {
        c = alengthunits;
        b = af;
        i = new a();
        m();
        a(n);
    }

    public volatile void a(Enum aenum[][], float af[][])
    {
        a((com.fitbit.data.domain.Length.LengthUnits[][])aenum, af);
    }

    protected com.fitbit.data.domain.Length.LengthUnits[][] a()
    {
        return c;
    }

    protected String b()
    {
        return getContext().getString(0x7f080251);
    }

    protected Enum[][] c()
    {
        return a();
    }
}
