// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.PointF;
import android.widget.SeekBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            br, PhotoGridActivity, ra, PhotoView

final class bs
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final br a;

    bs(br br1)
    {
        a = br1;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (br.a(a) != null && br.b(a) != null && !br.b(a).isFinishing())
        {
            seekbar = br.a(a).e();
            float f = br.a(a).d();
            ra ra1 = br.a(a);
            ra1.ad = br.c(a) + i / 5;
            ra1.a();
            ra1.i();
            ra1.j();
            br.a(a).a(new PointF(seekbar[0], f), new PointF(br.a(a).e()[0], br.a(a).d()));
            br.b(a).O().invalidate();
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
    }
}
