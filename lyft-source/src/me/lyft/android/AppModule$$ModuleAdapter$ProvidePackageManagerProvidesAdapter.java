// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import android.content.pm.PackageManager;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android:
//            AppModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AppModule module;

    public PackageManager get()
    {
        return module.providePackageManager();
    }

    public volatile Object get()
    {
        return get();
    }

    public (AppModule appmodule)
    {
        super("android.content.pm.PackageManager", true, "me.lyft.android.AppModule", "providePackageManager");
        module = appmodule;
        setLibrary(true);
    }
}
