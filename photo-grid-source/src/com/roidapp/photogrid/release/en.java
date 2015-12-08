// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.SeekBar;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;
import java.text.DecimalFormat;

// Referenced classes of package com.roidapp.photogrid.release:
//            el, ng

final class en
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final el a;

    en(el el1)
    {
        a = el1;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            el.a(a, Math.round(((float)i / 100F) * (float)el.b(a)));
            el.f(a).setText((new StringBuilder()).append(el.d(a).format(el.c(a) / 60000)).append(":").append(el.d(a).format((el.c(a) / 1000) % 60)).append(":").append(el.e(a).format(el.c(a) % 1000)).toString());
            if (el.a(a) != null)
            {
                el.a(a).g(el.c(a));
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        if (el.a(a) != null)
        {
            el.a(a).a(false, true);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        az.v = false;
        if (el.a(a) != null)
        {
            el.a(a).j(0);
        }
    }
}
