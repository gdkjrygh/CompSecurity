// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.widget.SeekBar;
import android.widget.TextView;

// Referenced classes of package com.roidapp.imagelib.a:
//            i, a, h

final class l
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final i a;

    l(i j)
    {
        a = j;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int j, boolean flag)
    {
        if (i.a(a) != null)
        {
            i.a(a).b(j);
            h.h = j;
        }
        if (i.f(a) != null)
        {
            i.f(a).setText(String.valueOf(j));
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        if (i.f(a) != null)
        {
            i.f(a).setVisibility(0);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        if (i.f(a) != null)
        {
            i.f(a).setVisibility(8);
        }
    }
}
