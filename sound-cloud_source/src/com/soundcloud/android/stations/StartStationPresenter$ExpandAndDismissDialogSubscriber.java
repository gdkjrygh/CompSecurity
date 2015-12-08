// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.Context;
import com.soundcloud.android.playback.ExpandPlayerSubscriber;
import com.soundcloud.android.playback.PlaybackResult;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.tracks.DelayedLoadingDialogPresenter;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.stations:
//            StartStationPresenter

private static class delayedLoadingDialogPresenter extends ExpandPlayerSubscriber
{

    private final Context context;
    private final DelayedLoadingDialogPresenter delayedLoadingDialogPresenter;

    public void onError(Throwable throwable)
    {
        delayedLoadingDialogPresenter.onError(context);
        super.onError(throwable);
    }

    public void onNext(PlaybackResult playbackresult)
    {
        if (playbackresult.isSuccess())
        {
            expandPlayer();
            delayedLoadingDialogPresenter.onSuccess();
            return;
        } else
        {
            delayedLoadingDialogPresenter.onError(context);
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlaybackResult)obj);
    }

    public (Context context1, EventBus eventbus, PlaybackToastHelper playbacktoasthelper, DelayedLoadingDialogPresenter delayedloadingdialogpresenter)
    {
        super(eventbus, playbacktoasthelper);
        context = context1;
        delayedLoadingDialogPresenter = delayedloadingdialogpresenter;
    }
}
