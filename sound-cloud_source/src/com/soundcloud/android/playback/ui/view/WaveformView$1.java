// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.widget.ImageView;
import com.soundcloud.android.view.FixedWidthView;

// Referenced classes of package com.soundcloud.android.playback.ui.view:
//            WaveformView, WaveformCanvas

class this._cls0
    implements Runnable
{

    final WaveformView this$0;

    public void run()
    {
        WaveformView.access$000(WaveformView.this).requestLayout();
        WaveformView.access$100(WaveformView.this).requestLayout();
        WaveformView.access$200(WaveformView.this).requestLayout();
        WaveformView.access$300(WaveformView.this).requestLayout();
        WaveformView.access$400(WaveformView.this).requestLayout();
    }

    ()
    {
        this$0 = WaveformView.this;
        super();
    }
}
