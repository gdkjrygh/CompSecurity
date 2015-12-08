// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.waveform.WaveformData;

// Referenced classes of package com.soundcloud.android.playback.ui.view:
//            WaveformViewController, WaveformView

private class <init> extends DefaultSubscriber
{

    final WaveformViewController this$0;

    public void onNext(WaveformData waveformdata)
    {
        WaveformViewController.access$102(WaveformViewController.this, true);
        WaveformViewController.access$300(WaveformViewController.this).setWaveformData(waveformdata, WaveformViewController.access$200(WaveformViewController.this));
        if (WaveformViewController.access$400(WaveformViewController.this) != com.soundcloud.android.playback.scriber.this._fld0)
        {
            WaveformViewController.access$300(WaveformViewController.this).showExpandedWaveform();
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((WaveformData)obj);
    }

    private ()
    {
        this$0 = WaveformViewController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
