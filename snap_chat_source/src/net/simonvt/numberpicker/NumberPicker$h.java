// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.view.ViewConfiguration;

// Referenced classes of package net.simonvt.numberpicker:
//            NumberPicker

final class c
    implements Runnable
{

    private int a;
    private int b;
    private NumberPicker c;

    public final void a()
    {
        b = 0;
        a = 0;
        c.removeCallbacks(this);
        if (NumberPicker.e(c))
        {
            NumberPicker.c(c, false);
            c.invalidate(0, NumberPicker.f(c), c.getRight(), c.getBottom());
        }
        NumberPicker.d(c, false);
        if (NumberPicker.g(c))
        {
            c.invalidate(0, 0, c.getRight(), NumberPicker.h(c));
        }
    }

    public final void a(int i)
    {
        a();
        b = 1;
        a = i;
        c.postDelayed(this, ViewConfiguration.getTapTimeout());
    }

    public final void b(int i)
    {
        a();
        b = 2;
        a = i;
        c.post(this);
    }

    public final void run()
    {
        switch (b)
        {
        default:
            return;

        case 1: // '\001'
            switch (a)
            {
            default:
                return;

            case 1: // '\001'
                NumberPicker.c(c, true);
                c.invalidate(0, NumberPicker.f(c), c.getRight(), c.getBottom());
                return;

            case 2: // '\002'
                NumberPicker.d(c, true);
                break;
            }
            c.invalidate(0, 0, c.getRight(), NumberPicker.h(c));
            return;

        case 2: // '\002'
            switch (a)
            {
            default:
                return;

            case 1: // '\001'
                if (!NumberPicker.e(c))
                {
                    c.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                NumberPicker.i(c);
                c.invalidate(0, NumberPicker.f(c), c.getRight(), c.getBottom());
                return;

            case 2: // '\002'
                break;
            }
            break;
        }
        if (!NumberPicker.g(c))
        {
            c.postDelayed(this, ViewConfiguration.getPressedStateDuration());
        }
        NumberPicker.j(c);
        c.invalidate(0, 0, c.getRight(), NumberPicker.h(c));
    }

    (NumberPicker numberpicker)
    {
        c = numberpicker;
        super();
    }
}
