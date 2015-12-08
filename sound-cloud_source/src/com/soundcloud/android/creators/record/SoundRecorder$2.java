// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.media.AudioTrack;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder

class this._cls0
    implements android.media.ybackPositionUpdateListener
{

    final SoundRecorder this$0;

    public void onMarkerReached(AudioTrack audiotrack)
    {
    }

    public void onPeriodicNotification(AudioTrack audiotrack)
    {
        if (SoundRecorder.access$000(SoundRecorder.this) == ate.PLAYING)
        {
            SoundRecorder.access$400(SoundRecorder.this);
        }
    }

    ate()
    {
        this$0 = SoundRecorder.this;
        super();
    }
}
