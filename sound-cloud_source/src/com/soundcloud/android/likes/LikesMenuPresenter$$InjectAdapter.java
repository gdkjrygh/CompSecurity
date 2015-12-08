// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.likes:
//            LikesMenuPresenter

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b featureOperations;
    private b navigator;
    private b offlineContentOperations;
    private b screenProvider;
    private b syncLikesDialogProvider;

    public final void attach(l l1)
    {
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/likes/LikesMenuPresenter, getClass().getClassLoader());
        offlineContentOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/likes/LikesMenuPresenter, getClass().getClassLoader());
        syncLikesDialogProvider = l1.a("javax.inject.Provider<com.soundcloud.android.offline.OfflineLikesDialog>", com/soundcloud/android/likes/LikesMenuPresenter, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/likes/LikesMenuPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/likes/LikesMenuPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/likes/LikesMenuPresenter, getClass().getClassLoader());
    }

    public final LikesMenuPresenter get()
    {
        return new LikesMenuPresenter((FeatureOperations)featureOperations.get(), (OfflineContentOperations)offlineContentOperations.get(), (Provider)syncLikesDialogProvider.get(), (ScreenProvider)screenProvider.get(), (Navigator)navigator.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureOperations);
        set.add(offlineContentOperations);
        set.add(syncLikesDialogProvider);
        set.add(screenProvider);
        set.add(navigator);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.likes.LikesMenuPresenter", "members/com.soundcloud.android.likes.LikesMenuPresenter", false, com/soundcloud/android/likes/LikesMenuPresenter);
    }
}
