// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import com.google.gson.Gson;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android:
//            AppModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AppModule module;

    public Gson get()
    {
        return module.provideGson();
    }

    public volatile Object get()
    {
        return get();
    }

    public I(AppModule appmodule)
    {
        super("com.google.gson.Gson", true, "me.lyft.android.AppModule", "provideGson");
        module = appmodule;
        setLibrary(true);
    }
}
