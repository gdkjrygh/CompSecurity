// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;


// Referenced classes of package com.soundcloud.android.playback.ui.view:
//            WaveformViewController, WaveformView

public static class animationControllerFactory
{

    private final com.soundcloud.android.playback.ui.progress.bControllerFactory animationControllerFactory;
    private final com.soundcloud.android.playback.ui.progress.bControllerFactory scrubControllerFactory;

    public WaveformViewController create(WaveformView waveformview)
    {
        return new WaveformViewController(waveformview, animationControllerFactory, scrubControllerFactory);
    }

    (com.soundcloud.android.playback.ui.progress. , com.soundcloud.android.playback.ui.progress. 1)
    {
        scrubControllerFactory = ;
        animationControllerFactory = 1;
    }
}
