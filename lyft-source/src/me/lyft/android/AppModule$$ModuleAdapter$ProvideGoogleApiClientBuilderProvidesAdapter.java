// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android:
//            AppModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AppModule module;

    public com.google.android.gms.common.api. get()
    {
        return module.provideGoogleApiClientBuilder();
    }

    public volatile Object get()
    {
        return get();
    }

    public (AppModule appmodule)
    {
        super("com.google.android.gms.common.api.GoogleApiClient$Builder", false, "me.lyft.android.AppModule", "provideGoogleApiClientBuilder");
        module = appmodule;
        setLibrary(true);
    }
}
