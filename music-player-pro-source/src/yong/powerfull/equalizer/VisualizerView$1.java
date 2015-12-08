// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.os.Handler;

// Referenced classes of package yong.powerfull.equalizer:
//            VisualizerView

class this._cls0
    implements Runnable
{

    final VisualizerView this$0;

    public void run()
    {
        invalidate();
        if (VisualizerView.access$0(VisualizerView.this) < 10)
        {
            if (VisualizerView.access$0(VisualizerView.this) == 1)
            {
                VisualizerView.access$1(VisualizerView.this);
            }
            VisualizerView.access$2(VisualizerView.this).postDelayed(this, 100L);
        }
        VisualizerView visualizerview = VisualizerView.this;
        VisualizerView.access$3(visualizerview, VisualizerView.access$0(visualizerview) + 1);
    }

    ()
    {
        this$0 = VisualizerView.this;
        super();
    }
}
