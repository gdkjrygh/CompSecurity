// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            WhyAdsDialogPresenter

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b featureOperations;
    private b navigator;

    public final void attach(l l1)
    {
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/playback/ui/WhyAdsDialogPresenter, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/playback/ui/WhyAdsDialogPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/ui/WhyAdsDialogPresenter, getClass().getClassLoader());
    }

    public final WhyAdsDialogPresenter get()
    {
        return new WhyAdsDialogPresenter((Navigator)navigator.get(), (FeatureOperations)featureOperations.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(navigator);
        set.add(featureOperations);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.WhyAdsDialogPresenter", "members/com.soundcloud.android.playback.ui.WhyAdsDialogPresenter", false, com/soundcloud/android/playback/ui/WhyAdsDialogPresenter);
    }
}
