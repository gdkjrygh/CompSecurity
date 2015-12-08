// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.cast.CastOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            ProgressReporter

public final class  extends b
    implements Provider
{

    private b castOperations;

    public final void attach(l l1)
    {
        castOperations = l1.a("com.soundcloud.android.cast.CastOperations", com/soundcloud/android/playback/ProgressReporter, getClass().getClassLoader());
    }

    public final ProgressReporter get()
    {
        return new ProgressReporter((CastOperations)castOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(castOperations);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ProgressReporter", "members/com.soundcloud.android.playback.ProgressReporter", false, com/soundcloud/android/playback/ProgressReporter);
    }
}
