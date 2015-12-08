// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.content.res.Resources;
import com.soundcloud.android.image.ImageOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            AdPagePresenter, AdPageListener

public final class  extends b
    implements Provider
{

    private b context;
    private b imageOperations;
    private b listener;
    private b playerOverlayControllerFactory;
    private b resources;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playback/ui/AdPagePresenter, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playback/ui/AdPagePresenter, getClass().getClassLoader());
        playerOverlayControllerFactory = l1.a("com.soundcloud.android.playback.ui.PlayerOverlayController$Factory", com/soundcloud/android/playback/ui/AdPagePresenter, getClass().getClassLoader());
        listener = l1.a("com.soundcloud.android.playback.ui.AdPageListener", com/soundcloud/android/playback/ui/AdPagePresenter, getClass().getClassLoader());
        context = l1.a("android.content.Context", com/soundcloud/android/playback/ui/AdPagePresenter, getClass().getClassLoader());
    }

    public final AdPagePresenter get()
    {
        return new AdPagePresenter((ImageOperations)imageOperations.get(), (Resources)resources.get(), ()playerOverlayControllerFactory.get(), (AdPageListener)listener.get(), (Context)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(resources);
        set.add(playerOverlayControllerFactory);
        set.add(listener);
        set.add(context);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.AdPagePresenter", "members/com.soundcloud.android.playback.ui.AdPagePresenter", false, com/soundcloud/android/playback/ui/AdPagePresenter);
    }
}
