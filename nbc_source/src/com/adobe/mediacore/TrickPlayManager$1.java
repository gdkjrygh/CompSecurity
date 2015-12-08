// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            SeekCompletedListener, TrickPlayManager, PlaybackRateEvent, VideoEngineDispatcher

class this._cls0
    implements SeekCompletedListener
{

    final TrickPlayManager this$0;

    public void onCompleted(long l)
    {
        if (TrickPlayManager.access$000(TrickPlayManager.this))
        {
            TrickPlayManager.access$002(TrickPlayManager.this, false);
            TrickPlayManager.access$100(TrickPlayManager.this).dispatch(PlaybackRateEvent.createRatePlayingEvent(1.0F));
        }
    }

    er()
    {
        this$0 = TrickPlayManager.this;
        super();
    }
}
