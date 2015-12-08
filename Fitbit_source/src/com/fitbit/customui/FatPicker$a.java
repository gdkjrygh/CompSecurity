// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import com.fitbit.util.format.f;
import com.fitbit.weight.Fat;

// Referenced classes of package com.fitbit.customui:
//            FatPicker

public class e extends cker.b
{

    final FatPicker a;

    public android.view.ChangeListener a()
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
                return ((com.fitbit.weight.)((Fat)b).a()).getShortDisplayName();
            } else
            {
                return f.a(a.getContext(), (Fat)b);
            }
        } else
        {
            return a(((Fat)b).b());
        }
    }

    public e(FatPicker fatpicker)
    {
        a = fatpicker;
        super(fatpicker);
        a(new Fat(0.0D));
    }
}
