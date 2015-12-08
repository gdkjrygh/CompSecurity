// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            BufferUnderrunListener, UninterruptedPlaytimeStorage

public final class  extends b
    implements Provider
{

    private b dateProvider;
    private b detector;
    private b eventBus;
    private b uninterruptedPlaytimeStorage;

    public final void attach(l l1)
    {
        detector = l1.a("com.soundcloud.android.playback.BufferUnderrunListener$Detector", com/soundcloud/android/playback/BufferUnderrunListener, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/BufferUnderrunListener, getClass().getClassLoader());
        uninterruptedPlaytimeStorage = l1.a("com.soundcloud.android.playback.UninterruptedPlaytimeStorage", com/soundcloud/android/playback/BufferUnderrunListener, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/playback/BufferUnderrunListener, getClass().getClassLoader());
    }

    public final BufferUnderrunListener get()
    {
        return new BufferUnderrunListener((dateProvider)detector.get(), (EventBus)eventBus.get(), (UninterruptedPlaytimeStorage)uninterruptedPlaytimeStorage.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(detector);
        set.add(eventBus);
        set.add(uninterruptedPlaytimeStorage);
        set.add(dateProvider);
    }

    public ()
    {
        super("com.soundcloud.android.playback.BufferUnderrunListener", "members/com.soundcloud.android.playback.BufferUnderrunListener", false, com/soundcloud/android/playback/BufferUnderrunListener);
    }
}
