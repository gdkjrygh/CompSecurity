// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.media.AudioManager;

// Referenced classes of package yong.powerfull.equalizer:
//            Equize, MySeekBar

class this._cls0
    implements .OnSeekBarChangeListener
{

    final Equize this$0;

    public void onProgressChanged(MySeekBar myseekbar, int i, boolean flag)
    {
        Equize.access$0(Equize.this).setStreamVolume(3, i, 2);
    }

    public void onStartTrackingTouch(MySeekBar myseekbar)
    {
    }

    public void onStopTrackingTouch(MySeekBar myseekbar)
    {
    }

    ()
    {
        this$0 = Equize.this;
        super();
    }
}
