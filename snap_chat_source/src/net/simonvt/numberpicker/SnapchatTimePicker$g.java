// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.view.ViewConfiguration;

// Referenced classes of package net.simonvt.numberpicker:
//            SnapchatTimePicker

final class c
    implements Runnable
{

    private int a;
    private int b;
    private SnapchatTimePicker c;

    public final void a()
    {
        b = 0;
        a = 0;
        c.removeCallbacks(this);
        if (SnapchatTimePicker.b(c))
        {
            SnapchatTimePicker.c(c, false);
            c.invalidate(0, SnapchatTimePicker.c(c), c.getRight(), c.getBottom());
        }
        SnapchatTimePicker.d(c, false);
        if (SnapchatTimePicker.d(c))
        {
            c.invalidate(0, 0, c.getRight(), SnapchatTimePicker.e(c));
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
                SnapchatTimePicker.c(c, true);
                c.invalidate(0, SnapchatTimePicker.c(c), c.getRight(), c.getBottom());
                return;

            case 2: // '\002'
                SnapchatTimePicker.d(c, true);
                break;
            }
            c.invalidate(0, 0, c.getRight(), SnapchatTimePicker.e(c));
            return;

        case 2: // '\002'
            switch (a)
            {
            default:
                return;

            case 1: // '\001'
                if (!SnapchatTimePicker.b(c))
                {
                    c.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                SnapchatTimePicker.f(c);
                c.invalidate(0, SnapchatTimePicker.c(c), c.getRight(), c.getBottom());
                return;

            case 2: // '\002'
                break;
            }
            break;
        }
        if (!SnapchatTimePicker.d(c))
        {
            c.postDelayed(this, ViewConfiguration.getPressedStateDuration());
        }
        SnapchatTimePicker.g(c);
        c.invalidate(0, 0, c.getRight(), SnapchatTimePicker.e(c));
    }

    (SnapchatTimePicker snapchattimepicker)
    {
        c = snapchattimepicker;
        super();
    }
}
