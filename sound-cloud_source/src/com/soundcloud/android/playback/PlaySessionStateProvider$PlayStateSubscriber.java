// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionStateProvider, PlaybackProgress, PlayQueueManager

private class <init> extends DefaultSubscriber
{

    final PlaySessionStateProvider this$0;

    public void onNext(<init> <init>1)
    {
        boolean flag;
        if (PlaySessionStateProvider.access$300(PlaySessionStateProvider.this) != null && !<init>1._mth0(PlaySessionStateProvider.access$300(PlaySessionStateProvider.this)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && <init>1._mth0())
        {
            PlaySessionStateProvider.access$400(PlaySessionStateProvider.this).clear();
        }
        PlaySessionStateProvider.access$502(PlaySessionStateProvider.this, <init>1);
        PlaySessionStateProvider.access$302(PlaySessionStateProvider.this, <init>1._mth0());
        if (<init>1._mth0().isDurationValid())
        {
            PlaySessionStateProvider.access$400(PlaySessionStateProvider.this).put(PlaySessionStateProvider.access$300(PlaySessionStateProvider.this), <init>1._mth0());
        }
        if (PlaySessionStateProvider.access$600(PlaySessionStateProvider.this, <init>1, flag) || PlaySessionStateProvider.access$700(PlaySessionStateProvider.this, <init>1))
        {
            long l = getLastProgressForTrack(PlaySessionStateProvider.access$300(PlaySessionStateProvider.this)).getPosition();
            PlayQueueManager playqueuemanager = PlaySessionStateProvider.access$800(PlaySessionStateProvider.this);
            if (<init>1._mth0())
            {
                l = 0L;
            }
            playqueuemanager.saveCurrentProgress(l);
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((onNext)obj);
    }

    private ()
    {
        this$0 = PlaySessionStateProvider.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
