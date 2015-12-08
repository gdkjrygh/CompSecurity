// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

// Referenced classes of package com.roidapp.imagelib.a:
//            i, ah, h

final class m
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final i a;
    private int b;

    m(i j)
    {
        a = j;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int j, boolean flag)
    {
        if (flag)
        {
            b = j;
            if (i.l(a) != null)
            {
                i.l(a).a(b);
                h.i = i.l(a).h();
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        i.t(a).setVisibility(0);
        i.t(a).startAnimation(i.o(a));
        i.s(a).removeCallbacks(i.u(a));
        i.s(a).removeCallbacks(i.v(a));
        i.b(a, false);
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        i.s(a).postDelayed(i.u(a), 600L);
        i.s(a).postDelayed(i.v(a), 1000L);
    }
}
