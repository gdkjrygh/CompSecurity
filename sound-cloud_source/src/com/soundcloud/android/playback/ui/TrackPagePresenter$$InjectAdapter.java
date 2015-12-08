// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.configuration.experiments.ShareButtonExperiment;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.android.waveform.WaveformOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            TrackPagePresenter, TrackPageListener

public final class t extends b
    implements Provider
{

    private b adOverlayControllerFactory;
    private b artworkControllerFactory;
    private b castConnectionHelper;
    private b errorControllerFactory;
    private b listener;
    private b numberFormatter;
    private b playerOverlayControllerFactory;
    private b resources;
    private b shareButtonExperiment;
    private b trackMenuControllerFactory;
    private b waveformControllerFactory;
    private b waveformOperations;

    public final void attach(l l1)
    {
        waveformOperations = l1.a("com.soundcloud.android.waveform.WaveformOperations", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        listener = l1.a("com.soundcloud.android.playback.ui.TrackPageListener", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        numberFormatter = l1.a("com.soundcloud.android.util.CondensedNumberFormatter", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        waveformControllerFactory = l1.a("com.soundcloud.android.playback.ui.view.WaveformViewController$Factory", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        artworkControllerFactory = l1.a("com.soundcloud.android.playback.ui.PlayerArtworkController$Factory", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        playerOverlayControllerFactory = l1.a("com.soundcloud.android.playback.ui.PlayerOverlayController$Factory", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        trackMenuControllerFactory = l1.a("com.soundcloud.android.playback.ui.TrackPageMenuController$Factory", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        adOverlayControllerFactory = l1.a("com.soundcloud.android.ads.AdOverlayController$Factory", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        errorControllerFactory = l1.a("com.soundcloud.android.playback.ui.ErrorViewController$Factory", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        castConnectionHelper = l1.a("com.soundcloud.android.cast.CastConnectionHelper", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
        shareButtonExperiment = l1.a("com.soundcloud.android.configuration.experiments.ShareButtonExperiment", com/soundcloud/android/playback/ui/TrackPagePresenter, getClass().getClassLoader());
    }

    public final TrackPagePresenter get()
    {
        return new TrackPagePresenter((WaveformOperations)waveformOperations.get(), (TrackPageListener)listener.get(), (CondensedNumberFormatter)numberFormatter.get(), (com.soundcloud.android.playback.ui.view.rFormatter)waveformControllerFactory.get(), (waveformControllerFactory)artworkControllerFactory.get(), (artworkControllerFactory)playerOverlayControllerFactory.get(), (playerOverlayControllerFactory)trackMenuControllerFactory.get(), (com.soundcloud.android.ads.)adOverlayControllerFactory.get(), (adOverlayControllerFactory)errorControllerFactory.get(), (CastConnectionHelper)castConnectionHelper.get(), (Resources)resources.get(), (ShareButtonExperiment)shareButtonExperiment.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(waveformOperations);
        set.add(listener);
        set.add(numberFormatter);
        set.add(waveformControllerFactory);
        set.add(artworkControllerFactory);
        set.add(playerOverlayControllerFactory);
        set.add(trackMenuControllerFactory);
        set.add(adOverlayControllerFactory);
        set.add(errorControllerFactory);
        set.add(castConnectionHelper);
        set.add(resources);
        set.add(shareButtonExperiment);
    }

    public t()
    {
        super("com.soundcloud.android.playback.ui.TrackPagePresenter", "members/com.soundcloud.android.playback.ui.TrackPagePresenter", false, com/soundcloud/android/playback/ui/TrackPagePresenter);
    }
}
