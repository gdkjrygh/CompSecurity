// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import android.content.ContentResolver;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package me.lyft.android:
//            AppModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final AppModule module;

    public ContentResolver get()
    {
        return module.provideContentResolver();
    }

    public volatile Object get()
    {
        return get();
    }

    public (AppModule appmodule)
    {
        super("android.content.ContentResolver", false, "me.lyft.android.AppModule", "provideContentResolver");
        module = appmodule;
        setLibrary(true);
    }
}
