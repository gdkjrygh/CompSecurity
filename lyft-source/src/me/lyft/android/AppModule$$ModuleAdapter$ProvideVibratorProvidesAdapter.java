// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;
import me.lyft.android.utils.Vibrator;

// Referenced classes of package me.lyft.android:
//            AppModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AppModule module;

    public volatile Object get()
    {
        return get();
    }

    public Vibrator get()
    {
        return module.provideVibrator();
    }

    public (AppModule appmodule)
    {
        super("me.lyft.android.utils.Vibrator", true, "me.lyft.android.AppModule", "provideVibrator");
        module = appmodule;
        setLibrary(true);
    }
}
