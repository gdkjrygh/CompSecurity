// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import android.appwidget.AppWidgetManager;
import com.soundcloud.android.image.ImageOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetPresenter

public final class Q extends b
    implements Provider
{

    private b appWidgetManager;
    private b imageOperations;

    public final void attach(l l1)
    {
        appWidgetManager = l1.a("android.appwidget.AppWidgetManager", com/soundcloud/android/playback/widget/PlayerWidgetPresenter, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playback/widget/PlayerWidgetPresenter, getClass().getClassLoader());
    }

    public final PlayerWidgetPresenter get()
    {
        return new PlayerWidgetPresenter((AppWidgetManager)appWidgetManager.get(), (ImageOperations)imageOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(appWidgetManager);
        set.add(imageOperations);
    }

    public Q()
    {
        super("com.soundcloud.android.playback.widget.PlayerWidgetPresenter", "members/com.soundcloud.android.playback.widget.PlayerWidgetPresenter", false, com/soundcloud/android/playback/widget/PlayerWidgetPresenter);
    }
}
