// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.PlaybackInitiator;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.activities:
//            LegacyActivitiesAdapter, ActivityItemRenderer

public final class  extends b
    implements a, Provider
{

    private b imageOperations;
    private b itemRenderer;
    private b navigator;
    private b playbackInitiator;
    private b subscriberProvider;
    private b supertype;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/activities/LegacyActivitiesAdapter, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/activities/LegacyActivitiesAdapter, getClass().getClassLoader());
        itemRenderer = l1.a("com.soundcloud.android.activities.ActivityItemRenderer", com/soundcloud/android/activities/LegacyActivitiesAdapter, getClass().getClassLoader());
        subscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/activities/LegacyActivitiesAdapter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/activities/LegacyActivitiesAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.collections.ScBaseAdapter", com/soundcloud/android/activities/LegacyActivitiesAdapter, getClass().getClassLoader(), false);
    }

    public final LegacyActivitiesAdapter get()
    {
        LegacyActivitiesAdapter legacyactivitiesadapter = new LegacyActivitiesAdapter();
        injectMembers(legacyactivitiesadapter);
        return legacyactivitiesadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(imageOperations);
        set1.add(playbackInitiator);
        set1.add(itemRenderer);
        set1.add(subscriberProvider);
        set1.add(navigator);
        set1.add(supertype);
    }

    public final void injectMembers(LegacyActivitiesAdapter legacyactivitiesadapter)
    {
        legacyactivitiesadapter.imageOperations = (ImageOperations)imageOperations.get();
        legacyactivitiesadapter.playbackInitiator = (PlaybackInitiator)playbackInitiator.get();
        legacyactivitiesadapter.itemRenderer = (ActivityItemRenderer)itemRenderer.get();
        legacyactivitiesadapter.subscriberProvider = (Provider)subscriberProvider.get();
        legacyactivitiesadapter.navigator = (Navigator)navigator.get();
        supertype.injectMembers(legacyactivitiesadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LegacyActivitiesAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.activities.LegacyActivitiesAdapter", "members/com.soundcloud.android.activities.LegacyActivitiesAdapter", false, com/soundcloud/android/activities/LegacyActivitiesAdapter);
    }
}
