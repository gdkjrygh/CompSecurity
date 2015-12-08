// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.content.Context;
import com.soundcloud.android.playback.IRemoteAudioManager;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            ApplicationModule

public static final class setLibrary extends t
    implements Provider
{

    private b context;
    private final ApplicationModule module;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
    }

    public final IRemoteAudioManager get()
    {
        return module.provideRemoteAudioManager((Context)context.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
    }

    public (ApplicationModule applicationmodule)
    {
        super("com.soundcloud.android.playback.IRemoteAudioManager", true, "com.soundcloud.android.ApplicationModule", "provideRemoteAudioManager");
        module = applicationmodule;
        setLibrary(true);
    }
}
