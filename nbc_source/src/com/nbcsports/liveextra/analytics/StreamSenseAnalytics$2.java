// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerNotification;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            StreamSenseAnalytics

class nerStub extends PlaybackEventListenerStub
{

    final StreamSenseAnalytics this$0;

    public void onStateChanged(com.adobe.mediacore. , MediaPlayerNotification mediaplayernotification)
    {
        super.onStateChanged(, mediaplayernotification);
        switch (.SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            notifyStream(0, StreamSenseAnalytics.access$000(StreamSenseAnalytics.this).getLocalTime());
            return;

        case 2: // '\002'
            notifyStream(2, StreamSenseAnalytics.access$000(StreamSenseAnalytics.this).getLocalTime());
            return;

        case 3: // '\003'
            notifyStream(1, StreamSenseAnalytics.access$000(StreamSenseAnalytics.this).getLocalTime());
            return;

        case 4: // '\004'
            notifyStream(3, StreamSenseAnalytics.access$000(StreamSenseAnalytics.this).getLocalTime());
            break;
        }
    }

    nerStub()
    {
        this$0 = StreamSenseAnalytics.this;
        super();
    }
}
