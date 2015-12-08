// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.support.v4.content.LocalBroadcastManager;
import dagger.a.t;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            ApplicationModule

public static final class setLibrary extends t
    implements Provider
{

    private final ApplicationModule module;

    public final LocalBroadcastManager get()
    {
        return module.provideLocalBroadcastManager();
    }

    public final volatile Object get()
    {
        return get();
    }

    public i(ApplicationModule applicationmodule)
    {
        super("android.support.v4.content.LocalBroadcastManager", false, "com.soundcloud.android.ApplicationModule", "provideLocalBroadcastManager");
        module = applicationmodule;
        setLibrary(true);
    }
}
