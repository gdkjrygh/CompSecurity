// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b overlayAnimatorProvider;

    public final void attach(l l1)
    {
        overlayAnimatorProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ui.OverlayAnimator>", com/soundcloud/android/playback/ui/PlayerOverlayController$Factory, getClass().getClassLoader());
    }

    public final overlayAnimatorProvider get()
    {
        return new overlayAnimatorProvider((Provider)overlayAnimatorProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(overlayAnimatorProvider);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.PlayerOverlayController$Factory", "members/com.soundcloud.android.playback.ui.PlayerOverlayController$Factory", false, com/soundcloud/android/playback/ui/PlayerOverlayController$Factory);
    }
}
