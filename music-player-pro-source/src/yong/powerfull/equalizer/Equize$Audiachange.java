// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

// Referenced classes of package yong.powerfull.equalizer:
//            Equize, MySeekBar

public class this._cls0 extends BroadcastReceiver
{

    final Equize this$0;

    public void onReceive(Context context, Intent intent)
    {
        Equize.access$1(Equize.this, Equize.access$0(Equize.this).getStreamVolume(3));
        bar1.setProgress(Equize.access$2(Equize.this));
    }

    public ()
    {
        this$0 = Equize.this;
        super();
    }
}
