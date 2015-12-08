// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.ImageView;
import android.widget.SeekBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            cg, ih, ng, PhotoGridActivity

final class ci
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final cg a;

    ci(cg cg1)
    {
        a = cg1;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (cg.a(a) == null)
        {
            ih.C().x(i);
        }
        cg.a(a, i);
        if (cg.a(a) != null)
        {
            cg.a(a, true);
            cg.a(a).c(cg.b(a) / 5 + 5, true);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        cg.c(a).setImageResource(0x7f020365);
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        if (cg.a(a) == null)
        {
            cg.d(a).a(cg.b(a), true);
        }
    }
}
