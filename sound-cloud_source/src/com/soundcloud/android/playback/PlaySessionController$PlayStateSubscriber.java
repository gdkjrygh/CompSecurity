// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController, IRemoteAudioManager

private class <init> extends DefaultSubscriber
{

    final PlaySessionController this$0;

    public void onNext(<init> <init>1)
    {
        if (!<init>.<init>(<init>1))
        {
            PlaySessionController.access$700(PlaySessionController.this).setPlaybackState(<init>1.());
            PlaySessionController.access$800(PlaySessionController.this, <init>1);
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((onNext)obj);
    }

    private ()
    {
        this$0 = PlaySessionController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
