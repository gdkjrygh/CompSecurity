// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import dagger.a.t;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android:
//            ApplicationModule

public static final class setLibrary extends t
    implements Provider
{

    private final ApplicationModule module;

    public final volatile Object get()
    {
        return get();
    }

    public final R get()
    {
        return module.provideHighPriorityScheduler();
    }

    public i(ApplicationModule applicationmodule)
    {
        super("@javax.inject.Named(value=HighPriority)/rx.Scheduler", false, "com.soundcloud.android.ApplicationModule", "provideHighPriorityScheduler");
        module = applicationmodule;
        setLibrary(true);
    }
}
