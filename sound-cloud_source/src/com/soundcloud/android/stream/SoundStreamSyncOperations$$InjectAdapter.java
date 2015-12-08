// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.Context;
import com.soundcloud.android.api.legacy.model.ContentStats;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamSyncOperations, SoundStreamStorage, RichStreamNotificationBuilder

public final class  extends b
    implements Provider
{

    private b appContext;
    private b contentStats;
    private b soundStreamStorage;
    private b streamNotificationBuilder;

    public final void attach(l l1)
    {
        soundStreamStorage = l1.a("com.soundcloud.android.stream.SoundStreamStorage", com/soundcloud/android/stream/SoundStreamSyncOperations, getClass().getClassLoader());
        appContext = l1.a("android.content.Context", com/soundcloud/android/stream/SoundStreamSyncOperations, getClass().getClassLoader());
        streamNotificationBuilder = l1.a("com.soundcloud.android.stream.RichStreamNotificationBuilder", com/soundcloud/android/stream/SoundStreamSyncOperations, getClass().getClassLoader());
        contentStats = l1.a("com.soundcloud.android.api.legacy.model.ContentStats", com/soundcloud/android/stream/SoundStreamSyncOperations, getClass().getClassLoader());
    }

    public final SoundStreamSyncOperations get()
    {
        return new SoundStreamSyncOperations((SoundStreamStorage)soundStreamStorage.get(), (Context)appContext.get(), (RichStreamNotificationBuilder)streamNotificationBuilder.get(), (ContentStats)contentStats.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(soundStreamStorage);
        set.add(appContext);
        set.add(streamNotificationBuilder);
        set.add(contentStats);
    }

    public ()
    {
        super("com.soundcloud.android.stream.SoundStreamSyncOperations", "members/com.soundcloud.android.stream.SoundStreamSyncOperations", false, com/soundcloud/android/stream/SoundStreamSyncOperations);
    }
}
