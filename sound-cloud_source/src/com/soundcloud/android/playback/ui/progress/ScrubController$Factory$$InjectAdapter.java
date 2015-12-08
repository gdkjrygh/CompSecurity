// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import com.soundcloud.android.playback.PlaySessionController;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b playSessionController;
    private b seekHandlerFactory;

    public final void attach(l l1)
    {
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/playback/ui/progress/ScrubController$Factory, getClass().getClassLoader());
        seekHandlerFactory = l1.a("com.soundcloud.android.playback.ui.progress.SeekHandler$Factory", com/soundcloud/android/playback/ui/progress/ScrubController$Factory, getClass().getClassLoader());
    }

    public final seekHandlerFactory get()
    {
        return new seekHandlerFactory((PlaySessionController)playSessionController.get(), (playSessionController)seekHandlerFactory.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playSessionController);
        set.add(seekHandlerFactory);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.progress.ScrubController$Factory", "members/com.soundcloud.android.playback.ui.progress.ScrubController$Factory", false, com/soundcloud/android/playback/ui/progress/ScrubController$Factory);
    }
}
