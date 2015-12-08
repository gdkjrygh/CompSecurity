// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media:
//            TransportMediatorCallback, TransportMediator, TransportPerformer

class this._cls0
    implements TransportMediatorCallback
{

    final TransportMediator this$0;

    public long getPlaybackPosition()
    {
        return mCallbacks.onGetCurrentPosition();
    }

    public void handleAudioFocusChange(int i)
    {
        mCallbacks.onAudioFocusChange(i);
    }

    public void handleKey(KeyEvent keyevent)
    {
        keyevent.dispatch(mKeyEventCallback);
    }

    public void playbackPositionUpdate(long l)
    {
        mCallbacks.onSeekTo(l);
    }

    lback()
    {
        this$0 = TransportMediator.this;
        super();
    }
}
