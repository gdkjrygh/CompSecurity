// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.support.v4.util.LruCache;
import dagger.a.t;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            ApplicationModule

public static final class setLibrary extends t
    implements Provider
{

    private final ApplicationModule module;

    public final LruCache get()
    {
        return module.provideWaveformCache();
    }

    public final volatile Object get()
    {
        return get();
    }

    public a(ApplicationModule applicationmodule)
    {
        super("android.support.v4.util.LruCache<com.soundcloud.android.model.Urn, com.soundcloud.android.waveform.WaveformData>", true, "com.soundcloud.android.ApplicationModule", "provideWaveformCache");
        module = applicationmodule;
        setLibrary(true);
    }
}
