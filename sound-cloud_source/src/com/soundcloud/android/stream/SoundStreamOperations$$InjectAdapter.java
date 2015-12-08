// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.api.legacy.model.ContentStats;
import com.soundcloud.android.facebookinvites.FacebookInvitesOperations;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamOperations, SoundStreamStorage, RemoveStalePromotedItemsCommand, MarkPromotedItemAsStaleCommand

public final class  extends b
    implements a, Provider
{

    private b contentStats;
    private b eventBus;
    private b facebookInvites;
    private b featureFlags;
    private b markPromotedItemAsStaleCommand;
    private b removeStalePromotedItemsCommand;
    private b scheduler;
    private b soundStreamStorage;
    private b stationsOperations;
    private b supertype;
    private b syncInitiator;

    public final void attach(l l1)
    {
        soundStreamStorage = l1.a("com.soundcloud.android.stream.SoundStreamStorage", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        contentStats = l1.a("com.soundcloud.android.api.legacy.model.ContentStats", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        removeStalePromotedItemsCommand = l1.a("com.soundcloud.android.stream.RemoveStalePromotedItemsCommand", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        markPromotedItemAsStaleCommand = l1.a("com.soundcloud.android.stream.MarkPromotedItemAsStaleCommand", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        facebookInvites = l1.a("com.soundcloud.android.facebookinvites.FacebookInvitesOperations", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        stationsOperations = l1.a("com.soundcloud.android.stations.StationsOperations", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.sync.timeline.TimelineOperations", com/soundcloud/android/stream/SoundStreamOperations, getClass().getClassLoader(), false);
    }

    public final SoundStreamOperations get()
    {
        SoundStreamOperations soundstreamoperations = new SoundStreamOperations((SoundStreamStorage)soundStreamStorage.get(), (SyncInitiator)syncInitiator.get(), (ContentStats)contentStats.get(), (RemoveStalePromotedItemsCommand)removeStalePromotedItemsCommand.get(), (MarkPromotedItemAsStaleCommand)markPromotedItemAsStaleCommand.get(), (EventBus)eventBus.get(), (R)scheduler.get(), (FacebookInvitesOperations)facebookInvites.get(), (StationsOperations)stationsOperations.get(), (FeatureFlags)featureFlags.get());
        injectMembers(soundstreamoperations);
        return soundstreamoperations;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(soundStreamStorage);
        set.add(syncInitiator);
        set.add(contentStats);
        set.add(removeStalePromotedItemsCommand);
        set.add(markPromotedItemAsStaleCommand);
        set.add(eventBus);
        set.add(scheduler);
        set.add(facebookInvites);
        set.add(stationsOperations);
        set.add(featureFlags);
        set1.add(supertype);
    }

    public final void injectMembers(SoundStreamOperations soundstreamoperations)
    {
        supertype.injectMembers(soundstreamoperations);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SoundStreamOperations)obj);
    }

    public ()
    {
        super("com.soundcloud.android.stream.SoundStreamOperations", "members/com.soundcloud.android.stream.SoundStreamOperations", false, com/soundcloud/android/stream/SoundStreamOperations);
    }
}
