// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.os.Handler;
import android.widget.SeekBar;
import android.widget.TextView;

// Referenced classes of package kik.android.widget:
//            VideoController

final class el
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final VideoController a;

    el(VideoController videocontroller)
    {
        a = videocontroller;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (VideoController.c(a) != null && flag)
        {
            long l = ((long)VideoController.c(a).c() * (long)i) / 1000L;
            if (VideoController.d(a) != null)
            {
                VideoController.d(a).setText(VideoController.a(a, (int)l));
                return;
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        a.a(0x36ee80);
        VideoController.a(a, true);
        VideoController.b(a).removeMessages(2);
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        VideoController.a(a, false);
        a.d();
        a.e();
        a.a(0);
        VideoController.b(a).sendEmptyMessage(2);
    }
}
