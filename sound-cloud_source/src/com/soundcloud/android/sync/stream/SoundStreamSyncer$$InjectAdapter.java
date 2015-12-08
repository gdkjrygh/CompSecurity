// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.stream;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.sync.timeline.TimelineSyncStorage;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.stream:
//            SoundStreamSyncer, StoreSoundStreamCommand, ReplaceSoundStreamCommand

public final class I extends b
    implements a, Provider
{

    private b apiClient;
    private b replaceSoundStreamCommand;
    private b storeSoundStreamCommand;
    private b supertype;
    private b timelineSyncStorage;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/stream/SoundStreamSyncer, getClass().getClassLoader());
        storeSoundStreamCommand = l1.a("com.soundcloud.android.sync.stream.StoreSoundStreamCommand", com/soundcloud/android/sync/stream/SoundStreamSyncer, getClass().getClassLoader());
        replaceSoundStreamCommand = l1.a("com.soundcloud.android.sync.stream.ReplaceSoundStreamCommand", com/soundcloud/android/sync/stream/SoundStreamSyncer, getClass().getClassLoader());
        timelineSyncStorage = l1.a("@javax.inject.Named(value=SoundStreamSyncStorage)/com.soundcloud.android.sync.timeline.TimelineSyncStorage", com/soundcloud/android/sync/stream/SoundStreamSyncer, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.sync.timeline.TimelineSyncer", com/soundcloud/android/sync/stream/SoundStreamSyncer, getClass().getClassLoader(), false);
    }

    public final SoundStreamSyncer get()
    {
        SoundStreamSyncer soundstreamsyncer = new SoundStreamSyncer((ApiClient)apiClient.get(), (StoreSoundStreamCommand)storeSoundStreamCommand.get(), (ReplaceSoundStreamCommand)replaceSoundStreamCommand.get(), (TimelineSyncStorage)timelineSyncStorage.get());
        injectMembers(soundstreamsyncer);
        return soundstreamsyncer;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
        set.add(storeSoundStreamCommand);
        set.add(replaceSoundStreamCommand);
        set.add(timelineSyncStorage);
        set1.add(supertype);
    }

    public final void injectMembers(SoundStreamSyncer soundstreamsyncer)
    {
        supertype.injectMembers(soundstreamsyncer);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SoundStreamSyncer)obj);
    }

    public I()
    {
        super("com.soundcloud.android.sync.stream.SoundStreamSyncer", "members/com.soundcloud.android.sync.stream.SoundStreamSyncer", false, com/soundcloud/android/sync/stream/SoundStreamSyncer);
    }
}
