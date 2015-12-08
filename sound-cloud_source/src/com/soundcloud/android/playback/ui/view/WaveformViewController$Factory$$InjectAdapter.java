// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b animationControllerFactory;
    private b scrubControllerFactory;

    public final void attach(l l1)
    {
        scrubControllerFactory = l1.a("com.soundcloud.android.playback.ui.progress.ScrubController$Factory", com/soundcloud/android/playback/ui/view/WaveformViewController$Factory, getClass().getClassLoader());
        animationControllerFactory = l1.a("com.soundcloud.android.playback.ui.progress.ProgressController$Factory", com/soundcloud/android/playback/ui/view/WaveformViewController$Factory, getClass().getClassLoader());
    }

    public final animationControllerFactory get()
    {
        return new animationControllerFactory((com.soundcloud.android.playback.ui.progress.ationControllerFactory)scrubControllerFactory.get(), (com.soundcloud.android.playback.ui.progress.bControllerFactory)animationControllerFactory.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(scrubControllerFactory);
        set.add(animationControllerFactory);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.view.WaveformViewController$Factory", "members/com.soundcloud.android.playback.ui.view.WaveformViewController$Factory", false, com/soundcloud/android/playback/ui/view/WaveformViewController$Factory);
    }
}
