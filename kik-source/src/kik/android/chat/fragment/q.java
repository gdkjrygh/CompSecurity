// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.TextView;
import kik.android.util.ct;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class q extends CountDownTimer
{

    final CameraFragment a;

    q(CameraFragment camerafragment)
    {
        a = camerafragment;
        super(15000L, 10L);
    }

    public final void onFinish()
    {
        a.b();
    }

    public final void onTick(long l)
    {
        int i = (int)Math.max(0L, 15000L - l);
        a._videoProgress.setProgress(i);
        a._videoTime.setText(ct.a(i));
    }
}
