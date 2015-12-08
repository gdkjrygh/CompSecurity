// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.os.Looper;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.common.inject:
//            ApplicationModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ApplicationModule module;

    public final Looper get()
    {
        ApplicationModule applicationmodule = module;
        return ApplicationModule.provideMainLooper();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (ApplicationModule applicationmodule)
    {
        super("@com.google.android.apps.common.inject.annotation.MainLooper()/android.os.Looper", false, "com.google.android.apps.common.inject.ApplicationModule", "provideMainLooper");
        module = applicationmodule;
        setLibrary(true);
    }
}
