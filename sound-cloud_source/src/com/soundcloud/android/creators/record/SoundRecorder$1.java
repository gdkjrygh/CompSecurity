// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Intent;
import android.media.AudioRecord;
import android.support.v4.content.LocalBroadcastManager;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder, RemainingTimeCalculator

class this._cls0
    implements android.media.cordPositionUpdateListener
{

    final SoundRecorder this$0;

    public void onMarkerReached(AudioRecord audiorecord)
    {
    }

    public void onPeriodicNotification(AudioRecord audiorecord)
    {
        if (SoundRecorder.access$000(SoundRecorder.this) == ate.RECORDING)
        {
            SoundRecorder.access$102(SoundRecorder.this, SoundRecorder.access$200(SoundRecorder.this).timeRemaining());
            SoundRecorder.access$300(SoundRecorder.this).sendBroadcast((new Intent("com.soundcloud.android.recordprogress")).putExtra("elapsedTime", getRecordingElapsedTime()).putExtra("duration", getPlaybackDuration()).putExtra("time_remaining", SoundRecorder.access$100(SoundRecorder.this)));
        }
    }

    culator()
    {
        this$0 = SoundRecorder.this;
        super();
    }
}
