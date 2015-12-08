// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android:
//            AppModule, ILyftPreferences

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftPreferences;
    private final AppModule module;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/AppModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public Navigator get()
    {
        return module.providesNavigator((ILyftPreferences)lyftPreferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftPreferences);
    }

    public (AppModule appmodule)
    {
        super("me.lyft.android.utils.Navigator", true, "me.lyft.android.AppModule", "providesNavigator");
        module = appmodule;
        setLibrary(true);
    }
}
