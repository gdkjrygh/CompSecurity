// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.info.AudioTrack;
import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            AudioTrackFailedListener, DefaultMediaPlayer, MediaPlayerNotification, OperationFailedEvent, 
//            VideoEngineDispatcher

class this._cls0
    implements AudioTrackFailedListener
{

    final DefaultMediaPlayer this$0;

    public void onFailed(AudioTrack audiotrack, n.Error error)
    {
        DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).w((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("::AudioTrackFailedListener#onFailed").toString(), (new StringBuilder()).append("Audio track failed: [").append(audiotrack).append("].").toString());
        audiotrack = MediaPlayerNotification.createWarningNotification(n.WarningCode.PLAYBACK_OPERATION_FAIL, "Failed to load audio track. Please select another track.");
        audiotrack.setInnerNotification(error);
        DefaultMediaPlayer.access$100(DefaultMediaPlayer.this).dispatch(OperationFailedEvent.createEvent(audiotrack));
    }

    n.Error()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
