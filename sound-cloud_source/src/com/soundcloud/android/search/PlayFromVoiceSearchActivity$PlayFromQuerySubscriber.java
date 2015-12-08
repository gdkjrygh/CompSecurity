// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.content.Intent;
import com.soundcloud.android.playback.ExpandPlayerSubscriber;
import com.soundcloud.android.playback.PlaybackResult;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.search:
//            PlayFromVoiceSearchActivity

private class query extends ExpandPlayerSubscriber
{

    private final String query;
    final PlayFromVoiceSearchActivity this$0;

    public void onError(Throwable throwable)
    {
        PlayFromVoiceSearchActivity.access$000(PlayFromVoiceSearchActivity.this, query);
    }

    public void onNext(PlaybackResult playbackresult)
    {
        startActivity((new Intent("com.soundcloud.android.action.STREAM")).addFlags(0x4000000));
        super.onNext(playbackresult);
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlaybackResult)obj);
    }

    public (EventBus eventbus, PlaybackToastHelper playbacktoasthelper, String s)
    {
        this$0 = PlayFromVoiceSearchActivity.this;
        super(eventbus, playbacktoasthelper);
        query = s;
    }
}
