// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordingOperations, RecordingStorage

public final class  extends b
    implements Provider
{

    private b recordingStorage;
    private b scheduler;

    public final void attach(l l1)
    {
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/creators/record/RecordingOperations, getClass().getClassLoader());
        recordingStorage = l1.a("com.soundcloud.android.creators.record.RecordingStorage", com/soundcloud/android/creators/record/RecordingOperations, getClass().getClassLoader());
    }

    public final RecordingOperations get()
    {
        return new RecordingOperations((R)scheduler.get(), (RecordingStorage)recordingStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(scheduler);
        set.add(recordingStorage);
    }

    public ()
    {
        super("com.soundcloud.android.creators.record.RecordingOperations", "members/com.soundcloud.android.creators.record.RecordingOperations", false, com/soundcloud/android/creators/record/RecordingOperations);
    }
}
