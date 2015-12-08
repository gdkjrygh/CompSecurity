// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.os.Looper;
import dagger.a.t;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            ApplicationModule

public static final class setLibrary extends t
    implements Provider
{

    private final ApplicationModule module;

    public final Looper get()
    {
        return module.providesMainLooper();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (ApplicationModule applicationmodule)
    {
        super("@javax.inject.Named(value=MainLooper)/android.os.Looper", false, "com.soundcloud.android.ApplicationModule", "providesMainLooper");
        module = applicationmodule;
        setLibrary(true);
    }
}
