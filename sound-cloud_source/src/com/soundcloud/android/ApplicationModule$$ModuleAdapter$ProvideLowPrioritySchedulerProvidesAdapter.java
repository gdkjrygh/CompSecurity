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
        return module.provideLowPriorityScheduler();
    }

    public (ApplicationModule applicationmodule)
    {
        super("@javax.inject.Named(value=LowPriority)/rx.Scheduler", false, "com.soundcloud.android.ApplicationModule", "provideLowPriorityScheduler");
        module = applicationmodule;
        setLibrary(true);
    }
}
