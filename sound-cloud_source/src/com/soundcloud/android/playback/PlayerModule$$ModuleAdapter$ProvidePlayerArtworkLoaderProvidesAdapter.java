// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.res.Resources;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.ui.PlayerArtworkLoader;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayerModule

public static final class setLibrary extends t
    implements Provider
{

    private b graphicsScheduler;
    private b imageOperations;
    private final PlayerModule module;
    private b resources;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playback/PlayerModule, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playback/PlayerModule, getClass().getClassLoader());
        graphicsScheduler = l1.a("@javax.inject.Named(value=LowPriority)/rx.Scheduler", com/soundcloud/android/playback/PlayerModule, getClass().getClassLoader());
    }

    public final PlayerArtworkLoader get()
    {
        return module.providePlayerArtworkLoader((ImageOperations)imageOperations.get(), (Resources)resources.get(), (R)graphicsScheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(resources);
        set.add(graphicsScheduler);
    }

    public (PlayerModule playermodule)
    {
        super("com.soundcloud.android.playback.ui.PlayerArtworkLoader", false, "com.soundcloud.android.playback.PlayerModule", "providePlayerArtworkLoader");
        module = playermodule;
        setLibrary(false);
    }
}
