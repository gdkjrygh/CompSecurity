// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;
import java.math.BigDecimal;

// Referenced classes of package com.roidapp.photogrid.release:
//            ev, ng

final class ex
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final ev a;

    ex(ev ev1)
    {
        a = ev1;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            ev.a(a, ev.b(a) + Math.round(((float)i / 100F) * ev.c(a)));
            seekbar = new BigDecimal((float)(ev.d(a) * ev.e(a)) / 1000F);
            ev.f(a).setText((new StringBuilder()).append(seekbar.setScale(1, 4)).append("s").toString());
            ev.a(a).h(ev.d(a));
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        ev.a(a).a(false, true);
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        az.v = false;
    }
}
