// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            VideoErrorListener, DefaultMediaPlayer, MediaPlayerNotification, OperationFailedEvent, 
//            VideoEngineDispatcher

class this._cls0
    implements VideoErrorListener
{

    final DefaultMediaPlayer this$0;

    public void onError(n.Error error)
    {
        if (DefaultMediaPlayer.access$2300(DefaultMediaPlayer.this, error))
        {
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).w((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerError").toString(), (new StringBuilder()).append("A recoverable error occurred.[").append(error.getDescription()).append("]").toString());
            n.Warning warning = MediaPlayerNotification.createWarningNotification(n.WarningCode.PLAYBACK_OPERATION_FAIL, "A recoverable error has occured.");
            warning.setInnerNotification(error);
            DefaultMediaPlayer.access$100(DefaultMediaPlayer.this).dispatch(OperationFailedEvent.createEvent(warning));
            return;
        } else
        {
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).e((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerError").toString(), (new StringBuilder()).append("An error occurred. [").append(error).append("]").toString());
            setStatus(e.ERROR, error);
            DefaultMediaPlayer.access$2200(DefaultMediaPlayer.this);
            return;
        }
    }

    n.Error()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
