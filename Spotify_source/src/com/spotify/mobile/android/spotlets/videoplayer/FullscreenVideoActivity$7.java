// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import android.widget.SeekBar;
import eqe;
import flp;
import gak;

// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            FullscreenVideoActivity, VideoPresenter

final class a
    implements gak
{

    private FullscreenVideoActivity a;

    public final void a(SeekBar seekbar)
    {
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        a.j();
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        VideoPresenter videopresenter = FullscreenVideoActivity.b(a);
        int i = seekbar.getProgress();
        videopresenter.d.a(i);
        videopresenter.b.i();
        a.i();
    }

    (FullscreenVideoActivity fullscreenvideoactivity)
    {
        a = fullscreenvideoactivity;
        super();
    }
}
