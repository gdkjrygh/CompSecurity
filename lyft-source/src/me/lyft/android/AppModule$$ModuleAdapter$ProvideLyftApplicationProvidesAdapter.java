// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android:
//            AppModule, LyftApplication

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AppModule module;

    public volatile Object get()
    {
        return get();
    }

    public LyftApplication get()
    {
        return module.provideLyftApplication();
    }

    public (AppModule appmodule)
    {
        super("me.lyft.android.LyftApplication", false, "me.lyft.android.AppModule", "provideLyftApplication");
        module = appmodule;
        setLibrary(true);
    }
}
