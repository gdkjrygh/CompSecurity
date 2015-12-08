// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.media.audiofx.Visualizer;

// Referenced classes of package yong.powerfull.equalizer:
//            VisualizerView

class this._cls0
    implements android.media.audiofx.CaptureListener
{

    final VisualizerView this$0;

    public void onFftDataCapture(Visualizer visualizer, byte abyte0[], int i)
    {
        VisualizerView.access$4(VisualizerView.this, abyte0);
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte abyte0[], int i)
    {
        VisualizerView.access$4(VisualizerView.this, abyte0);
    }

    tureListener()
    {
        this$0 = VisualizerView.this;
        super();
    }
}
