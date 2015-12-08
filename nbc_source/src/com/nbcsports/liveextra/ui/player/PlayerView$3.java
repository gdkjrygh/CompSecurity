// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import com.nbcsports.liveextra.library.player.QosEventListenerStub;
import org.joda.time.DateTime;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerView

class ListenerStub extends QosEventListenerStub
{

    final PlayerView this$0;

    public void onBufferComplete()
    {
        PlayerView.access$100(PlayerView.this);
    }

    public void onBufferStart()
    {
        PlayerView.access$000(PlayerView.this);
    }

    public void onOperationFailed(com.adobe.mediacore.tification.Warning warning)
    {
        super.onOperationFailed(warning);
        Timber.d((new StringBuilder()).append("Qos Error: ").append(warning.getDescription()).toString(), new Object[0]);
        PlayerView.access$200(PlayerView.this, player.getStatus(), warning);
    }

    public void onSeekComplete(long l)
    {
        super.onSeekComplete(l);
        Timber.d("After Seek Current Time: %s, Adjusted Time: %s", new Object[] {
            new DateTime(player.getLocalTime()), new DateTime(l)
        });
    }

    public void onSeekStart()
    {
        super.onSeekStart();
        Timber.d("Before Seek Current Time: %s", new Object[] {
            new DateTime(player.getLocalTime())
        });
    }

    ning()
    {
        this$0 = PlayerView.this;
        super();
    }
}
